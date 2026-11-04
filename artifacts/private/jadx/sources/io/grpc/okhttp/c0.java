package io.grpc.okhttp;

import androidx.collection.g3;
import com.google.common.util.concurrent.h1;
import com.google.common.util.concurrent.t1;
import io.grpc.c1;
import io.grpc.internal.b3;
import io.grpc.internal.c3;
import io.grpc.internal.i1;
import io.grpc.internal.i3;
import io.grpc.internal.j1;
import io.grpc.internal.k1;
import io.grpc.internal.q3;
import io.grpc.internal.s1;
import io.grpc.internal.t2;
import io.grpc.internal.z1;
import io.grpc.l1;
import io.grpc.u2;
import io.grpc.v0;
import io.grpc.v1;
import io.grpc.y2;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
final class c0 implements b3, io.grpc.okhttp.b.a, i0.d {
    private static final int C = 4369;
    private static final int E = 57005;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f290246a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q3 f290248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c1 f290249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Socket f290250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c3 f290251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Executor f290252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ScheduledExecutorService f290253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private io.grpc.a f290254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j1 f290255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private s1 f290256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ScheduledFuture<?> f290257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i1 f290258m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private v0.f f290263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private io.grpc.okhttp.b f290264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private i0 f290265t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private int f290267v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private y2 f290269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private ScheduledFuture<?> f290270y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private ScheduledFuture<?> f290271z;
    private static final Logger B = Logger.getLogger(c0.class.getName());
    private static final long D = TimeUnit.SECONDS.toNanos(1);
    private static final okio.o F = okio.o.x(okhttp3.internal.http2.c.f334267g);
    private static final okio.o G = okio.o.x("CONNECT");
    private static final okio.o H = okio.o.x("POST");
    private static final okio.o I = okio.o.x(okhttp3.internal.http2.c.f334269i);
    private static final okio.o J = okio.o.x(okhttp3.internal.http2.c.f334268h);
    private static final okio.o K = okio.o.x(okhttp3.internal.http2.c.f334270j);
    private static final okio.o L = okio.o.x("connection");
    private static final okio.o M = okio.o.x("host");
    private static final okio.o N = okio.o.x("te");
    private static final okio.o O = okio.o.x(io.grpc.internal.v0.f289912q);
    private static final okio.o P = okio.o.x("content-type");
    private static final okio.o Q = okio.o.x("content-length");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.okhttp.internal.framed.j f290247b = new io.grpc.okhttp.internal.framed.g();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f290259n = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private final Map<Integer, f> f290266u = new TreeMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private int f290268w = Integer.MAX_VALUE;

    @gj.a(io.sentry.protocol.z.b.f306551r)
    private Long A = null;

    class a extends io.grpc.okhttp.c {
        a(io.grpc.okhttp.internal.framed.c cVar) {
            super(cVar);
        }

        @Override // io.grpc.okhttp.c, io.grpc.okhttp.internal.framed.c
        public void C8(boolean z10, int i10, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
            c0.this.f290258m.e();
            super.C8(z10, i10, list);
        }

        @Override // io.grpc.okhttp.c, io.grpc.okhttp.internal.framed.c
        public void F9(boolean z10, int i10, okio.l lVar, int i11) throws IOException {
            c0.this.f290258m.e();
            super.F9(z10, i10, lVar, i11);
        }

        @Override // io.grpc.okhttp.c, io.grpc.okhttp.internal.framed.c
        public void U1(int i10, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
            c0.this.f290258m.e();
            super.U1(i10, list);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<? extends u2.a> f290273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final z1<Executor> f290274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final z1<ScheduledExecutorService> f290275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final q3.b f290276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.grpc.okhttp.d f290277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f290278f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final long f290279g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f290280h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final int f290281i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final int f290282j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final long f290283k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final boolean f290284l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final long f290285m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final long f290286n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final long f290287o;

        public b(s sVar, List<? extends u2.a> list) {
            this.f290273a = (List) com.google.common.base.j0.F(list, "streamTracerFactories");
            this.f290274b = (z1) com.google.common.base.j0.F(sVar.f290798e, "transportExecutorPool");
            this.f290275c = (z1) com.google.common.base.j0.F(sVar.f290799f, "scheduledExecutorServicePool");
            this.f290276d = (q3.b) com.google.common.base.j0.F(sVar.f290797d, "transportTracerFactory");
            this.f290277e = (io.grpc.okhttp.d) com.google.common.base.j0.F(sVar.f290796c, "handshakerSocketFactory");
            this.f290278f = sVar.f290801h;
            this.f290279g = sVar.f290802i;
            this.f290280h = sVar.f290803j;
            this.f290281i = sVar.f290805l;
            this.f290282j = sVar.f290804k;
            this.f290283k = sVar.f290806m;
            this.f290284l = sVar.f290807n;
            this.f290285m = sVar.f290808o;
            this.f290286n = sVar.f290809p;
            this.f290287o = sVar.f290810q;
        }
    }

    class c implements io.grpc.okhttp.internal.framed.b.a, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f290288a = new m(Level.FINE, (Class<?>) c0.class);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.okhttp.internal.framed.b f290289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f290290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f290291d;

        public c(io.grpc.okhttp.internal.framed.b bVar) {
            this.f290289b = bVar;
        }

        private void b(io.grpc.okhttp.internal.framed.a aVar, String str) {
            c0.this.o(aVar, str, io.grpc.internal.v0.j.p(aVar.f290500a).u(String.format("HTTP2 connection error: %s '%s'", aVar, str)), false);
        }

        private int c(List<io.grpc.okhttp.internal.framed.d> list) {
            long jV0 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                io.grpc.okhttp.internal.framed.d dVar = list.get(i10);
                jV0 += (long) (dVar.f290510a.v0() + 32 + dVar.f290511b.v0());
            }
            return (int) Math.min(jV0, g3.f12256c);
        }

        private void d(int i10, boolean z10, y2.b bVar, String str) {
            v1 v1Var = new v1();
            v1Var.w(l1.f290163b, bVar.k());
            v1Var.w(l1.f290162a, str);
            List<io.grpc.okhttp.internal.framed.d> listE = io.grpc.okhttp.e.e(v1Var, false);
            synchronized (c0.this.f290259n) {
                try {
                    c0.this.f290264s.C8(true, i10, listE);
                    if (!z10) {
                        c0.this.f290264s.M1(i10, io.grpc.okhttp.internal.framed.a.NO_ERROR);
                    }
                    c0.this.f290264s.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private void e(int i10, boolean z10, int i11, y2.b bVar, String str) {
            v1 v1Var = new v1();
            v1Var.w(l1.f290163b, bVar.k());
            v1Var.w(l1.f290162a, str);
            List<io.grpc.okhttp.internal.framed.d> listB = io.grpc.okhttp.e.b(i11, "text/plain; charset=utf-8", v1Var);
            okio.l lVarE2 = new okio.l().pa(str);
            synchronized (c0.this.f290259n) {
                try {
                    final d dVar = new d(i10, c0.this.f290259n, c0.this.f290265t, c0.this.f290246a.f290280h);
                    if (c0.this.f290266u.isEmpty()) {
                        c0.this.f290258m.b();
                        if (c0.this.f290256k != null) {
                            c0.this.f290256k.h();
                        }
                    }
                    c0.this.f290266u.put(Integer.valueOf(i10), dVar);
                    if (z10) {
                        dVar.e(new okio.l(), 0, 0, true);
                    }
                    c0.this.f290264s.U1(i10, listB);
                    c0.this.f290265t.d(true, dVar.l(), lVarE2, true);
                    c0.this.f290265t.g(dVar.l(), new Runnable() { // from class: io.grpc.okhttp.d0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f290302a.f(dVar);
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(d dVar) {
            synchronized (c0.this.f290259n) {
                try {
                    if (!dVar.k()) {
                        c0.this.f290264s.M1(dVar.f290293a, io.grpc.okhttp.internal.framed.a.NO_ERROR);
                    }
                    c0.this.l0(dVar.f290293a, true);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private void g(int i10, io.grpc.okhttp.internal.framed.a aVar, String str) {
            if (aVar == io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR) {
                c0.B.log(Level.FINE, "Responding with RST_STREAM {0}: {1}", new Object[]{aVar, str});
            }
            synchronized (c0.this.f290259n) {
                try {
                    c0.this.f290264s.M1(i10, aVar);
                    c0.this.f290264s.flush();
                    f fVar = (f) c0.this.f290266u.get(Integer.valueOf(i10));
                    if (fVar != null) {
                        fVar.g(y2.f291464s.u(String.format("Responded with RST_STREAM %s: %s", aVar, str)));
                        c0.this.l0(i10, false);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void M1(int i10, io.grpc.okhttp.internal.framed.a aVar) {
            this.f290288a.i(m.a.INBOUND, i10, aVar);
            if (!io.grpc.okhttp.internal.framed.a.NO_ERROR.equals(aVar) && !io.grpc.okhttp.internal.framed.a.CANCEL.equals(aVar) && !io.grpc.okhttp.internal.framed.a.STREAM_CLOSED.equals(aVar)) {
                c0.B.log(Level.INFO, "Received RST_STREAM: " + aVar);
            }
            y2 y2VarU = io.grpc.internal.v0.j.p(aVar.f290500a).u("RST_STREAM");
            synchronized (c0.this.f290259n) {
                try {
                    f fVar = (f) c0.this.f290266u.get(Integer.valueOf(i10));
                    if (fVar != null) {
                        fVar.j(y2VarU);
                        c0.this.l0(i10, false);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void N1(boolean z10, boolean z11, int i10, int i11, List<io.grpc.okhttp.internal.framed.d> list, io.grpc.okhttp.internal.framed.e eVar) {
            int iE0;
            this.f290288a.d(m.a.INBOUND, i10, list, z11);
            if ((i10 & 1) == 0) {
                b(io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Clients cannot open even numbered streams. RFC7540 section 5.1.1");
                return;
            }
            synchronized (c0.this.f290259n) {
                try {
                    if (i10 > c0.this.f290268w) {
                        return;
                    }
                    boolean z12 = i10 > c0.this.f290267v;
                    if (z12) {
                        c0.this.f290267v = i10;
                    }
                    int iC = c(list);
                    if (iC > c0.this.f290246a.f290282j) {
                        e(i10, z11, 431, y2.b.RESOURCE_EXHAUSTED, String.format(Locale.US, "Request metadata larger than %d: %d", Integer.valueOf(c0.this.f290246a.f290282j), Integer.valueOf(iC)));
                        return;
                    }
                    c0.g0(list, okio.o.f335048f);
                    okio.o oVar = null;
                    okio.o oVar2 = null;
                    okio.o oVar3 = null;
                    okio.o oVar4 = null;
                    while (list.size() > 0 && list.get(0).f290510a.E(0) == 58) {
                        io.grpc.okhttp.internal.framed.d dVarRemove = list.remove(0);
                        if (c0.F.equals(dVarRemove.f290510a) && oVar == null) {
                            oVar = dVarRemove.f290511b;
                        } else if (c0.I.equals(dVarRemove.f290510a) && oVar2 == null) {
                            oVar2 = dVarRemove.f290511b;
                        } else if (c0.J.equals(dVarRemove.f290510a) && oVar3 == null) {
                            oVar3 = dVarRemove.f290511b;
                        } else {
                            if (!c0.K.equals(dVarRemove.f290510a) || oVar4 != null) {
                                g(i10, io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Unexpected pseudo header. RFC7540 section 8.1.2.1");
                                return;
                            }
                            oVar4 = dVarRemove.f290511b;
                        }
                    }
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (list.get(i12).f290510a.E(0) == 58) {
                            g(i10, io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Pseudo header not before regular headers. RFC7540 section 8.1.2.1");
                            return;
                        }
                    }
                    if (!c0.G.equals(oVar) && z12 && (oVar == null || oVar2 == null || oVar3 == null)) {
                        g(i10, io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Missing required pseudo header. RFC7540 section 8.1.2.3");
                        return;
                    }
                    if (c0.d0(list, c0.L)) {
                        g(i10, io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Connection-specific headers not permitted. RFC7540 section 8.1.2.2");
                        return;
                    }
                    if (!z12) {
                        if (!z11) {
                            g(i10, io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Headers disallowed in the middle of the stream. RFC7540 section 8.1");
                            return;
                        }
                        synchronized (c0.this.f290259n) {
                            try {
                                f fVar = (f) c0.this.f290266u.get(Integer.valueOf(i10));
                                if (fVar == null) {
                                    g(i10, io.grpc.okhttp.internal.framed.a.STREAM_CLOSED, "Received headers for closed stream");
                                    return;
                                } else if (fVar.k()) {
                                    g(i10, io.grpc.okhttp.internal.framed.a.STREAM_CLOSED, "Received HEADERS for half-closed (remote) stream. RFC7540 section 5.1");
                                    return;
                                } else {
                                    fVar.e(new okio.l(), 0, 0, true);
                                    return;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    if (oVar4 == null && (iE0 = c0.e0(list, c0.M, 0)) != -1) {
                        if (c0.e0(list, c0.M, iE0 + 1) != -1) {
                            e(i10, z11, 400, y2.b.INTERNAL, "Multiple host headers disallowed. RFC7230 section 5.4");
                            return;
                        }
                        oVar4 = list.get(iE0).f290511b;
                    }
                    okio.o oVar5 = oVar4;
                    c0.g0(list, c0.M);
                    if (oVar3.v0() == 0 || oVar3.E(0) != 47) {
                        e(i10, z11, 404, y2.b.UNIMPLEMENTED, "Expected path to start with /: " + c0.c0(oVar3));
                        return;
                    }
                    String strSubstring = c0.c0(oVar3).substring(1);
                    okio.o oVarF0 = c0.f0(list, c0.P);
                    if (oVarF0 == null) {
                        e(i10, z11, 415, y2.b.INTERNAL, "Content-Type is missing or duplicated");
                        return;
                    }
                    String strC0 = c0.c0(oVarF0);
                    if (!io.grpc.internal.v0.q(strC0)) {
                        e(i10, z11, 415, y2.b.INTERNAL, "Content-Type is not supported: " + strC0);
                        return;
                    }
                    if (!c0.H.equals(oVar)) {
                        e(i10, z11, 405, y2.b.INTERNAL, "HTTP Method is not supported: " + c0.c0(oVar));
                        return;
                    }
                    okio.o oVarF1 = c0.f0(list, c0.N);
                    if (!c0.O.equals(oVarF1)) {
                        d(i10, z11, y2.b.INTERNAL, String.format("Expected header TE: %s, but %s is received. Some intermediate proxy may not support trailers", c0.c0(c0.O), oVarF1 == null ? "<missing>" : c0.c0(oVarF1)));
                        return;
                    }
                    c0.g0(list, c0.Q);
                    v1 v1VarA = n0.a(list);
                    i3 i3VarJ = i3.j(c0.this.f290246a.f290273a, strSubstring, v1VarA);
                    synchronized (c0.this.f290259n) {
                        try {
                            c0 c0Var = c0.this;
                            u.b bVar = new u.b(c0Var, i10, c0Var.f290246a.f290281i, i3VarJ, c0.this.f290259n, c0.this.f290264s, c0.this.f290265t, c0.this.f290246a.f290280h, c0.this.f290248c, strSubstring);
                            u uVar = new u(bVar, c0.this.f290254i, oVar5 == null ? null : c0.c0(oVar5), i3VarJ, c0.this.f290248c);
                            if (c0.this.f290266u.isEmpty()) {
                                c0.this.f290258m.b();
                                if (c0.this.f290256k != null) {
                                    c0.this.f290256k.h();
                                }
                            }
                            c0.this.f290266u.put(Integer.valueOf(i10), bVar);
                            c0.this.f290251f.c(uVar, strSubstring, v1VarA);
                            bVar.y();
                            if (z11) {
                                bVar.e(new okio.l(), 0, 0, z11);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void O1(boolean z10, io.grpc.okhttp.internal.framed.i iVar) {
            boolean zF;
            this.f290288a.j(m.a.INBOUND, iVar);
            synchronized (c0.this.f290259n) {
                try {
                    if (e0.b(iVar, 7)) {
                        zF = c0.this.f290265t.f(e0.a(iVar, 7));
                    } else {
                        zF = false;
                    }
                    c0.this.f290264s.Da(iVar);
                    c0.this.f290264s.flush();
                    if (!this.f290290c) {
                        this.f290290c = true;
                        c0 c0Var = c0.this;
                        c0Var.f290254i = c0Var.f290251f.b(c0.this.f290254i);
                    }
                    if (zF) {
                        c0.this.f290265t.i();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void P1(boolean z10, int i10, okio.n nVar, int i11, int i12) throws IOException {
            this.f290288a.b(m.a.INBOUND, i10, nVar.n(), i11, z10);
            if (i10 == 0) {
                b(io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Stream 0 is reserved for control messages. RFC7540 section 5.1.1");
                return;
            }
            if ((i10 & 1) == 0) {
                b(io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "Clients cannot open even numbered streams. RFC7540 section 5.1.1");
                return;
            }
            long j10 = i11;
            nVar.q1(j10);
            synchronized (c0.this.f290259n) {
                try {
                    f fVar = (f) c0.this.f290266u.get(Integer.valueOf(i10));
                    if (fVar == null) {
                        nVar.skip(j10);
                        g(i10, io.grpc.okhttp.internal.framed.a.STREAM_CLOSED, "Received data for closed stream");
                        return;
                    }
                    if (fVar.k()) {
                        nVar.skip(j10);
                        g(i10, io.grpc.okhttp.internal.framed.a.STREAM_CLOSED, "Received DATA for half-closed (remote) stream. RFC7540 section 5.1");
                        return;
                    }
                    if (fVar.c() < i12) {
                        nVar.skip(j10);
                        g(i10, io.grpc.okhttp.internal.framed.a.FLOW_CONTROL_ERROR, "Received DATA size exceeded window size. RFC7540 section 6.9");
                        return;
                    }
                    okio.l lVar = new okio.l();
                    lVar.Ga(nVar.n(), j10);
                    fVar.e(lVar, i11, i12 - i11, z10);
                    int i13 = this.f290291d + i12;
                    this.f290291d = i13;
                    if (i13 >= c0.this.f290246a.f290280h * 0.5f) {
                        synchronized (c0.this.f290259n) {
                            try {
                                c0.this.f290264s.c0(0, this.f290291d);
                                c0.this.f290264s.flush();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        this.f290291d = 0;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void Q(int i10, int i11, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
            this.f290288a.h(m.a.INBOUND, i10, i11, list);
            b(io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "PUSH_PROMISE only allowed on peer-initiated streams. RFC7540 section 6.6");
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void Q1(int i10, io.grpc.okhttp.internal.framed.a aVar, okio.o oVar) {
            this.f290288a.c(m.a.INBOUND, i10, aVar, oVar);
            y2 y2VarU = io.grpc.internal.v0.j.p(aVar.f290500a).u(String.format("Received GOAWAY: %s '%s'", aVar, oVar.G0()));
            if (!io.grpc.okhttp.internal.framed.a.NO_ERROR.equals(aVar)) {
                c0.B.log(Level.WARNING, "Received GOAWAY: {0} {1}", new Object[]{aVar, oVar.G0()});
            }
            synchronized (c0.this.f290259n) {
                try {
                    c0.this.f290269x = y2VarU;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void W(boolean z10, int i10, int i11) {
            if (!c0.this.f290258m.d()) {
                c0.this.o(io.grpc.okhttp.internal.framed.a.ENHANCE_YOUR_CALM, "too_many_pings", y2.f291459n.u("Too many pings from client"), false);
                return;
            }
            long j10 = (((long) i10) << 32) | (((long) i11) & com.rabbitmq.client.k0.f265952a);
            if (!z10) {
                this.f290288a.e(m.a.INBOUND, j10);
                synchronized (c0.this.f290259n) {
                    try {
                        c0.this.f290264s.W(true, i10, i11);
                        c0.this.f290264s.flush();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            this.f290288a.f(m.a.INBOUND, j10);
            if (57005 == j10) {
                return;
            }
            if (4369 == j10) {
                c0.this.o0();
                return;
            }
            c0.B.log(Level.INFO, "Received unexpected ping ack: " + j10);
        }

        @Override // io.grpc.okhttp.internal.framed.b.a
        public void c0(int i10, long j10) {
            this.f290288a.l(m.a.INBOUND, i10, j10);
            synchronized (c0.this.f290259n) {
                try {
                    if (i10 == 0) {
                        c0.this.f290265t.h(null, (int) j10);
                    } else {
                        f fVar = (f) c0.this.f290266u.get(Integer.valueOf(i10));
                        if (fVar != null) {
                            c0.this.f290265t.h(fVar.l(), (int) j10);
                        }
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
            this.f290288a.g(m.a.INBOUND, i10, i11, i12, z10);
        }

        @Override // java.lang.Runnable
        public void run() {
            InputStream inputStream;
            y2 y2VarU;
            InputStream inputStream2;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpServerTransport");
            try {
                try {
                    this.f290289b.Y3();
                    try {
                        if (this.f290289b.x9(this)) {
                            if (this.f290290c) {
                                while (this.f290289b.x9(this)) {
                                    if (c0.this.f290255j != null) {
                                        c0.this.f290255j.n();
                                    }
                                }
                                synchronized (c0.this.f290259n) {
                                    try {
                                        y2VarU = c0.this.f290269x;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (y2VarU == null) {
                                    y2VarU = y2.f291465t.u("TCP connection closed or IOException");
                                }
                                c0.this.o(io.grpc.okhttp.internal.framed.a.INTERNAL_ERROR, "I/O failure", y2VarU, false);
                                inputStream = c0.this.f290250e.getInputStream();
                            } else {
                                b(io.grpc.okhttp.internal.framed.a.PROTOCOL_ERROR, "First HTTP/2 frame must be SETTINGS. RFC7540 section 3.5");
                                inputStream2 = c0.this.f290250e.getInputStream();
                            }
                            io.grpc.internal.v0.g(inputStream);
                            io.grpc.internal.v0.f(c0.this.f290250e);
                            c0.this.m0();
                            Thread.currentThread().setName(name);
                            return;
                        }
                        b(io.grpc.okhttp.internal.framed.a.INTERNAL_ERROR, "Failed to read initial SETTINGS");
                        inputStream2 = c0.this.f290250e.getInputStream();
                        io.grpc.internal.v0.g(inputStream2);
                    } catch (IOException unused) {
                    }
                    io.grpc.internal.v0.f(c0.this.f290250e);
                    c0.this.m0();
                    Thread.currentThread().setName(name);
                } catch (Throwable th3) {
                    try {
                        c0.B.log(Level.WARNING, "Error decoding HTTP/2 frames", th3);
                        c0.this.o(io.grpc.okhttp.internal.framed.a.INTERNAL_ERROR, "Error in frame decoder", y2.f291464s.u("Error decoding HTTP/2 frames").t(th3), false);
                        inputStream = c0.this.f290250e.getInputStream();
                    } catch (Throwable th4) {
                        try {
                            io.grpc.internal.v0.g(c0.this.f290250e.getInputStream());
                        } catch (IOException unused2) {
                        }
                        io.grpc.internal.v0.f(c0.this.f290250e);
                        c0.this.m0();
                        Thread.currentThread().setName(name);
                        throw th4;
                    }
                }
            } catch (IOException unused3) {
            }
        }
    }

    static class d implements f, i0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f290293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f290294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i0.c f290295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        private int f290296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        private boolean f290297e;

        d(int i10, Object obj, i0 i0Var, int i11) {
            this.f290293a = i10;
            this.f290294b = obj;
            this.f290295c = i0Var.c(this, i10);
            this.f290296d = i11;
        }

        @Override // io.grpc.okhttp.c0.f
        public int c() {
            int i10;
            synchronized (this.f290294b) {
                try {
                    i10 = this.f290296d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        @Override // io.grpc.okhttp.c0.f
        public void e(okio.l lVar, int i10, int i11, boolean z10) {
            synchronized (this.f290294b) {
                if (z10) {
                    try {
                        this.f290297e = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f290296d -= i10 + i11;
                try {
                    lVar.skip(lVar.size());
                } catch (IOException e10) {
                    throw new AssertionError(e10);
                }
            }
        }

        @Override // io.grpc.okhttp.c0.f
        public void g(y2 y2Var) {
        }

        @Override // io.grpc.okhttp.i0.b
        public void h(int i10) {
        }

        @Override // io.grpc.okhttp.c0.f
        public void j(y2 y2Var) {
        }

        @Override // io.grpc.okhttp.c0.f
        public boolean k() {
            boolean z10;
            synchronized (this.f290294b) {
                try {
                    z10 = this.f290297e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        @Override // io.grpc.okhttp.c0.f
        public i0.c l() {
            i0.c cVar;
            synchronized (this.f290294b) {
                cVar = this.f290295c;
            }
            return cVar;
        }
    }

    private final class e implements j1.d {
        private e() {
        }

        @Override // io.grpc.internal.j1.d
        public void a() {
            synchronized (c0.this.f290259n) {
                try {
                    c0.this.f290269x = y2.f291465t.u("Keepalive failed. Considering connection dead");
                    io.grpc.internal.v0.f(c0.this.f290250e);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.j1.d
        public void b() {
            synchronized (c0.this.f290259n) {
                try {
                    c0.this.f290264s.W(false, 0, c0.E);
                    c0.this.f290264s.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c0.this.f290248c.c();
        }

        /* synthetic */ e(c0 c0Var, a aVar) {
            this();
        }
    }

    interface f {
        int c();

        void e(okio.l lVar, int i10, int i11, boolean z10);

        void g(y2 y2Var);

        void j(y2 y2Var);

        boolean k();

        i0.c l();
    }

    public c0(b bVar, Socket socket) {
        this.f290246a = (b) com.google.common.base.j0.F(bVar, "config");
        this.f290250e = (Socket) com.google.common.base.j0.F(socket, "bareSocket");
        q3 q3VarA = bVar.f290276d.a();
        this.f290248c = q3VarA;
        q3VarA.i(new q3.c() { // from class: io.grpc.okhttp.a0
            @Override // io.grpc.internal.q3.c
            public final q3.d read() {
                return this.f290238a.h0();
            }
        });
        this.f290249d = c1.a(c0.class, this.f290250e.getRemoteSocketAddress().toString());
        this.f290252g = bVar.f290274b.a();
        this.f290253h = bVar.f290275c.a();
        this.f290258m = new i1(bVar.f290284l, bVar.f290285m, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c0(okio.o oVar) {
        for (int i10 = 0; i10 < oVar.v0(); i10++) {
            if (oVar.E(i10) < 0) {
                return oVar.y0(io.grpc.internal.v0.f289898c);
            }
        }
        return oVar.G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d0(List<io.grpc.okhttp.internal.framed.d> list, okio.o oVar) {
        return e0(list, oVar, 0) != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e0(List<io.grpc.okhttp.internal.framed.d> list, okio.o oVar, int i10) {
        while (i10 < list.size()) {
            if (list.get(i10).f290510a.equals(oVar)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static okio.o f0(List<io.grpc.okhttp.internal.framed.d> list, okio.o oVar) {
        int iE0 = e0(list, oVar, 0);
        if (iE0 != -1 && e0(list, oVar, iE0 + 1) == -1) {
            return list.get(iE0).f290511b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g0(List<io.grpc.okhttp.internal.framed.d> list, okio.o oVar) {
        int iE0 = 0;
        while (true) {
            iE0 = e0(list, oVar, iE0);
            if (iE0 == -1) {
                return;
            } else {
                list.remove(iE0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q3.d h0() {
        q3.d dVar;
        synchronized (this.f290259n) {
            i0 i0Var = this.f290265t;
            dVar = new q3.d(i0Var == null ? -1L : i0Var.h(null, 0), (long) (this.f290246a.f290280h * 0.5f));
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(@fj.h Long l10) {
        synchronized (this.f290259n) {
            try {
                if (!this.f290261p && !this.f290260o) {
                    this.f290261p = true;
                    this.A = l10;
                    if (this.f290264s == null) {
                        this.f290262q = true;
                        io.grpc.internal.v0.f(this.f290250e);
                    } else {
                        this.f290270y = this.f290253h.schedule(new Runnable() { // from class: io.grpc.okhttp.z
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f290836a.o0();
                            }
                        }, D, TimeUnit.NANOSECONDS);
                        this.f290264s.tf(Integer.MAX_VALUE, io.grpc.okhttp.internal.framed.a.NO_ERROR, new byte[0]);
                        this.f290264s.W(false, 0, C);
                        this.f290264s.flush();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(t2 t2Var) {
        try {
            synchronized (this.f290259n) {
                this.f290250e.setTcpNoDelay(true);
            }
            io.grpc.okhttp.d.a aVarA = this.f290246a.f290277e.a(this.f290250e, io.grpc.a.f288673c);
            synchronized (this.f290259n) {
                this.f290250e = aVarA.f290299a;
            }
            this.f290254i = aVarA.f290300b;
            io.grpc.okhttp.a aVarQ = io.grpc.okhttp.a.q(t2Var, this, 10000);
            aVarQ.m(okio.l0.q(this.f290250e), this.f290250e);
            a aVar = new a(aVarQ.o(this.f290247b.b(okio.l0.d(aVarQ), false)));
            synchronized (this.f290259n) {
                try {
                    this.f290263r = aVarA.f290301c;
                    io.grpc.okhttp.b bVar = new io.grpc.okhttp.b(this, aVar);
                    this.f290264s = bVar;
                    this.f290265t = new i0(this, bVar);
                    this.f290264s.A2();
                    io.grpc.okhttp.internal.framed.i iVar = new io.grpc.okhttp.internal.framed.i();
                    e0.c(iVar, 7, this.f290246a.f290280h);
                    e0.c(iVar, 6, this.f290246a.f290282j);
                    this.f290264s.Q3(iVar);
                    int i10 = this.f290246a.f290280h;
                    if (i10 > 65535) {
                        this.f290264s.c0(0, i10 - 65535);
                    }
                    this.f290264s.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f290246a.f290278f != Long.MAX_VALUE) {
                e eVar = new e(this, null);
                ScheduledExecutorService scheduledExecutorService = this.f290253h;
                b bVar2 = this.f290246a;
                j1 j1Var = new j1(eVar, scheduledExecutorService, bVar2.f290278f, bVar2.f290279g, true);
                this.f290255j = j1Var;
                j1Var.q();
            }
            if (this.f290246a.f290283k != Long.MAX_VALUE) {
                s1 s1Var = new s1(this.f290246a.f290283k);
                this.f290256k = s1Var;
                s1Var.k(new Runnable() { // from class: io.grpc.okhttp.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f290834a.shutdown();
                    }
                }, this.f290253h);
            }
            if (this.f290246a.f290286n != Long.MAX_VALUE) {
                this.f290257l = this.f290253h.schedule(new k1(new Runnable() { // from class: io.grpc.okhttp.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0 c0Var = this.f290835a;
                        c0Var.i0(Long.valueOf(c0Var.f290246a.f290287o));
                    }
                }), (long) (((Math.random() * 0.2d) + 0.9d) * this.f290246a.f290286n), TimeUnit.NANOSECONDS);
            }
            this.f290252g.execute(new c(this.f290247b.a(okio.l0.e(okio.l0.v(this.f290250e)), false)));
        } catch (IOException | Error | RuntimeException e10) {
            synchronized (this.f290259n) {
                try {
                    if (!this.f290262q) {
                        B.log(Level.INFO, "Socket failed to handshake", e10);
                    }
                    io.grpc.internal.v0.f(this.f290250e);
                    m0();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        synchronized (this.f290259n) {
            try {
                ScheduledFuture<?> scheduledFuture = this.f290271z;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f290271z = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j1 j1Var = this.f290255j;
        if (j1Var != null) {
            j1Var.r();
        }
        s1 s1Var = this.f290256k;
        if (s1Var != null) {
            s1Var.j();
        }
        ScheduledFuture<?> scheduledFuture2 = this.f290257l;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
        this.f290252g = this.f290246a.f290274b.b(this.f290252g);
        this.f290253h = this.f290246a.f290275c.b(this.f290253h);
        this.f290251f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        io.grpc.internal.v0.f(this.f290250e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(io.grpc.okhttp.internal.framed.a aVar, String str, y2 y2Var, boolean z10) {
        synchronized (this.f290259n) {
            try {
                if (this.f290260o) {
                    return;
                }
                this.f290260o = true;
                this.f290269x = y2Var;
                ScheduledFuture<?> scheduledFuture = this.f290270y;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f290270y = null;
                }
                for (Map.Entry<Integer, f> entry : this.f290266u.entrySet()) {
                    if (z10) {
                        this.f290264s.M1(entry.getKey().intValue(), io.grpc.okhttp.internal.framed.a.CANCEL);
                    }
                    entry.getValue().g(y2Var);
                }
                this.f290266u.clear();
                this.f290264s.tf(this.f290267v, aVar, str.getBytes(io.grpc.internal.v0.f289898c));
                this.f290268w = this.f290267v;
                this.f290264s.close();
                this.f290271z = this.f290253h.schedule(new w(this), 1L, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        synchronized (this.f290259n) {
            try {
                ScheduledFuture<?> scheduledFuture = this.f290270y;
                if (scheduledFuture == null) {
                    return;
                }
                scheduledFuture.cancel(false);
                this.f290270y = null;
                this.f290264s.tf(this.f290267v, io.grpc.okhttp.internal.framed.a.NO_ERROR, new byte[0]);
                this.f290268w = this.f290267v;
                if (this.f290266u.isEmpty()) {
                    this.f290264s.close();
                } else {
                    this.f290264s.flush();
                }
                if (this.A != null) {
                    this.f290271z = this.f290253h.schedule(new w(this), this.A.longValue(), TimeUnit.NANOSECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.internal.b3
    public ScheduledExecutorService E0() {
        return this.f290253h;
    }

    @Override // io.grpc.internal.b3
    public void a(y2 y2Var) {
        synchronized (this.f290259n) {
            try {
                if (this.f290264s != null) {
                    o(io.grpc.okhttp.internal.framed.a.NO_ERROR, "", y2Var, true);
                } else {
                    this.f290262q = true;
                    io.grpc.internal.v0.f(this.f290250e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.okhttp.i0.d
    public i0.c[] b() {
        i0.c[] cVarArr;
        synchronized (this.f290259n) {
            try {
                cVarArr = new i0.c[this.f290266u.size()];
                Iterator<f> it = this.f290266u.values().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    cVarArr[i10] = it.next().l();
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVarArr;
    }

    @Override // io.grpc.m1
    public c1 c() {
        return this.f290249d;
    }

    @Override // io.grpc.okhttp.b.a
    public void g(Throwable th2) {
        com.google.common.base.j0.F(th2, "failureCause");
        o(io.grpc.okhttp.internal.framed.a.INTERNAL_ERROR, "I/O failure", y2.f291465t.t(th2), false);
    }

    @Override // io.grpc.a1
    public t1<v0.l> i() {
        t1<v0.l> t1VarO;
        synchronized (this.f290259n) {
            t1VarO = h1.o(new v0.l(this.f290248c.b(), this.f290250e.getLocalSocketAddress(), this.f290250e.getRemoteSocketAddress(), n0.e(this.f290250e), this.f290263r));
        }
        return t1VarO;
    }

    public void j0(c3 c3Var) {
        this.f290251f = (c3) com.google.common.base.j0.F(c3Var, com.google.android.gms.common.internal.z.a.f106673a);
        final t2 t2Var = new t2(this.f290252g);
        t2Var.execute(new Runnable() { // from class: io.grpc.okhttp.b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f290243a.k0(t2Var);
            }
        });
    }

    void l0(int i10, boolean z10) {
        synchronized (this.f290259n) {
            try {
                this.f290266u.remove(Integer.valueOf(i10));
                if (this.f290266u.isEmpty()) {
                    this.f290258m.c();
                    s1 s1Var = this.f290256k;
                    if (s1Var != null) {
                        s1Var.i();
                    }
                }
                if (this.f290261p && this.f290266u.isEmpty()) {
                    this.f290264s.close();
                } else if (z10) {
                    this.f290264s.flush();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.internal.b3
    public void shutdown() {
        i0(null);
    }
}
