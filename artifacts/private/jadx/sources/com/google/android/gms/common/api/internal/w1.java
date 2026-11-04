package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
final class w1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConnectionResult f106247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ x1 f106248b;

    w1(x1 x1Var, ConnectionResult connectionResult) {
        this.f106247a = connectionResult;
        this.f106248b = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x1 x1Var = this.f106248b;
        u1 u1Var = (u1) x1Var.f106255f.f106060j.get(x1Var.f106251b);
        if (u1Var == null) {
            return;
        }
        if (!this.f106247a.f2()) {
            u1Var.I(this.f106247a, null);
            return;
        }
        this.f106248b.f106254e = true;
        if (this.f106248b.f106250a.h()) {
            this.f106248b.i();
            return;
        }
        try {
            x1 x1Var2 = this.f106248b;
            x1Var2.f106250a.k(null, x1Var2.f106250a.j());
        } catch (SecurityException unused) {
            this.f106248b.f106250a.e("Failed to get service from broker.");
            u1Var.I(new ConnectionResult(10), null);
        }
    }
}
