package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class c extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f336593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f336594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f336595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f336596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f336597e;

    public c(InputStream inputStream, long j10) {
        this.f336595c = 0L;
        this.f336596d = -1L;
        this.f336597e = true;
        this.f336594b = j10;
        this.f336593a = inputStream;
    }

    public boolean a() {
        return this.f336597e;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long j10 = this.f336594b;
        if (j10 < 0 || this.f336595c < j10) {
            return this.f336593a.available();
        }
        return 0;
    }

    public void b(boolean z10) {
        this.f336597e = z10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f336597e) {
            this.f336593a.close();
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        try {
            this.f336593a.mark(i10);
            this.f336596d = this.f336595c;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f336593a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j10 = this.f336594b;
        if (j10 >= 0 && this.f336595c >= j10) {
            return -1;
        }
        int i10 = this.f336593a.read();
        this.f336595c++;
        return i10;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            this.f336593a.reset();
            this.f336595c = this.f336596d;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        long j11 = this.f336594b;
        if (j11 >= 0) {
            j10 = Math.min(j10, j11 - this.f336595c);
        }
        long jSkip = this.f336593a.skip(j10);
        this.f336595c += jSkip;
        return jSkip;
    }

    public String toString() {
        return this.f336593a.toString();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f336594b;
        if (j10 >= 0 && this.f336595c >= j10) {
            return -1;
        }
        int i12 = this.f336593a.read(bArr, i10, (int) (j10 >= 0 ? Math.min(i11, j10 - this.f336595c) : i11));
        if (i12 == -1) {
            return -1;
        }
        this.f336595c += (long) i12;
        return i12;
    }

    public c(InputStream inputStream) {
        this(inputStream, -1L);
    }
}
