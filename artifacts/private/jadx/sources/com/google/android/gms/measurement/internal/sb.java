package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class sb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ xc f110485b;

    sb(xc xcVar, zzr zzrVar) {
        this.f110484a = zzrVar;
        Objects.requireNonNull(xcVar);
        this.f110485b = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc xcVar = this.f110485b;
        d5 d5VarN = xcVar.N();
        if (d5VarN == null) {
            xcVar.f110184a.a().o().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            zzr zzrVar = this.f110484a;
            com.google.android.gms.common.internal.w.r(zzrVar);
            d5VarN.e6(zzrVar);
        } catch (RemoteException e10) {
            this.f110485b.f110184a.a().o().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f110485b.J();
    }
}
