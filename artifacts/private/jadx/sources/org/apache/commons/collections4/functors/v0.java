package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class v0<T> implements p0<T>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335752c = -5596090919668315834L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.w0<? super T, ? extends T> f335753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super T> f335754b;

    public v0(org.apache.commons.collections4.w0<? super T, ? extends T> w0Var, org.apache.commons.collections4.l0<? super T> l0Var) {
        this.f335753a = w0Var;
        this.f335754b = l0Var;
    }

    public static <T> org.apache.commons.collections4.l0<T> d(org.apache.commons.collections4.w0<? super T, ? extends T> w0Var, org.apache.commons.collections4.l0<? super T> l0Var) {
        if (w0Var == null) {
            throw new NullPointerException("The transformer to call must not be null");
        }
        if (l0Var != null) {
            return new v0(w0Var, l0Var);
        }
        throw new NullPointerException("The predicate to call must not be null");
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        return this.f335754b.a(this.f335753a.a(t10));
    }

    @Override // org.apache.commons.collections4.functors.p0
    public org.apache.commons.collections4.l0<? super T>[] b() {
        return new org.apache.commons.collections4.l0[]{this.f335754b};
    }

    public org.apache.commons.collections4.w0<? super T, ? extends T> c() {
        return this.f335753a;
    }
}
