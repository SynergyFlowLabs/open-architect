package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@r3
@g6.a
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89039a;

    f(String str) throws JSONException {
        this.f89039a = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String a() {
        return this.f89039a;
    }
}
