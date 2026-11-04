package org.java_websocket.server;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;

/* JADX INFO: loaded from: classes14.dex */
public class d extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLParameters f337926c;

    public d(SSLContext sSLContext, SSLParameters sSLParameters) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor(), sSLParameters);
    }

    @Override // org.java_websocket.server.b, org.java_websocket.k
    public ByteChannel c(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngineCreateSSLEngine = this.f337924a.createSSLEngine();
        sSLEngineCreateSSLEngine.setUseClientMode(false);
        sSLEngineCreateSSLEngine.setSSLParameters(this.f337926c);
        return new org.java_websocket.d(socketChannel, sSLEngineCreateSSLEngine, this.f337925b, selectionKey);
    }

    public d(SSLContext sSLContext, ExecutorService executorService, SSLParameters sSLParameters) {
        super(sSLContext, executorService);
        if (sSLParameters == null) {
            throw new IllegalArgumentException();
        }
        this.f337926c = sSLParameters;
    }
}
