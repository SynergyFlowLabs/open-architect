package com.badlogic.gdx.utils;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f95170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f95172c;

    public a1() {
        this(true, 16);
    }

    public static a1 H(short... sArr) {
        return new a1(sArr);
    }

    public short[] A() {
        int length = this.f95170a.length;
        int i10 = this.f95171b;
        if (length != i10) {
            x(i10);
        }
        return this.f95170a;
    }

    public void B() {
        short[] sArr = this.f95170a;
        for (int i10 = this.f95171b - 1; i10 >= 0; i10--) {
            int iY = com.badlogic.gdx.math.s.y(i10);
            short s10 = sArr[i10];
            sArr[i10] = sArr[iY];
            sArr[iY] = s10;
        }
    }

    public void C() {
        Arrays.sort(this.f95170a, 0, this.f95171b);
    }

    public void D(int i10, int i11) {
        int i12 = this.f95171b;
        if (i10 >= i12) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i10 + " >= " + this.f95171b);
        }
        if (i11 < i12) {
            short[] sArr = this.f95170a;
            short s10 = sArr[i10];
            sArr[i10] = sArr[i11];
            sArr[i11] = s10;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i11 + " >= " + this.f95171b);
    }

    public short[] E() {
        int i10 = this.f95171b;
        short[] sArr = new short[i10];
        int i11 = 6 >> 0;
        System.arraycopy(this.f95170a, 0, sArr, 0, i10);
        return sArr;
    }

    public String F(String str) {
        if (this.f95171b == 0) {
            return "";
        }
        short[] sArr = this.f95170a;
        f1 f1Var = new f1(32);
        f1Var.d(sArr[0]);
        for (int i10 = 1; i10 < this.f95171b; i10++) {
            f1Var.o(str);
            f1Var.d(sArr[i10]);
        }
        return f1Var.toString();
    }

    public void G(int i10) {
        if (this.f95171b > i10) {
            this.f95171b = i10;
        }
    }

    public void a(int i10) {
        short[] sArrX = this.f95170a;
        int i11 = this.f95171b;
        if (i11 == sArrX.length) {
            sArrX = x(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f95171b;
        this.f95171b = i12 + 1;
        sArrX[i12] = (short) i10;
    }

    public void b(short s10) {
        short[] sArrX = this.f95170a;
        int i10 = this.f95171b;
        if (i10 == sArrX.length) {
            sArrX = x(Math.max(8, (int) (i10 * 1.75f)));
        }
        int i11 = this.f95171b;
        this.f95171b = i11 + 1;
        sArrX[i11] = s10;
    }

    public void c(a1 a1Var) {
        d(a1Var, 0, a1Var.f95171b);
    }

    public void d(a1 a1Var, int i10, int i11) {
        if (i10 + i11 <= a1Var.f95171b) {
            f(a1Var.f95170a, i10, i11);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i10 + " + " + i11 + " <= " + a1Var.f95171b);
    }

    public void e(short... sArr) {
        f(sArr, 0, sArr.length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        int i10 = this.f95171b;
        if (i10 != a1Var.f95171b) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f95170a[i11] != a1Var.f95170a[i11]) {
                return false;
            }
        }
        return true;
    }

    public void f(short[] sArr, int i10, int i11) {
        short[] sArrX = this.f95170a;
        int i12 = this.f95171b + i11;
        if (i12 > sArrX.length) {
            sArrX = x(Math.max(8, (int) (i12 * 1.75f)));
        }
        System.arraycopy(sArr, i10, sArrX, this.f95171b, i11);
        this.f95171b += i11;
    }

    public void g() {
        this.f95171b = 0;
    }

    public boolean h(short s10) {
        int i10 = this.f95171b - 1;
        short[] sArr = this.f95170a;
        while (i10 >= 0) {
            int i11 = i10 - 1;
            if (sArr[i10] == s10) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    public short[] i(int i10) {
        int i11 = this.f95171b + i10;
        if (i11 > this.f95170a.length) {
            x(Math.max(8, i11));
        }
        return this.f95170a;
    }

    public short j() {
        if (this.f95171b != 0) {
            return this.f95170a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public short k(int i10) {
        if (i10 < this.f95171b) {
            return this.f95170a[i10];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95171b);
    }

    public void l(int i10, short s10) {
        if (i10 < this.f95171b) {
            short[] sArr = this.f95170a;
            sArr[i10] = (short) (sArr[i10] + s10);
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95171b);
    }

    public int m(short s10) {
        short[] sArr = this.f95170a;
        int i10 = this.f95171b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (sArr[i11] == s10) {
                return i11;
            }
        }
        return -1;
    }

    public void n(int i10, short s10) {
        int i11 = this.f95171b;
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i10 + " > " + this.f95171b);
        }
        short[] sArrX = this.f95170a;
        if (i11 == sArrX.length) {
            sArrX = x(Math.max(8, (int) (i11 * 1.75f)));
        }
        if (this.f95172c) {
            System.arraycopy(sArrX, i10, sArrX, i10 + 1, this.f95171b - i10);
        } else {
            sArrX[this.f95171b] = sArrX[i10];
        }
        this.f95171b++;
        sArrX[i10] = s10;
    }

    public int o(char c10) {
        short[] sArr = this.f95170a;
        int i10 = this.f95171b;
        do {
            i10--;
            if (i10 < 0) {
                return -1;
            }
        } while (sArr[i10] != c10);
        return i10;
    }

    public void p(int i10, short s10) {
        if (i10 < this.f95171b) {
            short[] sArr = this.f95170a;
            sArr[i10] = (short) (sArr[i10] * s10);
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95171b);
    }

    public short q() {
        return this.f95170a[this.f95171b - 1];
    }

    public short r() {
        short[] sArr = this.f95170a;
        int i10 = this.f95171b - 1;
        this.f95171b = i10;
        return sArr[i10];
    }

    public short s() {
        int i10 = this.f95171b;
        if (i10 == 0) {
            return (short) 0;
        }
        return this.f95170a[com.badlogic.gdx.math.s.z(0, i10 - 1)];
    }

    public boolean t(a1 a1Var) {
        int i10 = this.f95171b;
        short[] sArr = this.f95170a;
        int i11 = a1Var.f95171b;
        int i12 = i10;
        for (int i13 = 0; i13 < i11; i13++) {
            short sK = a1Var.k(i13);
            for (int i14 = 0; i14 < i12; i14++) {
                if (sK == sArr[i14]) {
                    u(i14);
                    i12--;
                    break;
                }
            }
        }
        return i12 != i10;
    }

    public String toString() {
        if (this.f95171b == 0) {
            return okhttp3.v.f334777p;
        }
        short[] sArr = this.f95170a;
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_LIST);
        f1Var.d(sArr[0]);
        for (int i10 = 1; i10 < this.f95171b; i10++) {
            f1Var.o(", ");
            f1Var.d(sArr[i10]);
        }
        f1Var.append(AbstractJsonLexerKt.END_LIST);
        return f1Var.toString();
    }

    public short u(int i10) {
        int i11 = this.f95171b;
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95171b);
        }
        short[] sArr = this.f95170a;
        short s10 = sArr[i10];
        int i12 = i11 - 1;
        this.f95171b = i12;
        if (this.f95172c) {
            System.arraycopy(sArr, i10 + 1, sArr, i10, i12 - i10);
            return s10;
        }
        sArr[i10] = sArr[i12];
        return s10;
    }

    public void v(int i10, int i11) {
        int i12 = this.f95171b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i11 + " >= " + this.f95171b);
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i10 + " > " + i11);
        }
        short[] sArr = this.f95170a;
        int i13 = (i11 - i10) + 1;
        if (this.f95172c) {
            int i14 = i10 + i13;
            System.arraycopy(sArr, i14, sArr, i10, i12 - i14);
        } else {
            int i15 = i12 - 1;
            for (int i16 = 0; i16 < i13; i16++) {
                sArr[i10 + i16] = sArr[i15 - i16];
            }
        }
        this.f95171b -= i13;
    }

    public boolean w(short s10) {
        short[] sArr = this.f95170a;
        int i10 = this.f95171b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (sArr[i11] == s10) {
                u(i11);
                return true;
            }
        }
        return false;
    }

    protected short[] x(int i10) {
        short[] sArr = new short[i10];
        System.arraycopy(this.f95170a, 0, sArr, 0, Math.min(this.f95171b, i10));
        this.f95170a = sArr;
        return sArr;
    }

    public void y() {
        short[] sArr = this.f95170a;
        int i10 = this.f95171b;
        int i11 = i10 - 1;
        int i12 = i10 / 2;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i11 - i13;
            short s10 = sArr[i13];
            sArr[i13] = sArr[i14];
            sArr[i14] = s10;
        }
    }

    public void z(int i10, short s10) {
        if (i10 < this.f95171b) {
            this.f95170a[i10] = s10;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95171b);
    }

    public a1(int i10) {
        this(true, i10);
    }

    public a1(boolean z10, int i10) {
        this.f95172c = z10;
        this.f95170a = new short[i10];
    }

    public a1(a1 a1Var) {
        this.f95172c = a1Var.f95172c;
        int i10 = a1Var.f95171b;
        this.f95171b = i10;
        short[] sArr = new short[i10];
        this.f95170a = sArr;
        System.arraycopy(a1Var.f95170a, 0, sArr, 0, i10);
    }

    public a1(short[] sArr) {
        this(true, sArr, 0, sArr.length);
    }

    public a1(boolean z10, short[] sArr, int i10, int i11) {
        this(z10, i11);
        this.f95171b = i11;
        System.arraycopy(sArr, i10, this.f95170a, 0, i11);
    }
}
