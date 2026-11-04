package kotlinx.serialization.json.internal;

import androidx.collection.g3;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.media3.exoplayer.upstream.h;
import kotlin.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.r1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.q;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 4 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 5 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,348:1\n73#1:373\n73#1:387\n73#1:398\n73#1:408\n74#1:433\n74#1:442\n84#1:451\n74#1:452\n87#1:461\n74#1:462\n88#1,5:471\n87#1:476\n74#1:477\n88#1,5:486\n87#1:491\n74#1:492\n88#1,5:501\n87#1:506\n74#1:507\n88#1,5:516\n87#1:521\n74#1:522\n88#1,5:531\n87#1:536\n74#1:537\n88#1,5:546\n87#1:551\n74#1:552\n88#1,5:561\n87#1:566\n74#1:567\n88#1,5:576\n74#1:581\n84#1:590\n74#1:591\n1#2:349\n78#3,6:350\n84#3,9:364\n270#4,8:356\n270#4,8:374\n270#4,8:388\n270#4,8:399\n270#4,8:409\n270#4,8:417\n270#4,8:425\n270#4,8:434\n270#4,8:443\n270#4,8:453\n270#4,8:463\n270#4,8:478\n270#4,8:493\n270#4,8:508\n270#4,8:523\n270#4,8:538\n270#4,8:553\n270#4,8:568\n270#4,8:582\n270#4,8:592\n36#5,5:382\n41#5,2:396\n44#5:407\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n*L\n63#1:373\n66#1:387\n67#1:398\n69#1:408\n84#1:433\n87#1:442\n104#1:451\n104#1:452\n111#1:461\n111#1:462\n111#1:471,5\n113#1:476\n113#1:477\n113#1:486,5\n119#1:491\n119#1:492\n119#1:501,5\n125#1:506\n125#1:507\n125#1:516,5\n131#1:521\n131#1:522\n131#1:531,5\n134#1:536\n134#1:537\n134#1:546,5\n141#1:551\n141#1:552\n141#1:561,5\n147#1:566\n147#1:567\n147#1:576,5\n150#1:581\n163#1:590\n163#1:591\n55#1:350,6\n55#1:364,9\n55#1:356,8\n63#1:374,8\n66#1:388,8\n67#1:399,8\n69#1:409,8\n73#1:417,8\n74#1:425,8\n84#1:434,8\n87#1:443,8\n104#1:453,8\n111#1:463,8\n113#1:478,8\n119#1:493,8\n125#1:508,8\n131#1:523,8\n134#1:538,8\n141#1:553,8\n147#1:568,8\n150#1:582,8\n163#1:592,8\n64#1:382,5\n64#1:396,2\n64#1:407\n*E\n"})
abstract class AbstractJsonTreeDecoder extends r1 implements JsonDecoder {

    @f
    @NotNull
    protected final JsonConfiguration configuration;

    @NotNull
    private final Json json;

    @Nullable
    private final String polymorphicDiscriminator;

    @NotNull
    private final JsonElement value;

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, str);
    }

    private final Void unparsedPrimitive(JsonPrimitive jsonPrimitive, String str, String str2) {
        StringBuilder sb2;
        String str3;
        if (StringsKt.u2(str, h.f65997k, false, 2, null)) {
            sb2 = new StringBuilder();
            str3 = "an ";
        } else {
            sb2 = new StringBuilder();
            str3 = "a ";
        }
        sb2.append(str3);
        sb2.append(str);
        throw JsonExceptionsKt.JsonDecodingException(-1, "Failed to parse literal '" + jsonPrimitive + "' as " + sb2.toString() + " value at element: " + renderTagStack(str2), currentObject().toString());
    }

    @Override // kotlinx.serialization.internal.f3, kotlinx.serialization.encoding.Decoder
    @NotNull
    public kotlinx.serialization.encoding.d beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement jsonElementCurrentObject = currentObject();
        l kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, m.b.f315862a) || (kind instanceof kotlinx.serialization.descriptors.d)) {
            Json json = getJson();
            String serialName = descriptor.getSerialName();
            if (jsonElementCurrentObject instanceof JsonArray) {
                return new JsonTreeListDecoder(json, (JsonArray) jsonElementCurrentObject);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonArray.class).Q() + ", but had " + j1.d(jsonElementCurrentObject.getClass()).Q() + " as the serialized body of " + serialName + " at element: " + renderTagStack(), jsonElementCurrentObject.toString());
        }
        if (!Intrinsics.areEqual(kind, m.c.f315863a)) {
            Json json2 = getJson();
            String serialName2 = descriptor.getSerialName();
            if (jsonElementCurrentObject instanceof JsonObject) {
                return new JsonTreeDecoder(json2, (JsonObject) jsonElementCurrentObject, this.polymorphicDiscriminator, null, 8, null);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonObject.class).Q() + ", but had " + j1.d(jsonElementCurrentObject.getClass()).Q() + " as the serialized body of " + serialName2 + " at element: " + renderTagStack(), jsonElementCurrentObject.toString());
        }
        Json json3 = getJson();
        SerialDescriptor serialDescriptorCarrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json3.getSerializersModule());
        l kind2 = serialDescriptorCarrierDescriptor.getKind();
        if ((kind2 instanceof e) || Intrinsics.areEqual(kind2, l.b.f315860a)) {
            Json json4 = getJson();
            String serialName3 = descriptor.getSerialName();
            if (jsonElementCurrentObject instanceof JsonObject) {
                return new JsonTreeMapDecoder(json4, (JsonObject) jsonElementCurrentObject);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonObject.class).Q() + ", but had " + j1.d(jsonElementCurrentObject.getClass()).Q() + " as the serialized body of " + serialName3 + " at element: " + renderTagStack(), jsonElementCurrentObject.toString());
        }
        if (!json3.getConfiguration().getAllowStructuredMapKeys()) {
            throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
        }
        Json json5 = getJson();
        String serialName4 = descriptor.getSerialName();
        if (jsonElementCurrentObject instanceof JsonArray) {
            return new JsonTreeListDecoder(json5, (JsonArray) jsonElementCurrentObject);
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonArray.class).Q() + ", but had " + j1.d(jsonElementCurrentObject.getClass()).Q() + " as the serialized body of " + serialName4 + " at element: " + renderTagStack(), jsonElementCurrentObject.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends JsonElement> T cast(JsonElement value, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String serialName = descriptor.getSerialName();
        Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
        if (value != 0) {
            return value;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        int i10 = 3 << 4;
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        sb2.append(j1.d(JsonElement.class).Q());
        sb2.append(", but had ");
        sb2.append(j1.d(value.getClass()).Q());
        sb2.append(" as the serialized body of ");
        sb2.append(serialName);
        sb2.append(" at element: ");
        sb2.append(renderTagStack());
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), value.toString());
    }

    @Override // kotlinx.serialization.internal.r1
    @NotNull
    protected String composeName(@NotNull String parentName, @NotNull String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public abstract JsonElement currentElement(@NotNull String str);

    @NotNull
    protected final JsonElement currentObject() {
        JsonElement jsonElementCurrentElement;
        String currentTagOrNull = getCurrentTagOrNull();
        return (currentTagOrNull == null || (jsonElementCurrentElement = currentElement(currentTagOrNull)) == null) ? getValue() : jsonElementCurrentElement;
    }

    @Override // kotlinx.serialization.internal.f3, kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return getCurrentTagOrNull() != null ? super.decodeInline(descriptor) : new JsonPrimitiveDecoder(getJson(), getValue(), this.polymorphicDiscriminator).decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public JsonElement decodeJsonElement() {
        return currentObject();
    }

    @Override // kotlinx.serialization.internal.f3, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(currentObject() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(@NotNull kotlinx.serialization.e<? extends T> deserializer) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof kotlinx.serialization.internal.b) || getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.deserialize(this);
        }
        kotlinx.serialization.internal.b bVar = (kotlinx.serialization.internal.b) deserializer;
        String strClassDiscriminator = PolymorphicKt.classDiscriminator(bVar.getDescriptor(), getJson());
        JsonElement jsonElementDecodeJsonElement = decodeJsonElement();
        String serialName = bVar.getDescriptor().getSerialName();
        if (jsonElementDecodeJsonElement instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElementDecodeJsonElement;
            JsonElement jsonElement = (JsonElement) jsonObject.get((Object) strClassDiscriminator);
            try {
                kotlinx.serialization.e eVarA = q.a((kotlinx.serialization.internal.b) deserializer, this, (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive));
                Intrinsics.checkNotNull(eVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) TreeJsonDecoderKt.readPolymorphicJson(getJson(), strClassDiscriminator, jsonObject, eVarA);
            } catch (c0 e10) {
                String message = e10.getMessage();
                Intrinsics.checkNotNull(message);
                throw JsonExceptionsKt.JsonDecodingException(-1, message, jsonObject.toString());
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonObject.class).Q() + ", but had " + j1.d(jsonElementDecodeJsonElement.getClass()).Q() + " as the serialized body of " + serialName + " at element: " + renderTagStack(), jsonElementDecodeJsonElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    @Nullable
    public Void decodeTaggedNull(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return null;
    }

    @Override // kotlinx.serialization.internal.f3, kotlinx.serialization.encoding.d
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public Json getJson() {
        return this.json;
    }

    @Nullable
    protected final String getPolymorphicDiscriminator() {
        return this.polymorphicDiscriminator;
    }

    @NotNull
    protected final JsonPrimitive getPrimitiveValue(@NotNull String tag, @NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        String serialName = descriptor.getSerialName();
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementCurrentElement;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of " + serialName + " at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    @Override // kotlinx.serialization.internal.f3, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.d
    @NotNull
    public kotlinx.serialization.modules.f getSerializersModule() {
        return getJson().getSerializersModule();
    }

    @NotNull
    public JsonElement getValue() {
        return this.value;
    }

    @NotNull
    public final String renderTagStack(@NotNull String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return renderTagStack() + '.' + currentTag;
    }

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, (i10 & 4) != 0 ? null : str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    public boolean decodeTaggedBoolean(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                Boolean booleanOrNull = JsonElementKt.getBooleanOrNull(jsonPrimitive);
                if (booleanOrNull != null) {
                    return booleanOrNull.booleanValue();
                }
                unparsedPrimitive(jsonPrimitive, "boolean", tag);
                throw new a0();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "boolean", tag);
                throw new a0();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of boolean at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    public byte decodeTaggedByte(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                long longImpl = JsonElementKt.parseLongImpl(jsonPrimitive);
                Byte bValueOf = (-128 > longImpl || longImpl > 127) ? null : Byte.valueOf((byte) longImpl);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                unparsedPrimitive(jsonPrimitive, io.sentry.profilemeasurements.a.f306070m, tag);
                throw new a0();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, io.sentry.profilemeasurements.a.f306070m, tag);
                throw new a0();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of " + io.sentry.profilemeasurements.a.f306070m + " at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    public char decodeTaggedChar(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                return StringsKt.H8(jsonPrimitive.getContent());
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "char", tag);
                throw new a0();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of char at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    public double decodeTaggedDouble(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                double d10 = JsonElementKt.getDouble(jsonPrimitive);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues() || Math.abs(d10) <= Double.MAX_VALUE) {
                    return d10;
                }
                throw JsonExceptionsKt.InvalidFloatingPointDecoded(Double.valueOf(d10), tag, currentObject().toString());
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "double", tag);
                throw new a0();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of double at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    public int decodeTaggedEnum(@NotNull String tag, @NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Json json = getJson();
        JsonElement jsonElementCurrentElement = currentElement(tag);
        String serialName = enumDescriptor.getSerialName();
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            return JsonNamesMapKt.getJsonNameIndexOrThrow$default(enumDescriptor, json, ((JsonPrimitive) jsonElementCurrentElement).getContent(), null, 4, null);
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of " + serialName + " at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    public float decodeTaggedFloat(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                float f10 = JsonElementKt.getFloat(jsonPrimitive);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues() || Math.abs(f10) <= Float.MAX_VALUE) {
                    return f10;
                }
                throw JsonExceptionsKt.InvalidFloatingPointDecoded(Float.valueOf(f10), tag, currentObject().toString());
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "float", tag);
                throw new a0();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of float at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    @NotNull
    public Decoder decodeTaggedInline(@NotNull String tag, @NotNull SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (!StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
            return super.decodeTaggedInline(tag, inlineDescriptor);
        }
        Json json = getJson();
        JsonElement jsonElementCurrentElement = currentElement(tag);
        String serialName = inlineDescriptor.getSerialName();
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            return new JsonDecoderForUnsignedTypes(StringJsonLexerKt.StringJsonLexer(json, ((JsonPrimitive) jsonElementCurrentElement).getContent()), getJson());
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of " + serialName + " at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    public int decodeTaggedInt(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                long longImpl = JsonElementKt.parseLongImpl(jsonPrimitive);
                Integer numValueOf = (g3.f12261h > longImpl || longImpl > g3.f12256c) ? null : Integer.valueOf((int) longImpl);
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                unparsedPrimitive(jsonPrimitive, "int", tag);
                throw new a0();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "int", tag);
                throw new a0();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of int at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    public long decodeTaggedLong(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                return JsonElementKt.parseLongImpl(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "long", tag);
                throw new a0();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of long at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    public boolean decodeTaggedNotNullMark(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return currentElement(tag) != JsonNull.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    public short decodeTaggedShort(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                long longImpl = JsonElementKt.parseLongImpl(jsonPrimitive);
                Short shValueOf = (-32768 > longImpl || longImpl > 32767) ? null : Short.valueOf((short) longImpl);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                unparsedPrimitive(jsonPrimitive, "short", tag);
                throw new a0();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "short", tag);
                throw new a0();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of short at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.f3
    @NotNull
    public String decodeTaggedString(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (!(jsonElementCurrentElement instanceof JsonPrimitive)) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of " + v.b.f43988e + " at element: " + renderTagStack(tag), jsonElementCurrentElement.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
        if (!(jsonPrimitive instanceof JsonLiteral)) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + renderTagStack(tag), currentObject().toString());
        }
        JsonLiteral jsonLiteral = (JsonLiteral) jsonPrimitive;
        if (jsonLiteral.isString() || getJson().getConfiguration().isLenient()) {
            return jsonLiteral.getContent();
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "String literal for key '" + tag + "' should be quoted at element: " + renderTagStack(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", currentObject().toString());
    }

    private AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str) {
        this.json = json;
        this.value = jsonElement;
        this.polymorphicDiscriminator = str;
        this.configuration = getJson().getConfiguration();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends JsonElement> T cast(JsonElement value, String serialName, String tag) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
        if (value != 0) {
            return value;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        sb2.append(j1.d(JsonElement.class).Q());
        sb2.append(", but had ");
        sb2.append(j1.d(value.getClass()).Q());
        sb2.append(" as the serialized body of ");
        sb2.append(serialName);
        sb2.append(" at element: ");
        sb2.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), value.toString());
    }

    private final <T> T getPrimitiveValue(String str, String str2, Function1<? super JsonPrimitive, ? extends T> function1) {
        JsonElement jsonElementCurrentElement = currentElement(str);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                T tInvoke = function1.invoke(jsonPrimitive);
                if (tInvoke != null) {
                    return tInvoke;
                }
                unparsedPrimitive(jsonPrimitive, str2, str);
                throw new a0();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, str2, str);
                throw new a0();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonPrimitive.class).Q() + ", but had " + j1.d(jsonElementCurrentElement.getClass()).Q() + " as the serialized body of " + str2 + " at element: " + renderTagStack(str), jsonElementCurrentElement.toString());
    }
}
