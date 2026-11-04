package com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast;

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
import kotlinx.serialization.internal.k;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class CELAtom$Bytes$$serializer implements p0<CELAtom.Bytes> {

    @NotNull
    public static final CELAtom$Bytes$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CELAtom$Bytes$$serializer cELAtom$Bytes$$serializer = new CELAtom$Bytes$$serializer();
        INSTANCE = cELAtom$Bytes$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Bytes", cELAtom$Bytes$$serializer, 1);
        pluginGeneratedSerialDescriptor.i("value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CELAtom$Bytes$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{k.f315954c};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final CELAtom.Bytes deserialize(@NotNull Decoder decoder) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 1;
        if (dVarBeginStructure.c()) {
            bArr = (byte[]) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, k.f315954c, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            bArr = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new t0(iDecodeElementIndex);
                    }
                    bArr = (byte[]) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, k.f315954c, bArr);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new CELAtom.Bytes(i10, bArr, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull CELAtom.Bytes value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        CELAtom.Bytes.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
