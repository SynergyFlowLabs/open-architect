package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.aa;
import com.google.android.gms.internal.play_billing.ia;
import com.google.android.gms.internal.play_billing.ka;
import com.google.android.gms.internal.play_billing.ob;
import com.google.android.gms.internal.play_billing.sb;
import com.google.android.gms.internal.play_billing.v9;

/* JADX INFO: loaded from: classes3.dex */
interface r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f89229a = 0;

    static {
        com.google.android.gms.internal.play_billing.u1.c("com.android.vending.billing.PURCHASES_UPDATED", ka.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", ka.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", ka.ALTERNATIVE_BILLING_ACTION);
    }

    void a(ia iaVar);

    void b(ob obVar);

    void c(@androidx.annotation.p0 sb sbVar);

    void d(v9 v9Var);

    void e(@androidx.annotation.p0 aa aaVar, int i10);

    void f(@androidx.annotation.p0 v9 v9Var, int i10);

    void g(@androidx.annotation.p0 aa aaVar);
}
