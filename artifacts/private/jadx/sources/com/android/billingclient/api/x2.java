package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.ib;

/* JADX INFO: loaded from: classes3.dex */
final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f89290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.datatransport.l f89291b;

    x2(Context context) {
        try {
            com.google.android.datatransport.runtime.w.f(context);
            this.f89291b = com.google.android.datatransport.runtime.w.c().g(com.google.android.datatransport.cct.a.f103191j).b("PLAY_BILLING_LIBRARY", ib.class, com.google.android.datatransport.e.b("proto"), new com.google.android.datatransport.k() { // from class: com.android.billingclient.api.w2
                @Override // com.google.android.datatransport.k
                public final Object apply(Object obj) {
                    return ((ib) obj).i();
                }
            });
        } catch (Throwable unused) {
            this.f89290a = true;
        }
    }

    public final void a(ib ibVar) {
        if (this.f89290a) {
            com.google.android.gms.internal.play_billing.p3.l("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f89291b.b(com.google.android.datatransport.f.j(ibVar));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.p3.l("BillingLogger", "logging failed.");
        }
    }
}
