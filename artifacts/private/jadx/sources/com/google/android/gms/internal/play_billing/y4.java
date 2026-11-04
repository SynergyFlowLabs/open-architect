package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class y4 extends j4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f109444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ z4 f109445d;

    y4(z4 z4Var, Callable callable) {
        this.f109445d = z4Var;
        callable.getClass();
        this.f109444c = callable;
    }

    @Override // com.google.android.gms.internal.play_billing.j4
    final Object a() throws Exception {
        return this.f109444c.call();
    }

    @Override // com.google.android.gms.internal.play_billing.j4
    final String b() {
        return this.f109444c.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.j4
    final void c(Throwable th2) {
        this.f109445d.n(th2);
    }

    @Override // com.google.android.gms.internal.play_billing.j4
    final void d(Object obj) {
        this.f109445d.m(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.j4
    final boolean f() {
        return this.f109445d.isDone();
    }
}
