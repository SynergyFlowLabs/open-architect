package io.grpc.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.q1 f289266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f289267b;

    @com.google.common.annotations.e
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.o1.f f289268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.grpc.o1 f289269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private io.grpc.p1 f289270c;

        b(io.grpc.o1.f fVar) {
            this.f289268a = fVar;
            io.grpc.p1 p1VarE = j.this.f289266a.e(j.this.f289267b);
            this.f289270c = p1VarE;
            if (p1VarE != null) {
                this.f289269b = p1VarE.a(fVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + j.this.f289267b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        @com.google.common.annotations.e
        public io.grpc.o1 a() {
            return this.f289269b;
        }

        @com.google.common.annotations.e
        io.grpc.p1 b() {
            return this.f289270c;
        }

        void c(io.grpc.y2 y2Var) {
            a().c(y2Var);
        }

        @Deprecated
        void d(io.grpc.o1.j jVar, io.grpc.v vVar) {
            a().e(jVar, vVar);
        }

        void e() {
            a().f();
        }

        @com.google.common.annotations.e
        void f(io.grpc.o1 o1Var) {
            this.f289269b = o1Var;
        }

        void g() {
            this.f289269b.g();
            this.f289269b = null;
        }

        io.grpc.y2 h(io.grpc.o1.i iVar) {
            e3.b bVar = (e3.b) iVar.c();
            if (bVar == null) {
                try {
                    j jVar = j.this;
                    bVar = new e3.b(jVar.d(jVar.f289267b, "using default policy"), null);
                } catch (f e10) {
                    this.f289268a.q(io.grpc.u.TRANSIENT_FAILURE, new d(io.grpc.y2.f291464s.u(e10.getMessage())));
                    this.f289269b.g();
                    this.f289270c = null;
                    this.f289269b = new e();
                    return io.grpc.y2.f291450e;
                }
            }
            if (this.f289270c == null || !bVar.f289129a.b().equals(this.f289270c.b())) {
                this.f289268a.q(io.grpc.u.CONNECTING, new c());
                this.f289269b.g();
                io.grpc.p1 p1Var = bVar.f289129a;
                this.f289270c = p1Var;
                io.grpc.o1 o1Var = this.f289269b;
                this.f289269b = p1Var.a(this.f289268a);
                this.f289268a.i().b(io.grpc.h.a.INFO, "Load balancer changed from {0} to {1}", o1Var.getClass().getSimpleName(), this.f289269b.getClass().getSimpleName());
            }
            Object obj = bVar.f289130b;
            if (obj != null) {
                this.f289268a.i().b(io.grpc.h.a.DEBUG, "Load-balancing config: {0}", bVar.f289130b);
            }
            return a().a(io.grpc.o1.i.d().b(iVar.a()).c(iVar.b()).d(obj).a());
        }
    }

    private static final class c extends io.grpc.o1.k {
        private c() {
        }

        @Override // io.grpc.o1.k
        public io.grpc.o1.g a(io.grpc.o1.h hVar) {
            return io.grpc.o1.g.g();
        }

        public String toString() {
            return com.google.common.base.b0.b(c.class).toString();
        }
    }

    private static final class d extends io.grpc.o1.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.y2 f289272a;

        d(io.grpc.y2 y2Var) {
            this.f289272a = y2Var;
        }

        @Override // io.grpc.o1.k
        public io.grpc.o1.g a(io.grpc.o1.h hVar) {
            return io.grpc.o1.g.f(this.f289272a);
        }
    }

    private static final class e extends io.grpc.o1 {
        private e() {
        }

        @Override // io.grpc.o1
        public io.grpc.y2 a(io.grpc.o1.i iVar) {
            return io.grpc.y2.f291450e;
        }

        @Override // io.grpc.o1
        public void c(io.grpc.y2 y2Var) {
        }

        @Override // io.grpc.o1
        @Deprecated
        public void d(io.grpc.o1.i iVar) {
        }

        @Override // io.grpc.o1
        public void g() {
        }
    }

    @com.google.common.annotations.e
    static final class f extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f289273a = 1;

        private f(String str) {
            super(str);
        }
    }

    public j(String str) {
        this(io.grpc.q1.c(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.grpc.p1 d(String str, String str2) throws f {
        io.grpc.p1 p1VarE = this.f289266a.e(str);
        if (p1VarE != null) {
            return p1VarE;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    public b e(io.grpc.o1.f fVar) {
        return new b(fVar);
    }

    @fj.h
    io.grpc.x1.c f(Map<String, ?> map) {
        List<e3.a> listB;
        if (map != null) {
            try {
                listB = e3.B(e3.h(map));
            } catch (RuntimeException e10) {
                return io.grpc.x1.c.b(io.grpc.y2.f291452g.u("can't parse load balancer configuration").t(e10));
            }
        } else {
            listB = null;
        }
        if (listB == null || listB.isEmpty()) {
            return null;
        }
        return e3.z(listB, this.f289266a);
    }

    @com.google.common.annotations.e
    j(io.grpc.q1 q1Var, String str) {
        this.f289266a = (io.grpc.q1) com.google.common.base.j0.F(q1Var, "registry");
        this.f289267b = (String) com.google.common.base.j0.F(str, "defaultPolicy");
    }
}
