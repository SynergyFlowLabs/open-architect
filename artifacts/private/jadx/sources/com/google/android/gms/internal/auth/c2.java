package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class c2 extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final c2 f107609a = new c2();

    private c2() {
    }

    @Override // com.google.android.gms.internal.auth.e2
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.auth.e2
    public final boolean b() {
        return false;
    }

    public final boolean equals(@fj.a Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
