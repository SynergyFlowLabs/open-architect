package com.superwall.sdk.paywall.presentation.rule_logic.cel.models;

import io.sentry.protocol.z;
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
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class PassableValue$FunctionValue$$serializer implements p0<PassableValue.FunctionValue> {

    @NotNull
    public static final PassableValue$FunctionValue$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PassableValue$FunctionValue$$serializer passableValue$FunctionValue$$serializer = new PassableValue$FunctionValue$$serializer();
        INSTANCE = passableValue$FunctionValue$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(z.b.f306535b, passableValue$FunctionValue$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("value", false);
        pluginGeneratedSerialDescriptor.i("args", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PassableValue$FunctionValue$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a, hk.a.v(PassableValue.FunctionValue.$childSerializers[1])};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final PassableValue.FunctionValue deserialize(@NotNull Decoder decoder) {
        PassableValue passableValue;
        String strDecodeStringElement;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PassableValue.FunctionValue.$childSerializers;
        int i11 = 0 << 1;
        v2 v2Var = null;
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            passableValue = (PassableValue) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i12 = 0;
            PassableValue passableValue2 = null;
            String strDecodeStringElement2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    passableValue2 = (PassableValue) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], passableValue2);
                    i12 |= 2;
                }
            }
            passableValue = passableValue2;
            strDecodeStringElement = strDecodeStringElement2;
            i10 = i12;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new PassableValue.FunctionValue(i10, strDecodeStringElement, passableValue, v2Var);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull PassableValue.FunctionValue value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        PassableValue.FunctionValue.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
