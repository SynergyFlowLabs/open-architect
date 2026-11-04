package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class nc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ rc f110295a;

    nc(rc rcVar) {
        Objects.requireNonNull(rcVar);
        this.f110295a = rcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc xcVar = this.f110295a.f110454c;
        h7 h7Var = xcVar.f110184a;
        Context contextD = h7Var.d();
        h7Var.c();
        xcVar.K(new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
