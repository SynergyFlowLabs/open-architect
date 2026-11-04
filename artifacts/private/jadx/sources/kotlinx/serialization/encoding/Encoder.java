package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface Encoder {

    public static final class a {
        @Deprecated
        @NotNull
        public static e a(@NotNull Encoder encoder, @NotNull SerialDescriptor descriptor, int i10) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return Encoder.super.e(descriptor, i10);
        }

        @Deprecated
        @kotlinx.serialization.g
        public static void b(@NotNull Encoder encoder) {
            Encoder.super.encodeNotNullMark();
        }

        @Deprecated
        @kotlinx.serialization.g
        public static <T> void c(@NotNull Encoder encoder, @NotNull d0<? super T> serializer, @Nullable T t10) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            Encoder.super.f(serializer, t10);
        }

        @Deprecated
        public static <T> void d(@NotNull Encoder encoder, @NotNull d0<? super T> serializer, T t10) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            Encoder.super.encodeSerializableValue(serializer, t10);
        }
    }

    @NotNull
    e beginStructure(@NotNull SerialDescriptor serialDescriptor);

    @NotNull
    default e e(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return beginStructure(descriptor);
    }

    void encodeBoolean(boolean z10);

    void encodeByte(byte b10);

    void encodeChar(char c10);

    void encodeDouble(double d10);

    void encodeEnum(@NotNull SerialDescriptor serialDescriptor, int i10);

    void encodeFloat(float f10);

    @NotNull
    Encoder encodeInline(@NotNull SerialDescriptor serialDescriptor);

    void encodeInt(int i10);

    void encodeLong(long j10);

    @kotlinx.serialization.g
    default void encodeNotNullMark() {
    }

    @kotlinx.serialization.g
    void encodeNull();

    /* JADX WARN: Multi-variable type inference failed */
    default <T> void encodeSerializableValue(@NotNull d0<? super T> serializer, T t10) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        serializer.serialize(this, t10);
    }

    void encodeShort(short s10);

    void encodeString(@NotNull String str);

    @kotlinx.serialization.g
    default <T> void f(@NotNull d0<? super T> serializer, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (serializer.getDescriptor().isNullable()) {
            encodeSerializableValue(serializer, t10);
        } else if (t10 == null) {
            encodeNull();
        } else {
            encodeNotNullMark();
            encodeSerializableValue(serializer, t10);
        }
    }

    @NotNull
    kotlinx.serialization.modules.f getSerializersModule();
}
