package io.grpc;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/8274")
public interface l2 {
    @fj.h
    <ReqT, RespT> Executor a(k2<ReqT, RespT> k2Var, v1 v1Var);
}
