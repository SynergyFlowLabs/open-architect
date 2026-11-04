package com.superwall.sdk.models.triggers;

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
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class TriggerResult$Holdout$$serializer implements p0<TriggerResult.Holdout> {

    @NotNull
    public static final TriggerResult$Holdout$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        TriggerResult$Holdout$$serializer triggerResult$Holdout$$serializer = new TriggerResult$Holdout$$serializer();
        INSTANCE = triggerResult$Holdout$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.triggers.TriggerResult.Holdout", triggerResult$Holdout$$serializer, 1);
        pluginGeneratedSerialDescriptor.i("experiment", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TriggerResult$Holdout$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Experiment$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final TriggerResult.Holdout deserialize(@NotNull Decoder decoder) {
        Experiment experiment;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 1;
        if (dVarBeginStructure.c()) {
            experiment = (Experiment) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, Experiment$$serializer.INSTANCE, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            experiment = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new t0(iDecodeElementIndex);
                    }
                    experiment = (Experiment) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, Experiment$$serializer.INSTANCE, experiment);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new TriggerResult.Holdout(i10, experiment, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull TriggerResult.Holdout value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        TriggerResult.Holdout.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
