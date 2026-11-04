package io.grpc.internal;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
final class r<ReqT, RespT> extends io.grpc.k<ReqT, RespT> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Logger f289737t = Logger.getLogger(r.class.getName());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final byte[] f289738u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final double f289739v = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.w1<ReqT, RespT> f289740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.perfmark.e f289741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f289742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f289743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o f289744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.grpc.w f289745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile ScheduledFuture<?> f289746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f289747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private io.grpc.e f289748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s f289749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f289750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f289751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f289752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e f289753n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ScheduledExecutorService f289755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f289756q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r<ReqT, RespT>.f f289754o = new f();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private io.grpc.a0 f289757r = io.grpc.a0.c();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private io.grpc.t f289758s = io.grpc.t.a();

    class b extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.grpc.k.a f289759b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.grpc.k.a aVar) {
            super(r.this.f289745f);
            this.f289759b = aVar;
        }

        @Override // io.grpc.internal.a0
        public void a() {
            r rVar = r.this;
            rVar.w(this.f289759b, io.grpc.x.b(rVar.f289745f), new io.grpc.v1());
        }
    }

    class c extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.grpc.k.a f289761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f289762c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(io.grpc.k.a aVar, String str) {
            super(r.this.f289745f);
            this.f289761b = aVar;
            this.f289762c = str;
        }

        @Override // io.grpc.internal.a0
        public void a() {
            r.this.w(this.f289761b, io.grpc.y2.f291464s.u(String.format("Unable to find compressor by name %s", this.f289762c)), new io.grpc.v1());
        }
    }

    private class d implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.k.a<RespT> f289764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.grpc.y2 f289765b;

        final class a extends a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.perfmark.b f289767b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.grpc.v1 f289768c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(io.perfmark.b bVar, io.grpc.v1 v1Var) {
                super(r.this.f289745f);
                this.f289767b = bVar;
                this.f289768c = v1Var;
            }

            private void b() {
                if (d.this.f289765b != null) {
                    return;
                }
                try {
                    d.this.f289764a.b(this.f289768c);
                } catch (Throwable th2) {
                    d.this.k(io.grpc.y2.f291451f.t(th2).u("Failed to read headers"));
                }
            }

            @Override // io.grpc.internal.a0
            public void a() {
                io.perfmark.f fVarZ = io.perfmark.c.z("ClientCall$Listener.headersRead");
                try {
                    io.perfmark.c.a(r.this.f289741b);
                    io.perfmark.c.n(this.f289767b);
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

        final class b extends a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.perfmark.b f289770b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k3.a f289771c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(io.perfmark.b bVar, k3.a aVar) {
                super(r.this.f289745f);
                this.f289770b = bVar;
                this.f289771c = aVar;
            }

            private void b() {
                if (d.this.f289765b != null) {
                    v0.e(this.f289771c);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f289771c.next();
                        if (next == null) {
                            return;
                        }
                        try {
                            d.this.f289764a.c(r.this.f289740a.s(next));
                            next.close();
                        } catch (Throwable th2) {
                            v0.f(next);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        v0.e(this.f289771c);
                        d.this.k(io.grpc.y2.f291451f.t(th3).u("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // io.grpc.internal.a0
            public void a() {
                io.perfmark.f fVarZ = io.perfmark.c.z("ClientCall$Listener.messagesAvailable");
                try {
                    io.perfmark.c.a(r.this.f289741b);
                    io.perfmark.c.n(this.f289770b);
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
            final /* synthetic */ io.perfmark.b f289773b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.grpc.y2 f289774c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ io.grpc.v1 f289775d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(io.perfmark.b bVar, io.grpc.y2 y2Var, io.grpc.v1 v1Var) {
                super(r.this.f289745f);
                this.f289773b = bVar;
                this.f289774c = y2Var;
                this.f289775d = v1Var;
            }

            private void b() {
                io.grpc.y2 y2Var = this.f289774c;
                io.grpc.v1 v1Var = this.f289775d;
                if (d.this.f289765b != null) {
                    y2Var = d.this.f289765b;
                    v1Var = new io.grpc.v1();
                }
                r.this.f289750k = true;
                try {
                    d dVar = d.this;
                    r.this.w(dVar.f289764a, y2Var, v1Var);
                    r.this.D();
                    r.this.f289744e.b(y2Var.r());
                } catch (Throwable th2) {
                    r.this.D();
                    r.this.f289744e.b(y2Var.r());
                    throw th2;
                }
            }

            @Override // io.grpc.internal.a0
            public void a() {
                io.perfmark.f fVarZ = io.perfmark.c.z("ClientCall$Listener.onClose");
                try {
                    io.perfmark.c.a(r.this.f289741b);
                    io.perfmark.c.n(this.f289773b);
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

        /* JADX INFO: renamed from: io.grpc.internal.r$d$d, reason: collision with other inner class name */
        final class C1974d extends a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.perfmark.b f289777b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1974d(io.perfmark.b bVar) {
                super(r.this.f289745f);
                this.f289777b = bVar;
            }

            private void b() {
                if (d.this.f289765b != null) {
                    return;
                }
                try {
                    d.this.f289764a.d();
                } catch (Throwable th2) {
                    d.this.k(io.grpc.y2.f291451f.t(th2).u("Failed to call onReady."));
                }
            }

            @Override // io.grpc.internal.a0
            public void a() {
                io.perfmark.f fVarZ = io.perfmark.c.z("ClientCall$Listener.onReady");
                try {
                    io.perfmark.c.a(r.this.f289741b);
                    io.perfmark.c.n(this.f289777b);
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

        public d(io.grpc.k.a<RespT> aVar) {
            this.f289764a = (io.grpc.k.a) com.google.common.base.j0.F(aVar, "observer");
        }

        private void j(io.grpc.y2 y2Var, t.a aVar, io.grpc.v1 v1Var) {
            io.grpc.y yVarX = r.this.x();
            if (y2Var.p() == io.grpc.y2.b.CANCELLED && yVarX != null && yVarX.n()) {
                b1 b1Var = new b1();
                r.this.f289749j.t(b1Var);
                y2Var = io.grpc.y2.f291454i.g("ClientCall was cancelled at or after deadline. " + b1Var);
                v1Var = new io.grpc.v1();
            }
            r.this.f289742c.execute(new c(io.perfmark.c.o(), y2Var, v1Var));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(io.grpc.y2 y2Var) {
            this.f289765b = y2Var;
            r.this.f289749j.a(y2Var);
        }

        @Override // io.grpc.internal.k3
        public void a(k3.a aVar) {
            io.perfmark.f fVarZ = io.perfmark.c.z("ClientStreamListener.messagesAvailable");
            try {
                io.perfmark.c.a(r.this.f289741b);
                r.this.f289742c.execute(new b(io.perfmark.c.o(), aVar));
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

        @Override // io.grpc.internal.t
        public void c(io.grpc.v1 v1Var) {
            io.perfmark.f fVarZ = io.perfmark.c.z("ClientStreamListener.headersRead");
            try {
                io.perfmark.c.a(r.this.f289741b);
                r.this.f289742c.execute(new a(io.perfmark.c.o(), v1Var));
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
            if (r.this.f289740a.l().k()) {
                return;
            }
            io.perfmark.f fVarZ = io.perfmark.c.z("ClientStreamListener.onReady");
            try {
                io.perfmark.c.a(r.this.f289741b);
                r.this.f289742c.execute(new C1974d(io.perfmark.c.o()));
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

        @Override // io.grpc.internal.t
        public void f(io.grpc.y2 y2Var, t.a aVar, io.grpc.v1 v1Var) {
            io.perfmark.f fVarZ = io.perfmark.c.z("ClientStreamListener.closed");
            try {
                io.perfmark.c.a(r.this.f289741b);
                j(y2Var, aVar, v1Var);
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

    interface e {
        s a(io.grpc.w1<?, ?> w1Var, io.grpc.e eVar, io.grpc.v1 v1Var, io.grpc.w wVar);
    }

    private final class f implements io.grpc.w.g {
        private f() {
        }

        @Override // io.grpc.w.g
        public void a(io.grpc.w wVar) {
            r.this.f289749j.a(io.grpc.x.b(wVar));
        }
    }

    private class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f289780a;

        g(long j10) {
            this.f289780a = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b1 b1Var = new b1();
            r.this.f289749j.t(b1Var);
            long jAbs = Math.abs(this.f289780a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit.toNanos(1L);
            long jAbs2 = Math.abs(this.f289780a) % timeUnit.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deadline exceeded after ");
            if (this.f289780a < 0) {
                sb2.append(org.apache.commons.codec.language.l.f335457d);
            }
            sb2.append(nanos);
            Locale locale = Locale.US;
            sb2.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
            sb2.append("s. ");
            Long l10 = (Long) r.this.f289748i.h(io.grpc.n.f290181a);
            sb2.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(l10 == null ? 0.0d : l10.longValue() / r.f289739v)));
            sb2.append(b1Var);
            r.this.f289749j.a(io.grpc.y2.f291454i.g(sb2.toString()));
        }
    }

    r(io.grpc.w1<ReqT, RespT> w1Var, Executor executor, io.grpc.e eVar, e eVar2, ScheduledExecutorService scheduledExecutorService, o oVar, @fj.h io.grpc.x0 x0Var) {
        this.f289740a = w1Var;
        io.perfmark.e eVarI = io.perfmark.c.i(w1Var.f(), System.identityHashCode(this));
        this.f289741b = eVarI;
        int i10 = 3 | 1;
        if (executor == com.google.common.util.concurrent.a2.c()) {
            this.f289742c = new s2();
            this.f289743d = true;
        } else {
            this.f289742c = new t2(executor);
            this.f289743d = false;
        }
        this.f289744e = oVar;
        this.f289745f = io.grpc.w.g();
        this.f289747h = w1Var.l() == io.grpc.w1.d.UNARY || w1Var.l() == io.grpc.w1.d.SERVER_STREAMING;
        this.f289748i = eVar;
        this.f289753n = eVar2;
        this.f289755p = scheduledExecutorService;
        io.perfmark.c.k("ClientCall.<init>", eVarI);
    }

    private static void A(io.grpc.y yVar, @fj.h io.grpc.y yVar2, @fj.h io.grpc.y yVar3) {
        Logger logger = f289737t;
        if (logger.isLoggable(Level.FINE) && yVar != null && yVar.equals(yVar2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jMax = Math.max(0L, yVar.r(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb2 = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jMax)));
            if (yVar3 == null) {
                sb2.append(" Explicit call timeout was not set.");
            } else {
                sb2.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(yVar3.r(timeUnit))));
            }
            logger.fine(sb2.toString());
        }
    }

    @fj.h
    private static io.grpc.y B(@fj.h io.grpc.y yVar, @fj.h io.grpc.y yVar2) {
        if (yVar == null) {
            return yVar2;
        }
        return yVar2 == null ? yVar : yVar.o(yVar2);
    }

    @com.google.common.annotations.e
    static void C(io.grpc.v1 v1Var, io.grpc.a0 a0Var, io.grpc.s sVar, boolean z10) {
        v1Var.j(v0.f289904i);
        io.grpc.v1.i<String> iVar = v0.f289900e;
        v1Var.j(iVar);
        if (sVar != io.grpc.p.b.f290837a) {
            v1Var.w(iVar, sVar.B());
        }
        io.grpc.v1.i<byte[]> iVar2 = v0.f289901f;
        v1Var.j(iVar2);
        byte[] bArrA = io.grpc.y0.a(a0Var);
        if (bArrA.length != 0) {
            v1Var.w(iVar2, bArrA);
        }
        v1Var.j(v0.f289902g);
        io.grpc.v1.i<byte[]> iVar3 = v0.f289903h;
        v1Var.j(iVar3);
        if (z10) {
            v1Var.w(iVar3, f289738u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.f289745f.E(this.f289754o);
        ScheduledFuture<?> scheduledFuture = this.f289746g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    private void E(ReqT reqt) {
        com.google.common.base.j0.h0(this.f289749j != null, "Not started");
        com.google.common.base.j0.h0(!this.f289751l, "call was cancelled");
        com.google.common.base.j0.h0(!this.f289752m, "call was half-closed");
        try {
            s sVar = this.f289749j;
            if (sVar instanceof m2) {
                ((m2) sVar).u0(reqt);
            } else {
                sVar.i(this.f289740a.u(reqt));
            }
            if (this.f289747h) {
                return;
            }
            this.f289749j.flush();
        } catch (Error e10) {
            this.f289749j.a(io.grpc.y2.f291451f.u("Client sendMessage() failed with Error"));
            throw e10;
        } catch (RuntimeException e11) {
            this.f289749j.a(io.grpc.y2.f291451f.t(e11).u("Failed to stream message"));
        }
    }

    private ScheduledFuture<?> I(io.grpc.y yVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jR = yVar.r(timeUnit);
        return this.f289755p.schedule(new k1(new g(jR)), jR, timeUnit);
    }

    private void J(io.grpc.k.a<RespT> aVar, io.grpc.v1 v1Var) {
        io.grpc.s sVarB;
        com.google.common.base.j0.h0(this.f289749j == null, "Already started");
        com.google.common.base.j0.h0(!this.f289751l, "call was cancelled");
        com.google.common.base.j0.F(aVar, "observer");
        com.google.common.base.j0.F(v1Var, "headers");
        if (this.f289745f.q()) {
            this.f289749j = y1.f290145a;
            this.f289742c.execute(new b(aVar));
            return;
        }
        u();
        String strB = this.f289748i.b();
        if (strB != null) {
            sVarB = this.f289758s.b(strB);
            if (sVarB == null) {
                this.f289749j = y1.f290145a;
                this.f289742c.execute(new c(aVar, strB));
                return;
            }
        } else {
            sVarB = io.grpc.p.b.f290837a;
        }
        C(v1Var, this.f289757r, sVarB, this.f289756q);
        io.grpc.y yVarX = x();
        if (yVarX == null || !yVarX.n()) {
            A(yVarX, this.f289745f.o(), this.f289748i.d());
            this.f289749j = this.f289753n.a(this.f289740a, this.f289748i, v1Var, this.f289745f);
        } else {
            io.grpc.n[] nVarArrH = v0.h(this.f289748i, v1Var, 0, false);
            String str = z(this.f289748i.d(), this.f289745f.o()) ? "CallOptions" : "Context";
            Long l10 = (Long) this.f289748i.h(io.grpc.n.f290181a);
            double dR = yVarX.r(TimeUnit.NANOSECONDS);
            double d10 = f289739v;
            this.f289749j = new i0(io.grpc.y2.f291454i.u(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(dR / d10), Double.valueOf(l10 == null ? 0.0d : l10.longValue() / d10))), nVarArrH);
        }
        if (this.f289743d) {
            this.f289749j.j();
        }
        if (this.f289748i.a() != null) {
            this.f289749j.s(this.f289748i.a());
        }
        if (this.f289748i.f() != null) {
            this.f289749j.d(this.f289748i.f().intValue());
        }
        if (this.f289748i.g() != null) {
            this.f289749j.e(this.f289748i.g().intValue());
        }
        if (yVarX != null) {
            this.f289749j.u(yVarX);
        }
        this.f289749j.c(sVarB);
        boolean z10 = this.f289756q;
        if (z10) {
            this.f289749j.k(z10);
        }
        this.f289749j.q(this.f289757r);
        this.f289744e.c();
        this.f289749j.v(new d(aVar));
        this.f289745f.a(this.f289754o, com.google.common.util.concurrent.a2.c());
        if (yVarX != null && !yVarX.equals(this.f289745f.o()) && this.f289755p != null) {
            this.f289746g = I(yVarX);
        }
        if (this.f289750k) {
            D();
        }
    }

    private void u() {
        q1.b bVar = (q1.b) this.f289748i.h(q1.b.f289712g);
        if (bVar == null) {
            return;
        }
        Long l10 = bVar.f289713a;
        if (l10 != null) {
            io.grpc.y yVarB = io.grpc.y.b(l10.longValue(), TimeUnit.NANOSECONDS);
            io.grpc.y yVarD = this.f289748i.d();
            if (yVarD == null || yVarB.compareTo(yVarD) < 0) {
                this.f289748i = this.f289748i.p(yVarB);
            }
        }
        Boolean bool = bVar.f289714b;
        if (bool != null) {
            this.f289748i = bool.booleanValue() ? this.f289748i.w() : this.f289748i.x();
        }
        if (bVar.f289715c != null) {
            Integer numF = this.f289748i.f();
            if (numF != null) {
                this.f289748i = this.f289748i.s(Math.min(numF.intValue(), bVar.f289715c.intValue()));
            } else {
                this.f289748i = this.f289748i.s(bVar.f289715c.intValue());
            }
        }
        if (bVar.f289716d != null) {
            Integer numG = this.f289748i.g();
            if (numG != null) {
                this.f289748i = this.f289748i.t(Math.min(numG.intValue(), bVar.f289716d.intValue()));
            } else {
                this.f289748i = this.f289748i.t(bVar.f289716d.intValue());
            }
        }
    }

    private void v(@fj.h String str, @fj.h Throwable th2) {
        if (str == null && th2 == null) {
            th2 = new CancellationException("Cancelled without a message or cause");
            f289737t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th2);
        }
        if (this.f289751l) {
            return;
        }
        this.f289751l = true;
        try {
            if (this.f289749j != null) {
                io.grpc.y2 y2Var = io.grpc.y2.f291451f;
                io.grpc.y2 y2VarU = str != null ? y2Var.u(str) : y2Var.u("Call cancelled without message");
                if (th2 != null) {
                    y2VarU = y2VarU.t(th2);
                }
                this.f289749j.a(y2VarU);
            }
        } finally {
            D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(io.grpc.k.a<RespT> aVar, io.grpc.y2 y2Var, io.grpc.v1 v1Var) {
        aVar.a(y2Var, v1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fj.h
    public io.grpc.y x() {
        return B(this.f289748i.d(), this.f289745f.o());
    }

    private void y() {
        com.google.common.base.j0.h0(this.f289749j != null, "Not started");
        com.google.common.base.j0.h0(!this.f289751l, "call was cancelled");
        com.google.common.base.j0.h0(!this.f289752m, "call already half-closed");
        this.f289752m = true;
        this.f289749j.o();
    }

    private static boolean z(@fj.h io.grpc.y yVar, @fj.h io.grpc.y yVar2) {
        if (yVar == null) {
            return false;
        }
        if (yVar2 == null) {
            return true;
        }
        return yVar.l(yVar2);
    }

    r<ReqT, RespT> F(io.grpc.t tVar) {
        this.f289758s = tVar;
        return this;
    }

    r<ReqT, RespT> G(io.grpc.a0 a0Var) {
        this.f289757r = a0Var;
        return this;
    }

    r<ReqT, RespT> H(boolean z10) {
        this.f289756q = z10;
        return this;
    }

    @Override // io.grpc.k
    public void a(@fj.h String str, @fj.h Throwable th2) {
        io.perfmark.f fVarZ = io.perfmark.c.z("ClientCall.cancel");
        try {
            io.perfmark.c.a(this.f289741b);
            v(str, th2);
            if (fVarZ != null) {
                fVarZ.close();
            }
        } catch (Throwable th3) {
            if (fVarZ != null) {
                try {
                    fVarZ.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.grpc.k
    public io.grpc.a b() {
        s sVar = this.f289749j;
        return sVar != null ? sVar.getAttributes() : io.grpc.a.f288673c;
    }

    @Override // io.grpc.k
    public void c() {
        io.perfmark.f fVarZ = io.perfmark.c.z("ClientCall.halfClose");
        try {
            io.perfmark.c.a(this.f289741b);
            y();
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

    @Override // io.grpc.k
    public boolean d() {
        if (this.f289752m) {
            return false;
        }
        return this.f289749j.isReady();
    }

    @Override // io.grpc.k
    public void e(int i10) {
        io.perfmark.f fVarZ = io.perfmark.c.z("ClientCall.request");
        try {
            io.perfmark.c.a(this.f289741b);
            com.google.common.base.j0.h0(this.f289749j != null, "Not started");
            com.google.common.base.j0.e(i10 >= 0, "Number requested must be non-negative");
            this.f289749j.b(i10);
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

    @Override // io.grpc.k
    public void f(ReqT reqt) {
        io.perfmark.f fVarZ = io.perfmark.c.z("ClientCall.sendMessage");
        try {
            io.perfmark.c.a(this.f289741b);
            E(reqt);
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

    @Override // io.grpc.k
    public void g(boolean z10) {
        com.google.common.base.j0.h0(this.f289749j != null, "Not started");
        this.f289749j.g(z10);
    }

    @Override // io.grpc.k
    public void h(io.grpc.k.a<RespT> aVar, io.grpc.v1 v1Var) {
        io.perfmark.f fVarZ = io.perfmark.c.z("ClientCall.start");
        try {
            io.perfmark.c.a(this.f289741b);
            J(aVar, v1Var);
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

    public String toString() {
        return com.google.common.base.b0.c(this).f("method", this.f289740a).toString();
    }
}
