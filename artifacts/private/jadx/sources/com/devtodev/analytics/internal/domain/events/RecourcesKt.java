package com.devtodev.analytics.internal.domain.events;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class RecourcesKt {
    public static final void addToJson(@NotNull String name, @Nullable Map<String, Long> map, @NotNull JSONObject parentJson) throws JSONException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parentJson, "parentJson");
        if (map != null) {
            JSONObject json = getJson(map);
            if (json.length() > 0) {
                parentJson.accumulate(name, json);
            }
        }
    }

    @NotNull
    public static final JSONObject getJson(@NotNull Map<String, Long> map) throws JSONException {
        Intrinsics.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            jSONObject.accumulate(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }
}
