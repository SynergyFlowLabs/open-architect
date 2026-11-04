package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@s3
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89230a;

    s(String str) throws JSONException {
        this.f89230a = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String a() {
        return this.f89230a;
    }
}
