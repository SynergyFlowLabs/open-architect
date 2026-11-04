package org.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteChannel f337809a;

    @Deprecated
    public b(ByteChannel byteChannel) {
        this.f337809a = byteChannel;
    }

    @Override // org.java_websocket.l
    public boolean K4() {
        ByteChannel byteChannel = this.f337809a;
        return (byteChannel instanceof l) && ((l) byteChannel).K4();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f337809a.close();
    }

    @Override // org.java_websocket.l
    public boolean g2() {
        ByteChannel byteChannel = this.f337809a;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (byteChannel instanceof l) {
            return ((l) byteChannel).g2();
        }
        return false;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f337809a.isOpen();
    }

    @Override // org.java_websocket.l
    public void rb() throws IOException {
        ByteChannel byteChannel = this.f337809a;
        if (byteChannel instanceof l) {
            ((l) byteChannel).rb();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.f337809a.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.f337809a.write(byteBuffer);
    }

    @Override // org.java_websocket.l
    public boolean y4() {
        ByteChannel byteChannel = this.f337809a;
        return (byteChannel instanceof l) && ((l) byteChannel).y4();
    }

    @Override // org.java_websocket.l
    public int yb(ByteBuffer byteBuffer) throws IOException {
        ByteChannel byteChannel = this.f337809a;
        if (byteChannel instanceof l) {
            return ((l) byteChannel).yb(byteBuffer);
        }
        return 0;
    }

    @Deprecated
    public b(l lVar) {
        this.f337809a = lVar;
    }
}
