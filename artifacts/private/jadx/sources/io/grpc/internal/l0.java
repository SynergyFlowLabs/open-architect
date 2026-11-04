package io.grpc.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
abstract class l0 implements s {
    l0() {
    }

    @Override // io.grpc.internal.s
    public void a(io.grpc.y2 y2Var) {
        w().a(y2Var);
    }

    @Override // io.grpc.internal.j3
    public void b(int i10) {
        w().b(i10);
    }

    @Override // io.grpc.internal.j3
    public void c(io.grpc.s sVar) {
        w().c(sVar);
    }

    @Override // io.grpc.internal.s
    public void d(int i10) {
        w().d(i10);
    }

    @Override // io.grpc.internal.s
    public void e(int i10) {
        w().e(i10);
    }

    @Override // io.grpc.internal.j3
    public void flush() {
        w().flush();
    }

    @Override // io.grpc.internal.j3
    public void g(boolean z10) {
        w().g(z10);
    }

    @Override // io.grpc.internal.s
    public io.grpc.a getAttributes() {
        return w().getAttributes();
    }

    @Override // io.grpc.internal.j3
    public void i(InputStream inputStream) {
        w().i(inputStream);
    }

    @Override // io.grpc.internal.j3
    public boolean isReady() {
        return w().isReady();
    }

    @Override // io.grpc.internal.j3
    public void j() {
        w().j();
    }

    @Override // io.grpc.internal.s
    public void k(boolean z10) {
        w().k(z10);
    }

    @Override // io.grpc.internal.s
    public void o() {
        w().o();
    }

    @Override // io.grpc.internal.s
    public void q(io.grpc.a0 a0Var) {
        w().q(a0Var);
    }

    @Override // io.grpc.internal.s
    public void s(String str) {
        w().s(str);
    }

    @Override // io.grpc.internal.s
    public void t(b1 b1Var) {
        w().t(b1Var);
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", w()).toString();
    }

    @Override // io.grpc.internal.s
    public void u(io.grpc.y yVar) {
        w().u(yVar);
    }

    @Override // io.grpc.internal.s
    public void v(t tVar) {
        w().v(tVar);
    }

    protected abstract s w();
}
