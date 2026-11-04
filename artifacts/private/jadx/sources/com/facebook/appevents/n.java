package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.l1;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.q0;
import com.facebook.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f99149d = 15;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f99150e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private static ScheduledFuture<?> f99153h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f99146a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99147b = n.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f99148c = 100;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static volatile f f99151f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ScheduledExecutorService f99152g = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Runnable f99154i = new Runnable() { // from class: com.facebook.appevents.j
        @Override // java.lang.Runnable
        public final void run() {
            n.o();
        }
    };

    private n() {
    }

    @oj.n
    public static final void g(@NotNull final a accessTokenAppId, @NotNull final e appEvent) {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvent, "appEvent");
            f99152g.execute(new Runnable() { // from class: com.facebook.appevents.k
                @Override // java.lang.Runnable
                public final void run() {
                    n.h(accessTokenAppId, appEvent);
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a accessTokenAppId, e appEvent) {
        if (!com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
                Intrinsics.checkNotNullParameter(appEvent, "$appEvent");
                f99151f.a(accessTokenAppId, appEvent);
                if (q.f99234b.g() != q.b.EXPLICIT_ONLY && f99151f.d() > f99148c) {
                    n(c0.EVENT_THRESHOLD);
                } else if (f99153h == null) {
                    f99153h = f99152g.schedule(f99154i, 15L, TimeUnit.SECONDS);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
            }
        }
    }

    @oj.n
    @Nullable
    public static final GraphRequest i(@NotNull final a accessTokenAppId, @NotNull final h0 appEvents, boolean z10, @NotNull final e0 flushState) {
        int i10 = 7 & 0;
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            String strB = accessTokenAppId.b();
            com.facebook.internal.b0 b0Var = com.facebook.internal.b0.f99725a;
            com.facebook.internal.x xVarN = com.facebook.internal.b0.n(strB, false);
            GraphRequest.c cVar = GraphRequest.f98518n;
            q1 q1Var = q1.f312784a;
            String str = String.format("%s/activities", Arrays.copyOf(new Object[]{strB}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            final GraphRequest graphRequestN = cVar.N(null, str, null, null);
            graphRequestN.n0(true);
            Bundle bundleK = graphRequestN.K();
            if (bundleK == null) {
                bundleK = new Bundle();
            }
            bundleK.putString("access_token", accessTokenAppId.a());
            String strG = f0.f98865b.g();
            if (strG != null) {
                bundleK.putString("device_token", strG);
            }
            String strM = t.f99255c.m();
            if (strM != null) {
                bundleK.putString("install_referrer", strM);
            }
            graphRequestN.r0(bundleK);
            boolean zT = xVarN != null ? xVarN.t() : false;
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            int iF = appEvents.f(graphRequestN, com.facebook.g0.n(), zT, z10);
            if (iF == 0) {
                return null;
            }
            flushState.c(flushState.a() + iF);
            graphRequestN.l0(new GraphRequest.b() { // from class: com.facebook.appevents.m
                @Override // com.facebook.GraphRequest.b
                public final void a(q0 q0Var) {
                    n.j(accessTokenAppId, graphRequestN, appEvents, flushState, q0Var);
                }
            });
            return graphRequestN;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(a accessTokenAppId, GraphRequest postRequest, h0 appEvents, e0 flushState, q0 response) {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(postRequest, "$postRequest");
            Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            Intrinsics.checkNotNullParameter(flushState, "$flushState");
            Intrinsics.checkNotNullParameter(response, "response");
            q(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
        }
    }

    @oj.n
    @NotNull
    public static final List<GraphRequest> k(@NotNull f appEventCollection, @NotNull e0 flushResults) {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            Intrinsics.checkNotNullParameter(flushResults, "flushResults");
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            boolean zE = com.facebook.g0.E(com.facebook.g0.n());
            ArrayList arrayList = new ArrayList();
            for (a aVar : appEventCollection.f()) {
                h0 h0VarC = appEventCollection.c(aVar);
                if (h0VarC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                GraphRequest graphRequestI = i(aVar, h0VarC, zE, flushResults);
                if (graphRequestI != null) {
                    arrayList.add(graphRequestI);
                    if (com.facebook.appevents.cloudbridge.d.f98629a.f()) {
                        com.facebook.appevents.cloudbridge.g gVar = com.facebook.appevents.cloudbridge.g.f98657a;
                        com.facebook.appevents.cloudbridge.g.q(graphRequestI);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
            return null;
        }
    }

    @oj.n
    public static final void l(@NotNull final c0 reason) {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f99152g.execute(new Runnable() { // from class: com.facebook.appevents.h
                @Override // java.lang.Runnable
                public final void run() {
                    n.m(reason);
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(c0 reason) {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "$reason");
            n(reason);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
        }
    }

    @oj.n
    public static final void n(@NotNull c0 reason) {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            g gVar = g.f98867a;
            f99151f.b(g.a());
            try {
                e0 e0VarU = u(reason, f99151f);
                if (e0VarU != null) {
                    Intent intent = new Intent(q.f99236d);
                    intent.putExtra(q.f99237e, e0VarU.a());
                    intent.putExtra(q.f99238f, e0VarU.b());
                    com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                    androidx.localbroadcastmanager.content.a.b(com.facebook.g0.n()).d(intent);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o() {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return;
        }
        try {
            f99153h = null;
            if (q.f99234b.g() != q.b.EXPLICIT_ONLY) {
                n(c0.TIMER);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
        }
    }

    @oj.n
    @NotNull
    public static final Set<a> p() {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return null;
        }
        try {
            return f99151f.f();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
            return null;
        }
    }

    @oj.n
    public static final void q(@NotNull final a accessTokenAppId, @NotNull GraphRequest request, @NotNull q0 response, @NotNull final h0 appEvents, @NotNull e0 flushState) {
        String string;
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            FacebookRequestError facebookRequestErrorG = response.g();
            String str = "Success";
            d0 d0Var = d0.SUCCESS;
            if (facebookRequestErrorG != null) {
                if (facebookRequestErrorG.h() == -1) {
                    str = "Failed: No Connectivity";
                    d0Var = d0.NO_CONNECTIVITY;
                } else {
                    q1 q1Var = q1.f312784a;
                    str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), facebookRequestErrorG.toString()}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                    d0Var = d0.SERVER_ERROR;
                }
            }
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            if (com.facebook.g0.P(t0.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) request.M()).toString(2);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                com.facebook.internal.t0.a aVar = com.facebook.internal.t0.f100109e;
                t0 t0Var = t0.APP_EVENTS;
                String TAG = f99147b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar.e(t0Var, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.G()), str, string);
            }
            appEvents.c(facebookRequestErrorG != null);
            d0 d0Var2 = d0.NO_CONNECTIVITY;
            if (d0Var == d0Var2) {
                com.facebook.g0 g0Var2 = com.facebook.g0.f99617a;
                com.facebook.g0.y().execute(new Runnable() { // from class: com.facebook.appevents.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.r(accessTokenAppId, appEvents);
                    }
                });
            }
            if (d0Var == d0.SUCCESS || flushState.b() == d0Var2) {
                return;
            }
            flushState.d(d0Var);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(a accessTokenAppId, h0 appEvents) {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            o oVar = o.f99155a;
            o.a(accessTokenAppId, appEvents);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
        }
    }

    @oj.n
    public static final void s() {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return;
        }
        try {
            f99152g.execute(new Runnable() { // from class: com.facebook.appevents.i
                @Override // java.lang.Runnable
                public final void run() {
                    n.t();
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t() {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return;
        }
        try {
            o oVar = o.f99155a;
            o.b(f99151f);
            f99151f = new f();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
        }
    }

    @oj.n
    @l1(otherwise = 2)
    @Nullable
    public static final e0 u(@NotNull c0 reason, @NotNull f appEventCollection) {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            e0 e0Var = new e0();
            List<GraphRequest> listK = k(appEventCollection, e0Var);
            if (listK.isEmpty()) {
                return null;
            }
            com.facebook.internal.t0.a aVar = com.facebook.internal.t0.f100109e;
            t0 t0Var = t0.APP_EVENTS;
            String TAG = f99147b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            aVar.e(t0Var, TAG, "Flushing %d events due to %s.", Integer.valueOf(e0Var.a()), reason.toString());
            Iterator<GraphRequest> it = listK.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            return e0Var;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
            return null;
        }
    }
}
