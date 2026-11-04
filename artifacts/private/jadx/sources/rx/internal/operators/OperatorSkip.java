package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorSkip<T> implements Observable.Operator<T, T> {
    final int toSkip;

    public OperatorSkip(int i10) {
        if (i10 >= 0) {
            this.toSkip = i10;
            return;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + i10);
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkip.1
            int skipped;

            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                subscriber.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                int i10 = this.skipped;
                if (i10 >= OperatorSkip.this.toSkip) {
                    subscriber.onNext(t10);
                } else {
                    this.skipped = i10 + 1;
                }
            }

            @Override // rx.Subscriber
            public void setProducer(Producer producer) {
                subscriber.setProducer(producer);
                producer.request(OperatorSkip.this.toSkip);
            }
        };
    }
}
