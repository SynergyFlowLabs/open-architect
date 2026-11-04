package com.google.common.base;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
final class a<T> extends e0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final a<Object> f116422b = new a<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f116423c = 0;

    private a() {
    }

    static <T> e0<T> m() {
        return f116422b;
    }

    private Object readResolve() {
        return f116422b;
    }

    @Override // com.google.common.base.e0
    public Set<T> b() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.common.base.e0
    public T d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.e0
    public boolean e() {
        return false;
    }

    @Override // com.google.common.base.e0
    public boolean equals(@fj.a Object object) {
        return object == this;
    }

    @Override // com.google.common.base.e0
    public e0<T> g(e0<? extends T> secondChoice) {
        return (e0) j0.E(secondChoice);
    }

    @Override // com.google.common.base.e0
    public T h(s0<? extends T> s0Var) {
        return (T) j0.F(s0Var.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.google.common.base.e0
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.e0
    public T i(T t10) {
        return (T) j0.F(t10, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.google.common.base.e0
    @fj.a
    public T j() {
        return null;
    }

    @Override // com.google.common.base.e0
    public <V> e0<V> l(t<? super T, V> function) {
        j0.E(function);
        return e0.a();
    }

    @Override // com.google.common.base.e0
    public String toString() {
        return "Optional.absent()";
    }
}
