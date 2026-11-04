package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class l0<T> implements p0<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335709b = -7625133768987126273L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super T> f335710a;

    public l0(org.apache.commons.collections4.l0<? super T> l0Var) {
        this.f335710a = l0Var;
    }

    public static <T> org.apache.commons.collections4.l0<T> c(org.apache.commons.collections4.l0<? super T> l0Var) {
        if (l0Var != null) {
            return new l0(l0Var);
        }
        throw new NullPointerException("Predicate must not be null");
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        if (t10 == null) {
            return true;
        }
        return this.f335710a.a(t10);
    }

    @Override // org.apache.commons.collections4.functors.p0
    public org.apache.commons.collections4.l0<? super T>[] b() {
        return new org.apache.commons.collections4.l0[]{this.f335710a};
    }
}
