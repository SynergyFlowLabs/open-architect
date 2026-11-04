package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
public abstract class n0 extends io.grpc.n {
    @Override // io.grpc.b3
    public void a(int i10) {
        o().a(i10);
    }

    @Override // io.grpc.b3
    public void b(int i10, long j10, long j11) {
        o().b(i10, j10, j11);
    }

    @Override // io.grpc.b3
    public void c(long j10) {
        o().c(j10);
    }

    @Override // io.grpc.b3
    public void d(long j10) {
        o().d(j10);
    }

    @Override // io.grpc.b3
    public void e(int i10) {
        o().e(i10);
    }

    @Override // io.grpc.b3
    public void f(int i10, long j10, long j11) {
        o().f(i10, j10, j11);
    }

    @Override // io.grpc.b3
    public void g(long j10) {
        o().g(j10);
    }

    @Override // io.grpc.b3
    public void h(long j10) {
        o().h(j10);
    }

    @Override // io.grpc.b3
    public void i(io.grpc.y2 y2Var) {
        o().i(y2Var);
    }

    @Override // io.grpc.n
    public void j() {
        o().j();
    }

    @Override // io.grpc.n
    public void k() {
        o().k();
    }

    @Override // io.grpc.n
    public void l(io.grpc.v1 v1Var) {
        o().l(v1Var);
    }

    @Override // io.grpc.n
    public void m() {
        o().m();
    }

    @Override // io.grpc.n
    public void n(io.grpc.a aVar, io.grpc.v1 v1Var) {
        o().n(aVar, v1Var);
    }

    protected abstract io.grpc.n o();

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", o()).toString();
    }
}
