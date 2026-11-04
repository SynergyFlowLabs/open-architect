package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class z {
    public static final String A = "client_credentials";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l1
    static final String f333316j = "configuration";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l1
    static final String f333317k = "clientId";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l1
    static final String f333318l = "grantType";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l1
    static final String f333319m = "redirectUri";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @l1
    static final String f333320n = "scope";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @l1
    static final String f333321o = "authorizationCode";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @l1
    static final String f333322p = "refreshToken";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @l1
    static final String f333323q = "additionalParameters";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f333324r = "client_id";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @l1
    static final String f333325s = "code";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @l1
    static final String f333328v = "redirect_uri";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @l1
    static final String f333329w = "refresh_token";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @l1
    static final String f333330x = "scope";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f333332z = "password";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final i f333333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final String f333334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final String f333335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final Uri f333336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final String f333337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final String f333338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    public final String f333339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    public final String f333340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Map<String, String> f333341i;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @l1
    static final String f333326t = "code_verifier";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @l1
    static final String f333327u = "grant_type";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Set<String> f333331y = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code", f333326t, f333327u, "redirect_uri", "refresh_token", "scope")));

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private i f333342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private String f333343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private String f333344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private Uri f333345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private String f333346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private String f333347f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private String f333348g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        private String f333349h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        private Map<String, String> f333350i;

        public b(@NonNull i iVar, @NonNull String str) {
            g(iVar);
            e(str);
            this.f333350i = new LinkedHashMap();
        }

        private String b() {
            String str = this.f333344c;
            if (str != null) {
                return str;
            }
            if (this.f333347f != null) {
                return q.f333116a;
            }
            if (this.f333348g != null) {
                return "refresh_token";
            }
            throw new IllegalStateException("grant type not specified and cannot be inferred");
        }

        @NonNull
        public z a() {
            String strB = b();
            if (q.f333116a.equals(strB)) {
                t.g(this.f333347f, "authorization code must be specified for grant_type = authorization_code");
            }
            if ("refresh_token".equals(strB)) {
                t.g(this.f333348g, "refresh token must be specified for grant_type = refresh_token");
            }
            if (strB.equals(q.f333116a) && this.f333345d == null) {
                throw new IllegalStateException("no redirect URI specified on token request for code exchange");
            }
            return new z(this.f333342a, this.f333343b, strB, this.f333345d, this.f333346e, this.f333347f, this.f333348g, this.f333349h, Collections.unmodifiableMap(this.f333350i));
        }

        @NonNull
        public b c(@p0 Map<String, String> map) {
            this.f333350i = net.openid.appauth.a.b(map, z.f333331y);
            return this;
        }

        @NonNull
        public b d(@p0 String str) {
            t.h(str, "authorization code must not be empty");
            this.f333347f = str;
            return this;
        }

        @NonNull
        public b e(@NonNull String str) {
            this.f333343b = t.e(str, "clientId cannot be null or empty");
            return this;
        }

        public b f(@p0 String str) {
            if (str != null) {
                p.a(str);
            }
            this.f333349h = str;
            return this;
        }

        @NonNull
        public b g(@NonNull i iVar) {
            this.f333342a = (i) t.f(iVar);
            return this;
        }

        @NonNull
        public b h(@NonNull String str) {
            this.f333344c = t.e(str, "grantType cannot be null or empty");
            return this;
        }

        @NonNull
        public b i(@p0 Uri uri) {
            if (uri != null) {
                t.g(uri.getScheme(), "redirectUri must have a scheme");
            }
            this.f333345d = uri;
            return this;
        }

        @NonNull
        public b j(@p0 String str) {
            if (str != null) {
                t.e(str, "refresh token cannot be empty if defined");
            }
            this.f333348g = str;
            return this;
        }

        @NonNull
        public b k(@p0 String str) {
            if (TextUtils.isEmpty(str)) {
                this.f333346e = null;
                return this;
            }
            m(str.split(" +"));
            return this;
        }

        @NonNull
        public b l(@p0 Iterable<String> iterable) {
            this.f333346e = c.a(iterable);
            return this;
        }

        @NonNull
        public b m(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            l(Arrays.asList(strArr));
            return this;
        }
    }

    @NonNull
    public static z d(@NonNull String str) throws JSONException {
        t.g(str, "json string cannot be null");
        return e(new JSONObject(str));
    }

    @NonNull
    public static z e(JSONObject jSONObject) throws JSONException {
        t.g(jSONObject, "json object cannot be null");
        b bVarC = new b(i.f(jSONObject.getJSONObject("configuration")), r.d(jSONObject, "clientId")).i(r.j(jSONObject, f333319m)).h(r.d(jSONObject, f333318l)).j(r.e(jSONObject, f333322p)).d(r.e(jSONObject, f333321o)).c(r.h(jSONObject, f333323q));
        if (jSONObject.has("scope")) {
            bVarC.l(c.b(r.d(jSONObject, "scope")));
        }
        return bVarC.a();
    }

    private void h(Map<String, String> map, String str, Object obj) {
        if (obj != null) {
            map.put(str, obj.toString());
        }
    }

    @NonNull
    public Map<String, String> b() {
        Map<String, String> map = new HashMap<>();
        map.put(f333327u, this.f333335c);
        h(map, "redirect_uri", this.f333336d);
        h(map, "code", this.f333337e);
        h(map, "refresh_token", this.f333339g);
        h(map, f333326t, this.f333340h);
        h(map, "scope", this.f333338f);
        for (Map.Entry<String, String> entry : this.f333341i.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    @p0
    public Set<String> c() {
        return c.b(this.f333338f);
    }

    @NonNull
    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        r.p(jSONObject, "configuration", this.f333333a.g());
        r.n(jSONObject, "clientId", this.f333334b);
        r.n(jSONObject, f333318l, this.f333335c);
        r.q(jSONObject, f333319m, this.f333336d);
        r.s(jSONObject, "scope", this.f333338f);
        r.s(jSONObject, f333321o, this.f333337e);
        r.s(jSONObject, f333322p, this.f333339g);
        r.p(jSONObject, f333323q, r.l(this.f333341i));
        return jSONObject;
    }

    @NonNull
    public String g() {
        return f().toString();
    }

    private z(@NonNull i iVar, @NonNull String str, @NonNull String str2, @p0 Uri uri, @p0 String str3, @p0 String str4, @p0 String str5, @p0 String str6, @NonNull Map<String, String> map) {
        this.f333333a = iVar;
        this.f333334b = str;
        this.f333335c = str2;
        this.f333336d = uri;
        this.f333338f = str3;
        this.f333337e = str4;
        this.f333339g = str5;
        this.f333340h = str6;
        this.f333341i = map;
    }
}
