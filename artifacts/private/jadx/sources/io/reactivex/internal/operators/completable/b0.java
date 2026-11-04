package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i[] f298859a;

    static final class a extends AtomicInteger implements io.reactivex.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f298860d = -8360547806504310570L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicBoolean f298862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.b f298863c;

        a(io.reactivex.f fVar, AtomicBoolean atomicBoolean, io.reactivex.disposables.b bVar, int i10) {
            this.f298861a = fVar;
            this.f298862b = atomicBoolean;
            this.f298863c = bVar;
            lazySet(i10);
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            this.f298863c.c(cVar);
        }

        @Override // io.reactivex.f
        public void onComplete() {
            if (decrementAndGet() == 0 && this.f298862b.compareAndSet(false, true)) {
                this.f298861a.onComplete();
            }
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f298863c.dispose();
            if (this.f298862b.compareAndSet(false, true)) {
                this.f298861a.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    public b0(io.reactivex.i[] iVarArr) {
        this.f298859a = iVarArr;
    }

    @Override // io.reactivex.c
    public void J0(io.reactivex.f fVar) {
        io.reactivex.disposables.b bVar = new io.reactivex.disposables.b();
        a aVar = new a(fVar, new AtomicBoolean(), bVar, this.f298859a.length + 1);
        fVar.d(bVar);
        for (io.reactivex.i iVar : this.f298859a) {
            if (bVar.k()) {
                return;
            }
            if (iVar == null) {
                bVar.dispose();
                aVar.onError(new NullPointerException("A completable source is null"));
                return;
            }
            iVar.b(aVar);
        }
        aVar.onComplete();
    }
}
