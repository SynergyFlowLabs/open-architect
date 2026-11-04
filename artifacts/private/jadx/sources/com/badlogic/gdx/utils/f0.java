package com.badlogic.gdx.utils;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f95488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f95490c;

    public f0() {
        this(true, 16);
    }

    public static f0 G(long... jArr) {
        return new f0(jArr);
    }

    public void A() {
        long[] jArr = this.f95488a;
        for (int i10 = this.f95489b - 1; i10 >= 0; i10--) {
            int iY = com.badlogic.gdx.math.s.y(i10);
            long j10 = jArr[i10];
            jArr[i10] = jArr[iY];
            jArr[iY] = j10;
        }
    }

    public void B() {
        Arrays.sort(this.f95488a, 0, this.f95489b);
    }

    public void C(int i10, int i11) {
        int i12 = this.f95489b;
        if (i10 >= i12) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i10 + " >= " + this.f95489b);
        }
        if (i11 < i12) {
            long[] jArr = this.f95488a;
            long j10 = jArr[i10];
            jArr[i10] = jArr[i11];
            jArr[i11] = j10;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i11 + " >= " + this.f95489b);
    }

    public long[] D() {
        int i10 = this.f95489b;
        long[] jArr = new long[i10];
        System.arraycopy(this.f95488a, 0, jArr, 0, i10);
        return jArr;
    }

    public String E(String str) {
        if (this.f95489b == 0) {
            return "";
        }
        long[] jArr = this.f95488a;
        f1 f1Var = new f1(32);
        f1Var.g(jArr[0]);
        for (int i10 = 1; i10 < this.f95489b; i10++) {
            f1Var.o(str);
            f1Var.g(jArr[i10]);
        }
        return f1Var.toString();
    }

    public void F(int i10) {
        if (this.f95489b > i10) {
            this.f95489b = i10;
        }
    }

    public void a(long j10) {
        long[] jArrW = this.f95488a;
        int i10 = this.f95489b;
        if (i10 == jArrW.length) {
            jArrW = w(Math.max(8, (int) (i10 * 1.75f)));
        }
        int i11 = this.f95489b;
        this.f95489b = i11 + 1;
        jArrW[i11] = j10;
    }

    public void b(f0 f0Var) {
        c(f0Var, 0, f0Var.f95489b);
    }

    public void c(f0 f0Var, int i10, int i11) {
        if (i10 + i11 <= f0Var.f95489b) {
            e(f0Var.f95488a, i10, i11);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i10 + " + " + i11 + " <= " + f0Var.f95489b);
    }

    public void d(long... jArr) {
        e(jArr, 0, jArr.length);
    }

    public void e(long[] jArr, int i10, int i11) {
        long[] jArrW = this.f95488a;
        int i12 = this.f95489b + i11;
        if (i12 > jArrW.length) {
            jArrW = w(Math.max(8, (int) (i12 * 1.75f)));
        }
        System.arraycopy(jArr, i10, jArrW, this.f95489b, i11);
        this.f95489b += i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        int i10 = this.f95489b;
        if (i10 != f0Var.f95489b) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f95488a[i11] != f0Var.f95488a[i11]) {
                return false;
            }
        }
        return true;
    }

    public void f() {
        this.f95489b = 0;
    }

    public boolean g(long j10) {
        int i10 = this.f95489b - 1;
        long[] jArr = this.f95488a;
        while (i10 >= 0) {
            int i11 = i10 - 1;
            if (jArr[i10] == j10) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    public long[] h(int i10) {
        int i11 = this.f95489b + i10;
        if (i11 > this.f95488a.length) {
            w(Math.max(8, i11));
        }
        return this.f95488a;
    }

    public long i() {
        if (this.f95489b == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        int i10 = 0 >> 0;
        return this.f95488a[0];
    }

    public long j(int i10) {
        if (i10 < this.f95489b) {
            return this.f95488a[i10];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95489b);
    }

    public void k(int i10, long j10) {
        if (i10 < this.f95489b) {
            long[] jArr = this.f95488a;
            jArr[i10] = jArr[i10] + j10;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95489b);
    }

    public int l(long j10) {
        long[] jArr = this.f95488a;
        int i10 = this.f95489b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (jArr[i11] == j10) {
                return i11;
            }
        }
        return -1;
    }

    public void m(int i10, long j10) {
        int i11 = this.f95489b;
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i10 + " > " + this.f95489b);
        }
        long[] jArrW = this.f95488a;
        if (i11 == jArrW.length) {
            jArrW = w(Math.max(8, (int) (i11 * 1.75f)));
        }
        if (this.f95490c) {
            System.arraycopy(jArrW, i10, jArrW, i10 + 1, this.f95489b - i10);
        } else {
            jArrW[this.f95489b] = jArrW[i10];
        }
        this.f95489b++;
        jArrW[i10] = j10;
    }

    public int n(char c10) {
        long[] jArr = this.f95488a;
        for (int i10 = this.f95489b - 1; i10 >= 0; i10--) {
            if (jArr[i10] == c10) {
                return i10;
            }
        }
        return -1;
    }

    public void o(int i10, long j10) {
        if (i10 < this.f95489b) {
            long[] jArr = this.f95488a;
            jArr[i10] = jArr[i10] * j10;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95489b);
    }

    public long p() {
        return this.f95488a[this.f95489b - 1];
    }

    public long q() {
        long[] jArr = this.f95488a;
        int i10 = this.f95489b - 1;
        this.f95489b = i10;
        return jArr[i10];
    }

    public long r() {
        int i10 = this.f95489b;
        if (i10 == 0) {
            return 0L;
        }
        return this.f95488a[com.badlogic.gdx.math.s.z(0, i10 - 1)];
    }

    public boolean s(f0 f0Var) {
        int i10 = this.f95489b;
        long[] jArr = this.f95488a;
        int i11 = f0Var.f95489b;
        int i12 = i10;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = f0Var.j(i13);
            for (int i14 = 0; i14 < i12; i14++) {
                if (j10 == jArr[i14]) {
                    t(i14);
                    i12--;
                    break;
                }
            }
        }
        return i12 != i10;
    }

    public long t(int i10) {
        int i11 = this.f95489b;
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95489b);
        }
        long[] jArr = this.f95488a;
        long j10 = jArr[i10];
        int i12 = i11 - 1;
        this.f95489b = i12;
        if (this.f95490c) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, i12 - i10);
            return j10;
        }
        jArr[i10] = jArr[i12];
        return j10;
    }

    public String toString() {
        if (this.f95489b == 0) {
            return okhttp3.v.f334777p;
        }
        long[] jArr = this.f95488a;
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_LIST);
        f1Var.g(jArr[0]);
        for (int i10 = 1; i10 < this.f95489b; i10++) {
            f1Var.o(", ");
            f1Var.g(jArr[i10]);
        }
        f1Var.append(AbstractJsonLexerKt.END_LIST);
        return f1Var.toString();
    }

    public void u(int i10, int i11) {
        int i12 = this.f95489b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i11 + " >= " + this.f95489b);
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i10 + " > " + i11);
        }
        long[] jArr = this.f95488a;
        int i13 = (i11 - i10) + 1;
        if (this.f95490c) {
            int i14 = i10 + i13;
            System.arraycopy(jArr, i14, jArr, i10, i12 - i14);
        } else {
            int i15 = i12 - 1;
            for (int i16 = 0; i16 < i13; i16++) {
                jArr[i10 + i16] = jArr[i15 - i16];
            }
        }
        this.f95489b -= i13;
    }

    public boolean v(long j10) {
        long[] jArr = this.f95488a;
        int i10 = this.f95489b;
        boolean z10 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            if (jArr[i11] == j10) {
                t(i11);
                return true;
            }
        }
        return false;
    }

    protected long[] w(int i10) {
        long[] jArr = new long[i10];
        System.arraycopy(this.f95488a, 0, jArr, 0, Math.min(this.f95489b, i10));
        this.f95488a = jArr;
        return jArr;
    }

    public void x() {
        long[] jArr = this.f95488a;
        int i10 = this.f95489b;
        int i11 = i10 - 1;
        int i12 = i10 / 2;
        int i13 = 4 | 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i11 - i14;
            long j10 = jArr[i14];
            jArr[i14] = jArr[i15];
            jArr[i15] = j10;
        }
    }

    public void y(int i10, long j10) {
        if (i10 < this.f95489b) {
            this.f95488a[i10] = j10;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95489b);
    }

    public long[] z() {
        int length = this.f95488a.length;
        int i10 = this.f95489b;
        if (length != i10) {
            w(i10);
        }
        return this.f95488a;
    }

    public f0(int i10) {
        this(true, i10);
    }

    public f0(boolean z10, int i10) {
        this.f95490c = z10;
        this.f95488a = new long[i10];
    }

    public f0(f0 f0Var) {
        this.f95490c = f0Var.f95490c;
        int i10 = f0Var.f95489b;
        this.f95489b = i10;
        long[] jArr = new long[i10];
        this.f95488a = jArr;
        System.arraycopy(f0Var.f95488a, 0, jArr, 0, i10);
    }

    public f0(long[] jArr) {
        this(true, jArr, 0, jArr.length);
    }

    public f0(boolean z10, long[] jArr, int i10, int i11) {
        this(z10, i11);
        this.f95489b = i11;
        System.arraycopy(jArr, i10, this.f95488a, 0, i11);
    }
}
