package io.grpc.internal;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class w2 extends io.grpc.i2 implements io.grpc.a1<io.grpc.v0.j> {
    private static final Logger A = Logger.getLogger(w2.class.getName());
    private static final a3 B = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z1<? extends Executor> f290032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Executor f290033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.grpc.o0 f290034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.grpc.o0 f290035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<io.grpc.v2> f290036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.grpc.o2[] f290037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f290038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private io.grpc.y2 f290041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d1 f290044o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290046q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final io.grpc.w f290048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final io.grpc.a0 f290049t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final io.grpc.t f290050u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final io.grpc.b f290051v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final io.grpc.v0 f290052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final o f290053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final io.grpc.y.c f290054y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final io.grpc.l2 f290055z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f290045p = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private final Set<b3> f290047r = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.c1 f290031b = io.grpc.c1.b(com.google.common.net.d.C0, String.valueOf(S()));

    @com.google.common.annotations.e
    static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.w.f f290056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f290057b;

        b(io.grpc.w.f fVar, Throwable th2) {
            this.f290056a = fVar;
            this.f290057b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f290056a.y0(this.f290057b);
        }
    }

    @com.google.common.annotations.e
    static final class c implements a3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f290058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f290059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.grpc.w.f f290060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final z2 f290061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final io.perfmark.e f290062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private a3 f290063f;

        final class a extends a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.perfmark.b f290064b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.grpc.y2 f290065c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(io.perfmark.b bVar, io.grpc.y2 y2Var) {
                super(c.this.f290060c);
                this.f290064b = bVar;
                this.f290065c = y2Var;
            }

            @Override // io.grpc.internal.a0
            public void a() {
                io.perfmark.f fVarZ = io.perfmark.c.z("ServerCallListener(app).closed");
                try {
                    io.perfmark.c.a(c.this.f290062e);
                    io.perfmark.c.n(this.f290064b);
                    c.this.l().b(this.f290065c);
                    if (fVarZ != null) {
                        fVarZ.close();
                    }
                } catch (Throwable th2) {
                    if (fVarZ != null) {
                        try {
                            fVarZ.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }

        final class b extends a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.perfmark.b f290067b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(io.perfmark.b bVar) {
                super(c.this.f290060c);
                this.f290067b = bVar;
            }

            @Override // io.grpc.internal.a0
            public void a() {
                try {
                    io.perfmark.f fVarZ = io.perfmark.c.z("ServerCallListener(app).halfClosed");
                    try {
                        io.perfmark.c.a(c.this.f290062e);
                        io.perfmark.c.n(this.f290067b);
                        c.this.l().d();
                        if (fVarZ != null) {
                            fVarZ.close();
                        }
                    } catch (Throwable th2) {
                        if (fVarZ != null) {
                            try {
                                fVarZ.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    c.this.m(th4);
                    throw th4;
                }
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.w2$c$c, reason: collision with other inner class name */
        final class C1976c extends a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.perfmark.b f290069b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k3.a f290070c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1976c(io.perfmark.b bVar, k3.a aVar) {
                super(c.this.f290060c);
                this.f290069b = bVar;
                this.f290070c = aVar;
            }

            @Override // io.grpc.internal.a0
            public void a() {
                try {
                    io.perfmark.f fVarZ = io.perfmark.c.z("ServerCallListener(app).messagesAvailable");
                    try {
                        io.perfmark.c.a(c.this.f290062e);
                        io.perfmark.c.n(this.f290069b);
                        c.this.l().a(this.f290070c);
                        if (fVarZ != null) {
                            fVarZ.close();
                        }
                    } catch (Throwable th2) {
                        if (fVarZ != null) {
                            try {
                                fVarZ.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    c.this.m(th4);
                    throw th4;
                }
            }
        }

        final class d extends a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.perfmark.b f290072b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(io.perfmark.b bVar) {
                super(c.this.f290060c);
                this.f290072b = bVar;
            }

            @Override // io.grpc.internal.a0
            public void a() {
                try {
                    io.perfmark.f fVarZ = io.perfmark.c.z("ServerCallListener(app).onReady");
                    try {
                        io.perfmark.c.a(c.this.f290062e);
                        io.perfmark.c.n(this.f290072b);
                        c.this.l().e();
                        if (fVarZ != null) {
                            fVarZ.close();
                        }
                    } catch (Throwable th2) {
                        if (fVarZ != null) {
                            try {
                                fVarZ.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    c.this.m(th4);
                    throw th4;
                }
            }
        }

        public c(Executor executor, Executor executor2, z2 z2Var, io.grpc.w.f fVar, io.perfmark.e eVar) {
            this.f290058a = executor;
            this.f290059b = executor2;
            this.f290061d = z2Var;
            this.f290060c = fVar;
            this.f290062e = eVar;
        }

        private void k(io.grpc.y2 y2Var) {
            if (!y2Var.r()) {
                Throwable thO = y2Var.o();
                if (thO == null) {
                    thO = io.grpc.l1.a(io.grpc.y2.f291451f.u("RPC cancelled"), null, false);
                }
                this.f290059b.execute(new b(this.f290060c, thO));
            }
            this.f290058a.execute(new a(io.perfmark.c.o(), y2Var));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a3 l() {
            a3 a3Var = this.f290063f;
            if (a3Var != null) {
                return a3Var;
            }
            throw new IllegalStateException("listener unset");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(Throwable th2) {
            this.f290061d.p(io.grpc.y2.f291452g.u("Application error processing RPC").t(th2), new io.grpc.v1());
        }

        @Override // io.grpc.internal.k3
        public void a(k3.a aVar) {
            io.perfmark.f fVarZ = io.perfmark.c.z("ServerStreamListener.messagesAvailable");
            try {
                io.perfmark.c.a(this.f290062e);
                this.f290058a.execute(new C1976c(io.perfmark.c.o(), aVar));
                if (fVarZ != null) {
                    fVarZ.close();
                }
            } catch (Throwable th2) {
                if (fVarZ != null) {
                    try {
                        fVarZ.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // io.grpc.internal.a3
        public void b(io.grpc.y2 y2Var) {
            io.perfmark.f fVarZ = io.perfmark.c.z("ServerStreamListener.closed");
            try {
                io.perfmark.c.a(this.f290062e);
                k(y2Var);
                if (fVarZ != null) {
                    fVarZ.close();
                }
            } catch (Throwable th2) {
                if (fVarZ != null) {
                    try {
                        fVarZ.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // io.grpc.internal.a3
        public void d() {
            io.perfmark.f fVarZ = io.perfmark.c.z("ServerStreamListener.halfClosed");
            try {
                io.perfmark.c.a(this.f290062e);
                this.f290058a.execute(new b(io.perfmark.c.o()));
                if (fVarZ != null) {
                    fVarZ.close();
                }
            } catch (Throwable th2) {
                if (fVarZ != null) {
                    try {
                        fVarZ.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // io.grpc.internal.k3
        public void e() {
            io.perfmark.f fVarZ = io.perfmark.c.z("ServerStreamListener.onReady");
            try {
                io.perfmark.c.a(this.f290062e);
                this.f290058a.execute(new d(io.perfmark.c.o()));
                if (fVarZ != null) {
                    fVarZ.close();
                }
            } catch (Throwable th2) {
                if (fVarZ != null) {
                    try {
                        fVarZ.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @com.google.common.annotations.e
        void n(a3 a3Var) {
            com.google.common.base.j0.F(a3Var, "listener must not be null");
            com.google.common.base.j0.h0(this.f290063f == null, "Listener already set");
            this.f290063f = a3Var;
        }
    }

    private static final class d implements a3 {
        private d() {
        }

        @Override // io.grpc.internal.k3
        public void a(k3.a aVar) {
            while (true) {
                InputStream next = aVar.next();
                if (next == null) {
                    return;
                }
                try {
                    next.close();
                } catch (IOException e10) {
                    while (true) {
                        InputStream next2 = aVar.next();
                        if (next2 == null) {
                            throw new RuntimeException(e10);
                        }
                        try {
                            next2.close();
                        } catch (IOException e11) {
                            w2.A.log(Level.WARNING, "Exception closing stream", (Throwable) e11);
                        }
                    }
                }
            }
        }

        @Override // io.grpc.internal.a3
        public void b(io.grpc.y2 y2Var) {
        }

        @Override // io.grpc.internal.a3
        public void d() {
        }

        @Override // io.grpc.internal.k3
        public void e() {
        }
    }

    private final class e implements y2 {
        private e() {
        }

        @Override // io.grpc.internal.y2
        public void a() {
            synchronized (w2.this.f290045p) {
                try {
                    if (w2.this.f290042m) {
                        return;
                    }
                    ArrayList<b3> arrayList = new ArrayList(w2.this.f290047r);
                    io.grpc.y2 y2Var = w2.this.f290041l;
                    w2.this.f290042m = true;
                    for (b3 b3Var : arrayList) {
                        if (y2Var == null) {
                            b3Var.shutdown();
                        } else {
                            b3Var.a(y2Var);
                        }
                    }
                    synchronized (w2.this.f290045p) {
                        try {
                            w2.this.f290046q = true;
                            w2.this.R();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // io.grpc.internal.y2
        public c3 b(b3 b3Var) {
            synchronized (w2.this.f290045p) {
                w2.this.f290047r.add(b3Var);
            }
            f fVar = w2.this.new f(b3Var);
            fVar.h();
            return fVar;
        }
    }

    private final class f implements c3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b3 f290075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Future<?> f290076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private io.grpc.a f290077c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        final class b extends a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.grpc.w.f f290080b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.perfmark.b f290081c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ io.perfmark.e f290082d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.google.common.util.concurrent.m2 f290083e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f290084f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ io.grpc.v1 f290085g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ z2 f290086h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ c f290087i;

            final class a implements io.grpc.w.g {
                a() {
                }

                @Override // io.grpc.w.g
                public void a(io.grpc.w wVar) {
                    io.grpc.y2 y2VarB = io.grpc.x.b(wVar);
                    if (io.grpc.y2.f291454i.p().equals(y2VarB.p())) {
                        b.this.f290086h.a(y2VarB);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(io.grpc.w.f fVar, io.perfmark.b bVar, io.perfmark.e eVar, com.google.common.util.concurrent.m2 m2Var, String str, io.grpc.v1 v1Var, z2 z2Var, c cVar) {
                super(fVar);
                this.f290080b = fVar;
                this.f290081c = bVar;
                this.f290082d = eVar;
                this.f290083e = m2Var;
                this.f290084f = str;
                this.f290085g = v1Var;
                this.f290086h = z2Var;
                this.f290087i = cVar;
            }

            private void b() {
                a3 a3Var = w2.B;
                if (this.f290083e.isCancelled()) {
                    return;
                }
                try {
                    this.f290087i.n(f.this.i(this.f290084f, (e) com.google.common.util.concurrent.h1.j(this.f290083e), this.f290085g));
                    this.f290080b.a(new a(), com.google.common.util.concurrent.a2.c());
                } catch (Throwable th2) {
                    try {
                        this.f290086h.p(io.grpc.y2.n(th2), new io.grpc.v1());
                        this.f290080b.y0(null);
                        throw new IllegalStateException(th2);
                    } catch (Throwable th3) {
                        this.f290087i.n(a3Var);
                        throw th3;
                    }
                }
            }

            @Override // io.grpc.internal.a0
            public void a() {
                io.perfmark.f fVarZ = io.perfmark.c.z("ServerTransportListener$HandleServerCall.startCall");
                try {
                    io.perfmark.c.n(this.f290081c);
                    io.perfmark.c.a(this.f290082d);
                    b();
                    if (fVarZ != null) {
                        fVarZ.close();
                    }
                } catch (Throwable th2) {
                    if (fVarZ != null) {
                        try {
                            fVarZ.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }

        final class c extends a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.grpc.w.f f290090b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.perfmark.e f290091c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ io.perfmark.b f290092d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f290093e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ z2 f290094f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c f290095g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ com.google.common.util.concurrent.m2 f290096h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ i3 f290097i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ io.grpc.v1 f290098j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ Executor f290099k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(io.grpc.w.f fVar, io.perfmark.e eVar, io.perfmark.b bVar, String str, z2 z2Var, c cVar, com.google.common.util.concurrent.m2 m2Var, i3 i3Var, io.grpc.v1 v1Var, Executor executor) {
                super(fVar);
                this.f290090b = fVar;
                this.f290091c = eVar;
                this.f290092d = bVar;
                this.f290093e = str;
                this.f290094f = z2Var;
                this.f290095g = cVar;
                this.f290096h = m2Var;
                this.f290097i = i3Var;
                this.f290098j = v1Var;
                this.f290099k = executor;
            }

            private <ReqT, RespT> e<ReqT, RespT> b(io.grpc.q2<ReqT, RespT> q2Var, z2 z2Var, io.grpc.v1 v1Var, io.grpc.w.f fVar, io.perfmark.e eVar) {
                Executor executorA;
                u2 u2Var = new u2(z2Var, q2Var.b(), v1Var, fVar, w2.this.f290049t, w2.this.f290050u, w2.this.f290053x, eVar);
                if (w2.this.f290055z != null && (executorA = w2.this.f290055z.a(u2Var, v1Var)) != null) {
                    ((t2) this.f290099k).e(executorA);
                }
                return f.this.new e<>(u2Var, q2Var.c());
            }

            private void c() throws Throwable {
                c cVar;
                try {
                    io.grpc.q2<?, ?> q2VarB = w2.this.f290034e.b(this.f290093e);
                    if (q2VarB == null) {
                        q2VarB = w2.this.f290035f.c(this.f290093e, this.f290094f.m());
                    }
                    if (q2VarB == null) {
                        io.grpc.y2 y2VarU = io.grpc.y2.f291463r.u("Method not found: " + this.f290093e);
                        this.f290095g.n(w2.B);
                        this.f290094f.p(y2VarU, new io.grpc.v1());
                        this.f290090b.y0(null);
                        this.f290096h.cancel(false);
                        return;
                    }
                    cVar = this;
                    try {
                        cVar.f290096h.B(cVar.b(f.this.k(this.f290094f, q2VarB, this.f290097i), this.f290094f, this.f290098j, this.f290090b, this.f290091c));
                    } catch (Throwable th2) {
                        th = th2;
                        cVar.f290095g.n(w2.B);
                        cVar.f290094f.p(io.grpc.y2.n(th), new io.grpc.v1());
                        cVar.f290090b.y0(null);
                        cVar.f290096h.cancel(false);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cVar = this;
                }
            }

            @Override // io.grpc.internal.a0
            public void a() {
                io.perfmark.f fVarZ = io.perfmark.c.z("ServerTransportListener$MethodLookup.startCall");
                try {
                    io.perfmark.c.a(this.f290091c);
                    io.perfmark.c.n(this.f290092d);
                    c();
                    if (fVarZ != null) {
                        fVarZ.close();
                    }
                } catch (Throwable th2) {
                    if (fVarZ != null) {
                        try {
                            fVarZ.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f290075a.a(io.grpc.y2.f291451f.u("Handshake timeout exceeded"));
            }
        }

        private final class e<ReqT, RespT> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            u2<ReqT, RespT> f290102a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            io.grpc.m2<ReqT, RespT> f290103b;

            public e(u2<ReqT, RespT> u2Var, io.grpc.m2<ReqT, RespT> m2Var) {
                this.f290102a = u2Var;
                this.f290103b = m2Var;
            }
        }

        f(b3 b3Var) {
            this.f290075a = b3Var;
        }

        private io.grpc.w.f g(io.grpc.v1 v1Var, i3 i3Var) {
            Long l10 = (Long) v1Var.l(v0.f289899d);
            io.grpc.w wVarY = i3Var.p(w2.this.f290048s).Y(io.grpc.h1.f288804a, w2.this);
            return l10 == null ? wVarY.R() : wVarY.T(io.grpc.y.c(l10.longValue(), TimeUnit.NANOSECONDS, w2.this.f290054y), this.f290075a.E0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <WReqT, WRespT> a3 i(String str, e<WReqT, WRespT> eVar, io.grpc.v1 v1Var) {
            io.grpc.k2.a<WReqT> aVarA = eVar.f290103b.a(eVar.f290102a, v1Var);
            if (aVarA != null) {
                return eVar.f290102a.s(aVarA);
            }
            throw new NullPointerException("startCall() returned a null listener for method " + str);
        }

        private void j(z2 z2Var, String str, io.grpc.v1 v1Var, io.perfmark.e eVar) {
            Executor t2Var;
            if (w2.this.f290055z == null && w2.this.f290033d == com.google.common.util.concurrent.a2.c()) {
                t2Var = new s2();
                z2Var.j();
            } else {
                t2Var = new t2(w2.this.f290033d);
            }
            Executor executor = t2Var;
            io.grpc.v1.i<String> iVar = v0.f289900e;
            if (v1Var.i(iVar)) {
                String str2 = (String) v1Var.l(iVar);
                io.grpc.z zVarF = w2.this.f290049t.f(str2);
                if (zVarF == null) {
                    z2Var.n(w2.B);
                    z2Var.p(io.grpc.y2.f291463r.u(String.format("Can't find decompressor for %s", str2)), new io.grpc.v1());
                    return;
                }
                z2Var.f(zVarF);
            }
            i3 i3Var = (i3) com.google.common.base.j0.F(z2Var.r(), "statsTraceCtx not present from stream");
            io.grpc.w.f fVarG = g(v1Var, i3Var);
            io.perfmark.b bVarO = io.perfmark.c.o();
            c cVar = new c(executor, w2.this.f290033d, z2Var, fVarG, eVar);
            z2Var.n(cVar);
            com.google.common.util.concurrent.m2 m2VarF = com.google.common.util.concurrent.m2.F();
            executor.execute(new c(fVarG, eVar, bVarO, str, z2Var, cVar, m2VarF, i3Var, v1Var, executor));
            executor.execute(new b(fVarG, bVarO, eVar, m2VarF, str, v1Var, z2Var, cVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <ReqT, RespT> io.grpc.q2<?, ?> k(z2 z2Var, io.grpc.q2<ReqT, RespT> q2Var, i3 i3Var) {
            i3Var.o(new v2(q2Var.b(), z2Var.getAttributes(), z2Var.m()));
            io.grpc.m2<ReqT, RespT> m2VarC = q2Var.c();
            for (io.grpc.o2 o2Var : w2.this.f290037h) {
                m2VarC = io.grpc.i1.a(o2Var, m2VarC);
            }
            io.grpc.q2<ReqT, RespT> q2VarD = q2Var.d(m2VarC);
            return w2.this.f290051v == null ? q2VarD : w2.this.f290051v.b(q2VarD);
        }

        @Override // io.grpc.internal.c3
        public void a() {
            Future<?> future = this.f290076b;
            if (future != null) {
                future.cancel(false);
                this.f290076b = null;
            }
            Iterator it = w2.this.f290036g.iterator();
            while (it.hasNext()) {
                ((io.grpc.v2) it.next()).b(this.f290077c);
            }
            w2.this.W(this.f290075a);
        }

        @Override // io.grpc.internal.c3
        public io.grpc.a b(io.grpc.a aVar) {
            this.f290076b.cancel(false);
            this.f290076b = null;
            for (io.grpc.v2 v2Var : w2.this.f290036g) {
                aVar = (io.grpc.a) com.google.common.base.j0.V(v2Var.a(aVar), "Filter %s returned null", v2Var);
            }
            this.f290077c = aVar;
            return aVar;
        }

        @Override // io.grpc.internal.c3
        public void c(z2 z2Var, String str, io.grpc.v1 v1Var) {
            io.perfmark.e eVarI = io.perfmark.c.i(str, z2Var.l());
            io.perfmark.f fVarZ = io.perfmark.c.z("ServerTransportListener.streamCreated");
            try {
                io.perfmark.c.a(eVarI);
                j(z2Var, str, v1Var, eVarI);
                if (fVarZ != null) {
                    fVarZ.close();
                }
            } catch (Throwable th2) {
                if (fVarZ != null) {
                    try {
                        fVarZ.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        public void h() {
            if (w2.this.f290038i != Long.MAX_VALUE) {
                this.f290076b = this.f290075a.E0().schedule(new d(), w2.this.f290038i, TimeUnit.MILLISECONDS);
            } else {
                this.f290076b = new FutureTask(new a(), null);
            }
            w2.this.f290052w.g(w2.this, this.f290075a);
        }
    }

    w2(x2 x2Var, d1 d1Var, io.grpc.w wVar) {
        this.f290032c = (z1) com.google.common.base.j0.F(x2Var.f290121g, "executorPool");
        this.f290034e = (io.grpc.o0) com.google.common.base.j0.F(x2Var.f290115a.b(), "registryBuilder");
        this.f290035f = (io.grpc.o0) com.google.common.base.j0.F(x2Var.f290120f, "fallbackRegistry");
        this.f290044o = (d1) com.google.common.base.j0.F(d1Var, "transportServer");
        this.f290048s = ((io.grpc.w) com.google.common.base.j0.F(wVar, "rootContext")).m();
        this.f290049t = x2Var.f290122h;
        this.f290050u = x2Var.f290123i;
        this.f290036g = Collections.unmodifiableList(new ArrayList(x2Var.f290116b));
        List<io.grpc.o2> list = x2Var.f290117c;
        this.f290037h = (io.grpc.o2[]) list.toArray(new io.grpc.o2[list.size()]);
        this.f290038i = x2Var.f290124j;
        this.f290051v = x2Var.f290131q;
        io.grpc.v0 v0Var = x2Var.f290132r;
        this.f290052w = v0Var;
        this.f290053x = x2Var.f290133s.k();
        this.f290054y = (io.grpc.y.c) com.google.common.base.j0.F(x2Var.f290125k, "ticker");
        v0Var.f(this);
        this.f290055z = x2Var.f290134t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        synchronized (this.f290045p) {
            try {
                if (this.f290040k && this.f290047r.isEmpty() && this.f290046q) {
                    if (this.f290043n) {
                        throw new AssertionError("Server already terminated");
                    }
                    this.f290043n = true;
                    this.f290052w.B(this);
                    Executor executor = this.f290033d;
                    if (executor != null) {
                        this.f290033d = this.f290032c.b(executor);
                    }
                    this.f290045p.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private List<SocketAddress> S() {
        List<SocketAddress> listUnmodifiableList;
        synchronized (this.f290045p) {
            try {
                listUnmodifiableList = Collections.unmodifiableList(this.f290044o.c());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(b3 b3Var) {
        synchronized (this.f290045p) {
            try {
                if (!this.f290047r.remove(b3Var)) {
                    throw new AssertionError("Transport already removed");
                }
                this.f290052w.C(this, b3Var);
                R();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.i2
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public w2 q() {
        synchronized (this.f290045p) {
            try {
                if (this.f290040k) {
                    return this;
                }
                this.f290040k = true;
                boolean z10 = this.f290039j;
                if (!z10) {
                    this.f290046q = true;
                    R();
                }
                if (z10) {
                    this.f290044o.shutdown();
                }
                return this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.i2
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public w2 r() {
        q();
        io.grpc.y2 y2VarU = io.grpc.y2.f291465t.u("Server shutdownNow invoked");
        synchronized (this.f290045p) {
            try {
                if (this.f290041l != null) {
                    return this;
                }
                this.f290041l = y2VarU;
                ArrayList arrayList = new ArrayList(this.f290047r);
                boolean z10 = this.f290042m;
                if (z10) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((b3) it.next()).a(y2VarU);
                    }
                }
                return this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.i2
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public w2 s() throws IOException {
        synchronized (this.f290045p) {
            com.google.common.base.j0.h0(!this.f290039j, "Already started");
            com.google.common.base.j0.h0(!this.f290040k, "Shutting down");
            this.f290044o.a(new e());
            this.f290033d = (Executor) com.google.common.base.j0.F(this.f290032c.a(), "executor");
            this.f290039j = true;
        }
        return this;
    }

    @Override // io.grpc.i2
    public void b() throws InterruptedException {
        synchronized (this.f290045p) {
            while (!this.f290043n) {
                try {
                    this.f290045p.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // io.grpc.m1
    public io.grpc.c1 c() {
        return this.f290031b;
    }

    @Override // io.grpc.i2
    public boolean g(long j10, TimeUnit timeUnit) throws InterruptedException {
        boolean z10;
        synchronized (this.f290045p) {
            try {
                long jNanoTime = System.nanoTime() + timeUnit.toNanos(j10);
                while (!this.f290043n) {
                    long jNanoTime2 = jNanoTime - System.nanoTime();
                    if (jNanoTime2 <= 0) {
                        break;
                    }
                    TimeUnit.NANOSECONDS.timedWait(this.f290045p, jNanoTime2);
                }
                z10 = this.f290043n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // io.grpc.a1
    public com.google.common.util.concurrent.t1<io.grpc.v0.j> i() {
        io.grpc.v0.j.a aVar = new io.grpc.v0.j.a();
        List<io.grpc.a1<io.grpc.v0.l>> listE = this.f290044o.e();
        if (listE != null) {
            aVar.a(listE);
        }
        this.f290053x.e(aVar);
        com.google.common.util.concurrent.m2 m2VarF = com.google.common.util.concurrent.m2.F();
        m2VarF.B(aVar.b());
        return m2VarF;
    }

    @Override // io.grpc.i2
    public List<io.grpc.t2> j() {
        return this.f290034e.a();
    }

    @Override // io.grpc.i2
    public List<SocketAddress> k() {
        List<SocketAddress> listS;
        synchronized (this.f290045p) {
            try {
                com.google.common.base.j0.h0(this.f290039j, "Not started");
                com.google.common.base.j0.h0(!this.f290043n, "Already terminated");
                listS = S();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listS;
    }

    @Override // io.grpc.i2
    public List<io.grpc.t2> l() {
        return Collections.unmodifiableList(this.f290035f.a());
    }

    @Override // io.grpc.i2
    public int m() {
        synchronized (this.f290045p) {
            try {
                com.google.common.base.j0.h0(this.f290039j, "Not started");
                com.google.common.base.j0.h0(!this.f290043n, "Already terminated");
                for (SocketAddress socketAddress : this.f290044o.c()) {
                    if (socketAddress instanceof InetSocketAddress) {
                        return ((InetSocketAddress) socketAddress).getPort();
                    }
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.i2
    public List<io.grpc.t2> n() {
        List<io.grpc.t2> listA = this.f290035f.a();
        if (listA.isEmpty()) {
            return this.f290034e.a();
        }
        List<io.grpc.t2> listA2 = this.f290034e.a();
        ArrayList arrayList = new ArrayList(listA2.size() + listA.size());
        arrayList.addAll(listA2);
        arrayList.addAll(listA);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // io.grpc.i2
    public boolean o() {
        boolean z10;
        synchronized (this.f290045p) {
            try {
                z10 = this.f290040k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // io.grpc.i2
    public boolean p() {
        boolean z10;
        synchronized (this.f290045p) {
            try {
                z10 = this.f290043n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public String toString() {
        return com.google.common.base.b0.c(this).e("logId", this.f290031b.e()).f("transportServer", this.f290044o).toString();
    }
}
