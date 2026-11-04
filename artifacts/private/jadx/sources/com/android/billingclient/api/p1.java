package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class p1 extends com.google.android.gms.internal.play_billing.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f89216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ResultReceiver f89217b;

    /* synthetic */ p1(WeakReference weakReference, ResultReceiver resultReceiver, v1 v1Var) {
        this.f89216a = weakReference;
        this.f89217b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.h
    public final void a(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.f89217b.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Response bundle doesn't contain a response code");
            this.f89217b.send(6, bundle);
            return;
        }
        int iB = com.google.android.gms.internal.play_billing.p3.b(bundle, "BillingClient");
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Unable to launch intent for external offer dialog" + iB);
            this.f89217b.send(iB, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "The PendingIntent for the external offer dialog is null");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            this.f89217b.send(6, bundle2);
            return;
        }
        try {
            Activity activity = (Activity) this.f89216a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("external_payment_dialog_result_receiver", this.f89217b);
            intent.putExtra("external_payment_dialog_pending_intent", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e10) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Runtime error while launching intent for the external offer dialog.", e10);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", 98);
            bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e10.getClass().getName(), com.google.android.gms.internal.play_billing.h0.b(e10.getMessage())));
            this.f89217b.send(6, bundle3);
        }
    }
}
