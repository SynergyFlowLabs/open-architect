package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f99581f = 604800000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f99582g = "advertiser_id";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f99583h = "fields";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f99589n = "com.facebook.sdk.USER_SETTINGS";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f99590o = "com.facebook.sdk.USER_SETTINGS_BITMASK";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static SharedPreferences f99591p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final String f99592q = "last_timestamp";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final String f99593r = "value";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f99594s = "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final String f99595t = "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f99596u = "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final String f99597v = "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f1 f99576a = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99577b = f1.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f99578c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f99579d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final a f99584i = new a(true, g0.C);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final a f99585j = new a(true, g0.D);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final a f99586k = new a(true, g0.F);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f99580e = "auto_event_setup_enabled";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final a f99587l = new a(false, f99580e);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final a f99588m = new a(true, g0.H);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f99598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private String f99599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Boolean f99600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f99601d;

        public a(boolean z10, @NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f99598a = z10;
            this.f99599b = key;
        }

        public final boolean a() {
            return this.f99598a;
        }

        @NotNull
        public final String b() {
            return this.f99599b;
        }

        public final long c() {
            return this.f99601d;
        }

        @Nullable
        public final Boolean d() {
            return this.f99600c;
        }

        public final boolean e() {
            Boolean bool = this.f99600c;
            return bool == null ? this.f99598a : bool.booleanValue();
        }

        public final void f(boolean z10) {
            this.f99598a = z10;
        }

        public final void g(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f99599b = str;
        }

        public final void h(long j10) {
            this.f99601d = j10;
        }

        public final void i(@Nullable Boolean bool) {
            this.f99600c = bool;
        }
    }

    private f1() {
    }

    @oj.n
    public static final boolean b() {
        if (com.facebook.internal.instrument.crashshield.b.e(f1.class)) {
            return false;
        }
        try {
            f99576a.i();
            return f99586k.e();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f1.class);
            return false;
        }
    }

    @oj.n
    public static final boolean c() {
        if (com.facebook.internal.instrument.crashshield.b.e(f1.class)) {
            return false;
        }
        try {
            f99576a.i();
            return f99584i.e();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f1.class);
            return false;
        }
    }

    @oj.n
    public static final boolean d() {
        if (com.facebook.internal.instrument.crashshield.b.e(f1.class)) {
            return false;
        }
        try {
            f99576a.i();
            return f99585j.e();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f1.class);
            return false;
        }
    }

    @oj.n
    public static final boolean e() {
        if (com.facebook.internal.instrument.crashshield.b.e(f1.class)) {
            return false;
        }
        try {
            f99576a.i();
            return f99587l.e();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f1.class);
            return false;
        }
    }

    @oj.n
    public static final boolean f() {
        if (com.facebook.internal.instrument.crashshield.b.e(f1.class)) {
            return false;
        }
        try {
            f99576a.i();
            return f99588m.e();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f1.class);
            return false;
        }
    }

    private final void g() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            a aVar = f99587l;
            o(aVar);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.d() == null || jCurrentTimeMillis - aVar.c() >= 604800000) {
                aVar.i(null);
                aVar.h(0L);
                if (f99579d.compareAndSet(false, true)) {
                    g0 g0Var = g0.f99617a;
                    g0.y().execute(new Runnable() { // from class: com.facebook.e1
                        @Override // java.lang.Runnable
                        public final void run() {
                            f1.h(jCurrentTimeMillis);
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(long j10) {
        if (com.facebook.internal.instrument.crashshield.b.e(f1.class)) {
            return;
        }
        try {
            if (f99586k.e()) {
                com.facebook.internal.b0 b0Var = com.facebook.internal.b0.f99725a;
                g0 g0Var = g0.f99617a;
                com.facebook.internal.x xVarN = com.facebook.internal.b0.n(g0.o(), false);
                if (xVarN != null && xVarN.b()) {
                    com.facebook.internal.c cVarF = com.facebook.internal.c.f99760f.f(g0.n());
                    String strH = (cVarF == null || cVarF.h() == null) ? null : cVarF.h();
                    if (strH != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString(f99582g, strH);
                        bundle.putString("fields", f99580e);
                        GraphRequest graphRequestH = GraphRequest.f98518n.H(null, "app", null);
                        graphRequestH.r0(bundle);
                        JSONObject jSONObjectI = graphRequestH.l().i();
                        if (jSONObjectI != null) {
                            a aVar = f99587l;
                            aVar.i(Boolean.valueOf(jSONObjectI.optBoolean(f99580e, false)));
                            aVar.h(j10);
                            f99576a.u(aVar);
                        }
                    }
                }
            }
            f99579d.set(false);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f1.class);
        }
    }

    private final void i() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            g0 g0Var = g0.f99617a;
            if (g0.N() && f99578c.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = g0.n().getSharedPreferences(f99589n, 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                f99591p = sharedPreferences;
                j(f99585j, f99586k, f99584i);
                g();
                n();
                m();
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void j(a... aVarArr) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                int length = aVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    a aVar = aVarArr[i10];
                    i10++;
                    if (aVar == f99587l) {
                        g();
                    } else if (aVar.d() == null) {
                        o(aVar);
                        if (aVar.d() == null) {
                            k(aVar);
                        }
                    } else {
                        u(aVar);
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    private final void k(a aVar) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                t();
                try {
                    g0 g0Var = g0.f99617a;
                    Context contextN = g0.n();
                    ApplicationInfo applicationInfo = contextN.getPackageManager().getApplicationInfo(contextN.getPackageName(), 128);
                    Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null && bundle.containsKey(aVar.b())) {
                        aVar.i(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                    com.facebook.internal.e1.f0(f99577b, e10);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    @oj.n
    public static final void l() {
        if (com.facebook.internal.instrument.crashshield.b.e(f1.class)) {
            return;
        }
        try {
            g0 g0Var = g0.f99617a;
            Context contextN = g0.n();
            ApplicationInfo applicationInfo = contextN.getPackageManager().getApplicationInfo(contextN.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            com.facebook.appevents.f0 f0Var = new com.facebook.appevents.f0(contextN);
            Bundle bundle2 = new Bundle();
            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
            if (!com.facebook.internal.e1.Q()) {
                bundle2.putString("SchemeWarning", f99597v);
            }
            f0Var.j("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f1.class);
        }
    }

    private final void m() {
        int i10;
        int i11;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (f99578c.get()) {
                g0 g0Var = g0.f99617a;
                if (g0.N()) {
                    Context contextN = g0.n();
                    int i12 = (f99584i.e() ? 1 : 0) | ((f99585j.e() ? 1 : 0) << 1) | ((f99586k.e() ? 1 : 0) << 2) | ((f99588m.e() ? 1 : 0) << 3);
                    SharedPreferences sharedPreferences = f99591p;
                    if (sharedPreferences == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        throw null;
                    }
                    int i13 = 0;
                    int i14 = sharedPreferences.getInt(f99590o, 0);
                    if (i14 != i12) {
                        SharedPreferences sharedPreferences2 = f99591p;
                        if (sharedPreferences2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                            throw null;
                        }
                        sharedPreferences2.edit().putInt(f99590o, i12).apply();
                        try {
                            ApplicationInfo applicationInfo = contextN.getPackageManager().getApplicationInfo(contextN.getPackageName(), 128);
                            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                            if (applicationInfo.metaData != null) {
                                String[] strArr = {g0.C, g0.D, g0.F, g0.H};
                                boolean[] zArr = {true, true, true, true};
                                i10 = 0;
                                i11 = 0;
                                while (true) {
                                    int i15 = i13 + 1;
                                    try {
                                        i10 |= (applicationInfo.metaData.containsKey(strArr[i13]) ? 1 : 0) << i13;
                                        i11 |= (applicationInfo.metaData.getBoolean(strArr[i13], zArr[i13]) ? 1 : 0) << i13;
                                        if (i15 > 3) {
                                            break;
                                        } else {
                                            i13 = i15;
                                        }
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        i13 = i11;
                                        i11 = i13;
                                    }
                                }
                                i13 = i10;
                            } else {
                                i11 = 0;
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i10 = 0;
                        }
                        com.facebook.appevents.f0 f0Var = new com.facebook.appevents.f0(contextN);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i13);
                        bundle.putInt("initial", i11);
                        bundle.putInt("previous", i14);
                        bundle.putInt(io.sentry.protocol.b0.b.f306151f, i12);
                        f0Var.h(bundle);
                    }
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void n() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            g0 g0Var = g0.f99617a;
            Context contextN = g0.n();
            ApplicationInfo applicationInfo = contextN.getPackageManager().getApplicationInfo(contextN.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                bundle.containsKey(g0.D);
                applicationInfo.metaData.containsKey(g0.F);
                b();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void o(a aVar) {
        String str = "";
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            t();
            try {
                SharedPreferences sharedPreferences = f99591p;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(aVar.b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.i(Boolean.valueOf(jSONObject.getBoolean("value")));
                    aVar.h(jSONObject.getLong(f99592q));
                }
            } catch (JSONException e10) {
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                com.facebook.internal.e1.f0(f99577b, e10);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.n
    public static final void p(boolean z10) {
        if (com.facebook.internal.instrument.crashshield.b.e(f1.class)) {
            return;
        }
        try {
            a aVar = f99586k;
            aVar.i(Boolean.valueOf(z10));
            aVar.h(System.currentTimeMillis());
            if (f99578c.get()) {
                f99576a.u(aVar);
            } else {
                f99576a.i();
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f1.class);
        }
    }

    @oj.n
    public static final void q(boolean z10) {
        if (com.facebook.internal.instrument.crashshield.b.e(f1.class)) {
            return;
        }
        try {
            a aVar = f99584i;
            aVar.i(Boolean.valueOf(z10));
            aVar.h(System.currentTimeMillis());
            if (f99578c.get()) {
                f99576a.u(aVar);
            } else {
                f99576a.i();
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f1.class);
        }
    }

    @oj.n
    public static final void r(boolean z10) {
        if (com.facebook.internal.instrument.crashshield.b.e(f1.class)) {
            return;
        }
        try {
            a aVar = f99585j;
            aVar.i(Boolean.valueOf(z10));
            aVar.h(System.currentTimeMillis());
            if (f99578c.get()) {
                f99576a.u(aVar);
            } else {
                f99576a.i();
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f1.class);
        }
    }

    @oj.n
    public static final void s(boolean z10) {
        if (com.facebook.internal.instrument.crashshield.b.e(f1.class)) {
            return;
        }
        try {
            a aVar = f99588m;
            aVar.i(Boolean.valueOf(z10));
            aVar.h(System.currentTimeMillis());
            if (f99578c.get()) {
                f99576a.u(aVar);
            } else {
                f99576a.i();
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f1.class);
        }
    }

    private final void t() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (f99578c.get()) {
            } else {
                throw new h0("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void u(a aVar) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                t();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("value", aVar.d());
                    jSONObject.put(f99592q, aVar.c());
                    SharedPreferences sharedPreferences = f99591p;
                    if (sharedPreferences == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        throw null;
                    }
                    sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                    m();
                } catch (Exception e10) {
                    com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                    com.facebook.internal.e1.f0(f99577b, e10);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }
}
