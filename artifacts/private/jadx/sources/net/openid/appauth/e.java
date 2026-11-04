package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.media3.common.x0;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Exception {
    private static final int X = 31;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f332896f = "net.openid.appauth.AuthorizationException";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f332897g = "error";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f332898h = "error_description";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f332899i = "error_uri";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f332900j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f332901k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f332902l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f332903m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f332904n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @l1
    static final String f332905o = "type";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @l1
    static final String f332906s = "code";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @l1
    static final String f332907t = "error";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @l1
    static final String f332908v = "errorDescription";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @l1
    static final String f332909w = "errorUri";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f332910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f332911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f332912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f332913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final Uri f332914e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f332915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f332916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f332917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f332918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f332919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f332920f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f332921g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final e f332922h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final e f332923i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final e f332924j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Map<String, e> f332925k;

        static {
            e eVarF = e.f(1000, "invalid_request");
            f332915a = eVarF;
            e eVarF2 = e.f(1001, "unauthorized_client");
            f332916b = eVarF2;
            e eVarF3 = e.f(1002, "access_denied");
            f332917c = eVarF3;
            e eVarF4 = e.f(1003, "unsupported_response_type");
            f332918d = eVarF4;
            e eVarF5 = e.f(1004, "invalid_scope");
            f332919e = eVarF5;
            e eVarF6 = e.f(1005, "server_error");
            f332920f = eVarF6;
            e eVarF7 = e.f(1006, "temporarily_unavailable");
            f332921g = eVarF7;
            e eVarF8 = e.f(1007, null);
            f332922h = eVarF8;
            e eVarF9 = e.f(1008, null);
            f332923i = eVarF9;
            f332924j = e.n(9, "Response state param did not match request state");
            f332925k = e.g(eVarF, eVarF2, eVarF3, eVarF4, eVarF5, eVarF6, eVarF7, eVarF8, eVarF9);
        }

        @NonNull
        public static e a(String str) {
            e eVar = f332925k.get(str);
            return eVar != null ? eVar : f332923i;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f332926a = e.n(0, "Invalid discovery document");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f332927b = e.n(1, "User cancelled flow");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f332928c = e.n(2, "Flow cancelled programmatically");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f332929d = e.n(3, "Network error");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f332930e = e.n(4, "Server error");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f332931f = e.n(5, "JSON deserialization error");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f332932g = e.n(6, "Token response construction error");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final e f332933h = e.n(7, "Invalid registration response");

        static {
            int i10 = 6 | 7;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f332934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f332935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f332936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f332937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f332938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Map<String, e> f332939f;

        static {
            e eVarO = e.o(4000, "invalid_request");
            f332934a = eVarO;
            e eVarO2 = e.o(x0.f61836p3, "invalid_redirect_uri");
            f332935b = eVarO2;
            e eVarO3 = e.o(x0.f61837q3, "invalid_client_metadata");
            f332936c = eVarO3;
            e eVarO4 = e.o(x0.f61838r3, null);
            f332937d = eVarO4;
            e eVarO5 = e.o(x0.f61840s3, null);
            f332938e = eVarO5;
            f332939f = e.g(eVarO, eVarO2, eVarO3, eVarO4, eVarO5);
        }

        public static e a(String str) {
            e eVar = f332939f.get(str);
            return eVar != null ? eVar : f332938e;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f332940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f332941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f332942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f332943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f332944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f332945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f332946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final e f332947h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final Map<String, e> f332948i;

        static {
            e eVarS = e.s(2000, "invalid_request");
            f332940a = eVarS;
            e eVarS2 = e.s(x0.f61834p1, "invalid_client");
            f332941b = eVarS2;
            e eVarS3 = e.s(x0.H1, "invalid_grant");
            f332942c = eVarS3;
            e eVarS4 = e.s(x0.f61835p2, "unauthorized_client");
            f332943d = eVarS4;
            e eVarS5 = e.s(x0.f61816g3, "unsupported_grant_type");
            f332944e = eVarS5;
            e eVarS6 = e.s(x0.f61818h3, "invalid_scope");
            f332945f = eVarS6;
            e eVarS7 = e.s(x0.f61820i3, null);
            f332946g = eVarS7;
            e eVarS8 = e.s(x0.f61822j3, null);
            f332947h = eVarS8;
            f332948i = e.g(eVarS, eVarS2, eVarS3, eVarS4, eVarS5, eVarS6, eVarS7, eVarS8);
        }

        public static e a(String str) {
            e eVar = f332948i.get(str);
            return eVar != null ? eVar : f332947h;
        }
    }

    public e(int i10, int i11, @p0 String str, @p0 String str2, @p0 Uri uri, @p0 Throwable th2) {
        super(str2, th2);
        this.f332910a = i10;
        this.f332911b = i11;
        this.f332912c = str;
        this.f332913d = str2;
        this.f332914e = uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e f(int i10, @p0 String str) {
        int i11 = 6 >> 0;
        return new e(1, i10, str, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, e> g(e... eVarArr) {
        androidx.collection.a aVar = new androidx.collection.a(eVarArr != null ? eVarArr.length : 0);
        if (eVarArr != null) {
            for (e eVar : eVarArr) {
                String str = eVar.f332912c;
                if (str != null) {
                    aVar.put(str, eVar);
                }
            }
        }
        return Collections.unmodifiableMap(aVar);
    }

    @p0
    public static e h(Intent intent) {
        t.f(intent);
        if (!intent.hasExtra(f332896f)) {
            return null;
        }
        try {
            return i(intent.getStringExtra(f332896f));
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Intent contains malformed exception data", e10);
        }
    }

    public static e i(@NonNull String str) throws JSONException {
        t.e(str, "jsonStr cannot be null or empty");
        return j(new JSONObject(str));
    }

    public static e j(@NonNull JSONObject jSONObject) throws JSONException {
        t.g(jSONObject, "json cannot be null");
        return new e(jSONObject.getInt("type"), jSONObject.getInt("code"), r.e(jSONObject, "error"), r.e(jSONObject, f332908v), r.j(jSONObject, f332909w), null);
    }

    public static e k(@NonNull Uri uri) {
        String queryParameter = uri.getQueryParameter("error");
        String queryParameter2 = uri.getQueryParameter("error_description");
        String queryParameter3 = uri.getQueryParameter(f332899i);
        e eVarA = a.a(queryParameter);
        int i10 = eVarA.f332910a;
        int i11 = eVarA.f332911b;
        if (queryParameter2 == null) {
            queryParameter2 = eVarA.f332913d;
        }
        return new e(i10, i11, queryParameter, queryParameter2, queryParameter3 != null ? Uri.parse(queryParameter3) : eVarA.f332914e, null);
    }

    public static e l(@NonNull e eVar, @p0 String str, @p0 String str2, @p0 Uri uri) {
        int i10 = eVar.f332910a;
        int i11 = eVar.f332911b;
        if (str == null) {
            str = eVar.f332912c;
        }
        String str3 = str;
        if (str2 == null) {
            str2 = eVar.f332913d;
        }
        String str4 = str2;
        if (uri == null) {
            uri = eVar.f332914e;
        }
        return new e(i10, i11, str3, str4, uri, null);
    }

    public static e m(@NonNull e eVar, @p0 Throwable th2) {
        return new e(eVar.f332910a, eVar.f332911b, eVar.f332912c, eVar.f332913d, eVar.f332914e, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e n(int i10, @p0 String str) {
        return new e(0, i10, null, str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e o(int i10, @p0 String str) {
        return new e(4, i10, str, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e s(int i10, @p0 String str) {
        return new e(2, i10, str, null, null, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof e)) {
            e eVar = (e) obj;
            if (this.f332910a == eVar.f332910a && this.f332911b == eVar.f332911b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f332910a + 31) * 31) + this.f332911b;
    }

    @NonNull
    public Intent p() {
        Intent intent = new Intent();
        intent.putExtra(f332896f, r());
        return intent;
    }

    @NonNull
    public JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        r.m(jSONObject, "type", this.f332910a);
        r.m(jSONObject, "code", this.f332911b);
        r.s(jSONObject, "error", this.f332912c);
        r.s(jSONObject, f332908v, this.f332913d);
        r.q(jSONObject, f332909w, this.f332914e);
        return jSONObject;
    }

    @NonNull
    public String r() {
        return q().toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "AuthorizationException: " + r();
    }
}
