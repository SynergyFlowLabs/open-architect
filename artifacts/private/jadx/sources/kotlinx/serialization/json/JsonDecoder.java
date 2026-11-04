package kotlinx.serialization.json;

import kotlin.i1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@i1(markerClass = {w.class})
public interface JsonDecoder extends Decoder, kotlinx.serialization.encoding.d {

    public static final class DefaultImpls {
        @Deprecated
        public static int decodeCollectionSize(@NotNull JsonDecoder jsonDecoder, @NotNull SerialDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return JsonDecoder.super.g(descriptor);
        }

        @Deprecated
        @kotlinx.serialization.g
        @Nullable
        public static <T> T decodeNullableSerializableValue(@NotNull JsonDecoder jsonDecoder, @NotNull kotlinx.serialization.e<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (T) JsonDecoder.super.i(deserializer);
        }

        @Deprecated
        @kotlinx.serialization.g
        public static boolean decodeSequentially(@NotNull JsonDecoder jsonDecoder) {
            return JsonDecoder.super.c();
        }

        @Deprecated
        public static <T> T decodeSerializableValue(@NotNull JsonDecoder jsonDecoder, @NotNull kotlinx.serialization.e<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (T) JsonDecoder.super.decodeSerializableValue(deserializer);
        }
    }

    @NotNull
    JsonElement decodeJsonElement();

    @NotNull
    Json getJson();
}
