package com.superwall.sdk.models.assignment;

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
public /* synthetic */ class Assignment$$serializer implements p0<Assignment> {

    @NotNull
    public static final Assignment$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Assignment$$serializer assignment$$serializer = new Assignment$$serializer();
        INSTANCE = assignment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.assignment.Assignment", assignment$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("experimentId", false);
        pluginGeneratedSerialDescriptor.i("variantId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Assignment$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, b3Var};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final Assignment deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        int i11 = 7 & 1;
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i12 = 0;
            strDecodeStringElement = null;
            String strDecodeStringElement3 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i12 |= 2;
                }
            }
            strDecodeStringElement2 = strDecodeStringElement3;
            i10 = i12;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new Assignment(i10, strDecodeStringElement, strDecodeStringElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull Assignment value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Assignment.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
