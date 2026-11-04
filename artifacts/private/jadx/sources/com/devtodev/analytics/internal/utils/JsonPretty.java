package com.devtodev.analytics.internal.utils;

import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.l;
import com.google.gson.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonPretty {

    @NotNull
    public static final JsonPretty INSTANCE = new JsonPretty();
    private static final f jsonFormat = new g().E().r().g().f();

    private JsonPretty() {
    }

    @NotNull
    public final String toPrettyJson(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        l lVarF = q.f(json);
        Intrinsics.checkNotNullExpressionValue(lVarF, "parseString(json)");
        String strC = jsonFormat.C(lVarF);
        Intrinsics.checkNotNullExpressionValue(strC, "jsonFormat.toJson(jsonElement)");
        return strC;
    }
}
