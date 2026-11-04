package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface e {

    public static final class a {
        @Deprecated
        @kotlinx.serialization.g
        public static boolean a(@NotNull e eVar, @NotNull SerialDescriptor descriptor, int i10) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return e.super.shouldEncodeElementDefault(descriptor, i10);
        }
    }

    void encodeBooleanElement(@NotNull SerialDescriptor serialDescriptor, int i10, boolean z10);

    void encodeByteElement(@NotNull SerialDescriptor serialDescriptor, int i10, byte b10);

    void encodeCharElement(@NotNull SerialDescriptor serialDescriptor, int i10, char c10);

    void encodeDoubleElement(@NotNull SerialDescriptor serialDescriptor, int i10, double d10);

    void encodeFloatElement(@NotNull SerialDescriptor serialDescriptor, int i10, float f10);

    @NotNull
    Encoder encodeInlineElement(@NotNull SerialDescriptor serialDescriptor, int i10);

    void encodeIntElement(@NotNull SerialDescriptor serialDescriptor, int i10, int i11);

    void encodeLongElement(@NotNull SerialDescriptor serialDescriptor, int i10, long j10);

    @kotlinx.serialization.g
    <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull d0<? super T> d0Var, @Nullable T t10);

    <T> void encodeSerializableElement(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull d0<? super T> d0Var, T t10);

    void encodeShortElement(@NotNull SerialDescriptor serialDescriptor, int i10, short s10);

    void encodeStringElement(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull String str);

    void endStructure(@NotNull SerialDescriptor serialDescriptor);

    @NotNull
    kotlinx.serialization.modules.f getSerializersModule();

    @kotlinx.serialization.g
    default boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean z10 = false | true;
        return true;
    }
}
