package rx;

import rx.annotations.Experimental;

/* JADX INFO: loaded from: classes14.dex */
@Experimental
public interface CompletableEmitter {
    void onCompleted();

    void onError(Throwable th2);

    void setCancellation(AsyncEmitter.Cancellable cancellable);

    void setSubscription(Subscription subscription);
}
