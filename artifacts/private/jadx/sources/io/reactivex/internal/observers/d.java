package io.reactivex.internal.observers;

import io.reactivex.n0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class d<T> extends AtomicReference<io.reactivex.disposables.c> implements n0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f298744b = 4943102778943297569L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final dj.b<? super T, ? super Throwable> f298745a;

    public d(dj.b<? super T, ? super Throwable> bVar) {
        this.f298745a = bVar;
    }

    @Override // io.reactivex.n0
    public void b(T t10) {
        try {
            lazySet(io.reactivex.internal.disposables.d.DISPOSED);
            this.f298745a.accept(t10, null);
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
        try {
            lazySet(io.reactivex.internal.disposables.d.DISPOSED);
            this.f298745a.accept(null, th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, th3));
        }
    }
}
