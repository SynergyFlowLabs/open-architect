package com.google.api.client.http.apache;

import java.io.IOException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
final class f extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final javax.net.ssl.SSLSocketFactory f115581a;

    f(SSLContext sSLContext) throws UnrecoverableKeyException, NoSuchAlgorithmException, KeyManagementException, KeyStoreException {
        super(null);
        this.f115581a = sSLContext.getSocketFactory();
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        return this.f115581a.createSocket();
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.f115581a.createSocket(socket, str, i10, z10);
        getHostnameVerifier().verify(str, sSLSocket);
        return sSLSocket;
    }
}
