package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import com.facebook.AccessToken;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import com.facebook.internal.p0;
import com.facebook.internal.t0;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f99255c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f99256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f99257e = 86400;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f99258f = "fb_push_payload";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f99259g = "campaign";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f99260h = "fb_mobile_push_opened";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f99261i = "fb_push_campaign";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f99262j = "fb_push_action";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f99263k = "fb_ak";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private static ScheduledThreadPoolExecutor f99264l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static q.b f99265m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final Object f99266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private static String f99267o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f99268p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private static String f99269q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final String f99270r = "com.facebook.sdk.appEventPreferences";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f99271s = "app_events_killswitch";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f99272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private com.facebook.appevents.a f99273b;

    public static final class a {

        /* JADX INFO: renamed from: com.facebook.appevents.t$a$a, reason: collision with other inner class name */
        public static final class C0904a implements p0.a {
            C0904a() {
            }

            @Override // com.facebook.internal.p0.a
            public void a(@Nullable String str) {
                t.f99255c.w(str);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(Context context, t logger) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(logger, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                String str = strArr[i10];
                String str2 = strArr2[i10];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i11 |= 1 << i10;
                } catch (ClassNotFoundException unused) {
                }
                if (i12 > 10) {
                    break;
                } else {
                    i10 = i12;
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i11) {
                sharedPreferences.edit().putInt("kitsBitmask", i11).apply();
                logger.F(com.facebook.internal.a.f99710z0, null, bundle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void q() {
            synchronized (t.e()) {
                try {
                    if (t.b() != null) {
                        return;
                    }
                    a aVar = t.f99255c;
                    t.j(new ScheduledThreadPoolExecutor(1));
                    Unit unit = Unit.f312394a;
                    Runnable runnable = new Runnable() { // from class: com.facebook.appevents.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            t.a.r();
                        }
                    };
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = t.b();
                    if (scheduledThreadPoolExecutorB == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    scheduledThreadPoolExecutorB.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r() {
            HashSet<String> hashSet = new HashSet();
            n nVar = n.f99146a;
            Iterator<com.facebook.appevents.a> it = n.p().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().b());
            }
            for (String str : hashSet) {
                com.facebook.internal.b0 b0Var = com.facebook.internal.b0.f99725a;
                com.facebook.internal.b0.n(str, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void s(e eVar, com.facebook.appevents.a aVar) {
            n nVar = n.f99146a;
            n.g(aVar, eVar);
            com.facebook.internal.t tVar = com.facebook.internal.t.f100072a;
            if (com.facebook.internal.t.g(com.facebook.internal.t.b.OnDevicePostInstallEventProcessing)) {
                com.facebook.appevents.ondeviceprocessing.c cVar = com.facebook.appevents.ondeviceprocessing.c.f99162a;
                if (com.facebook.appevents.ondeviceprocessing.c.d()) {
                    com.facebook.appevents.ondeviceprocessing.c.e(aVar.b(), eVar);
                }
            }
            if (!eVar.c() && !t.g()) {
                if (Intrinsics.areEqual(eVar.getName(), p.f99184b)) {
                    t.h(true);
                    return;
                }
                t0.f100109e.d(com.facebook.t0.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void t(String str) {
            t0.f100109e.d(com.facebook.t0.DEVELOPER_ERRORS, "AppEvents", str);
        }

        @oj.n
        public final void f(@NotNull Application application, @Nullable String str) {
            Intrinsics.checkNotNullParameter(application, "application");
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            if (!com.facebook.g0.N()) {
                throw new com.facebook.u("The Facebook sdk must be initialized before calling activateApp");
            }
            d dVar = d.f98836a;
            d.e();
            l0 l0Var = l0.f99122a;
            l0.j();
            if (str == null) {
                str = com.facebook.g0.o();
            }
            com.facebook.g0.S(application, str);
            com.facebook.appevents.internal.f fVar = com.facebook.appevents.internal.f.f98997a;
            com.facebook.appevents.internal.f.y(application, str);
        }

        @oj.n
        public final void g(@NotNull WebView webView, @Nullable Context context) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            String RELEASE = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
            Object[] array = StringsKt.split$default(RELEASE, new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int i10 = !(strArr.length == 0) ? Integer.parseInt(strArr[0]) : 0;
            int i11 = strArr.length > 1 ? Integer.parseInt(strArr[1]) : 0;
            if (i10 >= 4 && (i10 != 4 || i11 > 1)) {
                b0 b0Var = new b0(context);
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                webView.addJavascriptInterface(b0Var, Intrinsics.stringPlus("fbmq_", com.facebook.g0.o()));
                return;
            }
            t0.f100109e.d(com.facebook.t0.DEVELOPER_ERRORS, t.f(), "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2");
        }

        public final void h() {
            if (l() != q.b.EXPLICIT_ONLY) {
                n nVar = n.f99146a;
                n.l(c0.EAGER_FLUSHING_EVENT);
            }
        }

        @oj.n
        public final void i(@NotNull String extraMsg) {
            Intrinsics.checkNotNullParameter(extraMsg, "extraMsg");
            t.f();
            Intrinsics.stringPlus("This function is deprecated. ", extraMsg);
        }

        @oj.n
        @NotNull
        public final Executor j() {
            if (t.b() == null) {
                q();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = t.b();
            if (scheduledThreadPoolExecutorB != null) {
                return scheduledThreadPoolExecutorB;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @oj.n
        @NotNull
        public final String k(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (t.a() == null) {
                synchronized (t.e()) {
                    try {
                        if (t.a() == null) {
                            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                            a aVar = t.f99255c;
                            t.i(sharedPreferences.getString("anonymousAppDeviceGUID", null));
                            if (t.a() == null) {
                                UUID uuidRandomUUID = UUID.randomUUID();
                                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
                                t.i(Intrinsics.stringPlus("XZ", uuidRandomUUID));
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", t.a()).apply();
                            }
                        }
                        Unit unit = Unit.f312394a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            String strA = t.a();
            if (strA != null) {
                return strA;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @oj.n
        @NotNull
        public final q.b l() {
            q.b bVarC;
            synchronized (t.e()) {
                bVarC = t.c();
            }
            return bVarC;
        }

        @oj.n
        @Nullable
        public final String m() {
            p0 p0Var = p0.f100047a;
            p0.d(new C0904a());
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            return com.facebook.g0.n().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        @oj.n
        @Nullable
        public final String n() {
            String strD;
            synchronized (t.e()) {
                try {
                    strD = t.d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return strD;
        }

        @oj.n
        public final void o(@NotNull final Context context, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            if (com.facebook.g0.s()) {
                final t tVar = new t(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = t.b();
                if (scheduledThreadPoolExecutorB == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                scheduledThreadPoolExecutorB.execute(new Runnable() { // from class: com.facebook.appevents.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.p(context, tVar);
                    }
                });
            }
        }

        @oj.n
        public final void u() {
            n nVar = n.f99146a;
            n.s();
        }

        @oj.n
        public final void v(@NotNull q.b flushBehavior) {
            Intrinsics.checkNotNullParameter(flushBehavior, "flushBehavior");
            synchronized (t.e()) {
                try {
                    a aVar = t.f99255c;
                    t.k(flushBehavior);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @oj.n
        public final void w(@Nullable String str) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            SharedPreferences sharedPreferences = com.facebook.g0.n().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }

        @oj.n
        public final void x(@Nullable String str) {
            synchronized (t.e()) {
                try {
                    e1 e1Var = e1.f99794a;
                    if (!e1.I0(t.d(), str)) {
                        a aVar = t.f99255c;
                        t.l(str);
                        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                        t tVar = new t(com.facebook.g0.n(), (String) null, (AccessToken) null);
                        tVar.y(p.f99202k);
                        if (aVar.l() != q.b.EXPLICIT_ONLY) {
                            tVar.o();
                        }
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private a() {
        }
    }

    static {
        String canonicalName = t.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f99256d = canonicalName;
        f99265m = q.b.AUTO;
        f99266n = new Object();
    }

    public t(@NotNull String activityName, @Nullable String str, @Nullable AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        f1 f1Var = f1.f99837a;
        f1.w();
        this.f99272a = activityName;
        accessToken = accessToken == null ? AccessToken.f98366l.i() : accessToken;
        if (accessToken == null || accessToken.y() || !(str == null || Intrinsics.areEqual(str, accessToken.i()))) {
            if (str == null) {
                e1 e1Var = e1.f99794a;
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                str = e1.F(com.facebook.g0.n());
            }
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.f99273b = new com.facebook.appevents.a(null, str);
        } else {
            this.f99273b = new com.facebook.appevents.a(accessToken);
        }
        f99255c.q();
    }

    public static /* synthetic */ void D(t tVar, String str, Bundle bundle, int i10, Object obj) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        if ((i10 & 2) != 0) {
            bundle = null;
            int i11 = 4 ^ 0;
        }
        try {
            tVar.B(str, bundle);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    public static /* synthetic */ void L(t tVar, BigDecimal bigDecimal, Currency currency, Bundle bundle, int i10, Object obj) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            bundle = null;
        }
        try {
            tVar.J(bigDecimal, currency, bundle);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    @oj.n
    public static final void P() {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99255c.u();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    @oj.n
    public static final void Q(@NotNull q.b bVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99255c.v(bVar);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    @oj.n
    public static final void R(@Nullable String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99255c.w(str);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    @oj.n
    public static final void S(@Nullable String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99255c.x(str);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    public static final /* synthetic */ String a() {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return null;
        }
        try {
            return f99267o;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return null;
        }
        try {
            return f99264l;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
            return null;
        }
    }

    public static final /* synthetic */ q.b c() {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return null;
        }
        try {
            return f99265m;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return null;
        }
        try {
            return f99269q;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return null;
        }
        try {
            return f99266n;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
            return null;
        }
    }

    public static final /* synthetic */ String f() {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return null;
        }
        try {
            return f99256d;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean g() {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return false;
        }
        try {
            return f99268p;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
            return false;
        }
    }

    public static final /* synthetic */ void h(boolean z10) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99268p = z10;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    public static final /* synthetic */ void i(String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99267o = str;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    public static final /* synthetic */ void j(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99264l = scheduledThreadPoolExecutor;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    public static final /* synthetic */ void k(q.b bVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99265m = bVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    public static final /* synthetic */ void l(String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99269q = str;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    @oj.n
    public static final void m(@NotNull Application application, @Nullable String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99255c.f(application, str);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    @oj.n
    public static final void n(@NotNull WebView webView, @Nullable Context context) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99255c.g(webView, context);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    @oj.n
    public static final void p(@NotNull String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99255c.i(str);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    @oj.n
    @NotNull
    public static final Executor q() {
        int i10 = 2 | 0;
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return null;
        }
        try {
            return f99255c.j();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
            return null;
        }
    }

    @oj.n
    @NotNull
    public static final String r(@NotNull Context context) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return null;
        }
        try {
            return f99255c.k(context);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
            return null;
        }
    }

    @oj.n
    @NotNull
    public static final q.b t() {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return null;
        }
        try {
            return f99255c.l();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final String u() {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return null;
        }
        try {
            return f99255c.m();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final String v() {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return null;
        }
        try {
            return f99255c.n();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
            return null;
        }
    }

    @oj.n
    public static final void w(@NotNull Context context, @Nullable String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(t.class)) {
            return;
        }
        try {
            f99255c.o(context, str);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, t.class);
        }
    }

    public final void A(@Nullable String str, double d10, @Nullable Bundle bundle) {
        t tVar;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Double dValueOf = Double.valueOf(d10);
            com.facebook.appevents.internal.f fVar = com.facebook.appevents.internal.f.f98997a;
            tVar = this;
            try {
                tVar.C(str, dValueOf, bundle, false, com.facebook.appevents.internal.f.m());
            } catch (Throwable th2) {
                th = th2;
                com.facebook.internal.instrument.crashshield.b.c(th, tVar);
            }
        } catch (Throwable th3) {
            th = th3;
            tVar = this;
        }
    }

    public final void B(@Nullable String str, @Nullable Bundle bundle) {
        t tVar;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            com.facebook.appevents.internal.f fVar = com.facebook.appevents.internal.f.f98997a;
            tVar = this;
            try {
                tVar.C(str, null, bundle, false, com.facebook.appevents.internal.f.m());
            } catch (Throwable th2) {
                th = th2;
                com.facebook.internal.instrument.crashshield.b.c(th, tVar);
            }
        } catch (Throwable th3) {
            th = th3;
            tVar = this;
        }
    }

    public final void C(@Nullable String str, @Nullable Double d10, @Nullable Bundle bundle, boolean z10, @Nullable UUID uuid) {
        if (com.facebook.internal.instrument.crashshield.b.e(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            com.facebook.internal.w wVar = com.facebook.internal.w.f100131a;
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            if (com.facebook.internal.w.d(f99271s, com.facebook.g0.o(), false)) {
                t0.f100109e.e(com.facebook.t0.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                try {
                    String str2 = this.f99272a;
                    com.facebook.appevents.internal.f fVar = com.facebook.appevents.internal.f.f98997a;
                    f99255c.s(new e(str2, str, d10, bundle, z10, com.facebook.appevents.internal.f.o(), uuid), this.f99273b);
                } catch (JSONException e10) {
                    t0.f100109e.e(com.facebook.t0.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e10.toString());
                }
            } catch (com.facebook.u e11) {
                t0.f100109e.e(com.facebook.t0.APP_EVENTS, "AppEvents", "Invalid app event: %s", e11.toString());
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void E(@Nullable String str, @Nullable String str2) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            B(str, bundle);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void F(@Nullable String str, @Nullable Double d10, @Nullable Bundle bundle) {
        t tVar;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            com.facebook.appevents.internal.f fVar = com.facebook.appevents.internal.f.f98997a;
            tVar = this;
            try {
                tVar.C(str, d10, bundle, true, com.facebook.appevents.internal.f.m());
            } catch (Throwable th2) {
                th = th2;
                com.facebook.internal.instrument.crashshield.b.c(th, tVar);
            }
        } catch (Throwable th3) {
            th = th3;
            tVar = this;
        }
    }

    public final void G(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        Throwable th2;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                e1 e1Var = e1.f99794a;
                e1.g0(f99256d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th3) {
                    th2 = th3;
                    com.facebook.internal.instrument.crashshield.b.c(th2, this);
                }
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString(p.N, currency.getCurrencyCode());
                Double dValueOf = Double.valueOf(bigDecimal.doubleValue());
                com.facebook.appevents.internal.f fVar = com.facebook.appevents.internal.f.f98997a;
                C(str, dValueOf, bundle2, true, com.facebook.appevents.internal.f.m());
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void H(@Nullable String str, @Nullable q.c cVar, @Nullable q.d dVar, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (str == null) {
                f99255c.t("itemID cannot be null");
                return;
            }
            if (cVar == null) {
                f99255c.t("availability cannot be null");
                return;
            }
            if (dVar == null) {
                f99255c.t("condition cannot be null");
                return;
            }
            if (str2 == null) {
                f99255c.t("description cannot be null");
                return;
            }
            if (str3 == null) {
                f99255c.t("imageLink cannot be null");
                return;
            }
            if (str4 == null) {
                f99255c.t("link cannot be null");
                return;
            }
            if (str5 == null) {
                f99255c.t("title cannot be null");
                return;
            }
            if (bigDecimal == null) {
                f99255c.t("priceAmount cannot be null");
                return;
            }
            if (currency == null) {
                f99255c.t("currency cannot be null");
                return;
            }
            if (str6 == null && str7 == null && str8 == null) {
                f99255c.t("Either gtin, mpn or brand is required");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString(com.facebook.appevents.internal.j.f99043s, str);
            bundle.putString(com.facebook.appevents.internal.j.f99044t, cVar.name());
            bundle.putString(com.facebook.appevents.internal.j.f99045u, dVar.name());
            bundle.putString(com.facebook.appevents.internal.j.f99046v, str2);
            bundle.putString(com.facebook.appevents.internal.j.f99047w, str3);
            bundle.putString(com.facebook.appevents.internal.j.f99048x, str4);
            bundle.putString(com.facebook.appevents.internal.j.f99049y, str5);
            bundle.putString(com.facebook.appevents.internal.j.C, bigDecimal.setScale(3, 4).toString());
            bundle.putString(com.facebook.appevents.internal.j.D, currency.getCurrencyCode());
            if (str6 != null) {
                bundle.putString(com.facebook.appevents.internal.j.f99050z, str6);
            }
            if (str7 != null) {
                bundle.putString(com.facebook.appevents.internal.j.A, str7);
            }
            if (str8 != null) {
                bundle.putString(com.facebook.appevents.internal.j.B, str8);
            }
            B(p.J, bundle);
            f99255c.h();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void I(@Nullable BigDecimal bigDecimal, @Nullable Currency currency) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            J(bigDecimal, currency, null);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void J(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            com.facebook.appevents.internal.i iVar = com.facebook.appevents.internal.i.f99018a;
            com.facebook.appevents.internal.i.c();
            K(bigDecimal, currency, bundle, false);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void K(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle, boolean z10) {
        Throwable th2;
        t tVar;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                f99255c.t("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                f99255c.t("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString(p.N, currency.getCurrencyCode());
                Double dValueOf = Double.valueOf(bigDecimal.doubleValue());
                com.facebook.appevents.internal.f fVar = com.facebook.appevents.internal.f.f98997a;
                tVar = this;
                try {
                    tVar.C(p.f99212p, dValueOf, bundle2, z10, com.facebook.appevents.internal.f.m());
                    f99255c.h();
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    com.facebook.internal.instrument.crashshield.b.c(th2, tVar);
                }
            } catch (Throwable th4) {
                th = th4;
                tVar = this;
            }
        } catch (Throwable th5) {
            th2 = th5;
            tVar = this;
        }
    }

    public final void M(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            K(bigDecimal, currency, bundle, true);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void N(@NotNull Bundle payload, @Nullable String str) {
        String string;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            try {
                String string2 = payload.getString(f99258f);
                e1 e1Var = e1.f99794a;
                if (e1.Z(string2)) {
                    return;
                } else {
                    string = new JSONObject(string2).getString("campaign");
                }
            } catch (JSONException unused) {
                string = null;
            }
            if (string == null) {
                t0.f100109e.d(com.facebook.t0.DEVELOPER_ERRORS, f99256d, "Malformed payload specified for logging a push notification open.");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(f99261i, string);
            if (str != null) {
                bundle.putString(f99262j, str);
            }
            B(f99260h, bundle);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void O(@NotNull String eventName, @Nullable Double d10, @Nullable Bundle bundle) {
        t tVar;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (!StringsKt.u2(eventName, f99263k, false, 2, null)) {
                return;
            }
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            if (!com.facebook.g0.s()) {
                return;
            }
            com.facebook.appevents.internal.f fVar = com.facebook.appevents.internal.f.f98997a;
            tVar = this;
            try {
                tVar.C(eventName, d10, bundle, true, com.facebook.appevents.internal.f.m());
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            tVar = this;
        }
        com.facebook.internal.instrument.crashshield.b.c(th, tVar);
    }

    public final void o() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            n nVar = n.f99146a;
            n.l(c0.EXPLICIT);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @NotNull
    public final String s() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f99273b.b();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    public final boolean x(@NotNull AccessToken accessToken) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            return Intrinsics.areEqual(this.f99273b, new com.facebook.appevents.a(accessToken));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    public final void y(@Nullable String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            B(str, null);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void z(@Nullable String str, double d10) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            A(str, d10, null);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(@Nullable Context context, @Nullable String str, @Nullable AccessToken accessToken) {
        this(e1.t(context), str, accessToken);
        e1 e1Var = e1.f99794a;
    }
}
