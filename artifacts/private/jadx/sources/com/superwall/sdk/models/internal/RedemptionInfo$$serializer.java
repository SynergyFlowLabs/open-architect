package com.superwall.sdk.models.internal;

import hk.a;
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
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class RedemptionInfo$$serializer implements p0<RedemptionInfo> {

    @NotNull
    public static final RedemptionInfo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RedemptionInfo$$serializer redemptionInfo$$serializer = new RedemptionInfo$$serializer();
        INSTANCE = redemptionInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.internal.RedemptionInfo", redemptionInfo$$serializer, 4);
        pluginGeneratedSerialDescriptor.i("ownership", false);
        pluginGeneratedSerialDescriptor.i("purchaserInfo", false);
        pluginGeneratedSerialDescriptor.i("paywallInfo", true);
        pluginGeneratedSerialDescriptor.i("entitlements", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RedemptionInfo$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = RedemptionInfo.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], PurchaserInfo$$serializer.INSTANCE, a.v(RedemptionResult$PaywallInfo$$serializer.INSTANCE), kSerializerArr[3]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final RedemptionInfo deserialize(@NotNull Decoder decoder) {
        int i10;
        RedemptionOwnership redemptionOwnership;
        PurchaserInfo purchaserInfo;
        RedemptionResult.PaywallInfo paywallInfo;
        List list;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RedemptionInfo.$childSerializers;
        RedemptionOwnership redemptionOwnership2 = null;
        if (dVarBeginStructure.c()) {
            RedemptionOwnership redemptionOwnership3 = (RedemptionOwnership) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            PurchaserInfo purchaserInfo2 = (PurchaserInfo) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, PurchaserInfo$$serializer.INSTANCE, null);
            RedemptionResult.PaywallInfo paywallInfo2 = (RedemptionResult.PaywallInfo) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, RedemptionResult$PaywallInfo$$serializer.INSTANCE, null);
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            redemptionOwnership = redemptionOwnership3;
            paywallInfo = paywallInfo2;
            i10 = 15;
            purchaserInfo = purchaserInfo2;
        } else {
            boolean z10 = true;
            int i11 = 0;
            PurchaserInfo purchaserInfo3 = null;
            RedemptionResult.PaywallInfo paywallInfo3 = null;
            List list2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    redemptionOwnership2 = (RedemptionOwnership) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], redemptionOwnership2);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    purchaserInfo3 = (PurchaserInfo) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, PurchaserInfo$$serializer.INSTANCE, purchaserInfo3);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    paywallInfo3 = (RedemptionResult.PaywallInfo) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, RedemptionResult$PaywallInfo$$serializer.INSTANCE, paywallInfo3);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new t0(iDecodeElementIndex);
                    }
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            redemptionOwnership = redemptionOwnership2;
            purchaserInfo = purchaserInfo3;
            paywallInfo = paywallInfo3;
            list = list2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new RedemptionInfo(i10, redemptionOwnership, purchaserInfo, paywallInfo, list, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull RedemptionInfo value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        RedemptionInfo.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
