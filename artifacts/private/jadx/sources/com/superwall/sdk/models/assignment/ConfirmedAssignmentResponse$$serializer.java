package com.superwall.sdk.models.assignment;

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
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class ConfirmedAssignmentResponse$$serializer implements p0<ConfirmedAssignmentResponse> {

    @NotNull
    public static final ConfirmedAssignmentResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ConfirmedAssignmentResponse$$serializer confirmedAssignmentResponse$$serializer = new ConfirmedAssignmentResponse$$serializer();
        INSTANCE = confirmedAssignmentResponse$$serializer;
        int i10 = 3 | 1;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.assignment.ConfirmedAssignmentResponse", confirmedAssignmentResponse$$serializer, 1);
        pluginGeneratedSerialDescriptor.i("assignments", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConfirmedAssignmentResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ConfirmedAssignmentResponse.$childSerializers[0]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final ConfirmedAssignmentResponse deserialize(@NotNull Decoder decoder) {
        List list;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ConfirmedAssignmentResponse.$childSerializers;
        int i10 = 1;
        int i11 = 5 ^ 0;
        if (dVarBeginStructure.c()) {
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
        } else {
            boolean z10 = true;
            int i12 = 0;
            List list2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new t0(iDecodeElementIndex);
                    }
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list2);
                    i12 = 1;
                }
            }
            list = list2;
            i10 = i12;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new ConfirmedAssignmentResponse(i10, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull ConfirmedAssignmentResponse value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        eVarBeginStructure.encodeSerializableElement(serialDescriptor, 0, ConfirmedAssignmentResponse.$childSerializers[0], value.assignments);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
