package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.BackpressureOverflow;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.internal.util.BackpressureDrainManager;

/* JADX INFO: loaded from: classes14.dex */
public class OperatorOnBackpressureBuffer<T> implements Observable.Operator<T, T> {
    private final Long capacity;
    private final Action0 onOverflow;
    private final BackpressureOverflow.Strategy overflowStrategy;

    static final class BufferSubscriber<T> extends Subscriber<T> implements BackpressureDrainManager.BackpressureQueueCallback {
        private final AtomicLong capacity;
        private final Subscriber<? super T> child;
        private final BackpressureDrainManager manager;
        private final Action0 onOverflow;
        private final BackpressureOverflow.Strategy overflowStrategy;
        private final ConcurrentLinkedQueue<Object> queue = new ConcurrentLinkedQueue<>();
        private final AtomicBoolean saturated = new AtomicBoolean(false);
        private final NotificationLite<T> on = NotificationLite.instance();

        public BufferSubscriber(Subscriber<? super T> subscriber, Long l10, Action0 action0, BackpressureOverflow.Strategy strategy) {
            this.child = subscriber;
            this.capacity = l10 != null ? new AtomicLong(l10.longValue()) : null;
            this.onOverflow = action0;
            this.manager = new BackpressureDrainManager(this);
            this.overflowStrategy = strategy;
        }

        private boolean assertCapacity() throws Throwable {
            long j10;
            boolean z10;
            if (this.capacity == null) {
                return true;
            }
            do {
                j10 = this.capacity.get();
                if (j10 <= 0) {
                    try {
                        z10 = this.overflowStrategy.mayAttemptDrop() && poll() != null;
                    } catch (MissingBackpressureException e10) {
                        if (this.saturated.compareAndSet(false, true)) {
                            unsubscribe();
                            this.child.onError(e10);
                        }
                    }
                    Action0 action0 = this.onOverflow;
                    if (action0 != null) {
                        try {
                            action0.call();
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.manager.terminateAndDrain(th2);
                            return false;
                        }
                    }
                    if (!z10) {
                        return false;
                    }
                }
            } while (!this.capacity.compareAndSet(j10, j10 - 1));
            return true;
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public boolean accept(Object obj) {
            return this.on.accept(this.child, obj);
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public void complete(Throwable th2) {
            if (th2 != null) {
                this.child.onError(th2);
            } else {
                this.child.onCompleted();
            }
        }

        protected Producer manager() {
            return this.manager;
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            if (this.saturated.get()) {
                return;
            }
            this.manager.terminateAndDrain();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) throws Throwable {
            if (this.saturated.get()) {
                return;
            }
            this.manager.terminateAndDrain(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) throws Throwable {
            if (assertCapacity()) {
                this.queue.offer(this.on.next(t10));
                this.manager.drain();
            }
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public Object peek() {
            return this.queue.peek();
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public Object poll() {
            Object objPoll = this.queue.poll();
            AtomicLong atomicLong = this.capacity;
            if (atomicLong != null && objPoll != null) {
                atomicLong.incrementAndGet();
            }
            return objPoll;
        }
    }

    static final class Holder {
        static final OperatorOnBackpressureBuffer<?> INSTANCE = new OperatorOnBackpressureBuffer<>();

        Holder() {
        }
    }

    OperatorOnBackpressureBuffer() {
        this.capacity = null;
        this.onOverflow = null;
        this.overflowStrategy = BackpressureOverflow.ON_OVERFLOW_DEFAULT;
    }

    public static <T> OperatorOnBackpressureBuffer<T> instance() {
        return (OperatorOnBackpressureBuffer<T>) Holder.INSTANCE;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        BufferSubscriber bufferSubscriber = new BufferSubscriber(subscriber, this.capacity, this.onOverflow, this.overflowStrategy);
        subscriber.add(bufferSubscriber);
        subscriber.setProducer(bufferSubscriber.manager());
        return bufferSubscriber;
    }

    public OperatorOnBackpressureBuffer(long j10) {
        this(j10, null, BackpressureOverflow.ON_OVERFLOW_DEFAULT);
    }

    public OperatorOnBackpressureBuffer(long j10, Action0 action0) {
        this(j10, action0, BackpressureOverflow.ON_OVERFLOW_DEFAULT);
    }

    public OperatorOnBackpressureBuffer(long j10, Action0 action0, BackpressureOverflow.Strategy strategy) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Buffer capacity must be > 0");
        }
        if (strategy == null) {
            throw new NullPointerException("The BackpressureOverflow strategy must not be null");
        }
        this.capacity = Long.valueOf(j10);
        this.onOverflow = action0;
        this.overflowStrategy = strategy;
    }
}
