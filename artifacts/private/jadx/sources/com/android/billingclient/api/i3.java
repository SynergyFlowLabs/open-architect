package com.android.billingclient.api;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class i3 {
    static h3 a(Bundle bundle, String str, String str2) {
        n nVar = t2.f89252k;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", String.format("%s got null owned items list", str2));
            return new h3(nVar, 54);
        }
        int iB = com.google.android.gms.internal.play_billing.p3.b(bundle, "BillingClient");
        String strH = com.google.android.gms.internal.play_billing.p3.h(bundle, "BillingClient");
        n.a aVarC = n.c();
        aVarC.c(iB);
        aVarC.b(strH);
        n nVarA = aVarC.a();
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iB)));
            return new h3(nVarA, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new h3(nVar, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new h3(nVar, 56);
        }
        if (stringArrayList2 == null) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new h3(nVar, 57);
        }
        if (stringArrayList3 != null) {
            return new h3(t2.f89253l, 1);
        }
        com.google.android.gms.internal.play_billing.p3.l("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new h3(nVar, 58);
    }
}
