package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.hc;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
final class l1 extends hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final g f89153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r2 f89154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f89155c;

    /* synthetic */ l1(g gVar, r2 r2Var, int i10, v1 v1Var) {
        this.f89153a = gVar;
        this.f89154b = r2Var;
        this.f89155c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.ic
    public final void a(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            r2 r2Var = this.f89154b;
            n nVar = t2.f89252k;
            r2Var.f(q2.b(71, 15, nVar), this.f89155c);
            this.f89153a.a(nVar, null);
            return;
        }
        int iB = com.google.android.gms.internal.play_billing.p3.b(bundle, "BillingClient");
        n nVarA = t2.a(iB, com.google.android.gms.internal.play_billing.p3.h(bundle, "BillingClient"));
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + iB);
            this.f89154b.f(q2.b(23, 15, nVarA), this.f89155c);
            this.f89153a.a(nVarA, null);
            return;
        }
        try {
            this.f89153a.a(nVarA, new f(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException e10) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e10);
            r2 r2Var2 = this.f89154b;
            n nVar2 = t2.f89252k;
            r2Var2.f(q2.b(72, 15, nVar2), this.f89155c);
            this.f89153a.a(nVar2, null);
        }
    }
}
