package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.da;

/* JADX INFO: loaded from: classes3.dex */
final class zzaw extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f89350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f89351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaw(i iVar, Handler handler, e eVar) {
        super(handler);
        this.f89350a = eVar;
        this.f89351b = iVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, @androidx.annotation.p0 Bundle bundle) {
        n.a aVarC = n.c();
        aVarC.c(i10);
        if (i10 != 0) {
            if (bundle == null) {
                this.f89351b.f1(this.f89350a, t2.f89252k, 73, null);
                return;
            } else {
                aVarC.b(com.google.android.gms.internal.play_billing.p3.h(bundle, "BillingClient"));
                int i11 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                this.f89351b.h0(q2.c(i11 != 0 ? da.a(i11) : 23, 16, aVarC.a(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        this.f89350a.a(aVarC.a());
    }
}
