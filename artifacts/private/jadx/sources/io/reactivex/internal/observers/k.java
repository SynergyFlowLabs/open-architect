package io.reactivex.internal.observers;

import io.reactivex.n0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class k<T> extends AtomicReference<io.reactivex.disposables.c> implements n0<T>, io.reactivex.disposables.c, io.reactivex.observers.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f298760c = -7012088219455310787L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final dj.g<? super T> f298761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super Throwable> f298762b;

    public k(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2) {
        this.f298761a = gVar;
        this.f298762b = gVar2;
    }

    @Override // io.reactivex.observers.g
    public boolean a() {
        return this.f298762b != io.reactivex.internal.functions.a.f298695f;
    }

    @Override // io.reactivex.n0
    public void b(T t10) {
        lazySet(io.reactivex.internal.disposables.d.DISPOSED);
        try {
            this.f298761a.accept(t10);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // io.reactivex.n0
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

    @Override // io.reactivex.n0
    public void onError(Throwable th2) {
        lazySet(io.reactivex.internal.disposables.d.DISPOSED);
        try {
            this.f298762b.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, th3));
        }
    }
}
