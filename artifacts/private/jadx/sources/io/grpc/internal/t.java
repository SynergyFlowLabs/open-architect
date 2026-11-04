package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
public interface t extends k3 {

    public enum a {
        PROCESSED,
        REFUSED,
        DROPPED,
        MISCARRIED
    }

    void c(io.grpc.v1 v1Var);

    void f(io.grpc.y2 y2Var, a aVar, io.grpc.v1 v1Var);
}
