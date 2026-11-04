package io.grpc.okhttp;

import io.grpc.v0;
import io.sentry.a8;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes13.dex */
interface d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Socket f290299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.grpc.a f290300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v0.f f290301c;

        public a(Socket socket, io.grpc.a aVar, v0.f fVar) {
            this.f290299a = (Socket) com.google.common.base.j0.F(socket, "socket");
            this.f290300b = (io.grpc.a) com.google.common.base.j0.F(aVar, a8.b.f303905f);
            this.f290301c = fVar;
        }
    }

    a a(Socket socket, io.grpc.a aVar) throws IOException;
}
