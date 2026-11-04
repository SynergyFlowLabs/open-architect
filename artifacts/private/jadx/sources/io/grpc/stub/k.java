package io.grpc.stub;

import io.grpc.e0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class k<RespT> extends e<RespT> {
    @Override // io.grpc.stub.e
    public abstract boolean c();

    @Override // io.grpc.stub.e
    public abstract void d(int i10);

    @Override // io.grpc.stub.e
    public abstract void e(boolean z10);

    @Override // io.grpc.stub.e
    public abstract void f(Runnable runnable);

    public void g() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean h();

    public abstract void i(String str);

    public abstract void j(Runnable runnable);

    @e0("https://github.com/grpc/grpc-java/issues/8467")
    public void k(Runnable runnable) {
        throw new UnsupportedOperationException();
    }
}
