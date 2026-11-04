package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes3.dex */
final class k2 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m2 f89150a;

    /* synthetic */ k2(m2 m2Var, l2 l2Var) {
        this.f89150a = m2Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.p3.k("BillingClientTesting", "Billing Override Service connected.");
        this.f89150a.I = com.google.android.gms.internal.play_billing.v.k(iBinder);
        this.f89150a.H = 2;
        this.f89150a.b2(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.p3.l("BillingClientTesting", "Billing Override Service disconnected.");
        this.f89150a.I = null;
        this.f89150a.H = 0;
    }
}
