package io.reactivex.internal.operators.maybe;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class u1<T, R> extends io.reactivex.s<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterable<? extends io.reactivex.y<? extends T>> f300984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super Object[], ? extends R> f300985b;

    final class a implements dj.o<T, R> {
        a() {
        }

        @Override // dj.o
        public R apply(T t10) throws Exception {
            return (R) io.reactivex.internal.functions.b.g(u1.this.f300985b.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    public u1(Iterable<? extends io.reactivex.y<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar) {
        this.f300984a = iterable;
        this.f300985b = oVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super R> vVar) {
        io.reactivex.y[] yVarArr = new io.reactivex.y[8];
        try {
            int i10 = 0;
            for (io.reactivex.y<? extends T> yVar : this.f300984a) {
                if (yVar == null) {
                    io.reactivex.internal.disposables.e.f(new NullPointerException("One of the sources is null"), vVar);
                    return;
                }
                if (i10 == yVarArr.length) {
                    yVarArr = (io.reactivex.y[]) Arrays.copyOf(yVarArr, (i10 >> 2) + i10);
                }
                int i11 = i10 + 1;
                yVarArr[i10] = yVar;
                i10 = i11;
            }
            if (i10 == 0) {
                io.reactivex.internal.disposables.e.c(vVar);
                return;
            }
            if (i10 == 1) {
                yVarArr[0].a(new v0.a(vVar, new a()));
                return;
            }
            t1.b bVar = new t1.b(vVar, i10, this.f300985b);
            vVar.d(bVar);
            for (int i12 = 0; i12 < i10 && !bVar.k(); i12++) {
                yVarArr[i12].a(bVar.f300977c[i12]);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.f(th2, vVar);
        }
    }
}
