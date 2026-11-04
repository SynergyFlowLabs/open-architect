package com.google.common.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public final class p extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f119044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f119045b;

    public p(InputStream in) {
        super((InputStream) com.google.common.base.j0.E(in));
        this.f119045b = -1L;
    }

    public long a() {
        return this.f119044a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int readlimit) {
        try {
            ((FilterInputStream) this).in.mark(readlimit);
            this.f119045b = this.f119044a;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f119044a++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f119045b == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f119044a = this.f119045b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long n10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(n10);
        this.f119044a += jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] b10, int off, int len) throws IOException {
        int i10 = ((FilterInputStream) this).in.read(b10, off, len);
        if (i10 != -1) {
            this.f119044a += (long) i10;
        }
        return i10;
    }
}
