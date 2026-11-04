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
public /* synthetic */ class AssignmentPostback$$serializer implements p0<AssignmentPostback> {

    @NotNull
    public static final AssignmentPostback$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AssignmentPostback$$serializer assignmentPostback$$serializer = new AssignmentPostback$$serializer();
        INSTANCE = assignmentPostback$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.assignment.AssignmentPostback", assignmentPostback$$serializer, 1);
        int i10 = 7 & 0;
        pluginGeneratedSerialDescriptor.i("assignments", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AssignmentPostback$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        int i10 = 2 & 1;
        return new KSerializer[]{AssignmentPostback.$childSerializers[0]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final AssignmentPostback deserialize(@NotNull Decoder decoder) {
        List list;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AssignmentPostback.$childSerializers;
        int i10 = 1;
        if (dVarBeginStructure.c()) {
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
        } else {
            boolean z10 = true;
            int i11 = 0;
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
                    i11 = 1;
                }
            }
            list = list2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new AssignmentPostback(i10, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull AssignmentPostback value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        eVarBeginStructure.encodeSerializableElement(serialDescriptor, 0, AssignmentPostback.$childSerializers[0], value.assignments);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
