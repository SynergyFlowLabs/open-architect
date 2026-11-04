package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class JsonTransformingSerializer<T> implements KSerializer<T> {

    @NotNull
    private final KSerializer<T> tSerializer;

    public JsonTransformingSerializer(@NotNull KSerializer<T> tSerializer) {
        Intrinsics.checkNotNullParameter(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // kotlinx.serialization.e
    public final T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonDecoder jsonDecoderAsJsonDecoder = JsonElementSerializersKt.asJsonDecoder(decoder);
        return (T) jsonDecoderAsJsonDecoder.getJson().decodeFromJsonElement(this.tSerializer, transformDeserialize(jsonDecoderAsJsonDecoder.decodeJsonElement()));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, T t10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        JsonEncoder jsonEncoderAsJsonEncoder = JsonElementSerializersKt.asJsonEncoder(encoder);
        jsonEncoderAsJsonEncoder.encodeJsonElement(transformSerialize(TreeJsonEncoderKt.writeJson(jsonEncoderAsJsonEncoder.getJson(), t10, this.tSerializer)));
    }

    @NotNull
    protected JsonElement transformDeserialize(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }

    @NotNull
    protected JsonElement transformSerialize(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }
}
