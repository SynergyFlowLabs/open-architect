package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
public abstract class k2<ReqT, RespT> {

    public static abstract class a<ReqT> {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d(ReqT reqt) {
        }

        public void e() {
        }
    }

    public abstract void a(y2 y2Var, v1 v1Var);

    @e0("https://github.com/grpc/grpc-java/issues/1779")
    public io.grpc.a b() {
        return io.grpc.a.f288673c;
    }

    @fj.h
    public String c() {
        return null;
    }

    public abstract w1<ReqT, RespT> d();

    @e0("https://github.com/grpc/grpc-java/issues/4692")
    public h2 e() {
        return h2.NONE;
    }

    public abstract boolean f();

    public boolean g() {
        return true;
    }

    public abstract void h(int i10);

    public abstract void i(v1 v1Var);

    public abstract void j(RespT respt);

    public void k(String str) {
    }

    public void l(boolean z10) {
    }
}
