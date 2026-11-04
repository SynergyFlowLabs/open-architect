package com.sdk.growthbook.utils;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class GBFilter$$serializer implements p0<GBFilter> {

    @NotNull
    public static final GBFilter$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        GBFilter$$serializer gBFilter$$serializer = new GBFilter$$serializer();
        INSTANCE = gBFilter$$serializer;
        int i10 = 5 >> 5;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdk.growthbook.utils.GBFilter", gBFilter$$serializer, 5);
        pluginGeneratedSerialDescriptor.i("seed", false);
        pluginGeneratedSerialDescriptor.i("ranges", false);
        pluginGeneratedSerialDescriptor.i("attribute", true);
        pluginGeneratedSerialDescriptor.i("hashVersion", true);
        pluginGeneratedSerialDescriptor.i("fallbackAttribute", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GBFilter$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, r.a.f266516a, hk.a.v(b3Var), hk.a.v(y0.f316055a), hk.a.v(b3Var)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final GBFilter deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        List list;
        String str2;
        Integer num;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            List list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, r.a.f266516a, null);
            b3 b3Var = b3.f315897a;
            String str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b3Var, null);
            str = strDecodeStringElement2;
            num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, y0.f316055a, null);
            str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, b3Var, null);
            str2 = str4;
            list = list2;
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list3 = null;
            String str5 = null;
            Integer num2 = null;
            String str6 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, r.a.f266516a, list3);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b3.f315897a, str5);
                    i11 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    num2 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, y0.f316055a, num2);
                    i11 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new t0(iDecodeElementIndex);
                    }
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, b3.f315897a, str6);
                    i11 |= 16;
                }
            }
            i10 = i11;
            str = strDecodeStringElement;
            list = list3;
            str2 = str5;
            num = num2;
            str3 = str6;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new GBFilter(i10, str, list, str2, num, str3, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull GBFilter value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        GBFilter.l(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
