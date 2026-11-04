package androidx.media3.datasource;

import android.net.Uri;
import com.google.common.collect.g5;
import com.google.common.collect.n6;
import com.google.common.collect.z9;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.superwall.sdk.network.Api;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class a0 extends e implements g0 {
    private static final int A = 308;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62262v = 8000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62263w = 8000;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f62264x = "DefaultHttpDataSource";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f62265y = 20;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f62266z = 307;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f62267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f62268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f62269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f62270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f62271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private final g0.g f62272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g0.g f62273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.common.base.k0<String> f62274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f62275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    private x f62276o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private HttpURLConnection f62277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.p0
    private InputStream f62278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f62279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f62280s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f62281t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f62282u;

    public static final class b implements g0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private r1 f62284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.common.base.k0<String> f62285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private String f62286d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f62289g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f62290h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f62291i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g0.g f62283a = new g0.g();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f62287e = 8000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f62288f = 8000;

        @Override // androidx.media3.datasource.g0.c, androidx.media3.datasource.p.a
        @androidx.media3.common.util.b1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a0 a() {
            a0 a0Var = new a0(this.f62286d, this.f62287e, this.f62288f, this.f62289g, this.f62290h, this.f62283a, this.f62285c, this.f62291i);
            r1 r1Var = this.f62284b;
            if (r1Var != null) {
                a0Var.s(r1Var);
            }
            return a0Var;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b d(boolean z10) {
            this.f62289g = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b e(int i10) {
            this.f62287e = i10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b f(@androidx.annotation.p0 com.google.common.base.k0<String> k0Var) {
            this.f62285c = k0Var;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b g(boolean z10) {
            this.f62290h = z10;
            return this;
        }

        @Override // androidx.media3.datasource.g0.c
        @androidx.media3.common.util.b1
        @z7.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b b(Map<String, String> map) {
            this.f62283a.b(map);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b i(boolean z10) {
            this.f62291i = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b j(int i10) {
            this.f62288f = i10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b k(@androidx.annotation.p0 r1 r1Var) {
            this.f62284b = r1Var;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b l(@androidx.annotation.p0 String str) {
            this.f62286d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends g5<String, List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, List<String>> f62292a;

        public c(Map<String, List<String>> map) {
            this.f62292a = map;
        }

        public static /* synthetic */ boolean c1(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean f1(String str) {
            return str != null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.g5, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public Map<String, List<String>> i1() {
            return this.f62292a;
        }

        @Override // com.google.common.collect.g5, java.util.Map
        public boolean containsKey(@androidx.annotation.p0 Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.g5, java.util.Map
        public boolean containsValue(@androidx.annotation.p0 Object obj) {
            return super.S0(obj);
        }

        @Override // com.google.common.collect.g5, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return z9.i(super.entrySet(), new com.google.common.base.k0() { // from class: androidx.media3.datasource.b0
                @Override // com.google.common.base.k0
                public final boolean apply(Object obj) {
                    return a0.c.c1((Map.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.g5, java.util.Map
        public boolean equals(@androidx.annotation.p0 Object obj) {
            return obj != null && super.V0(obj);
        }

        @Override // com.google.common.collect.g5, java.util.Map
        public int hashCode() {
            return super.W0();
        }

        @Override // com.google.common.collect.g5, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.google.common.collect.g5, java.util.Map
        public Set<String> keySet() {
            return z9.i(super.keySet(), new com.google.common.base.k0() { // from class: androidx.media3.datasource.c0
                @Override // com.google.common.base.k0
                public final boolean apply(Object obj) {
                    return a0.c.f1((String) obj);
                }
            });
        }

        @Override // com.google.common.collect.g5, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.google.common.collect.g5, java.util.Map
        @androidx.annotation.p0
        public List<String> get(@androidx.annotation.p0 Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }
    }

    private static boolean A(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(com.google.common.net.d.f119476b0));
    }

    private HttpURLConnection B(x xVar) throws IOException {
        URL url = new URL(xVar.f62594a.toString());
        int i10 = xVar.f62596c;
        byte[] bArr = xVar.f62597d;
        long j10 = xVar.f62600g;
        long j11 = xVar.f62601h;
        int i11 = 1;
        boolean zD = xVar.d(1);
        if (!this.f62267f && !this.f62268g && !this.f62275n) {
            return C(url, i10, bArr, j10, j11, zD, true, xVar.f62598e);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new g0.d(new NoRouteToHostException("Too many redirects: " + i13), xVar, androidx.media3.common.x0.f61834p1, 1);
            }
            HttpURLConnection httpURLConnectionC = C(url, i10, bArr, j10, j11, zD, false, xVar.f62598e);
            int responseCode = httpURLConnectionC.getResponseCode();
            String headerField = httpURLConnectionC.getHeaderField(com.google.common.net.d.f119539t0);
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionC.disconnect();
                url = z(url, headerField, xVar);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionC;
                }
                httpURLConnectionC.disconnect();
                if (!this.f62275n || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = z(url, headerField, xVar);
            }
            i12 = i13;
            i11 = 1;
        }
    }

    private HttpURLConnection C(URL url, int i10, @androidx.annotation.p0 byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionD = D(url);
        httpURLConnectionD.setConnectTimeout(this.f62269h);
        httpURLConnectionD.setReadTimeout(this.f62270i);
        HashMap map2 = new HashMap();
        g0.g gVar = this.f62272k;
        if (gVar != null) {
            map2.putAll(gVar.c());
        }
        map2.putAll(this.f62273l.c());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionD.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = g1.a(j10, j11);
        if (strA != null) {
            httpURLConnectionD.setRequestProperty(com.google.common.net.d.I, strA);
        }
        String str = this.f62271j;
        if (str != null) {
            httpURLConnectionD.setRequestProperty(com.google.common.net.d.P, str);
        }
        httpURLConnectionD.setRequestProperty(com.google.common.net.d.f119507j, z10 ? "gzip" : "identity");
        httpURLConnectionD.setInstanceFollowRedirects(z11);
        httpURLConnectionD.setDoOutput(bArr != null);
        httpURLConnectionD.setRequestMethod(x.c(i10));
        if (bArr == null) {
            httpURLConnectionD.connect();
            return httpURLConnectionD;
        }
        httpURLConnectionD.setFixedLengthStreamingMode(bArr.length);
        httpURLConnectionD.connect();
        OutputStream outputStream = httpURLConnectionD.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnectionD;
    }

    private int E(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f62281t;
        if (j10 != -1) {
            long j11 = j10 - this.f62282u;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) androidx.media3.common.util.k1.o(this.f62278q)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f62282u += (long) i12;
        u(i12);
        return i12;
    }

    private void F(long j10, x xVar) throws IOException {
        if (j10 != 0) {
            byte[] bArr = new byte[4096];
            while (j10 > 0) {
                int i10 = ((InputStream) androidx.media3.common.util.k1.o(this.f62278q)).read(bArr, 0, (int) Math.min(j10, 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new g0.d(new InterruptedIOException(), xVar, 2000, 1);
                }
                if (i10 == -1) {
                    throw new g0.d(xVar, 2008, 1);
                }
                j10 -= (long) i10;
                u(i10);
            }
        }
    }

    private void y() {
        HttpURLConnection httpURLConnection = this.f62277p;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                androidx.media3.common.util.z.e(f62264x, "Unexpected error while disconnecting", e10);
            }
        }
    }

    private URL z(URL url, @androidx.annotation.p0 String str, x xVar) throws g0.d {
        if (str == null) {
            throw new g0.d("Null location redirect", xVar, androidx.media3.common.x0.f61834p1, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!Api.scheme.equals(protocol) && !"http".equals(protocol)) {
                throw new g0.d("Unsupported protocol redirect: " + protocol, xVar, androidx.media3.common.x0.f61834p1, 1);
            }
            if (this.f62267f || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f62268g) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e10) {
                    throw new g0.d(e10, xVar, androidx.media3.common.x0.f61834p1, 1);
                }
            }
            throw new g0.d("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", xVar, androidx.media3.common.x0.f61834p1, 1);
        } catch (MalformedURLException e11) {
            throw new g0.d(e11, xVar, androidx.media3.common.x0.f61834p1, 1);
        }
    }

    @androidx.annotation.l1
    HttpURLConnection D(URL url) throws IOException {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public Map<String, List<String>> a() {
        HttpURLConnection httpURLConnection = this.f62277p;
        return httpURLConnection == null ? n6.q() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public long c(x xVar) throws g0.d {
        byte[] bArrU;
        this.f62276o = xVar;
        long j10 = 0;
        this.f62282u = 0L;
        this.f62281t = 0L;
        w(xVar);
        try {
            HttpURLConnection httpURLConnectionB = B(xVar);
            this.f62277p = httpURLConnectionB;
            this.f62280s = httpURLConnectionB.getResponseCode();
            String responseMessage = httpURLConnectionB.getResponseMessage();
            int i10 = this.f62280s;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionB.getHeaderFields();
                if (this.f62280s == 416) {
                    if (xVar.f62600g == g1.c(httpURLConnectionB.getHeaderField(com.google.common.net.d.f119492f0))) {
                        this.f62279r = true;
                        x(xVar);
                        long j11 = xVar.f62601h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionB.getErrorStream();
                try {
                    bArrU = errorStream != null ? com.google.common.io.h.u(errorStream) : androidx.media3.common.util.k1.f61545f;
                } catch (IOException unused) {
                    bArrU = androidx.media3.common.util.k1.f61545f;
                }
                byte[] bArr = bArrU;
                y();
                throw new g0.f(this.f62280s, responseMessage, this.f62280s == 416 ? new u(2008) : null, headerFields, xVar, bArr);
            }
            String contentType = httpURLConnectionB.getContentType();
            com.google.common.base.k0<String> k0Var = this.f62274m;
            if (k0Var != null && !k0Var.apply(contentType)) {
                y();
                throw new g0.e(contentType, xVar);
            }
            if (this.f62280s == 200) {
                long j12 = xVar.f62600g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zA = A(httpURLConnectionB);
            if (zA) {
                this.f62281t = xVar.f62601h;
            } else {
                long j13 = xVar.f62601h;
                if (j13 != -1) {
                    this.f62281t = j13;
                } else {
                    long jB = g1.b(httpURLConnectionB.getHeaderField("Content-Length"), httpURLConnectionB.getHeaderField(com.google.common.net.d.f119492f0));
                    this.f62281t = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f62278q = httpURLConnectionB.getInputStream();
                if (zA) {
                    this.f62278q = new GZIPInputStream(this.f62278q);
                }
                this.f62279r = true;
                x(xVar);
                try {
                    F(j10, xVar);
                    return this.f62281t;
                } catch (IOException e10) {
                    y();
                    if (e10 instanceof g0.d) {
                        throw ((g0.d) e10);
                    }
                    throw new g0.d(e10, xVar, 2000, 1);
                }
            } catch (IOException e11) {
                y();
                throw new g0.d(e11, xVar, 2000, 1);
            }
        } catch (IOException e12) {
            y();
            throw g0.d.c(e12, xVar, 1);
        }
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public void close() throws g0.d {
        try {
            InputStream inputStream = this.f62278q;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new g0.d(e10, (x) androidx.media3.common.util.k1.o(this.f62276o), 2000, 3);
                }
            }
            this.f62278q = null;
            y();
            if (this.f62279r) {
                this.f62279r = false;
                v();
            }
            this.f62277p = null;
            this.f62276o = null;
        } catch (Throwable th2) {
            this.f62278q = null;
            y();
            if (this.f62279r) {
                this.f62279r = false;
                v();
            }
            this.f62277p = null;
            this.f62276o = null;
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public int f() {
        int i10;
        if (this.f62277p != null && (i10 = this.f62280s) > 0) {
            return i10;
        }
        return -1;
    }

    @Override // androidx.media3.datasource.p
    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f62277p;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        x xVar = this.f62276o;
        if (xVar != null) {
            return xVar.f62594a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public void h() {
        this.f62273l.a();
    }

    @Override // androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public void j(String str, String str2) {
        androidx.media3.common.util.a.g(str);
        androidx.media3.common.util.a.g(str2);
        this.f62273l.e(str, str2);
    }

    @Override // androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public void q(String str) {
        androidx.media3.common.util.a.g(str);
        this.f62273l.d(str);
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    @androidx.media3.common.util.b1
    public int read(byte[] bArr, int i10, int i11) throws g0.d {
        try {
            return E(bArr, i10, i11);
        } catch (IOException e10) {
            throw g0.d.c(e10, (x) androidx.media3.common.util.k1.o(this.f62276o), 2);
        }
    }

    private a0(@androidx.annotation.p0 String str, int i10, int i11, boolean z10, boolean z11, @androidx.annotation.p0 g0.g gVar, @androidx.annotation.p0 com.google.common.base.k0<String> k0Var, boolean z12) {
        super(true);
        this.f62271j = str;
        this.f62269h = i10;
        this.f62270i = i11;
        this.f62267f = z10;
        this.f62268g = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f62272k = gVar;
        this.f62274m = k0Var;
        this.f62273l = new g0.g();
        this.f62275n = z12;
    }
}
