package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f110822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzbe f110823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f110824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ xc f110825e;

    zb(xc xcVar, boolean z10, zzr zzrVar, boolean z11, zzbe zzbeVar, Bundle bundle) {
        this.f110821a = zzrVar;
        this.f110822b = z11;
        this.f110823c = zzbeVar;
        this.f110824d = bundle;
        Objects.requireNonNull(xcVar);
        this.f110825e = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc xcVar = this.f110825e;
        d5 d5VarN = xcVar.N();
        if (d5VarN == null) {
            xcVar.f110184a.a().o().a("Failed to send default event parameters to service");
            return;
        }
        if (xcVar.f110184a.w().H(null, z4.f110753c1)) {
            zzr zzrVar = this.f110821a;
            com.google.android.gms.common.internal.w.r(zzrVar);
            this.f110825e.b0(d5VarN, this.f110822b ? null : this.f110823c, zzrVar);
            return;
        }
        try {
            zzr zzrVar2 = this.f110821a;
            com.google.android.gms.common.internal.w.r(zzrVar2);
            d5VarN.z7(this.f110824d, zzrVar2);
            xcVar.J();
        } catch (RemoteException e10) {
            this.f110825e.f110184a.a().o().b("Failed to send default event parameters to service", e10);
        }
    }
}
