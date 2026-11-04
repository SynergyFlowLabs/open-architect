package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class x0<T> implements org.apache.commons.collections4.l0<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335763b = -2407966402920578741L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.w0<? super T, Boolean> f335764a;

    public x0(org.apache.commons.collections4.w0<? super T, Boolean> w0Var) {
        this.f335764a = w0Var;
    }

    public static <T> org.apache.commons.collections4.l0<T> d(org.apache.commons.collections4.w0<? super T, Boolean> w0Var) {
        if (w0Var != null) {
            return new x0(w0Var);
        }
        throw new NullPointerException("The transformer to call must not be null");
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        Boolean boolA = this.f335764a.a(t10);
        if (boolA != null) {
            return boolA.booleanValue();
        }
        throw new org.apache.commons.collections4.q("Transformer must return an instanceof Boolean, it was a null object");
    }

    public org.apache.commons.collections4.w0<? super T, Boolean> c() {
        return this.f335764a;
    }
}
