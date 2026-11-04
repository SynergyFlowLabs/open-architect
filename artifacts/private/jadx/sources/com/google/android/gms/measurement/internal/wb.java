package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class wb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ xc f110647b;

    wb(xc xcVar, zzr zzrVar) {
        this.f110646a = zzrVar;
        Objects.requireNonNull(xcVar);
        this.f110647b = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc xcVar = this.f110647b;
        d5 d5VarN = xcVar.N();
        if (d5VarN == null) {
            xcVar.f110184a.a().r().a("Failed to send app backgrounded");
            return;
        }
        try {
            zzr zzrVar = this.f110646a;
            com.google.android.gms.common.internal.w.r(zzrVar);
            d5VarN.Fe(zzrVar);
            xcVar.J();
        } catch (RemoteException e10) {
            this.f110647b.f110184a.a().o().b("Failed to send app backgrounded to the service", e10);
        }
    }
}
