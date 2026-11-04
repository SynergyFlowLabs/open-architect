package io.customer.sdk;

import android.app.Application;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f288576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f288577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ih.a f288578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final jh.b f288579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f288580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f288581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f288582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f288583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<com.segment.analytics.kotlin.core.platform.policies.b> f288584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f288585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f288586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f288587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f288588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final String f288589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final tg.b f288590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final List<hh.a<? extends hh.b>> f288591p;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull Application applicationContext, @NotNull String cdpApiKey, @NotNull ih.a logLevel, @NotNull jh.b region, @Nullable String str, @Nullable String str2, int i10, int i11, @NotNull List<? extends com.segment.analytics.kotlin.core.platform.policies.b> flushPolicies, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable String str3, @NotNull tg.b screenViewUse, @NotNull List<? extends hh.a<? extends hh.b>> modules) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cdpApiKey, "cdpApiKey");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(flushPolicies, "flushPolicies");
        Intrinsics.checkNotNullParameter(screenViewUse, "screenViewUse");
        Intrinsics.checkNotNullParameter(modules, "modules");
        this.f288576a = applicationContext;
        this.f288577b = cdpApiKey;
        this.f288578c = logLevel;
        this.f288579d = region;
        this.f288580e = str;
        this.f288581f = str2;
        this.f288582g = i10;
        this.f288583h = i11;
        this.f288584i = flushPolicies;
        this.f288585j = z10;
        this.f288586k = z11;
        this.f288587l = z12;
        this.f288588m = z13;
        this.f288589n = str3;
        this.f288590o = screenViewUse;
        this.f288591p = modules;
    }

    public final int A() {
        return this.f288583h;
    }

    @NotNull
    public final List<com.segment.analytics.kotlin.core.platform.policies.b> B() {
        return this.f288584i;
    }

    @NotNull
    public final ih.a C() {
        return this.f288578c;
    }

    @Nullable
    public final String D() {
        return this.f288589n;
    }

    @NotNull
    public final List<hh.a<? extends hh.b>> E() {
        return this.f288591p;
    }

    @NotNull
    public final jh.b F() {
        return this.f288579d;
    }

    @NotNull
    public final tg.b G() {
        return this.f288590o;
    }

    public final boolean H() {
        return this.f288586k;
    }

    @NotNull
    public final Application a() {
        return this.f288576a;
    }

    public final boolean b() {
        return this.f288585j;
    }

    public final boolean c() {
        return this.f288586k;
    }

    public final boolean d() {
        return this.f288587l;
    }

    public final boolean e() {
        return this.f288588m;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Intrinsics.areEqual(this.f288576a, iVar.f288576a) && Intrinsics.areEqual(this.f288577b, iVar.f288577b) && this.f288578c == iVar.f288578c && Intrinsics.areEqual(this.f288579d, iVar.f288579d) && Intrinsics.areEqual(this.f288580e, iVar.f288580e) && Intrinsics.areEqual(this.f288581f, iVar.f288581f) && this.f288582g == iVar.f288582g && this.f288583h == iVar.f288583h && Intrinsics.areEqual(this.f288584i, iVar.f288584i) && this.f288585j == iVar.f288585j && this.f288586k == iVar.f288586k && this.f288587l == iVar.f288587l && this.f288588m == iVar.f288588m && Intrinsics.areEqual(this.f288589n, iVar.f288589n) && Intrinsics.areEqual(this.f288590o, iVar.f288590o) && Intrinsics.areEqual(this.f288591p, iVar.f288591p)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String f() {
        return this.f288589n;
    }

    @NotNull
    public final tg.b g() {
        return this.f288590o;
    }

    @NotNull
    public final List<hh.a<? extends hh.b>> h() {
        return this.f288591p;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f288576a.hashCode() * 31) + this.f288577b.hashCode()) * 31) + this.f288578c.hashCode()) * 31) + this.f288579d.hashCode()) * 31;
        String str = this.f288580e;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f288581f;
        int iHashCode4 = (((((((((((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.f288582g)) * 31) + Integer.hashCode(this.f288583h)) * 31) + this.f288584i.hashCode()) * 31) + Boolean.hashCode(this.f288585j)) * 31) + Boolean.hashCode(this.f288586k)) * 31) + Boolean.hashCode(this.f288587l)) * 31) + Boolean.hashCode(this.f288588m)) * 31;
        String str3 = this.f288589n;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return ((((iHashCode4 + iHashCode2) * 31) + this.f288590o.hashCode()) * 31) + this.f288591p.hashCode();
    }

    @NotNull
    public final String i() {
        return this.f288577b;
    }

    @NotNull
    public final ih.a j() {
        return this.f288578c;
    }

    @NotNull
    public final jh.b k() {
        return this.f288579d;
    }

    @Nullable
    public final String l() {
        return this.f288580e;
    }

    @Nullable
    public final String m() {
        return this.f288581f;
    }

    public final int n() {
        return this.f288582g;
    }

    public final int o() {
        return this.f288583h;
    }

    @NotNull
    public final List<com.segment.analytics.kotlin.core.platform.policies.b> p() {
        return this.f288584i;
    }

    @NotNull
    public final i q(@NotNull Application applicationContext, @NotNull String cdpApiKey, @NotNull ih.a logLevel, @NotNull jh.b region, @Nullable String str, @Nullable String str2, int i10, int i11, @NotNull List<? extends com.segment.analytics.kotlin.core.platform.policies.b> flushPolicies, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable String str3, @NotNull tg.b screenViewUse, @NotNull List<? extends hh.a<? extends hh.b>> modules) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cdpApiKey, "cdpApiKey");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(flushPolicies, "flushPolicies");
        Intrinsics.checkNotNullParameter(screenViewUse, "screenViewUse");
        Intrinsics.checkNotNullParameter(modules, "modules");
        return new i(applicationContext, cdpApiKey, logLevel, region, str, str2, i10, i11, flushPolicies, z10, z11, z12, z13, str3, screenViewUse, modules);
    }

    @Nullable
    public final String s() {
        return this.f288580e;
    }

    @NotNull
    public final Application t() {
        return this.f288576a;
    }

    @NotNull
    public String toString() {
        return "CustomerIOConfig(applicationContext=" + this.f288576a + ", cdpApiKey=" + this.f288577b + ", logLevel=" + this.f288578c + ", region=" + this.f288579d + ", apiHost=" + this.f288580e + ", cdnHost=" + this.f288581f + ", flushAt=" + this.f288582g + ", flushInterval=" + this.f288583h + ", flushPolicies=" + this.f288584i + ", autoAddCustomerIODestination=" + this.f288585j + ", trackApplicationLifecycleEvents=" + this.f288586k + ", autoTrackDeviceAttributes=" + this.f288587l + ", autoTrackActivityScreens=" + this.f288588m + ", migrationSiteId=" + this.f288589n + ", screenViewUse=" + this.f288590o + ", modules=" + this.f288591p + ")";
    }

    public final boolean u() {
        return this.f288585j;
    }

    public final boolean v() {
        return this.f288588m;
    }

    public final boolean w() {
        return this.f288587l;
    }

    @Nullable
    public final String x() {
        return this.f288581f;
    }

    @NotNull
    public final String y() {
        return this.f288577b;
    }

    public final int z() {
        return this.f288582g;
    }
}
