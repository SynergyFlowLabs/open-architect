package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class f8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.x1 f109951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzbg f109952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f109953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f109954d;

    f8(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var, zzbg zzbgVar, String str) {
        this.f109951a = x1Var;
        this.f109952b = zzbgVar;
        this.f109953c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f109954d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f109954d.f109725a.J().B(this.f109951a, this.f109952b, this.f109953c);
    }
}
