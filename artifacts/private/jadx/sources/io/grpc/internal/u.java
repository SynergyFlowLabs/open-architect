package io.grpc.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
public interface u extends io.grpc.a1<io.grpc.v0.l> {

    public interface a {
        void a(long j10);

        void onFailure(Throwable th2);
    }

    void d(a aVar, Executor executor);

    s e(io.grpc.w1<?, ?> w1Var, io.grpc.v1 v1Var, io.grpc.e eVar, io.grpc.n[] nVarArr);
}
