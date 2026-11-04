package io.reactivex.internal.operators.observable;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class l4<T, R> extends io.reactivex.b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<? extends T>[] f301913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.g0<? extends T>> f301914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super Object[], ? extends R> f301915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f301916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f301917e;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f301918g = 2983708048395377667L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f301919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super Object[], ? extends R> f301920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b<T, R>[] f301921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final T[] f301922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f301923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f301924f;

        a(io.reactivex.i0<? super R> i0Var, dj.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
            this.f301919a = i0Var;
            this.f301920b = oVar;
            this.f301921c = new b[i10];
            this.f301922d = (T[]) new Object[i10];
            this.f301923e = z10;
        }

        void a() {
            d();
            b();
        }

        void b() {
            for (b<T, R> bVar : this.f301921c) {
                bVar.a();
            }
        }

        boolean c(boolean z10, boolean z11, io.reactivex.i0<? super R> i0Var, boolean z12, b<?, ?> bVar) {
            if (this.f301924f) {
                a();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = bVar.f301928d;
                a();
                if (th2 != null) {
                    i0Var.onError(th2);
                } else {
                    i0Var.onComplete();
                }
                return true;
            }
            Throwable th3 = bVar.f301928d;
            if (th3 != null) {
                a();
                i0Var.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            a();
            i0Var.onComplete();
            return true;
        }

        void d() {
            for (b<T, R> bVar : this.f301921c) {
                bVar.f301926b.clear();
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (!this.f301924f) {
                this.f301924f = true;
                b();
                if (getAndIncrement() == 0) {
                    d();
                }
            }
        }

        public void e() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T, R>[] bVarArr = this.f301921c;
            io.reactivex.i0<? super R> i0Var = this.f301919a;
            T[] tArr = this.f301922d;
            boolean z10 = this.f301923e;
            int iAddAndGet = 1;
            while (true) {
                int i10 = 0;
                int i11 = 0;
                for (b<T, R> bVar : bVarArr) {
                    if (tArr[i11] == null) {
                        boolean z11 = bVar.f301927c;
                        T tPoll = bVar.f301926b.poll();
                        boolean z12 = tPoll == null;
                        if (c(z11, z12, i0Var, z10, bVar)) {
                            return;
                        }
                        if (z12) {
                            i10++;
                        } else {
                            tArr[i11] = tPoll;
                        }
                    } else if (bVar.f301927c && !z10 && (th2 = bVar.f301928d) != null) {
                        a();
                        i0Var.onError(th2);
                        return;
                    }
                    i11++;
                }
                if (i10 != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        i0Var.onNext((Object) io.reactivex.internal.functions.b.g(this.f301920b.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        a();
                        i0Var.onError(th3);
                        return;
                    }
                }
            }
        }

        public void f(io.reactivex.g0<? extends T>[] g0VarArr, int i10) {
            b<T, R>[] bVarArr = this.f301921c;
            int length = bVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                bVarArr[i11] = new b<>(this, i10);
            }
            lazySet(0);
            this.f301919a.d(this);
            for (int i12 = 0; i12 < length && !this.f301924f; i12++) {
                g0VarArr[i12].a(bVarArr[i12]);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301924f;
        }
    }

    static final class b<T, R> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<T, R> f301925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.queue.c<T> f301926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f301927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Throwable f301928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301929e = new AtomicReference<>();

        b(a<T, R> aVar, int i10) {
            this.f301925a = aVar;
            this.f301926b = new io.reactivex.internal.queue.c<>(i10);
        }

        public void a() {
            io.reactivex.internal.disposables.d.b(this.f301929e);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f301929e, cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301927c = true;
            this.f301925a.e();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301928d = th2;
            this.f301927c = true;
            this.f301925a.e();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301926b.offer(t10);
            this.f301925a.e();
        }
    }

    public l4(io.reactivex.g0<? extends T>[] g0VarArr, Iterable<? extends io.reactivex.g0<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f301913a = g0VarArr;
        this.f301914b = iterable;
        this.f301915c = oVar;
        this.f301916d = i10;
        this.f301917e = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super R> i0Var) {
        int length;
        io.reactivex.g0<? extends T>[] g0VarArr = this.f301913a;
        if (g0VarArr == null) {
            g0VarArr = new io.reactivex.b0[8];
            length = 0;
            for (io.reactivex.g0<? extends T> g0Var : this.f301914b) {
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
        if (length == 0) {
            io.reactivex.internal.disposables.e.d(i0Var);
        } else {
            new a(i0Var, this.f301915c, length, this.f301917e).f(g0VarArr, this.f301916d);
        }
    }
}
