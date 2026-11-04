package com.badlogic.gdx.utils;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f95545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f95547c;

    public i() {
        this(true, 16);
    }

    public static i z(boolean... zArr) {
        return new i(zArr);
    }

    public void a(boolean z10) {
        boolean[] zArrQ = this.f95545a;
        int i10 = this.f95546b;
        if (i10 == zArrQ.length) {
            zArrQ = q(Math.max(8, (int) (i10 * 1.75f)));
        }
        int i11 = this.f95546b;
        this.f95546b = i11 + 1;
        zArrQ[i11] = z10;
    }

    public void b(i iVar) {
        c(iVar, 0, iVar.f95546b);
    }

    public void c(i iVar, int i10, int i11) {
        if (i10 + i11 <= iVar.f95546b) {
            e(iVar.f95545a, i10, i11);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i10 + " + " + i11 + " <= " + iVar.f95546b);
    }

    public void d(boolean... zArr) {
        e(zArr, 0, zArr.length);
    }

    public void e(boolean[] zArr, int i10, int i11) {
        boolean[] zArrQ = this.f95545a;
        int i12 = this.f95546b + i11;
        if (i12 > zArrQ.length) {
            zArrQ = q(Math.max(8, (int) (i12 * 1.75f)));
        }
        System.arraycopy(zArr, i10, zArrQ, this.f95546b, i11);
        this.f95546b += i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        int i10 = this.f95546b;
        if (i10 != iVar.f95546b) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f95545a[i11] != iVar.f95545a[i11]) {
                return false;
            }
        }
        return true;
    }

    public void f() {
        this.f95546b = 0;
    }

    public boolean[] g(int i10) {
        int i11 = this.f95546b + i10;
        if (i11 > this.f95545a.length) {
            q(Math.max(8, i11));
        }
        return this.f95545a;
    }

    public boolean h() {
        if (this.f95546b != 0) {
            return this.f95545a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public boolean i(int i10) {
        if (i10 < this.f95546b) {
            return this.f95545a[i10];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95546b);
    }

    public void j(int i10, boolean z10) {
        int i11 = this.f95546b;
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i10 + " > " + this.f95546b);
        }
        boolean[] zArrQ = this.f95545a;
        if (i11 == zArrQ.length) {
            zArrQ = q(Math.max(8, (int) (i11 * 1.75f)));
        }
        if (this.f95547c) {
            System.arraycopy(zArrQ, i10, zArrQ, i10 + 1, this.f95546b - i10);
        } else {
            zArrQ[this.f95546b] = zArrQ[i10];
        }
        this.f95546b++;
        zArrQ[i10] = z10;
    }

    public boolean k() {
        return this.f95545a[this.f95546b - 1];
    }

    public boolean l() {
        boolean[] zArr = this.f95545a;
        int i10 = this.f95546b - 1;
        this.f95546b = i10;
        return zArr[i10];
    }

    public boolean m() {
        int i10 = this.f95546b;
        if (i10 == 0) {
            return false;
        }
        return this.f95545a[com.badlogic.gdx.math.s.z(0, i10 - 1)];
    }

    public boolean n(i iVar) {
        int i10 = this.f95546b;
        boolean[] zArr = this.f95545a;
        int i11 = iVar.f95546b;
        int i12 = i10;
        for (int i13 = 0; i13 < i11; i13++) {
            boolean zI = iVar.i(i13);
            for (int i14 = 0; i14 < i12; i14++) {
                if (zI == zArr[i14]) {
                    o(i14);
                    i12--;
                    break;
                }
            }
        }
        return i12 != i10;
    }

    public boolean o(int i10) {
        int i11 = this.f95546b;
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95546b);
        }
        boolean[] zArr = this.f95545a;
        boolean z10 = zArr[i10];
        int i12 = i11 - 1;
        this.f95546b = i12;
        if (this.f95547c) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, i12 - i10);
            return z10;
        }
        zArr[i10] = zArr[i12];
        return z10;
    }

    public void p(int i10, int i11) {
        int i12 = this.f95546b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i11 + " >= " + this.f95546b);
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i10 + " > " + i11);
        }
        boolean[] zArr = this.f95545a;
        int i13 = (i11 - i10) + 1;
        if (this.f95547c) {
            int i14 = i10 + i13;
            System.arraycopy(zArr, i14, zArr, i10, i12 - i14);
        } else {
            int i15 = i12 - 1;
            for (int i16 = 0; i16 < i13; i16++) {
                zArr[i10 + i16] = zArr[i15 - i16];
            }
        }
        this.f95546b -= i13;
    }

    protected boolean[] q(int i10) {
        boolean[] zArr = new boolean[i10];
        System.arraycopy(this.f95545a, 0, zArr, 0, Math.min(this.f95546b, i10));
        this.f95545a = zArr;
        return zArr;
    }

    public void r() {
        boolean[] zArr = this.f95545a;
        int i10 = this.f95546b;
        int i11 = i10 - 1;
        int i12 = i10 / 2;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i11 - i13;
            boolean z10 = zArr[i13];
            zArr[i13] = zArr[i14];
            zArr[i14] = z10;
        }
    }

    public void s(int i10, boolean z10) {
        if (i10 < this.f95546b) {
            this.f95545a[i10] = z10;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95546b);
    }

    public boolean[] t() {
        int length = this.f95545a.length;
        int i10 = this.f95546b;
        if (length != i10) {
            q(i10);
        }
        return this.f95545a;
    }

    public String toString() {
        if (this.f95546b == 0) {
            return okhttp3.v.f334777p;
        }
        boolean[] zArr = this.f95545a;
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_LIST);
        f1Var.p(zArr[0]);
        for (int i10 = 1; i10 < this.f95546b; i10++) {
            f1Var.o(", ");
            f1Var.p(zArr[i10]);
        }
        f1Var.append(AbstractJsonLexerKt.END_LIST);
        return f1Var.toString();
    }

    public void u() {
        boolean[] zArr = this.f95545a;
        for (int i10 = this.f95546b - 1; i10 >= 0; i10--) {
            int iY = com.badlogic.gdx.math.s.y(i10);
            boolean z10 = zArr[i10];
            zArr[i10] = zArr[iY];
            zArr[iY] = z10;
        }
    }

    public void v(int i10, int i11) {
        int i12 = this.f95546b;
        if (i10 >= i12) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i10 + " >= " + this.f95546b);
        }
        if (i11 < i12) {
            boolean[] zArr = this.f95545a;
            boolean z10 = zArr[i10];
            zArr[i10] = zArr[i11];
            zArr[i11] = z10;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i11 + " >= " + this.f95546b);
    }

    public boolean[] w() {
        int i10 = this.f95546b;
        boolean[] zArr = new boolean[i10];
        int i11 = 4 & 0;
        System.arraycopy(this.f95545a, 0, zArr, 0, i10);
        return zArr;
    }

    public String x(String str) {
        if (this.f95546b == 0) {
            return "";
        }
        boolean[] zArr = this.f95545a;
        f1 f1Var = new f1(32);
        f1Var.p(zArr[0]);
        for (int i10 = 1; i10 < this.f95546b; i10++) {
            f1Var.o(str);
            f1Var.p(zArr[i10]);
        }
        return f1Var.toString();
    }

    public void y(int i10) {
        if (this.f95546b > i10) {
            this.f95546b = i10;
        }
    }

    public i(int i10) {
        this(true, i10);
    }

    public i(boolean z10, int i10) {
        this.f95547c = z10;
        this.f95545a = new boolean[i10];
    }

    public i(i iVar) {
        this.f95547c = iVar.f95547c;
        int i10 = iVar.f95546b;
        this.f95546b = i10;
        boolean[] zArr = new boolean[i10];
        this.f95545a = zArr;
        System.arraycopy(iVar.f95545a, 0, zArr, 0, i10);
    }

    public i(boolean[] zArr) {
        this(true, zArr, 0, zArr.length);
    }

    public i(boolean z10, boolean[] zArr, int i10, int i11) {
        this(z10, i11);
        this.f95546b = i11;
        System.arraycopy(zArr, i10, this.f95545a, 0, i11);
    }
}
