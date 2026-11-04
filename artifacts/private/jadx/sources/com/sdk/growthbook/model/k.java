package com.sdk.growthbook.model;

import com.sdk.growthbook.serializable_model.SerializableGBFeatureRule;
import com.sdk.growthbook.utils.GBFilter;
import com.sdk.growthbook.utils.GBParentConditionInterface;
import com.sdk.growthbook.utils.GBVariationMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.b0;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGBFeature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBFeature.kt\ncom/sdk/growthbook/model/GBFeatureRule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,274:1\n1563#2:275\n1634#2,3:276\n1563#2:279\n1634#2,3:280\n*S KotlinDebug\n*F\n+ 1 GBFeature.kt\ncom/sdk/growthbook/model/GBFeatureRule\n*L\n172#1:275\n172#1:276,3\n191#1:279\n191#1:280,3\n*E\n"})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f266341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final JsonElement f266342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final ArrayList<GBParentConditionInterface> f266343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Float f266344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final q f266345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final List<q> f266346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f266347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final List<Float> f266348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final JsonArray f266349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final String f266350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final Integer f266351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Pair<Float, Float> f266352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final List<Pair<Float, Float>> f266353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final ArrayList<GBVariationMeta> f266354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final ArrayList<GBFilter> f266355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private final String f266356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private final String f266357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private final String f266358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f266359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final Boolean f266360t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    private final Integer f266361u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private final Integer f266362v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private final ArrayList<com.sdk.growthbook.utils.m> f266363w;

    public k() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    @b0(with = com.sdk.growthbook.utils.r.b.class)
    public static /* synthetic */ void S() {
    }

    @b0(with = com.sdk.growthbook.utils.r.a.class)
    public static /* synthetic */ void U() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k y(k kVar, String str, JsonElement jsonElement, ArrayList arrayList, Float f10, q qVar, List list, String str2, List list2, JsonArray jsonArray, String str3, Integer num, Pair pair, List list3, ArrayList arrayList2, ArrayList arrayList3, String str4, String str5, String str6, String str7, Boolean bool, Integer num2, Integer num3, ArrayList arrayList4, int i10, Object obj) {
        ArrayList arrayList5;
        Integer num4;
        String str8 = (i10 & 1) != 0 ? kVar.f266341a : str;
        JsonElement jsonElement2 = (i10 & 2) != 0 ? kVar.f266342b : jsonElement;
        ArrayList arrayList6 = (i10 & 4) != 0 ? kVar.f266343c : arrayList;
        Float f11 = (i10 & 8) != 0 ? kVar.f266344d : f10;
        q qVar2 = (i10 & 16) != 0 ? kVar.f266345e : qVar;
        List list4 = (i10 & 32) != 0 ? kVar.f266346f : list;
        String str9 = (i10 & 64) != 0 ? kVar.f266347g : str2;
        List list5 = (i10 & 128) != 0 ? kVar.f266348h : list2;
        JsonArray jsonArray2 = (i10 & 256) != 0 ? kVar.f266349i : jsonArray;
        String str10 = (i10 & 512) != 0 ? kVar.f266350j : str3;
        Integer num5 = (i10 & 1024) != 0 ? kVar.f266351k : num;
        Pair pair2 = (i10 & 2048) != 0 ? kVar.f266352l : pair;
        List list6 = (i10 & 4096) != 0 ? kVar.f266353m : list3;
        ArrayList arrayList7 = (i10 & 8192) != 0 ? kVar.f266354n : arrayList2;
        String str11 = str8;
        ArrayList arrayList8 = (i10 & 16384) != 0 ? kVar.f266355o : arrayList3;
        String str12 = (i10 & 32768) != 0 ? kVar.f266356p : str4;
        String str13 = (i10 & 65536) != 0 ? kVar.f266357q : str5;
        String str14 = (i10 & 131072) != 0 ? kVar.f266358r : str6;
        String str15 = (i10 & 262144) != 0 ? kVar.f266359s : str7;
        Boolean bool2 = (i10 & 524288) != 0 ? kVar.f266360t : bool;
        Integer num6 = (i10 & 1048576) != 0 ? kVar.f266361u : num2;
        Integer num7 = (i10 & 2097152) != 0 ? kVar.f266362v : num3;
        if ((i10 & 4194304) != 0) {
            num4 = num7;
            arrayList5 = kVar.f266363w;
        } else {
            arrayList5 = arrayList4;
            num4 = num7;
        }
        return kVar.x(str11, jsonElement2, arrayList6, f11, qVar2, list4, str9, list5, jsonArray2, str10, num5, pair2, list6, arrayList7, arrayList8, str12, str13, str14, str15, bool2, num6, num4, arrayList5);
    }

    @Nullable
    public final Integer A() {
        return this.f266361u;
    }

    @Nullable
    public final JsonElement B() {
        return this.f266342b;
    }

    @Nullable
    public final Float C() {
        return this.f266344d;
    }

    @Nullable
    public final Boolean D() {
        return this.f266360t;
    }

    @Nullable
    public final String E() {
        return this.f266359s;
    }

    @Nullable
    public final ArrayList<GBFilter> F() {
        return this.f266355o;
    }

    @Nullable
    public final q G() {
        return this.f266345e;
    }

    @Nullable
    public final String H() {
        return this.f266350j;
    }

    @Nullable
    public final Integer I() {
        return this.f266351k;
    }

    @Nullable
    public final String J() {
        return this.f266341a;
    }

    @Nullable
    public final String K() {
        return this.f266347g;
    }

    @Nullable
    public final ArrayList<GBVariationMeta> L() {
        return this.f266354n;
    }

    @Nullable
    public final Integer M() {
        return this.f266362v;
    }

    @Nullable
    public final String N() {
        return this.f266357q;
    }

    @Nullable
    public final JsonArray O() {
        return this.f266349i;
    }

    @Nullable
    public final ArrayList<GBParentConditionInterface> P() {
        return this.f266343c;
    }

    @Nullable
    public final String Q() {
        return this.f266358r;
    }

    @Nullable
    public final Pair<Float, Float> R() {
        return this.f266352l;
    }

    @Nullable
    public final List<Pair<Float, Float>> T() {
        return this.f266353m;
    }

    @Nullable
    public final String V() {
        return this.f266356p;
    }

    @Nullable
    public final ArrayList<com.sdk.growthbook.utils.m> W() {
        return this.f266363w;
    }

    @Nullable
    public final List<q> X() {
        return this.f266346f;
    }

    @Nullable
    public final List<Float> Y() {
        return this.f266348h;
    }

    @Nullable
    public final String a() {
        return this.f266341a;
    }

    @Nullable
    public final String b() {
        return this.f266350j;
    }

    @Nullable
    public final Integer c() {
        return this.f266351k;
    }

    @Nullable
    public final Pair<Float, Float> d() {
        return this.f266352l;
    }

    @Nullable
    public final List<Pair<Float, Float>> e() {
        return this.f266353m;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f266341a, kVar.f266341a) && Intrinsics.areEqual(this.f266342b, kVar.f266342b) && Intrinsics.areEqual(this.f266343c, kVar.f266343c) && Intrinsics.areEqual((Object) this.f266344d, (Object) kVar.f266344d) && Intrinsics.areEqual(this.f266345e, kVar.f266345e) && Intrinsics.areEqual(this.f266346f, kVar.f266346f) && Intrinsics.areEqual(this.f266347g, kVar.f266347g) && Intrinsics.areEqual(this.f266348h, kVar.f266348h) && Intrinsics.areEqual(this.f266349i, kVar.f266349i) && Intrinsics.areEqual(this.f266350j, kVar.f266350j) && Intrinsics.areEqual(this.f266351k, kVar.f266351k) && Intrinsics.areEqual(this.f266352l, kVar.f266352l) && Intrinsics.areEqual(this.f266353m, kVar.f266353m) && Intrinsics.areEqual(this.f266354n, kVar.f266354n) && Intrinsics.areEqual(this.f266355o, kVar.f266355o) && Intrinsics.areEqual(this.f266356p, kVar.f266356p) && Intrinsics.areEqual(this.f266357q, kVar.f266357q) && Intrinsics.areEqual(this.f266358r, kVar.f266358r) && Intrinsics.areEqual(this.f266359s, kVar.f266359s) && Intrinsics.areEqual(this.f266360t, kVar.f266360t) && Intrinsics.areEqual(this.f266361u, kVar.f266361u) && Intrinsics.areEqual(this.f266362v, kVar.f266362v) && Intrinsics.areEqual(this.f266363w, kVar.f266363w);
    }

    @Nullable
    public final ArrayList<GBVariationMeta> f() {
        return this.f266354n;
    }

    @Nullable
    public final ArrayList<GBFilter> g() {
        return this.f266355o;
    }

    @Nullable
    public final String h() {
        return this.f266356p;
    }

    public int hashCode() {
        String str = this.f266341a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JsonElement jsonElement = this.f266342b;
        int iHashCode2 = (iHashCode + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31;
        ArrayList<GBParentConditionInterface> arrayList = this.f266343c;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Float f10 = this.f266344d;
        int iHashCode4 = (iHashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31;
        q qVar = this.f266345e;
        int iHashCode5 = (iHashCode4 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        List<q> list = this.f266346f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f266347g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Float> list2 = this.f266348h;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        JsonArray jsonArray = this.f266349i;
        int iHashCode9 = (iHashCode8 + (jsonArray == null ? 0 : jsonArray.hashCode())) * 31;
        String str3 = this.f266350j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f266351k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Pair<Float, Float> pair = this.f266352l;
        int iHashCode12 = (iHashCode11 + (pair == null ? 0 : pair.hashCode())) * 31;
        List<Pair<Float, Float>> list3 = this.f266353m;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ArrayList<GBVariationMeta> arrayList2 = this.f266354n;
        int iHashCode14 = (iHashCode13 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<GBFilter> arrayList3 = this.f266355o;
        int iHashCode15 = (iHashCode14 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        String str4 = this.f266356p;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f266357q;
        int iHashCode17 = (iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f266358r;
        int iHashCode18 = (iHashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f266359s;
        int iHashCode19 = (iHashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.f266360t;
        int iHashCode20 = (iHashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.f266361u;
        int iHashCode21 = (iHashCode20 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f266362v;
        int iHashCode22 = (iHashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ArrayList<com.sdk.growthbook.utils.m> arrayList4 = this.f266363w;
        return iHashCode22 + (arrayList4 != null ? arrayList4.hashCode() : 0);
    }

    @Nullable
    public final String i() {
        return this.f266357q;
    }

    @Nullable
    public final String j() {
        return this.f266358r;
    }

    @Nullable
    public final String k() {
        return this.f266359s;
    }

    @Nullable
    public final JsonElement l() {
        return this.f266342b;
    }

    @Nullable
    public final Boolean m() {
        return this.f266360t;
    }

    @Nullable
    public final Integer n() {
        return this.f266361u;
    }

    @Nullable
    public final Integer o() {
        return this.f266362v;
    }

    @Nullable
    public final ArrayList<com.sdk.growthbook.utils.m> p() {
        return this.f266363w;
    }

    @Nullable
    public final ArrayList<GBParentConditionInterface> q() {
        return this.f266343c;
    }

    @Nullable
    public final Float r() {
        return this.f266344d;
    }

    @Nullable
    public final q s() {
        return this.f266345e;
    }

    @Nullable
    public final List<q> t() {
        return this.f266346f;
    }

    @NotNull
    public String toString() {
        return "GBFeatureRule(id=" + this.f266341a + ", condition=" + this.f266342b + ", parentConditions=" + this.f266343c + ", coverage=" + this.f266344d + ", force=" + this.f266345e + ", variations=" + this.f266346f + ", key=" + this.f266347g + ", weights=" + this.f266348h + ", namespace=" + this.f266349i + ", hashAttribute=" + this.f266350j + ", hashVersion=" + this.f266351k + ", range=" + this.f266352l + ", ranges=" + this.f266353m + ", meta=" + this.f266354n + ", filters=" + this.f266355o + ", seed=" + this.f266356p + ", name=" + this.f266357q + ", phase=" + this.f266358r + ", fallbackAttribute=" + this.f266359s + ", disableStickyBucketing=" + this.f266360t + ", bucketVersion=" + this.f266361u + ", minBucketVersion=" + this.f266362v + ", tracks=" + this.f266363w + ")";
    }

    @Nullable
    public final String u() {
        return this.f266347g;
    }

    @Nullable
    public final List<Float> v() {
        return this.f266348h;
    }

    @Nullable
    public final JsonArray w() {
        return this.f266349i;
    }

    @NotNull
    public final k x(@Nullable String str, @Nullable JsonElement jsonElement, @Nullable ArrayList<GBParentConditionInterface> arrayList, @Nullable Float f10, @Nullable q qVar, @Nullable List<? extends q> list, @Nullable String str2, @Nullable List<Float> list2, @Nullable JsonArray jsonArray, @Nullable String str3, @Nullable Integer num, @Nullable Pair<Float, Float> pair, @Nullable List<Pair<Float, Float>> list3, @Nullable ArrayList<GBVariationMeta> arrayList2, @Nullable ArrayList<GBFilter> arrayList3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable ArrayList<com.sdk.growthbook.utils.m> arrayList4) {
        return new k(str, jsonElement, arrayList, f10, qVar, list, str2, list2, jsonArray, str3, num, pair, list3, arrayList2, arrayList3, str4, str5, str6, str7, bool, num2, num3, arrayList4);
    }

    @NotNull
    public final SerializableGBFeatureRule z() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str = this.f266341a;
        JsonElement jsonElement = this.f266342b;
        ArrayList<GBParentConditionInterface> arrayList4 = this.f266343c;
        Float f10 = this.f266344d;
        q qVar = this.f266345e;
        com.sdk.growthbook.utils.p bVar = qVar == null ? com.sdk.growthbook.utils.p.a.f266511a : new com.sdk.growthbook.utils.p.b(nf.a.b(qVar));
        List<q> list = this.f266346f;
        if (list != null) {
            List<q> list2 = list;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList5.add(nf.a.b((q) it.next()));
            }
            arrayList = arrayList5;
            arrayList2 = null;
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        String str2 = this.f266347g;
        List<Float> list3 = this.f266348h;
        ArrayList arrayList6 = arrayList2;
        JsonArray jsonArray = this.f266349i;
        String str3 = this.f266350j;
        Integer num = this.f266351k;
        Pair<Float, Float> pair = this.f266352l;
        List<Pair<Float, Float>> list4 = this.f266353m;
        ArrayList<GBVariationMeta> arrayList7 = this.f266354n;
        ArrayList<GBFilter> arrayList8 = this.f266355o;
        String str4 = this.f266356p;
        String str5 = this.f266357q;
        String str6 = this.f266358r;
        String str7 = this.f266359s;
        Boolean bool = this.f266360t;
        Integer num2 = this.f266361u;
        Integer num3 = this.f266362v;
        ArrayList<com.sdk.growthbook.utils.m> arrayList9 = this.f266363w;
        if (arrayList9 != null) {
            ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
            Iterator<T> it2 = arrayList9.iterator();
            while (it2.hasNext()) {
                arrayList10.add(((com.sdk.growthbook.utils.m) it2.next()).e());
            }
            arrayList3 = new ArrayList(arrayList10);
        } else {
            arrayList3 = arrayList6;
        }
        return new SerializableGBFeatureRule(str, jsonElement, arrayList4, f10, bVar, arrayList, str2, list3, jsonArray, str3, num, pair, list4, arrayList7, arrayList8, str4, str5, str6, str7, bool, num2, num3, arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Nullable String str, @Nullable JsonElement jsonElement, @Nullable ArrayList<GBParentConditionInterface> arrayList, @Nullable Float f10, @Nullable q qVar, @Nullable List<? extends q> list, @Nullable String str2, @Nullable List<Float> list2, @Nullable JsonArray jsonArray, @Nullable String str3, @Nullable Integer num, @Nullable Pair<Float, Float> pair, @Nullable List<Pair<Float, Float>> list3, @Nullable ArrayList<GBVariationMeta> arrayList2, @Nullable ArrayList<GBFilter> arrayList3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable ArrayList<com.sdk.growthbook.utils.m> arrayList4) {
        this.f266341a = str;
        this.f266342b = jsonElement;
        this.f266343c = arrayList;
        this.f266344d = f10;
        this.f266345e = qVar;
        this.f266346f = list;
        this.f266347g = str2;
        this.f266348h = list2;
        this.f266349i = jsonArray;
        this.f266350j = str3;
        this.f266351k = num;
        this.f266352l = pair;
        this.f266353m = list3;
        this.f266354n = arrayList2;
        this.f266355o = arrayList3;
        this.f266356p = str4;
        this.f266357q = str5;
        this.f266358r = str6;
        this.f266359s = str7;
        this.f266360t = bool;
        this.f266361u = num2;
        this.f266362v = num3;
        this.f266363w = arrayList4;
    }

    public /* synthetic */ k(String str, JsonElement jsonElement, ArrayList arrayList, Float f10, q qVar, List list, String str2, List list2, JsonArray jsonArray, String str3, Integer num, Pair pair, List list3, ArrayList arrayList2, ArrayList arrayList3, String str4, String str5, String str6, String str7, Boolean bool, Integer num2, Integer num3, ArrayList arrayList4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : jsonElement, (i10 & 4) != 0 ? null : arrayList, (i10 & 8) != 0 ? null : f10, (i10 & 16) != 0 ? null : qVar, (i10 & 32) != 0 ? null : list, (i10 & 64) != 0 ? null : str2, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? null : jsonArray, (i10 & 512) != 0 ? null : str3, (i10 & 1024) != 0 ? null : num, (i10 & 2048) != 0 ? null : pair, (i10 & 4096) != 0 ? null : list3, (i10 & 8192) != 0 ? null : arrayList2, (i10 & 16384) != 0 ? null : arrayList3, (i10 & 32768) != 0 ? null : str4, (i10 & 65536) != 0 ? null : str5, (i10 & 131072) != 0 ? null : str6, (i10 & 262144) != 0 ? null : str7, (i10 & 524288) != 0 ? null : bool, (i10 & 1048576) != 0 ? null : num2, (i10 & 2097152) != 0 ? null : num3, (i10 & 4194304) != 0 ? null : arrayList4);
    }
}
