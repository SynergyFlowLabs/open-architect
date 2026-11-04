package com.superwall.sdk.models.paywall;

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
import kotlinx.serialization.internal.k1;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class PaywallPresentationInfo$$serializer implements p0<PaywallPresentationInfo> {

    @NotNull
    public static final PaywallPresentationInfo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PaywallPresentationInfo$$serializer paywallPresentationInfo$$serializer = new PaywallPresentationInfo$$serializer();
        INSTANCE = paywallPresentationInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.paywall.PaywallPresentationInfo", paywallPresentationInfo$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("style", false);
        pluginGeneratedSerialDescriptor.i("delay", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallPresentationInfo$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{PaywallPresentationInfo.$childSerializers[0], k1.f315958a};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final PaywallPresentationInfo deserialize(@NotNull Decoder decoder) {
        int i10;
        PaywallPresentationStyle paywallPresentationStyle;
        long jDecodeLongElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PaywallPresentationInfo.$childSerializers;
        PaywallPresentationStyle paywallPresentationStyle2 = null;
        if (dVarBeginStructure.c()) {
            paywallPresentationStyle = (PaywallPresentationStyle) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
            i10 = 3;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    paywallPresentationStyle2 = (PaywallPresentationStyle) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], paywallPresentationStyle2);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i11 |= 2;
                }
            }
            i10 = i11;
            paywallPresentationStyle = paywallPresentationStyle2;
            jDecodeLongElement = jDecodeLongElement2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new PaywallPresentationInfo(i10, paywallPresentationStyle, jDecodeLongElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull PaywallPresentationInfo value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        PaywallPresentationInfo.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
