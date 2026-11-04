package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f100133c = "com.facebook.internal.preferences.APP_GATEKEEPERS";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f100134d = "com.facebook.internal.APP_GATEKEEPERS.%s";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f100135e = "android";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f100136f = "mobile_sdk_gk";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f100137g = "gatekeepers";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f100138h = "data";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f100139i = "fields";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f100140j = "platform";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f100141k = "sdk_version";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f100145o = 3600000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private static Long f100146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private static n5.b f100147q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w f100131a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static final String f100132b = kotlin.jvm.internal.j1.d(w.class).Q();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f100142l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final ConcurrentLinkedQueue<a> f100143m = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final Map<String, JSONObject> f100144n = new ConcurrentHashMap();

    public interface a {
        void onCompleted();
    }

    private w() {
    }

    private final JSONObject c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        bundle.putString(f100141k, com.facebook.g0.I());
        bundle.putString("fields", f100137g);
        GraphRequest.c cVar = GraphRequest.f98518n;
        q1 q1Var = q1.f312784a;
        String str2 = String.format("app/%s", Arrays.copyOf(new Object[]{f100136f}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        GraphRequest graphRequestH = cVar.H(null, str2, null);
        graphRequestH.r0(bundle);
        JSONObject jSONObjectK = graphRequestH.l().k();
        return jSONObjectK == null ? new JSONObject() : jSONObjectK;
    }

    @oj.n
    public static final boolean d(@NotNull String name, @Nullable String str, boolean z10) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(name, "name");
        Map<String, Boolean> mapE = f100131a.e(str);
        if (mapE.containsKey(name) && (bool = mapE.get(name)) != null) {
            return bool.booleanValue();
        }
        return z10;
    }

    private final boolean f(Long l10) {
        return l10 != null && System.currentTimeMillis() - l10.longValue() < 3600000;
    }

    @oj.n
    public static final synchronized void h(@Nullable a aVar) {
        if (aVar != null) {
            try {
                f100143m.add(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        final String strO = com.facebook.g0.o();
        w wVar = f100131a;
        if (wVar.f(f100146p) && f100144n.containsKey(strO)) {
            wVar.k();
            return;
        }
        final Context contextN = com.facebook.g0.n();
        q1 q1Var = q1.f312784a;
        final String str = String.format(f100134d, Arrays.copyOf(new Object[]{strO}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        if (contextN == null) {
            return;
        }
        JSONObject jSONObject = null;
        String string = contextN.getSharedPreferences(f100133c, 0).getString(str, null);
        e1 e1Var = e1.f99794a;
        if (!e1.Z(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                e1 e1Var2 = e1.f99794a;
                e1.f0(e1.f99795b, e10);
            }
            if (jSONObject != null) {
                j(strO, jSONObject);
            }
        }
        com.facebook.g0 g0Var2 = com.facebook.g0.f99617a;
        Executor executorY = com.facebook.g0.y();
        if (executorY == null) {
            return;
        }
        if (f100142l.compareAndSet(false, true)) {
            executorY.execute(new Runnable() { // from class: com.facebook.internal.v
                @Override // java.lang.Runnable
                public final void run() {
                    w.i(strO, contextN, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String applicationId, Context context, String gateKeepersKey) {
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(gateKeepersKey, "$gateKeepersKey");
        w wVar = f100131a;
        JSONObject jSONObjectC = wVar.c(applicationId);
        if (jSONObjectC.length() != 0) {
            j(applicationId, jSONObjectC);
            context.getSharedPreferences(f100133c, 0).edit().putString(gateKeepersKey, jSONObjectC.toString()).apply();
            f100146p = Long.valueOf(System.currentTimeMillis());
        }
        wVar.k();
        f100142l.set(false);
    }

    @oj.n
    @androidx.annotation.l1(otherwise = 2)
    @NotNull
    public static final synchronized JSONObject j(@NotNull String applicationId, @Nullable JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray;
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            jSONObject2 = f100144n.get(applicationId);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            int i10 = 0;
            JSONObject jSONObjectOptJSONObject = null;
            if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
                jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
            }
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(f100137g);
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i10);
                        jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                    } catch (JSONException e10) {
                        e1 e1Var = e1.f99794a;
                        e1.f0(e1.f99795b, e10);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            f100144n.put(applicationId, jSONObject2);
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject2;
    }

    private final void k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f100143m;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a aVarPoll = concurrentLinkedQueue.poll();
            if (aVarPoll != null) {
                handler.post(new Runnable() { // from class: com.facebook.internal.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.l(aVarPoll);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(a aVar) {
        aVar.onCompleted();
    }

    @oj.n
    @NotNull
    public static final JSONObject m(@NotNull String applicationId, boolean z10) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z10) {
            Map<String, JSONObject> map = f100144n;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = map.get(applicationId);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject jSONObjectC = f100131a.c(applicationId);
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        Context contextN = com.facebook.g0.n();
        q1 q1Var = q1.f312784a;
        String str = String.format(f100134d, Arrays.copyOf(new Object[]{applicationId}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        contextN.getSharedPreferences(f100133c, 0).edit().putString(str, jSONObjectC.toString()).apply();
        return j(applicationId, jSONObjectC);
    }

    @oj.n
    public static final void n() {
        n5.b bVar = f100147q;
        if (bVar == null) {
            return;
        }
        n5.b.h(bVar, null, 1, null);
    }

    @oj.n
    public static final void o(@NotNull String applicationId, @NotNull n5.a gateKeeper) {
        n5.b bVar;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(gateKeeper, "gateKeeper");
        n5.b bVar2 = f100147q;
        if ((bVar2 == null ? null : bVar2.c(applicationId, gateKeeper.e())) == null || (bVar = f100147q) == null) {
            return;
        }
        bVar.i(applicationId, gateKeeper);
    }

    public static /* synthetic */ void p(String str, n5.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            str = com.facebook.g0.o();
        }
        o(str, aVar);
    }

    @NotNull
    public final Map<String, Boolean> e(@Nullable String str) {
        g();
        if (str != null) {
            Map<String, JSONObject> map = f100144n;
            if (map.containsKey(str)) {
                n5.b bVar = f100147q;
                List<n5.a> listA = bVar == null ? null : bVar.a(str);
                if (listA != null) {
                    HashMap map2 = new HashMap();
                    for (n5.a aVar : listA) {
                        map2.put(aVar.e(), Boolean.valueOf(aVar.f()));
                    }
                    return map2;
                }
                HashMap map3 = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map3.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                n5.b bVar2 = f100147q;
                if (bVar2 == null) {
                    bVar2 = new n5.b();
                }
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    arrayList.add(new n5.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                bVar2.m(str, arrayList);
                f100147q = bVar2;
                return map3;
            }
        }
        return new HashMap();
    }

    public final void g() {
        h(null);
    }
}
