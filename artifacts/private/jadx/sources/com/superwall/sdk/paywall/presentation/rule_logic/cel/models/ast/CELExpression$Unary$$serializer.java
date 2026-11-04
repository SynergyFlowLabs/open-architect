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
public /* synthetic */ class CELExpression$Unary$$serializer implements p0<CELExpression.Unary> {

    @NotNull
    public static final CELExpression$Unary$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CELExpression$Unary$$serializer cELExpression$Unary$$serializer = new CELExpression$Unary$$serializer();
        INSTANCE = cELExpression$Unary$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Unary", cELExpression$Unary$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("op", false);
        pluginGeneratedSerialDescriptor.i("expr", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CELExpression$Unary$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CELExpression.Unary.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final CELExpression.Unary deserialize(@NotNull Decoder decoder) {
        CELExpression cELExpression;
        CELUnaryOp cELUnaryOp;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CELExpression.Unary.$childSerializers;
        int i11 = 0 << 1;
        if (dVarBeginStructure.c()) {
            cELUnaryOp = (CELUnaryOp) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            cELExpression = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i12 = 0;
            CELExpression cELExpression2 = null;
            CELUnaryOp cELUnaryOp2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    cELUnaryOp2 = (CELUnaryOp) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], cELUnaryOp2);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    cELExpression2 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], cELExpression2);
                    i12 |= 2;
                }
            }
            cELExpression = cELExpression2;
            cELUnaryOp = cELUnaryOp2;
            i10 = i12;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new CELExpression.Unary(i10, cELUnaryOp, cELExpression, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull CELExpression.Unary value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        CELExpression.Unary.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
