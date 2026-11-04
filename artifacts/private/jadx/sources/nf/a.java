package nf;

import com.sdk.growthbook.model.c;
import com.sdk.growthbook.model.m;
import com.sdk.growthbook.model.n;
import com.sdk.growthbook.model.o;
import com.sdk.growthbook.model.p;
import com.sdk.growthbook.model.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGBValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBValue.kt\ncom/sdk/growthbook/kotlinx/serialization/GBValueKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,65:1\n1563#2:66\n1634#2,3:67\n1252#2,4:72\n1563#2:76\n1634#2,3:77\n1252#2,4:82\n465#3:70\n415#3:71\n465#3:80\n415#3:81\n*S KotlinDebug\n*F\n+ 1 GBValue.kt\ncom/sdk/growthbook/kotlinx/serialization/GBValueKt\n*L\n33#1:66\n33#1:67,3\n40#1:72,4\n58#1:76\n58#1:77,3\n61#1:82,4\n40#1:70\n40#1:71\n61#1:80\n61#1:81\n*E\n"})
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final q a(@NotNull q.a aVar, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        if (jsonElement instanceof JsonPrimitive) {
            if (jsonElement instanceof JsonNull) {
                return n.f266374a;
            }
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (jsonPrimitive.isString()) {
                return new p(jsonPrimitive.getContent());
            }
            if (JsonElementKt.getIntOrNull(jsonPrimitive) != null) {
                return new o(Integer.valueOf(JsonElementKt.getInt(jsonPrimitive)));
            }
            if (JsonElementKt.getLongOrNull(jsonPrimitive) != null) {
                return new o(Long.valueOf(JsonElementKt.getLong(jsonPrimitive)));
            }
            if (JsonElementKt.getFloatOrNull(jsonPrimitive) != null) {
                return new o(Float.valueOf(JsonElementKt.getFloat(jsonPrimitive)));
            }
            if (JsonElementKt.getDoubleOrNull(jsonPrimitive) != null) {
                return new o(Double.valueOf(JsonElementKt.getDouble(jsonPrimitive)));
            }
            return JsonElementKt.getBooleanOrNull(jsonPrimitive) != null ? new c(JsonElementKt.getBoolean(jsonPrimitive)) : q.b.f266379a;
        }
        if (jsonElement instanceof JsonArray) {
            Iterable iterable = (Iterable) jsonElement;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(a(aVar, (JsonElement) it.next()));
            }
            return new com.sdk.growthbook.model.b(arrayList);
        }
        if (!(jsonElement instanceof JsonObject)) {
            return q.b.f266379a;
        }
        Map map = (Map) jsonElement;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a(aVar, (JsonElement) entry.getValue()));
        }
        return new m(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final JsonElement b(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if (qVar instanceof n) {
            return JsonNull.INSTANCE;
        }
        if (qVar instanceof c) {
            return JsonElementKt.JsonPrimitive(Boolean.valueOf(((c) qVar).m()));
        }
        if (qVar instanceof p) {
            return JsonElementKt.JsonPrimitive(((p) qVar).m());
        }
        if (qVar instanceof o) {
            return JsonElementKt.JsonPrimitive(((o) qVar).i());
        }
        if (!(qVar instanceof com.sdk.growthbook.model.b)) {
            if (qVar instanceof m) {
                return c((m) qVar);
            }
            if (qVar instanceof q.b) {
                return JsonNull.INSTANCE;
            }
            throw new k0();
        }
        Iterable iterable = (Iterable) qVar;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(b((q) it.next()));
        }
        return new JsonArray(arrayList);
    }

    @NotNull
    public static final JsonObject c(@NotNull m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mVar.size()));
        Iterator<T> it = mVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), b((q) entry.getValue()));
        }
        return new JsonObject(linkedHashMap);
    }
}
