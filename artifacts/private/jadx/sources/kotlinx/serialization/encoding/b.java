package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.c0;
import kotlinx.serialization.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.t1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@kotlinx.serialization.g
public abstract class b implements Encoder, e {
    @Override // kotlinx.serialization.encoding.Encoder
    @NotNull
    public e beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean z10) {
        encodeValue(Boolean.valueOf(z10));
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeBooleanElement(@NotNull SerialDescriptor descriptor, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeBoolean(z10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b10) {
        encodeValue(Byte.valueOf(b10));
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeByteElement(@NotNull SerialDescriptor descriptor, int i10, byte b10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeByte(b10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeChar(char c10) {
        encodeValue(Character.valueOf(c10));
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeCharElement(@NotNull SerialDescriptor descriptor, int i10, char c10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeChar(c10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double d10) {
        encodeValue(Double.valueOf(d10));
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeDoubleElement(@NotNull SerialDescriptor descriptor, int i10, double d10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeDouble(d10);
        }
    }

    public boolean encodeElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeValue(Integer.valueOf(i10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float f10) {
        encodeValue(Float.valueOf(f10));
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeFloatElement(@NotNull SerialDescriptor descriptor, int i10, float f10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeFloat(f10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.e
    @NotNull
    public final Encoder encodeInlineElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return encodeElement(descriptor, i10) ? encodeInline(descriptor.getElementDescriptor(i10)) : t1.f316015a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeInt(int i10) {
        encodeValue(Integer.valueOf(i10));
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeIntElement(@NotNull SerialDescriptor descriptor, int i10, int i11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeInt(i11);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeLong(long j10) {
        encodeValue(Long.valueOf(j10));
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeLongElement(@NotNull SerialDescriptor descriptor, int i10, long j10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeLong(j10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        throw new c0("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.e
    public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int i10, @NotNull d0<? super T> serializer, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (encodeElement(descriptor, i10)) {
            f(serializer, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.e
    public <T> void encodeSerializableElement(@NotNull SerialDescriptor descriptor, int i10, @NotNull d0<? super T> serializer, T t10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (encodeElement(descriptor, i10)) {
            encodeSerializableValue(serializer, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeShort(short s10) {
        encodeValue(Short.valueOf(s10));
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeShortElement(@NotNull SerialDescriptor descriptor, int i10, short s10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeShort(s10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        encodeValue(value);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeStringElement(@NotNull SerialDescriptor descriptor, int i10, @NotNull String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (encodeElement(descriptor, i10)) {
            encodeString(value);
        }
    }

    public void encodeValue(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new c0("Non-serializable " + j1.d(value.getClass()) + " is not supported by " + j1.d(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.e
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }
}
