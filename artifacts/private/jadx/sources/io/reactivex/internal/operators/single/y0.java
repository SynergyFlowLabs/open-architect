package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class y0<T, R> extends io.reactivex.k0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<? extends T>[] f303128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super Object[], ? extends R> f303129b;

    final class a implements dj.o<T, R> {
        a() {
        }

        @Override // dj.o
        public R apply(T t10) throws Exception {
            return (R) io.reactivex.internal.functions.b.g(y0.this.f303129b.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    static final class b<T, R> extends AtomicInteger implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f303131e = -5556924161382950569L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super R> f303132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super Object[], ? extends R> f303133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c<T>[] f303134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Object[] f303135d;

        b(io.reactivex.n0<? super R> n0Var, int i10, dj.o<? super Object[], ? extends R> oVar) {
            super(i10);
            this.f303132a = n0Var;
            this.f303133b = oVar;
            c<T>[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c<>(this, i11);
            }
            this.f303134c = cVarArr;
            this.f303135d = new Object[i10];
        }

        void a(int i10) {
            c<T>[] cVarArr = this.f303134c;
            int length = cVarArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11].a();
            }
            while (true) {
                i10++;
                if (i10 >= length) {
                    return;
                } else {
                    cVarArr[i10].a();
                }
            }
        }

        void b(Throwable th2, int i10) {
            if (getAndSet(0) <= 0) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                a(i10);
                this.f303132a.onError(th2);
            }
        }

        void c(T t10, int i10) {
            this.f303135d[i10] = t10;
            if (decrementAndGet() == 0) {
                try {
                    this.f303132a.b(io.reactivex.internal.functions.b.g(this.f303133b.apply(this.f303135d), "The zipper returned a null value"));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f303132a.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f303134c) {
                    cVar.a();
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            if (get() > 0) {
                return false;
            }
            int i10 = 5 ^ 1;
            return true;
        }
    }

    static final class c<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303136c = 3323743579927613702L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T, ?> f303137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f303138b;

        c(b<T, ?> bVar, int i10) {
            this.f303137a = bVar;
            this.f303138b = i10;
        }

        public void a() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303137a.c(t10, this.f303138b);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303137a.b(th2, this.f303138b);
        }
    }

    public y0(io.reactivex.q0<? extends T>[] q0VarArr, dj.o<? super Object[], ? extends R> oVar) {
        this.f303128a = q0VarArr;
        this.f303129b = oVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super R> n0Var) {
        io.reactivex.q0<? extends T>[] q0VarArr = this.f303128a;
        int length = q0VarArr.length;
        if (length == 1) {
            q0VarArr[0].f(new k0.a(n0Var, new a()));
            return;
        }
        b bVar = new b(n0Var, length, this.f303129b);
        n0Var.d(bVar);
        for (int i10 = 0; i10 < length && !bVar.k(); i10++) {
            io.reactivex.q0<? extends T> q0Var = q0VarArr[i10];
            if (q0Var == null) {
                bVar.b(new NullPointerException("One of the sources is null"), i10);
                return;
            }
            q0Var.f(bVar.f303134c[i10]);
        }
    }
}
