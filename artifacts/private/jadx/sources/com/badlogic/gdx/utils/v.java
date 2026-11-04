package com.badlogic.gdx.utils;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f95784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f95786c;

    public v() {
        this(true, 16);
    }

    public static v G(int... iArr) {
        return new v(iArr);
    }

    public void A() {
        int[] iArr = this.f95784a;
        int i10 = this.f95785b;
        while (true) {
            i10--;
            if (i10 < 0) {
                return;
            }
            int iY = com.badlogic.gdx.math.s.y(i10);
            int i11 = iArr[i10];
            iArr[i10] = iArr[iY];
            iArr[iY] = i11;
        }
    }

    public void B() {
        Arrays.sort(this.f95784a, 0, this.f95785b);
    }

    public void C(int i10, int i11) {
        int i12 = this.f95785b;
        if (i10 >= i12) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i10 + " >= " + this.f95785b);
        }
        if (i11 < i12) {
            int[] iArr = this.f95784a;
            int i13 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i13;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i11 + " >= " + this.f95785b);
    }

    public int[] D() {
        int i10 = this.f95785b;
        int[] iArr = new int[i10];
        System.arraycopy(this.f95784a, 0, iArr, 0, i10);
        return iArr;
    }

    public String E(String str) {
        if (this.f95785b == 0) {
            return "";
        }
        int[] iArr = this.f95784a;
        f1 f1Var = new f1(32);
        f1Var.d(iArr[0]);
        for (int i10 = 1; i10 < this.f95785b; i10++) {
            f1Var.o(str);
            f1Var.d(iArr[i10]);
        }
        return f1Var.toString();
    }

    public void F(int i10) {
        if (this.f95785b > i10) {
            this.f95785b = i10;
        }
    }

    public void a(int i10) {
        int[] iArrW = this.f95784a;
        int i11 = this.f95785b;
        if (i11 == iArrW.length) {
            iArrW = w(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f95785b;
        this.f95785b = i12 + 1;
        iArrW[i12] = i10;
    }

    public void b(v vVar) {
        c(vVar, 0, vVar.f95785b);
    }

    public void c(v vVar, int i10, int i11) {
        if (i10 + i11 <= vVar.f95785b) {
            e(vVar.f95784a, i10, i11);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i10 + " + " + i11 + " <= " + vVar.f95785b);
    }

    public void d(int... iArr) {
        e(iArr, 0, iArr.length);
    }

    public void e(int[] iArr, int i10, int i11) {
        int[] iArrW = this.f95784a;
        int i12 = this.f95785b + i11;
        if (i12 > iArrW.length) {
            iArrW = w(Math.max(8, (int) (i12 * 1.75f)));
        }
        System.arraycopy(iArr, i10, iArrW, this.f95785b, i11);
        this.f95785b += i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        int i10 = this.f95785b;
        if (i10 != vVar.f95785b) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f95784a[i11] != vVar.f95784a[i11]) {
                return false;
            }
        }
        return true;
    }

    public void f() {
        this.f95785b = 0;
    }

    public boolean g(int i10) {
        int i11 = this.f95785b - 1;
        int[] iArr = this.f95784a;
        while (i11 >= 0) {
            int i12 = i11 - 1;
            if (iArr[i11] == i10) {
                return true;
            }
            i11 = i12;
        }
        return false;
    }

    public int[] h(int i10) {
        int i11 = this.f95785b + i10;
        if (i11 > this.f95784a.length) {
            w(Math.max(8, i11));
        }
        return this.f95784a;
    }

    public int i() {
        if (this.f95785b != 0) {
            return this.f95784a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public int j(int i10) {
        if (i10 < this.f95785b) {
            return this.f95784a[i10];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95785b);
    }

    public void k(int i10, int i11) {
        if (i10 < this.f95785b) {
            int[] iArr = this.f95784a;
            iArr[i10] = iArr[i10] + i11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95785b);
    }

    public int l(int i10) {
        int[] iArr = this.f95784a;
        int i11 = this.f95785b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] == i10) {
                return i12;
            }
        }
        return -1;
    }

    public void m(int i10, int i11) {
        int i12 = this.f95785b;
        if (i10 > i12) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i10 + " > " + this.f95785b);
        }
        int[] iArrW = this.f95784a;
        if (i12 == iArrW.length) {
            iArrW = w(Math.max(8, (int) (i12 * 1.75f)));
        }
        if (this.f95786c) {
            System.arraycopy(iArrW, i10, iArrW, i10 + 1, this.f95785b - i10);
        } else {
            iArrW[this.f95785b] = iArrW[i10];
        }
        this.f95785b++;
        iArrW[i10] = i11;
    }

    public int n(int i10) {
        int[] iArr = this.f95784a;
        for (int i11 = this.f95785b - 1; i11 >= 0; i11--) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public void o(int i10, int i11) {
        if (i10 < this.f95785b) {
            int[] iArr = this.f95784a;
            iArr[i10] = iArr[i10] * i11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95785b);
    }

    public int p() {
        return this.f95784a[this.f95785b - 1];
    }

    public int q() {
        int[] iArr = this.f95784a;
        int i10 = this.f95785b - 1;
        this.f95785b = i10;
        return iArr[i10];
    }

    public int r() {
        int i10 = this.f95785b;
        if (i10 == 0) {
            return 0;
        }
        return this.f95784a[com.badlogic.gdx.math.s.z(0, i10 - 1)];
    }

    public boolean s(v vVar) {
        int i10 = this.f95785b;
        int[] iArr = this.f95784a;
        int i11 = vVar.f95785b;
        int i12 = i10;
        for (int i13 = 0; i13 < i11; i13++) {
            int iJ = vVar.j(i13);
            for (int i14 = 0; i14 < i12; i14++) {
                if (iJ == iArr[i14]) {
                    t(i14);
                    i12--;
                    break;
                }
            }
        }
        return i12 != i10;
    }

    public int t(int i10) {
        int i11 = this.f95785b;
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95785b);
        }
        int[] iArr = this.f95784a;
        int i12 = iArr[i10];
        int i13 = i11 - 1;
        this.f95785b = i13;
        if (this.f95786c) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, i13 - i10);
            return i12;
        }
        iArr[i10] = iArr[i13];
        return i12;
    }

    public String toString() {
        if (this.f95785b == 0) {
            return okhttp3.v.f334777p;
        }
        int[] iArr = this.f95784a;
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_LIST);
        f1Var.d(iArr[0]);
        for (int i10 = 1; i10 < this.f95785b; i10++) {
            f1Var.o(", ");
            f1Var.d(iArr[i10]);
        }
        f1Var.append(AbstractJsonLexerKt.END_LIST);
        return f1Var.toString();
    }

    public void u(int i10, int i11) {
        int i12 = this.f95785b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i11 + " >= " + this.f95785b);
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i10 + " > " + i11);
        }
        int[] iArr = this.f95784a;
        int i13 = (i11 - i10) + 1;
        if (this.f95786c) {
            int i14 = i10 + i13;
            System.arraycopy(iArr, i14, iArr, i10, i12 - i14);
        } else {
            int i15 = i12 - 1;
            for (int i16 = 0; i16 < i13; i16++) {
                iArr[i10 + i16] = iArr[i15 - i16];
            }
        }
        this.f95785b -= i13;
    }

    public boolean v(int i10) {
        int[] iArr = this.f95784a;
        int i11 = this.f95785b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] == i10) {
                t(i12);
                return true;
            }
        }
        return false;
    }

    protected int[] w(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(this.f95784a, 0, iArr, 0, Math.min(this.f95785b, i10));
        this.f95784a = iArr;
        return iArr;
    }

    public void x() {
        int[] iArr = this.f95784a;
        int i10 = this.f95785b;
        int i11 = i10 - 1;
        int i12 = i10 / 2;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i11 - i13;
            int i15 = iArr[i13];
            iArr[i13] = iArr[i14];
            iArr[i14] = i15;
        }
    }

    public void y(int i10, int i11) {
        if (i10 < this.f95785b) {
            this.f95784a[i10] = i11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95785b);
    }

    public int[] z() {
        int length = this.f95784a.length;
        int i10 = this.f95785b;
        if (length != i10) {
            w(i10);
        }
        return this.f95784a;
    }

    public v(int i10) {
        this(true, i10);
    }

    public v(boolean z10, int i10) {
        this.f95786c = z10;
        this.f95784a = new int[i10];
    }

    public v(v vVar) {
        this.f95786c = vVar.f95786c;
        int i10 = vVar.f95785b;
        this.f95785b = i10;
        int[] iArr = new int[i10];
        this.f95784a = iArr;
        System.arraycopy(vVar.f95784a, 0, iArr, 0, i10);
    }

    public v(int[] iArr) {
        this(true, iArr, 0, iArr.length);
    }

    public v(boolean z10, int[] iArr, int i10, int i11) {
        this(z10, i11);
        this.f95785b = i11;
        System.arraycopy(iArr, i10, this.f95784a, 0, i11);
    }
}
