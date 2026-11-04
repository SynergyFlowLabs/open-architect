package com.sdk.growthbook.serializable_model;

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
public /* synthetic */ class SerializableGBTrackData$$serializer implements p0<SerializableGBTrackData> {

    @NotNull
    public static final SerializableGBTrackData$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SerializableGBTrackData$$serializer serializableGBTrackData$$serializer = new SerializableGBTrackData$$serializer();
        INSTANCE = serializableGBTrackData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdk.growthbook.serializable_model.SerializableGBTrackData", serializableGBTrackData$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("experiment", false);
        pluginGeneratedSerialDescriptor.i("result", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SerializableGBTrackData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SerializableGBExperiment$$serializer.INSTANCE, SerializableGBExperimentResult$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final SerializableGBTrackData deserialize(@NotNull Decoder decoder) {
        SerializableGBExperiment serializableGBExperiment;
        SerializableGBExperimentResult serializableGBExperimentResult;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            serializableGBExperiment = (SerializableGBExperiment) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, SerializableGBExperiment$$serializer.INSTANCE, null);
            serializableGBExperimentResult = (SerializableGBExperimentResult) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, SerializableGBExperimentResult$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            serializableGBExperiment = null;
            SerializableGBExperimentResult serializableGBExperimentResult2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    serializableGBExperiment = (SerializableGBExperiment) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, SerializableGBExperiment$$serializer.INSTANCE, serializableGBExperiment);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    serializableGBExperimentResult2 = (SerializableGBExperimentResult) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, SerializableGBExperimentResult$$serializer.INSTANCE, serializableGBExperimentResult2);
                    i11 |= 2;
                }
            }
            serializableGBExperimentResult = serializableGBExperimentResult2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new SerializableGBTrackData(i10, serializableGBExperiment, serializableGBExperimentResult, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull SerializableGBTrackData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        SerializableGBTrackData.i(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
