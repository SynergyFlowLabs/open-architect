package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;

/* JADX INFO: loaded from: classes3.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends androidx.activity.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.activity.result.h f88977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.activity.result.h f88978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private ResultReceiver f88979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private ResultReceiver f88980d;

    @Override // androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected final void onCreate(@androidx.annotation.p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f88977a = registerForActivityResult(new g.b.n(), new androidx.activity.result.a() { // from class: com.android.billingclient.api.d3
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                this.f89022a.w((ActivityResult) obj);
            }
        });
        this.f88978b = registerForActivityResult(new g.b.n(), new androidx.activity.result.a() { // from class: com.android.billingclient.api.e3
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                this.f89036a.x((ActivityResult) obj);
            }
        });
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.p3.k("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.f88979c = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                this.f88977a.b(new IntentSenderRequest.a(pendingIntent).a());
            } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                this.f88980d = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                this.f88978b.b(new IntentSenderRequest.a(pendingIntent2).a());
            }
        } else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.f88979c = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        } else if (bundle.containsKey("external_payment_dialog_result_receiver")) {
            this.f88980d = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
        }
    }

    @Override // androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f88979c;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f88980d;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }

    @androidx.annotation.l1
    final void w(ActivityResult activityResult) {
        Intent intentA = activityResult.a();
        int iB = com.google.android.gms.internal.play_billing.p3.f(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f88979c;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (activityResult.b() != -1 || iB != 0) {
            com.google.android.gms.internal.play_billing.p3.l("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.b() + " and billing's responseCode: " + iB);
        }
        finish();
    }

    @androidx.annotation.l1
    final void x(ActivityResult activityResult) {
        Intent intentA = activityResult.a();
        int iB = com.google.android.gms.internal.play_billing.p3.f(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f88980d;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (activityResult.b() != -1 || iB != 0) {
            com.google.android.gms.internal.play_billing.p3.l("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.b()), Integer.valueOf(iB)));
        }
        finish();
    }
}
