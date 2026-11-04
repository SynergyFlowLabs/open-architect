package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class q1 extends com.google.android.gms.internal.play_billing.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final d f89220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r2 f89221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f89222c;

    /* synthetic */ q1(d dVar, r2 r2Var, int i10, v1 v1Var) {
        this.f89220a = dVar;
        this.f89221b = r2Var;
        this.f89222c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.j
    public final void a(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            r2 r2Var = this.f89221b;
            n nVar = t2.f89252k;
            r2Var.f(q2.b(67, 14, nVar), this.f89222c);
            this.f89220a.a(nVar);
            return;
        }
        int iB = com.google.android.gms.internal.play_billing.p3.b(bundle, "BillingClient");
        n nVarA = t2.a(iB, com.google.android.gms.internal.play_billing.p3.h(bundle, "BillingClient"));
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iB);
            this.f89221b.f(q2.b(23, 14, nVarA), this.f89222c);
        }
        this.f89220a.a(nVarA);
    }
}
