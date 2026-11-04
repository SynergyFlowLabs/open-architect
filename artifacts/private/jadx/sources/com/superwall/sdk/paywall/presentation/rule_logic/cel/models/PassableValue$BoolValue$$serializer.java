package com.superwall.sdk.paywall.presentation.rule_logic.cel.models;

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
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class PassableValue$BoolValue$$serializer implements p0<PassableValue.BoolValue> {

    @NotNull
    public static final PassableValue$BoolValue$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PassableValue$BoolValue$$serializer passableValue$BoolValue$$serializer = new PassableValue$BoolValue$$serializer();
        INSTANCE = passableValue$BoolValue$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("bool", passableValue$BoolValue$$serializer, 1);
        pluginGeneratedSerialDescriptor.i("value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PassableValue$BoolValue$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{i.f315935a};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final PassableValue.BoolValue deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 1;
        int i11 = 5 >> 0;
        if (dVarBeginStructure.c()) {
            zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
        } else {
            boolean z10 = true;
            zDecodeBooleanElement = false;
            int i12 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new t0(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i12 = 1;
                }
            }
            i10 = i12;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new PassableValue.BoolValue(i10, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull PassableValue.BoolValue value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        eVarBeginStructure.encodeBooleanElement(serialDescriptor, 0, value.value);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
