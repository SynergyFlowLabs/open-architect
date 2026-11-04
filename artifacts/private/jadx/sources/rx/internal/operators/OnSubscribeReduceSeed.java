package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func2;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeReduceSeed<T, R> implements Observable.OnSubscribe<R> {
    final R initialValue;
    final Func2<R, ? super T, R> reducer;
    final Observable<T> source;

    static final class ReduceSeedSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {
        final Func2<R, ? super T, R> reducer;

        public ReduceSeedSubscriber(Subscriber<? super R> subscriber, R r10, Func2<R, ? super T, R> func2) {
            super(subscriber);
            this.value = r10;
            this.hasValue = true;
            this.reducer = func2;
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            try {
                this.value = this.reducer.call(this.value, t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                this.actual.onError(th2);
            }
        }
    }

    public OnSubscribeReduceSeed(Observable<T> observable, R r10, Func2<R, ? super T, R> func2) {
        this.source = observable;
        this.initialValue = r10;
        this.reducer = func2;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        new ReduceSeedSubscriber(subscriber, this.initialValue, this.reducer).subscribeTo(this.source);
    }
}
