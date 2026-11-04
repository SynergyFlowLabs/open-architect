package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes3.dex */
final class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f89341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f89342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j1 f89343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j0 f89344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r2 f89345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y3 f89346f = new y3(this, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final y3 f89347g = new y3(this, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f89348h;

    z3(Context context, d0 d0Var, y2 y2Var, j1 j1Var, j0 j0Var, r2 r2Var) {
        this.f89341a = context;
        this.f89342b = d0Var;
        this.f89343c = j1Var;
        this.f89344d = j0Var;
        this.f89345e = r2Var;
    }

    @androidx.annotation.p0
    final d0 d() {
        return this.f89342b;
    }

    final void f() {
        this.f89346f.c(this.f89341a);
        this.f89347g.c(this.f89341a);
    }

    final void g(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f89348h = z10;
        this.f89347g.a(this.f89341a, intentFilter2);
        if (this.f89348h) {
            this.f89346f.b(this.f89341a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f89346f.a(this.f89341a, intentFilter);
        }
    }
}
