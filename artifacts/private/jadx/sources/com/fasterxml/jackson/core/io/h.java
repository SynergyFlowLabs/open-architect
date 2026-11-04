package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f102435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f102436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f102437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f102438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f102439e;

    public h(d dVar, InputStream inputStream, byte[] bArr, int i10, int i11) {
        this.f102435a = dVar;
        this.f102436b = inputStream;
        this.f102437c = bArr;
        this.f102438d = i10;
        this.f102439e = i11;
    }

    private void a() {
        byte[] bArr = this.f102437c;
        if (bArr != null) {
            this.f102437c = null;
            d dVar = this.f102435a;
            if (dVar != null) {
                dVar.u(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f102437c != null ? this.f102439e - this.f102438d : this.f102436b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a();
        this.f102436b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        if (this.f102437c == null) {
            this.f102436b.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f102437c == null && this.f102436b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f102437c;
        if (bArr == null) {
            return this.f102436b.read();
        }
        int i10 = this.f102438d;
        int i11 = i10 + 1;
        this.f102438d = i11;
        int i12 = bArr[i10] & 255;
        if (i11 >= this.f102439e) {
            a();
        }
        return i12;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (this.f102437c == null) {
            this.f102436b.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip;
        if (this.f102437c != null) {
            int i10 = this.f102439e;
            int i11 = this.f102438d;
            jSkip = i10 - i11;
            if (jSkip > j10) {
                this.f102438d = i11 + ((int) j10);
                return j10;
            }
            a();
            j10 -= jSkip;
        } else {
            jSkip = 0;
        }
        if (j10 > 0) {
            jSkip += this.f102436b.skip(j10);
        }
        return jSkip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArr2 = this.f102437c;
        if (bArr2 != null) {
            int i12 = this.f102439e;
            int i13 = this.f102438d;
            int i14 = i12 - i13;
            if (i11 > i14) {
                i11 = i14;
            }
            System.arraycopy(bArr2, i13, bArr, i10, i11);
            int i15 = this.f102438d + i11;
            this.f102438d = i15;
            if (i15 >= this.f102439e) {
                a();
            }
            return i11;
        }
        return this.f102436b.read(bArr, i10, i11);
    }
}
