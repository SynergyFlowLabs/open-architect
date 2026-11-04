package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeFromIterable<T> implements Observable.OnSubscribe<T> {
    final Iterable<? extends T> is;

    static final class IterableProducer<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -8730475647105475802L;
        private final Iterator<? extends T> it;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Subscriber<? super T> f366753o;

        IterableProducer(Subscriber<? super T> subscriber, Iterator<? extends T> it) {
            this.f366753o = subscriber;
            this.it = it;
        }

        void fastPath() {
            Subscriber<? super T> subscriber = this.f366753o;
            Iterator<? extends T> it = this.it;
            while (!subscriber.isUnsubscribed()) {
                try {
                    subscriber.onNext(it.next());
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (subscriber.isUnsubscribed()) {
                                return;
                            }
                            subscriber.onCompleted();
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, subscriber);
                        return;
                    }
                } catch (Throwable th3) {
                    Exceptions.throwOrReport(th3, subscriber);
                    return;
                }
            }
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (get() != Long.MAX_VALUE) {
                if (j10 == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                    fastPath();
                } else if (j10 > 0 && BackpressureUtils.getAndAddRequest(this, j10) == 0) {
                    slowPath(j10);
                }
            }
        }

        void slowPath(long j10) {
            Subscriber<? super T> subscriber = this.f366753o;
            Iterator<? extends T> it = this.it;
            loop0: do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        j10 = get();
                        if (j11 == j10) {
                            break;
                        }
                    } else {
                        if (subscriber.isUnsubscribed()) {
                            break loop0;
                        }
                        try {
                            subscriber.onNext(it.next());
                            if (subscriber.isUnsubscribed()) {
                                break loop0;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (subscriber.isUnsubscribed()) {
                                        break loop0;
                                    }
                                    subscriber.onCompleted();
                                    return;
                                }
                                j11++;
                            } catch (Throwable th2) {
                                Exceptions.throwOrReport(th2, subscriber);
                                return;
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwOrReport(th3, subscriber);
                            return;
                        }
                    }
                }
                j10 = BackpressureUtils.produced(this, j11);
            } while (j10 != 0);
        }
    }

    public OnSubscribeFromIterable(Iterable<? extends T> iterable) {
        if (iterable == null) {
            throw new NullPointerException("iterable must not be null");
        }
        this.is = iterable;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        try {
            Iterator<? extends T> it = this.is.iterator();
            boolean zHasNext = it.hasNext();
            if (subscriber.isUnsubscribed()) {
                return;
            }
            if (zHasNext) {
                subscriber.setProducer(new IterableProducer(subscriber, it));
            } else {
                subscriber.onCompleted();
            }
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
        }
    }
}
