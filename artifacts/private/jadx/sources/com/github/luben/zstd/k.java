package com.github.luben.zstd;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class k implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ZstdBufferDecompressingStreamNoFinalizer f103036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f103037b = true;

    class a extends ZstdBufferDecompressingStreamNoFinalizer {
        a(ByteBuffer byteBuffer) {
            super(byteBuffer);
        }

        @Override // com.github.luben.zstd.b
        protected ByteBuffer g(ByteBuffer byteBuffer) {
            return k.this.c(byteBuffer);
        }
    }

    static {
        com.github.luben.zstd.util.a.o();
    }

    public k(ByteBuffer byteBuffer) {
        this.f103036a = new a(byteBuffer);
    }

    public static int b() {
        return ZstdBufferDecompressingStreamNoFinalizer.m();
    }

    public synchronized boolean a() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f103036a.d();
    }

    protected ByteBuffer c(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f103036a.close();
    }

    public synchronized k d(ZstdDictDecompress zstdDictDecompress) throws IOException {
        try {
            this.f103036a.h(zstdDictDecompress);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized k e(byte[] bArr) throws IOException {
        try {
            this.f103036a.j(bArr);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public void f(boolean z10) {
        this.f103037b = z10;
    }

    protected void finalize() throws Throwable {
        if (this.f103037b) {
            close();
        }
    }

    public k g(int i10) throws IOException {
        this.f103036a.l(i10);
        return this;
    }

    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        try {
        } finally {
        }
        return this.f103036a.read(byteBuffer);
    }
}
