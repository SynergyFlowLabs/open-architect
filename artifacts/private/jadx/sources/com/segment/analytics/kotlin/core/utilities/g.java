package com.segment.analytics.kotlin.core.utilities;

import com.segment.analytics.kotlin.core.BaseEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.d0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEventManipulationFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventManipulationFunctions.kt\ncom/segment/analytics/kotlin/core/utilities/EventTransformer\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n53#1:150\n53#1:151\n53#1:152\n28#2,4:153\n28#2,4:157\n28#2,3:161\n28#2,4:164\n31#2:168\n28#2,3:176\n31#2:181\n28#2,3:182\n31#2:187\n540#3:169\n525#3,6:170\n1855#4,2:179\n1855#4,2:185\n*S KotlinDebug\n*F\n+ 1 EventManipulationFunctions.kt\ncom/segment/analytics/kotlin/core/utilities/EventTransformer\n*L\n15#1:150\n23#1:151\n34#1:152\n38#1:153,4\n57#1:157,4\n87#1:161,3\n89#1:164,4\n87#1:168\n121#1:176,3\n121#1:181\n140#1:182,3\n140#1:187\n115#1:169\n115#1:170,6\n124#1:179,2\n143#1:185,2\n*E\n"})
@oj.i(name = "EventTransformer")
public final class g {
    @NotNull
    public static final BaseEvent a(@NotNull BaseEvent baseEvent, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, BaseEvent.f266644b, Boolean.FALSE);
        if (list != null) {
            for (String str : list) {
                if (baseEvent.g().containsKey((Object) str)) {
                    if (o.a(baseEvent.g(), str) != null) {
                        JsonElementBuildersKt.put(jsonObjectBuilder, str, Boolean.TRUE);
                    } else {
                        Object obj = baseEvent.g().get((Object) str);
                        Intrinsics.checkNotNull(obj);
                        jsonObjectBuilder.put(str, (JsonElement) obj);
                    }
                }
            }
        }
        baseEvent.p(jsonObjectBuilder.build());
        return baseEvent;
    }

    public static /* synthetic */ BaseEvent b(BaseEvent baseEvent, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = null;
            int i11 = 3 << 0;
        }
        return a(baseEvent, list);
    }

    @NotNull
    public static final BaseEvent c(@NotNull BaseEvent baseEvent, @NotNull String integrationName) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(integrationName, "integrationName");
        Boolean bool = Boolean.FALSE;
        Json.Default.getSerializersModule();
        return q(baseEvent, integrationName, bool, kotlinx.serialization.internal.i.f315935a);
    }

    @NotNull
    public static final BaseEvent d(@NotNull BaseEvent baseEvent, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, BaseEvent.f266644b, Boolean.TRUE);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                JsonElementBuildersKt.put(jsonObjectBuilder, (String) it.next(), Boolean.FALSE);
            }
        }
        baseEvent.p(jsonObjectBuilder.build());
        return baseEvent;
    }

    public static /* synthetic */ BaseEvent e(BaseEvent baseEvent, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = null;
        }
        return d(baseEvent, list);
    }

    @NotNull
    public static final BaseEvent f(@NotNull BaseEvent baseEvent, @NotNull String integrationName) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(integrationName, "integrationName");
        if (!baseEvent.g().containsKey((Object) integrationName)) {
            Boolean bool = Boolean.TRUE;
            Json.Default.getSerializersModule();
            return q(baseEvent, integrationName, bool, kotlinx.serialization.internal.i.f315935a);
        }
        Boolean boolA = o.a(baseEvent.g(), integrationName);
        if (boolA != null && !boolA.booleanValue()) {
            Boolean bool2 = Boolean.TRUE;
            Json.Default.getSerializersModule();
            baseEvent = q(baseEvent, integrationName, bool2, kotlinx.serialization.internal.i.f315935a);
        }
        return baseEvent;
    }

    @NotNull
    public static final BaseEvent g(@NotNull BaseEvent baseEvent, @NotNull String key, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return l(baseEvent, key, JsonElementKt.JsonPrimitive(bool));
    }

    @NotNull
    public static final BaseEvent h(@NotNull BaseEvent baseEvent, @NotNull String key, @Nullable Number number) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return l(baseEvent, key, JsonElementKt.JsonPrimitive(number));
    }

    public static final /* synthetic */ <T> BaseEvent i(BaseEvent baseEvent, String key, T value) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.modules.f serializersModule = Json.Default.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return j(baseEvent, key, value, m0.o(serializersModule, null));
    }

    @NotNull
    public static final <T> BaseEvent j(@NotNull BaseEvent baseEvent, @NotNull String key, @NotNull T value, @NotNull d0<? super T> serializationStrategy) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        return l(baseEvent, key, Json.Default.encodeToJsonElement(serializationStrategy, value));
    }

    @NotNull
    public static final BaseEvent k(@NotNull BaseEvent baseEvent, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return l(baseEvent, key, JsonElementKt.JsonPrimitive(str));
    }

    @NotNull
    public static final BaseEvent l(@NotNull BaseEvent baseEvent, @NotNull String key, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        o.s(jsonObjectBuilder, baseEvent.e());
        jsonObjectBuilder.put(key, jsonElement);
        baseEvent.n(jsonObjectBuilder.build());
        return baseEvent;
    }

    public static final /* synthetic */ <T> BaseEvent m(BaseEvent baseEvent, String parentKey, String key, T value) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(parentKey, "parentKey");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.modules.f serializersModule = Json.Default.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return n(baseEvent, parentKey, key, value, m0.o(serializersModule, null));
    }

    @NotNull
    public static final <T> BaseEvent n(@NotNull BaseEvent baseEvent, @NotNull String parentKey, @NotNull String key, @NotNull T value, @NotNull d0<? super T> serializationStrategy) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(parentKey, "parentKey");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        return o(baseEvent, parentKey, key, Json.Default.encodeToJsonElement(serializationStrategy, value));
    }

    @NotNull
    public static final BaseEvent o(@NotNull BaseEvent baseEvent, @NotNull String parentKey, @NotNull String key, @NotNull JsonElement jsonElement) {
        JsonObject jsonObjectB;
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(parentKey, "parentKey");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        JsonElement jsonElement2 = (JsonElement) baseEvent.e().get((Object) parentKey);
        if (jsonElement2 == null || (jsonObjectB = o.k(jsonElement2)) == null) {
            jsonObjectB = com.segment.analytics.kotlin.core.l.b();
        }
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        o.s(jsonObjectBuilder, baseEvent.e());
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        o.s(jsonObjectBuilder2, jsonObjectB);
        jsonObjectBuilder2.put(key, jsonElement);
        jsonObjectBuilder.put(parentKey, jsonObjectBuilder2.build());
        baseEvent.n(jsonObjectBuilder.build());
        return baseEvent;
    }

    public static final /* synthetic */ <T> BaseEvent p(BaseEvent baseEvent, String key, T value) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.modules.f serializersModule = Json.Default.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return q(baseEvent, key, value, m0.o(serializersModule, null));
    }

    @NotNull
    public static final <T> BaseEvent q(@NotNull BaseEvent baseEvent, @NotNull String key, @NotNull T value, @NotNull d0<? super T> serializationStrategy) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        return r(baseEvent, key, Json.Default.encodeToJsonElement(serializationStrategy, value));
    }

    @NotNull
    public static final BaseEvent r(@NotNull BaseEvent baseEvent, @NotNull String key, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        o.s(jsonObjectBuilder, baseEvent.g());
        jsonObjectBuilder.put(key, jsonElement);
        baseEvent.p(jsonObjectBuilder.build());
        return baseEvent;
    }

    @NotNull
    public static final BaseEvent s(@NotNull BaseEvent baseEvent, @NotNull String key) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        JsonObject jsonObjectE = baseEvent.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObjectE.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        baseEvent.n(new JsonObject(linkedHashMap));
        return baseEvent;
    }
}
