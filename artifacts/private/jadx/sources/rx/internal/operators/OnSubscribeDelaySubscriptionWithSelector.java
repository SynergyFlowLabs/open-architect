package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.observers.Subscribers;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeDelaySubscriptionWithSelector<T, U> implements Observable.OnSubscribe<T> {
    final Observable<? extends T> source;
    final Func0<? extends Observable<U>> subscriptionDelay;

    public OnSubscribeDelaySubscriptionWithSelector(Observable<? extends T> observable, Func0<? extends Observable<U>> func0) {
        this.source = observable;
        this.subscriptionDelay = func0;
    }

    @Override // rx.functions.Action1
    public void call(final Subscriber<? super T> subscriber) {
        try {
            this.subscriptionDelay.call().take(1).unsafeSubscribe(new Subscriber<U>() { // from class: rx.internal.operators.OnSubscribeDelaySubscriptionWithSelector.1
                @Override // rx.Observer
                public void onCompleted() {
                    OnSubscribeDelaySubscriptionWithSelector.this.source.unsafeSubscribe(Subscribers.wrap(subscriber));
                }

                @Override // rx.Observer
                public void onError(Throwable th2) {
                    subscriber.onError(th2);
                }

                @Override // rx.Observer
                public void onNext(U u10) {
                }
            });
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
        }
    }
}
