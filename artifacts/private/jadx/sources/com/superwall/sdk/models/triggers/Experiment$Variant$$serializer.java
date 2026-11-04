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
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class Experiment$Variant$$serializer implements p0<Experiment.Variant> {

    @NotNull
    public static final Experiment$Variant$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Experiment$Variant$$serializer experiment$Variant$$serializer = new Experiment$Variant$$serializer();
        INSTANCE = experiment$Variant$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.triggers.Experiment.Variant", experiment$Variant$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("id", false);
        pluginGeneratedSerialDescriptor.i("type", false);
        pluginGeneratedSerialDescriptor.i("paywall_identifier", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Experiment$Variant$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = Experiment.Variant.$childSerializers;
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, kSerializerArr[1], a.v(b3Var)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final Experiment.Variant deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        Experiment.Variant.VariantType variantType;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Experiment.Variant.$childSerializers;
        String strDecodeStringElement = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            variantType = (Experiment.Variant.VariantType) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            str = strDecodeStringElement2;
            str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b3.f315897a, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Experiment.Variant.VariantType variantType2 = null;
            String str3 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    variantType2 = (Experiment.Variant.VariantType) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], variantType2);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b3.f315897a, str3);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = strDecodeStringElement;
            variantType = variantType2;
            str2 = str3;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new Experiment.Variant(i10, str, variantType, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull Experiment.Variant value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Experiment.Variant.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
