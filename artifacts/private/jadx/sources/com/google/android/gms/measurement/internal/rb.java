package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class rb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f110449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzpl f110450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ xc f110451d;

    rb(xc xcVar, zzr zzrVar, boolean z10, zzpl zzplVar) {
        this.f110448a = zzrVar;
        this.f110449b = z10;
        this.f110450c = zzplVar;
        Objects.requireNonNull(xcVar);
        this.f110451d = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc xcVar = this.f110451d;
        d5 d5VarN = xcVar.N();
        if (d5VarN == null) {
            xcVar.f110184a.a().o().a("Discarding data. Failed to set user property");
            return;
        }
        zzr zzrVar = this.f110448a;
        com.google.android.gms.common.internal.w.r(zzrVar);
        xcVar.b0(d5VarN, this.f110449b ? null : this.f110450c, zzrVar);
        xcVar.J();
    }
}
