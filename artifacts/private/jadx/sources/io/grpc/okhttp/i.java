package io.grpc.okhttp;

import com.squareup.okhttp.ConnectionSpec;
import io.grpc.e3;
import io.grpc.internal.f3;
import io.grpc.internal.g3;
import io.grpc.internal.j1;
import io.grpc.internal.o1;
import io.grpc.internal.q3;
import io.grpc.internal.v0;
import io.grpc.internal.z1;
import io.grpc.r0;
import io.grpc.s1;
import io.grpc.t0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: loaded from: classes13.dex */
@io.grpc.e0("https://github.com/grpc/grpc-java/issues/1785")
public final class i extends io.grpc.f0<i> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f290324s = 65535;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final f3.d<Executor> f290327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final z1<Executor> f290328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final EnumSet<e3.c> f290329x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o1 f290330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q3.b f290331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z1<Executor> f290332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z1<ScheduledExecutorService> f290333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SocketFactory f290334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SSLSocketFactory f290335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f290336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HostnameVerifier f290337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private io.grpc.okhttp.internal.b f290338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f290339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f290340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f290341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f290342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f290343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f290344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f290345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f290346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Logger f290323r = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final io.grpc.okhttp.internal.b f290325t = new io.grpc.okhttp.internal.b.C1981b(io.grpc.okhttp.internal.b.f290460f).f(io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).i(io.grpc.okhttp.internal.k.TLS_1_2).h(true).e();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f290326u = TimeUnit.DAYS.toNanos(1000);

    class a implements f3.d<Executor> {
        a() {
        }

        @Override // io.grpc.internal.f3.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.f3.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Executor k() {
            return Executors.newCachedThreadPool(v0.m("grpc-okhttp-%d", true));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f290347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f290348b;

        static {
            int[] iArr = new int[c.values().length];
            f290348b = iArr;
            try {
                iArr[c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f290348b[c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            f290347a = iArr2;
            try {
                iArr2[h.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f290347a[h.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum c {
        TLS,
        PLAINTEXT
    }

    private final class d implements o1.b {
        private d() {
        }

        @Override // io.grpc.internal.o1.b
        public int a() {
            return i.this.W();
        }

        /* synthetic */ d(i iVar, a aVar) {
            this();
        }
    }

    private final class e implements o1.c {
        private e() {
        }

        @Override // io.grpc.internal.o1.c
        public io.grpc.internal.v a() {
            return i.this.K();
        }

        /* synthetic */ e(i iVar, a aVar) {
            this();
        }
    }

    @t0
    static final class f implements io.grpc.internal.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z1<Executor> f290354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f290355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z1<ScheduledExecutorService> f290356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ScheduledExecutorService f290357d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final q3.b f290358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final SocketFactory f290359f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @fj.h
        final SSLSocketFactory f290360g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @fj.h
        final HostnameVerifier f290361h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final io.grpc.okhttp.internal.b f290362i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final int f290363j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final boolean f290364k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final long f290365l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final io.grpc.internal.h f290366m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f290367n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final int f290368o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final boolean f290369s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f290370t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final boolean f290371v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f290372w;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.internal.h.b f290373a;

            a(io.grpc.internal.h.b bVar) {
                this.f290373a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f290373a.a();
            }
        }

        /* synthetic */ f(z1 z1Var, z1 z1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, io.grpc.okhttp.internal.b bVar, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, q3.b bVar2, boolean z12, a aVar) {
            this(z1Var, z1Var2, socketFactory, sSLSocketFactory, hostnameVerifier, bVar, i10, z10, j10, j11, i11, z11, i12, bVar2, z12);
        }

        @Override // io.grpc.internal.v
        public ScheduledExecutorService E0() {
            return this.f290357d;
        }

        @Override // io.grpc.internal.v
        public Collection<Class<? extends SocketAddress>> K8() {
            return i.X();
        }

        @Override // io.grpc.internal.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f290372w) {
                return;
            }
            this.f290372w = true;
            this.f290354a.b(this.f290355b);
            this.f290356c.b(this.f290357d);
        }

        @Override // io.grpc.internal.v
        public io.grpc.internal.x j7(SocketAddress socketAddress, io.grpc.internal.v.a aVar, io.grpc.h hVar) {
            if (this.f290372w) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            io.grpc.internal.h.b bVarD = this.f290366m.d();
            l lVar = new l(this, (InetSocketAddress) socketAddress, aVar.a(), aVar.e(), aVar.c(), aVar.d(), new a(bVarD));
            if (this.f290364k) {
                lVar.U(true, bVarD.b(), this.f290367n, this.f290369s);
            }
            return lVar;
        }

        @Override // io.grpc.internal.v
        @fj.h
        @fj.c
        public io.grpc.internal.v.b p4(io.grpc.g gVar) {
            g gVarK0 = i.k0(gVar);
            if (gVarK0.f290377c != null) {
                return null;
            }
            return new io.grpc.internal.v.b(new f(this.f290354a, this.f290356c, this.f290359f, gVarK0.f290375a, this.f290361h, this.f290362i, this.f290363j, this.f290364k, this.f290365l, this.f290367n, this.f290368o, this.f290369s, this.f290370t, this.f290358e, this.f290371v), gVarK0.f290376b);
        }

        private f(z1<Executor> z1Var, z1<ScheduledExecutorService> z1Var2, @fj.h SocketFactory socketFactory, @fj.h SSLSocketFactory sSLSocketFactory, @fj.h HostnameVerifier hostnameVerifier, io.grpc.okhttp.internal.b bVar, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, q3.b bVar2, boolean z12) {
            this.f290354a = z1Var;
            this.f290355b = z1Var.a();
            this.f290356c = z1Var2;
            this.f290357d = z1Var2.a();
            this.f290359f = socketFactory;
            this.f290360g = sSLSocketFactory;
            this.f290361h = hostnameVerifier;
            this.f290362i = bVar;
            this.f290363j = i10;
            this.f290364k = z10;
            this.f290365l = j10;
            this.f290366m = new io.grpc.internal.h("keepalive time nanos", j10);
            this.f290367n = j11;
            this.f290368o = i11;
            this.f290369s = z11;
            this.f290370t = i12;
            this.f290371v = z12;
            this.f290358e = (q3.b) com.google.common.base.j0.F(bVar2, "transportTracerFactory");
        }
    }

    static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SSLSocketFactory f290375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.grpc.d f290376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f290377c;

        private g(SSLSocketFactory sSLSocketFactory, io.grpc.d dVar, String str) {
            this.f290375a = sSLSocketFactory;
            this.f290376b = dVar;
            this.f290377c = str;
        }

        public static g a(String str) {
            return new g(null, null, (String) com.google.common.base.j0.F(str, "error"));
        }

        public static g b(SSLSocketFactory sSLSocketFactory) {
            return new g((SSLSocketFactory) com.google.common.base.j0.F(sSLSocketFactory, "factory"), null, null);
        }

        public static g c() {
            return new g(null, null, null);
        }

        public g d(io.grpc.d dVar) {
            com.google.common.base.j0.F(dVar, "callCreds");
            if (this.f290377c != null) {
                return this;
            }
            io.grpc.d dVar2 = this.f290376b;
            if (dVar2 != null) {
                dVar = new io.grpc.q(dVar2, dVar);
            }
            return new g(this.f290375a, dVar, null);
        }
    }

    static {
        a aVar = new a();
        f290327v = aVar;
        f290328w = g3.c(aVar);
        f290329x = EnumSet.of(e3.c.MTLS, e3.c.CUSTOM_MANAGERS);
    }

    private i(String str, int i10) {
        this(v0.b(str, i10));
    }

    static KeyManager[] M(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            X509Certificate[] x509CertificateArrB = io.grpc.util.c.b(byteArrayInputStream);
            v0.f(byteArrayInputStream);
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr2);
            try {
                try {
                    PrivateKey privateKeyA = io.grpc.util.c.a(byteArrayInputStream2);
                    v0.f(byteArrayInputStream2);
                    KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                    try {
                        keyStore.load(null, null);
                        keyStore.setKeyEntry("key", privateKeyA, new char[0], x509CertificateArrB);
                        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                        keyManagerFactory.init(keyStore, new char[0]);
                        return keyManagerFactory.getKeyManagers();
                    } catch (IOException e10) {
                        throw new GeneralSecurityException(e10);
                    }
                } catch (IOException e11) {
                    throw new GeneralSecurityException("Unable to decode private key", e11);
                }
            } catch (Throwable th2) {
                v0.f(byteArrayInputStream2);
                throw th2;
            }
        } catch (Throwable th3) {
            v0.f(byteArrayInputStream);
            throw th3;
        }
    }

    static TrustManager[] O(byte[] bArr) throws GeneralSecurityException {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        try {
            keyStore.load(null, null);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                X509Certificate[] x509CertificateArrB = io.grpc.util.c.b(byteArrayInputStream);
                v0.f(byteArrayInputStream);
                for (X509Certificate x509Certificate : x509CertificateArrB) {
                    keyStore.setCertificateEntry(x509Certificate.getSubjectX500Principal().getName("RFC2253"), x509Certificate);
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                return trustManagerFactory.getTrustManagers();
            } finally {
                v0.f(byteArrayInputStream);
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static i S(String str, int i10) {
        return new i(str, i10);
    }

    public static i T(String str, int i10, io.grpc.g gVar) {
        return V(v0.b(str, i10), gVar);
    }

    public static i U(String str) {
        return new i(str);
    }

    public static i V(String str, io.grpc.g gVar) {
        g gVarK0 = k0(gVar);
        if (gVarK0.f290377c == null) {
            return new i(str, gVar, gVarK0.f290376b, gVarK0.f290375a);
        }
        throw new IllegalArgumentException(gVarK0.f290377c);
    }

    static Collection<Class<? extends SocketAddress>> X() {
        return Collections.singleton(InetSocketAddress.class);
    }

    static g k0(io.grpc.g gVar) {
        KeyManager[] keyManagerArrM;
        TrustManager[] trustManagerArrO;
        if (!(gVar instanceof e3)) {
            if (gVar instanceof r0) {
                return g.c();
            }
            if (gVar instanceof io.grpc.r) {
                io.grpc.r rVar = (io.grpc.r) gVar;
                return k0(rVar.d()).d(rVar.c());
            }
            if (gVar instanceof k0.b) {
                return g.b(((k0.b) gVar).b());
            }
            if (!(gVar instanceof io.grpc.i)) {
                return g.a("Unsupported credential type: " + gVar.getClass().getName());
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<io.grpc.g> it = ((io.grpc.i) gVar).c().iterator();
            while (it.hasNext()) {
                g gVarK0 = k0(it.next());
                if (gVarK0.f290377c == null) {
                    return gVarK0;
                }
                sb2.append(", ");
                sb2.append(gVarK0.f290377c);
            }
            return g.a(sb2.substring(2));
        }
        e3 e3Var = (e3) gVar;
        Set<e3.c> setI = e3Var.i(f290329x);
        if (!setI.isEmpty()) {
            return g.a("TLS features not understood: " + setI);
        }
        if (e3Var.d() != null) {
            keyManagerArrM = (KeyManager[]) e3Var.d().toArray(new KeyManager[0]);
        } else if (e3Var.e() == null) {
            keyManagerArrM = null;
        } else {
            if (e3Var.f() != null) {
                return g.a("byte[]-based private key with password unsupported. Use unencrypted file or KeyManager");
            }
            try {
                keyManagerArrM = M(e3Var.c(), e3Var.e());
            } catch (GeneralSecurityException e10) {
                f290323r.log(Level.FINE, "Exception loading private key from credential", (Throwable) e10);
                return g.a("Unable to load private key: " + e10.getMessage());
            }
        }
        if (e3Var.h() != null) {
            trustManagerArrO = (TrustManager[]) e3Var.h().toArray(new TrustManager[0]);
        } else if (e3Var.g() != null) {
            try {
                trustManagerArrO = O(e3Var.g());
            } catch (GeneralSecurityException e11) {
                f290323r.log(Level.FINE, "Exception loading root certificates from credential", (Throwable) e11);
                return g.a("Unable to load root certificates: " + e11.getMessage());
            }
        } else {
            trustManagerArrO = null;
        }
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS", io.grpc.okhttp.internal.h.f().i());
            sSLContext.init(keyManagerArrM, trustManagerArrO, null);
            return g.b(sSLContext.getSocketFactory());
        } catch (GeneralSecurityException e12) {
            throw new RuntimeException("TLS Provider failure", e12);
        }
    }

    @Override // io.grpc.f0
    @t0
    protected s1<?> J() {
        return this.f290330a;
    }

    f K() {
        return new f(this.f290332c, this.f290333d, this.f290334e, N(), this.f290337h, this.f290338i, this.f290344o, this.f290340k != Long.MAX_VALUE, this.f290340k, this.f290341l, this.f290342m, this.f290343n, this.f290345p, this.f290331b, false, null);
    }

    public i L(ConnectionSpec connectionSpec) {
        com.google.common.base.j0.h0(!this.f290336g, "Cannot change security when using ChannelCredentials");
        com.google.common.base.j0.e(connectionSpec.isTls(), "plaintext ConnectionSpec is not accepted");
        this.f290338i = n0.c(connectionSpec);
        return this;
    }

    @fj.h
    @com.google.common.annotations.e
    SSLSocketFactory N() {
        int i10 = b.f290348b[this.f290339j.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 != 2) {
            throw new RuntimeException("Unknown negotiation type: " + this.f290339j);
        }
        try {
            if (this.f290335f == null) {
                this.f290335f = SSLContext.getInstance("Default", io.grpc.okhttp.internal.h.f().i()).getSocketFactory();
            }
            return this.f290335f;
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException("TLS Provider failure", e10);
        }
    }

    i P() {
        this.f290330a.S();
        return this;
    }

    i Q() {
        this.f290330a.V();
        return this;
    }

    public i R(int i10) {
        com.google.common.base.j0.h0(i10 > 0, "flowControlWindow must be positive");
        this.f290342m = i10;
        return this;
    }

    int W() {
        int i10 = b.f290348b[this.f290339j.ordinal()];
        int i11 = 1 << 1;
        if (i10 == 1) {
            return 80;
        }
        if (i10 == 2) {
            return 443;
        }
        throw new AssertionError(this.f290339j + " not handled");
    }

    public i Y(@fj.h HostnameVerifier hostnameVerifier) {
        com.google.common.base.j0.h0(!this.f290336g, "Cannot change security when using ChannelCredentials");
        this.f290337h = hostnameVerifier;
        return this;
    }

    @Override // io.grpc.f0, io.grpc.s1
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public i q(long j10, TimeUnit timeUnit) {
        com.google.common.base.j0.e(j10 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j10);
        this.f290340k = nanos;
        long jL = j1.l(nanos);
        this.f290340k = jL;
        if (jL >= f290326u) {
            this.f290340k = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // io.grpc.f0, io.grpc.s1
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public i r(long j10, TimeUnit timeUnit) {
        boolean z10;
        if (j10 > 0) {
            z10 = true;
            int i10 = 3 ^ 1;
        } else {
            z10 = false;
        }
        com.google.common.base.j0.e(z10, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j10);
        this.f290341l = nanos;
        this.f290341l = j1.m(nanos);
        return this;
    }

    @Override // io.grpc.f0, io.grpc.s1
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public i s(boolean z10) {
        this.f290343n = z10;
        return this;
    }

    @Override // io.grpc.f0, io.grpc.s1
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public i u(int i10) {
        com.google.common.base.j0.e(i10 >= 0, "negative max");
        this.f290344o = i10;
        return this;
    }

    @Override // io.grpc.f0, io.grpc.s1
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public i v(int i10) {
        com.google.common.base.j0.e(i10 > 0, "maxInboundMetadataSize must be > 0");
        this.f290345p = i10;
        return this;
    }

    @Deprecated
    public i e0(h hVar) {
        com.google.common.base.j0.h0(!this.f290336g, "Cannot change security when using ChannelCredentials");
        com.google.common.base.j0.F(hVar, "type");
        int i10 = b.f290347a[hVar.ordinal()];
        if (i10 == 1) {
            this.f290339j = c.TLS;
            return this;
        }
        if (i10 == 2) {
            this.f290339j = c.PLAINTEXT;
            return this;
        }
        throw new AssertionError("Unknown negotiation type: " + hVar);
    }

    public i f0(ScheduledExecutorService scheduledExecutorService) {
        this.f290333d = new io.grpc.internal.k0((ScheduledExecutorService) com.google.common.base.j0.F(scheduledExecutorService, "scheduledExecutorService"));
        return this;
    }

    void g0(boolean z10) {
        this.f290330a.q0(z10);
    }

    @com.google.common.annotations.e
    i h0(q3.b bVar) {
        this.f290331b = bVar;
        return this;
    }

    public i i0(@fj.h SocketFactory socketFactory) {
        this.f290334e = socketFactory;
        return this;
    }

    public i j0(SSLSocketFactory sSLSocketFactory) {
        com.google.common.base.j0.h0(!this.f290336g, "Cannot change security when using ChannelCredentials");
        this.f290335f = sSLSocketFactory;
        this.f290339j = c.TLS;
        return this;
    }

    public i l0(String[] strArr, String[] strArr2) {
        com.google.common.base.j0.h0(!this.f290336g, "Cannot change security when using ChannelCredentials");
        com.google.common.base.j0.F(strArr, "tls versions must not null");
        com.google.common.base.j0.F(strArr2, "ciphers must not null");
        this.f290338i = new io.grpc.okhttp.internal.b.C1981b(true).h(true).j(strArr).g(strArr2).e();
        return this;
    }

    public i m0(@fj.h Executor executor) {
        if (executor == null) {
            this.f290332c = f290328w;
            return this;
        }
        this.f290332c = new io.grpc.internal.k0(executor);
        return this;
    }

    @Override // io.grpc.f0, io.grpc.s1
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public i G() {
        com.google.common.base.j0.h0(!this.f290336g, "Cannot change security when using ChannelCredentials");
        this.f290339j = c.PLAINTEXT;
        return this;
    }

    @Override // io.grpc.f0, io.grpc.s1
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public i H() {
        com.google.common.base.j0.h0(!this.f290336g, "Cannot change security when using ChannelCredentials");
        this.f290339j = c.TLS;
        return this;
    }

    private i(String str) {
        this.f290331b = q3.a();
        this.f290332c = f290328w;
        this.f290333d = g3.c(v0.L);
        this.f290338i = f290325t;
        this.f290339j = c.TLS;
        this.f290340k = Long.MAX_VALUE;
        this.f290341l = v0.A;
        this.f290342m = 65535;
        this.f290344o = 4194304;
        this.f290345p = Integer.MAX_VALUE;
        this.f290346q = false;
        a aVar = null;
        this.f290330a = new o1(str, new e(this, aVar), new d(this, aVar));
        this.f290336g = false;
    }

    i(String str, io.grpc.g gVar, io.grpc.d dVar, SSLSocketFactory sSLSocketFactory) {
        this.f290331b = q3.a();
        this.f290332c = f290328w;
        this.f290333d = g3.c(v0.L);
        this.f290338i = f290325t;
        c cVar = c.TLS;
        this.f290339j = cVar;
        this.f290340k = Long.MAX_VALUE;
        this.f290341l = v0.A;
        this.f290342m = 65535;
        this.f290344o = 4194304;
        this.f290345p = Integer.MAX_VALUE;
        this.f290346q = false;
        a aVar = null;
        this.f290330a = new o1(str, gVar, dVar, new e(this, aVar), new d(this, aVar));
        this.f290335f = sSLSocketFactory;
        this.f290339j = sSLSocketFactory == null ? c.PLAINTEXT : cVar;
        this.f290336g = true;
    }
}
