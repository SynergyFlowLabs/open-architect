package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class i0<T> implements p0<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335686b = -2654603322338049674L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super T> f335687a;

    public i0(org.apache.commons.collections4.l0<? super T> l0Var) {
        this.f335687a = l0Var;
    }

    public static <T> org.apache.commons.collections4.l0<T> c(org.apache.commons.collections4.l0<? super T> l0Var) {
        if (l0Var != null) {
            return new i0(l0Var);
        }
        throw new NullPointerException("Predicate must not be null");
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        return !this.f335687a.a(t10);
    }

    @Override // org.apache.commons.collections4.functors.p0
    public org.apache.commons.collections4.l0<? super T>[] b() {
        return new org.apache.commons.collections4.l0[]{this.f335687a};
    }
}
