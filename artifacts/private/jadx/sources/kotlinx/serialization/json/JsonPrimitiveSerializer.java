package kotlinx.serialization.json;

import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonExceptionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@a1
public final class JsonPrimitiveSerializer implements KSerializer<JsonPrimitive> {

    @NotNull
    public static final JsonPrimitiveSerializer INSTANCE = new JsonPrimitiveSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.i("kotlinx.serialization.json.JsonPrimitive", kotlinx.serialization.descriptors.e.i.f315839a, new SerialDescriptor[0], null, 8, null);

    static {
        boolean z10 = true | false;
    }

    private JsonPrimitiveSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public JsonPrimitive deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementDecodeJsonElement = JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
        if (jsonElementDecodeJsonElement instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementDecodeJsonElement;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonPrimitive, had " + j1.d(jsonElementDecodeJsonElement.getClass()), jsonElementDecodeJsonElement.toString());
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull JsonPrimitive value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonElementSerializersKt.verify(encoder);
        if (value instanceof JsonNull) {
            encoder.encodeSerializableValue(JsonNullSerializer.INSTANCE, JsonNull.INSTANCE);
        } else {
            encoder.encodeSerializableValue(JsonLiteralSerializer.INSTANCE, (JsonLiteral) value);
        }
    }
}
