package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class f1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f89042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c0 f89043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f89044c;

    f1(i iVar, String str, c0 c0Var) {
        this.f89042a = str;
        this.f89043b = c0Var;
        this.f89044c = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        f3 f3VarT0 = this.f89044c.t0(this.f89042a, 9);
        if (f3VarT0.b() != null) {
            this.f89043b.onQueryPurchasesResponse(f3VarT0.a(), f3VarT0.b());
            return null;
        }
        this.f89043b.onQueryPurchasesResponse(f3VarT0.a(), com.google.android.gms.internal.play_billing.r1.v());
        return null;
    }
}
