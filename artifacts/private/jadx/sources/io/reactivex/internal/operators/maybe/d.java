package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class d<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c, io.reactivex.observers.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f300721d = -6076952298809384986L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final dj.g<? super T> f300722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super Throwable> f300723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.a f300724c;

    public d(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar) {
        this.f300722a = gVar;
        this.f300723b = gVar2;
        this.f300724c = aVar;
    }

    @Override // io.reactivex.observers.g
    public boolean a() {
        return this.f300723b != io.reactivex.internal.functions.a.f298695f;
    }

    @Override // io.reactivex.v
    public void b(T t10) {
        lazySet(io.reactivex.internal.disposables.d.DISPOSED);
        try {
            this.f300722a.accept(t10);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // io.reactivex.v
    public void d(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.disposables.d.o(this, cVar);
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.internal.disposables.d.b(this);
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return io.reactivex.internal.disposables.d.c(get());
    }

    @Override // io.reactivex.v
    public void onComplete() {
        lazySet(io.reactivex.internal.disposables.d.DISPOSED);
        try {
            this.f300724c.run();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // io.reactivex.v
    public void onError(Throwable th2) {
        lazySet(io.reactivex.internal.disposables.d.DISPOSED);
        try {
            this.f300723b.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, th3));
        }
    }
}
