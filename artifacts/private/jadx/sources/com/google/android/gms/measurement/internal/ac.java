package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ac implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzbg f109754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f109755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.x1 f109756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ xc f109757d;

    ac(xc xcVar, zzbg zzbgVar, String str, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f109754a = zzbgVar;
        this.f109755b = str;
        this.f109756c = x1Var;
        Objects.requireNonNull(xcVar);
        this.f109757d = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ze zeVarC;
        byte[] bArrG3 = null;
        try {
            try {
                xc xcVar = this.f109757d;
                d5 d5VarN = xcVar.N();
                if (d5VarN == null) {
                    h7 h7Var = xcVar.f110184a;
                    h7Var.a().o().a("Discarding data. Failed to send event to service to bundle");
                    zeVarC = h7Var.C();
                    x1Var = this.f109756c;
                } else {
                    bArrG3 = d5VarN.G3(this.f109754a, this.f109755b);
                    xcVar.J();
                    xc xcVar2 = this.f109757d;
                    x1Var = this.f109756c;
                    zeVarC = xcVar2.f110184a.C();
                }
            } catch (RemoteException e10) {
                this.f109757d.f110184a.a().o().b("Failed to send event to the service to bundle", e10);
            }
            zeVarC.d0(x1Var, bArrG3);
        } catch (Throwable th2) {
            xc xcVar3 = this.f109757d;
            xcVar3.f110184a.C().d0(this.f109756c, null);
            throw th2;
        }
    }
}
