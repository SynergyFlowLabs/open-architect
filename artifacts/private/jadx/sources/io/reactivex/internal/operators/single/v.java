package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class v<T> extends io.reactivex.k0<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f303090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f303091b;

    static class a<T> implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f303092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.disposables.b f303093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object[] f303094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.n0<? super Boolean> f303095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicInteger f303096e;

        a(int i10, io.reactivex.disposables.b bVar, Object[] objArr, io.reactivex.n0<? super Boolean> n0Var, AtomicInteger atomicInteger) {
            this.f303092a = i10;
            this.f303093b = bVar;
            this.f303094c = objArr;
            this.f303095d = n0Var;
            this.f303096e = atomicInteger;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303094c[this.f303092a] = t10;
            if (this.f303096e.incrementAndGet() == 2) {
                io.reactivex.n0<? super Boolean> n0Var = this.f303095d;
                Object[] objArr = this.f303094c;
                n0Var.b(Boolean.valueOf(io.reactivex.internal.functions.b.c(objArr[0], objArr[1])));
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            this.f303093b.c(cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            int i10;
            do {
                i10 = this.f303096e.get();
                if (i10 >= 2) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                }
            } while (!this.f303096e.compareAndSet(i10, 2));
            this.f303093b.dispose();
            this.f303095d.onError(th2);
        }
    }

    public v(io.reactivex.q0<? extends T> q0Var, io.reactivex.q0<? extends T> q0Var2) {
        this.f303090a = q0Var;
        this.f303091b = q0Var2;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super Boolean> n0Var) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        io.reactivex.disposables.b bVar = new io.reactivex.disposables.b();
        n0Var.d(bVar);
        this.f303090a.f(new a(0, bVar, objArr, n0Var, atomicInteger));
        this.f303091b.f(new a(1, bVar, objArr, n0Var, atomicInteger));
    }
}
