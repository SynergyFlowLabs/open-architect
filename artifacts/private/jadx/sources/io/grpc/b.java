package io.grpc;

import java.io.Closeable;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/4017")
public abstract class b implements Closeable {
    public abstract f a(f fVar);

    public abstract <ReqT, RespT> q2<?, ?> b(q2<ReqT, RespT> q2Var);
}
