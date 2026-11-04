package com.fasterxml.jackson.core.io;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes4.dex */
public class n extends Reader {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final int f102461l = 1114111;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final char f102462m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final d f102463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected InputStream f102464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected byte[] f102465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f102466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f102467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final boolean f102468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected char f102469g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f102470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f102471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final boolean f102472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected char[] f102473k;

    public n(d dVar, InputStream inputStream, byte[] bArr, int i10, int i11, boolean z10) {
        this.f102463a = dVar;
        this.f102464b = inputStream;
        this.f102465c = bArr;
        this.f102466d = i10;
        this.f102467e = i11;
        this.f102468f = z10;
        this.f102472j = inputStream != null;
    }

    private void a() {
        byte[] bArr = this.f102465c;
        if (bArr != null) {
            this.f102465c = null;
            this.f102463a.u(bArr);
        }
    }

    private boolean b(int i10) throws IOException {
        int i11;
        this.f102471i += this.f102467e - i10;
        if (i10 > 0) {
            int i12 = this.f102466d;
            if (i12 > 0) {
                byte[] bArr = this.f102465c;
                System.arraycopy(bArr, i12, bArr, 0, i10);
                this.f102466d = 0;
            }
            this.f102467e = i10;
        } else {
            this.f102466d = 0;
            InputStream inputStream = this.f102464b;
            int i13 = inputStream == null ? -1 : inputStream.read(this.f102465c);
            if (i13 < 1) {
                this.f102467e = 0;
                if (i13 < 0) {
                    if (this.f102472j) {
                        a();
                    }
                    return false;
                }
                e();
            }
            this.f102467e = i13;
        }
        while (true) {
            int i14 = this.f102467e;
            if (i14 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.f102464b;
            if (inputStream2 == null) {
                i11 = -1;
            } else {
                byte[] bArr2 = this.f102465c;
                i11 = inputStream2.read(bArr2, i14, bArr2.length - i14);
            }
            if (i11 < 1) {
                if (i11 < 0) {
                    if (this.f102472j) {
                        a();
                    }
                    f(this.f102467e, 4);
                }
                e();
            }
            this.f102467e += i11;
        }
    }

    private void c(char[] cArr, int i10, int i11) throws IOException {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i10 + "," + i11 + "), cbuf[" + cArr.length + "]");
    }

    private void d(int i10, int i11, String str) throws IOException {
        int i12 = (this.f102471i + this.f102466d) - 1;
        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i10) + str + " at char #" + (this.f102470h + i11) + ", byte #" + i12 + ")");
    }

    private void e() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    private void f(int i10, int i11) throws IOException {
        int i12 = this.f102471i + i10;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i10 + ", needed " + i11 + ", at char #" + this.f102470h + ", byte #" + i12 + ")");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f102464b;
        if (inputStream != null) {
            this.f102464b = null;
            a();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.f102473k == null) {
            this.f102473k = new char[1];
        }
        if (read(this.f102473k, 0, 1) < 1) {
            return -1;
        }
        return this.f102473k[0];
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[LOOP:0: B:25:0x0048->B:43:0x00ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc A[SYNTHETIC] */
    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f102465c == null) {
            return -1;
        }
        if (i11 < 1) {
            return i11;
        }
        if (i10 < 0 || i10 + i11 > cArr.length) {
            c(cArr, i10, i11);
        }
        int i16 = i11 + i10;
        char c10 = this.f102469g;
        if (c10 != 0) {
            i12 = i10 + 1;
            cArr[i10] = c10;
            this.f102469g = (char) 0;
        } else {
            int i17 = this.f102467e - this.f102466d;
            if (i17 < 4 && !b(i17)) {
                if (i17 == 0) {
                    return -1;
                }
                f(this.f102467e - this.f102466d, 4);
            }
            i12 = i10;
        }
        int i18 = this.f102467e - 4;
        while (i12 < i16) {
            int i19 = this.f102466d;
            if (this.f102468f) {
                byte[] bArr = this.f102465c;
                i13 = (bArr[i19] << 8) | (bArr[i19 + 1] & 255);
                i14 = (bArr[i19 + 3] & 255) | ((bArr[i19 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this.f102465c;
                int i20 = (bArr2[i19] & 255) | ((bArr2[i19 + 1] & 255) << 8);
                i13 = (bArr2[i19 + 3] << 8) | (bArr2[i19 + 2] & 255);
                i14 = i20;
            }
            this.f102466d = i19 + 4;
            if (i13 != 0) {
                int i21 = 65535 & i13;
                int i22 = i14 | ((i21 - 1) << 16);
                if (i21 > 16) {
                    d(i22, i12 - i10, String.format(" (above 0x%08x)", Integer.valueOf(f102461l)));
                }
                i15 = i12 + 1;
                cArr[i12] = (char) ((i22 >> 10) + com.fasterxml.jackson.core.base.a.f102232g);
                int i23 = (i22 & 1023) | 56320;
                if (i15 >= i16) {
                    this.f102469g = (char) i22;
                } else {
                    i14 = i23;
                    i12 = i15;
                    i15 = i12 + 1;
                    cArr[i12] = (char) i14;
                    if (this.f102466d > i18) {
                        i12 = i15;
                    }
                }
            } else {
                i15 = i12 + 1;
                cArr[i12] = (char) i14;
                if (this.f102466d > i18) {
                    i12 = i15;
                }
            }
            i12 = i15;
            break;
        }
        int i24 = i12 - i10;
        this.f102470h += i24;
        return i24;
    }
}
