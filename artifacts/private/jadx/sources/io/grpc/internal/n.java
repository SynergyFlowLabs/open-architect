package io.grpc.internal;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
final class n implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f289461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.d f289462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f289463c;

    private class a extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f289464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f289465b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile io.grpc.y2 f289467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @gj.a("this")
        private io.grpc.y2 f289468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @gj.a("this")
        private io.grpc.y2 f289469f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f289466c = new AtomicInteger(androidx.media3.common.j.f60676f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final v1.a f289470g = new C1973a();

        /* JADX INFO: renamed from: io.grpc.internal.n$a$a, reason: collision with other inner class name */
        class C1973a implements v1.a {
            C1973a() {
            }

            @Override // io.grpc.internal.v1.a
            public void onComplete() {
                if (a.this.f289466c.decrementAndGet() == 0) {
                    a.this.m();
                }
            }
        }

        class b extends io.grpc.d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.w1 f289473a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.grpc.e f289474b;

            b(io.grpc.w1 w1Var, io.grpc.e eVar) {
                this.f289473a = w1Var;
                this.f289474b = eVar;
            }

            @Override // io.grpc.d.b
            public String a() {
                return (String) com.google.common.base.b0.a(this.f289474b.a(), a.this.f289465b);
            }

            @Override // io.grpc.d.b
            public io.grpc.e b() {
                return this.f289474b;
            }

            @Override // io.grpc.d.b
            public io.grpc.w1<?, ?> c() {
                return this.f289473a;
            }

            @Override // io.grpc.d.b
            public io.grpc.h2 d() {
                return (io.grpc.h2) com.google.common.base.b0.a((io.grpc.h2) a.this.f289464a.getAttributes().b(u0.f289846a), io.grpc.h2.NONE);
            }

            @Override // io.grpc.d.b
            public io.grpc.a e() {
                return a.this.f289464a.getAttributes();
            }
        }

        a(x xVar, String str) {
            this.f289464a = (x) com.google.common.base.j0.F(xVar, "delegate");
            this.f289465b = (String) com.google.common.base.j0.F(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m() {
            synchronized (this) {
                try {
                    if (this.f289466c.get() != 0) {
                        return;
                    }
                    io.grpc.y2 y2Var = this.f289468e;
                    io.grpc.y2 y2Var2 = this.f289469f;
                    this.f289468e = null;
                    this.f289469f = null;
                    if (y2Var != null) {
                        super.h(y2Var);
                    }
                    if (y2Var2 != null) {
                        super.a(y2Var2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.o0, io.grpc.internal.r1
        public void a(io.grpc.y2 y2Var) {
            com.google.common.base.j0.F(y2Var, "status");
            synchronized (this) {
                try {
                    if (this.f289466c.get() < 0) {
                        this.f289467d = y2Var;
                        this.f289466c.addAndGet(Integer.MAX_VALUE);
                    } else if (this.f289469f != null) {
                        return;
                    }
                    if (this.f289466c.get() != 0) {
                        this.f289469f = y2Var;
                    } else {
                        super.a(y2Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.o0
        protected x b() {
            return this.f289464a;
        }

        @Override // io.grpc.internal.o0, io.grpc.internal.u
        public s e(io.grpc.w1<?, ?> w1Var, io.grpc.v1 v1Var, io.grpc.e eVar, io.grpc.n[] nVarArr) {
            io.grpc.d dVarC = eVar.c();
            if (dVarC == null) {
                dVarC = n.this.f289462b;
            } else if (n.this.f289462b != null) {
                dVarC = new io.grpc.q(n.this.f289462b, dVarC);
            }
            if (dVarC == null) {
                return this.f289466c.get() >= 0 ? new i0(this.f289467d, nVarArr) : this.f289464a.e(w1Var, v1Var, eVar, nVarArr);
            }
            v1 v1Var2 = new v1(this.f289464a, w1Var, v1Var, eVar, this.f289470g, nVarArr);
            if (this.f289466c.incrementAndGet() > 0) {
                this.f289470g.onComplete();
                return new i0(this.f289467d, nVarArr);
            }
            try {
                dVarC.a(new b(w1Var, eVar), ((dVarC instanceof io.grpc.e1) && ((io.grpc.e1) dVarC).a() && eVar.e() != null) ? eVar.e() : n.this.f289463c, v1Var2);
            } catch (Throwable th2) {
                v1Var2.b(io.grpc.y2.f291458m.u("Credentials should use fail() instead of throwing exceptions").t(th2));
            }
            return v1Var2.d();
        }

        @Override // io.grpc.internal.o0, io.grpc.internal.r1
        public void h(io.grpc.y2 y2Var) {
            com.google.common.base.j0.F(y2Var, "status");
            synchronized (this) {
                try {
                    if (this.f289466c.get() < 0) {
                        this.f289467d = y2Var;
                        this.f289466c.addAndGet(Integer.MAX_VALUE);
                        if (this.f289466c.get() != 0) {
                            this.f289468e = y2Var;
                        } else {
                            super.h(y2Var);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    n(v vVar, io.grpc.d dVar, Executor executor) {
        this.f289461a = (v) com.google.common.base.j0.F(vVar, "delegate");
        this.f289462b = dVar;
        this.f289463c = (Executor) com.google.common.base.j0.F(executor, "appExecutor");
    }

    @Override // io.grpc.internal.v
    public ScheduledExecutorService E0() {
        return this.f289461a.E0();
    }

    @Override // io.grpc.internal.v
    public Collection<Class<? extends SocketAddress>> K8() {
        return this.f289461a.K8();
    }

    @Override // io.grpc.internal.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f289461a.close();
    }

    @Override // io.grpc.internal.v
    public x j7(SocketAddress socketAddress, v.a aVar, io.grpc.h hVar) {
        return new a(this.f289461a.j7(socketAddress, aVar, hVar), aVar.a());
    }

    @Override // io.grpc.internal.v
    public v.b p4(io.grpc.g gVar) {
        throw new UnsupportedOperationException();
    }
}
