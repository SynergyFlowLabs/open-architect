package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f88986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f88987c;

    public PurchaseHistoryRecord(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f88985a = str;
        this.f88986b = str2;
        this.f88987c = new JSONObject(str);
    }

    private final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        if (this.f88987c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f88987c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (this.f88987c.has("productId")) {
            arrayList.add(this.f88987c.optString("productId"));
        }
        return arrayList;
    }

    @NonNull
    public String a() {
        return this.f88987c.optString("developerPayload");
    }

    @NonNull
    public String b() {
        return this.f88985a;
    }

    @NonNull
    public List<String> c() {
        return i();
    }

    public long d() {
        return this.f88987c.optLong("purchaseTime");
    }

    @NonNull
    public String e() {
        JSONObject jSONObject = this.f88987c;
        return jSONObject.optString(net.openid.appauth.x.f333313b, jSONObject.optString("purchaseToken"));
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f88985a, purchaseHistoryRecord.b()) && TextUtils.equals(this.f88986b, purchaseHistoryRecord.g());
    }

    public int f() {
        return this.f88987c.optInt("quantity", 1);
    }

    @NonNull
    public String g() {
        return this.f88986b;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> h() {
        return i();
    }

    public int hashCode() {
        return this.f88985a.hashCode();
    }

    @NonNull
    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f88985a));
    }
}
