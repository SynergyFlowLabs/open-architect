package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
final class o1 extends com.google.android.gms.internal.play_billing.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final l f89211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r2 f89212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f89213c;

    /* synthetic */ o1(l lVar, r2 r2Var, int i10, v1 v1Var) {
        this.f89211a = lVar;
        this.f89212b = r2Var;
        this.f89213c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final void a(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            r2 r2Var = this.f89212b;
            n nVar = t2.f89252k;
            r2Var.f(q2.b(63, 13, nVar), this.f89213c);
            this.f89211a.a(nVar, null);
            return;
        }
        int iB = com.google.android.gms.internal.play_billing.p3.b(bundle, "BillingClient");
        String strH = com.google.android.gms.internal.play_billing.p3.h(bundle, "BillingClient");
        n.a aVarC = n.c();
        aVarC.c(iB);
        aVarC.b(strH);
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "getBillingConfig() failed. Response code: " + iB);
            n nVarA = aVarC.a();
            this.f89212b.f(q2.b(23, 13, nVarA), this.f89213c);
            this.f89211a.a(nVarA, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            aVarC.c(6);
            n nVarA2 = aVarC.a();
            this.f89212b.f(q2.b(64, 13, nVarA2), this.f89213c);
            this.f89211a.a(nVarA2, null);
            return;
        }
        try {
            this.f89211a.a(aVarC.a(), new k(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e10) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e10);
            r2 r2Var2 = this.f89212b;
            n nVar2 = t2.f89252k;
            r2Var2.f(q2.b(65, 13, nVar2), this.f89213c);
            this.f89211a.a(nVar2, null);
        }
    }
}
