package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class b0 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile byte[] f96954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f96955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f96956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f96958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f96959f;

    static class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f96960a = -4338378848813561757L;

        a(String str) {
            super(str);
        }
    }

    public b0(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f96957d;
        if (i10 != -1) {
            int i11 = this.f96958e - i10;
            int i12 = this.f96956c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f96955b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f96959f.a(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f96954a = bArr2;
                    this.f96959f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f96958e - this.f96957d;
                this.f96958e = i13;
                this.f96957d = 0;
                this.f96955b = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f96958e;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f96955b = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f96957d = -1;
            this.f96958e = 0;
            this.f96955b = i16;
        }
        return i16;
    }

    private static IOException c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f96954a == null || inputStream == null) {
            throw c();
        }
        return (this.f96955b - this.f96958e) + inputStream.available();
    }

    public synchronized void b() {
        this.f96956c = this.f96954a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f96954a != null) {
            this.f96959f.put(this.f96954a);
            this.f96954a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        try {
            this.f96956c = Math.max(this.f96956c, i10);
            this.f96957d = this.f96958e;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        try {
            byte[] bArr = this.f96954a;
            InputStream inputStream = ((FilterInputStream) this).in;
            if (bArr == null || inputStream == null) {
                throw c();
            }
            if (this.f96958e >= this.f96955b && a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f96954a && (bArr = this.f96954a) == null) {
                throw c();
            }
            int i10 = this.f96955b;
            int i11 = this.f96958e;
            if (i10 - i11 <= 0) {
                return -1;
            }
            this.f96958e = i11 + 1;
            return bArr[i11] & 255;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void release() {
        try {
            if (this.f96954a != null) {
                this.f96959f.put(this.f96954a);
                this.f96954a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            if (this.f96954a == null) {
                throw new IOException("Stream is closed");
            }
            int i10 = this.f96957d;
            if (-1 == i10) {
                throw new a("Mark has been invalidated, pos: " + this.f96958e + " markLimit: " + this.f96956c);
            }
            this.f96958e = i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        try {
            byte[] bArr = this.f96954a;
            if (bArr == null) {
                throw c();
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                throw c();
            }
            int i10 = this.f96955b;
            int i11 = this.f96958e;
            if (i10 - i11 >= j10) {
                this.f96958e = (int) (((long) i11) + j10);
                return j10;
            }
            long j11 = ((long) i10) - ((long) i11);
            this.f96958e = i10;
            if (this.f96957d == -1 || j10 > this.f96956c) {
                return j11 + inputStream.skip(j10 - j11);
            }
            if (a(inputStream, bArr) == -1) {
                return j11;
            }
            int i12 = this.f96955b;
            int i13 = this.f96958e;
            if (i12 - i13 >= j10 - j11) {
                this.f96958e = (int) ((((long) i13) + j10) - j11);
                return j10;
            }
            long j12 = (j11 + ((long) i12)) - ((long) i13);
            this.f96958e = i12;
            return j12;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    b0(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i10) {
        super(inputStream);
        this.f96957d = -1;
        this.f96959f = bVar;
        this.f96954a = (byte[]) bVar.a(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f96954a;
        if (bArr2 == null) {
            throw c();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw c();
        }
        int i14 = this.f96958e;
        int i15 = this.f96955b;
        if (i14 < i15) {
            int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
            System.arraycopy(bArr2, i14, bArr, i10, i16);
            this.f96958e += i16;
            if (i16 == i11 || inputStream.available() == 0) {
                return i16;
            }
            i10 += i16;
            i12 = i11 - i16;
        } else {
            i12 = i11;
        }
        while (true) {
            int i17 = -1;
            if (this.f96957d == -1 && i12 >= bArr2.length) {
                i13 = inputStream.read(bArr, i10, i12);
                if (i13 == -1) {
                    if (i12 != i11) {
                        i17 = i11 - i12;
                    }
                    return i17;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
                if (bArr2 != this.f96954a && (bArr2 = this.f96954a) == null) {
                    throw c();
                }
                int i18 = this.f96955b;
                int i19 = this.f96958e;
                i13 = i18 - i19 >= i12 ? i12 : i18 - i19;
                System.arraycopy(bArr2, i19, bArr, i10, i13);
                this.f96958e += i13;
            }
            i12 -= i13;
            if (i12 == 0) {
                return i11;
            }
            if (inputStream.available() == 0) {
                return i11 - i12;
            }
            i10 += i13;
        }
    }
}
