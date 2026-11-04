package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.da;

/* JADX INFO: loaded from: classes3.dex */
final class zzax extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f89352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f89353b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzax(i iVar, Handler handler, r rVar) {
        super(handler);
        this.f89352a = rVar;
        this.f89353b = iVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, @androidx.annotation.p0 Bundle bundle) {
        n.a aVarC = n.c();
        aVarC.c(i10);
        if (i10 != 0) {
            if (bundle == null) {
                this.f89353b.d1(this.f89352a, t2.f89252k, 97, null);
                return;
            } else {
                aVarC.b(com.google.android.gms.internal.play_billing.p3.h(bundle, "BillingClient"));
                int i11 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                this.f89353b.h0(q2.c(i11 != 0 ? da.a(i11) : 23, 25, aVarC.a(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        this.f89352a.a(aVarC.a());
    }
}
