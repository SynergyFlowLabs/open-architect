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
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.k1;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class PaywallWebviewUrl$$serializer implements p0<PaywallWebviewUrl> {

    @NotNull
    public static final PaywallWebviewUrl$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PaywallWebviewUrl$$serializer paywallWebviewUrl$$serializer = new PaywallWebviewUrl$$serializer();
        INSTANCE = paywallWebviewUrl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.paywall.PaywallWebviewUrl", paywallWebviewUrl$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("url", false);
        pluginGeneratedSerialDescriptor.i("timeout_ms", false);
        pluginGeneratedSerialDescriptor.i("percentage", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallWebviewUrl$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a, k1.f315958a, y0.f316055a};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final PaywallWebviewUrl deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int iDecodeIntElement;
        long j10;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
            iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
            j10 = jDecodeLongElement;
            i10 = 7;
        } else {
            strDecodeStringElement = null;
            boolean z10 = true;
            int i11 = 0;
            long jDecodeLongElement2 = 0;
            int iDecodeIntElement2 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i11 |= 4;
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            j10 = jDecodeLongElement2;
            i10 = i11;
        }
        String str = strDecodeStringElement;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new PaywallWebviewUrl(i10, str, j10, iDecodeIntElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull PaywallWebviewUrl value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        PaywallWebviewUrl.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
