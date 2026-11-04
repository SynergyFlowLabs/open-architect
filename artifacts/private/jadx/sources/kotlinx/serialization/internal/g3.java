package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlinx.serialization.i
@SourceDebugExtension({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
public abstract class g3<Tag> implements Encoder, kotlinx.serialization.encoding.e {

    @NotNull
    private final ArrayList<Tag> tagStack = new ArrayList<>();

    private final boolean h(SerialDescriptor serialDescriptor, int i10) {
        pushTag(getTag(serialDescriptor, i10));
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @NotNull
    public kotlinx.serialization.encoding.e beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeBoolean(boolean z10) {
        encodeTaggedBoolean(popTag(), z10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeBooleanElement(@NotNull SerialDescriptor descriptor, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedBoolean(getTag(descriptor, i10), z10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte b10) {
        encodeTaggedByte(popTag(), b10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeByteElement(@NotNull SerialDescriptor descriptor, int i10, byte b10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedByte(getTag(descriptor, i10), b10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeChar(char c10) {
        encodeTaggedChar(popTag(), c10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeCharElement(@NotNull SerialDescriptor descriptor, int i10, char c10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedChar(getTag(descriptor, i10), c10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeDouble(double d10) {
        encodeTaggedDouble(popTag(), d10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeDoubleElement(@NotNull SerialDescriptor descriptor, int i10, double d10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedDouble(getTag(descriptor, i10), d10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeTaggedEnum(popTag(), enumDescriptor, i10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeFloat(float f10) {
        encodeTaggedFloat(popTag(), f10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeFloatElement(@NotNull SerialDescriptor descriptor, int i10, float f10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedFloat(getTag(descriptor, i10), f10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return encodeTaggedInline(popTag(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.e
    @NotNull
    public final Encoder encodeInlineElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return encodeTaggedInline(getTag(descriptor, i10), descriptor.getElementDescriptor(i10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeInt(int i10) {
        encodeTaggedInt(popTag(), i10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeIntElement(@NotNull SerialDescriptor descriptor, int i10, int i11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedInt(getTag(descriptor, i10), i11);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeLong(long j10) {
        encodeTaggedLong(popTag(), j10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeLongElement(@NotNull SerialDescriptor descriptor, int i10, long j10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedLong(getTag(descriptor, i10), j10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNotNullMark() {
        encodeTaggedNonNullMark(getCurrentTag());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        encodeTaggedNull(popTag());
    }

    @Override // kotlinx.serialization.encoding.e
    public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int i10, @NotNull kotlinx.serialization.d0<? super T> serializer, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (h(descriptor, i10)) {
            f(serializer, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.e
    public <T> void encodeSerializableElement(@NotNull SerialDescriptor descriptor, int i10, @NotNull kotlinx.serialization.d0<? super T> serializer, T t10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (h(descriptor, i10)) {
            encodeSerializableValue(serializer, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeShort(short s10) {
        encodeTaggedShort(popTag(), s10);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeShortElement(@NotNull SerialDescriptor descriptor, int i10, short s10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedShort(getTag(descriptor, i10), s10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        encodeTaggedString(popTag(), value);
    }

    @Override // kotlinx.serialization.encoding.e
    public final void encodeStringElement(@NotNull SerialDescriptor descriptor, int i10, @NotNull String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        encodeTaggedString(getTag(descriptor, i10), value);
    }

    protected void encodeTaggedBoolean(Tag tag, boolean z10) {
        encodeTaggedValue(tag, Boolean.valueOf(z10));
    }

    protected void encodeTaggedByte(Tag tag, byte b10) {
        encodeTaggedValue(tag, Byte.valueOf(b10));
    }

    protected void encodeTaggedChar(Tag tag, char c10) {
        encodeTaggedValue(tag, Character.valueOf(c10));
    }

    protected void encodeTaggedDouble(Tag tag, double d10) {
        encodeTaggedValue(tag, Double.valueOf(d10));
    }

    protected void encodeTaggedEnum(Tag tag, @NotNull SerialDescriptor enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeTaggedValue(tag, Integer.valueOf(i10));
    }

    protected void encodeTaggedFloat(Tag tag, float f10) {
        encodeTaggedValue(tag, Float.valueOf(f10));
    }

    @NotNull
    protected Encoder encodeTaggedInline(Tag tag, @NotNull SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        pushTag(tag);
        return this;
    }

    protected void encodeTaggedInt(Tag tag, int i10) {
        encodeTaggedValue(tag, Integer.valueOf(i10));
    }

    protected void encodeTaggedLong(Tag tag, long j10) {
        encodeTaggedValue(tag, Long.valueOf(j10));
    }

    protected void encodeTaggedNonNullMark(Tag tag) {
    }

    protected void encodeTaggedNull(Tag tag) {
        throw new kotlinx.serialization.c0("null is not supported");
    }

    protected void encodeTaggedShort(Tag tag, short s10) {
        encodeTaggedValue(tag, Short.valueOf(s10));
    }

    protected void encodeTaggedString(Tag tag, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        encodeTaggedValue(tag, value);
    }

    protected void encodeTaggedValue(Tag tag, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new kotlinx.serialization.c0("Non-serializable " + kotlin.jvm.internal.j1.d(value.getClass()) + " is not supported by " + kotlin.jvm.internal.j1.d(getClass()) + " encoder");
    }

    protected void endEncode(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.e
    public final void endStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.tagStack.isEmpty()) {
            popTag();
        }
        endEncode(descriptor);
    }

    protected final Tag getCurrentTag() {
        return (Tag) CollectionsKt.last((List) this.tagStack);
    }

    @Nullable
    protected final Tag getCurrentTagOrNull() {
        return (Tag) CollectionsKt.lastOrNull((List) this.tagStack);
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.e
    @NotNull
    public kotlinx.serialization.modules.f getSerializersModule() {
        return kotlinx.serialization.modules.h.a();
    }

    protected abstract Tag getTag(@NotNull SerialDescriptor serialDescriptor, int i10);

    protected final Tag popTag() {
        if (this.tagStack.isEmpty()) {
            throw new kotlinx.serialization.c0("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.tagStack;
        return arrayList.remove(CollectionsKt.getLastIndex(arrayList));
    }

    protected final void pushTag(Tag tag) {
        this.tagStack.add(tag);
    }
}
