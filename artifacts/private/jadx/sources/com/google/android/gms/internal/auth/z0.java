package com.google.android.gms.internal.auth;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class z0 extends x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f107888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g2 f107889b;

    z0(Context context, @fj.h g2 g2Var) {
        this.f107888a = context;
        this.f107889b = g2Var;
    }

    @Override // com.google.android.gms.internal.auth.x1
    final Context a() {
        return this.f107888a;
    }

    @Override // com.google.android.gms.internal.auth.x1
    @fj.h
    final g2 b() {
        return this.f107889b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x1 x1Var = (x1) obj;
            if (this.f107888a.equals(x1Var.a()) && this.f107889b.equals(x1Var.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f107889b.hashCode() ^ ((this.f107888a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f107888a.toString() + ", hermeticFileOverrides=" + this.f107889b.toString() + "}";
    }
}
