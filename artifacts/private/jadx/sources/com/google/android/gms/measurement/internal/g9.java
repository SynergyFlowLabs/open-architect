package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class g9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.x1 f109984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f109985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f109986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f109987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f109988e;

    g9(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2, boolean z10) {
        this.f109984a = x1Var;
        this.f109985b = str;
        this.f109986c = str2;
        this.f109987d = z10;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f109988e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f109988e.f109725a.J().h0(this.f109984a, this.f109985b, this.f109986c, this.f109987d);
    }
}
