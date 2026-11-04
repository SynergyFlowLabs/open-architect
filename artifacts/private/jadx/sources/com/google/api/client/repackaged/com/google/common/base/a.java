package com.google.api.client.repackaged.com.google.common.base;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@r7.b
final class a<T> extends n<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final a<Object> f115795b = new a<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f115796c = 0;

    private a() {
    }

    static <T> n<T> m() {
        return f115795b;
    }

    private Object readResolve() {
        return f115795b;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public Set<T> b() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public T d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public boolean e() {
        return false;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public boolean equals(@fj.h Object obj) {
        return obj == this;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public n<T> g(n<? extends T> nVar) {
        return (n) q.E(nVar);
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public T h(w<? extends T> wVar) {
        return (T) q.F(wVar.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public T i(T t10) {
        return (T) q.F(t10, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    @fj.h
    public T j() {
        return null;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public <V> n<V> l(i<? super T, V> iVar) {
        q.E(iVar);
        return n.a();
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public String toString() {
        return "Optional.absent()";
    }
}
