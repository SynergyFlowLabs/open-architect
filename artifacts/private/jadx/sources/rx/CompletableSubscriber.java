package rx;

import rx.annotations.Experimental;

/* JADX INFO: loaded from: classes14.dex */
@Experimental
public interface CompletableSubscriber {
    void onCompleted();

    void onError(Throwable th2);

    void onSubscribe(Subscription subscription);
}
