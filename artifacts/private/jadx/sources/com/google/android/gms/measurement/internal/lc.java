package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class lc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.x1 f110235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f110236b;

    lc(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f110235a = x1Var;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f110236b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f110236b;
        appMeasurementDynamiteService.f109725a.C().e0(this.f110235a, appMeasurementDynamiteService.f109725a.f());
    }
}
