package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
public abstract class k<ReqT, RespT> {

    public static abstract class a<T> {
        public void a(y2 y2Var, v1 v1Var) {
        }

        public void b(v1 v1Var) {
        }

        public void c(T t10) {
        }

        public void d() {
        }
    }

    public abstract void a(@fj.h String str, @fj.h Throwable th2);

    @e0("https://github.com/grpc/grpc-java/issues/2607")
    public io.grpc.a b() {
        return io.grpc.a.f288673c;
    }

    public abstract void c();

    public boolean d() {
        return true;
    }

    public abstract void e(int i10);

    public abstract void f(ReqT reqt);

    public void g(boolean z10) {
    }

    public abstract void h(a<RespT> aVar, v1 v1Var);
}
