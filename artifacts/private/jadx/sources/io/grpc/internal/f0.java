package io.grpc.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public class f0 extends io.grpc.x1 {
    private static final String A;
    private static final String B;
    private static final String C;

    @com.google.common.annotations.e
    static final String D = "networkaddress.cache.ttl";

    @com.google.common.annotations.e
    static final long E = 30;

    @com.google.common.annotations.e
    static boolean F = false;

    @com.google.common.annotations.e
    static boolean G = false;

    @com.google.common.annotations.e
    protected static boolean H = false;
    private static final g I;
    private static String J = null;
    static final /* synthetic */ boolean K = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final String f289152x = "grpc_config=";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f289154z = "_grpc_config.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    final io.grpc.g2 f289155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Random f289156b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile b f289157c = d.INSTANCE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<f> f289158d = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f289159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f289160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f289161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f3.d<Executor> f289162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f289163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.grpc.c3 f289164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.common.base.q0 f289165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f289166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f289167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Executor f289168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f289169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.grpc.x1.i f289170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f289171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private io.grpc.x1.e f289172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Logger f289147s = Logger.getLogger(f0.class.getName());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f289148t = "clientLanguage";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f289149u = "percentage";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f289150v = "clientHostname";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f289151w = "serviceConfig";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Set<String> f289153y = Collections.unmodifiableSet(new HashSet(Arrays.asList(f289148t, f289149u, f289150v, f289151w)));

    @com.google.common.annotations.e
    public interface b {
        List<InetAddress> b(String str) throws Exception;
    }

    protected static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.grpc.y2 f289173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<io.grpc.d0> f289174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private io.grpc.x1.c f289175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public io.grpc.a f289176d;

        private c() {
        }
    }

    private enum d implements b {
        INSTANCE;

        @Override // io.grpc.internal.f0.b
        public List<InetAddress> b(String str) throws UnknownHostException {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    private final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.x1.e f289179a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f289181a;

            a(boolean z10) {
                this.f289181a = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f289181a) {
                    f0 f0Var = f0.this;
                    f0Var.f289166l = true;
                    if (f0Var.f289163i > 0) {
                        f0.this.f289165k.j().k();
                    }
                }
                f0.this.f289171q = false;
            }
        }

        e(io.grpc.x1.e eVar) {
            this.f289179a = (io.grpc.x1.e) com.google.common.base.j0.F(eVar, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            io.grpc.c3 c3Var;
            a aVar;
            Logger logger = f0.f289147s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                f0.f289147s.finer("Attempting DNS resolution of " + f0.this.f289160f);
            }
            boolean z10 = true;
            c cVarO = null;
            try {
                try {
                    io.grpc.d0 d0VarN = f0.this.n();
                    io.grpc.x1.g.a aVarD = io.grpc.x1.g.d();
                    if (d0VarN == null) {
                        cVarO = f0.this.o(false);
                        if (cVarO.f289173a != null) {
                            this.f289179a.b(cVarO.f289173a);
                            if (cVarO == null || cVarO.f289173a != null) {
                                z10 = false;
                            }
                            c3Var = f0.this.f289164j;
                            aVar = new a(z10);
                        } else {
                            if (cVarO.f289174b != null) {
                                aVarD.b(cVarO.f289174b);
                            }
                            if (cVarO.f289175c != null) {
                                aVarD.d(cVarO.f289175c);
                            }
                            io.grpc.a aVar2 = cVarO.f289176d;
                            if (aVar2 != null) {
                                aVarD.c(aVar2);
                            }
                        }
                        c3Var.execute(aVar);
                    }
                    if (f0.f289147s.isLoggable(level)) {
                        f0.f289147s.finer("Using proxy address " + d0VarN);
                    }
                    aVarD.b(Collections.singletonList(d0VarN));
                    this.f289179a.c(aVarD.a());
                    z10 = cVarO != null && cVarO.f289173a == null;
                    c3Var = f0.this.f289164j;
                    aVar = new a(z10);
                } catch (IOException e10) {
                    this.f289179a.b(io.grpc.y2.f291465t.u("Unable to resolve host " + f0.this.f289160f).t(e10));
                    z10 = 0 != 0 && null.f289173a == null;
                    c3Var = f0.this.f289164j;
                    aVar = new a(z10);
                }
                c3Var.execute(aVar);
            } catch (Throwable th2) {
                if (0 == 0 || null.f289173a != null) {
                    z10 = false;
                }
                f0.this.f289164j.execute(new a(z10));
                throw th2;
            }
        }
    }

    @com.google.common.annotations.e
    public interface f {
        List<h> a(String str) throws Exception;

        List<String> b(String str) throws Exception;
    }

    interface g {
        @fj.h
        f a();

        @fj.h
        Throwable b();
    }

    @com.google.common.annotations.e
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f289183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f289184b;

        public h(String str, int i10) {
            this.f289183a = str;
            this.f289184b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && h.class == obj.getClass()) {
                h hVar = (h) obj;
                if (this.f289184b == hVar.f289184b && this.f289183a.equals(hVar.f289183a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.d0.b(this.f289183a, Integer.valueOf(this.f289184b));
        }

        public String toString() {
            return com.google.common.base.b0.c(this).f("host", this.f289183a).d(com.rabbitmq.client.s.f266031f, this.f289184b).toString();
        }
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", com.facebook.internal.z0.P);
        A = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        B = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        C = property3;
        F = Boolean.parseBoolean(property);
        G = Boolean.parseBoolean(property2);
        H = Boolean.parseBoolean(property3);
        I = x(f0.class.getClassLoader());
    }

    protected f0(@fj.h String str, String str2, io.grpc.x1.b bVar, f3.d<Executor> dVar, com.google.common.base.q0 q0Var, boolean z10) {
        com.google.common.base.j0.F(bVar, "args");
        this.f289162h = dVar;
        URI uriCreate = URI.create("//" + ((String) com.google.common.base.j0.F(str2, "name")));
        int i10 = 2 ^ 1;
        com.google.common.base.j0.u(uriCreate.getHost() != null, "Invalid DNS name: %s", str2);
        this.f289159e = (String) com.google.common.base.j0.V(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.f289160f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f289161g = bVar.b();
        } else {
            this.f289161g = uriCreate.getPort();
        }
        this.f289155a = (io.grpc.g2) com.google.common.base.j0.F(bVar.e(), "proxyDetector");
        this.f289163i = t(z10);
        this.f289165k = (com.google.common.base.q0) com.google.common.base.j0.F(q0Var, androidx.core.app.w.W0);
        this.f289164j = (io.grpc.c3) com.google.common.base.j0.F(bVar.h(), "syncContext");
        Executor executorC = bVar.c();
        this.f289168n = executorC;
        this.f289169o = executorC == null;
        this.f289170p = (io.grpc.x1.i) com.google.common.base.j0.F(bVar.g(), "serviceConfigParser");
    }

    @com.google.common.annotations.e
    static List<Map<String, ?>> A(List<String> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith(f289152x)) {
                Object objA = g1.a(str.substring(12));
                if (!(objA instanceof List)) {
                    throw new ClassCastException("wrong type " + objA);
                }
                arrayList.addAll(h1.a((List) objA));
            } else {
                f289147s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    private void B() {
        if (this.f289171q || this.f289167m || !m()) {
            return;
        }
        this.f289171q = true;
        this.f289168n.execute(new e(this.f289172r));
    }

    private List<io.grpc.d0> C() {
        Exception exc = null;
        try {
            try {
                List<InetAddress> listB = this.f289157c.b(this.f289160f);
                ArrayList arrayList = new ArrayList(listB.size());
                Iterator<InetAddress> it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(new io.grpc.d0(new InetSocketAddress(it.next(), this.f289161g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e10) {
                exc = e10;
                com.google.common.base.v0.w(exc);
                throw new RuntimeException(exc);
            }
        } catch (Throwable th2) {
            if (exc != null) {
                f289147s.log(Level.FINE, "Address resolution failure", (Throwable) exc);
            }
            throw th2;
        }
    }

    @fj.h
    private io.grpc.x1.c D() {
        List<String> listB = Collections.EMPTY_LIST;
        f fVarW = w();
        if (fVarW != null) {
            try {
                listB = fVarW.b(f289154z + this.f289160f);
            } catch (Exception e10) {
                f289147s.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e10);
            }
        }
        if (listB.isEmpty()) {
            f289147s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f289160f});
        } else {
            io.grpc.x1.c cVarZ = z(listB, this.f289156b, s());
            if (cVarZ != null) {
                if (cVarZ.d() != null) {
                    return io.grpc.x1.c.b(cVarZ.d());
                }
                return this.f289170p.a((Map) cVarZ.c());
            }
        }
        return null;
    }

    @com.google.common.annotations.e
    protected static boolean G(boolean z10, boolean z11, String str) {
        if (!z10) {
            return false;
        }
        if (com.rabbitmq.client.r.A3.equalsIgnoreCase(str)) {
            return z11;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z12 = true;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '.') {
                z12 &= cCharAt >= '0' && cCharAt <= '9';
            }
        }
        return true ^ z12;
    }

    private boolean m() {
        if (this.f289166l) {
            long j10 = this.f289163i;
            if (j10 != 0 && (j10 <= 0 || this.f289165k.g(TimeUnit.NANOSECONDS) <= this.f289163i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fj.h
    public io.grpc.d0 n() throws IOException {
        io.grpc.f2 f2VarA = this.f289155a.a(InetSocketAddress.createUnresolved(this.f289160f, this.f289161g));
        if (f2VarA != null) {
            return new io.grpc.d0(f2VarA);
        }
        return null;
    }

    @fj.h
    private static final List<String> p(Map<String, ?> map) {
        return h1.g(map, f289148t);
    }

    @fj.h
    private static final List<String> r(Map<String, ?> map) {
        return h1.g(map, f289150v);
    }

    private static String s() {
        if (J == null) {
            try {
                J = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e10) {
                throw new RuntimeException(e10);
            }
        }
        return J;
    }

    private static long t(boolean z10) {
        if (z10) {
            return 0L;
        }
        String property = System.getProperty(D);
        long nanos = E;
        if (property != null) {
            try {
                nanos = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f289147s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{D, property, Long.valueOf(E)});
            }
        }
        if (nanos > 0) {
            nanos = TimeUnit.SECONDS.toNanos(nanos);
        }
        return nanos;
    }

    @fj.h
    private static final Double u(Map<String, ?> map) {
        return h1.h(map, f289149u);
    }

    @fj.h
    @com.google.common.annotations.e
    static g x(ClassLoader classLoader) {
        try {
            try {
                try {
                    g gVar = (g) Class.forName("io.grpc.internal.f1", true, classLoader).asSubclass(g.class).getConstructor(null).newInstance(null);
                    if (gVar.b() == null) {
                        return gVar;
                    }
                    f289147s.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", gVar.b());
                    return null;
                } catch (Exception e10) {
                    f289147s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e10);
                    return null;
                }
            } catch (Exception e11) {
                f289147s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e11);
                return null;
            }
        } catch (ClassCastException e12) {
            f289147s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e12);
            return null;
        } catch (ClassNotFoundException e13) {
            f289147s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e13);
            return null;
        }
    }

    @fj.h
    @com.google.common.annotations.e
    static Map<String, ?> y(Map<String, ?> map, Random random, String str) {
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            com.google.common.base.y0.q(f289153y.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List<String> listP = p(map);
        if (listP != null && !listP.isEmpty()) {
            Iterator<String> it = listP.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase(it.next())) {
                }
            }
            return null;
        }
        Double dU = u(map);
        if (dU != null) {
            int iIntValue = dU.intValue();
            com.google.common.base.y0.q(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dU);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List<String> listR = r(map);
        if (listR != null && !listR.isEmpty()) {
            Iterator<String> it2 = listR.iterator();
            while (it2.hasNext()) {
                if (it2.next().equals(str)) {
                }
            }
            return null;
        }
        Map<String, ?> mapL = h1.l(map, f289151w);
        if (mapL != null) {
            return mapL;
        }
        throw new com.google.common.base.z0(String.format("key '%s' missing in '%s'", map, f289151w));
    }

    @fj.h
    static io.grpc.x1.c z(List<String> list, Random random, String str) {
        try {
            Iterator<Map<String, ?>> it = A(list).iterator();
            Map<String, ?> mapY = null;
            while (it.hasNext()) {
                try {
                    mapY = y(it.next(), random, str);
                    if (mapY != null) {
                        break;
                    }
                } catch (RuntimeException e10) {
                    return io.grpc.x1.c.b(io.grpc.y2.f291452g.u("failed to pick service config choice").t(e10));
                }
            }
            if (mapY == null) {
                return null;
            }
            return io.grpc.x1.c.a(mapY);
        } catch (IOException | RuntimeException e11) {
            return io.grpc.x1.c.b(io.grpc.y2.f291452g.u("failed to parse TXT records").t(e11));
        }
    }

    @com.google.common.annotations.e
    protected void E(b bVar) {
        this.f289157c = bVar;
    }

    @com.google.common.annotations.e
    protected void F(f fVar) {
        this.f289158d.set(fVar);
    }

    @Override // io.grpc.x1
    public String a() {
        return this.f289159e;
    }

    @Override // io.grpc.x1
    public void b() {
        com.google.common.base.j0.h0(this.f289172r != null, "not started");
        B();
    }

    @Override // io.grpc.x1
    public void c() {
        if (this.f289167m) {
            return;
        }
        this.f289167m = true;
        Executor executor = this.f289168n;
        if (executor == null || !this.f289169o) {
            return;
        }
        this.f289168n = (Executor) f3.f(this.f289162h, executor);
    }

    @Override // io.grpc.x1
    public void d(io.grpc.x1.e eVar) {
        com.google.common.base.j0.h0(this.f289172r == null, "already started");
        if (this.f289169o) {
            this.f289168n = (Executor) f3.d(this.f289162h);
        }
        this.f289172r = (io.grpc.x1.e) com.google.common.base.j0.F(eVar, com.google.android.gms.common.internal.z.a.f106673a);
        B();
    }

    protected c o(boolean z10) {
        c cVar = new c();
        try {
            cVar.f289174b = C();
        } catch (Exception e10) {
            if (!z10) {
                cVar.f289173a = io.grpc.y2.f291465t.u("Unable to resolve host " + this.f289160f).t(e10);
                return cVar;
            }
        }
        if (H) {
            cVar.f289175c = D();
        }
        return cVar;
    }

    @com.google.common.annotations.e
    protected String q() {
        return this.f289160f;
    }

    final int v() {
        return this.f289161g;
    }

    @fj.h
    protected f w() {
        g gVar;
        if (!G(F, G, this.f289160f)) {
            return null;
        }
        f fVar = this.f289158d.get();
        return (fVar != null || (gVar = I) == null) ? fVar : gVar.a();
    }
}
