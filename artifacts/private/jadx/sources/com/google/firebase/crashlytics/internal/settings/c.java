package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.c0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class c implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f121841d = "X-CRASHLYTICS-GOOGLE-APP-ID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f121842e = "X-CRASHLYTICS-API-CLIENT-TYPE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f121843f = "X-CRASHLYTICS-API-CLIENT-VERSION";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f121844g = "User-Agent";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f121845h = "Accept";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f121846i = "Crashlytics Android SDK/";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f121847j = "application/json";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f121848k = "android";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f121849l = "build_version";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f121850m = "display_version";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f121851n = "instance";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final String f121852o = "source";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final String f121853p = "X-CRASHLYTICS-DEVICE-MODEL";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f121854q = "X-CRASHLYTICS-OS-BUILD-VERSION";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final String f121855r = "X-CRASHLYTICS-OS-DISPLAY-VERSION";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final String f121856s = "X-CRASHLYTICS-INSTALLATION-ID";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f8.b f121858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.g f121859c;

    public c(String str, f8.b bVar) {
        this(str, bVar, com.google.firebase.crashlytics.internal.g.f());
    }

    private f8.a b(f8.a aVar, l lVar) {
        c(aVar, f121841d, lVar.f121916a);
        c(aVar, f121842e, "android");
        c(aVar, f121843f, c0.u());
        c(aVar, "Accept", "application/json");
        c(aVar, f121853p, lVar.f121917b);
        c(aVar, f121854q, lVar.f121918c);
        c(aVar, f121855r, lVar.f121919d);
        c(aVar, f121856s, lVar.f121920e.a().c());
        return aVar;
    }

    private void c(f8.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f121859c.n("Failed to parse settings JSON from " + this.f121857a, e10);
            this.f121859c.m("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(l lVar) {
        HashMap map = new HashMap();
        map.put(f121849l, lVar.f121923h);
        map.put(f121850m, lVar.f121922g);
        map.put("source", Integer.toString(lVar.f121924i));
        String str = lVar.f121921f;
        if (!TextUtils.isEmpty(str)) {
            map.put(f121851n, str);
        }
        return map;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.m
    public JSONObject a(l lVar, boolean z10) {
        com.google.firebase.crashlytics.internal.concurrency.n.d();
        if (!z10) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> mapF = f(lVar);
            f8.a aVarB = b(d(mapF), lVar);
            this.f121859c.b("Requesting settings from " + this.f121857a);
            this.f121859c.k("Settings query params were: " + mapF);
            return g(aVarB.c());
        } catch (IOException e10) {
            this.f121859c.e("Settings request failed.", e10);
            return null;
        }
    }

    protected f8.a d(Map<String, String> map) {
        return this.f121858b.b(this.f121857a, map).d("User-Agent", f121846i + c0.u()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(f8.c cVar) {
        int iB = cVar.b();
        this.f121859c.k("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.f121859c.d("Settings request failed; (status: " + iB + ") from " + this.f121857a);
        return null;
    }

    boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    c(String str, f8.b bVar, com.google.firebase.crashlytics.internal.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f121859c = gVar;
        this.f121858b = bVar;
        this.f121857a = str;
    }
}
