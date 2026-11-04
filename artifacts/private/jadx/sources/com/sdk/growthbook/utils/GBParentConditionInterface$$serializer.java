package com.sdk.growthbook.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class GBParentConditionInterface$$serializer implements p0<GBParentConditionInterface> {

    @NotNull
    public static final GBParentConditionInterface$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        GBParentConditionInterface$$serializer gBParentConditionInterface$$serializer = new GBParentConditionInterface$$serializer();
        INSTANCE = gBParentConditionInterface$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdk.growthbook.utils.GBParentConditionInterface", gBParentConditionInterface$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("id", false);
        pluginGeneratedSerialDescriptor.i("condition", false);
        pluginGeneratedSerialDescriptor.i("gate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GBParentConditionInterface$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a, JsonElementSerializer.INSTANCE, hk.a.v(kotlinx.serialization.internal.i.f315935a)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final GBParentConditionInterface deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        JsonElement jsonElement;
        Boolean bool;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            JsonElement jsonElement2 = (JsonElement) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, JsonElementSerializer.INSTANCE, null);
            str = strDecodeStringElement2;
            bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.i.f315935a, null);
            jsonElement = jsonElement2;
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            JsonElement jsonElement3 = null;
            Boolean bool2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jsonElement3 = (JsonElement) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, JsonElementSerializer.INSTANCE, jsonElement3);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new t0(iDecodeElementIndex);
                    }
                    bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.i.f315935a, bool2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = strDecodeStringElement;
            jsonElement = jsonElement3;
            bool = bool2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new GBParentConditionInterface(i10, str, jsonElement, bool, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull GBParentConditionInterface value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        GBParentConditionInterface.i(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
