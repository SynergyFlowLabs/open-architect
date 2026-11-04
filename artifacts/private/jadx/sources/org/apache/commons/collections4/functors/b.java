package org.apache.commons.collections4.functors;

import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public final class b<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335659c = -3094696765038308799L;

    public b(org.apache.commons.collections4.l0<? super T>... l0VarArr) {
        super(l0VarArr);
    }

    public static <T> org.apache.commons.collections4.l0<T> c(Collection<? extends org.apache.commons.collections4.l0<? super T>> collection) {
        org.apache.commons.collections4.l0[] l0VarArrJ = v.j(collection);
        if (l0VarArrJ.length == 0) {
            return y0.c();
        }
        return l0VarArrJ.length == 1 ? v.b(l0VarArrJ[0]) : new b(l0VarArrJ);
    }

    public static <T> org.apache.commons.collections4.l0<T> d(org.apache.commons.collections4.l0<? super T>... l0VarArr) {
        v.h(l0VarArr);
        if (l0VarArr.length == 0) {
            return y0.c();
        }
        return l0VarArr.length == 1 ? v.b(l0VarArr[0]) : new b(v.e(l0VarArr));
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        for (org.apache.commons.collections4.l0<? super T> l0Var : this.f335651a) {
            if (!l0Var.a(t10)) {
                return false;
            }
        }
        return true;
    }
}
