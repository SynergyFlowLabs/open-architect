package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final h7 f110284a;

    n6(qe qeVar) {
        this.f110284a = qeVar.g0();
    }

    @androidx.annotation.l1
    final boolean a() {
        try {
            h7 h7Var = this.f110284a;
            com.google.android.gms.common.wrappers.c cVarA = com.google.android.gms.common.wrappers.d.a(h7Var.d());
            if (cVarA != null) {
                return cVarA.f("com.android.vending", 128).versionCode >= 80837300;
            }
            h7Var.a().w().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f110284a.a().w().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
