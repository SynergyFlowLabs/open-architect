package io.grpc.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends d implements s, u1.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f288812g = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q3 f288813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0 f288814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f288815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f288816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.grpc.v1 f288817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f288818f;

    /* JADX INFO: renamed from: io.grpc.internal.a$a, reason: collision with other inner class name */
    private class C1967a implements t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.grpc.v1 f288819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f288820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i3 f288821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f288822d;

        public C1967a(io.grpc.v1 v1Var, i3 i3Var) {
            this.f288819a = (io.grpc.v1) com.google.common.base.j0.F(v1Var, "headers");
            this.f288821c = (i3) com.google.common.base.j0.F(i3Var, "statsTraceCtx");
        }

        @Override // io.grpc.internal.t0
        public t0 c(io.grpc.s sVar) {
            return this;
        }

        @Override // io.grpc.internal.t0
        public void close() {
            this.f288820b = true;
            com.google.common.base.j0.h0(this.f288822d != null, "Lack of request message. GET request is only supported for unary requests");
            a.this.B().c(this.f288819a, this.f288822d);
            this.f288822d = null;
            this.f288819a = null;
        }

        @Override // io.grpc.internal.t0
        public void dispose() {
            this.f288820b = true;
            this.f288822d = null;
            this.f288819a = null;
        }

        @Override // io.grpc.internal.t0
        public void e(int i10) {
        }

        @Override // io.grpc.internal.t0
        public void flush() {
        }

        @Override // io.grpc.internal.t0
        public t0 g(boolean z10) {
            return this;
        }

        @Override // io.grpc.internal.t0
        public void h(InputStream inputStream) {
            com.google.common.base.j0.h0(this.f288822d == null, "writePayload should not be called multiple times");
            try {
                this.f288822d = com.google.common.io.h.u(inputStream);
                this.f288821c.k(0);
                i3 i3Var = this.f288821c;
                byte[] bArr = this.f288822d;
                i3Var.l(0, bArr.length, bArr.length);
                this.f288821c.m(this.f288822d.length);
                this.f288821c.n(this.f288822d.length);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // io.grpc.internal.t0
        public boolean isClosed() {
            return this.f288820b;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface b {
        void a(io.grpc.y2 y2Var);

        void b(@fj.h r3 r3Var, boolean z10, boolean z11, int i10);

        void c(io.grpc.v1 v1Var, @fj.h byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class c extends d.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final i3 f288824j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f288825k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private t f288826l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f288827m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private io.grpc.a0 f288828n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f288829o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Runnable f288830p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private volatile boolean f288831q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f288832r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f288833s;

        /* JADX INFO: renamed from: io.grpc.internal.a$c$a, reason: collision with other inner class name */
        class RunnableC1968a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.y2 f288834a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t.a f288835b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.grpc.v1 f288836c;

            RunnableC1968a(io.grpc.y2 y2Var, t.a aVar, io.grpc.v1 v1Var) {
                this.f288834a = y2Var;
                this.f288835b = aVar;
                this.f288836c = v1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.K(this.f288834a, this.f288835b, this.f288836c);
            }
        }

        protected c(int i10, i3 i3Var, q3 q3Var) {
            super(i10, i3Var, q3Var);
            this.f288828n = io.grpc.a0.c();
            this.f288829o = false;
            this.f288824j = (i3) com.google.common.base.j0.F(i3Var, "statsTraceCtx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K(io.grpc.y2 y2Var, t.a aVar, io.grpc.v1 v1Var) {
            if (this.f288825k) {
                return;
            }
            this.f288825k = true;
            this.f288824j.q(y2Var);
            if (t() != null) {
                t().h(y2Var.r());
            }
            v().f(y2Var, aVar, v1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Q(io.grpc.a0 a0Var) {
            com.google.common.base.j0.h0(this.f288826l == null, "Already called start");
            this.f288828n = (io.grpc.a0) com.google.common.base.j0.F(a0Var, "decompressorRegistry");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void R(boolean z10) {
            this.f288827m = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void T() {
            this.f288831q = true;
        }

        protected void L(i2 i2Var) throws Throwable {
            com.google.common.base.j0.F(i2Var, androidx.constraintlayout.core.motion.utils.v.a.L);
            boolean z10 = true;
            try {
                if (this.f288832r) {
                    a.f288812g.log(Level.INFO, "Received data on closed stream");
                    i2Var.close();
                    return;
                } else {
                    try {
                        r(i2Var);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            if (z10) {
                i2Var.close();
            }
            throw th;
        }

        protected void M(io.grpc.v1 v1Var) {
            boolean z10 = true;
            com.google.common.base.j0.h0(!this.f288832r, "Received headers on closed stream");
            this.f288824j.a();
            String str = (String) v1Var.l(v0.f289902g);
            if (!this.f288827m || str == null) {
                z10 = false;
            } else if (str.equalsIgnoreCase("gzip")) {
                E(new w0());
            } else {
                if (!str.equalsIgnoreCase("identity")) {
                    i(io.grpc.y2.f291464s.u(String.format("Can't find full stream decompressor for %s", str)).e());
                    return;
                }
                z10 = false;
            }
            String str2 = (String) v1Var.l(v0.f289900e);
            if (str2 != null) {
                io.grpc.z zVarF = this.f288828n.f(str2);
                if (zVarF == null) {
                    i(io.grpc.y2.f291464s.u(String.format("Can't find decompressor for %s", str2)).e());
                    return;
                } else if (zVarF != io.grpc.p.b.f290837a) {
                    if (z10) {
                        i(io.grpc.y2.f291464s.u("Full stream and gRPC message encoding cannot both be set").e());
                        return;
                    }
                    D(zVarF);
                }
            }
            v().c(v1Var);
        }

        protected void N(io.grpc.v1 v1Var, io.grpc.y2 y2Var) {
            com.google.common.base.j0.F(y2Var, "status");
            com.google.common.base.j0.F(v1Var, v0.f289912q);
            if (this.f288832r) {
                a.f288812g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{y2Var, v1Var});
            } else {
                this.f288824j.b(v1Var);
                V(y2Var, false, v1Var);
            }
        }

        protected final boolean O() {
            return this.f288831q;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.d.a
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public final t v() {
            return this.f288826l;
        }

        @com.google.common.annotations.e
        public final void S(t tVar) {
            com.google.common.base.j0.h0(this.f288826l == null, "Already called setListener");
            this.f288826l = (t) com.google.common.base.j0.F(tVar, com.google.android.gms.common.internal.z.a.f106673a);
        }

        public final void U(io.grpc.y2 y2Var, t.a aVar, boolean z10, io.grpc.v1 v1Var) {
            com.google.common.base.j0.F(y2Var, "status");
            com.google.common.base.j0.F(v1Var, v0.f289912q);
            if (!this.f288832r || z10) {
                this.f288832r = true;
                this.f288833s = y2Var.r();
                z();
                if (this.f288829o) {
                    this.f288830p = null;
                    K(y2Var, aVar, v1Var);
                } else {
                    this.f288830p = new RunnableC1968a(y2Var, aVar, v1Var);
                    q(z10);
                }
            }
        }

        public final void V(io.grpc.y2 y2Var, boolean z10, io.grpc.v1 v1Var) {
            U(y2Var, t.a.PROCESSED, z10, v1Var);
        }

        @Override // io.grpc.internal.t1.b
        public void d(boolean z10) {
            com.google.common.base.j0.h0(this.f288832r, "status should have been reported on deframer closed");
            this.f288829o = true;
            if (this.f288833s && z10) {
                V(io.grpc.y2.f291464s.u("Encountered end-of-stream mid-frame"), true, new io.grpc.v1());
            }
            Runnable runnable = this.f288830p;
            if (runnable != null) {
                runnable.run();
                this.f288830p = null;
            }
        }
    }

    protected a(s3 s3Var, i3 i3Var, q3 q3Var, io.grpc.v1 v1Var, io.grpc.e eVar, boolean z10) {
        com.google.common.base.j0.F(v1Var, "headers");
        this.f288813a = (q3) com.google.common.base.j0.F(q3Var, "transportTracer");
        this.f288815c = v0.t(eVar);
        this.f288816d = z10;
        if (z10) {
            this.f288814b = new C1967a(v1Var, i3Var);
        } else {
            this.f288814b = new u1(this, s3Var, i3Var);
            this.f288817e = v1Var;
        }
    }

    protected abstract b B();

    protected q3 D() {
        return this.f288813a;
    }

    public final boolean E() {
        return this.f288815c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.d
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public abstract c A();

    @Override // io.grpc.internal.s
    public final void a(io.grpc.y2 y2Var) {
        com.google.common.base.j0.e(!y2Var.r(), "Should not cancel with OK status");
        this.f288818f = true;
        B().a(y2Var);
    }

    @Override // io.grpc.internal.s
    public void d(int i10) {
        A().F(i10);
    }

    @Override // io.grpc.internal.s
    public void e(int i10) {
        this.f288814b.e(i10);
    }

    @Override // io.grpc.internal.d, io.grpc.internal.j3
    public final boolean isReady() {
        return super.isReady() && !this.f288818f;
    }

    @Override // io.grpc.internal.s
    public final void k(boolean z10) {
        A().R(z10);
    }

    @Override // io.grpc.internal.s
    public final void o() {
        if (!A().O()) {
            A().T();
            x();
        }
    }

    @Override // io.grpc.internal.s
    public final void q(io.grpc.a0 a0Var) {
        A().Q(a0Var);
    }

    @Override // io.grpc.internal.s
    public final void t(b1 b1Var) {
        b1Var.b("remote_addr", getAttributes().b(io.grpc.n0.f290188a));
    }

    @Override // io.grpc.internal.s
    public void u(io.grpc.y yVar) {
        io.grpc.v1 v1Var = this.f288817e;
        io.grpc.v1.i<Long> iVar = v0.f289899d;
        v1Var.j(iVar);
        this.f288817e.w(iVar, Long.valueOf(Math.max(0L, yVar.r(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.internal.s
    public final void v(t tVar) {
        A().S(tVar);
        if (this.f288816d) {
            return;
        }
        B().c(this.f288817e, null);
        this.f288817e = null;
    }

    @Override // io.grpc.internal.u1.d
    public final void w(r3 r3Var, boolean z10, boolean z11, int i10) {
        com.google.common.base.j0.e(r3Var != null || z10, "null frame before EOS");
        B().b(r3Var, z10, z11, i10);
    }

    @Override // io.grpc.internal.d
    protected final t0 y() {
        return this.f288814b;
    }
}
