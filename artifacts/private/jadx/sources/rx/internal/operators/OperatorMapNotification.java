package rx.internal.operators;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorMapNotification<T, R> implements Observable.Operator<R, T> {
    final Func0<? extends R> onCompleted;
    final Func1<? super Throwable, ? extends R> onError;
    final Func1<? super T, ? extends R> onNext;

    static final class MapNotificationSubscriber<T, R> extends Subscriber<T> {
        static final long COMPLETED_FLAG = Long.MIN_VALUE;
        static final long REQUESTED_MASK = Long.MAX_VALUE;
        final Subscriber<? super R> actual;
        final Func0<? extends R> onCompleted;
        final Func1<? super Throwable, ? extends R> onError;
        final Func1<? super T, ? extends R> onNext;
        long produced;
        R value;
        final AtomicLong requested = new AtomicLong();
        final AtomicLong missedRequested = new AtomicLong();
        final AtomicReference<Producer> producer = new AtomicReference<>();

        public MapNotificationSubscriber(Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1, Func1<? super Throwable, ? extends R> func2, Func0<? extends R> func0) {
            this.actual = subscriber;
            this.onNext = func1;
            this.onError = func2;
            this.onCompleted = func0;
        }

        void accountProduced() {
            long j10 = this.produced;
            if (j10 == 0 || this.producer.get() == null) {
                return;
            }
            BackpressureUtils.produced(this.requested, j10);
        }

        @Override // rx.Observer
        public void onCompleted() {
            accountProduced();
            try {
                this.value = this.onCompleted.call();
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.actual);
            }
            tryEmit();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            accountProduced();
            try {
                this.value = this.onError.call(th2);
            } catch (Throwable th3) {
                Exceptions.throwOrReport(th3, this.actual, th2);
            }
            tryEmit();
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            try {
                this.produced++;
                this.actual.onNext(this.onNext.call(t10));
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.actual, t10);
            }
        }

        void requestInner(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j10);
            }
            if (j10 == 0) {
                return;
            }
            while (true) {
                long j11 = this.requested.get();
                if ((j11 & Long.MIN_VALUE) != 0) {
                    long j12 = Long.MAX_VALUE & j11;
                    if (this.requested.compareAndSet(j11, Long.MIN_VALUE | BackpressureUtils.addCap(j12, j10))) {
                        if (j12 == 0) {
                            if (!this.actual.isUnsubscribed()) {
                                this.actual.onNext(this.value);
                            }
                            if (this.actual.isUnsubscribed()) {
                                return;
                            }
                            this.actual.onCompleted();
                            return;
                        }
                        return;
                    }
                } else {
                    if (this.requested.compareAndSet(j11, BackpressureUtils.addCap(j11, j10))) {
                        AtomicReference<Producer> atomicReference = this.producer;
                        Producer producer = atomicReference.get();
                        if (producer != null) {
                            producer.request(j10);
                            return;
                        }
                        BackpressureUtils.getAndAddRequest(this.missedRequested, j10);
                        Producer producer2 = atomicReference.get();
                        if (producer2 != null) {
                            long andSet = this.missedRequested.getAndSet(0L);
                            if (andSet != 0) {
                                producer2.request(andSet);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            if (!z1.a(this.producer, null, producer)) {
                throw new IllegalStateException("Producer already set!");
            }
            long andSet = this.missedRequested.getAndSet(0L);
            if (andSet != 0) {
                producer.request(andSet);
            }
        }

        void tryEmit() {
            long j10;
            do {
                j10 = this.requested.get();
                if ((j10 & Long.MIN_VALUE) != 0) {
                    return;
                }
            } while (!this.requested.compareAndSet(j10, Long.MIN_VALUE | j10));
            if (j10 != 0 || this.producer.get() == null) {
                if (!this.actual.isUnsubscribed()) {
                    this.actual.onNext(this.value);
                }
                if (this.actual.isUnsubscribed()) {
                    return;
                }
                this.actual.onCompleted();
            }
        }
    }

    public OperatorMapNotification(Func1<? super T, ? extends R> func1, Func1<? super Throwable, ? extends R> func2, Func0<? extends R> func0) {
        this.onNext = func1;
        this.onError = func2;
        this.onCompleted = func0;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        final MapNotificationSubscriber mapNotificationSubscriber = new MapNotificationSubscriber(subscriber, this.onNext, this.onError, this.onCompleted);
        subscriber.add(mapNotificationSubscriber);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorMapNotification.1
            @Override // rx.Producer
            public void request(long j10) {
                mapNotificationSubscriber.requestInner(j10);
            }
        });
        return mapNotificationSubscriber;
    }
}
