package io.grpc.okhttp;

import com.squareup.okhttp.CipherSuite;
import com.squareup.okhttp.ConnectionSpec;
import com.squareup.okhttp.TlsVersion;
import io.grpc.f1;
import io.grpc.internal.o3;
import io.grpc.v0;
import io.grpc.v1;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f290762a = Logger.getLogger(n0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final float f290763b = 0.5f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f290764c = 65535;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f290765d = 0;

    private n0() {
    }

    public static v1 a(List<io.grpc.okhttp.internal.framed.d> list) {
        return f1.e(b(list));
    }

    @fj.c
    private static byte[][] b(List<io.grpc.okhttp.internal.framed.d> list) {
        byte[][] bArr = new byte[list.size() * 2][];
        int i10 = 0;
        for (io.grpc.okhttp.internal.framed.d dVar : list) {
            int i11 = i10 + 1;
            bArr[i10] = dVar.f290510a.F0();
            i10 += 2;
            bArr[i11] = dVar.f290511b.F0();
        }
        return o3.e(bArr);
    }

    static io.grpc.okhttp.internal.b c(ConnectionSpec connectionSpec) {
        com.google.common.base.j0.e(connectionSpec.isTls(), "plaintext ConnectionSpec is not accepted");
        List listTlsVersions = connectionSpec.tlsVersions();
        int size = listTlsVersions.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = ((TlsVersion) listTlsVersions.get(i10)).javaName();
        }
        List listCipherSuites = connectionSpec.cipherSuites();
        int size2 = listCipherSuites.size();
        io.grpc.okhttp.internal.a[] aVarArr = new io.grpc.okhttp.internal.a[size2];
        for (int i11 = 0; i11 < size2; i11++) {
            aVarArr[i11] = io.grpc.okhttp.internal.a.valueOf(((CipherSuite) listCipherSuites.get(i11)).name());
        }
        return new io.grpc.okhttp.internal.b.C1981b(connectionSpec.isTls()).h(connectionSpec.supportsTlsExtensions()).j(strArr).f(aVarArr).e();
    }

    public static v1 d(List<io.grpc.okhttp.internal.framed.d> list) {
        return f1.e(b(list));
    }

    static v0.k e(Socket socket) {
        v0.k.a aVar = new v0.k.a();
        try {
            aVar.e(Integer.valueOf(socket.getSoLinger()));
        } catch (SocketException e10) {
            f290762a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e10);
            aVar.b("SO_LINGER", "channelz_internal_error");
        }
        try {
            aVar.f(Integer.valueOf(socket.getSoTimeout()));
        } catch (Exception e11) {
            f290762a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e11);
            aVar.b("SO_TIMEOUT", "channelz_internal_error");
        }
        try {
            aVar.c("TCP_NODELAY", socket.getTcpNoDelay());
        } catch (SocketException e12) {
            f290762a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e12);
            aVar.b("TCP_NODELAY", "channelz_internal_error");
        }
        try {
            aVar.c("SO_REUSEADDR", socket.getReuseAddress());
        } catch (SocketException e13) {
            f290762a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e13);
            aVar.b("SO_REUSEADDR", "channelz_internal_error");
        }
        try {
            aVar.a("SO_SNDBUF", socket.getSendBufferSize());
        } catch (SocketException e14) {
            f290762a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e14);
            aVar.b("SO_SNDBUF", "channelz_internal_error");
        }
        try {
            aVar.a("SO_RECVBUF", socket.getReceiveBufferSize());
        } catch (SocketException e15) {
            f290762a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e15);
            aVar.b("SO_RECVBUF", "channelz_internal_error");
        }
        try {
            aVar.c("SO_KEEPALIVE", socket.getKeepAlive());
        } catch (SocketException e16) {
            f290762a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e16);
            aVar.b("SO_KEEPALIVE", "channelz_internal_error");
        }
        try {
            aVar.c("SO_OOBINLINE", socket.getOOBInline());
        } catch (SocketException e17) {
            f290762a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e17);
            aVar.b("SO_OOBINLINE", "channelz_internal_error");
        }
        try {
            aVar.a("IP_TOS", socket.getTrafficClass());
        } catch (SocketException e18) {
            f290762a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e18);
            aVar.b("IP_TOS", "channelz_internal_error");
        }
        return aVar.d();
    }
}
