package org.apache.commons.io.input;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
public class r implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f336641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f336642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RandomAccessFile f336643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f336644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f336645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[][] f336646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f336647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f336648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f336649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f336650j;

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f336651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f336652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f336653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f336654d;

        private void c() {
            int i10 = this.f336654d + 1;
            if (i10 > 0) {
                byte[] bArr = new byte[i10];
                this.f336653c = bArr;
                System.arraycopy(this.f336652b, 0, bArr, 0, i10);
            } else {
                this.f336653c = null;
            }
            this.f336654d = -1;
        }

        private int d(byte[] bArr, int i10) {
            for (byte[] bArr2 : r.this.f336646f) {
                boolean z10 = true;
                for (int length = bArr2.length - 1; length >= 0; length--) {
                    int length2 = (i10 + length) - (bArr2.length - 1);
                    z10 &= length2 >= 0 && bArr[length2] == bArr2[length];
                }
                if (z10) {
                    return bArr2.length;
                }
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String e() throws IOException {
            String str;
            byte[] bArr;
            boolean z10 = this.f336651a == 1;
            int i10 = this.f336654d;
            while (true) {
                if (i10 > -1) {
                    if (z10 || i10 >= r.this.f336647g) {
                        int iD = d(this.f336652b, i10);
                        if (iD > 0) {
                            int i11 = i10 + 1;
                            int i12 = (this.f336654d - i11) + 1;
                            if (i12 < 0) {
                                throw new IllegalStateException("Unexpected negative line length=" + i12);
                            }
                            byte[] bArr2 = new byte[i12];
                            System.arraycopy(this.f336652b, i11, bArr2, 0, i12);
                            str = new String(bArr2, r.this.f336642b);
                            this.f336654d = i10 - iD;
                            break;
                        }
                        i10 -= r.this.f336648h;
                        if (i10 < 0) {
                            c();
                        }
                    } else {
                        c();
                    }
                }
                str = null;
                break;
            }
            if (!z10 || (bArr = this.f336653c) == null) {
                return str;
            }
            String str2 = new String(bArr, r.this.f336642b);
            this.f336653c = null;
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b f() throws IOException {
            if (this.f336654d > -1) {
                throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.f336654d);
            }
            long j10 = this.f336651a;
            if (j10 > 1) {
                r rVar = r.this;
                return rVar.new b(j10 - 1, rVar.f336641a, this.f336653c);
            }
            if (this.f336653c == null) {
                return null;
            }
            throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.f336653c, r.this.f336642b));
        }

        private b(long j10, int i10, byte[] bArr) throws IOException {
            this.f336651a = j10;
            byte[] bArr2 = new byte[(bArr != null ? bArr.length : 0) + i10];
            this.f336652b = bArr2;
            long j11 = (j10 - 1) * ((long) r.this.f336641a);
            if (j10 > 0) {
                r.this.f336643c.seek(j11);
                if (r.this.f336643c.read(bArr2, 0, i10) != i10) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i10, bArr.length);
            }
            this.f336654d = bArr2.length - 1;
            this.f336653c = null;
        }
    }

    @Deprecated
    public r(File file) throws IOException {
        this(file, 4096, Charset.defaultCharset());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f336643c.close();
    }

    public String g() throws IOException {
        String strE = this.f336649i.e();
        while (strE == null) {
            b bVarF = this.f336649i.f();
            this.f336649i = bVarF;
            if (bVarF == null) {
                break;
            }
            strE = bVarF.e();
        }
        if (!"".equals(strE) || this.f336650j) {
            return strE;
        }
        this.f336650j = true;
        return g();
    }

    public r(File file, Charset charset) throws IOException {
        this(file, 4096, charset);
    }

    public r(File file, int i10, Charset charset) throws IOException {
        int i11;
        this.f336650j = false;
        this.f336641a = i10;
        this.f336642b = charset;
        Charset charsetC = org.apache.commons.io.b.c(charset);
        if (charsetC.newEncoder().maxBytesPerChar() != 1.0f && charsetC != org.apache.commons.io.b.f336435f && charsetC != Charset.forName("Shift_JIS") && charsetC != Charset.forName("windows-31j") && charsetC != Charset.forName("x-windows-949") && charsetC != Charset.forName("gbk") && charsetC != Charset.forName("x-windows-950")) {
            if (charsetC != org.apache.commons.io.b.f336433d && charsetC != org.apache.commons.io.b.f336434e) {
                if (charsetC == org.apache.commons.io.b.f336432c) {
                    throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
                }
                throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
            }
            this.f336648h = 2;
        } else {
            this.f336648h = 1;
        }
        byte[][] bArr = {"\r\n".getBytes(charset), "\n".getBytes(charset), org.apache.commons.lang3.z.f337565d.getBytes(charset)};
        this.f336646f = bArr;
        this.f336647g = bArr[0].length;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.f336643c = randomAccessFile;
        long length = randomAccessFile.length();
        this.f336644d = length;
        long j10 = i10;
        int i12 = (int) (length % j10);
        if (i12 > 0) {
            this.f336645e = (length / j10) + 1;
        } else {
            this.f336645e = length / j10;
            i11 = length > 0 ? i10 : i11;
            this.f336649i = new b(this.f336645e, i11, null);
        }
        i11 = i12;
        this.f336649i = new b(this.f336645e, i11, null);
    }

    public r(File file, int i10, String str) throws IOException {
        this(file, i10, org.apache.commons.io.b.b(str));
    }
}
