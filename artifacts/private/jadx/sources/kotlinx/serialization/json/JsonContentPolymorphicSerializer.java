package kotlinx.serialization.json;

import kotlin.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.text.b0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class JsonContentPolymorphicSerializer<T> implements KSerializer<T> {

    @NotNull
    private final kotlin.reflect.d<T> baseClass;

    @NotNull
    private final SerialDescriptor descriptor;

    public JsonContentPolymorphicSerializer(@NotNull kotlin.reflect.d<T> baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.descriptor = k.i("JsonContentPolymorphicSerializer<" + baseClass.Q() + b0.f313281f, kotlinx.serialization.descriptors.d.b.f315830a, new SerialDescriptor[0], null, 8, null);
    }

    private final Void throwSubtypeNotRegistered(kotlin.reflect.d<?> dVar, kotlin.reflect.d<?> dVar2) {
        String strQ = dVar.Q();
        if (strQ == null) {
            strQ = String.valueOf(dVar);
        }
        throw new c0("Class '" + strQ + "' is not registered for polymorphic serialization " + ("in the scope of '" + dVar2.Q() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonDecoder jsonDecoderAsJsonDecoder = JsonElementSerializersKt.asJsonDecoder(decoder);
        JsonElement jsonElementDecodeJsonElement = jsonDecoderAsJsonDecoder.decodeJsonElement();
        kotlinx.serialization.e<T> eVarSelectDeserializer = selectDeserializer(jsonElementDecodeJsonElement);
        Intrinsics.checkNotNull(eVarSelectDeserializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return (T) jsonDecoderAsJsonDecoder.getJson().decodeFromJsonElement((KSerializer) eVarSelectDeserializer, jsonElementDecodeJsonElement);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @NotNull
    protected abstract kotlinx.serialization.e<T> selectDeserializer(@NotNull JsonElement jsonElement);

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer kSerializerH = encoder.getSerializersModule().h(this.baseClass, value);
        if (kSerializerH == null) {
            KSerializer kSerializerQ = m0.q(j1.d(value.getClass()));
            if (kSerializerQ == null) {
                throwSubtypeNotRegistered(j1.d(value.getClass()), this.baseClass);
                throw new a0();
            }
            kSerializerH = kSerializerQ;
        }
        ((KSerializer) kSerializerH).serialize(encoder, value);
    }
}
