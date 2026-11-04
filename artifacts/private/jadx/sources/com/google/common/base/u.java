package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
final class u<F, T> extends m<F> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f116689c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t<? super F, ? extends T> f116690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m<T> f116691b;

    u(t<? super F, ? extends T> function, m<T> resultEquivalence) {
        this.f116690a = (t) j0.E(function);
        this.f116691b = (m) j0.E(resultEquivalence);
    }

    @Override // com.google.common.base.m
    protected boolean a(F f10, F f11) {
        return this.f116691b.d(this.f116690a.apply(f10), this.f116690a.apply(f11));
    }

    @Override // com.google.common.base.m
    protected int b(F f10) {
        return this.f116691b.f(this.f116690a.apply(f10));
    }

    public boolean equals(@fj.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f116690a.equals(uVar.f116690a) && this.f116691b.equals(uVar.f116691b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return d0.b(this.f116690a, this.f116691b);
    }

    public String toString() {
        return this.f116691b + ".onResultOf(" + this.f116690a + ")";
    }
}
