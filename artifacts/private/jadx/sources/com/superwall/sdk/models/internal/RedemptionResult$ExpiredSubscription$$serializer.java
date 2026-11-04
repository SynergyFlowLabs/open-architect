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
public /* synthetic */ class RedemptionResult$ExpiredSubscription$$serializer implements p0<RedemptionResult.ExpiredSubscription> {

    @NotNull
    public static final RedemptionResult$ExpiredSubscription$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RedemptionResult$ExpiredSubscription$$serializer redemptionResult$ExpiredSubscription$$serializer = new RedemptionResult$ExpiredSubscription$$serializer();
        INSTANCE = redemptionResult$ExpiredSubscription$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("EXPIRED_SUBSCRIPTION", redemptionResult$ExpiredSubscription$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("code", false);
        pluginGeneratedSerialDescriptor.i("redemptionInfo", false);
        pluginGeneratedSerialDescriptor.q(new RedemptionResult$Error$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("status"));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RedemptionResult$ExpiredSubscription$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a, RedemptionInfo$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final RedemptionResult.ExpiredSubscription deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        RedemptionInfo redemptionInfo;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            redemptionInfo = (RedemptionInfo) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, RedemptionInfo$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            strDecodeStringElement = null;
            RedemptionInfo redemptionInfo2 = null;
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
                    redemptionInfo2 = (RedemptionInfo) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, RedemptionInfo$$serializer.INSTANCE, redemptionInfo2);
                    i11 |= 2;
                }
            }
            redemptionInfo = redemptionInfo2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new RedemptionResult.ExpiredSubscription(i10, strDecodeStringElement, redemptionInfo, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull RedemptionResult.ExpiredSubscription value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        RedemptionResult.ExpiredSubscription.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
