package io.reactivex.observers;

import io.reactivex.n0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k<T> implements n0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<io.reactivex.disposables.c> f303561a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.internal.disposables.f f303562b = new io.reactivex.internal.disposables.f();

    public final void a(@cj.f io.reactivex.disposables.c cVar) {
        io.reactivex.internal.functions.b.g(cVar, "resource is null");
        this.f303562b.c(cVar);
    }

    protected void c() {
    }

    @Override // io.reactivex.n0
    public final void d(@cj.f io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.util.i.c(this.f303561a, cVar, getClass())) {
            c();
        }
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        if (io.reactivex.internal.disposables.d.b(this.f303561a)) {
            this.f303562b.dispose();
        }
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return io.reactivex.internal.disposables.d.c(this.f303561a.get());
    }
}
