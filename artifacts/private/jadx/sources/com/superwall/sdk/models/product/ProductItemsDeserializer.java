package com.superwall.sdk.models.product;

import hk.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nProductItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductItem.kt\ncom/superwall/sdk/models/product/ProductItemsDeserializer\n+ 2 Json.kt\nkotlinx/serialization/json/JsonKt\n*L\n1#1,276:1\n309#2:277\n*S KotlinDebug\n*F\n+ 1 ProductItem.kt\ncom/superwall/sdk/models/product/ProductItemsDeserializer\n*L\n261#1:277\n*E\n"})
public final class ProductItemsDeserializer implements KSerializer<List<? extends ProductItem>> {

    @NotNull
    public static final ProductItemsDeserializer INSTANCE = new ProductItemsDeserializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.r(ProductItem.Companion.serializer().getDescriptor());

    private ProductItemsDeserializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public List<ProductItem> deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof JsonDecoder)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        JsonArray jsonArray = JsonElementKt.getJsonArray(((JsonDecoder) decoder).decodeJsonElement());
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : jsonArray) {
            try {
                Json.Default r10 = Json.Default;
                r10.getSerializersModule();
                ProductItem productItem = (ProductItem) r10.decodeFromJsonElement(ProductItem.Companion.serializer(), jsonElement);
                if (productItem.getType() instanceof ProductItem.StoreProductType.PlayStore) {
                    arrayList.add(productItem);
                }
            } catch (c0 unused) {
            }
        }
        return arrayList;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull List<ProductItem> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(a.i(ProductItem.Companion.serializer()), value);
    }
}
