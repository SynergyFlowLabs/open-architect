package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class yb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ eb f110734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ xc f110735b;

    yb(xc xcVar, eb ebVar) {
        this.f110734a = ebVar;
        Objects.requireNonNull(xcVar);
        this.f110735b = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc xcVar = this.f110735b;
        d5 d5VarN = xcVar.N();
        if (d5VarN == null) {
            xcVar.f110184a.a().o().a("Failed to send current screen to service");
            return;
        }
        try {
            eb ebVar = this.f110734a;
            if (ebVar == null) {
                int i10 = 7 ^ 0;
                d5VarN.b6(0L, null, null, xcVar.f110184a.d().getPackageName());
            } else {
                d5VarN.b6(ebVar.f109924c, ebVar.f109922a, ebVar.f109923b, xcVar.f110184a.d().getPackageName());
            }
            xcVar.J();
        } catch (RemoteException e10) {
            this.f110735b.f110184a.a().o().b("Failed to send current screen to the service", e10);
        }
    }
}
