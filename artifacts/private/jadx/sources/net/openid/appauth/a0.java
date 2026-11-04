package net.openid.appauth;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f332796i = "bearer";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l1
    static final String f332797j = "request";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l1
    static final String f332798k = "expires_at";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l1
    static final String f332800m = "access_token";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @l1
    static final String f332801n = "expires_in";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @l1
    static final String f332802o = "refresh_token";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @l1
    static final String f332803p = "id_token";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @l1
    static final String f332804q = "scope";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @l1
    static final String f332805r = "additionalParameters";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final z f332807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f332808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f332809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final Long f332810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final String f332811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final String f332812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    public final String f332813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Map<String, String> f332814h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l1
    static final String f332799l = "token_type";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Set<String> f332806s = new HashSet(Arrays.asList(f332799l, "access_token", "expires_in", "refresh_token", "id_token", "scope"));

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private z f332815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private String f332816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private String f332817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private Long f332818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private String f332819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private String f332820f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private String f332821g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        private Map<String, String> f332822h;

        public a(@NonNull z zVar) {
            k(zVar);
            this.f332822h = Collections.EMPTY_MAP;
        }

        public a0 a() {
            return new a0(this.f332815a, this.f332816b, this.f332817c, this.f332818d, this.f332819e, this.f332820f, this.f332821g, this.f332822h);
        }

        @NonNull
        public a b(@NonNull JSONObject jSONObject) throws JSONException {
            o(r.d(jSONObject, a0.f332799l));
            d(r.e(jSONObject, "access_token"));
            e(r.c(jSONObject, a0.f332798k));
            if (jSONObject.has("expires_in")) {
                f(Long.valueOf(jSONObject.getLong("expires_in")));
            }
            j(r.e(jSONObject, "refresh_token"));
            i(r.e(jSONObject, "id_token"));
            l(r.e(jSONObject, "scope"));
            h(net.openid.appauth.a.d(jSONObject, a0.f332806s));
            return this;
        }

        @NonNull
        public a c(@NonNull String str) throws JSONException {
            t.e(str, "json cannot be null or empty");
            return b(new JSONObject(str));
        }

        @NonNull
        public a d(@p0 String str) {
            this.f332817c = t.h(str, "access token cannot be empty if specified");
            return this;
        }

        @NonNull
        public a e(@p0 Long l10) {
            this.f332818d = l10;
            return this;
        }

        @NonNull
        public a f(@NonNull Long l10) {
            return g(l10, y.f333315a);
        }

        @NonNull
        @l1
        a g(@p0 Long l10, @NonNull o oVar) {
            if (l10 == null) {
                this.f332818d = null;
                return this;
            }
            this.f332818d = Long.valueOf(oVar.a() + TimeUnit.SECONDS.toMillis(l10.longValue()));
            return this;
        }

        @NonNull
        public a h(@p0 Map<String, String> map) {
            this.f332822h = net.openid.appauth.a.b(map, a0.f332806s);
            return this;
        }

        public a i(@p0 String str) {
            this.f332819e = t.h(str, "id token must not be empty if defined");
            return this;
        }

        public a j(@p0 String str) {
            this.f332820f = t.h(str, "refresh token must not be empty if defined");
            return this;
        }

        @NonNull
        public a k(@NonNull z zVar) {
            this.f332815a = (z) t.g(zVar, "request cannot be null");
            return this;
        }

        @NonNull
        public a l(@p0 String str) {
            if (!TextUtils.isEmpty(str)) {
                n(str.split(" +"));
                return this;
            }
            int i10 = 4 | 0;
            this.f332821g = null;
            return this;
        }

        @NonNull
        public a m(@p0 Iterable<String> iterable) {
            this.f332821g = c.a(iterable);
            return this;
        }

        @NonNull
        public a n(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            m(Arrays.asList(strArr));
            return this;
        }

        @NonNull
        public a o(@p0 String str) {
            this.f332816b = t.h(str, "token type must not be empty if defined");
            return this;
        }
    }

    a0(@NonNull z zVar, @p0 String str, @p0 String str2, @p0 Long l10, @p0 String str3, @p0 String str4, @p0 String str5, @NonNull Map<String, String> map) {
        this.f332807a = zVar;
        this.f332808b = str;
        this.f332809c = str2;
        this.f332810d = l10;
        this.f332811e = str3;
        this.f332812f = str4;
        this.f332813g = str5;
        this.f332814h = map;
    }

    @NonNull
    public static a0 c(@NonNull String str) throws JSONException {
        t.e(str, "jsonStr cannot be null or empty");
        return d(new JSONObject(str));
    }

    @NonNull
    public static a0 d(@NonNull JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("request")) {
            return new a(z.e(jSONObject.getJSONObject("request"))).o(r.e(jSONObject, f332799l)).d(r.e(jSONObject, "access_token")).e(r.c(jSONObject, f332798k)).i(r.e(jSONObject, "id_token")).j(r.e(jSONObject, "refresh_token")).l(r.e(jSONObject, "scope")).h(r.h(jSONObject, f332805r)).a();
        }
        throw new IllegalArgumentException("token request not provided and not found in JSON");
    }

    @p0
    public Set<String> b() {
        return c.b(this.f332813g);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        r.p(jSONObject, "request", this.f332807a.f());
        r.s(jSONObject, f332799l, this.f332808b);
        r.s(jSONObject, "access_token", this.f332809c);
        r.r(jSONObject, f332798k, this.f332810d);
        r.s(jSONObject, "id_token", this.f332811e);
        r.s(jSONObject, "refresh_token", this.f332812f);
        r.s(jSONObject, "scope", this.f332813g);
        r.p(jSONObject, f332805r, r.l(this.f332814h));
        return jSONObject;
    }

    public String f() {
        return e().toString();
    }
}
