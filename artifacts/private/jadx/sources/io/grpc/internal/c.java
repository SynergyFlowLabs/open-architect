package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c extends d implements z2, u1.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ boolean f288870e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u1 f288871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i3 f288872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f288873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f288874d;

    /* JADX INFO: Access modifiers changed from: protected */
    public interface a {
        void a(io.grpc.y2 y2Var);

        void h(io.grpc.v1 v1Var, boolean z10);

        void i(r3 r3Var, boolean z10, int i10);

        void j(io.grpc.v1 v1Var, boolean z10, io.grpc.y2 y2Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class b extends d.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f288875j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private a3 f288876k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final i3 f288877l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f288878m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f288879n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f288880o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Runnable f288881p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @fj.h
        private io.grpc.y2 f288882q;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.y2 f288883a;

            a(io.grpc.y2 y2Var) {
                this.f288883a = y2Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.I(this.f288883a);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.c$b$b, reason: collision with other inner class name */
        class RunnableC1969b implements Runnable {
            RunnableC1969b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.I(io.grpc.y2.f291450e);
            }
        }

        protected b(int i10, i3 i3Var, q3 q3Var) {
            super(i10, i3Var, (q3) com.google.common.base.j0.F(q3Var, "transportTracer"));
            this.f288878m = false;
            this.f288879n = false;
            this.f288880o = false;
            this.f288877l = (i3) com.google.common.base.j0.F(i3Var, "statsTraceCtx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I(io.grpc.y2 y2Var) {
            com.google.common.base.j0.g0((y2Var.r() && this.f288882q == null) ? false : true);
            if (this.f288875j) {
                return;
            }
            if (y2Var.r()) {
                this.f288877l.q(this.f288882q);
                t().h(this.f288882q.r());
            } else {
                this.f288877l.q(y2Var);
                t().h(false);
            }
            this.f288875j = true;
            z();
            v().b(y2Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M(io.grpc.y2 y2Var) {
            com.google.common.base.j0.h0(this.f288882q == null, "closedStatus can only be set once");
            this.f288882q = y2Var;
        }

        public void J() {
            if (this.f288879n) {
                this.f288881p = null;
                I(io.grpc.y2.f291450e);
            } else {
                this.f288881p = new RunnableC1969b();
                this.f288880o = true;
                q(true);
            }
        }

        public void K(i2 i2Var, boolean z10) {
            com.google.common.base.j0.h0(!this.f288878m, "Past end of stream");
            r(i2Var);
            if (z10) {
                this.f288878m = true;
                q(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.d.a
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public a3 v() {
            return this.f288876k;
        }

        public final void N(a3 a3Var) {
            com.google.common.base.j0.h0(this.f288876k == null, "setListener should be called only once");
            this.f288876k = (a3) com.google.common.base.j0.F(a3Var, com.google.android.gms.common.internal.z.a.f106673a);
        }

        @Override // io.grpc.internal.t1.b
        public void d(boolean z10) {
            this.f288879n = true;
            if (this.f288878m && !this.f288880o) {
                if (z10) {
                    i(io.grpc.y2.f291464s.u("Encountered end-of-stream mid-frame").e());
                    this.f288881p = null;
                    return;
                }
                this.f288876k.d();
            }
            Runnable runnable = this.f288881p;
            if (runnable != null) {
                runnable.run();
                this.f288881p = null;
            }
        }

        public final void g(io.grpc.y2 y2Var) {
            com.google.common.base.j0.e(!y2Var.r(), "status must not be OK");
            if (this.f288879n) {
                this.f288881p = null;
                I(y2Var);
            } else {
                this.f288881p = new a(y2Var);
                this.f288880o = true;
                q(true);
            }
        }

        @Override // io.grpc.internal.d.a
        public final void y() {
            super.y();
            t().g();
        }
    }

    protected c(s3 s3Var, i3 i3Var) {
        this.f288872b = (i3) com.google.common.base.j0.F(i3Var, "statsTraceCtx");
        this.f288871a = new u1(this, s3Var, i3Var);
    }

    private void C(io.grpc.v1 v1Var, io.grpc.y2 y2Var) {
        io.grpc.v1.i<io.grpc.y2> iVar = io.grpc.l1.f290163b;
        v1Var.j(iVar);
        io.grpc.v1.i<String> iVar2 = io.grpc.l1.f290162a;
        v1Var.j(iVar2);
        v1Var.w(iVar, y2Var);
        if (y2Var.q() != null) {
            v1Var.w(iVar2, y2Var.q());
        }
    }

    protected abstract a B();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.d
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final u1 y() {
        return this.f288871a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.d
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public abstract b A();

    @Override // io.grpc.internal.z2
    public final void a(io.grpc.y2 y2Var) {
        B().a(y2Var);
    }

    @Override // io.grpc.internal.z2
    public final void f(io.grpc.z zVar) {
        A().D((io.grpc.z) com.google.common.base.j0.F(zVar, "decompressor"));
    }

    @Override // io.grpc.internal.z2
    public io.grpc.a getAttributes() {
        return io.grpc.a.f288673c;
    }

    @Override // io.grpc.internal.z2
    public final void h(io.grpc.v1 v1Var, boolean z10) {
        com.google.common.base.j0.F(v1Var, "headers");
        this.f288874d = true;
        B().h(v1Var, z10);
    }

    @Override // io.grpc.internal.d, io.grpc.internal.j3
    public final boolean isReady() {
        return super.isReady();
    }

    @Override // io.grpc.internal.z2
    public String m() {
        return null;
    }

    @Override // io.grpc.internal.z2
    public final void n(a3 a3Var) {
        A().N(a3Var);
    }

    @Override // io.grpc.internal.z2
    public final void p(io.grpc.y2 y2Var, io.grpc.v1 v1Var) {
        com.google.common.base.j0.F(y2Var, "status");
        com.google.common.base.j0.F(v1Var, v0.f289912q);
        if (!this.f288873c) {
            int i10 = 7 >> 1;
            this.f288873c = true;
            x();
            C(v1Var, y2Var);
            A().M(y2Var);
            B().j(v1Var, this.f288874d, y2Var);
        }
    }

    @Override // io.grpc.internal.z2
    public i3 r() {
        return this.f288872b;
    }

    @Override // io.grpc.internal.u1.d
    public final void w(r3 r3Var, boolean z10, boolean z11, int i10) {
        if (r3Var == null) {
            return;
        }
        if (z10) {
            z11 = false;
        }
        B().i(r3Var, z11, i10);
    }
}
