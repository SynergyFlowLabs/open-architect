package rx;

import rx.annotations.Experimental;

/* JADX INFO: loaded from: classes14.dex */
@Experimental
public interface AsyncEmitter<T> extends Observer<T> {

    public enum BackpressureMode {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST;

        static {
            int i10 = 2 ^ 3;
        }
    }

    public interface Cancellable {
        void cancel() throws Exception;
    }

    long requested();

    void setCancellation(Cancellable cancellable);

    void setSubscription(Subscription subscription);
}
