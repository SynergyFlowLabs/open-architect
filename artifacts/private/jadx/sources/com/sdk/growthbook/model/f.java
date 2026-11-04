package com.sdk.growthbook.model;

import com.sdk.growthbook.serializable_model.SerializableGBExperiment;
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
@SourceDebugExtension({"SMAP\nGBExperiment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBExperiment.kt\ncom/sdk/growthbook/model/GBExperiment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,240:1\n1563#2:241\n1634#2,3:242\n*S KotlinDebug\n*F\n+ 1 GBExperiment.kt\ncom/sdk/growthbook/model/GBExperiment\n*L\n154#1:241\n154#1:242,3\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f266300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<q> f266301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final JsonArray f266302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f266303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private List<Float> f266304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Boolean f266305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Float f266306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private JsonElement f266307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final ArrayList<GBParentConditionInterface> f266308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Integer f266309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Integer f266310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private List<Pair<Float, Float>> f266311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private ArrayList<GBVariationMeta> f266312m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private ArrayList<GBFilter> f266313n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private String f266314o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private String f266315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private String f266316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private final String f266317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final Boolean f266318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final Integer f266319t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    private final Integer f266320u;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull String key, @NotNull List<? extends q> variations, @Nullable JsonArray jsonArray, @Nullable String str, @Nullable List<Float> list, @Nullable Boolean bool, @Nullable Float f10, @Nullable JsonElement jsonElement, @Nullable ArrayList<GBParentConditionInterface> arrayList, @Nullable Integer num, @Nullable Integer num2, @Nullable List<Pair<Float, Float>> list2, @Nullable ArrayList<GBVariationMeta> arrayList2, @Nullable ArrayList<GBFilter> arrayList3, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool2, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(variations, "variations");
        this.f266300a = key;
        this.f266301b = variations;
        this.f266302c = jsonArray;
        this.f266303d = str;
        this.f266304e = list;
        this.f266305f = bool;
        this.f266306g = f10;
        this.f266307h = jsonElement;
        this.f266308i = arrayList;
        this.f266309j = num;
        this.f266310k = num2;
        this.f266311l = list2;
        this.f266312m = arrayList2;
        this.f266313n = arrayList3;
        this.f266314o = str2;
        this.f266315p = str3;
        this.f266316q = str4;
        this.f266317r = str5;
        this.f266318s = bool2;
        this.f266319t = num3;
        this.f266320u = num4;
    }

    @b0(with = com.sdk.growthbook.utils.r.a.class)
    public static /* synthetic */ void Q() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f w(f fVar, String str, List list, JsonArray jsonArray, String str2, List list2, Boolean bool, Float f10, JsonElement jsonElement, ArrayList arrayList, Integer num, Integer num2, List list3, ArrayList arrayList2, ArrayList arrayList3, String str3, String str4, String str5, String str6, Boolean bool2, Integer num3, Integer num4, int i10, Object obj) {
        Integer num5;
        Integer num6;
        String str7 = (i10 & 1) != 0 ? fVar.f266300a : str;
        List list4 = (i10 & 2) != 0 ? fVar.f266301b : list;
        JsonArray jsonArray2 = (i10 & 4) != 0 ? fVar.f266302c : jsonArray;
        String str8 = (i10 & 8) != 0 ? fVar.f266303d : str2;
        List list5 = (i10 & 16) != 0 ? fVar.f266304e : list2;
        Boolean bool3 = (i10 & 32) != 0 ? fVar.f266305f : bool;
        Float f11 = (i10 & 64) != 0 ? fVar.f266306g : f10;
        JsonElement jsonElement2 = (i10 & 128) != 0 ? fVar.f266307h : jsonElement;
        ArrayList arrayList4 = (i10 & 256) != 0 ? fVar.f266308i : arrayList;
        Integer num7 = (i10 & 512) != 0 ? fVar.f266309j : num;
        Integer num8 = (i10 & 1024) != 0 ? fVar.f266310k : num2;
        List list6 = (i10 & 2048) != 0 ? fVar.f266311l : list3;
        ArrayList arrayList5 = (i10 & 4096) != 0 ? fVar.f266312m : arrayList2;
        ArrayList arrayList6 = (i10 & 8192) != 0 ? fVar.f266313n : arrayList3;
        String str9 = str7;
        String str10 = (i10 & 16384) != 0 ? fVar.f266314o : str3;
        String str11 = (i10 & 32768) != 0 ? fVar.f266315p : str4;
        String str12 = (i10 & 65536) != 0 ? fVar.f266316q : str5;
        String str13 = (i10 & 131072) != 0 ? fVar.f266317r : str6;
        Boolean bool4 = (i10 & 262144) != 0 ? fVar.f266318s : bool2;
        Integer num9 = (i10 & 524288) != 0 ? fVar.f266319t : num3;
        if ((i10 & 1048576) != 0) {
            num6 = num9;
            num5 = fVar.f266320u;
        } else {
            num5 = num4;
            num6 = num9;
        }
        return fVar.v(str9, list4, jsonArray2, str8, list5, bool3, f11, jsonElement2, arrayList4, num7, num8, list6, arrayList5, arrayList6, str10, str11, str12, str13, bool4, num6, num5);
    }

    @Nullable
    public final JsonElement A() {
        return this.f266307h;
    }

    @Nullable
    public final Float B() {
        return this.f266306g;
    }

    @Nullable
    public final Boolean C() {
        return this.f266318s;
    }

    @Nullable
    public final String D() {
        return this.f266317r;
    }

    @Nullable
    public final ArrayList<GBFilter> E() {
        return this.f266313n;
    }

    @Nullable
    public final Integer F() {
        return this.f266309j;
    }

    @Nullable
    public final String G() {
        return this.f266303d;
    }

    @Nullable
    public final Integer H() {
        return this.f266310k;
    }

    @NotNull
    public final String I() {
        return this.f266300a;
    }

    @Nullable
    public final ArrayList<GBVariationMeta> J() {
        return this.f266312m;
    }

    @Nullable
    public final Integer K() {
        return this.f266320u;
    }

    @Nullable
    public final String L() {
        return this.f266315p;
    }

    @Nullable
    public final JsonArray M() {
        return this.f266302c;
    }

    @Nullable
    public final ArrayList<GBParentConditionInterface> N() {
        return this.f266308i;
    }

    @Nullable
    public final String O() {
        return this.f266316q;
    }

    @Nullable
    public final List<Pair<Float, Float>> P() {
        return this.f266311l;
    }

    @Nullable
    public final String R() {
        return this.f266314o;
    }

    @NotNull
    public final List<q> S() {
        return this.f266301b;
    }

    @Nullable
    public final List<Float> T() {
        return this.f266304e;
    }

    public final void U(@Nullable Boolean bool) {
        this.f266305f = bool;
    }

    public final void V(@Nullable JsonElement jsonElement) {
        this.f266307h = jsonElement;
    }

    public final void W(@Nullable Float f10) {
        this.f266306g = f10;
    }

    public final void X(@Nullable ArrayList<GBFilter> arrayList) {
        this.f266313n = arrayList;
    }

    public final void Y(@Nullable Integer num) {
        this.f266309j = num;
    }

    public final void Z(@Nullable Integer num) {
        this.f266310k = num;
    }

    @NotNull
    public final String a() {
        return this.f266300a;
    }

    public final void a0(@Nullable ArrayList<GBVariationMeta> arrayList) {
        this.f266312m = arrayList;
    }

    @Nullable
    public final Integer b() {
        return this.f266309j;
    }

    public final void b0(@Nullable String str) {
        this.f266315p = str;
    }

    @Nullable
    public final Integer c() {
        return this.f266310k;
    }

    public final void c0(@Nullable String str) {
        this.f266316q = str;
    }

    @Nullable
    public final List<Pair<Float, Float>> d() {
        return this.f266311l;
    }

    public final void d0(@Nullable List<Pair<Float, Float>> list) {
        this.f266311l = list;
    }

    @Nullable
    public final ArrayList<GBVariationMeta> e() {
        return this.f266312m;
    }

    public final void e0(@Nullable String str) {
        this.f266314o = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f266300a, fVar.f266300a) && Intrinsics.areEqual(this.f266301b, fVar.f266301b) && Intrinsics.areEqual(this.f266302c, fVar.f266302c) && Intrinsics.areEqual(this.f266303d, fVar.f266303d) && Intrinsics.areEqual(this.f266304e, fVar.f266304e) && Intrinsics.areEqual(this.f266305f, fVar.f266305f) && Intrinsics.areEqual((Object) this.f266306g, (Object) fVar.f266306g) && Intrinsics.areEqual(this.f266307h, fVar.f266307h) && Intrinsics.areEqual(this.f266308i, fVar.f266308i) && Intrinsics.areEqual(this.f266309j, fVar.f266309j) && Intrinsics.areEqual(this.f266310k, fVar.f266310k) && Intrinsics.areEqual(this.f266311l, fVar.f266311l) && Intrinsics.areEqual(this.f266312m, fVar.f266312m) && Intrinsics.areEqual(this.f266313n, fVar.f266313n) && Intrinsics.areEqual(this.f266314o, fVar.f266314o) && Intrinsics.areEqual(this.f266315p, fVar.f266315p) && Intrinsics.areEqual(this.f266316q, fVar.f266316q) && Intrinsics.areEqual(this.f266317r, fVar.f266317r) && Intrinsics.areEqual(this.f266318s, fVar.f266318s) && Intrinsics.areEqual(this.f266319t, fVar.f266319t) && Intrinsics.areEqual(this.f266320u, fVar.f266320u);
    }

    @Nullable
    public final ArrayList<GBFilter> f() {
        return this.f266313n;
    }

    public final void f0(@Nullable List<Float> list) {
        this.f266304e = list;
    }

    @Nullable
    public final String g() {
        return this.f266314o;
    }

    @Nullable
    public final String h() {
        return this.f266315p;
    }

    public int hashCode() {
        int iHashCode = ((this.f266300a.hashCode() * 31) + this.f266301b.hashCode()) * 31;
        JsonArray jsonArray = this.f266302c;
        int iHashCode2 = (iHashCode + (jsonArray == null ? 0 : jsonArray.hashCode())) * 31;
        String str = this.f266303d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Float> list = this.f266304e;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f266305f;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f10 = this.f266306g;
        int iHashCode6 = (iHashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31;
        JsonElement jsonElement = this.f266307h;
        int iHashCode7 = (iHashCode6 + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31;
        ArrayList<GBParentConditionInterface> arrayList = this.f266308i;
        int iHashCode8 = (iHashCode7 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Integer num = this.f266309j;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f266310k;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Pair<Float, Float>> list2 = this.f266311l;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ArrayList<GBVariationMeta> arrayList2 = this.f266312m;
        int iHashCode12 = (iHashCode11 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<GBFilter> arrayList3 = this.f266313n;
        int iHashCode13 = (iHashCode12 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        String str2 = this.f266314o;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f266315p;
        int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f266316q;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f266317r;
        int iHashCode17 = (iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.f266318s;
        int iHashCode18 = (iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.f266319t;
        int iHashCode19 = (iHashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f266320u;
        return iHashCode19 + (num4 != null ? num4.hashCode() : 0);
    }

    @Nullable
    public final String i() {
        return this.f266316q;
    }

    @Nullable
    public final String j() {
        return this.f266317r;
    }

    @Nullable
    public final Boolean k() {
        return this.f266318s;
    }

    @NotNull
    public final List<q> l() {
        return this.f266301b;
    }

    @Nullable
    public final Integer m() {
        return this.f266319t;
    }

    @Nullable
    public final Integer n() {
        return this.f266320u;
    }

    @Nullable
    public final JsonArray o() {
        return this.f266302c;
    }

    @Nullable
    public final String p() {
        return this.f266303d;
    }

    @Nullable
    public final List<Float> q() {
        return this.f266304e;
    }

    @Nullable
    public final Boolean r() {
        return this.f266305f;
    }

    @Nullable
    public final Float s() {
        return this.f266306g;
    }

    @Nullable
    public final JsonElement t() {
        return this.f266307h;
    }

    @NotNull
    public String toString() {
        return "GBExperiment(key=" + this.f266300a + ", variations=" + this.f266301b + ", namespace=" + this.f266302c + ", hashAttribute=" + this.f266303d + ", weights=" + this.f266304e + ", active=" + this.f266305f + ", coverage=" + this.f266306g + ", condition=" + this.f266307h + ", parentConditions=" + this.f266308i + ", force=" + this.f266309j + ", hashVersion=" + this.f266310k + ", ranges=" + this.f266311l + ", meta=" + this.f266312m + ", filters=" + this.f266313n + ", seed=" + this.f266314o + ", name=" + this.f266315p + ", phase=" + this.f266316q + ", fallBackAttribute=" + this.f266317r + ", disableStickyBucketing=" + this.f266318s + ", bucketVersion=" + this.f266319t + ", minBucketVersion=" + this.f266320u + ")";
    }

    @Nullable
    public final ArrayList<GBParentConditionInterface> u() {
        return this.f266308i;
    }

    @NotNull
    public final f v(@NotNull String key, @NotNull List<? extends q> variations, @Nullable JsonArray jsonArray, @Nullable String str, @Nullable List<Float> list, @Nullable Boolean bool, @Nullable Float f10, @Nullable JsonElement jsonElement, @Nullable ArrayList<GBParentConditionInterface> arrayList, @Nullable Integer num, @Nullable Integer num2, @Nullable List<Pair<Float, Float>> list2, @Nullable ArrayList<GBVariationMeta> arrayList2, @Nullable ArrayList<GBFilter> arrayList3, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool2, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(variations, "variations");
        return new f(key, variations, jsonArray, str, list, bool, f10, jsonElement, arrayList, num, num2, list2, arrayList2, arrayList3, str2, str3, str4, str5, bool2, num3, num4);
    }

    @NotNull
    public final SerializableGBExperiment x() {
        String str = this.f266300a;
        ArrayList<GBVariationMeta> arrayList = this.f266312m;
        String str2 = this.f266314o;
        String str3 = this.f266315p;
        Integer num = this.f266309j;
        String str4 = this.f266316q;
        Boolean bool = this.f266305f;
        List<Pair<Float, Float>> list = this.f266311l;
        ArrayList<GBFilter> arrayList2 = this.f266313n;
        List<Float> list2 = this.f266304e;
        Float f10 = this.f266306g;
        JsonElement jsonElement = this.f266307h;
        JsonArray jsonArray = this.f266302c;
        Integer num2 = this.f266310k;
        Integer num3 = this.f266319t;
        String str5 = this.f266303d;
        Integer num4 = this.f266320u;
        ArrayList<GBParentConditionInterface> arrayList3 = this.f266308i;
        String str6 = this.f266317r;
        Boolean bool2 = this.f266318s;
        List<q> list3 = this.f266301b;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList4.add(nf.a.b((q) it.next()));
        }
        return new SerializableGBExperiment(str, arrayList4, jsonArray, str5, list2, bool, f10, jsonElement, arrayList3, num, num2, list, arrayList, arrayList2, str2, str3, str4, str6, bool2, num3, num4);
    }

    @Nullable
    public final Boolean y() {
        return this.f266305f;
    }

    @Nullable
    public final Integer z() {
        return this.f266319t;
    }

    public /* synthetic */ f(String str, List list, JsonArray jsonArray, String str2, List list2, Boolean bool, Float f10, JsonElement jsonElement, ArrayList arrayList, Integer num, Integer num2, List list3, ArrayList arrayList2, ArrayList arrayList3, String str3, String str4, String str5, String str6, Boolean bool2, Integer num3, Integer num4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? null : jsonArray, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : list2, (i10 & 32) != 0 ? Boolean.TRUE : bool, (i10 & 64) != 0 ? null : f10, (i10 & 128) != 0 ? null : jsonElement, (i10 & 256) != 0 ? null : arrayList, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : num2, (i10 & 2048) != 0 ? null : list3, (i10 & 4096) != 0 ? null : arrayList2, (i10 & 8192) != 0 ? null : arrayList3, (i10 & 16384) != 0 ? null : str3, (i10 & 32768) != 0 ? null : str4, (i10 & 65536) != 0 ? null : str5, (i10 & 131072) != 0 ? null : str6, (i10 & 262144) != 0 ? null : bool2, (i10 & 524288) != 0 ? null : num3, (i10 & 1048576) != 0 ? null : num4);
    }
}
