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
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f89306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f89307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f89308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f89309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f89310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f89311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f89312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f89313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final List f89314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private final List f89315k;

    @u3
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f89316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f89317b;

        a(JSONObject jSONObject) throws JSONException {
            this.f89316a = jSONObject.getInt("commitmentPaymentsCount");
            this.f89317b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        @u3
        public int a() {
            return this.f89316a;
        }

        @u3
        public int b() {
            return this.f89317b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f89318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f89319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f89320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private final String f89321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private final String f89322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private final c3 f89323f;

        b(JSONObject jSONObject) throws JSONException {
            this.f89318a = jSONObject.optString("formattedPrice");
            this.f89319b = jSONObject.optLong("priceAmountMicros");
            this.f89320c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f89321d = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            com.google.android.gms.internal.play_billing.r1.u(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("percentageDiscount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getLong("startTimeMillis");
                jSONObjectOptJSONObject2.getLong("endTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.getInt("maximumQuantity");
                jSONObjectOptJSONObject3.getInt("remainingQuantity");
            }
            this.f89322e = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject5 != null) {
                jSONObjectOptJSONObject5.getString("rentalPeriod");
                jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f89323f = jSONObjectOptJSONObject6 != null ? new c3(jSONObjectOptJSONObject6) : null;
        }

        @NonNull
        public String a() {
            return this.f89318a;
        }

        public long b() {
            return this.f89319b;
        }

        @NonNull
        public String c() {
            return this.f89320c;
        }

        @androidx.annotation.p0
        public final c3 d() {
            return this.f89323f;
        }

        @androidx.annotation.p0
        public final String e() {
            return this.f89321d;
        }

        @androidx.annotation.p0
        final String f() {
            return this.f89322e;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f89324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f89325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f89326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f89327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f89328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f89329f;

        c(JSONObject jSONObject) {
            this.f89327d = jSONObject.optString("billingPeriod");
            this.f89326c = jSONObject.optString("priceCurrencyCode");
            this.f89324a = jSONObject.optString("formattedPrice");
            this.f89325b = jSONObject.optLong("priceAmountMicros");
            this.f89329f = jSONObject.optInt("recurrenceMode");
            this.f89328e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f89328e;
        }

        @NonNull
        public String b() {
            return this.f89327d;
        }

        @NonNull
        public String c() {
            return this.f89324a;
        }

        public long d() {
            return this.f89325b;
        }

        @NonNull
        public String e() {
            return this.f89326c;
        }

        public int f() {
            return this.f89329f;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f89330a;

        d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f89330a = arrayList;
        }

        @NonNull
        public List<c> a() {
            return this.f89330a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
        public static final int E0 = 1;
        public static final int F0 = 2;
        public static final int G0 = 3;
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f89331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private final String f89332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f89333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f89334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f89335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private final a f89336f;

        f(JSONObject jSONObject) throws JSONException {
            this.f89331a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f89332b = true == strOptString.isEmpty() ? null : strOptString;
            this.f89333c = jSONObject.getString("offerIdToken");
            this.f89334d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f89336f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new c(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f89335e = arrayList;
        }

        @NonNull
        public String a() {
            return this.f89331a;
        }

        @u3
        @androidx.annotation.p0
        public a b() {
            return this.f89336f;
        }

        @androidx.annotation.p0
        public String c() {
            return this.f89332b;
        }

        @NonNull
        public List<String> d() {
            return this.f89335e;
        }

        @NonNull
        public String e() {
            return this.f89333c;
        }

        @NonNull
        public d f() {
            return this.f89334d;
        }
    }

    z(String str) throws JSONException {
        this.f89305a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f89306b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f89307c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f89308d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f89309e = jSONObject.optString("title");
        this.f89310f = jSONObject.optString("name");
        this.f89311g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f89312h = jSONObject.optString("skuDetailsToken");
        this.f89313i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        int i10 = 4 << 0;
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                arrayList.add(new f(jSONArrayOptJSONArray.getJSONObject(i11)));
            }
            this.f89314j = arrayList;
        } else {
            this.f89314j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f89306b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f89306b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i12)));
            }
            this.f89315k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f89315k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f89315k = arrayList2;
        }
    }

    @NonNull
    public String a() {
        return this.f89311g;
    }

    @NonNull
    public String b() {
        return this.f89310f;
    }

    @androidx.annotation.p0
    public b c() {
        List list = this.f89315k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) this.f89315k.get(0);
    }

    @NonNull
    public String d() {
        return this.f89307c;
    }

    @NonNull
    public String e() {
        return this.f89308d;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return TextUtils.equals(this.f89305a, ((z) obj).f89305a);
        }
        return false;
    }

    @androidx.annotation.p0
    public List<f> f() {
        return this.f89314j;
    }

    @NonNull
    public String g() {
        return this.f89309e;
    }

    @NonNull
    public final String h() {
        return this.f89306b.optString(com.google.firebase.remoteconfig.e0.b.f124460u2);
    }

    public int hashCode() {
        return this.f89305a.hashCode();
    }

    final String i() {
        return this.f89312h;
    }

    @androidx.annotation.p0
    public String j() {
        return this.f89313i;
    }

    @androidx.annotation.p0
    final List k() {
        return this.f89315k;
    }

    @NonNull
    public String toString() {
        List list = this.f89314j;
        return "ProductDetails{jsonString='" + this.f89305a + "', parsedJson=" + this.f89306b.toString() + ", productId='" + this.f89307c + "', productType='" + this.f89308d + "', title='" + this.f89309e + "', productDetailsToken='" + this.f89312h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
