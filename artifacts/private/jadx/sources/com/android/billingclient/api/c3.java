package com.android.billingclient.api;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 {
    c3(JSONObject jSONObject) throws JSONException {
        jSONObject.getString("type");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("balanceThresholds");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i10)));
            }
        }
        new z.d(jSONObject.getJSONArray("pricingPhases"));
    }
}
