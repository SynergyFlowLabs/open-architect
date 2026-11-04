package com.planner5d.library.api;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f142265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f142266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142276n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f142278p;

    public g(@NotNull String domain, @NotNull String productionDomain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(productionDomain, "productionDomain");
        this.f142263a = domain;
        this.f142264b = productionDomain;
        this.f142265c = "https://";
        this.f142266d = "?feed-view=1";
        this.f142267e = "android";
        this.f142268f = "https://static.planner5d.com/materials";
        this.f142269g = "https://" + productionDomain + "/api/v2/updates";
        this.f142270h = "https://support.planner5d.com";
        this.f142271i = "/api/";
        String str = "https://" + domain;
        this.f142272j = str;
        this.f142273k = str + "/api/";
        this.f142274l = "https://storage." + domain;
        this.f142275m = str + "/pages/withdraw?feed-view=1";
        this.f142276n = str + "/pages/terms?feed-view=1";
        this.f142277o = str + "/pages/privacy?feed-view=1";
        this.f142278p = str + "/pages/terms-contests?feed-view=1";
    }

    @NotNull
    public final String a(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return this.f142265c + this.f142264b + "/datafile/android/" + version;
    }
}
