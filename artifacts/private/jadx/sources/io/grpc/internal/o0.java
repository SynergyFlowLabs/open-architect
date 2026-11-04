package io.grpc.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
abstract class o0 implements x {
    o0() {
    }

    @Override // io.grpc.internal.r1
    public void a(io.grpc.y2 y2Var) {
        b().a(y2Var);
    }

    protected abstract x b();

    @Override // io.grpc.m1
    public io.grpc.c1 c() {
        return b().c();
    }

    @Override // io.grpc.internal.u
    public void d(u.a aVar, Executor executor) {
        b().d(aVar, executor);
    }

    @Override // io.grpc.internal.u
    public s e(io.grpc.w1<?, ?> w1Var, io.grpc.v1 v1Var, io.grpc.e eVar, io.grpc.n[] nVarArr) {
        return b().e(w1Var, v1Var, eVar, nVarArr);
    }

    @Override // io.grpc.internal.r1
    public Runnable f(r1.a aVar) {
        return b().f(aVar);
    }

    @Override // io.grpc.internal.x
    public io.grpc.a getAttributes() {
        return b().getAttributes();
    }

    @Override // io.grpc.internal.r1
    public void h(io.grpc.y2 y2Var) {
        b().h(y2Var);
    }

    @Override // io.grpc.a1
    public com.google.common.util.concurrent.t1<io.grpc.v0.l> i() {
        return b().i();
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", b()).toString();
    }
}
