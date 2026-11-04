package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class b implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f96012f = 13;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f96013g = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f96014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f96015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f96016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f96018e;

    class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, b.this.f96015b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f96014a;
        byte[] bArr = this.f96016c;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f96017d = 0;
        this.f96018e = i10;
    }

    public boolean c() {
        return this.f96018e == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f96014a) {
            try {
                if (this.f96016c != null) {
                    this.f96016c = null;
                    this.f96014a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    public String d() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f96014a) {
            try {
                if (this.f96016c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f96017d >= this.f96018e) {
                    b();
                }
                for (int i12 = this.f96017d; i12 != this.f96018e; i12++) {
                    byte[] bArr2 = this.f96016c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f96017d;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] != 13) {
                                i11 = i12;
                            }
                        } else {
                            i11 = i12;
                        }
                        String str = new String(bArr2, i13, i11 - i13, this.f96015b.name());
                        this.f96017d = i12 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f96018e - this.f96017d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f96016c;
                    int i14 = this.f96017d;
                    aVar.write(bArr3, i14, this.f96018e - i14);
                    this.f96018e = -1;
                    b();
                    i10 = this.f96017d;
                    while (i10 != this.f96018e) {
                        bArr = this.f96016c;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f96017d;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f96017d = i10 + 1;
                return aVar.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(c.f96020a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f96014a = inputStream;
        this.f96015b = charset;
        this.f96016c = new byte[i10];
    }
}
