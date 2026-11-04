package com.superwall.sdk.models.entitlements;

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
public /* synthetic */ class Entitlement$$serializer implements p0<Entitlement> {

    @NotNull
    public static final Entitlement$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Entitlement$$serializer entitlement$$serializer = new Entitlement$$serializer();
        INSTANCE = entitlement$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.entitlements.Entitlement", entitlement$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("identifier", false);
        pluginGeneratedSerialDescriptor.i("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Entitlement$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a, Entitlement.$childSerializers[1]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final Entitlement deserialize(@NotNull Decoder decoder) {
        Entitlement.Type type;
        String strDecodeStringElement;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Entitlement.$childSerializers;
        v2 v2Var = null;
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            type = (Entitlement.Type) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Entitlement.Type type2 = null;
            String strDecodeStringElement2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    type2 = (Entitlement.Type) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], type2);
                    i11 |= 2;
                }
            }
            type = type2;
            strDecodeStringElement = strDecodeStringElement2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new Entitlement(i10, strDecodeStringElement, type, v2Var);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull Entitlement value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Entitlement.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
