package com.fasterxml.jackson.core.util;

import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f102789f = new byte[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f102790g = 500;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f102791h = 262144;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f102792i = 40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f102793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedList<byte[]> f102794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f102795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f102796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f102797e;

    public c() {
        this((a) null);
    }

    private void a() {
        int length = this.f102795c + this.f102796d.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.f102795c = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 262144) {
            iMax = 262144;
        }
        this.f102794b.add(this.f102796d);
        this.f102796d = new byte[iMax];
        this.f102797e = 0;
    }

    public void b(int i10) {
        if (this.f102797e >= this.f102796d.length) {
            a();
        }
        byte[] bArr = this.f102796d;
        int i11 = this.f102797e;
        this.f102797e = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public void c(int i10) {
        int i11 = this.f102797e;
        int i12 = i11 + 3;
        byte[] bArr = this.f102796d;
        if (i12 >= bArr.length) {
            b(i10 >> 24);
            b(i10 >> 16);
            b(i10 >> 8);
            b(i10);
            return;
        }
        int i13 = i11 + 1;
        this.f102797e = i13;
        bArr[i11] = (byte) (i10 >> 24);
        int i14 = i11 + 2;
        this.f102797e = i14;
        bArr[i13] = (byte) (i10 >> 16);
        int i15 = i11 + 3;
        this.f102797e = i15;
        bArr[i14] = (byte) (i10 >> 8);
        this.f102797e = i11 + 4;
        bArr[i15] = (byte) i10;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void d(int i10) {
        int i11 = this.f102797e;
        int i12 = i11 + 2;
        byte[] bArr = this.f102796d;
        if (i12 >= bArr.length) {
            b(i10 >> 16);
            b(i10 >> 8);
            b(i10);
            return;
        }
        int i13 = i11 + 1;
        this.f102797e = i13;
        bArr[i11] = (byte) (i10 >> 16);
        int i14 = i11 + 2;
        this.f102797e = i14;
        bArr[i13] = (byte) (i10 >> 8);
        this.f102797e = i11 + 3;
        bArr[i14] = (byte) i10;
    }

    public void e(int i10) {
        int i11 = this.f102797e;
        int i12 = i11 + 1;
        byte[] bArr = this.f102796d;
        if (i12 >= bArr.length) {
            b(i10 >> 8);
            b(i10);
            return;
        }
        int i13 = i11 + 1;
        this.f102797e = i13;
        bArr[i11] = (byte) (i10 >> 8);
        this.f102797e = i11 + 2;
        bArr[i13] = (byte) i10;
    }

    public byte[] f(int i10) {
        this.f102797e = i10;
        return q();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public byte[] g() {
        a();
        return this.f102796d;
    }

    public byte[] h() {
        return this.f102796d;
    }

    public int j() {
        return this.f102797e;
    }

    public byte[] l() {
        reset();
        return this.f102796d;
    }

    public void m(int i10) {
        this.f102797e = i10;
    }

    public int o() {
        return this.f102795c + this.f102797e;
    }

    public byte[] q() {
        int i10 = this.f102795c + this.f102797e;
        if (i10 == 0) {
            return f102789f;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (byte[] bArr2 : this.f102794b) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        System.arraycopy(this.f102796d, 0, bArr, i11, this.f102797e);
        int i12 = i11 + this.f102797e;
        if (i12 == i10) {
            if (!this.f102794b.isEmpty()) {
                reset();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i10 + ", copied " + i12 + " bytes");
    }

    public void release() {
        byte[] bArr;
        reset();
        a aVar = this.f102793a;
        if (aVar == null || (bArr = this.f102796d) == null) {
            return;
        }
        aVar.i(2, bArr);
        this.f102796d = null;
    }

    public void reset() {
        this.f102795c = 0;
        this.f102797e = 0;
        if (!this.f102794b.isEmpty()) {
            this.f102794b.clear();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public c(a aVar) {
        this(aVar, 500);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        while (true) {
            int iMin = Math.min(this.f102796d.length - this.f102797e, i11);
            if (iMin > 0) {
                System.arraycopy(bArr, i10, this.f102796d, this.f102797e, iMin);
                i10 += iMin;
                this.f102797e += iMin;
                i11 -= iMin;
            }
            if (i11 <= 0) {
                return;
            } else {
                a();
            }
        }
    }

    public c(int i10) {
        this(null, i10);
    }

    public c(a aVar, int i10) {
        this.f102794b = new LinkedList<>();
        this.f102793a = aVar;
        this.f102796d = aVar == null ? new byte[i10] : aVar.a(2);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        b(i10);
    }
}
