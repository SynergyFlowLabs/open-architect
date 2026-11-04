package io.grpc.stub;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f<ReqT> extends e<ReqT> {
    @Override // io.grpc.stub.e
    public abstract boolean c();

    @Override // io.grpc.stub.e
    public abstract void d(int i10);

    @Override // io.grpc.stub.e
    public abstract void e(boolean z10);

    @Override // io.grpc.stub.e
    public abstract void f(Runnable runnable);

    public abstract void g(@fj.h String str, @fj.h Throwable th2);

    public void h(int i10) {
        throw new UnsupportedOperationException();
    }
}
