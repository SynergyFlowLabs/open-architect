package net.openid.appauth;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    @l1
    static final r.e A;

    @l1
    static final r.f B;

    @l1
    static final r.e C;

    @l1
    static final r.e D;

    @l1
    static final r.a E;

    @l1
    static final r.a F;

    @l1
    static final r.a G;

    @l1
    static final r.a H;

    @l1
    static final r.f I;

    @l1
    static final r.f J;
    private static final List<String> K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l1
    static final r.d f333069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l1
    static final r.f f333070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l1
    static final r.f f333071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l1
    static final r.f f333072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l1
    static final r.f f333073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l1
    static final r.f f333074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @l1
    static final r.e f333075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l1
    static final r.e f333076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l1
    static final r.e f333077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l1
    static final r.e f333078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l1
    static final r.e f333079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l1
    static final r.e f333080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @l1
    static final r.e f333081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @l1
    static final r.e f333082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @l1
    static final r.e f333083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @l1
    static final r.e f333084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @l1
    static final r.e f333085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @l1
    static final r.e f333086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @l1
    static final r.e f333087t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @l1
    static final r.e f333088u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @l1
    static final r.e f333089v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @l1
    static final r.e f333090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @l1
    static final r.e f333091x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @l1
    static final r.e f333092y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @l1
    static final r.e f333093z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final JSONObject f333094a;

    public static class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f333095a;

        public a(String str) {
            super("Missing mandatory configuration field: " + str);
            this.f333095a = str;
        }

        public String a() {
            return this.f333095a;
        }
    }

    static {
        r.d dVarM = M("issuer");
        f333069b = dVarM;
        r.f fVarP = P("authorization_endpoint");
        f333070c = fVarP;
        f333071d = P("token_endpoint");
        f333072e = P("userinfo_endpoint");
        r.f fVarP2 = P("jwks_uri");
        f333073f = fVarP2;
        f333074g = P("registration_endpoint");
        f333075h = N("scopes_supported");
        r.e eVarN = N("response_types_supported");
        f333076i = eVarN;
        f333077j = N("response_modes_supported");
        f333078k = O("grant_types_supported", Arrays.asList(q.f333116a, q.f333117b));
        f333079l = N("acr_values_supported");
        r.e eVarN2 = N("subject_types_supported");
        f333080m = eVarN2;
        r.e eVarN3 = N("id_token_signing_alg_values_supported");
        f333081n = eVarN3;
        f333082o = N("id_token_encryption_enc_values_supported");
        f333083p = N("id_token_encryption_enc_values_supported");
        f333084q = N("userinfo_signing_alg_values_supported");
        f333085r = N("userinfo_encryption_alg_values_supported");
        f333086s = N("userinfo_encryption_enc_values_supported");
        f333087t = N("request_object_signing_alg_values_supported");
        f333088u = N("request_object_encryption_alg_values_supported");
        f333089v = N("request_object_encryption_enc_values_supported");
        f333090w = O("token_endpoint_auth_methods_supported", Collections.singletonList(m.f333103b));
        f333091x = N("token_endpoint_auth_signing_alg_values_supported");
        f333092y = N("display_values_supported");
        f333093z = O("claim_types_supported", Collections.singletonList("normal"));
        A = N("claims_supported");
        B = P("service_documentation");
        C = N("claims_locales_supported");
        D = N("ui_locales_supported");
        E = a("claims_parameter_supported", false);
        F = a("request_parameter_supported", false);
        G = a("request_uri_parameter_supported", true);
        H = a("require_request_uri_registration", false);
        I = P("op_policy_uri");
        J = P("op_tos_uri");
        K = Arrays.asList(dVarM.f333119a, fVarP.f333119a, fVarP2.f333119a, eVarN.f333121a, eVarN2.f333121a, eVarN3.f333121a);
    }

    public j(@NonNull JSONObject jSONObject) throws JSONException, a {
        this.f333094a = (JSONObject) t.f(jSONObject);
        for (String str : K) {
            if (!this.f333094a.has(str) || this.f333094a.get(str) == null) {
                throw new a(str);
            }
        }
    }

    private static r.d M(String str) {
        return new r.d(str);
    }

    private static r.e N(String str) {
        return new r.e(str);
    }

    private static r.e O(String str, List<String> list) {
        return new r.e(str, list);
    }

    private static r.f P(String str) {
        return new r.f(str);
    }

    private static r.a a(String str, boolean z10) {
        return new r.a(str, z10);
    }

    private <T> T b(r.b<T> bVar) {
        return (T) r.a(this.f333094a, bVar);
    }

    private <T> List<T> c(r.c<T> cVar) {
        return r.b(this.f333094a, cVar);
    }

    @p0
    public Uri A() {
        return (Uri) b(f333071d);
    }

    @NonNull
    public List<String> B() {
        return c(f333090w);
    }

    @p0
    public List<String> C() {
        return c(f333091x);
    }

    @p0
    public List<String> D() {
        return c(D);
    }

    @p0
    public List<String> E() {
        return c(f333085r);
    }

    @p0
    public List<String> F() {
        return c(f333086s);
    }

    @p0
    public Uri G() {
        return (Uri) b(f333072e);
    }

    @p0
    public List<String> H() {
        return c(f333084q);
    }

    public boolean I() {
        return ((Boolean) b(E)).booleanValue();
    }

    public boolean J() {
        return ((Boolean) b(F)).booleanValue();
    }

    public boolean K() {
        return ((Boolean) b(G)).booleanValue();
    }

    public boolean L() {
        return ((Boolean) b(H)).booleanValue();
    }

    public List<String> d() {
        return c(f333079l);
    }

    @NonNull
    public Uri e() {
        return (Uri) b(f333070c);
    }

    public List<String> f() {
        return c(f333093z);
    }

    @p0
    public List<String> g() {
        return c(C);
    }

    @p0
    public List<String> h() {
        return c(A);
    }

    @p0
    public List<String> i() {
        return c(f333092y);
    }

    @NonNull
    public List<String> j() {
        return c(f333078k);
    }

    @p0
    public List<String> k() {
        return c(f333082o);
    }

    @p0
    public List<String> l() {
        return c(f333083p);
    }

    @NonNull
    public List<String> m() {
        return c(f333081n);
    }

    @NonNull
    public String n() {
        return (String) b(f333069b);
    }

    @NonNull
    public Uri o() {
        return (Uri) b(f333073f);
    }

    @p0
    public Uri p() {
        return (Uri) b(I);
    }

    @p0
    public Uri q() {
        return (Uri) b(J);
    }

    @p0
    public Uri r() {
        return (Uri) b(f333074g);
    }

    @p0
    public List<String> s() {
        return c(f333088u);
    }

    @p0
    public List<String> t() {
        return c(f333089v);
    }

    public List<String> u() {
        return c(f333087t);
    }

    @p0
    public List<String> v() {
        return c(f333077j);
    }

    @NonNull
    public List<String> w() {
        return c(f333076i);
    }

    public List<String> x() {
        return c(f333075h);
    }

    @p0
    public Uri y() {
        return (Uri) b(B);
    }

    @NonNull
    public List<String> z() {
        return c(f333080m);
    }
}
