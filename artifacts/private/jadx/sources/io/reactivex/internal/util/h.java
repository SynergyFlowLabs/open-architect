package io.reactivex.internal.util;

import io.reactivex.i0;
import io.reactivex.n0;

/* JADX INFO: loaded from: classes11.dex */
public enum h implements io.reactivex.q<Object>, i0<Object>, io.reactivex.v<Object>, n0<Object>, io.reactivex.f, org.reactivestreams.w, io.reactivex.disposables.c {
    INSTANCE;

    public static <T> i0<T> n() {
        return INSTANCE;
    }

    public static <T> org.reactivestreams.v<T> o() {
        return INSTANCE;
    }

    @Override // io.reactivex.v
    public void b(Object obj) {
    }

    @Override // org.reactivestreams.w
    public void cancel() {
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        cVar.dispose();
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return true;
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(org.reactivestreams.w wVar) {
        wVar.cancel();
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        io.reactivex.plugins.a.Y(th2);
    }

    @Override // org.reactivestreams.v
    public void onNext(Object obj) {
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
    }
}
