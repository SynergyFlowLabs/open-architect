package io.reactivex.observers;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h implements io.reactivex.f, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<io.reactivex.disposables.c> f303555a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.internal.disposables.f f303556b = new io.reactivex.internal.disposables.f();

    public final void a(@cj.f io.reactivex.disposables.c cVar) {
        io.reactivex.internal.functions.b.g(cVar, "resource is null");
        this.f303556b.c(cVar);
    }

    protected void b() {
    }

    @Override // io.reactivex.f
    public final void d(@cj.f io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.util.i.c(this.f303555a, cVar, getClass())) {
            b();
        }
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        if (io.reactivex.internal.disposables.d.b(this.f303555a)) {
            this.f303556b.dispose();
        }
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return io.reactivex.internal.disposables.d.c(this.f303555a.get());
    }
}
