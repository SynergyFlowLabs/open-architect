package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nJsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonUtils.kt\ncom/appsflyer/internal/util/JsonUtilsKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n759#2,2:44\n775#2,4:46\n1549#3:50\n1620#3,3:51\n*S KotlinDebug\n*F\n+ 1 JsonUtils.kt\ncom/appsflyer/internal/util/JsonUtilsKt\n*L\n14#1:44,2\n14#1:46,4\n26#1:50\n26#1:51,3\n*E\n"})
public final class AFj1eSDK {
    private static final Object AFAdRevenueData(Object obj) {
        if (obj instanceof JSONArray) {
            return getCurrencyIso4217Code((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getCurrencyIso4217Code((JSONObject) obj);
        }
        if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    @NotNull
    public static final Map<String, Object> getCurrencyIso4217Code(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        Sequence sequenceE = kotlin.sequences.o.e(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceE) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            linkedHashMap.put(obj, AFAdRevenueData(obj2));
        }
        return linkedHashMap;
    }

    private static final List<Object> getCurrencyIso4217Code(JSONArray jSONArray) throws JSONException {
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((IntIterator) it).nextInt());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(AFAdRevenueData(obj));
        }
        return arrayList;
    }
}
