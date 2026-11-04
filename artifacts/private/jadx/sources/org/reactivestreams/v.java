package org.reactivestreams;

/* JADX INFO: loaded from: classes14.dex */
public interface v<T> {
    void l(w wVar);

    void onComplete();

    void onError(Throwable th2);

    void onNext(T t10);
}
