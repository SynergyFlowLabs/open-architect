package com.rabbitmq.client.impl.nio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import javax.net.ssl.SSLEngine;

/* JADX INFO: loaded from: classes13.dex */
public class y extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SSLEngine f265632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f265633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteBuffer f265634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WritableByteChannel f265635d;

    public y(SSLEngine sSLEngine, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, WritableByteChannel writableByteChannel) {
        this.f265632a = sSLEngine;
        this.f265633b = byteBuffer;
        this.f265634c = byteBuffer2;
        this.f265635d = writableByteChannel;
    }

    private void a() throws IOException {
        this.f265633b.flip();
        a0.h(this.f265635d, this.f265632a, this.f265633b, this.f265634c);
        this.f265633b.clear();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (this.f265633b.position() > 0) {
            a();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        if (!this.f265633b.hasRemaining()) {
            a();
        }
        this.f265633b.put((byte) i10);
    }
}
