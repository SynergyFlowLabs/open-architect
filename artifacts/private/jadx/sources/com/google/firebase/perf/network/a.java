package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.i;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f124049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f124050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Timer f124051c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f124053e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f124052d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f124054f = -1;

    public a(InputStream inputStream, i iVar, Timer timer) {
        this.f124051c = timer;
        this.f124049a = inputStream;
        this.f124050b = iVar;
        this.f124053e = iVar.g();
    }

    private void a(long j10) {
        long j11 = this.f124052d;
        if (j11 == -1) {
            this.f124052d = j10;
        } else {
            this.f124052d = j11 + j10;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f124049a.available();
        } catch (IOException e10) {
            this.f124050b.y(this.f124051c.c());
            h.d(this.f124050b);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long jC = this.f124051c.c();
        if (this.f124054f == -1) {
            this.f124054f = jC;
        }
        try {
            this.f124049a.close();
            long j10 = this.f124052d;
            if (j10 != -1) {
                this.f124050b.w(j10);
            }
            long j11 = this.f124053e;
            if (j11 != -1) {
                this.f124050b.z(j11);
            }
            this.f124050b.y(this.f124054f);
            this.f124050b.b();
        } catch (IOException e10) {
            this.f124050b.y(this.f124051c.c());
            h.d(this.f124050b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f124049a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f124049a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int i10 = this.f124049a.read();
            long jC = this.f124051c.c();
            if (this.f124053e == -1) {
                this.f124053e = jC;
            }
            if (i10 != -1 || this.f124054f != -1) {
                a(1L);
                this.f124050b.w(this.f124052d);
                return i10;
            }
            this.f124054f = jC;
            this.f124050b.y(jC);
            this.f124050b.b();
            return i10;
        } catch (IOException e10) {
            this.f124050b.y(this.f124051c.c());
            h.d(this.f124050b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f124049a.reset();
        } catch (IOException e10) {
            this.f124050b.y(this.f124051c.c());
            h.d(this.f124050b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            long jSkip = this.f124049a.skip(j10);
            long jC = this.f124051c.c();
            if (this.f124053e == -1) {
                this.f124053e = jC;
            }
            if (jSkip == 0 && j10 != 0 && this.f124054f == -1) {
                this.f124054f = jC;
                this.f124050b.y(jC);
                return jSkip;
            }
            a(jSkip);
            this.f124050b.w(this.f124052d);
            return jSkip;
        } catch (IOException e10) {
            this.f124050b.y(this.f124051c.c());
            h.d(this.f124050b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            int i12 = this.f124049a.read(bArr, i10, i11);
            long jC = this.f124051c.c();
            if (this.f124053e == -1) {
                this.f124053e = jC;
            }
            if (i12 == -1 && this.f124054f == -1) {
                this.f124054f = jC;
                this.f124050b.y(jC);
                this.f124050b.b();
                return i12;
            }
            a(i12);
            this.f124050b.w(this.f124052d);
            return i12;
        } catch (IOException e10) {
            this.f124050b.y(this.f124051c.c());
            h.d(this.f124050b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int i10 = this.f124049a.read(bArr);
            long jC = this.f124051c.c();
            if (this.f124053e == -1) {
                this.f124053e = jC;
            }
            if (i10 == -1 && this.f124054f == -1) {
                this.f124054f = jC;
                this.f124050b.y(jC);
                this.f124050b.b();
                return i10;
            }
            a(i10);
            this.f124050b.w(this.f124052d);
            return i10;
        } catch (IOException e10) {
            this.f124050b.y(this.f124051c.c());
            h.d(this.f124050b);
            throw e10;
        }
    }
}
