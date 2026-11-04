package io.reactivex.internal.operators.single;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class z0<T, R> extends io.reactivex.k0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterable<? extends io.reactivex.q0<? extends T>> f303149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super Object[], ? extends R> f303150b;

    final class a implements dj.o<T, R> {
        a() {
        }

        @Override // dj.o
        public R apply(T t10) throws Exception {
            return (R) io.reactivex.internal.functions.b.g(z0.this.f303150b.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    public z0(Iterable<? extends io.reactivex.q0<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar) {
        this.f303149a = iterable;
        this.f303150b = oVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super R> n0Var) {
        io.reactivex.q0[] q0VarArr = new io.reactivex.q0[8];
        try {
            int i10 = 0;
            for (io.reactivex.q0<? extends T> q0Var : this.f303149a) {
                if (q0Var == null) {
                    io.reactivex.internal.disposables.e.o(new NullPointerException("One of the sources is null"), n0Var);
                    return;
                }
                if (i10 == q0VarArr.length) {
                    q0VarArr = (io.reactivex.q0[]) Arrays.copyOf(q0VarArr, (i10 >> 2) + i10);
                }
                int i11 = i10 + 1;
                q0VarArr[i10] = q0Var;
                i10 = i11;
            }
            if (i10 == 0) {
                io.reactivex.internal.disposables.e.o(new NoSuchElementException(), n0Var);
                return;
            }
            if (i10 == 1) {
                q0VarArr[0].f(new k0.a(n0Var, new a()));
                return;
            }
            y0.b bVar = new y0.b(n0Var, i10, this.f303150b);
            n0Var.d(bVar);
            for (int i12 = 0; i12 < i10 && !bVar.k(); i12++) {
                q0VarArr[i12].f(bVar.f303134c[i12]);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.o(th2, n0Var);
        }
    }
}
