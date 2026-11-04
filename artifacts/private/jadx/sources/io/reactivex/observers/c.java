package io.reactivex.observers;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c implements io.reactivex.f, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.c> f303551a = new AtomicReference<>();

    protected void a() {
    }

    @Override // io.reactivex.f
    public final void d(@cj.f io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.util.i.c(this.f303551a, cVar, getClass())) {
            a();
        }
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        io.reactivex.internal.disposables.d.b(this.f303551a);
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return this.f303551a.get() == io.reactivex.internal.disposables.d.DISPOSED;
    }
}
