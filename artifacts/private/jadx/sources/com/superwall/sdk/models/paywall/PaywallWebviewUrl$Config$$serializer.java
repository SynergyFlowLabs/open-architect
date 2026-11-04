package com.superwall.sdk.models.paywall;

import java.util.List;
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
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class PaywallWebviewUrl$Config$$serializer implements p0<PaywallWebviewUrl.Config> {

    @NotNull
    public static final PaywallWebviewUrl$Config$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PaywallWebviewUrl$Config$$serializer paywallWebviewUrl$Config$$serializer = new PaywallWebviewUrl$Config$$serializer();
        INSTANCE = paywallWebviewUrl$Config$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.paywall.PaywallWebviewUrl.Config", paywallWebviewUrl$Config$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("max_attempts", false);
        pluginGeneratedSerialDescriptor.i("endpoints", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallWebviewUrl$Config$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{y0.f316055a, PaywallWebviewUrl.Config.$childSerializers[1]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final PaywallWebviewUrl.Config deserialize(@NotNull Decoder decoder) {
        List list;
        int iDecodeIntElement;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PaywallWebviewUrl.Config.$childSerializers;
        int i11 = 6 >> 1;
        if (dVarBeginStructure.c()) {
            iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int iDecodeIntElement2 = 0;
            int i12 = 0;
            List list2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list2);
                    i12 |= 2;
                }
            }
            list = list2;
            iDecodeIntElement = iDecodeIntElement2;
            i10 = i12;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new PaywallWebviewUrl.Config(i10, iDecodeIntElement, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull PaywallWebviewUrl.Config value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        PaywallWebviewUrl.Config.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
