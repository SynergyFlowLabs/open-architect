package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f88982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f88983c;

    @v3
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f88984a;

        private a(JSONObject jSONObject) {
            this.f88984a = jSONObject;
        }

        @NonNull
        public List<String> a() {
            JSONArray jSONArrayOptJSONArray;
            ArrayList arrayList = new ArrayList();
            if (this.f88984a.has("productIds") && (jSONArrayOptJSONArray = this.f88984a.optJSONArray("productIds")) != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
            return arrayList;
        }

        @NonNull
        public String b() {
            return this.f88984a.optString("purchaseToken");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int H0 = 0;
        public static final int I0 = 1;
        public static final int J0 = 2;
    }

    public Purchase(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f88981a = str;
        this.f88982b = str2;
        this.f88983c = new JSONObject(str);
    }

    private final ArrayList p() {
        ArrayList arrayList = new ArrayList();
        if (this.f88983c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f88983c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (this.f88983c.has("productId")) {
            arrayList.add(this.f88983c.optString("productId"));
        }
        return arrayList;
    }

    @androidx.annotation.p0
    public com.android.billingclient.api.a a() {
        JSONObject jSONObject = this.f88983c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new com.android.billingclient.api.a(strOptString, strOptString2);
    }

    @NonNull
    public String b() {
        return this.f88983c.optString("developerPayload");
    }

    @androidx.annotation.p0
    public String c() {
        String strOptString = this.f88983c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public String d() {
        return this.f88981a;
    }

    @NonNull
    public String e() {
        return this.f88983c.optString(com.google.firebase.remoteconfig.e0.b.f124460u2);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f88981a, purchase.d()) && TextUtils.equals(this.f88982b, purchase.l());
    }

    @v3
    @androidx.annotation.p0
    public a f() {
        JSONObject jSONObjectOptJSONObject = this.f88983c.optJSONObject("pendingPurchaseUpdate");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new a(jSONObjectOptJSONObject);
    }

    @NonNull
    public List<String> g() {
        return p();
    }

    public int h() {
        return this.f88983c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public int hashCode() {
        return this.f88981a.hashCode();
    }

    public long i() {
        return this.f88983c.optLong("purchaseTime");
    }

    @NonNull
    public String j() {
        JSONObject jSONObject = this.f88983c;
        return jSONObject.optString(net.openid.appauth.x.f333313b, jSONObject.optString("purchaseToken"));
    }

    public int k() {
        return this.f88983c.optInt("quantity", 1);
    }

    @NonNull
    public String l() {
        return this.f88982b;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> m() {
        return p();
    }

    public boolean n() {
        return this.f88983c.optBoolean("acknowledged", true);
    }

    public boolean o() {
        return this.f88983c.optBoolean("autoRenewing");
    }

    @NonNull
    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f88981a));
    }
}
