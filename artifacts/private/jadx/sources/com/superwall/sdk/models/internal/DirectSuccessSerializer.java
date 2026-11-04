package com.superwall.sdk.models.internal;

import com.superwall.sdk.models.internal.DirectSuccessSerializer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nWebRedemption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebRedemption.kt\ncom/superwall/sdk/models/internal/DirectSuccessSerializer\n+ 2 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,287:1\n315#2,8:288\n315#2,8:296\n*S KotlinDebug\n*F\n+ 1 WebRedemption.kt\ncom/superwall/sdk/models/internal/DirectSuccessSerializer\n*L\n229#1:288,8\n230#1:296,8\n*E\n"})
public final class DirectSuccessSerializer implements KSerializer<RedemptionResult.Success> {

    @NotNull
    public static final DirectSuccessSerializer INSTANCE = new DirectSuccessSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.e("SUCCESS", new SerialDescriptor[0], new Function1() { // from class: yf.a
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return DirectSuccessSerializer.descriptor$lambda$0((kotlinx.serialization.descriptors.a) obj);
        }
    });

    private DirectSuccessSerializer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptor$lambda$0(a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a("code", b3.f315897a.getDescriptor(), CollectionsKt.emptyList(), false);
        buildClassSerialDescriptor.a("redemptionInfo", JsonElement.Companion.serializer().getDescriptor(), CollectionsKt.emptyList(), false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serialize$lambda$1(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setEncodeDefaults(true);
        Json.setIgnoreUnknownKeys(true);
        return Unit.f312394a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public RedemptionResult.Success deserialize(@NotNull Decoder decoder) {
        JsonPrimitive jsonPrimitive;
        String content;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder == null) {
            throw new c0("Expected JSON decoder");
        }
        JsonObject jsonObject = JsonElementKt.getJsonObject(jsonDecoder.decodeJsonElement());
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) "code");
        if (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null || (content = jsonPrimitive.getContent()) == null) {
            throw new c0("Required field 'code' was not found");
        }
        JsonElement jsonElement2 = (JsonElement) jsonObject.get((Object) "redemption_info");
        if (jsonElement2 == null && (jsonElement2 = (JsonElement) jsonObject.get((Object) "redemptionInfo")) == null) {
            throw new c0("Required field 'redemptionInfo' was not found");
        }
        return new RedemptionResult.Success(content, (RedemptionInfo) Json.Default.decodeFromJsonElement(RedemptionInfo.Companion.serializer(), jsonElement2));
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull RedemptionResult.Success value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        e eVarBeginStructure = encoder.beginStructure(getDescriptor());
        int i10 = 4 >> 0;
        eVarBeginStructure.encodeStringElement(getDescriptor(), 0, value.getCode());
        eVarBeginStructure.encodeSerializableElement(getDescriptor(), 1, JsonElement.Companion.serializer(), JsonKt.Json$default(null, new Function1() { // from class: yf.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectSuccessSerializer.serialize$lambda$1((JsonBuilder) obj);
            }
        }, 1, null).encodeToJsonElement(RedemptionInfo.Companion.serializer(), value.getRedemptionInfo()));
        eVarBeginStructure.endStructure(getDescriptor());
    }
}
