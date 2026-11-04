package io.reactivex.observers;

import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e<T> implements i0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.c> f303553a = new AtomicReference<>();

    protected void b() {
    }

    @Override // io.reactivex.i0
    public final void d(@cj.f io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.util.i.c(this.f303553a, cVar, getClass())) {
            b();
        }
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        io.reactivex.internal.disposables.d.b(this.f303553a);
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return this.f303553a.get() == io.reactivex.internal.disposables.d.DISPOSED;
    }
}
