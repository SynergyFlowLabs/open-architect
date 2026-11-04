package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorSkipWhile<T> implements Observable.Operator<T, T> {
    final Func2<? super T, Integer, Boolean> predicate;

    public OperatorSkipWhile(Func2<? super T, Integer, Boolean> func2) {
        this.predicate = func2;
    }

    public static <T> Func2<T, Integer, Boolean> toPredicate2(final Func1<? super T, Boolean> func1) {
        return new Func2<T, Integer, Boolean>() { // from class: rx.internal.operators.OperatorSkipWhile.2
            @Override // rx.functions.Func2
            public Boolean call(T t10, Integer num) {
                return (Boolean) func1.call(t10);
            }
        };
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkipWhile.1
            int index;
            boolean skipping = true;

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
                if (!this.skipping) {
                    subscriber.onNext(t10);
                    return;
                }
                try {
                    Func2<? super T, Integer, Boolean> func2 = OperatorSkipWhile.this.predicate;
                    int i10 = this.index;
                    this.index = i10 + 1;
                    if (func2.call(t10, Integer.valueOf(i10)).booleanValue()) {
                        request(1L);
                    } else {
                        this.skipping = false;
                        subscriber.onNext(t10);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, subscriber, t10);
                }
            }
        };
    }
}
