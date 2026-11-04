package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nDecoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Decoding.kt\nkotlinx/serialization/encoding/Decoder\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,576:1\n271#2,2:577\n*S KotlinDebug\n*F\n+ 1 Decoding.kt\nkotlinx/serialization/encoding/Decoder\n*L\n264#1:577,2\n*E\n"})
public interface Decoder {

    public static final class a {
        @Deprecated
        @kotlinx.serialization.g
        @Nullable
        public static <T> T a(@NotNull Decoder decoder, @NotNull kotlinx.serialization.e<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (T) Decoder.super.i(deserializer);
        }

        @Deprecated
        public static <T> T b(@NotNull Decoder decoder, @NotNull kotlinx.serialization.e<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (T) Decoder.super.decodeSerializableValue(deserializer);
        }
    }

    @NotNull
    d beginStructure(@NotNull SerialDescriptor serialDescriptor);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(@NotNull SerialDescriptor serialDescriptor);

    float decodeFloat();

    @NotNull
    Decoder decodeInline(@NotNull SerialDescriptor serialDescriptor);

    int decodeInt();

    long decodeLong();

    @kotlinx.serialization.g
    boolean decodeNotNullMark();

    @kotlinx.serialization.g
    @Nullable
    Void decodeNull();

    default <T> T decodeSerializableValue(@NotNull kotlinx.serialization.e<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    short decodeShort();

    @NotNull
    String decodeString();

    @NotNull
    kotlinx.serialization.modules.f getSerializersModule();

    @kotlinx.serialization.g
    @Nullable
    default <T> T i(@NotNull kotlinx.serialization.e<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (deserializer.getDescriptor().isNullable() || decodeNotNullMark()) ? (T) decodeSerializableValue(deserializer) : (T) decodeNull();
    }
}
