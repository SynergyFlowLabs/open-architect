package com.superwall.sdk.models.product;

import com.superwall.sdk.models.serialization.AnySerializer;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.e0;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@e0(forClass = ProductVariable.class)
@SourceDebugExtension({"SMAP\nProductVariable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductVariable.kt\ncom/superwall/sdk/models/product/ProductVariableSerializer\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,55:1\n29#2,2:56\n31#2:60\n29#2,3:61\n216#3,2:58\n*S KotlinDebug\n*F\n+ 1 ProductVariable.kt\ncom/superwall/sdk/models/product/ProductVariableSerializer\n*L\n35#1:56,2\n35#1:60\n44#1:61,3\n36#1:58,2\n*E\n"})
public final class ProductVariableSerializer implements KSerializer<ProductVariable> {

    @NotNull
    public static final ProductVariableSerializer INSTANCE = new ProductVariableSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.f("ProductVariable", new SerialDescriptor[0], null, 4, null);

    private ProductVariableSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public ProductVariable deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new UnsupportedOperationException("Deserialization is not supported");
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull ProductVariable value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonEncoder jsonEncoder = encoder instanceof JsonEncoder ? (JsonEncoder) encoder : null;
        if (jsonEncoder == null) {
            throw new c0("This serializer can only be used with JSON");
        }
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (Map.Entry<String, Object> entry : value.getAttributes().entrySet()) {
            String key = entry.getKey();
            Object value2 = entry.getValue();
            jsonObjectBuilder.put(key, Json.Default.encodeToJsonElement(AnySerializer.INSTANCE.serializerFor(value2), value2));
        }
        JsonObject jsonObjectBuild = jsonObjectBuilder.build();
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        jsonObjectBuilder2.put(value.getName(), jsonObjectBuild);
        jsonEncoder.encodeJsonElement(jsonObjectBuilder2.build());
    }
}
