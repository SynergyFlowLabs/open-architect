package io.grpc.internal;

import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
final class n1 extends io.grpc.r1 implements io.grpc.a1<io.grpc.v0.b> {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @com.google.common.annotations.e
    static final Logger f289476n0 = Logger.getLogger(n1.class.getName());

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @com.google.common.annotations.e
    static final Pattern f289477o0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final long f289478p0 = -1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    static final long f289479q0 = 5;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @com.google.common.annotations.e
    static final io.grpc.y2 f289480r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @com.google.common.annotations.e
    static final io.grpc.y2 f289481s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @com.google.common.annotations.e
    static final io.grpc.y2 f289482t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final q1 f289483u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final io.grpc.x0 f289484v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final io.grpc.k<Object, Object> f289485w0;
    private final io.grpc.f A;
    private final List<io.grpc.o> B;

    @fj.h
    private final String C;
    private io.grpc.x1 D;
    private boolean E;

    @fj.h
    private u F;

    @fj.h
    private volatile io.grpc.o1.k G;
    private boolean H;
    private final Set<e1> I;

    @fj.h
    private Collection<w.g<?, ?>> J;
    private final Object K;
    private final Set<a2> L;
    private final d0 M;
    private final a0 N;
    private final AtomicBoolean O;
    private boolean P;
    private boolean Q;
    private volatile boolean R;
    private final CountDownLatch S;
    private final io.grpc.internal.o.b T;
    private final io.grpc.internal.o U;
    private final io.grpc.internal.q V;
    private final io.grpc.h W;
    private final io.grpc.v0 X;
    private final w Y;
    private x Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.c1 f289486a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private q1 f289487a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f289488b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @fj.h
    private final q1 f289489b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    private final String f289490c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f289491c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.grpc.z1 f289492d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final boolean f289493d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.grpc.x1.b f289494e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final m2.u f289495e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.grpc.internal.j f289496f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final long f289497f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.grpc.internal.v f289498g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final long f289499g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @fj.h
    private final io.grpc.g f289500h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final boolean f289501h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.grpc.internal.v f289502i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final io.grpc.y.c f289503i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.grpc.internal.v f289504j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final r1.a f289505j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final y f289506k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @com.google.common.annotations.e
    final a1<Object> f289507k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Executor f289508l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final o f289509l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z1<? extends Executor> f289510m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final l2 f289511m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final z1<? extends Executor> f289512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r f289513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r f289514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final n3 f289515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f289516r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @com.google.common.annotations.e
    final io.grpc.c3 f289517s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f289518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final io.grpc.a0 f289519u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final io.grpc.t f289520v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final com.google.common.base.s0<com.google.common.base.q0> f289521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final long f289522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final io.grpc.internal.y f289523y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final io.grpc.internal.k.a f289524z;

    class a extends io.grpc.x0 {
        a() {
        }

        @Override // io.grpc.x0
        public io.grpc.x0.b a(io.grpc.o1.h hVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n1.this.O0(true);
        }
    }

    final class c implements io.grpc.internal.o.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n3 f289530a;

        c(n3 n3Var) {
            this.f289530a = n3Var;
        }

        @Override // io.grpc.internal.o.b
        public io.grpc.internal.o k() {
            return new io.grpc.internal.o(this.f289530a);
        }
    }

    final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f289532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.grpc.u f289533b;

        d(Runnable runnable, io.grpc.u uVar) {
            this.f289532a = runnable;
            this.f289533b = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            n1.this.f289523y.c(this.f289532a, n1.this.f289508l, this.f289533b);
        }
    }

    final class e extends io.grpc.o1.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.o1.g f289535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f289536b;

        e(Throwable th2) {
            this.f289536b = th2;
            this.f289535a = io.grpc.o1.g.e(io.grpc.y2.f291464s.u("Panic! This is a bug!").t(th2));
        }

        @Override // io.grpc.o1.k
        public io.grpc.o1.g a(io.grpc.o1.h hVar) {
            return this.f289535a;
        }

        public String toString() {
            return com.google.common.base.b0.b(e.class).f("panicPickResult", this.f289535a).toString();
        }
    }

    final class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!n1.this.O.get() && n1.this.F != null) {
                n1.this.O0(false);
                n1.this.P0();
            }
        }
    }

    final class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n1.this.Q0();
            if (n1.this.G != null) {
                n1.this.G.b();
            }
            if (n1.this.F != null) {
                n1.this.F.f289565a.e();
            }
        }
    }

    final class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n1.this.O.get()) {
                return;
            }
            if (n1.this.E) {
                n1.this.a1();
            }
            Iterator it = n1.this.I.iterator();
            while (it.hasNext()) {
                ((e1) it.next()).a0();
            }
            Iterator it2 = n1.this.L.iterator();
            while (it2.hasNext()) {
                ((a2) it2.next()).p();
            }
        }
    }

    final class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n1.this.W.a(io.grpc.h.a.INFO, "Entering SHUTDOWN state");
            n1.this.f289523y.b(io.grpc.u.SHUTDOWN);
        }
    }

    final class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n1.this.P) {
                return;
            }
            n1.this.P = true;
            n1.this.X0();
        }
    }

    final class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.m2 f289543a;

        k(com.google.common.util.concurrent.m2 m2Var) {
            this.f289543a = m2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            io.grpc.v0.b.a aVar = new io.grpc.v0.b.a();
            n1.this.U.d(aVar);
            n1.this.V.g(aVar);
            aVar.j(n1.this.f289488b).h(n1.this.f289523y.a());
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(n1.this.I);
            arrayList.addAll(n1.this.L);
            aVar.i(arrayList);
            this.f289543a.B(aVar.a());
        }
    }

    class l implements Thread.UncaughtExceptionHandler {
        l() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            n1.f289476n0.log(Level.SEVERE, "[" + n1.this.c() + "] Uncaught exception in the SynchronizationContext. Panic!", th2);
            n1.this.Z0(th2);
        }
    }

    class m extends r0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f289546b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(io.grpc.x1 x1Var, String str) {
            super(x1Var);
            this.f289546b = str;
        }

        @Override // io.grpc.internal.r0, io.grpc.x1
        public String a() {
            return this.f289546b;
        }
    }

    class n extends io.grpc.k<Object, Object> {
        n() {
        }

        @Override // io.grpc.k
        public void a(String str, Throwable th2) {
        }

        @Override // io.grpc.k
        public void c() {
        }

        @Override // io.grpc.k
        public boolean d() {
            return false;
        }

        @Override // io.grpc.k
        public void e(int i10) {
        }

        @Override // io.grpc.k
        public void f(Object obj) {
        }

        @Override // io.grpc.k
        public void h(io.grpc.k.a<Object> aVar, io.grpc.v1 v1Var) {
        }
    }

    private final class o implements io.grpc.internal.r.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile m2.e0 f289547a;

        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                n1.this.Q0();
            }
        }

        final class b<ReqT> extends m2<ReqT> {
            final /* synthetic */ io.grpc.w1 E;
            final /* synthetic */ io.grpc.v1 F;
            final /* synthetic */ io.grpc.e G;
            final /* synthetic */ n2 H;
            final /* synthetic */ x0 I;
            final /* synthetic */ io.grpc.w J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(io.grpc.w1 w1Var, io.grpc.v1 v1Var, io.grpc.e eVar, n2 n2Var, x0 x0Var, io.grpc.w wVar) {
                super(w1Var, v1Var, n1.this.f289495e0, n1.this.f289497f0, n1.this.f289499g0, n1.this.R0(eVar), n1.this.f289502i.E0(), n2Var, x0Var, o.this.f289547a);
                this.E = w1Var;
                this.F = v1Var;
                this.G = eVar;
                this.H = n2Var;
                this.I = x0Var;
                this.J = wVar;
            }

            @Override // io.grpc.internal.m2
            io.grpc.internal.s p0(io.grpc.v1 v1Var, io.grpc.n.a aVar, int i10, boolean z10) {
                io.grpc.e eVarV = this.G.v(aVar);
                io.grpc.n[] nVarArrH = v0.h(eVarV, v1Var, i10, z10);
                io.grpc.internal.u uVarC = o.this.c(new g2(this.E, v1Var, eVarV));
                io.grpc.w wVarB = this.J.b();
                try {
                    io.grpc.internal.s sVarE = uVarC.e(this.E, v1Var, eVarV, nVarArrH);
                    this.J.j(wVarB);
                    return sVarE;
                } catch (Throwable th2) {
                    this.J.j(wVarB);
                    throw th2;
                }
            }

            @Override // io.grpc.internal.m2
            void q0() {
                n1.this.N.d(this);
            }

            @Override // io.grpc.internal.m2
            io.grpc.y2 r0() {
                return n1.this.N.a(this);
            }
        }

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public io.grpc.internal.u c(io.grpc.o1.h hVar) {
            io.grpc.o1.k kVar = n1.this.G;
            if (n1.this.O.get()) {
                return n1.this.M;
            }
            if (kVar == null) {
                n1.this.f289517s.execute(new a());
                return n1.this.M;
            }
            io.grpc.internal.u uVarN = v0.n(kVar.a(hVar), hVar.a().k());
            return uVarN != null ? uVarN : n1.this.M;
        }

        @Override // io.grpc.internal.r.e
        public io.grpc.internal.s a(io.grpc.w1<?, ?> w1Var, io.grpc.e eVar, io.grpc.v1 v1Var, io.grpc.w wVar) {
            if (n1.this.f289501h0) {
                q1.b bVar = (q1.b) eVar.h(q1.b.f289712g);
                return new b(w1Var, v1Var, eVar, bVar == null ? null : bVar.f289717e, bVar != null ? bVar.f289718f : null, wVar);
            }
            io.grpc.internal.u uVarC = c(new g2(w1Var, v1Var, eVar));
            io.grpc.w wVarB = wVar.b();
            try {
                return uVarC.e(w1Var, v1Var, eVar, v0.h(eVar, v1Var, 0, false));
            } finally {
                wVar.j(wVarB);
            }
        }

        /* synthetic */ o(n1 n1Var, a aVar) {
            this();
        }
    }

    static final class p<ReqT, RespT> extends io.grpc.h0<ReqT, RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.x0 f289550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.f f289551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Executor f289552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.grpc.w1<ReqT, RespT> f289553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final io.grpc.w f289554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private io.grpc.e f289555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private io.grpc.k<ReqT, RespT> f289556g;

        class a extends io.grpc.internal.a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.grpc.k.a f289557b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.grpc.y2 f289558c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(io.grpc.k.a aVar, io.grpc.y2 y2Var) {
                super(p.this.f289554e);
                this.f289557b = aVar;
                this.f289558c = y2Var;
            }

            @Override // io.grpc.internal.a0
            public void a() {
                this.f289557b.a(this.f289558c, new io.grpc.v1());
            }
        }

        p(io.grpc.x0 x0Var, io.grpc.f fVar, Executor executor, io.grpc.w1<ReqT, RespT> w1Var, io.grpc.e eVar) {
            this.f289550a = x0Var;
            this.f289551b = fVar;
            this.f289553d = w1Var;
            executor = eVar.e() != null ? eVar.e() : executor;
            this.f289552c = executor;
            this.f289555f = eVar.r(executor);
            this.f289554e = io.grpc.w.g();
        }

        private void k(io.grpc.k.a<RespT> aVar, io.grpc.y2 y2Var) {
            this.f289552c.execute(new a(aVar, y2Var));
        }

        @Override // io.grpc.h0, io.grpc.a2, io.grpc.k
        public void a(@fj.h String str, @fj.h Throwable th2) {
            io.grpc.k<ReqT, RespT> kVar = this.f289556g;
            if (kVar != null) {
                kVar.a(str, th2);
            }
        }

        @Override // io.grpc.h0, io.grpc.k
        public void h(io.grpc.k.a<RespT> aVar, io.grpc.v1 v1Var) {
            io.grpc.x0.b bVarA = this.f289550a.a(new g2(this.f289553d, v1Var, this.f289555f));
            io.grpc.y2 y2VarD = bVarA.d();
            if (!y2VarD.r()) {
                k(aVar, v0.s(y2VarD));
                this.f289556g = n1.f289485w0;
                return;
            }
            io.grpc.l lVarC = bVarA.c();
            q1.b bVarF = ((q1) bVarA.b()).f(this.f289553d);
            if (bVarF != null) {
                this.f289555f = this.f289555f.u(q1.b.f289712g, bVarF);
            }
            if (lVarC != null) {
                this.f289556g = lVarC.a(this.f289553d, this.f289555f, this.f289551b);
            } else {
                this.f289556g = this.f289551b.g(this.f289553d, this.f289555f);
            }
            this.f289556g.h(aVar, v1Var);
        }

        @Override // io.grpc.h0, io.grpc.a2
        protected io.grpc.k<ReqT, RespT> i() {
            return this.f289556g;
        }
    }

    private final class q implements r1.a {
        private q() {
        }

        @Override // io.grpc.internal.r1.a
        public void a() {
            com.google.common.base.j0.h0(n1.this.O.get(), "Channel must have been shut down");
            n1.this.Q = true;
            n1.this.d1(false);
            n1.this.X0();
            n1.this.Y0();
        }

        @Override // io.grpc.internal.r1.a
        public void b(io.grpc.y2 y2Var) {
            com.google.common.base.j0.h0(n1.this.O.get(), "Channel must have been shut down");
        }

        @Override // io.grpc.internal.r1.a
        public void c() {
        }

        @Override // io.grpc.internal.r1.a
        public void d(boolean z10) {
            n1 n1Var = n1.this;
            n1Var.f289507k0.e(n1Var.M, z10);
        }

        @Override // io.grpc.internal.r1.a
        public io.grpc.a e(io.grpc.a aVar) {
            return aVar;
        }

        /* synthetic */ q(n1 n1Var, a aVar) {
            this();
        }
    }

    @com.google.common.annotations.e
    static final class r implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z1<? extends Executor> f289561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Executor f289562b;

        r(z1<? extends Executor> z1Var) {
            this.f289561a = (z1) com.google.common.base.j0.F(z1Var, "executorPool");
        }

        synchronized Executor a() {
            try {
                if (this.f289562b == null) {
                    this.f289562b = (Executor) com.google.common.base.j0.V(this.f289561a.a(), "%s.getObject()", this.f289562b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f289562b;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a().execute(runnable);
        }

        synchronized void release() {
            try {
                Executor executor = this.f289562b;
                if (executor != null) {
                    this.f289562b = this.f289561a.b(executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final class s extends a1<Object> {
        private s() {
        }

        @Override // io.grpc.internal.a1
        protected void b() {
            n1.this.Q0();
        }

        @Override // io.grpc.internal.a1
        protected void c() {
            if (n1.this.O.get()) {
                return;
            }
            n1.this.b1();
        }

        /* synthetic */ s(n1 n1Var, a aVar) {
            this();
        }
    }

    private class t implements Runnable {
        private t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n1.this.F == null) {
                return;
            }
            n1.this.P0();
        }

        /* synthetic */ t(n1 n1Var, a aVar) {
            this();
        }
    }

    private final class u extends io.grpc.o1.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        io.grpc.internal.j.b f289565a;

        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a2 f289567a;

            a(a2 a2Var) {
                this.f289567a = a2Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (n1.this.Q) {
                    this.f289567a.q();
                }
                if (n1.this.R) {
                    return;
                }
                n1.this.L.add(this.f289567a);
            }
        }

        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                n1.this.a1();
            }
        }

        final class c extends e1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a2 f289570a;

            c(a2 a2Var) {
                this.f289570a = a2Var;
            }

            @Override // io.grpc.internal.e1.l
            void c(e1 e1Var, io.grpc.v vVar) {
                n1.this.V0(vVar);
                this.f289570a.w(vVar);
            }

            @Override // io.grpc.internal.e1.l
            void d(e1 e1Var) {
                n1.this.L.remove(this.f289570a);
                n1.this.X.D(e1Var);
                this.f289570a.x();
                n1.this.Y0();
            }
        }

        final class d extends io.grpc.f0<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final io.grpc.s1<?> f289572a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.grpc.g f289573b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f289574c;

            class a implements o1.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ u f289576a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ io.grpc.internal.v f289577b;

                a(u uVar, io.grpc.internal.v vVar) {
                    this.f289576a = uVar;
                    this.f289577b = vVar;
                }

                @Override // io.grpc.internal.o1.c
                public io.grpc.internal.v a() {
                    return this.f289577b;
                }
            }

            d(io.grpc.g gVar, String str) {
                io.grpc.d dVar;
                io.grpc.internal.v vVar;
                this.f289573b = gVar;
                this.f289574c = str;
                if (gVar instanceof f) {
                    vVar = n1.this.f289498g;
                    dVar = null;
                } else {
                    io.grpc.internal.v.b bVarP4 = n1.this.f289498g.p4(gVar);
                    if (bVarP4 == null) {
                        this.f289572a = io.grpc.n0.b(str, gVar);
                        return;
                    } else {
                        io.grpc.internal.v vVar2 = bVarP4.f289894a;
                        dVar = bVarP4.f289895b;
                        vVar = vVar2;
                    }
                }
                this.f289572a = new o1(str, gVar, dVar, new a(u.this, vVar), new o1.e(n1.this.f289494e.b())).j0(n1.this.f289492d);
            }

            @Override // io.grpc.f0
            protected io.grpc.s1<?> J() {
                return this.f289572a;
            }
        }

        final class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.o1.k f289579a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.grpc.u f289580b;

            e(io.grpc.o1.k kVar, io.grpc.u uVar) {
                this.f289579a = kVar;
                this.f289580b = uVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar = u.this;
                if (uVar != n1.this.F) {
                    return;
                }
                n1.this.f1(this.f289579a);
                if (this.f289580b != io.grpc.u.SHUTDOWN) {
                    n1.this.W.b(io.grpc.h.a.INFO, "Entering {0} state with picker: {1}", this.f289580b, this.f289579a);
                    n1.this.f289523y.b(this.f289580b);
                }
            }
        }

        final class f extends io.grpc.g {
            f() {
            }

            @Override // io.grpc.g
            public io.grpc.g a() {
                return this;
            }
        }

        private u() {
        }

        @Override // io.grpc.o1.f
        public io.grpc.r1 a(io.grpc.d0 d0Var, String str) {
            return b(Collections.singletonList(d0Var), str);
        }

        @Override // io.grpc.o1.f
        public io.grpc.r1 b(List<io.grpc.d0> list, String str) {
            com.google.common.base.j0.h0(!n1.this.R, "Channel is terminated");
            long jA = n1.this.f289515q.a();
            io.grpc.c1 c1VarB = io.grpc.c1.b("OobChannel", null);
            io.grpc.c1 c1VarB2 = io.grpc.c1.b("Subchannel-OOB", str);
            io.grpc.internal.q qVar = new io.grpc.internal.q(c1VarB, n1.this.f289516r, jA, "OobChannel for " + list);
            z1 z1Var = n1.this.f289512n;
            ScheduledExecutorService scheduledExecutorServiceE0 = n1.this.f289504j.E0();
            n1 n1Var = n1.this;
            a2 a2Var = new a2(str, z1Var, scheduledExecutorServiceE0, n1Var.f289517s, n1Var.T.k(), qVar, n1.this.X, n1.this.f289515q);
            io.grpc.internal.q qVar2 = n1.this.V;
            io.grpc.v0.c.b.a aVarC = new io.grpc.v0.c.b.a().c("Child OobChannel created");
            io.grpc.v0.c.b.EnumC1995b enumC1995b = io.grpc.v0.c.b.EnumC1995b.CT_INFO;
            qVar2.e(aVarC.d(enumC1995b).f(jA).b(a2Var).a());
            io.grpc.internal.q qVar3 = new io.grpc.internal.q(c1VarB2, n1.this.f289516r, jA, "Subchannel for " + list);
            e1 e1Var = new e1(list, str, n1.this.C, n1.this.f289524z, n1.this.f289504j, n1.this.f289504j.E0(), n1.this.f289521w, n1.this.f289517s, new c(a2Var), n1.this.X, n1.this.T.k(), qVar3, c1VarB2, new io.grpc.internal.p(qVar3, n1.this.f289515q), n1.this.B);
            qVar.e(new io.grpc.v0.c.b.a().c("Child Subchannel created").d(enumC1995b).f(jA).e(e1Var).a());
            n1.this.X.h(a2Var);
            n1.this.X.h(e1Var);
            a2Var.y(e1Var);
            n1.this.f289517s.execute(new a(a2Var));
            return a2Var;
        }

        @Override // io.grpc.o1.f
        @Deprecated
        public io.grpc.s1<?> d(String str) {
            return e(str, new f()).A(g());
        }

        @Override // io.grpc.o1.f
        public io.grpc.s1<?> e(String str, io.grpc.g gVar) {
            com.google.common.base.j0.F(gVar, "channelCreds");
            com.google.common.base.j0.h0(!n1.this.R, "Channel is terminated");
            return new d(gVar, str).k(n1.this.f289508l).z(n1.this.f289514p.a()).x(n1.this.f289516r).C(n1.this.f289494e.e()).I(n1.this.C);
        }

        @Override // io.grpc.o1.f
        public String g() {
            return n1.this.b();
        }

        @Override // io.grpc.o1.f
        public io.grpc.h i() {
            return n1.this.W;
        }

        @Override // io.grpc.o1.f
        public io.grpc.x1.b j() {
            return n1.this.f289494e;
        }

        @Override // io.grpc.o1.f
        public io.grpc.z1 k() {
            return n1.this.f289492d;
        }

        @Override // io.grpc.o1.f
        public ScheduledExecutorService l() {
            return n1.this.f289506k;
        }

        @Override // io.grpc.o1.f
        public io.grpc.c3 m() {
            return n1.this.f289517s;
        }

        @Override // io.grpc.o1.f
        public io.grpc.g n() {
            return n1.this.f289500h == null ? new f() : n1.this.f289500h;
        }

        @Override // io.grpc.o1.f
        public void p() {
            n1.this.f289517s.e();
            n1.this.f289517s.execute(new b());
        }

        @Override // io.grpc.o1.f
        public void q(io.grpc.u uVar, io.grpc.o1.k kVar) {
            n1.this.f289517s.e();
            com.google.common.base.j0.F(uVar, "newState");
            com.google.common.base.j0.F(kVar, "newPicker");
            n1.this.f289517s.execute(new e(kVar, uVar));
        }

        @Override // io.grpc.o1.f
        public void r(io.grpc.r1 r1Var, io.grpc.d0 d0Var) {
            s(r1Var, Collections.singletonList(d0Var));
        }

        @Override // io.grpc.o1.f
        public void s(io.grpc.r1 r1Var, List<io.grpc.d0> list) {
            com.google.common.base.j0.e(r1Var instanceof a2, "channel must have been returned from createOobChannel");
            ((a2) r1Var).z(list);
        }

        @Override // io.grpc.o1.f
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public io.grpc.internal.e f(io.grpc.o1.b bVar) {
            n1.this.f289517s.e();
            com.google.common.base.j0.h0(!n1.this.Q, "Channel is being terminated");
            return n1.this.new z(bVar);
        }

        /* synthetic */ u(n1 n1Var, a aVar) {
            this();
        }
    }

    final class v extends io.grpc.x1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final u f289583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.grpc.x1 f289584b;

        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.y2 f289586a;

            a(io.grpc.y2 y2Var) {
                this.f289586a = y2Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.e(this.f289586a);
            }
        }

        final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.x1.g f289588a;

            b(io.grpc.x1.g gVar) {
                this.f289588a = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                q1 q1Var;
                if (n1.this.D != v.this.f289584b) {
                    return;
                }
                List<io.grpc.d0> listA = this.f289588a.a();
                io.grpc.h hVar = n1.this.W;
                io.grpc.h.a aVar = io.grpc.h.a.DEBUG;
                hVar.b(aVar, "Resolved address: {0}, config={1}", listA, this.f289588a.b());
                x xVar = n1.this.Z;
                x xVar2 = x.SUCCESS;
                if (xVar != xVar2) {
                    n1.this.W.b(io.grpc.h.a.INFO, "Address resolved: {0}", listA);
                    n1.this.Z = xVar2;
                }
                io.grpc.x1.c cVarC = this.f289588a.c();
                p2.b bVar = (p2.b) this.f289588a.b().b(p2.f289688e);
                io.grpc.x0 x0Var = (io.grpc.x0) this.f289588a.b().b(io.grpc.x0.f291408a);
                q1 q1Var2 = (cVarC == null || cVarC.c() == null) ? null : (q1) cVarC.c();
                io.grpc.y2 y2VarD = cVarC != null ? cVarC.d() : null;
                if (n1.this.f289493d0) {
                    if (q1Var2 != null) {
                        if (x0Var != null) {
                            n1.this.Y.p(x0Var);
                            if (q1Var2.c() != null) {
                                n1.this.W.a(aVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            n1.this.Y.p(q1Var2.c());
                        }
                    } else if (n1.this.f289489b0 != null) {
                        q1Var2 = n1.this.f289489b0;
                        n1.this.Y.p(q1Var2.c());
                        n1.this.W.a(io.grpc.h.a.INFO, "Received no service config, using default service config");
                    } else if (y2VarD == null) {
                        q1Var2 = n1.f289483u0;
                        n1.this.Y.p(null);
                    } else {
                        if (!n1.this.f289491c0) {
                            n1.this.W.a(io.grpc.h.a.INFO, "Fallback to error due to invalid first service config without default config");
                            v.this.b(cVarC.d());
                            if (bVar != null) {
                                bVar.a(cVarC.d());
                                return;
                            }
                            return;
                        }
                        q1Var2 = n1.this.f289487a0;
                    }
                    if (!q1Var2.equals(n1.this.f289487a0)) {
                        n1.this.W.b(io.grpc.h.a.INFO, "Service config changed{0}", q1Var2 == n1.f289483u0 ? " to empty" : "");
                        n1.this.f289487a0 = q1Var2;
                        n1.this.f289509l0.f289547a = q1Var2.g();
                    }
                    try {
                        n1.this.f289491c0 = true;
                    } catch (RuntimeException e10) {
                        n1.f289476n0.log(Level.WARNING, "[" + n1.this.c() + "] Unexpected exception from parsing service config", (Throwable) e10);
                    }
                    q1Var = q1Var2;
                } else {
                    if (q1Var2 != null) {
                        n1.this.W.a(io.grpc.h.a.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    q1Var = n1.this.f289489b0 == null ? n1.f289483u0 : n1.this.f289489b0;
                    if (x0Var != null) {
                        n1.this.W.a(io.grpc.h.a.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    n1.this.Y.p(q1Var.c());
                }
                io.grpc.a aVarB = this.f289588a.b();
                v vVar = v.this;
                if (vVar.f289583a == n1.this.F) {
                    io.grpc.a.b bVarC = aVarB.g().c(io.grpc.x0.f291408a);
                    Map<String, ?> mapD = q1Var.d();
                    if (mapD != null) {
                        bVarC.d(io.grpc.o1.f290191b, mapD).a();
                    }
                    io.grpc.y2 y2VarH = v.this.f289583a.f289565a.h(io.grpc.o1.i.d().b(listA).c(bVarC.a()).d(q1Var.e()).a());
                    if (bVar != null) {
                        bVar.a(y2VarH);
                    }
                }
            }
        }

        v(u uVar, io.grpc.x1 x1Var) {
            this.f289583a = (u) com.google.common.base.j0.F(uVar, "helperImpl");
            this.f289584b = (io.grpc.x1) com.google.common.base.j0.F(x1Var, "resolver");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(io.grpc.y2 y2Var) {
            n1.f289476n0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{n1.this.c(), y2Var});
            n1.this.Y.n();
            x xVar = n1.this.Z;
            x xVar2 = x.ERROR;
            if (xVar != xVar2) {
                n1.this.W.b(io.grpc.h.a.WARNING, "Failed to resolve name: {0}", y2Var);
                n1.this.Z = xVar2;
            }
            if (this.f289583a != n1.this.F) {
                return;
            }
            this.f289583a.f289565a.c(y2Var);
        }

        @Override // io.grpc.x1.e, io.grpc.x1.f
        public void b(io.grpc.y2 y2Var) {
            com.google.common.base.j0.e(!y2Var.r(), "the error status must not be OK");
            n1.this.f289517s.execute(new a(y2Var));
        }

        @Override // io.grpc.x1.e
        public void c(io.grpc.x1.g gVar) {
            n1.this.f289517s.execute(new b(gVar));
        }
    }

    private class w extends io.grpc.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference<io.grpc.x0> f289590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f289591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.grpc.f f289592c;

        class a extends io.grpc.f {
            a() {
            }

            @Override // io.grpc.f
            public String b() {
                return w.this.f289591b;
            }

            @Override // io.grpc.f
            public <RequestT, ResponseT> io.grpc.k<RequestT, ResponseT> g(io.grpc.w1<RequestT, ResponseT> w1Var, io.grpc.e eVar) {
                return new io.grpc.internal.r(w1Var, n1.this.R0(eVar), eVar, n1.this.f289509l0, n1.this.R ? null : n1.this.f289502i.E0(), n1.this.U, null).H(n1.this.f289518t).G(n1.this.f289519u).F(n1.this.f289520v);
            }
        }

        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (n1.this.J == null) {
                    if (w.this.f289590a.get() == n1.f289484v0) {
                        w.this.f289590a.set(null);
                    }
                    n1.this.N.b(n1.f289481s0);
                }
            }
        }

        final class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (w.this.f289590a.get() == n1.f289484v0) {
                    w.this.f289590a.set(null);
                }
                if (n1.this.J != null) {
                    Iterator it = n1.this.J.iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).a("Channel is forcefully shutdown", null);
                    }
                }
                n1.this.N.c(n1.f289480r0);
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                n1.this.Q0();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        class e<ReqT, RespT> extends io.grpc.k<ReqT, RespT> {
            e() {
            }

            @Override // io.grpc.k
            public void a(@fj.h String str, @fj.h Throwable th2) {
            }

            @Override // io.grpc.k
            public void c() {
            }

            @Override // io.grpc.k
            public void e(int i10) {
            }

            @Override // io.grpc.k
            public void f(ReqT reqt) {
            }

            @Override // io.grpc.k
            public void h(io.grpc.k.a<RespT> aVar, io.grpc.v1 v1Var) {
                aVar.a(n1.f289481s0, new io.grpc.v1());
            }
        }

        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f289599a;

            f(g gVar) {
                this.f289599a = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (w.this.f289590a.get() != n1.f289484v0) {
                    this.f289599a.v();
                    return;
                }
                if (n1.this.J == null) {
                    n1.this.J = new LinkedHashSet();
                    n1 n1Var = n1.this;
                    n1Var.f289507k0.e(n1Var.K, true);
                }
                n1.this.J.add(this.f289599a);
            }
        }

        private final class g<ReqT, RespT> extends c0<ReqT, RespT> {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final io.grpc.w f289601m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final io.grpc.w1<ReqT, RespT> f289602n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final io.grpc.e f289603o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private final long f289604p;

            class a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Runnable f289606a;

                a(Runnable runnable) {
                    this.f289606a = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f289606a.run();
                    g gVar = g.this;
                    n1.this.f289517s.execute(new b());
                }
            }

            final class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (n1.this.J != null) {
                        n1.this.J.remove(g.this);
                        if (n1.this.J.isEmpty()) {
                            n1 n1Var = n1.this;
                            n1Var.f289507k0.e(n1Var.K, false);
                            n1.this.J = null;
                            if (n1.this.O.get()) {
                                n1.this.N.b(n1.f289481s0);
                            }
                        }
                    }
                }
            }

            g(io.grpc.w wVar, io.grpc.w1<ReqT, RespT> w1Var, io.grpc.e eVar) {
                super(n1.this.R0(eVar), n1.this.f289506k, eVar.d());
                this.f289601m = wVar;
                this.f289602n = w1Var;
                this.f289603o = eVar;
                this.f289604p = n1.this.f289503i0.a();
            }

            @Override // io.grpc.internal.c0
            protected void m() {
                super.m();
                n1.this.f289517s.execute(new b());
            }

            void v() {
                io.grpc.w wVarB = this.f289601m.b();
                try {
                    io.grpc.k<ReqT, RespT> kVarM = w.this.m(this.f289602n, this.f289603o.u(io.grpc.n.f290181a, Long.valueOf(n1.this.f289503i0.a() - this.f289604p)));
                    this.f289601m.j(wVarB);
                    Runnable runnableT = t(kVarM);
                    if (runnableT == null) {
                        n1.this.f289517s.execute(new b());
                    } else {
                        n1.this.R0(this.f289603o).execute(new a(runnableT));
                    }
                } catch (Throwable th2) {
                    this.f289601m.j(wVarB);
                    throw th2;
                }
            }
        }

        /* synthetic */ w(n1 n1Var, String str, a aVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <ReqT, RespT> io.grpc.k<ReqT, RespT> m(io.grpc.w1<ReqT, RespT> w1Var, io.grpc.e eVar) {
            io.grpc.x0 x0Var = this.f289590a.get();
            if (x0Var == null) {
                return this.f289592c.g(w1Var, eVar);
            }
            if (!(x0Var instanceof q1.c)) {
                return new p(x0Var, this.f289592c, n1.this.f289508l, w1Var, eVar);
            }
            q1.b bVarF = ((q1.c) x0Var).f289719b.f(w1Var);
            if (bVarF != null) {
                eVar = eVar.u(q1.b.f289712g, bVarF);
            }
            return this.f289592c.g(w1Var, eVar);
        }

        @Override // io.grpc.f
        public String b() {
            return this.f289591b;
        }

        @Override // io.grpc.f
        public <ReqT, RespT> io.grpc.k<ReqT, RespT> g(io.grpc.w1<ReqT, RespT> w1Var, io.grpc.e eVar) {
            if (this.f289590a.get() != n1.f289484v0) {
                return m(w1Var, eVar);
            }
            n1.this.f289517s.execute(new d());
            if (this.f289590a.get() != n1.f289484v0) {
                return m(w1Var, eVar);
            }
            if (n1.this.O.get()) {
                return new e();
            }
            g gVar = new g(io.grpc.w.g(), w1Var, eVar);
            n1.this.f289517s.execute(new f(gVar));
            return gVar;
        }

        void n() {
            if (this.f289590a.get() == n1.f289484v0) {
                p(null);
            }
        }

        void o() {
            n1.this.f289517s.execute(new c());
        }

        void p(@fj.h io.grpc.x0 x0Var) {
            io.grpc.x0 x0Var2 = this.f289590a.get();
            this.f289590a.set(x0Var);
            if (x0Var2 == n1.f289484v0 && n1.this.J != null) {
                Iterator it = n1.this.J.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).v();
                }
            }
        }

        void shutdown() {
            n1.this.f289517s.execute(new b());
        }

        private w(String str) {
            this.f289590a = new AtomicReference<>(n1.f289484v0);
            this.f289592c = new a();
            this.f289591b = (String) com.google.common.base.j0.F(str, "authority");
        }
    }

    enum x {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    private static final class y implements ScheduledExecutorService {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f289613a;

        /* synthetic */ y(ScheduledExecutorService scheduledExecutorService, a aVar) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f289613a.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f289613a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            return this.f289613a.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
            return (T) this.f289613a.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f289613a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f289613a.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            return this.f289613a.schedule(callable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f289613a.scheduleAtFixedRate(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f289613a.scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.f289613a.submit(callable);
        }

        private y(ScheduledExecutorService scheduledExecutorService) {
            this.f289613a = (ScheduledExecutorService) com.google.common.base.j0.F(scheduledExecutorService, "delegate");
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f289613a.invokeAll(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (T) this.f289613a.invokeAny(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f289613a.schedule(runnable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.f289613a.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t10) {
            return this.f289613a.submit(runnable, t10);
        }
    }

    private final class z extends io.grpc.internal.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.grpc.o1.b f289614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.grpc.c1 f289615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.grpc.internal.p f289616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.grpc.internal.q f289617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        List<io.grpc.d0> f289618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        e1 f289619f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f289620g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f289621h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.grpc.c3.d f289622i;

        final class a extends e1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.o1.l f289624a;

            a(io.grpc.o1.l lVar) {
                this.f289624a = lVar;
            }

            @Override // io.grpc.internal.e1.l
            void a(e1 e1Var) {
                n1.this.f289507k0.e(e1Var, true);
            }

            @Override // io.grpc.internal.e1.l
            void b(e1 e1Var) {
                n1.this.f289507k0.e(e1Var, false);
            }

            @Override // io.grpc.internal.e1.l
            void c(e1 e1Var, io.grpc.v vVar) {
                com.google.common.base.j0.h0(this.f289624a != null, "listener is null");
                this.f289624a.a(vVar);
            }

            @Override // io.grpc.internal.e1.l
            void d(e1 e1Var) {
                n1.this.I.remove(e1Var);
                n1.this.X.D(e1Var);
                n1.this.Y0();
            }
        }

        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                z.this.f289619f.h(n1.f289482t0);
            }
        }

        z(io.grpc.o1.b bVar) {
            com.google.common.base.j0.F(bVar, "args");
            this.f289618e = bVar.a();
            if (n1.this.f289490c != null) {
                bVar = bVar.e().f(l(bVar.a())).c();
            }
            this.f289614a = bVar;
            io.grpc.c1 c1VarB = io.grpc.c1.b("Subchannel", n1.this.b());
            this.f289615b = c1VarB;
            io.grpc.internal.q qVar = new io.grpc.internal.q(c1VarB, n1.this.f289516r, n1.this.f289515q.a(), "Subchannel for " + bVar.a());
            this.f289617d = qVar;
            this.f289616c = new io.grpc.internal.p(qVar, n1.this.f289515q);
        }

        private List<io.grpc.d0> l(List<io.grpc.d0> list) {
            ArrayList arrayList = new ArrayList();
            for (io.grpc.d0 d0Var : list) {
                arrayList.add(new io.grpc.d0(d0Var.a(), d0Var.b().g().c(io.grpc.d0.f288712d).a()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // io.grpc.o1.j
        public io.grpc.f a() {
            com.google.common.base.j0.h0(this.f289620g, "not started");
            return new l3(this.f289619f, n1.this.f289513o.a(), n1.this.f289502i.E0(), n1.this.T.k(), new AtomicReference(null));
        }

        @Override // io.grpc.o1.j
        public List<io.grpc.d0> c() {
            n1.this.f289517s.e();
            com.google.common.base.j0.h0(this.f289620g, "not started");
            return this.f289618e;
        }

        @Override // io.grpc.o1.j
        public io.grpc.a d() {
            return this.f289614a.b();
        }

        @Override // io.grpc.o1.j
        public io.grpc.h e() {
            return this.f289616c;
        }

        @Override // io.grpc.o1.j
        public Object f() {
            com.google.common.base.j0.h0(this.f289620g, "Subchannel is not started");
            return this.f289619f;
        }

        @Override // io.grpc.o1.j
        public void g() {
            n1.this.f289517s.e();
            com.google.common.base.j0.h0(this.f289620g, "not started");
            this.f289619f.b();
        }

        @Override // io.grpc.o1.j
        public void h() {
            io.grpc.c3.d dVar;
            n1.this.f289517s.e();
            if (this.f289619f == null) {
                this.f289621h = true;
                return;
            }
            if (!this.f289621h) {
                this.f289621h = true;
            } else {
                if (!n1.this.Q || (dVar = this.f289622i) == null) {
                    return;
                }
                dVar.a();
                this.f289622i = null;
            }
            if (n1.this.Q) {
                this.f289619f.h(n1.f289481s0);
            } else {
                this.f289622i = n1.this.f289517s.c(new k1(new b()), 5L, TimeUnit.SECONDS, n1.this.f289502i.E0());
            }
        }

        @Override // io.grpc.o1.j
        public void i(io.grpc.o1.l lVar) {
            n1.this.f289517s.e();
            com.google.common.base.j0.h0(!this.f289620g, "already started");
            com.google.common.base.j0.h0(!this.f289621h, "already shutdown");
            com.google.common.base.j0.h0(!n1.this.Q, "Channel is being terminated");
            this.f289620g = true;
            e1 e1Var = new e1(this.f289614a.a(), n1.this.b(), n1.this.C, n1.this.f289524z, n1.this.f289502i, n1.this.f289502i.E0(), n1.this.f289521w, n1.this.f289517s, new a(lVar), n1.this.X, n1.this.T.k(), this.f289617d, this.f289615b, this.f289616c, n1.this.B);
            n1.this.V.e(new io.grpc.v0.c.b.a().c("Child Subchannel started").d(io.grpc.v0.c.b.EnumC1995b.CT_INFO).f(n1.this.f289515q.a()).e(e1Var).a());
            this.f289619f = e1Var;
            n1.this.X.h(e1Var);
            n1.this.I.add(e1Var);
        }

        @Override // io.grpc.o1.j
        public void j(List<io.grpc.d0> list) {
            n1.this.f289517s.e();
            this.f289618e = list;
            if (n1.this.f289490c != null) {
                list = l(list);
            }
            this.f289619f.d0(list);
        }

        @Override // io.grpc.internal.e
        io.grpc.a1<io.grpc.v0.b> k() {
            com.google.common.base.j0.h0(this.f289620g, "not started");
            return this.f289619f;
        }

        public String toString() {
            return this.f289615b.toString();
        }
    }

    static {
        io.grpc.y2 y2Var = io.grpc.y2.f291465t;
        f289480r0 = y2Var.u("Channel shutdownNow invoked");
        f289481s0 = y2Var.u("Channel shutdown invoked");
        f289482t0 = y2Var.u("Subchannel shutdown invoked");
        f289483u0 = q1.a();
        f289484v0 = new a();
        f289485w0 = new n();
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
    n1(o1 o1Var, io.grpc.internal.v vVar, io.grpc.internal.k.a aVar, z1<? extends Executor> z1Var, com.google.common.base.s0<com.google.common.base.q0> s0Var, List<io.grpc.l> list, n3 n3Var) {
        a aVar2;
        io.grpc.c3 c3Var = new io.grpc.c3(new l());
        this.f289517s = c3Var;
        this.f289523y = new io.grpc.internal.y();
        this.I = new HashSet(16, 0.75f);
        this.K = new Object();
        this.L = new HashSet(1, 0.75f);
        a aVar3 = null;
        this.N = new a0(this, aVar3);
        this.O = new AtomicBoolean(false);
        this.S = new CountDownLatch(1);
        this.Z = x.NO_RESOLUTION;
        this.f289487a0 = f289483u0;
        this.f289491c0 = false;
        this.f289495e0 = new m2.u();
        this.f289503i0 = io.grpc.y.k();
        q qVar = new q(this, aVar3);
        this.f289505j0 = qVar;
        this.f289507k0 = new s(this, aVar3);
        this.f289509l0 = new o(this, aVar3);
        String str = (String) com.google.common.base.j0.F(o1Var.f289645f, androidx.constraintlayout.core.motion.utils.v.a.M);
        this.f289488b = str;
        io.grpc.c1 c1VarB = io.grpc.c1.b("Channel", str);
        this.f289486a = c1VarB;
        this.f289515q = (n3) com.google.common.base.j0.F(n3Var, "timeProvider");
        z1<? extends Executor> z1Var2 = (z1) com.google.common.base.j0.F(o1Var.f289640a, "executorPool");
        this.f289510m = z1Var2;
        Executor executor = (Executor) com.google.common.base.j0.F(z1Var2.a(), "executor");
        this.f289508l = executor;
        this.f289500h = o1Var.f289646g;
        this.f289498g = vVar;
        r rVar = new r((z1) com.google.common.base.j0.F(o1Var.f289641b, "offloadExecutorPool"));
        this.f289514p = rVar;
        io.grpc.internal.n nVar = new io.grpc.internal.n(vVar, o1Var.f289647h, rVar);
        this.f289502i = nVar;
        this.f289504j = new io.grpc.internal.n(vVar, null, rVar);
        y yVar = new y(nVar.E0(), aVar3);
        this.f289506k = yVar;
        this.f289516r = o1Var.f289662w;
        io.grpc.internal.q qVar2 = new io.grpc.internal.q(c1VarB, o1Var.f289662w, n3Var.a(), "Channel for '" + str + "'");
        this.V = qVar2;
        io.grpc.internal.p pVar = new io.grpc.internal.p(qVar2, n3Var);
        this.W = pVar;
        io.grpc.g2 g2Var = o1Var.A;
        g2Var = g2Var == null ? v0.F : g2Var;
        boolean z10 = o1Var.f289660u;
        this.f289501h0 = z10;
        io.grpc.internal.j jVar = new io.grpc.internal.j(o1Var.f289651l);
        this.f289496f = jVar;
        io.grpc.z1 z1Var3 = o1Var.f289643d;
        this.f289492d = z1Var3;
        r2 r2Var = new r2(z10, o1Var.f289656q, o1Var.f289657r, jVar);
        String str2 = o1Var.f289650k;
        this.f289490c = str2;
        io.grpc.x1.b bVarA = io.grpc.x1.b.i().c(o1Var.Y()).f(g2Var).i(c3Var).g(yVar).h(r2Var).b(pVar).d(rVar).e(str2).a();
        this.f289494e = bVarA;
        this.D = U0(str, str2, z1Var3, bVarA, nVar.K8());
        this.f289512n = (z1) com.google.common.base.j0.F(z1Var, "balancerRpcExecutorPool");
        this.f289513o = new r(z1Var);
        d0 d0Var = new d0(executor, c3Var);
        this.M = d0Var;
        d0Var.f(qVar);
        this.f289524z = aVar;
        Map<String, ?> map = o1Var.f289663x;
        if (map != null) {
            io.grpc.x1.c cVarA = r2Var.a(map);
            com.google.common.base.j0.x0(cVarA.d() == null, "Default config is invalid: %s", cVarA.d());
            q1 q1Var = (q1) cVarA.c();
            this.f289489b0 = q1Var;
            this.f289487a0 = q1Var;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f289489b0 = null;
        }
        boolean z11 = o1Var.f289664y;
        this.f289493d0 = z11;
        w wVar = new w(this, this.D.a(), aVar2);
        this.Y = wVar;
        io.grpc.b bVar = o1Var.f289665z;
        this.A = io.grpc.m.b(bVar != null ? bVar.a(wVar) : wVar, list);
        this.B = new ArrayList(o1Var.f289644e);
        this.f289521w = (com.google.common.base.s0) com.google.common.base.j0.F(s0Var, "stopwatchSupplier");
        long j10 = o1Var.f289655p;
        if (j10 == -1) {
            this.f289522x = j10;
        } else {
            com.google.common.base.j0.p(j10 >= o1.O, "invalid idleTimeoutMillis %s", j10);
            this.f289522x = o1Var.f289655p;
        }
        this.f289511m0 = new l2(new t(this, null), c3Var, nVar.E0(), s0Var.get());
        this.f289518t = o1Var.f289652m;
        this.f289519u = (io.grpc.a0) com.google.common.base.j0.F(o1Var.f289653n, "decompressorRegistry");
        this.f289520v = (io.grpc.t) com.google.common.base.j0.F(o1Var.f289654o, "compressorRegistry");
        this.C = o1Var.f289649j;
        this.f289499g0 = o1Var.f289658s;
        this.f289497f0 = o1Var.f289659t;
        c cVar = new c(n3Var);
        this.T = cVar;
        this.U = cVar.k();
        io.grpc.v0 v0Var = (io.grpc.v0) com.google.common.base.j0.E(o1Var.f289661v);
        this.X = v0Var;
        v0Var.e(this);
        if (z11) {
            return;
        }
        if (this.f289489b0 != null) {
            pVar.a(io.grpc.h.a.INFO, "Service config look-up disabled, using default service config");
        }
        this.f289491c0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(boolean z10) {
        this.f289511m0.i(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        d1(true);
        this.M.s(null);
        this.W.a(io.grpc.h.a.INFO, "Entering IDLE state");
        this.f289523y.b(io.grpc.u.IDLE);
        if (this.f289507k0.a(this.K, this.M)) {
            Q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Executor R0(io.grpc.e eVar) {
        Executor executorE = eVar.e();
        return executorE == null ? this.f289508l : executorE;
    }

    private static io.grpc.x1 T0(String str, io.grpc.z1 z1Var, io.grpc.x1.b bVar, Collection<Class<? extends SocketAddress>> collection) {
        URI uri;
        StringBuilder sb2 = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e10) {
            sb2.append(e10.getMessage());
            uri = null;
        }
        io.grpc.y1 y1VarG = uri != null ? z1Var.g(uri.getScheme()) : null;
        String str2 = "";
        if (y1VarG == null && !f289477o0.matcher(str).matches()) {
            try {
                uri = new URI(z1Var.e(), "", "/" + str, null);
                y1VarG = z1Var.g(uri.getScheme());
            } catch (URISyntaxException e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        if (y1VarG == null) {
            if (sb2.length() > 0) {
                str2 = " (" + ((Object) sb2) + ")";
            }
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, str2));
        }
        if (collection != null && !collection.containsAll(y1VarG.c())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
        }
        io.grpc.x1 x1VarB = y1VarG.b(uri, bVar);
        if (x1VarB != null) {
            return x1VarB;
        }
        if (sb2.length() > 0) {
            str2 = " (" + ((Object) sb2) + ")";
        }
        throw new IllegalArgumentException(String.format("cannot create a NameResolver for %s%s", str, str2));
    }

    @com.google.common.annotations.e
    static io.grpc.x1 U0(String str, @fj.h String str2, io.grpc.z1 z1Var, io.grpc.x1.b bVar, Collection<Class<? extends SocketAddress>> collection) {
        p2 p2Var = new p2(T0(str, z1Var, bVar, collection), new io.grpc.internal.m(new h0.a(), bVar.f(), bVar.h()), bVar.h());
        return str2 == null ? p2Var : new m(p2Var, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(io.grpc.v vVar) {
        if (vVar.c() == io.grpc.u.TRANSIENT_FAILURE || vVar.c() == io.grpc.u.IDLE) {
            a1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0() {
        if (this.P) {
            Iterator<e1> it = this.I.iterator();
            while (it.hasNext()) {
                it.next().a(f289480r0);
            }
            Iterator<a2> it2 = this.L.iterator();
            while (it2.hasNext()) {
                it2.next().u().a(f289480r0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y0() {
        if (!this.R && this.O.get() && this.I.isEmpty() && this.L.isEmpty()) {
            this.W.a(io.grpc.h.a.INFO, "Terminated");
            this.X.A(this);
            this.f289510m.b(this.f289508l);
            this.f289513o.release();
            this.f289514p.release();
            this.f289502i.close();
            this.R = true;
            this.S.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1() {
        this.f289517s.e();
        if (this.E) {
            this.D.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1() {
        long j10 = this.f289522x;
        if (j10 == -1) {
            return;
        }
        this.f289511m0.l(j10, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1(boolean z10) {
        boolean z11;
        this.f289517s.e();
        if (z10) {
            com.google.common.base.j0.h0(this.E, "nameResolver is not started");
            if (this.F != null) {
                z11 = true;
                boolean z12 = !false;
            } else {
                z11 = false;
            }
            com.google.common.base.j0.h0(z11, "lbHelper is null");
        }
        io.grpc.x1 x1Var = this.D;
        if (x1Var != null) {
            x1Var.c();
            this.E = false;
            if (z10) {
                this.D = U0(this.f289488b, this.f289490c, this.f289492d, this.f289494e, this.f289502i.K8());
            } else {
                this.D = null;
            }
        }
        u uVar = this.F;
        if (uVar != null) {
            uVar.f289565a.g();
            this.F = null;
        }
        this.G = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(io.grpc.o1.k kVar) {
        this.G = kVar;
        this.M.s(kVar);
    }

    @com.google.common.annotations.e
    void Q0() {
        this.f289517s.e();
        if (!this.O.get() && !this.H) {
            if (this.f289507k0.d()) {
                O0(false);
            } else {
                b1();
            }
            if (this.F == null) {
                this.W.a(io.grpc.h.a.INFO, "Exiting idle mode");
                u uVar = new u(this, null);
                uVar.f289565a = this.f289496f.e(uVar);
                this.F = uVar;
                this.D.d(new v(uVar, this.D));
                this.E = true;
            }
        }
    }

    @com.google.common.annotations.e
    io.grpc.x0 S0() {
        return (io.grpc.x0) this.Y.f289590a.get();
    }

    @com.google.common.annotations.e
    boolean W0() {
        return this.H;
    }

    @com.google.common.annotations.e
    void Z0(Throwable th2) {
        if (this.H) {
            return;
        }
        this.H = true;
        O0(true);
        d1(false);
        f1(new e(th2));
        this.Y.p(null);
        this.W.a(io.grpc.h.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.f289523y.b(io.grpc.u.TRANSIENT_FAILURE);
    }

    @Override // io.grpc.f
    public String b() {
        return this.A.b();
    }

    @Override // io.grpc.m1
    public io.grpc.c1 c() {
        return this.f289486a;
    }

    @Override // io.grpc.r1
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public n1 q() {
        this.W.a(io.grpc.h.a.DEBUG, "shutdown() called");
        boolean z10 = !true;
        if (!this.O.compareAndSet(false, true)) {
            return this;
        }
        this.f289517s.execute(new i());
        this.Y.shutdown();
        this.f289517s.execute(new b());
        return this;
    }

    @Override // io.grpc.r1
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public n1 r() {
        this.W.a(io.grpc.h.a.DEBUG, "shutdownNow() called");
        q();
        this.Y.o();
        this.f289517s.execute(new j());
        return this;
    }

    @Override // io.grpc.f
    public <ReqT, RespT> io.grpc.k<ReqT, RespT> g(io.grpc.w1<ReqT, RespT> w1Var, io.grpc.e eVar) {
        return this.A.g(w1Var, eVar);
    }

    @Override // io.grpc.a1
    public com.google.common.util.concurrent.t1<io.grpc.v0.b> i() {
        com.google.common.util.concurrent.m2 m2VarF = com.google.common.util.concurrent.m2.F();
        this.f289517s.execute(new k(m2VarF));
        return m2VarF;
    }

    @Override // io.grpc.r1
    public boolean j(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.S.await(j10, timeUnit);
    }

    @Override // io.grpc.r1
    public void k() {
        this.f289517s.execute(new f());
    }

    @Override // io.grpc.r1
    public io.grpc.u l(boolean z10) {
        io.grpc.u uVarA = this.f289523y.a();
        if (z10 && uVarA == io.grpc.u.IDLE) {
            this.f289517s.execute(new g());
        }
        return uVarA;
    }

    @Override // io.grpc.r1
    public boolean m() {
        return this.O.get();
    }

    @Override // io.grpc.r1
    public boolean n() {
        return this.R;
    }

    @Override // io.grpc.r1
    public void o(io.grpc.u uVar, Runnable runnable) {
        this.f289517s.execute(new d(runnable, uVar));
    }

    @Override // io.grpc.r1
    public void p() {
        this.f289517s.execute(new h());
    }

    public String toString() {
        return com.google.common.base.b0.c(this).e("logId", this.f289486a.e()).f(androidx.constraintlayout.core.motion.utils.v.a.M, this.f289488b).toString();
    }

    private final class a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f289525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        Collection<io.grpc.internal.s> f289526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        io.grpc.y2 f289527c;

        private a0() {
            this.f289525a = new Object();
            this.f289526b = new HashSet();
        }

        @fj.h
        io.grpc.y2 a(m2<?> m2Var) {
            synchronized (this.f289525a) {
                try {
                    io.grpc.y2 y2Var = this.f289527c;
                    if (y2Var != null) {
                        return y2Var;
                    }
                    this.f289526b.add(m2Var);
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b(io.grpc.y2 y2Var) {
            synchronized (this.f289525a) {
                try {
                    if (this.f289527c != null) {
                        return;
                    }
                    this.f289527c = y2Var;
                    boolean zIsEmpty = this.f289526b.isEmpty();
                    if (zIsEmpty) {
                        n1.this.M.h(y2Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void c(io.grpc.y2 y2Var) {
            ArrayList arrayList;
            b(y2Var);
            synchronized (this.f289525a) {
                try {
                    arrayList = new ArrayList(this.f289526b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((io.grpc.internal.s) it.next()).a(y2Var);
            }
            n1.this.M.a(y2Var);
        }

        void d(m2<?> m2Var) {
            io.grpc.y2 y2Var;
            synchronized (this.f289525a) {
                try {
                    this.f289526b.remove(m2Var);
                    if (this.f289526b.isEmpty()) {
                        y2Var = this.f289527c;
                        this.f289526b = new HashSet();
                    } else {
                        y2Var = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (y2Var != null) {
                n1.this.M.h(y2Var);
            }
        }

        /* synthetic */ a0(n1 n1Var, a aVar) {
            this();
        }
    }
}
