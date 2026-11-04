package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.s;
import com.google.api.client.auth.oauth2.t;
import com.google.api.client.http.b0;
import com.google.api.client.http.w;
import com.google.api.client.util.g0;
import com.google.api.client.util.h0;
import com.google.api.client.util.i0;
import com.google.api.client.util.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Collection;
import java.util.Collections;
import net.openid.appauth.q;

/* JADX INFO: loaded from: classes4.dex */
public class h extends com.google.api.client.auth.oauth2.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f115328t = "authorized_user";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final String f115329u = "service_account";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @com.google.api.client.util.f
    private static b f115330v = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f115331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f115332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Collection<String> f115333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PrivateKey f115334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f115335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f115336s;

    public static class a extends com.google.api.client.auth.oauth2.j.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        String f115337i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Collection<String> f115338j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        PrivateKey f115339k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f115340l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        String f115341m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f115342n;

        public a() {
            super(com.google.api.client.auth.oauth2.f.a());
            p(k.f115348b);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public a k(com.google.api.client.http.p pVar) {
            return (a) super.k(pVar);
        }

        public a B(g gVar) {
            g.a aVarN = gVar.n();
            k(new com.google.api.client.auth.oauth2.i(aVarN.o(), aVarN.p()));
            return this;
        }

        public a C(String str, String str2) {
            k(new com.google.api.client.auth.oauth2.i(str, str2));
            return this;
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public a l(com.google.api.client.util.l lVar) {
            return (a) super.l(lVar);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public a m(com.google.api.client.json.d dVar) {
            return (a) super.m(dVar);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public a n(Collection<com.google.api.client.auth.oauth2.k> collection) {
            return (a) super.n(collection);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public a o(w wVar) {
            return (a) super.o(wVar);
        }

        public a H(String str) {
            this.f115337i = str;
            return this;
        }

        public a I(PrivateKey privateKey) {
            this.f115339k = privateKey;
            return this;
        }

        public a J(File file) throws GeneralSecurityException, IOException {
            this.f115339k = i0.k(i0.c(), new FileInputStream(file), "notasecret", "privatekey", "notasecret");
            return this;
        }

        @com.google.api.client.util.f
        public a K(File file) throws GeneralSecurityException, IOException {
            this.f115339k = i0.e().generatePrivate(new PKCS8EncodedKeySpec(g0.c(new FileReader(file), "PRIVATE KEY").a()));
            return this;
        }

        @com.google.api.client.util.f
        public a L(String str) {
            this.f115340l = str;
            return this;
        }

        public a M(String str) {
            this.f115341m = str;
            return this;
        }

        public a N(Collection<String> collection) {
            this.f115338j = collection;
            return this;
        }

        public a O(String str) {
            this.f115342n = str;
            return this;
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public a p(String str) {
            return (a) super.p(str);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public a q(com.google.api.client.http.j jVar) {
            return (a) super.q(jVar);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public a r(b0 b0Var) {
            return (a) super.r(b0Var);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a a(com.google.api.client.auth.oauth2.k kVar) {
            return (a) super.a(kVar);
        }

        @Override // com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public h b() {
            return new h(this);
        }

        public final String u() {
            return this.f115337i;
        }

        public final PrivateKey v() {
            return this.f115339k;
        }

        @com.google.api.client.util.f
        public final String w() {
            return this.f115340l;
        }

        public final String x() {
            return this.f115341m;
        }

        public final Collection<String> y() {
            return this.f115338j;
        }

        public final String z() {
            return this.f115342n;
        }
    }

    public h() {
        this(new a());
    }

    @com.google.api.client.util.f
    private static h A(com.google.api.client.json.b bVar, b0 b0Var, com.google.api.client.json.d dVar) throws IOException {
        String str = (String) bVar.get("client_id");
        String str2 = (String) bVar.get("client_email");
        String str3 = (String) bVar.get("private_key");
        String str4 = (String) bVar.get("private_key_id");
        if (str == null || str2 == null || str3 == null || str4 == null) {
            throw new IOException("Error reading service account credential from stream, expecting  'client_id', 'client_email', 'private_key' and 'private_key_id'.");
        }
        a aVarL = new a().r(b0Var).m(dVar).H(str2).N(Collections.EMPTY_LIST).I(L(str3)).L(str4);
        String str5 = (String) bVar.get("token_uri");
        if (str5 != null) {
            aVarL.p(str5);
        }
        String str6 = (String) bVar.get("project_id");
        if (str6 != null) {
            aVarL.M(str6);
        }
        return aVarL.b();
    }

    @com.google.api.client.util.f
    private static h B(com.google.api.client.json.b bVar, b0 b0Var, com.google.api.client.json.d dVar) throws IOException {
        String str = (String) bVar.get("client_id");
        String str2 = (String) bVar.get("client_secret");
        String str3 = (String) bVar.get(q.f333118c);
        if (str == null || str2 == null || str3 == null) {
            throw new IOException("Error reading user credential from stream,  expecting 'client_id', 'client_secret' and 'refresh_token'.");
        }
        h hVarB = new a().C(str, str2).r(b0Var).m(dVar).b();
        hVarB.v(str3);
        hVarB.q();
        return hVarB;
    }

    @com.google.api.client.util.f
    public static h C() throws IOException {
        return D(com.google.api.client.googleapis.util.a.b(), com.google.api.client.googleapis.util.a.a());
    }

    @com.google.api.client.util.f
    public static h D(b0 b0Var, com.google.api.client.json.d dVar) throws IOException {
        h0.d(b0Var);
        h0.d(dVar);
        return f115330v.k(b0Var, dVar);
    }

    @com.google.api.client.util.f
    private static PrivateKey L(String str) throws IOException {
        g0.a aVarC = g0.c(new StringReader(str), "PRIVATE KEY");
        if (aVarC == null) {
            throw new IOException("Invalid PKCS8 data.");
        }
        try {
            return i0.e().generatePrivate(new PKCS8EncodedKeySpec(aVarC.a()));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e10) {
            throw ((IOException) o.a(new IOException("Unexpected exception reading PKCS data"), e10));
        }
    }

    @com.google.api.client.util.f
    public static h y(InputStream inputStream) throws IOException {
        return z(inputStream, com.google.api.client.googleapis.util.a.b(), com.google.api.client.googleapis.util.a.a());
    }

    @com.google.api.client.util.f
    public static h z(InputStream inputStream, b0 b0Var, com.google.api.client.json.d dVar) throws IOException {
        h0.d(inputStream);
        h0.d(b0Var);
        h0.d(dVar);
        com.google.api.client.json.b bVar = (com.google.api.client.json.b) new com.google.api.client.json.f(dVar).a(inputStream, o.f115365a, com.google.api.client.json.b.class);
        String str = (String) bVar.get("type");
        if (str == null) {
            throw new IOException("Error reading credentials from stream, 'type' field not specified.");
        }
        if (f115328t.equals(str)) {
            return B(bVar, b0Var, dVar);
        }
        if (f115329u.equals(str)) {
            return A(bVar, b0Var, dVar);
        }
        throw new IOException(String.format("Error reading credentials from stream, 'type' value '%s' not recognized. Expecting '%s' or '%s'.", str, f115328t, f115329u));
    }

    public final String E() {
        return this.f115331n;
    }

    public final PrivateKey F() {
        return this.f115334q;
    }

    @com.google.api.client.util.f
    public final String G() {
        return this.f115335r;
    }

    public final String H() {
        return this.f115332o;
    }

    public final Collection<String> I() {
        return this.f115333p;
    }

    public final String J() {
        if (this.f115333p == null) {
            return null;
        }
        return u.b(' ').a(this.f115333p);
    }

    public final String K() {
        return this.f115336s;
    }

    @Override // com.google.api.client.auth.oauth2.j
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public h r(String str) {
        return (h) super.r(str);
    }

    @Override // com.google.api.client.auth.oauth2.j
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public h s(Long l10) {
        return (h) super.s(l10);
    }

    @Override // com.google.api.client.auth.oauth2.j
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public h t(Long l10) {
        return (h) super.t(l10);
    }

    @Override // com.google.api.client.auth.oauth2.j
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public h u(t tVar) {
        return (h) super.u(tVar);
    }

    @Override // com.google.api.client.auth.oauth2.j
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public h v(String str) {
        if (str != null) {
            h0.b((j() == null || p() == null || f() == null) ? false : true, "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
        }
        return (h) super.v(str);
    }

    @Override // com.google.api.client.auth.oauth2.j
    @com.google.api.client.util.f
    protected t d() throws IOException {
        if (this.f115334q == null) {
            return super.d();
        }
        q7.a.C2463a c2463a = new q7.a.C2463a();
        c2463a.F("RS256");
        c2463a.s("JWT");
        c2463a.J(this.f115335r);
        q7.b.C2464b c2464b = new q7.b.C2464b();
        long jCurrentTimeMillis = g().currentTimeMillis();
        c2464b.C(this.f115331n);
        c2464b.z(o());
        long j10 = jCurrentTimeMillis / 1000;
        c2464b.B(Long.valueOf(j10));
        c2464b.A(Long.valueOf(j10 + 3600));
        c2464b.F(this.f115336s);
        c2464b.put("scope", u.b(' ').a(this.f115333p));
        try {
            String strI = q7.a.i(this.f115334q, j(), c2463a, c2464b);
            s sVar = new s(p(), j(), new com.google.api.client.http.j(o()), "urn:ietf:params:oauth:grant-type:jwt-bearer");
            sVar.put("assertion", strI);
            return sVar.g();
        } catch (GeneralSecurityException e10) {
            IOException iOException = new IOException();
            iOException.initCause(e10);
            throw iOException;
        }
    }

    @com.google.api.client.util.f
    public h w(Collection<String> collection) {
        return this.f115334q == null ? this : new a().I(this.f115334q).L(this.f115335r).H(this.f115331n).M(this.f115332o).O(this.f115336s).N(collection).p(o()).r(p()).m(j()).l(g()).b();
    }

    @com.google.api.client.util.f
    public boolean x() {
        if (this.f115334q == null) {
            return false;
        }
        Collection<String> collection = this.f115333p;
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    protected h(a aVar) {
        super(aVar);
        if (aVar.f115339k == null) {
            h0.a(aVar.f115337i == null && aVar.f115338j == null && aVar.f115342n == null);
            return;
        }
        this.f115331n = (String) h0.d(aVar.f115337i);
        this.f115332o = aVar.f115341m;
        Collection<String> collection = aVar.f115338j;
        this.f115333p = collection == null ? Collections.EMPTY_LIST : Collections.unmodifiableCollection(collection);
        this.f115334q = aVar.f115339k;
        this.f115335r = aVar.f115340l;
        this.f115336s = aVar.f115342n;
    }
}
