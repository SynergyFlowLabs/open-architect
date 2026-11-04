package net.openid.appauth;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f333256i = "native";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f333257j = "redirect_uris";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f333258k = "response_types";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f333259l = "grant_types";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f333260m = "application_type";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f333261n = "subject_type";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final String f333262o = "token_endpoint_auth_method";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Set<String> f333263p = net.openid.appauth.a.a(f333257j, f333258k, f333259l, f333260m, f333261n, f333262o);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f333264q = "additionalParameters";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final String f333265r = "configuration";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f333266s = "pairwise";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f333267t = "public";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final i f333268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<Uri> f333269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final String f333270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final List<String> f333271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final List<String> f333272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final String f333273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    public final String f333274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Map<String, String> f333275h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private i f333276a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private List<String> f333278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private List<String> f333279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private String f333280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private String f333281f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private List<Uri> f333277b = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        private Map<String, String> f333282g = Collections.EMPTY_MAP;

        public b(@NonNull i iVar, @NonNull List<Uri> list) {
            c(iVar);
            f(list);
        }

        @NonNull
        public v a() {
            i iVar = this.f333276a;
            List listUnmodifiableList = Collections.unmodifiableList(this.f333277b);
            List<String> listUnmodifiableList2 = this.f333278c;
            if (listUnmodifiableList2 != null) {
                listUnmodifiableList2 = Collections.unmodifiableList(listUnmodifiableList2);
            }
            List<String> listUnmodifiableList3 = this.f333279d;
            if (listUnmodifiableList3 != null) {
                listUnmodifiableList3 = Collections.unmodifiableList(listUnmodifiableList3);
            }
            return new v(iVar, listUnmodifiableList, listUnmodifiableList2, listUnmodifiableList3, this.f333280e, this.f333281f, Collections.unmodifiableMap(this.f333282g));
        }

        @NonNull
        public b b(@p0 Map<String, String> map) {
            this.f333282g = net.openid.appauth.a.b(map, v.f333263p);
            return this;
        }

        @NonNull
        public b c(@NonNull i iVar) {
            this.f333276a = (i) t.f(iVar);
            return this;
        }

        @NonNull
        public b d(@p0 List<String> list) {
            this.f333279d = list;
            return this;
        }

        @NonNull
        public b e(@p0 String... strArr) {
            return d(Arrays.asList(strArr));
        }

        @NonNull
        public b f(@NonNull List<Uri> list) {
            t.d(list, "redirectUriValues cannot be null");
            this.f333277b = list;
            return this;
        }

        @NonNull
        public b g(@NonNull Uri... uriArr) {
            return f(Arrays.asList(uriArr));
        }

        @NonNull
        public b h(@p0 List<String> list) {
            this.f333278c = list;
            return this;
        }

        @NonNull
        public b i(@p0 String... strArr) {
            return h(Arrays.asList(strArr));
        }

        @NonNull
        public b j(@p0 String str) {
            this.f333280e = str;
            return this;
        }

        @NonNull
        public b k(@p0 String str) {
            this.f333281f = str;
            return this;
        }
    }

    public static v b(@NonNull String str) throws JSONException {
        t.e(str, "jsonStr must not be empty or null");
        return c(new JSONObject(str));
    }

    public static v c(@NonNull JSONObject jSONObject) throws JSONException {
        t.g(jSONObject, "json must not be null");
        return new b(i.f(jSONObject.getJSONObject("configuration")), r.k(jSONObject, f333257j)).j(r.e(jSONObject, f333261n)).h(r.g(jSONObject, f333258k)).d(r.g(jSONObject, f333259l)).b(r.h(jSONObject, f333264q)).a();
    }

    private JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        r.o(jSONObject, f333257j, r.u(this.f333269b));
        r.n(jSONObject, f333260m, this.f333270c);
        List<String> list = this.f333271d;
        if (list != null) {
            r.o(jSONObject, f333258k, r.u(list));
        }
        List<String> list2 = this.f333272e;
        if (list2 != null) {
            r.o(jSONObject, f333259l, r.u(list2));
        }
        r.s(jSONObject, f333261n, this.f333273f);
        r.s(jSONObject, f333262o, this.f333274g);
        return jSONObject;
    }

    @NonNull
    public JSONObject d() {
        JSONObject jSONObjectE = e();
        r.p(jSONObjectE, "configuration", this.f333268a.g());
        r.p(jSONObjectE, f333264q, r.l(this.f333275h));
        return jSONObjectE;
    }

    @NonNull
    public String f() {
        return d().toString();
    }

    @NonNull
    public String g() {
        JSONObject jSONObjectE = e();
        for (Map.Entry<String, String> entry : this.f333275h.entrySet()) {
            r.n(jSONObjectE, entry.getKey(), entry.getValue());
        }
        return jSONObjectE.toString();
    }

    private v(@NonNull i iVar, @NonNull List<Uri> list, @p0 List<String> list2, @p0 List<String> list3, @p0 String str, @p0 String str2, @NonNull Map<String, String> map) {
        this.f333268a = iVar;
        this.f333269b = list;
        this.f333271d = list2;
        this.f333272e = list3;
        this.f333273f = str;
        this.f333274g = str2;
        this.f333275h = map;
        this.f333270c = "native";
    }
}
