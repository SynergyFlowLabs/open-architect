package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
final class s1 extends com.google.android.gms.internal.play_billing.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f89234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ResultReceiver f89235b;

    /* synthetic */ s1(WeakReference weakReference, ResultReceiver resultReceiver, v1 v1Var) {
        this.f89234a = weakReference;
        this.f89235b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.q
    public final void a(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.f89235b;
        if (resultReceiver == null) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f89234a.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity != null && pendingIntent != null) {
            try {
                Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent.putExtra("in_app_message_result_receiver", this.f89235b);
                intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                activity.startActivity(intent);
                return;
            } catch (CancellationException e10) {
                this.f89235b.send(0, null);
                com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Exception caught while launching intent for in-app messaging.", e10);
                return;
            }
        }
        this.f89235b.send(0, null);
        com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Unable to launch intent for in-app messaging");
    }
}
