package com.superwall.sdk.models.internal;

import hk.a;
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
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class RedemptionResult$PaywallInfo$$serializer implements p0<RedemptionResult.PaywallInfo> {

    @NotNull
    public static final RedemptionResult$PaywallInfo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RedemptionResult$PaywallInfo$$serializer redemptionResult$PaywallInfo$$serializer = new RedemptionResult$PaywallInfo$$serializer();
        INSTANCE = redemptionResult$PaywallInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.internal.RedemptionResult.PaywallInfo", redemptionResult$PaywallInfo$$serializer, 6);
        pluginGeneratedSerialDescriptor.i("identifier", false);
        pluginGeneratedSerialDescriptor.i("placementName", false);
        pluginGeneratedSerialDescriptor.i("placementParams", false);
        pluginGeneratedSerialDescriptor.i("variantId", false);
        pluginGeneratedSerialDescriptor.i("experimentId", false);
        pluginGeneratedSerialDescriptor.i("productIdentifier", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RedemptionResult$PaywallInfo$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = RedemptionResult.PaywallInfo.$childSerializers;
        b3 b3Var = b3.f315897a;
        int i10 = 4 >> 0;
        return new KSerializer[]{b3Var, b3Var, kSerializerArr[2], b3Var, b3Var, a.v(b3Var)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final RedemptionResult.PaywallInfo deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        String str2;
        Map map;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RedemptionResult.PaywallInfo.$childSerializers;
        String strDecodeStringElement = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            Map map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            String strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
            map = map2;
            str = strDecodeStringElement2;
            str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, b3.f315897a, null);
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            i10 = 63;
            str2 = strDecodeStringElement3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strDecodeStringElement6 = null;
            Map map3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String str6 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        map3 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], map3);
                        i11 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, b3.f315897a, str6);
                        i11 |= 32;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            i10 = i11;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement6;
            map = map3;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            str5 = str6;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new RedemptionResult.PaywallInfo(i10, str, str2, map, str3, str4, str5, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull RedemptionResult.PaywallInfo value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        RedemptionResult.PaywallInfo.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
