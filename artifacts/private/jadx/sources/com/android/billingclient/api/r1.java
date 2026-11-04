package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class r1 extends com.google.android.gms.internal.play_billing.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final q f89226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r2 f89227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f89228c;

    /* synthetic */ r1(q qVar, r2 r2Var, int i10, v1 v1Var) {
        this.f89226a = qVar;
        this.f89227b = r2Var;
        this.f89228c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.l
    public final void a(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            r2 r2Var = this.f89227b;
            n nVar = t2.f89252k;
            r2Var.f(q2.b(92, 23, nVar), this.f89228c);
            this.f89226a.a(nVar);
            return;
        }
        int iB = com.google.android.gms.internal.play_billing.p3.b(bundle, "BillingClient");
        n nVarA = t2.a(iB, com.google.android.gms.internal.play_billing.p3.h(bundle, "BillingClient"));
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iB);
            this.f89227b.f(q2.b(23, 23, nVarA), this.f89228c);
        }
        this.f89226a.a(nVarA);
    }
}
