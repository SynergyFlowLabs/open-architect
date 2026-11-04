package com.superwall.sdk.models.product;

import com.superwall.sdk.models.entitlements.Entitlement;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.e0;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@e0(forClass = ProductItem.class)
@SourceDebugExtension({"SMAP\nProductItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductItem.kt\ncom/superwall/sdk/models/product/ProductItemSerializer\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 Json.kt\nkotlinx/serialization/json/JsonKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n29#2,2:277\n31#2:280\n298#3:279\n309#3:284\n309#3:286\n1557#4:281\n1628#4,2:282\n1630#4:285\n*S KotlinDebug\n*F\n+ 1 ProductItem.kt\ncom/superwall/sdk/models/product/ProductItemSerializer\n*L\n198#1:277,2\n198#1:280\n201#1:279\n223#1:284\n227#1:286\n222#1:281\n222#1:282,2\n222#1:285\n*E\n"})
public final class ProductItemSerializer implements KSerializer<ProductItem> {

    @NotNull
    public static final ProductItemSerializer INSTANCE = new ProductItemSerializer();

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.product.ProductItem", null, 3);
        pluginGeneratedSerialDescriptor.i("reference_name", false);
        pluginGeneratedSerialDescriptor.i("store_product", false);
        pluginGeneratedSerialDescriptor.i("entitlements", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProductItemSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    @Override // kotlinx.serialization.e
    @NotNull
    public ProductItem deserialize(@NotNull Decoder decoder) {
        String content;
        JsonObject jsonObject;
        Set setEmptySet;
        JsonArray jsonArray;
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder == null) {
            throw new c0("This class can be loaded only by Json");
        }
        JsonObject jsonObject2 = JsonElementKt.getJsonObject(jsonDecoder.decodeJsonElement());
        JsonElement jsonElement = (JsonElement) jsonObject2.get((Object) "reference_name");
        if (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null || (content = jsonPrimitive.getContent()) == null) {
            content = "";
        }
        JsonElement jsonElement2 = (JsonElement) jsonObject2.get((Object) "store_product");
        if (jsonElement2 == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement2)) == null) {
            throw new c0("Missing store_product");
        }
        JsonElement jsonElement3 = (JsonElement) jsonObject2.get((Object) "entitlements");
        if (jsonElement3 == null || (jsonArray = JsonElementKt.getJsonArray(jsonElement3)) == null) {
            setEmptySet = SetsKt.emptySet();
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArray, 10));
            for (JsonElement jsonElement4 : jsonArray) {
                Json.Default r10 = Json.Default;
                r10.getSerializersModule();
                arrayList.add((Entitlement) r10.decodeFromJsonElement(Entitlement.Companion.serializer(), jsonElement4));
            }
            setEmptySet = CollectionsKt.toSet(arrayList);
            if (setEmptySet == null) {
                setEmptySet = SetsKt.emptySet();
            }
        }
        Json.Default r11 = Json.Default;
        r11.getSerializersModule();
        return new ProductItem(content, new ProductItem.StoreProductType.PlayStore((PlayStoreProduct) r11.decodeFromJsonElement(PlayStoreProduct.Companion.serializer(), jsonObject)), setEmptySet);
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull ProductItem value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonEncoder jsonEncoder = encoder instanceof JsonEncoder ? (JsonEncoder) encoder : null;
        if (jsonEncoder == null) {
            throw new c0("This class can be saved only by Json");
        }
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        jsonObjectBuilder.put("product", JsonElementKt.JsonPrimitive(value.getName()));
        jsonObjectBuilder.put("productId", JsonElementKt.JsonPrimitive(value.getFullProductId()));
        Json json = ((JsonEncoder) encoder).getJson();
        ProductItem.StoreProductType type = value.getType();
        json.getSerializersModule();
        jsonObjectBuilder.put("store_product", json.encodeToJsonElement(ProductItem.StoreProductType.Companion.serializer(), type));
        jsonEncoder.encodeJsonElement(jsonObjectBuilder.build());
    }
}
