package rx.internal.operators;

import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes14.dex */
public final class SingleOperatorOnErrorResumeNext<T> implements Single.OnSubscribe<T> {
    private final Single<? extends T> originalSingle;
    final Func1<Throwable, ? extends Single<? extends T>> resumeFunctionInCaseOfError;

    private SingleOperatorOnErrorResumeNext(Single<? extends T> single, Func1<Throwable, ? extends Single<? extends T>> func1) {
        if (single == null) {
            throw new NullPointerException("originalSingle must not be null");
        }
        if (func1 == null) {
            throw new NullPointerException("resumeFunctionInCaseOfError must not be null");
        }
        this.originalSingle = single;
        this.resumeFunctionInCaseOfError = func1;
    }

    public static <T> SingleOperatorOnErrorResumeNext<T> withFunction(Single<? extends T> single, Func1<Throwable, ? extends Single<? extends T>> func1) {
        return new SingleOperatorOnErrorResumeNext<>(single, func1);
    }

    public static <T> SingleOperatorOnErrorResumeNext<T> withOther(Single<? extends T> single, final Single<? extends T> single2) {
        if (single2 != null) {
            return new SingleOperatorOnErrorResumeNext<>(single, new Func1<Throwable, Single<? extends T>>() { // from class: rx.internal.operators.SingleOperatorOnErrorResumeNext.1
                @Override // rx.functions.Func1
                public Single<? extends T> call(Throwable th2) {
                    return single2;
                }
            });
        }
        throw new NullPointerException("resumeSingleInCaseOfError must not be null");
    }

    @Override // rx.functions.Action1
    public void call(final SingleSubscriber<? super T> singleSubscriber) {
        SingleSubscriber<T> singleSubscriber2 = new SingleSubscriber<T>() { // from class: rx.internal.operators.SingleOperatorOnErrorResumeNext.2
            @Override // rx.SingleSubscriber
            public void onError(Throwable th2) {
                try {
                    SingleOperatorOnErrorResumeNext.this.resumeFunctionInCaseOfError.call(th2).subscribe(singleSubscriber);
                } catch (Throwable th3) {
                    Exceptions.throwOrReport(th3, (SingleSubscriber<?>) singleSubscriber);
                }
            }

            @Override // rx.SingleSubscriber
            public void onSuccess(T t10) {
                singleSubscriber.onSuccess(t10);
            }
        };
        singleSubscriber.add(singleSubscriber2);
        this.originalSingle.subscribe((SingleSubscriber<? super Object>) singleSubscriber2);
    }
}
