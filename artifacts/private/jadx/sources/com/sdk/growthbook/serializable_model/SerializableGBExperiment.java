package com.sdk.growthbook.serializable_model;

import com.sdk.growthbook.serializable_model.SerializableGBExperiment;
import com.sdk.growthbook.utils.GBFilter;
import com.sdk.growthbook.utils.GBFilter$$serializer;
import com.sdk.growthbook.utils.GBParentConditionInterface;
import com.sdk.growthbook.utils.GBParentConditionInterface$$serializer;
import com.sdk.growthbook.utils.GBVariationMeta;
import com.sdk.growthbook.utils.GBVariationMeta$$serializer;
import com.sdk.growthbook.utils.r;
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
import kotlinx.serialization.internal.g2;
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
public final class SerializableGBExperiment {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @f
    @NotNull
    private static final f0<KSerializer<Object>>[] f266416v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f266417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<JsonElement> f266418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final JsonArray f266419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f266420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private List<Float> f266421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Boolean f266422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Float f266423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private JsonElement f266424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final ArrayList<GBParentConditionInterface> f266425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Integer f266426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Integer f266427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private List<Pair<Float, Float>> f266428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private ArrayList<GBVariationMeta> f266429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private ArrayList<GBFilter> f266430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private String f266431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private String f266432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private String f266433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private final String f266434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final Boolean f266435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final Integer f266436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    private final Integer f266437u;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<SerializableGBExperiment> serializer() {
            return SerializableGBExperiment$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        j0 j0Var = j0.PUBLICATION;
        f266416v = new f0[]{null, g0.b(j0Var, new Function0() { // from class: qf.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SerializableGBExperiment.f();
            }
        }), null, null, g0.b(j0Var, new Function0() { // from class: qf.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SerializableGBExperiment.g();
            }
        }), null, null, null, g0.b(j0Var, new Function0() { // from class: qf.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SerializableGBExperiment.h();
            }
        }), null, null, null, g0.b(j0Var, new Function0() { // from class: qf.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SerializableGBExperiment.i();
            }
        }), g0.b(j0Var, new Function0() { // from class: qf.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SerializableGBExperiment.j();
            }
        }), null, null, null, null, null, null, null};
    }

    public /* synthetic */ SerializableGBExperiment(int i10, String str, List list, JsonArray jsonArray, String str2, List list2, Boolean bool, Float f10, JsonElement jsonElement, ArrayList arrayList, Integer num, Integer num2, List list3, ArrayList arrayList2, ArrayList arrayList3, String str3, String str4, String str5, String str6, Boolean bool2, Integer num3, Integer num4, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, SerializableGBExperiment$$serializer.INSTANCE.getDescriptor());
        }
        this.f266417a = str;
        if ((i10 & 2) == 0) {
            this.f266418b = new ArrayList();
        } else {
            this.f266418b = list;
        }
        if ((i10 & 4) == 0) {
            this.f266419c = null;
        } else {
            this.f266419c = jsonArray;
        }
        if ((i10 & 8) == 0) {
            this.f266420d = null;
        } else {
            this.f266420d = str2;
        }
        if ((i10 & 16) == 0) {
            this.f266421e = null;
        } else {
            this.f266421e = list2;
        }
        if ((i10 & 32) == 0) {
            this.f266422f = Boolean.TRUE;
        } else {
            this.f266422f = bool;
        }
        if ((i10 & 64) == 0) {
            this.f266423g = null;
        } else {
            this.f266423g = f10;
        }
        if ((i10 & 128) == 0) {
            this.f266424h = null;
        } else {
            this.f266424h = jsonElement;
        }
        if ((i10 & 256) == 0) {
            this.f266425i = null;
        } else {
            this.f266425i = arrayList;
        }
        if ((i10 & 512) == 0) {
            this.f266426j = null;
        } else {
            this.f266426j = num;
        }
        if ((i10 & 1024) == 0) {
            this.f266427k = null;
        } else {
            this.f266427k = num2;
        }
        if ((i10 & 2048) == 0) {
            this.f266428l = null;
        } else {
            this.f266428l = list3;
        }
        if ((i10 & 4096) == 0) {
            this.f266429m = null;
        } else {
            this.f266429m = arrayList2;
        }
        if ((i10 & 8192) == 0) {
            this.f266430n = null;
        } else {
            this.f266430n = arrayList3;
        }
        if ((i10 & 16384) == 0) {
            this.f266431o = null;
        } else {
            this.f266431o = str3;
        }
        if ((32768 & i10) == 0) {
            this.f266432p = null;
        } else {
            this.f266432p = str4;
        }
        if ((65536 & i10) == 0) {
            this.f266433q = null;
        } else {
            this.f266433q = str5;
        }
        if ((131072 & i10) == 0) {
            this.f266434r = null;
        } else {
            this.f266434r = str6;
        }
        if ((262144 & i10) == 0) {
            this.f266435s = null;
        } else {
            this.f266435s = bool2;
        }
        if ((524288 & i10) == 0) {
            this.f266436t = null;
        } else {
            this.f266436t = num3;
        }
        if ((i10 & 1048576) == 0) {
            this.f266437u = null;
        } else {
            this.f266437u = num4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SerializableGBExperiment H(SerializableGBExperiment serializableGBExperiment, String str, List list, JsonArray jsonArray, String str2, List list2, Boolean bool, Float f10, JsonElement jsonElement, ArrayList arrayList, Integer num, Integer num2, List list3, ArrayList arrayList2, ArrayList arrayList3, String str3, String str4, String str5, String str6, Boolean bool2, Integer num3, Integer num4, int i10, Object obj) {
        Integer num5;
        Integer num6;
        String str7 = (i10 & 1) != 0 ? serializableGBExperiment.f266417a : str;
        List list4 = (i10 & 2) != 0 ? serializableGBExperiment.f266418b : list;
        JsonArray jsonArray2 = (i10 & 4) != 0 ? serializableGBExperiment.f266419c : jsonArray;
        String str8 = (i10 & 8) != 0 ? serializableGBExperiment.f266420d : str2;
        List list5 = (i10 & 16) != 0 ? serializableGBExperiment.f266421e : list2;
        Boolean bool3 = (i10 & 32) != 0 ? serializableGBExperiment.f266422f : bool;
        Float f11 = (i10 & 64) != 0 ? serializableGBExperiment.f266423g : f10;
        JsonElement jsonElement2 = (i10 & 128) != 0 ? serializableGBExperiment.f266424h : jsonElement;
        ArrayList arrayList4 = (i10 & 256) != 0 ? serializableGBExperiment.f266425i : arrayList;
        Integer num7 = (i10 & 512) != 0 ? serializableGBExperiment.f266426j : num;
        Integer num8 = (i10 & 1024) != 0 ? serializableGBExperiment.f266427k : num2;
        List list6 = (i10 & 2048) != 0 ? serializableGBExperiment.f266428l : list3;
        ArrayList arrayList5 = (i10 & 4096) != 0 ? serializableGBExperiment.f266429m : arrayList2;
        ArrayList arrayList6 = (i10 & 8192) != 0 ? serializableGBExperiment.f266430n : arrayList3;
        String str9 = str7;
        String str10 = (i10 & 16384) != 0 ? serializableGBExperiment.f266431o : str3;
        String str11 = (i10 & 32768) != 0 ? serializableGBExperiment.f266432p : str4;
        String str12 = (i10 & 65536) != 0 ? serializableGBExperiment.f266433q : str5;
        String str13 = (i10 & 131072) != 0 ? serializableGBExperiment.f266434r : str6;
        Boolean bool4 = (i10 & 262144) != 0 ? serializableGBExperiment.f266435s : bool2;
        Integer num9 = (i10 & 524288) != 0 ? serializableGBExperiment.f266436t : num3;
        if ((i10 & 1048576) != 0) {
            num6 = num9;
            num5 = serializableGBExperiment.f266437u;
        } else {
            num5 = num4;
            num6 = num9;
        }
        return serializableGBExperiment.G(str9, list4, jsonArray2, str8, list5, bool3, f11, jsonElement2, arrayList4, num7, num8, list6, arrayList5, arrayList6, str10, str11, str12, str13, bool4, num6, num5);
    }

    @b0(with = r.a.class)
    public static /* synthetic */ void a0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer f() {
        return new kotlinx.serialization.internal.f(JsonElementSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer g() {
        return new kotlinx.serialization.internal.f(o0.f315985a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer h() {
        return new kotlinx.serialization.internal.f(GBParentConditionInterface$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer i() {
        return new kotlinx.serialization.internal.f(GBVariationMeta$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer j() {
        return new kotlinx.serialization.internal.f(GBFilter$$serializer.INSTANCE);
    }

    @n
    public static final /* synthetic */ void q0(SerializableGBExperiment serializableGBExperiment, e eVar, SerialDescriptor serialDescriptor) {
        f0<KSerializer<Object>>[] f0VarArr = f266416v;
        eVar.encodeStringElement(serialDescriptor, 0, serializableGBExperiment.f266417a);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.areEqual(serializableGBExperiment.f266418b, new ArrayList())) {
            eVar.encodeSerializableElement(serialDescriptor, 1, f0VarArr[1].getValue(), serializableGBExperiment.f266418b);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || serializableGBExperiment.f266419c != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 2, JsonArraySerializer.INSTANCE, serializableGBExperiment.f266419c);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 3) || serializableGBExperiment.f266420d != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, serializableGBExperiment.f266420d);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 4) || serializableGBExperiment.f266421e != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 4, f0VarArr[4].getValue(), serializableGBExperiment.f266421e);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.areEqual(serializableGBExperiment.f266422f, Boolean.TRUE)) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 5, i.f315935a, serializableGBExperiment.f266422f);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 6) || serializableGBExperiment.f266423g != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 6, o0.f315985a, serializableGBExperiment.f266423g);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 7) || serializableGBExperiment.f266424h != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 7, JsonElementSerializer.INSTANCE, serializableGBExperiment.f266424h);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 8) || serializableGBExperiment.f266425i != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 8, f0VarArr[8].getValue(), serializableGBExperiment.f266425i);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 9) || serializableGBExperiment.f266426j != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 9, y0.f316055a, serializableGBExperiment.f266426j);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 10) || serializableGBExperiment.f266427k != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 10, y0.f316055a, serializableGBExperiment.f266427k);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 11) || serializableGBExperiment.f266428l != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 11, r.a.f266516a, serializableGBExperiment.f266428l);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 12) || serializableGBExperiment.f266429m != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 12, f0VarArr[12].getValue(), serializableGBExperiment.f266429m);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 13) || serializableGBExperiment.f266430n != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 13, f0VarArr[13].getValue(), serializableGBExperiment.f266430n);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 14) || serializableGBExperiment.f266431o != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 14, b3.f315897a, serializableGBExperiment.f266431o);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 15) || serializableGBExperiment.f266432p != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 15, b3.f315897a, serializableGBExperiment.f266432p);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 16) || serializableGBExperiment.f266433q != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 16, b3.f315897a, serializableGBExperiment.f266433q);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 17) || serializableGBExperiment.f266434r != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 17, b3.f315897a, serializableGBExperiment.f266434r);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 18) || serializableGBExperiment.f266435s != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 18, i.f315935a, serializableGBExperiment.f266435s);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 19) || serializableGBExperiment.f266436t != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 19, y0.f316055a, serializableGBExperiment.f266436t);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 20) || serializableGBExperiment.f266437u != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 20, y0.f316055a, serializableGBExperiment.f266437u);
        }
    }

    @Nullable
    public final String A() {
        return this.f266420d;
    }

    @Nullable
    public final List<Float> B() {
        return this.f266421e;
    }

    @Nullable
    public final Boolean C() {
        return this.f266422f;
    }

    @Nullable
    public final Float D() {
        return this.f266423g;
    }

    @Nullable
    public final JsonElement E() {
        return this.f266424h;
    }

    @Nullable
    public final ArrayList<GBParentConditionInterface> F() {
        return this.f266425i;
    }

    @NotNull
    public final SerializableGBExperiment G(@NotNull String key, @NotNull List<? extends JsonElement> variations, @Nullable JsonArray jsonArray, @Nullable String str, @Nullable List<Float> list, @Nullable Boolean bool, @Nullable Float f10, @Nullable JsonElement jsonElement, @Nullable ArrayList<GBParentConditionInterface> arrayList, @Nullable Integer num, @Nullable Integer num2, @Nullable List<Pair<Float, Float>> list2, @Nullable ArrayList<GBVariationMeta> arrayList2, @Nullable ArrayList<GBFilter> arrayList3, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool2, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(variations, "variations");
        return new SerializableGBExperiment(key, variations, jsonArray, str, list, bool, f10, jsonElement, arrayList, num, num2, list2, arrayList2, arrayList3, str2, str3, str4, str5, bool2, num3, num4);
    }

    @Nullable
    public final Boolean I() {
        return this.f266422f;
    }

    @Nullable
    public final Integer J() {
        return this.f266436t;
    }

    @Nullable
    public final JsonElement K() {
        return this.f266424h;
    }

    @Nullable
    public final Float L() {
        return this.f266423g;
    }

    @Nullable
    public final Boolean M() {
        return this.f266435s;
    }

    @Nullable
    public final String N() {
        return this.f266434r;
    }

    @Nullable
    public final ArrayList<GBFilter> O() {
        return this.f266430n;
    }

    @Nullable
    public final Integer P() {
        return this.f266426j;
    }

    @Nullable
    public final String Q() {
        return this.f266420d;
    }

    @Nullable
    public final Integer R() {
        return this.f266427k;
    }

    @NotNull
    public final String S() {
        return this.f266417a;
    }

    @Nullable
    public final ArrayList<GBVariationMeta> T() {
        return this.f266429m;
    }

    @Nullable
    public final Integer U() {
        return this.f266437u;
    }

    @Nullable
    public final String V() {
        return this.f266432p;
    }

    @Nullable
    public final JsonArray W() {
        return this.f266419c;
    }

    @Nullable
    public final ArrayList<GBParentConditionInterface> X() {
        return this.f266425i;
    }

    @Nullable
    public final String Y() {
        return this.f266433q;
    }

    @Nullable
    public final List<Pair<Float, Float>> Z() {
        return this.f266428l;
    }

    @Nullable
    public final String b0() {
        return this.f266431o;
    }

    @NotNull
    public final List<JsonElement> c0() {
        return this.f266418b;
    }

    @Nullable
    public final List<Float> d0() {
        return this.f266421e;
    }

    public final void e0(@Nullable Boolean bool) {
        this.f266422f = bool;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableGBExperiment)) {
            return false;
        }
        SerializableGBExperiment serializableGBExperiment = (SerializableGBExperiment) obj;
        if (Intrinsics.areEqual(this.f266417a, serializableGBExperiment.f266417a) && Intrinsics.areEqual(this.f266418b, serializableGBExperiment.f266418b) && Intrinsics.areEqual(this.f266419c, serializableGBExperiment.f266419c) && Intrinsics.areEqual(this.f266420d, serializableGBExperiment.f266420d) && Intrinsics.areEqual(this.f266421e, serializableGBExperiment.f266421e) && Intrinsics.areEqual(this.f266422f, serializableGBExperiment.f266422f) && Intrinsics.areEqual((Object) this.f266423g, (Object) serializableGBExperiment.f266423g) && Intrinsics.areEqual(this.f266424h, serializableGBExperiment.f266424h) && Intrinsics.areEqual(this.f266425i, serializableGBExperiment.f266425i) && Intrinsics.areEqual(this.f266426j, serializableGBExperiment.f266426j) && Intrinsics.areEqual(this.f266427k, serializableGBExperiment.f266427k) && Intrinsics.areEqual(this.f266428l, serializableGBExperiment.f266428l) && Intrinsics.areEqual(this.f266429m, serializableGBExperiment.f266429m) && Intrinsics.areEqual(this.f266430n, serializableGBExperiment.f266430n) && Intrinsics.areEqual(this.f266431o, serializableGBExperiment.f266431o) && Intrinsics.areEqual(this.f266432p, serializableGBExperiment.f266432p) && Intrinsics.areEqual(this.f266433q, serializableGBExperiment.f266433q) && Intrinsics.areEqual(this.f266434r, serializableGBExperiment.f266434r) && Intrinsics.areEqual(this.f266435s, serializableGBExperiment.f266435s) && Intrinsics.areEqual(this.f266436t, serializableGBExperiment.f266436t) && Intrinsics.areEqual(this.f266437u, serializableGBExperiment.f266437u)) {
            return true;
        }
        return false;
    }

    public final void f0(@Nullable JsonElement jsonElement) {
        this.f266424h = jsonElement;
    }

    public final void g0(@Nullable Float f10) {
        this.f266423g = f10;
    }

    public final void h0(@Nullable ArrayList<GBFilter> arrayList) {
        this.f266430n = arrayList;
    }

    public int hashCode() {
        int iHashCode = ((this.f266417a.hashCode() * 31) + this.f266418b.hashCode()) * 31;
        JsonArray jsonArray = this.f266419c;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (jsonArray == null ? 0 : jsonArray.hashCode())) * 31;
        String str = this.f266420d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<Float> list = this.f266421e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f266422f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f10 = this.f266423g;
        int iHashCode7 = (iHashCode6 + (f10 == null ? 0 : f10.hashCode())) * 31;
        JsonElement jsonElement = this.f266424h;
        int iHashCode8 = (iHashCode7 + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31;
        ArrayList<GBParentConditionInterface> arrayList = this.f266425i;
        int iHashCode9 = (iHashCode8 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Integer num = this.f266426j;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f266427k;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Pair<Float, Float>> list2 = this.f266428l;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ArrayList<GBVariationMeta> arrayList2 = this.f266429m;
        int iHashCode13 = (iHashCode12 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<GBFilter> arrayList3 = this.f266430n;
        int iHashCode14 = (iHashCode13 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        String str2 = this.f266431o;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f266432p;
        int iHashCode16 = (iHashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f266433q;
        int iHashCode17 = (iHashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f266434r;
        int iHashCode18 = (iHashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.f266435s;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.f266436t;
        int iHashCode20 = (iHashCode19 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f266437u;
        if (num4 != null) {
            iHashCode2 = num4.hashCode();
        }
        return iHashCode20 + iHashCode2;
    }

    public final void i0(@Nullable Integer num) {
        this.f266426j = num;
    }

    public final void j0(@Nullable Integer num) {
        this.f266427k = num;
    }

    public final void k0(@Nullable ArrayList<GBVariationMeta> arrayList) {
        this.f266429m = arrayList;
    }

    @NotNull
    public final String l() {
        return this.f266417a;
    }

    public final void l0(@Nullable String str) {
        this.f266432p = str;
    }

    @Nullable
    public final Integer m() {
        return this.f266426j;
    }

    public final void m0(@Nullable String str) {
        this.f266433q = str;
    }

    @Nullable
    public final Integer n() {
        return this.f266427k;
    }

    public final void n0(@Nullable List<Pair<Float, Float>> list) {
        this.f266428l = list;
    }

    @Nullable
    public final List<Pair<Float, Float>> o() {
        return this.f266428l;
    }

    public final void o0(@Nullable String str) {
        this.f266431o = str;
    }

    @Nullable
    public final ArrayList<GBVariationMeta> p() {
        return this.f266429m;
    }

    public final void p0(@Nullable List<Float> list) {
        this.f266421e = list;
    }

    @Nullable
    public final ArrayList<GBFilter> q() {
        return this.f266430n;
    }

    @Nullable
    public final String r() {
        return this.f266431o;
    }

    @Nullable
    public final String s() {
        return this.f266432p;
    }

    @Nullable
    public final String t() {
        return this.f266433q;
    }

    @NotNull
    public String toString() {
        return "SerializableGBExperiment(key=" + this.f266417a + ", variations=" + this.f266418b + ", namespace=" + this.f266419c + ", hashAttribute=" + this.f266420d + ", weights=" + this.f266421e + ", active=" + this.f266422f + ", coverage=" + this.f266423g + ", condition=" + this.f266424h + ", parentConditions=" + this.f266425i + ", force=" + this.f266426j + ", hashVersion=" + this.f266427k + ", ranges=" + this.f266428l + ", meta=" + this.f266429m + ", filters=" + this.f266430n + ", seed=" + this.f266431o + ", name=" + this.f266432p + ", phase=" + this.f266433q + ", fallBackAttribute=" + this.f266434r + ", disableStickyBucketing=" + this.f266435s + ", bucketVersion=" + this.f266436t + ", minBucketVersion=" + this.f266437u + ")";
    }

    @Nullable
    public final String u() {
        return this.f266434r;
    }

    @Nullable
    public final Boolean v() {
        return this.f266435s;
    }

    @NotNull
    public final List<JsonElement> w() {
        return this.f266418b;
    }

    @Nullable
    public final Integer x() {
        return this.f266436t;
    }

    @Nullable
    public final Integer y() {
        return this.f266437u;
    }

    @Nullable
    public final JsonArray z() {
        return this.f266419c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerializableGBExperiment(@NotNull String key, @NotNull List<? extends JsonElement> variations, @Nullable JsonArray jsonArray, @Nullable String str, @Nullable List<Float> list, @Nullable Boolean bool, @Nullable Float f10, @Nullable JsonElement jsonElement, @Nullable ArrayList<GBParentConditionInterface> arrayList, @Nullable Integer num, @Nullable Integer num2, @Nullable List<Pair<Float, Float>> list2, @Nullable ArrayList<GBVariationMeta> arrayList2, @Nullable ArrayList<GBFilter> arrayList3, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool2, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(variations, "variations");
        this.f266417a = key;
        this.f266418b = variations;
        this.f266419c = jsonArray;
        this.f266420d = str;
        this.f266421e = list;
        this.f266422f = bool;
        this.f266423g = f10;
        this.f266424h = jsonElement;
        this.f266425i = arrayList;
        this.f266426j = num;
        this.f266427k = num2;
        this.f266428l = list2;
        this.f266429m = arrayList2;
        this.f266430n = arrayList3;
        this.f266431o = str2;
        this.f266432p = str3;
        this.f266433q = str4;
        this.f266434r = str5;
        this.f266435s = bool2;
        this.f266436t = num3;
        this.f266437u = num4;
    }

    public /* synthetic */ SerializableGBExperiment(String str, List list, JsonArray jsonArray, String str2, List list2, Boolean bool, Float f10, JsonElement jsonElement, ArrayList arrayList, Integer num, Integer num2, List list3, ArrayList arrayList2, ArrayList arrayList3, String str3, String str4, String str5, String str6, Boolean bool2, Integer num3, Integer num4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? new ArrayList() : list, (i10 & 4) != 0 ? null : jsonArray, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : list2, (i10 & 32) != 0 ? Boolean.TRUE : bool, (i10 & 64) != 0 ? null : f10, (i10 & 128) != 0 ? null : jsonElement, (i10 & 256) != 0 ? null : arrayList, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : num2, (i10 & 2048) != 0 ? null : list3, (i10 & 4096) != 0 ? null : arrayList2, (i10 & 8192) != 0 ? null : arrayList3, (i10 & 16384) != 0 ? null : str3, (i10 & 32768) != 0 ? null : str4, (i10 & 65536) != 0 ? null : str5, (i10 & 131072) != 0 ? null : str6, (i10 & 262144) != 0 ? null : bool2, (i10 & 524288) != 0 ? null : num3, (i10 & 1048576) != 0 ? null : num4);
    }
}
