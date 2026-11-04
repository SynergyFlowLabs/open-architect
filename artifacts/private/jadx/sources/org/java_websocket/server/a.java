package org.java_websocket.server;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

/* JADX INFO: loaded from: classes14.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f337922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f337923d;

    public a(SSLContext sSLContext, String[] strArr, String[] strArr2) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor(), strArr, strArr2);
    }

    @Override // org.java_websocket.server.b, org.java_websocket.k
    public ByteChannel c(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngineCreateSSLEngine = this.f337924a.createSSLEngine();
        String[] strArr = this.f337922c;
        if (strArr != null) {
            sSLEngineCreateSSLEngine.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.f337923d;
        if (strArr2 != null) {
            sSLEngineCreateSSLEngine.setEnabledCipherSuites(strArr2);
        }
        sSLEngineCreateSSLEngine.setUseClientMode(false);
        return new org.java_websocket.d(socketChannel, sSLEngineCreateSSLEngine, this.f337925b, selectionKey);
    }

    public a(SSLContext sSLContext, ExecutorService executorService, String[] strArr, String[] strArr2) {
        super(sSLContext, executorService);
        this.f337922c = strArr;
        this.f337923d = strArr2;
    }
}
