package io.reactivex.observers;

import io.reactivex.v;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d<T> implements v<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.c> f303552a = new AtomicReference<>();

    protected void a() {
    }

    @Override // io.reactivex.v
    public final void d(@cj.f io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.util.i.c(this.f303552a, cVar, getClass())) {
            a();
        }
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        io.reactivex.internal.disposables.d.b(this.f303552a);
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return this.f303552a.get() == io.reactivex.internal.disposables.d.DISPOSED;
    }
}
