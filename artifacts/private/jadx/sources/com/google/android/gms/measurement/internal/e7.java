package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class e7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.x1 f109909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f109910b;

    e7(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f109909a = x1Var;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f109910b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f109910b.f109725a.J().r(this.f109909a);
    }
}
