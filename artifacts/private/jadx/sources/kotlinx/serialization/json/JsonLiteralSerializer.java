package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import kotlin.text.d0;
import kotlin.y1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonExceptionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nJsonElementSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementSerializers.kt\nkotlinx/serialization/json/JsonLiteralSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
final class JsonLiteralSerializer implements KSerializer<JsonLiteral> {

    @NotNull
    public static final JsonLiteralSerializer INSTANCE = new JsonLiteralSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.c("kotlinx.serialization.json.JsonLiteral", kotlinx.serialization.descriptors.e.i.f315839a);

    private JsonLiteralSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public JsonLiteral deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementDecodeJsonElement = JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
        if (jsonElementDecodeJsonElement instanceof JsonLiteral) {
            return (JsonLiteral) jsonElementDecodeJsonElement;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonLiteral, had " + j1.d(jsonElementDecodeJsonElement.getClass()), jsonElementDecodeJsonElement.toString());
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull JsonLiteral value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonElementSerializersKt.verify(encoder);
        if (value.isString()) {
            encoder.encodeString(value.getContent());
            return;
        }
        if (value.getCoerceToInlineType$kotlinx_serialization_json() != null) {
            encoder.encodeInline(value.getCoerceToInlineType$kotlinx_serialization_json()).encodeString(value.getContent());
            return;
        }
        Long lC1 = StringsKt.c1(value.getContent());
        if (lC1 != null) {
            encoder.encodeLong(lC1.longValue());
            return;
        }
        y1 y1VarO = d0.o(value.getContent());
        if (y1VarO != null) {
            encoder.encodeInline(hk.a.z(y1.f313456b).getDescriptor()).encodeLong(y1VarO.z0());
            return;
        }
        Double dL0 = StringsKt.L0(value.getContent());
        if (dL0 != null) {
            encoder.encodeDouble(dL0.doubleValue());
            return;
        }
        Boolean boolD5 = StringsKt.D5(value.getContent());
        if (boolD5 != null) {
            encoder.encodeBoolean(boolD5.booleanValue());
        } else {
            encoder.encodeString(value.getContent());
        }
    }
}
