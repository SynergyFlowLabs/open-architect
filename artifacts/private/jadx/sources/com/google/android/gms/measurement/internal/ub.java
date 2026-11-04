package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ub implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.x1 f110587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ xc f110588c;

    ub(xc xcVar, zzr zzrVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f110586a = zzrVar;
        this.f110587b = x1Var;
        Objects.requireNonNull(xcVar);
        this.f110588c = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ze zeVarC;
        String strZ4 = null;
        try {
            try {
                xc xcVar = this.f110588c;
                h7 h7Var = xcVar.f110184a;
                if (h7Var.x().w().o(q8.ANALYTICS_STORAGE)) {
                    d5 d5VarN = xcVar.N();
                    if (d5VarN != null) {
                        zzr zzrVar = this.f110586a;
                        com.google.android.gms.common.internal.w.r(zzrVar);
                        strZ4 = d5VarN.Z4(zzrVar);
                        if (strZ4 != null) {
                            xcVar.f110184a.B().F(strZ4);
                            h7Var.x().f110163h.b(strZ4);
                        }
                        xcVar.J();
                        xc xcVar2 = this.f110588c;
                        x1Var = this.f110587b;
                        zeVarC = xcVar2.f110184a.C();
                        zeVarC.a0(x1Var, strZ4);
                    }
                    h7Var.a().o().a("Failed to get app instance id");
                } else {
                    h7Var.a().t().a("Analytics storage consent denied; will not get app instance id");
                    xcVar.f110184a.B().F(null);
                    h7Var.x().f110163h.b(null);
                }
                zeVarC = h7Var.C();
                x1Var = this.f110587b;
            } catch (RemoteException e10) {
                this.f110588c.f110184a.a().o().b("Failed to get app instance id", e10);
            }
            zeVarC.a0(x1Var, strZ4);
        } catch (Throwable th2) {
            xc xcVar3 = this.f110588c;
            xcVar3.f110184a.C().a0(this.f110587b, null);
            throw th2;
        }
    }
}
