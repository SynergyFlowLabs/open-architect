package io.reactivex.observers;

import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class j<T> implements i0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<io.reactivex.disposables.c> f303559a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.internal.disposables.f f303560b = new io.reactivex.internal.disposables.f();

    public final void a(@cj.f io.reactivex.disposables.c cVar) {
        io.reactivex.internal.functions.b.g(cVar, "resource is null");
        this.f303560b.c(cVar);
    }

    protected void b() {
    }

    @Override // io.reactivex.i0
    public final void d(io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.util.i.c(this.f303559a, cVar, getClass())) {
            b();
        }
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        if (io.reactivex.internal.disposables.d.b(this.f303559a)) {
            this.f303560b.dispose();
        }
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return io.reactivex.internal.disposables.d.c(this.f303559a.get());
    }
}
