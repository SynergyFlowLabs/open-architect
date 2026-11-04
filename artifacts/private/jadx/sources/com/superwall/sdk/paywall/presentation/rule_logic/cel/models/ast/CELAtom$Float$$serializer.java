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
import kotlinx.serialization.internal.e0;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class CELAtom$Float$$serializer implements p0<CELAtom.Float> {

    @NotNull
    public static final CELAtom$Float$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CELAtom$Float$$serializer cELAtom$Float$$serializer = new CELAtom$Float$$serializer();
        INSTANCE = cELAtom$Float$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Float", cELAtom$Float$$serializer, 1);
        pluginGeneratedSerialDescriptor.i("value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CELAtom$Float$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{e0.f315908a};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final CELAtom.Float deserialize(@NotNull Decoder decoder) {
        double dDecodeDoubleElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 1;
        if (dVarBeginStructure.c()) {
            dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 0);
        } else {
            double dDecodeDoubleElement2 = 0.0d;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new t0(iDecodeElementIndex);
                    }
                    dDecodeDoubleElement2 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                    i11 = 1;
                }
            }
            dDecodeDoubleElement = dDecodeDoubleElement2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new CELAtom.Float(i10, dDecodeDoubleElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull CELAtom.Float value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        CELAtom.Float.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
