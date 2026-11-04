package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes4.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f106623a = new Uri.Builder().scheme(FirebaseAnalytics.d.P).authority("com.google.android.gms.chimera").build();

    static Intent a(Context context, f2 f2Var) throws p1 {
        Bundle bundleCall;
        String strB = f2Var.b();
        if (strB == null) {
            return new Intent().setComponent(f2Var.a());
        }
        Intent intent = null;
        if (f2Var.d()) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", strB);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f106623a);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                throw new p1(new ConnectionResult(25, pendingIntent));
                            }
                        }
                    }
                    if (intent == null) {
                        "Dynamic lookup for intent failed for action: ".concat(strB);
                    }
                } catch (Throwable th2) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th2;
                }
            } catch (RemoteException | IllegalArgumentException e10) {
                "Dynamic intent resolution failed: ".concat(e10.toString());
                bundleCall = null;
            }
        }
        return intent == null ? new Intent(strB).setPackage(f2Var.c()) : intent;
    }
}
