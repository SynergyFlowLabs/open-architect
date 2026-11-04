package io.customer.sdk;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class j {
    private static final boolean B = false;

    @Nullable
    private static final String C = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private static final String f288595t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    private static final String f288596u = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f288602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f288603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private ih.a f288604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private jh.b f288605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f288606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f288607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f288608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f288609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private List<? extends com.segment.analytics.kotlin.core.platform.policies.b> f288610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f288611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f288612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f288613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f288614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private String f288615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private tg.b f288616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final List<hh.a<? extends hh.b>> f288617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f288592q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final ih.a f288593r = ih.a.f287212b.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final jh.b f288594s = jh.b.c.f307440c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f288597v = 20;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f288598w = 30;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private static final List<com.segment.analytics.kotlin.core.platform.policies.b> f288599x = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final boolean f288600y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final boolean f288601z = true;
    private static final boolean A = true;

    @NotNull
    private static final tg.b D = tg.b.a.f381048c;

    @NotNull
    private static final List<hh.a<? extends hh.b>> E = CollectionsKt.emptyList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String a() {
            return j.f288595t;
        }

        public final boolean b() {
            return j.f288600y;
        }

        public final boolean c() {
            return j.B;
        }

        public final boolean d() {
            return j.A;
        }

        @Nullable
        public final String e() {
            return j.f288596u;
        }

        public final int f() {
            return j.f288597v;
        }

        public final int g() {
            return j.f288598w;
        }

        @NotNull
        public final List<com.segment.analytics.kotlin.core.platform.policies.b> h() {
            return j.f288599x;
        }

        @NotNull
        public final ih.a i() {
            return j.f288593r;
        }

        @Nullable
        public final String j() {
            return j.C;
        }

        @NotNull
        public final List<hh.a<? extends hh.b>> k() {
            return j.E;
        }

        @NotNull
        public final jh.b l() {
            return j.f288594s;
        }

        @NotNull
        public final tg.b m() {
            return j.D;
        }

        public final boolean n() {
            return j.f288601z;
        }

        private a() {
        }
    }

    public j(@NotNull Application applicationContext, @NotNull String cdpApiKey) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cdpApiKey, "cdpApiKey");
        this.f288602a = applicationContext;
        this.f288603b = cdpApiKey;
        eh.e.a(eh.d.f274883c, applicationContext);
        this.f288604c = f288593r;
        this.f288605d = f288594s;
        this.f288606e = f288595t;
        this.f288607f = f288596u;
        this.f288608g = f288597v;
        this.f288609h = f288598w;
        this.f288610i = f288599x;
        this.f288611j = f288600y;
        this.f288612k = f288601z;
        this.f288613l = A;
        this.f288614m = B;
        this.f288615n = C;
        this.f288616o = D;
        this.f288617p = new ArrayList();
    }

    @NotNull
    public final j A(@NotNull jh.b region) {
        Intrinsics.checkNotNullParameter(region, "region");
        this.f288605d = region;
        return this;
    }

    @NotNull
    public final j B(@NotNull tg.b screenView) {
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        this.f288616o = screenView;
        return this;
    }

    @NotNull
    public final j C(boolean z10) {
        this.f288612k = z10;
        return this;
    }

    @NotNull
    public final <Config extends hh.b> j o(@NotNull hh.a<Config> module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.f288617p.add(module);
        return this;
    }

    @NotNull
    public final j p(@NotNull String apiHost) {
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        this.f288606e = apiHost;
        return this;
    }

    @NotNull
    public final j q(boolean z10) {
        this.f288611j = z10;
        return this;
    }

    @NotNull
    public final j r(boolean z10) {
        this.f288614m = z10;
        return this;
    }

    @NotNull
    public final j s(boolean z10) {
        this.f288613l = z10;
        return this;
    }

    @NotNull
    public final i t() {
        return new i(this.f288602a, this.f288603b, this.f288604c, this.f288605d, this.f288606e, this.f288607f, this.f288608g, this.f288609h, this.f288610i, this.f288611j, this.f288612k, this.f288613l, this.f288614m, this.f288615n, this.f288616o, CollectionsKt.toList(this.f288617p));
    }

    @NotNull
    public final j u(@NotNull String cdnHost) {
        Intrinsics.checkNotNullParameter(cdnHost, "cdnHost");
        this.f288607f = cdnHost;
        return this;
    }

    @NotNull
    public final j v(int i10) {
        this.f288608g = i10;
        return this;
    }

    @NotNull
    public final j w(int i10) {
        this.f288609h = i10;
        return this;
    }

    @NotNull
    public final j x(@NotNull List<? extends com.segment.analytics.kotlin.core.platform.policies.b> flushPolicies) {
        Intrinsics.checkNotNullParameter(flushPolicies, "flushPolicies");
        this.f288610i = flushPolicies;
        return this;
    }

    @NotNull
    public final j y(@NotNull ih.a level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.f288604c = level;
        return this;
    }

    @NotNull
    public final j z(@Nullable String str) {
        this.f288615n = str;
        return this;
    }
}
