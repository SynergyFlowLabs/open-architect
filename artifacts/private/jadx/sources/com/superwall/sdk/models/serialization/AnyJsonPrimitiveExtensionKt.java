package com.superwall.sdk.models.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class AnyJsonPrimitiveExtensionKt {
    public static final boolean isJsonPrimitable(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double);
    }

    @Nullable
    public static final JsonPrimitive jsonPrimitive(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (obj instanceof String) {
            return JsonElementKt.JsonPrimitive((String) obj);
        }
        if (obj instanceof Boolean) {
            return JsonElementKt.JsonPrimitive((Boolean) obj);
        }
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double)) {
            return null;
        }
        return JsonElementKt.JsonPrimitive((Number) obj);
    }
}
