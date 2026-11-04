package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class cc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f109858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ xc f109859b;

    cc(xc xcVar, zzr zzrVar) {
        this.f109858a = zzrVar;
        Objects.requireNonNull(xcVar);
        this.f109859b = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc xcVar = this.f109859b;
        d5 d5VarN = xcVar.N();
        if (d5VarN == null) {
            xcVar.f110184a.a().o().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzr zzrVar = this.f109858a;
            com.google.android.gms.common.internal.w.r(zzrVar);
            d5VarN.y3(zzrVar);
            xcVar.J();
        } catch (RemoteException e10) {
            this.f109859b.f110184a.a().o().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
