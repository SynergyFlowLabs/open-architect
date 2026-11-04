package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f109243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f109244b;

    o6(Object obj, int i10) {
        this.f109243a = obj;
        this.f109244b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return this.f109243a == o6Var.f109243a && this.f109244b == o6Var.f109244b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f109243a) * 65535) + this.f109244b;
    }
}
