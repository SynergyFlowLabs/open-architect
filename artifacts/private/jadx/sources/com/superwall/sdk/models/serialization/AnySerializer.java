package com.superwall.sdk.models.serialization;

import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
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
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q1;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.z;
import kotlin.ranges.r;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAnySerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnySerializer.kt\ncom/superwall/sdk/models/serialization/AnySerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,122:1\n774#2:123\n865#2,2:124\n1187#2,2:126\n1261#2,4:128\n1246#2,4:134\n1557#2:138\n1628#2,3:139\n462#3:132\n412#3:133\n*S KotlinDebug\n*F\n+ 1 AnySerializer.kt\ncom/superwall/sdk/models/serialization/AnySerializer\n*L\n46#1:123\n46#1:124,2\n47#1:126,2\n47#1:128,4\n89#1:134,4\n99#1:138\n99#1:139,3\n89#1:132\n89#1:133\n*E\n"})
public final class AnySerializer implements KSerializer<Object> {

    @NotNull
    public static final AnySerializer INSTANCE = new AnySerializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.i("Any", m.d.f315864a, new SerialDescriptor[0], null, 8, null);

    @NotNull
    private static final SerialDescriptor listDescriptor = k.i("List<Any>", m.b.f315862a, new SerialDescriptor[0], null, 8, null);

    @NotNull
    private static final SerialDescriptor mapDescriptor = k.i("Map<String, Any>", m.c.f315863a, new SerialDescriptor[0], null, 8, null);

    private AnySerializer() {
    }

    private final List<Object> deserializeArray(JsonArray jsonArray) {
        Object objDeserializeArray;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArray, 10));
        for (JsonElement jsonElement : jsonArray) {
            if (jsonElement instanceof JsonPrimitive) {
                objDeserializeArray = INSTANCE.deserializePrimitive((JsonPrimitive) jsonElement);
            } else if (jsonElement instanceof JsonObject) {
                objDeserializeArray = INSTANCE.deserializeObject((JsonObject) jsonElement);
            } else {
                if (!(jsonElement instanceof JsonArray)) {
                    throw new c0("Unknown type in JsonArray");
                }
                objDeserializeArray = INSTANCE.deserializeArray((JsonArray) jsonElement);
            }
            arrayList.add(objDeserializeArray);
        }
        return arrayList;
    }

    private final Map<String, Object> deserializeObject(JsonObject jsonObject) {
        Object objDeserializeArray;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(jsonObject.size()));
        Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (jsonElement instanceof JsonPrimitive) {
                objDeserializeArray = INSTANCE.deserializePrimitive((JsonPrimitive) jsonElement);
            } else if (jsonElement instanceof JsonObject) {
                objDeserializeArray = INSTANCE.deserializeObject((JsonObject) jsonElement);
            } else {
                if (!(jsonElement instanceof JsonArray)) {
                    throw new c0("Unknown type in JsonObject");
                }
                objDeserializeArray = INSTANCE.deserializeArray((JsonArray) jsonElement);
            }
            linkedHashMap.put(key, objDeserializeArray);
        }
        return MapsKt.toMap(linkedHashMap);
    }

    private final Object deserializePrimitive(JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive.isString()) {
            return jsonPrimitive.getContent();
        }
        if (JsonElementKt.getBooleanOrNull(jsonPrimitive) != null) {
            return Boolean.valueOf(JsonElementKt.getBoolean(jsonPrimitive));
        }
        if (JsonElementKt.getIntOrNull(jsonPrimitive) != null) {
            return Integer.valueOf(JsonElementKt.getInt(jsonPrimitive));
        }
        if (JsonElementKt.getLongOrNull(jsonPrimitive) != null) {
            return Long.valueOf(JsonElementKt.getLong(jsonPrimitive));
        }
        if (JsonElementKt.getDoubleOrNull(jsonPrimitive) != null) {
            return Double.valueOf(JsonElementKt.getDouble(jsonPrimitive));
        }
        throw new c0("Unknown primitive type");
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    private static /* synthetic */ void getListDescriptor$annotations() {
    }

    private static /* synthetic */ void getMapDescriptor$annotations() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public Object deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder == null) {
            throw new c0("This class can be loaded only by Json");
        }
        JsonElement jsonElementDecodeJsonElement = jsonDecoder.decodeJsonElement();
        if (jsonElementDecodeJsonElement instanceof JsonPrimitive) {
            return deserializePrimitive((JsonPrimitive) jsonElementDecodeJsonElement);
        }
        if (jsonElementDecodeJsonElement instanceof JsonObject) {
            return deserializeObject((JsonObject) jsonElementDecodeJsonElement);
        }
        if (jsonElementDecodeJsonElement instanceof JsonArray) {
            return deserializeArray((JsonArray) jsonElementDecodeJsonElement);
        }
        throw new c0("Unknown type");
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof String) {
            encoder.encodeString((String) value);
            return;
        }
        if (value instanceof Boolean) {
            encoder.encodeBoolean(((Boolean) value).booleanValue());
            return;
        }
        if (value instanceof Integer) {
            encoder.encodeInt(((Number) value).intValue());
            return;
        }
        if (value instanceof Long) {
            encoder.encodeLong(((Number) value).longValue());
            return;
        }
        if (value instanceof Float) {
            encoder.encodeFloat(((Number) value).floatValue());
            return;
        }
        if (value instanceof Double) {
            encoder.encodeDouble(((Number) value).doubleValue());
            return;
        }
        if (value instanceof List) {
            encoder.encodeSerializableValue(hk.a.i(INSTANCE), CollectionsKt.filterNotNull((Iterable) value));
            return;
        }
        if (!(value instanceof Map)) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "Warning: Unsupported type " + j1.d(value.getClass()) + ", skipping...", null, null, 24, null);
            encoder.encodeNull();
            return;
        }
        Set setEntrySet = ((Map) value).entrySet();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (((Map.Entry) obj).getValue() != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Map.Entry entry : arrayList) {
            String strValueOf = String.valueOf(entry.getKey());
            Object value2 = entry.getValue();
            Intrinsics.checkNotNull(value2);
            Pair pair = TuplesKt.to(strValueOf, value2);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        encoder.encodeSerializableValue(hk.a.l(hk.a.K(q1.f312784a), INSTANCE), linkedHashMap);
    }

    @NotNull
    public final KSerializer<Object> serializerFor(@NotNull Object value) {
        KSerializer<Object> kSerializerL;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof String) {
            kSerializerL = hk.a.K(q1.f312784a);
        } else if (value instanceof Boolean) {
            kSerializerL = hk.a.C(kotlin.jvm.internal.m.f312762a);
        } else if (value instanceof Integer) {
            kSerializerL = hk.a.H(i0.f312739a);
        } else if (value instanceof Long) {
            kSerializerL = hk.a.I(o0.f312774a);
        } else if (value instanceof Float) {
            kSerializerL = hk.a.G(z.f312833a);
        } else if (value instanceof Double) {
            kSerializerL = hk.a.F(w.f312823a);
        } else if (value instanceof List) {
            kSerializerL = hk.a.i(INSTANCE);
        } else {
            kSerializerL = value instanceof Map ? hk.a.l(hk.a.K(q1.f312784a), INSTANCE) : INSTANCE;
        }
        Intrinsics.checkNotNull(kSerializerL, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializerL;
    }
}
