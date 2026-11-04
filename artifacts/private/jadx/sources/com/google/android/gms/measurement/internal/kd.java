package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jd f110198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pd f110199b;

    kd(pd pdVar) {
        Objects.requireNonNull(pdVar);
        this.f110199b = pdVar;
    }

    @androidx.annotation.m1
    final void a() {
        pd pdVar = this.f110199b;
        pdVar.h();
        jd jdVar = this.f110198a;
        if (jdVar != null) {
            pdVar.t().removeCallbacks(jdVar);
        }
        h7 h7Var = pdVar.f110184a;
        h7Var.x().f110175t.b(false);
        pdVar.o(false);
        if (h7Var.w().H(null, z4.U0)) {
            h7 h7Var2 = pdVar.f110184a;
            if (h7Var2.B().w0()) {
                h7Var.a().w().a("Retrying trigger URI registration in foreground");
                h7Var2.B().y0();
            }
        }
    }

    @androidx.annotation.m1
    final void b(long j10) {
        pd pdVar = this.f110199b;
        this.f110198a = new jd(this, pdVar.f110184a.e().currentTimeMillis(), j10);
        pdVar.t().postDelayed(this.f110198a, 2000L);
    }
}
