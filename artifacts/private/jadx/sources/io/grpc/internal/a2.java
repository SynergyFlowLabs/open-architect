package io.grpc.internal;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
final class a2 extends io.grpc.r1 implements io.grpc.a1<io.grpc.v0.b> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Logger f288840q = Logger.getLogger(a2.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e1 f288841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.grpc.internal.e f288842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.grpc.o1.k f288843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.grpc.c1 f288844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f288845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0 f288846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.grpc.v0 f288847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z1<? extends Executor> f288848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f288849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f288850j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f288852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final o f288853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final q f288854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n3 f288855o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final CountDownLatch f288851k = new CountDownLatch(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r.e f288856p = new a();

    class a implements r.e {
        a() {
        }

        @Override // io.grpc.internal.r.e
        public s a(io.grpc.w1<?, ?> w1Var, io.grpc.e eVar, io.grpc.v1 v1Var, io.grpc.w wVar) {
            io.grpc.n[] nVarArrH = v0.h(eVar, v1Var, 0, false);
            io.grpc.w wVarB = wVar.b();
            try {
                s sVarE = a2.this.f288846f.e(w1Var, v1Var, eVar, nVarArrH);
                wVar.j(wVarB);
                return sVarE;
            } catch (Throwable th2) {
                wVar.j(wVarB);
                throw th2;
            }
        }
    }

    final class b extends io.grpc.o1.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.grpc.o1.g f288858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.grpc.v f288859b;

        b(io.grpc.v vVar) {
            this.f288859b = vVar;
            this.f288858a = io.grpc.o1.g.f(vVar.d());
        }

        @Override // io.grpc.o1.k
        public io.grpc.o1.g a(io.grpc.o1.h hVar) {
            return this.f288858a;
        }

        public String toString() {
            return com.google.common.base.b0.b(b.class).f("errorResult", this.f288858a).toString();
        }
    }

    final class c extends io.grpc.o1.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.grpc.o1.g f288861a;

        c() {
            this.f288861a = io.grpc.o1.g.h(a2.this.f288842b);
        }

        @Override // io.grpc.o1.k
        public io.grpc.o1.g a(io.grpc.o1.h hVar) {
            return this.f288861a;
        }

        public String toString() {
            return com.google.common.base.b0.b(c.class).f("result", this.f288861a).toString();
        }
    }

    class d implements r1.a {
        d() {
        }

        @Override // io.grpc.internal.r1.a
        public void a() {
            a2.this.f288842b.h();
        }

        @Override // io.grpc.internal.r1.a
        public void b(io.grpc.y2 y2Var) {
        }

        @Override // io.grpc.internal.r1.a
        public void c() {
        }

        @Override // io.grpc.internal.r1.a
        public void d(boolean z10) {
        }

        @Override // io.grpc.internal.r1.a
        public io.grpc.a e(io.grpc.a aVar) {
            return aVar;
        }
    }

    class e extends io.grpc.internal.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e1 f288864a;

        e(e1 e1Var) {
            this.f288864a = e1Var;
        }

        @Override // io.grpc.o1.j
        public List<io.grpc.d0> c() {
            return this.f288864a.Q();
        }

        @Override // io.grpc.o1.j
        public io.grpc.a d() {
            return io.grpc.a.f288673c;
        }

        @Override // io.grpc.o1.j
        public Object f() {
            return this.f288864a;
        }

        @Override // io.grpc.o1.j
        public void g() {
            this.f288864a.b();
        }

        @Override // io.grpc.o1.j
        public void h() {
            this.f288864a.h(io.grpc.y2.f291465t.u("OobChannel is shutdown"));
        }

        @Override // io.grpc.internal.e
        io.grpc.a1<io.grpc.v0.b> k() {
            return this.f288864a;
        }
    }

    static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f288866a;

        static {
            int[] iArr = new int[io.grpc.u.values().length];
            f288866a = iArr;
            try {
                iArr[io.grpc.u.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f288866a[io.grpc.u.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f288866a[io.grpc.u.TRANSIENT_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    a2(String str, z1<? extends Executor> z1Var, ScheduledExecutorService scheduledExecutorService, io.grpc.c3 c3Var, o oVar, q qVar, io.grpc.v0 v0Var, n3 n3Var) {
        this.f288845e = (String) com.google.common.base.j0.F(str, "authority");
        this.f288844d = io.grpc.c1.a(a2.class, str);
        this.f288848h = (z1) com.google.common.base.j0.F(z1Var, "executorPool");
        Executor executor = (Executor) com.google.common.base.j0.F(z1Var.a(), "executor");
        this.f288849i = executor;
        this.f288850j = (ScheduledExecutorService) com.google.common.base.j0.F(scheduledExecutorService, "deadlineCancellationExecutor");
        d0 d0Var = new d0(executor, c3Var);
        this.f288846f = d0Var;
        this.f288847g = (io.grpc.v0) com.google.common.base.j0.E(v0Var);
        d0Var.f(new d());
        this.f288853m = oVar;
        this.f288854n = (q) com.google.common.base.j0.F(qVar, "channelTracer");
        this.f288855o = (n3) com.google.common.base.j0.F(n3Var, "timeProvider");
    }

    @Override // io.grpc.f
    public String b() {
        return this.f288845e;
    }

    @Override // io.grpc.m1
    public io.grpc.c1 c() {
        return this.f288844d;
    }

    @Override // io.grpc.f
    public <RequestT, ResponseT> io.grpc.k<RequestT, ResponseT> g(io.grpc.w1<RequestT, ResponseT> w1Var, io.grpc.e eVar) {
        return new r(w1Var, eVar.e() == null ? this.f288849i : eVar.e(), eVar, this.f288856p, this.f288850j, this.f288853m, null);
    }

    @Override // io.grpc.a1
    public com.google.common.util.concurrent.t1<io.grpc.v0.b> i() {
        com.google.common.util.concurrent.m2 m2VarF = com.google.common.util.concurrent.m2.F();
        io.grpc.v0.b.a aVar = new io.grpc.v0.b.a();
        this.f288853m.d(aVar);
        this.f288854n.g(aVar);
        aVar.j(this.f288845e).h(this.f288841a.T()).i(Collections.singletonList(this.f288841a));
        m2VarF.B(aVar.a());
        return m2VarF;
    }

    @Override // io.grpc.r1
    public boolean j(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f288851k.await(j10, timeUnit);
    }

    @Override // io.grpc.r1
    public io.grpc.u l(boolean z10) {
        e1 e1Var = this.f288841a;
        return e1Var == null ? io.grpc.u.IDLE : e1Var.T();
    }

    @Override // io.grpc.r1
    public boolean m() {
        return this.f288852l;
    }

    @Override // io.grpc.r1
    public boolean n() {
        return this.f288851k.getCount() == 0;
    }

    @Override // io.grpc.r1
    public void p() {
        this.f288841a.a0();
    }

    @Override // io.grpc.r1
    public io.grpc.r1 q() {
        this.f288852l = true;
        this.f288846f.h(io.grpc.y2.f291465t.u("OobChannel.shutdown() called"));
        return this;
    }

    @Override // io.grpc.r1
    public io.grpc.r1 r() {
        this.f288852l = true;
        this.f288846f.a(io.grpc.y2.f291465t.u("OobChannel.shutdownNow() called"));
        return this;
    }

    public String toString() {
        return com.google.common.base.b0.c(this).e("logId", this.f288844d.e()).f("authority", this.f288845e).toString();
    }

    e1 u() {
        return this.f288841a;
    }

    @com.google.common.annotations.e
    io.grpc.o1.j v() {
        return this.f288842b;
    }

    void w(io.grpc.v vVar) {
        this.f288854n.e(new io.grpc.v0.c.b.a().c("Entering " + vVar.c() + " state").d(io.grpc.v0.c.b.EnumC1995b.CT_INFO).f(this.f288855o.a()).a());
        int i10 = f.f288866a[vVar.c().ordinal()];
        int i11 = 7 & 1;
        if (i10 == 1 || i10 == 2) {
            this.f288846f.s(this.f288843c);
        } else {
            if (i10 != 3) {
                return;
            }
            this.f288846f.s(new b(vVar));
        }
    }

    void x() {
        this.f288847g.D(this);
        this.f288848h.b(this.f288849i);
        this.f288851k.countDown();
    }

    void y(e1 e1Var) {
        f288840q.log(Level.FINE, "[{0}] Created with [{1}]", new Object[]{this, e1Var});
        this.f288841a = e1Var;
        this.f288842b = new e(e1Var);
        c cVar = new c();
        this.f288843c = cVar;
        this.f288846f.s(cVar);
    }

    void z(List<io.grpc.d0> list) {
        this.f288841a.d0(list);
    }
}
