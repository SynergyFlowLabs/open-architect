package com.android.billingclient.api;

import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class h2 implements com.google.android.gms.internal.play_billing.a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Consumer f89098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f89099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ m2 f89100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f89101d;

    h2(m2 m2Var, int i10, Consumer consumer, Runnable runnable) {
        this.f89101d = i10;
        this.f89098a = consumer;
        this.f89099b = runnable;
        this.f89100c = m2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        m2 m2Var = this.f89100c;
        if (!m2.X1(iIntValue)) {
            this.f89099b.run();
        } else {
            this.f89098a.accept(m2Var.Y1(this.f89101d, num.intValue()));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void b(Throwable th2) {
        if (th2 instanceof TimeoutException) {
            this.f89100c.a2(114, 28, t2.G);
            com.google.android.gms.internal.play_billing.p3.m("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            this.f89100c.a2(com.planner5d.library.engine.input.f.b.f160745y1, 28, t2.G);
            com.google.android.gms.internal.play_billing.p3.m("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        this.f89099b.run();
    }
}
