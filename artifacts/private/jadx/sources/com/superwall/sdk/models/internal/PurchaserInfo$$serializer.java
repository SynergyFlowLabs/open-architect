package com.superwall.sdk.models.internal;

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
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class PurchaserInfo$$serializer implements p0<PurchaserInfo> {

    @NotNull
    public static final PurchaserInfo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PurchaserInfo$$serializer purchaserInfo$$serializer = new PurchaserInfo$$serializer();
        INSTANCE = purchaserInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.internal.PurchaserInfo", purchaserInfo$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("appUserId", false);
        pluginGeneratedSerialDescriptor.i("email", true);
        pluginGeneratedSerialDescriptor.i("storeIdentifiers", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PurchaserInfo$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PurchaserInfo.$childSerializers;
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, a.v(b3Var), kSerializerArr[2]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final PurchaserInfo deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        String str2;
        StoreIdentifiers storeIdentifiers;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PurchaserInfo.$childSerializers;
        String strDecodeStringElement = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, null);
            storeIdentifiers = (StoreIdentifiers) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            str = strDecodeStringElement2;
            i10 = 7;
            str2 = str3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str4 = null;
            StoreIdentifiers storeIdentifiers2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, str4);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    storeIdentifiers2 = (StoreIdentifiers) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], storeIdentifiers2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = strDecodeStringElement;
            str2 = str4;
            storeIdentifiers = storeIdentifiers2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new PurchaserInfo(i10, str, str2, storeIdentifiers, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull PurchaserInfo value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        PurchaserInfo.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
