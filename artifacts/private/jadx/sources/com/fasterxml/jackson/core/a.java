package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f102215h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f102216i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final char f102217j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f102218k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f102219l = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int[] f102220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient char[] f102221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient byte[] f102222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f102223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient boolean f102224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient char f102225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f102226g;

    public a(String str, String str2, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this.f102220a = iArr;
        char[] cArr = new char[64];
        this.f102221b = cArr;
        this.f102222c = new byte[64];
        this.f102223d = str;
        this.f102224e = z10;
        this.f102225f = c10;
        this.f102226g = i10;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < length; i11++) {
            char c11 = this.f102221b[i11];
            this.f102222c[i11] = (byte) c11;
            this.f102220a[c11] = i11;
        }
        if (z10) {
            this.f102220a[c10] = -2;
        }
    }

    protected void a() throws IllegalArgumentException {
        throw new IllegalArgumentException("Unexpected end-of-String in base64 content");
    }

    protected void b(char c10, int i10, String str) throws IllegalArgumentException {
        String str2;
        if (c10 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c10) + ") as character #" + (i10 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (v(c10)) {
            str2 = "Unexpected padding character ('" + t() + "') as character #" + (i10 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c10) || Character.isISOControl(c10)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c10 + "' (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public void c(String str, com.fasterxml.jackson.core.util.c cVar) throws IllegalArgumentException {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt > ' ') {
                int iF = f(cCharAt);
                if (iF < 0) {
                    b(cCharAt, 0, null);
                }
                if (i11 >= length) {
                    a();
                }
                int i12 = i10 + 2;
                char cCharAt2 = str.charAt(i11);
                int iF2 = f(cCharAt2);
                if (iF2 < 0) {
                    b(cCharAt2, 1, null);
                }
                int i13 = (iF << 6) | iF2;
                if (i12 >= length) {
                    if (!u()) {
                        cVar.b(i13 >> 4);
                        return;
                    }
                    a();
                }
                int i14 = i10 + 3;
                char cCharAt3 = str.charAt(i12);
                int iF3 = f(cCharAt3);
                if (iF3 < 0) {
                    if (iF3 != -2) {
                        b(cCharAt3, 2, null);
                    }
                    if (i14 >= length) {
                        a();
                    }
                    i10 += 4;
                    char cCharAt4 = str.charAt(i14);
                    if (!v(cCharAt4)) {
                        b(cCharAt4, 3, "expected padding character '" + t() + "'");
                    }
                    cVar.b(i13 >> 4);
                } else {
                    int i15 = (i13 << 6) | iF3;
                    if (i14 >= length) {
                        if (!u()) {
                            cVar.e(i15 >> 2);
                            return;
                        }
                        a();
                    }
                    i10 += 4;
                    char cCharAt5 = str.charAt(i14);
                    int iF4 = f(cCharAt5);
                    if (iF4 < 0) {
                        if (iF4 != -2) {
                            b(cCharAt5, 3, null);
                        }
                        cVar.e(i15 >> 2);
                    } else {
                        cVar.d((i15 << 6) | iF4);
                    }
                }
            } else {
                i10 = i11;
            }
        }
    }

    public byte[] d(String str) throws IllegalArgumentException {
        com.fasterxml.jackson.core.util.c cVar = new com.fasterxml.jackson.core.util.c();
        c(str, cVar);
        return cVar.q();
    }

    public int e(byte b10) {
        if (b10 < 0) {
            return -1;
        }
        return this.f102220a[b10];
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int f(char c10) {
        if (c10 <= 127) {
            return this.f102220a[c10];
        }
        return -1;
    }

    public int g(int i10) {
        if (i10 <= 127) {
            return this.f102220a[i10];
        }
        return -1;
    }

    public String getName() {
        return this.f102223d;
    }

    public String h(byte[] bArr) {
        return i(bArr, false);
    }

    public int hashCode() {
        return this.f102223d.hashCode();
    }

    public String i(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z10) {
            sb2.append('\"');
        }
        int iR = r() >> 2;
        int i10 = length - 3;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = i11 + 2;
            int i13 = ((bArr[i11 + 1] & 255) | (bArr[i11] << 8)) << 8;
            i11 += 3;
            n(sb2, i13 | (bArr[i12] & 255));
            iR--;
            if (iR <= 0) {
                sb2.append('\\');
                sb2.append('n');
                iR = r() >> 2;
            }
        }
        int i14 = length - i11;
        if (i14 > 0) {
            int i15 = i11 + 1;
            int i16 = bArr[i11] << com.google.common.base.c.f116465r;
            if (i14 == 2) {
                i16 |= (bArr[i15] & 255) << 8;
            }
            q(sb2, i16, i14);
        }
        if (z10) {
            sb2.append('\"');
        }
        return sb2.toString();
    }

    public byte j(int i10) {
        return this.f102222c[i10];
    }

    public char k(int i10) {
        return this.f102221b[i10];
    }

    public int l(int i10, byte[] bArr, int i11) {
        byte[] bArr2 = this.f102222c;
        bArr[i11] = bArr2[(i10 >> 18) & 63];
        bArr[i11 + 1] = bArr2[(i10 >> 12) & 63];
        int i12 = i11 + 3;
        bArr[i11 + 2] = bArr2[(i10 >> 6) & 63];
        int i13 = i11 + 4;
        bArr[i12] = bArr2[i10 & 63];
        return i13;
    }

    public int m(int i10, char[] cArr, int i11) {
        char[] cArr2 = this.f102221b;
        cArr[i11] = cArr2[(i10 >> 18) & 63];
        cArr[i11 + 1] = cArr2[(i10 >> 12) & 63];
        int i12 = i11 + 3;
        cArr[i11 + 2] = cArr2[(i10 >> 6) & 63];
        int i13 = i11 + 4;
        cArr[i12] = cArr2[i10 & 63];
        return i13;
    }

    public void n(StringBuilder sb2, int i10) {
        sb2.append(this.f102221b[(i10 >> 18) & 63]);
        sb2.append(this.f102221b[(i10 >> 12) & 63]);
        sb2.append(this.f102221b[(i10 >> 6) & 63]);
        sb2.append(this.f102221b[i10 & 63]);
    }

    public int o(int i10, int i11, byte[] bArr, int i12) {
        byte[] bArr2 = this.f102222c;
        bArr[i12] = bArr2[(i10 >> 18) & 63];
        int i13 = i12 + 2;
        bArr[i12 + 1] = bArr2[(i10 >> 12) & 63];
        if (!this.f102224e) {
            if (i11 != 2) {
                return i13;
            }
            int i14 = i12 + 3;
            bArr[i13] = bArr2[(i10 >> 6) & 63];
            return i14;
        }
        byte b10 = (byte) this.f102225f;
        int i15 = i12 + 3;
        bArr[i13] = i11 == 2 ? bArr2[(i10 >> 6) & 63] : b10;
        int i16 = i12 + 4;
        bArr[i15] = b10;
        return i16;
    }

    public int p(int i10, int i11, char[] cArr, int i12) {
        char[] cArr2 = this.f102221b;
        cArr[i12] = cArr2[(i10 >> 18) & 63];
        int i13 = i12 + 2;
        cArr[i12 + 1] = cArr2[(i10 >> 12) & 63];
        if (this.f102224e) {
            int i14 = i12 + 3;
            cArr[i13] = i11 == 2 ? cArr2[(i10 >> 6) & 63] : this.f102225f;
            int i15 = i12 + 4;
            cArr[i14] = this.f102225f;
            return i15;
        }
        if (i11 != 2) {
            return i13;
        }
        int i16 = i12 + 3;
        cArr[i13] = cArr2[(i10 >> 6) & 63];
        return i16;
    }

    public void q(StringBuilder sb2, int i10, int i11) {
        sb2.append(this.f102221b[(i10 >> 18) & 63]);
        sb2.append(this.f102221b[(i10 >> 12) & 63]);
        if (this.f102224e) {
            sb2.append(i11 == 2 ? this.f102221b[(i10 >> 6) & 63] : this.f102225f);
            sb2.append(this.f102225f);
        } else if (i11 == 2) {
            sb2.append(this.f102221b[(i10 >> 6) & 63]);
        }
    }

    public int r() {
        return this.f102226g;
    }

    protected Object readResolve() {
        return b.b(this.f102223d);
    }

    public byte s() {
        return (byte) this.f102225f;
    }

    public char t() {
        return this.f102225f;
    }

    public String toString() {
        return this.f102223d;
    }

    public boolean u() {
        return this.f102224e;
    }

    public boolean v(char c10) {
        if (c10 != this.f102225f) {
            return false;
        }
        int i10 = 3 ^ 1;
        return true;
    }

    public boolean w(int i10) {
        return i10 == this.f102225f;
    }

    public a(a aVar, String str, int i10) {
        this(aVar, str, aVar.f102224e, aVar.f102225f, i10);
    }

    public a(a aVar, String str, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this.f102220a = iArr;
        char[] cArr = new char[64];
        this.f102221b = cArr;
        byte[] bArr = new byte[64];
        this.f102222c = bArr;
        this.f102223d = str;
        byte[] bArr2 = aVar.f102222c;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = aVar.f102221b;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = aVar.f102220a;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f102224e = z10;
        this.f102225f = c10;
        this.f102226g = i10;
    }
}
