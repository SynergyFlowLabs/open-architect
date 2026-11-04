package com.superwall.sdk.models.triggers;

import hk.a;
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
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class VariantOption$$serializer implements p0<VariantOption> {

    @NotNull
    public static final VariantOption$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        VariantOption$$serializer variantOption$$serializer = new VariantOption$$serializer();
        INSTANCE = variantOption$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.triggers.VariantOption", variantOption$$serializer, 4);
        pluginGeneratedSerialDescriptor.i("variant_type", false);
        pluginGeneratedSerialDescriptor.i("variant_id", false);
        pluginGeneratedSerialDescriptor.i("percentage", false);
        pluginGeneratedSerialDescriptor.i("paywall_identifier", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VariantOption$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = VariantOption.$childSerializers[0];
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{kSerializer, b3Var, y0.f316055a, a.v(b3Var)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final VariantOption deserialize(@NotNull Decoder decoder) {
        int i10;
        int i11;
        Experiment.Variant.VariantType variantType;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = VariantOption.$childSerializers;
        if (dVarBeginStructure.c()) {
            Experiment.Variant.VariantType variantType2 = (Experiment.Variant.VariantType) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            String strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
            variantType = variantType2;
            str = strDecodeStringElement;
            str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, null);
            i10 = iDecodeIntElement;
            i11 = 15;
        } else {
            boolean z10 = true;
            int iDecodeIntElement2 = 0;
            Experiment.Variant.VariantType variantType3 = null;
            String strDecodeStringElement2 = null;
            String str3 = null;
            int i12 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    variantType3 = (Experiment.Variant.VariantType) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], variantType3);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i12 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new t0(iDecodeElementIndex);
                    }
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, str3);
                    i12 |= 8;
                }
            }
            i10 = iDecodeIntElement2;
            i11 = i12;
            variantType = variantType3;
            str = strDecodeStringElement2;
            str2 = str3;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new VariantOption(i11, variantType, str, i10, str2, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull VariantOption value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        VariantOption.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
