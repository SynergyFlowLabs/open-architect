package rx.internal.util;

import rx.Notification;
import rx.Observer;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes14.dex */
public final class ActionNotificationObserver<T> implements Observer<T> {
    final Action1<Notification<? super T>> onNotification;

    public ActionNotificationObserver(Action1<Notification<? super T>> action1) {
        this.onNotification = action1;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.onNotification.call(Notification.createOnCompleted());
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        this.onNotification.call(Notification.createOnError(th2));
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        this.onNotification.call(Notification.createOnNext(t10));
    }
}
