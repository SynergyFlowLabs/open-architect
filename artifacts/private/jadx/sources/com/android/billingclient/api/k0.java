package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@w3
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f89143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<a> f89144c;

    k0(String str) throws JSONException {
        this.f89142a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f89143b = jSONObject;
        this.f89144c = d(jSONObject.optJSONArray("products"));
    }

    private static List<a> d(@androidx.annotation.p0 JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new a(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public String a() {
        return this.f89143b.optString("externalTransactionToken");
    }

    @androidx.annotation.p0
    public String b() {
        String strOptString = this.f89143b.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public List<a> c() {
        return this.f89144c;
    }

    @w3
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f89145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f89146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private final String f89147c;

        a(String str, String str2, @androidx.annotation.p0 String str3) {
            this.f89145a = str;
            this.f89146b = str2;
            this.f89147c = str3;
        }

        @NonNull
        public String a() {
            return this.f89145a;
        }

        @androidx.annotation.p0
        public String b() {
            return this.f89147c;
        }

        @NonNull
        public String c() {
            return this.f89146b;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f89145a.equals(aVar.a()) && this.f89146b.equals(aVar.c()) && Objects.equals(this.f89147c, aVar.b());
        }

        public int hashCode() {
            return Objects.hash(this.f89145a, this.f89146b, this.f89147c);
        }

        @NonNull
        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f89145a, this.f89146b, this.f89147c);
        }

        private a(JSONObject jSONObject) {
            this.f89145a = jSONObject.optString("productId");
            this.f89146b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f89147c = true == strOptString.isEmpty() ? null : strOptString;
        }
    }
}
