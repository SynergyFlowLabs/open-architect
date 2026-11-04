package com.superwall.sdk.models.events;

import com.devtodev.analytics.internal.storage.sqlite.ExperimentsEntry;
import com.superwall.sdk.models.serialization.DateSerializer;
import java.util.Date;
import java.util.Map;
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
public /* synthetic */ class EventData$$serializer implements p0<EventData> {

    @NotNull
    public static final EventData$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        EventData$$serializer eventData$$serializer = new EventData$$serializer();
        INSTANCE = eventData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.events.EventData", eventData$$serializer, 4);
        pluginGeneratedSerialDescriptor.i("event_id", true);
        int i10 = 1 >> 0;
        pluginGeneratedSerialDescriptor.i("event_name", false);
        pluginGeneratedSerialDescriptor.i(ExperimentsEntry.parameters, false);
        pluginGeneratedSerialDescriptor.i("created_at", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = EventData.$childSerializers[2];
        b3 b3Var = b3.f315897a;
        int i10 = 4 | 3;
        return new KSerializer[]{b3Var, b3Var, kSerializer, DateSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final EventData deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        String str2;
        Map map;
        Date date;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = EventData.$childSerializers;
        String strDecodeStringElement = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            str = strDecodeStringElement2;
            date = (Date) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, DateSerializer.INSTANCE, null);
            i10 = 15;
            str2 = strDecodeStringElement3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strDecodeStringElement4 = null;
            Map map2 = null;
            Date date2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], map2);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new t0(iDecodeElementIndex);
                    }
                    date2 = (Date) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, DateSerializer.INSTANCE, date2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            map = map2;
            date = date2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new EventData(i10, str, str2, map, date, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull EventData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        EventData.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
