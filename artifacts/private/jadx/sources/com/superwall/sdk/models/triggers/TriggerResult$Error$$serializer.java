package com.superwall.sdk.models.triggers;

import com.superwall.sdk.models.serialization.ExceptionSerializer;
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
public /* synthetic */ class TriggerResult$Error$$serializer implements p0<TriggerResult.Error> {

    @NotNull
    public static final TriggerResult$Error$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        TriggerResult$Error$$serializer triggerResult$Error$$serializer = new TriggerResult$Error$$serializer();
        INSTANCE = triggerResult$Error$$serializer;
        boolean z10 = !true;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.triggers.TriggerResult.Error", triggerResult$Error$$serializer, 1);
        pluginGeneratedSerialDescriptor.i("error", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TriggerResult$Error$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ExceptionSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final TriggerResult.Error deserialize(@NotNull Decoder decoder) {
        Exception exc;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 1;
        if (dVarBeginStructure.c()) {
            exc = (Exception) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ExceptionSerializer.INSTANCE, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            exc = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new t0(iDecodeElementIndex);
                    }
                    exc = (Exception) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ExceptionSerializer.INSTANCE, exc);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new TriggerResult.Error(i10, exc, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull TriggerResult.Error value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        TriggerResult.Error.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
