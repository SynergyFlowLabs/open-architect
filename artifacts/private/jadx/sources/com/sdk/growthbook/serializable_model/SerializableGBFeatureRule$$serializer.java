package com.sdk.growthbook.serializable_model;

import androidx.constraintlayout.core.motion.utils.v;
import com.facebook.share.internal.f;
import com.sdk.growthbook.utils.p;
import com.sdk.growthbook.utils.r;
import com.segment.analytics.kotlin.android.plugins.a;
import io.sentry.protocol.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
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
public /* synthetic */ class SerializableGBFeatureRule$$serializer implements p0<SerializableGBFeatureRule> {

    @NotNull
    public static final SerializableGBFeatureRule$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SerializableGBFeatureRule$$serializer serializableGBFeatureRule$$serializer = new SerializableGBFeatureRule$$serializer();
        INSTANCE = serializableGBFeatureRule$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdk.growthbook.serializable_model.SerializableGBFeatureRule", serializableGBFeatureRule$$serializer, 23);
        pluginGeneratedSerialDescriptor.i("id", true);
        pluginGeneratedSerialDescriptor.i("condition", true);
        pluginGeneratedSerialDescriptor.i("parentConditions", true);
        pluginGeneratedSerialDescriptor.i("coverage", true);
        pluginGeneratedSerialDescriptor.i("force", true);
        pluginGeneratedSerialDescriptor.i("variations", true);
        pluginGeneratedSerialDescriptor.i("key", true);
        pluginGeneratedSerialDescriptor.i("weights", true);
        pluginGeneratedSerialDescriptor.i(a.f266546o, true);
        pluginGeneratedSerialDescriptor.i("hashAttribute", true);
        pluginGeneratedSerialDescriptor.i("hashVersion", true);
        pluginGeneratedSerialDescriptor.i("range", true);
        pluginGeneratedSerialDescriptor.i("ranges", true);
        pluginGeneratedSerialDescriptor.i(j.b.f306355e, true);
        pluginGeneratedSerialDescriptor.i(f.f101835h, true);
        pluginGeneratedSerialDescriptor.i("seed", true);
        pluginGeneratedSerialDescriptor.i("name", true);
        pluginGeneratedSerialDescriptor.i(v.c.S, true);
        pluginGeneratedSerialDescriptor.i("fallbackAttribute", true);
        pluginGeneratedSerialDescriptor.i("disableStickyBucketing", true);
        pluginGeneratedSerialDescriptor.i("bucketVersion", true);
        pluginGeneratedSerialDescriptor.i("minBucketVersion", true);
        pluginGeneratedSerialDescriptor.i("tracks", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SerializableGBFeatureRule$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        f0[] f0VarArr = SerializableGBFeatureRule.f266453x;
        b3 b3Var = b3.f315897a;
        y0 y0Var = y0.f316055a;
        return new KSerializer[]{hk.a.v(b3Var), hk.a.v(JsonElementSerializer.INSTANCE), hk.a.v((KSerializer) f0VarArr[2].getValue()), hk.a.v(o0.f315985a), f0VarArr[4].getValue(), hk.a.v((KSerializer) f0VarArr[5].getValue()), hk.a.v(b3Var), hk.a.v((KSerializer) f0VarArr[7].getValue()), hk.a.v(JsonArraySerializer.INSTANCE), hk.a.v(b3Var), hk.a.v(y0Var), hk.a.v(r.b.f266518a), hk.a.v(r.a.f266516a), hk.a.v((KSerializer) f0VarArr[13].getValue()), hk.a.v((KSerializer) f0VarArr[14].getValue()), hk.a.v(b3Var), hk.a.v(b3Var), hk.a.v(b3Var), hk.a.v(b3Var), hk.a.v(i.f315935a), hk.a.v(y0Var), hk.a.v(y0Var), hk.a.v((KSerializer) f0VarArr[22].getValue())};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final SerializableGBFeatureRule deserialize(@NotNull Decoder decoder) {
        List list;
        int i10;
        String str;
        p pVar;
        Float f10;
        String str2;
        String str3;
        JsonElement jsonElement;
        Pair pair;
        JsonArray jsonArray;
        List list2;
        Integer num;
        Boolean bool;
        String str4;
        String str5;
        String str6;
        String str7;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list3;
        Integer num2;
        ArrayList arrayList3;
        Integer num3;
        ArrayList arrayList4;
        int i11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        f0[] f0VarArr = SerializableGBFeatureRule.f266453x;
        if (dVarBeginStructure.c()) {
            b3 b3Var = b3.f315897a;
            String str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, b3Var, null);
            JsonElement jsonElement2 = (JsonElement) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, JsonElementSerializer.INSTANCE, null);
            ArrayList arrayList5 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (e) f0VarArr[2].getValue(), null);
            Float f11 = (Float) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, o0.f315985a, null);
            p pVar2 = (p) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (e) f0VarArr[4].getValue(), null);
            list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (e) f0VarArr[5].getValue(), null);
            String str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b3Var, null);
            List list4 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (e) f0VarArr[7].getValue(), null);
            JsonArray jsonArray2 = (JsonArray) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, JsonArraySerializer.INSTANCE, null);
            String str10 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, b3Var, null);
            y0 y0Var = y0.f316055a;
            Integer num4 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, y0Var, null);
            Pair pair2 = (Pair) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, r.b.f266518a, null);
            List list5 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, r.a.f266516a, null);
            ArrayList arrayList6 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (e) f0VarArr[13].getValue(), null);
            ArrayList arrayList7 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (e) f0VarArr[14].getValue(), null);
            String str11 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, b3Var, null);
            String str12 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, b3Var, null);
            String str13 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, b3Var, null);
            String str14 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, b3Var, null);
            Boolean bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, i.f315935a, null);
            Integer num5 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, y0Var, null);
            i10 = 8388607;
            bool = bool2;
            num3 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, y0Var, null);
            num2 = num5;
            str7 = str11;
            jsonElement = jsonElement2;
            list2 = list4;
            pVar = pVar2;
            arrayList4 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, (e) f0VarArr[22].getValue(), null);
            f10 = f11;
            str2 = str10;
            str3 = str9;
            jsonArray = jsonArray2;
            str4 = str14;
            str5 = str13;
            str6 = str12;
            arrayList = arrayList7;
            str = str8;
            arrayList2 = arrayList6;
            list3 = list5;
            pair = pair2;
            num = num4;
            arrayList3 = arrayList5;
        } else {
            int i12 = 22;
            int i13 = 2;
            boolean z10 = true;
            int i14 = 7;
            int i15 = 4;
            ArrayList arrayList8 = null;
            p pVar3 = null;
            Float f12 = null;
            String str15 = null;
            String str16 = null;
            JsonElement jsonElement3 = null;
            Pair pair3 = null;
            JsonArray jsonArray3 = null;
            list = null;
            Integer num6 = null;
            List list6 = null;
            ArrayList arrayList9 = null;
            ArrayList arrayList10 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            Boolean bool3 = null;
            Integer num7 = null;
            Integer num8 = null;
            String str21 = null;
            int i16 = 5;
            i10 = 0;
            ArrayList arrayList11 = null;
            List list7 = null;
            while (z10) {
                int i17 = i12;
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        arrayList11 = arrayList11;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        i13 = 2;
                        i15 = 4;
                        i16 = 5;
                        i14 = 7;
                        num7 = num7;
                        bool3 = bool3;
                        break;
                    case 0:
                        str21 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, b3.f315897a, str21);
                        i10 |= 1;
                        list6 = list6;
                        arrayList11 = arrayList11;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        i13 = 2;
                        i15 = 4;
                        i16 = 5;
                        i14 = 7;
                        num7 = num7;
                        bool3 = bool3;
                        break;
                    case 1:
                        jsonElement3 = (JsonElement) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, JsonElementSerializer.INSTANCE, jsonElement3);
                        i10 |= 2;
                        arrayList11 = arrayList11;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        i13 = 2;
                        i15 = 4;
                        i16 = 5;
                        i14 = 7;
                        num7 = num7;
                        bool3 = bool3;
                        break;
                    case 2:
                        arrayList11 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, i13, (e) f0VarArr[i13].getValue(), arrayList11);
                        i10 |= 4;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        i15 = 4;
                        i16 = 5;
                        i14 = 7;
                        bool3 = bool3;
                        break;
                    case 3:
                        f12 = (Float) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, o0.f315985a, f12);
                        i10 |= 8;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        i15 = 4;
                        i16 = 5;
                        i14 = 7;
                        bool3 = bool3;
                        break;
                    case 4:
                        bool3 = bool3;
                        pVar3 = (p) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i15, (e) f0VarArr[i15].getValue(), pVar3);
                        i10 |= 16;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        i16 = 5;
                        i14 = 7;
                        bool3 = bool3;
                        break;
                    case 5:
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, i16, (e) f0VarArr[i16].getValue(), list);
                        i10 |= 32;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        i14 = 7;
                        bool3 = bool3;
                        break;
                    case 6:
                        str16 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b3.f315897a, str16);
                        i10 |= 64;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        i14 = 7;
                        bool3 = bool3;
                        break;
                    case 7:
                        bool3 = bool3;
                        list7 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, i14, (e) f0VarArr[i14].getValue(), list7);
                        i10 |= 128;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        bool3 = bool3;
                        break;
                    case 8:
                        bool3 = bool3;
                        jsonArray3 = (JsonArray) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, JsonArraySerializer.INSTANCE, jsonArray3);
                        i10 |= 256;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        bool3 = bool3;
                        break;
                    case 9:
                        bool3 = bool3;
                        str15 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, b3.f315897a, str15);
                        i10 |= 512;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        bool3 = bool3;
                        break;
                    case 10:
                        bool3 = bool3;
                        num6 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, y0.f316055a, num6);
                        i10 |= 1024;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        bool3 = bool3;
                        break;
                    case 11:
                        bool3 = bool3;
                        pair3 = (Pair) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, r.b.f266518a, pair3);
                        i10 |= 2048;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        bool3 = bool3;
                        break;
                    case 12:
                        bool3 = bool3;
                        list6 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, r.a.f266516a, list6);
                        i10 |= 4096;
                        arrayList9 = arrayList9;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        bool3 = bool3;
                        break;
                    case 13:
                        bool3 = bool3;
                        arrayList9 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (e) f0VarArr[13].getValue(), arrayList9);
                        i10 |= 8192;
                        arrayList10 = arrayList10;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        bool3 = bool3;
                        break;
                    case 14:
                        bool3 = bool3;
                        arrayList10 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (e) f0VarArr[14].getValue(), arrayList10);
                        i10 |= 16384;
                        str17 = str17;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        bool3 = bool3;
                        break;
                    case 15:
                        bool3 = bool3;
                        str17 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, b3.f315897a, str17);
                        i10 |= 32768;
                        str18 = str18;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        bool3 = bool3;
                        break;
                    case 16:
                        bool3 = bool3;
                        str18 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, b3.f315897a, str18);
                        i10 |= 65536;
                        str19 = str19;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        bool3 = bool3;
                        break;
                    case 17:
                        bool3 = bool3;
                        str19 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, b3.f315897a, str19);
                        i10 |= 131072;
                        str20 = str20;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        bool3 = bool3;
                        break;
                    case 18:
                        bool3 = bool3;
                        str20 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, b3.f315897a, str20);
                        i10 |= 262144;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        bool3 = bool3;
                        break;
                    case 19:
                        i10 |= 524288;
                        num7 = num7;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        bool3 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, i.f315935a, bool3);
                        i12 = 22;
                        break;
                    case 20:
                        num7 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, y0.f316055a, num7);
                        i11 = 1048576;
                        i10 |= i11;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        break;
                    case 21:
                        num8 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, y0.f316055a, num8);
                        i11 = 2097152;
                        i10 |= i11;
                        jsonElement3 = jsonElement3;
                        arrayList8 = arrayList8;
                        i12 = 22;
                        break;
                    case 22:
                        arrayList8 = (ArrayList) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, i17, (e) f0VarArr[i17].getValue(), arrayList8);
                        i10 |= 4194304;
                        i12 = i17;
                        jsonElement3 = jsonElement3;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            Boolean bool4 = bool3;
            str = str21;
            pVar = pVar3;
            f10 = f12;
            str2 = str15;
            str3 = str16;
            jsonElement = jsonElement3;
            pair = pair3;
            jsonArray = jsonArray3;
            list2 = list7;
            num = num6;
            bool = bool4;
            str4 = str20;
            str5 = str19;
            str6 = str18;
            str7 = str17;
            arrayList = arrayList10;
            arrayList2 = arrayList9;
            list3 = list6;
            num2 = num7;
            arrayList3 = arrayList11;
            num3 = num8;
            arrayList4 = arrayList8;
        }
        int i18 = i10;
        List list8 = list;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new SerializableGBFeatureRule(i18, str, jsonElement, arrayList3, f10, pVar, list8, str3, list2, jsonArray, str2, num, pair, list3, arrayList2, arrayList, str7, str6, str5, str4, bool, num2, num3, arrayList4, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull SerializableGBFeatureRule value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        SerializableGBFeatureRule.o0(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
