package okhttp3;

import io.sentry.k4;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n2624#2,3:1080\n2624#2,3:1083\n1#3:1086\n*S KotlinDebug\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n*L\n225#1:1080,3\n255#1:1083,3\n*E\n"})
public class b0 implements Cloneable, e.a, j0.a {

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    public static final b f333664k3 = new b(null);

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private static final List<c0> f333665l3 = jk.f.C(c0.HTTP_2, c0.HTTP_1_1);

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private static final List<l> f333666m3 = jk.f.C(l.f334690i, l.f334692k);
    private final int H1;

    @NotNull
    private final List<c0> X;

    @NotNull
    private final HostnameVerifier Y;

    @NotNull
    private final g Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f333667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f333668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<w> f333669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<w> f333670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final r.c f333671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f333672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final okhttp3.b f333673g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final int f333674g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f333675h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final int f333676h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f333677i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private final long f333678i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final n f333679j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.connection.h f333680j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final c f333681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final q f333682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final Proxy f333683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final ProxySelector f333684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final okhttp3.b f333685o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private final mk.c f333686p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final int f333687p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final int f333688p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final SocketFactory f333689s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final SSLSocketFactory f333690t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private final X509TrustManager f333691v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final List<l> f333692w;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<l> a() {
            return b0.f333666m3;
        }

        @NotNull
        public final List<c0> b() {
            return b0.f333665l3;
        }

        private b() {
        }
    }

    public b0(@NotNull a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorR;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f333667a = builder.E();
        this.f333668b = builder.B();
        this.f333669c = jk.f.h0(builder.K());
        this.f333670d = jk.f.h0(builder.M());
        this.f333671e = builder.G();
        this.f333672f = builder.T();
        this.f333673g = builder.v();
        this.f333675h = builder.H();
        this.f333677i = builder.I();
        this.f333679j = builder.D();
        this.f333681k = builder.w();
        this.f333682l = builder.F();
        this.f333683m = builder.P();
        if (builder.P() != null) {
            proxySelectorR = lk.a.f322696a;
        } else {
            proxySelectorR = builder.R();
            proxySelectorR = proxySelectorR == null ? ProxySelector.getDefault() : proxySelectorR;
            if (proxySelectorR == null) {
                proxySelectorR = lk.a.f322696a;
            }
        }
        this.f333684n = proxySelectorR;
        this.f333685o = builder.Q();
        this.f333689s = builder.V();
        List<l> listC = builder.C();
        this.f333692w = listC;
        this.X = builder.O();
        this.Y = builder.J();
        this.f333687p1 = builder.x();
        this.H1 = builder.A();
        this.f333688p2 = builder.S();
        this.f333674g3 = builder.X();
        this.f333676h3 = builder.N();
        this.f333678i3 = builder.L();
        okhttp3.internal.connection.h hVarU = builder.U();
        this.f333680j3 = hVarU == null ? new okhttp3.internal.connection.h() : hVarU;
        List<l> list = listC;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).i()) {
                    if (builder.W() != null) {
                        this.f333690t = builder.W();
                        mk.c cVarY = builder.y();
                        Intrinsics.checkNotNull(cVarY);
                        this.f333686p0 = cVarY;
                        X509TrustManager x509TrustManagerY = builder.Y();
                        Intrinsics.checkNotNull(x509TrustManagerY);
                        this.f333691v = x509TrustManagerY;
                        g gVarZ = builder.z();
                        Intrinsics.checkNotNull(cVarY);
                        this.Z = gVarZ.j(cVarY);
                    } else {
                        okhttp3.internal.platform.h.a aVar = okhttp3.internal.platform.h.f334560a;
                        X509TrustManager x509TrustManagerR = aVar.g().r();
                        this.f333691v = x509TrustManagerR;
                        okhttp3.internal.platform.h hVarG = aVar.g();
                        Intrinsics.checkNotNull(x509TrustManagerR);
                        this.f333690t = hVarG.q(x509TrustManagerR);
                        mk.c.a aVar2 = mk.c.f332679a;
                        Intrinsics.checkNotNull(x509TrustManagerR);
                        mk.c cVarA = aVar2.a(x509TrustManagerR);
                        this.f333686p0 = cVarA;
                        g gVarZ2 = builder.z();
                        Intrinsics.checkNotNull(cVarA);
                        this.Z = gVarZ2.j(cVarA);
                    }
                    l0();
                }
            }
        }
        this.f333690t = null;
        this.f333686p0 = null;
        this.f333691v = null;
        this.Z = g.f333840d;
        l0();
    }

    private final void l0() {
        List<w> list = this.f333669c;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f333669c).toString());
        }
        List<w> list2 = this.f333670d;
        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f333670d).toString());
        }
        List<l> list3 = this.f333692w;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).i()) {
                    if (this.f333690t == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f333686p0 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f333691v == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                }
            }
        }
        if (this.f333690t != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f333686p0 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f333691v != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.areEqual(this.Z, g.f333840d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "retryOnConnectionFailure", imports = {}))
    @oj.i(name = "-deprecated_retryOnConnectionFailure")
    public final boolean A() {
        return this.f333672f;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "socketFactory", imports = {}))
    @oj.i(name = "-deprecated_socketFactory")
    @NotNull
    public final SocketFactory B() {
        return this.f333689s;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "sslSocketFactory", imports = {}))
    @oj.i(name = "-deprecated_sslSocketFactory")
    @NotNull
    public final SSLSocketFactory C() {
        return k0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "writeTimeoutMillis", imports = {}))
    @oj.i(name = "-deprecated_writeTimeoutMillis")
    public final int D() {
        return this.f333674g3;
    }

    @oj.i(name = "authenticator")
    @NotNull
    public final okhttp3.b H() {
        return this.f333673g;
    }

    @oj.i(name = "cache")
    @Nullable
    public final c I() {
        return this.f333681k;
    }

    @oj.i(name = "callTimeoutMillis")
    public final int J() {
        return this.f333687p1;
    }

    @oj.i(name = "certificateChainCleaner")
    @Nullable
    public final mk.c K() {
        return this.f333686p0;
    }

    @oj.i(name = "certificatePinner")
    @NotNull
    public final g L() {
        return this.Z;
    }

    @oj.i(name = "connectTimeoutMillis")
    public final int M() {
        return this.H1;
    }

    @oj.i(name = "connectionPool")
    @NotNull
    public final k N() {
        return this.f333668b;
    }

    @oj.i(name = "connectionSpecs")
    @NotNull
    public final List<l> O() {
        return this.f333692w;
    }

    @oj.i(name = "cookieJar")
    @NotNull
    public final n P() {
        return this.f333679j;
    }

    @oj.i(name = "dispatcher")
    @NotNull
    public final p Q() {
        return this.f333667a;
    }

    @oj.i(name = "dns")
    @NotNull
    public final q S() {
        return this.f333682l;
    }

    @oj.i(name = "eventListenerFactory")
    @NotNull
    public final r.c T() {
        return this.f333671e;
    }

    @oj.i(name = "followRedirects")
    public final boolean U() {
        return this.f333675h;
    }

    @oj.i(name = "followSslRedirects")
    public final boolean V() {
        return this.f333677i;
    }

    @NotNull
    public final okhttp3.internal.connection.h W() {
        return this.f333680j3;
    }

    @oj.i(name = "hostnameVerifier")
    @NotNull
    public final HostnameVerifier X() {
        return this.Y;
    }

    @oj.i(name = "interceptors")
    @NotNull
    public final List<w> Y() {
        return this.f333669c;
    }

    @oj.i(name = "minWebSocketMessageToCompress")
    public final long Z() {
        return this.f333678i3;
    }

    @Override // okhttp3.e.a
    @NotNull
    public e a(@NotNull d0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new okhttp3.internal.connection.e(this, request, false);
    }

    @oj.i(name = "networkInterceptors")
    @NotNull
    public final List<w> a0() {
        return this.f333670d;
    }

    @Override // okhttp3.j0.a
    @NotNull
    public j0 b(@NotNull d0 request, @NotNull k0 listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        okhttp3.internal.ws.e eVar = new okhttp3.internal.ws.e(okhttp3.internal.concurrent.d.f334058i, request, listener, new Random(), this.f333676h3, null, this.f333678i3);
        eVar.m(this);
        return eVar;
    }

    @NotNull
    public a b0() {
        return new a(this);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "authenticator", imports = {}))
    @oj.i(name = "-deprecated_authenticator")
    @NotNull
    public final okhttp3.b c() {
        return this.f333673g;
    }

    @oj.i(name = "pingIntervalMillis")
    public final int c0() {
        return this.f333676h3;
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "cache", imports = {}))
    @oj.i(name = "-deprecated_cache")
    @Nullable
    public final c d() {
        return this.f333681k;
    }

    @oj.i(name = "protocols")
    @NotNull
    public final List<c0> d0() {
        return this.X;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "callTimeoutMillis", imports = {}))
    @oj.i(name = "-deprecated_callTimeoutMillis")
    public final int e() {
        return this.f333687p1;
    }

    @oj.i(name = "proxy")
    @Nullable
    public final Proxy e0() {
        return this.f333683m;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "certificatePinner", imports = {}))
    @oj.i(name = "-deprecated_certificatePinner")
    @NotNull
    public final g f() {
        return this.Z;
    }

    @oj.i(name = "proxyAuthenticator")
    @NotNull
    public final okhttp3.b f0() {
        return this.f333685o;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "connectTimeoutMillis", imports = {}))
    @oj.i(name = "-deprecated_connectTimeoutMillis")
    public final int g() {
        return this.H1;
    }

    @oj.i(name = "proxySelector")
    @NotNull
    public final ProxySelector g0() {
        return this.f333684n;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "connectionPool", imports = {}))
    @oj.i(name = "-deprecated_connectionPool")
    @NotNull
    public final k h() {
        return this.f333668b;
    }

    @oj.i(name = "readTimeoutMillis")
    public final int h0() {
        return this.f333688p2;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "connectionSpecs", imports = {}))
    @oj.i(name = "-deprecated_connectionSpecs")
    @NotNull
    public final List<l> i() {
        return this.f333692w;
    }

    @oj.i(name = "retryOnConnectionFailure")
    public final boolean i0() {
        return this.f333672f;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "cookieJar", imports = {}))
    @oj.i(name = "-deprecated_cookieJar")
    @NotNull
    public final n j() {
        return this.f333679j;
    }

    @oj.i(name = "socketFactory")
    @NotNull
    public final SocketFactory j0() {
        return this.f333689s;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "dispatcher", imports = {}))
    @oj.i(name = "-deprecated_dispatcher")
    @NotNull
    public final p k() {
        return this.f333667a;
    }

    @oj.i(name = "sslSocketFactory")
    @NotNull
    public final SSLSocketFactory k0() {
        SSLSocketFactory sSLSocketFactory = this.f333690t;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "dns", imports = {}))
    @oj.i(name = "-deprecated_dns")
    @NotNull
    public final q l() {
        return this.f333682l;
    }

    @oj.i(name = "writeTimeoutMillis")
    public final int m0() {
        return this.f333674g3;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "eventListenerFactory", imports = {}))
    @oj.i(name = "-deprecated_eventListenerFactory")
    @NotNull
    public final r.c n() {
        return this.f333671e;
    }

    @oj.i(name = "x509TrustManager")
    @Nullable
    public final X509TrustManager n0() {
        return this.f333691v;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "followRedirects", imports = {}))
    @oj.i(name = "-deprecated_followRedirects")
    public final boolean o() {
        return this.f333675h;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "followSslRedirects", imports = {}))
    @oj.i(name = "-deprecated_followSslRedirects")
    public final boolean p() {
        return this.f333677i;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "hostnameVerifier", imports = {}))
    @oj.i(name = "-deprecated_hostnameVerifier")
    @NotNull
    public final HostnameVerifier q() {
        return this.Y;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "interceptors", imports = {}))
    @oj.i(name = "-deprecated_interceptors")
    @NotNull
    public final List<w> r() {
        return this.f333669c;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "networkInterceptors", imports = {}))
    @oj.i(name = "-deprecated_networkInterceptors")
    @NotNull
    public final List<w> s() {
        return this.f333670d;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "pingIntervalMillis", imports = {}))
    @oj.i(name = "-deprecated_pingIntervalMillis")
    public final int t() {
        return this.f333676h3;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "protocols", imports = {}))
    @oj.i(name = "-deprecated_protocols")
    @NotNull
    public final List<c0> u() {
        return this.X;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxy", imports = {}))
    @oj.i(name = "-deprecated_proxy")
    @Nullable
    public final Proxy v() {
        return this.f333683m;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxyAuthenticator", imports = {}))
    @oj.i(name = "-deprecated_proxyAuthenticator")
    @NotNull
    public final okhttp3.b w() {
        return this.f333685o;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxySelector", imports = {}))
    @oj.i(name = "-deprecated_proxySelector")
    @NotNull
    public final ProxySelector x() {
        return this.f333684n;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "readTimeoutMillis", imports = {}))
    @oj.i(name = "-deprecated_readTimeoutMillis")
    public final int z() {
        return this.f333688p2;
    }

    @SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n1#2:1080\n*E\n"})
    public static final class a {
        private int A;
        private int B;
        private long C;

        @Nullable
        private okhttp3.internal.connection.h D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private p f333693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private k f333694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<w> f333695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final List<w> f333696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private r.c f333697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f333698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private okhttp3.b f333699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f333700h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f333701i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private n f333702j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        private c f333703k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private q f333704l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        private Proxy f333705m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        private ProxySelector f333706n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        private okhttp3.b f333707o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        private SocketFactory f333708p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Nullable
        private SSLSocketFactory f333709q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        private X509TrustManager f333710r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        private List<l> f333711s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        private List<? extends c0> f333712t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NotNull
        private HostnameVerifier f333713u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NotNull
        private g f333714v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @Nullable
        private mk.c f333715w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f333716x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f333717y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f333718z;

        /* JADX INFO: renamed from: okhttp3.b0$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder$addInterceptor$2\n*L\n1#1,1079:1\n*E\n"})
        public static final class C2351a implements w {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<w.a, f0> f333719b;

            /* JADX WARN: Multi-variable type inference failed */
            public C2351a(Function1<? super w.a, f0> function1) {
                this.f333719b = function1;
            }

            @Override // okhttp3.w
            @NotNull
            public final f0 intercept(@NotNull w.a chain) {
                Intrinsics.checkNotNullParameter(chain, "chain");
                return this.f333719b.invoke(chain);
            }
        }

        @SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder$addNetworkInterceptor$2\n*L\n1#1,1079:1\n*E\n"})
        public static final class b implements w {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<w.a, f0> f333720b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super w.a, f0> function1) {
                this.f333720b = function1;
            }

            @Override // okhttp3.w
            @NotNull
            public final f0 intercept(@NotNull w.a chain) {
                Intrinsics.checkNotNullParameter(chain, "chain");
                return this.f333720b.invoke(chain);
            }
        }

        public a() {
            this.f333693a = new p();
            this.f333694b = new k();
            this.f333695c = new ArrayList();
            this.f333696d = new ArrayList();
            this.f333697e = jk.f.g(r.f334753b);
            this.f333698f = true;
            okhttp3.b bVar = okhttp3.b.f333661b;
            this.f333699g = bVar;
            this.f333700h = true;
            this.f333701i = true;
            this.f333702j = n.f334739b;
            this.f333704l = q.f334750b;
            this.f333707o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.f333708p = socketFactory;
            b bVar2 = b0.f333664k3;
            this.f333711s = bVar2.a();
            this.f333712t = bVar2.b();
            this.f333713u = mk.d.f332680a;
            this.f333714v = g.f333840d;
            this.f333717y = 10000;
            this.f333718z = 10000;
            this.A = 10000;
            this.C = 1024L;
        }

        public final int A() {
            return this.f333717y;
        }

        public final void A0(@NotNull HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "<set-?>");
            this.f333713u = hostnameVerifier;
        }

        @NotNull
        public final k B() {
            return this.f333694b;
        }

        public final void B0(long j10) {
            this.C = j10;
        }

        @NotNull
        public final List<l> C() {
            return this.f333711s;
        }

        public final void C0(int i10) {
            this.B = i10;
        }

        @NotNull
        public final n D() {
            return this.f333702j;
        }

        public final void D0(@NotNull List<? extends c0> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f333712t = list;
        }

        @NotNull
        public final p E() {
            return this.f333693a;
        }

        public final void E0(@Nullable Proxy proxy) {
            this.f333705m = proxy;
        }

        @NotNull
        public final q F() {
            return this.f333704l;
        }

        public final void F0(@NotNull okhttp3.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            this.f333707o = bVar;
        }

        @NotNull
        public final r.c G() {
            return this.f333697e;
        }

        public final void G0(@Nullable ProxySelector proxySelector) {
            this.f333706n = proxySelector;
        }

        public final boolean H() {
            return this.f333700h;
        }

        public final void H0(int i10) {
            this.f333718z = i10;
        }

        public final boolean I() {
            return this.f333701i;
        }

        public final void I0(boolean z10) {
            this.f333698f = z10;
        }

        @NotNull
        public final HostnameVerifier J() {
            return this.f333713u;
        }

        public final void J0(@Nullable okhttp3.internal.connection.h hVar) {
            this.D = hVar;
        }

        @NotNull
        public final List<w> K() {
            return this.f333695c;
        }

        public final void K0(@NotNull SocketFactory socketFactory) {
            Intrinsics.checkNotNullParameter(socketFactory, "<set-?>");
            this.f333708p = socketFactory;
        }

        public final long L() {
            return this.C;
        }

        public final void L0(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.f333709q = sSLSocketFactory;
        }

        @NotNull
        public final List<w> M() {
            return this.f333696d;
        }

        public final void M0(int i10) {
            this.A = i10;
        }

        public final int N() {
            return this.B;
        }

        public final void N0(@Nullable X509TrustManager x509TrustManager) {
            this.f333710r = x509TrustManager;
        }

        @NotNull
        public final List<c0> O() {
            return this.f333712t;
        }

        @NotNull
        public final a O0(@NotNull SocketFactory socketFactory) {
            Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if (!Intrinsics.areEqual(socketFactory, this.f333708p)) {
                this.D = null;
            }
            this.f333708p = socketFactory;
            return this;
        }

        @Nullable
        public final Proxy P() {
            return this.f333705m;
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        @NotNull
        public final a P0(@NotNull SSLSocketFactory sslSocketFactory) throws IllegalAccessException {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            if (!Intrinsics.areEqual(sslSocketFactory, this.f333709q)) {
                this.D = null;
            }
            this.f333709q = sslSocketFactory;
            okhttp3.internal.platform.h.a aVar = okhttp3.internal.platform.h.f334560a;
            X509TrustManager x509TrustManagerS = aVar.g().s(sslSocketFactory);
            if (x509TrustManagerS != null) {
                this.f333710r = x509TrustManagerS;
                okhttp3.internal.platform.h hVarG = aVar.g();
                X509TrustManager x509TrustManager = this.f333710r;
                Intrinsics.checkNotNull(x509TrustManager);
                this.f333715w = hVarG.d(x509TrustManager);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + aVar.g() + ", sslSocketFactory is " + sslSocketFactory.getClass());
        }

        @NotNull
        public final okhttp3.b Q() {
            return this.f333707o;
        }

        @NotNull
        public final a Q0(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (!Intrinsics.areEqual(sslSocketFactory, this.f333709q) || !Intrinsics.areEqual(trustManager, this.f333710r)) {
                this.D = null;
            }
            this.f333709q = sslSocketFactory;
            this.f333715w = mk.c.f332679a.a(trustManager);
            this.f333710r = trustManager;
            return this;
        }

        @Nullable
        public final ProxySelector R() {
            return this.f333706n;
        }

        @NotNull
        public final a R0(long j10, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.A = jk.f.m(k4.f305718l3, j10, unit);
            return this;
        }

        public final int S() {
            return this.f333718z;
        }

        @zl.a
        @NotNull
        public final a S0(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            R0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final boolean T() {
            return this.f333698f;
        }

        @Nullable
        public final okhttp3.internal.connection.h U() {
            return this.D;
        }

        @NotNull
        public final SocketFactory V() {
            return this.f333708p;
        }

        @Nullable
        public final SSLSocketFactory W() {
            return this.f333709q;
        }

        public final int X() {
            return this.A;
        }

        @Nullable
        public final X509TrustManager Y() {
            return this.f333710r;
        }

        @NotNull
        public final a Z(@NotNull HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!Intrinsics.areEqual(hostnameVerifier, this.f333713u)) {
                this.D = null;
            }
            this.f333713u = hostnameVerifier;
            return this;
        }

        @oj.i(name = "-addInterceptor")
        @NotNull
        public final a a(@NotNull Function1<? super w.a, f0> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return c(new C2351a(block));
        }

        @NotNull
        public final List<w> a0() {
            return this.f333695c;
        }

        @oj.i(name = "-addNetworkInterceptor")
        @NotNull
        public final a b(@NotNull Function1<? super w.a, f0> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return d(new b(block));
        }

        @NotNull
        public final a b0(long j10) {
            if (j10 >= 0) {
                this.C = j10;
                return this;
            }
            throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + j10).toString());
        }

        @NotNull
        public final a c(@NotNull w interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f333695c.add(interceptor);
            return this;
        }

        @NotNull
        public final List<w> c0() {
            return this.f333696d;
        }

        @NotNull
        public final a d(@NotNull w interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f333696d.add(interceptor);
            return this;
        }

        @NotNull
        public final a d0(long j10, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.B = jk.f.m("interval", j10, unit);
            return this;
        }

        @NotNull
        public final a e(@NotNull okhttp3.b authenticator) {
            Intrinsics.checkNotNullParameter(authenticator, "authenticator");
            this.f333699g = authenticator;
            return this;
        }

        @zl.a
        @NotNull
        public final a e0(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            d0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final b0 f() {
            return new b0(this);
        }

        @NotNull
        public final a f0(@NotNull List<? extends c0> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            List mutableList = CollectionsKt.toMutableList((Collection) protocols);
            c0 c0Var = c0.H2_PRIOR_KNOWLEDGE;
            if (!mutableList.contains(c0Var) && !mutableList.contains(c0.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            }
            if (mutableList.contains(c0Var) && mutableList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
            }
            if (mutableList.contains(c0.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
            }
            Intrinsics.checkNotNull(mutableList, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (mutableList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            mutableList.remove(c0.SPDY_3);
            if (!Intrinsics.areEqual(mutableList, this.f333712t)) {
                this.D = null;
            }
            List<? extends c0> listUnmodifiableList = Collections.unmodifiableList(mutableList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            this.f333712t = listUnmodifiableList;
            return this;
        }

        @NotNull
        public final a g(@Nullable c cVar) {
            this.f333703k = cVar;
            return this;
        }

        @NotNull
        public final a g0(@Nullable Proxy proxy) {
            if (!Intrinsics.areEqual(proxy, this.f333705m)) {
                this.D = null;
            }
            this.f333705m = proxy;
            return this;
        }

        @NotNull
        public final a h(long j10, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f333716x = jk.f.m(k4.f305718l3, j10, unit);
            return this;
        }

        @NotNull
        public final a h0(@NotNull okhttp3.b proxyAuthenticator) {
            Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
            if (!Intrinsics.areEqual(proxyAuthenticator, this.f333707o)) {
                this.D = null;
            }
            this.f333707o = proxyAuthenticator;
            return this;
        }

        @zl.a
        @NotNull
        public final a i(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            h(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final a i0(@NotNull ProxySelector proxySelector) {
            Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
            if (!Intrinsics.areEqual(proxySelector, this.f333706n)) {
                this.D = null;
            }
            this.f333706n = proxySelector;
            return this;
        }

        @NotNull
        public final a j(@NotNull g certificatePinner) {
            Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
            if (!Intrinsics.areEqual(certificatePinner, this.f333714v)) {
                this.D = null;
            }
            this.f333714v = certificatePinner;
            return this;
        }

        @NotNull
        public final a j0(long j10, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f333718z = jk.f.m(k4.f305718l3, j10, unit);
            return this;
        }

        @NotNull
        public final a k(long j10, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f333717y = jk.f.m(k4.f305718l3, j10, unit);
            return this;
        }

        @zl.a
        @NotNull
        public final a k0(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            j0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @zl.a
        @NotNull
        public final a l(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            k(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final a l0(boolean z10) {
            this.f333698f = z10;
            return this;
        }

        @NotNull
        public final a m(@NotNull k connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            this.f333694b = connectionPool;
            return this;
        }

        public final void m0(@NotNull okhttp3.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            this.f333699g = bVar;
        }

        @NotNull
        public final a n(@NotNull List<l> connectionSpecs) {
            Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
            if (!Intrinsics.areEqual(connectionSpecs, this.f333711s)) {
                this.D = null;
            }
            this.f333711s = jk.f.h0(connectionSpecs);
            return this;
        }

        public final void n0(@Nullable c cVar) {
            this.f333703k = cVar;
        }

        @NotNull
        public final a o(@NotNull n cookieJar) {
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            this.f333702j = cookieJar;
            return this;
        }

        public final void o0(int i10) {
            this.f333716x = i10;
        }

        @NotNull
        public final a p(@NotNull p dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            this.f333693a = dispatcher;
            return this;
        }

        public final void p0(@Nullable mk.c cVar) {
            this.f333715w = cVar;
        }

        @NotNull
        public final a q(@NotNull q dns) {
            Intrinsics.checkNotNullParameter(dns, "dns");
            if (!Intrinsics.areEqual(dns, this.f333704l)) {
                this.D = null;
            }
            this.f333704l = dns;
            return this;
        }

        public final void q0(@NotNull g gVar) {
            Intrinsics.checkNotNullParameter(gVar, "<set-?>");
            this.f333714v = gVar;
        }

        @NotNull
        public final a r(@NotNull r eventListener) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            this.f333697e = jk.f.g(eventListener);
            return this;
        }

        public final void r0(int i10) {
            this.f333717y = i10;
        }

        @NotNull
        public final a s(@NotNull r.c eventListenerFactory) {
            Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
            this.f333697e = eventListenerFactory;
            return this;
        }

        public final void s0(@NotNull k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.f333694b = kVar;
        }

        @NotNull
        public final a t(boolean z10) {
            this.f333700h = z10;
            return this;
        }

        public final void t0(@NotNull List<l> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f333711s = list;
        }

        @NotNull
        public final a u(boolean z10) {
            this.f333701i = z10;
            return this;
        }

        public final void u0(@NotNull n nVar) {
            Intrinsics.checkNotNullParameter(nVar, "<set-?>");
            this.f333702j = nVar;
        }

        @NotNull
        public final okhttp3.b v() {
            return this.f333699g;
        }

        public final void v0(@NotNull p pVar) {
            Intrinsics.checkNotNullParameter(pVar, "<set-?>");
            this.f333693a = pVar;
        }

        @Nullable
        public final c w() {
            return this.f333703k;
        }

        public final void w0(@NotNull q qVar) {
            Intrinsics.checkNotNullParameter(qVar, "<set-?>");
            this.f333704l = qVar;
        }

        public final int x() {
            return this.f333716x;
        }

        public final void x0(@NotNull r.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f333697e = cVar;
        }

        @Nullable
        public final mk.c y() {
            return this.f333715w;
        }

        public final void y0(boolean z10) {
            this.f333700h = z10;
        }

        @NotNull
        public final g z() {
            return this.f333714v;
        }

        public final void z0(boolean z10) {
            this.f333701i = z10;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull b0 okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.f333693a = okHttpClient.Q();
            this.f333694b = okHttpClient.N();
            CollectionsKt.addAll(this.f333695c, okHttpClient.Y());
            CollectionsKt.addAll(this.f333696d, okHttpClient.a0());
            this.f333697e = okHttpClient.T();
            this.f333698f = okHttpClient.i0();
            this.f333699g = okHttpClient.H();
            this.f333700h = okHttpClient.U();
            this.f333701i = okHttpClient.V();
            this.f333702j = okHttpClient.P();
            this.f333703k = okHttpClient.I();
            this.f333704l = okHttpClient.S();
            this.f333705m = okHttpClient.e0();
            this.f333706n = okHttpClient.g0();
            this.f333707o = okHttpClient.f0();
            this.f333708p = okHttpClient.j0();
            this.f333709q = okHttpClient.f333690t;
            this.f333710r = okHttpClient.n0();
            this.f333711s = okHttpClient.O();
            this.f333712t = okHttpClient.d0();
            this.f333713u = okHttpClient.X();
            this.f333714v = okHttpClient.L();
            this.f333715w = okHttpClient.K();
            this.f333716x = okHttpClient.J();
            this.f333717y = okHttpClient.M();
            this.f333718z = okHttpClient.h0();
            this.A = okHttpClient.m0();
            this.B = okHttpClient.c0();
            this.C = okHttpClient.Z();
            this.D = okHttpClient.W();
        }
    }

    public b0() {
        this(new a());
    }
}
