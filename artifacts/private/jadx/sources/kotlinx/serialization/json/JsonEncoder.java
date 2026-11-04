package kotlinx.serialization.json;

import kotlin.i1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@i1(markerClass = {w.class})
public interface JsonEncoder extends Encoder, kotlinx.serialization.encoding.e {

    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static kotlinx.serialization.encoding.e beginCollection(@NotNull JsonEncoder jsonEncoder, @NotNull SerialDescriptor descriptor, int i10) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return JsonEncoder.super.e(descriptor, i10);
        }

        @Deprecated
        @kotlinx.serialization.g
        public static void encodeNotNullMark(@NotNull JsonEncoder jsonEncoder) {
            JsonEncoder.super.encodeNotNullMark();
        }

        @Deprecated
        @kotlinx.serialization.g
        public static <T> void encodeNullableSerializableValue(@NotNull JsonEncoder jsonEncoder, @NotNull d0<? super T> serializer, @Nullable T t10) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            JsonEncoder.super.f(serializer, t10);
        }

        @Deprecated
        public static <T> void encodeSerializableValue(@NotNull JsonEncoder jsonEncoder, @NotNull d0<? super T> serializer, T t10) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            JsonEncoder.super.encodeSerializableValue(serializer, t10);
        }

        @Deprecated
        @kotlinx.serialization.g
        public static boolean shouldEncodeElementDefault(@NotNull JsonEncoder jsonEncoder, @NotNull SerialDescriptor descriptor, int i10) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return JsonEncoder.super.shouldEncodeElementDefault(descriptor, i10);
        }
    }

    void encodeJsonElement(@NotNull JsonElement jsonElement);

    @NotNull
    Json getJson();
}
