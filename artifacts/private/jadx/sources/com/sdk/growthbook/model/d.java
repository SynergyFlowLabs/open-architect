package com.sdk.growthbook.model;

import com.sdk.growthbook.utils.GBStickyAssignmentsDocument;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f266284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f266285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f266286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f266287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Map<String, ? extends q> f266288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Map<String, ? extends Number> f266289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Map<String, GBStickyAssignmentsDocument> f266290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private List<String> f266291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final rf.a f266292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f266293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Function2<f, g, Unit> f266294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Function2<String, j, Unit> f266295l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f266296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f266297n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private Map<String, ? extends q> f266298o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private Map<String, h> f266299p;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull String apiKey, @NotNull String hostURL, boolean z10, @Nullable String str, @NotNull Map<String, ? extends q> attributes, @NotNull Map<String, ? extends Number> forcedVariations, @Nullable Map<String, GBStickyAssignmentsDocument> map, @Nullable List<String> list, @Nullable rf.a aVar, boolean z11, @NotNull Function2<? super f, ? super g, Unit> trackingCallback, @Nullable Function2<? super String, ? super j, Unit> function2, boolean z12, boolean z13, @Nullable Map<String, ? extends q> map2) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(hostURL, "hostURL");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(forcedVariations, "forcedVariations");
        Intrinsics.checkNotNullParameter(trackingCallback, "trackingCallback");
        this.f266284a = apiKey;
        this.f266285b = hostURL;
        this.f266286c = z10;
        this.f266287d = str;
        this.f266288e = attributes;
        this.f266289f = forcedVariations;
        this.f266290g = map;
        this.f266291h = list;
        this.f266292i = aVar;
        this.f266293j = z11;
        this.f266294k = trackingCallback;
        this.f266295l = function2;
        this.f266296m = z12;
        this.f266297n = z13;
        this.f266298o = map2;
        this.f266299p = new HashMap();
    }

    public final boolean A() {
        return this.f266293j;
    }

    public final boolean B() {
        return this.f266296m;
    }

    @Nullable
    public final Map<String, q> C() {
        return this.f266298o;
    }

    @Nullable
    public final Map<String, GBStickyAssignmentsDocument> D() {
        return this.f266290g;
    }

    @Nullable
    public final List<String> E() {
        return this.f266291h;
    }

    @Nullable
    public final rf.a F() {
        return this.f266292i;
    }

    @NotNull
    public final Function2<f, g, Unit> G() {
        return this.f266294k;
    }

    public final void H(@NotNull Map<String, ? extends q> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f266288e = map;
    }

    public final void I(@NotNull Map<String, h> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f266299p = map;
    }

    public final void J(@NotNull Map<String, ? extends Number> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f266289f = map;
    }

    public final void K(@Nullable Map<String, ? extends q> map) {
        this.f266298o = map;
    }

    public final void L(@Nullable Map<String, GBStickyAssignmentsDocument> map) {
        this.f266290g = map;
    }

    public final void M(@Nullable List<String> list) {
        this.f266291h = list;
    }

    @NotNull
    public final String a() {
        return this.f266284a;
    }

    public final boolean b() {
        return this.f266293j;
    }

    @NotNull
    public final Function2<f, g, Unit> c() {
        return this.f266294k;
    }

    @Nullable
    public final Function2<String, j, Unit> d() {
        return this.f266295l;
    }

    public final boolean e() {
        return this.f266296m;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f266284a, dVar.f266284a) && Intrinsics.areEqual(this.f266285b, dVar.f266285b) && this.f266286c == dVar.f266286c && Intrinsics.areEqual(this.f266287d, dVar.f266287d) && Intrinsics.areEqual(this.f266288e, dVar.f266288e) && Intrinsics.areEqual(this.f266289f, dVar.f266289f) && Intrinsics.areEqual(this.f266290g, dVar.f266290g) && Intrinsics.areEqual(this.f266291h, dVar.f266291h) && Intrinsics.areEqual(this.f266292i, dVar.f266292i) && this.f266293j == dVar.f266293j && Intrinsics.areEqual(this.f266294k, dVar.f266294k) && Intrinsics.areEqual(this.f266295l, dVar.f266295l) && this.f266296m == dVar.f266296m && this.f266297n == dVar.f266297n && Intrinsics.areEqual(this.f266298o, dVar.f266298o);
    }

    public final boolean f() {
        return this.f266297n;
    }

    @Nullable
    public final Map<String, q> g() {
        return this.f266298o;
    }

    @NotNull
    public final String h() {
        return this.f266285b;
    }

    public int hashCode() {
        int iHashCode = ((((this.f266284a.hashCode() * 31) + this.f266285b.hashCode()) * 31) + Boolean.hashCode(this.f266286c)) * 31;
        String str = this.f266287d;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f266288e.hashCode()) * 31) + this.f266289f.hashCode()) * 31;
        Map<String, GBStickyAssignmentsDocument> map = this.f266290g;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.f266291h;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        rf.a aVar = this.f266292i;
        int iHashCode5 = (((((iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31) + Boolean.hashCode(this.f266293j)) * 31) + this.f266294k.hashCode()) * 31;
        Function2<String, j, Unit> function2 = this.f266295l;
        int iHashCode6 = (((((iHashCode5 + (function2 == null ? 0 : function2.hashCode())) * 31) + Boolean.hashCode(this.f266296m)) * 31) + Boolean.hashCode(this.f266297n)) * 31;
        Map<String, ? extends q> map2 = this.f266298o;
        return iHashCode6 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean i() {
        return this.f266286c;
    }

    @Nullable
    public final String j() {
        return this.f266287d;
    }

    @NotNull
    public final Map<String, q> k() {
        return this.f266288e;
    }

    @NotNull
    public final Map<String, Number> l() {
        return this.f266289f;
    }

    @Nullable
    public final Map<String, GBStickyAssignmentsDocument> m() {
        return this.f266290g;
    }

    @Nullable
    public final List<String> n() {
        return this.f266291h;
    }

    @Nullable
    public final rf.a o() {
        return this.f266292i;
    }

    @NotNull
    public final d p(@NotNull String apiKey, @NotNull String hostURL, boolean z10, @Nullable String str, @NotNull Map<String, ? extends q> attributes, @NotNull Map<String, ? extends Number> forcedVariations, @Nullable Map<String, GBStickyAssignmentsDocument> map, @Nullable List<String> list, @Nullable rf.a aVar, boolean z11, @NotNull Function2<? super f, ? super g, Unit> trackingCallback, @Nullable Function2<? super String, ? super j, Unit> function2, boolean z12, boolean z13, @Nullable Map<String, ? extends q> map2) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(hostURL, "hostURL");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(forcedVariations, "forcedVariations");
        Intrinsics.checkNotNullParameter(trackingCallback, "trackingCallback");
        return new d(apiKey, hostURL, z10, str, attributes, forcedVariations, map, list, aVar, z11, trackingCallback, function2, z12, z13, map2);
    }

    @NotNull
    public final String r() {
        return this.f266284a;
    }

    @NotNull
    public final Map<String, q> s() {
        return this.f266288e;
    }

    public final boolean t() {
        return this.f266297n;
    }

    @NotNull
    public String toString() {
        return "GBContext(apiKey=" + this.f266284a + ", hostURL=" + this.f266285b + ", enabled=" + this.f266286c + ", encryptionKey=" + this.f266287d + ", attributes=" + this.f266288e + ", forcedVariations=" + this.f266289f + ", stickyBucketAssignmentDocs=" + this.f266290g + ", stickyBucketIdentifierAttributes=" + this.f266291h + ", stickyBucketService=" + this.f266292i + ", qaMode=" + this.f266293j + ", trackingCallback=" + this.f266294k + ", onFeatureUsage=" + this.f266295l + ", remoteEval=" + this.f266296m + ", enableLogging=" + this.f266297n + ", savedGroups=" + this.f266298o + ")";
    }

    public final boolean u() {
        return this.f266286c;
    }

    @Nullable
    public final String v() {
        return this.f266287d;
    }

    @NotNull
    public final Map<String, h> w() {
        return this.f266299p;
    }

    @NotNull
    public final Map<String, Number> x() {
        return this.f266289f;
    }

    @NotNull
    public final String y() {
        return this.f266285b;
    }

    @Nullable
    public final Function2<String, j, Unit> z() {
        return this.f266295l;
    }

    public /* synthetic */ d(String str, String str2, boolean z10, String str3, Map map, Map map2, Map map3, List list, rf.a aVar, boolean z11, Function2 function2, Function2 function3, boolean z12, boolean z13, Map map4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z10, str3, map, map2, (i10 & 64) != 0 ? null : map3, (i10 & 128) != 0 ? null : list, (i10 & 256) != 0 ? null : aVar, z11, function2, (i10 & 2048) != 0 ? null : function3, (i10 & 4096) != 0 ? false : z12, (i10 & 8192) != 0 ? false : z13, (i10 & 16384) != 0 ? null : map4);
    }
}
