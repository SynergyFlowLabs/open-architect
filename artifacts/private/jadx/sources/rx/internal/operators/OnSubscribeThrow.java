package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeThrow<T> implements Observable.OnSubscribe<T> {
    private final Throwable exception;

    public OnSubscribeThrow(Throwable th2) {
        this.exception = th2;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        subscriber.onError(this.exception);
    }
}
