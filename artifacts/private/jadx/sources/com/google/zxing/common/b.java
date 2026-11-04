package com.google.zxing.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f130277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f130280d;

    public b(int i10) {
        this(i10, i10);
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f130278b * (this.f130277a + 1));
        for (int i10 = 0; i10 < this.f130278b; i10++) {
            for (int i11 = 0; i11 < this.f130277a; i11++) {
                sb2.append(e(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public static b n(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        boolean[] zArr = new boolean[str.length()];
        int i10 = -1;
        int length = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (length < str.length()) {
            if (str.charAt(length) == '\n' || str.charAt(length) == '\r') {
                if (i11 > i12) {
                    if (i10 == -1) {
                        i10 = i11 - i12;
                    } else if (i11 - i12 != i10) {
                        throw new IllegalArgumentException("row lengths do not match");
                    }
                    i13++;
                    i12 = i11;
                }
                length++;
            } else {
                if (str.substring(length, str2.length() + length).equals(str2)) {
                    length += str2.length();
                    zArr[i11] = true;
                } else {
                    if (!str.substring(length, str3.length() + length).equals(str3)) {
                        throw new IllegalArgumentException("illegal character encountered: " + str.substring(length));
                    }
                    length += str3.length();
                    zArr[i11] = false;
                }
                i11++;
            }
        }
        if (i11 > i12) {
            if (i10 == -1) {
                i10 = i11 - i12;
            } else if (i11 - i12 != i10) {
                throw new IllegalArgumentException("row lengths do not match");
            }
            i13++;
        }
        b bVar = new b(i10, i13);
        for (int i14 = 0; i14 < i11; i14++) {
            if (zArr[i14]) {
                bVar.q(i14 % i10, i14 / i10);
            }
        }
        return bVar;
    }

    public static b o(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        b bVar = new b(length2, length);
        for (int i10 = 0; i10 < length; i10++) {
            boolean[] zArr2 = zArr[i10];
            for (int i11 = 0; i11 < length2; i11++) {
                if (zArr2[i11]) {
                    bVar.q(i11, i10);
                }
            }
        }
        return bVar;
    }

    public void b() {
        int length = this.f130280d.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f130280d[i10] = 0;
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f130277a, this.f130278b, this.f130279c, (int[]) this.f130280d.clone());
    }

    public void d(int i10, int i11) {
        int i12 = (i11 * this.f130279c) + (i10 / 32);
        int[] iArr = this.f130280d;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public boolean e(int i10, int i11) {
        return ((this.f130280d[(i11 * this.f130279c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f130277a == bVar.f130277a && this.f130278b == bVar.f130278b && this.f130279c == bVar.f130279c && Arrays.equals(this.f130280d, bVar.f130280d);
    }

    public int[] f() {
        int length = this.f130280d.length - 1;
        while (length >= 0 && this.f130280d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f130279c;
        int i11 = length / i10;
        int i12 = (length % i10) << 5;
        int i13 = this.f130280d[length];
        int i14 = 31;
        while ((i13 >>> i14) == 0) {
            i14--;
        }
        return new int[]{i12 + i14, i11};
    }

    public int[] g() {
        int i10 = this.f130277a;
        int i11 = this.f130278b;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < this.f130278b; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.f130279c;
                if (i15 < i16) {
                    int i17 = this.f130280d[(i16 * i14) + i15];
                    if (i17 != 0) {
                        if (i14 < i11) {
                            i11 = i14;
                        }
                        if (i14 > i13) {
                            i13 = i14;
                        }
                        int i18 = i15 << 5;
                        if (i18 < i10) {
                            int i19 = 0;
                            while ((i17 << (31 - i19)) == 0) {
                                i19++;
                            }
                            int i20 = i19 + i18;
                            if (i20 < i10) {
                                i10 = i20;
                            }
                        }
                        if (i18 + 31 > i12) {
                            int i21 = 31;
                            while ((i17 >>> i21) == 0) {
                                i21--;
                            }
                            int i22 = i18 + i21;
                            if (i22 > i12) {
                                i12 = i22;
                            }
                        }
                    }
                    i15++;
                }
            }
        }
        if (i12 < i10 || i13 < i11) {
            return null;
        }
        return new int[]{i10, i11, (i12 - i10) + 1, (i13 - i11) + 1};
    }

    public int h() {
        return this.f130278b;
    }

    public int hashCode() {
        int i10 = this.f130277a;
        return (((((((i10 * 31) + i10) * 31) + this.f130278b) * 31) + this.f130279c) * 31) + Arrays.hashCode(this.f130280d);
    }

    public a i(int i10, a aVar) {
        if (aVar == null || aVar.l() < this.f130277a) {
            aVar = new a(this.f130277a);
        } else {
            aVar.d();
        }
        int i11 = i10 * this.f130279c;
        for (int i12 = 0; i12 < this.f130279c; i12++) {
            aVar.s(i12 << 5, this.f130280d[i11 + i12]);
        }
        return aVar;
    }

    public int j() {
        return this.f130279c;
    }

    public int[] k() {
        int[] iArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            iArr = this.f130280d;
            if (i11 >= iArr.length || iArr[i11] != 0) {
                break;
            }
            i11++;
        }
        if (i11 == iArr.length) {
            return null;
        }
        int i12 = this.f130279c;
        int i13 = i11 / i12;
        int i14 = (i11 % i12) << 5;
        while ((iArr[i11] << (31 - i10)) == 0) {
            i10++;
        }
        return new int[]{i14 + i10, i13};
    }

    public int l() {
        return this.f130277a;
    }

    public void p() {
        int iL = l();
        int iH = h();
        a aVar = new a(iL);
        a aVar2 = new a(iL);
        int i10 = 3 | 0;
        for (int i11 = 0; i11 < (iH + 1) / 2; i11++) {
            aVar = i(i11, aVar);
            int i12 = (iH - 1) - i11;
            aVar2 = i(i12, aVar2);
            aVar.q();
            aVar2.q();
            s(i11, aVar2);
            s(i12, aVar);
        }
    }

    public void q(int i10, int i11) {
        int i12 = (i11 * this.f130279c) + (i10 / 32);
        int[] iArr = this.f130280d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void r(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f130278b || i14 > this.f130277a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f130279c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f130280d;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public void s(int i10, a aVar) {
        int[] iArrI = aVar.i();
        int[] iArr = this.f130280d;
        int i11 = this.f130279c;
        System.arraycopy(iArrI, 0, iArr, i10 * i11, i11);
    }

    public String t(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return t("X ", "  ");
    }

    @Deprecated
    public String u(String str, String str2, String str3) {
        return a(str, str2, str3);
    }

    public void v(int i10, int i11) {
        int i12 = (i11 * this.f130279c) + (i10 / 32);
        int[] iArr = this.f130280d;
        iArr[i12] = (~(1 << (i10 & 31))) & iArr[i12];
    }

    public void w(b bVar) {
        if (this.f130277a != bVar.l() || this.f130278b != bVar.h() || this.f130279c != bVar.j()) {
            throw new IllegalArgumentException("input matrix dimensions do not match");
        }
        a aVar = new a(this.f130277a);
        for (int i10 = 0; i10 < this.f130278b; i10++) {
            int i11 = this.f130279c * i10;
            int[] iArrI = bVar.i(i10, aVar).i();
            for (int i12 = 0; i12 < this.f130279c; i12++) {
                int[] iArr = this.f130280d;
                int i13 = i11 + i12;
                iArr[i13] = iArr[i13] ^ iArrI[i12];
            }
        }
    }

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f130277a = i10;
        this.f130278b = i11;
        int i12 = (i10 + 31) / 32;
        this.f130279c = i12;
        this.f130280d = new int[i12 * i11];
    }

    private b(int i10, int i11, int i12, int[] iArr) {
        this.f130277a = i10;
        this.f130278b = i11;
        this.f130279c = i12;
        this.f130280d = iArr;
    }
}
