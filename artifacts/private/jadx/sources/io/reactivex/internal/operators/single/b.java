package io.reactivex.internal.operators.single;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class b<T> extends io.reactivex.k0<T> implements io.reactivex.n0<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final a[] f302892f = new a[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a[] f302893g = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f302894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicInteger f302895b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<a<T>[]> f302896c = new AtomicReference<>(f302892f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    T f302897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Throwable f302898e;

    static final class a<T> extends AtomicBoolean implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f302899c = 7514387411091976596L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T> f302901b;

        a(io.reactivex.n0<? super T> n0Var, b<T> bVar) {
            this.f302900a = n0Var;
            this.f302901b = bVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f302901b.Q1(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get();
        }
    }

    public b(io.reactivex.q0<? extends T> q0Var) {
        this.f302894a = q0Var;
    }

    boolean P1(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f302896c.get();
            if (aVarArr == f302893g) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!z1.a(this.f302896c, aVarArr, aVarArr2));
        return true;
    }

    void Q1(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f302896c.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (aVarArr[i10] == aVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = f302892f;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!z1.a(this.f302896c, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.n0
    public void b(T t10) {
        this.f302897d = t10;
        for (a<T> aVar : this.f302896c.getAndSet(f302893g)) {
            if (!aVar.k()) {
                aVar.f302900a.b(t10);
            }
        }
    }

    @Override // io.reactivex.n0
    public void d(io.reactivex.disposables.c cVar) {
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        a<T> aVar = new a<>(n0Var, this);
        n0Var.d(aVar);
        if (P1(aVar)) {
            if (aVar.k()) {
                Q1(aVar);
            }
            if (this.f302895b.getAndIncrement() == 0) {
                this.f302894a.f(this);
                return;
            }
            return;
        }
        Throwable th2 = this.f302898e;
        if (th2 != null) {
            n0Var.onError(th2);
        } else {
            n0Var.b(this.f302897d);
        }
    }

    @Override // io.reactivex.n0
    public void onError(Throwable th2) {
        this.f302898e = th2;
        for (a<T> aVar : this.f302896c.getAndSet(f302893g)) {
            if (!aVar.k()) {
                aVar.f302900a.onError(th2);
            }
        }
    }
}
