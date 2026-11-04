package org.apache.commons.io.output;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class c extends OutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f336747g = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<byte[]> f336748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f336749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f336750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f336751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f336752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f336753f;

    public c() {
        this(1024);
    }

    private void a(int i10) {
        if (this.f336749b < this.f336748a.size() - 1) {
            this.f336750c += this.f336751d.length;
            int i11 = this.f336749b + 1;
            this.f336749b = i11;
            this.f336751d = this.f336748a.get(i11);
            return;
        }
        byte[] bArr = this.f336751d;
        if (bArr == null) {
            this.f336750c = 0;
        } else {
            i10 = Math.max(bArr.length << 1, i10 - this.f336750c);
            this.f336750c += this.f336751d.length;
        }
        this.f336749b++;
        byte[] bArr2 = new byte[i10];
        this.f336751d = bArr2;
        this.f336748a.add(bArr2);
    }

    public static InputStream c(InputStream inputStream) throws IOException {
        return d(inputStream, 1024);
    }

    public static InputStream d(InputStream inputStream, int i10) throws IOException {
        c cVar = new c(i10);
        cVar.j(inputStream);
        return cVar.f();
    }

    public synchronized int b() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f336752e;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public synchronized byte[] e() {
        try {
            int i10 = this.f336752e;
            if (i10 == 0) {
                return f336747g;
            }
            byte[] bArr = new byte[i10];
            int i11 = 0;
            for (byte[] bArr2 : this.f336748a) {
                int iMin = Math.min(bArr2.length, i10);
                System.arraycopy(bArr2, 0, bArr, i11, iMin);
                i11 += iMin;
                i10 -= iMin;
                if (i10 == 0) {
                    break;
                }
            }
            return bArr;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized InputStream f() {
        int i10 = this.f336752e;
        if (i10 == 0) {
            return new org.apache.commons.io.input.j();
        }
        ArrayList arrayList = new ArrayList(this.f336748a.size());
        for (byte[] bArr : this.f336748a) {
            int iMin = Math.min(bArr.length, i10);
            arrayList.add(new ByteArrayInputStream(bArr, 0, iMin));
            i10 -= iMin;
            if (i10 == 0) {
                break;
            }
        }
        this.f336753f = false;
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public String g(String str) throws UnsupportedEncodingException {
        return new String(e(), str);
    }

    public String h(Charset charset) {
        return new String(e(), charset);
    }

    public synchronized int j(InputStream inputStream) throws IOException {
        int i10;
        try {
            int i11 = this.f336752e - this.f336750c;
            byte[] bArr = this.f336751d;
            int i12 = inputStream.read(bArr, i11, bArr.length - i11);
            i10 = 0;
            while (i12 != -1) {
                i10 += i12;
                i11 += i12;
                this.f336752e += i12;
                byte[] bArr2 = this.f336751d;
                if (i11 == bArr2.length) {
                    a(bArr2.length);
                    i11 = 0;
                }
                byte[] bArr3 = this.f336751d;
                i12 = inputStream.read(bArr3, i11, bArr3.length - i11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    public synchronized void l(OutputStream outputStream) throws IOException {
        try {
            int i10 = this.f336752e;
            for (byte[] bArr : this.f336748a) {
                int iMin = Math.min(bArr.length, i10);
                outputStream.write(bArr, 0, iMin);
                i10 -= iMin;
                if (i10 == 0) {
                    break;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void reset() {
        int i10 = 6 & 0;
        try {
            this.f336752e = 0;
            this.f336750c = 0;
            this.f336749b = 0;
            if (this.f336753f) {
                this.f336751d = this.f336748a.get(0);
            } else {
                this.f336751d = null;
                int length = this.f336748a.get(0).length;
                this.f336748a.clear();
                a(length);
                this.f336753f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Deprecated
    public String toString() {
        return new String(e(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        synchronized (this) {
            try {
                int i13 = this.f336752e;
                int i14 = i13 + i11;
                int i15 = i13 - this.f336750c;
                while (i11 > 0) {
                    int iMin = Math.min(i11, this.f336751d.length - i15);
                    System.arraycopy(bArr, i12 - i11, this.f336751d, i15, iMin);
                    i11 -= iMin;
                    if (i11 > 0) {
                        a(i14);
                        i15 = 0;
                    }
                }
                this.f336752e = i14;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c(int i10) {
        this.f336748a = new ArrayList();
        int i11 = 5 ^ 1;
        this.f336753f = true;
        if (i10 >= 0) {
            synchronized (this) {
                a(i10);
            }
        } else {
            throw new IllegalArgumentException("Negative initial size: " + i10);
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i10) {
        try {
            int i11 = this.f336752e;
            int i12 = i11 - this.f336750c;
            if (i12 == this.f336751d.length) {
                a(i11 + 1);
                i12 = 0;
            }
            this.f336751d[i12] = (byte) i10;
            this.f336752e++;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
