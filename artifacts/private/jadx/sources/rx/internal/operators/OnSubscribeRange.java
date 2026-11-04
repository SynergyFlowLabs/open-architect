package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeRange implements Observable.OnSubscribe<Integer> {
    private final int endIndex;
    private final int startIndex;

    static final class RangeProducer extends AtomicLong implements Producer {
        private static final long serialVersionUID = 4114392207069098388L;
        private final Subscriber<? super Integer> childSubscriber;
        private long currentIndex;
        private final int endOfRange;

        RangeProducer(Subscriber<? super Integer> subscriber, int i10, int i11) {
            this.childSubscriber = subscriber;
            this.currentIndex = i10;
            this.endOfRange = i11;
        }

        void fastPath() {
            long j10 = ((long) this.endOfRange) + 1;
            Subscriber<? super Integer> subscriber = this.childSubscriber;
            for (long j11 = this.currentIndex; j11 != j10; j11++) {
                if (subscriber.isUnsubscribed()) {
                }
                subscriber.onNext(Integer.valueOf((int) j11));
            }
            if (!subscriber.isUnsubscribed()) {
                subscriber.onCompleted();
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
            long j11 = ((long) this.endOfRange) + 1;
            long j12 = this.currentIndex;
            Subscriber<? super Integer> subscriber = this.childSubscriber;
            loop0: do {
                long j13 = 0;
                while (true) {
                    if (j13 == j10 || j12 == j11) {
                        if (subscriber.isUnsubscribed()) {
                            break loop0;
                        }
                        if (j12 == j11) {
                            subscriber.onCompleted();
                            return;
                        } else {
                            j10 = get();
                            if (j10 == j13) {
                                break;
                            }
                        }
                    } else {
                        if (subscriber.isUnsubscribed()) {
                            break loop0;
                        }
                        subscriber.onNext(Integer.valueOf((int) j12));
                        j12++;
                        j13++;
                    }
                }
                this.currentIndex = j12;
                j10 = addAndGet(-j13);
            } while (j10 != 0);
        }
    }

    public OnSubscribeRange(int i10, int i11) {
        this.startIndex = i10;
        this.endIndex = i11;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super Integer> subscriber) {
        subscriber.setProducer(new RangeProducer(subscriber, this.startIndex, this.endIndex));
    }
}
