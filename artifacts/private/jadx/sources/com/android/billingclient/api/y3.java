package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.p6;
import com.google.android.gms.internal.play_billing.v9;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.l1
final class y3 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f89302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f89303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ z3 f89304c;

    y3(z3 z3Var, boolean z10) {
        this.f89304c = z3Var;
        this.f89303b = z10;
    }

    private final void d(Bundle bundle, n nVar, int i10) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f89304c.f89345e.d(v9.D(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), p6.a()));
            } else {
                this.f89304c.f89345e.d(q2.b(23, i10, nVar));
            }
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.p3.l("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f89302a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f89303b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f89302a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        y3 y3Var;
        try {
            try {
                if (this.f89302a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    y3Var = this;
                    context.registerReceiver(y3Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f89303b ? 4 : 2);
                } else {
                    y3Var = this;
                    context.registerReceiver(y3Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                y3Var.f89302a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        try {
            if (!this.f89302a) {
                com.google.android.gms.internal.play_billing.p3.l("BillingBroadcastManager", "Receiver is not registered.");
            } else {
                context.unregisterReceiver(this);
                this.f89302a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.p3.l("BillingBroadcastManager", "Bundle is null.");
            r2 r2Var = this.f89304c.f89345e;
            n nVar = t2.f89252k;
            r2Var.d(q2.b(11, 1, nVar));
            z3 z3Var = this.f89304c;
            if (z3Var.f89342b != null) {
                z3Var.f89342b.onPurchasesUpdated(nVar, null);
                return;
            }
            return;
        }
        n nVarF = com.google.android.gms.internal.play_billing.p3.f(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i10 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED") && !action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if (nVarF.b() != 0) {
                    d(extras, nVarF, i10);
                    this.f89304c.f89342b.onPurchasesUpdated(nVarF, com.google.android.gms.internal.play_billing.r1.v());
                    return;
                }
                z3 z3Var2 = this.f89304c;
                if (z3Var2.f89343c == null && z3Var2.f89344d == null) {
                    com.google.android.gms.internal.play_billing.p3.l("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                    r2 r2Var2 = this.f89304c.f89345e;
                    n nVar2 = t2.f89252k;
                    r2Var2.d(q2.b(77, i10, nVar2));
                    this.f89304c.f89342b.onPurchasesUpdated(nVar2, com.google.android.gms.internal.play_billing.r1.v());
                    return;
                }
                String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string == null) {
                    com.google.android.gms.internal.play_billing.p3.l("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                    r2 r2Var3 = this.f89304c.f89345e;
                    n nVar3 = t2.f89252k;
                    r2Var3.d(q2.b(16, i10, nVar3));
                    this.f89304c.f89342b.onPurchasesUpdated(nVar3, com.google.android.gms.internal.play_billing.r1.v());
                    return;
                }
                try {
                    if (this.f89304c.f89344d != null) {
                        this.f89304c.f89344d.a(new k0(string));
                    } else {
                        JSONArray jSONArrayOptJSONArray = new JSONObject(string).optJSONArray("products");
                        ArrayList arrayList = new ArrayList();
                        if (jSONArrayOptJSONArray != null) {
                            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                                if (jSONObjectOptJSONObject != null) {
                                    arrayList.add(new j2(jSONObjectOptJSONObject, null));
                                }
                            }
                        }
                        this.f89304c.f89343c.a();
                    }
                    this.f89304c.f89345e.g(q2.d(i10));
                    return;
                } catch (JSONException unused) {
                    com.google.android.gms.internal.play_billing.p3.l("BillingBroadcastManager", String.format("Error when parsing invalid user choice data: [%s]", string));
                    r2 r2Var4 = this.f89304c.f89345e;
                    n nVar4 = t2.f89252k;
                    r2Var4.d(q2.b(17, i10, nVar4));
                    this.f89304c.f89342b.onPurchasesUpdated(nVar4, com.google.android.gms.internal.play_billing.r1.v());
                    return;
                }
            }
            return;
        }
        List<Purchase> listJ = com.google.android.gms.internal.play_billing.p3.j(extras);
        if (nVarF.b() == 0) {
            this.f89304c.f89345e.g(q2.d(i10));
        } else {
            d(extras, nVarF, i10);
        }
        this.f89304c.f89342b.onPurchasesUpdated(nVarF, listJ);
    }
}
