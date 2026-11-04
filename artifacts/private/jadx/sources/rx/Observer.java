package rx;

/* JADX INFO: loaded from: classes14.dex */
public interface Observer<T> {
    void onCompleted();

    void onError(Throwable th2);

    void onNext(T t10);
}
