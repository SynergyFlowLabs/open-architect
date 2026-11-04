package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorDoAfterTerminate<T> implements Observable.Operator<T, T> {
    final Action0 action;

    public OperatorDoAfterTerminate(Action0 action0) {
        if (action0 == null) {
            throw new NullPointerException("Action can not be null");
        }
        this.action = action0;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorDoAfterTerminate.1
            void callAction() {
                try {
                    OperatorDoAfterTerminate.this.action.call();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaHooks.onError(th2);
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                try {
                    subscriber.onCompleted();
                    callAction();
                } catch (Throwable th2) {
                    callAction();
                    throw th2;
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                try {
                    subscriber.onError(th2);
                    callAction();
                } catch (Throwable th3) {
                    callAction();
                    throw th3;
                }
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                subscriber.onNext(t10);
            }
        };
    }
}
