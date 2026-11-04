package org.msgpack.core.buffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.msgpack.core.p;

/* JADX INFO: loaded from: classes14.dex */
public class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WritableByteChannel f339190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f339191b;

    public e(WritableByteChannel writableByteChannel) {
        this(writableByteChannel, 8192);
    }

    @Override // org.msgpack.core.buffer.k
    public void P0(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    @Override // org.msgpack.core.buffer.k
    public void P9(int i10) throws IOException {
        ByteBuffer byteBufferF = this.f339191b.F(0, i10);
        while (byteBufferF.hasRemaining()) {
            this.f339190a.write(byteBufferF);
        }
    }

    public WritableByteChannel a(WritableByteChannel writableByteChannel) throws IOException {
        WritableByteChannel writableByteChannel2 = this.f339190a;
        this.f339190a = writableByteChannel;
        return writableByteChannel2;
    }

    @Override // org.msgpack.core.buffer.k
    public h c4(int i10) throws IOException {
        if (this.f339191b.C() < i10) {
            this.f339191b = h.a(i10);
        }
        return this.f339191b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f339190a.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // org.msgpack.core.buffer.k
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i10, i11);
        while (byteBufferWrap.hasRemaining()) {
            this.f339190a.write(byteBufferWrap);
        }
    }

    public e(WritableByteChannel writableByteChannel, int i10) {
        this.f339190a = (WritableByteChannel) p.j(writableByteChannel, "output channel is null");
        this.f339191b = h.a(i10);
    }
}
