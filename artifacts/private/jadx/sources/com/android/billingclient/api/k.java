package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@t3
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89141a;

    private k(@androidx.annotation.p0 String str, String str2) {
        this.f89141a = str2;
    }

    static k a(String str) {
        return new k(null, str);
    }

    @NonNull
    public String b() {
        return this.f89141a;
    }

    k(String str) throws JSONException {
        this.f89141a = new JSONObject(str).optString(com.google.firebase.remoteconfig.e0.b.f124454o2);
    }
}
