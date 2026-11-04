package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.aa;
import com.google.android.gms.internal.play_billing.gb;
import com.google.android.gms.internal.play_billing.ia;
import com.google.android.gms.internal.play_billing.ib;
import com.google.android.gms.internal.play_billing.ob;
import com.google.android.gms.internal.play_billing.pa;
import com.google.android.gms.internal.play_billing.ra;
import com.google.android.gms.internal.play_billing.sb;
import com.google.android.gms.internal.play_billing.v9;

/* JADX INFO: loaded from: classes3.dex */
final class v2 implements r2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ra f89278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x2 f89279c;

    v2(Context context, ra raVar) {
        this.f89279c = new x2(context);
        this.f89278b = raVar;
    }

    @Override // com.android.billingclient.api.r2
    public final void a(ia iaVar) {
        try {
            gb gbVarJ = ib.J();
            gbVarJ.u(this.f89278b);
            gbVarJ.t(iaVar);
            this.f89279c.a((ib) gbVarJ.n());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.r2
    public final void b(ob obVar) {
        try {
            x2 x2Var = this.f89279c;
            gb gbVarJ = ib.J();
            gbVarJ.u(this.f89278b);
            gbVarJ.v(obVar);
            x2Var.a((ib) gbVarJ.n());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.r2
    public final void c(@androidx.annotation.p0 sb sbVar) {
        if (sbVar == null) {
            return;
        }
        try {
            gb gbVarJ = ib.J();
            gbVarJ.u(this.f89278b);
            gbVarJ.w(sbVar);
            this.f89279c.a((ib) gbVarJ.n());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.r2
    public final void d(@androidx.annotation.p0 v9 v9Var) {
        if (v9Var == null) {
            return;
        }
        try {
            gb gbVarJ = ib.J();
            gbVarJ.u(this.f89278b);
            gbVarJ.r(v9Var);
            this.f89279c.a((ib) gbVarJ.n());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.r2
    public final void e(@androidx.annotation.p0 aa aaVar, int i10) {
        try {
            pa paVar = (pa) this.f89278b.p();
            paVar.r(i10);
            this.f89278b = (ra) paVar.n();
            g(aaVar);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.r2
    public final void f(@androidx.annotation.p0 v9 v9Var, int i10) {
        try {
            pa paVar = (pa) this.f89278b.p();
            paVar.r(i10);
            this.f89278b = (ra) paVar.n();
            d(v9Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.r2
    public final void g(@androidx.annotation.p0 aa aaVar) {
        if (aaVar == null) {
            return;
        }
        try {
            gb gbVarJ = ib.J();
            gbVarJ.u(this.f89278b);
            gbVarJ.s(aaVar);
            this.f89279c.a((ib) gbVarJ.n());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to log.", th2);
        }
    }
}
