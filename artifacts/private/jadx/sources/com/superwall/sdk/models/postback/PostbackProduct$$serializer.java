package com.superwall.sdk.models.postback;

import java.util.Map;
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
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class PostbackProduct$$serializer implements p0<PostbackProduct> {

    @NotNull
    public static final PostbackProduct$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PostbackProduct$$serializer postbackProduct$$serializer = new PostbackProduct$$serializer();
        INSTANCE = postbackProduct$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.postback.PostbackProduct", postbackProduct$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("identifier", false);
        pluginGeneratedSerialDescriptor.i("productVariables", false);
        pluginGeneratedSerialDescriptor.i("product", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PostbackProduct$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a, PostbackProduct.$childSerializers[1], SWProduct$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final PostbackProduct deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        Map map;
        SWProduct sWProduct;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PostbackProduct.$childSerializers;
        String strDecodeStringElement = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            str = strDecodeStringElement2;
            sWProduct = (SWProduct) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, SWProduct$$serializer.INSTANCE, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Map map2 = null;
            SWProduct sWProduct2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], map2);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    sWProduct2 = (SWProduct) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, SWProduct$$serializer.INSTANCE, sWProduct2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = strDecodeStringElement;
            map = map2;
            sWProduct = sWProduct2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new PostbackProduct(i10, str, map, sWProduct, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull PostbackProduct value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        PostbackProduct.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
