package com.superwall.sdk.storage.core_data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlin.ranges.r;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Converters.kt\ncom/superwall/sdk/storage/core_data/ConvertersKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 5 Json.kt\nkotlinx/serialization/json/Json\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,110:1\n462#2:111\n412#2:112\n1246#3,4:113\n774#3:123\n865#3,2:124\n1557#3:131\n1628#3,3:132\n1187#3,2:139\n1261#3,4:141\n1557#3:145\n1628#3,3:146\n113#4:117\n147#5:118\n147#5:126\n126#6:119\n153#6,3:120\n126#6:127\n153#6,3:128\n126#6:149\n153#6,3:150\n11165#7:135\n11500#7,3:136\n*S KotlinDebug\n*F\n+ 1 Converters.kt\ncom/superwall/sdk/storage/core_data/ConvertersKt\n*L\n56#1:111\n56#1:112\n56#1:113,4\n64#1:123\n64#1:124,2\n81#1:131\n81#1:132,3\n85#1:139,2\n85#1:141,4\n107#1:145\n107#1:146,3\n57#1:117\n61#1:118\n69#1:126\n63#1:119\n63#1:120,3\n71#1:127\n71#1:128,3\n108#1:149\n108#1:150,3\n82#1:135\n82#1:136,3\n*E\n"})
public final class ConvertersKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final Object convertFromJsonElement(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        if (jsonElement instanceof JsonNull) {
            return null;
        }
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (jsonPrimitive.isString()) {
                return jsonPrimitive.getContent();
            }
            if (JsonElementKt.getIntOrNull(jsonPrimitive) != null) {
                return Double.valueOf(JsonElementKt.getInt(jsonPrimitive));
            }
            if (JsonElementKt.getLongOrNull(jsonPrimitive) != null) {
                return Long.valueOf(JsonElementKt.getLong(jsonPrimitive));
            }
            if (JsonElementKt.getDoubleOrNull(jsonPrimitive) != null) {
                return Double.valueOf(JsonElementKt.getDouble(jsonPrimitive));
            }
            return JsonElementKt.getBooleanOrNull(jsonPrimitive) != null ? Boolean.valueOf(JsonElementKt.getBoolean(jsonPrimitive)) : jsonPrimitive.getContent();
        }
        if (jsonElement instanceof JsonArray) {
            Iterable iterable = (Iterable) jsonElement;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(convertFromJsonElement((JsonElement) it.next()));
            }
            return arrayList;
        }
        if (!(jsonElement instanceof JsonObject)) {
            throw new k0();
        }
        Map map = (Map) jsonElement;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList2.add(TuplesKt.to((String) entry.getKey(), convertFromJsonElement((JsonElement) entry.getValue())));
        }
        return MapsKt.toMap(arrayList2);
    }

    @NotNull
    public static final JsonElement convertToJsonElement(@Nullable Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof String) {
            return JsonElementKt.JsonPrimitive((String) obj);
        }
        if (obj instanceof Number) {
            return JsonElementKt.JsonPrimitive((Number) obj);
        }
        if (obj instanceof Boolean) {
            return JsonElementKt.JsonPrimitive((Boolean) obj);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(convertToJsonElement(it.next()));
            }
            return new JsonArray(arrayList);
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList2 = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                arrayList2.add(convertToJsonElement(obj2));
            }
            return new JsonArray(arrayList2);
        }
        if (!(obj instanceof Map)) {
            Intrinsics.checkNotNull(obj);
            throw new IllegalArgumentException("Unsupported type: " + j1.d(obj.getClass()));
        }
        Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Pair pair = TuplesKt.to(String.valueOf(entry.getKey()), convertToJsonElement(entry.getValue()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return new JsonObject(linkedHashMap);
    }

    @NotNull
    public static final String fromTypedMap(@NotNull Json json, @NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), convertToJsonElement(entry.getValue()));
        }
        JsonObject jsonObject = new JsonObject(MapsKt.toMap(linkedHashMap));
        json.getSerializersModule();
        return json.encodeToString(JsonObject.Companion.serializer(), jsonObject);
    }

    @NotNull
    public static final Map<String, Object> toNullableTypedMap(@NotNull Json json, @NotNull String jsonStr) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
        json.getSerializersModule();
        JsonObject jsonObject = (JsonObject) json.decodeFromString(JsonObject.Companion.serializer(), jsonStr);
        ArrayList arrayList = new ArrayList(jsonObject.size());
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), convertFromJsonElement(entry.getValue())));
        }
        Map<String, Object> map = MapsKt.toMap(arrayList);
        Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        return map;
    }

    @NotNull
    public static final Map<String, Object> toTypedMap(@NotNull Json json, @NotNull String jsonStr) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
        json.getSerializersModule();
        JsonObject jsonObject = (JsonObject) json.decodeFromString(JsonObject.Companion.serializer(), jsonStr);
        ArrayList arrayList = new ArrayList(jsonObject.size());
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), convertFromJsonElement(entry.getValue())));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Pair) obj).getSecond() != null) {
                arrayList2.add(obj);
            }
        }
        Map<String, Object> map = MapsKt.toMap(arrayList2);
        Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        return map;
    }
}
