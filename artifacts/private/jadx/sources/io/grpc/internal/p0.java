package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
abstract class p0 implements t1.b {
    p0() {
    }

    @Override // io.grpc.internal.t1.b
    public void a(k3.a aVar) {
        c().a(aVar);
    }

    @Override // io.grpc.internal.t1.b
    public void b(int i10) {
        c().b(i10);
    }

    protected abstract t1.b c();

    @Override // io.grpc.internal.t1.b
    public void d(boolean z10) {
        c().d(z10);
    }

    @Override // io.grpc.internal.t1.b
    public void i(Throwable th2) {
        c().i(th2);
    }
}
