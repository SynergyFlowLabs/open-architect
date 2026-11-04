package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<c> f298665a;

    public h() {
        this.f298665a = new AtomicReference<>();
    }

    @cj.g
    public c a() {
        c cVarA = this.f298665a.get();
        if (cVarA == io.reactivex.internal.disposables.d.DISPOSED) {
            cVarA = d.a();
        }
        return cVarA;
    }

    public boolean b(@cj.g c cVar) {
        return io.reactivex.internal.disposables.d.d(this.f298665a, cVar);
    }

    public boolean c(@cj.g c cVar) {
        return io.reactivex.internal.disposables.d.n(this.f298665a, cVar);
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.internal.disposables.d.b(this.f298665a);
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return io.reactivex.internal.disposables.d.c(this.f298665a.get());
    }

    public h(@cj.g c cVar) {
        this.f298665a = new AtomicReference<>(cVar);
    }
}
