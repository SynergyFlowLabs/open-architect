package io.reactivex.observers;

import io.reactivex.n0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f<T> implements n0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.c> f303554a = new AtomicReference<>();

    protected void a() {
    }

    @Override // io.reactivex.n0
    public final void d(@cj.f io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.util.i.c(this.f303554a, cVar, getClass())) {
            a();
        }
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        io.reactivex.internal.disposables.d.b(this.f303554a);
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return this.f303554a.get() == io.reactivex.internal.disposables.d.DISPOSED;
    }
}
