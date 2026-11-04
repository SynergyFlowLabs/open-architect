package kotlinx.serialization.json.internal;

import kotlin.a0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.serialization.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.f;
import kotlinx.serialization.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nStreamingJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n178#1,2:261\n178#1,2:263\n21#2,12:233\n35#2,15:246\n1#3:245\n1#3:265\n*S KotlinDebug\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n*L\n168#1:261,2\n169#1:263,2\n68#1:233,12\n68#1:246,15\n68#1:245\n*E\n"})
public final class StreamingJsonEncoder extends kotlinx.serialization.encoding.b implements JsonEncoder {

    @NotNull
    private final Composer composer;

    @NotNull
    private final JsonConfiguration configuration;
    private boolean forceQuoting;

    @NotNull
    private final Json json;

    @NotNull
    private final WriteMode mode;

    @Nullable
    private final JsonEncoder[] modeReuseCache;

    @Nullable
    private String polymorphicDiscriminator;

    @Nullable
    private String polymorphicSerialName;

    @NotNull
    private final f serializersModule;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamingJsonEncoder(@NotNull Composer composer, @NotNull Json json, @NotNull WriteMode mode, @Nullable JsonEncoder[] jsonEncoderArr) {
        JsonEncoder jsonEncoder;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.composer = composer;
        this.json = json;
        this.mode = mode;
        this.modeReuseCache = jsonEncoderArr;
        this.serializersModule = getJson().getSerializersModule();
        this.configuration = getJson().getConfiguration();
        int iOrdinal = mode.ordinal();
        if (jsonEncoderArr != null && ((jsonEncoder = jsonEncoderArr[iOrdinal]) != null || jsonEncoder != this)) {
            jsonEncoderArr[iOrdinal] = this;
        }
    }

    private final /* synthetic */ <T extends Composer> T composerAs(Function2<? super InternalJsonWriter, ? super Boolean, ? extends T> function2) {
        Composer composer = this.composer;
        Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
        return composer != null ? (T) this.composer : function2.invoke(this.composer.writer, Boolean.valueOf(this.forceQuoting));
    }

    private final void encodeTypeInfo(String str, String str2) {
        this.composer.nextItem();
        encodeString(str);
        this.composer.print(AbstractJsonLexerKt.COLON);
        this.composer.space();
        encodeString(str2);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    @NotNull
    public e beginStructure(@NotNull SerialDescriptor descriptor) {
        JsonEncoder jsonEncoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode writeModeSwitchMode = WriteModeKt.switchMode(getJson(), descriptor);
        char c10 = writeModeSwitchMode.begin;
        if (c10 != 0) {
            this.composer.print(c10);
            this.composer.indent();
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            String serialName = this.polymorphicSerialName;
            if (serialName == null) {
                serialName = descriptor.getSerialName();
            }
            encodeTypeInfo(str, serialName);
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        if (this.mode == writeModeSwitchMode) {
            return this;
        }
        JsonEncoder[] jsonEncoderArr = this.modeReuseCache;
        return (jsonEncoderArr == null || (jsonEncoder = jsonEncoderArr[writeModeSwitchMode.ordinal()]) == null) ? new StreamingJsonEncoder(this.composer, getJson(), writeModeSwitchMode, this.modeReuseCache) : jsonEncoder;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean z10) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(z10));
        } else {
            this.composer.print(z10);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b10) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) b10));
        } else {
            this.composer.print(b10);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeChar(char c10) {
        encodeString(String.valueOf(c10));
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double d10) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(d10));
        } else {
            this.composer.print(d10);
        }
        if (!this.configuration.getAllowSpecialFloatingPointValues() && Math.abs(d10) > Double.MAX_VALUE) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(d10), this.composer.writer.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.b
    public boolean encodeElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.composer.getWritingFirst()) {
                        this.composer.print(AbstractJsonLexerKt.COMMA);
                    }
                    this.composer.nextItem();
                    encodeString(JsonNamesMapKt.getJsonElementName(descriptor, getJson(), i10));
                    this.composer.print(AbstractJsonLexerKt.COLON);
                    this.composer.space();
                } else {
                    if (i10 == 0) {
                        this.forceQuoting = true;
                    }
                    if (i10 == 1) {
                        this.composer.print(AbstractJsonLexerKt.COMMA);
                        this.composer.space();
                        this.forceQuoting = false;
                    }
                }
            } else if (this.composer.getWritingFirst()) {
                this.forceQuoting = true;
                this.composer.nextItem();
            } else {
                if (i10 % 2 == 0) {
                    this.composer.print(AbstractJsonLexerKt.COMMA);
                    this.composer.nextItem();
                    z10 = true;
                } else {
                    this.composer.print(AbstractJsonLexerKt.COLON);
                    this.composer.space();
                }
                this.forceQuoting = z10;
            }
        } else {
            if (!this.composer.getWritingFirst()) {
                this.composer.print(AbstractJsonLexerKt.COMMA);
            }
            this.composer.nextItem();
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.getElementName(i10));
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float f10) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(f10));
        } else {
            this.composer.print(f10);
        }
        if (!this.configuration.getAllowSpecialFloatingPointValues() && Math.abs(f10) > Float.MAX_VALUE) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(f10), this.composer.writer.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (StreamingJsonEncoderKt.isUnsignedNumber(descriptor)) {
            Composer composerForUnsignedNumbers = this.composer;
            if (!(composerForUnsignedNumbers instanceof ComposerForUnsignedNumbers)) {
                composerForUnsignedNumbers = new ComposerForUnsignedNumbers(composerForUnsignedNumbers.writer, this.forceQuoting);
            }
            return new StreamingJsonEncoder(composerForUnsignedNumbers, getJson(), this.mode, (JsonEncoder[]) null);
        }
        if (StreamingJsonEncoderKt.isUnquotedLiteral(descriptor)) {
            Composer composerForUnquotedLiterals = this.composer;
            if (!(composerForUnquotedLiterals instanceof ComposerForUnquotedLiterals)) {
                composerForUnquotedLiterals = new ComposerForUnquotedLiterals(composerForUnquotedLiterals.writer, this.forceQuoting);
            }
            return new StreamingJsonEncoder(composerForUnquotedLiterals, getJson(), this.mode, (JsonEncoder[]) null);
        }
        if (this.polymorphicDiscriminator == null) {
            return super.encodeInline(descriptor);
        }
        this.polymorphicSerialName = descriptor.getSerialName();
        return this;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeInt(int i10) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(i10));
        } else {
            this.composer.print(i10);
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.polymorphicDiscriminator == null || (element instanceof JsonObject)) {
            encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
        } else {
            PolymorphicKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, element);
            throw new a0();
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeLong(long j10) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(j10));
        } else {
            this.composer.print(j10);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        this.composer.print(AbstractJsonLexerKt.NULL);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.e
    public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int i10, @NotNull d0<? super T> serializer, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (t10 != null || this.configuration.getExplicitNulls()) {
            super.encodeNullableSerializableElement(descriptor, i10, serializer, t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(@NotNull d0<? super T> serializer, T t10) {
        String strClassDiscriminator;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(this, t10);
            return;
        }
        boolean z10 = serializer instanceof kotlinx.serialization.internal.b;
        if (z10) {
            strClassDiscriminator = getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE ? PolymorphicKt.classDiscriminator(serializer.getDescriptor(), getJson()) : null;
        } else {
            int i10 = PolymorphicKt.WhenMappings.$EnumSwitchMapping$0[getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new k0();
                }
                l kind = serializer.getDescriptor().getKind();
                if (Intrinsics.areEqual(kind, m.a.f315861a) || Intrinsics.areEqual(kind, m.d.f315864a)) {
                }
            }
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

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeShort(short s10) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) s10));
        } else {
            this.composer.print(s10);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.composer.printQuoted(value);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.e
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.mode.end != 0) {
            this.composer.unIndent();
            this.composer.nextItemIfNotFirst();
            this.composer.print(this.mode.end);
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    @NotNull
    public Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.e
    @NotNull
    public f getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.e
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamingJsonEncoder(@NotNull InternalJsonWriter output, @NotNull Json json, @NotNull WriteMode mode, @NotNull JsonEncoder[] modeReuseCache) {
        this(ComposersKt.Composer(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }
}
