package com.superwall.sdk.models.internal;

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
public /* synthetic */ class RedemptionResult$Error$$serializer implements p0<RedemptionResult.Error> {

    @NotNull
    public static final RedemptionResult$Error$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RedemptionResult$Error$$serializer redemptionResult$Error$$serializer = new RedemptionResult$Error$$serializer();
        INSTANCE = redemptionResult$Error$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ERROR", redemptionResult$Error$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("code", false);
        pluginGeneratedSerialDescriptor.i("error", false);
        pluginGeneratedSerialDescriptor.q(new RedemptionResult$Error$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("status"));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RedemptionResult$Error$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a, ErrorInfo$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final RedemptionResult.Error deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        ErrorInfo errorInfo;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            errorInfo = (ErrorInfo) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ErrorInfo$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            strDecodeStringElement = null;
            ErrorInfo errorInfo2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    errorInfo2 = (ErrorInfo) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ErrorInfo$$serializer.INSTANCE, errorInfo2);
                    i11 |= 2;
                }
            }
            errorInfo = errorInfo2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new RedemptionResult.Error(i10, strDecodeStringElement, errorInfo, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull RedemptionResult.Error value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        RedemptionResult.Error.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
