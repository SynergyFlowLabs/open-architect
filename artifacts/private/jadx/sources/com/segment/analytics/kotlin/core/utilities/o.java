package com.segment.analytics.kotlin.core.utilities;

import com.segment.analytics.kotlin.core.AliasEvent;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.GroupEvent;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.ScreenEvent;
import com.segment.analytics.kotlin.core.TrackEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.e2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n1;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q1;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.z;
import kotlin.u1;
import kotlin.y1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nJSON.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSON.kt\ncom/segment/analytics/kotlin/core/utilities/JsonUtils\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,442:1\n260#1,2:522\n442#2:443\n392#2:444\n457#2:486\n403#2:487\n442#2:492\n392#2:493\n1238#3,4:445\n1549#3:449\n1620#3,3:450\n1549#3:455\n1620#3,3:456\n800#3,11:459\n1549#3:470\n1620#3,3:471\n1855#3,2:483\n1238#3,4:488\n1238#3,4:494\n215#4,2:453\n215#4,2:477\n28#5,3:474\n31#5:479\n51#5,3:480\n54#5:485\n28#5,4:498\n51#5,4:502\n51#5,4:506\n28#5,4:510\n28#5,4:514\n28#5,4:518\n*S KotlinDebug\n*F\n+ 1 JSON.kt\ncom/segment/analytics/kotlin/core/utilities/JsonUtils\n*L\n423#1:522,2\n84#1:443\n84#1:444\n196#1:486\n196#1:487\n201#1:492\n201#1:493\n84#1:445,4\n89#1:449\n89#1:450,3\n135#1:455\n135#1:456,3\n140#1:459,11\n140#1:470\n140#1:471,3\n182#1:483,2\n196#1:488,4\n201#1:494,4\n105#1:453,2\n149#1:477,2\n147#1:474,3\n147#1:479\n180#1:480,3\n180#1:485\n269#1:498,4\n285#1:502,4\n304#1:506,4\n322#1:510,4\n336#1:514,4\n350#1:518,4\n*E\n"})
@oj.i(name = "JsonUtils")
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Json f267012a = JsonKt.Json$default(null, a.f267015a, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Json f267013b = JsonKt.Json$default(null, b.f267016a, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<kotlin.reflect.d<? extends Object>, KSerializer<? extends Object>> f267014c = MapsKt.mapOf(TuplesKt.to(j1.d(String.class), hk.a.K(q1.f312784a)), TuplesKt.to(j1.d(Character.TYPE), hk.a.E(kotlin.jvm.internal.r.f312785a)), TuplesKt.to(j1.d(char[].class), hk.a.e()), TuplesKt.to(j1.d(Double.TYPE), hk.a.F(w.f312823a)), TuplesKt.to(j1.d(double[].class), hk.a.f()), TuplesKt.to(j1.d(Float.TYPE), hk.a.G(z.f312833a)), TuplesKt.to(j1.d(float[].class), hk.a.g()), TuplesKt.to(j1.d(Long.TYPE), hk.a.I(o0.f312774a)), TuplesKt.to(j1.d(long[].class), hk.a.j()), TuplesKt.to(j1.d(Integer.TYPE), hk.a.H(i0.f312739a)), TuplesKt.to(j1.d(int[].class), hk.a.h()), TuplesKt.to(j1.d(Short.TYPE), hk.a.J(n1.f312764a)), TuplesKt.to(j1.d(short[].class), hk.a.p()), TuplesKt.to(j1.d(Byte.TYPE), hk.a.D(kotlin.jvm.internal.o.f312769a)), TuplesKt.to(j1.d(byte[].class), hk.a.d()), TuplesKt.to(j1.d(Boolean.TYPE), hk.a.C(kotlin.jvm.internal.m.f312762a)), TuplesKt.to(j1.d(boolean[].class), hk.a.c()), TuplesKt.to(j1.d(Unit.class), hk.a.B(Unit.f312394a)), TuplesKt.to(j1.d(u1.class), hk.a.y(u1.f313438b)), TuplesKt.to(j1.d(y1.class), hk.a.z(y1.f313456b)), TuplesKt.to(j1.d(kotlin.q1.class), hk.a.x(kotlin.q1.f312878b)), TuplesKt.to(j1.d(e2.class), hk.a.A(e2.f312490b)));

    static final class a extends l0 implements Function1<JsonBuilder, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f267015a = new a();

        a() {
            super(1);
        }

        public final void c(@NotNull JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setEncodeDefaults(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            c(jsonBuilder);
            return Unit.f312394a;
        }
    }

    static final class b extends l0 implements Function1<JsonBuilder, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f267016a = new b();

        b() {
            super(1);
        }

        public final void c(@NotNull JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setLenient(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            c(jsonBuilder);
            return Unit.f312394a;
        }
    }

    @Nullable
    public static final Object A(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        Boolean booleanOrNull = JsonElementKt.getBooleanOrNull(jsonPrimitive);
        if (booleanOrNull != null) {
            return booleanOrNull;
        }
        Integer intOrNull = JsonElementKt.getIntOrNull(jsonPrimitive);
        if (intOrNull != null) {
            return Integer.valueOf(intOrNull.intValue());
        }
        Long longOrNull = JsonElementKt.getLongOrNull(jsonPrimitive);
        if (longOrNull != null) {
            return Long.valueOf(longOrNull.longValue());
        }
        Double doubleOrNull = JsonElementKt.getDoubleOrNull(jsonPrimitive);
        return doubleOrNull != null ? Double.valueOf(doubleOrNull.doubleValue()) : JsonElementKt.getContentOrNull(jsonPrimitive);
    }

    @NotNull
    public static final List<Object> B(@NotNull JsonArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArray, 10));
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add(z(it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> C(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(jsonObject.size()));
        Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), z((JsonElement) entry.getValue()));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final JsonArray D(@NotNull Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        for (Object obj : collection) {
            if (obj instanceof JsonElement) {
                jsonArrayBuilder.add((JsonElement) obj);
            } else {
                jsonArrayBuilder.add(F(obj));
            }
        }
        return jsonArrayBuilder.build();
    }

    @NotNull
    public static final JsonArray E(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        for (Object obj : objArr) {
            if (obj instanceof JsonElement) {
                jsonArrayBuilder.add((JsonElement) obj);
            } else {
                jsonArrayBuilder.add(F(obj));
            }
        }
        return jsonArrayBuilder.build();
    }

    @NotNull
    public static final JsonElement F(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (obj instanceof Map) {
            return H((Map) obj);
        }
        if (obj instanceof Object[]) {
            return E((Object[]) obj);
        }
        if (obj instanceof Collection) {
            return D((Collection) obj);
        }
        if (obj instanceof Pair) {
            return I((Pair) obj);
        }
        if (obj instanceof kotlin.n1) {
            return J((kotlin.n1) obj);
        }
        if (obj instanceof Map.Entry) {
            return G((Map.Entry) obj);
        }
        KSerializer<? extends Object> kSerializer = h().get(j1.d(obj.getClass()));
        if (kSerializer == null) {
            kSerializer = null;
        } else {
            Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of com.segment.analytics.kotlin.core.utilities.JsonUtils.serializerFor>");
        }
        return kSerializer != null ? Json.Default.encodeToJsonElement(kSerializer, obj) : JsonNull.INSTANCE;
    }

    @NotNull
    public static final JsonElement G(@NotNull Map.Entry<? extends Object, ? extends Object> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        JsonElement jsonElementF = F(entry.getKey());
        JsonElement jsonElementF2 = F(entry.getValue());
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        jsonObjectBuilder.put("key", jsonElementF);
        jsonObjectBuilder.put("value", jsonElementF2);
        return jsonObjectBuilder.build();
    }

    @NotNull
    public static final JsonElement H(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JsonElement) {
                jsonObjectBuilder.put(key, (JsonElement) value);
            } else {
                jsonObjectBuilder.put(key, F(value));
            }
        }
        return jsonObjectBuilder.build();
    }

    @NotNull
    public static final JsonElement I(@NotNull Pair<? extends Object, ? extends Object> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        JsonElement jsonElementF = F(pair.getFirst());
        JsonElement jsonElementF2 = F(pair.getSecond());
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        jsonObjectBuilder.put("first", jsonElementF);
        jsonObjectBuilder.put("second", jsonElementF2);
        return jsonObjectBuilder.build();
    }

    @NotNull
    public static final JsonElement J(@NotNull kotlin.n1<? extends Object, ? extends Object, ? extends Object> n1Var) {
        Intrinsics.checkNotNullParameter(n1Var, "<this>");
        JsonElement jsonElementF = F(n1Var.f());
        JsonElement jsonElementF2 = F(n1Var.g());
        JsonElement jsonElementF3 = F(n1Var.h());
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        jsonObjectBuilder.put("first", jsonElementF);
        jsonObjectBuilder.put("second", jsonElementF2);
        jsonObjectBuilder.put("third", jsonElementF3);
        return jsonObjectBuilder.build();
    }

    @NotNull
    public static final JsonObject K(@NotNull JsonObject jsonObject, @NotNull Function1<? super String, String> transform) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(jsonObject.size()));
        Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(transform.invoke(entry.getKey()), entry.getValue());
        }
        return new JsonObject(linkedHashMap);
    }

    @NotNull
    public static final JsonObject L(@NotNull JsonObject jsonObject, @NotNull Function1<? super JsonElement, ? extends JsonElement> transform) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(jsonObject.size()));
        Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), transform.invoke(entry.getValue()));
        }
        return new JsonObject(linkedHashMap);
    }

    @NotNull
    public static final JsonObject M(@NotNull JsonObject jsonObject, @NotNull Function1<? super Map<String, JsonElement>, Unit> closure) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(closure, "closure");
        Map mutableMap = MapsKt.toMutableMap(jsonObject);
        closure.invoke(mutableMap);
        return new JsonObject(mutableMap);
    }

    @Nullable
    public static final Boolean a(@NotNull JsonObject jsonObject, @NotNull String key) {
        JsonPrimitive jsonPrimitiveL;
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) key);
        if (jsonElement == null || (jsonPrimitiveL = l(jsonElement)) == null) {
            return null;
        }
        return JsonElementKt.getBooleanOrNull(jsonPrimitiveL);
    }

    @Nullable
    public static final Double b(@NotNull JsonObject jsonObject, @NotNull String key) {
        JsonPrimitive jsonPrimitiveL;
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) key);
        if (jsonElement == null || (jsonPrimitiveL = l(jsonElement)) == null) {
            return null;
        }
        return JsonElementKt.getDoubleOrNull(jsonPrimitiveL);
    }

    @NotNull
    public static final Json c() {
        return f267012a;
    }

    @Nullable
    public static final Integer d(@NotNull JsonObject jsonObject, @NotNull String key) {
        JsonPrimitive jsonPrimitiveL;
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) key);
        if (jsonElement == null || (jsonPrimitiveL = l(jsonElement)) == null) {
            return null;
        }
        return JsonElementKt.getIntOrNull(jsonPrimitiveL);
    }

    @NotNull
    public static final Json e() {
        return f267013b;
    }

    @Nullable
    public static final Long f(@NotNull JsonObject jsonObject, @NotNull String key) {
        JsonPrimitive jsonPrimitiveL;
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) key);
        if (jsonElement == null || (jsonPrimitiveL = l(jsonElement)) == null) {
            return null;
        }
        return JsonElementKt.getLongOrNull(jsonPrimitiveL);
    }

    @Nullable
    public static final List<Map<String, Object>> g(@NotNull JsonObject jsonObject, @NotNull String key) {
        JsonArray jsonArrayJ;
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) key);
        if (jsonElement == null || (jsonArrayJ = j(jsonElement)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement2 : jsonArrayJ) {
            if (jsonElement2 instanceof JsonObject) {
                arrayList.add(jsonElement2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C(JsonElementKt.getJsonObject((JsonObject) it.next())));
        }
        return arrayList2;
    }

    @NotNull
    public static final Map<kotlin.reflect.d<? extends Object>, KSerializer<? extends Object>> h() {
        return f267014c;
    }

    public static /* synthetic */ void i() {
    }

    @Nullable
    public static final JsonArray j(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        if (jsonElement instanceof JsonArray) {
            return (JsonArray) jsonElement;
        }
        return null;
    }

    @Nullable
    public static final JsonObject k(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        if (jsonElement instanceof JsonObject) {
            return (JsonObject) jsonElement;
        }
        return null;
    }

    @Nullable
    public static final JsonPrimitive l(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        if (jsonElement instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElement;
        }
        return null;
    }

    @Nullable
    public static final String m(@NotNull JsonObject jsonObject, @NotNull String key) {
        JsonPrimitive jsonPrimitiveL;
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) key);
        if (jsonElement == null || (jsonPrimitiveL = l(jsonElement)) == null) {
            return null;
        }
        return JsonElementKt.getContentOrNull(jsonPrimitiveL);
    }

    @Nullable
    public static final Set<String> n(@NotNull JsonObject jsonObject, @NotNull String key) {
        JsonArray jsonArrayJ;
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) key);
        if (jsonElement == null || (jsonArrayJ = j(jsonElement)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArrayJ, 10));
        Iterator<JsonElement> it = jsonArrayJ.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(z(it.next())));
        }
        return CollectionsKt.toSet(arrayList);
    }

    @NotNull
    public static final JsonArray o(@NotNull JsonArray jsonArray, @NotNull Map<String, String> keyMapper, @Nullable Function2<? super String, ? super JsonElement, ? extends JsonElement> function2) {
        Intrinsics.checkNotNullParameter(jsonArray, "<this>");
        Intrinsics.checkNotNullParameter(keyMapper, "keyMapper");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        for (JsonElement jsonElementO : jsonArray) {
            if (jsonElementO instanceof JsonObject) {
                jsonElementO = p((JsonObject) jsonElementO, keyMapper, function2);
            } else if (jsonElementO instanceof JsonArray) {
                jsonElementO = o((JsonArray) jsonElementO, keyMapper, function2);
            }
            jsonArrayBuilder.add(jsonElementO);
        }
        return jsonArrayBuilder.build();
    }

    @NotNull
    public static final JsonObject p(@NotNull JsonObject jsonObject, @NotNull Map<String, String> keyMapper, @Nullable Function2<? super String, ? super JsonElement, ? extends JsonElement> function2) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(keyMapper, "keyMapper");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            String str = keyMapper.get(key);
            if (str != null) {
                key = str;
            }
            if (value instanceof JsonObject) {
                value = p((JsonObject) value, keyMapper, function2);
            } else if (value instanceof JsonArray) {
                value = o((JsonArray) value, keyMapper, function2);
            }
            if (!(value instanceof JsonObject) && function2 != null) {
                value = function2.invoke(key, value);
            }
            jsonObjectBuilder.put(key, value);
        }
        return jsonObjectBuilder.build();
    }

    public static /* synthetic */ JsonArray q(JsonArray jsonArray, Map map, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        return o(jsonArray, map, function2);
    }

    public static /* synthetic */ JsonObject r(JsonObject jsonObject, Map map, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        return p(jsonObject, map, function2);
    }

    public static final void s(@NotNull JsonObjectBuilder jsonObjectBuilder, @NotNull JsonObject obj) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        Intrinsics.checkNotNullParameter(obj, "obj");
        for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
            jsonObjectBuilder.put(entry.getKey(), entry.getValue());
        }
    }

    @Nullable
    public static final JsonElement t(@NotNull JsonObjectBuilder jsonObjectBuilder, @NotNull String key, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (charSequence == null || charSequence.length() == 0) ? JsonElementBuildersKt.put(jsonObjectBuilder, key, "undefined") : JsonElementBuildersKt.put(jsonObjectBuilder, key, charSequence.toString());
    }

    public static final /* synthetic */ <T> KSerializer<T> u(kotlin.reflect.d<? extends T> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer<T> kSerializer = (KSerializer) h().get(value);
        if (kSerializer == null) {
            return null;
        }
        return kSerializer;
    }

    public static final void v(@NotNull Map<String, JsonElement> map, @NotNull String key, @NotNull Number value) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        map.put(key, JsonElementKt.JsonPrimitive(value));
    }

    public static final void w(@NotNull Map<String, JsonElement> map, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str == null) {
            map.remove(key);
        } else {
            map.put(key, JsonElementKt.JsonPrimitive(str));
        }
    }

    public static final void x(@NotNull Map<String, JsonElement> map, @NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        map.put(key, JsonElementKt.JsonPrimitive(Boolean.valueOf(z10)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static final BaseEvent y(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        String strM = m(jsonObject, "type");
        if (strM != null) {
            switch (strM.hashCode()) {
                case -907689876:
                    if (strM.equals(com.segment.analytics.kotlin.android.plugins.a.f266538j3)) {
                        return (BaseEvent) f267013b.decodeFromJsonElement(ScreenEvent.Companion.serializer(), jsonObject);
                    }
                    break;
                case -135762164:
                    if (strM.equals("identify")) {
                        return (BaseEvent) f267013b.decodeFromJsonElement(IdentifyEvent.Companion.serializer(), jsonObject);
                    }
                    break;
                case 92902992:
                    if (strM.equals("alias")) {
                        return (BaseEvent) f267013b.decodeFromJsonElement(AliasEvent.Companion.serializer(), jsonObject);
                    }
                    break;
                case 98629247:
                    if (strM.equals("group")) {
                        return (BaseEvent) f267013b.decodeFromJsonElement(GroupEvent.Companion.serializer(), jsonObject);
                    }
                    break;
                case 110621003:
                    if (strM.equals("track")) {
                        return (BaseEvent) f267013b.decodeFromJsonElement(TrackEvent.Companion.serializer(), jsonObject);
                    }
                    break;
            }
        }
        return null;
    }

    @Nullable
    public static final Object z(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        if (jsonElement instanceof JsonPrimitive) {
            return A((JsonPrimitive) jsonElement);
        }
        if (jsonElement instanceof JsonObject) {
            return C((JsonObject) jsonElement);
        }
        if (jsonElement instanceof JsonArray) {
            return B((JsonArray) jsonElement);
        }
        return null;
    }
}
