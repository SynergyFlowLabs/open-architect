package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
abstract class d2<ReqT> extends k2.a<ReqT> {
    d2() {
    }

    @Override // io.grpc.k2.a
    public void a() {
        f().a();
    }

    @Override // io.grpc.k2.a
    public void b() {
        f().b();
    }

    @Override // io.grpc.k2.a
    public void c() {
        f().c();
    }

    @Override // io.grpc.k2.a
    public void e() {
        f().e();
    }

    protected abstract k2.a<?> f();

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", f()).toString();
    }
}
