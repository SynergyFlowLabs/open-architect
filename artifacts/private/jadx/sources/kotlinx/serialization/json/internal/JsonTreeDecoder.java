package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.internal.a1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n+ 2 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 5 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,348:1\n133#2,18:349\n1#3:367\n73#4:368\n270#5,8:369\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n*L\n212#1:349,18\n271#1:368\n271#1:369,8\n*E\n"})
class JsonTreeDecoder extends AbstractJsonTreeDecoder {
    private boolean forceNull;

    @Nullable
    private final SerialDescriptor polyDescriptor;
    private int position;

    @NotNull
    private final JsonObject value;

    public /* synthetic */ JsonTreeDecoder(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonObject, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : serialDescriptor);
    }

    private final boolean setForceNull(SerialDescriptor serialDescriptor, int i10) {
        boolean z10 = (getJson().getConfiguration().getExplicitNulls() || serialDescriptor.isElementOptional(i10) || !serialDescriptor.getElementDescriptor(i10).isNullable()) ? false : true;
        this.forceNull = z10;
        return z10;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.f3, kotlinx.serialization.encoding.Decoder
    @NotNull
    public kotlinx.serialization.encoding.d beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor != this.polyDescriptor) {
            return super.beginStructure(descriptor);
        }
        Json json = getJson();
        JsonElement jsonElementCurrentObject = currentObject();
        String serialName = this.polyDescriptor.getSerialName();
        if (jsonElementCurrentObject instanceof JsonObject) {
            return new JsonTreeDecoder(json, (JsonObject) jsonElementCurrentObject, getPolymorphicDiscriminator(), this.polyDescriptor);
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + j1.d(JsonObject.class).Q() + ", but had " + j1.d(jsonElementCurrentObject.getClass()).Q() + " as the serialized body of " + serialName + " at element: " + renderTagStack(), jsonElementCurrentObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    @NotNull
    public JsonElement currentElement(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) MapsKt.getValue(getValue(), tag);
    }

    @Nullable
    public final JsonElement currentElementOrNull(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) getValue().get((Object) tag);
    }

    @Override // kotlinx.serialization.encoding.d
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.position < descriptor.getElementsCount()) {
            int i10 = this.position;
            this.position = i10 + 1;
            String tag = getTag(descriptor, i10);
            int i11 = this.position - 1;
            this.forceNull = false;
            if (getValue().containsKey((Object) tag) || setForceNull(descriptor, i11)) {
                if (this.configuration.getCoerceInputValues()) {
                    Json json = getJson();
                    boolean zIsElementOptional = descriptor.isElementOptional(i11);
                    SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i11);
                    if (!zIsElementOptional || elementDescriptor.isNullable() || !(currentElementOrNull(tag) instanceof JsonNull)) {
                        if (Intrinsics.areEqual(elementDescriptor.getKind(), l.b.f315860a) && (!elementDescriptor.isNullable() || !(currentElementOrNull(tag) instanceof JsonNull))) {
                            JsonElement jsonElementCurrentElementOrNull = currentElementOrNull(tag);
                            JsonPrimitive jsonPrimitive = jsonElementCurrentElementOrNull instanceof JsonPrimitive ? (JsonPrimitive) jsonElementCurrentElementOrNull : null;
                            String contentOrNull = jsonPrimitive != null ? JsonElementKt.getContentOrNull(jsonPrimitive) : null;
                            if (contentOrNull == null) {
                                return i11;
                            }
                            int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, contentOrNull);
                            boolean z10 = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
                            if (jsonNameIndex != -3 || ((!zIsElementOptional && !z10) || setForceNull(descriptor, i11))) {
                            }
                        }
                        return i11;
                    }
                }
                return i11;
            }
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.f3, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !this.forceNull && super.decodeNotNullMark();
    }

    @Override // kotlinx.serialization.internal.r1
    @NotNull
    protected String elementName(@NotNull SerialDescriptor descriptor, int i10) {
        Object next;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonNamingStrategy jsonNamingStrategyNamingStrategy = JsonNamesMapKt.namingStrategy(descriptor, getJson());
        String elementName = descriptor.getElementName(i10);
        if (jsonNamingStrategyNamingStrategy != null || (this.configuration.getUseAlternativeNames() && !getValue().keySet().contains(elementName))) {
            Map<String, Integer> mapDeserializationNamesMap = JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor);
            Iterator<T> it = getValue().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = mapDeserializationNamesMap.get((String) next);
                if (num != null && num.intValue() == i10) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
            String strSerialNameForJson = jsonNamingStrategyNamingStrategy != null ? jsonNamingStrategyNamingStrategy.serialNameForJson(descriptor, i10, elementName) : null;
            if (strSerialNameForJson != null) {
                return strSerialNameForJson;
            }
        }
        return elementName;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.f3, kotlinx.serialization.encoding.d
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Set<String> setPlus;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (JsonNamesMapKt.ignoreUnknownKeys(descriptor, getJson()) || (descriptor.getKind() instanceof kotlinx.serialization.descriptors.d)) {
            return;
        }
        JsonNamingStrategy jsonNamingStrategyNamingStrategy = JsonNamesMapKt.namingStrategy(descriptor, getJson());
        int i10 = 0 >> 0;
        if (jsonNamingStrategyNamingStrategy == null && !this.configuration.getUseAlternativeNames()) {
            setPlus = a1.a(descriptor);
        } else if (jsonNamingStrategyNamingStrategy != null) {
            setPlus = JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor).keySet();
        } else {
            Set<String> setA = a1.a(descriptor);
            Map map = (Map) JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, JsonNamesMapKt.getJsonDeserializationNamesKey());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = SetsKt.emptySet();
            }
            setPlus = SetsKt.plus((Set) setA, (Iterable) setKeySet);
        }
        for (String str : getValue().keySet()) {
            if (!setPlus.contains(str) && !Intrinsics.areEqual(str, getPolymorphicDiscriminator())) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "Encountered an unknown key '" + str + "' at element: " + renderTagStack() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) JsonExceptionsKt.minify$default(getValue().toString(), 0, 1, null)));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(@NotNull Json json, @NotNull JsonObject value, @Nullable String str, @Nullable SerialDescriptor serialDescriptor) {
        super(json, value, str, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = 2 & 0;
        this.value = value;
        this.polyDescriptor = serialDescriptor;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    @NotNull
    public JsonObject getValue() {
        return this.value;
    }
}
