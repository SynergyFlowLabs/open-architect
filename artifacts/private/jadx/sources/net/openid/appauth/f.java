package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    @l1
    static final String A = "state";
    private static final String C = "configuration";
    private static final String D = "clientId";
    private static final String E = "display";
    private static final String F = "login_hint";
    private static final String G = "prompt";
    private static final String H = "responseType";
    private static final String I = "redirectUri";
    private static final String J = "scope";
    private static final String K = "state";
    private static final String L = "codeVerifier";
    private static final String M = "codeVerifierChallenge";
    private static final String N = "codeVerifierChallengeMethod";
    private static final String O = "responseMode";
    private static final String P = "additionalParameters";
    private static final int Q = 16;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f332949o = "S256";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f332950p = "plain";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @l1
    static final String f332951q = "client_id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @l1
    static final String f332952r = "code_challenge";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @l1
    static final String f332953s = "code_challenge_method";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @l1
    static final String f332954t = "display";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @l1
    static final String f332955u = "login_hint";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @l1
    static final String f332956v = "prompt";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @l1
    static final String f332957w = "redirect_uri";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @l1
    static final String f332959y = "response_type";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @l1
    static final String f332960z = "scope";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final i f332961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final String f332962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f332963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f332964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final String f332965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f332966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Uri f332967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    public final String f332968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    public final String f332969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    public final String f332970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    public final String f332971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    public final String f332972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    public final String f332973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final Map<String, String> f332974n;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @l1
    static final String f332958x = "response_mode";
    private static final Set<String> B = net.openid.appauth.a.a("client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "redirect_uri", f332958x, "response_type", "scope", "state");

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private i f332975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private String f332976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private String f332977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private String f332978d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private String f332979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        private String f332980f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        private Uri f332981g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        private String f332982h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        private String f332983i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        private String f332984j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        private String f332985k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @p0
        private String f332986l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @p0
        private String f332987m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NonNull
        private Map<String, String> f332988n = new HashMap();

        public b(@NonNull i iVar, @NonNull String str, @NonNull String str2, @NonNull Uri uri) {
            c(iVar);
            d(str);
            n(str2);
            l(uri);
            r(f.c());
            e(p.c());
        }

        @NonNull
        public f a() {
            return new f(this.f332975a, this.f332976b, this.f332980f, this.f332981g, this.f332977c, this.f332978d, this.f332979e, this.f332982h, this.f332983i, this.f332984j, this.f332985k, this.f332986l, this.f332987m, Collections.unmodifiableMap(new HashMap(this.f332988n)));
        }

        @NonNull
        public b b(@p0 Map<String, String> map) {
            this.f332988n = net.openid.appauth.a.b(map, f.B);
            return this;
        }

        public b c(@NonNull i iVar) {
            this.f332975a = (i) t.g(iVar, "configuration cannot be null");
            return this;
        }

        @NonNull
        public b d(@NonNull String str) {
            this.f332976b = t.e(str, "client ID cannot be null or empty");
            return this;
        }

        @NonNull
        public b e(@p0 String str) {
            if (str == null) {
                this.f332984j = null;
                this.f332985k = null;
                this.f332986l = null;
                return this;
            }
            p.a(str);
            this.f332984j = str;
            this.f332985k = p.b(str);
            this.f332986l = p.e();
            return this;
        }

        @NonNull
        public b f(@p0 String str, @p0 String str2, @p0 String str3) {
            if (str != null) {
                p.a(str);
                t.e(str2, "code verifier challenge cannot be null or empty if verifier is set");
                t.e(str3, "code verifier challenge method cannot be null or empty if verifier is set");
            } else {
                t.b(str2 == null, "code verifier challenge must be null if verifier is null");
                t.b(str3 == null, "code verifier challenge method must be null if verifier is null");
            }
            this.f332984j = str;
            this.f332985k = str2;
            this.f332986l = str3;
            return this;
        }

        public b g(@p0 String str) {
            this.f332977c = t.h(str, "display must be null or not empty");
            return this;
        }

        public b h(@p0 String str) {
            this.f332978d = t.h(str, "login hint must be null or not empty");
            return this;
        }

        @NonNull
        public b i(@p0 String str) {
            this.f332979e = t.h(str, "prompt must be null or non-empty");
            return this;
        }

        @NonNull
        public b j(@p0 Iterable<String> iterable) {
            this.f332979e = net.openid.appauth.c.a(iterable);
            return this;
        }

        @NonNull
        public b k(@p0 String... strArr) {
            if (strArr != null) {
                return j(Arrays.asList(strArr));
            }
            this.f332979e = null;
            return this;
        }

        @NonNull
        public b l(@NonNull Uri uri) {
            this.f332981g = (Uri) t.g(uri, "redirect URI cannot be null or empty");
            return this;
        }

        @NonNull
        public b m(@p0 String str) {
            t.h(str, "responseMode must not be empty");
            this.f332987m = str;
            return this;
        }

        @NonNull
        public b n(@NonNull String str) {
            this.f332980f = t.e(str, "expected response type cannot be null or empty");
            return this;
        }

        @NonNull
        public b o(@p0 String str) {
            if (TextUtils.isEmpty(str)) {
                this.f332982h = null;
                return this;
            }
            q(str.split(" +"));
            return this;
        }

        @NonNull
        public b p(@p0 Iterable<String> iterable) {
            this.f332982h = net.openid.appauth.c.a(iterable);
            return this;
        }

        @NonNull
        public b q(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            p(Arrays.asList(strArr));
            return this;
        }

        @NonNull
        public b r(@p0 String str) {
            this.f332983i = t.h(str, "state cannot be empty if defined");
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f332989a = "page";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f332990b = "popup";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f332991c = "touch";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f332992d = "wap";
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f332993a = "none";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f332994b = "login";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f332995c = "consent";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f332996d = "select_account";
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f332997a = "query";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f332998b = "fragment";
    }

    /* JADX INFO: renamed from: net.openid.appauth.f$f, reason: collision with other inner class name */
    public static final class C2340f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f332999a = "address";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f333000b = "email";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f333001c = "offline_access";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f333002d = "openid";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f333003e = "phone";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f333004f = "profile";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    @NonNull
    public static f f(@NonNull String str) throws JSONException {
        t.g(str, "json string cannot be null");
        return g(new JSONObject(str));
    }

    @NonNull
    public static f g(@NonNull JSONObject jSONObject) throws JSONException {
        t.g(jSONObject, "json cannot be null");
        b bVarB = new b(i.f(jSONObject.getJSONObject("configuration")), r.d(jSONObject, "clientId"), r.d(jSONObject, H), r.i(jSONObject, I)).g(r.e(jSONObject, "display")).h(r.e(jSONObject, "login_hint")).i(r.e(jSONObject, "prompt")).r(r.e(jSONObject, "state")).f(r.e(jSONObject, L), r.e(jSONObject, M), r.e(jSONObject, N)).m(r.e(jSONObject, O)).b(r.h(jSONObject, P));
        if (jSONObject.has("scope")) {
            bVarB.p(net.openid.appauth.c.b(r.d(jSONObject, "scope")));
        }
        return bVarB.a();
    }

    public Set<String> d() {
        return net.openid.appauth.c.b(this.f332965e);
    }

    @p0
    public Set<String> e() {
        return net.openid.appauth.c.b(this.f332968h);
    }

    @NonNull
    public JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        r.p(jSONObject, "configuration", this.f332961a.g());
        r.n(jSONObject, "clientId", this.f332962b);
        r.n(jSONObject, H, this.f332966f);
        r.n(jSONObject, I, this.f332967g.toString());
        r.s(jSONObject, "display", this.f332963c);
        r.s(jSONObject, "login_hint", this.f332964d);
        r.s(jSONObject, "scope", this.f332968h);
        r.s(jSONObject, "prompt", this.f332965e);
        r.s(jSONObject, "state", this.f332969i);
        r.s(jSONObject, L, this.f332970j);
        r.s(jSONObject, M, this.f332971k);
        r.s(jSONObject, N, this.f332972l);
        r.s(jSONObject, O, this.f332973m);
        r.p(jSONObject, P, r.l(this.f332974n));
        return jSONObject;
    }

    public String i() {
        return h().toString();
    }

    @NonNull
    public Uri j() {
        Uri.Builder builderAppendQueryParameter = this.f332961a.f333056a.buildUpon().appendQueryParameter("redirect_uri", this.f332967g.toString()).appendQueryParameter("client_id", this.f332962b).appendQueryParameter("response_type", this.f332966f);
        net.openid.appauth.internal.b.a(builderAppendQueryParameter, "display", this.f332963c);
        net.openid.appauth.internal.b.a(builderAppendQueryParameter, "login_hint", this.f332964d);
        net.openid.appauth.internal.b.a(builderAppendQueryParameter, "prompt", this.f332965e);
        net.openid.appauth.internal.b.a(builderAppendQueryParameter, "state", this.f332969i);
        net.openid.appauth.internal.b.a(builderAppendQueryParameter, "scope", this.f332968h);
        net.openid.appauth.internal.b.a(builderAppendQueryParameter, f332958x, this.f332973m);
        if (this.f332970j != null) {
            builderAppendQueryParameter.appendQueryParameter("code_challenge", this.f332971k).appendQueryParameter("code_challenge_method", this.f332972l);
        }
        for (Map.Entry<String, String> entry : this.f332974n.entrySet()) {
            builderAppendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderAppendQueryParameter.build();
    }

    private f(@NonNull i iVar, @NonNull String str, @NonNull String str2, @NonNull Uri uri, @p0 String str3, @p0 String str4, @p0 String str5, @p0 String str6, @p0 String str7, @p0 String str8, @p0 String str9, @p0 String str10, @p0 String str11, @NonNull Map<String, String> map) {
        this.f332961a = iVar;
        this.f332962b = str;
        this.f332966f = str2;
        this.f332967g = uri;
        this.f332974n = map;
        this.f332963c = str3;
        this.f332964d = str4;
        this.f332965e = str5;
        this.f332968h = str6;
        this.f332969i = str7;
        this.f332970j = str8;
        this.f332971k = str9;
        this.f332972l = str10;
        this.f332973m = str11;
    }
}
