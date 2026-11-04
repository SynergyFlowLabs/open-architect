package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.compose.animation.core.z1;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {
    private static boolean D = false;
    private static boolean E = false;

    @Nullable
    private static JSONArray F = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f99727c = "com.facebook.internal.preferences.APP_SETTINGS";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f99728d = "com.facebook.internal.APP_SETTINGS.%s";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f99738n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f99739o = 16;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f99740p = 32;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f99741q = 256;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f99742r = 16384;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final String f99746v = "sdk_update_message";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private static final String f99750z = "fields";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b0 f99725a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99726b = b0.class.getSimpleName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f99729e = "supports_implicit_sdk_logging";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f99730f = "gdpv4_nux_content";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f99731g = "gdpv4_nux_enabled";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f99732h = "android_dialog_configs";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f99733i = "android_sdk_error_categories";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f99734j = "app_events_session_timeout";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f99735k = "app_events_feature_bitmask";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f99736l = "auto_event_mapping_android";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f99743s = "seamless_login";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final String f99744t = "smart_login_bookmark_icon_url";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f99745u = "smart_login_menu_icon_url";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f99737m = "restrictive_data_filter_params";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final String f99747w = "aam_rules";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private static final String f99748x = "suggested_events_setting";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private static final List<String> f99749y = CollectionsKt.listOf((Object[]) new String[]{f99729e, f99730f, f99731g, f99732h, f99733i, f99734j, f99735k, f99736l, f99743s, f99744t, f99745u, f99737m, f99747w, f99748x});

    @NotNull
    private static final Map<String, x> A = new ConcurrentHashMap();

    @NotNull
    private static final AtomicReference<a> B = new AtomicReference<>(a.NOT_LOADED);

    @NotNull
    private static final ConcurrentLinkedQueue<b> C = new ConcurrentLinkedQueue<>();

    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        static {
            int i10 = 1 << 3;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }
    }

    public interface b {
        void a();

        void b(@Nullable x xVar);
    }

    private b0() {
    }

    @oj.n
    public static final void d(@NotNull b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C.add(callback);
        g();
    }

    private final JSONObject e(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f99749y);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest graphRequestH = GraphRequest.f98518n.H(null, "app", null);
        graphRequestH.n0(true);
        graphRequestH.r0(bundle);
        JSONObject jSONObjectK = graphRequestH.l().k();
        if (jSONObjectK == null) {
            jSONObjectK = new JSONObject();
        }
        return jSONObjectK;
    }

    @oj.n
    @Nullable
    public static final x f(@Nullable String str) {
        if (str != null) {
            return A.get(str);
        }
        return null;
    }

    @oj.n
    public static final void g() {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        final Context contextN = com.facebook.g0.n();
        final String strO = com.facebook.g0.o();
        e1 e1Var = e1.f99794a;
        if (e1.Z(strO)) {
            B.set(a.ERROR);
            f99725a.k();
            return;
        }
        if (A.containsKey(strO)) {
            B.set(a.SUCCESS);
            f99725a.k();
            return;
        }
        AtomicReference<a> atomicReference = B;
        a aVar = a.NOT_LOADED;
        a aVar2 = a.LOADING;
        if (!z1.a(atomicReference, aVar, aVar2) && !z1.a(atomicReference, a.ERROR, aVar2)) {
            f99725a.k();
            return;
        }
        q1 q1Var = q1.f312784a;
        final String str = String.format(f99728d, Arrays.copyOf(new Object[]{strO}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        com.facebook.g0.y().execute(new Runnable() { // from class: com.facebook.internal.y
            @Override // java.lang.Runnable
            public final void run() {
                b0.h(contextN, str, strO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Context context, String settingsKey, String applicationId) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(settingsKey, "$settingsKey");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences(f99727c, 0);
        x xVarI = null;
        String string = sharedPreferences.getString(settingsKey, null);
        e1 e1Var = e1.f99794a;
        if (!e1.Z(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                e1 e1Var2 = e1.f99794a;
                e1.f0(e1.f99795b, e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                xVarI = f99725a.i(applicationId, jSONObject);
            }
        }
        b0 b0Var = f99725a;
        JSONObject jSONObjectE = b0Var.e(applicationId);
        if (jSONObjectE != null) {
            b0Var.i(applicationId, jSONObjectE);
            sharedPreferences.edit().putString(settingsKey, jSONObjectE.toString()).apply();
        }
        if (xVarI != null) {
            String strM = xVarI.m();
            if (!D && strM != null && strM.length() > 0) {
                D = true;
            }
        }
        w wVar = w.f100131a;
        w.m(applicationId, true);
        com.facebook.appevents.internal.i iVar = com.facebook.appevents.internal.i.f99018a;
        com.facebook.appevents.internal.i.d();
        B.set(A.containsKey(applicationId) ? a.SUCCESS : a.ERROR);
        b0Var.k();
    }

    private final Map<String, Map<String, x.b>> j(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        int length;
        HashMap map = new HashMap();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null && (length = jSONArrayOptJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                x.b.a aVar = x.b.f100241e;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "dialogConfigData.optJSONObject(i)");
                x.b bVarA = aVar.a(jSONObjectOptJSONObject);
                if (bVarA != null) {
                    String strA = bVarA.a();
                    Map map2 = (Map) map.get(strA);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(strA, map2);
                    }
                    map2.put(bVarA.c(), bVarA);
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return map;
    }

    private final synchronized void k() {
        a aVar = B.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            final x xVar = A.get(com.facebook.g0.o());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue = C;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final b bVarPoll = concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            b0.l(bVarPoll);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue2 = C;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final b bVarPoll2 = concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            b0.m(bVarPoll2, xVar);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(b bVar) {
        bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(b bVar, x xVar) {
        bVar.b(xVar);
    }

    @oj.n
    @Nullable
    public static final x n(@NotNull String applicationId, boolean z10) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z10) {
            Map<String, x> map = A;
            if (map.containsKey(applicationId)) {
                return map.get(applicationId);
            }
        }
        b0 b0Var = f99725a;
        JSONObject jSONObjectE = b0Var.e(applicationId);
        if (jSONObjectE == null) {
            return null;
        }
        x xVarI = b0Var.i(applicationId, jSONObjectE);
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (Intrinsics.areEqual(applicationId, com.facebook.g0.o())) {
            B.set(a.SUCCESS);
            b0Var.k();
        }
        return xVarI;
    }

    @oj.n
    public static final void o(boolean z10) {
        E = z10;
        if (F == null || !z10) {
            return;
        }
        f5.f fVar = f5.f.f275002a;
        f5.f.c(String.valueOf(F));
    }

    @NotNull
    public final x i(@NotNull String applicationId, @NotNull JSONObject settingsJSON) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(settingsJSON, "settingsJSON");
        JSONArray jSONArrayOptJSONArray = settingsJSON.optJSONArray(f99733i);
        p.a aVar = p.f100023g;
        p pVarA = aVar.a(jSONArrayOptJSONArray);
        if (pVarA == null) {
            pVarA = aVar.b();
        }
        p pVar = pVarA;
        int iOptInt = settingsJSON.optInt(f99735k, 0);
        boolean z10 = (iOptInt & 8) != 0;
        boolean z11 = (iOptInt & 16) != 0;
        boolean z12 = (iOptInt & 32) != 0;
        boolean z13 = (iOptInt & 256) != 0;
        boolean z14 = (iOptInt & 16384) != 0;
        JSONArray jSONArrayOptJSONArray2 = settingsJSON.optJSONArray(f99736l);
        F = jSONArrayOptJSONArray2;
        if (jSONArrayOptJSONArray2 != null) {
            q0 q0Var = q0.f100060a;
            if (q0.b()) {
                f5.f fVar = f5.f.f275002a;
                f5.f.c(jSONArrayOptJSONArray2 == null ? null : jSONArrayOptJSONArray2.toString());
            }
        }
        boolean zOptBoolean = settingsJSON.optBoolean(f99729e, false);
        String strOptString = settingsJSON.optString(f99730f, "");
        Intrinsics.checkNotNullExpressionValue(strOptString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = settingsJSON.optBoolean(f99731g, false);
        com.facebook.appevents.internal.j jVar = com.facebook.appevents.internal.j.f99025a;
        int iOptInt2 = settingsJSON.optInt(f99734j, com.facebook.appevents.internal.j.a());
        EnumSet<a1> enumSetA = a1.f99713b.a(settingsJSON.optLong(f99743s));
        Map<String, Map<String, x.b>> mapJ = j(settingsJSON.optJSONObject(f99732h));
        String strOptString2 = settingsJSON.optString(f99744t);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString3 = settingsJSON.optString(f99745u);
        Intrinsics.checkNotNullExpressionValue(strOptString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString4 = settingsJSON.optString(f99746v);
        Intrinsics.checkNotNullExpressionValue(strOptString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        x xVar = new x(zOptBoolean, strOptString, zOptBoolean2, iOptInt2, enumSetA, mapJ, z10, pVar, strOptString2, strOptString3, z11, z12, jSONArrayOptJSONArray2, strOptString4, z13, z14, settingsJSON.optString(f99747w), settingsJSON.optString(f99748x), settingsJSON.optString(f99737m));
        A.put(applicationId, xVar);
        return xVar;
    }
}
