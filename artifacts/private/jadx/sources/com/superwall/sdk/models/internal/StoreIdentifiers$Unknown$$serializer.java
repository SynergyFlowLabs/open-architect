package com.superwall.sdk.models.internal;

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
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class StoreIdentifiers$Unknown$$serializer implements p0<StoreIdentifiers.Unknown> {

    @NotNull
    public static final StoreIdentifiers$Unknown$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StoreIdentifiers$Unknown$$serializer storeIdentifiers$Unknown$$serializer = new StoreIdentifiers$Unknown$$serializer();
        INSTANCE = storeIdentifiers$Unknown$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("UNKNOWN", storeIdentifiers$Unknown$$serializer, 1);
        pluginGeneratedSerialDescriptor.i("properties", false);
        pluginGeneratedSerialDescriptor.q(new RedemptionResult$Error$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("store"));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StoreIdentifiers$Unknown$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StoreIdentifiers.Unknown.$childSerializers[0]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final StoreIdentifiers.Unknown deserialize(@NotNull Decoder decoder) {
        Map map;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = StoreIdentifiers.Unknown.$childSerializers;
        int i10 = 1;
        if (dVarBeginStructure.c()) {
            map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            Map map2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new t0(iDecodeElementIndex);
                    }
                    map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], map2);
                    i11 = 1;
                }
            }
            map = map2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new StoreIdentifiers.Unknown(i10, map, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull StoreIdentifiers.Unknown value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        StoreIdentifiers.Unknown.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
