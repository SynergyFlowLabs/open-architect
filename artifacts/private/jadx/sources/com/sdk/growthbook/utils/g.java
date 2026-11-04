package com.sdk.growthbook.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/sdk/growthbook/utils/ExtensionsKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n216#2,2:77\n216#2,2:83\n1869#3,2:79\n1869#3,2:81\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/sdk/growthbook/utils/ExtensionsKt\n*L\n14#1:77,2\n63#1:83,2\n30#1:79,2\n45#1:81,2\n*E\n"})
public final class g {
    @NotNull
    public static final HashMap<String, Object> a(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        HashMap<String, Object> map = new HashMap<>();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (value instanceof JsonObject) {
                map.put(key, a((JsonObject) value));
            } else if (value instanceof JsonArray) {
                map.put(key, d((JsonArray) value));
            } else {
                map.put(key, JsonElementKt.getJsonPrimitive(value).getContent());
            }
        }
        return map;
    }

    @NotNull
    public static final JsonElement b(@NotNull List<?> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                if (obj instanceof Map) {
                    arrayList.add(c((Map) obj));
                } else if (obj instanceof List) {
                    arrayList.add(b((List) obj));
                } else if (obj instanceof Boolean) {
                    arrayList.add(JsonElementKt.JsonPrimitive((Boolean) obj));
                } else if (obj instanceof Number) {
                    arrayList.add(JsonElementKt.JsonPrimitive((Number) obj));
                } else {
                    arrayList.add(JsonElementKt.JsonPrimitive(obj.toString()));
                }
            }
        }
        return new JsonArray(arrayList);
    }

    @NotNull
    public static final JsonElement c(@NotNull Map<?, ?> map) {
        Object value;
        JsonElement jsonElementJsonPrimitive;
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null && (value = entry.getValue()) != null) {
                if (value instanceof Map) {
                    jsonElementJsonPrimitive = c((Map) value);
                } else if (value instanceof List) {
                    jsonElementJsonPrimitive = b((List) value);
                } else if (value instanceof Boolean) {
                    jsonElementJsonPrimitive = JsonElementKt.JsonPrimitive((Boolean) value);
                } else {
                    jsonElementJsonPrimitive = value instanceof Number ? JsonElementKt.JsonPrimitive((Number) value) : JsonElementKt.JsonPrimitive(value.toString());
                }
                linkedHashMap.put(str, jsonElementJsonPrimitive);
            }
        }
        return new JsonObject(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final List<?> d(@NotNull JsonArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "<this>");
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : jsonArray) {
            if (jsonElement instanceof JsonObject) {
                arrayList.add(a((JsonObject) jsonElement));
            } else if (jsonElement instanceof List) {
                arrayList.add(CollectionsKt.toList((Iterable) jsonElement));
            } else {
                arrayList.add(JsonElementKt.getJsonPrimitive(jsonElement).getContent());
            }
        }
        return arrayList;
    }
}
