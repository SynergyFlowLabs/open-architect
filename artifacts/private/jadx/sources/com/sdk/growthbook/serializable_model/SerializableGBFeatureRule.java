package com.sdk.growthbook.serializable_model;

import com.sdk.growthbook.serializable_model.SerializableGBFeatureRule;
import com.sdk.growthbook.utils.GBFilter;
import com.sdk.growthbook.utils.GBFilter$$serializer;
import com.sdk.growthbook.utils.GBParentConditionInterface;
import com.sdk.growthbook.utils.GBParentConditionInterface$$serializer;
import com.sdk.growthbook.utils.GBVariationMeta;
import com.sdk.growthbook.utils.GBVariationMeta$$serializer;
import com.sdk.growthbook.utils.p;
import com.sdk.growthbook.utils.q;
import com.sdk.growthbook.utils.r;
import hk.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.o0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class SerializableGBFeatureRule {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @f
    @NotNull
    private static final f0<KSerializer<Object>>[] f266453x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f266454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final JsonElement f266455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final ArrayList<GBParentConditionInterface> f266456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Float f266457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final p<JsonElement> f266458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final List<JsonElement> f266459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f266460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final List<Float> f266461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final JsonArray f266462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final String f266463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final Integer f266464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Pair<Float, Float> f266465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final List<Pair<Float, Float>> f266466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final ArrayList<GBVariationMeta> f266467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final ArrayList<GBFilter> f266468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private final String f266469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private final String f266470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private final String f266471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f266472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final Boolean f266473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    private final Integer f266474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private final Integer f266475v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private final ArrayList<SerializableGBTrackData> f266476w;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<SerializableGBFeatureRule> serializer() {
            return SerializableGBFeatureRule$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        j0 j0Var = j0.PUBLICATION;
        int i10 = 0 & 5;
        f266453x = new f0[]{null, null, g0.b(j0Var, new Function0() { // from class: qf.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SerializableGBFeatureRule.h();
            }
        }), null, g0.b(j0Var, new Function0() { // from class: qf.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SerializableGBFeatureRule.i();
            }
        }), g0.b(j0Var, new Function0() { // from class: qf.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SerializableGBFeatureRule.j();
            }
        }), null, g0.b(j0Var, new Function0() { // from class: qf.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SerializableGBFeatureRule.k();
            }
        }), null, null, null, null, null, g0.b(j0Var, new Function0() { // from class: qf.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SerializableGBFeatureRule.l();
            }
        }), g0.b(j0Var, new Function0() { // from class: qf.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SerializableGBFeatureRule.m();
            }
        }), null, null, null, null, null, null, null, g0.b(j0Var, new Function0() { // from class: qf.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SerializableGBFeatureRule.n();
            }
        })};
    }

    public SerializableGBFeatureRule() {
        this((String) null, (JsonElement) null, (ArrayList) null, (Float) null, (p) null, (List) null, (String) null, (List) null, (JsonArray) null, (String) null, (Integer) null, (Pair) null, (List) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, (ArrayList) null, 8388607, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SerializableGBFeatureRule N(SerializableGBFeatureRule serializableGBFeatureRule, String str, JsonElement jsonElement, ArrayList arrayList, Float f10, p pVar, List list, String str2, List list2, JsonArray jsonArray, String str3, Integer num, Pair pair, List list3, ArrayList arrayList2, ArrayList arrayList3, String str4, String str5, String str6, String str7, Boolean bool, Integer num2, Integer num3, ArrayList arrayList4, int i10, Object obj) {
        ArrayList arrayList5;
        Integer num4;
        String str8 = (i10 & 1) != 0 ? serializableGBFeatureRule.f266454a : str;
        JsonElement jsonElement2 = (i10 & 2) != 0 ? serializableGBFeatureRule.f266455b : jsonElement;
        ArrayList arrayList6 = (i10 & 4) != 0 ? serializableGBFeatureRule.f266456c : arrayList;
        Float f11 = (i10 & 8) != 0 ? serializableGBFeatureRule.f266457d : f10;
        p pVar2 = (i10 & 16) != 0 ? serializableGBFeatureRule.f266458e : pVar;
        List list4 = (i10 & 32) != 0 ? serializableGBFeatureRule.f266459f : list;
        String str9 = (i10 & 64) != 0 ? serializableGBFeatureRule.f266460g : str2;
        List list5 = (i10 & 128) != 0 ? serializableGBFeatureRule.f266461h : list2;
        JsonArray jsonArray2 = (i10 & 256) != 0 ? serializableGBFeatureRule.f266462i : jsonArray;
        String str10 = (i10 & 512) != 0 ? serializableGBFeatureRule.f266463j : str3;
        Integer num5 = (i10 & 1024) != 0 ? serializableGBFeatureRule.f266464k : num;
        Pair pair2 = (i10 & 2048) != 0 ? serializableGBFeatureRule.f266465l : pair;
        List list6 = (i10 & 4096) != 0 ? serializableGBFeatureRule.f266466m : list3;
        ArrayList arrayList7 = (i10 & 8192) != 0 ? serializableGBFeatureRule.f266467n : arrayList2;
        String str11 = str8;
        ArrayList arrayList8 = (i10 & 16384) != 0 ? serializableGBFeatureRule.f266468o : arrayList3;
        String str12 = (i10 & 32768) != 0 ? serializableGBFeatureRule.f266469p : str4;
        String str13 = (i10 & 65536) != 0 ? serializableGBFeatureRule.f266470q : str5;
        String str14 = (i10 & 131072) != 0 ? serializableGBFeatureRule.f266471r : str6;
        String str15 = (i10 & 262144) != 0 ? serializableGBFeatureRule.f266472s : str7;
        Boolean bool2 = (i10 & 524288) != 0 ? serializableGBFeatureRule.f266473t : bool;
        Integer num6 = (i10 & 1048576) != 0 ? serializableGBFeatureRule.f266474u : num2;
        Integer num7 = (i10 & 2097152) != 0 ? serializableGBFeatureRule.f266475v : num3;
        if ((i10 & 4194304) != 0) {
            num4 = num7;
            arrayList5 = serializableGBFeatureRule.f266476w;
        } else {
            arrayList5 = arrayList4;
            num4 = num7;
        }
        return serializableGBFeatureRule.M(str11, jsonElement2, arrayList6, f11, pVar2, list4, str9, list5, jsonArray2, str10, num5, pair2, list6, arrayList7, arrayList8, str12, str13, str14, str15, bool2, num6, num4, arrayList5);
    }

    @b0(with = q.class)
    public static /* synthetic */ void V() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer h() {
        return new kotlinx.serialization.internal.f(GBParentConditionInterface$$serializer.INSTANCE);
    }

    @b0(with = r.b.class)
    public static /* synthetic */ void h0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer i() {
        return new q(a.v(JsonElementSerializer.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer j() {
        return new kotlinx.serialization.internal.f(JsonElementSerializer.INSTANCE);
    }

    @b0(with = r.a.class)
    public static /* synthetic */ void j0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer k() {
        return new kotlinx.serialization.internal.f(o0.f315985a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer l() {
        return new kotlinx.serialization.internal.f(GBVariationMeta$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer m() {
        return new kotlinx.serialization.internal.f(GBFilter$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer n() {
        return new kotlinx.serialization.internal.f(SerializableGBTrackData$$serializer.INSTANCE);
    }

    @n
    public static final /* synthetic */ void o0(SerializableGBFeatureRule serializableGBFeatureRule, e eVar, SerialDescriptor serialDescriptor) {
        f0<KSerializer<Object>>[] f0VarArr = f266453x;
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || serializableGBFeatureRule.f266454a != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 0, b3.f315897a, serializableGBFeatureRule.f266454a);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || serializableGBFeatureRule.f266455b != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 1, JsonElementSerializer.INSTANCE, serializableGBFeatureRule.f266455b);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || serializableGBFeatureRule.f266456c != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 2, f0VarArr[2].getValue(), serializableGBFeatureRule.f266456c);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 3) || serializableGBFeatureRule.f266457d != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 3, o0.f315985a, serializableGBFeatureRule.f266457d);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.areEqual(serializableGBFeatureRule.f266458e, p.a.f266511a)) {
            eVar.encodeSerializableElement(serialDescriptor, 4, f0VarArr[4].getValue(), serializableGBFeatureRule.f266458e);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 5) || serializableGBFeatureRule.f266459f != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 5, f0VarArr[5].getValue(), serializableGBFeatureRule.f266459f);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 6) || serializableGBFeatureRule.f266460g != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 6, b3.f315897a, serializableGBFeatureRule.f266460g);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 7) || serializableGBFeatureRule.f266461h != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 7, f0VarArr[7].getValue(), serializableGBFeatureRule.f266461h);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 8) || serializableGBFeatureRule.f266462i != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 8, JsonArraySerializer.INSTANCE, serializableGBFeatureRule.f266462i);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 9) || serializableGBFeatureRule.f266463j != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 9, b3.f315897a, serializableGBFeatureRule.f266463j);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 10) || serializableGBFeatureRule.f266464k != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 10, y0.f316055a, serializableGBFeatureRule.f266464k);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 11) || serializableGBFeatureRule.f266465l != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 11, r.b.f266518a, serializableGBFeatureRule.f266465l);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 12) || serializableGBFeatureRule.f266466m != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 12, r.a.f266516a, serializableGBFeatureRule.f266466m);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 13) || serializableGBFeatureRule.f266467n != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 13, f0VarArr[13].getValue(), serializableGBFeatureRule.f266467n);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 14) || serializableGBFeatureRule.f266468o != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 14, f0VarArr[14].getValue(), serializableGBFeatureRule.f266468o);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 15) || serializableGBFeatureRule.f266469p != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 15, b3.f315897a, serializableGBFeatureRule.f266469p);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 16) || serializableGBFeatureRule.f266470q != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 16, b3.f315897a, serializableGBFeatureRule.f266470q);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 17) || serializableGBFeatureRule.f266471r != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 17, b3.f315897a, serializableGBFeatureRule.f266471r);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 18) || serializableGBFeatureRule.f266472s != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 18, b3.f315897a, serializableGBFeatureRule.f266472s);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 19) || serializableGBFeatureRule.f266473t != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 19, i.f315935a, serializableGBFeatureRule.f266473t);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 20) || serializableGBFeatureRule.f266474u != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 20, y0.f316055a, serializableGBFeatureRule.f266474u);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 21) || serializableGBFeatureRule.f266475v != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 21, y0.f316055a, serializableGBFeatureRule.f266475v);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 22) || serializableGBFeatureRule.f266476w != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 22, f0VarArr[22].getValue(), serializableGBFeatureRule.f266476w);
        }
    }

    @Nullable
    public final JsonElement A() {
        return this.f266455b;
    }

    @Nullable
    public final Boolean B() {
        return this.f266473t;
    }

    @Nullable
    public final Integer C() {
        return this.f266474u;
    }

    @Nullable
    public final Integer D() {
        return this.f266475v;
    }

    @Nullable
    public final ArrayList<SerializableGBTrackData> E() {
        return this.f266476w;
    }

    @Nullable
    public final ArrayList<GBParentConditionInterface> F() {
        return this.f266456c;
    }

    @Nullable
    public final Float G() {
        return this.f266457d;
    }

    @NotNull
    public final p<JsonElement> H() {
        return this.f266458e;
    }

    @Nullable
    public final List<JsonElement> I() {
        return this.f266459f;
    }

    @Nullable
    public final String J() {
        return this.f266460g;
    }

    @Nullable
    public final List<Float> K() {
        return this.f266461h;
    }

    @Nullable
    public final JsonArray L() {
        return this.f266462i;
    }

    @NotNull
    public final SerializableGBFeatureRule M(@Nullable String str, @Nullable JsonElement jsonElement, @Nullable ArrayList<GBParentConditionInterface> arrayList, @Nullable Float f10, @NotNull p<? extends JsonElement> force, @Nullable List<? extends JsonElement> list, @Nullable String str2, @Nullable List<Float> list2, @Nullable JsonArray jsonArray, @Nullable String str3, @Nullable Integer num, @Nullable Pair<Float, Float> pair, @Nullable List<Pair<Float, Float>> list3, @Nullable ArrayList<GBVariationMeta> arrayList2, @Nullable ArrayList<GBFilter> arrayList3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable ArrayList<SerializableGBTrackData> arrayList4) {
        Intrinsics.checkNotNullParameter(force, "force");
        return new SerializableGBFeatureRule(str, jsonElement, arrayList, f10, force, list, str2, list2, jsonArray, str3, num, pair, list3, arrayList2, arrayList3, str4, str5, str6, str7, bool, num2, num3, arrayList4);
    }

    @Nullable
    public final Integer O() {
        return this.f266474u;
    }

    @Nullable
    public final JsonElement P() {
        return this.f266455b;
    }

    @Nullable
    public final Float Q() {
        return this.f266457d;
    }

    @Nullable
    public final Boolean R() {
        return this.f266473t;
    }

    @Nullable
    public final String S() {
        return this.f266472s;
    }

    @Nullable
    public final ArrayList<GBFilter> T() {
        return this.f266468o;
    }

    @NotNull
    public final p<JsonElement> U() {
        return this.f266458e;
    }

    @Nullable
    public final String W() {
        return this.f266463j;
    }

    @Nullable
    public final Integer X() {
        return this.f266464k;
    }

    @Nullable
    public final String Y() {
        return this.f266454a;
    }

    @Nullable
    public final String Z() {
        return this.f266460g;
    }

    @Nullable
    public final ArrayList<GBVariationMeta> a0() {
        return this.f266467n;
    }

    @Nullable
    public final Integer b0() {
        return this.f266475v;
    }

    @Nullable
    public final String c0() {
        return this.f266470q;
    }

    @Nullable
    public final JsonArray d0() {
        return this.f266462i;
    }

    @Nullable
    public final ArrayList<GBParentConditionInterface> e0() {
        return this.f266456c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableGBFeatureRule)) {
            return false;
        }
        SerializableGBFeatureRule serializableGBFeatureRule = (SerializableGBFeatureRule) obj;
        if (Intrinsics.areEqual(this.f266454a, serializableGBFeatureRule.f266454a) && Intrinsics.areEqual(this.f266455b, serializableGBFeatureRule.f266455b) && Intrinsics.areEqual(this.f266456c, serializableGBFeatureRule.f266456c) && Intrinsics.areEqual((Object) this.f266457d, (Object) serializableGBFeatureRule.f266457d) && Intrinsics.areEqual(this.f266458e, serializableGBFeatureRule.f266458e) && Intrinsics.areEqual(this.f266459f, serializableGBFeatureRule.f266459f) && Intrinsics.areEqual(this.f266460g, serializableGBFeatureRule.f266460g) && Intrinsics.areEqual(this.f266461h, serializableGBFeatureRule.f266461h) && Intrinsics.areEqual(this.f266462i, serializableGBFeatureRule.f266462i) && Intrinsics.areEqual(this.f266463j, serializableGBFeatureRule.f266463j) && Intrinsics.areEqual(this.f266464k, serializableGBFeatureRule.f266464k) && Intrinsics.areEqual(this.f266465l, serializableGBFeatureRule.f266465l) && Intrinsics.areEqual(this.f266466m, serializableGBFeatureRule.f266466m) && Intrinsics.areEqual(this.f266467n, serializableGBFeatureRule.f266467n) && Intrinsics.areEqual(this.f266468o, serializableGBFeatureRule.f266468o) && Intrinsics.areEqual(this.f266469p, serializableGBFeatureRule.f266469p) && Intrinsics.areEqual(this.f266470q, serializableGBFeatureRule.f266470q) && Intrinsics.areEqual(this.f266471r, serializableGBFeatureRule.f266471r) && Intrinsics.areEqual(this.f266472s, serializableGBFeatureRule.f266472s) && Intrinsics.areEqual(this.f266473t, serializableGBFeatureRule.f266473t) && Intrinsics.areEqual(this.f266474u, serializableGBFeatureRule.f266474u) && Intrinsics.areEqual(this.f266475v, serializableGBFeatureRule.f266475v) && Intrinsics.areEqual(this.f266476w, serializableGBFeatureRule.f266476w)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String f0() {
        return this.f266471r;
    }

    @Nullable
    public final Pair<Float, Float> g0() {
        return this.f266465l;
    }

    public int hashCode() {
        String str = this.f266454a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JsonElement jsonElement = this.f266455b;
        int iHashCode2 = (iHashCode + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31;
        ArrayList<GBParentConditionInterface> arrayList = this.f266456c;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Float f10 = this.f266457d;
        int iHashCode4 = (((iHashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31) + this.f266458e.hashCode()) * 31;
        List<JsonElement> list = this.f266459f;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f266460g;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Float> list2 = this.f266461h;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        JsonArray jsonArray = this.f266462i;
        int iHashCode8 = (iHashCode7 + (jsonArray == null ? 0 : jsonArray.hashCode())) * 31;
        String str3 = this.f266463j;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f266464k;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Pair<Float, Float> pair = this.f266465l;
        int iHashCode11 = (iHashCode10 + (pair == null ? 0 : pair.hashCode())) * 31;
        List<Pair<Float, Float>> list3 = this.f266466m;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ArrayList<GBVariationMeta> arrayList2 = this.f266467n;
        int iHashCode13 = (iHashCode12 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<GBFilter> arrayList3 = this.f266468o;
        int iHashCode14 = (iHashCode13 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        String str4 = this.f266469p;
        int iHashCode15 = (iHashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f266470q;
        int iHashCode16 = (iHashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f266471r;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f266472s;
        int iHashCode18 = (iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.f266473t;
        int iHashCode19 = (iHashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.f266474u;
        int iHashCode20 = (iHashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f266475v;
        int iHashCode21 = (iHashCode20 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ArrayList<SerializableGBTrackData> arrayList4 = this.f266476w;
        return iHashCode21 + (arrayList4 != null ? arrayList4.hashCode() : 0);
    }

    @Nullable
    public final List<Pair<Float, Float>> i0() {
        return this.f266466m;
    }

    @Nullable
    public final String k0() {
        return this.f266469p;
    }

    @Nullable
    public final ArrayList<SerializableGBTrackData> l0() {
        return this.f266476w;
    }

    @Nullable
    public final List<JsonElement> m0() {
        return this.f266459f;
    }

    @Nullable
    public final List<Float> n0() {
        return this.f266461h;
    }

    @Nullable
    public final String p() {
        return this.f266454a;
    }

    @Nullable
    public final String q() {
        return this.f266463j;
    }

    @Nullable
    public final Integer r() {
        return this.f266464k;
    }

    @Nullable
    public final Pair<Float, Float> s() {
        return this.f266465l;
    }

    @Nullable
    public final List<Pair<Float, Float>> t() {
        return this.f266466m;
    }

    @NotNull
    public String toString() {
        return "SerializableGBFeatureRule(id=" + this.f266454a + ", condition=" + this.f266455b + ", parentConditions=" + this.f266456c + ", coverage=" + this.f266457d + ", force=" + this.f266458e + ", variations=" + this.f266459f + ", key=" + this.f266460g + ", weights=" + this.f266461h + ", namespace=" + this.f266462i + ", hashAttribute=" + this.f266463j + ", hashVersion=" + this.f266464k + ", range=" + this.f266465l + ", ranges=" + this.f266466m + ", meta=" + this.f266467n + ", filters=" + this.f266468o + ", seed=" + this.f266469p + ", name=" + this.f266470q + ", phase=" + this.f266471r + ", fallbackAttribute=" + this.f266472s + ", disableStickyBucketing=" + this.f266473t + ", bucketVersion=" + this.f266474u + ", minBucketVersion=" + this.f266475v + ", tracks=" + this.f266476w + ")";
    }

    @Nullable
    public final ArrayList<GBVariationMeta> u() {
        return this.f266467n;
    }

    @Nullable
    public final ArrayList<GBFilter> v() {
        return this.f266468o;
    }

    @Nullable
    public final String w() {
        return this.f266469p;
    }

    @Nullable
    public final String x() {
        return this.f266470q;
    }

    @Nullable
    public final String y() {
        return this.f266471r;
    }

    @Nullable
    public final String z() {
        return this.f266472s;
    }

    public /* synthetic */ SerializableGBFeatureRule(int i10, String str, JsonElement jsonElement, ArrayList arrayList, Float f10, p pVar, List list, String str2, List list2, JsonArray jsonArray, String str3, Integer num, Pair pair, List list3, ArrayList arrayList2, ArrayList arrayList3, String str4, String str5, String str6, String str7, Boolean bool, Integer num2, Integer num3, ArrayList arrayList4, v2 v2Var) {
        if ((i10 & 1) == 0) {
            this.f266454a = null;
        } else {
            this.f266454a = str;
        }
        if ((i10 & 2) == 0) {
            this.f266455b = null;
        } else {
            this.f266455b = jsonElement;
        }
        if ((i10 & 4) == 0) {
            this.f266456c = null;
        } else {
            this.f266456c = arrayList;
        }
        if ((i10 & 8) == 0) {
            this.f266457d = null;
        } else {
            this.f266457d = f10;
        }
        if ((i10 & 16) == 0) {
            this.f266458e = p.a.f266511a;
        } else {
            this.f266458e = pVar;
        }
        if ((i10 & 32) == 0) {
            this.f266459f = null;
        } else {
            this.f266459f = list;
        }
        if ((i10 & 64) == 0) {
            this.f266460g = null;
        } else {
            this.f266460g = str2;
        }
        if ((i10 & 128) == 0) {
            this.f266461h = null;
        } else {
            this.f266461h = list2;
        }
        if ((i10 & 256) == 0) {
            this.f266462i = null;
        } else {
            this.f266462i = jsonArray;
        }
        if ((i10 & 512) == 0) {
            this.f266463j = null;
        } else {
            this.f266463j = str3;
        }
        if ((i10 & 1024) == 0) {
            this.f266464k = null;
        } else {
            this.f266464k = num;
        }
        if ((i10 & 2048) == 0) {
            this.f266465l = null;
        } else {
            this.f266465l = pair;
        }
        if ((i10 & 4096) == 0) {
            this.f266466m = null;
        } else {
            this.f266466m = list3;
        }
        if ((i10 & 8192) == 0) {
            this.f266467n = null;
        } else {
            this.f266467n = arrayList2;
        }
        if ((i10 & 16384) == 0) {
            this.f266468o = null;
        } else {
            this.f266468o = arrayList3;
        }
        if ((32768 & i10) == 0) {
            this.f266469p = null;
        } else {
            this.f266469p = str4;
        }
        if ((65536 & i10) == 0) {
            this.f266470q = null;
        } else {
            this.f266470q = str5;
        }
        if ((131072 & i10) == 0) {
            this.f266471r = null;
        } else {
            this.f266471r = str6;
        }
        if ((262144 & i10) == 0) {
            this.f266472s = null;
        } else {
            this.f266472s = str7;
        }
        if ((524288 & i10) == 0) {
            this.f266473t = null;
        } else {
            this.f266473t = bool;
        }
        if ((1048576 & i10) == 0) {
            this.f266474u = null;
        } else {
            this.f266474u = num2;
        }
        if ((2097152 & i10) == 0) {
            this.f266475v = null;
        } else {
            this.f266475v = num3;
        }
        if ((i10 & 4194304) == 0) {
            this.f266476w = null;
        } else {
            this.f266476w = arrayList4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerializableGBFeatureRule(@Nullable String str, @Nullable JsonElement jsonElement, @Nullable ArrayList<GBParentConditionInterface> arrayList, @Nullable Float f10, @NotNull p<? extends JsonElement> force, @Nullable List<? extends JsonElement> list, @Nullable String str2, @Nullable List<Float> list2, @Nullable JsonArray jsonArray, @Nullable String str3, @Nullable Integer num, @Nullable Pair<Float, Float> pair, @Nullable List<Pair<Float, Float>> list3, @Nullable ArrayList<GBVariationMeta> arrayList2, @Nullable ArrayList<GBFilter> arrayList3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable ArrayList<SerializableGBTrackData> arrayList4) {
        Intrinsics.checkNotNullParameter(force, "force");
        this.f266454a = str;
        this.f266455b = jsonElement;
        this.f266456c = arrayList;
        this.f266457d = f10;
        this.f266458e = force;
        this.f266459f = list;
        this.f266460g = str2;
        this.f266461h = list2;
        this.f266462i = jsonArray;
        this.f266463j = str3;
        this.f266464k = num;
        this.f266465l = pair;
        this.f266466m = list3;
        this.f266467n = arrayList2;
        this.f266468o = arrayList3;
        this.f266469p = str4;
        this.f266470q = str5;
        this.f266471r = str6;
        this.f266472s = str7;
        this.f266473t = bool;
        this.f266474u = num2;
        this.f266475v = num3;
        this.f266476w = arrayList4;
    }

    public /* synthetic */ SerializableGBFeatureRule(String str, JsonElement jsonElement, ArrayList arrayList, Float f10, p pVar, List list, String str2, List list2, JsonArray jsonArray, String str3, Integer num, Pair pair, List list3, ArrayList arrayList2, ArrayList arrayList3, String str4, String str5, String str6, String str7, Boolean bool, Integer num2, Integer num3, ArrayList arrayList4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : jsonElement, (i10 & 4) != 0 ? null : arrayList, (i10 & 8) != 0 ? null : f10, (i10 & 16) != 0 ? p.a.f266511a : pVar, (i10 & 32) != 0 ? null : list, (i10 & 64) != 0 ? null : str2, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? null : jsonArray, (i10 & 512) != 0 ? null : str3, (i10 & 1024) != 0 ? null : num, (i10 & 2048) != 0 ? null : pair, (i10 & 4096) != 0 ? null : list3, (i10 & 8192) != 0 ? null : arrayList2, (i10 & 16384) != 0 ? null : arrayList3, (i10 & 32768) != 0 ? null : str4, (i10 & 65536) != 0 ? null : str5, (i10 & 131072) != 0 ? null : str6, (i10 & 262144) != 0 ? null : str7, (i10 & 524288) != 0 ? null : bool, (i10 & 1048576) != 0 ? null : num2, (i10 & 2097152) != 0 ? null : num3, (i10 & 4194304) != 0 ? null : arrayList4);
    }
}
