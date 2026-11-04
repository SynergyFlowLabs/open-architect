package rx.internal.operators;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorOnBackpressureLatest<T> implements Observable.Operator<T, T> {

    static final class Holder {
        static final OperatorOnBackpressureLatest<Object> INSTANCE = new OperatorOnBackpressureLatest<>();

        Holder() {
        }
    }

    static final class LatestEmitter<T> extends AtomicLong implements Producer, Subscription, Observer<T> {
        static final Object EMPTY = new Object();
        static final long NOT_REQUESTED = -4611686018427387904L;
        private static final long serialVersionUID = -1364393685005146274L;
        final Subscriber<? super T> child;
        volatile boolean done;
        boolean emitting;
        boolean missed;
        LatestSubscriber<? super T> parent;
        Throwable terminal;
        final AtomicReference<Object> value = new AtomicReference<>(EMPTY);

        public LatestEmitter(Subscriber<? super T> subscriber) {
            this.child = subscriber;
            lazySet(-4611686018427387904L);
        }

        void emit() throws Throwable {
            boolean z10;
            Object obj;
            synchronized (this) {
                try {
                    boolean z11 = true;
                    if (this.emitting) {
                        this.missed = true;
                        return;
                    }
                    this.emitting = true;
                    this.missed = false;
                    while (true) {
                        try {
                            long j10 = get();
                            if (j10 == Long.MIN_VALUE) {
                                break;
                            }
                            Object obj2 = this.value.get();
                            if (j10 > 0 && obj2 != (obj = EMPTY)) {
                                this.child.onNext(obj2);
                                z1.a(this.value, obj2, obj);
                                produced(1L);
                                obj2 = obj;
                            }
                            if (obj2 == EMPTY && this.done) {
                                Throwable th2 = this.terminal;
                                if (th2 != null) {
                                    this.child.onError(th2);
                                } else {
                                    this.child.onCompleted();
                                }
                            }
                            try {
                                synchronized (this) {
                                    try {
                                        if (this.missed) {
                                            this.missed = false;
                                        } else {
                                            this.emitting = false;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z11 = false;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                z10 = z11;
                                th = th5;
                                if (!z10) {
                                    synchronized (this) {
                                        this.emitting = false;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            z10 = false;
                        }
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            this.done = true;
            emit();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) throws Throwable {
            this.terminal = th2;
            this.done = true;
            emit();
        }

        @Override // rx.Observer
        public void onNext(T t10) throws Throwable {
            this.value.lazySet(t10);
            emit();
        }

        long produced(long j10) {
            long j11;
            long j12;
            do {
                j11 = get();
                if (j11 < 0) {
                    return j11;
                }
                j12 = j11 - j10;
            } while (!compareAndSet(j11, j12));
            return j12;
        }

        @Override // rx.Producer
        public void request(long j10) throws Throwable {
            long j11;
            long j12;
            if (j10 >= 0) {
                do {
                    j11 = get();
                    if (j11 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j11 == -4611686018427387904L) {
                        j12 = j10;
                    } else {
                        j12 = j11 + j10;
                        if (j12 < 0) {
                            j12 = Long.MAX_VALUE;
                        }
                    }
                } while (!compareAndSet(j11, j12));
                if (j11 == -4611686018427387904L) {
                    this.parent.requestMore(Long.MAX_VALUE);
                }
                emit();
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (get() >= 0) {
                getAndSet(Long.MIN_VALUE);
            }
        }
    }

    static final class LatestSubscriber<T> extends Subscriber<T> {
        private final LatestEmitter<T> producer;

        LatestSubscriber(LatestEmitter<T> latestEmitter) {
            this.producer = latestEmitter;
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            this.producer.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) throws Throwable {
            this.producer.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) throws Throwable {
            this.producer.onNext(t10);
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(0L);
        }

        void requestMore(long j10) {
            request(j10);
        }
    }

    public static <T> OperatorOnBackpressureLatest<T> instance() {
        return (OperatorOnBackpressureLatest<T>) Holder.INSTANCE;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        LatestEmitter latestEmitter = new LatestEmitter(subscriber);
        LatestSubscriber<? super T> latestSubscriber = new LatestSubscriber<>(latestEmitter);
        latestEmitter.parent = latestSubscriber;
        subscriber.add(latestSubscriber);
        subscriber.add(latestEmitter);
        subscriber.setProducer(latestEmitter);
        return latestSubscriber;
    }
}
