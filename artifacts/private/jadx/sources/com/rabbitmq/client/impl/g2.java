package com.rabbitmq.client.impl;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class g2 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f265204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f265205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f265206c;

    public g2(InputStream inputStream, long j10) {
        super(inputStream);
        this.f265205b = 0L;
        this.f265206c = 0L;
        this.f265204a = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return (int) Math.min(this.f265204a - this.f265205b, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f265206c = this.f265205b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f265205b >= this.f265204a) {
            return -1;
        }
        int i10 = super.read();
        if (i10 >= 0) {
            this.f265205b++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            super.reset();
            this.f265205b = this.f265206c;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(Math.min(j10, this.f265204a - this.f265205b));
        this.f265205b += jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f265204a;
        long j11 = this.f265205b;
        if (j10 <= j11) {
            return -1;
        }
        int i12 = super.read(bArr, i10, (int) Math.min(i11, j10 - j11));
        if (i12 > 0) {
            this.f265205b += (long) i12;
        }
        return i12;
    }
}
