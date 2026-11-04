package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlinx.serialization.i
@SourceDebugExtension({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,342:1\n1#2:343\n271#3,2:344\n*S KotlinDebug\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n*L\n287#1:344,2\n*E\n"})
public abstract class f3<Tag> implements Decoder, kotlinx.serialization.encoding.d {
    private boolean flag;

    @NotNull
    private final ArrayList<Tag> tagStack = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(f3 f3Var, kotlinx.serialization.e eVar, Object obj) {
        return (eVar.getDescriptor().isNullable() || f3Var.decodeNotNullMark()) ? f3Var.decodeSerializableValue(eVar, obj) : f3Var.decodeNull();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(f3 f3Var, kotlinx.serialization.e eVar, Object obj) {
        return f3Var.decodeSerializableValue(eVar, obj);
    }

    private final <E> E n(Tag tag, Function0<? extends E> function0) {
        pushTag(tag);
        E eInvoke = function0.invoke();
        if (!this.flag) {
            popTag();
        }
        this.flag = false;
        return eInvoke;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @NotNull
    public kotlinx.serialization.encoding.d beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    protected final void copyTagsTo(@NotNull f3<Tag> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other.tagStack.addAll(this.tagStack);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean decodeBoolean() {
        return decodeTaggedBoolean(popTag());
    }

    @Override // kotlinx.serialization.encoding.d
    public final boolean decodeBooleanElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedBoolean(getTag(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        return decodeTaggedByte(popTag());
    }

    @Override // kotlinx.serialization.encoding.d
    public final byte decodeByteElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedByte(getTag(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char decodeChar() {
        return decodeTaggedChar(popTag());
    }

    @Override // kotlinx.serialization.encoding.d
    public final char decodeCharElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedChar(getTag(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double decodeDouble() {
        return decodeTaggedDouble(popTag());
    }

    @Override // kotlinx.serialization.encoding.d
    public final double decodeDoubleElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedDouble(getTag(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int decodeEnum(@NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return decodeTaggedEnum(popTag(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float decodeFloat() {
        return decodeTaggedFloat(popTag());
    }

    @Override // kotlinx.serialization.encoding.d
    public final float decodeFloatElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedFloat(getTag(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedInline(popTag(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.d
    @NotNull
    public final Decoder decodeInlineElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedInline(getTag(descriptor, i10), descriptor.getElementDescriptor(i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        return decodeTaggedInt(popTag());
    }

    @Override // kotlinx.serialization.encoding.d
    public final int decodeIntElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedInt(getTag(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        return decodeTaggedLong(popTag());
    }

    @Override // kotlinx.serialization.encoding.d
    public final long decodeLongElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedLong(getTag(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        Tag currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            return false;
        }
        return decodeTaggedNotNullMark(currentTagOrNull);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @Nullable
    public final Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.d
    @Nullable
    public final <T> T decodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int i10, @NotNull final kotlinx.serialization.e<? extends T> deserializer, @Nullable final T t10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) n(getTag(descriptor, i10), new Function0() { // from class: kotlinx.serialization.internal.e3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f3.l(this.f315911a, deserializer, t10);
            }
        });
    }

    @Override // kotlinx.serialization.encoding.d
    public final <T> T decodeSerializableElement(@NotNull SerialDescriptor descriptor, int i10, @NotNull final kotlinx.serialization.e<? extends T> deserializer, @Nullable final T t10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) n(getTag(descriptor, i10), new Function0() { // from class: kotlinx.serialization.internal.d3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f3.m(this.f315905a, deserializer, t10);
            }
        });
    }

    protected <T> T decodeSerializableValue(@NotNull kotlinx.serialization.e<? extends T> deserializer, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        return decodeTaggedShort(popTag());
    }

    @Override // kotlinx.serialization.encoding.d
    public final short decodeShortElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedShort(getTag(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @NotNull
    public final String decodeString() {
        return decodeTaggedString(popTag());
    }

    @Override // kotlinx.serialization.encoding.d
    @NotNull
    public final String decodeStringElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedString(getTag(descriptor, i10));
    }

    protected boolean decodeTaggedBoolean(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objDecodeTaggedValue).booleanValue();
    }

    protected byte decodeTaggedByte(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objDecodeTaggedValue).byteValue();
    }

    protected char decodeTaggedChar(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objDecodeTaggedValue).charValue();
    }

    protected double decodeTaggedDouble(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objDecodeTaggedValue).doubleValue();
    }

    protected int decodeTaggedEnum(Tag tag, @NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeTaggedValue).intValue();
    }

    protected float decodeTaggedFloat(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objDecodeTaggedValue).floatValue();
    }

    @NotNull
    protected Decoder decodeTaggedInline(Tag tag, @NotNull SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        pushTag(tag);
        return this;
    }

    protected int decodeTaggedInt(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeTaggedValue).intValue();
    }

    protected long decodeTaggedLong(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objDecodeTaggedValue).longValue();
    }

    protected boolean decodeTaggedNotNullMark(Tag tag) {
        return true;
    }

    @Nullable
    protected Void decodeTaggedNull(Tag tag) {
        return null;
    }

    protected short decodeTaggedShort(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objDecodeTaggedValue).shortValue();
    }

    @NotNull
    protected String decodeTaggedString(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objDecodeTaggedValue;
    }

    @NotNull
    protected Object decodeTaggedValue(Tag tag) {
        throw new kotlinx.serialization.c0(kotlin.jvm.internal.j1.d(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.d
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    protected final Tag getCurrentTag() {
        return (Tag) CollectionsKt.last((List) this.tagStack);
    }

    @Nullable
    protected final Tag getCurrentTagOrNull() {
        return (Tag) CollectionsKt.lastOrNull((List) this.tagStack);
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.d
    @NotNull
    public kotlinx.serialization.modules.f getSerializersModule() {
        return kotlinx.serialization.modules.h.a();
    }

    protected abstract Tag getTag(@NotNull SerialDescriptor serialDescriptor, int i10);

    @NotNull
    public final ArrayList<Tag> getTagStack$kotlinx_serialization_core() {
        return this.tagStack;
    }

    protected final Tag popTag() {
        ArrayList<Tag> arrayList = this.tagStack;
        Tag tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.flag = true;
        return tagRemove;
    }

    protected final void pushTag(Tag tag) {
        this.tagStack.add(tag);
    }
}
