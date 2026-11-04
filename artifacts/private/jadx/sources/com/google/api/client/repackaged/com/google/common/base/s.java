package com.google.api.client.repackaged.com.google.common.base;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@r7.b
final class s<T> extends n<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f115910c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f115911b;

    s(T t10) {
        this.f115911b = t10;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public Set<T> b() {
        return Collections.singleton(this.f115911b);
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public T d() {
        return this.f115911b;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public boolean e() {
        return true;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public boolean equals(@fj.h Object obj) {
        if (obj instanceof s) {
            return this.f115911b.equals(((s) obj).f115911b);
        }
        return false;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public n<T> g(n<? extends T> nVar) {
        q.E(nVar);
        return this;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public T h(w<? extends T> wVar) {
        q.E(wVar);
        return this.f115911b;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public int hashCode() {
        return this.f115911b.hashCode() + 1502476572;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public T i(T t10) {
        q.F(t10, "use Optional.orNull() instead of Optional.or(null)");
        return this.f115911b;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public T j() {
        return this.f115911b;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public <V> n<V> l(i<? super T, V> iVar) {
        return new s(q.F(iVar.apply(this.f115911b), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.n
    public String toString() {
        return "Optional.of(" + this.f115911b + ")";
    }
}
