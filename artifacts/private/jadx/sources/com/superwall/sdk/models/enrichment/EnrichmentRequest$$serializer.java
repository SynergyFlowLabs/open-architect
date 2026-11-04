package com.superwall.sdk.models.enrichment;

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
public /* synthetic */ class EnrichmentRequest$$serializer implements p0<EnrichmentRequest> {

    @NotNull
    public static final EnrichmentRequest$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        EnrichmentRequest$$serializer enrichmentRequest$$serializer = new EnrichmentRequest$$serializer();
        INSTANCE = enrichmentRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.enrichment.EnrichmentRequest", enrichmentRequest$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("user", false);
        pluginGeneratedSerialDescriptor.i("device", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EnrichmentRequest$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = EnrichmentRequest.$childSerializers;
        boolean z10 = !false;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final EnrichmentRequest deserialize(@NotNull Decoder decoder) {
        Map map;
        Map map2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = EnrichmentRequest.$childSerializers;
        if (dVarBeginStructure.c()) {
            map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Map map3 = null;
            Map map4 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    map4 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], map4);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    map3 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], map3);
                    i11 |= 2;
                }
            }
            map = map3;
            map2 = map4;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new EnrichmentRequest(i10, map2, map, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull EnrichmentRequest value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        EnrichmentRequest.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
