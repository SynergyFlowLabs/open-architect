package rx.internal.operators;

import java.util.concurrent.TimeoutException;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.internal.producers.ProducerArbiter;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes14.dex */
class OperatorTimeoutBase<T> implements Observable.Operator<T, T> {
    final FirstTimeoutStub<T> firstTimeoutStub;
    final Observable<? extends T> other;
    final Scheduler scheduler;
    final TimeoutStub<T> timeoutStub;

    interface FirstTimeoutStub<T> extends Func3<TimeoutSubscriber<T>, Long, Scheduler.Worker, Subscription> {
    }

    interface TimeoutStub<T> extends Func4<TimeoutSubscriber<T>, Long, T, Scheduler.Worker, Subscription> {
    }

    static final class TimeoutSubscriber<T> extends Subscriber<T> {
        long actual;
        final ProducerArbiter arbiter = new ProducerArbiter();
        final Scheduler.Worker inner;
        final Observable<? extends T> other;
        final SerialSubscription serial;
        final SerializedSubscriber<T> serializedSubscriber;
        boolean terminated;
        final TimeoutStub<T> timeoutStub;

        TimeoutSubscriber(SerializedSubscriber<T> serializedSubscriber, TimeoutStub<T> timeoutStub, SerialSubscription serialSubscription, Observable<? extends T> observable, Scheduler.Worker worker) {
            this.serializedSubscriber = serializedSubscriber;
            this.timeoutStub = timeoutStub;
            this.serial = serialSubscription;
            this.other = observable;
            this.inner = worker;
        }

        @Override // rx.Observer
        public void onCompleted() {
            boolean z10;
            synchronized (this) {
                try {
                    if (this.terminated) {
                        z10 = false;
                    } else {
                        z10 = true;
                        this.terminated = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                this.serial.unsubscribe();
                this.serializedSubscriber.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            boolean z10;
            synchronized (this) {
                try {
                    if (this.terminated) {
                        z10 = false;
                    } else {
                        z10 = true;
                        this.terminated = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z10) {
                this.serial.unsubscribe();
                this.serializedSubscriber.onError(th2);
            }
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            long j10;
            boolean z10;
            synchronized (this) {
                try {
                    if (this.terminated) {
                        j10 = this.actual;
                        z10 = false;
                    } else {
                        j10 = this.actual + 1;
                        this.actual = j10;
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                this.serializedSubscriber.onNext(t10);
                this.serial.set(this.timeoutStub.call(this, Long.valueOf(j10), t10, this.inner));
            }
        }

        public void onTimeout(long j10) {
            boolean z10;
            synchronized (this) {
                try {
                    if (j10 != this.actual || this.terminated) {
                        z10 = false;
                    } else {
                        z10 = true;
                        this.terminated = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                if (this.other == null) {
                    this.serializedSubscriber.onError(new TimeoutException());
                    return;
                }
                Subscriber<T> subscriber = new Subscriber<T>() { // from class: rx.internal.operators.OperatorTimeoutBase.TimeoutSubscriber.1
                    @Override // rx.Observer
                    public void onCompleted() {
                        TimeoutSubscriber.this.serializedSubscriber.onCompleted();
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th3) {
                        TimeoutSubscriber.this.serializedSubscriber.onError(th3);
                    }

                    @Override // rx.Observer
                    public void onNext(T t10) {
                        TimeoutSubscriber.this.serializedSubscriber.onNext(t10);
                    }

                    @Override // rx.Subscriber
                    public void setProducer(Producer producer) {
                        TimeoutSubscriber.this.arbiter.setProducer(producer);
                    }
                };
                this.other.unsafeSubscribe(subscriber);
                this.serial.set(subscriber);
            }
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.arbiter.setProducer(producer);
        }
    }

    OperatorTimeoutBase(FirstTimeoutStub<T> firstTimeoutStub, TimeoutStub<T> timeoutStub, Observable<? extends T> observable, Scheduler scheduler) {
        this.firstTimeoutStub = firstTimeoutStub;
        this.timeoutStub = timeoutStub;
        this.other = observable;
        this.scheduler = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        subscriber.add(workerCreateWorker);
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        serializedSubscriber.add(serialSubscription);
        TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(serializedSubscriber, this.timeoutStub, serialSubscription, this.other, workerCreateWorker);
        serializedSubscriber.add(timeoutSubscriber);
        serializedSubscriber.setProducer(timeoutSubscriber.arbiter);
        serialSubscription.set(this.firstTimeoutStub.call(timeoutSubscriber, 0L, workerCreateWorker));
        return timeoutSubscriber;
    }
}
