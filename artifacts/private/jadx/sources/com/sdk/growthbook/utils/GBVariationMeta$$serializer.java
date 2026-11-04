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
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class GBVariationMeta$$serializer implements p0<GBVariationMeta> {

    @NotNull
    public static final GBVariationMeta$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        GBVariationMeta$$serializer gBVariationMeta$$serializer = new GBVariationMeta$$serializer();
        INSTANCE = gBVariationMeta$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdk.growthbook.utils.GBVariationMeta", gBVariationMeta$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("key", true);
        pluginGeneratedSerialDescriptor.i("name", true);
        pluginGeneratedSerialDescriptor.i("passthrough", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GBVariationMeta$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{hk.a.v(b3Var), hk.a.v(b3Var), hk.a.v(kotlinx.serialization.internal.i.f315935a)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final GBVariationMeta deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        String str2;
        Boolean bool;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        String str3 = null;
        if (dVarBeginStructure.c()) {
            b3 b3Var = b3.f315897a;
            String str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, b3Var, null);
            str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b3Var, null);
            bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.i.f315935a, null);
            i10 = 7;
            str = str4;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str5 = null;
            Boolean bool2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, b3.f315897a, str3);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, str5);
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
            str = str3;
            str2 = str5;
            bool = bool2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new GBVariationMeta(i10, str, str2, bool, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull GBVariationMeta value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        GBVariationMeta.l(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
