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
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class CELExpression$And$$serializer implements p0<CELExpression.And> {

    @NotNull
    public static final CELExpression$And$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CELExpression$And$$serializer cELExpression$And$$serializer = new CELExpression$And$$serializer();
        INSTANCE = cELExpression$And$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("And", cELExpression$And$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("left", false);
        pluginGeneratedSerialDescriptor.i("right", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CELExpression$And$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CELExpression.And.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final CELExpression.And deserialize(@NotNull Decoder decoder) {
        CELExpression cELExpression;
        CELExpression cELExpression2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CELExpression.And.$childSerializers;
        if (dVarBeginStructure.c()) {
            cELExpression2 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            cELExpression = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            CELExpression cELExpression3 = null;
            CELExpression cELExpression4 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    cELExpression4 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], cELExpression4);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    cELExpression3 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], cELExpression3);
                    i11 |= 2;
                }
            }
            cELExpression = cELExpression3;
            cELExpression2 = cELExpression4;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new CELExpression.And(i10, cELExpression2, cELExpression, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull CELExpression.And value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        CELExpression.And.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
