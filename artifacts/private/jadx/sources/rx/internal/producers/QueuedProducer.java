package rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.BackpressureUtils;
import rx.internal.util.atomic.SpscLinkedAtomicQueue;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes14.dex */
public final class QueuedProducer<T> extends AtomicLong implements Producer, Observer<T> {
    static final Object NULL_SENTINEL = new Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final Subscriber<? super T> child;
    volatile boolean done;
    Throwable error;
    final Queue<Object> queue;
    final AtomicInteger wip;

    public QueuedProducer(Subscriber<? super T> subscriber) {
        this(subscriber, UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue() : new SpscLinkedAtomicQueue());
    }

    private boolean checkTerminated(boolean z10, boolean z11) {
        if (this.child.isUnsubscribed()) {
            return true;
        }
        if (z10) {
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                this.child.onError(th2);
                return true;
            }
            if (z11) {
                this.child.onCompleted();
                return true;
            }
        }
        return false;
    }

    private void drain() {
        if (this.wip.getAndIncrement() == 0) {
            Subscriber<? super T> subscriber = this.child;
            Queue<Object> queue = this.queue;
            while (!checkTerminated(this.done, queue.isEmpty())) {
                this.wip.lazySet(1);
                long j10 = get();
                long j11 = 0;
                while (j10 != 0) {
                    boolean z10 = this.done;
                    Object objPoll = queue.poll();
                    if (checkTerminated(z10, objPoll == null)) {
                        return;
                    }
                    if (objPoll == null) {
                        break;
                    }
                    try {
                        if (objPoll == NULL_SENTINEL) {
                            subscriber.onNext(null);
                        } else {
                            subscriber.onNext(objPoll);
                        }
                        j10--;
                        j11++;
                    } catch (Throwable th2) {
                        if (objPoll == NULL_SENTINEL) {
                            objPoll = null;
                        }
                        Exceptions.throwOrReport(th2, subscriber, objPoll);
                        return;
                    }
                }
                if (j11 != 0 && get() != Long.MAX_VALUE) {
                    addAndGet(-j11);
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public boolean offer(T t10) {
        if (t10 == null) {
            if (!this.queue.offer(NULL_SENTINEL)) {
                return false;
            }
        } else if (!this.queue.offer(t10)) {
            return false;
        }
        drain();
        return true;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.done = true;
        drain();
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        this.error = th2;
        this.done = true;
        drain();
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        if (offer(t10)) {
            return;
        }
        onError(new MissingBackpressureException());
    }

    @Override // rx.Producer
    public void request(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j10 > 0) {
            BackpressureUtils.getAndAddRequest(this, j10);
            drain();
        }
    }

    public QueuedProducer(Subscriber<? super T> subscriber, Queue<Object> queue) {
        this.child = subscriber;
        this.queue = queue;
        this.wip = new AtomicInteger();
    }
}
