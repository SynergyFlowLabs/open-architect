package com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast;

import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlin.y1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.s3;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class CELAtom$UInt$$serializer implements p0<CELAtom.UInt> {

    @NotNull
    public static final CELAtom$UInt$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CELAtom$UInt$$serializer cELAtom$UInt$$serializer = new CELAtom$UInt$$serializer();
        INSTANCE = cELAtom$UInt$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("UInt", cELAtom$UInt$$serializer, 1);
        pluginGeneratedSerialDescriptor.i("value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CELAtom$UInt$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{s3.f316008a};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final CELAtom.UInt deserialize(@NotNull Decoder decoder) {
        y1 y1Var;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 1;
        if (dVarBeginStructure.c()) {
            y1Var = (y1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, s3.f316008a, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            y1Var = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new t0(iDecodeElementIndex);
                    }
                    y1Var = (y1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, s3.f316008a, y1Var);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new CELAtom.UInt(i10, y1Var, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull CELAtom.UInt value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        CELAtom.UInt.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
