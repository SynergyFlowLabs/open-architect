package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.operators.flowable.w;
import org.reactivestreams.u;
import org.reactivestreams.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b<T, R> extends io.reactivex.parallel.b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.b<T> f302700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends u<? extends R>> f302701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f302702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.internal.util.j f302703d;

    public b(io.reactivex.parallel.b<T> bVar, dj.o<? super T, ? extends u<? extends R>> oVar, int i10, io.reactivex.internal.util.j jVar) {
        this.f302700a = bVar;
        this.f302701b = (dj.o) io.reactivex.internal.functions.b.g(oVar, "mapper");
        this.f302702c = i10;
        this.f302703d = (io.reactivex.internal.util.j) io.reactivex.internal.functions.b.g(jVar, "errorMode");
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302700a.F();
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super R>[] vVarArr) {
        if (U(vVarArr)) {
            int length = vVarArr.length;
            v<? super T>[] vVarArr2 = new v[length];
            for (int i10 = 0; i10 < length; i10++) {
                vVarArr2[i10] = w.M8(vVarArr[i10], this.f302701b, this.f302702c, this.f302703d);
            }
            this.f302700a.Q(vVarArr2);
        }
    }
}
