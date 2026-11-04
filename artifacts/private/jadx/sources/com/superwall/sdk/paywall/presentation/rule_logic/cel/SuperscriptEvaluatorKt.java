package com.superwall.sdk.paywall.presentation.rule_logic.cel;

import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlin.text.StringsKt;
import kotlin.y1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSuperscriptEvaluator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuperscriptEvaluator.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/SuperscriptEvaluatorKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 Json.kt\nkotlinx/serialization/json/JsonKt\n*L\n1#1,233:1\n462#2:234\n412#2:235\n487#2,7:244\n477#2:251\n423#2:252\n462#2:257\n412#2:258\n487#2,7:263\n477#2:270\n423#2:271\n462#2:276\n412#2:277\n462#2:287\n412#2:288\n1246#3,4:236\n1557#3:240\n1628#3,3:241\n1246#3,4:253\n1246#3,4:259\n1246#3,4:272\n1246#3,4:278\n1246#3,4:289\n1557#3:293\n1628#3,3:294\n126#4:282\n153#4,3:283\n298#5:286\n*S KotlinDebug\n*F\n+ 1 SuperscriptEvaluator.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/SuperscriptEvaluatorKt\n*L\n138#1:234\n138#1:235\n163#1:244,7\n164#1:251\n164#1:252\n167#1:257\n167#1:258\n175#1:263,7\n176#1:270\n176#1:271\n179#1:276\n179#1:277\n215#1:287\n215#1:288\n138#1:236,4\n156#1:240\n156#1:241,3\n164#1:253,4\n167#1:259,4\n176#1:272,4\n179#1:278,4\n215#1:289,4\n220#1:293\n220#1:294,3\n191#1:282\n191#1:283,3\n197#1:286\n*E\n"})
public final class SuperscriptEvaluatorKt {
    @NotNull
    public static final PassableValue toPassableValue(@NotNull Object obj) {
        Object passableValue;
        PassableValue passableValue2;
        PassableValue passableValue3;
        PassableValue passableValue4;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (obj instanceof Integer) {
            return new PassableValue.IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new PassableValue.UIntValue(y1.n(((Number) obj).longValue()), null);
        }
        if (obj instanceof y1) {
            return new PassableValue.UIntValue(((y1) obj).z0(), null);
        }
        if (obj instanceof Float) {
            return new PassableValue.FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new PassableValue.FloatValue(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            return new PassableValue.StringValue(StringsKt.k2((String) obj, "$", "", false, 4, null));
        }
        if (obj instanceof byte[]) {
            return new PassableValue.BytesValue((byte[]) obj);
        }
        if (obj instanceof Boolean) {
            return new PassableValue.BoolValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Object obj2 : iterable) {
                if (obj2 == null || (passableValue4 = toPassableValue(obj2)) == null) {
                    passableValue4 = PassableValue.NullValue.INSTANCE;
                }
                arrayList.add(passableValue4);
            }
            return new PassableValue.ListValue(arrayList);
        }
        if (obj instanceof LinkedHashMap) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                if (entry.getKey() instanceof String) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap2.put((String) key, entry2.getValue());
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                Object key2 = entry3.getKey();
                Object value = entry3.getValue();
                if (value == null || (passableValue3 = toPassableValue(value)) == null) {
                    passableValue3 = PassableValue.NullValue.INSTANCE;
                }
                linkedHashMap3.put(key2, passableValue3);
            }
            return new PassableValue.MapValue(MapsKt.toMap(linkedHashMap3));
        }
        if (obj instanceof Map) {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry4 : ((Map) obj).entrySet()) {
                if (entry4.getKey() instanceof String) {
                    linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                }
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap4.size()));
            for (Map.Entry entry5 : linkedHashMap4.entrySet()) {
                Object key3 = entry5.getKey();
                Intrinsics.checkNotNull(key3, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap5.put((String) key3, entry5.getValue());
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap5.size()));
            for (Map.Entry entry6 : linkedHashMap5.entrySet()) {
                Object key4 = entry6.getKey();
                Object value2 = entry6.getValue();
                if (value2 == null || (passableValue2 = toPassableValue(value2)) == null) {
                    passableValue2 = PassableValue.NullValue.INSTANCE;
                }
                linkedHashMap6.put(key4, passableValue2);
            }
            return new PassableValue.MapValue(MapsKt.toMap(linkedHashMap6));
        }
        if (obj instanceof JsonElement) {
            return toPassableValue((JsonElement) obj);
        }
        if (obj instanceof PassableValue) {
            return (PassableValue) obj;
        }
        try {
            try {
                Map map = (Map) obj;
                ArrayList arrayList2 = new ArrayList(map.size());
                for (Map.Entry entry7 : map.entrySet()) {
                    String strValueOf = String.valueOf(entry7.getKey());
                    Object value3 = entry7.getValue();
                    if (value3 == null || (passableValue = toPassableValue(value3)) == null) {
                        passableValue = PassableValue.NullValue.INSTANCE;
                    }
                    arrayList2.add(TuplesKt.to(strValueOf, passableValue));
                }
                return new PassableValue.MapValue(MapsKt.toMap(arrayList2));
            } catch (Exception unused) {
                boolean z10 = false & false;
                Logger.debug$default(Logger.INSTANCE, LogLevel.warn, LogScope.jsEvaluator, "Cannot serialize " + obj + "::class, evaluating as string", null, null, 24, null);
                return new PassableValue.StringValue(obj.toString());
            }
        } catch (Exception unused2) {
            Json.Default r10 = Json.Default;
            return toPassableValue(r10.encodeToJsonElement(m0.d(r10.getSerializersModule(), j1.d(Object.class)), obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final PassableValue toPassableValue(JsonElement jsonElement) {
        if (jsonElement instanceof JsonObject) {
            Map map = (Map) jsonElement;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), toPassableValue((JsonElement) entry.getValue()));
            }
            return new PassableValue.MapValue(MapsKt.toMap(linkedHashMap));
        }
        if (jsonElement instanceof JsonArray) {
            Iterable iterable = (Iterable) jsonElement;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(toPassableValue((JsonElement) it.next()));
            }
            return new PassableValue.ListValue(arrayList);
        }
        if (!(jsonElement instanceof JsonPrimitive)) {
            throw new k0();
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        if (jsonPrimitive.isString()) {
            return new PassableValue.StringValue(jsonPrimitive.getContent());
        }
        if (JsonElementKt.getBooleanOrNull(jsonPrimitive) != null) {
            return new PassableValue.BoolValue(JsonElementKt.getBoolean(jsonPrimitive));
        }
        if (JsonElementKt.getIntOrNull(jsonPrimitive) != null) {
            return new PassableValue.IntValue(JsonElementKt.getInt(jsonPrimitive));
        }
        if (JsonElementKt.getLongOrNull(jsonPrimitive) != null) {
            return new PassableValue.UIntValue(y1.n(JsonElementKt.getLong(jsonPrimitive)), null);
        }
        return JsonElementKt.getDoubleOrNull(jsonPrimitive) != null ? new PassableValue.FloatValue(JsonElementKt.getDouble(jsonPrimitive)) : new PassableValue.StringValue(jsonPrimitive.getContent());
    }

    @NotNull
    public static final <T> PassableValue.MapValue toPassableValue(@NotNull Map<String, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), toPassableValue(entry.getValue()));
        }
        return new PassableValue.MapValue(MapsKt.toMap(linkedHashMap));
    }
}
