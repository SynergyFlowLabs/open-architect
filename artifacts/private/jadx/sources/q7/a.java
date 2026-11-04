package q7;

import com.google.api.client.json.d;
import com.google.api.client.util.e;
import com.google.api.client.util.f;
import com.google.api.client.util.h0;
import com.google.api.client.util.i0;
import com.google.api.client.util.n0;
import com.google.api.client.util.v;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public class a extends q7.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f350258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f350259d;

    /* JADX INFO: renamed from: q7.a$a, reason: collision with other inner class name */
    public static class C2463a extends q7.b.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @v("alg")
        private String f350260f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @v("jku")
        private String f350261g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @v("jwk")
        private String f350262h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @v("kid")
        private String f350263i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @v("x5u")
        private String f350264j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @v("x5t")
        private String f350265k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @v("x5c")
        private List<String> f350266l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @v("crit")
        private List<String> f350267m;

        @Deprecated
        public final String A() {
            List<String> list = this.f350266l;
            if (list != null && !list.isEmpty()) {
                return this.f350266l.get(0);
            }
            return null;
        }

        public final List<String> B() {
            return this.f350266l;
        }

        public final String C() {
            return this.f350265k;
        }

        public final String D() {
            return this.f350264j;
        }

        @Override // q7.b.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C2463a e(String str, Object obj) {
            return (C2463a) super.e(str, obj);
        }

        public C2463a F(String str) {
            this.f350260f = str;
            return this;
        }

        public C2463a G(List<String> list) {
            this.f350267m = list;
            return this;
        }

        public C2463a H(String str) {
            this.f350262h = str;
            return this;
        }

        public C2463a I(String str) {
            this.f350261g = str;
            return this;
        }

        public C2463a J(String str) {
            this.f350263i = str;
            return this;
        }

        @Override // q7.b.a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public C2463a s(String str) {
            super.s(str);
            return this;
        }

        @Deprecated
        public C2463a L(String str) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            this.f350266l = arrayList;
            return this;
        }

        public C2463a M(List<String> list) {
            this.f350266l = list;
            return this;
        }

        public C2463a O(String str) {
            this.f350265k = str;
            return this;
        }

        public C2463a P(String str) {
            this.f350264j = str;
            return this;
        }

        @Override // q7.b.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C2463a clone() {
            return (C2463a) super.clone();
        }

        public final String u() {
            return this.f350260f;
        }

        public final List<String> v() {
            return this.f350267m;
        }

        public final String w() {
            return this.f350262h;
        }

        public final String x() {
            return this.f350261g;
        }

        public final String z() {
            return this.f350263i;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f350268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Class<? extends C2463a> f350269b = C2463a.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class<? extends q7.b.C2464b> f350270c = q7.b.C2464b.class;

        public b(d dVar) {
            this.f350268a = (d) h0.d(dVar);
        }

        public Class<? extends C2463a> a() {
            return this.f350269b;
        }

        public d b() {
            return this.f350268a;
        }

        public Class<? extends q7.b.C2464b> c() {
            return this.f350270c;
        }

        public a d(String str) throws IOException {
            int iIndexOf = str.indexOf(46);
            h0.a(iIndexOf != -1);
            byte[] bArrA = e.a(str.substring(0, iIndexOf));
            int i10 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(46, i10);
            h0.a(iIndexOf2 != -1);
            int i11 = iIndexOf2 + 1;
            h0.a(str.indexOf(46, i11) == -1);
            byte[] bArrA2 = e.a(str.substring(i10, iIndexOf2));
            byte[] bArrA3 = e.a(str.substring(i11));
            byte[] bArrA4 = n0.a(str.substring(0, iIndexOf2));
            C2463a c2463a = (C2463a) this.f350268a.h(new ByteArrayInputStream(bArrA), this.f350269b);
            h0.a(c2463a.u() != null);
            return new a(c2463a, (q7.b.C2464b) this.f350268a.h(new ByteArrayInputStream(bArrA2), this.f350270c), bArrA3, bArrA4);
        }

        public b e(Class<? extends C2463a> cls) {
            this.f350269b = cls;
            return this;
        }

        public b f(Class<? extends q7.b.C2464b> cls) {
            this.f350270c = cls;
            return this;
        }
    }

    public a(C2463a c2463a, q7.b.C2464b c2464b, byte[] bArr, byte[] bArr2) {
        super(c2463a, c2464b);
        this.f350258c = (byte[]) h0.d(bArr);
        this.f350259d = (byte[]) h0.d(bArr2);
    }

    private static X509TrustManager c() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
        } catch (KeyStoreException | NoSuchAlgorithmException unused) {
        }
        return null;
    }

    public static a g(d dVar, String str) throws IOException {
        return h(dVar).d(str);
    }

    public static b h(d dVar) {
        return new b(dVar);
    }

    public static String i(PrivateKey privateKey, d dVar, C2463a c2463a, q7.b.C2464b c2464b) throws GeneralSecurityException, IOException {
        String str = e.f(dVar.l(c2463a)) + "." + e.f(dVar.l(c2464b));
        return str + "." + e.f(i0.l(i0.g(), privateKey, n0.a(str)));
    }

    @Override // q7.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C2463a a() {
        return (C2463a) super.a();
    }

    public final byte[] e() {
        return this.f350258c;
    }

    public final byte[] f() {
        return this.f350259d;
    }

    @f
    public final X509Certificate j() throws GeneralSecurityException {
        X509TrustManager x509TrustManagerC = c();
        if (x509TrustManagerC == null) {
            return null;
        }
        return k(x509TrustManagerC);
    }

    @f
    public final X509Certificate k(X509TrustManager x509TrustManager) throws GeneralSecurityException {
        List<String> listB = a().B();
        if (listB == null || listB.isEmpty() || !"RS256".equals(a().u())) {
            return null;
        }
        return i0.m(i0.g(), x509TrustManager, listB, this.f350258c, this.f350259d);
    }

    public final boolean l(PublicKey publicKey) throws GeneralSecurityException {
        if ("RS256".equals(a().u())) {
            return i0.n(i0.g(), publicKey, this.f350258c, this.f350259d);
        }
        return false;
    }
}
