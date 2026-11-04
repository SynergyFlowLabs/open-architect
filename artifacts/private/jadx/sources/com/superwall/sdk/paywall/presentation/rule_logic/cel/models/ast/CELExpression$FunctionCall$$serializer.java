package com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast;

import hk.a;
import io.sentry.protocol.z;
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
public /* synthetic */ class CELExpression$FunctionCall$$serializer implements p0<CELExpression.FunctionCall> {

    @NotNull
    public static final CELExpression$FunctionCall$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CELExpression$FunctionCall$$serializer cELExpression$FunctionCall$$serializer = new CELExpression$FunctionCall$$serializer();
        INSTANCE = cELExpression$FunctionCall$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FunctionCall", cELExpression$FunctionCall$$serializer, 3);
        pluginGeneratedSerialDescriptor.i(z.b.f306535b, false);
        pluginGeneratedSerialDescriptor.i("receiver", false);
        pluginGeneratedSerialDescriptor.i("arguments", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CELExpression$FunctionCall$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CELExpression.FunctionCall.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], a.v(kSerializerArr[1]), kSerializerArr[2]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final CELExpression.FunctionCall deserialize(@NotNull Decoder decoder) {
        int i10;
        CELExpression cELExpression;
        CELExpression cELExpression2;
        List list;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CELExpression.FunctionCall.$childSerializers;
        CELExpression cELExpression3 = null;
        if (dVarBeginStructure.c()) {
            CELExpression cELExpression4 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            CELExpression cELExpression5 = (CELExpression) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            cELExpression = cELExpression4;
            i10 = 7;
            cELExpression2 = cELExpression5;
        } else {
            boolean z10 = true;
            int i11 = 0;
            CELExpression cELExpression6 = null;
            List list2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    cELExpression3 = (CELExpression) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], cELExpression3);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    cELExpression6 = (CELExpression) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], cELExpression6);
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
            cELExpression = cELExpression3;
            cELExpression2 = cELExpression6;
            list = list2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new CELExpression.FunctionCall(i10, cELExpression, cELExpression2, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull CELExpression.FunctionCall value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        CELExpression.FunctionCall.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
