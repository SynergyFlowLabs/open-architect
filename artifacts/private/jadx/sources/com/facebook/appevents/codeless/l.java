package com.facebook.appevents.codeless;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import androidx.annotation.b1;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.p;
import com.facebook.g0;
import com.facebook.internal.e1;
import com.facebook.internal.t0;
import com.facebook.internal.z0;
import com.facebook.q0;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f98819e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f98820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f98821g = "success";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f98822h = "tree";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f98823i = "app_version";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f98824j = "platform";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f98825k = "request_type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private static l f98826l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f98827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakReference<Activity> f98828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Timer f98829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f98830d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(q0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            t0.f100109e.d(com.facebook.t0.APP_EVENTS, l.e(), "App index sent to FB!");
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        @Nullable
        public final GraphRequest b(@Nullable String str, @Nullable AccessToken accessToken, @Nullable String str2, @NotNull String requestType) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            if (str == null) {
                return null;
            }
            GraphRequest.c cVar = GraphRequest.f98518n;
            q1 q1Var = q1.f312784a;
            String str3 = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(locale, format, *args)");
            GraphRequest graphRequestN = cVar.N(accessToken, str3, null, null);
            Bundle bundleK = graphRequestN.K();
            if (bundleK == null) {
                bundleK = new Bundle();
            }
            bundleK.putString(l.f98822h, str);
            com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
            bundleK.putString("app_version", com.facebook.appevents.internal.g.d());
            bundleK.putString("platform", "android");
            bundleK.putString(l.f98825k, requestType);
            if (Intrinsics.areEqual(requestType, f5.a.f274950l)) {
                e eVar = e.f98782a;
                bundleK.putString(f5.a.f274948j, e.g());
            }
            graphRequestN.r0(bundleK);
            graphRequestN.l0(new GraphRequest.b() { // from class: com.facebook.appevents.codeless.k
                @Override // com.facebook.GraphRequest.b
                public final void a(q0 q0Var) {
                    l.a.c(q0Var);
                }
            });
            return graphRequestN;
        }

        @n
        public final void d(@NotNull String tree) {
            Intrinsics.checkNotNullParameter(tree, "tree");
            l lVarD = l.d();
            if (lVarD == null) {
                return;
            }
            l.g(lVarD, tree);
        }

        private a() {
        }
    }

    private static final class b implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final WeakReference<View> f98831a;

        public b(@NotNull View rootView) {
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            this.f98831a = new WeakReference<>(rootView);
        }

        @Override // java.util.concurrent.Callable
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = this.f98831a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return strEncodeToString;
        }
    }

    public static final class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) l.c(l.this).get();
                com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
                View viewE = com.facebook.appevents.internal.g.e(activity);
                if (activity != null && viewE != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    e eVar = e.f98782a;
                    if (e.h()) {
                        com.facebook.internal.q0 q0Var = com.facebook.internal.q0.f100060a;
                        if (com.facebook.internal.q0.b()) {
                            f5.f fVar = f5.f.f275002a;
                            f5.f.a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(viewE));
                        l.f(l.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception unused) {
                            l.e();
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(p.f99115z, simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            f5.g gVar2 = f5.g.f275010a;
                            jSONArray.put(f5.g.d(viewE));
                            jSONObject.put(p.A, jSONArray);
                        } catch (JSONException unused2) {
                            l.e();
                        }
                        String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "viewTree.toString()");
                        l.g(l.this, string);
                    }
                }
            } catch (Exception unused3) {
                l.e();
            }
        }
    }

    static {
        String canonicalName = l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f98820f = canonicalName;
    }

    public l(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f98828b = new WeakReference<>(activity);
        this.f98830d = null;
        this.f98827a = new Handler(Looper.getMainLooper());
        f98826l = this;
    }

    public static final /* synthetic */ WeakReference c(l lVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return null;
        }
        try {
            return lVar.f98828b;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ l d() {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return null;
        }
        try {
            return f98826l;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ String e() {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return null;
        }
        try {
            return f98820f;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Handler f(l lVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return null;
        }
        try {
            return lVar.f98827a;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void g(l lVar, String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return;
        }
        try {
            lVar.l(str);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
        }
    }

    @n
    @b1({b1.a.LIBRARY_GROUP})
    @Nullable
    public static final GraphRequest h(@Nullable String str, @Nullable AccessToken accessToken, @Nullable String str2, @NotNull String str3) {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return null;
        }
        try {
            return f98819e.b(str, accessToken, str2, str3);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(l this$0, TimerTask indexingTask) {
        if (!com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            try {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(indexingTask, "$indexingTask");
                try {
                    Timer timer = this$0.f98829c;
                    if (timer != null) {
                        timer.cancel();
                    }
                    this$0.f98830d = null;
                    Timer timer2 = new Timer();
                    timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                    this$0.f98829c = timer2;
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
            }
        }
    }

    private final void l(final String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            g0 g0Var = g0.f99617a;
            g0.y().execute(new Runnable() { // from class: com.facebook.appevents.codeless.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.m(str, this);
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(String tree, l this$0) {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(tree, "$tree");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            e1 e1Var = e1.f99794a;
            String strJ0 = e1.j0(tree);
            AccessToken accessTokenI = AccessToken.f98366l.i();
            if (strJ0 == null || !Intrinsics.areEqual(strJ0, this$0.f98830d)) {
                a aVar = f98819e;
                g0 g0Var = g0.f99617a;
                this$0.i(aVar.b(tree, accessTokenI, g0.o(), f5.a.f274950l), strJ0);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
        }
    }

    @n
    public static final void n(@NotNull String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return;
        }
        try {
            f98819e.d(str);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
        }
    }

    public final void i(@Nullable GraphRequest graphRequest, @Nullable String str) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this) && graphRequest != null) {
            try {
                q0 q0VarL = graphRequest.l();
                try {
                    JSONObject jSONObjectI = q0VarL.i();
                    if (jSONObjectI != null) {
                        if (Intrinsics.areEqual(z0.P, jSONObjectI.optString("success"))) {
                            t0.f100109e.d(com.facebook.t0.APP_EVENTS, f98820f, "Successfully send UI component tree to server");
                            this.f98830d = str;
                        }
                        if (jSONObjectI.has(f5.a.f274947i)) {
                            boolean z10 = jSONObjectI.getBoolean(f5.a.f274947i);
                            e eVar = e.f98782a;
                            e.n(z10);
                        }
                    } else {
                        Intrinsics.stringPlus("Error sending UI component tree to Facebook: ", q0VarL.g());
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    public final void j() {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                final c cVar = new c();
                try {
                    g0 g0Var = g0.f99617a;
                    g0.y().execute(new Runnable() { // from class: com.facebook.appevents.codeless.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            l.k(this.f98815a, cVar);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    public final void o() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (this.f98828b.get() == null) {
                return;
            }
            try {
                Timer timer = this.f98829c;
                if (timer != null) {
                    timer.cancel();
                }
                this.f98829c = null;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }
}
