package io.reactivex.internal.operators.parallel;

import org.reactivestreams.u;
import org.reactivestreams.v;

/* JADX INFO: loaded from: classes10.dex */
public final class g<T> extends io.reactivex.parallel.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u<T>[] f302740a;

    public g(u<T>[] uVarArr) {
        this.f302740a = uVarArr;
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302740a.length;
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super T>[] vVarArr) {
        if (U(vVarArr)) {
            int length = vVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f302740a[i10].e(vVarArr[i10]);
            }
        }
    }
}
