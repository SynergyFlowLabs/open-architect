package com.sdk.growthbook.serializable_model;

import androidx.constraintlayout.core.motion.utils.v;
import com.facebook.share.internal.f;
import com.sdk.growthbook.utils.r;
import com.segment.analytics.kotlin.android.plugins.a;
import io.sentry.protocol.j;
import java.util.ArrayList;
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
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.o0;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SerializableGBExperiment$$serializer implements p0<SerializableGBExperiment> {

    @NotNull
    public static final SerializableGBExperiment$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SerializableGBExperiment$$serializer serializableGBExperiment$$serializer = new SerializableGBExperiment$$serializer();
        INSTANCE = serializableGBExperiment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdk.growthbook.serializable_model.SerializableGBExperiment", serializableGBExperiment$$serializer, 21);
        pluginGeneratedSerialDescriptor.i("key", false);
        pluginGeneratedSerialDescriptor.i("variations", true);
        pluginGeneratedSerialDescriptor.i(a.f266546o, true);
        pluginGeneratedSerialDescriptor.i("hashAttribute", true);
        pluginGeneratedSerialDescriptor.i("weights", true);
        pluginGeneratedSerialDescriptor.i("active", true);
        pluginGeneratedSerialDescriptor.i("coverage", true);
        pluginGeneratedSerialDescriptor.i("condition", true);
        pluginGeneratedSerialDescriptor.i("parentConditions", true);
        pluginGeneratedSerialDescriptor.i("force", true);
        pluginGeneratedSerialDescriptor.i("hashVersion", true);
        pluginGeneratedSerialDescriptor.i("ranges", true);
        pluginGeneratedSerialDescriptor.i(j.b.f306355e, true);
        pluginGeneratedSerialDescriptor.i(f.f101835h, true);
        pluginGeneratedSerialDescriptor.i("seed", true);
        pluginGeneratedSerialDescriptor.i("name", true);
        pluginGeneratedSerialDescriptor.i(v.c.S, true);
        pluginGeneratedSerialDescriptor.i("fallBackAttribute", true);
        pluginGeneratedSerialDescriptor.i("disableStickyBucketing", true);
        pluginGeneratedSerialDescriptor.i("bucketVersion", true);
        pluginGeneratedSerialDescriptor.i("minBucketVersion", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SerializableGBExperiment$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        f0[] f0VarArr = SerializableGBExperiment.f266416v;
        b3 b3Var = b3.f315897a;
        i iVar = i.f315935a;
        y0 y0Var = y0.f316055a;
        return new KSerializer[]{b3Var, f0VarArr[1].getValue(), hk.a.v(JsonArraySerializer.INSTANCE), hk.a.v(b3Var), hk.a.v((KSerializer) f0VarArr[4].getValue()), hk.a.v(iVar), hk.a.v(o0.f315985a), hk.a.v(JsonElementSerializer.INSTANCE), hk.a.v((KSerializer) f0VarArr[8].getValue()), hk.a.v(y0Var), hk.a.v(y0Var), hk.a.v(r.a.f266516a), hk.a.v((KSerializer) f0VarArr[12].getValue()), hk.a.v((KSerializer) f0VarArr[13].getValue()), hk.a.v(b3Var), hk.a.v(b3Var), hk.a.v(b3Var), hk.a.v(b3Var), hk.a.v(iVar), hk.a.v(y0Var), hk.a.v(y0Var)};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final SerializableGBExperiment deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        int i10;
        List list;
        Integer num;
        String str;
        Integer num2;
        ArrayList arrayList;
        String str2;
        String str3;
        List list2;
        Integer num3;
        Integer num4;
        ArrayList arrayList2;
        JsonArray jsonArray;
        String str4;
        List list3;
        Boolean bool2;
        Float f10;
        JsonElement jsonElement;
        ArrayList arrayList3;
        String str5;
        String str6;
        int i11;
        int i12;
        ArrayList arrayList4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        f0[] f0VarArr = SerializableGBExperiment.f266416v;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            List list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (e) f0VarArr[1].getValue(), null);
            JsonArray jsonArray2 = (JsonArray) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, JsonArraySerializer.INSTANCE, null);
            b3 b3Var = b3.f315897a;
            String str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b3Var, null);
            List list5 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (e) f0VarArr[4].getValue(), null);
            i iVar = i.f315935a;
            Boolean bool3 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, iVar, null);
            Float f11 = (Float) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, o0.f315985a, null);
            JsonElement jsonElement2 = (JsonElement) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, JsonElementSerializer.INSTANCE, null);
            ArrayList arrayList5 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (e) f0VarArr[8].getValue(), null);
            y0 y0Var = y0.f316055a;
            Integer num5 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, y0Var, null);
            Integer num6 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, y0Var, null);
            List list6 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, r.a.f266516a, null);
            ArrayList arrayList6 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (e) f0VarArr[12].getValue(), null);
            ArrayList arrayList7 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (e) f0VarArr[13].getValue(), null);
            String str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, b3Var, null);
            String str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, b3Var, null);
            String str10 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, b3Var, null);
            String str11 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, b3Var, null);
            bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, iVar, null);
            Integer num7 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, y0Var, null);
            i10 = 2097151;
            str = str11;
            num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, y0Var, null);
            str5 = str8;
            str4 = str7;
            list = list4;
            jsonArray = jsonArray2;
            arrayList3 = arrayList5;
            list3 = list5;
            num2 = num7;
            f10 = f11;
            jsonElement = jsonElement2;
            bool2 = bool3;
            str3 = str10;
            str2 = str9;
            arrayList2 = arrayList7;
            arrayList = arrayList6;
            list2 = list6;
            num4 = num5;
            num3 = num6;
            str6 = strDecodeStringElement;
        } else {
            int i13 = 1;
            boolean z10 = true;
            int i14 = 8;
            int i15 = 4;
            ArrayList arrayList8 = null;
            String str12 = null;
            Integer num8 = null;
            Integer num9 = null;
            bool = null;
            ArrayList arrayList9 = null;
            ArrayList arrayList10 = null;
            String str13 = null;
            String str14 = null;
            List list7 = null;
            Integer num10 = null;
            Integer num11 = null;
            String strDecodeStringElement2 = null;
            List list8 = null;
            JsonArray jsonArray3 = null;
            String str15 = null;
            List list9 = null;
            Boolean bool4 = null;
            Float f12 = null;
            JsonElement jsonElement3 = null;
            i10 = 0;
            String str16 = null;
            while (z10) {
                ArrayList arrayList11 = arrayList10;
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i12 = i13;
                        z10 = false;
                        arrayList10 = arrayList11;
                        str12 = str12;
                        i15 = 4;
                        i14 = 8;
                        i13 = i12;
                        arrayList8 = arrayList8;
                        break;
                    case 0:
                        i12 = i13;
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i10 |= 1;
                        arrayList10 = arrayList11;
                        str12 = str12;
                        i15 = 4;
                        i14 = 8;
                        i13 = i12;
                        arrayList8 = arrayList8;
                        break;
                    case 1:
                        e eVar = (e) f0VarArr[i13].getValue();
                        i12 = i13;
                        list8 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i12, eVar, list8);
                        i10 |= 2;
                        jsonArray3 = jsonArray3;
                        arrayList10 = arrayList11;
                        str12 = str12;
                        i15 = 4;
                        i14 = 8;
                        i13 = i12;
                        arrayList8 = arrayList8;
                        break;
                    case 2:
                        jsonArray3 = (JsonArray) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, JsonArraySerializer.INSTANCE, jsonArray3);
                        i10 |= 4;
                        arrayList8 = arrayList8;
                        str15 = str15;
                        arrayList10 = arrayList11;
                        str12 = str12;
                        i15 = 4;
                        i14 = 8;
                        break;
                    case 3:
                        str15 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, str15);
                        i10 |= 8;
                        arrayList8 = arrayList8;
                        list9 = list9;
                        arrayList10 = arrayList11;
                        str12 = str12;
                        i15 = 4;
                        i14 = 8;
                        break;
                    case 4:
                        ArrayList arrayList12 = arrayList8;
                        str12 = str12;
                        e eVar2 = (e) f0VarArr[i15].getValue();
                        int i16 = i15;
                        list9 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, i16, eVar2, list9);
                        i10 |= 16;
                        arrayList8 = arrayList12;
                        bool4 = bool4;
                        arrayList10 = arrayList11;
                        i15 = i16;
                        str12 = str12;
                        i14 = 8;
                        break;
                    case 5:
                        arrayList4 = arrayList11;
                        bool4 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, i.f315935a, bool4);
                        i10 |= 32;
                        arrayList8 = arrayList8;
                        f12 = f12;
                        arrayList10 = arrayList4;
                        str12 = str12;
                        i14 = 8;
                        break;
                    case 6:
                        arrayList4 = arrayList11;
                        f12 = (Float) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, o0.f315985a, f12);
                        i10 |= 64;
                        arrayList8 = arrayList8;
                        jsonElement3 = jsonElement3;
                        arrayList10 = arrayList4;
                        str12 = str12;
                        i14 = 8;
                        break;
                    case 7:
                        arrayList4 = arrayList11;
                        jsonElement3 = (JsonElement) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, JsonElementSerializer.INSTANCE, jsonElement3);
                        i10 |= 128;
                        arrayList8 = arrayList8;
                        arrayList10 = arrayList4;
                        str12 = str12;
                        i14 = 8;
                        break;
                    case 8:
                        arrayList8 = arrayList8;
                        e eVar3 = (e) f0VarArr[i14].getValue();
                        int i17 = i14;
                        arrayList10 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, i17, eVar3, arrayList11);
                        i10 |= 256;
                        i14 = i17;
                        str12 = str12;
                        arrayList8 = arrayList8;
                        break;
                    case 9:
                        num11 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, y0.f316055a, num11);
                        i10 |= 512;
                        arrayList8 = arrayList8;
                        arrayList10 = arrayList11;
                        break;
                    case 10:
                        num11 = num11;
                        num10 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, y0.f316055a, num10);
                        i10 |= 1024;
                        arrayList10 = arrayList11;
                        num11 = num11;
                        break;
                    case 11:
                        num11 = num11;
                        list7 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, r.a.f266516a, list7);
                        i10 |= 2048;
                        arrayList10 = arrayList11;
                        num11 = num11;
                        break;
                    case 12:
                        num11 = num11;
                        arrayList9 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (e) f0VarArr[12].getValue(), arrayList9);
                        i10 |= 4096;
                        arrayList10 = arrayList11;
                        num11 = num11;
                        break;
                    case 13:
                        num11 = num11;
                        arrayList8 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (e) f0VarArr[13].getValue(), arrayList8);
                        i10 |= 8192;
                        arrayList10 = arrayList11;
                        num11 = num11;
                        break;
                    case 14:
                        num11 = num11;
                        str12 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, b3.f315897a, str12);
                        i10 |= 16384;
                        arrayList10 = arrayList11;
                        num11 = num11;
                        break;
                    case 15:
                        str13 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, b3.f315897a, str13);
                        i11 = 32768;
                        i10 |= i11;
                        arrayList10 = arrayList11;
                        num11 = num11;
                        break;
                    case 16:
                        str14 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, b3.f315897a, str14);
                        i11 = 65536;
                        i10 |= i11;
                        arrayList10 = arrayList11;
                        num11 = num11;
                        break;
                    case 17:
                        str16 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, b3.f315897a, str16);
                        i11 = 131072;
                        i10 |= i11;
                        arrayList10 = arrayList11;
                        num11 = num11;
                        break;
                    case 18:
                        bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, i.f315935a, bool);
                        i11 = 262144;
                        i10 |= i11;
                        arrayList10 = arrayList11;
                        num11 = num11;
                        break;
                    case 19:
                        num9 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, y0.f316055a, num9);
                        i11 = 524288;
                        i10 |= i11;
                        arrayList10 = arrayList11;
                        num11 = num11;
                        break;
                    case 20:
                        num8 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, y0.f316055a, num8);
                        i11 = 1048576;
                        i10 |= i11;
                        arrayList10 = arrayList11;
                        num11 = num11;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            list = list8;
            num = num8;
            str = str16;
            num2 = num9;
            arrayList = arrayList9;
            str2 = str13;
            str3 = str14;
            list2 = list7;
            num3 = num10;
            num4 = num11;
            arrayList2 = arrayList8;
            jsonArray = jsonArray3;
            str4 = str15;
            list3 = list9;
            bool2 = bool4;
            f10 = f12;
            jsonElement = jsonElement3;
            arrayList3 = arrayList10;
            str5 = str12;
            str6 = strDecodeStringElement2;
        }
        Boolean bool5 = bool;
        int i18 = i10;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new SerializableGBExperiment(i18, str6, list, jsonArray, str4, list3, bool2, f10, jsonElement, arrayList3, num4, num3, list2, arrayList, arrayList2, str5, str2, str3, str, bool5, num2, num, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull SerializableGBExperiment value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        SerializableGBExperiment.q0(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
