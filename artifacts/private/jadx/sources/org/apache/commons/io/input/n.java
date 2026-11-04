package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes14.dex */
public class n extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f336627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f336628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f336629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f336630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f336631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f336632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f336633g;

    public n(long j10) {
        this(j10, true, false);
    }

    private int a() throws EOFException {
        this.f336631e = true;
        if (this.f336632f) {
            throw new EOFException();
        }
        return -1;
    }

    public long b() {
        return this.f336628b;
    }

    public long c() {
        return this.f336627a;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f336631e = false;
        this.f336628b = 0L;
        this.f336629c = -1L;
    }

    protected int d() {
        return 0;
    }

    protected void e(char[] cArr, int i10, int i11) {
    }

    @Override // java.io.Reader
    public synchronized void mark(int i10) {
        try {
            if (!this.f336633g) {
                throw new UnsupportedOperationException("Mark not supported");
            }
            this.f336629c = this.f336628b;
            this.f336630d = i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return this.f336633g;
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.f336631e) {
            throw new IOException("Read after end of file");
        }
        long j10 = this.f336628b;
        if (j10 == this.f336627a) {
            return a();
        }
        this.f336628b = j10 + 1;
        return d();
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        try {
            if (!this.f336633g) {
                throw new UnsupportedOperationException("Mark not supported");
            }
            long j10 = this.f336629c;
            if (j10 < 0) {
                throw new IOException("No position has been marked");
            }
            if (this.f336628b > this.f336630d + j10) {
                throw new IOException("Marked position [" + this.f336629c + "] is no longer valid - passed the read limit [" + this.f336630d + "]");
            }
            this.f336628b = j10;
            this.f336631e = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Reader
    public long skip(long j10) throws IOException {
        if (this.f336631e) {
            throw new IOException("Skip after end of file");
        }
        long j11 = this.f336628b;
        long j12 = this.f336627a;
        if (j11 == j12) {
            return a();
        }
        long j13 = j11 + j10;
        this.f336628b = j13;
        if (j13 <= j12) {
            return j10;
        }
        long j14 = j10 - (j13 - j12);
        this.f336628b = j12;
        return j14;
    }

    public n(long j10, boolean z10, boolean z11) {
        this.f336629c = -1L;
        this.f336627a = j10;
        this.f336633g = z10;
        this.f336632f = z11;
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        if (!this.f336631e) {
            long j10 = this.f336628b;
            long j11 = this.f336627a;
            if (j10 == j11) {
                return a();
            }
            long j12 = j10 + ((long) i11);
            this.f336628b = j12;
            if (j12 > j11) {
                i11 -= (int) (j12 - j11);
                this.f336628b = j11;
            }
            e(cArr, i10, i11);
            return i11;
        }
        throw new IOException("Read after end of file");
    }
}
