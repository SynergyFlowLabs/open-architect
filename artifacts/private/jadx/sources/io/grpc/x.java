package io.grpc;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public final class x {

    private static class a<ReqT> extends l0.a<ReqT> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w f291407b;

        public a(k2.a<ReqT> aVar, w wVar) {
            super(aVar);
            this.f291407b = wVar;
        }

        @Override // io.grpc.l0.a, io.grpc.l0, io.grpc.d2, io.grpc.k2.a
        public void a() {
            w wVarB = this.f291407b.b();
            try {
                super.a();
            } finally {
                this.f291407b.j(wVarB);
            }
        }

        @Override // io.grpc.l0.a, io.grpc.l0, io.grpc.d2, io.grpc.k2.a
        public void b() {
            w wVarB = this.f291407b.b();
            try {
                super.b();
            } finally {
                this.f291407b.j(wVarB);
            }
        }

        @Override // io.grpc.l0.a, io.grpc.l0, io.grpc.d2, io.grpc.k2.a
        public void c() {
            w wVarB = this.f291407b.b();
            try {
                super.c();
                this.f291407b.j(wVarB);
            } catch (Throwable th2) {
                this.f291407b.j(wVarB);
                throw th2;
            }
        }

        @Override // io.grpc.l0, io.grpc.k2.a
        public void d(ReqT reqt) {
            w wVarB = this.f291407b.b();
            try {
                super.d(reqt);
                this.f291407b.j(wVarB);
            } catch (Throwable th2) {
                this.f291407b.j(wVarB);
                throw th2;
            }
        }

        @Override // io.grpc.l0.a, io.grpc.l0, io.grpc.d2, io.grpc.k2.a
        public void e() {
            w wVarB = this.f291407b.b();
            try {
                super.e();
            } finally {
                this.f291407b.j(wVarB);
            }
        }
    }

    private x() {
    }

    public static <ReqT, RespT> k2.a<ReqT> a(w wVar, k2<ReqT, RespT> k2Var, v1 v1Var, m2<ReqT, RespT> m2Var) {
        w wVarB = wVar.b();
        try {
            a aVar = new a(m2Var.a(k2Var, v1Var), wVar);
            wVar.j(wVarB);
            return aVar;
        } catch (Throwable th2) {
            wVar.j(wVarB);
            throw th2;
        }
    }

    @e0("https://github.com/grpc/grpc-java/issues/1975")
    public static y2 b(w wVar) {
        com.google.common.base.j0.F(wVar, "context must not be null");
        if (!wVar.q()) {
            return null;
        }
        Throwable thE = wVar.e();
        if (thE == null) {
            return y2.f291451f.u("io.grpc.Context was cancelled without error");
        }
        if (thE instanceof TimeoutException) {
            return y2.f291454i.u(thE.getMessage()).t(thE);
        }
        y2 y2VarN = y2.n(thE);
        return (y2.b.UNKNOWN.equals(y2VarN.p()) && y2VarN.o() == thE) ? y2.f291451f.u("Context cancelled").t(thE) : y2VarN.t(thE);
    }
}
