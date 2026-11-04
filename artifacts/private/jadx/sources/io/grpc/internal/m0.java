package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
abstract class m0 implements t {
    m0() {
    }

    @Override // io.grpc.internal.k3
    public void a(k3.a aVar) {
        g().a(aVar);
    }

    @Override // io.grpc.internal.t
    public void c(io.grpc.v1 v1Var) {
        g().c(v1Var);
    }

    @Override // io.grpc.internal.k3
    public void e() {
        g().e();
    }

    @Override // io.grpc.internal.t
    public void f(io.grpc.y2 y2Var, t.a aVar, io.grpc.v1 v1Var) {
        g().f(y2Var, aVar, v1Var);
    }

    protected abstract t g();

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", g()).toString();
    }
}
