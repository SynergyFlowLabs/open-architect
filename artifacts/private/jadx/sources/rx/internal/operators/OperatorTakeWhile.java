package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorTakeWhile<T> implements Observable.Operator<T, T> {
    final Func2<? super T, ? super Integer, Boolean> predicate;

    public OperatorTakeWhile(final Func1<? super T, Boolean> func1) {
        this(new Func2<T, Integer, Boolean>() { // from class: rx.internal.operators.OperatorTakeWhile.1
            @Override // rx.functions.Func2
            public Boolean call(T t10, Integer num) {
                return (Boolean) func1.call(t10);
            }
        });
    }

    public OperatorTakeWhile(Func2<? super T, ? super Integer, Boolean> func2) {
        this.predicate = func2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        Subscriber<T> subscriber2 = new Subscriber<T>(subscriber, false) { // from class: rx.internal.operators.OperatorTakeWhile.2
            private int counter;
            private boolean done;

            @Override // rx.Observer
            public void onCompleted() {
                if (this.done) {
                    return;
                }
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                if (this.done) {
                    return;
                }
                subscriber.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                try {
                    Func2<? super T, ? super Integer, Boolean> func2 = OperatorTakeWhile.this.predicate;
                    int i10 = this.counter;
                    this.counter = i10 + 1;
                    if (func2.call(t10, Integer.valueOf(i10)).booleanValue()) {
                        subscriber.onNext(t10);
                        return;
                    }
                    this.done = true;
                    subscriber.onCompleted();
                    unsubscribe();
                } catch (Throwable th2) {
                    this.done = true;
                    Exceptions.throwOrReport(th2, subscriber, t10);
                    unsubscribe();
                }
            }
        };
        subscriber.add(subscriber2);
        return subscriber2;
    }
}
