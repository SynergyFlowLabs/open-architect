package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class c<T> implements p0<T>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335663c = 4189014213763186912L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super T> f335664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super T> f335665b;

    public c(org.apache.commons.collections4.l0<? super T> l0Var, org.apache.commons.collections4.l0<? super T> l0Var2) {
        this.f335664a = l0Var;
        this.f335665b = l0Var2;
    }

    public static <T> org.apache.commons.collections4.l0<T> c(org.apache.commons.collections4.l0<? super T> l0Var, org.apache.commons.collections4.l0<? super T> l0Var2) {
        if (l0Var == null || l0Var2 == null) {
            throw new NullPointerException("Predicate must not be null");
        }
        return new c(l0Var, l0Var2);
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        return this.f335664a.a(t10) && this.f335665b.a(t10);
    }

    @Override // org.apache.commons.collections4.functors.p0
    public org.apache.commons.collections4.l0<? super T>[] b() {
        return new org.apache.commons.collections4.l0[]{this.f335664a, this.f335665b};
    }
}
