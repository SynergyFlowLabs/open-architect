package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import org.msgpack.core.p;

/* JADX INFO: loaded from: classes14.dex */
public class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f339186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f339187b = false;

    public c(ByteBuffer byteBuffer) {
        this.f339186a = ((ByteBuffer) p.j(byteBuffer, "input ByteBuffer is null")).slice();
    }

    public ByteBuffer a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f339186a;
        this.f339186a = ((ByteBuffer) p.j(byteBuffer, "input ByteBuffer is null")).slice();
        this.f339187b = false;
        return byteBuffer2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.msgpack.core.buffer.j
    public h next() {
        if (this.f339187b) {
            return null;
        }
        h hVarI = h.I(this.f339186a);
        this.f339187b = true;
        return hVarI;
    }
}
