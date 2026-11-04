package org.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* JADX INFO: loaded from: classes14.dex */
public interface l extends ByteChannel {
    boolean K4();

    boolean g2();

    void rb() throws IOException;

    boolean y4();

    int yb(ByteBuffer byteBuffer) throws IOException;
}
