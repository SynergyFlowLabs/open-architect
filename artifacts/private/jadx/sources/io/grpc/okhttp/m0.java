package io.grpc.okhttp;

import io.grpc.h2;
import io.grpc.internal.u0;
import io.grpc.v0;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes13.dex */
final class m0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f290742a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f290743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.grpc.okhttp.internal.b f290744c;

    public m0(l0.a aVar) {
        this.f290743b = aVar.b();
        this.f290744c = aVar.a();
    }

    @Override // io.grpc.okhttp.d
    public d.a a(Socket socket, io.grpc.a aVar) throws IOException {
        d.a aVarA = this.f290742a.a(socket, aVar);
        Socket socketCreateSocket = this.f290743b.createSocket(aVarA.f290299a, (String) null, -1, true);
        if (!(socketCreateSocket instanceof SSLSocket)) {
            throw new IOException("SocketFactory " + this.f290743b + " did not produce an SSLSocket: " + socketCreateSocket.getClass());
        }
        SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
        sSLSocket.setUseClientMode(false);
        this.f290744c.c(sSLSocket, false);
        io.grpc.okhttp.internal.i iVar = io.grpc.okhttp.internal.i.HTTP_2;
        String strH = n.e().h(sSLSocket, null, this.f290744c.j() ? Arrays.asList(iVar) : null);
        if (iVar.toString().equals(strH)) {
            return new d.a(socketCreateSocket, aVarA.f290300b.g().d(u0.f289846a, h2.PRIVACY_AND_INTEGRITY).d(io.grpc.n0.f290190c, sSLSocket.getSession()).a(), new v0.f(new v0.n(sSLSocket.getSession())));
        }
        throw new IOException("Expected NPN/ALPN " + iVar + ": " + strH);
    }
}
