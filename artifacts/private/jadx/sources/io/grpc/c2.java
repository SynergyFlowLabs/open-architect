package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
abstract class c2<ReqT, RespT> extends k2<ReqT, RespT> {
    c2() {
    }

    @Override // io.grpc.k2
    public void a(y2 y2Var, v1 v1Var) {
        m().a(y2Var, v1Var);
    }

    @Override // io.grpc.k2
    @e0("https://github.com/grpc/grpc-java/issues/1779")
    public a b() {
        return m().b();
    }

    @Override // io.grpc.k2
    public String c() {
        return m().c();
    }

    @Override // io.grpc.k2
    @e0("https://github.com/grpc/grpc-java/issues/4692")
    public h2 e() {
        return m().e();
    }

    @Override // io.grpc.k2
    public boolean f() {
        return m().f();
    }

    @Override // io.grpc.k2
    public boolean g() {
        return m().g();
    }

    @Override // io.grpc.k2
    public void h(int i10) {
        m().h(i10);
    }

    @Override // io.grpc.k2
    public void i(v1 v1Var) {
        m().i(v1Var);
    }

    @Override // io.grpc.k2
    @e0("https://github.com/grpc/grpc-java/issues/1704")
    public void k(String str) {
        m().k(str);
    }

    @Override // io.grpc.k2
    public void l(boolean z10) {
        m().l(z10);
    }

    protected abstract k2<?, ?> m();

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", m()).toString();
    }
}
