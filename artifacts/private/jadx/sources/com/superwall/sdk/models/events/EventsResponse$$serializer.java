package com.superwall.sdk.models.events;

import hk.a;
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
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class EventsResponse$$serializer implements p0<EventsResponse> {

    @NotNull
    public static final EventsResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        EventsResponse$$serializer eventsResponse$$serializer = new EventsResponse$$serializer();
        INSTANCE = eventsResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.events.EventsResponse", eventsResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("status", false);
        pluginGeneratedSerialDescriptor.i("invalidIndexes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventsResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StatusSerializer.INSTANCE, a.v(EventsResponse.$childSerializers[1])};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final EventsResponse deserialize(@NotNull Decoder decoder) {
        List list;
        EventsResponse.Status status;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = EventsResponse.$childSerializers;
        if (dVarBeginStructure.c()) {
            status = (EventsResponse.Status) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, StatusSerializer.INSTANCE, null);
            list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            EventsResponse.Status status2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    status2 = (EventsResponse.Status) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, StatusSerializer.INSTANCE, status2);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list2);
                    i11 |= 2;
                }
            }
            list = list2;
            status = status2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new EventsResponse(i10, status, list, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull EventsResponse value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        EventsResponse.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
