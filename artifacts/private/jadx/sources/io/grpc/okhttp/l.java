package io.grpc.okhttp;

import androidx.collection.g3;
import androidx.media2.session.SessionCommand;
import com.google.common.base.s0;
import com.google.common.util.concurrent.m2;
import com.google.common.util.concurrent.t1;
import com.superwall.sdk.network.Api;
import io.grpc.c1;
import io.grpc.h2;
import io.grpc.internal.a1;
import io.grpc.internal.i3;
import io.grpc.internal.j1;
import io.grpc.internal.q3;
import io.grpc.internal.r1;
import io.grpc.internal.t2;
import io.grpc.internal.u0;
import io.grpc.internal.z0;
import io.grpc.q0;
import io.grpc.v0;
import io.grpc.v1;
import io.grpc.w1;
import io.grpc.y2;
import io.grpc.z2;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okio.b1;
import okio.e1;

/* JADX INFO: loaded from: classes13.dex */
class l implements io.grpc.internal.x, io.grpc.okhttp.b.a, i0.d {
    private static final Map<io.grpc.okhttp.internal.framed.a, y2> W = R();
    private static final Logger X = Logger.getLogger(l.class.getName());
    private final SocketFactory A;
    private SSLSocketFactory B;
    private HostnameVerifier C;
    private Socket D;

    @gj.a(io.sentry.protocol.z.b.f306551r)
    private int E;

    @gj.a(io.sentry.protocol.z.b.f306551r)
    private final Deque<k> F;
    private final io.grpc.okhttp.internal.b G;
    private j1 H;
    private boolean I;
    private long J;
    private long K;
    private boolean L;
    private final Runnable M;
    private final int N;
    private final boolean O;

    @gj.a(io.sentry.protocol.z.b.f306551r)
    private final q3 P;

    @gj.a(io.sentry.protocol.z.b.f306551r)
    private final a1<k> Q;

    @gj.a(io.sentry.protocol.z.b.f306551r)
    private v0.f R;

    @fj.h
    @com.google.common.annotations.e
    final q0 S;

    @com.google.common.annotations.e
    int T;
    Runnable U;
    m2<Void> V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InetSocketAddress f290689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f290690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f290691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Random f290692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s0<com.google.common.base.q0> f290693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f290694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.grpc.okhttp.internal.framed.j f290695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r1.a f290696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private io.grpc.okhttp.b f290697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i0 f290698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f290699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c1 f290700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private int f290701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private final Map<Integer, k> f290702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Executor f290703o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final t2 f290704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f290705q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f290706r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f290707s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private e f290708t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private io.grpc.a f290709u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private y2 f290710v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290711w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private z0 f290712x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290713y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290714z;

    class a extends a1<k> {
        a() {
        }

        @Override // io.grpc.internal.a1
        protected void b() {
            l.this.f290696h.d(true);
        }

        @Override // io.grpc.internal.a1
        protected void c() {
            l.this.f290696h.d(false);
        }
    }

    class b implements q3.c {
        b() {
        }

        @Override // io.grpc.internal.q3.c
        public q3.d read() {
            q3.d dVar;
            synchronized (l.this.f290699k) {
                dVar = new q3.d(l.this.f290698j == null ? -1L : l.this.f290698j.h(null, 0), (long) (l.this.f290694f * 0.5f));
            }
            return dVar;
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f290717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.grpc.okhttp.a f290718b;

        class a implements b1 {
            a() {
            }

            @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // okio.b1
            public long read(okio.l lVar, long j10) {
                return -1L;
            }

            @Override // okio.b1
            public e1 timeout() {
                return e1.f334887f;
            }
        }

        c(CountDownLatch countDownLatch, io.grpc.okhttp.a aVar) {
            this.f290717a = countDownLatch;
            this.f290718b = aVar;
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
        @Override // java.lang.Runnable
        public void run() {
            l lVar;
            e eVar;
            Socket socketT;
            SSLSession session;
            Socket socket;
            try {
                this.f290717a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            okio.n nVarE = okio.l0.e(new a());
            try {
                try {
                    try {
                        l lVar2 = l.this;
                        q0 q0Var = lVar2.S;
                        if (q0Var == null) {
                            socketT = lVar2.A.createSocket(l.this.f290689a.getAddress(), l.this.f290689a.getPort());
                        } else {
                            if (!(q0Var.b() instanceof InetSocketAddress)) {
                                throw y2.f291464s.u("Unsupported SocketAddress implementation " + l.this.S.b().getClass()).c();
                            }
                            l lVar3 = l.this;
                            socketT = lVar3.T(lVar3.S.c(), (InetSocketAddress) l.this.S.b(), l.this.S.d(), l.this.S.a());
                        }
                        Socket socket2 = socketT;
                        if (l.this.B != null) {
                            SSLSocket sSLSocketB = f0.b(l.this.B, l.this.C, socket2, l.this.X(), l.this.Y(), l.this.G);
                            session = sSLSocketB.getSession();
                            socket = sSLSocketB;
                        } else {
                            session = null;
                            socket = socket2;
                        }
                        socket.setTcpNoDelay(true);
                        okio.n nVarE2 = okio.l0.e(okio.l0.v(socket));
                        this.f290718b.m(okio.l0.q(socket), socket);
                        l lVar4 = l.this;
                        lVar4.f290709u = lVar4.f290709u.g().d(io.grpc.n0.f290188a, socket.getRemoteSocketAddress()).d(io.grpc.n0.f290189b, socket.getLocalSocketAddress()).d(io.grpc.n0.f290190c, session).d(u0.f289846a, session == null ? h2.NONE : h2.PRIVACY_AND_INTEGRITY).a();
                        l lVar5 = l.this;
                        lVar5.f290708t = lVar5.new e(lVar5.f290695g.a(nVarE2, true));
                        synchronized (l.this.f290699k) {
                            try {
                                l.this.D = (Socket) com.google.common.base.j0.F(socket, "socket");
                                if (session != null) {
                                    l.this.R = new v0.f(new v0.n(session));
                                }
                            } finally {
                            }
                        }
                    } catch (z2 e10) {
                        l.this.o0(0, io.grpc.okhttp.internal.framed.a.INTERNAL_ERROR, e10.a());
                        lVar = l.this;
                        eVar = lVar.new e(lVar.f290695g.a(nVarE, true));
                        lVar.f290708t = eVar;
                    }
                } catch (Exception e11) {
                    l.this.g(e11);
                    lVar = l.this;
                    eVar = lVar.new e(lVar.f290695g.a(nVarE, true));
                    lVar.f290708t = eVar;
                }
            } catch (Throwable th2) {
                l lVar6 = l.this;
                lVar6.f290708t = lVar6.new e(lVar6.f290695g.a(nVarE, true));
                throw th2;
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = l.this.U;
            if (runnable != null) {
                runnable.run();
            }
            l.this.f290703o.execute(l.this.f290708t);
            synchronized (l.this.f290699k) {
                l.this.E = Integer.MAX_VALUE;
                l.this.p0();
            }
            m2<Void> m2Var = l.this.V;
            if (m2Var != null) {
                m2Var.B(null);
            }
        }
    }

    class e implements io.grpc.okhttp.internal.framed.b.a, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.grpc.okhttp.internal.framed.b f290723b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f290722a = new m(Level.FINE, (Class<?>) l.class);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f290724c = true;

        e(io.grpc.okhttp.internal.framed.b bVar) {
            this.f290723b = bVar;
        }

        private int a(List<io.grpc.okhttp.internal.framed.d> list) {
            long jV0 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                io.grpc.okhttp.internal.framed.d dVar = list.get(i10);
                jV0 += (long) (dVar.f290510a.v0() + 32 + dVar.f290511b.v0());
            }
            return (int) Math.min(jV0, g3.f12256c);
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void M1(int i10, io.grpc.okhttp.internal.framed.a aVar) {
            this.f290722a.i(m.a.INBOUND, i10, aVar);
            y2 y2VarG = l.t0(aVar).g("Rst Stream");
            boolean z10 = y2VarG.p() == y2.b.CANCELLED || y2VarG.p() == y2.b.DEADLINE_EXCEEDED;
            synchronized (l.this.f290699k) {
                try {
                    k kVar = (k) l.this.f290702n.get(Integer.valueOf(i10));
                    if (kVar != null) {
                        io.perfmark.c.k("OkHttpClientTransport$ClientFrameHandler.rstStream", kVar.A().o0());
                        l.this.V(i10, y2VarG, aVar == io.grpc.okhttp.internal.framed.a.REFUSED_STREAM ? io.grpc.internal.t.a.REFUSED : io.grpc.internal.t.a.PROCESSED, z10, null, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void N1(boolean z10, boolean z11, int i10, int i11, List<io.grpc.okhttp.internal.framed.d> list, io.grpc.okhttp.internal.framed.e eVar) {
            y2 y2VarU;
            boolean z12;
            int iA;
            this.f290722a.d(m.a.INBOUND, i10, list, z11);
            if (l.this.N == Integer.MAX_VALUE || (iA = a(list)) <= l.this.N) {
                y2VarU = null;
            } else {
                y2VarU = y2.f291459n.u(String.format(Locale.US, "Response %s metadata larger than %d: %d", z11 ? "trailer" : "header", Integer.valueOf(l.this.N), Integer.valueOf(iA)));
            }
            synchronized (l.this.f290699k) {
                try {
                    k kVar = (k) l.this.f290702n.get(Integer.valueOf(i10));
                    z12 = false;
                    int i12 = 0 << 0;
                    if (kVar == null) {
                        if (l.this.f0(i10)) {
                            l.this.f290697i.M1(i10, io.grpc.okhttp.internal.framed.a.STREAM_CLOSED);
                        } else {
                            z12 = true;
                        }
                    } else if (y2VarU == null) {
                        io.perfmark.c.k("OkHttpClientTransport$ClientFrameHandler.headers", kVar.A().o0());
                        kVar.A().q0(list, z11);
                    } else {
                        if (!z11) {
                            l.this.f290697i.M1(i10, io.grpc.okhttp.internal.framed.a.CANCEL);
                        }
                        kVar.A().V(y2VarU, false, new v1());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z12) {
                l.this.i0(io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Received header for unknown stream: " + i10);
            }
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void O1(boolean z10, io.grpc.okhttp.internal.framed.i iVar) {
            boolean zF;
            this.f290722a.j(m.a.INBOUND, iVar);
            synchronized (l.this.f290699k) {
                try {
                    if (e0.b(iVar, 4)) {
                        l.this.E = e0.a(iVar, 4);
                    }
                    int i10 = 7 & 0;
                    if (e0.b(iVar, 7)) {
                        zF = l.this.f290698j.f(e0.a(iVar, 7));
                    } else {
                        zF = false;
                    }
                    if (this.f290724c) {
                        l lVar = l.this;
                        lVar.f290709u = lVar.f290696h.e(l.this.f290709u);
                        l.this.f290696h.c();
                        this.f290724c = false;
                    }
                    l.this.f290697i.Da(iVar);
                    if (zF) {
                        l.this.f290698j.i();
                    }
                    l.this.p0();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void P1(boolean z10, int i10, okio.n nVar, int i11, int i12) throws IOException {
            this.f290722a.b(m.a.INBOUND, i10, nVar.n(), i11, z10);
            k kVarC0 = l.this.c0(i10);
            if (kVarC0 != null) {
                long j10 = i11;
                nVar.q1(j10);
                okio.l lVar = new okio.l();
                lVar.Ga(nVar.n(), j10);
                io.perfmark.c.k("OkHttpClientTransport$ClientFrameHandler.data", kVarC0.A().o0());
                synchronized (l.this.f290699k) {
                    kVarC0.A().p0(lVar, z10, i12 - i11);
                }
            } else {
                if (!l.this.f0(i10)) {
                    l.this.i0(io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Received data for unknown stream: " + i10);
                    return;
                }
                synchronized (l.this.f290699k) {
                    try {
                        l.this.f290697i.M1(i10, io.grpc.okhttp.internal.framed.a.STREAM_CLOSED);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                nVar.skip(i11);
            }
            l.E(l.this, i12);
            if (l.this.f290707s >= l.this.f290694f * 0.5f) {
                synchronized (l.this.f290699k) {
                    l.this.f290697i.c0(0, l.this.f290707s);
                }
                l.this.f290707s = 0;
            }
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void Q(int i10, int i11, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
            this.f290722a.h(m.a.INBOUND, i10, i11, list);
            synchronized (l.this.f290699k) {
                l.this.f290697i.M1(i10, io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR);
            }
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void Q1(int i10, io.grpc.okhttp.internal.framed.a aVar, okio.o oVar) {
            this.f290722a.c(m.a.INBOUND, i10, aVar, oVar);
            if (aVar == io.grpc.okhttp.internal.framed.a.ENHANCE_YOUR_CALM) {
                String strG0 = oVar.G0();
                l.X.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strG0));
                if ("too_many_pings".equals(strG0)) {
                    l.this.M.run();
                }
            }
            y2 y2VarG = io.grpc.internal.v0.j.p(aVar.f290500a).g("Received Goaway");
            if (oVar.v0() > 0) {
                y2VarG = y2VarG.g(oVar.G0());
            }
            l.this.o0(i10, null, y2VarG);
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void W(boolean z10, int i10, int i11) {
            z0 z0Var;
            long j10 = (((long) i10) << 32) | (((long) i11) & com.rabbitmq.client.k0.f265952a);
            this.f290722a.e(m.a.INBOUND, j10);
            if (!z10) {
                synchronized (l.this.f290699k) {
                    try {
                        l.this.f290697i.W(true, i10, i11);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            synchronized (l.this.f290699k) {
                try {
                    z0Var = null;
                    if (l.this.f290712x == null) {
                        l.X.warning("Received unexpected ping ack. No ping outstanding");
                    } else if (l.this.f290712x.h() == j10) {
                        z0 z0Var2 = l.this.f290712x;
                        l.this.f290712x = null;
                        z0Var = z0Var2;
                    } else {
                        l.X.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(l.this.f290712x.h()), Long.valueOf(j10)));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z0Var != null) {
                z0Var.d();
            }
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0089  */
        /* JADX WARN: Instruction removed from duplicated block: B:29:0x0089, please report this as an issue */
        @Override // io.grpc.okhttp.internal.framed.b.a
        public void c0(int i10, long j10) {
            boolean z10;
            this.f290722a.l(m.a.INBOUND, i10, j10);
            if (j10 == 0) {
                if (i10 == 0) {
                    l.this.i0(io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Received 0 flow control window increment.");
                    return;
                } else {
                    l.this.V(i10, y2.f291464s.u("Received 0 flow control window increment."), io.grpc.internal.t.a.PROCESSED, false, io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, null);
                    return;
                }
            }
            synchronized (l.this.f290699k) {
                try {
                    if (i10 == 0) {
                        l.this.f290698j.h(null, (int) j10);
                        return;
                    }
                    k kVar = (k) l.this.f290702n.get(Integer.valueOf(i10));
                    if (kVar == null) {
                        z10 = l.this.f0(i10) ? false : true;
                        if (z10) {
                            l.this.i0(io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Received window_update for unknown stream: " + i10);
                        }
                    }
                    l.this.f290698j.h(kVar.A().l(), (int) j10);
                    if (z10) {
                        l.this.i0(io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Received window_update for unknown stream: " + i10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void d0(int i10, String str, okio.o oVar, String str2, int i11, long j10) {
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void e0() {
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void f0(int i10, int i11, int i12, boolean z10) {
        }

        @Override // java.lang.Runnable
        public void run() {
            y2 y2VarU;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f290723b.x9(this)) {
                try {
                    if (l.this.H != null) {
                        l.this.H.n();
                    }
                } catch (Throwable th2) {
                    try {
                        l.this.o0(0, io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, y2.f291464s.u("error in frame handler").t(th2));
                        try {
                            this.f290723b.close();
                        } catch (IOException e10) {
                            e = e10;
                            l.X.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        } catch (RuntimeException e11) {
                            if (!"bio == null".equals(e11.getMessage())) {
                                throw e11;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            this.f290723b.close();
                        } catch (IOException e12) {
                            l.X.log(Level.INFO, "Exception closing frame reader", (Throwable) e12);
                        } catch (RuntimeException e13) {
                            if (!"bio == null".equals(e13.getMessage())) {
                                throw e13;
                            }
                        }
                        l.this.f290696h.a();
                        Thread.currentThread().setName(name);
                        throw th3;
                    }
                }
            }
            synchronized (l.this.f290699k) {
                try {
                    y2VarU = l.this.f290710v;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (y2VarU == null) {
                y2VarU = y2.f291465t.u("End of stream or IOException");
            }
            l.this.o0(0, io.grpc.okhttp.internal.framed.a.INTERNAL_ERROR, y2VarU);
            try {
                this.f290723b.close();
            } catch (IOException e14) {
                e = e14;
                l.X.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
            } catch (RuntimeException e15) {
                if (!"bio == null".equals(e15.getMessage())) {
                    throw e15;
                }
            }
            l.this.f290696h.a();
            Thread.currentThread().setName(name);
        }
    }

    public l(i.f fVar, InetSocketAddress inetSocketAddress, String str, @fj.h String str2, io.grpc.a aVar, @fj.h q0 q0Var, Runnable runnable) {
        this(fVar, inetSocketAddress, str, str2, aVar, io.grpc.internal.v0.M, new io.grpc.okhttp.internal.framed.g(), q0Var, runnable);
    }

    static /* synthetic */ int E(l lVar, int i10) {
        int i11 = lVar.f290707s + i10;
        lVar.f290707s = i11;
        return i11;
    }

    private static Map<io.grpc.okhttp.internal.framed.a, y2> R() {
        EnumMap enumMap = new EnumMap(io.grpc.okhttp.internal.framed.a.class);
        io.grpc.okhttp.internal.framed.a aVar = io.grpc.okhttp.internal.framed.a.NO_ERROR;
        y2 y2Var = y2.f291464s;
        enumMap.put(aVar, y2Var.u("No error: A GRPC status of OK should have been sent"));
        enumMap.put(io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, y2Var.u("Protocol error"));
        enumMap.put(io.grpc.okhttp.internal.framed.a.INTERNAL_ERROR, y2Var.u("Internal error"));
        enumMap.put(io.grpc.okhttp.internal.framed.a.FLOW_CONTROL_ERROR, y2Var.u("Flow control error"));
        enumMap.put(io.grpc.okhttp.internal.framed.a.STREAM_CLOSED, y2Var.u("Stream closed"));
        enumMap.put(io.grpc.okhttp.internal.framed.a.FRAME_TOO_LARGE, y2Var.u("Frame too large"));
        enumMap.put(io.grpc.okhttp.internal.framed.a.REFUSED_STREAM, y2.f291465t.u("Refused stream"));
        enumMap.put(io.grpc.okhttp.internal.framed.a.CANCEL, y2.f291451f.u(com.facebook.internal.a.f99699u));
        enumMap.put(io.grpc.okhttp.internal.framed.a.COMPRESSION_ERROR, y2Var.u("Compression error"));
        enumMap.put(io.grpc.okhttp.internal.framed.a.CONNECT_ERROR, y2Var.u("Connect error"));
        enumMap.put(io.grpc.okhttp.internal.framed.a.ENHANCE_YOUR_CALM, y2.f291459n.u("Enhance your calm"));
        enumMap.put(io.grpc.okhttp.internal.framed.a.INADEQUATE_SECURITY, y2.f291457l.u("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    private io.grpc.okhttp.internal.proxy.b S(InetSocketAddress inetSocketAddress, String str, String str2) {
        io.grpc.okhttp.internal.proxy.a aVarA = new io.grpc.okhttp.internal.proxy.a.b().k(Api.scheme).h(inetSocketAddress.getHostName()).j(inetSocketAddress.getPort()).a();
        io.grpc.okhttp.internal.proxy.b.C1984b c1984bD = new io.grpc.okhttp.internal.proxy.b.C1984b().e(aVarA).d(com.google.common.net.d.f119547w, aVarA.e() + ":" + aVarA.j()).d(com.google.common.net.d.P, this.f290691c);
        if (str != null && str2 != null) {
            c1984bD.d("Proxy-Authorization", io.grpc.okhttp.internal.c.a(str, str2));
        }
        return c1984bD.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Socket T(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws z2 {
        Socket socketCreateSocket = null;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? this.A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socketCreateSocket.setTcpNoDelay(true);
            socketCreateSocket.setSoTimeout(this.T);
            b1 b1VarV = okio.l0.v(socketCreateSocket);
            okio.m mVarD = okio.l0.d(okio.l0.q(socketCreateSocket));
            io.grpc.okhttp.internal.proxy.b bVarS = S(inetSocketAddress, str, str2);
            io.grpc.okhttp.internal.proxy.a aVarB = bVarS.b();
            mVarD.pa(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", aVarB.e(), Integer.valueOf(aVarB.j()))).pa("\r\n");
            int iE = bVarS.a().e();
            for (int i10 = 0; i10 < iE; i10++) {
                mVarD.pa(bVarS.a().c(i10)).pa(": ").pa(bVarS.a().f(i10)).pa("\r\n");
            }
            mVarD.pa("\r\n");
            mVarD.flush();
            io.grpc.okhttp.internal.j jVarA = io.grpc.okhttp.internal.j.a(j0(b1VarV));
            while (!j0(b1VarV).equals("")) {
            }
            int i11 = jVarA.f290653b;
            if (i11 >= 200 && i11 < 300) {
                socketCreateSocket.setSoTimeout(0);
                return socketCreateSocket;
            }
            okio.l lVar = new okio.l();
            try {
                socketCreateSocket.shutdownOutput();
                b1VarV.read(lVar, 1024L);
            } catch (IOException e10) {
                lVar.pa("Unable to read body: " + e10.toString());
            }
            try {
                socketCreateSocket.close();
            } catch (IOException unused) {
            }
            throw y2.f291465t.u(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(jVarA.f290653b), jVarA.f290654c, lVar.O7())).c();
        } catch (IOException e11) {
            if (socketCreateSocket != null) {
                io.grpc.internal.v0.f(socketCreateSocket);
            }
            throw y2.f291465t.u("Failed trying to connect with proxy").t(e11).c();
        }
    }

    private Throwable a0() {
        synchronized (this.f290699k) {
            try {
                y2 y2Var = this.f290710v;
                if (y2Var != null) {
                    return y2Var.c();
                }
                return y2.f291465t.u("Connection closed").c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d0() {
        synchronized (this.f290699k) {
            try {
                this.P.i(new b());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @gj.a(io.sentry.protocol.z.b.f306551r)
    private void g0(k kVar) {
        if (this.f290714z && this.F.isEmpty() && this.f290702n.isEmpty()) {
            this.f290714z = false;
            j1 j1Var = this.H;
            if (j1Var != null) {
                j1Var.p();
            }
        }
        if (kVar.E()) {
            this.Q.e(kVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(io.grpc.okhttp.internal.framed.a aVar, String str) {
        o0(0, aVar, t0(aVar).g(str));
    }

    private static String j0(b1 b1Var) throws IOException {
        okio.l lVar = new okio.l();
        while (b1Var.read(lVar, 1L) != -1) {
            if (lVar.I(lVar.size() - 1) == 10) {
                return lVar.lb();
            }
        }
        throw new EOFException("\\n not found: " + lVar.r7().N());
    }

    private void l0() {
        synchronized (this.f290699k) {
            try {
                this.f290697i.A2();
                io.grpc.okhttp.internal.framed.i iVar = new io.grpc.okhttp.internal.framed.i();
                e0.c(iVar, 7, this.f290694f);
                this.f290697i.Q3(iVar);
                int i10 = this.f290694f;
                if (i10 > 65535) {
                    this.f290697i.c0(0, i10 - 65535);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @gj.a(io.sentry.protocol.z.b.f306551r)
    private void m0(k kVar) {
        if (!this.f290714z) {
            this.f290714z = true;
            j1 j1Var = this.H;
            if (j1Var != null) {
                j1Var.o();
            }
        }
        if (kVar.E()) {
            this.Q.e(kVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(int i10, io.grpc.okhttp.internal.framed.a aVar, y2 y2Var) {
        synchronized (this.f290699k) {
            try {
                if (this.f290710v == null) {
                    this.f290710v = y2Var;
                    this.f290696h.b(y2Var);
                }
                if (aVar != null && !this.f290711w) {
                    this.f290711w = true;
                    this.f290697i.tf(0, aVar, new byte[0]);
                }
                Iterator<Map.Entry<Integer, k>> it = this.f290702n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, k> next = it.next();
                    if (next.getKey().intValue() > i10) {
                        it.remove();
                        next.getValue().A().U(y2Var, io.grpc.internal.t.a.REFUSED, false, new v1());
                        g0(next.getValue());
                    }
                }
                for (k kVar : this.F) {
                    kVar.A().U(y2Var, io.grpc.internal.t.a.MISCARRIED, true, new v1());
                    g0(kVar);
                }
                this.F.clear();
                r0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    public boolean p0() {
        boolean z10 = false;
        while (!this.F.isEmpty() && this.f290702n.size() < this.E) {
            q0(this.F.poll());
            z10 = true;
        }
        return z10;
    }

    @gj.a(io.sentry.protocol.z.b.f306551r)
    private void q0(k kVar) {
        com.google.common.base.j0.h0(kVar.A().j0() == -1, "StreamId already assigned");
        this.f290702n.put(Integer.valueOf(this.f290701m), kVar);
        m0(kVar);
        kVar.A().m0(this.f290701m);
        if ((kVar.S() != w1.d.UNARY && kVar.S() != w1.d.SERVER_STREAMING) || kVar.U()) {
            this.f290697i.flush();
        }
        int i10 = this.f290701m;
        if (i10 < 2147483645) {
            this.f290701m = i10 + 2;
        } else {
            this.f290701m = Integer.MAX_VALUE;
            o0(Integer.MAX_VALUE, io.grpc.okhttp.internal.framed.a.NO_ERROR, y2.f291465t.u("Stream ids exhausted"));
        }
    }

    @gj.a(io.sentry.protocol.z.b.f306551r)
    private void r0() {
        if (this.f290710v == null || !this.f290702n.isEmpty() || !this.F.isEmpty() || this.f290713y) {
            return;
        }
        this.f290713y = true;
        j1 j1Var = this.H;
        if (j1Var != null) {
            j1Var.r();
        }
        z0 z0Var = this.f290712x;
        if (z0Var != null) {
            z0Var.f(a0());
            this.f290712x = null;
        }
        if (!this.f290711w) {
            this.f290711w = true;
            this.f290697i.tf(0, io.grpc.okhttp.internal.framed.a.NO_ERROR, new byte[0]);
        }
        this.f290697i.close();
    }

    @com.google.common.annotations.e
    static y2 t0(io.grpc.okhttp.internal.framed.a aVar) {
        y2 y2Var = W.get(aVar);
        if (y2Var != null) {
            return y2Var;
        }
        return y2.f291452g.u("Unknown http2 error code: " + aVar.f290500a);
    }

    void U(boolean z10, long j10, long j11, boolean z11) {
        this.I = z10;
        this.J = j10;
        this.K = j11;
        this.L = z11;
    }

    void V(int i10, @fj.h y2 y2Var, io.grpc.internal.t.a aVar, boolean z10, @fj.h io.grpc.okhttp.internal.framed.a aVar2, @fj.h v1 v1Var) {
        synchronized (this.f290699k) {
            try {
                k kVarRemove = this.f290702n.remove(Integer.valueOf(i10));
                if (kVarRemove != null) {
                    if (aVar2 != null) {
                        this.f290697i.M1(i10, io.grpc.okhttp.internal.framed.a.CANCEL);
                    }
                    if (y2Var != null) {
                        k.b bVarT = kVarRemove.A();
                        if (v1Var == null) {
                            v1Var = new v1();
                        }
                        bVarT.U(y2Var, aVar, z10, v1Var);
                    }
                    if (!p0()) {
                        r0();
                        g0(kVarRemove);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @com.google.common.annotations.e
    e W() {
        return this.f290708t;
    }

    @com.google.common.annotations.e
    String X() {
        URI uriC = io.grpc.internal.v0.c(this.f290690b);
        return uriC.getHost() != null ? uriC.getHost() : this.f290690b;
    }

    @com.google.common.annotations.e
    int Y() {
        URI uriC = io.grpc.internal.v0.c(this.f290690b);
        return uriC.getPort() != -1 ? uriC.getPort() : this.f290689a.getPort();
    }

    @com.google.common.annotations.e
    int Z() {
        int size;
        synchronized (this.f290699k) {
            try {
                size = this.F.size();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return size;
    }

    @Override // io.grpc.internal.r1
    public void a(y2 y2Var) {
        h(y2Var);
        synchronized (this.f290699k) {
            try {
                Iterator<Map.Entry<Integer, k>> it = this.f290702n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, k> next = it.next();
                    it.remove();
                    next.getValue().A().V(y2Var, false, new v1());
                    g0(next.getValue());
                }
                for (k kVar : this.F) {
                    kVar.A().U(y2Var, io.grpc.internal.t.a.MISCARRIED, true, new v1());
                    g0(kVar);
                }
                this.F.clear();
                r0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.okhttp.i0.d
    public i0.c[] b() {
        i0.c[] cVarArr;
        synchronized (this.f290699k) {
            try {
                cVarArr = new i0.c[this.f290702n.size()];
                Iterator<k> it = this.f290702n.values().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    cVarArr[i10] = it.next().A().l();
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVarArr;
    }

    @com.google.common.annotations.e
    SocketFactory b0() {
        return this.A;
    }

    @Override // io.grpc.m1
    public c1 c() {
        return this.f290700l;
    }

    k c0(int i10) {
        k kVar;
        synchronized (this.f290699k) {
            kVar = this.f290702n.get(Integer.valueOf(i10));
        }
        return kVar;
    }

    @Override // io.grpc.internal.u
    public void d(io.grpc.internal.u.a aVar, Executor executor) {
        long jNextLong;
        synchronized (this.f290699k) {
            try {
                boolean z10 = true;
                com.google.common.base.j0.g0(this.f290697i != null);
                if (this.f290713y) {
                    z0.g(aVar, executor, a0());
                    return;
                }
                z0 z0Var = this.f290712x;
                if (z0Var != null) {
                    jNextLong = 0;
                    z10 = false;
                } else {
                    jNextLong = this.f290692d.nextLong();
                    com.google.common.base.q0 q0Var = this.f290693e.get();
                    q0Var.k();
                    z0 z0Var2 = new z0(jNextLong, q0Var);
                    this.f290712x = z0Var2;
                    this.P.c();
                    z0Var = z0Var2;
                }
                if (z10) {
                    this.f290697i.W(false, (int) (jNextLong >>> 32), (int) jNextLong);
                }
                z0Var.a(aVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean e0() {
        return this.B == null;
    }

    @Override // io.grpc.internal.r1
    public Runnable f(r1.a aVar) {
        this.f290696h = (r1.a) com.google.common.base.j0.F(aVar, com.google.android.gms.common.internal.z.a.f106673a);
        if (this.I) {
            j1 j1Var = new j1(new j1.c(this), this.f290705q, this.J, this.K, this.L);
            this.H = j1Var;
            j1Var.q();
        }
        io.grpc.okhttp.a aVarQ = io.grpc.okhttp.a.q(this.f290704p, this, 10000);
        io.grpc.okhttp.internal.framed.c cVarO = aVarQ.o(this.f290695g.b(okio.l0.d(aVarQ), true));
        synchronized (this.f290699k) {
            io.grpc.okhttp.b bVar = new io.grpc.okhttp.b(this, cVarO);
            this.f290697i = bVar;
            this.f290698j = new i0(this, bVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f290704p.execute(new c(countDownLatch, aVarQ));
        try {
            l0();
            countDownLatch.countDown();
            this.f290704p.execute(new d());
            return null;
        } catch (Throwable th2) {
            countDownLatch.countDown();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    boolean f0(int i10) {
        boolean z10;
        synchronized (this.f290699k) {
            try {
                if (i10 < this.f290701m) {
                    z10 = true;
                    if ((i10 & 1) != 1) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // io.grpc.okhttp.b.a
    public void g(Throwable th2) {
        com.google.common.base.j0.F(th2, "failureCause");
        o0(0, io.grpc.okhttp.internal.framed.a.INTERNAL_ERROR, y2.f291465t.t(th2));
    }

    @Override // io.grpc.internal.x
    public io.grpc.a getAttributes() {
        return this.f290709u;
    }

    @Override // io.grpc.internal.r1
    public void h(y2 y2Var) {
        synchronized (this.f290699k) {
            try {
                if (this.f290710v != null) {
                    return;
                }
                this.f290710v = y2Var;
                this.f290696h.b(y2Var);
                r0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.internal.u
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public k e(w1<?, ?> w1Var, v1 v1Var, io.grpc.e eVar, io.grpc.n[] nVarArr) {
        k kVar;
        com.google.common.base.j0.F(w1Var, "method");
        com.google.common.base.j0.F(v1Var, "headers");
        i3 i3VarI = i3.i(nVarArr, getAttributes(), v1Var);
        synchronized (this.f290699k) {
            kVar = new k(w1Var, v1Var, this.f290697i, this, this.f290698j, this.f290699k, this.f290706r, this.f290694f, this.f290690b, this.f290691c, i3VarI, this.P, eVar, this.O);
        }
        return kVar;
    }

    @Override // io.grpc.a1
    public t1<v0.l> i() {
        m2 m2VarF = m2.F();
        synchronized (this.f290699k) {
            try {
                if (this.D == null) {
                    m2VarF.B(new v0.l(this.P.b(), null, null, new v0.k.a().d(), null));
                } else {
                    m2VarF.B(new v0.l(this.P.b(), this.D.getLocalSocketAddress(), this.D.getRemoteSocketAddress(), n0.e(this.D), this.R));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m2VarF;
    }

    @gj.a(io.sentry.protocol.z.b.f306551r)
    void k0(k kVar) {
        this.F.remove(kVar);
        g0(kVar);
    }

    @com.google.common.annotations.e
    void n0(int i10) {
        synchronized (this.f290699k) {
            this.f290701m = i10;
        }
    }

    @gj.a(io.sentry.protocol.z.b.f306551r)
    void s0(k kVar) {
        if (this.f290710v != null) {
            kVar.A().U(this.f290710v, io.grpc.internal.t.a.MISCARRIED, true, new v1());
        } else if (this.f290702n.size() < this.E) {
            q0(kVar);
        } else {
            this.F.add(kVar);
            m0(kVar);
        }
    }

    public String toString() {
        return com.google.common.base.b0.c(this).e("logId", this.f290700l.e()).f("address", this.f290689a).toString();
    }

    private l(i.f fVar, InetSocketAddress inetSocketAddress, String str, @fj.h String str2, io.grpc.a aVar, s0<com.google.common.base.q0> s0Var, io.grpc.okhttp.internal.framed.j jVar, @fj.h q0 q0Var, Runnable runnable) {
        this.f290692d = new Random();
        this.f290699k = new Object();
        this.f290702n = new HashMap();
        this.E = 0;
        this.F = new LinkedList();
        this.Q = new a();
        this.T = SessionCommand.X;
        this.f290689a = (InetSocketAddress) com.google.common.base.j0.F(inetSocketAddress, "address");
        this.f290690b = str;
        this.f290706r = fVar.f290363j;
        this.f290694f = fVar.f290368o;
        this.f290703o = (Executor) com.google.common.base.j0.F(fVar.f290355b, "executor");
        this.f290704p = new t2(fVar.f290355b);
        this.f290705q = (ScheduledExecutorService) com.google.common.base.j0.F(fVar.f290357d, "scheduledExecutorService");
        this.f290701m = 3;
        SocketFactory socketFactory = fVar.f290359f;
        this.A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.B = fVar.f290360g;
        this.C = fVar.f290361h;
        this.G = (io.grpc.okhttp.internal.b) com.google.common.base.j0.F(fVar.f290362i, "connectionSpec");
        this.f290693e = (s0) com.google.common.base.j0.F(s0Var, "stopwatchFactory");
        this.f290695g = (io.grpc.okhttp.internal.framed.j) com.google.common.base.j0.F(jVar, "variant");
        this.f290691c = io.grpc.internal.v0.k("okhttp", str2);
        this.S = q0Var;
        this.M = (Runnable) com.google.common.base.j0.F(runnable, "tooManyPingsRunnable");
        this.N = fVar.f290370t;
        this.P = fVar.f290358e.a();
        this.f290700l = c1.a(getClass(), inetSocketAddress.toString());
        this.f290709u = io.grpc.a.e().d(u0.f289847b, aVar).a();
        this.O = fVar.f290371v;
        d0();
    }

    @com.google.common.annotations.e
    l(i.f fVar, String str, s0<com.google.common.base.q0> s0Var, io.grpc.okhttp.internal.framed.j jVar, @fj.h Runnable runnable, m2<Void> m2Var, Runnable runnable2) {
        this(fVar, new InetSocketAddress("127.0.0.1", 80), "notarealauthority:80", str, io.grpc.a.f288673c, s0Var, jVar, null, runnable2);
        this.U = runnable;
        this.V = (m2) com.google.common.base.j0.F(m2Var, "connectedFuture");
    }
}
