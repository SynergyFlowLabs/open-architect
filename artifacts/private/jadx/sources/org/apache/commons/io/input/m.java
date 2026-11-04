package org.apache.commons.io.input;

import androidx.collection.g3;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class m extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f336620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f336621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f336622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f336623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f336624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f336625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f336626g;

    public m(long j10) {
        this(j10, true, false);
    }

    private int a() throws EOFException {
        this.f336624e = true;
        if (this.f336625f) {
            throw new EOFException();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int available() {
        long j10 = this.f336620a - this.f336621b;
        if (j10 <= 0) {
            return 0;
        }
        if (j10 > g3.f12256c) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    public long b() {
        return this.f336621b;
    }

    public long c() {
        return this.f336620a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f336624e = false;
        this.f336621b = 0L;
        this.f336622c = -1L;
    }

    protected int d() {
        return 0;
    }

    protected void e(byte[] bArr, int i10, int i11) {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        try {
            if (!this.f336626g) {
                throw new UnsupportedOperationException("Mark not supported");
            }
            this.f336622c = this.f336621b;
            this.f336623d = i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f336626g;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f336624e) {
            throw new IOException("Read after end of file");
        }
        long j10 = this.f336621b;
        if (j10 == this.f336620a) {
            return a();
        }
        this.f336621b = j10 + 1;
        return d();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!this.f336626g) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        long j10 = this.f336622c;
        if (j10 < 0) {
            throw new IOException("No position has been marked");
        }
        if (this.f336621b > this.f336623d + j10) {
            throw new IOException("Marked position [" + this.f336622c + "] is no longer valid - passed the read limit [" + this.f336623d + "]");
        }
        this.f336621b = j10;
        this.f336624e = false;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        if (this.f336624e) {
            throw new IOException("Skip after end of file");
        }
        long j11 = this.f336621b;
        long j12 = this.f336620a;
        if (j11 == j12) {
            return a();
        }
        long j13 = j11 + j10;
        this.f336621b = j13;
        if (j13 <= j12) {
            return j10;
        }
        long j14 = j10 - (j13 - j12);
        this.f336621b = j12;
        return j14;
    }

    public m(long j10, boolean z10, boolean z11) {
        this.f336622c = -1L;
        this.f336620a = j10;
        this.f336626g = z10;
        this.f336625f = z11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f336624e) {
            throw new IOException("Read after end of file");
        }
        long j10 = this.f336621b;
        long j11 = this.f336620a;
        if (j10 == j11) {
            return a();
        }
        long j12 = j10 + ((long) i11);
        this.f336621b = j12;
        if (j12 > j11) {
            i11 -= (int) (j12 - j11);
            this.f336621b = j11;
        }
        e(bArr, i10, i11);
        return i11;
    }
}
