package io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
final class l3 extends io.grpc.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.google.common.annotations.e
    static final io.grpc.y2 f289329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.google.common.annotations.e
    static final io.grpc.y2 f289330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final j0 f289331i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e1 f289332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f289333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f289334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f289335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference<io.grpc.x0> f289336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r.e f289337f = new a();

    class a implements r.e {
        a() {
        }

        @Override // io.grpc.internal.r.e
        public s a(io.grpc.w1<?, ?> w1Var, io.grpc.e eVar, io.grpc.v1 v1Var, io.grpc.w wVar) {
            u uVarU = l3.this.f289332a.U();
            if (uVarU == null) {
                uVarU = l3.f289331i;
            }
            io.grpc.n[] nVarArrH = v0.h(eVar, v1Var, 0, false);
            io.grpc.w wVarB = wVar.b();
            try {
                s sVarE = uVarU.e(w1Var, v1Var, eVar, nVarArrH);
                wVar.j(wVarB);
                return sVarE;
            } catch (Throwable th2) {
                wVar.j(wVarB);
                throw th2;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [RequestT, ResponseT] */
    class b<RequestT, ResponseT> extends io.grpc.k<RequestT, ResponseT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f289339a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.k.a f289341a;

            a(io.grpc.k.a aVar) {
                this.f289341a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f289341a.a(l3.f289330h, new io.grpc.v1());
            }
        }

        b(Executor executor) {
            this.f289339a = executor;
        }

        @Override // io.grpc.k
        public void a(String str, Throwable th2) {
        }

        @Override // io.grpc.k
        public void c() {
        }

        @Override // io.grpc.k
        public void e(int i10) {
        }

        @Override // io.grpc.k
        public void f(RequestT requestt) {
        }

        @Override // io.grpc.k
        public void h(io.grpc.k.a<ResponseT> aVar, io.grpc.v1 v1Var) {
            this.f289339a.execute(new a(aVar));
        }
    }

    static {
        io.grpc.y2 y2Var = io.grpc.y2.f291465t;
        io.grpc.y2 y2VarU = y2Var.u("Subchannel is NOT READY");
        f289329g = y2VarU;
        f289330h = y2Var.u("wait-for-ready RPC is not supported on Subchannel.asChannel()");
        f289331i = new j0(y2VarU, t.a.MISCARRIED);
    }

    l3(e1 e1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, o oVar, AtomicReference<io.grpc.x0> atomicReference) {
        this.f289332a = (e1) com.google.common.base.j0.F(e1Var, "subchannel");
        this.f289333b = (Executor) com.google.common.base.j0.F(executor, "executor");
        this.f289334c = (ScheduledExecutorService) com.google.common.base.j0.F(scheduledExecutorService, "deadlineCancellationExecutor");
        this.f289335d = (o) com.google.common.base.j0.F(oVar, "callsTracer");
        this.f289336e = (AtomicReference) com.google.common.base.j0.F(atomicReference, "configSelector");
    }

    @Override // io.grpc.f
    public String b() {
        return this.f289332a.R();
    }

    @Override // io.grpc.f
    public <RequestT, ResponseT> io.grpc.k<RequestT, ResponseT> g(io.grpc.w1<RequestT, ResponseT> w1Var, io.grpc.e eVar) {
        Executor executorE = eVar.e() == null ? this.f289333b : eVar.e();
        return eVar.k() ? new b(executorE) : new r(w1Var, executorE, eVar.u(v0.I, Boolean.TRUE), this.f289337f, this.f289334c, this.f289335d, this.f289336e.get());
    }
}
