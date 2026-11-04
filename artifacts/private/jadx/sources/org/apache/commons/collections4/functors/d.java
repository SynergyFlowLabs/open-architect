package org.apache.commons.collections4.functors;

import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public final class d<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335669c = 7429999530934647542L;

    public d(org.apache.commons.collections4.l0<? super T>... l0VarArr) {
        super(l0VarArr);
    }

    public static <T> org.apache.commons.collections4.l0<T> c(Collection<? extends org.apache.commons.collections4.l0<? super T>> collection) {
        org.apache.commons.collections4.l0<T>[] l0VarArrJ = v.j(collection);
        if (l0VarArrJ.length == 0) {
            return t.c();
        }
        return l0VarArrJ.length == 1 ? l0VarArrJ[0] : new d(l0VarArrJ);
    }

    public static <T> org.apache.commons.collections4.l0<T> d(org.apache.commons.collections4.l0<? super T>... l0VarArr) {
        v.h(l0VarArr);
        if (l0VarArr.length == 0) {
            return t.c();
        }
        return l0VarArr.length == 1 ? (org.apache.commons.collections4.l0<T>) l0VarArr[0] : new d(v.e(l0VarArr));
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        for (org.apache.commons.collections4.l0<? super T> l0Var : this.f335651a) {
            if (l0Var.a(t10)) {
                return true;
            }
        }
        return false;
    }
}
