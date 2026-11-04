package io.grpc.okhttp;

import io.grpc.internal.i3;
import io.grpc.internal.q3;
import io.grpc.internal.r3;
import io.grpc.v1;
import io.grpc.y2;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
class u extends io.grpc.internal.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f290816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f290817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f290818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q3 f290819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.grpc.a f290820j;

    class a implements io.grpc.internal.c.a {
        a() {
        }

        @Override // io.grpc.internal.c.a
        public void a(y2 y2Var) {
            io.perfmark.f fVarZ = io.perfmark.c.z("OkHttpServerStream$Sink.cancel");
            try {
                synchronized (u.this.f290817g.f290825u) {
                    try {
                        u.this.f290817g.V(io.grpc.okhttp.internal.framed.a.CANCEL, y2Var);
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

        @Override // io.grpc.internal.c.a
        public void h(v1 v1Var, boolean z10) {
            io.perfmark.f fVarZ = io.perfmark.c.z("OkHttpServerStream$Sink.writeHeaders");
            try {
                List<io.grpc.okhttp.internal.framed.d> listD = e.d(v1Var);
                synchronized (u.this.f290817g.f290825u) {
                    try {
                        u.this.f290817g.X(listD);
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

        @Override // io.grpc.internal.c.a
        public void i(r3 r3Var, boolean z10, int i10) {
            io.perfmark.f fVarZ = io.perfmark.c.z("OkHttpServerStream$Sink.writeFrame");
            try {
                okio.l lVarC = ((g0) r3Var).c();
                int size = (int) lVarC.size();
                if (size > 0) {
                    u.this.z(size);
                }
                synchronized (u.this.f290817g.f290825u) {
                    try {
                        u.this.f290817g.W(lVarC, z10);
                        u.this.f290819i.f(i10);
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

        @Override // io.grpc.internal.c.a
        public void j(v1 v1Var, boolean z10, y2 y2Var) {
            io.perfmark.f fVarZ = io.perfmark.c.z("OkHttpServerStream$Sink.writeTrailers");
            try {
                List<io.grpc.okhttp.internal.framed.d> listE = e.e(v1Var, z10);
                synchronized (u.this.f290817g.f290825u) {
                    try {
                        u.this.f290817g.Y(listE);
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
    }

    static class b extends io.grpc.internal.c.b implements i0.b, c0.f {

        @gj.a(io.sentry.protocol.z.b.f306551r)
        private boolean A;
        private final io.perfmark.e B;
        private final i0.c C;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        private final c0 f290822r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f290823s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f290824t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final Object f290825u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        private boolean f290826v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        private int f290827w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        private int f290828x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        private final io.grpc.okhttp.b f290829y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        private final i0 f290830z;

        public b(c0 c0Var, int i10, int i11, i3 i3Var, Object obj, io.grpc.okhttp.b bVar, i0 i0Var, int i12, q3 q3Var, String str) {
            super(i11, i3Var, q3Var);
            this.f290826v = false;
            this.f290822r = (c0) com.google.common.base.j0.F(c0Var, androidx.core.app.w.O0);
            this.f290823s = i10;
            this.f290825u = com.google.common.base.j0.F(obj, io.sentry.protocol.z.b.f306551r);
            this.f290829y = bVar;
            this.f290830z = i0Var;
            this.f290827w = i12;
            this.f290828x = i12;
            this.f290824t = i12;
            this.B = io.perfmark.c.h(str);
            this.C = i0Var.c(this, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void V(io.grpc.okhttp.internal.framed.a aVar, y2 y2Var) {
            if (this.f290826v) {
                return;
            }
            this.f290826v = true;
            this.f290829y.M1(this.f290823s, aVar);
            g(y2Var);
            this.f290822r.l0(this.f290823s, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void W(okio.l lVar, boolean z10) {
            if (this.f290826v) {
                return;
            }
            this.f290830z.d(false, this.C, lVar, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void X(List<io.grpc.okhttp.internal.framed.d> list) {
            this.f290829y.C8(false, this.f290823s, list);
            this.f290829y.flush();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void Y(final List<io.grpc.okhttp.internal.framed.d> list) {
            this.f290830z.g(this.C, new Runnable() { // from class: io.grpc.okhttp.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f290831a.Z(list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z(List<io.grpc.okhttp.internal.framed.d> list) {
            synchronized (this.f290825u) {
                try {
                    this.f290829y.C8(true, this.f290823s, list);
                    if (!this.A) {
                        this.f290829y.M1(this.f290823s, io.grpc.okhttp.internal.framed.a.NO_ERROR);
                    }
                    this.f290822r.l0(this.f290823s, true);
                    J();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.t1.b
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void b(int i10) {
            int i11 = this.f290828x - i10;
            this.f290828x = i11;
            float f10 = i11;
            int i12 = this.f290824t;
            if (f10 <= i12 * 0.5f) {
                int i13 = i12 - i11;
                this.f290827w += i13;
                this.f290828x = i11 + i13;
                this.f290829y.c0(this.f290823s, i13);
                this.f290829y.flush();
            }
        }

        @Override // io.grpc.okhttp.c0.f
        public int c() {
            int i10;
            synchronized (this.f290825u) {
                try {
                    i10 = this.f290827w;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        @Override // io.grpc.okhttp.c0.f
        public void e(okio.l lVar, int i10, int i11, boolean z10) {
            synchronized (this.f290825u) {
                try {
                    io.perfmark.c.k("OkHttpServerTransport$FrameHandler.data", this.B);
                    if (z10) {
                        this.A = true;
                    }
                    this.f290827w -= i10 + i11;
                    this.f290828x -= i11;
                    super.K(new o(lVar), z10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.g.d
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void f(Runnable runnable) {
            synchronized (this.f290825u) {
                try {
                    runnable.run();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.t1.b
        @gj.a(io.sentry.protocol.z.b.f306551r)
        public void i(Throwable th2) {
            V(io.grpc.okhttp.internal.framed.a.INTERNAL_ERROR, y2.n(th2));
        }

        @Override // io.grpc.okhttp.c0.f
        public void j(y2 y2Var) {
            io.perfmark.c.k("OkHttpServerTransport$FrameHandler.rstStream", this.B);
            g(y2Var);
        }

        @Override // io.grpc.okhttp.c0.f
        public boolean k() {
            boolean z10;
            synchronized (this.f290825u) {
                try {
                    z10 = this.A;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        @Override // io.grpc.okhttp.c0.f
        public i0.c l() {
            return this.C;
        }
    }

    public u(b bVar, io.grpc.a aVar, String str, i3 i3Var, q3 q3Var) {
        super(new h0(), i3Var);
        this.f290818h = new a();
        this.f290817g = (b) com.google.common.base.j0.F(bVar, "state");
        this.f290820j = (io.grpc.a) com.google.common.base.j0.F(aVar, "transportAttrs");
        this.f290816f = str;
        this.f290819i = (q3) com.google.common.base.j0.F(q3Var, "transportTracer");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.c
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a B() {
        return this.f290818h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.c
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public b A() {
        return this.f290817g;
    }

    @Override // io.grpc.internal.c, io.grpc.internal.z2
    public io.grpc.a getAttributes() {
        return this.f290820j;
    }

    @Override // io.grpc.internal.z2
    public int l() {
        return this.f290817g.f290823s;
    }

    @Override // io.grpc.internal.c, io.grpc.internal.z2
    public String m() {
        return this.f290816f;
    }
}
