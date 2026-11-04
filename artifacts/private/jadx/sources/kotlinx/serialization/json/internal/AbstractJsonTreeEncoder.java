package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.a0;
import kotlin.e2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.q1;
import kotlin.u1;
import kotlin.y1;
import kotlinx.serialization.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.s1;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.q;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTreeJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,279:1\n21#2,12:280\n35#2,15:293\n1#3:292\n36#4,9:308\n*S KotlinDebug\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n*L\n83#1:280,12\n83#1:293,15\n83#1:292\n153#1:308,9\n*E\n"})
abstract class AbstractJsonTreeEncoder extends s1 implements JsonEncoder {

    @f
    @NotNull
    protected final JsonConfiguration configuration;

    @NotNull
    private final Json json;

    @NotNull
    private final Function1<JsonElement, Unit> nodeConsumer;

    @Nullable
    private String polymorphicDiscriminator;

    @Nullable
    private String polymorphicSerialName;

    public /* synthetic */ AbstractJsonTreeEncoder(Json json, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beginStructure$lambda$2(AbstractJsonTreeEncoder abstractJsonTreeEncoder, JsonElement node) {
        Intrinsics.checkNotNullParameter(node, "node");
        abstractJsonTreeEncoder.putElement(abstractJsonTreeEncoder.getCurrentTag(), node);
        return Unit.f312394a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1] */
    private final AnonymousClass1 inlineUnquotedLiteralEncoder(final String str, final SerialDescriptor serialDescriptor) {
        return new kotlinx.serialization.encoding.b() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.inlineUnquotedLiteralEncoder.1
            @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
            public void encodeString(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AbstractJsonTreeEncoder.this.putElement(str, new JsonLiteral(value, false, serialDescriptor));
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.e
            public kotlinx.serialization.modules.f getSerializersModule() {
                return AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1] */
    @SuppressAnimalSniffer
    private final C28501 inlineUnsignedNumberEncoder(final String str) {
        return new kotlinx.serialization.encoding.b() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.inlineUnsignedNumberEncoder.1
            private final kotlinx.serialization.modules.f serializersModule;

            {
                this.serializersModule = AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }

            @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
            public void encodeByte(byte b10) {
                putUnquotedString(q1.s0(q1.n(b10)));
            }

            @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
            public void encodeInt(int i10) {
                putUnquotedString(Integer.toUnsignedString(u1.n(i10)));
            }

            @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
            public void encodeLong(long j10) {
                putUnquotedString(Long.toUnsignedString(y1.n(j10)));
            }

            @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
            public void encodeShort(short s10) {
                putUnquotedString(e2.s0(e2.n(s10)));
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.e
            public kotlinx.serialization.modules.f getSerializersModule() {
                return this.serializersModule;
            }

            public final void putUnquotedString(String s10) {
                Intrinsics.checkNotNullParameter(s10, "s");
                AbstractJsonTreeEncoder.this.putElement(str, new JsonLiteral(s10, false, null, 4, null));
            }
        };
    }

    @Override // kotlinx.serialization.internal.g3, kotlinx.serialization.encoding.Encoder
    @NotNull
    public e beginStructure(@NotNull SerialDescriptor descriptor) {
        AbstractJsonTreeEncoder jsonTreeListEncoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Function1<JsonElement, Unit> function1 = getCurrentTagOrNull() == null ? this.nodeConsumer : new Function1() { // from class: kotlinx.serialization.json.internal.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractJsonTreeEncoder.beginStructure$lambda$2(this.f316069a, (JsonElement) obj);
            }
        };
        l kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, m.b.f315862a) || (kind instanceof kotlinx.serialization.descriptors.d)) {
            jsonTreeListEncoder = new JsonTreeListEncoder(this.json, function1);
        } else if (Intrinsics.areEqual(kind, m.c.f315863a)) {
            Json json = this.json;
            SerialDescriptor serialDescriptorCarrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
            l kind2 = serialDescriptorCarrierDescriptor.getKind();
            if ((kind2 instanceof kotlinx.serialization.descriptors.e) || Intrinsics.areEqual(kind2, l.b.f315860a)) {
                jsonTreeListEncoder = new JsonTreeMapEncoder(this.json, function1);
            } else {
                if (!json.getConfiguration().getAllowStructuredMapKeys()) {
                    throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
                }
                jsonTreeListEncoder = new JsonTreeListEncoder(this.json, function1);
            }
        } else {
            jsonTreeListEncoder = new JsonTreeEncoder(this.json, function1);
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            if (jsonTreeListEncoder instanceof JsonTreeMapEncoder) {
                JsonTreeMapEncoder jsonTreeMapEncoder = (JsonTreeMapEncoder) jsonTreeListEncoder;
                jsonTreeMapEncoder.putElement("key", JsonElementKt.JsonPrimitive(str));
                String serialName = this.polymorphicSerialName;
                if (serialName == null) {
                    serialName = descriptor.getSerialName();
                }
                jsonTreeMapEncoder.putElement("value", JsonElementKt.JsonPrimitive(serialName));
            } else {
                String serialName2 = this.polymorphicSerialName;
                if (serialName2 == null) {
                    serialName2 = descriptor.getSerialName();
                }
                jsonTreeListEncoder.putElement(str, JsonElementKt.JsonPrimitive(serialName2));
            }
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        return jsonTreeListEncoder;
    }

    @Override // kotlinx.serialization.internal.s1
    @NotNull
    protected String composeName(@NotNull String parentName, @NotNull String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.internal.s1
    @NotNull
    protected String elementName(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return JsonNamesMapKt.getJsonElementName(descriptor, this.json, i10);
    }

    @Override // kotlinx.serialization.internal.g3, kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (getCurrentTagOrNull() == null) {
            return new JsonPrimitiveEncoder(this.json, this.nodeConsumer).encodeInline(descriptor);
        }
        if (this.polymorphicDiscriminator != null) {
            this.polymorphicSerialName = descriptor.getSerialName();
        }
        return super.encodeInline(descriptor);
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.polymorphicDiscriminator != null && !(element instanceof JsonObject)) {
            PolymorphicKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, element);
            throw new a0();
        }
        encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.internal.g3, kotlinx.serialization.encoding.Encoder
    public void encodeNotNullMark() {
    }

    @Override // kotlinx.serialization.internal.g3, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            this.nodeConsumer.invoke(JsonNull.INSTANCE);
        } else {
            encodeTaggedNull(currentTagOrNull);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(@NotNull d0<? super T> serializer, T t10) {
        String strClassDiscriminator;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (getCurrentTagOrNull() == null && TreeJsonEncoderKt.getRequiresTopLevelTag(WriteModeKt.carrierDescriptor(serializer.getDescriptor(), getSerializersModule()))) {
            new JsonPrimitiveEncoder(this.json, this.nodeConsumer).encodeSerializableValue(serializer, t10);
            return;
        }
        if (getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(this, t10);
            return;
        }
        boolean z10 = serializer instanceof kotlinx.serialization.internal.b;
        if (!z10) {
            int i10 = PolymorphicKt.WhenMappings.$EnumSwitchMapping$0[getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new k0();
                }
                l kind = serializer.getDescriptor().getKind();
                strClassDiscriminator = (Intrinsics.areEqual(kind, m.a.f315861a) || Intrinsics.areEqual(kind, m.d.f315864a)) ? PolymorphicKt.classDiscriminator(serializer.getDescriptor(), getJson()) : null;
            }
        } else if (getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE) {
        }
        if (z10) {
            kotlinx.serialization.internal.b bVar = (kotlinx.serialization.internal.b) serializer;
            if (t10 == 0) {
                throw new IllegalArgumentException(("Value for serializer " + bVar.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            d0<? super T> d0VarB = q.b(bVar, this, t10);
            if (strClassDiscriminator != null) {
                PolymorphicKt.validateIfSealed(serializer, d0VarB, strClassDiscriminator);
                PolymorphicKt.checkKind(d0VarB.getDescriptor().getKind());
            }
            Intrinsics.checkNotNull(d0VarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = d0VarB;
        }
        if (strClassDiscriminator != null) {
            String serialName = serializer.getDescriptor().getSerialName();
            this.polymorphicDiscriminator = strClassDiscriminator;
            this.polymorphicSerialName = serialName;
        }
        serializer.serialize(this, t10);
    }

    @Override // kotlinx.serialization.internal.g3
    protected void endEncode(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.nodeConsumer.invoke(getCurrent());
    }

    @NotNull
    public abstract JsonElement getCurrent();

    @Override // kotlinx.serialization.json.JsonEncoder
    @NotNull
    public final Json getJson() {
        return this.json;
    }

    @NotNull
    protected final Function1<JsonElement, Unit> getNodeConsumer() {
        return this.nodeConsumer;
    }

    @Override // kotlinx.serialization.internal.g3, kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.e
    @NotNull
    public final kotlinx.serialization.modules.f getSerializersModule() {
        return this.json.getSerializersModule();
    }

    public abstract void putElement(@NotNull String str, @NotNull JsonElement jsonElement);

    @Override // kotlinx.serialization.encoding.e
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractJsonTreeEncoder(Json json, Function1<? super JsonElement, Unit> function1) {
        this.json = json;
        this.nodeConsumer = function1;
        this.configuration = json.getConfiguration();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    public void encodeTaggedBoolean(@NotNull String tag, boolean z10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Boolean.valueOf(z10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    public void encodeTaggedByte(@NotNull String tag, byte b10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Byte.valueOf(b10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    public void encodeTaggedChar(@NotNull String tag, char c10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(String.valueOf(c10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    public void encodeTaggedDouble(@NotNull String tag, double d10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Double.valueOf(d10)));
        if (!this.configuration.getAllowSpecialFloatingPointValues() && Math.abs(d10) > Double.MAX_VALUE) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(d10), tag, getCurrent().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    public void encodeTaggedEnum(@NotNull String tag, @NotNull SerialDescriptor enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        putElement(tag, JsonElementKt.JsonPrimitive(enumDescriptor.getElementName(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    public void encodeTaggedFloat(@NotNull String tag, float f10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Float.valueOf(f10)));
        if (!this.configuration.getAllowSpecialFloatingPointValues() && Math.abs(f10) > Float.MAX_VALUE) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(f10), tag, getCurrent().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    @NotNull
    public Encoder encodeTaggedInline(@NotNull String tag, @NotNull SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
            return inlineUnsignedNumberEncoder(tag);
        }
        return StreamingJsonEncoderKt.isUnquotedLiteral(inlineDescriptor) ? inlineUnquotedLiteralEncoder(tag, inlineDescriptor) : super.encodeTaggedInline(tag, inlineDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    public void encodeTaggedInt(@NotNull String tag, int i10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Integer.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    public void encodeTaggedLong(@NotNull String tag, long j10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Long.valueOf(j10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    public void encodeTaggedNull(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonNull.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    public void encodeTaggedShort(@NotNull String tag, short s10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Short.valueOf(s10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    public void encodeTaggedString(@NotNull String tag, @NotNull String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        putElement(tag, JsonElementKt.JsonPrimitive(value));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.g3
    public void encodeTaggedValue(@NotNull String tag, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        putElement(tag, JsonElementKt.JsonPrimitive(value.toString()));
    }
}
