package io.grpc.internal;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
final class u2<ReqT, RespT> extends io.grpc.k2<ReqT, RespT> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f289869n = Logger.getLogger(u2.class.getName());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @com.google.common.annotations.e
    static final String f289870o = "Too many responses";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @com.google.common.annotations.e
    static final String f289871p = "Completed without a response";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z2 f289872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.w1<ReqT, RespT> f289873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.perfmark.e f289874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.grpc.w.f f289875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f289876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.grpc.a0 f289877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.grpc.t f289878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o f289879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f289880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f289881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f289882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private io.grpc.s f289883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f289884m;

    @com.google.common.annotations.e
    static final class a<ReqT> implements a3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u2<ReqT, ?> f289885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.k2.a<ReqT> f289886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.grpc.w.f f289887c;

        /* JADX INFO: renamed from: io.grpc.internal.u2$a$a, reason: collision with other inner class name */
        class C1975a implements io.grpc.w.g {
            C1975a() {
            }

            @Override // io.grpc.w.g
            public void a(io.grpc.w wVar) {
                if (wVar.e() != null) {
                    a.this.f289885a.f289880i = true;
                }
            }
        }

        public a(u2<ReqT, ?> u2Var, io.grpc.k2.a<ReqT> aVar, io.grpc.w.f fVar) {
            this.f289885a = (u2) com.google.common.base.j0.F(u2Var, androidx.core.app.w.E0);
            this.f289886b = (io.grpc.k2.a) com.google.common.base.j0.F(aVar, "listener must not be null");
            io.grpc.w.f fVar2 = (io.grpc.w.f) com.google.common.base.j0.F(fVar, "context");
            this.f289887c = fVar2;
            fVar2.a(new C1975a(), com.google.common.util.concurrent.a2.c());
        }

        private void h(io.grpc.y2 y2Var) {
            io.grpc.a3 a3VarA = null;
            try {
                if (y2Var.r()) {
                    this.f289886b.b();
                } else {
                    ((u2) this.f289885a).f289880i = true;
                    this.f289886b.a();
                    a3VarA = io.grpc.l1.a(io.grpc.y2.f291451f.u("RPC cancelled"), null, false);
                }
            } finally {
                this.f289887c.y0(null);
            }
        }

        private void i(k3.a aVar) {
            if (((u2) this.f289885a).f289880i) {
                v0.e(aVar);
                return;
            }
            while (true) {
                try {
                    InputStream next = aVar.next();
                    if (next == null) {
                        return;
                    }
                    try {
                        this.f289886b.d((ReqT) ((u2) this.f289885a).f289873b.r(next));
                        next.close();
                    } catch (Throwable th2) {
                        v0.f(next);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    v0.e(aVar);
                    com.google.common.base.v0.w(th3);
                    throw new RuntimeException(th3);
                }
            }
        }

        @Override // io.grpc.internal.k3
        public void a(k3.a aVar) {
            io.perfmark.f fVarZ = io.perfmark.c.z("ServerStreamListener.messagesAvailable");
            try {
                io.perfmark.c.a(((u2) this.f289885a).f289874c);
                i(aVar);
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

        @Override // io.grpc.internal.a3
        public void b(io.grpc.y2 y2Var) {
            io.perfmark.f fVarZ = io.perfmark.c.z("ServerStreamListener.closed");
            try {
                io.perfmark.c.a(((u2) this.f289885a).f289874c);
                h(y2Var);
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

        @Override // io.grpc.internal.a3
        public void d() {
            io.perfmark.f fVarZ = io.perfmark.c.z("ServerStreamListener.halfClosed");
            try {
                io.perfmark.c.a(((u2) this.f289885a).f289874c);
                if (!((u2) this.f289885a).f289880i) {
                    this.f289886b.c();
                    if (fVarZ != null) {
                        fVarZ.close();
                    }
                } else if (fVarZ != null) {
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
            io.perfmark.f fVarZ = io.perfmark.c.z("ServerStreamListener.onReady");
            try {
                io.perfmark.c.a(((u2) this.f289885a).f289874c);
                if (((u2) this.f289885a).f289880i) {
                    if (fVarZ != null) {
                        fVarZ.close();
                    }
                } else {
                    this.f289886b.e();
                    if (fVarZ != null) {
                        fVarZ.close();
                    }
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

    u2(z2 z2Var, io.grpc.w1<ReqT, RespT> w1Var, io.grpc.v1 v1Var, io.grpc.w.f fVar, io.grpc.a0 a0Var, io.grpc.t tVar, o oVar, io.perfmark.e eVar) {
        this.f289872a = z2Var;
        this.f289873b = w1Var;
        this.f289875d = fVar;
        this.f289876e = (byte[]) v1Var.l(v0.f289901f);
        this.f289877f = a0Var;
        this.f289878g = tVar;
        this.f289879h = oVar;
        oVar.c();
        this.f289874c = eVar;
    }

    private void q(io.grpc.y2 y2Var, io.grpc.v1 v1Var) {
        com.google.common.base.j0.h0(!this.f289882k, "call already closed");
        try {
            this.f289882k = true;
            if (y2Var.r() && this.f289873b.l().l() && !this.f289884m) {
                r(io.grpc.y2.f291464s.u(f289871p).e());
            } else {
                this.f289872a.p(y2Var, v1Var);
            }
            o oVar = this.f289879h;
            boolean zR = y2Var.r();
        } finally {
            this.f289879h.b(y2Var.r());
        }
    }

    private void r(Throwable th2) {
        f289869n.log(Level.WARNING, "Cancelling the stream because of internal error", th2);
        this.f289872a.a(th2 instanceof io.grpc.a3 ? ((io.grpc.a3) th2).a() : io.grpc.y2.f291464s.t(th2).u("Internal error so cancelling stream."));
        this.f289879h.b(false);
    }

    private void t(io.grpc.v1 v1Var) {
        byte[] bArr;
        com.google.common.base.j0.h0(!this.f289881j, "sendHeaders has already been called");
        com.google.common.base.j0.h0(!this.f289882k, "call is closed");
        v1Var.j(v0.f289904i);
        io.grpc.v1.i<String> iVar = v0.f289900e;
        v1Var.j(iVar);
        if (this.f289883l == null || (bArr = this.f289876e) == null || !v0.r(v0.f289920y.n(new String(bArr, v0.f289898c)), this.f289883l.B())) {
            this.f289883l = io.grpc.p.b.f290837a;
        }
        v1Var.w(iVar, this.f289883l.B());
        this.f289872a.c(this.f289883l);
        io.grpc.v1.i<byte[]> iVar2 = v0.f289901f;
        v1Var.j(iVar2);
        byte[] bArrA = io.grpc.y0.a(this.f289877f);
        if (bArrA.length != 0) {
            v1Var.w(iVar2, bArrA);
        }
        this.f289881j = true;
        this.f289872a.h(v1Var, !d().l().l());
    }

    private void u(RespT respt) {
        com.google.common.base.j0.h0(this.f289881j, "sendHeaders has not been called");
        com.google.common.base.j0.h0(!this.f289882k, "call is closed");
        if (this.f289873b.l().l() && this.f289884m) {
            r(io.grpc.y2.f291464s.u(f289870o).e());
            return;
        }
        this.f289884m = true;
        try {
            this.f289872a.i(this.f289873b.v(respt));
            if (d().l().l()) {
                return;
            }
            this.f289872a.flush();
        } catch (Error e10) {
            a(io.grpc.y2.f291451f.u("Server sendMessage() failed with Error"), new io.grpc.v1());
            throw e10;
        } catch (RuntimeException e11) {
            r(e11);
        }
    }

    @Override // io.grpc.k2
    public void a(io.grpc.y2 y2Var, io.grpc.v1 v1Var) {
        io.perfmark.f fVarZ = io.perfmark.c.z("ServerCall.close");
        try {
            io.perfmark.c.a(this.f289874c);
            q(y2Var, v1Var);
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

    @Override // io.grpc.k2
    public io.grpc.a b() {
        return this.f289872a.getAttributes();
    }

    @Override // io.grpc.k2
    public String c() {
        return this.f289872a.m();
    }

    @Override // io.grpc.k2
    public io.grpc.w1<ReqT, RespT> d() {
        return this.f289873b;
    }

    @Override // io.grpc.k2
    public io.grpc.h2 e() {
        io.grpc.h2 h2Var;
        io.grpc.a aVarB = b();
        return (aVarB == null || (h2Var = (io.grpc.h2) aVarB.b(u0.f289846a)) == null) ? super.e() : h2Var;
    }

    @Override // io.grpc.k2
    public boolean f() {
        return this.f289880i;
    }

    @Override // io.grpc.k2
    public boolean g() {
        if (this.f289882k) {
            return false;
        }
        return this.f289872a.isReady();
    }

    @Override // io.grpc.k2
    public void h(int i10) {
        io.perfmark.f fVarZ = io.perfmark.c.z("ServerCall.request");
        try {
            io.perfmark.c.a(this.f289874c);
            this.f289872a.b(i10);
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

    @Override // io.grpc.k2
    public void i(io.grpc.v1 v1Var) {
        io.perfmark.f fVarZ = io.perfmark.c.z("ServerCall.sendHeaders");
        try {
            io.perfmark.c.a(this.f289874c);
            t(v1Var);
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

    @Override // io.grpc.k2
    public void j(RespT respt) {
        io.perfmark.f fVarZ = io.perfmark.c.z("ServerCall.sendMessage");
        try {
            io.perfmark.c.a(this.f289874c);
            u(respt);
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

    @Override // io.grpc.k2
    public void k(String str) {
        com.google.common.base.j0.h0(!this.f289881j, "sendHeaders has been called");
        io.grpc.s sVarB = this.f289878g.b(str);
        this.f289883l = sVarB;
        com.google.common.base.j0.u(sVarB != null, "Unable to find compressor by name %s", str);
    }

    @Override // io.grpc.k2
    public void l(boolean z10) {
        this.f289872a.g(z10);
    }

    a3 s(io.grpc.k2.a<ReqT> aVar) {
        return new a(this, aVar, this.f289875d);
    }
}
