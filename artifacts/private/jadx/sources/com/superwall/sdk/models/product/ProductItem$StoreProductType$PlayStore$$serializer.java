package com.superwall.sdk.models.product;

import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class ProductItem$StoreProductType$PlayStore$$serializer implements p0<ProductItem.StoreProductType.PlayStore> {

    @NotNull
    public static final ProductItem$StoreProductType$PlayStore$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ProductItem$StoreProductType$PlayStore$$serializer productItem$StoreProductType$PlayStore$$serializer = new ProductItem$StoreProductType$PlayStore$$serializer();
        INSTANCE = productItem$StoreProductType$PlayStore$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.product.ProductItem.StoreProductType.PlayStore", productItem$StoreProductType$PlayStore$$serializer, 1);
        pluginGeneratedSerialDescriptor.i("product", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProductItem$StoreProductType$PlayStore$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{PlayStoreProductSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final ProductItem.StoreProductType.PlayStore deserialize(@NotNull Decoder decoder) {
        PlayStoreProduct playStoreProduct;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 1;
        if (dVarBeginStructure.c()) {
            playStoreProduct = (PlayStoreProduct) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, PlayStoreProductSerializer.INSTANCE, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            playStoreProduct = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new t0(iDecodeElementIndex);
                    }
                    playStoreProduct = (PlayStoreProduct) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, PlayStoreProductSerializer.INSTANCE, playStoreProduct);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new ProductItem.StoreProductType.PlayStore(i10, playStoreProduct, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull ProductItem.StoreProductType.PlayStore value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        ProductItem.StoreProductType.PlayStore.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
