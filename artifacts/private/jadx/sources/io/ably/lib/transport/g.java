package io.ably.lib.transport;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes13.dex */
public class g extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f287886a = {"TLSv1.2", "TLSv1.3"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f287887b;

    public g(SSLSocketFactory sSLSocketFactory) {
        this.f287887b = sSLSocketFactory;
    }

    private Socket a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            throw new IllegalArgumentException("The socket is not an instance of the SSL socket");
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        HashSet hashSet = new HashSet(Arrays.asList(sSLSocket.getSupportedProtocols()));
        ArrayList arrayList = new ArrayList();
        for (String str : this.f287886a) {
            if (hashSet.contains(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            throw new SecurityException("No safe protocol version is supported for this SSL socket");
        }
        sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return a(this.f287887b.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f287887b.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f287887b.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return a(this.f287887b.createSocket(socket, str, i10, z10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        return a(this.f287887b.createSocket(str, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return a(this.f287887b.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return a(this.f287887b.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return a(this.f287887b.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}
