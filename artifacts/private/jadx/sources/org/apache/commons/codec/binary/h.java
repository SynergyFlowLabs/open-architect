package org.apache.commons.codec.binary;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class h extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f335206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f335207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f335208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g.a f335209d;

    protected h(InputStream inputStream, g gVar, boolean z10) {
        super(inputStream);
        this.f335208c = new byte[1];
        this.f335209d = new g.a();
        this.f335207b = z10;
        this.f335206a = gVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return !this.f335209d.f335203f ? 1 : 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = read(this.f335208c, 0, 1);
        while (i10 == 0) {
            i10 = read(this.f335208c, 0, 1);
        }
        if (i10 <= 0) {
            return -1;
        }
        byte b10 = this.f335208c[0];
        return b10 < 0 ? b10 + 256 : b10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        int i10;
        if (j10 < 0) {
            throw new IllegalArgumentException("Negative skip length: " + j10);
        }
        byte[] bArr = new byte[512];
        long j11 = j10;
        while (j11 > 0 && (i10 = read(bArr, 0, (int) Math.min(512, j11))) != -1) {
            j11 -= (long) i10;
        }
        return j10 - j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        bArr.getClass();
        if (i10 >= 0 && i11 >= 0) {
            if (i10 > bArr.length || i10 + i11 > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            if (i11 == 0) {
                return 0;
            }
            int iW = 0;
            while (iW == 0) {
                if (!this.f335206a.r(this.f335209d)) {
                    byte[] bArr2 = new byte[this.f335207b ? 4096 : 8192];
                    int i12 = ((FilterInputStream) this).in.read(bArr2);
                    if (this.f335207b) {
                        this.f335206a.k(bArr2, 0, i12, this.f335209d);
                    } else {
                        this.f335206a.i(bArr2, 0, i12, this.f335209d);
                    }
                }
                iW = this.f335206a.w(bArr, i10, i11, this.f335209d);
            }
            return iW;
        }
        throw new IndexOutOfBoundsException();
    }
}
