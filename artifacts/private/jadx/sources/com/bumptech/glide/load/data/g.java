package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f96316c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f96317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f96318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f96319f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f96320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f96321b;

    static {
        byte[] bArr = {-1, -31, 0, com.google.common.base.c.F, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, com.google.common.base.c.f116468u, 0, 2, 0, 0, 0, 1, 0};
        f96317d = bArr;
        int length = bArr.length;
        f96318e = length;
        f96319f = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f96320a = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10;
        int i11;
        int i12 = this.f96321b;
        if (i12 < 2 || i12 > (i11 = f96319f)) {
            i10 = super.read();
        } else {
            i10 = i12 == i11 ? this.f96320a : f96317d[i12 - 2] & 255;
        }
        if (i10 != -1) {
            this.f96321b++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f96321b = (int) (((long) this.f96321b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f96321b;
        int i14 = f96319f;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f96320a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f96317d, this.f96321b - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f96321b += i12;
        }
        return i12;
    }
}
