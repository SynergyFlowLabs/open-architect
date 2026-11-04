package io.grpc.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d implements j3 {

    public static abstract class a implements f.h, t1.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @com.google.common.annotations.e
        public static final int f288963i = 32768;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b0 f288964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f288965b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i3 f288966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final q3 f288967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final t1 f288968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @gj.a("onReadyLock")
        private int f288969f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @gj.a("onReadyLock")
        private boolean f288970g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @gj.a("onReadyLock")
        private boolean f288971h;

        /* JADX INFO: renamed from: io.grpc.internal.d$a$a, reason: collision with other inner class name */
        class RunnableC1970a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.perfmark.b f288972a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f288973b;

            RunnableC1970a(io.perfmark.b bVar, int i10) {
                this.f288972a = bVar;
                this.f288973b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    io.perfmark.f fVarZ = io.perfmark.c.z("AbstractStream.request");
                    try {
                        io.perfmark.c.n(this.f288972a);
                        a.this.f288964a.b(this.f288973b);
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
                    a.this.i(th4);
                }
            }
        }

        protected a(int i10, i3 i3Var, q3 q3Var) {
            this.f288966c = (i3) com.google.common.base.j0.F(i3Var, "statsTraceCtx");
            this.f288967d = (q3) com.google.common.base.j0.F(q3Var, "transportTracer");
            t1 t1Var = new t1(this, io.grpc.p.b.f290837a, i10, i3Var, q3Var);
            this.f288968e = t1Var;
            this.f288964a = t1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B(int i10) {
            if (!(this.f288964a instanceof m3)) {
                f(new RunnableC1970a(io.perfmark.c.o(), i10));
                return;
            }
            io.perfmark.f fVarZ = io.perfmark.c.z("AbstractStream.request");
            try {
                this.f288964a.b(i10);
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

        /* JADX INFO: Access modifiers changed from: private */
        public boolean u() {
            boolean z10;
            synchronized (this.f288965b) {
                try {
                    z10 = this.f288970g && this.f288969f < 32768 && !this.f288971h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        private void w() {
            boolean zU;
            synchronized (this.f288965b) {
                try {
                    zU = u();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zU) {
                v().e();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x(int i10) {
            synchronized (this.f288965b) {
                this.f288969f += i10;
            }
        }

        final void A() {
            this.f288968e.x(this);
            this.f288964a = this.f288968e;
        }

        @com.google.common.annotations.e
        public final void C(int i10) {
            B(i10);
        }

        protected final void D(io.grpc.z zVar) {
            this.f288964a.f(zVar);
        }

        protected void E(w0 w0Var) {
            this.f288968e.h(w0Var);
            this.f288964a = new f(this, this, this.f288968e);
        }

        final void F(int i10) {
            this.f288964a.d(i10);
        }

        @Override // io.grpc.internal.t1.b
        public void a(k3.a aVar) {
            v().a(aVar);
        }

        public final void h(int i10) {
            boolean z10;
            synchronized (this.f288965b) {
                try {
                    com.google.common.base.j0.h0(this.f288970g, "onStreamAllocated was not called, but it seems the stream is active");
                    int i11 = this.f288969f;
                    z10 = false;
                    boolean z11 = i11 < 32768;
                    int i12 = i11 - i10;
                    this.f288969f = i12;
                    boolean z12 = i12 < 32768;
                    if (!z11 && z12) {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                w();
            }
        }

        protected final void q(boolean z10) {
            if (z10) {
                this.f288964a.close();
            } else {
                this.f288964a.j();
            }
        }

        protected final void r(i2 i2Var) {
            try {
                this.f288964a.g(i2Var);
            } catch (Throwable th2) {
                i(th2);
            }
        }

        public final i3 s() {
            return this.f288966c;
        }

        protected q3 t() {
            return this.f288967d;
        }

        protected abstract k3 v();

        protected void y() {
            com.google.common.base.j0.g0(v() != null);
            synchronized (this.f288965b) {
                com.google.common.base.j0.h0(!this.f288970g, "Already allocated");
                this.f288970g = true;
            }
            w();
        }

        protected final void z() {
            synchronized (this.f288965b) {
                try {
                    this.f288971h = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    protected abstract a A();

    @Override // io.grpc.internal.j3
    public final void b(int i10) {
        A().B(i10);
    }

    @Override // io.grpc.internal.j3
    public final void c(io.grpc.s sVar) {
        y().c((io.grpc.s) com.google.common.base.j0.F(sVar, "compressor"));
    }

    @Override // io.grpc.internal.j3
    public final void flush() {
        if (!y().isClosed()) {
            y().flush();
        }
    }

    @Override // io.grpc.internal.j3
    public final void g(boolean z10) {
        y().g(z10);
    }

    @Override // io.grpc.internal.j3
    public final void i(InputStream inputStream) {
        com.google.common.base.j0.F(inputStream, "message");
        try {
            if (!y().isClosed()) {
                y().h(inputStream);
            }
            v0.f(inputStream);
        } catch (Throwable th2) {
            v0.f(inputStream);
            throw th2;
        }
    }

    @Override // io.grpc.internal.j3
    public boolean isReady() {
        return A().u();
    }

    @Override // io.grpc.internal.j3
    public void j() {
        A().A();
    }

    protected final void x() {
        y().close();
    }

    protected abstract t0 y();

    protected final void z(int i10) {
        A().x(i10);
    }
}
