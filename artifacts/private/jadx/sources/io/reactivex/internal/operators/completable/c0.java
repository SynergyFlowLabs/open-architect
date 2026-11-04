package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i[] f298873a;

    static final class a implements io.reactivex.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.disposables.b f298875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.util.c f298876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f298877d;

        a(io.reactivex.f fVar, io.reactivex.disposables.b bVar, io.reactivex.internal.util.c cVar, AtomicInteger atomicInteger) {
            this.f298874a = fVar;
            this.f298875b = bVar;
            this.f298876c = cVar;
            this.f298877d = atomicInteger;
        }

        void a() {
            if (this.f298877d.decrementAndGet() == 0) {
                Throwable thC = this.f298876c.c();
                if (thC == null) {
                    this.f298874a.onComplete();
                    return;
                }
                this.f298874a.onError(thC);
            }
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            this.f298875b.c(cVar);
        }

        @Override // io.reactivex.f
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            if (this.f298876c.a(th2)) {
                a();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    public c0(io.reactivex.i[] iVarArr) {
        this.f298873a = iVarArr;
    }

    @Override // io.reactivex.c
    public void J0(io.reactivex.f fVar) {
        io.reactivex.disposables.b bVar = new io.reactivex.disposables.b();
        AtomicInteger atomicInteger = new AtomicInteger(this.f298873a.length + 1);
        io.reactivex.internal.util.c cVar = new io.reactivex.internal.util.c();
        fVar.d(bVar);
        for (io.reactivex.i iVar : this.f298873a) {
            if (bVar.k()) {
                return;
            }
            if (iVar == null) {
                cVar.a(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                iVar.b(new a(fVar, bVar, cVar, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            Throwable thC = cVar.c();
            if (thC == null) {
                fVar.onComplete();
            } else {
                fVar.onError(thC);
            }
        }
    }
}
