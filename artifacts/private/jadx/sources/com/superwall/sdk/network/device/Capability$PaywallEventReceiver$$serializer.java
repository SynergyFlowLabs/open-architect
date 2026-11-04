package com.superwall.sdk.network.device;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class Capability$PaywallEventReceiver$$serializer implements p0<Capability.PaywallEventReceiver> {

    @NotNull
    public static final Capability$PaywallEventReceiver$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Capability$PaywallEventReceiver$$serializer capability$PaywallEventReceiver$$serializer = new Capability$PaywallEventReceiver$$serializer();
        INSTANCE = capability$PaywallEventReceiver$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("paywall_event_receiver", capability$PaywallEventReceiver$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("name", false);
        int i10 = 5 & 1;
        pluginGeneratedSerialDescriptor.i("event_names", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Capability$PaywallEventReceiver$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a, Capability.PaywallEventReceiver.$childSerializers[1]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final Capability.PaywallEventReceiver deserialize(@NotNull Decoder decoder) {
        List list;
        String strDecodeStringElement;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Capability.PaywallEventReceiver.$childSerializers;
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i10 = 3;
            int i11 = 2 & 3;
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
        return new Capability.PaywallEventReceiver(i10, strDecodeStringElement, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull Capability.PaywallEventReceiver value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Capability.PaywallEventReceiver.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
