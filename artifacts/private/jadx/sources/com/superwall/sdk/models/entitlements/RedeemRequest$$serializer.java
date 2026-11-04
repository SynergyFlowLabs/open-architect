package com.superwall.sdk.models.entitlements;

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
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class RedeemRequest$$serializer implements p0<RedeemRequest> {

    @NotNull
    public static final RedeemRequest$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RedeemRequest$$serializer redeemRequest$$serializer = new RedeemRequest$$serializer();
        INSTANCE = redeemRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.entitlements.RedeemRequest", redeemRequest$$serializer, 6);
        pluginGeneratedSerialDescriptor.i("deviceId", false);
        pluginGeneratedSerialDescriptor.i("appUserId", false);
        pluginGeneratedSerialDescriptor.i("aliasId", true);
        pluginGeneratedSerialDescriptor.i("codes", false);
        pluginGeneratedSerialDescriptor.i("receipts", false);
        pluginGeneratedSerialDescriptor.i("externalAccountId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RedeemRequest$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = RedeemRequest.$childSerializers;
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, a.v(b3Var), a.v(b3Var), kSerializerArr[3], kSerializerArr[4], b3Var};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final RedeemRequest deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        List list;
        List list2;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RedeemRequest.$childSerializers;
        String strDecodeStringElement2 = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            b3 b3Var = b3.f315897a;
            String str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b3Var, null);
            String str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b3Var, null);
            List list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            str = strDecodeStringElement3;
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
            str3 = str5;
            list = list3;
            i10 = 63;
            str2 = str4;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str6 = null;
            String str7 = null;
            List list4 = null;
            List list5 = null;
            String strDecodeStringElement4 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, str6);
                        i11 |= 2;
                        break;
                    case 2:
                        str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b3.f315897a, str7);
                        i11 |= 4;
                        break;
                    case 3:
                        list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list4);
                        i11 |= 8;
                        break;
                    case 4:
                        list5 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list5);
                        i11 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i11 |= 32;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            i10 = i11;
            str = strDecodeStringElement2;
            str2 = str6;
            str3 = str7;
            list = list4;
            list2 = list5;
            strDecodeStringElement = strDecodeStringElement4;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new RedeemRequest(i10, str, str2, str3, list, list2, strDecodeStringElement, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull RedeemRequest value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        RedeemRequest.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
