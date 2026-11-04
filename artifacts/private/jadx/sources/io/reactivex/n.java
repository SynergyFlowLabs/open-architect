package io.reactivex;

/* JADX INFO: loaded from: classes8.dex */
public interface n<T> extends k<T> {
    boolean a(@cj.f Throwable th2);

    void c(@cj.g dj.f fVar);

    void d(@cj.g io.reactivex.disposables.c cVar);

    boolean isCancelled();

    long requested();

    @cj.f
    n<T> serialize();
}
