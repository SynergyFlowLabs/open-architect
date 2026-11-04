package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorTake<T> implements Observable.Operator<T, T> {
    final int limit;

    /* JADX INFO: renamed from: rx.internal.operators.OperatorTake$1, reason: invalid class name */
    class AnonymousClass1 extends Subscriber<T> {
        boolean completed;
        int count;
        final /* synthetic */ Subscriber val$child;

        AnonymousClass1(Subscriber subscriber) {
            this.val$child = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.completed) {
                return;
            }
            this.completed = true;
            this.val$child.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (this.completed) {
                return;
            }
            this.completed = true;
            try {
                this.val$child.onError(th2);
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            if (!isUnsubscribed()) {
                int i10 = this.count;
                int i11 = i10 + 1;
                this.count = i11;
                int i12 = OperatorTake.this.limit;
                if (i10 < i12) {
                    int i13 = 1 << 1;
                    boolean z10 = i11 == i12;
                    this.val$child.onNext(t10);
                    if (z10 && !this.completed) {
                        this.completed = true;
                        try {
                            this.val$child.onCompleted();
                        } finally {
                            unsubscribe();
                        }
                    }
                }
            }
        }

        @Override // rx.Subscriber
        public void setProducer(final Producer producer) {
            this.val$child.setProducer(new Producer() { // from class: rx.internal.operators.OperatorTake.1.1
                final AtomicLong requested = new AtomicLong(0);

                @Override // rx.Producer
                public void request(long j10) {
                    long j11;
                    long jMin;
                    if (j10 > 0 && !AnonymousClass1.this.completed) {
                        do {
                            j11 = this.requested.get();
                            jMin = Math.min(j10, ((long) OperatorTake.this.limit) - j11);
                            if (jMin == 0) {
                            }
                        } while (!this.requested.compareAndSet(j11, j11 + jMin));
                        producer.request(jMin);
                    }
                }
            });
        }
    }

    public OperatorTake(int i10) {
        if (i10 >= 0) {
            this.limit = i10;
            return;
        }
        throw new IllegalArgumentException("limit >= 0 required but it was " + i10);
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(subscriber);
        if (this.limit == 0) {
            subscriber.onCompleted();
            anonymousClass1.unsubscribe();
        }
        subscriber.add(anonymousClass1);
        return anonymousClass1;
    }
}
