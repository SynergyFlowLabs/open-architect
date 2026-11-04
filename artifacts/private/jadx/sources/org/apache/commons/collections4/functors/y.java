package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class y<I, O> implements org.apache.commons.collections4.w0<I, O>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335765d = 8069309411242014252L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super I> f335766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.collections4.w0<? super I, ? extends O> f335767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.apache.commons.collections4.w0<? super I, ? extends O> f335768c;

    public y(org.apache.commons.collections4.l0<? super I> l0Var, org.apache.commons.collections4.w0<? super I, ? extends O> w0Var, org.apache.commons.collections4.w0<? super I, ? extends O> w0Var2) {
        this.f335766a = l0Var;
        this.f335767b = w0Var;
        this.f335768c = w0Var2;
    }

    public static <T> org.apache.commons.collections4.w0<T, T> e(org.apache.commons.collections4.l0<? super T> l0Var, org.apache.commons.collections4.w0<? super T, ? extends T> w0Var) {
        if (l0Var == null) {
            throw new NullPointerException("Predicate must not be null");
        }
        if (w0Var != null) {
            return new y(l0Var, w0Var, f0.b());
        }
        throw new NullPointerException("Transformer must not be null");
    }

    public static <I, O> org.apache.commons.collections4.w0<I, O> f(org.apache.commons.collections4.l0<? super I> l0Var, org.apache.commons.collections4.w0<? super I, ? extends O> w0Var, org.apache.commons.collections4.w0<? super I, ? extends O> w0Var2) {
        if (l0Var == null) {
            throw new NullPointerException("Predicate must not be null");
        }
        if (w0Var == null || w0Var2 == null) {
            throw new NullPointerException("Transformers must not be null");
        }
        return new y(l0Var, w0Var, w0Var2);
    }

    @Override // org.apache.commons.collections4.w0
    public O a(I i10) {
        return this.f335766a.a(i10) ? this.f335767b.a(i10) : this.f335768c.a(i10);
    }

    public org.apache.commons.collections4.w0<? super I, ? extends O> b() {
        return this.f335768c;
    }

    public org.apache.commons.collections4.l0<? super I> c() {
        return this.f335766a;
    }

    public org.apache.commons.collections4.w0<? super I, ? extends O> d() {
        return this.f335767b;
    }
}
