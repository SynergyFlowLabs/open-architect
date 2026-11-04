package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAbstractDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,81:1\n271#2,2:82\n*S KotlinDebug\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n*L\n77#1:82,2\n*E\n"})
@kotlinx.serialization.g
public abstract class a implements Decoder, d {
    public static /* synthetic */ Object decodeSerializableValue$default(a aVar, kotlinx.serialization.e eVar, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return aVar.decodeSerializableValue(eVar, obj);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @NotNull
    public d beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objDecodeValue).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.d
    public final boolean decodeBooleanElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeBoolean();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objDecodeValue).byteValue();
    }

    @Override // kotlinx.serialization.encoding.d
    public final byte decodeByteElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeByte();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objDecodeValue).charValue();
    }

    @Override // kotlinx.serialization.encoding.d
    public final char decodeCharElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeChar();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objDecodeValue).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.d
    public final double decodeDoubleElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeDouble();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int decodeEnum(@NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objDecodeValue).floatValue();
    }

    @Override // kotlinx.serialization.encoding.d
    public final float decodeFloatElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeFloat();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.d
    @NotNull
    public Decoder decodeInlineElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeInline(descriptor.getElementDescriptor(i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // kotlinx.serialization.encoding.d
    public final int decodeIntElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeInt();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objDecodeValue).longValue();
    }

    @Override // kotlinx.serialization.encoding.d
    public final long decodeLongElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeLong();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @Nullable
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.d
    @Nullable
    public final <T> T decodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int i10, @NotNull kotlinx.serialization.e<? extends T> deserializer, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!deserializer.getDescriptor().isNullable() && !decodeNotNullMark()) {
            return (T) decodeNull();
        }
        return (T) decodeSerializableValue(deserializer, t10);
    }

    @Override // kotlinx.serialization.encoding.d
    public <T> T decodeSerializableElement(@NotNull SerialDescriptor descriptor, int i10, @NotNull kotlinx.serialization.e<? extends T> deserializer, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer, t10);
    }

    public <T> T decodeSerializableValue(@NotNull kotlinx.serialization.e<? extends T> deserializer, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objDecodeValue).shortValue();
    }

    @Override // kotlinx.serialization.encoding.d
    public final short decodeShortElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeShort();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @NotNull
    public String decodeString() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objDecodeValue;
    }

    @Override // kotlinx.serialization.encoding.d
    @NotNull
    public final String decodeStringElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeString();
    }

    @NotNull
    public Object decodeValue() {
        throw new c0(j1.d(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.d
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }
}
