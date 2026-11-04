package com.google.common.base;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
final class m0<T> extends e0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f116594c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f116595b;

    m0(T reference) {
        this.f116595b = reference;
    }

    @Override // com.google.common.base.e0
    public Set<T> b() {
        return Collections.singleton(this.f116595b);
    }

    @Override // com.google.common.base.e0
    public T d() {
        return this.f116595b;
    }

    @Override // com.google.common.base.e0
    public boolean e() {
        return true;
    }

    @Override // com.google.common.base.e0
    public boolean equals(@fj.a Object object) {
        if (object instanceof m0) {
            return this.f116595b.equals(((m0) object).f116595b);
        }
        return false;
    }

    @Override // com.google.common.base.e0
    public e0<T> g(e0<? extends T> secondChoice) {
        j0.E(secondChoice);
        return this;
    }

    @Override // com.google.common.base.e0
    public T h(s0<? extends T> supplier) {
        j0.E(supplier);
        return this.f116595b;
    }

    @Override // com.google.common.base.e0
    public int hashCode() {
        return this.f116595b.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.e0
    public T i(T defaultValue) {
        j0.F(defaultValue, "use Optional.orNull() instead of Optional.or(null)");
        return this.f116595b;
    }

    @Override // com.google.common.base.e0
    public T j() {
        return this.f116595b;
    }

    @Override // com.google.common.base.e0
    public <V> e0<V> l(t<? super T, V> tVar) {
        return new m0(j0.F(tVar.apply(this.f116595b), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.common.base.e0
    public String toString() {
        return "Optional.of(" + this.f116595b + ")";
    }
}
