package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class j0<T> implements p0<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335699b = 3243449850504576071L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super T> f335700a;

    public j0(org.apache.commons.collections4.l0<? super T> l0Var) {
        this.f335700a = l0Var;
    }

    public static <T> org.apache.commons.collections4.l0<T> c(org.apache.commons.collections4.l0<? super T> l0Var) {
        if (l0Var != null) {
            return new j0(l0Var);
        }
        throw new NullPointerException("Predicate must not be null");
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        if (t10 != null) {
            return this.f335700a.a(t10);
        }
        throw new org.apache.commons.collections4.q("Input Object must not be null");
    }

    @Override // org.apache.commons.collections4.functors.p0
    public org.apache.commons.collections4.l0<? super T>[] b() {
        int i10 = 5 | 1;
        return new org.apache.commons.collections4.l0[]{this.f335700a};
    }
}
