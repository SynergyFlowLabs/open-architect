package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class fc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f109962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f109963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzah f109964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ xc f109965d;

    fc(xc xcVar, boolean z10, zzr zzrVar, boolean z11, zzah zzahVar, zzah zzahVar2) {
        this.f109962a = zzrVar;
        this.f109963b = z11;
        this.f109964c = zzahVar;
        Objects.requireNonNull(xcVar);
        this.f109965d = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc xcVar = this.f109965d;
        d5 d5VarN = xcVar.N();
        if (d5VarN == null) {
            xcVar.f110184a.a().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        zzr zzrVar = this.f109962a;
        com.google.android.gms.common.internal.w.r(zzrVar);
        xcVar.b0(d5VarN, this.f109963b ? null : this.f109964c, zzrVar);
        xcVar.J();
    }
}
