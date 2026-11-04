package org.apache.commons.collections4.functors;

import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public final class n0<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335719c = -8125389089924745785L;

    public n0(org.apache.commons.collections4.l0<? super T>... l0VarArr) {
        super(l0VarArr);
    }

    public static <T> org.apache.commons.collections4.l0<T> c(Collection<? extends org.apache.commons.collections4.l0<? super T>> collection) {
        return new n0(v.j(collection));
    }

    public static <T> org.apache.commons.collections4.l0<T> d(org.apache.commons.collections4.l0<? super T>... l0VarArr) {
        v.h(l0VarArr);
        if (l0VarArr.length == 0) {
            return t.c();
        }
        return l0VarArr.length == 1 ? (org.apache.commons.collections4.l0<T>) l0VarArr[0] : new n0(v.e(l0VarArr));
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        boolean z10 = false;
        for (org.apache.commons.collections4.l0<? super T> l0Var : this.f335651a) {
            if (l0Var.a(t10)) {
                if (z10) {
                    return false;
                }
                z10 = true;
            }
        }
        return z10;
    }
}
