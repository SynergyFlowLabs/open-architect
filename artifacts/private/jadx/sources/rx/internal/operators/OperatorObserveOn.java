package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.internal.schedulers.ImmediateScheduler;
import rx.internal.schedulers.TrampolineScheduler;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.plugins.RxJavaHooks;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorObserveOn<T> implements Observable.Operator<T, T> {
    private final int bufferSize;
    private final boolean delayError;
    private final Scheduler scheduler;

    static final class ObserveOnSubscriber<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super T> child;
        final boolean delayError;
        long emitted;
        Throwable error;
        volatile boolean finished;
        final int limit;
        final Queue<Object> queue;
        final Scheduler.Worker recursiveScheduler;
        final AtomicLong requested = new AtomicLong();
        final AtomicLong counter = new AtomicLong();
        final NotificationLite<T> on = NotificationLite.instance();

        public ObserveOnSubscriber(Scheduler scheduler, Subscriber<? super T> subscriber, boolean z10, int i10) {
            this.child = subscriber;
            this.recursiveScheduler = scheduler.createWorker();
            this.delayError = z10;
            i10 = i10 <= 0 ? RxRingBuffer.SIZE : i10;
            this.limit = i10 - (i10 >> 2);
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.queue = new SpscArrayQueue(i10);
            } else {
                this.queue = new SpscAtomicArrayQueue(i10);
            }
            request(i10);
        }

        @Override // rx.functions.Action0
        public void call() {
            long j10 = this.emitted;
            Queue<Object> queue = this.queue;
            Subscriber<? super T> subscriber = this.child;
            NotificationLite<T> notificationLite = this.on;
            long jAddAndGet = 1;
            do {
                long j11 = this.requested.get();
                while (j11 != j10) {
                    boolean z10 = this.finished;
                    Object objPoll = queue.poll();
                    boolean z11 = objPoll == null;
                    if (checkTerminated(z10, z11, subscriber, queue)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(notificationLite.getValue(objPoll));
                    j10++;
                    if (j10 == this.limit) {
                        long jProduced = BackpressureUtils.produced(this.requested, j10);
                        request(j10);
                        j11 = jProduced;
                        j10 = 0;
                    }
                }
                if (j11 == j10 && checkTerminated(this.finished, queue.isEmpty(), subscriber, queue)) {
                    return;
                }
                this.emitted = j10;
                jAddAndGet = this.counter.addAndGet(-jAddAndGet);
            } while (jAddAndGet != 0);
        }

        boolean checkTerminated(boolean z10, boolean z11, Subscriber<? super T> subscriber, Queue<Object> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.delayError) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.error;
                try {
                    if (th2 != null) {
                        subscriber.onError(th2);
                    } else {
                        subscriber.onCompleted();
                    }
                    this = (ObserveOnSubscriber<T>) this.recursiveScheduler;
                    this.unsubscribe();
                    return false;
                } catch (Throwable th3) {
                    this.recursiveScheduler.unsubscribe();
                    throw th3;
                }
            }
            Throwable th4 = this.error;
            if (th4 != null) {
                queue.clear();
                try {
                    subscriber.onError(th4);
                    this.recursiveScheduler.unsubscribe();
                    return true;
                } catch (Throwable th5) {
                    this.recursiveScheduler.unsubscribe();
                    throw th5;
                }
            }
            if (!z11) {
                return false;
            }
            try {
                subscriber.onCompleted();
                this.recursiveScheduler.unsubscribe();
                return true;
            } catch (Throwable th6) {
                this.recursiveScheduler.unsubscribe();
                throw th6;
            }
        }

        void init() {
            Subscriber<? super T> subscriber = this.child;
            subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorObserveOn.ObserveOnSubscriber.1
                @Override // rx.Producer
                public void request(long j10) {
                    if (j10 > 0) {
                        BackpressureUtils.getAndAddRequest(ObserveOnSubscriber.this.requested, j10);
                        ObserveOnSubscriber.this.schedule();
                    }
                }
            });
            subscriber.add(this.recursiveScheduler);
            subscriber.add(this);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!isUnsubscribed() && !this.finished) {
                this.finished = true;
                schedule();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (isUnsubscribed() || this.finished) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.error = th2;
            this.finished = true;
            schedule();
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            if (isUnsubscribed() || this.finished) {
                return;
            }
            if (this.queue.offer(this.on.next(t10))) {
                schedule();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        protected void schedule() {
            if (this.counter.getAndIncrement() == 0) {
                this.recursiveScheduler.schedule(this);
            }
        }
    }

    public OperatorObserveOn(Scheduler scheduler, boolean z10) {
        this(scheduler, z10, RxRingBuffer.SIZE);
    }

    public static <T> Observable.Operator<T, T> rebatch(final int i10) {
        return new Observable.Operator<T, T>() { // from class: rx.internal.operators.OperatorObserveOn.1
            @Override // rx.functions.Func1
            public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
                ObserveOnSubscriber observeOnSubscriber = new ObserveOnSubscriber(Schedulers.immediate(), subscriber, false, i10);
                observeOnSubscriber.init();
                return observeOnSubscriber;
            }
        };
    }

    public OperatorObserveOn(Scheduler scheduler, boolean z10, int i10) {
        this.scheduler = scheduler;
        this.delayError = z10;
        if (i10 <= 0) {
            i10 = RxRingBuffer.SIZE;
        }
        this.bufferSize = i10;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler scheduler = this.scheduler;
        if ((scheduler instanceof ImmediateScheduler) || (scheduler instanceof TrampolineScheduler)) {
            return subscriber;
        }
        ObserveOnSubscriber observeOnSubscriber = new ObserveOnSubscriber(scheduler, subscriber, this.delayError, this.bufferSize);
        observeOnSubscriber.init();
        return observeOnSubscriber;
    }
}
