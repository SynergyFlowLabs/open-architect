package com.sdk.growthbook.serializable_model;

import hk.a;
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
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.o0;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SerializableGBExperimentResult$$serializer implements p0<SerializableGBExperimentResult> {

    @NotNull
    public static final SerializableGBExperimentResult$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SerializableGBExperimentResult$$serializer serializableGBExperimentResult$$serializer = new SerializableGBExperimentResult$$serializer();
        INSTANCE = serializableGBExperimentResult$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdk.growthbook.serializable_model.SerializableGBExperimentResult", serializableGBExperimentResult$$serializer, 12);
        pluginGeneratedSerialDescriptor.i("inExperiment", true);
        pluginGeneratedSerialDescriptor.i("variationId", true);
        pluginGeneratedSerialDescriptor.i("value", true);
        pluginGeneratedSerialDescriptor.i("hashAttribute", true);
        pluginGeneratedSerialDescriptor.i("hashValue", true);
        pluginGeneratedSerialDescriptor.i("key", true);
        pluginGeneratedSerialDescriptor.i("name", true);
        pluginGeneratedSerialDescriptor.i("bucket", true);
        pluginGeneratedSerialDescriptor.i("passthrough", true);
        pluginGeneratedSerialDescriptor.i("hashUsed", true);
        pluginGeneratedSerialDescriptor.i("featureId", true);
        pluginGeneratedSerialDescriptor.i("stickyBucketUsed", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SerializableGBExperimentResult$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        i iVar = i.f315935a;
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{iVar, y0.f316055a, JsonElementSerializer.INSTANCE, a.v(b3Var), a.v(b3Var), b3Var, a.v(b3Var), a.v(o0.f315985a), a.v(iVar), a.v(iVar), a.v(b3Var), a.v(iVar)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final SerializableGBExperimentResult deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i10;
        String str;
        Boolean bool;
        Boolean bool2;
        String str2;
        Boolean bool3;
        Float f10;
        String str3;
        String str4;
        JsonElement jsonElement;
        int i11;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            int iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
            JsonElement jsonElement2 = (JsonElement) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, JsonElementSerializer.INSTANCE, null);
            b3 b3Var = b3.f315897a;
            String str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b3Var, null);
            String str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, b3Var, null);
            String strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
            String str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b3Var, null);
            Float f11 = (Float) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, o0.f315985a, null);
            i iVar = i.f315935a;
            Boolean bool4 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, iVar, null);
            Boolean bool5 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, iVar, null);
            f10 = f11;
            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, b3Var, null);
            bool = bool5;
            bool3 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, iVar, null);
            str2 = str8;
            str5 = strDecodeStringElement;
            str4 = str6;
            bool2 = bool4;
            str3 = str7;
            jsonElement = jsonElement2;
            i10 = iDecodeIntElement;
            i11 = 4095;
        } else {
            boolean z10 = true;
            zDecodeBooleanElement = false;
            int iDecodeIntElement2 = 0;
            String str9 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            String str10 = null;
            Boolean bool8 = null;
            Float f12 = null;
            String str11 = null;
            String str12 = null;
            String strDecodeStringElement2 = null;
            int i12 = 0;
            JsonElement jsonElement3 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        i12 |= 1;
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        break;
                    case 1:
                        iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        jsonElement3 = (JsonElement) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, JsonElementSerializer.INSTANCE, jsonElement3);
                        i12 |= 4;
                        break;
                    case 3:
                        str12 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, str12);
                        i12 |= 8;
                        break;
                    case 4:
                        str11 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, b3.f315897a, str11);
                        i12 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        str10 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b3.f315897a, str10);
                        i12 |= 64;
                        break;
                    case 7:
                        f12 = (Float) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, o0.f315985a, f12);
                        i12 |= 128;
                        break;
                    case 8:
                        bool7 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, i.f315935a, bool7);
                        i12 |= 256;
                        break;
                    case 9:
                        bool6 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, i.f315935a, bool6);
                        i12 |= 512;
                        break;
                    case 10:
                        str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, b3.f315897a, str9);
                        i12 |= 1024;
                        break;
                    case 11:
                        bool8 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, i.f315935a, bool8);
                        i12 |= 2048;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            i10 = iDecodeIntElement2;
            str = str9;
            bool = bool6;
            bool2 = bool7;
            str2 = str10;
            bool3 = bool8;
            f10 = f12;
            str3 = str11;
            str4 = str12;
            jsonElement = jsonElement3;
            i11 = i12;
            str5 = strDecodeStringElement2;
        }
        boolean z11 = zDecodeBooleanElement;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new SerializableGBExperimentResult(i11, z11, i10, jsonElement, str4, str3, str5, str2, f10, bool2, bool, str, bool3, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull SerializableGBExperimentResult value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        SerializableGBExperimentResult.D(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
