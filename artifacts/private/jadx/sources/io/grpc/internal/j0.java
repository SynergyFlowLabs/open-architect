package io.grpc.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
class j0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    final io.grpc.y2 f289274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t.a f289275b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u.a f289276a;

        a(u.a aVar) {
            this.f289276a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f289276a.onFailure(j0.this.f289274a.c());
        }
    }

    j0(io.grpc.y2 y2Var, t.a aVar) {
        com.google.common.base.j0.e(!y2Var.r(), "error must not be OK");
        this.f289274a = y2Var;
        this.f289275b = aVar;
    }

    @Override // io.grpc.m1
    public io.grpc.c1 c() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // io.grpc.internal.u
    public void d(u.a aVar, Executor executor) {
        executor.execute(new a(aVar));
    }

    @Override // io.grpc.internal.u
    public s e(io.grpc.w1<?, ?> w1Var, io.grpc.v1 v1Var, io.grpc.e eVar, io.grpc.n[] nVarArr) {
        return new i0(this.f289274a, this.f289275b, nVarArr);
    }

    @Override // io.grpc.a1
    public com.google.common.util.concurrent.t1<io.grpc.v0.l> i() {
        com.google.common.util.concurrent.m2 m2VarF = com.google.common.util.concurrent.m2.F();
        m2VarF.B(null);
        return m2VarF;
    }
}
