package com.google.zxing.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f130275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130276b;

    public a() {
        this.f130276b = 0;
        this.f130275a = new int[1];
    }

    private void f(int i10) {
        if (i10 > (this.f130275a.length << 5)) {
            int[] iArrP = p(i10);
            int[] iArr = this.f130275a;
            System.arraycopy(iArr, 0, iArrP, 0, iArr.length);
            this.f130275a = iArrP;
        }
    }

    private static int[] p(int i10) {
        return new int[(i10 + 31) / 32];
    }

    public void a(boolean z10) {
        f(this.f130276b + 1);
        if (z10) {
            int[] iArr = this.f130275a;
            int i10 = this.f130276b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f130276b++;
    }

    public void b(a aVar) {
        int i10 = aVar.f130276b;
        f(this.f130276b + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.h(i11));
        }
    }

    public void c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        f(this.f130276b + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    public void d() {
        int length = this.f130275a.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f130275a[i10] = 0;
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f130275a.clone(), this.f130276b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f130276b == aVar.f130276b && Arrays.equals(this.f130275a, aVar.f130275a);
    }

    public void g(int i10) {
        int[] iArr = this.f130275a;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) ^ iArr[i11];
    }

    public boolean h(int i10) {
        return (this.f130275a[i10 / 32] & (1 << (i10 & 31))) != 0;
    }

    public int hashCode() {
        return (this.f130276b * 31) + Arrays.hashCode(this.f130275a);
    }

    public int[] i() {
        return this.f130275a;
    }

    public int j(int i10) {
        int i11 = this.f130276b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (~((1 << (i10 & 31)) - 1)) & this.f130275a[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f130275a;
            if (i12 == iArr.length) {
                return this.f130276b;
            }
            i13 = iArr[i12];
        }
        int iNumberOfTrailingZeros = (i12 << 5) + Integer.numberOfTrailingZeros(i13);
        int i14 = this.f130276b;
        return iNumberOfTrailingZeros > i14 ? i14 : iNumberOfTrailingZeros;
    }

    public int k(int i10) {
        int i11 = this.f130276b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (~((1 << (i10 & 31)) - 1)) & (~this.f130275a[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f130275a;
            if (i12 == iArr.length) {
                return this.f130276b;
            }
            i13 = ~iArr[i12];
        }
        int iNumberOfTrailingZeros = (i12 << 5) + Integer.numberOfTrailingZeros(i13);
        int i14 = this.f130276b;
        return iNumberOfTrailingZeros > i14 ? i14 : iNumberOfTrailingZeros;
    }

    public int l() {
        return this.f130276b;
    }

    public int n() {
        return (this.f130276b + 7) / 8;
    }

    public boolean o(int i10, int i11, boolean z10) {
        if (i11 < i10 || i10 < 0 || i11 > this.f130276b) {
            throw new IllegalArgumentException();
        }
        if (i11 == i10) {
            return true;
        }
        int i12 = i11 - 1;
        int i13 = i10 / 32;
        int i14 = i12 / 32;
        int i15 = i13;
        while (i15 <= i14) {
            int i16 = (2 << (i15 >= i14 ? 31 & i12 : 31)) - (1 << (i15 > i13 ? 0 : i10 & 31));
            int i17 = this.f130275a[i15] & i16;
            if (!z10) {
                i16 = 0;
            }
            if (i17 != i16) {
                return false;
            }
            i15++;
        }
        return true;
    }

    public void q() {
        int[] iArr = new int[this.f130275a.length];
        int i10 = (this.f130276b - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = this.f130275a[i12];
            long j11 = ((j10 & 1431655765) << 1) | ((j10 >> 1) & 1431655765);
            long j12 = ((j11 & 858993459) << 2) | ((j11 >> 2) & 858993459);
            long j13 = ((j12 & 252645135) << 4) | ((j12 >> 4) & 252645135);
            long j14 = ((j13 & 16711935) << 8) | ((j13 >> 8) & 16711935);
            iArr[i10 - i12] = (int) (((j14 & okhttp3.internal.ws.g.f334653t) << 16) | ((j14 >> 16) & okhttp3.internal.ws.g.f334653t));
        }
        int i13 = this.f130276b;
        int i14 = i11 << 5;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i10] = i16;
        }
        this.f130275a = iArr;
    }

    public void r(int i10) {
        int[] iArr = this.f130275a;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public void s(int i10, int i11) {
        this.f130275a[i10 / 32] = i11;
    }

    public void t(int i10, int i11) {
        if (i11 < i10 || i10 < 0 || i11 > this.f130276b) {
            throw new IllegalArgumentException();
        }
        if (i11 == i10) {
            return;
        }
        int i12 = i11 - 1;
        int i13 = i10 / 32;
        int i14 = i12 / 32;
        int i15 = i13;
        while (i15 <= i14) {
            int i16 = 31;
            int i17 = i15 > i13 ? 0 : i10 & 31;
            if (i15 >= i14) {
                i16 = 31 & i12;
            }
            int i18 = (2 << i16) - (1 << i17);
            int[] iArr = this.f130275a;
            iArr[i15] = i18 | iArr[i15];
            i15++;
        }
    }

    public String toString() {
        int i10 = this.f130276b;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f130276b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(h(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public void u(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (h(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void v(a aVar) {
        if (this.f130276b != aVar.f130276b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f130275a;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ aVar.f130275a[i10];
            i10++;
        }
    }

    public a(int i10) {
        this.f130276b = i10;
        this.f130275a = p(i10);
    }

    a(int[] iArr, int i10) {
        this.f130275a = iArr;
        this.f130276b = i10;
    }
}
