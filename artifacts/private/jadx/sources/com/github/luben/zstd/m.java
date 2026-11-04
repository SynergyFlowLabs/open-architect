package com.github.luben.zstd;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class m implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ZstdDirectBufferCompressingStreamNoFinalizer f103045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f103046b;

    class a extends ZstdDirectBufferCompressingStreamNoFinalizer {
        a(ByteBuffer byteBuffer, int i10) throws IOException {
            super(byteBuffer, i10);
        }

        @Override // com.github.luben.zstd.ZstdDirectBufferCompressingStreamNoFinalizer
        protected ByteBuffer b(ByteBuffer byteBuffer) throws IOException {
            return m.this.b(byteBuffer);
        }
    }

    static {
        com.github.luben.zstd.util.a.o();
    }

    public m(ByteBuffer byteBuffer, int i10) throws IOException {
        this.f103045a = new a(byteBuffer, i10);
    }

    public static int c() {
        return ZstdDirectBufferCompressingStreamNoFinalizer.c();
    }

    public synchronized void a(ByteBuffer byteBuffer) throws IOException {
        this.f103045a.a(byteBuffer);
    }

    protected ByteBuffer b(ByteBuffer byteBuffer) throws IOException {
        return byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            this.f103045a.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized m d(ZstdDictCompress zstdDictCompress) throws IOException {
        try {
            this.f103045a.d(zstdDictCompress);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized m e(byte[] bArr) throws IOException {
        try {
            this.f103045a.e(bArr);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public void f(boolean z10) {
        this.f103046b = z10;
    }

    protected void finalize() throws Throwable {
        if (this.f103046b) {
            close();
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        try {
            this.f103045a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
