package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class n1 extends com.google.android.gms.internal.play_billing.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f89202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ResultReceiver f89203b;

    /* synthetic */ n1(WeakReference weakReference, ResultReceiver resultReceiver, v1 v1Var) {
        this.f89202a = weakReference;
        this.f89203b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final void a(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.f89203b.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Response bundle doesn't contain a response code");
            this.f89203b.send(6, bundle);
            return;
        }
        int iB = com.google.android.gms.internal.play_billing.p3.b(bundle, "BillingClient");
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Unable to launch intent for alternative billing only dialog" + iB);
            this.f89203b.send(iB, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.p3.k("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            this.f89203b.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f89202a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", this.f89203b);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e10) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e10);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e10.getClass().getName(), com.google.android.gms.internal.play_billing.h0.b(e10.getMessage())));
            this.f89203b.send(6, bundle2);
        }
    }
}
