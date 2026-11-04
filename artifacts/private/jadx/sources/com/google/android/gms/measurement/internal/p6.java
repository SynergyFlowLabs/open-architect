package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o6 f110349a;

    public p6(o6 o6Var) {
        com.google.android.gms.common.internal.w.r(o6Var);
        this.f110349a = o6Var;
    }

    @androidx.annotation.l0
    public final void a(Context context, Intent intent) {
        h7 h7VarO = h7.O(context, null, null);
        w5 w5VarA = h7VarO.a();
        if (intent == null) {
            w5VarA.r().a("Receiver called with null intent");
            return;
        }
        h7VarO.c();
        String action = intent.getAction();
        w5VarA.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                w5VarA.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            w5VarA.w().a("Starting wakeful intent.");
            this.f110349a.a(context, className);
        }
    }
}
