package net.openid.appauth;

import android.net.Uri;
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
public class w {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f333283j = "client_id";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f333290q = "request";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final String f333291r = "additionalParameters";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final v f333293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final String f333294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final Long f333295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f333296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final Long f333297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final String f333298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    public final Uri f333299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    public final String f333300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Map<String, String> f333301i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f333284k = "client_secret";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f333285l = "client_secret_expires_at";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f333286m = "registration_access_token";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f333287n = "registration_client_uri";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final String f333288o = "client_id_issued_at";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final String f333289p = "token_endpoint_auth_method";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Set<String> f333292s = new HashSet(Arrays.asList("client_id", f333284k, f333285l, f333286m, f333287n, f333288o, f333289p));

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private v f333302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private String f333303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private Long f333304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private String f333305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private Long f333306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private String f333307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private Uri f333308g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        private String f333309h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        private Map<String, String> f333310i = Collections.EMPTY_MAP;

        public b(@NonNull v vVar) {
            k(vVar);
        }

        public w a() {
            return new w(this.f333302a, this.f333303b, this.f333304c, this.f333305d, this.f333306e, this.f333307f, this.f333308g, this.f333309h, this.f333310i);
        }

        @NonNull
        public b b(@NonNull JSONObject jSONObject) throws JSONException, c {
            e(r.d(jSONObject, "client_id"));
            f(r.c(jSONObject, w.f333288o));
            if (jSONObject.has(w.f333284k)) {
                if (!jSONObject.has(w.f333285l)) {
                    throw new c(w.f333285l);
                }
                g(jSONObject.getString(w.f333284k));
                h(Long.valueOf(jSONObject.getLong(w.f333285l)));
            }
            String str = w.f333286m;
            if (jSONObject.has(w.f333286m) != jSONObject.has(w.f333287n)) {
                if (jSONObject.has(w.f333286m)) {
                    str = w.f333287n;
                }
                throw new c(str);
            }
            i(r.e(jSONObject, w.f333286m));
            j(r.j(jSONObject, w.f333287n));
            l(r.e(jSONObject, w.f333289p));
            d(net.openid.appauth.a.d(jSONObject, w.f333292s));
            return this;
        }

        @NonNull
        public b c(@NonNull String str) throws JSONException, c {
            t.e(str, "json cannot be null or empty");
            return b(new JSONObject(str));
        }

        public b d(Map<String, String> map) {
            this.f333310i = net.openid.appauth.a.b(map, w.f333292s);
            return this;
        }

        public b e(@NonNull String str) {
            t.e(str, "client ID cannot be null or empty");
            this.f333303b = str;
            return this;
        }

        public b f(@p0 Long l10) {
            this.f333304c = l10;
            return this;
        }

        public b g(@p0 String str) {
            this.f333305d = str;
            return this;
        }

        public b h(@p0 Long l10) {
            this.f333306e = l10;
            return this;
        }

        public b i(@p0 String str) {
            this.f333307f = str;
            return this;
        }

        public b j(@p0 Uri uri) {
            this.f333308g = uri;
            return this;
        }

        @NonNull
        public b k(@NonNull v vVar) {
            this.f333302a = (v) t.g(vVar, "request cannot be null");
            return this;
        }

        public b l(@p0 String str) {
            this.f333309h = str;
            return this;
        }
    }

    public static class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f333311a;

        public c(String str) {
            super("Missing mandatory registration field: " + str);
            this.f333311a = str;
        }

        public String a() {
            return this.f333311a;
        }
    }

    @NonNull
    public static w b(@NonNull v vVar, @NonNull String str) throws JSONException, c {
        t.e(str, "jsonStr cannot be null or empty");
        return c(vVar, new JSONObject(str));
    }

    @NonNull
    public static w c(@NonNull v vVar, @NonNull JSONObject jSONObject) throws JSONException, c {
        t.g(vVar, "registration request cannot be null");
        return new b(vVar).b(jSONObject).a();
    }

    @NonNull
    public static w f(@NonNull String str) throws JSONException {
        t.e(str, "jsonStr cannot be null or empty");
        return g(new JSONObject(str));
    }

    public static w g(@NonNull JSONObject jSONObject) throws JSONException {
        t.g(jSONObject, "json cannot be null");
        if (jSONObject.has("request")) {
            return new b(v.c(jSONObject.getJSONObject("request"))).e(r.d(jSONObject, "client_id")).f(r.c(jSONObject, f333288o)).g(r.e(jSONObject, f333284k)).h(r.c(jSONObject, f333285l)).i(r.e(jSONObject, f333286m)).j(r.j(jSONObject, f333287n)).l(r.e(jSONObject, f333289p)).d(r.h(jSONObject, f333291r)).a();
        }
        throw new IllegalArgumentException("registration request not found in JSON");
    }

    public boolean d() {
        return e(y.f333315a);
    }

    @l1
    boolean e(@NonNull o oVar) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(((o) t.f(oVar)).a());
        Long l10 = this.f333297e;
        return l10 != null && seconds > l10.longValue();
    }

    @NonNull
    public JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        r.p(jSONObject, "request", this.f333293a.d());
        r.n(jSONObject, "client_id", this.f333294b);
        r.r(jSONObject, f333288o, this.f333295c);
        r.s(jSONObject, f333284k, this.f333296d);
        r.r(jSONObject, f333285l, this.f333297e);
        r.s(jSONObject, f333286m, this.f333298f);
        r.q(jSONObject, f333287n, this.f333299g);
        r.s(jSONObject, f333289p, this.f333300h);
        r.p(jSONObject, f333291r, r.l(this.f333301i));
        return jSONObject;
    }

    @NonNull
    public String i() {
        return h().toString();
    }

    private w(@NonNull v vVar, @NonNull String str, @p0 Long l10, @p0 String str2, @p0 Long l11, @p0 String str3, @p0 Uri uri, @p0 String str4, @NonNull Map<String, String> map) {
        this.f333293a = vVar;
        this.f333294b = str;
        this.f333295c = l10;
        this.f333296d = str2;
        this.f333297e = l11;
        this.f333298f = str3;
        this.f333299g = uri;
        this.f333300h = str4;
        this.f333301i = map;
    }
}
