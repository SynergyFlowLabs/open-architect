package io.reactivex.internal.operators.observable;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class k4<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @cj.g
    final io.reactivex.g0<?>[] f301877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @cj.g
    final Iterable<? extends io.reactivex.g0<?>> f301878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @cj.f
    final dj.o<? super Object[], R> f301879d;

    final class a implements dj.o<T, R> {
        a() {
        }

        @Override // dj.o
        public R apply(T t10) throws Exception {
            return (R) io.reactivex.internal.functions.b.g(k4.this.f301879d.apply(new Object[]{t10}), "The combiner returned a null value");
        }
    }

    static final class b<T, R> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f301881h = 1577321883966341961L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f301882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super Object[], R> f301883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c[] f301884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceArray<Object> f301885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.util.c f301887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f301888g;

        b(io.reactivex.i0<? super R> i0Var, dj.o<? super Object[], R> oVar, int i10) {
            this.f301882a = i0Var;
            this.f301883b = oVar;
            c[] cVarArr = new c[i10];
            int i11 = 7 ^ 0;
            for (int i12 = 0; i12 < i10; i12++) {
                cVarArr[i12] = new c(this, i12);
            }
            this.f301884c = cVarArr;
            this.f301885d = new AtomicReferenceArray<>(i10);
            this.f301886e = new AtomicReference<>();
            this.f301887f = new io.reactivex.internal.util.c();
        }

        void a(int i10) {
            c[] cVarArr = this.f301884c;
            for (int i11 = 0; i11 < cVarArr.length; i11++) {
                if (i11 != i10) {
                    cVarArr[i11].a();
                }
            }
        }

        void b(int i10, boolean z10) {
            if (z10) {
                return;
            }
            this.f301888g = true;
            a(i10);
            io.reactivex.internal.util.l.a(this.f301882a, this, this.f301887f);
        }

        void c(int i10, Throwable th2) {
            this.f301888g = true;
            io.reactivex.internal.disposables.d.b(this.f301886e);
            a(i10);
            io.reactivex.internal.util.l.c(this.f301882a, th2, this, this.f301887f);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f301886e, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f301886e);
            for (c cVar : this.f301884c) {
                cVar.a();
            }
        }

        void e(int i10, Object obj) {
            this.f301885d.set(i10, obj);
        }

        void f(io.reactivex.g0<?>[] g0VarArr, int i10) {
            c[] cVarArr = this.f301884c;
            AtomicReference<io.reactivex.disposables.c> atomicReference = this.f301886e;
            for (int i11 = 0; i11 < i10 && !io.reactivex.internal.disposables.d.c(atomicReference.get()) && !this.f301888g; i11++) {
                g0VarArr[i11].a(cVarArr[i11]);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f301886e.get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (!this.f301888g) {
                this.f301888g = true;
                a(-1);
                io.reactivex.internal.util.l.a(this.f301882a, this, this.f301887f);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301888g) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f301888g = true;
            a(-1);
            io.reactivex.internal.util.l.c(this.f301882a, th2, this, this.f301887f);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301888g) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f301885d;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i10 = 0;
            objArr[0] = t10;
            while (i10 < length) {
                Object obj = atomicReferenceArray.get(i10);
                if (obj == null) {
                    return;
                }
                i10++;
                objArr[i10] = obj;
            }
            try {
                io.reactivex.internal.util.l.e(this.f301882a, io.reactivex.internal.functions.b.g(this.f301883b.apply(objArr), "combiner returned a null value"), this, this.f301887f);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                dispose();
                onError(th2);
            }
        }
    }

    static final class c extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f301889d = 3256684027868224024L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<?, ?> f301890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f301891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f301892c;

        c(b<?, ?> bVar, int i10) {
            this.f301890a = bVar;
            this.f301891b = i10;
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
            this.f301890a.b(this.f301891b, this.f301892c);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301890a.c(this.f301891b, th2);
        }

        @Override // io.reactivex.i0
        public void onNext(Object obj) {
            if (!this.f301892c) {
                this.f301892c = true;
            }
            this.f301890a.e(this.f301891b, obj);
        }
    }

    public k4(@cj.f io.reactivex.g0<T> g0Var, @cj.f io.reactivex.g0<?>[] g0VarArr, @cj.f dj.o<? super Object[], R> oVar) {
        super(g0Var);
        this.f301877b = g0VarArr;
        this.f301878c = null;
        this.f301879d = oVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super R> i0Var) {
        int length;
        io.reactivex.g0<?>[] g0VarArr = this.f301877b;
        if (g0VarArr == null) {
            g0VarArr = new io.reactivex.g0[8];
            try {
                length = 0;
                for (io.reactivex.g0<?> g0Var : this.f301878c) {
                    if (length == g0VarArr.length) {
                        g0VarArr = (io.reactivex.g0[]) Arrays.copyOf(g0VarArr, (length >> 1) + length);
                    }
                    int i10 = length + 1;
                    g0VarArr[length] = g0Var;
                    length = i10;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.internal.disposables.e.l(th2, i0Var);
                return;
            }
        } else {
            length = g0VarArr.length;
        }
        if (length == 0) {
            new w1(this.f301291a, new a()).H5(i0Var);
            return;
        }
        b bVar = new b(i0Var, this.f301879d, length);
        i0Var.d(bVar);
        bVar.f(g0VarArr, length);
        this.f301291a.a(bVar);
    }

    public k4(@cj.f io.reactivex.g0<T> g0Var, @cj.f Iterable<? extends io.reactivex.g0<?>> iterable, @cj.f dj.o<? super Object[], R> oVar) {
        super(g0Var);
        this.f301877b = null;
        this.f301878c = iterable;
        this.f301879d = oVar;
    }
}
