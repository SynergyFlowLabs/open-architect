package com.rabbitmq.client.impl.nio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes13.dex */
public class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WritableByteChannel f265560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f265561b;

    public c(WritableByteChannel writableByteChannel, ByteBuffer byteBuffer) {
        this.f265561b = byteBuffer;
        this.f265560a = writableByteChannel;
    }

    public static void a(WritableByteChannel writableByteChannel, ByteBuffer byteBuffer) throws IOException {
        byteBuffer.flip();
        while (byteBuffer.hasRemaining() && writableByteChannel.write(byteBuffer) != -1) {
        }
        byteBuffer.clear();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a(this.f265560a, this.f265561b);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        if (!this.f265561b.hasRemaining()) {
            a(this.f265560a, this.f265561b);
        }
        this.f265561b.put((byte) i10);
    }
}
