package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
abstract class b2<RespT> extends k.a<RespT> {
    b2() {
    }

    @Override // io.grpc.k.a
    public void a(y2 y2Var, v1 v1Var) {
        e().a(y2Var, v1Var);
    }

    @Override // io.grpc.k.a
    public void b(v1 v1Var) {
        e().b(v1Var);
    }

    @Override // io.grpc.k.a
    public void d() {
        e().d();
    }

    protected abstract k.a<?> e();

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", e()).toString();
    }
}
