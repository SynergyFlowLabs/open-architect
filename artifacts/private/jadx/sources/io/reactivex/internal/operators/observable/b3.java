package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class b3<T> extends io.reactivex.k0<Boolean> implements ej.d<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<? extends T> f301378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<? extends T> f301379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.d<? super T, ? super T> f301380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f301381d;

    static final class a<T> extends AtomicInteger implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f301382j = -6178010334400373240L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Boolean> f301383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.d<? super T, ? super T> f301384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.disposables.a f301385c = new io.reactivex.internal.disposables.a(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.g0<? extends T> f301386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.g0<? extends T> f301387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final b<T>[] f301388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f301389g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        T f301390h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        T f301391i;

        a(io.reactivex.n0<? super Boolean> n0Var, int i10, io.reactivex.g0<? extends T> g0Var, io.reactivex.g0<? extends T> g0Var2, dj.d<? super T, ? super T> dVar) {
            this.f301383a = n0Var;
            this.f301386d = g0Var;
            this.f301387e = g0Var2;
            this.f301384b = dVar;
            this.f301388f = new b[]{new b<>(this, 0, i10), new b<>(this, 1, i10)};
            int i11 = 4 ^ 1;
        }

        void a(io.reactivex.internal.queue.c<T> cVar, io.reactivex.internal.queue.c<T> cVar2) {
            this.f301389g = true;
            cVar.clear();
            cVar2.clear();
        }

        void b() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T>[] bVarArr = this.f301388f;
            b<T> bVar = bVarArr[0];
            io.reactivex.internal.queue.c<T> cVar = bVar.f301393b;
            b<T> bVar2 = bVarArr[1];
            io.reactivex.internal.queue.c<T> cVar2 = bVar2.f301393b;
            int iAddAndGet = 1;
            while (!this.f301389g) {
                boolean z10 = bVar.f301395d;
                if (z10 && (th3 = bVar.f301396e) != null) {
                    a(cVar, cVar2);
                    this.f301383a.onError(th3);
                    return;
                }
                boolean z11 = bVar2.f301395d;
                if (z11 && (th2 = bVar2.f301396e) != null) {
                    a(cVar, cVar2);
                    this.f301383a.onError(th2);
                    return;
                }
                if (this.f301390h == null) {
                    this.f301390h = cVar.poll();
                }
                boolean z12 = this.f301390h == null;
                if (this.f301391i == null) {
                    this.f301391i = cVar2.poll();
                }
                T t10 = this.f301391i;
                boolean z13 = t10 == null;
                if (z10 && z11 && z12 && z13) {
                    this.f301383a.b(Boolean.TRUE);
                    return;
                }
                if (z10 && z11 && z12 != z13) {
                    a(cVar, cVar2);
                    this.f301383a.b(Boolean.FALSE);
                    return;
                }
                if (!z12 && !z13) {
                    try {
                        if (!this.f301384b.test(this.f301390h, t10)) {
                            a(cVar, cVar2);
                            this.f301383a.b(Boolean.FALSE);
                            return;
                        } else {
                            this.f301390h = null;
                            this.f301391i = null;
                        }
                    } catch (Throwable th4) {
                        io.reactivex.exceptions.b.b(th4);
                        a(cVar, cVar2);
                        this.f301383a.onError(th4);
                        return;
                    }
                }
                if (z12 || z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.clear();
            cVar2.clear();
        }

        boolean c(io.reactivex.disposables.c cVar, int i10) {
            return this.f301385c.b(i10, cVar);
        }

        void d() {
            b<T>[] bVarArr = this.f301388f;
            this.f301386d.a(bVarArr[0]);
            this.f301387e.a(bVarArr[1]);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f301389g) {
                return;
            }
            this.f301389g = true;
            this.f301385c.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f301388f;
                int i10 = 7 | 0;
                bVarArr[0].f301393b.clear();
                bVarArr[1].f301393b.clear();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301389g;
        }
    }

    static final class b<T> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<T> f301392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.queue.c<T> f301393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f301394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f301395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f301396e;

        b(a<T> aVar, int i10, int i11) {
            this.f301392a = aVar;
            this.f301394c = i10;
            this.f301393b = new io.reactivex.internal.queue.c<>(i11);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f301392a.c(cVar, this.f301394c);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301395d = true;
            this.f301392a.b();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301396e = th2;
            this.f301395d = true;
            this.f301392a.b();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301393b.offer(t10);
            this.f301392a.b();
        }
    }

    public b3(io.reactivex.g0<? extends T> g0Var, io.reactivex.g0<? extends T> g0Var2, dj.d<? super T, ? super T> dVar, int i10) {
        this.f301378a = g0Var;
        this.f301379b = g0Var2;
        this.f301380c = dVar;
        this.f301381d = i10;
    }

    @Override // ej.d
    public io.reactivex.b0<Boolean> c() {
        return io.reactivex.plugins.a.R(new a3(this.f301378a, this.f301379b, this.f301380c, this.f301381d));
    }

    @Override // io.reactivex.k0
    public void d1(io.reactivex.n0<? super Boolean> n0Var) {
        a aVar = new a(n0Var, this.f301381d, this.f301378a, this.f301379b, this.f301380c);
        n0Var.d(aVar);
        aVar.d();
    }
}
