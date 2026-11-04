package io.reactivex.observers;

import io.reactivex.i0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b<T> implements i0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.reactivex.disposables.c f303550a;

    protected final void a() {
        io.reactivex.disposables.c cVar = this.f303550a;
        this.f303550a = io.reactivex.internal.disposables.d.DISPOSED;
        cVar.dispose();
    }

    protected void b() {
    }

    @Override // io.reactivex.i0
    public final void d(@cj.f io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.util.i.e(this.f303550a, cVar, getClass())) {
            this.f303550a = cVar;
            b();
        }
    }
}
