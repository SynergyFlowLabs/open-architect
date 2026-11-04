package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
abstract class r0 extends io.grpc.x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.x1 f289782a;

    r0(io.grpc.x1 x1Var) {
        com.google.common.base.j0.F(x1Var, "delegate can not be null");
        this.f289782a = x1Var;
    }

    @Override // io.grpc.x1
    public String a() {
        return this.f289782a.a();
    }

    @Override // io.grpc.x1
    public void b() {
        this.f289782a.b();
    }

    @Override // io.grpc.x1
    public void c() {
        this.f289782a.c();
    }

    @Override // io.grpc.x1
    public void d(io.grpc.x1.e eVar) {
        this.f289782a.d(eVar);
    }

    @Override // io.grpc.x1
    @Deprecated
    public void e(io.grpc.x1.f fVar) {
        this.f289782a.e(fVar);
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", this.f289782a).toString();
    }
}
