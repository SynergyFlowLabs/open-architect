package org.java_websocket.server;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import org.java_websocket.f;
import org.java_websocket.g;
import org.java_websocket.i;
import org.java_websocket.k;

/* JADX INFO: loaded from: classes14.dex */
public class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected SSLContext f337924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ExecutorService f337925b;

    public b(SSLContext sSLContext) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor());
    }

    @Override // org.java_websocket.h
    public /* bridge */ /* synthetic */ f a(g gVar, List list) {
        return a(gVar, (List<org.java_websocket.drafts.a>) list);
    }

    @Override // org.java_websocket.k
    public ByteChannel c(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngineCreateSSLEngine = this.f337924a.createSSLEngine();
        ArrayList arrayList = new ArrayList(Arrays.asList(sSLEngineCreateSSLEngine.getEnabledCipherSuites()));
        arrayList.remove("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        sSLEngineCreateSSLEngine.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        sSLEngineCreateSSLEngine.setUseClientMode(false);
        return new org.java_websocket.d(socketChannel, sSLEngineCreateSSLEngine, this.f337925b, selectionKey);
    }

    @Override // org.java_websocket.k
    public void close() {
        this.f337925b.shutdown();
    }

    public b(SSLContext sSLContext, ExecutorService executorService) {
        if (sSLContext == null || executorService == null) {
            throw new IllegalArgumentException();
        }
        this.f337924a = sSLContext;
        this.f337925b = executorService;
    }

    @Override // org.java_websocket.k, org.java_websocket.h
    public i a(g gVar, List<org.java_websocket.drafts.a> list) {
        return new i(gVar, list);
    }

    @Override // org.java_websocket.h
    public i b(g gVar, org.java_websocket.drafts.a aVar) {
        return new i(gVar, aVar);
    }
}
