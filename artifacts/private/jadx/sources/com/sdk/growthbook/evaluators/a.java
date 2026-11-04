package com.sdk.growthbook.evaluators;

import com.sdk.growthbook.model.q;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f266202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private Map<String, com.sdk.growthbook.model.h> f266203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final o f266204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f266205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Map<String, q> f266206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Map<String, ? extends Object> f266207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function2<com.sdk.growthbook.model.f, com.sdk.growthbook.model.g, Unit> f266208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final m f266209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final rf.a f266210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final Function2<String, com.sdk.growthbook.model.j, Unit> f266211j;

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z10, @NotNull Map<String, com.sdk.growthbook.model.h> features, @NotNull o userContext, boolean z11, @Nullable Map<String, ? extends q> map, @NotNull Map<String, ? extends Object> forcedVariations, @NotNull Function2<? super com.sdk.growthbook.model.f, ? super com.sdk.growthbook.model.g, Unit> trackingCallback, @NotNull m gbExperimentHelper, @Nullable rf.a aVar, @Nullable Function2<? super String, ? super com.sdk.growthbook.model.j, Unit> function2) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(userContext, "userContext");
        Intrinsics.checkNotNullParameter(forcedVariations, "forcedVariations");
        Intrinsics.checkNotNullParameter(trackingCallback, "trackingCallback");
        Intrinsics.checkNotNullParameter(gbExperimentHelper, "gbExperimentHelper");
        this.f266202a = z10;
        this.f266203b = features;
        this.f266204c = userContext;
        this.f266205d = z11;
        this.f266206e = map;
        this.f266207f = forcedVariations;
        this.f266208g = trackingCallback;
        this.f266209h = gbExperimentHelper;
        this.f266210i = aVar;
        this.f266211j = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a l(a aVar, boolean z10, Map map, o oVar, boolean z11, Map map2, Map map3, Function2 function2, m mVar, rf.a aVar2, Function2 function3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f266202a;
        }
        if ((i10 & 2) != 0) {
            map = aVar.f266203b;
        }
        if ((i10 & 4) != 0) {
            oVar = aVar.f266204c;
        }
        if ((i10 & 8) != 0) {
            z11 = aVar.f266205d;
        }
        if ((i10 & 16) != 0) {
            map2 = aVar.f266206e;
        }
        if ((i10 & 32) != 0) {
            map3 = aVar.f266207f;
        }
        if ((i10 & 64) != 0) {
            function2 = aVar.f266208g;
        }
        if ((i10 & 128) != 0) {
            mVar = aVar.f266209h;
        }
        if ((i10 & 256) != 0) {
            aVar2 = aVar.f266210i;
        }
        if ((i10 & 512) != 0) {
            function3 = aVar.f266211j;
        }
        rf.a aVar3 = aVar2;
        Function2 function4 = function3;
        Function2 function5 = function2;
        m mVar2 = mVar;
        Map map4 = map2;
        Map map5 = map3;
        return aVar.k(z10, map, oVar, z11, map4, map5, function5, mVar2, aVar3, function4);
    }

    public final boolean a() {
        return this.f266202a;
    }

    @Nullable
    public final Function2<String, com.sdk.growthbook.model.j, Unit> b() {
        return this.f266211j;
    }

    @NotNull
    public final Map<String, com.sdk.growthbook.model.h> c() {
        return this.f266203b;
    }

    @NotNull
    public final o d() {
        return this.f266204c;
    }

    public final boolean e() {
        return this.f266205d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f266202a == aVar.f266202a && Intrinsics.areEqual(this.f266203b, aVar.f266203b) && Intrinsics.areEqual(this.f266204c, aVar.f266204c) && this.f266205d == aVar.f266205d && Intrinsics.areEqual(this.f266206e, aVar.f266206e) && Intrinsics.areEqual(this.f266207f, aVar.f266207f) && Intrinsics.areEqual(this.f266208g, aVar.f266208g) && Intrinsics.areEqual(this.f266209h, aVar.f266209h) && Intrinsics.areEqual(this.f266210i, aVar.f266210i) && Intrinsics.areEqual(this.f266211j, aVar.f266211j)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Map<String, q> f() {
        return this.f266206e;
    }

    @NotNull
    public final Map<String, Object> g() {
        return this.f266207f;
    }

    @NotNull
    public final Function2<com.sdk.growthbook.model.f, com.sdk.growthbook.model.g, Unit> h() {
        return this.f266208g;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f266202a) * 31) + this.f266203b.hashCode()) * 31) + this.f266204c.hashCode()) * 31) + Boolean.hashCode(this.f266205d)) * 31;
        Map<String, q> map = this.f266206e;
        int iHashCode2 = (((((((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.f266207f.hashCode()) * 31) + this.f266208g.hashCode()) * 31) + this.f266209h.hashCode()) * 31;
        rf.a aVar = this.f266210i;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Function2<String, com.sdk.growthbook.model.j, Unit> function2 = this.f266211j;
        return iHashCode3 + (function2 != null ? function2.hashCode() : 0);
    }

    @NotNull
    public final m i() {
        return this.f266209h;
    }

    @Nullable
    public final rf.a j() {
        return this.f266210i;
    }

    @NotNull
    public final a k(boolean z10, @NotNull Map<String, com.sdk.growthbook.model.h> features, @NotNull o userContext, boolean z11, @Nullable Map<String, ? extends q> map, @NotNull Map<String, ? extends Object> forcedVariations, @NotNull Function2<? super com.sdk.growthbook.model.f, ? super com.sdk.growthbook.model.g, Unit> trackingCallback, @NotNull m gbExperimentHelper, @Nullable rf.a aVar, @Nullable Function2<? super String, ? super com.sdk.growthbook.model.j, Unit> function2) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(userContext, "userContext");
        Intrinsics.checkNotNullParameter(forcedVariations, "forcedVariations");
        Intrinsics.checkNotNullParameter(trackingCallback, "trackingCallback");
        Intrinsics.checkNotNullParameter(gbExperimentHelper, "gbExperimentHelper");
        return new a(z10, features, userContext, z11, map, forcedVariations, trackingCallback, gbExperimentHelper, aVar, function2);
    }

    public final boolean m() {
        return this.f266202a;
    }

    @NotNull
    public final Map<String, com.sdk.growthbook.model.h> n() {
        return this.f266203b;
    }

    @NotNull
    public final Map<String, Object> o() {
        return this.f266207f;
    }

    @NotNull
    public final m p() {
        return this.f266209h;
    }

    public final boolean q() {
        return this.f266205d;
    }

    @Nullable
    public final Function2<String, com.sdk.growthbook.model.j, Unit> r() {
        return this.f266211j;
    }

    @Nullable
    public final Map<String, q> s() {
        return this.f266206e;
    }

    @Nullable
    public final rf.a t() {
        return this.f266210i;
    }

    @NotNull
    public String toString() {
        return "EvaluationContext(enabled=" + this.f266202a + ", features=" + this.f266203b + ", userContext=" + this.f266204c + ", loggingEnabled=" + this.f266205d + ", savedGroups=" + this.f266206e + ", forcedVariations=" + this.f266207f + ", trackingCallback=" + this.f266208g + ", gbExperimentHelper=" + this.f266209h + ", stickyBucketService=" + this.f266210i + ", onFeatureUsage=" + this.f266211j + ")";
    }

    @NotNull
    public final Function2<com.sdk.growthbook.model.f, com.sdk.growthbook.model.g, Unit> u() {
        return this.f266208g;
    }

    @NotNull
    public final o v() {
        return this.f266204c;
    }

    public final void w(@NotNull Map<String, com.sdk.growthbook.model.h> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f266203b = map;
    }

    public final void x(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f266207f = map;
    }
}
