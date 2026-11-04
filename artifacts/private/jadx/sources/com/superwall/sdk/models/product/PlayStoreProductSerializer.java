package com.superwall.sdk.models.product;

import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nProductItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductItem.kt\ncom/superwall/sdk/models/product/PlayStoreProductSerializer\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,276:1\n29#2,3:277\n*S KotlinDebug\n*F\n+ 1 ProductItem.kt\ncom/superwall/sdk/models/product/PlayStoreProductSerializer\n*L\n88#1:277,3\n*E\n"})
public final class PlayStoreProductSerializer implements KSerializer<PlayStoreProduct> {

    @NotNull
    public static final PlayStoreProductSerializer INSTANCE = new PlayStoreProductSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.f("PlayStoreProduct", new SerialDescriptor[0], null, 4, null);

    private PlayStoreProductSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public PlayStoreProduct deserialize(@NotNull Decoder decoder) {
        Store storeFromValue;
        JsonObject jsonObject;
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive;
        String content;
        String content2;
        Offer specified;
        JsonPrimitive jsonPrimitive2;
        String content3;
        JsonElement jsonElement2;
        JsonPrimitive jsonPrimitive3;
        JsonPrimitive jsonPrimitive4;
        JsonPrimitive jsonPrimitive5;
        JsonPrimitive jsonPrimitive6;
        String content4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder == null) {
            throw new c0("This class can be loaded only by Json");
        }
        JsonElement jsonElementDecodeJsonElement = jsonDecoder.decodeJsonElement();
        Intrinsics.checkNotNull(jsonElementDecodeJsonElement, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
        JsonObject jsonObject2 = (JsonObject) jsonElementDecodeJsonElement;
        try {
            Store.Companion companion = Store.Companion;
            JsonElement jsonElement3 = (JsonElement) jsonObject2.get((Object) "store");
            if (jsonElement3 == null || (jsonPrimitive6 = JsonElementKt.getJsonPrimitive(jsonElement3)) == null || (content4 = jsonPrimitive6.getContent()) == null) {
                throw new c0("Store is missing");
            }
            storeFromValue = companion.fromValue(content4);
            JsonElement jsonElement4 = (JsonElement) jsonObject2.get((Object) "product_identifier");
            if (jsonElement4 == null || (jsonPrimitive5 = JsonElementKt.getJsonPrimitive(jsonElement4)) == null || (content = jsonPrimitive5.getContent()) == null) {
                JsonElement jsonElement5 = (JsonElement) jsonObject2.get((Object) "product");
                if (jsonElement5 == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement5)) == null || (jsonElement = (JsonElement) jsonObject.get((Object) "product_identifier")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) {
                    throw new c0("product_identifier is missing");
                }
                content = jsonPrimitive.getContent();
            }
            JsonElement jsonElement6 = (JsonElement) jsonObject2.get((Object) "base_plan_identifier");
            if (jsonElement6 == null || (jsonPrimitive4 = JsonElementKt.getJsonPrimitive(jsonElement6)) == null || (content2 = jsonPrimitive4.getContent()) == null) {
                content2 = "";
            }
            Object obj = jsonObject2.get((Object) "offer");
            JsonObject jsonObject3 = obj instanceof JsonObject ? (JsonObject) obj : null;
            String content5 = (jsonObject3 == null || (jsonElement2 = (JsonElement) jsonObject3.get((Object) "type")) == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive3.getContent();
            if (Intrinsics.areEqual(content5, "AUTOMATIC")) {
                specified = new Offer.Automatic((String) null, 1, (DefaultConstructorMarker) null);
            } else if (Intrinsics.areEqual(content5, "SPECIFIED")) {
                JsonElement jsonElement7 = (JsonElement) jsonObject3.get((Object) "offer_identifier");
                if (jsonElement7 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement7)) == null || (content3 = jsonPrimitive2.getContent()) == null) {
                    throw new c0("offer_identifier is missing");
                }
                specified = new Offer.Specified((String) null, content3, 1, (DefaultConstructorMarker) null);
            } else {
                Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.configManager, "Unknown offer type for " + content + ", fallback to none", null, null, 24, null);
                specified = new Offer.Specified((String) null, "sw-none", 1, (DefaultConstructorMarker) null);
            }
            return new PlayStoreProduct(storeFromValue, content, content2, specified);
        } catch (Throwable unused) {
            storeFromValue = Store.PLAY_STORE;
        }
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull PlayStoreProduct value) {
        JsonObject jsonObject;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonEncoder jsonEncoder = encoder instanceof JsonEncoder ? (JsonEncoder) encoder : null;
        if (jsonEncoder == null) {
            throw new c0("This class can be saved only by Json");
        }
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        jsonObjectBuilder.put("store", JsonElementKt.JsonPrimitive(value.getStore().name()));
        jsonObjectBuilder.put("product_identifier", JsonElementKt.JsonPrimitive(value.getProductIdentifier()));
        jsonObjectBuilder.put("base_plan_identifier", JsonElementKt.JsonPrimitive(value.getBasePlanIdentifier()));
        Offer offer = value.getOffer();
        if (offer instanceof Offer.Automatic) {
            jsonObject = new JsonObject(MapsKt.mapOf(TuplesKt.to("type", JsonElementKt.JsonPrimitive(((Offer.Automatic) offer).getType()))));
        } else {
            if (!(offer instanceof Offer.Specified)) {
                throw new k0();
            }
            Offer.Specified specified = (Offer.Specified) offer;
            jsonObject = new JsonObject(MapsKt.mapOf(TuplesKt.to("type", JsonElementKt.JsonPrimitive(specified.getType())), TuplesKt.to("offer_identifier", JsonElementKt.JsonPrimitive(specified.getOfferIdentifier()))));
        }
        jsonObjectBuilder.put("offer", jsonObject);
        jsonEncoder.encodeJsonElement(jsonObjectBuilder.build());
    }
}
