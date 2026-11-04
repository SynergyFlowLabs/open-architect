package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    @NotNull
    public static final String A = "7_challenge";

    @NotNull
    public static final String B = "try_login_activity";

    @NotNull
    public static final String C = "no_internet_permission";

    @NotNull
    public static final String D = "not_tried";

    @NotNull
    public static final String E = "new_permissions";

    @NotNull
    public static final String F = "login_behavior";

    @NotNull
    public static final String G = "request_code";

    @NotNull
    public static final String H = "permissions";

    @NotNull
    public static final String I = "default_audience";

    @NotNull
    public static final String J = "isReauthorize";

    @NotNull
    public static final String K = "facebookVersion";

    @NotNull
    public static final String L = "failure";

    @NotNull
    public static final String M = "target_app";

    @NotNull
    public static final String N = "com.facebook.katana";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f101557e = "fb_mobile_login_method_start";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f101558f = "fb_mobile_login_method_complete";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f101559g = "fb_mobile_login_method_not_tried";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f101560h = "skipped";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f101561i = "fb_mobile_login_start";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f101562j = "fb_mobile_login_complete";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f101563k = "fb_mobile_login_status_start";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f101564l = "fb_mobile_login_status_complete";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f101565m = "fb_mobile_login_heartbeat";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f101566n = "foa_mobile_login_method_start";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f101567o = "foa_mobile_login_method_complete";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f101568p = "foa_mobile_login_method_not_tried";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final String f101569q = "foa_skipped";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String f101570r = "foa_mobile_login_start";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f101571s = "foa_mobile_login_complete";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f101572t = "0_auth_logger_id";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f101573u = "1_timestamp_ms";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f101574v = "2_result";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f101575w = "3_method";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final String f101576x = "4_error_code";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final String f101577y = "5_error_message";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final String f101578z = "6_extras";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f101579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.facebook.appevents.f0 f101580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f101581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f101556d = new a(null);
    private static final ScheduledExecutorService O = Executors.newSingleThreadScheduledExecutor();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle b(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong(v.f101573u, System.currentTimeMillis());
            bundle.putString(v.f101572t, str);
            bundle.putString(v.f101575w, "");
            bundle.putString(v.f101574v, "");
            bundle.putString(v.f101577y, "");
            bundle.putString(v.f101576x, "");
            bundle.putString(v.f101578z, "");
            return bundle;
        }

        private a() {
        }
    }

    public v(@NotNull Context context, @NotNull String applicationId) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f101579a = applicationId;
        this.f101580b = new com.facebook.appevents.f0(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f101581c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static /* synthetic */ void e(v vVar, String str, String str2, String str3, String str4, String str5, Map map, String str6, int i10, Object obj) {
        if (com.facebook.internal.instrument.crashshield.b.e(v.class)) {
            return;
        }
        if ((i10 & 64) != 0) {
            str6 = f101558f;
        }
        try {
            vVar.d(str, str2, str3, str4, str5, map, str6);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, v.class);
        }
    }

    public static /* synthetic */ void h(v vVar, String str, String str2, String str3, int i10, Object obj) {
        if (com.facebook.internal.instrument.crashshield.b.e(v.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            str3 = f101559g;
        }
        try {
            vVar.g(str, str2, str3);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, v.class);
        }
    }

    public static /* synthetic */ void k(v vVar, String str, String str2, String str3, int i10, Object obj) {
        if (com.facebook.internal.instrument.crashshield.b.e(v.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            str3 = f101557e;
        }
        try {
            vVar.j(str, str2, str3);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, v.class);
        }
    }

    public static /* synthetic */ void n(v vVar, String str, Map map, LoginClient.Result.a aVar, Map map2, Exception exc, String str2, int i10, Object obj) {
        if (com.facebook.internal.instrument.crashshield.b.e(v.class)) {
            return;
        }
        if ((i10 & 32) != 0) {
            str2 = f101562j;
        }
        try {
            vVar.m(str, map, aVar, map2, exc, str2);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, v.class);
        }
    }

    private final void o(String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            final Bundle bundleB = f101556d.b(str);
            O.schedule(new Runnable() { // from class: com.facebook.login.u
                @Override // java.lang.Runnable
                public final void run() {
                    v.p(this.f101554a, bundleB);
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(v this$0, Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.b.e(v.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(bundle, "$bundle");
            this$0.f101580b.m(f101565m, bundle);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, v.class);
        }
    }

    public static /* synthetic */ void w(v vVar, LoginClient.Request request, String str, int i10, Object obj) {
        if (com.facebook.internal.instrument.crashshield.b.e(v.class)) {
            return;
        }
        if ((i10 & 2) != 0) {
            str = f101561i;
        }
        try {
            vVar.v(request, str);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, v.class);
        }
    }

    public static /* synthetic */ void z(v vVar, String str, String str2, String str3, int i10, Object obj) {
        if (com.facebook.internal.instrument.crashshield.b.e(v.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        try {
            vVar.y(str, str2, str3);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, v.class);
        }
    }

    @NotNull
    public final String b() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f101579a;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @oj.j
    public final void c(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, String> map) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            e(this, str, str2, str3, str4, str5, map, null, 64, null);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.j
    public final void d(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, String> map, @Nullable String str6) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Bundle bundleB = f101556d.b(str);
            if (str3 != null) {
                bundleB.putString(f101574v, str3);
            }
            if (str4 != null) {
                bundleB.putString(f101577y, str4);
            }
            if (str5 != null) {
                bundleB.putString(f101576x, str5);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                bundleB.putString(f101578z, new JSONObject(linkedHashMap).toString());
            }
            bundleB.putString(f101575w, str2);
            this.f101580b.m(str6, bundleB);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.j
    public final void f(@Nullable String str, @Nullable String str2) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            h(this, str, str2, null, 4, null);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.j
    public final void g(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Bundle bundleB = f101556d.b(str);
            bundleB.putString(f101575w, str2);
            this.f101580b.m(str3, bundleB);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.j
    public final void i(@Nullable String str, @Nullable String str2) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            k(this, str, str2, null, 4, null);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.j
    public final void j(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Bundle bundleB = f101556d.b(str);
            bundleB.putString(f101575w, str2);
            this.f101580b.m(str3, bundleB);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.j
    public final void l(@Nullable String str, @NotNull Map<String, String> loggingExtras, @Nullable LoginClient.Result.a aVar, @Nullable Map<String, String> map, @Nullable Exception exc) {
        v vVar;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(loggingExtras, "loggingExtras");
            vVar = this;
            try {
                n(vVar, str, loggingExtras, aVar, map, exc, null, 32, null);
            } catch (Throwable th2) {
                th = th2;
                com.facebook.internal.instrument.crashshield.b.c(th, vVar);
            }
        } catch (Throwable th3) {
            th = th3;
            vVar = this;
        }
    }

    @oj.j
    public final void m(@Nullable String str, @NotNull Map<String, String> loggingExtras, @Nullable LoginClient.Result.a aVar, @Nullable Map<String, String> map, @Nullable Exception exc, @Nullable String str2) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(loggingExtras, "loggingExtras");
            Bundle bundleB = f101556d.b(str);
            if (aVar != null) {
                bundleB.putString(f101574v, aVar.l());
            }
            if ((exc == null ? null : exc.getMessage()) != null) {
                bundleB.putString(f101577y, exc.getMessage());
            }
            JSONObject jSONObject = loggingExtras.isEmpty() ? null : new JSONObject(loggingExtras);
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (key != null) {
                            jSONObject.put(key, value);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleB.putString(f101578z, jSONObject.toString());
            }
            this.f101580b.m(str2, bundleB);
            if (aVar == LoginClient.Result.a.SUCCESS) {
                o(str);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void q(@Nullable String str, @NotNull Exception exception) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(exception, "exception");
            Bundle bundleB = f101556d.b(str);
            bundleB.putString(f101574v, LoginClient.Result.a.ERROR.l());
            bundleB.putString(f101577y, exception.toString());
            this.f101580b.m(f101564l, bundleB);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void r(@Nullable String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Bundle bundleB = f101556d.b(str);
            bundleB.putString(f101574v, L);
            this.f101580b.m(f101564l, bundleB);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void s(@Nullable String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            this.f101580b.m(f101563k, f101556d.b(str));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void t(@Nullable String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Bundle bundleB = f101556d.b(str);
            bundleB.putString(f101574v, LoginClient.Result.a.SUCCESS.l());
            this.f101580b.m(f101564l, bundleB);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.j
    public final void u(@NotNull LoginClient.Request pendingLoginRequest) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(pendingLoginRequest, "pendingLoginRequest");
            w(this, pendingLoginRequest, null, 2, null);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.j
    public final void v(@NotNull LoginClient.Request pendingLoginRequest, @Nullable String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(pendingLoginRequest, "pendingLoginRequest");
            Bundle bundleB = f101556d.b(pendingLoginRequest.b());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", pendingLoginRequest.k().toString());
                jSONObject.put(G, LoginClient.f100364m.b());
                jSONObject.put("permissions", TextUtils.join(",", pendingLoginRequest.o()));
                jSONObject.put("default_audience", pendingLoginRequest.h().toString());
                jSONObject.put(J, pendingLoginRequest.t());
                String str2 = this.f101581c;
                if (str2 != null) {
                    jSONObject.put(K, str2);
                }
                if (pendingLoginRequest.l() != null) {
                    jSONObject.put(M, pendingLoginRequest.l().toString());
                }
                bundleB.putString(f101578z, jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.f101580b.m(str, bundleB);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.j
    public final void x(@Nullable String str, @Nullable String str2) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            z(this, str, str2, null, 4, null);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.j
    public final void y(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Bundle bundleB = f101556d.b("");
            bundleB.putString(f101574v, LoginClient.Result.a.ERROR.l());
            bundleB.putString(f101577y, str2);
            bundleB.putString(f101575w, str3);
            this.f101580b.m(str, bundleB);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }
}
