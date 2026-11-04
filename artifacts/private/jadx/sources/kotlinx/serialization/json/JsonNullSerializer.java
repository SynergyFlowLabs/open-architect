package kotlinx.serialization.json;

import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonDecodingException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@a1
public final class JsonNullSerializer implements KSerializer<JsonNull> {

    @NotNull
    public static final JsonNullSerializer INSTANCE = new JsonNullSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.i("kotlinx.serialization.json.JsonNull", l.b.f315860a, new SerialDescriptor[0], null, 8, null);

    private JsonNullSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public JsonNull deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElementSerializersKt.verify(decoder);
        if (decoder.decodeNotNullMark()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.decodeNull();
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull JsonNull value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonElementSerializersKt.verify(encoder);
        encoder.encodeNull();
    }
}
