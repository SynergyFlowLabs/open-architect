package io.reactivex;

/* JADX INFO: loaded from: classes8.dex */
public interface i0<T> {
    void d(@cj.f io.reactivex.disposables.c cVar);

    void onComplete();

    void onError(@cj.f Throwable th2);

    void onNext(@cj.f T t10);
}
