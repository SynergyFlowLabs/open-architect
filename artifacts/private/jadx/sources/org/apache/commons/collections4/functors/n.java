package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class n<T> implements org.apache.commons.collections4.l0<T>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335716c = 5633766978029907089L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f335717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.collections4.m<T> f335718b;

    public n(T t10) {
        this(t10, null);
    }

    public static <T> org.apache.commons.collections4.l0<T> c(T t10) {
        return t10 == null ? m0.c() : new n(t10);
    }

    public static <T> org.apache.commons.collections4.l0<T> d(T t10, org.apache.commons.collections4.m<T> mVar) {
        return t10 == null ? m0.c() : new n(t10, mVar);
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        org.apache.commons.collections4.m<T> mVar = this.f335718b;
        return mVar != null ? mVar.b(this.f335717a, t10) : this.f335717a.equals(t10);
    }

    public Object e() {
        return this.f335717a;
    }

    public n(T t10, org.apache.commons.collections4.m<T> mVar) {
        this.f335717a = t10;
        this.f335718b = mVar;
    }
}
