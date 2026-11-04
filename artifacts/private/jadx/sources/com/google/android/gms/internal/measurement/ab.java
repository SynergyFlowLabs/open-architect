package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f108278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f108279b;

    ab(Object obj, int i10) {
        this.f108278a = obj;
        this.f108279b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return this.f108278a == abVar.f108278a && this.f108279b == abVar.f108279b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f108278a) * 65535) + this.f108279b;
    }
}
