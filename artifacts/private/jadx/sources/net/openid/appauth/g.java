package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f333005j = "net.openid.appauth.AuthorizationResponse";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f333006k = "bearer";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l1
    static final String f333007l = "request";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l1
    static final String f333008m = "additional_parameters";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @l1
    static final String f333009n = "expires_at";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @l1
    static final String f333010o = "state";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @l1
    static final String f333012q = "code";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @l1
    static final String f333013r = "access_token";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @l1
    static final String f333014s = "expires_in";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @l1
    static final String f333015t = "id_token";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @l1
    static final String f333016u = "scope";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final f f333018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f333019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f333020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f333021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final String f333022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final Long f333023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    public final String f333024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    public final String f333025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Map<String, String> f333026i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @l1
    static final String f333011p = "token_type";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Set<String> f333017v = Collections.unmodifiableSet(new HashSet(Arrays.asList(f333011p, "state", "code", "access_token", "expires_in", "id_token", "scope")));

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private f f333027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private String f333028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private String f333029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private String f333030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private String f333031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private Long f333032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private String f333033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        private String f333034h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        private Map<String, String> f333035i = new LinkedHashMap();

        public b(@NonNull f fVar) {
            this.f333027a = (f) t.g(fVar, "authorization request cannot be null");
        }

        @NonNull
        public g a() {
            return new g(this.f333027a, this.f333028b, this.f333029c, this.f333030d, this.f333031e, this.f333032f, this.f333033g, this.f333034h, Collections.unmodifiableMap(this.f333035i));
        }

        @NonNull
        public b b(@NonNull Uri uri) {
            return c(uri, y.f333315a);
        }

        @NonNull
        @l1
        b c(@NonNull Uri uri, @NonNull o oVar) {
            n(uri.getQueryParameter("state"));
            o(uri.getQueryParameter(g.f333011p));
            i(uri.getQueryParameter("code"));
            d(uri.getQueryParameter("access_token"));
            g(net.openid.appauth.internal.b.f(uri, "expires_in"), oVar);
            j(uri.getQueryParameter("id_token"));
            k(uri.getQueryParameter("scope"));
            h(net.openid.appauth.a.c(uri, g.f333017v));
            return this;
        }

        @NonNull
        public b d(@p0 String str) {
            t.h(str, "accessToken must not be empty");
            this.f333031e = str;
            return this;
        }

        @NonNull
        public b e(@p0 Long l10) {
            this.f333032f = l10;
            return this;
        }

        @NonNull
        public b f(@p0 Long l10) {
            return g(l10, y.f333315a);
        }

        @NonNull
        @l1
        public b g(@p0 Long l10, @NonNull o oVar) {
            if (l10 == null) {
                this.f333032f = null;
                return this;
            }
            this.f333032f = Long.valueOf(oVar.a() + TimeUnit.SECONDS.toMillis(l10.longValue()));
            return this;
        }

        @NonNull
        public b h(@p0 Map<String, String> map) {
            this.f333035i = net.openid.appauth.a.b(map, g.f333017v);
            return this;
        }

        @NonNull
        public b i(@p0 String str) {
            t.h(str, "authorizationCode must not be empty");
            this.f333030d = str;
            return this;
        }

        @NonNull
        public b j(@p0 String str) {
            t.h(str, "idToken cannot be empty");
            this.f333033g = str;
            return this;
        }

        @NonNull
        public b k(@p0 String str) {
            if (TextUtils.isEmpty(str)) {
                this.f333034h = null;
                return this;
            }
            m(str.split(" +"));
            return this;
        }

        @NonNull
        public b l(@p0 Iterable<String> iterable) {
            this.f333034h = c.a(iterable);
            return this;
        }

        @NonNull
        public b m(String... strArr) {
            if (strArr == null) {
                this.f333034h = null;
                return this;
            }
            l(Arrays.asList(strArr));
            return this;
        }

        @NonNull
        public b n(@p0 String str) {
            t.h(str, "state must not be empty");
            this.f333028b = str;
            return this;
        }

        @NonNull
        public b o(@p0 String str) {
            t.h(str, "tokenType must not be empty");
            this.f333029c = str;
            return this;
        }
    }

    @p0
    public static g d(@NonNull Intent intent) {
        t.g(intent, "dataIntent must not be null");
        if (!intent.hasExtra(f333005j)) {
            return null;
        }
        try {
            return h(intent.getStringExtra(f333005j));
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e10);
        }
    }

    @NonNull
    public static g h(@NonNull String str) throws JSONException {
        return i(new JSONObject(str));
    }

    @NonNull
    public static g i(@NonNull JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("request")) {
            return new b(f.g(jSONObject.getJSONObject("request"))).o(r.e(jSONObject, f333011p)).d(r.e(jSONObject, "access_token")).i(r.e(jSONObject, "code")).j(r.e(jSONObject, "id_token")).k(r.e(jSONObject, "scope")).n(r.e(jSONObject, "state")).e(r.c(jSONObject, f333009n)).h(r.h(jSONObject, f333008m)).a();
        }
        throw new IllegalArgumentException("authorization request not provided and not found in JSON");
    }

    @NonNull
    public z b() {
        return c(Collections.EMPTY_MAP);
    }

    @NonNull
    public z c(@NonNull Map<String, String> map) {
        t.g(map, "additionalExchangeParameters cannot be null");
        if (this.f333021d == null) {
            throw new IllegalStateException("authorizationCode not available for exchange request");
        }
        f fVar = this.f333018a;
        return new z.b(fVar.f332961a, fVar.f332962b).h(q.f333116a).i(this.f333018a.f332967g).f(this.f333018a.f332970j).d(this.f333021d).c(map).a();
    }

    @p0
    public Set<String> e() {
        return c.b(this.f333025h);
    }

    public boolean f() {
        return g(y.f333315a);
    }

    @l1
    boolean g(@NonNull o oVar) {
        return this.f333023f != null && ((o) t.f(oVar)).a() > this.f333023f.longValue();
    }

    @NonNull
    public JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        r.p(jSONObject, "request", this.f333018a.h());
        r.s(jSONObject, "state", this.f333019b);
        r.s(jSONObject, f333011p, this.f333020c);
        r.s(jSONObject, "code", this.f333021d);
        r.s(jSONObject, "access_token", this.f333022e);
        r.r(jSONObject, f333009n, this.f333023f);
        r.s(jSONObject, "id_token", this.f333024g);
        r.s(jSONObject, "scope", this.f333025h);
        r.p(jSONObject, f333008m, r.l(this.f333026i));
        return jSONObject;
    }

    @NonNull
    public String k() {
        return j().toString();
    }

    @NonNull
    public Intent l() {
        Intent intent = new Intent();
        intent.putExtra(f333005j, k());
        return intent;
    }

    private g(@NonNull f fVar, @p0 String str, @p0 String str2, @p0 String str3, @p0 String str4, @p0 Long l10, @p0 String str5, @p0 String str6, @NonNull Map<String, String> map) {
        this.f333018a = fVar;
        this.f333019b = str;
        this.f333020c = str2;
        this.f333021d = str3;
        this.f333022e = str4;
        this.f333023f = l10;
        this.f333024g = str5;
        this.f333025h = str6;
        this.f333026i = map;
    }
}
