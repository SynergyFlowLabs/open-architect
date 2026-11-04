package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;

/* JADX INFO: loaded from: classes3.dex */
@x3
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f88964f = "result_receiver";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f88965g = "in_app_message_result_receiver";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f88966h = "ProxyBillingActivity";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f88967i = 100;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f88968j = 101;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f88969k = 110;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f88970l = "send_cancelled_broadcast_if_finished";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f88971m = "activity_code";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private ResultReceiver f88972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private ResultReceiver f88973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f88974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f88975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f88976e;

    private Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    @x3
    protected void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        Intent intentB;
        super.onActivityResult(i10, i11, intent);
        Bundle extras = null;
        if (i10 == 100 || i10 == 110) {
            int iB = com.google.android.gms.internal.play_billing.p3.f(intent, f88966h).b();
            if (i11 != -1) {
                com.google.android.gms.internal.play_billing.p3.l(f88966h, "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iB);
            } else if (iB != 0) {
                i11 = -1;
                com.google.android.gms.internal.play_billing.p3.l(f88966h, "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iB);
            } else {
                iB = 0;
            }
            ResultReceiver resultReceiver = this.f88972a;
            if (resultReceiver != null) {
                resultReceiver.send(iB, intent != null ? intent.getExtras() : null);
            } else {
                if (intent == null) {
                    intentB = b();
                } else if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentB = a(string);
                        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        intentB = b();
                        intentB.putExtras(intent.getExtras());
                        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    }
                } else {
                    intentB = b();
                    com.google.android.gms.internal.play_billing.p3.l(f88966h, "Got null bundle!");
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    n.a aVarC = n.c();
                    aVarC.c(6);
                    aVarC.b("An internal error occurred.");
                    intentB.putExtra("FAILURE_LOGGING_PAYLOAD", q2.b(22, 2, aVarC.a()).i());
                    intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                if (i10 == 110) {
                    intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentB);
            }
        } else if (i10 == 101) {
            int iA = com.google.android.gms.internal.play_billing.p3.a(intent, f88966h);
            ResultReceiver resultReceiver2 = this.f88973b;
            if (resultReceiver2 != null) {
                if (intent != null) {
                    extras = intent.getExtras();
                }
                resultReceiver2.send(iA, extras);
            }
        } else {
            com.google.android.gms.internal.play_billing.p3.l(f88966h, "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
        }
        this.f88974c = false;
        finish();
    }

    @Override // android.app.Activity
    @x3
    protected void onCreate(@androidx.annotation.p0 Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.p3.k(f88966h, "Launching Play Store billing flow from savedInstanceState");
            this.f88974c = bundle.getBoolean(f88970l, false);
            if (bundle.containsKey(f88964f)) {
                this.f88972a = (ResultReceiver) bundle.getParcelable(f88964f);
            } else if (bundle.containsKey(f88965g)) {
                this.f88973b = (ResultReceiver) bundle.getParcelable(f88965g);
            }
            this.f88975d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f88976e = bundle.getInt(f88971m, 100);
            return;
        }
        com.google.android.gms.internal.play_billing.p3.k(f88966h, "Launching Play Store billing flow");
        this.f88976e = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f88975d = true;
                this.f88976e = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f88972a = (ResultReceiver) getIntent().getParcelableExtra(f88964f);
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f88973b = (ResultReceiver) getIntent().getParcelableExtra(f88965g);
            this.f88976e = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f88974c = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f88976e, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e10) {
            com.google.android.gms.internal.play_billing.p3.m(f88966h, "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.f88972a;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f88973b;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentB = b();
                    if (this.f88975d) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentB);
                }
            }
            this.f88974c = false;
            finish();
        }
    }

    @Override // android.app.Activity
    @x3
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f88974c) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i10 = this.f88976e;
            if (i10 == 110 || i10 == 100) {
                intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    @x3
    protected void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f88972a;
        if (resultReceiver != null) {
            bundle.putParcelable(f88964f, resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f88973b;
        if (resultReceiver2 != null) {
            bundle.putParcelable(f88965g, resultReceiver2);
        }
        bundle.putBoolean(f88970l, this.f88974c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f88975d);
        bundle.putInt(f88971m, this.f88976e);
    }
}
