package com.superwall.sdk.models.serialization;

import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import java.util.ArrayList;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAnyMapSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnyMapSerializer.kt\ncom/superwall/sdk/models/serialization/AnyMapSerializer\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,180:1\n29#2,2:181\n31#2:185\n216#3,2:183\n126#3:186\n153#3,3:187\n*S KotlinDebug\n*F\n+ 1 AnyMapSerializer.kt\ncom/superwall/sdk/models/serialization/AnyMapSerializer\n*L\n33#1:181,2\n33#1:185\n34#1:183,2\n63#1:186\n63#1:187,3\n*E\n"})
public final class AnyMapSerializer implements KSerializer<Map<String, ? extends Object>> {

    @NotNull
    public static final AnyMapSerializer INSTANCE = new AnyMapSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.e("AnyMap", new SerialDescriptor[0], new Function1() { // from class: com.superwall.sdk.models.serialization.a
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AnyMapSerializer.descriptor$lambda$0((kotlinx.serialization.descriptors.a) obj);
        }
    });

    private AnyMapSerializer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptor$lambda$0(kotlinx.serialization.descriptors.a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        k.t(hk.a.K(q1.f312784a).getDescriptor(), JsonElement.Companion.serializer().getDescriptor());
        return Unit.f312394a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public Map<String, Object> deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder == null) {
            throw new c0("This class can be loaded only by Json");
        }
        JsonObject jsonObject = JsonElementKt.getJsonObject(jsonDecoder.decodeJsonElement());
        ArrayList arrayList = new ArrayList(jsonObject.size());
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), JsonElementKt.getJsonPrimitive(entry.getValue()).getContent()));
        }
        return MapsKt.toMap(arrayList);
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonEncoder jsonEncoder = encoder instanceof JsonEncoder ? (JsonEncoder) encoder : null;
        if (jsonEncoder == null) {
            throw new c0("This class can be saved only by Json");
        }
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (Map.Entry<String, ? extends Object> entry : value.entrySet()) {
            String key = entry.getKey();
            Object value2 = entry.getValue();
            if (value2 instanceof String) {
                jsonObjectBuilder.put(key, JsonElementKt.JsonPrimitive((String) value2));
            } else if (value2 instanceof Integer) {
                jsonObjectBuilder.put(key, JsonElementKt.JsonPrimitive((Number) value2));
            } else if (value2 instanceof Double) {
                jsonObjectBuilder.put(key, JsonElementKt.JsonPrimitive((Number) value2));
            } else if (value2 instanceof Boolean) {
                jsonObjectBuilder.put(key, JsonElementKt.JsonPrimitive((Boolean) value2));
            } else if (value2 == null) {
                jsonObjectBuilder.put(key, JsonNull.INSTANCE);
            } else {
                jsonObjectBuilder.put(key, JsonNull.INSTANCE);
                int i10 = 4 ^ 0;
                Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "!! Warning: Unsupported type " + j1.d(value2.getClass()) + ", skipping...", null, null, 24, null);
                Unit unit = Unit.f312394a;
            }
        }
        jsonEncoder.encodeJsonElement(jsonObjectBuilder.build());
    }
}
