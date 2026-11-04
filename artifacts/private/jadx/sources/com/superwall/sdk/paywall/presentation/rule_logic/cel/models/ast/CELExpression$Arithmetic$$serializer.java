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
public /* synthetic */ class CELExpression$Arithmetic$$serializer implements p0<CELExpression.Arithmetic> {

    @NotNull
    public static final CELExpression$Arithmetic$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CELExpression$Arithmetic$$serializer cELExpression$Arithmetic$$serializer = new CELExpression$Arithmetic$$serializer();
        INSTANCE = cELExpression$Arithmetic$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Arithmetic", cELExpression$Arithmetic$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("left", false);
        pluginGeneratedSerialDescriptor.i("op", false);
        pluginGeneratedSerialDescriptor.i("right", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CELExpression$Arithmetic$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CELExpression.Arithmetic.$childSerializers;
        int i10 = 3 ^ 0;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final CELExpression.Arithmetic deserialize(@NotNull Decoder decoder) {
        int i10;
        CELExpression cELExpression;
        CELArithmeticOp cELArithmeticOp;
        CELExpression cELExpression2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CELExpression.Arithmetic.$childSerializers;
        CELExpression cELExpression3 = null;
        if (dVarBeginStructure.c()) {
            CELExpression cELExpression4 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            CELArithmeticOp cELArithmeticOp2 = (CELArithmeticOp) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            cELExpression2 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            cELExpression = cELExpression4;
            i10 = 7;
            cELArithmeticOp = cELArithmeticOp2;
        } else {
            boolean z10 = true;
            int i11 = 0;
            CELArithmeticOp cELArithmeticOp3 = null;
            CELExpression cELExpression5 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    cELExpression3 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], cELExpression3);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    cELArithmeticOp3 = (CELArithmeticOp) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], cELArithmeticOp3);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    cELExpression5 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], cELExpression5);
                    i11 |= 4;
                }
            }
            i10 = i11;
            cELExpression = cELExpression3;
            cELArithmeticOp = cELArithmeticOp3;
            cELExpression2 = cELExpression5;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new CELExpression.Arithmetic(i10, cELExpression, cELArithmeticOp, cELExpression2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull CELExpression.Arithmetic value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        CELExpression.Arithmetic.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
