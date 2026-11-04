package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class je implements v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.e2 f110129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f110130b;

    je(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.e2 e2Var) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f110130b = appMeasurementDynamiteService;
        this.f110129a = e2Var;
    }

    @Override // com.google.android.gms.measurement.internal.v8
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f110129a.s1(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            h7 h7Var = this.f110130b.f109725a;
            if (h7Var != null) {
                h7Var.a().r().b("Event interceptor threw exception", e10);
            }
        }
    }
}
