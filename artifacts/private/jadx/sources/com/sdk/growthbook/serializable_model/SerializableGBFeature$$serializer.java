package com.sdk.growthbook.serializable_model;

import hk.a;
import java.util.List;
import kotlin.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SerializableGBFeature$$serializer implements p0<SerializableGBFeature> {

    @NotNull
    public static final SerializableGBFeature$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SerializableGBFeature$$serializer serializableGBFeature$$serializer = new SerializableGBFeature$$serializer();
        INSTANCE = serializableGBFeature$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdk.growthbook.serializable_model.SerializableGBFeature", serializableGBFeature$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("defaultValue", true);
        pluginGeneratedSerialDescriptor.i("rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SerializableGBFeature$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.v(JsonElementSerializer.INSTANCE), a.v((KSerializer) SerializableGBFeature.f266450c[1].getValue())};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final SerializableGBFeature deserialize(@NotNull Decoder decoder) {
        List list;
        JsonElement jsonElement;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        f0[] f0VarArr = SerializableGBFeature.f266450c;
        if (dVarBeginStructure.c()) {
            jsonElement = (JsonElement) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, JsonElementSerializer.INSTANCE, null);
            list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (e) f0VarArr[1].getValue(), null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            JsonElement jsonElement2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    jsonElement2 = (JsonElement) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, JsonElementSerializer.INSTANCE, jsonElement2);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (e) f0VarArr[1].getValue(), list2);
                    i11 |= 2;
                }
            }
            list = list2;
            jsonElement = jsonElement2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new SerializableGBFeature(i10, jsonElement, list, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull SerializableGBFeature value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        SerializableGBFeature.j(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
