package kotlinx.serialization.json;

import kotlin.Unit;
import kotlin.a1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@a1
public final class JsonElementSerializer implements KSerializer<JsonElement> {

    @NotNull
    public static final JsonElementSerializer INSTANCE = new JsonElementSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.h("kotlinx.serialization.json.JsonElement", kotlinx.serialization.descriptors.d.b.f315830a, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.json.a
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return JsonElementSerializer.descriptor$lambda$5((kotlinx.serialization.descriptors.a) obj);
        }
    });

    private JsonElementSerializer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptor$lambda$5(kotlinx.serialization.descriptors.a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "JsonPrimitive", JsonElementSerializersKt.defer(new Function0() { // from class: kotlinx.serialization.json.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonElementSerializer.descriptor$lambda$5$lambda$0();
            }
        }), null, false, 12, null);
        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "JsonNull", JsonElementSerializersKt.defer(new Function0() { // from class: kotlinx.serialization.json.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonElementSerializer.descriptor$lambda$5$lambda$1();
            }
        }), null, false, 12, null);
        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "JsonLiteral", JsonElementSerializersKt.defer(new Function0() { // from class: kotlinx.serialization.json.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonElementSerializer.descriptor$lambda$5$lambda$2();
            }
        }), null, false, 12, null);
        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "JsonObject", JsonElementSerializersKt.defer(new Function0() { // from class: kotlinx.serialization.json.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonElementSerializer.descriptor$lambda$5$lambda$3();
            }
        }), null, false, 12, null);
        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "JsonArray", JsonElementSerializersKt.defer(new Function0() { // from class: kotlinx.serialization.json.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonElementSerializer.descriptor$lambda$5$lambda$4();
            }
        }), null, false, 12, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$0() {
        return JsonPrimitiveSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$1() {
        return JsonNullSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$2() {
        return JsonLiteralSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$3() {
        return JsonObjectSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$4() {
        return JsonArraySerializer.INSTANCE.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public JsonElement deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull JsonElement value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonElementSerializersKt.verify(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.encodeSerializableValue(JsonPrimitiveSerializer.INSTANCE, value);
        } else if (value instanceof JsonObject) {
            encoder.encodeSerializableValue(JsonObjectSerializer.INSTANCE, value);
        } else {
            if (!(value instanceof JsonArray)) {
                throw new k0();
            }
            encoder.encodeSerializableValue(JsonArraySerializer.INSTANCE, value);
        }
    }
}
