package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes4.dex */
final class s3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q3 f106200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t3 f106201b;

    s3(t3 t3Var, q3 q3Var) {
        this.f106201b = t3Var;
        this.f106200a = q3Var;
    }

    @Override // java.lang.Runnable
    @androidx.annotation.l0
    public final void run() {
        if (this.f106201b.f106206b) {
            ConnectionResult connectionResultB = this.f106200a.b();
            if (connectionResultB.e2()) {
                t3 t3Var = this.f106201b;
                t3Var.f106121a.startActivityForResult(GoogleApiActivity.a(t3Var.b(), (PendingIntent) com.google.android.gms.common.internal.w.r(connectionResultB.b2()), this.f106200a.a(), false), 1);
                return;
            }
            t3 t3Var2 = this.f106201b;
            if (t3Var2.f106209e.e(t3Var2.b(), connectionResultB.O1(), null) != null) {
                t3 t3Var3 = this.f106201b;
                t3Var3.f106209e.L(t3Var3.b(), t3Var3.f106121a, connectionResultB.O1(), 2, this.f106201b);
                return;
            }
            if (connectionResultB.O1() != 18) {
                this.f106201b.m(connectionResultB, this.f106200a.a());
                return;
            }
            t3 t3Var4 = this.f106201b;
            Dialog dialogG = t3Var4.f106209e.G(t3Var4.b(), t3Var4);
            t3 t3Var5 = this.f106201b;
            t3Var5.f106209e.H(t3Var5.b().getApplicationContext(), new r3(this, dialogG));
        }
    }
}
