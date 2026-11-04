package com.superwall.sdk.models.triggers;

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
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class RawExperiment$$serializer implements p0<RawExperiment> {

    @NotNull
    public static final RawExperiment$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RawExperiment$$serializer rawExperiment$$serializer = new RawExperiment$$serializer();
        INSTANCE = rawExperiment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.triggers.RawExperiment", rawExperiment$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("id", false);
        pluginGeneratedSerialDescriptor.i("groupId", false);
        pluginGeneratedSerialDescriptor.i("variants", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RawExperiment$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = RawExperiment.$childSerializers[2];
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, b3Var, kSerializer};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final RawExperiment deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        String str2;
        List list;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RawExperiment.$childSerializers;
        String strDecodeStringElement = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            str = strDecodeStringElement2;
            i10 = 7;
            str2 = strDecodeStringElement3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strDecodeStringElement4 = null;
            List list2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            list = list2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new RawExperiment(i10, str, str2, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull RawExperiment value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        RawExperiment.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
