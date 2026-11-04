package io.grpc.internal;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
final class e1 implements io.grpc.a1<io.grpc.v0.b>, p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.c1 f289054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f289055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f289056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.grpc.internal.k.a f289057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f289058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v f289059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f289060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.grpc.v0 f289061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.grpc.internal.o f289062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final q f289063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.grpc.h f289064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<io.grpc.o> f289065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final io.grpc.c3 f289066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m f289067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile List<io.grpc.d0> f289068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private io.grpc.internal.k f289069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.common.base.q0 f289070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @fj.h
    private io.grpc.c3.d f289071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @fj.h
    private io.grpc.c3.d f289072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @fj.h
    private r1 f289073t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @fj.h
    private x f289076w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @fj.h
    private volatile r1 f289077x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private io.grpc.y2 f289079z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Collection<x> f289074u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final a1<x> f289075v = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile io.grpc.v f289078y = io.grpc.v.a(io.grpc.u.IDLE);

    class a extends a1<x> {
        a() {
        }

        @Override // io.grpc.internal.a1
        protected void b() {
            e1.this.f289058e.a(e1.this);
        }

        @Override // io.grpc.internal.a1
        protected void c() {
            e1.this.f289058e.b(e1.this);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.this.f289071r = null;
            e1.this.f289064k.a(io.grpc.h.a.INFO, "CONNECTING after backoff");
            e1.this.V(io.grpc.u.CONNECTING);
            e1.this.c0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e1.this.f289078y.c() == io.grpc.u.IDLE) {
                e1.this.f289064k.a(io.grpc.h.a.INFO, "CONNECTING as requested");
                e1.this.V(io.grpc.u.CONNECTING);
                e1.this.c0();
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e1.this.f289078y.c() != io.grpc.u.TRANSIENT_FAILURE) {
                return;
            }
            e1.this.O();
            e1.this.f289064k.a(io.grpc.h.a.INFO, "CONNECTING; backoff interrupted");
            e1.this.V(io.grpc.u.CONNECTING);
            e1.this.c0();
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f289084a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                r1 r1Var = e1.this.f289073t;
                e1.this.f289072s = null;
                e1.this.f289073t = null;
                r1Var.h(io.grpc.y2.f291465t.u("InternalSubchannel closed transport due to address change"));
            }
        }

        e(List list) {
            this.f289084a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            r1 r1Var;
            SocketAddress socketAddressA = e1.this.f289067n.a();
            e1.this.f289067n.i(this.f289084a);
            e1.this.f289068o = this.f289084a;
            io.grpc.u uVarC = e1.this.f289078y.c();
            io.grpc.u uVar = io.grpc.u.READY;
            if ((uVarC != uVar && e1.this.f289078y.c() != io.grpc.u.CONNECTING) || e1.this.f289067n.h(socketAddressA)) {
                r1Var = null;
            } else if (e1.this.f289078y.c() == uVar) {
                r1Var = e1.this.f289077x;
                e1.this.f289077x = null;
                e1.this.f289067n.g();
                e1.this.V(io.grpc.u.IDLE);
            } else {
                e1.this.f289076w.h(io.grpc.y2.f291465t.u("InternalSubchannel closed pending transport due to address change"));
                e1.this.f289076w = null;
                e1.this.f289067n.g();
                e1.this.c0();
                r1Var = null;
            }
            if (r1Var != null) {
                if (e1.this.f289072s != null) {
                    e1.this.f289073t.h(io.grpc.y2.f291465t.u("InternalSubchannel closed transport early due to address change"));
                    e1.this.f289072s.a();
                    e1.this.f289072s = null;
                    e1.this.f289073t = null;
                }
                e1.this.f289073t = r1Var;
                e1 e1Var = e1.this;
                e1Var.f289072s = e1Var.f289066m.c(new a(), 5L, TimeUnit.SECONDS, e1.this.f289060g);
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.y2 f289087a;

        f(io.grpc.y2 y2Var) {
            this.f289087a = y2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            io.grpc.u uVarC = e1.this.f289078y.c();
            io.grpc.u uVar = io.grpc.u.SHUTDOWN;
            if (uVarC == uVar) {
                return;
            }
            e1.this.f289079z = this.f289087a;
            r1 r1Var = e1.this.f289077x;
            x xVar = e1.this.f289076w;
            e1.this.f289077x = null;
            e1.this.f289076w = null;
            e1.this.V(uVar);
            e1.this.f289067n.g();
            if (e1.this.f289074u.isEmpty()) {
                e1.this.X();
            }
            e1.this.O();
            if (e1.this.f289072s != null) {
                e1.this.f289072s.a();
                e1.this.f289073t.h(this.f289087a);
                e1.this.f289072s = null;
                e1.this.f289073t = null;
            }
            if (r1Var != null) {
                r1Var.h(this.f289087a);
            }
            if (xVar != null) {
                xVar.h(this.f289087a);
            }
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.this.f289064k.a(io.grpc.h.a.INFO, "Terminated");
            e1.this.f289058e.d(e1.this);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f289090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f289091b;

        h(x xVar, boolean z10) {
            this.f289090a = xVar;
            this.f289091b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.this.f289075v.e(this.f289090a, this.f289091b);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.y2 f289093a;

        i(io.grpc.y2 y2Var) {
            this.f289093a = y2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(e1.this.f289074u).iterator();
            while (it.hasNext()) {
                ((r1) it.next()).a(this.f289093a);
            }
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.m2 f289095a;

        j(com.google.common.util.concurrent.m2 m2Var) {
            this.f289095a = m2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            io.grpc.v0.b.a aVar = new io.grpc.v0.b.a();
            List<io.grpc.d0> listC = e1.this.f289067n.c();
            ArrayList arrayList = new ArrayList(e1.this.f289074u);
            aVar.j(listC.toString()).h(e1.this.T());
            aVar.g(arrayList);
            e1.this.f289062i.d(aVar);
            e1.this.f289063j.g(aVar);
            this.f289095a.B(aVar.a());
        }
    }

    @com.google.common.annotations.e
    static final class k extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f289097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.internal.o f289098b;

        class a extends l0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ s f289099a;

            /* JADX INFO: renamed from: io.grpc.internal.e1$k$a$a, reason: collision with other inner class name */
            class C1971a extends m0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ t f289101a;

                C1971a(t tVar) {
                    this.f289101a = tVar;
                }

                @Override // io.grpc.internal.m0, io.grpc.internal.t
                public void f(io.grpc.y2 y2Var, t.a aVar, io.grpc.v1 v1Var) {
                    k.this.f289098b.b(y2Var.r());
                    super.f(y2Var, aVar, v1Var);
                }

                @Override // io.grpc.internal.m0
                protected t g() {
                    return this.f289101a;
                }
            }

            a(s sVar) {
                this.f289099a = sVar;
            }

            @Override // io.grpc.internal.l0, io.grpc.internal.s
            public void v(t tVar) {
                k.this.f289098b.c();
                super.v(new C1971a(tVar));
            }

            @Override // io.grpc.internal.l0
            protected s w() {
                return this.f289099a;
            }
        }

        /* synthetic */ k(x xVar, io.grpc.internal.o oVar, a aVar) {
            this(xVar, oVar);
        }

        @Override // io.grpc.internal.o0
        protected x b() {
            return this.f289097a;
        }

        @Override // io.grpc.internal.o0, io.grpc.internal.u
        public s e(io.grpc.w1<?, ?> w1Var, io.grpc.v1 v1Var, io.grpc.e eVar, io.grpc.n[] nVarArr) {
            return new a(super.e(w1Var, v1Var, eVar, nVarArr));
        }

        private k(x xVar, io.grpc.internal.o oVar) {
            this.f289097a = xVar;
            this.f289098b = oVar;
        }
    }

    static abstract class l {
        l() {
        }

        @z7.g
        void a(e1 e1Var) {
        }

        @z7.g
        void b(e1 e1Var) {
        }

        @z7.g
        void c(e1 e1Var, io.grpc.v vVar) {
        }

        @z7.g
        void d(e1 e1Var) {
        }
    }

    @com.google.common.annotations.e
    static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<io.grpc.d0> f289103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f289104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f289105c;

        public m(List<io.grpc.d0> list) {
            this.f289103a = list;
        }

        public SocketAddress a() {
            return this.f289103a.get(this.f289104b).a().get(this.f289105c);
        }

        public io.grpc.a b() {
            return this.f289103a.get(this.f289104b).b();
        }

        public List<io.grpc.d0> c() {
            return this.f289103a;
        }

        public void d() {
            io.grpc.d0 d0Var = this.f289103a.get(this.f289104b);
            int i10 = this.f289105c + 1;
            this.f289105c = i10;
            if (i10 >= d0Var.a().size()) {
                this.f289104b++;
                this.f289105c = 0;
            }
        }

        public boolean e() {
            if (this.f289104b != 0 || this.f289105c != 0) {
                return false;
            }
            int i10 = 7 << 1;
            return true;
        }

        public boolean f() {
            return this.f289104b < this.f289103a.size();
        }

        public void g() {
            this.f289104b = 0;
            this.f289105c = 0;
        }

        public boolean h(SocketAddress socketAddress) {
            for (int i10 = 0; i10 < this.f289103a.size(); i10++) {
                int iIndexOf = this.f289103a.get(i10).a().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.f289104b = i10;
                    this.f289105c = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        public void i(List<io.grpc.d0> list) {
            this.f289103a = list;
            g();
        }
    }

    private class n implements r1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final x f289106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f289107b = false;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e1.this.f289069p = null;
                if (e1.this.f289079z != null) {
                    com.google.common.base.j0.h0(e1.this.f289077x == null, "Unexpected non-null activeTransport");
                    n nVar = n.this;
                    nVar.f289106a.h(e1.this.f289079z);
                    return;
                }
                x xVar = e1.this.f289076w;
                n nVar2 = n.this;
                x xVar2 = nVar2.f289106a;
                if (xVar == xVar2) {
                    e1.this.f289077x = xVar2;
                    e1.this.f289076w = null;
                    e1.this.V(io.grpc.u.READY);
                }
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.y2 f289110a;

            b(io.grpc.y2 y2Var) {
                this.f289110a = y2Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e1.this.f289078y.c() == io.grpc.u.SHUTDOWN) {
                    return;
                }
                r1 r1Var = e1.this.f289077x;
                n nVar = n.this;
                if (r1Var == nVar.f289106a) {
                    e1.this.f289077x = null;
                    e1.this.f289067n.g();
                    e1.this.V(io.grpc.u.IDLE);
                    return;
                }
                x xVar = e1.this.f289076w;
                n nVar2 = n.this;
                if (xVar == nVar2.f289106a) {
                    com.google.common.base.j0.x0(e1.this.f289078y.c() == io.grpc.u.CONNECTING, "Expected state is CONNECTING, actual state is %s", e1.this.f289078y.c());
                    e1.this.f289067n.d();
                    if (e1.this.f289067n.f()) {
                        e1.this.c0();
                        return;
                    }
                    e1.this.f289076w = null;
                    e1.this.f289067n.g();
                    e1.this.b0(this.f289110a);
                }
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e1.this.f289074u.remove(n.this.f289106a);
                if (e1.this.f289078y.c() == io.grpc.u.SHUTDOWN && e1.this.f289074u.isEmpty()) {
                    e1.this.X();
                }
            }
        }

        n(x xVar) {
            this.f289106a = xVar;
        }

        @Override // io.grpc.internal.r1.a
        public void a() {
            com.google.common.base.j0.h0(this.f289107b, "transportShutdown() must be called before transportTerminated().");
            e1.this.f289064k.b(io.grpc.h.a.INFO, "{0} Terminated", this.f289106a.c());
            e1.this.f289061h.y(this.f289106a);
            e1.this.Y(this.f289106a, false);
            Iterator it = e1.this.f289065l.iterator();
            while (it.hasNext()) {
                ((io.grpc.o) it.next()).b(this.f289106a.getAttributes());
            }
            e1.this.f289066m.execute(new c());
        }

        @Override // io.grpc.internal.r1.a
        public void b(io.grpc.y2 y2Var) {
            e1.this.f289064k.b(io.grpc.h.a.INFO, "{0} SHUTDOWN with {1}", this.f289106a.c(), e1.this.Z(y2Var));
            this.f289107b = true;
            e1.this.f289066m.execute(new b(y2Var));
        }

        @Override // io.grpc.internal.r1.a
        public void c() {
            e1.this.f289064k.a(io.grpc.h.a.INFO, "READY");
            e1.this.f289066m.execute(new a());
        }

        @Override // io.grpc.internal.r1.a
        public void d(boolean z10) {
            e1.this.Y(this.f289106a, z10);
        }

        @Override // io.grpc.internal.r1.a
        public io.grpc.a e(io.grpc.a aVar) {
            for (io.grpc.o oVar : e1.this.f289065l) {
                aVar = (io.grpc.a) com.google.common.base.j0.V(oVar.a(aVar), "Filter %s returned null", oVar);
            }
            return aVar;
        }
    }

    @com.google.common.annotations.e
    static final class o extends io.grpc.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        io.grpc.c1 f289113a;

        o() {
        }

        @Override // io.grpc.h
        public void a(io.grpc.h.a aVar, String str) {
            p.d(this.f289113a, aVar, str);
        }

        @Override // io.grpc.h
        public void b(io.grpc.h.a aVar, String str, Object... objArr) {
            p.e(this.f289113a, aVar, str, objArr);
        }
    }

    e1(List<io.grpc.d0> list, String str, String str2, io.grpc.internal.k.a aVar, v vVar, ScheduledExecutorService scheduledExecutorService, com.google.common.base.s0<com.google.common.base.q0> s0Var, io.grpc.c3 c3Var, l lVar, io.grpc.v0 v0Var, io.grpc.internal.o oVar, q qVar, io.grpc.c1 c1Var, io.grpc.h hVar, List<io.grpc.o> list2) {
        com.google.common.base.j0.F(list, "addressGroups");
        com.google.common.base.j0.e(!list.isEmpty(), "addressGroups is empty");
        P(list, "addressGroups contains null entry");
        List<io.grpc.d0> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f289068o = listUnmodifiableList;
        this.f289067n = new m(listUnmodifiableList);
        this.f289055b = str;
        this.f289056c = str2;
        this.f289057d = aVar;
        this.f289059f = vVar;
        this.f289060g = scheduledExecutorService;
        this.f289070q = s0Var.get();
        this.f289066m = c3Var;
        this.f289058e = lVar;
        this.f289061h = v0Var;
        this.f289062i = oVar;
        this.f289063j = (q) com.google.common.base.j0.F(qVar, "channelTracer");
        this.f289054a = (io.grpc.c1) com.google.common.base.j0.F(c1Var, "logId");
        this.f289064k = (io.grpc.h) com.google.common.base.j0.F(hVar, "channelLogger");
        this.f289065l = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        this.f289066m.e();
        io.grpc.c3.d dVar = this.f289071r;
        if (dVar != null) {
            dVar.a();
            this.f289071r = null;
            this.f289069p = null;
        }
    }

    private static void P(List<?> list, String str) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            com.google.common.base.j0.F(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(io.grpc.u uVar) {
        this.f289066m.e();
        W(io.grpc.v.a(uVar));
    }

    private void W(io.grpc.v vVar) {
        this.f289066m.e();
        if (this.f289078y.c() != vVar.c()) {
            com.google.common.base.j0.h0(this.f289078y.c() != io.grpc.u.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + vVar);
            this.f289078y = vVar;
            this.f289058e.c(this, vVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        this.f289066m.execute(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(x xVar, boolean z10) {
        this.f289066m.execute(new h(xVar, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String Z(io.grpc.y2 y2Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y2Var.p());
        if (y2Var.q() != null) {
            sb2.append("(");
            sb2.append(y2Var.q());
            sb2.append(")");
        }
        if (y2Var.o() != null) {
            sb2.append("[");
            sb2.append(y2Var.o());
            sb2.append("]");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(io.grpc.y2 y2Var) {
        this.f289066m.e();
        W(io.grpc.v.b(y2Var));
        if (this.f289069p == null) {
            this.f289069p = this.f289057d.get();
        }
        long jA = this.f289069p.a();
        com.google.common.base.q0 q0Var = this.f289070q;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jG = jA - q0Var.g(timeUnit);
        this.f289064k.b(io.grpc.h.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", Z(y2Var), Long.valueOf(jG));
        com.google.common.base.j0.h0(this.f289071r == null, "previous reconnectTask is not done");
        this.f289071r = this.f289066m.c(new b(), jG, timeUnit, this.f289060g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        SocketAddress socketAddressC;
        io.grpc.q0 q0Var;
        this.f289066m.e();
        com.google.common.base.j0.h0(this.f289071r == null, "Should have no reconnectTask scheduled");
        if (this.f289067n.e()) {
            this.f289070q.j().k();
        }
        SocketAddress socketAddressA = this.f289067n.a();
        a aVar = null;
        if (socketAddressA instanceof io.grpc.q0) {
            q0Var = (io.grpc.q0) socketAddressA;
            socketAddressC = q0Var.c();
        } else {
            socketAddressC = socketAddressA;
            q0Var = null;
        }
        io.grpc.a aVarB = this.f289067n.b();
        String str = (String) aVarB.b(io.grpc.d0.f288712d);
        v.a aVar2 = new v.a();
        if (str == null) {
            str = this.f289055b;
        }
        v.a aVarI = aVar2.f(str).h(aVarB).j(this.f289056c).i(q0Var);
        o oVar = new o();
        oVar.f289113a = c();
        k kVar = new k(this.f289059f.j7(socketAddressC, aVarI, oVar), this.f289062i, aVar);
        oVar.f289113a = kVar.c();
        this.f289061h.c(kVar);
        this.f289076w = kVar;
        this.f289074u.add(kVar);
        Runnable runnableF = kVar.f(new n(kVar));
        if (runnableF != null) {
            this.f289066m.b(runnableF);
        }
        this.f289064k.b(io.grpc.h.a.INFO, "Started transport {0}", oVar.f289113a);
    }

    List<io.grpc.d0> Q() {
        return this.f289068o;
    }

    String R() {
        return this.f289055b;
    }

    io.grpc.h S() {
        return this.f289064k;
    }

    io.grpc.u T() {
        return this.f289078y.c();
    }

    @fj.h
    u U() {
        return this.f289077x;
    }

    void a(io.grpc.y2 y2Var) {
        h(y2Var);
        this.f289066m.execute(new i(y2Var));
    }

    void a0() {
        this.f289066m.execute(new d());
    }

    @Override // io.grpc.internal.p3
    public u b() {
        r1 r1Var = this.f289077x;
        if (r1Var != null) {
            return r1Var;
        }
        this.f289066m.execute(new c());
        return null;
    }

    @Override // io.grpc.m1
    public io.grpc.c1 c() {
        return this.f289054a;
    }

    public void d0(List<io.grpc.d0> list) {
        com.google.common.base.j0.F(list, "newAddressGroups");
        P(list, "newAddressGroups contains null entry");
        com.google.common.base.j0.e(!list.isEmpty(), "newAddressGroups is empty");
        this.f289066m.execute(new e(Collections.unmodifiableList(new ArrayList(list))));
    }

    public void h(io.grpc.y2 y2Var) {
        this.f289066m.execute(new f(y2Var));
    }

    @Override // io.grpc.a1
    public com.google.common.util.concurrent.t1<io.grpc.v0.b> i() {
        com.google.common.util.concurrent.m2 m2VarF = com.google.common.util.concurrent.m2.F();
        this.f289066m.execute(new j(m2VarF));
        return m2VarF;
    }

    public String toString() {
        return com.google.common.base.b0.c(this).e("logId", this.f289054a.e()).f("addressGroups", this.f289068o).toString();
    }
}
