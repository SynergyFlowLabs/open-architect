package com.android.billingclient.api;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f89137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f89138c;

    /* synthetic */ j2(JSONObject jSONObject, k3 k3Var) {
        this.f89136a = jSONObject.optString("productId");
        this.f89137b = jSONObject.optString("productType");
        String strOptString = jSONObject.optString("offerToken");
        this.f89138c = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return this.f89136a.equals(j2Var.f89136a) && this.f89137b.equals(j2Var.f89137b) && Objects.equals(this.f89138c, j2Var.f89138c);
    }

    public final int hashCode() {
        return Objects.hash(this.f89136a, this.f89137b, this.f89138c);
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.f89136a, this.f89137b, this.f89138c);
    }
}
