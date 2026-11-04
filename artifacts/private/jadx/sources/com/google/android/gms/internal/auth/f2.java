package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class f2 extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f107629a;

    f2(Object obj) {
        this.f107629a = obj;
    }

    @Override // com.google.android.gms.internal.auth.e2
    public final Object a() {
        return this.f107629a;
    }

    @Override // com.google.android.gms.internal.auth.e2
    public final boolean b() {
        return true;
    }

    public final boolean equals(@fj.a Object obj) {
        if (obj instanceof f2) {
            return this.f107629a.equals(((f2) obj).f107629a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f107629a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f107629a.toString() + ")";
    }
}
