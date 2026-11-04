package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ec implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f109928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f109929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzbg f109930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ xc f109931d;

    ec(xc xcVar, boolean z10, zzr zzrVar, boolean z11, zzbg zzbgVar, String str) {
        this.f109928a = zzrVar;
        this.f109929b = z11;
        this.f109930c = zzbgVar;
        Objects.requireNonNull(xcVar);
        this.f109931d = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc xcVar = this.f109931d;
        d5 d5VarN = xcVar.N();
        if (d5VarN == null) {
            xcVar.f110184a.a().o().a("Discarding data. Failed to send event to service");
            return;
        }
        zzr zzrVar = this.f109928a;
        com.google.android.gms.common.internal.w.r(zzrVar);
        xcVar.b0(d5VarN, this.f109929b ? null : this.f109930c, zzrVar);
        xcVar.J();
    }
}
