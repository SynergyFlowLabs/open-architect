package com.planner5d.library.aichat.converter;

import com.squareup.moshi.f;
import com.squareup.moshi.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class JSONObjectAdapter {
    @f
    @NotNull
    public final JSONObject fromJson(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new JSONObject(json);
    }

    @z
    @NotNull
    public final String toJson(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
