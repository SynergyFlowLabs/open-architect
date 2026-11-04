package com.superwall.sdk.models.triggers;

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
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class Trigger$$serializer implements p0<Trigger> {

    @NotNull
    public static final Trigger$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Trigger$$serializer trigger$$serializer = new Trigger$$serializer();
        INSTANCE = trigger$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.triggers.Trigger", trigger$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("eventName", false);
        pluginGeneratedSerialDescriptor.i("rules", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Trigger$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a, Trigger.$childSerializers[1]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final Trigger deserialize(@NotNull Decoder decoder) {
        List list;
        String strDecodeStringElement;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Trigger.$childSerializers;
        v2 v2Var = null;
        int i11 = 6 >> 0;
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i12 = 0;
            List list2 = null;
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
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list2);
                    i12 |= 2;
                }
            }
            list = list2;
            strDecodeStringElement = strDecodeStringElement2;
            i10 = i12;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new Trigger(i10, strDecodeStringElement, list, v2Var);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull Trigger value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Trigger.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
