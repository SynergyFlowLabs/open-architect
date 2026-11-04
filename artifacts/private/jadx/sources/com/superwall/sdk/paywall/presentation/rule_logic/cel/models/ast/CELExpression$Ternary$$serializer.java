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
public /* synthetic */ class CELExpression$Ternary$$serializer implements p0<CELExpression.Ternary> {

    @NotNull
    public static final CELExpression$Ternary$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CELExpression$Ternary$$serializer cELExpression$Ternary$$serializer = new CELExpression$Ternary$$serializer();
        INSTANCE = cELExpression$Ternary$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Ternary", cELExpression$Ternary$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("condition", false);
        pluginGeneratedSerialDescriptor.i("trueExpr", false);
        pluginGeneratedSerialDescriptor.i("falseExpr", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CELExpression$Ternary$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CELExpression.Ternary.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final CELExpression.Ternary deserialize(@NotNull Decoder decoder) {
        int i10;
        CELExpression cELExpression;
        CELExpression cELExpression2;
        CELExpression cELExpression3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CELExpression.Ternary.$childSerializers;
        CELExpression cELExpression4 = null;
        if (dVarBeginStructure.c()) {
            CELExpression cELExpression5 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            CELExpression cELExpression6 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            cELExpression3 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            cELExpression = cELExpression5;
            i10 = 7;
            cELExpression2 = cELExpression6;
        } else {
            boolean z10 = true;
            int i11 = 0;
            CELExpression cELExpression7 = null;
            CELExpression cELExpression8 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    cELExpression4 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], cELExpression4);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    cELExpression7 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], cELExpression7);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    cELExpression8 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], cELExpression8);
                    i11 |= 4;
                }
            }
            i10 = i11;
            cELExpression = cELExpression4;
            cELExpression2 = cELExpression7;
            cELExpression3 = cELExpression8;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new CELExpression.Ternary(i10, cELExpression, cELExpression2, cELExpression3, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull CELExpression.Ternary value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        CELExpression.Ternary.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
