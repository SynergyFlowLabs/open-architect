package com.badlogic.gdx.utils;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f95607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f95609c;

    public k() {
        this(true, 16);
    }

    public static k G(char... cArr) {
        return new k(cArr);
    }

    public void A() {
        char[] cArr = this.f95607a;
        for (int i10 = this.f95608b - 1; i10 >= 0; i10--) {
            int iY = com.badlogic.gdx.math.s.y(i10);
            char c10 = cArr[i10];
            cArr[i10] = cArr[iY];
            cArr[iY] = c10;
        }
    }

    public void B() {
        Arrays.sort(this.f95607a, 0, this.f95608b);
    }

    public void C(int i10, int i11) {
        int i12 = this.f95608b;
        if (i10 >= i12) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i10 + " >= " + this.f95608b);
        }
        if (i11 < i12) {
            char[] cArr = this.f95607a;
            char c10 = cArr[i10];
            cArr[i10] = cArr[i11];
            cArr[i11] = c10;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i11 + " >= " + this.f95608b);
    }

    public char[] D() {
        int i10 = this.f95608b;
        char[] cArr = new char[i10];
        System.arraycopy(this.f95607a, 0, cArr, 0, i10);
        return cArr;
    }

    public String E(String str) {
        if (this.f95608b == 0) {
            return "";
        }
        char[] cArr = this.f95607a;
        f1 f1Var = new f1(32);
        f1Var.append(cArr[0]);
        for (int i10 = 1; i10 < this.f95608b; i10++) {
            f1Var.o(str);
            f1Var.append(cArr[i10]);
        }
        return f1Var.toString();
    }

    public void F(int i10) {
        if (this.f95608b > i10) {
            this.f95608b = i10;
        }
    }

    public void a(char c10) {
        char[] cArrW = this.f95607a;
        int i10 = this.f95608b;
        if (i10 == cArrW.length) {
            cArrW = w(Math.max(8, (int) (i10 * 1.75f)));
        }
        int i11 = this.f95608b;
        this.f95608b = i11 + 1;
        cArrW[i11] = c10;
    }

    public void b(k kVar) {
        c(kVar, 0, kVar.f95608b);
    }

    public void c(k kVar, int i10, int i11) {
        if (i10 + i11 <= kVar.f95608b) {
            e(kVar.f95607a, i10, i11);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i10 + " + " + i11 + " <= " + kVar.f95608b);
    }

    public void d(char... cArr) {
        e(cArr, 0, cArr.length);
    }

    public void e(char[] cArr, int i10, int i11) {
        char[] cArrW = this.f95607a;
        int i12 = this.f95608b + i11;
        if (i12 > cArrW.length) {
            cArrW = w(Math.max(8, (int) (i12 * 1.75f)));
        }
        System.arraycopy(cArr, i10, cArrW, this.f95608b, i11);
        this.f95608b += i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        int i10 = this.f95608b;
        if (i10 != kVar.f95608b) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f95607a[i11] != kVar.f95607a[i11]) {
                return false;
            }
        }
        return true;
    }

    public void f() {
        this.f95608b = 0;
    }

    public boolean g(char c10) {
        int i10 = this.f95608b - 1;
        char[] cArr = this.f95607a;
        while (i10 >= 0) {
            int i11 = i10 - 1;
            if (cArr[i10] == c10) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    public char[] h(int i10) {
        int i11 = this.f95608b + i10;
        if (i11 > this.f95607a.length) {
            w(Math.max(8, i11));
        }
        return this.f95607a;
    }

    public char i() {
        if (this.f95608b != 0) {
            return this.f95607a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public char j(int i10) {
        if (i10 < this.f95608b) {
            return this.f95607a[i10];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95608b);
    }

    public void k(int i10, char c10) {
        if (i10 < this.f95608b) {
            char[] cArr = this.f95607a;
            cArr[i10] = (char) (cArr[i10] + c10);
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95608b);
    }

    public int l(char c10) {
        char[] cArr = this.f95607a;
        int i10 = this.f95608b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (cArr[i11] == c10) {
                return i11;
            }
        }
        return -1;
    }

    public void m(int i10, char c10) {
        int i11 = this.f95608b;
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i10 + " > " + this.f95608b);
        }
        char[] cArrW = this.f95607a;
        if (i11 == cArrW.length) {
            cArrW = w(Math.max(8, (int) (i11 * 1.75f)));
        }
        if (this.f95609c) {
            System.arraycopy(cArrW, i10, cArrW, i10 + 1, this.f95608b - i10);
        } else {
            cArrW[this.f95608b] = cArrW[i10];
        }
        this.f95608b++;
        cArrW[i10] = c10;
    }

    public int n(char c10) {
        char[] cArr = this.f95607a;
        for (int i10 = this.f95608b - 1; i10 >= 0; i10--) {
            if (cArr[i10] == c10) {
                return i10;
            }
        }
        return -1;
    }

    public void o(int i10, char c10) {
        if (i10 < this.f95608b) {
            char[] cArr = this.f95607a;
            cArr[i10] = (char) (cArr[i10] * c10);
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95608b);
    }

    public char p() {
        return this.f95607a[this.f95608b - 1];
    }

    public char q() {
        char[] cArr = this.f95607a;
        int i10 = this.f95608b - 1;
        this.f95608b = i10;
        return cArr[i10];
    }

    public char r() {
        int i10 = this.f95608b;
        if (i10 == 0) {
            return (char) 0;
        }
        return this.f95607a[com.badlogic.gdx.math.s.z(0, i10 - 1)];
    }

    public boolean s(k kVar) {
        int i10 = this.f95608b;
        char[] cArr = this.f95607a;
        int i11 = kVar.f95608b;
        int i12 = i10;
        for (int i13 = 0; i13 < i11; i13++) {
            char cJ = kVar.j(i13);
            for (int i14 = 0; i14 < i12; i14++) {
                if (cJ == cArr[i14]) {
                    t(i14);
                    i12--;
                    break;
                }
            }
        }
        return i12 != i10;
    }

    public char t(int i10) {
        int i11 = this.f95608b;
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95608b);
        }
        char[] cArr = this.f95607a;
        char c10 = cArr[i10];
        int i12 = i11 - 1;
        this.f95608b = i12;
        if (this.f95609c) {
            System.arraycopy(cArr, i10 + 1, cArr, i10, i12 - i10);
            return c10;
        }
        cArr[i10] = cArr[i12];
        return c10;
    }

    public String toString() {
        if (this.f95608b == 0) {
            return okhttp3.v.f334777p;
        }
        char[] cArr = this.f95607a;
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_LIST);
        f1Var.append(cArr[0]);
        for (int i10 = 1; i10 < this.f95608b; i10++) {
            f1Var.o(", ");
            f1Var.append(cArr[i10]);
        }
        f1Var.append(AbstractJsonLexerKt.END_LIST);
        return f1Var.toString();
    }

    public void u(int i10, int i11) {
        int i12 = this.f95608b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i11 + " >= " + this.f95608b);
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i10 + " > " + i11);
        }
        char[] cArr = this.f95607a;
        int i13 = (i11 - i10) + 1;
        if (this.f95609c) {
            int i14 = i10 + i13;
            System.arraycopy(cArr, i14, cArr, i10, i12 - i14);
        } else {
            int i15 = i12 - 1;
            for (int i16 = 0; i16 < i13; i16++) {
                cArr[i10 + i16] = cArr[i15 - i16];
            }
        }
        this.f95608b -= i13;
    }

    public boolean v(char c10) {
        char[] cArr = this.f95607a;
        int i10 = this.f95608b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (cArr[i11] == c10) {
                t(i11);
                return true;
            }
        }
        return false;
    }

    protected char[] w(int i10) {
        char[] cArr = new char[i10];
        System.arraycopy(this.f95607a, 0, cArr, 0, Math.min(this.f95608b, i10));
        this.f95607a = cArr;
        return cArr;
    }

    public void x() {
        char[] cArr = this.f95607a;
        int i10 = this.f95608b;
        int i11 = i10 - 1;
        int i12 = i10 / 2;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i11 - i13;
            char c10 = cArr[i13];
            cArr[i13] = cArr[i14];
            cArr[i14] = c10;
        }
    }

    public void y(int i10, char c10) {
        if (i10 < this.f95608b) {
            this.f95607a[i10] = c10;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95608b);
    }

    public char[] z() {
        int length = this.f95607a.length;
        int i10 = this.f95608b;
        if (length != i10) {
            w(i10);
        }
        return this.f95607a;
    }

    public k(int i10) {
        this(true, i10);
    }

    public k(boolean z10, int i10) {
        this.f95609c = z10;
        this.f95607a = new char[i10];
    }

    public k(k kVar) {
        this.f95609c = kVar.f95609c;
        int i10 = kVar.f95608b;
        this.f95608b = i10;
        char[] cArr = new char[i10];
        this.f95607a = cArr;
        System.arraycopy(kVar.f95607a, 0, cArr, 0, i10);
    }

    public k(char[] cArr) {
        this(true, cArr, 0, cArr.length);
    }

    public k(boolean z10, char[] cArr, int i10, int i11) {
        this(z10, i11);
        this.f95608b = i11;
        System.arraycopy(cArr, i10, this.f95607a, 0, i11);
    }
}
