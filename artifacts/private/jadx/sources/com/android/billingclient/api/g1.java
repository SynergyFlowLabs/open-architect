package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class g1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f89055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f89056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f89057c;

    g1(i iVar, String str, b0 b0Var) {
        this.f89055a = str;
        this.f89056b = b0Var;
        this.f89057c = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        u1 u1VarA1 = this.f89057c.a1(this.f89055a);
        this.f89056b.c(u1VarA1.a(), u1VarA1.b());
        return null;
    }
}
