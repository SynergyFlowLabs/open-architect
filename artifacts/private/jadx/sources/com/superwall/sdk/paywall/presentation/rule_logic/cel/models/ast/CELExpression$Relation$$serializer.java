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
public /* synthetic */ class CELExpression$Relation$$serializer implements p0<CELExpression.Relation> {

    @NotNull
    public static final CELExpression$Relation$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CELExpression$Relation$$serializer cELExpression$Relation$$serializer = new CELExpression$Relation$$serializer();
        INSTANCE = cELExpression$Relation$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Relation", cELExpression$Relation$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("left", false);
        pluginGeneratedSerialDescriptor.i("op", false);
        pluginGeneratedSerialDescriptor.i("right", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CELExpression$Relation$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CELExpression.Relation.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final CELExpression.Relation deserialize(@NotNull Decoder decoder) {
        int i10;
        CELExpression cELExpression;
        CELRelationOp cELRelationOp;
        CELExpression cELExpression2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CELExpression.Relation.$childSerializers;
        CELExpression cELExpression3 = null;
        if (dVarBeginStructure.c()) {
            CELExpression cELExpression4 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            CELRelationOp cELRelationOp2 = (CELRelationOp) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            cELExpression2 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            cELExpression = cELExpression4;
            i10 = 7;
            cELRelationOp = cELRelationOp2;
        } else {
            boolean z10 = true;
            int i11 = 0;
            CELRelationOp cELRelationOp3 = null;
            CELExpression cELExpression5 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    cELExpression3 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], cELExpression3);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    cELRelationOp3 = (CELRelationOp) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], cELRelationOp3);
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
            cELRelationOp = cELRelationOp3;
            cELExpression2 = cELExpression5;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new CELExpression.Relation(i10, cELExpression, cELRelationOp, cELExpression2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull CELExpression.Relation value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        CELExpression.Relation.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
