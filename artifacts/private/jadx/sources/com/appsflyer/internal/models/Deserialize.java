package com.appsflyer.internal.models;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface Deserialize<T> {
    T fromJson(@NotNull JSONObject jSONObject);
}
