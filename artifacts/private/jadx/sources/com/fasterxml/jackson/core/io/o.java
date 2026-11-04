package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends Writer {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f102474g = 55296;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f102475h = 56319;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f102476i = 56320;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f102477j = 57343;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f102478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OutputStream f102479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f102480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f102482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f102483f;

    public o(d dVar, OutputStream outputStream) {
        this.f102478a = dVar;
        this.f102479b = outputStream;
        byte[] bArrL = dVar.l();
        this.f102480c = bArrL;
        this.f102481d = bArrL.length - 4;
        this.f102482e = 0;
    }

    protected static void b(int i10) throws IOException {
        throw new IOException(c(i10));
    }

    protected static String c(int i10) {
        if (i10 > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i10) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i10 < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i10) + ") to output";
        }
        if (i10 <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i10) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i10) + ")";
    }

    protected int a(int i10) throws IOException {
        int i11 = this.f102483f;
        this.f102483f = 0;
        if (i10 >= 56320 && i10 <= 57343) {
            return ((i11 - 55296) << 10) + 65536 + (i10 - 56320);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i11) + ", second 0x" + Integer.toHexString(i10) + "; illegal combination");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f102479b;
        if (outputStream != null) {
            int i10 = this.f102482e;
            if (i10 > 0) {
                outputStream.write(this.f102480c, 0, i10);
                this.f102482e = 0;
            }
            OutputStream outputStream2 = this.f102479b;
            this.f102479b = null;
            byte[] bArr = this.f102480c;
            if (bArr != null) {
                this.f102480c = null;
                this.f102478a.w(bArr);
            }
            outputStream2.close();
            int i11 = this.f102483f;
            this.f102483f = 0;
            if (i11 > 0) {
                b(i11);
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f102479b;
        if (outputStream != null) {
            int i10 = this.f102482e;
            if (i10 > 0) {
                outputStream.write(this.f102480c, 0, i10);
                this.f102482e = 0;
            }
            this.f102479b.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        write(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        if (i11 < 2) {
            if (i11 == 1) {
                write(cArr[i10]);
                return;
            }
            return;
        }
        if (this.f102483f > 0) {
            i11--;
            write(a(cArr[i10]));
            i10++;
        }
        int i12 = this.f102482e;
        byte[] bArr = this.f102480c;
        int i13 = this.f102481d;
        int i14 = i11 + i10;
        while (i10 < i14) {
            if (i12 >= i13) {
                this.f102479b.write(bArr, 0, i12);
                i12 = 0;
            }
            int i15 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 < 128) {
                int i16 = i12 + 1;
                bArr[i12] = (byte) c10;
                int i17 = i14 - i15;
                int i18 = i13 - i16;
                if (i17 > i18) {
                    i17 = i18;
                }
                int i19 = i17 + i15;
                while (true) {
                    i10 = i15;
                    i12 = i16;
                    if (i10 >= i19) {
                        continue;
                    } else {
                        i15 = i10 + 1;
                        c10 = cArr[i10];
                        if (c10 < 128) {
                            i16 = i12 + 1;
                            bArr[i12] = (byte) c10;
                        }
                    }
                }
            }
            if (c10 < 2048) {
                int i20 = i12 + 1;
                bArr[i12] = (byte) ((c10 >> 6) | 192);
                i12 += 2;
                bArr[i20] = (byte) ((c10 & '?') | 128);
            } else if (c10 < 55296 || c10 > 57343) {
                bArr[i12] = (byte) ((c10 >> '\f') | 224);
                int i21 = i12 + 2;
                bArr[i12 + 1] = (byte) (((c10 >> 6) & 63) | 128);
                i12 += 3;
                bArr[i21] = (byte) ((c10 & '?') | 128);
            } else {
                if (c10 > 56319) {
                    this.f102482e = i12;
                    b(c10);
                }
                this.f102483f = c10;
                if (i15 >= i14) {
                    break;
                }
                i10 = i15 + 1;
                int iA = a(cArr[i15]);
                if (iA > 1114111) {
                    this.f102482e = i12;
                    b(iA);
                }
                bArr[i12] = (byte) ((iA >> 18) | 240);
                bArr[i12 + 1] = (byte) (((iA >> 12) & 63) | 128);
                int i22 = i12 + 3;
                bArr[i12 + 2] = (byte) (((iA >> 6) & 63) | 128);
                i12 += 4;
                bArr[i22] = (byte) ((iA & 63) | 128);
            }
            i10 = i15;
        }
        this.f102482e = i12;
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        int i11;
        if (this.f102483f > 0) {
            i10 = a(i10);
        } else if (i10 >= 55296 && i10 <= 57343) {
            if (i10 > 56319) {
                b(i10);
            }
            this.f102483f = i10;
            return;
        }
        int i12 = this.f102482e;
        if (i12 >= this.f102481d) {
            this.f102479b.write(this.f102480c, 0, i12);
            this.f102482e = 0;
        }
        if (i10 < 128) {
            byte[] bArr = this.f102480c;
            int i13 = this.f102482e;
            this.f102482e = i13 + 1;
            bArr[i13] = (byte) i10;
            return;
        }
        int i14 = this.f102482e;
        if (i10 < 2048) {
            byte[] bArr2 = this.f102480c;
            int i15 = i14 + 1;
            bArr2[i14] = (byte) ((i10 >> 6) | 192);
            i11 = i14 + 2;
            bArr2[i15] = (byte) ((i10 & 63) | 128);
        } else if (i10 <= 65535) {
            byte[] bArr3 = this.f102480c;
            bArr3[i14] = (byte) ((i10 >> 12) | 224);
            int i16 = i14 + 2;
            bArr3[i14 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            i11 = i14 + 3;
            bArr3[i16] = (byte) ((i10 & 63) | 128);
        } else {
            if (i10 > 1114111) {
                b(i10);
            }
            byte[] bArr4 = this.f102480c;
            bArr4[i14] = (byte) ((i10 >> 18) | 240);
            bArr4[i14 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            int i17 = i14 + 3;
            bArr4[i14 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            i11 = i14 + 4;
            bArr4[i17] = (byte) ((i10 & 63) | 128);
        }
        this.f102482e = i11;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        if (i11 < 2) {
            if (i11 == 1) {
                write(str.charAt(i10));
            }
            return;
        }
        if (this.f102483f > 0) {
            i11--;
            write(a(str.charAt(i10)));
            i10++;
        }
        int i12 = this.f102482e;
        byte[] bArr = this.f102480c;
        int i13 = this.f102481d;
        int i14 = i11 + i10;
        while (i10 < i14) {
            if (i12 >= i13) {
                int i15 = 7 & 0;
                this.f102479b.write(bArr, 0, i12);
                i12 = 0;
            }
            int i16 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                int i17 = i12 + 1;
                bArr[i12] = (byte) cCharAt;
                int i18 = i14 - i16;
                int i19 = i13 - i17;
                if (i18 > i19) {
                    i18 = i19;
                }
                int i20 = i18 + i16;
                while (true) {
                    i10 = i16;
                    i12 = i17;
                    if (i10 >= i20) {
                        continue;
                    } else {
                        i16 = i10 + 1;
                        cCharAt = str.charAt(i10);
                        if (cCharAt < 128) {
                            i17 = i12 + 1;
                            bArr[i12] = (byte) cCharAt;
                        }
                    }
                }
            }
            if (cCharAt < 2048) {
                int i21 = i12 + 1;
                bArr[i12] = (byte) ((cCharAt >> 6) | 192);
                i12 += 2;
                bArr[i21] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i12] = (byte) ((cCharAt >> '\f') | 224);
                int i22 = i12 + 2;
                bArr[i12 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i12 += 3;
                bArr[i22] = (byte) ((cCharAt & '?') | 128);
            } else {
                if (cCharAt > 56319) {
                    this.f102482e = i12;
                    b(cCharAt);
                }
                this.f102483f = cCharAt;
                if (i16 >= i14) {
                    break;
                }
                i10 = i16 + 1;
                int iA = a(str.charAt(i16));
                if (iA > 1114111) {
                    this.f102482e = i12;
                    b(iA);
                }
                bArr[i12] = (byte) ((iA >> 18) | 240);
                bArr[i12 + 1] = (byte) (((iA >> 12) & 63) | 128);
                int i23 = i12 + 3;
                bArr[i12 + 2] = (byte) (((iA >> 6) & 63) | 128);
                i12 += 4;
                bArr[i23] = (byte) ((iA & 63) | 128);
            }
            i10 = i16;
        }
        this.f102482e = i12;
    }
}
