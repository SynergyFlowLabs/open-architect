package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.q;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 4 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 5 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 6 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,392:1\n78#2,6:393\n84#2,9:407\n270#3,8:399\n517#4,3:416\n517#4,3:419\n133#5,18:422\n385#6,5:440\n385#6,5:445\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n*L\n75#1:393,6\n75#1:407,9\n75#1:399,8\n202#1:416,3\n203#1:419,3\n215#1:422,18\n309#1:440,5\n316#1:445,5\n*E\n"})
public class StreamingJsonDecoder extends kotlinx.serialization.encoding.a implements JsonDecoder, kotlinx.serialization.encoding.c {

    @NotNull
    private final JsonConfiguration configuration;
    private int currentIndex;

    @Nullable
    private DiscriminatorHolder discriminatorHolder;

    @Nullable
    private final JsonElementMarker elementMarker;

    @NotNull
    private final Json json;

    @f
    @NotNull
    public final AbstractJsonLexer lexer;

    @NotNull
    private final WriteMode mode;

    @NotNull
    private final kotlinx.serialization.modules.f serializersModule;

    public static final class DiscriminatorHolder {

        @f
        @Nullable
        public String discriminatorToSkip;

        public DiscriminatorHolder(@Nullable String str) {
            this.discriminatorToSkip = str;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                int i10 = 4 & 1;
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
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamingJsonDecoder(@NotNull Json json, @NotNull WriteMode mode, @NotNull AbstractJsonLexer lexer, @NotNull SerialDescriptor descriptor, @Nullable DiscriminatorHolder discriminatorHolder) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.json = json;
        this.mode = mode;
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        this.discriminatorHolder = discriminatorHolder;
        JsonConfiguration configuration = json.getConfiguration();
        this.configuration = configuration;
        this.elementMarker = configuration.getExplicitNulls() ? null : new JsonElementMarker(descriptor);
    }

    private final void checkLeadingComma() {
        if (this.lexer.peekNextToken() != 4) {
            return;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new a0();
    }

    private final boolean coerceInputValue(SerialDescriptor serialDescriptor, int i10) {
        String strPeekString;
        Json json = this.json;
        boolean zIsElementOptional = serialDescriptor.isElementOptional(i10);
        SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i10);
        if (zIsElementOptional && !elementDescriptor.isNullable() && this.lexer.tryConsumeNull(true)) {
            return true;
        }
        if (!Intrinsics.areEqual(elementDescriptor.getKind(), l.b.f315860a) || ((elementDescriptor.isNullable() && this.lexer.tryConsumeNull(false)) || (strPeekString = this.lexer.peekString(this.configuration.isLenient())) == null)) {
            return false;
        }
        int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, strPeekString);
        boolean z10 = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (zIsElementOptional || z10)) {
            this.lexer.consumeString();
            return true;
        }
        return false;
    }

    private final int decodeListIndex() {
        boolean zTryConsumeComma = this.lexer.tryConsumeComma();
        if (!this.lexer.canConsumeValue()) {
            if (!zTryConsumeComma || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
            throw new a0();
        }
        int i10 = this.currentIndex;
        if (i10 != -1 && !zTryConsumeComma) {
            AbstractJsonLexer.fail$default(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
            throw new a0();
        }
        int i11 = i10 + 1;
        this.currentIndex = i11;
        return i11;
    }

    private final int decodeMapIndex() {
        int i10 = this.currentIndex;
        boolean zTryConsumeComma = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
        } else if (i10 != -1) {
            zTryConsumeComma = this.lexer.tryConsumeComma();
        }
        if (!this.lexer.canConsumeValue()) {
            if (!zTryConsumeComma || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
            throw new a0();
        }
        if (z10) {
            if (this.currentIndex == -1) {
                AbstractJsonLexer abstractJsonLexer = this.lexer;
                int i11 = abstractJsonLexer.currentPosition;
                if (zTryConsumeComma) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer, "Unexpected leading comma", i11, null, 4, null);
                    throw new a0();
                }
            } else {
                AbstractJsonLexer abstractJsonLexer2 = this.lexer;
                int i12 = abstractJsonLexer2.currentPosition;
                if (!zTryConsumeComma) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new a0();
                }
            }
        }
        int i13 = this.currentIndex + 1;
        this.currentIndex = i13;
        return i13;
    }

    private final int decodeObjectIndex(SerialDescriptor serialDescriptor) {
        boolean zTryConsumeComma;
        boolean zTryConsumeComma2 = this.lexer.tryConsumeComma();
        while (true) {
            boolean z10 = true;
            if (!this.lexer.canConsumeValue()) {
                if (zTryConsumeComma2 && !this.json.getConfiguration().getAllowTrailingComma()) {
                    JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                    throw new a0();
                }
                JsonElementMarker jsonElementMarker = this.elementMarker;
                if (jsonElementMarker != null) {
                    return jsonElementMarker.nextUnmarkedIndex$kotlinx_serialization_json();
                }
                return -1;
            }
            String strDecodeStringKey = decodeStringKey();
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
            int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(serialDescriptor, this.json, strDecodeStringKey);
            if (jsonNameIndex == -3) {
                zTryConsumeComma = false;
            } else {
                if (!this.configuration.getCoerceInputValues() || !coerceInputValue(serialDescriptor, jsonNameIndex)) {
                    JsonElementMarker jsonElementMarker2 = this.elementMarker;
                    if (jsonElementMarker2 != null) {
                        jsonElementMarker2.mark$kotlinx_serialization_json(jsonNameIndex);
                    }
                    return jsonNameIndex;
                }
                zTryConsumeComma = this.lexer.tryConsumeComma();
                z10 = false;
            }
            zTryConsumeComma2 = z10 ? handleUnknown(serialDescriptor, strDecodeStringKey) : zTryConsumeComma;
        }
    }

    private final String decodeStringKey() {
        return this.configuration.isLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeKeyString();
    }

    private final boolean handleUnknown(SerialDescriptor serialDescriptor, String str) {
        if (JsonNamesMapKt.ignoreUnknownKeys(serialDescriptor, this.json) || trySkip(this.discriminatorHolder, str)) {
            this.lexer.skipElement(this.configuration.isLenient());
        } else {
            this.lexer.path.popDescriptor();
            this.lexer.failOnUnknownKey(str);
        }
        return this.lexer.tryConsumeComma();
    }

    private final void skipLeftoverElements(SerialDescriptor serialDescriptor) {
        while (decodeElementIndex(serialDescriptor) != -1) {
        }
    }

    private final boolean trySkip(DiscriminatorHolder discriminatorHolder, String str) {
        if (discriminatorHolder == null || !Intrinsics.areEqual(discriminatorHolder.discriminatorToSkip, str)) {
            return false;
        }
        discriminatorHolder.discriminatorToSkip = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    @NotNull
    public kotlinx.serialization.encoding.d beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode writeModeSwitchMode = WriteModeKt.switchMode(this.json, descriptor);
        this.lexer.path.pushDescriptor(descriptor);
        this.lexer.consumeNextToken(writeModeSwitchMode.begin);
        checkLeadingComma();
        int i10 = WhenMappings.$EnumSwitchMapping$0[writeModeSwitchMode.ordinal()];
        int i11 = 7 << 1;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return new StreamingJsonDecoder(this.json, writeModeSwitchMode, this.lexer, descriptor, this.discriminatorHolder);
        }
        return (this.mode == writeModeSwitchMode && this.json.getConfiguration().getExplicitNulls()) ? this : new StreamingJsonDecoder(this.json, writeModeSwitchMode, this.lexer, descriptor, this.discriminatorHolder);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        return this.lexer.consumeBooleanLenient();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        byte b10 = (byte) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == b10) {
            return b10;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse byte for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new a0();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        String strConsumeStringLenient = this.lexer.consumeStringLenient();
        if (strConsumeStringLenient.length() == 1) {
            return strConsumeStringLenient.charAt(0);
        }
        AbstractJsonLexer.fail$default(this.lexer, "Expected single char, but got '" + strConsumeStringLenient + '\'', 0, null, 6, null);
        throw new a0();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String strConsumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            double d10 = Double.parseDouble(strConsumeStringLenient);
            if (!this.json.getConfiguration().getAllowSpecialFloatingPointValues() && Math.abs(d10) > Double.MAX_VALUE) {
                JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Double.valueOf(d10));
                throw new a0();
            }
            return d10;
        } catch (IllegalArgumentException unused) {
            int i10 = 4 ^ 6;
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'double' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new a0();
        }
    }

    @Override // kotlinx.serialization.encoding.d
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        int iDecodeMapIndex;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i10 != 2) {
            iDecodeMapIndex = i10 != 4 ? decodeListIndex() : decodeObjectIndex(descriptor);
        } else {
            iDecodeMapIndex = decodeMapIndex();
        }
        if (this.mode != WriteMode.MAP) {
            this.lexer.path.updateDescriptorIndex(iDecodeMapIndex);
        }
        return iDecodeMapIndex;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(@NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, this.json, decodeString(), " at path " + this.lexer.path.getPath());
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String strConsumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            float f10 = Float.parseFloat(strConsumeStringLenient);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues() || Math.abs(f10) <= Float.MAX_VALUE) {
                return f10;
            }
            JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Float.valueOf(f10));
            throw new a0();
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'float' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new a0();
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(descriptor) ? new JsonDecoderForUnsignedTypes(this.lexer, this.json) : super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        int i10 = (int) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == i10) {
            return i10;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse int for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new a0();
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public JsonElement decodeJsonElement() {
        return new JsonTreeReader(this.json.getConfiguration(), this.lexer).read();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return this.lexer.consumeNumericLiteral();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        JsonElementMarker jsonElementMarker = this.elementMarker;
        return ((jsonElementMarker != null ? jsonElementMarker.isUnmarkedNull$kotlinx_serialization_json() : false) || AbstractJsonLexer.tryConsumeNull$default(this.lexer, false, 1, null)) ? false : true;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    @Nullable
    public Void decodeNull() {
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.d
    public <T> T decodeSerializableElement(@NotNull SerialDescriptor descriptor, int i10, @NotNull e<? extends T> deserializer, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z10 = this.mode == WriteMode.MAP && (i10 & 1) == 0;
        if (z10) {
            this.lexer.path.resetCurrentMapKey();
        }
        T t11 = (T) super.decodeSerializableElement(descriptor, i10, deserializer, t10);
        if (z10) {
            this.lexer.path.updateCurrentMapKey(t11);
        }
        return t11;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0185  */
    /* JADX WARN: Code duplicated, block: B:47:0x0186  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0186, please report this as an issue */
    @Override // kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(@NotNull e<? extends T> deserializer) {
        String message;
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            if ((deserializer instanceof kotlinx.serialization.internal.b) && !this.json.getConfiguration().getUseArrayPolymorphism()) {
                String strClassDiscriminator = PolymorphicKt.classDiscriminator(((kotlinx.serialization.internal.b) deserializer).getDescriptor(), this.json);
                String strPeekLeadingMatchingValue = this.lexer.peekLeadingMatchingValue(strClassDiscriminator, this.configuration.isLenient());
                if (strPeekLeadingMatchingValue != null) {
                    try {
                        e eVarA = q.a((kotlinx.serialization.internal.b) deserializer, this, strPeekLeadingMatchingValue);
                        Intrinsics.checkNotNull(eVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                        this.discriminatorHolder = new DiscriminatorHolder(strClassDiscriminator);
                        return (T) eVarA.deserialize(this);
                    } catch (c0 e10) {
                        String message2 = e10.getMessage();
                        Intrinsics.checkNotNull(message2);
                        String strJ4 = StringsKt.j4(StringsKt.w5(message2, '\n', null, 2, null), ".");
                        String message3 = e10.getMessage();
                        Intrinsics.checkNotNull(message3);
                        AbstractJsonLexer.fail$default(this.lexer, strJ4, 0, StringsKt.m5(message3, '\n', ""), 2, null);
                        throw new a0();
                    }
                }
                if (deserializer != null && !getJson().getConfiguration().getUseArrayPolymorphism()) {
                    String strClassDiscriminator2 = PolymorphicKt.classDiscriminator(((kotlinx.serialization.internal.b) deserializer).getDescriptor(), getJson());
                    JsonElement jsonElementDecodeJsonElement = decodeJsonElement();
                    String serialName = ((kotlinx.serialization.internal.b) deserializer).getDescriptor().getSerialName();
                    if (jsonElementDecodeJsonElement instanceof JsonObject) {
                        JsonObject jsonObject = (JsonObject) jsonElementDecodeJsonElement;
                        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) strClassDiscriminator2);
                        try {
                            e eVarA2 = q.a((kotlinx.serialization.internal.b) deserializer, this, (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive));
                            Intrinsics.checkNotNull(eVarA2, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                            return (T) TreeJsonDecoderKt.readPolymorphicJson(getJson(), strClassDiscriminator2, jsonObject, eVarA2);
                        } catch (c0 e11) {
                            String message4 = e11.getMessage();
                            Intrinsics.checkNotNull(message4);
                            throw JsonExceptionsKt.JsonDecodingException(-1, message4, jsonObject.toString());
                        }
                    }
                    throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonObject.class).Q() + ", but had " + j1.d(jsonElementDecodeJsonElement.getClass()).Q() + " as the serialized body of " + serialName + " at element: " + this.lexer.path.getPath(), jsonElementDecodeJsonElement.toString());
                }
                return deserializer.deserialize(this);
                message = e.getMessage();
                Intrinsics.checkNotNull(message);
                if (StringsKt.V2(message, "at path", false, 2, null)) {
                    throw e;
                }
                throw new kotlinx.serialization.l(e.a(), e.getMessage() + " at path: " + this.lexer.path.getPath(), e);
            }
            return deserializer.deserialize(this);
        } catch (kotlinx.serialization.l e12) {
            message = e12.getMessage();
            Intrinsics.checkNotNull(message);
            if (StringsKt.V2(message, "at path", false, 2, null)) {
                throw e12;
            }
            throw new kotlinx.serialization.l(e12.a(), e12.getMessage() + " at path: " + this.lexer.path.getPath(), e12);
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        short s10 = (short) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == s10) {
            return s10;
        }
        int i10 = 1 << 0;
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse short for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new a0();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    @NotNull
    public String decodeString() {
        return this.configuration.isLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeString();
    }

    @Override // kotlinx.serialization.encoding.c
    public void decodeStringChunked(@NotNull Function1<? super String, Unit> consumeChunk) {
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        this.lexer.consumeStringChunked(this.configuration.isLenient(), consumeChunk);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.d
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor.getElementsCount() == 0 && JsonNamesMapKt.ignoreUnknownKeys(descriptor, this.json)) {
            skipLeftoverElements(descriptor);
        }
        if (this.lexer.tryConsumeComma() && !this.json.getConfiguration().getAllowTrailingComma()) {
            JsonExceptionsKt.invalidTrailingComma(this.lexer, "");
            throw new a0();
        }
        this.lexer.consumeNextToken(this.mode.end);
        this.lexer.path.popDescriptor();
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.d
    @NotNull
    public kotlinx.serialization.modules.f getSerializersModule() {
        return this.serializersModule;
    }
}
