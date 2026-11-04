package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class SkuDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f88989b;

    public SkuDetails(@NonNull String str) throws JSONException {
        this.f88988a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f88989b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    @NonNull
    public String a() {
        return this.f88989b.optString("description");
    }

    @NonNull
    public String b() {
        return this.f88989b.optString("freeTrialPeriod");
    }

    @NonNull
    public String c() {
        return this.f88989b.optString("iconUrl");
    }

    @NonNull
    public String d() {
        return this.f88989b.optString("introductoryPrice");
    }

    public long e() {
        return this.f88989b.optLong("introductoryPriceAmountMicros");
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f88988a, ((SkuDetails) obj).f88988a);
        }
        return false;
    }

    public int f() {
        return this.f88989b.optInt("introductoryPriceCycles");
    }

    @NonNull
    public String g() {
        return this.f88989b.optString("introductoryPricePeriod");
    }

    @NonNull
    public String h() {
        return this.f88988a;
    }

    public int hashCode() {
        return this.f88988a.hashCode();
    }

    @NonNull
    public String i() {
        return this.f88989b.has("original_price") ? this.f88989b.optString("original_price") : k();
    }

    public long j() {
        return this.f88989b.has("original_price_micros") ? this.f88989b.optLong("original_price_micros") : l();
    }

    @NonNull
    public String k() {
        return this.f88989b.optString("price");
    }

    public long l() {
        return this.f88989b.optLong("price_amount_micros");
    }

    @NonNull
    public String m() {
        return this.f88989b.optString("price_currency_code");
    }

    @NonNull
    public String n() {
        return this.f88989b.optString("productId");
    }

    @NonNull
    public String o() {
        return this.f88989b.optString("subscriptionPeriod");
    }

    @NonNull
    public String p() {
        return this.f88989b.optString("title");
    }

    @NonNull
    public String q() {
        return this.f88989b.optString("type");
    }

    public int r() {
        return this.f88989b.optInt("offer_type");
    }

    @NonNull
    public String s() {
        return this.f88989b.optString("offer_id");
    }

    @NonNull
    public String t() {
        String strOptString = this.f88989b.optString("offerIdToken");
        return strOptString.isEmpty() ? this.f88989b.optString("offer_id_token") : strOptString;
    }

    @NonNull
    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f88988a));
    }

    @NonNull
    public final String u() {
        return this.f88989b.optString(com.google.firebase.remoteconfig.e0.b.f124460u2);
    }

    @NonNull
    public String v() {
        return this.f88989b.optString("serializedDocid");
    }

    final String w() {
        return this.f88989b.optString("skuDetailsToken");
    }
}
