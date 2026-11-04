package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class af implements w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.e2 f109760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f109761b;

    af(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.e2 e2Var) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f109761b = appMeasurementDynamiteService;
        this.f109760a = e2Var;
    }

    @Override // com.google.android.gms.measurement.internal.w8
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f109760a.s1(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            h7 h7Var = this.f109761b.f109725a;
            if (h7Var != null) {
                h7Var.a().r().b("Event listener threw exception", e10);
            }
        }
    }
}
