package com.github.luben.zstd;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class n implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ZstdDirectBufferDecompressingStreamNoFinalizer f103048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f103049b = true;

    class a extends ZstdDirectBufferDecompressingStreamNoFinalizer {
        a(ByteBuffer byteBuffer) {
            super(byteBuffer);
        }

        @Override // com.github.luben.zstd.b
        protected ByteBuffer g(ByteBuffer byteBuffer) {
            return n.this.c(byteBuffer);
        }
    }

    static {
        com.github.luben.zstd.util.a.o();
    }

    public n(ByteBuffer byteBuffer) {
        this.f103048a = new a(byteBuffer);
    }

    public static int b() {
        return ZstdDirectBufferDecompressingStreamNoFinalizer.m();
    }

    public synchronized boolean a() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f103048a.d();
    }

    protected ByteBuffer c(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            this.f103048a.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized n d(ZstdDictDecompress zstdDictDecompress) throws IOException {
        try {
            this.f103048a.h(zstdDictDecompress);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized n e(byte[] bArr) throws IOException {
        try {
            this.f103048a.j(bArr);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public void f(boolean z10) {
        this.f103049b = z10;
    }

    protected void finalize() throws Throwable {
        if (this.f103049b) {
            close();
        }
    }

    public n g(int i10) throws IOException {
        this.f103048a.l(i10);
        return this;
    }

    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f103048a.read(byteBuffer);
    }
}
