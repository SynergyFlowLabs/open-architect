package com.superwall.sdk.models.triggers;

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
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class TriggerRuleOccurrence$$serializer implements p0<TriggerRuleOccurrence> {

    @NotNull
    public static final TriggerRuleOccurrence$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        TriggerRuleOccurrence$$serializer triggerRuleOccurrence$$serializer = new TriggerRuleOccurrence$$serializer();
        INSTANCE = triggerRuleOccurrence$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.triggers.TriggerRuleOccurrence", triggerRuleOccurrence$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("key", false);
        pluginGeneratedSerialDescriptor.i("max_count", false);
        pluginGeneratedSerialDescriptor.i("interval", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TriggerRuleOccurrence$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        int i10 = 5 | 0;
        return new KSerializer[]{b3.f315897a, y0.f316055a, RawInterval$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final TriggerRuleOccurrence deserialize(@NotNull Decoder decoder) {
        int i10;
        int i11;
        String str;
        RawInterval rawInterval;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
            str = strDecodeStringElement;
            rawInterval = (RawInterval) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, RawInterval$$serializer.INSTANCE, null);
            i10 = iDecodeIntElement;
            i11 = 7;
        } else {
            boolean z10 = true;
            int iDecodeIntElement2 = 0;
            String strDecodeStringElement2 = null;
            RawInterval rawInterval2 = null;
            int i12 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i12 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    rawInterval2 = (RawInterval) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, RawInterval$$serializer.INSTANCE, rawInterval2);
                    i12 |= 4;
                }
            }
            i10 = iDecodeIntElement2;
            i11 = i12;
            str = strDecodeStringElement2;
            rawInterval = rawInterval2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new TriggerRuleOccurrence(i11, str, i10, rawInterval, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull TriggerRuleOccurrence value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        TriggerRuleOccurrence.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
