package tg;

import io.customer.datapipelines.extensions.d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements hh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f381034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f381035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f381036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<com.segment.analytics.kotlin.core.platform.policies.b> f381037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f381038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f381039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f381040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f381041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f381042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final b f381043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final String f381044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final String f381045l;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull String cdpApiKey, @NotNull jh.b region, @Nullable String str, @Nullable String str2, int i10, int i11, @NotNull List<? extends com.segment.analytics.kotlin.core.platform.policies.b> flushPolicies, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable String str3, @NotNull b screenViewUse) {
        Intrinsics.checkNotNullParameter(cdpApiKey, "cdpApiKey");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(flushPolicies, "flushPolicies");
        Intrinsics.checkNotNullParameter(screenViewUse, "screenViewUse");
        this.f381034a = cdpApiKey;
        this.f381035b = i10;
        this.f381036c = i11;
        this.f381037d = flushPolicies;
        this.f381038e = z10;
        this.f381039f = z11;
        this.f381040g = z12;
        this.f381041h = z13;
        this.f381042i = str3;
        this.f381043j = screenViewUse;
        this.f381044k = str == null ? d.a(region) : str;
        this.f381045l = str2 == null ? d.b(region) : str2;
    }

    @NotNull
    public final String a() {
        return this.f381044k;
    }

    public final boolean b() {
        return this.f381038e;
    }

    public final boolean c() {
        return this.f381041h;
    }

    public final boolean d() {
        return this.f381040g;
    }

    @NotNull
    public final String e() {
        return this.f381045l;
    }

    @NotNull
    public final String f() {
        return this.f381034a;
    }

    public final int g() {
        return this.f381035b;
    }

    public final int h() {
        return this.f381036c;
    }

    @NotNull
    public final List<com.segment.analytics.kotlin.core.platform.policies.b> i() {
        return this.f381037d;
    }

    @Nullable
    public final String j() {
        return this.f381042i;
    }

    @NotNull
    public final b k() {
        return this.f381043j;
    }

    public final boolean l() {
        return this.f381039f;
    }

    @NotNull
    public String toString() {
        return "DataPipelinesModuleConfig(cdpApiKey='[Redacted]', flushAt=" + this.f381035b + ", flushInterval=" + this.f381036c + ", flushPolicies=" + this.f381037d + ", autoAddCustomerIODestination=" + this.f381038e + ", trackApplicationLifecycleEvents=" + this.f381039f + ", autoTrackDeviceAttributes=" + this.f381040g + ", autoTrackActivityScreens=" + this.f381041h + ", migrationSiteId=[Redacted], screenViewUse=" + this.f381043j + ", apiHost='" + this.f381044k + "', cdnHost='" + this.f381045l + "')";
    }

    public /* synthetic */ a(String str, jh.b bVar, String str2, String str3, int i10, int i11, List list, boolean z10, boolean z11, boolean z12, boolean z13, String str4, b bVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bVar, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, i10, i11, list, z10, z11, z12, z13, (i12 & 2048) != 0 ? null : str4, bVar2);
    }
}
