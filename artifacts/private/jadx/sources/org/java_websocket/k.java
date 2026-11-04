package org.java_websocket;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface k extends h {
    @Override // org.java_websocket.h
    i a(g gVar, List<org.java_websocket.drafts.a> list);

    @Override // org.java_websocket.h
    i b(g gVar, org.java_websocket.drafts.a aVar);

    ByteChannel c(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException;

    void close();
}
