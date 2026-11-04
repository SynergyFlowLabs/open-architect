package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class dc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f109892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ xc f109893b;

    dc(xc xcVar, zzr zzrVar) {
        this.f109892a = zzrVar;
        Objects.requireNonNull(xcVar);
        this.f109893b = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc xcVar = this.f109893b;
        d5 d5VarN = xcVar.N();
        if (d5VarN == null) {
            xcVar.f110184a.a().o().a("Failed to send consent settings to service");
            return;
        }
        try {
            zzr zzrVar = this.f109892a;
            com.google.android.gms.common.internal.w.r(zzrVar);
            d5VarN.I8(zzrVar);
            xcVar.J();
        } catch (RemoteException e10) {
            this.f109893b.f110184a.a().o().b("Failed to send consent settings to the service", e10);
        }
    }
}
