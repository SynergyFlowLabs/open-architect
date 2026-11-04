package org.msgpack.core.buffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.msgpack.core.p;

/* JADX INFO: loaded from: classes14.dex */
public class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReadableByteChannel f339188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f339189b;

    public d(ReadableByteChannel readableByteChannel) {
        this(readableByteChannel, 8192);
    }

    public ReadableByteChannel a(ReadableByteChannel readableByteChannel) throws IOException {
        ReadableByteChannel readableByteChannel2 = this.f339188a;
        this.f339188a = readableByteChannel;
        return readableByteChannel2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f339188a.close();
    }

    @Override // org.msgpack.core.buffer.j
    public h next() throws IOException {
        ByteBuffer byteBufferE = this.f339189b.E();
        while (byteBufferE.remaining() > 0 && this.f339188a.read(byteBufferE) != -1) {
        }
        byteBufferE.flip();
        if (byteBufferE.remaining() == 0) {
            return null;
        }
        return this.f339189b.D(0, byteBufferE.limit());
    }

    public d(ReadableByteChannel readableByteChannel, int i10) {
        this.f339188a = (ReadableByteChannel) p.j(readableByteChannel, "input channel is null");
        p.e(i10 > 0, "buffer size must be > 0: " + i10);
        this.f339189b = h.a(i10);
    }
}
