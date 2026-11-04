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
public /* synthetic */ class CELExpression$Member$$serializer implements p0<CELExpression.Member> {

    @NotNull
    public static final CELExpression$Member$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CELExpression$Member$$serializer cELExpression$Member$$serializer = new CELExpression$Member$$serializer();
        INSTANCE = cELExpression$Member$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Member", cELExpression$Member$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("expr", false);
        pluginGeneratedSerialDescriptor.i("member", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CELExpression$Member$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CELExpression.Member.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final CELExpression.Member deserialize(@NotNull Decoder decoder) {
        CELMember cELMember;
        CELExpression cELExpression;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CELExpression.Member.$childSerializers;
        if (dVarBeginStructure.c()) {
            cELExpression = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            cELMember = (CELMember) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            CELMember cELMember2 = null;
            CELExpression cELExpression2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    cELExpression2 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], cELExpression2);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    cELMember2 = (CELMember) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], cELMember2);
                    i11 |= 2;
                }
            }
            cELMember = cELMember2;
            cELExpression = cELExpression2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new CELExpression.Member(i10, cELExpression, cELMember, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull CELExpression.Member value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        CELExpression.Member.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
