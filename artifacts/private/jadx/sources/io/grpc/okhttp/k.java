package io.grpc.okhttp;

import io.grpc.internal.i3;
import io.grpc.internal.q3;
import io.grpc.internal.y0;
import io.grpc.v1;
import io.grpc.w1;
import io.grpc.y2;
import java.io.EOFException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
class k extends io.grpc.internal.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final okio.l f290676p = new okio.l();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f290677q = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w1<?, ?> f290678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f290679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i3 f290680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f290681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f290682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f290683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final io.grpc.a f290684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f290685o;

    class a implements io.grpc.internal.a.b {
        a() {
        }

        @Override // io.grpc.internal.a.b
        public void a(y2 y2Var) {
            io.perfmark.f fVarZ = io.perfmark.c.z("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (k.this.f290682l.A) {
                    try {
                        k.this.f290682l.i0(y2Var, true, null);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
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

        /* JADX WARN: Bottom block not found for handler: all -> 0x000f */
        @Override // io.grpc.internal.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(io.grpc.internal.r3 r5, boolean r6, boolean r7, int r8) {
            /*
                r4 = this;
                java.lang.String r0 = "OkHttpClientStream$Sink.writeFrame"
                io.perfmark.f r0 = io.perfmark.c.z(r0)
                r3 = 7
                if (r5 != 0) goto L11
                r3 = 0
                okio.l r5 = io.grpc.okhttp.k.P()     // Catch: java.lang.Throwable -> Lf
                goto L23
            Lf:
                r4 = move-exception
                goto L4d
            L11:
                io.grpc.okhttp.g0 r5 = (io.grpc.okhttp.g0) r5     // Catch: java.lang.Throwable -> Lf
                okio.l r5 = r5.c()     // Catch: java.lang.Throwable -> Lf
                long r1 = r5.size()     // Catch: java.lang.Throwable -> Lf
                int r1 = (int) r1     // Catch: java.lang.Throwable -> Lf
                if (r1 <= 0) goto L23
                io.grpc.okhttp.k r2 = io.grpc.okhttp.k.this     // Catch: java.lang.Throwable -> Lf
                io.grpc.okhttp.k.Q(r2, r1)     // Catch: java.lang.Throwable -> Lf
            L23:
                io.grpc.okhttp.k r1 = io.grpc.okhttp.k.this     // Catch: java.lang.Throwable -> Lf
                io.grpc.okhttp.k$b r1 = io.grpc.okhttp.k.O(r1)     // Catch: java.lang.Throwable -> Lf
                r3 = 2
                java.lang.Object r1 = io.grpc.okhttp.k.b.e0(r1)     // Catch: java.lang.Throwable -> Lf
                r3 = 3
                monitor-enter(r1)     // Catch: java.lang.Throwable -> Lf
                io.grpc.okhttp.k r2 = io.grpc.okhttp.k.this     // Catch: java.lang.Throwable -> L4a
                io.grpc.okhttp.k$b r2 = io.grpc.okhttp.k.O(r2)     // Catch: java.lang.Throwable -> L4a
                io.grpc.okhttp.k.b.g0(r2, r5, r6, r7)     // Catch: java.lang.Throwable -> L4a
                io.grpc.okhttp.k r4 = io.grpc.okhttp.k.this     // Catch: java.lang.Throwable -> L4a
                io.grpc.internal.q3 r4 = io.grpc.okhttp.k.R(r4)     // Catch: java.lang.Throwable -> L4a
                r3 = 3
                r4.f(r8)     // Catch: java.lang.Throwable -> L4a
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
                if (r0 == 0) goto L49
                r0.close()
            L49:
                return
            L4a:
                r4 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
                throw r4     // Catch: java.lang.Throwable -> Lf
            L4d:
                r3 = 5
                if (r0 == 0) goto L59
                r3 = 4
                r0.close()     // Catch: java.lang.Throwable -> L55
                goto L59
            L55:
                r5 = move-exception
                r4.addSuppressed(r5)
            L59:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.k.a.b(io.grpc.internal.r3, boolean, boolean, int):void");
        }

        @Override // io.grpc.internal.a.b
        public void c(v1 v1Var, byte[] bArr) {
            io.perfmark.f fVarZ = io.perfmark.c.z("OkHttpClientStream$Sink.writeHeaders");
            try {
                String str = "/" + k.this.f290678h.f();
                if (bArr != null) {
                    k.this.f290685o = true;
                    str = str + com.planner5d.library.model.payments.a.f222474i + com.google.common.io.b.d().l(bArr);
                }
                synchronized (k.this.f290682l.A) {
                    k.this.f290682l.n0(v1Var, str);
                }
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

    class b extends y0 implements i0.b {
        private final Object A;

        @gj.a(io.sentry.protocol.z.b.f306551r)
        private List<io.grpc.okhttp.internal.framed.d> B;

        @gj.a(io.sentry.protocol.z.b.f306551r)
        private okio.l C;
        private boolean D;
        private boolean E;

        @gj.a(io.sentry.protocol.z.b.f306551r)
        private boolean F;

        @gj.a(io.sentry.protocol.z.b.f306551r)
        private int G;

        @gj.a(io.sentry.protocol.z.b.f306551r)
        private int H;

        @gj.a(io.sentry.protocol.z.b.f306551r)
        private final io.grpc.okhttp.b I;

        @gj.a(io.sentry.protocol.z.b.f306551r)
        private final i0 J;

        @gj.a(io.sentry.protocol.z.b.f306551r)
        private final l K;

        @gj.a(io.sentry.protocol.z.b.f306551r)
        private boolean L;
        private final io.perfmark.e M;

        @gj.a(io.sentry.protocol.z.b.f306551r)
        private i0.c N;
        private int O;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final int f290687z;

        public b(int i10, i3 i3Var, Object obj, io.grpc.okhttp.b bVar, i0 i0Var, l lVar, int i11, String str) {
            super(i10, i3Var, k.this.D());
            this.C = new okio.l();
            this.D = false;
            this.E = false;
            this.F = false;
            this.L = true;
            this.O = -1;
            this.A = com.google.common.base.j0.F(obj, io.sentry.protocol.z.b.f306551r);
            this.I = bVar;
            this.J = i0Var;
            this.K = lVar;
            this.G = i11;
            this.H = i11;
            this.f290687z = i11;
            this.M = io.perfmark.c.h(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void i0(y2 y2Var, boolean z10, v1 v1Var) throws EOFException {
            if (this.F) {
                return;
            }
            this.F = true;
            if (!this.L) {
                this.K.V(j0(), y2Var, io.grpc.internal.t.a.PROCESSED, z10, io.grpc.okhttp.internal.framed.a.CANCEL, v1Var);
                return;
            }
            this.K.k0(k.this);
            this.B = null;
            this.C.c();
            this.L = false;
            if (v1Var == null) {
                v1Var = new v1();
            }
            V(y2Var, true, v1Var);
        }

        @gj.a(io.sentry.protocol.z.b.f306551r)
        private void k0() {
            if (O()) {
                this.K.V(j0(), null, io.grpc.internal.t.a.PROCESSED, false, null, null);
            } else {
                this.K.V(j0(), null, io.grpc.internal.t.a.PROCESSED, false, io.grpc.okhttp.internal.framed.a.CANCEL, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void l0(okio.l lVar, boolean z10, boolean z11) {
            if (this.F) {
                return;
            }
            if (!this.L) {
                com.google.common.base.j0.h0(j0() != -1, "streamId should be set");
                this.J.d(z10, this.N, lVar, z11);
            } else {
                this.C.Ga(lVar, (int) lVar.size());
                this.D |= z10;
                this.E |= z11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void n0(v1 v1Var, String str) {
            this.B = e.c(v1Var, str, k.this.f290681k, k.this.f290679i, k.this.f290685o, this.K.e0());
            this.K.s0(k.this);
        }

        @Override // io.grpc.internal.y0
        @gj.a(io.sentry.protocol.z.b.f306551r)
        protected void X(y2 y2Var, boolean z10, v1 v1Var) throws EOFException {
            i0(y2Var, z10, v1Var);
        }

        @Override // io.grpc.internal.t1.b
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void b(int i10) {
            int i11 = this.H - i10;
            this.H = i11;
            float f10 = i11;
            int i12 = this.f290687z;
            if (f10 <= i12 * 0.5f) {
                int i13 = i12 - i11;
                this.G += i13;
                this.H = i11 + i13;
                this.I.c0(j0(), i13);
            }
        }

        @Override // io.grpc.internal.y0, io.grpc.internal.a.c, io.grpc.internal.t1.b
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void d(boolean z10) {
            k0();
            super.d(z10);
        }

        @Override // io.grpc.internal.g.d
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void f(Runnable runnable) {
            synchronized (this.A) {
                try {
                    runnable.run();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.t1.b
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void i(Throwable th2) throws EOFException {
            X(y2.n(th2), true, new v1());
        }

        int j0() {
            return this.O;
        }

        i0.c l() {
            i0.c cVar;
            synchronized (this.A) {
                try {
                    cVar = this.N;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return cVar;
        }

        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void m0(int i10) {
            com.google.common.base.j0.n0(this.O == -1, "the stream has been started with id %s", i10);
            this.O = i10;
            this.N = this.J.c(this, i10);
            k.this.f290682l.y();
            if (this.L) {
                boolean z10 = false;
                this.I.df(k.this.f290685o, false, this.O, 0, this.B);
                k.this.f290680j.c();
                this.B = null;
                if (this.C.size() > 0) {
                    this.J.d(this.D, this.N, this.C, this.E);
                }
                this.L = false;
            }
        }

        io.perfmark.e o0() {
            return this.M;
        }

        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void p0(okio.l lVar, boolean z10, int i10) throws Throwable {
            int size = this.G - (((int) lVar.size()) + i10);
            this.G = size;
            this.H -= i10;
            if (size >= 0) {
                super.a0(new o(lVar), z10);
            } else {
                this.I.M1(j0(), io.grpc.okhttp.internal.framed.a.FLOW_CONTROL_ERROR);
                this.K.V(j0(), y2.f291464s.u("Received data size exceeded our receiving window size"), io.grpc.internal.t.a.PROCESSED, false, null, null);
            }
        }

        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void q0(List<io.grpc.okhttp.internal.framed.d> list, boolean z10) {
            if (z10) {
                c0(n0.d(list));
            } else {
                b0(n0.a(list));
            }
        }

        @Override // io.grpc.internal.d.a
        @gj.a(io.sentry.protocol.z.b.f306551r)
        protected void y() {
            super.y();
            t().d();
        }
    }

    k(w1<?, ?> w1Var, v1 v1Var, io.grpc.okhttp.b bVar, l lVar, i0 i0Var, Object obj, int i10, int i11, String str, String str2, i3 i3Var, q3 q3Var, io.grpc.e eVar, boolean z10) {
        super(new h0(), i3Var, q3Var, v1Var, eVar, z10 && w1Var.n());
        this.f290683m = new a();
        this.f290685o = false;
        this.f290680j = (i3) com.google.common.base.j0.F(i3Var, "statsTraceCtx");
        this.f290678h = w1Var;
        this.f290681k = str;
        this.f290679i = str2;
        this.f290684n = lVar.getAttributes();
        this.f290682l = new b(i10, i3Var, obj, bVar, i0Var, lVar, i11, w1Var.f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public a B() {
        return this.f290683m;
    }

    public w1.d S() {
        return this.f290678h.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.a
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public b A() {
        return this.f290682l;
    }

    boolean U() {
        return this.f290685o;
    }

    @Override // io.grpc.internal.s
    public io.grpc.a getAttributes() {
        return this.f290684n;
    }

    @Override // io.grpc.internal.s
    public void s(String str) {
        this.f290681k = (String) com.google.common.base.j0.F(str, "authority");
    }
}
