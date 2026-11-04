package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
abstract class q0 extends io.grpc.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.r1 f289705a;

    q0(io.grpc.r1 r1Var) {
        this.f289705a = r1Var;
    }

    @Override // io.grpc.f
    public String b() {
        return this.f289705a.b();
    }

    @Override // io.grpc.f
    public <RequestT, ResponseT> io.grpc.k<RequestT, ResponseT> g(io.grpc.w1<RequestT, ResponseT> w1Var, io.grpc.e eVar) {
        return this.f289705a.g(w1Var, eVar);
    }

    @Override // io.grpc.r1
    public boolean j(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f289705a.j(j10, timeUnit);
    }

    @Override // io.grpc.r1
    public void k() {
        this.f289705a.k();
    }

    @Override // io.grpc.r1
    public io.grpc.u l(boolean z10) {
        return this.f289705a.l(z10);
    }

    @Override // io.grpc.r1
    public boolean m() {
        return this.f289705a.m();
    }

    @Override // io.grpc.r1
    public boolean n() {
        return this.f289705a.n();
    }

    @Override // io.grpc.r1
    public void o(io.grpc.u uVar, Runnable runnable) {
        this.f289705a.o(uVar, runnable);
    }

    @Override // io.grpc.r1
    public void p() {
        this.f289705a.p();
    }

    @Override // io.grpc.r1
    public io.grpc.r1 q() {
        return this.f289705a.q();
    }

    @Override // io.grpc.r1
    public io.grpc.r1 r() {
        return this.f289705a.r();
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", this.f289705a).toString();
    }
}
