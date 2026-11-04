package com.facebook.appevents.cloudbridge;

import android.content.SharedPreferences;
import com.facebook.GraphRequest;
import com.facebook.g0;
import com.facebook.internal.e1;
import com.facebook.internal.t0;
import com.facebook.q0;
import com.facebook.r0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f98630b = "/cloudbridge_settings";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f98632d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f98629a = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f98631c = d.class.getCanonicalName();

    private d() {
    }

    @oj.n
    public static final void b() {
        try {
            GraphRequest.b bVar = new GraphRequest.b() { // from class: com.facebook.appevents.cloudbridge.c
                @Override // com.facebook.GraphRequest.b
                public final void a(q0 q0Var) {
                    d.c(q0Var);
                }
            };
            g0 g0Var = g0.f99617a;
            GraphRequest graphRequest = new GraphRequest(null, Intrinsics.stringPlus(g0.o(), f98630b), null, r0.GET, bVar, null, 32, null);
            t0.a aVar = t0.f100109e;
            com.facebook.t0 t0Var = com.facebook.t0.APP_EVENTS;
            String str = f98631c;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.e(t0Var, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
            graphRequest.n();
        } catch (JSONException e10) {
            t0.a aVar2 = t0.f100109e;
            com.facebook.t0 t0Var2 = com.facebook.t0.APP_EVENTS;
            String str2 = f98631c;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar2.e(t0Var2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", p.i(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(q0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        f98629a.d(response);
    }

    @oj.n
    @Nullable
    public static final Map<String, Object> e() {
        if (com.facebook.internal.instrument.crashshield.b.e(d.class)) {
            return null;
        }
        try {
            g0 g0Var = g0.f99617a;
            SharedPreferences sharedPreferences = g0.n().getSharedPreferences(g0.X, 0);
            if (sharedPreferences == null) {
                return null;
            }
            o oVar = o.DATASETID;
            String string = sharedPreferences.getString(oVar.l(), null);
            o oVar2 = o.URL;
            String string2 = sharedPreferences.getString(oVar2.l(), null);
            o oVar3 = o.ACCESSKEY;
            String string3 = sharedPreferences.getString(oVar3.l(), null);
            if (string != null && !StringsKt.w3(string) && string2 != null && !StringsKt.w3(string2) && string3 != null && !StringsKt.w3(string3)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(oVar2.l(), string2);
                linkedHashMap.put(oVar.l(), string);
                linkedHashMap.put(oVar3.l(), string3);
                t0.f100109e.e(com.facebook.t0.APP_EVENTS, f98631c.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                return linkedHashMap;
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, d.class);
            return null;
        }
    }

    public final void d(@NotNull q0 response) {
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.g() != null) {
            t0.a aVar = t0.f100109e;
            com.facebook.t0 t0Var = com.facebook.t0.APP_EVENTS;
            String str = f98631c;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.e(t0Var, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.g().toString(), String.valueOf(response.g().n()));
            Map<String, Object> mapE = e();
            if (mapE != null) {
                URL url = new URL(String.valueOf(mapE.get(o.URL.l())));
                g gVar = g.f98657a;
                g.d(String.valueOf(mapE.get(o.DATASETID.l())), url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(mapE.get(o.ACCESSKEY.l())));
                f98632d = true;
            }
            return;
        }
        t0.a aVar2 = t0.f100109e;
        com.facebook.t0 t0Var2 = com.facebook.t0.APP_EVENTS;
        String TAG = f98631c;
        if (TAG == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        aVar2.e(t0Var2, TAG, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject jSONObjectI = response.i();
        try {
            e1 e1Var = e1.f99794a;
            Object obj = jSONObjectI == null ? null : jSONObjectI.get("data");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            Map<String, ? extends Object> mapN = e1.n(new JSONObject((String) CollectionsKt.firstOrNull((List) e1.m((JSONArray) obj))));
            String str2 = (String) mapN.get(o.URL.l());
            String str3 = (String) mapN.get(o.DATASETID.l());
            String str4 = (String) mapN.get(o.ACCESSKEY.l());
            if (str2 == null || str3 == null || str4 == null) {
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar2.d(t0Var2, TAG, "CloudBridge Settings API response doesn't have valid data");
                return;
            }
            try {
                g gVar2 = g.f98657a;
                g.d(str3, str2, str4);
                h(mapN);
                o oVar = o.ENABLED;
                if (mapN.get(oVar.l()) != null) {
                    Object obj2 = mapN.get(oVar.l());
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                f98632d = zBooleanValue;
            } catch (MalformedURLException e10) {
                t0.a aVar3 = t0.f100109e;
                com.facebook.t0 t0Var3 = com.facebook.t0.APP_EVENTS;
                String TAG2 = f98631c;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                aVar3.e(t0Var3, TAG2, "CloudBridge Settings API response doesn't have valid url\n %s ", p.i(e10));
            }
        } catch (NullPointerException e11) {
            t0.a aVar4 = t0.f100109e;
            com.facebook.t0 t0Var4 = com.facebook.t0.APP_EVENTS;
            String TAG3 = f98631c;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            aVar4.e(t0Var4, TAG3, "CloudBridge Settings API response is not a valid json: \n%s ", p.i(e11));
        } catch (JSONException e12) {
            t0.a aVar5 = t0.f100109e;
            com.facebook.t0 t0Var5 = com.facebook.t0.APP_EVENTS;
            String TAG4 = f98631c;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            aVar5.e(t0Var5, TAG4, "CloudBridge Settings API response is not a valid json: \n%s ", p.i(e12));
        }
    }

    public final boolean f() {
        return f98632d;
    }

    public final void g(boolean z10) {
        f98632d = z10;
    }

    public final void h(@Nullable Map<String, ? extends Object> map) {
        g0 g0Var = g0.f99617a;
        SharedPreferences sharedPreferences = g0.n().getSharedPreferences(g0.X, 0);
        if (sharedPreferences != null) {
            if (map == null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.clear();
                editorEdit.apply();
                return;
            }
            o oVar = o.DATASETID;
            Object obj = map.get(oVar.l());
            o oVar2 = o.URL;
            Object obj2 = map.get(oVar2.l());
            o oVar3 = o.ACCESSKEY;
            Object obj3 = map.get(oVar3.l());
            if (obj != null && obj2 != null && obj3 != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                editorEdit2.putString(oVar.l(), obj.toString());
                editorEdit2.putString(oVar2.l(), obj2.toString());
                editorEdit2.putString(oVar3.l(), obj3.toString());
                editorEdit2.apply();
                t0.f100109e.e(com.facebook.t0.APP_EVENTS, f98631c.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
            }
        }
    }
}
