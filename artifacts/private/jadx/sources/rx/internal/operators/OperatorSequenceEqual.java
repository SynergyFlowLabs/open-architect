package rx.internal.operators;

import rx.Observable;
import rx.functions.Func2;
import rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorSequenceEqual {
    static final Object LOCAL_ON_COMPLETED = new Object();

    private OperatorSequenceEqual() {
        throw new IllegalStateException("No instances!");
    }

    static <T> Observable<Object> materializeLite(Observable<T> observable) {
        return Observable.concat(observable, Observable.just(LOCAL_ON_COMPLETED));
    }

    public static <T> Observable<Boolean> sequenceEqual(Observable<? extends T> observable, Observable<? extends T> observable2, final Func2<? super T, ? super T, Boolean> func2) {
        return Observable.zip(materializeLite(observable), materializeLite(observable2), new Func2<Object, Object, Boolean>() { // from class: rx.internal.operators.OperatorSequenceEqual.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // rx.functions.Func2
            public Boolean call(Object obj, Object obj2) {
                Object obj3 = OperatorSequenceEqual.LOCAL_ON_COMPLETED;
                int i10 = 0 >> 1;
                boolean z10 = obj == obj3;
                boolean z11 = obj2 == obj3;
                if (z10 && z11) {
                    return Boolean.TRUE;
                }
                if (!z10 && !z11) {
                    return (Boolean) func2.call(obj, obj2);
                }
                return Boolean.FALSE;
            }
        }).all(UtilityFunctions.identity());
    }
}
