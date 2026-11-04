package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import androidx.annotation.l1;
import com.devtodev.core.data.metrics.MetricConsts;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    @NotNull
    public static final String A = "com.facebook.sdk.ClientToken";

    @NotNull
    public static final String B = "com.facebook.sdk.WebDialogTheme";

    @NotNull
    public static final String C = "com.facebook.sdk.AutoInitEnabled";

    @NotNull
    public static final String D = "com.facebook.sdk.AutoLogAppEventsEnabled";

    @NotNull
    public static final String E = "com.facebook.sdk.CodelessDebugLogEnabled";

    @NotNull
    public static final String F = "com.facebook.sdk.AdvertiserIDCollectionEnabled";

    @NotNull
    public static final String G = "com.facebook.sdk.CallbackOffset";

    @NotNull
    public static final String H = "com.facebook.sdk.MonitorEnabled";

    @NotNull
    public static final String I = "data_processing_options";

    @NotNull
    public static final String J = "data_processing_options_country";

    @NotNull
    public static final String K = "data_processing_options_state";

    @oj.f
    public static boolean L = false;

    @oj.f
    public static boolean M = false;

    @oj.f
    public static boolean N = false;

    @NotNull
    public static final String O = "instagram";

    @NotNull
    public static final String P = "gaming";

    @NotNull
    public static final String Q = "facebook.com";

    @NotNull
    public static final String R = "fb.gg";

    @NotNull
    public static final String S = "instagram.com";

    @NotNull
    private static final AtomicBoolean T;

    @NotNull
    private static volatile String U = null;

    @NotNull
    private static volatile String V = null;

    @NotNull
    private static a W = null;

    @NotNull
    public static final String X = "com.facebook.sdk.CloudBridgeSavedCredentials";
    private static boolean Y = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static Executor f99621e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private static volatile String f99622f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private static volatile String f99623g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private static volatile String f99624h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private static volatile Boolean f99625i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile boolean f99627k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f99628l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static com.facebook.internal.s0<File> f99629m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Context f99630n = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static String f99633q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f99634r = 100;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f99635s = "com.facebook.sdk.attributionTracking";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final String f99636t = "%s/activities";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f99637u = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f99638v = "The callback request code offset can't be negative.";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f99639w = "com.facebook.sdk.appEventPreferences";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final String f99640x = "com.facebook.sdk.DataProcessingOptions";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final String f99641y = "com.facebook.sdk.ApplicationId";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final String f99642z = "com.facebook.sdk.ApplicationName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g0 f99617a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99618b = g0.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final HashSet<t0> f99619c = SetsKt.hashSetOf(t0.DEVELOPER_ERRORS);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static AtomicLong f99626j = new AtomicLong(PlaybackStateCompat.f9653i3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f99620d = 64206;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f99631o = f99620d;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final ReentrantLock f99632p = new ReentrantLock();

    @l1
    public interface a {
        @NotNull
        GraphRequest a(@Nullable AccessToken accessToken, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable GraphRequest.b bVar);
    }

    public interface b {
        void a();
    }

    static {
        com.facebook.internal.z0 z0Var = com.facebook.internal.z0.f100267a;
        f99633q = com.facebook.internal.z0.a();
        T = new AtomicBoolean(false);
        U = S;
        V = Q;
        W = new a() { // from class: com.facebook.x
            @Override // com.facebook.g0.a
            public final GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar) {
                return g0.J(accessToken, str, jSONObject, bVar);
            }
        };
    }

    private g0() {
    }

    @oj.n
    @NotNull
    public static final String A() {
        return R;
    }

    @oj.n
    @NotNull
    public static final String B() {
        com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
        String str = f99618b;
        q1 q1Var = q1.f312784a;
        String str2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f99633q}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        com.facebook.internal.e1.g0(str, str2);
        return f99633q;
    }

    @oj.n
    @NotNull
    public static final String C() {
        AccessToken accessTokenI = AccessToken.f98366l.i();
        String strO = accessTokenI != null ? accessTokenI.o() : null;
        com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
        return com.facebook.internal.e1.B(strO);
    }

    @oj.n
    @NotNull
    public static final String D() {
        return U;
    }

    @oj.n
    public static final boolean E(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.w();
        return context.getSharedPreferences(f99639w, 0).getBoolean("limitEventUsage", false);
    }

    @oj.n
    @NotNull
    public static final Set<t0> F() {
        Set<t0> setUnmodifiableSet;
        HashSet<t0> hashSet = f99619c;
        synchronized (hashSet) {
            setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(hashSet));
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(HashSet(loggingBehaviors))");
        }
        return setUnmodifiableSet;
    }

    @oj.n
    public static final boolean G() {
        f1 f1Var = f1.f99576a;
        return f1.f();
    }

    @oj.n
    public static final long H() {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.w();
        return f99626j.get();
    }

    @oj.n
    @NotNull
    public static final String I() {
        return i0.f99656b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GraphRequest J(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar) {
        return GraphRequest.f98518n.N(accessToken, str, jSONObject, bVar);
    }

    @oj.n
    public static final boolean K() {
        return f99627k;
    }

    @oj.n
    public static final boolean L(int i10) {
        int i11 = f99631o;
        return i10 >= i11 && i10 < i11 + 100;
    }

    @oj.n
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static final synchronized boolean M() {
        return Y;
    }

    @oj.n
    public static final boolean N() {
        return T.get();
    }

    @oj.n
    public static final boolean O() {
        return f99628l;
    }

    @oj.n
    public static final boolean P(@NotNull t0 behavior) {
        boolean z10;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet<t0> hashSet = f99619c;
        synchronized (hashSet) {
            z10 = K() && hashSet.contains(behavior);
        }
        return z10;
    }

    @oj.n
    public static final void Q(@Nullable Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f99622f == null) {
                Object obj = applicationInfo.metaData.get(f99641y);
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (StringsKt.u2(lowerCase, MetricConsts.FacebookInfo, false, 2, null)) {
                        String strSubstring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                        f99622f = strSubstring;
                    } else {
                        f99622f = str;
                    }
                } else if (obj instanceof Number) {
                    throw new u("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f99623g == null) {
                f99623g = applicationInfo.metaData.getString(f99642z);
            }
            if (f99624h == null) {
                f99624h = applicationInfo.metaData.getString(A);
            }
            if (f99631o == f99620d) {
                f99631o = applicationInfo.metaData.getInt(G, f99620d);
            }
            if (f99625i == null) {
                f99625i = Boolean.valueOf(applicationInfo.metaData.getBoolean(E, false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void R(Context context, String str) {
        try {
            if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
                try {
                    com.facebook.internal.c cVarF = com.facebook.internal.c.f99760f.f(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences(f99635s, 0);
                    String strStringPlus = Intrinsics.stringPlus(str, "ping");
                    long j10 = sharedPreferences.getLong(strStringPlus, 0L);
                    try {
                        com.facebook.appevents.internal.h hVar = com.facebook.appevents.internal.h.f99013a;
                        JSONObject jSONObjectA = com.facebook.appevents.internal.h.a(com.facebook.appevents.internal.h.a.MOBILE_INSTALL_EVENT, cVarF, com.facebook.appevents.q.f99234b.f(context), E(context), context);
                        q1 q1Var = q1.f312784a;
                        String str2 = String.format(f99636t, Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                        GraphRequest graphRequestA = W.a(null, str2, jSONObjectA, null);
                        if (j10 == 0 && graphRequestA.l().g() == null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putLong(strStringPlus, System.currentTimeMillis());
                            editorEdit.apply();
                        }
                    } catch (JSONException e10) {
                        throw new u("An error occurred while publishing install.", e10);
                    }
                } catch (Exception e11) {
                    com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                    com.facebook.internal.e1.f0("Facebook-publish", e11);
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.n
    @l1(otherwise = 3)
    public static final void S(@NotNull Context context, @NotNull final String applicationId) {
        if (com.facebook.internal.instrument.crashshield.b.e(g0.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            final Context applicationContext = context.getApplicationContext();
            y().execute(new Runnable() { // from class: com.facebook.f0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.T(applicationContext, applicationId);
                }
            });
            com.facebook.internal.t tVar = com.facebook.internal.t.f100072a;
            if (com.facebook.internal.t.g(com.facebook.internal.t.b.OnDeviceEventProcessing)) {
                com.facebook.appevents.ondeviceprocessing.c cVar = com.facebook.appevents.ondeviceprocessing.c.f99162a;
                if (com.facebook.appevents.ondeviceprocessing.c.d()) {
                    com.facebook.appevents.ondeviceprocessing.c.g(applicationId, f99635s);
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(Context applicationContext, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        g0 g0Var = f99617a;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        g0Var.R(applicationContext, applicationId);
    }

    @oj.n
    public static final void U(@NotNull t0 behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet<t0> hashSet = f99619c;
        synchronized (hashSet) {
            try {
                hashSet.remove(behavior);
            } finally {
            }
        }
    }

    @oj.n
    @kotlin.l(message = "")
    public static final synchronized void V(@NotNull Context applicationContext) {
        try {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Y(applicationContext, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @oj.n
    @kotlin.l(message = "")
    public static final synchronized void W(@NotNull Context applicationContext, int i10) {
        try {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            X(applicationContext, i10, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @oj.n
    @kotlin.l(message = "")
    public static final synchronized void X(@NotNull Context applicationContext, int i10, @Nullable b bVar) {
        try {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            if (T.get() && i10 != f99631o) {
                throw new u(f99637u);
            }
            if (i10 < 0) {
                throw new u(f99638v);
            }
            f99631o = i10;
            Y(applicationContext, bVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @oj.n
    @kotlin.l(message = "")
    public static final synchronized void Y(@NotNull Context applicationContext, @Nullable final b bVar) {
        try {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            AtomicBoolean atomicBoolean = T;
            if (atomicBoolean.get()) {
                if (bVar != null) {
                    bVar.a();
                }
                return;
            }
            com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
            com.facebook.internal.f1.j(applicationContext, false);
            com.facebook.internal.f1.l(applicationContext, false);
            Context applicationContext2 = applicationContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext.applicationContext");
            f99630n = applicationContext2;
            com.facebook.appevents.q.f99234b.f(applicationContext);
            Context context = f99630n;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
            Q(context);
            String str = f99622f;
            if (str == null || str.length() == 0) {
                throw new u("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            String str2 = f99624h;
            if (str2 == null || str2.length() == 0) {
                throw new u("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
            }
            atomicBoolean.set(true);
            if (r()) {
                l();
            }
            Context context2 = f99630n;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
            if (context2 instanceof Application) {
                f1 f1Var2 = f1.f99576a;
                if (f1.d()) {
                    com.facebook.appevents.internal.f fVar = com.facebook.appevents.internal.f.f98997a;
                    Context context3 = f99630n;
                    if (context3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                        throw null;
                    }
                    com.facebook.appevents.internal.f.y((Application) context3, f99622f);
                }
            }
            com.facebook.internal.b0 b0Var = com.facebook.internal.b0.f99725a;
            com.facebook.internal.b0.g();
            com.facebook.internal.w0 w0Var = com.facebook.internal.w0.f100148a;
            com.facebook.internal.w0.F();
            com.facebook.internal.d.a aVar = com.facebook.internal.d.f99784b;
            Context context4 = f99630n;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
            aVar.a(context4);
            f99629m = new com.facebook.internal.s0<>(new Callable() { // from class: com.facebook.y
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return g0.Z();
                }
            });
            com.facebook.internal.t tVar = com.facebook.internal.t.f100072a;
            com.facebook.internal.t.a(com.facebook.internal.t.b.Instrument, new com.facebook.internal.t.a() { // from class: com.facebook.z
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    g0.a0(z10);
                }
            });
            com.facebook.internal.t.a(com.facebook.internal.t.b.AppEvents, new com.facebook.internal.t.a() { // from class: com.facebook.a0
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    g0.b0(z10);
                }
            });
            com.facebook.internal.t.a(com.facebook.internal.t.b.ChromeCustomTabsPrefetching, new com.facebook.internal.t.a() { // from class: com.facebook.b0
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    g0.c0(z10);
                }
            });
            com.facebook.internal.t.a(com.facebook.internal.t.b.IgnoreAppSwitchToLoggedOut, new com.facebook.internal.t.a() { // from class: com.facebook.c0
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    g0.d0(z10);
                }
            });
            com.facebook.internal.t.a(com.facebook.internal.t.b.BypassAppSwitch, new com.facebook.internal.t.a() { // from class: com.facebook.d0
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    g0.e0(z10);
                }
            });
            y().execute(new FutureTask(new Callable() { // from class: com.facebook.e0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return g0.f0(bVar);
                }
            }));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File Z() {
        Context context = f99630n;
        if (context != null) {
            return context.getCacheDir();
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(boolean z10) {
        if (z10) {
            o5.g gVar = o5.g.f333570a;
            o5.g.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(boolean z10) {
        if (z10) {
            com.facebook.appevents.a0 a0Var = com.facebook.appevents.a0.f98591a;
            com.facebook.appevents.a0.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(boolean z10) {
        if (z10) {
            L = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(boolean z10) {
        if (z10) {
            M = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(boolean z10) {
        if (z10) {
            N = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void f0(b bVar) {
        f.f99550f.e().k();
        w0.f102166d.a().e();
        if (AccessToken.f98366l.k()) {
            Profile.b bVar2 = Profile.f98555h;
            if (bVar2.b() == null) {
                bVar2.a();
            }
        }
        if (bVar != null) {
            bVar.a();
        }
        com.facebook.appevents.q.a aVar = com.facebook.appevents.q.f99234b;
        aVar.j(n(), f99622f);
        f1 f1Var = f1.f99576a;
        f1.l();
        Context applicationContext = n().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext().applicationContext");
        aVar.k(applicationContext).f();
        return null;
    }

    @oj.n
    public static final void g0(boolean z10) {
        f1 f1Var = f1.f99576a;
        f1.p(z10);
    }

    @oj.n
    public static final void h0(@NotNull String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.p(applicationId, "applicationId");
        f99622f = applicationId;
    }

    @oj.n
    public static final void i0(@Nullable String str) {
        f99623g = str;
    }

    @oj.n
    public static final void j(@NotNull t0 behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet<t0> hashSet = f99619c;
        synchronized (hashSet) {
            hashSet.add(behavior);
            f99617a.z0();
            Unit unit = Unit.f312394a;
        }
    }

    @oj.n
    public static final void j0(boolean z10) {
        f1 f1Var = f1.f99576a;
        f1.q(z10);
        if (z10) {
            l();
        }
    }

    @oj.n
    public static final void k() {
        HashSet<t0> hashSet = f99619c;
        synchronized (hashSet) {
            try {
                hashSet.clear();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @oj.n
    public static final void k0(boolean z10) {
        f1 f1Var = f1.f99576a;
        f1.r(z10);
        if (z10) {
            Application application = (Application) n();
            com.facebook.appevents.internal.f fVar = com.facebook.appevents.internal.f.f98997a;
            com.facebook.appevents.internal.f.y(application, o());
        }
    }

    @oj.n
    public static final void l() {
        Y = true;
    }

    @oj.n
    public static final void l0(@NotNull File cacheDir) {
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        f99629m = new com.facebook.internal.s0<>(cacheDir);
    }

    @oj.n
    public static final boolean m() {
        f1 f1Var = f1.f99576a;
        return f1.b();
    }

    @oj.n
    public static final void m0(@Nullable String str) {
        f99624h = str;
    }

    @oj.n
    @NotNull
    public static final Context n() {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.w();
        Context context = f99630n;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        throw null;
    }

    @oj.n
    public static final void n0(boolean z10) {
        f99625i = Boolean.valueOf(z10);
    }

    @oj.n
    @NotNull
    public static final String o() {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.w();
        String str = f99622f;
        if (str != null) {
            return str;
        }
        throw new u("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    @oj.n
    public static final void o0(@Nullable String[] strArr) {
        if (com.facebook.internal.instrument.crashshield.b.e(g0.class)) {
            return;
        }
        try {
            p0(strArr, 0, 0);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g0.class);
        }
    }

    @oj.n
    @Nullable
    public static final String p() {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.w();
        return f99623g;
    }

    @oj.n
    public static final void p0(@Nullable String[] strArr, int i10, int i11) {
        if (com.facebook.internal.instrument.crashshield.b.e(g0.class)) {
            return;
        }
        if (strArr == null) {
            try {
                strArr = new String[0];
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, g0.class);
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(I, new JSONArray((Collection) ArraysKt.toList(strArr)));
            jSONObject.put(J, i10);
            jSONObject.put(K, i11);
            Context context = f99630n;
            if (context != null) {
                context.getSharedPreferences(f99640x, 0).edit().putString(I, jSONObject.toString()).apply();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    @oj.n
    @Nullable
    public static final String q(@Nullable Context context) {
        PackageManager packageManager;
        if (com.facebook.internal.instrument.crashshield.b.e(g0.class)) {
            return null;
        }
        try {
            com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
            com.facebook.internal.f1.w();
            if (context == null || (packageManager = context.getPackageManager()) == null) {
                return null;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null && signatureArr.length != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335249c);
                    messageDigest.update(packageInfo.signatures[0].toByteArray());
                    return Base64.encodeToString(messageDigest.digest(), 9);
                }
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g0.class);
            return null;
        }
    }

    @oj.n
    public static final void q0(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        ReentrantLock reentrantLock = f99632p;
        reentrantLock.lock();
        try {
            f99621e = executor;
            Unit unit = Unit.f312394a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @oj.n
    public static final boolean r() {
        f1 f1Var = f1.f99576a;
        return f1.c();
    }

    @oj.n
    public static final void r0(@NotNull String facebookDomain) {
        Intrinsics.checkNotNullParameter(facebookDomain, "facebookDomain");
        V = facebookDomain;
    }

    @oj.n
    public static final boolean s() {
        f1 f1Var = f1.f99576a;
        return f1.d();
    }

    @oj.n
    public static final void s0(@NotNull String graphApiVersion) {
        Intrinsics.checkNotNullParameter(graphApiVersion, "graphApiVersion");
        com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
        if (com.facebook.internal.e1.Z(graphApiVersion) || Intrinsics.areEqual(f99633q, graphApiVersion)) {
            return;
        }
        f99633q = graphApiVersion;
    }

    @oj.n
    @Nullable
    public static final File t() {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.w();
        com.facebook.internal.s0<File> s0Var = f99629m;
        if (s0Var != null) {
            return s0Var.c();
        }
        Intrinsics.throwUninitializedPropertyAccessException("cacheDir");
        throw null;
    }

    @oj.n
    @l1
    public static final void t0(@NotNull a graphRequestCreator) {
        Intrinsics.checkNotNullParameter(graphRequestCreator, "graphRequestCreator");
        W = graphRequestCreator;
    }

    @oj.n
    public static final int u() {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.w();
        return f99631o;
    }

    @oj.n
    public static final void u0(boolean z10) {
        f99627k = z10;
    }

    @oj.n
    @NotNull
    public static final String v() {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.w();
        String str = f99624h;
        if (str != null) {
            return str;
        }
        throw new u("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    @oj.n
    public static final void v0(boolean z10) {
        f99628l = z10;
    }

    @oj.n
    public static final boolean w() {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.w();
        Boolean bool = f99625i;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @oj.n
    public static final void w0(@NotNull Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(f99639w, 0).edit().putBoolean("limitEventUsage", z10).apply();
    }

    @oj.n
    public static final boolean x() {
        f1 f1Var = f1.f99576a;
        return f1.e();
    }

    @oj.n
    public static final void x0(boolean z10) {
        f1 f1Var = f1.f99576a;
        f1.s(z10);
    }

    @oj.n
    @NotNull
    public static final Executor y() {
        ReentrantLock reentrantLock = f99632p;
        reentrantLock.lock();
        try {
            if (f99621e == null) {
                f99621e = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            Executor executor = f99621e;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @oj.n
    public static final void y0(long j10) {
        f99626j.set(j10);
    }

    @oj.n
    @NotNull
    public static final String z() {
        return V;
    }

    private final void z0() {
        HashSet<t0> hashSet = f99619c;
        if (hashSet.contains(t0.GRAPH_API_DEBUG_INFO)) {
            t0 t0Var = t0.GRAPH_API_DEBUG_WARNING;
            if (hashSet.contains(t0Var)) {
                return;
            }
            hashSet.add(t0Var);
        }
    }
}
