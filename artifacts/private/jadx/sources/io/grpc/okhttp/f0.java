package io.grpc.okhttp;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes13.dex */
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    static final List<io.grpc.okhttp.internal.i> f290314a = Collections.unmodifiableList(Arrays.asList(io.grpc.okhttp.internal.i.HTTP_2));

    f0() {
    }

    @com.google.common.annotations.e
    static String a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    public static SSLSocket b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i10, io.grpc.okhttp.internal.b bVar) throws IOException {
        com.google.common.base.j0.F(sSLSocketFactory, "sslSocketFactory");
        com.google.common.base.j0.F(socket, "socket");
        com.google.common.base.j0.F(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i10, true);
        bVar.c(sSLSocket, false);
        String strH = n.e().h(sSLSocket, str, bVar.j() ? f290314a : null);
        List<io.grpc.okhttp.internal.i> list = f290314a;
        com.google.common.base.j0.x0(list.contains(io.grpc.okhttp.internal.i.b(strH)), "Only " + list + " are supported, but negotiated protocol is %s", strH);
        if (hostnameVerifier == null) {
            hostnameVerifier = io.grpc.okhttp.internal.f.f290480a;
        }
        if (hostnameVerifier.verify(a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
