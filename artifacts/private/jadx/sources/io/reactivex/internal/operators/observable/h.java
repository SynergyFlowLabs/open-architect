package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class h<T> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<? extends T>[] f301637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.g0<? extends T>> f301638b;

    static final class a<T> implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T>[] f301640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f301641c = new AtomicInteger();

        a(io.reactivex.i0<? super T> i0Var, int i10) {
            this.f301639a = i0Var;
            this.f301640b = new b[i10];
        }

        public void a(io.reactivex.g0<? extends T>[] g0VarArr) {
            b<T>[] bVarArr = this.f301640b;
            int length = bVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                bVarArr[i10] = new b<>(this, i11, this.f301639a);
                i10 = i11;
            }
            this.f301641c.lazySet(0);
            this.f301639a.d(this);
            for (int i12 = 0; i12 < length && this.f301641c.get() == 0; i12++) {
                g0VarArr[i12].a(bVarArr[i12]);
            }
        }

        public boolean b(int i10) {
            int i11 = this.f301641c.get();
            int i12 = 0;
            if (i11 != 0) {
                return i11 == i10;
            }
            if (!this.f301641c.compareAndSet(0, i10)) {
                return false;
            }
            b<T>[] bVarArr = this.f301640b;
            int length = bVarArr.length;
            while (i12 < length) {
                int i13 = i12 + 1;
                if (i13 != i10) {
                    bVarArr[i12].a();
                }
                i12 = i13;
            }
            return true;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f301641c.get() != -1) {
                this.f301641c.lazySet(-1);
                int i10 = 2 << 0;
                for (b<T> bVar : this.f301640b) {
                    bVar.a();
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301641c.get() == -1;
        }
    }

    static final class b<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f301642e = -1185974347409665484L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<T> f301643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f301644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f301646d;

        b(a<T> aVar, int i10, io.reactivex.i0<? super T> i0Var) {
            this.f301643a = aVar;
            this.f301644b = i10;
            this.f301645c = i0Var;
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
            if (this.f301646d) {
                this.f301645c.onComplete();
            } else if (this.f301643a.b(this.f301644b)) {
                this.f301646d = true;
                this.f301645c.onComplete();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301646d) {
                this.f301645c.onError(th2);
            } else {
                if (!this.f301643a.b(this.f301644b)) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                }
                int i10 = 2 >> 1;
                this.f301646d = true;
                this.f301645c.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301646d) {
                this.f301645c.onNext(t10);
            } else if (!this.f301643a.b(this.f301644b)) {
                get().dispose();
            } else {
                this.f301646d = true;
                this.f301645c.onNext(t10);
            }
        }
    }

    public h(io.reactivex.g0<? extends T>[] g0VarArr, Iterable<? extends io.reactivex.g0<? extends T>> iterable) {
        this.f301637a = g0VarArr;
        this.f301638b = iterable;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        int length;
        io.reactivex.g0<? extends T>[] g0VarArr = this.f301637a;
        if (g0VarArr == null) {
            g0VarArr = new io.reactivex.b0[8];
            try {
                length = 0;
                for (io.reactivex.g0<? extends T> g0Var : this.f301638b) {
                    if (g0Var == null) {
                        io.reactivex.internal.disposables.e.l(new NullPointerException("One of the sources is null"), i0Var);
                        return;
                    }
                    if (length == g0VarArr.length) {
                        io.reactivex.g0<? extends T>[] g0VarArr2 = new io.reactivex.g0[(length >> 2) + length];
                        System.arraycopy(g0VarArr, 0, g0VarArr2, 0, length);
                        g0VarArr = g0VarArr2;
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
            io.reactivex.internal.disposables.e.d(i0Var);
        } else if (length == 1) {
            g0VarArr[0].a(i0Var);
        } else {
            new a(i0Var, length).a(g0VarArr);
        }
    }
}
