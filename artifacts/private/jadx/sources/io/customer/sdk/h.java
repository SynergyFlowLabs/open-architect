package io.customer.sdk;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.l(message = "Use CustomerIOConfigBuilder and CustomerIO.initialize() instead", replaceWith = @b1(expression = "CustomerIOConfigBuilder(applicationContext, cdpApiKey).build().let { CustomerIO.initialize(it) }", imports = {"io.customer.sdk.CustomerIOConfigBuilder", "io.customer.sdk.CustomerIO"}))
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f288560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f288561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<hh.a<? extends hh.b>> f288562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private ih.a f288563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private jh.b f288564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f288565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f288566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f288567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f288568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private List<? extends com.segment.analytics.kotlin.core.platform.policies.b> f288569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f288570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f288571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f288572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f288573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private String f288574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private tg.b f288575p;

    public h(@NotNull Application applicationContext, @NotNull String cdpApiKey) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cdpApiKey, "cdpApiKey");
        this.f288560a = applicationContext;
        this.f288561b = cdpApiKey;
        eh.e.a(eh.d.f274883c, applicationContext);
        this.f288562c = new ArrayList();
        j.a aVar = j.f288592q;
        this.f288563d = aVar.i();
        this.f288564e = aVar.l();
        this.f288565f = aVar.a();
        this.f288566g = aVar.e();
        this.f288567h = aVar.f();
        this.f288568i = aVar.g();
        this.f288569j = aVar.h();
        this.f288570k = aVar.b();
        this.f288571l = aVar.n();
        this.f288572m = aVar.d();
        this.f288573n = aVar.c();
        this.f288574o = aVar.j();
        this.f288575p = aVar.m();
    }

    @NotNull
    public final <Config extends hh.b> h a(@NotNull hh.a<Config> module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.f288562c.add(module);
        return this;
    }

    @NotNull
    public final h b(@NotNull String apiHost) {
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        this.f288565f = apiHost;
        return this;
    }

    @NotNull
    public final h c(boolean z10) {
        this.f288570k = z10;
        return this;
    }

    @NotNull
    public final h d(boolean z10) {
        this.f288573n = z10;
        return this;
    }

    @NotNull
    public final h e(boolean z10) {
        this.f288572m = z10;
        return this;
    }

    @NotNull
    public final g f() {
        i iVar = new i(this.f288560a, this.f288561b, this.f288563d, this.f288564e, this.f288565f, this.f288566g, this.f288567h, this.f288568i, this.f288569j, this.f288570k, this.f288571l, this.f288572m, this.f288573n, this.f288574o, this.f288575p, CollectionsKt.toList(this.f288562c));
        g.a aVar = g.f288542m;
        aVar.c(iVar);
        return aVar.d();
    }

    @NotNull
    public final h g(@NotNull String cdnHost) {
        Intrinsics.checkNotNullParameter(cdnHost, "cdnHost");
        this.f288566g = cdnHost;
        return this;
    }

    @NotNull
    public final h h(int i10) {
        this.f288567h = i10;
        return this;
    }

    @NotNull
    public final h i(int i10) {
        this.f288568i = i10;
        return this;
    }

    @NotNull
    public final h j(@NotNull List<? extends com.segment.analytics.kotlin.core.platform.policies.b> flushPolicies) {
        Intrinsics.checkNotNullParameter(flushPolicies, "flushPolicies");
        this.f288569j = flushPolicies;
        return this;
    }

    @NotNull
    public final h k(@NotNull ih.a level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.f288563d = level;
        return this;
    }

    @NotNull
    public final h l(@Nullable String str) {
        this.f288574o = str;
        return this;
    }

    @NotNull
    public final h m(@NotNull jh.b region) {
        Intrinsics.checkNotNullParameter(region, "region");
        this.f288564e = region;
        return this;
    }

    @NotNull
    public final h n(@NotNull tg.b screenView) {
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        this.f288575p = screenView;
        return this;
    }

    @NotNull
    public final h o(boolean z10) {
        this.f288571l = z10;
        return this;
    }
}
