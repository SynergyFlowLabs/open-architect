package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.jc;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
final class m1 extends jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final t f89193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r2 f89194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f89195c;

    /* synthetic */ m1(t tVar, r2 r2Var, int i10, v1 v1Var) {
        this.f89193a = tVar;
        this.f89194b = r2Var;
        this.f89195c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void a(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            r2 r2Var = this.f89194b;
            n nVar = t2.f89252k;
            r2Var.f(q2.b(95, 24, nVar), this.f89195c);
            this.f89193a.a(nVar, null);
            return;
        }
        int iB = com.google.android.gms.internal.play_billing.p3.b(bundle, "BillingClient");
        n nVarA = t2.a(iB, com.google.android.gms.internal.play_billing.p3.h(bundle, "BillingClient"));
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iB);
            this.f89194b.f(q2.b(23, 24, nVarA), this.f89195c);
            this.f89193a.a(nVarA, null);
            return;
        }
        try {
            this.f89193a.a(nVarA, new s(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException e10) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e10);
            r2 r2Var2 = this.f89194b;
            n nVar2 = t2.f89252k;
            r2Var2.f(q2.b(104, 24, nVar2), this.f89195c);
            this.f89193a.a(nVar2, null);
        }
    }
}
