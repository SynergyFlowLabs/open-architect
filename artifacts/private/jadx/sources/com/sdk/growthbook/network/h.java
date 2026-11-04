package com.sdk.growthbook.network;

import io.ktor.client.j;
import io.ktor.client.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGBNetworkDispatcherKtor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBNetworkDispatcherKtor.kt\ncom/sdk/growthbook/network/GBNetworkDispatcherKtorKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n216#2,2:219\n1869#3,2:221\n*S KotlinDebug\n*F\n+ 1 GBNetworkDispatcherKtor.kt\ncom/sdk/growthbook/network/GBNetworkDispatcherKtorKt\n*L\n190#1:219,2\n206#1:221,2\n*E\n"})
public final class h {
    @NotNull
    public static final io.ktor.client.c d() {
        return m.b(new Function1() { // from class: com.sdk.growthbook.network.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.e((j) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(j HttpClient) {
        Intrinsics.checkNotNullParameter(HttpClient, "$this$HttpClient");
        HttpClient.r(io.ktor.client.plugins.contentnegotiation.e.k(), new Function1() { // from class: com.sdk.growthbook.network.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.f((io.ktor.client.plugins.contentnegotiation.b) obj);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(io.ktor.client.plugins.contentnegotiation.b install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        io.ktor.serialization.kotlinx.json.e.e(install, JsonKt.Json$default(null, new Function1() { // from class: com.sdk.growthbook.network.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.g((JsonBuilder) obj);
            }
        }, 1, null), null, 2, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setPrettyPrint(true);
        Json.setLenient(true);
        Json.setIgnoreUnknownKeys(true);
        return Unit.f312394a;
    }

    @NotNull
    public static final JsonElement h(@NotNull List<?> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                if (obj instanceof Map) {
                    arrayList.add(i((Map) obj));
                } else if (obj instanceof List) {
                    arrayList.add(h((List) obj));
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
    public static final JsonElement i(@NotNull Map<?, ?> map) {
        Object value;
        JsonElement jsonElementJsonPrimitive;
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null && (value = entry.getValue()) != null) {
                if (value instanceof Map) {
                    jsonElementJsonPrimitive = i((Map) value);
                } else if (value instanceof List) {
                    jsonElementJsonPrimitive = h((List) value);
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
}
