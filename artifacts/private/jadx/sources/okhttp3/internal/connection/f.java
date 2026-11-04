package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.h0;
import okhttp3.l;
import okhttp3.r;
import okhttp3.t;
import okhttp3.v;
import okio.e1;
import okio.m;
import okio.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1#2:766\n608#3,4:767\n608#3,4:774\n615#3,4:778\n1747#4,3:771\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n*L\n529#1:767,4\n582#1:774,4\n648#1:778,4\n574#1:771,3\n*E\n"})
public final class f extends okhttp3.internal.http2.f.c implements okhttp3.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final a f334125t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f334126u = "throw with null exception";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f334127v = 21;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f334128w = 10000000000L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g f334129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h0 f334130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Socket f334131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Socket f334132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private t f334133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private c0 f334134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private okhttp3.internal.http2.f f334135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private n f334136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private m f334137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f334138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f334139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f334140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f334141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f334142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f334143q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final List<Reference<okhttp3.internal.connection.e>> f334144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f334145s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f a(@NotNull g connectionPool, @NotNull h0 route, @NotNull Socket socket, long j10) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(socket, "socket");
            f fVar = new f(connectionPool, route);
            fVar.f334132f = socket;
            fVar.G(j10);
            return fVar;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f334146a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f334146a = iArr;
        }
    }

    static final class c extends l0 implements Function0<List<? extends Certificate>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ okhttp3.g f334147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f334148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ okhttp3.a f334149c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(okhttp3.g gVar, t tVar, okhttp3.a aVar) {
            super(0);
            this.f334147a = gVar;
            this.f334148b = tVar;
            this.f334149c = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            mk.c cVarE = this.f334147a.e();
            Intrinsics.checkNotNull(cVarE);
            return cVarE.a(this.f334148b.m(), this.f334149c.w().F());
        }
    }

    @SourceDebugExtension({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1549#2:766\n1620#2,3:767\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n*L\n411#1:766\n411#1:767,3\n*E\n"})
    static final class d extends l0 implements Function0<List<? extends X509Certificate>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            t tVar = f.this.f334133g;
            Intrinsics.checkNotNull(tVar);
            List<Certificate> listM = tVar.m();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM, 10));
            for (Certificate certificate : listM) {
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public static final class e extends okhttp3.internal.ws.e.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.connection.c f334151d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n nVar, m mVar, okhttp3.internal.connection.c cVar) {
            super(true, nVar, mVar);
            this.f334151d = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f334151d.a(-1L, true, true, null);
        }
    }

    public f(@NotNull g connectionPool, @NotNull h0 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f334129c = connectionPool;
        this.f334130d = route;
        this.f334143q = 1;
        this.f334144r = new ArrayList();
        this.f334145s = Long.MAX_VALUE;
    }

    private final boolean F(List<h0> list) {
        List<h0> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (h0 h0Var : list2) {
            Proxy.Type type = h0Var.e().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f334130d.e().type() == type2 && Intrinsics.areEqual(this.f334130d.g(), h0Var.g())) {
                return true;
            }
        }
        return false;
    }

    private final void J(int i10) throws IOException {
        Socket socket = this.f334132f;
        Intrinsics.checkNotNull(socket);
        n nVar = this.f334136j;
        Intrinsics.checkNotNull(nVar);
        m mVar = this.f334137k;
        Intrinsics.checkNotNull(mVar);
        socket.setSoTimeout(0);
        okhttp3.internal.http2.f fVarA = new okhttp3.internal.http2.f.a(true, okhttp3.internal.concurrent.d.f334058i).y(socket, this.f334130d.d().w().F(), nVar, mVar).k(this).l(i10).a();
        this.f334135i = fVarA;
        this.f334143q = okhttp3.internal.http2.f.f334330j3.a().f();
        okhttp3.internal.http2.f.E1(fVarA, false, null, 3, null);
    }

    private final boolean K(v vVar) {
        t tVar;
        if (jk.f.f307490h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        v vVarW = this.f334130d.d().w();
        if (vVar.N() != vVarW.N()) {
            return false;
        }
        if (Intrinsics.areEqual(vVar.F(), vVarW.F())) {
            return true;
        }
        if (!this.f334139m && (tVar = this.f334133g) != null) {
            Intrinsics.checkNotNull(tVar);
            if (j(vVar, tVar)) {
                return true;
            }
        }
        return false;
    }

    private final boolean j(v vVar, t tVar) {
        List<Certificate> listM = tVar.m();
        if (!listM.isEmpty()) {
            mk.d dVar = mk.d.f332680a;
            String strF = vVar.F();
            Certificate certificate = listM.get(0);
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(strF, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final void m(int i10, int i11, okhttp3.e eVar, r rVar) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyE = this.f334130d.e();
        okhttp3.a aVarD = this.f334130d.d();
        Proxy.Type type = proxyE.type();
        int i12 = type == null ? -1 : b.f334146a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = aVarD.u().createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyE);
        }
        this.f334131e = socketCreateSocket;
        rVar.j(eVar, this.f334130d.g(), proxyE);
        socketCreateSocket.setSoTimeout(i11);
        try {
            okhttp3.internal.platform.h.f334560a.g().g(socketCreateSocket, this.f334130d.g(), i10);
            try {
                this.f334136j = okio.l0.e(okio.l0.v(socketCreateSocket));
                this.f334137k = okio.l0.d(okio.l0.q(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (Intrinsics.areEqual(e10.getMessage(), f334126u)) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f334130d.g());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void n(okhttp3.internal.connection.b bVar) throws Throwable {
        okhttp3.a aVarD = this.f334130d.d();
        SSLSocketFactory sSLSocketFactoryV = aVarD.v();
        SSLSocket sSLSocket = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactoryV);
            Socket socketCreateSocket = sSLSocketFactoryV.createSocket(this.f334131e, aVarD.w().F(), aVarD.w().N(), true);
            Intrinsics.checkNotNull(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                l lVarA = bVar.a(sSLSocket2);
                if (lVarA.k()) {
                    okhttp3.internal.platform.h.f334560a.g().f(sSLSocket2, aVarD.w().F(), aVarD.q());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                t.a aVar = t.f334761e;
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                t tVarB = aVar.b(sslSocketSession);
                HostnameVerifier hostnameVerifierP = aVarD.p();
                Intrinsics.checkNotNull(hostnameVerifierP);
                if (hostnameVerifierP.verify(aVarD.w().F(), sslSocketSession)) {
                    okhttp3.g gVarL = aVarD.l();
                    Intrinsics.checkNotNull(gVarL);
                    this.f334133g = new t(tVarB.o(), tVarB.g(), tVarB.k(), new c(gVarL, tVarB, aVarD));
                    gVarL.c(aVarD.w().F(), new d());
                    String strJ = lVarA.k() ? okhttp3.internal.platform.h.f334560a.g().j(sSLSocket2) : null;
                    this.f334132f = sSLSocket2;
                    this.f334136j = okio.l0.e(okio.l0.v(sSLSocket2));
                    this.f334137k = okio.l0.d(okio.l0.q(sSLSocket2));
                    this.f334134h = strJ != null ? c0.f333760b.a(strJ) : c0.HTTP_1_1;
                    okhttp3.internal.platform.h.f334560a.g().c(sSLSocket2);
                    return;
                }
                List<Certificate> listM = tVarB.m();
                if (listM.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVarD.w().F() + " not verified (no certificates)");
                }
                Certificate certificate = listM.get(0);
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) certificate;
                throw new SSLPeerUnverifiedException(StringsKt.r("\n              |Hostname " + aVarD.w().F() + " not verified:\n              |    certificate: " + okhttp3.g.f333839c.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + mk.d.f332680a.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    okhttp3.internal.platform.h.f334560a.g().c(sSLSocket);
                }
                if (sSLSocket != null) {
                    jk.f.q(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void o(int i10, int i11, int i12, okhttp3.e eVar, r rVar) throws IOException {
        d0 d0VarQ = q();
        v vVarQ = d0VarQ.q();
        for (int i13 = 0; i13 < 21; i13++) {
            m(i10, i11, eVar, rVar);
            d0VarQ = p(i11, i12, d0VarQ, vVarQ);
            if (d0VarQ == null) {
                break;
            }
            Socket socket = this.f334131e;
            if (socket != null) {
                jk.f.q(socket);
            }
            this.f334131e = null;
            this.f334137k = null;
            this.f334136j = null;
            rVar.h(eVar, this.f334130d.g(), this.f334130d.e(), null);
        }
    }

    private final d0 p(int i10, int i11, d0 d0Var, v vVar) throws IOException {
        String str = "CONNECT " + jk.f.f0(vVar, true) + " HTTP/1.1";
        while (true) {
            n nVar = this.f334136j;
            Intrinsics.checkNotNull(nVar);
            m mVar = this.f334137k;
            Intrinsics.checkNotNull(mVar);
            int i12 = 3 >> 0;
            okhttp3.internal.http1.b bVar = new okhttp3.internal.http1.b(null, this, nVar, mVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            nVar.timeout().k(i10, timeUnit);
            mVar.timeout().k(i11, timeUnit);
            bVar.B(d0Var.k(), str);
            bVar.d();
            f0.a aVarG = bVar.g(false);
            Intrinsics.checkNotNull(aVarG);
            f0 f0VarC = aVarG.E(d0Var).c();
            bVar.A(f0VarC);
            int iE = f0VarC.E();
            if (iE == 200) {
                if (nVar.n().y1() && mVar.n().y1()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iE != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + f0VarC.E());
            }
            d0 d0VarA = this.f334130d.d().s().a(this.f334130d, f0VarC);
            if (d0VarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (StringsKt.N1("close", f0.T(f0VarC, com.google.common.net.d.f119523o, null, 2, null), true)) {
                return d0VarA;
            }
            d0Var = d0VarA;
        }
    }

    private final d0 q() throws IOException {
        d0 d0VarB = new d0.a().D(this.f334130d.d().w()).p("CONNECT", null).n(com.google.common.net.d.f119547w, jk.f.f0(this.f334130d.d().w(), true)).n("Proxy-Connection", com.google.common.net.d.f119542u0).n(com.google.common.net.d.P, jk.f.f307492j).b();
        d0 d0VarA = this.f334130d.d().s().a(this.f334130d, new f0.a().E(d0VarB).B(c0.HTTP_1_1).g(407).y("Preemptive Authenticate").b(jk.f.f307485c).F(-1L).C(-1L).v("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return d0VarA == null ? d0VarB : d0VarA;
    }

    private final void r(okhttp3.internal.connection.b bVar, int i10, okhttp3.e eVar, r rVar) throws Throwable {
        if (this.f334130d.d().v() != null) {
            rVar.C(eVar);
            n(bVar);
            rVar.B(eVar, this.f334133g);
            if (this.f334134h == c0.HTTP_2) {
                J(i10);
                return;
            }
            return;
        }
        List<c0> listQ = this.f334130d.d().q();
        c0 c0Var = c0.H2_PRIOR_KNOWLEDGE;
        if (!listQ.contains(c0Var)) {
            this.f334132f = this.f334131e;
            this.f334134h = c0.HTTP_1_1;
        } else {
            this.f334132f = this.f334131e;
            this.f334134h = c0Var;
            J(i10);
        }
    }

    public final boolean A() {
        return this.f334135i != null;
    }

    @NotNull
    public final okhttp3.internal.http.d B(@NotNull b0 client, @NotNull okhttp3.internal.http.g chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f334132f;
        Intrinsics.checkNotNull(socket);
        n nVar = this.f334136j;
        Intrinsics.checkNotNull(nVar);
        m mVar = this.f334137k;
        Intrinsics.checkNotNull(mVar);
        okhttp3.internal.http2.f fVar = this.f334135i;
        if (fVar != null) {
            return new okhttp3.internal.http2.g(client, this, chain, fVar);
        }
        socket.setSoTimeout(chain.a());
        e1 e1VarTimeout = nVar.timeout();
        long jN = chain.n();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e1VarTimeout.k(jN, timeUnit);
        mVar.timeout().k(chain.p(), timeUnit);
        return new okhttp3.internal.http1.b(client, this, nVar, mVar);
    }

    @NotNull
    public final okhttp3.internal.ws.e.d C(@NotNull okhttp3.internal.connection.c exchange) throws SocketException {
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Socket socket = this.f334132f;
        Intrinsics.checkNotNull(socket);
        n nVar = this.f334136j;
        Intrinsics.checkNotNull(nVar);
        m mVar = this.f334137k;
        Intrinsics.checkNotNull(mVar);
        socket.setSoTimeout(0);
        E();
        return new e(nVar, mVar, exchange);
    }

    public final synchronized void D() {
        this.f334139m = true;
    }

    public final synchronized void E() {
        try {
            this.f334138l = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void G(long j10) {
        this.f334145s = j10;
    }

    public final void H(boolean z10) {
        this.f334138l = z10;
    }

    public final void I(int i10) {
        this.f334140n = i10;
    }

    public final synchronized void L(@NotNull okhttp3.internal.connection.e call, @Nullable IOException iOException) {
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            if (iOException instanceof okhttp3.internal.http2.n) {
                if (((okhttp3.internal.http2.n) iOException).f334496a == okhttp3.internal.http2.b.REFUSED_STREAM) {
                    int i10 = this.f334142p + 1;
                    this.f334142p = i10;
                    if (i10 > 1) {
                        this.f334138l = true;
                        this.f334140n++;
                    }
                } else if (((okhttp3.internal.http2.n) iOException).f334496a != okhttp3.internal.http2.b.CANCEL || !call.isCanceled()) {
                    this.f334138l = true;
                    this.f334140n++;
                }
            } else if (!A() || (iOException instanceof okhttp3.internal.http2.a)) {
                this.f334138l = true;
                if (this.f334141o == 0) {
                    if (iOException != null) {
                        l(call.j(), this.f334130d, iOException);
                    }
                    this.f334140n++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okhttp3.j
    @NotNull
    public c0 a() {
        c0 c0Var = this.f334134h;
        Intrinsics.checkNotNull(c0Var);
        return c0Var;
    }

    @Override // okhttp3.j
    @NotNull
    public h0 b() {
        return this.f334130d;
    }

    @Override // okhttp3.j
    @Nullable
    public t c() {
        return this.f334133g;
    }

    @Override // okhttp3.j
    @NotNull
    public Socket d() {
        Socket socket = this.f334132f;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    @Override // okhttp3.internal.http2.f.c
    public synchronized void e(@NotNull okhttp3.internal.http2.f connection, @NotNull okhttp3.internal.http2.m settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f334143q = settings.f();
    }

    @Override // okhttp3.internal.http2.f.c
    public void f(@NotNull okhttp3.internal.http2.i stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.d(okhttp3.internal.http2.b.REFUSED_STREAM, null);
    }

    public final void i() {
        Socket socket = this.f334131e;
        if (socket != null) {
            jk.f.q(socket);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    /* JADX WARN: Code duplicated, block: B:53:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0130  */
    /* JADX WARN: Code duplicated, block: B:57:0x0136  */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[LOOP:0: B:73:0x0096->B:61:0x0141, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0147 A[SYNTHETIC] */
    public final void k(int i10, int i11, int i12, int i13, boolean z10, @NotNull okhttp3.e eVar, @NotNull r rVar) throws Throwable {
        IOException iOException;
        Socket socket;
        Socket socket2;
        okhttp3.e call = eVar;
        r eventListener = rVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        if (this.f334134h != null) {
            throw new IllegalStateException("already connected");
        }
        List<l> listM = this.f334130d.d().m();
        okhttp3.internal.connection.b bVar = new okhttp3.internal.connection.b(listM);
        if (this.f334130d.d().v() == null) {
            if (!listM.contains(l.f334692k)) {
                throw new i(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strF = this.f334130d.d().w().F();
            if (!okhttp3.internal.platform.h.f334560a.g().l(strF)) {
                throw new i(new UnknownServiceException("CLEARTEXT communication to " + strF + " not permitted by network security policy"));
            }
        } else if (this.f334130d.d().q().contains(c0.H2_PRIOR_KNOWLEDGE)) {
            throw new i(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        i iVar = null;
        while (true) {
            try {
                if (this.f334130d.f()) {
                    r rVar2 = eventListener;
                    okhttp3.e eVar2 = call;
                    try {
                        o(i10, i11, i12, eVar2, rVar2);
                        call = eVar2;
                        eventListener = rVar2;
                        try {
                            if (this.f334131e != null) {
                                break;
                            } else {
                                break;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            iOException = e;
                            socket = this.f334132f;
                            if (socket != null) {
                                jk.f.q(socket);
                            }
                            socket2 = this.f334131e;
                            if (socket2 != null) {
                                jk.f.q(socket2);
                            }
                            this.f334132f = null;
                            this.f334131e = null;
                            this.f334136j = null;
                            this.f334137k = null;
                            this.f334133g = null;
                            this.f334134h = null;
                            this.f334135i = null;
                            this.f334143q = 1;
                            eventListener.i(call, this.f334130d.g(), this.f334130d.e(), null, iOException);
                            if (iVar == null) {
                                iVar = new i(iOException);
                            } else {
                                iVar.a(iOException);
                            }
                            if (z10) {
                                throw iVar;
                            }
                            if (bVar.b(iOException)) {
                                throw iVar;
                            }
                            call = eVar;
                            eventListener = rVar;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        call = eVar2;
                        eventListener = rVar2;
                    }
                } else {
                    m(i10, i11, call, eventListener);
                }
                try {
                    r(bVar, i13, call, eventListener);
                    eventListener.h(call, this.f334130d.g(), this.f334130d.e(), this.f334134h);
                    break;
                } catch (IOException e12) {
                    e = e12;
                    iOException = e;
                    socket = this.f334132f;
                    if (socket != null) {
                        jk.f.q(socket);
                    }
                    socket2 = this.f334131e;
                    if (socket2 != null) {
                        jk.f.q(socket2);
                    }
                    this.f334132f = null;
                    this.f334131e = null;
                    this.f334136j = null;
                    this.f334137k = null;
                    this.f334133g = null;
                    this.f334134h = null;
                    this.f334135i = null;
                    this.f334143q = 1;
                    eventListener.i(call, this.f334130d.g(), this.f334130d.e(), null, iOException);
                    if (iVar == null) {
                        iVar = new i(iOException);
                    } else {
                        iVar.a(iOException);
                    }
                    if (z10) {
                        throw iVar;
                    }
                    if (bVar.b(iOException)) {
                        throw iVar;
                    }
                    call = eVar;
                    eventListener = rVar;
                }
            } catch (IOException e13) {
                e = e13;
            }
            call = eVar;
            eventListener = rVar;
        }
        if (this.f334130d.f() && this.f334131e == null) {
            throw new i(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f334145s = System.nanoTime();
    }

    public final void l(@NotNull b0 client, @NotNull h0 failedRoute, @NotNull IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.e().type() != Proxy.Type.DIRECT) {
            okhttp3.a aVarD = failedRoute.d();
            aVarD.t().connectFailed(aVarD.w().Z(), failedRoute.e().address(), failure);
        }
        client.W().b(failedRoute);
    }

    @NotNull
    public final List<Reference<okhttp3.internal.connection.e>> s() {
        return this.f334144r;
    }

    @NotNull
    public final g t() {
        return this.f334129c;
    }

    @NotNull
    public String toString() {
        Object objG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f334130d.d().w().F());
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(this.f334130d.d().w().N());
        sb2.append(", proxy=");
        sb2.append(this.f334130d.e());
        sb2.append(" hostAddress=");
        sb2.append(this.f334130d.g());
        sb2.append(" cipherSuite=");
        t tVar = this.f334133g;
        if (tVar == null || (objG = tVar.g()) == null) {
            objG = "none";
        }
        sb2.append(objG);
        sb2.append(" protocol=");
        sb2.append(this.f334134h);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public final long u() {
        return this.f334145s;
    }

    public final boolean v() {
        return this.f334138l;
    }

    public final int w() {
        return this.f334140n;
    }

    public final synchronized void x() {
        this.f334141o++;
    }

    public final boolean y(@NotNull okhttp3.a address, @Nullable List<h0> list) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (jk.f.f307490h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f334144r.size() < this.f334143q && !this.f334138l) {
            if (!this.f334130d.d().o(address)) {
                return false;
            }
            if (Intrinsics.areEqual(address.w().F(), b().d().w().F())) {
                return true;
            }
            if (this.f334135i == null) {
                return false;
            }
            if (list != null && F(list)) {
                if (address.p() != mk.d.f332680a || !K(address.w())) {
                    return false;
                }
                try {
                    okhttp3.g gVarL = address.l();
                    Intrinsics.checkNotNull(gVarL);
                    String strF = address.w().F();
                    t tVarC = c();
                    Intrinsics.checkNotNull(tVarC);
                    gVarL.a(strF, tVarC.m());
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                }
            }
        }
        return false;
    }

    public final boolean z(boolean z10) {
        long j10;
        if (jk.f.f307490h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f334131e;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f334132f;
        Intrinsics.checkNotNull(socket2);
        n nVar = this.f334136j;
        Intrinsics.checkNotNull(nVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        okhttp3.internal.http2.f fVar = this.f334135i;
        if (fVar != null) {
            return fVar.M0(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f334145s;
        }
        if (j10 < f334128w || !z10) {
            return true;
        }
        return jk.f.N(socket2, nVar);
    }
}
