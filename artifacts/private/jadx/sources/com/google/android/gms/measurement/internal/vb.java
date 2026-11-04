package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class vb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ xc f110608b;

    vb(xc xcVar, zzr zzrVar, boolean z10) {
        this.f110607a = zzrVar;
        Objects.requireNonNull(xcVar);
        this.f110608b = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc xcVar = this.f110608b;
        d5 d5VarN = xcVar.N();
        if (d5VarN == null) {
            xcVar.f110184a.a().o().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.f110607a;
            com.google.android.gms.common.internal.w.r(zzrVar);
            h7 h7Var = xcVar.f110184a;
            k kVarW = h7Var.w();
            y4 y4Var = z4.f110753c1;
            if (kVarW.H(null, y4Var)) {
                xcVar.b0(d5VarN, null, zzrVar);
            }
            d5VarN.ke(zzrVar);
            xcVar.f110184a.E().v();
            h7Var.w().H(null, y4Var);
            xcVar.b0(d5VarN, null, zzrVar);
            xcVar.J();
        } catch (RemoteException e10) {
            this.f110608b.f110184a.a().o().b("Failed to send app launch to the service", e10);
        }
    }
}
