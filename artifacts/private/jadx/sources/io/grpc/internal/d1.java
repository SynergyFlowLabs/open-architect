package io.grpc.internal;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
public interface d1 {
    void a(y2 y2Var) throws IOException;

    @fj.h
    io.grpc.a1<io.grpc.v0.l> b();

    List<? extends SocketAddress> c();

    SocketAddress d();

    @fj.h
    List<io.grpc.a1<io.grpc.v0.l>> e();

    void shutdown();
}
