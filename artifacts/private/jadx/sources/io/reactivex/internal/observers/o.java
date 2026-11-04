package io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c, io.reactivex.observers.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f298777a = -7545121636549663526L;

    @Override // io.reactivex.observers.g
    public boolean a() {
        return false;
    }

    @Override // io.reactivex.f
    public void d(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.disposables.d.o(this, cVar);
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.internal.disposables.d.b(this);
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return get() == io.reactivex.internal.disposables.d.DISPOSED;
    }

    @Override // io.reactivex.f
    public void onComplete() {
        lazySet(io.reactivex.internal.disposables.d.DISPOSED);
    }

    @Override // io.reactivex.f
    public void onError(Throwable th2) {
        lazySet(io.reactivex.internal.disposables.d.DISPOSED);
        io.reactivex.plugins.a.Y(new io.reactivex.exceptions.d(th2));
    }
}
