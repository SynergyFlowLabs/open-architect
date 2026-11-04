package io.grpc.okhttp;

import io.grpc.f3;
import io.grpc.internal.d1;
import io.grpc.internal.g3;
import io.grpc.internal.j1;
import io.grpc.internal.q3;
import io.grpc.internal.v0;
import io.grpc.internal.x2;
import io.grpc.internal.z1;
import io.grpc.j2;
import io.grpc.n2;
import io.grpc.s0;
import io.grpc.t0;
import io.grpc.u2;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ServerSocketFactory;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes13.dex */
@io.grpc.e0("https://github.com/grpc/grpc-java/issues/1785")
public final class s extends io.grpc.j0<s> {
    private static final EnumSet<f3.d> A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Logger f290785r = Logger.getLogger(s.class.getName());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f290786s = 65535;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final long f290787t = Long.MAX_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f290788u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final long f290789v = Long.MAX_VALUE;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final long f290790w = Long.MAX_VALUE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f290791x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f290792y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final z1<Executor> f290793z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final SocketAddress f290795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final d f290796c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f290807n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final x2 f290794a = new x2(new x2.b() { // from class: io.grpc.okhttp.r
        @Override // io.grpc.internal.x2.b
        public final d1 a(List list) {
            return this.f290784a.D(list);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    q3.b f290797d = q3.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    z1<Executor> f290798e = f290793z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    z1<ScheduledExecutorService> f290799f = g3.c(v0.L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ServerSocketFactory f290800g = ServerSocketFactory.getDefault();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f290801h = v0.C;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f290802i = v0.D;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f290803j = 65535;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f290804k = 8192;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f290805l = 4194304;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    long f290806m = Long.MAX_VALUE;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f290808o = TimeUnit.MINUTES.toNanos(5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    long f290809p = Long.MAX_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    long f290810q = Long.MAX_VALUE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f290811a;

        static {
            int[] iArr = new int[f3.c.values().length];
            f290811a = iArr;
            try {
                iArr[f3.c.OPTIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f290811a[f3.c.REQUIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f290811a[f3.c.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static final class b extends SSLSocketFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SSLSocketFactory f290812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f290813b;

        public b(SSLSocketFactory sSLSocketFactory, boolean z10) {
            this.f290812a = (SSLSocketFactory) com.google.common.base.j0.F(sSLSocketFactory, "socketFactory");
            this.f290813b = z10;
        }

        private Socket a(Socket socket) throws IOException {
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                if (this.f290813b) {
                    sSLSocket.setNeedClientAuth(true);
                    return sSLSocket;
                }
                sSLSocket.setWantClientAuth(true);
                return sSLSocket;
            }
            throw new IOException("SocketFactory " + this.f290812a + " did not produce an SSLSocket: " + socket.getClass());
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
            return a(this.f290812a.createSocket(socket, str, i10, z10));
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getDefaultCipherSuites() {
            return this.f290812a.getDefaultCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getSupportedCipherSuites() {
            return this.f290812a.getSupportedCipherSuites();
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i10) throws IOException {
            return a(this.f290812a.createSocket(str, i10));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
            return a(this.f290812a.createSocket(str, i10, inetAddress, i11));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
            return a(this.f290812a.createSocket(inetAddress, i10));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
            return a(this.f290812a.createSocket(inetAddress, i10, inetAddress2, i11));
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f290814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f290815b;

        private c(d dVar, String str) {
            this.f290814a = dVar;
            this.f290815b = str;
        }

        public static c a(String str) {
            return new c(null, (String) com.google.common.base.j0.F(str, "error"));
        }

        public static c b(d dVar) {
            return new c((d) com.google.common.base.j0.F(dVar, "factory"), null);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f290788u = timeUnit.toNanos(1L);
        f290791x = timeUnit.toNanos(1L);
        f290792y = TimeUnit.DAYS.toNanos(1000L);
        f290793z = i.f290328w;
        A = EnumSet.of(f3.d.MTLS, f3.d.CUSTOM_MANAGERS);
    }

    s(SocketAddress socketAddress, d dVar) {
        this.f290795b = (SocketAddress) com.google.common.base.j0.F(socketAddress, "address");
        this.f290796c = (d) com.google.common.base.j0.F(dVar, "handshakerSocketFactory");
    }

    @z7.e("Always throws. Use forPort(int, ServerCredentials) instead")
    @Deprecated
    public static s F(int i10) {
        throw new UnsupportedOperationException("Use forPort(int, ServerCredentials) instead");
    }

    public static s G(int i10, n2 n2Var) {
        return H(new InetSocketAddress(i10), n2Var);
    }

    public static s H(SocketAddress socketAddress, n2 n2Var) {
        c cVarI = I(n2Var);
        if (cVarI.f290815b == null) {
            return new s(socketAddress, cVarI.f290814a);
        }
        throw new IllegalArgumentException(cVarI.f290815b);
    }

    static c I(n2 n2Var) {
        KeyManager[] keyManagerArrM;
        TrustManager[] trustManagerArrO;
        b bVar;
        if (!(n2Var instanceof f3)) {
            if (n2Var instanceof s0) {
                return c.b(new j0());
            }
            if (n2Var instanceof l0.a) {
                return c.b(new m0((l0.a) n2Var));
            }
            if (!(n2Var instanceof io.grpc.j)) {
                return c.a("Unsupported credential type: " + n2Var.getClass().getName());
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<n2> it = ((io.grpc.j) n2Var).b().iterator();
            while (it.hasNext()) {
                c cVarI = I(it.next());
                if (cVarI.f290815b == null) {
                    return cVarI;
                }
                sb2.append(", ");
                sb2.append(cVarI.f290815b);
            }
            return c.a(sb2.substring(2));
        }
        f3 f3Var = (f3) n2Var;
        Set<f3.d> setJ = f3Var.j(A);
        if (!setJ.isEmpty()) {
            return c.a("TLS features not understood: " + setJ);
        }
        if (f3Var.e() != null) {
            keyManagerArrM = (KeyManager[]) f3Var.e().toArray(new KeyManager[0]);
        } else if (f3Var.f() == null) {
            keyManagerArrM = null;
        } else {
            if (f3Var.g() != null) {
                return c.a("byte[]-based private key with password unsupported. Use unencrypted file or KeyManager");
            }
            try {
                keyManagerArrM = i.M(f3Var.c(), f3Var.f());
            } catch (GeneralSecurityException e10) {
                f290785r.log(Level.FINE, "Exception loading private key from credential", (Throwable) e10);
                return c.a("Unable to load private key: " + e10.getMessage());
            }
        }
        if (f3Var.i() != null) {
            trustManagerArrO = (TrustManager[]) f3Var.i().toArray(new TrustManager[0]);
        } else if (f3Var.h() != null) {
            try {
                trustManagerArrO = i.O(f3Var.h());
            } catch (GeneralSecurityException e11) {
                f290785r.log(Level.FINE, "Exception loading root certificates from credential", (Throwable) e11);
                return c.a("Unable to load root certificates: " + e11.getMessage());
            }
        } else {
            trustManagerArrO = null;
        }
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS", io.grpc.okhttp.internal.h.f().i());
            sSLContext.init(keyManagerArrM, trustManagerArrO, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            int i10 = a.f290811a[f3Var.d().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    bVar = new b(socketFactory, true);
                } else if (i10 != 3) {
                    return c.a("Unknown TlsServerCredentials.ClientAuth value: " + f3Var.d());
                }
                return c.b(new m0(new l0.a(socketFactory)));
            }
            bVar = new b(socketFactory, false);
            socketFactory = bVar;
            return c.b(new m0(new l0.a(socketFactory)));
        } catch (GeneralSecurityException e12) {
            throw new RuntimeException("TLS Provider failure", e12);
        }
    }

    @Override // io.grpc.j0
    @t0
    protected j2<?> C() {
        return this.f290794a;
    }

    d1 D(List<? extends u2.a> list) {
        return new q(this, list, this.f290794a.M());
    }

    public s E(int i10) {
        com.google.common.base.j0.h0(i10 > 0, "flowControlWindow must be positive");
        this.f290803j = i10;
        return this;
    }

    @Override // io.grpc.j0, io.grpc.j2
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public s p(long j10, TimeUnit timeUnit) {
        com.google.common.base.j0.e(j10 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j10);
        this.f290801h = nanos;
        long jL = j1.l(nanos);
        this.f290801h = jL;
        if (jL >= f290792y) {
            this.f290801h = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // io.grpc.j0, io.grpc.j2
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public s q(long j10, TimeUnit timeUnit) {
        boolean z10;
        if (j10 > 0) {
            z10 = true;
            int i10 = 2 ^ 1;
        } else {
            z10 = false;
        }
        com.google.common.base.j0.e(z10, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j10);
        this.f290802i = nanos;
        this.f290802i = j1.m(nanos);
        return this;
    }

    @Override // io.grpc.j0, io.grpc.j2
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public s r(long j10, TimeUnit timeUnit) {
        com.google.common.base.j0.p(j10 > 0, "max connection age must be positive: %s", j10);
        long nanos = timeUnit.toNanos(j10);
        this.f290809p = nanos;
        if (nanos >= f290792y) {
            this.f290809p = Long.MAX_VALUE;
        }
        long j11 = this.f290809p;
        long j12 = f290791x;
        if (j11 < j12) {
            this.f290809p = j12;
        }
        return this;
    }

    @Override // io.grpc.j0, io.grpc.j2
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public s s(long j10, TimeUnit timeUnit) {
        com.google.common.base.j0.p(j10 >= 0, "max connection age grace must be non-negative: %s", j10);
        long nanos = timeUnit.toNanos(j10);
        this.f290810q = nanos;
        if (nanos >= f290792y) {
            this.f290810q = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // io.grpc.j0, io.grpc.j2
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public s t(long j10, TimeUnit timeUnit) {
        com.google.common.base.j0.p(j10 > 0, "max connection idle must be positive: %s", j10);
        long nanos = timeUnit.toNanos(j10);
        this.f290806m = nanos;
        if (nanos >= f290792y) {
            this.f290806m = Long.MAX_VALUE;
        }
        long j11 = this.f290806m;
        long j12 = f290788u;
        if (j11 < j12) {
            this.f290806m = j12;
        }
        return this;
    }

    @Override // io.grpc.j0, io.grpc.j2
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public s u(int i10) {
        com.google.common.base.j0.e(i10 >= 0, "negative max bytes");
        this.f290805l = i10;
        return this;
    }

    @Override // io.grpc.j0, io.grpc.j2
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public s v(int i10) {
        com.google.common.base.j0.e(i10 > 0, "maxInboundMetadataSize must be > 0");
        this.f290804k = i10;
        return this;
    }

    @Override // io.grpc.j0, io.grpc.j2
    @z7.a
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public s w(long j10, TimeUnit timeUnit) {
        com.google.common.base.j0.p(j10 >= 0, "permit keepalive time must be non-negative: %s", j10);
        this.f290808o = timeUnit.toNanos(j10);
        return this;
    }

    @Override // io.grpc.j0, io.grpc.j2
    @z7.a
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public s x(boolean z10) {
        this.f290807n = z10;
        return this;
    }

    public s S(ScheduledExecutorService scheduledExecutorService) {
        this.f290799f = new io.grpc.internal.k0((ScheduledExecutorService) com.google.common.base.j0.F(scheduledExecutorService, "scheduledExecutorService"));
        return this;
    }

    void T(boolean z10) {
        this.f290794a.T(z10);
    }

    s U(q3.b bVar) {
        this.f290797d = bVar;
        return this;
    }

    public s V(ServerSocketFactory serverSocketFactory) {
        if (serverSocketFactory == null) {
            this.f290800g = ServerSocketFactory.getDefault();
            return this;
        }
        this.f290800g = serverSocketFactory;
        return this;
    }

    public s W(Executor executor) {
        if (executor == null) {
            this.f290798e = f290793z;
            return this;
        }
        this.f290798e = new io.grpc.internal.k0(executor);
        return this;
    }
}
