package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
abstract class a2<ReqT, RespT> extends k<ReqT, RespT> {
    a2() {
    }

    @Override // io.grpc.k
    public void a(@fj.h String str, @fj.h Throwable th2) {
        i().a(str, th2);
    }

    @Override // io.grpc.k
    public a b() {
        return i().b();
    }

    @Override // io.grpc.k
    public void c() {
        i().c();
    }

    @Override // io.grpc.k
    public boolean d() {
        return i().d();
    }

    @Override // io.grpc.k
    public void e(int i10) {
        i().e(i10);
    }

    @Override // io.grpc.k
    public void g(boolean z10) {
        i().g(z10);
    }

    protected abstract k<?, ?> i();

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", i()).toString();
    }
}
