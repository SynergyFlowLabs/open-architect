package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class kb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.x1 f110192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f110194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f110195d;

    kb(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2) {
        this.f110192a = x1Var;
        this.f110193b = str;
        this.f110194c = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f110195d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110195d.f109725a.J().f0(this.f110192a, this.f110193b, this.f110194c);
    }
}
