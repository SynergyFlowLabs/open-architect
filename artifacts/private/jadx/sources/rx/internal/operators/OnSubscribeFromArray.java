package rx.internal.operators;

import a0.c;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeFromArray<T> implements Observable.OnSubscribe<T> {
    final T[] array;

    static final class FromArrayProducer<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = 3534218984725836979L;
        final T[] array;
        final Subscriber<? super T> child;
        int index;

        public FromArrayProducer(Subscriber<? super T> subscriber, T[] tArr) {
            this.child = subscriber;
            this.array = tArr;
        }

        void fastPath() {
            Subscriber<? super T> subscriber = this.child;
            for (c cVar : this.array) {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onNext(cVar);
            }
            if (subscriber.isUnsubscribed()) {
                return;
            }
            subscriber.onCompleted();
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j10);
            }
            if (j10 == Long.MAX_VALUE) {
                if (BackpressureUtils.getAndAddRequest(this, j10) == 0) {
                    fastPath();
                }
            } else {
                if (j10 == 0 || BackpressureUtils.getAndAddRequest(this, j10) != 0) {
                    return;
                }
                slowPath(j10);
            }
        }

        void slowPath(long j10) {
            Subscriber<? super T> subscriber = this.child;
            T[] tArr = this.array;
            int length = tArr.length;
            int i10 = this.index;
            do {
                long j11 = 0;
                while (true) {
                    if (j10 == 0 || i10 == length) {
                        j10 = get() + j11;
                        if (j10 == 0) {
                            break;
                        }
                    } else {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        subscriber.onNext(tArr[i10]);
                        i10++;
                        if (i10 == length) {
                            if (subscriber.isUnsubscribed()) {
                                return;
                            }
                            subscriber.onCompleted();
                            return;
                        }
                        j10--;
                        j11--;
                    }
                }
                this.index = i10;
                j10 = addAndGet(j11);
            } while (j10 != 0);
        }
    }

    public OnSubscribeFromArray(T[] tArr) {
        this.array = tArr;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        subscriber.setProducer(new FromArrayProducer(subscriber, this.array));
    }
}
