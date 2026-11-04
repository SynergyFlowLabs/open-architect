package org.java_websocket.server;

import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import org.java_websocket.f;
import org.java_websocket.g;
import org.java_websocket.i;
import org.java_websocket.k;

/* JADX INFO: loaded from: classes14.dex */
public class c implements k {
    @Override // org.java_websocket.h
    public /* bridge */ /* synthetic */ f a(g gVar, List list) {
        return a(gVar, (List<org.java_websocket.drafts.a>) list);
    }

    @Override // org.java_websocket.k
    public void close() {
    }

    @Override // org.java_websocket.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SocketChannel c(SocketChannel socketChannel, SelectionKey selectionKey) {
        return socketChannel;
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
