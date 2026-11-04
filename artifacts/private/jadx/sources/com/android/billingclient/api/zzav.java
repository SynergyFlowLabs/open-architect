package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
final class zzav extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f89349a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzav(i iVar, Handler handler, w wVar) {
        super(handler);
        this.f89349a = wVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, @androidx.annotation.p0 Bundle bundle) {
        this.f89349a.a(com.google.android.gms.internal.play_billing.p3.g(bundle, "BillingClient"));
    }
}
