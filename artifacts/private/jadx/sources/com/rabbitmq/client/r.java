package com.rabbitmq.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes13.dex */
public class r implements Cloneable {
    public static final String A3 = "localhost";
    public static final int B3 = -1;
    public static final int C3 = 5672;
    public static final int D3 = 5671;
    public static final int E3 = 60000;
    public static final int F3 = 10000;
    public static final int G3 = 10000;
    public static final long I3 = 5000;
    public static final int J3 = -1;
    private static final String K3 = "TLSv1.2";
    private static final String L3 = "TLSv1";

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final int f265983t3 = 65535;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final String f265984u3 = "guest";

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final String f265985v3 = "guest";

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final String f265986w3 = "/";

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final int f265987x3 = 2047;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final int f265988y3 = 0;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final int f265989z3 = 60;
    private p0 H1;
    private ExecutorService Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private com.rabbitmq.client.impl.u0 f265997g3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private x1 f266001i3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private com.rabbitmq.client.impl.p0 f266007l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ExecutorService f266008m;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private com.rabbitmq.client.impl.recovery.i0 f266011n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ExecutorService f266012o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private Predicate<l1> f266013o3;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private x0 f266015p1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private com.rabbitmq.client.impl.recovery.g0 f266017p3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private com.rabbitmq.client.impl.f0 f266019r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ScheduledExecutorService f266020s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final org.slf4j.c f265982s3 = org.slf4j.e.k(r.class);
    public static final int H3 = (int) TimeUnit.MINUTES.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f265990a = "/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f265991b = A3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f265992c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f265993d = f265987x3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f265994e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f265995f = 60;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f265996g = 60000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f265998h = 10000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f266000i = 10000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f266002j = com.rabbitmq.client.impl.i.o0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SocketFactory f266004k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private h1 f266006l = y.f266063b;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ThreadFactory f266010n = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private s1 f266021t = w1.d();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private g0 f266022v = new com.rabbitmq.client.impl.n0();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.rabbitmq.client.impl.e0 f266023w = new com.rabbitmq.client.impl.g0("guest", "guest");
    private boolean X = true;
    private boolean Y = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private long f266014p0 = 5000;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f266016p2 = false;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private com.rabbitmq.client.impl.nio.r f265999h3 = new com.rabbitmq.client.impl.nio.r();

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private int f266003j3 = H3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private boolean f266005k3 = false;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private int f266009m3 = -1;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private g2 f266018q3 = g2.f265096a;

    public static /* synthetic */ SSLContext a(SSLContext sSLContext, String str) {
        return sSLContext;
    }

    private static String b1(String str) {
        try {
            return URLDecoder.decode(str.replace(org.slf4j.h.f339615a3, "%2B"), "US-ASCII");
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String c(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (K3.equalsIgnoreCase(str)) {
                    return str;
                }
            }
        }
        return L3;
    }

    public static int j(int i10) {
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 65535) {
            return 65535;
        }
        return i10;
    }

    public static int l0(int i10, boolean z10) {
        if (i10 != -1) {
            return i10;
        }
        if (z10) {
            return D3;
        }
        return 5672;
    }

    public int A() {
        return this.f265995f;
    }

    public void A0(int i10) {
        this.f266014p0 = i10;
    }

    public h1 B() {
        return this.f266006l;
    }

    public void B0(long j10) {
        this.f266014p0 = j10;
    }

    public int C() {
        return this.f266000i;
    }

    public void C0(com.rabbitmq.client.impl.nio.r rVar) {
        this.f265999h3 = rVar;
    }

    public s1 D() {
        return this.f266021t;
    }

    public void D0(String str) {
        this.f266023w = new com.rabbitmq.client.impl.g0(this.f266023w.d(), str);
    }

    public SocketFactory E() {
        return this.f266004k;
    }

    public void E0(int i10) {
        this.f265992c = i10;
    }

    public ThreadFactory F() {
        return this.f266010n;
    }

    public void F0(x0 x0Var) {
        this.f266015p1 = x0Var;
    }

    public ExecutorService G() {
        return this.Z;
    }

    public void G0(int i10) {
        int iJ = j(i10);
        this.f265993d = iJ;
        if (iJ != i10) {
            f265982s3.b("Requested channel max must be between 0 and {}, value has been set to {} instead of {}", 65535, Integer.valueOf(this.f265993d), Integer.valueOf(i10));
        }
    }

    public String H() {
        return this.f266023w.d();
    }

    public void H0(int i10) {
        this.f265994e = i10;
    }

    public String I() {
        return this.f265990a;
    }

    public void I0(int i10) {
        int iJ = j(i10);
        this.f265995f = iJ;
        if (iJ != i10) {
            f265982s3.b("Requested heartbeat must be between 0 and {}, value has been set to {} instead of {}", 65535, Integer.valueOf(this.f265995f), Integer.valueOf(i10));
        }
    }

    public int J() {
        return this.f266009m3;
    }

    public void J0(h1 h1Var) {
        this.f266006l = h1Var;
    }

    public boolean K() {
        return this.X;
    }

    public void K0(ExecutorService executorService) {
        this.f266008m = executorService;
    }

    public boolean L() {
        return this.f266005k3;
    }

    public void L0(ExecutorService executorService) {
        this.f266012o = executorService;
    }

    public boolean M() {
        if (!(E() instanceof SSLSocketFactory) && this.f266001i3 == null) {
            return false;
        }
        return true;
    }

    public void M0(int i10) {
        this.f266000i = i10;
    }

    public boolean N() {
        return this.Y;
    }

    public void N0(s1 s1Var) {
        this.f266021t = s1Var;
    }

    public r O(String str) throws Throwable {
        s.a(this, str);
        return this;
    }

    public void O0(SocketFactory socketFactory) {
        this.f266004k = socketFactory;
    }

    public r P(String str, String str2) throws Throwable {
        s.b(this, str, str2);
        return this;
    }

    public void P0(x1 x1Var) {
        this.f266001i3 = x1Var;
    }

    public r Q(Map<String, String> map) {
        s.c(this, map);
        return this;
    }

    public void Q0(ThreadFactory threadFactory) {
        this.f266010n = threadFactory;
    }

    public void R0(boolean z10) {
        this.Y = z10;
    }

    public r S(Map<String, String> map, String str) {
        s.d(this, map, str);
        return this;
    }

    public void S0(ExecutorService executorService) {
        this.Z = executorService;
    }

    public r T(Properties properties) {
        s.e(this, properties);
        return this;
    }

    public void T0(com.rabbitmq.client.impl.recovery.i0 i0Var) {
        this.f266011n3 = i0Var;
    }

    public r U(Properties properties, String str) {
        s.d(this, properties, str);
        return this;
    }

    public void U0(com.rabbitmq.client.impl.recovery.g0 g0Var) {
        this.f266017p3 = g0Var;
    }

    public p V() throws TimeoutException, IOException {
        return e0(this.f266008m, Collections.singletonList(new b(q(), v())));
    }

    public void V0(g2 g2Var) {
        this.f266018q3 = g2Var;
    }

    public p W(c cVar) throws TimeoutException, IOException {
        return c0(this.f266008m, cVar, null);
    }

    public void W0(String str) throws URISyntaxException, NoSuchAlgorithmException, KeyManagementException {
        X0(new URI(str));
    }

    public p X(String str) throws TimeoutException, IOException {
        return f0(this.f266008m, Collections.singletonList(new b(q(), v())), str);
    }

    public void X0(URI uri) throws NoSuchAlgorithmException, URISyntaxException, KeyManagementException {
        if (!"amqp".equals(uri.getScheme().toLowerCase())) {
            if (!"amqps".equals(uri.getScheme().toLowerCase())) {
                throw new IllegalArgumentException("Wrong scheme in AMQP URI: " + uri.getScheme());
            }
            E0(D3);
            if (this.f266001i3 == null) {
                e1();
            }
        }
        String host = uri.getHost();
        if (host != null) {
            y0(host);
        }
        int port = uri.getPort();
        if (port != -1) {
            E0(port);
        }
        String rawUserInfo = uri.getRawUserInfo();
        if (rawUserInfo != null) {
            String[] strArrSplit = rawUserInfo.split(":");
            if (strArrSplit.length > 2) {
                throw new IllegalArgumentException("Bad user info in AMQP URI: " + rawUserInfo);
            }
            Y0(b1(strArrSplit[0]));
            if (strArrSplit.length == 2) {
                D0(b1(strArrSplit[1]));
            }
        }
        String rawPath = uri.getRawPath();
        if (rawPath == null || rawPath.length() <= 0) {
            return;
        }
        if (rawPath.indexOf(47, 1) == -1) {
            Z0(b1(uri.getPath().substring(1)));
            return;
        }
        throw new IllegalArgumentException("Multiple segments in path of AMQP URI: " + rawPath);
    }

    public p Y(List<b> list) throws TimeoutException, IOException {
        return f0(this.f266008m, list, null);
    }

    public void Y0(String str) {
        this.f266023w = new com.rabbitmq.client.impl.g0(str, this.f266023w.b());
    }

    public p Z(List<b> list, String str) throws TimeoutException, IOException {
        return f0(this.f266008m, list, str);
    }

    public void Z0(String str) {
        this.f265990a = str;
    }

    public p a0(ExecutorService executorService) throws TimeoutException, IOException {
        return e0(executorService, Collections.singletonList(new b(q(), v())));
    }

    public void a1(int i10) {
        this.f266009m3 = i10;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r clone() {
        try {
            return (r) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public p b0(ExecutorService executorService, c cVar) throws TimeoutException, IOException {
        return c0(executorService, cVar, null);
    }

    public p c0(ExecutorService executorService, c cVar, String str) throws TimeoutException, IOException {
        if (this.H1 == null) {
            this.H1 = new r0();
        }
        com.rabbitmq.client.impl.u0 u0VarF = f();
        com.rabbitmq.client.impl.y yVarK0 = k0(executorService);
        if (str != null) {
            HashMap map = new HashMap(yVarK0.c());
            map.put("connection_name", str);
            yVarK0.D(map);
        }
        if (K()) {
            com.rabbitmq.client.impl.recovery.m mVar = new com.rabbitmq.client.impl.recovery.m(yVarK0, u0VarF, cVar, this.H1);
            mVar.M0();
            return mVar;
        }
        Iterator<b> it = cVar.a().iterator();
        Throwable e10 = null;
        while (it.hasNext()) {
            try {
                com.rabbitmq.client.impl.i iVarE = e(yVarK0, u0VarF.a(it.next(), str), this.H1);
                iVarE.start();
                this.H1.e(iVarE);
                return iVarE;
            } catch (IOException | TimeoutException e11) {
                e10 = e11;
            }
        }
        if (e10 != null) {
            if (e10 instanceof IOException) {
                throw ((IOException) e10);
            }
            if (e10 instanceof TimeoutException) {
                throw ((TimeoutException) e10);
            }
        }
        throw new IOException("failed to connect");
    }

    public void c1() {
        this.f266016p2 = false;
    }

    protected c d(List<b> list) {
        return (list.size() != 1 || M()) ? new j0(list) : new d0(list.get(0), M());
    }

    public p d0(ExecutorService executorService, String str) throws TimeoutException, IOException {
        return f0(executorService, Collections.singletonList(new b(q(), v())), str);
    }

    public void d1() {
        this.f266016p2 = true;
    }

    protected com.rabbitmq.client.impl.i e(com.rabbitmq.client.impl.y yVar, com.rabbitmq.client.impl.t0 t0Var, p0 p0Var) {
        return new com.rabbitmq.client.impl.i(yVar, t0Var, p0Var);
    }

    public p e0(ExecutorService executorService, List<b> list) throws TimeoutException, IOException {
        return f0(executorService, list, null);
    }

    public void e1() throws NoSuchAlgorithmException, KeyManagementException {
        f1(c(SSLContext.getDefault().getSupportedSSLParameters().getProtocols()));
    }

    protected synchronized com.rabbitmq.client.impl.u0 f() throws IOException {
        try {
            if (!this.f266016p2) {
                return new com.rabbitmq.client.impl.o1(this.f265996g, this.f266004k, this.f266021t, M(), this.f266012o, this.f266001i3);
            }
            if (this.f265997g3 == null) {
                if (this.f265999h3.g() == null && this.f265999h3.k() == null) {
                    this.f265999h3.w(F());
                }
                this.f265997g3 = new com.rabbitmq.client.impl.nio.v(this.f265996g, this.f265999h3, M(), this.f266001i3);
            }
            return this.f265997g3;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public p f0(ExecutorService executorService, List<b> list, String str) throws TimeoutException, IOException {
        return c0(executorService, d(list), str);
    }

    public void f1(String str) throws NoSuchAlgorithmException, KeyManagementException {
        g1(str, new h2());
    }

    public void g() {
        i();
        h();
    }

    public p g0(ExecutorService executorService, b[] bVarArr) throws TimeoutException, IOException {
        return f0(executorService, Arrays.asList(bVarArr), null);
    }

    public void g1(String str, TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance(str);
        sSLContext.init(null, new TrustManager[]{trustManager}, null);
        h1(sSLContext);
    }

    protected void h() {
        s1 s1Var = this.f266021t;
        if (s1Var == null) {
            this.f266021t = w1.c().d().f().c();
        } else {
            this.f266021t = s1Var.b(w1.f());
        }
    }

    public p h0(ExecutorService executorService, b[] bVarArr, String str) throws TimeoutException, IOException {
        return f0(executorService, Arrays.asList(bVarArr), str);
    }

    public void h1(final SSLContext sSLContext) {
        this.f266001i3 = new x1() { // from class: com.rabbitmq.client.q
            @Override // com.rabbitmq.client.x1
            public final SSLContext a(String str) {
                return r.a(sSLContext, str);
            }
        };
        O0(sSLContext.getSocketFactory());
    }

    protected void i() {
        if (this.f265999h3 == null) {
            this.f265999h3 = new com.rabbitmq.client.impl.nio.r();
        }
        this.f265999h3 = this.f265999h3.c();
    }

    public p i0(b[] bVarArr) throws TimeoutException, IOException {
        return f0(this.f266008m, Arrays.asList(bVarArr), null);
    }

    public p j0(b[] bVarArr, String str) throws TimeoutException, IOException {
        return f0(this.f266008m, Arrays.asList(bVarArr), str);
    }

    public int k() {
        return this.f266003j3;
    }

    public com.rabbitmq.client.impl.y k0(ExecutorService executorService) {
        com.rabbitmq.client.impl.y yVar = new com.rabbitmq.client.impl.y();
        yVar.G(this.f266023w);
        yVar.F(executorService);
        yVar.a0(this.f265990a);
        yVar.D(l());
        yVar.P(this.f265994e);
        yVar.O(this.f265993d);
        yVar.T(this.f266000i);
        yVar.R(this.f266006l);
        yVar.M(this.f266014p0);
        yVar.N(this.f266015p1);
        yVar.V(this.Y);
        yVar.W(this.Z);
        yVar.J(this.f266022v);
        yVar.U(this.f266010n);
        yVar.K(this.f265998h);
        yVar.Q(this.f265995f);
        yVar.S(this.f266012o);
        yVar.L(this.f266020s);
        yVar.B(this.f266003j3);
        yVar.C(this.f266005k3);
        yVar.b0(this.f266009m3);
        yVar.I(this.f266007l3);
        yVar.X(this.f266011n3);
        yVar.E(this.f266013o3);
        yVar.Y(this.f266017p3);
        yVar.Z(this.f266018q3);
        yVar.H(this.f266019r3);
        return yVar;
    }

    public Map<String, Object> l() {
        return this.f266002j;
    }

    public void m0(boolean z10) {
        this.X = z10;
    }

    public int n() {
        return this.f265996g;
    }

    public void n0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Timeout cannot be less than 0");
        }
        this.f266003j3 = i10;
    }

    public g0 o() {
        return this.f266022v;
    }

    public void o0(boolean z10) {
        this.f266005k3 = z10;
    }

    public int p() {
        return this.f265998h;
    }

    public void p0(Map<String, Object> map) {
        this.f266002j = map;
    }

    public String q() {
        return this.f265991b;
    }

    public void q0(Predicate<l1> predicate) {
        this.f266013o3 = predicate;
    }

    public p0 r() {
        return this.H1;
    }

    public void r0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("TCP connection timeout cannot be negative");
        }
        this.f265996g = i10;
    }

    public long s() {
        return this.f266014p0;
    }

    public void s0(com.rabbitmq.client.impl.e0 e0Var) {
        this.f266023w = e0Var;
    }

    public com.rabbitmq.client.impl.nio.r t() {
        return this.f265999h3;
    }

    public void t0(com.rabbitmq.client.impl.f0 f0Var) {
        this.f266019r3 = f0Var;
    }

    public String u() {
        return this.f266023w.b();
    }

    public void u0(com.rabbitmq.client.impl.p0 p0Var) {
        this.f266007l3 = p0Var;
    }

    public int v() {
        return l0(this.f265992c, M());
    }

    public void v0(g0 g0Var) {
        if (g0Var == null) {
            throw new IllegalArgumentException("exception handler cannot be null!");
        }
        this.f266022v = g0Var;
    }

    public x0 w() {
        return this.f266015p1;
    }

    public void w0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("handshake timeout cannot be negative");
        }
        this.f265998h = i10;
    }

    public int x() {
        return this.f265993d;
    }

    public void x0(ScheduledExecutorService scheduledExecutorService) {
        this.f266020s = scheduledExecutorService;
    }

    public void y0(String str) {
        this.f265991b = str;
    }

    public int z() {
        return this.f265994e;
    }

    public void z0(p0 p0Var) {
        this.H1 = p0Var;
    }
}
