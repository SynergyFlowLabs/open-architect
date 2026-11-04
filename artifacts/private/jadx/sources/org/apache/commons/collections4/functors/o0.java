package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class o0<T> implements p0<T>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335722c = -8791518325735182855L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super T> f335723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super T> f335724b;

    public o0(org.apache.commons.collections4.l0<? super T> l0Var, org.apache.commons.collections4.l0<? super T> l0Var2) {
        this.f335723a = l0Var;
        this.f335724b = l0Var2;
    }

    public static <T> org.apache.commons.collections4.l0<T> c(org.apache.commons.collections4.l0<? super T> l0Var, org.apache.commons.collections4.l0<? super T> l0Var2) {
        if (l0Var == null || l0Var2 == null) {
            throw new NullPointerException("Predicate must not be null");
        }
        return new o0(l0Var, l0Var2);
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        return this.f335723a.a(t10) || this.f335724b.a(t10);
    }

    @Override // org.apache.commons.collections4.functors.p0
    public org.apache.commons.collections4.l0<? super T>[] b() {
        return new org.apache.commons.collections4.l0[]{this.f335723a, this.f335724b};
    }
}
