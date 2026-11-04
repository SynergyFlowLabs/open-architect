package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f109248a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return p(intent.getExtras(), "ProxyBillingActivity");
        }
        l("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        if (bundle == null) {
            l(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            k(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        l(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle c(Bundle bundle, String str, long j10) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j10);
        return bundle;
    }

    public static Bundle d(boolean z10, boolean z11, boolean z12, boolean z13, String str, long j10) {
        Bundle bundle = new Bundle();
        c(bundle, str, j10);
        if (z10 && z12) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z11 && z13) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static Bundle e(String str, long j10) {
        Bundle bundle = new Bundle();
        c(bundle, str, j10);
        return bundle;
    }

    public static com.android.billingclient.api.n f(Intent intent, String str) {
        if (intent != null) {
            com.android.billingclient.api.n.a aVarC = com.android.billingclient.api.n.c();
            aVarC.c(b(intent.getExtras(), str));
            aVarC.b(h(intent.getExtras(), str));
            return aVarC.a();
        }
        l("BillingHelper", "Got null intent!");
        com.android.billingclient.api.n.a aVarC2 = com.android.billingclient.api.n.c();
        aVarC2.c(6);
        aVarC2.b("An internal error occurred.");
        return aVarC2.a();
    }

    public static com.android.billingclient.api.x g(Bundle bundle, String str) {
        return bundle == null ? new com.android.billingclient.api.x(0, null) : new com.android.billingclient.api.x(p(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String h(Bundle bundle, String str) {
        if (bundle == null) {
            l(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            k(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        l(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String i(int i10) {
        return d2.b(i10).toString();
    }

    @androidx.annotation.p0
    public static List j(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseQ = q(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseQ == null) {
                k("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseQ);
            return arrayList;
        }
        k("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
            Purchase purchaseQ2 = q(stringArrayList.get(i10), stringArrayList2.get(i10));
            if (purchaseQ2 != null) {
                arrayList.add(purchaseQ2);
            }
        }
        return arrayList;
    }

    public static void k(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i10 = 40000;
        while (!str2.isEmpty() && i10 > 0) {
            int iMin = Math.min(str2.length(), Math.min(4000, i10));
            str2.substring(0, iMin);
            str2 = str2.substring(iMin);
            i10 -= iMin;
        }
    }

    public static void l(String str, String str2) {
    }

    public static void m(String str, String str2, @androidx.annotation.p0 Throwable th2) {
    }

    public static Bundle n(com.android.billingclient.api.n nVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", nVar.b());
        bundle.putString("DEBUG_MESSAGE", nVar.a());
        bundle.putInt("LOG_REASON", i10 - 1);
        return bundle;
    }

    public static Bundle o(com.android.billingclient.api.n nVar, int i10, @androidx.annotation.p0 String str) {
        Bundle bundleN = n(nVar, 5);
        if (str != null) {
            bundleN.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleN;
    }

    private static int p(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        l(str, "Unexpected null bundle received!");
        return 0;
    }

    @androidx.annotation.p0
    private static Purchase q(String str, String str2) {
        if (str == null || str2 == null) {
            k("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e10) {
            l("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
            return null;
        }
    }
}
