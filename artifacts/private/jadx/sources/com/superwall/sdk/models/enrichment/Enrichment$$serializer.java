package com.superwall.sdk.models.enrichment;

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
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class Enrichment$$serializer implements p0<Enrichment> {

    @NotNull
    public static final Enrichment$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Enrichment$$serializer enrichment$$serializer = new Enrichment$$serializer();
        INSTANCE = enrichment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.enrichment.Enrichment", enrichment$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("user", false);
        pluginGeneratedSerialDescriptor.i("device", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Enrichment$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.INSTANCE;
        return new KSerializer[]{jsonObjectSerializer, jsonObjectSerializer};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final Enrichment deserialize(@NotNull Decoder decoder) {
        JsonObject jsonObject;
        int i10;
        JsonObject jsonObject2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        int i11 = 4 ^ 1;
        boolean z10 = false;
        if (dVarBeginStructure.c()) {
            JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.INSTANCE;
            jsonObject2 = (JsonObject) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, jsonObjectSerializer, null);
            jsonObject = (JsonObject) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, jsonObjectSerializer, null);
            i10 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            jsonObject = null;
            JsonObject jsonObject3 = null;
            while (z11) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    jsonObject3 = (JsonObject) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, JsonObjectSerializer.INSTANCE, jsonObject3);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    jsonObject = (JsonObject) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, JsonObjectSerializer.INSTANCE, jsonObject);
                    i12 |= 2;
                }
            }
            i10 = i12;
            jsonObject2 = jsonObject3;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new Enrichment(i10, jsonObject2, jsonObject, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull Enrichment value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Enrichment.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
