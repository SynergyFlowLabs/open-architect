package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class hc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzr f110055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.x1 f110056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ xc f110057e;

    hc(xc xcVar, String str, String str2, zzr zzrVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f110053a = str;
        this.f110054b = str2;
        this.f110055c = zzrVar;
        this.f110056d = x1Var;
        Objects.requireNonNull(xcVar);
        this.f110057e = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ze zeVarC;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                xc xcVar = this.f110057e;
                d5 d5VarN = xcVar.N();
                if (d5VarN == null) {
                    h7 h7Var = xcVar.f110184a;
                    h7Var.a().o().c("Failed to get conditional properties; not connected to service", this.f110053a, this.f110054b);
                    zeVarC = h7Var.C();
                    x1Var = this.f110056d;
                } else {
                    zzr zzrVar = this.f110055c;
                    com.google.android.gms.common.internal.w.r(zzrVar);
                    arrayList = ze.h0(d5VarN.v8(this.f110053a, this.f110054b, zzrVar));
                    xcVar.J();
                    xc xcVar2 = this.f110057e;
                    x1Var = this.f110056d;
                    zeVarC = xcVar2.f110184a.C();
                }
            } catch (RemoteException e10) {
                this.f110057e.f110184a.a().o().d("Failed to get conditional properties; remote exception", this.f110053a, this.f110054b, e10);
            }
            zeVarC.g0(x1Var, arrayList);
        } catch (Throwable th2) {
            xc xcVar3 = this.f110057e;
            xcVar3.f110184a.C().g0(this.f110056d, arrayList);
            throw th2;
        }
    }
}
