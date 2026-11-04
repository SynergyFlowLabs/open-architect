package rx.internal.util;

import rx.Observer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes14.dex */
public final class ObserverSubscriber<T> extends Subscriber<T> {
    final Observer<? super T> observer;

    public ObserverSubscriber(Observer<? super T> observer) {
        this.observer = observer;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.observer.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        this.observer.onError(th2);
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        this.observer.onNext(t10);
    }
}
