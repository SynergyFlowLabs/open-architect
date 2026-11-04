package rx.internal.operators;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public class OperatorTimeoutWithSelector<T, U, V> extends OperatorTimeoutBase<T> {
    public OperatorTimeoutWithSelector(final Func0<? extends Observable<U>> func0, final Func1<? super T, ? extends Observable<V>> func1, Observable<? extends T> observable) {
        super(new OperatorTimeoutBase.FirstTimeoutStub<T>() { // from class: rx.internal.operators.OperatorTimeoutWithSelector.1
            @Override // rx.functions.Func3
            public Subscription call(final OperatorTimeoutBase.TimeoutSubscriber<T> timeoutSubscriber, final Long l10, Scheduler.Worker worker) {
                Func0 func2 = func0;
                if (func2 == null) {
                    return Subscriptions.unsubscribed();
                }
                try {
                    return ((Observable) func2.call()).unsafeSubscribe(new Subscriber<U>() { // from class: rx.internal.operators.OperatorTimeoutWithSelector.1.1
                        @Override // rx.Observer
                        public void onCompleted() {
                            timeoutSubscriber.onTimeout(l10.longValue());
                        }

                        @Override // rx.Observer
                        public void onError(Throwable th2) {
                            timeoutSubscriber.onError(th2);
                        }

                        @Override // rx.Observer
                        public void onNext(U u10) {
                            timeoutSubscriber.onTimeout(l10.longValue());
                        }
                    });
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, timeoutSubscriber);
                    return Subscriptions.unsubscribed();
                }
            }
        }, new OperatorTimeoutBase.TimeoutStub<T>() { // from class: rx.internal.operators.OperatorTimeoutWithSelector.2
            @Override // rx.functions.Func4
            public Subscription call(final OperatorTimeoutBase.TimeoutSubscriber<T> timeoutSubscriber, final Long l10, T t10, Scheduler.Worker worker) {
                try {
                    return ((Observable) func1.call(t10)).unsafeSubscribe(new Subscriber<V>() { // from class: rx.internal.operators.OperatorTimeoutWithSelector.2.1
                        @Override // rx.Observer
                        public void onCompleted() {
                            timeoutSubscriber.onTimeout(l10.longValue());
                        }

                        @Override // rx.Observer
                        public void onError(Throwable th2) {
                            timeoutSubscriber.onError(th2);
                        }

                        @Override // rx.Observer
                        public void onNext(V v10) {
                            timeoutSubscriber.onTimeout(l10.longValue());
                        }
                    });
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, timeoutSubscriber);
                    return Subscriptions.unsubscribed();
                }
            }
        }, observable, Schedulers.immediate());
    }

    @Override // rx.internal.operators.OperatorTimeoutBase
    public /* bridge */ /* synthetic */ Subscriber call(Subscriber subscriber) {
        return super.call(subscriber);
    }
}
