package io.grpc.okhttp;

import io.grpc.h2;
import io.grpc.internal.u0;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes13.dex */
final class j0 implements d {
    j0() {
    }

    @Override // io.grpc.okhttp.d
    public d.a a(Socket socket, io.grpc.a aVar) throws IOException {
        return new d.a(socket, aVar.g().d(io.grpc.n0.f290189b, socket.getLocalSocketAddress()).d(io.grpc.n0.f290188a, socket.getRemoteSocketAddress()).d(u0.f289846a, h2.NONE).a(), null);
    }
}
