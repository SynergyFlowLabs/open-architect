package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ha implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ je f110050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f110051b;

    ha(AppMeasurementDynamiteService appMeasurementDynamiteService, je jeVar) {
        this.f110050a = jeVar;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f110051b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110051b.f109725a.B().J(this.f110050a);
    }
}
