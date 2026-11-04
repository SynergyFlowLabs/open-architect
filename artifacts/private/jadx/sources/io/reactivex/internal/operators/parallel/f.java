package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.operators.flowable.z0;
import org.reactivestreams.u;
import org.reactivestreams.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f<T, R> extends io.reactivex.parallel.b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.b<T> f302735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends u<? extends R>> f302736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f302737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f302738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f302739e;

    public f(io.reactivex.parallel.b<T> bVar, dj.o<? super T, ? extends u<? extends R>> oVar, boolean z10, int i10, int i11) {
        this.f302735a = bVar;
        this.f302736b = oVar;
        this.f302737c = z10;
        this.f302738d = i10;
        this.f302739e = i11;
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302735a.F();
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super R>[] vVarArr) {
        if (U(vVarArr)) {
            int length = vVarArr.length;
            v<? super T>[] vVarArr2 = new v[length];
            for (int i10 = 0; i10 < length; i10++) {
                vVarArr2[i10] = z0.M8(vVarArr[i10], this.f302736b, this.f302737c, this.f302738d, this.f302739e);
            }
            this.f302735a.Q(vVarArr2);
        }
    }
}
