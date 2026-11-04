package com.superwall.sdk.analytics;

import io.intercom.android.sdk.models.AttributeType;
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
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class CPUInfo$Data$Core$$serializer implements p0<CPUInfo.Data.Core> {

    @NotNull
    public static final CPUInfo$Data$Core$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CPUInfo$Data$Core$$serializer cPUInfo$Data$Core$$serializer = new CPUInfo$Data$Core$$serializer();
        INSTANCE = cPUInfo$Data$Core$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.analytics.CPUInfo.Data.Core", cPUInfo$Data$Core$$serializer, 4);
        boolean z10 = true;
        pluginGeneratedSerialDescriptor.i(AttributeType.NUMBER, false);
        pluginGeneratedSerialDescriptor.i("currentFreq", false);
        pluginGeneratedSerialDescriptor.i("maxFreq", false);
        pluginGeneratedSerialDescriptor.i("minFreq", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CPUInfo$Data$Core$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f315958a;
        return new KSerializer[]{y0.f316055a, k1Var, k1Var, k1Var};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final CPUInfo.Data.Core deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        long jDecodeLongElement;
        long j10;
        long j11;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
            long jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
            long jDecodeLongElement3 = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
            jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
            j10 = jDecodeLongElement2;
            j11 = jDecodeLongElement3;
            i10 = 15;
        } else {
            long jDecodeLongElement4 = 0;
            boolean z10 = true;
            iDecodeIntElement = 0;
            int i11 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement5 = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    jDecodeLongElement6 = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new t0(iDecodeElementIndex);
                    }
                    jDecodeLongElement4 = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i11 |= 8;
                }
            }
            jDecodeLongElement = jDecodeLongElement4;
            j10 = jDecodeLongElement5;
            j11 = jDecodeLongElement6;
            i10 = i11;
        }
        int i12 = iDecodeIntElement;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new CPUInfo.Data.Core(i10, i12, j10, j11, jDecodeLongElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull CPUInfo.Data.Core value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        CPUInfo.Data.Core.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
