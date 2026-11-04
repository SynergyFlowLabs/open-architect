package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class u<T, R> extends io.reactivex.b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<? extends T>[] f302364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.g0<? extends T>> f302365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super Object[], ? extends R> f302366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f302367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f302368e;

    static final class a<T, R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f302369c = -4823716997131257941L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T, R> f302370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f302371b;

        a(b<T, R> bVar, int i10) {
            this.f302370a = bVar;
            this.f302371b = i10;
        }

        public void a() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302370a.d(this.f302371b);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302370a.e(this.f302371b, th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302370a.f(this.f302371b, t10);
        }
    }

    static final class b<T, R> extends AtomicInteger implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f302372l = 8567835998786448817L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f302373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super Object[], ? extends R> f302374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a<T, R>[] f302375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object[] f302376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.queue.c<Object[]> f302377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f302378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f302379g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f302380h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final io.reactivex.internal.util.c f302381i = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f302382j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f302383k;

        b(io.reactivex.i0<? super R> i0Var, dj.o<? super Object[], ? extends R> oVar, int i10, int i11, boolean z10) {
            this.f302373a = i0Var;
            this.f302374b = oVar;
            this.f302378f = z10;
            this.f302376d = new Object[i10];
            a<T, R>[] aVarArr = new a[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                aVarArr[i12] = new a<>(this, i12);
            }
            this.f302375c = aVarArr;
            this.f302377e = new io.reactivex.internal.queue.c<>(i11);
        }

        void a() {
            for (a<T, R> aVar : this.f302375c) {
                aVar.a();
            }
        }

        void b(io.reactivex.internal.queue.c<?> cVar) {
            synchronized (this) {
                try {
                    this.f302376d = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            cVar.clear();
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.c<Object[]> cVar = this.f302377e;
            io.reactivex.i0<? super R> i0Var = this.f302373a;
            boolean z10 = this.f302378f;
            int iAddAndGet = 1;
            while (!this.f302379g) {
                if (!z10 && this.f302381i.get() != null) {
                    a();
                    b(cVar);
                    i0Var.onError(this.f302381i.c());
                    return;
                }
                boolean z11 = this.f302380h;
                Object[] objArrPoll = cVar.poll();
                boolean z12 = objArrPoll == null;
                if (z11 && z12) {
                    b(cVar);
                    Throwable thC = this.f302381i.c();
                    if (thC == null) {
                        i0Var.onComplete();
                        return;
                    } else {
                        i0Var.onError(thC);
                        return;
                    }
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        i0Var.onNext((Object) io.reactivex.internal.functions.b.g(this.f302374b.apply(objArrPoll), "The combiner returned a null value"));
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f302381i.a(th2);
                        a();
                        b(cVar);
                        i0Var.onError(this.f302381i.c());
                        return;
                    }
                }
            }
            b(cVar);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0024 A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000c, B:14:0x001a, B:17:0x0027, B:16:0x0024), top: B:25:0x0001 }] */
        void d(int i10) {
            synchronized (this) {
                try {
                    Object[] objArr = this.f302376d;
                    if (objArr == null) {
                        return;
                    }
                    boolean z10 = objArr[i10] == null;
                    if (z10) {
                        this.f302380h = true;
                    } else {
                        int i11 = this.f302383k + 1;
                        this.f302383k = i11;
                        if (i11 == objArr.length) {
                            this.f302380h = true;
                        }
                    }
                    if (z10) {
                        a();
                    }
                    c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f302379g) {
                return;
            }
            this.f302379g = true;
            a();
            if (getAndIncrement() == 0) {
                b(this.f302377e);
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x002c A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:7:0x000f, B:9:0x0013, B:13:0x0018, B:18:0x0023, B:22:0x002f, B:20:0x002c), top: B:33:0x000f }] */
        void e(int i10, Throwable th2) {
            if (!this.f302381i.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            boolean z10 = true;
            if (this.f302378f) {
                synchronized (this) {
                    try {
                        Object[] objArr = this.f302376d;
                        if (objArr == null) {
                            return;
                        }
                        boolean z11 = objArr[i10] == null;
                        if (z11) {
                            this.f302380h = true;
                        } else {
                            int i11 = this.f302383k + 1;
                            this.f302383k = i11;
                            if (i11 == objArr.length) {
                                this.f302380h = true;
                            }
                        }
                        z10 = z11;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            if (z10) {
                a();
            }
            c();
        }

        void f(int i10, T t10) {
            boolean z10;
            synchronized (this) {
                try {
                    Object[] objArr = this.f302376d;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i10];
                    int i11 = this.f302382j;
                    if (obj == null) {
                        i11++;
                        this.f302382j = i11;
                    }
                    objArr[i10] = t10;
                    if (i11 == objArr.length) {
                        this.f302377e.offer((Object[]) objArr.clone());
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void g(io.reactivex.g0<? extends T>[] g0VarArr) {
            a<T, R>[] aVarArr = this.f302375c;
            int length = aVarArr.length;
            this.f302373a.d(this);
            for (int i10 = 0; i10 < length && !this.f302380h && !this.f302379g; i10++) {
                g0VarArr[i10].a(aVarArr[i10]);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302379g;
        }
    }

    public u(io.reactivex.g0<? extends T>[] g0VarArr, Iterable<? extends io.reactivex.g0<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f302364a = g0VarArr;
        this.f302365b = iterable;
        this.f302366c = oVar;
        this.f302367d = i10;
        this.f302368e = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super R> i0Var) {
        int length;
        io.reactivex.g0<? extends T>[] g0VarArr = this.f302364a;
        if (g0VarArr == null) {
            g0VarArr = new io.reactivex.b0[8];
            length = 0;
            for (io.reactivex.g0<? extends T> g0Var : this.f302365b) {
                if (length == g0VarArr.length) {
                    io.reactivex.g0<? extends T>[] g0VarArr2 = new io.reactivex.g0[(length >> 2) + length];
                    System.arraycopy(g0VarArr, 0, g0VarArr2, 0, length);
                    g0VarArr = g0VarArr2;
                }
                g0VarArr[length] = g0Var;
                length++;
            }
        } else {
            length = g0VarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            io.reactivex.internal.disposables.e.d(i0Var);
        } else {
            new b(i0Var, this.f302366c, i10, this.f302367d, this.f302368e).g(g0VarArr);
        }
    }
}
