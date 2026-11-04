package com.google.common.io;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
final class i extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.a
    private CharSequence f119016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f119018c;

    public i(CharSequence seq) {
        this.f119016a = (CharSequence) com.google.common.base.j0.E(seq);
    }

    private void a() throws IOException {
        if (this.f119016a == null) {
            throw new IOException("reader closed");
        }
    }

    private boolean b() {
        return c() > 0;
    }

    private int c() {
        Objects.requireNonNull(this.f119016a);
        return this.f119016a.length() - this.f119017b;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            this.f119016a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Reader
    public synchronized void mark(int readAheadLimit) throws IOException {
        try {
            com.google.common.base.j0.k(readAheadLimit >= 0, "readAheadLimit (%s) may not be negative", readAheadLimit);
            a();
            this.f119018c = this.f119017b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer target) throws IOException {
        com.google.common.base.j0.E(target);
        a();
        Objects.requireNonNull(this.f119016a);
        if (!b()) {
            return -1;
        }
        int iMin = Math.min(target.remaining(), c());
        for (int i10 = 0; i10 < iMin; i10++) {
            CharSequence charSequence = this.f119016a;
            int i11 = this.f119017b;
            this.f119017b = i11 + 1;
            target.put(charSequence.charAt(i11));
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        a();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        try {
            a();
            this.f119017b = this.f119018c;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Reader
    public synchronized long skip(long n10) throws IOException {
        int iMin;
        com.google.common.base.j0.p(n10 >= 0, "n (%s) may not be negative", n10);
        a();
        iMin = (int) Math.min(c(), n10);
        this.f119017b += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        int iCharAt;
        try {
            a();
            Objects.requireNonNull(this.f119016a);
            if (b()) {
                CharSequence charSequence = this.f119016a;
                int i10 = this.f119017b;
                this.f119017b = i10 + 1;
                iCharAt = charSequence.charAt(i10);
            } else {
                iCharAt = -1;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iCharAt;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cbuf, int off, int len) throws IOException {
        try {
            com.google.common.base.j0.f0(off, off + len, cbuf.length);
            a();
            Objects.requireNonNull(this.f119016a);
            if (!b()) {
                return -1;
            }
            int iMin = Math.min(len, c());
            for (int i10 = 0; i10 < iMin; i10++) {
                CharSequence charSequence = this.f119016a;
                int i11 = this.f119017b;
                this.f119017b = i11 + 1;
                cbuf[off + i10] = charSequence.charAt(i11);
            }
            return iMin;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
