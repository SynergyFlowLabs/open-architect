package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorDistinctUntilChanged<T, U> implements Observable.Operator<T, T>, Func2<U, U, Boolean> {
    final Func2<? super U, ? super U, Boolean> comparator;
    final Func1<? super T, ? extends U> keySelector;

    static final class Holder {
        static final OperatorDistinctUntilChanged<?, ?> INSTANCE = new OperatorDistinctUntilChanged<>(UtilityFunctions.identity());

        Holder() {
        }
    }

    public OperatorDistinctUntilChanged(Func1<? super T, ? extends U> func1) {
        this.keySelector = func1;
        this.comparator = this;
    }

    public static <T> OperatorDistinctUntilChanged<T, T> instance() {
        return (OperatorDistinctUntilChanged<T, T>) Holder.INSTANCE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // rx.functions.Func2
    public Boolean call(U u10, U u11) {
        return Boolean.valueOf(u10 == u11 || (u10 != null && u10.equals(u11)));
    }

    public OperatorDistinctUntilChanged(Func2<? super U, ? super U, Boolean> func2) {
        this.keySelector = UtilityFunctions.identity();
        this.comparator = func2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorDistinctUntilChanged.1
            boolean hasPrevious;
            U previousKey;

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
                try {
                    U uCall = OperatorDistinctUntilChanged.this.keySelector.call(t10);
                    U u10 = this.previousKey;
                    this.previousKey = uCall;
                    if (!this.hasPrevious) {
                        this.hasPrevious = true;
                        subscriber.onNext(t10);
                        return;
                    }
                    try {
                        if (OperatorDistinctUntilChanged.this.comparator.call(u10, uCall).booleanValue()) {
                            request(1L);
                        } else {
                            subscriber.onNext(t10);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, subscriber, uCall);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwOrReport(th3, subscriber, t10);
                }
            }
        };
    }
}
