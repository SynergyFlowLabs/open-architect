package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class a<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.reactivex.q0<? extends T>[] f302877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterable<? extends io.reactivex.q0<? extends T>> f302878b;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.single.a$a, reason: collision with other inner class name */
    static final class C2187a<T> implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.disposables.b f302879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicBoolean f302881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f302882d;

        C2187a(io.reactivex.n0<? super T> n0Var, io.reactivex.disposables.b bVar, AtomicBoolean atomicBoolean) {
            this.f302880b = n0Var;
            this.f302879a = bVar;
            this.f302881c = atomicBoolean;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            if (this.f302881c.compareAndSet(false, true)) {
                this.f302879a.b(this.f302882d);
                this.f302879a.dispose();
                this.f302880b.b(t10);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            this.f302882d = cVar;
            this.f302879a.c(cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            if (!this.f302881c.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302879a.b(this.f302882d);
            this.f302879a.dispose();
            this.f302880b.onError(th2);
        }
    }

    public a(io.reactivex.q0<? extends T>[] q0VarArr, Iterable<? extends io.reactivex.q0<? extends T>> iterable) {
        this.f302877a = q0VarArr;
        this.f302878b = iterable;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        int length;
        io.reactivex.q0<? extends T>[] q0VarArr = this.f302877a;
        if (q0VarArr == null) {
            q0VarArr = new io.reactivex.q0[8];
            try {
                length = 0;
                for (io.reactivex.q0<? extends T> q0Var : this.f302878b) {
                    if (q0Var == null) {
                        io.reactivex.internal.disposables.e.o(new NullPointerException("One of the sources is null"), n0Var);
                        return;
                    }
                    if (length == q0VarArr.length) {
                        io.reactivex.q0<? extends T>[] q0VarArr2 = new io.reactivex.q0[(length >> 2) + length];
                        System.arraycopy(q0VarArr, 0, q0VarArr2, 0, length);
                        q0VarArr = q0VarArr2;
                    }
                    int i10 = length + 1;
                    q0VarArr[length] = q0Var;
                    length = i10;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.internal.disposables.e.o(th2, n0Var);
                return;
            }
        } else {
            length = q0VarArr.length;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        io.reactivex.disposables.b bVar = new io.reactivex.disposables.b();
        n0Var.d(bVar);
        for (int i11 = 0; i11 < length; i11++) {
            io.reactivex.q0<? extends T> q0Var2 = q0VarArr[i11];
            if (bVar.k()) {
                return;
            }
            if (q0Var2 == null) {
                bVar.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    n0Var.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.plugins.a.Y(nullPointerException);
                    return;
                }
            }
            q0Var2.f(new C2187a(n0Var, bVar, atomicBoolean));
        }
    }
}
