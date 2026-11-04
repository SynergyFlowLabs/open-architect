package com.badlogic.gdx.utils;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f95576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f95578c;

    public j() {
        this(true, 16);
    }

    public static j G(byte... bArr) {
        return new j(bArr);
    }

    public void A() {
        byte[] bArr = this.f95576a;
        int i10 = this.f95577b;
        while (true) {
            i10--;
            if (i10 < 0) {
                return;
            }
            int iY = com.badlogic.gdx.math.s.y(i10);
            byte b10 = bArr[i10];
            bArr[i10] = bArr[iY];
            bArr[iY] = b10;
        }
    }

    public void B() {
        Arrays.sort(this.f95576a, 0, this.f95577b);
    }

    public void C(int i10, int i11) {
        int i12 = this.f95577b;
        if (i10 >= i12) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i10 + " >= " + this.f95577b);
        }
        if (i11 < i12) {
            byte[] bArr = this.f95576a;
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i11 + " >= " + this.f95577b);
    }

    public byte[] D() {
        int i10 = this.f95577b;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f95576a, 0, bArr, 0, i10);
        return bArr;
    }

    public String E(String str) {
        if (this.f95577b == 0) {
            return "";
        }
        byte[] bArr = this.f95576a;
        f1 f1Var = new f1(32);
        f1Var.d(bArr[0]);
        for (int i10 = 1; i10 < this.f95577b; i10++) {
            f1Var.o(str);
            f1Var.d(bArr[i10]);
        }
        return f1Var.toString();
    }

    public void F(int i10) {
        if (this.f95577b > i10) {
            this.f95577b = i10;
        }
    }

    public void a(byte b10) {
        byte[] bArrW = this.f95576a;
        int i10 = this.f95577b;
        if (i10 == bArrW.length) {
            bArrW = w(Math.max(8, (int) (i10 * 1.75f)));
        }
        int i11 = this.f95577b;
        this.f95577b = i11 + 1;
        bArrW[i11] = b10;
    }

    public void b(j jVar) {
        c(jVar, 0, jVar.f95577b);
    }

    public void c(j jVar, int i10, int i11) {
        if (i10 + i11 <= jVar.f95577b) {
            e(jVar.f95576a, i10, i11);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i10 + " + " + i11 + " <= " + jVar.f95577b);
    }

    public void d(byte... bArr) {
        e(bArr, 0, bArr.length);
    }

    public void e(byte[] bArr, int i10, int i11) {
        byte[] bArrW = this.f95576a;
        int i12 = this.f95577b + i11;
        if (i12 > bArrW.length) {
            bArrW = w(Math.max(8, (int) (i12 * 1.75f)));
        }
        System.arraycopy(bArr, i10, bArrW, this.f95577b, i11);
        this.f95577b += i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        int i10 = this.f95577b;
        if (i10 != jVar.f95577b) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f95576a[i11] != jVar.f95576a[i11]) {
                return false;
            }
        }
        return true;
    }

    public void f() {
        this.f95577b = 0;
    }

    public boolean g(byte b10) {
        int i10 = this.f95577b - 1;
        byte[] bArr = this.f95576a;
        while (i10 >= 0) {
            int i11 = i10 - 1;
            if (bArr[i10] == b10) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    public byte[] h(int i10) {
        int i11 = this.f95577b + i10;
        if (i11 > this.f95576a.length) {
            w(Math.max(8, i11));
        }
        return this.f95576a;
    }

    public byte i() {
        if (this.f95577b != 0) {
            return this.f95576a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public byte j(int i10) {
        if (i10 < this.f95577b) {
            return this.f95576a[i10];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95577b);
    }

    public void k(int i10, byte b10) {
        if (i10 < this.f95577b) {
            byte[] bArr = this.f95576a;
            bArr[i10] = (byte) (bArr[i10] + b10);
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95577b);
    }

    public int l(byte b10) {
        byte[] bArr = this.f95576a;
        int i10 = this.f95577b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11] == b10) {
                return i11;
            }
        }
        return -1;
    }

    public void m(int i10, byte b10) {
        int i11 = this.f95577b;
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i10 + " > " + this.f95577b);
        }
        byte[] bArrW = this.f95576a;
        if (i11 == bArrW.length) {
            bArrW = w(Math.max(8, (int) (i11 * 1.75f)));
        }
        if (this.f95578c) {
            System.arraycopy(bArrW, i10, bArrW, i10 + 1, this.f95577b - i10);
        } else {
            bArrW[this.f95577b] = bArrW[i10];
        }
        this.f95577b++;
        bArrW[i10] = b10;
    }

    public int n(byte b10) {
        byte[] bArr = this.f95576a;
        for (int i10 = this.f95577b - 1; i10 >= 0; i10--) {
            if (bArr[i10] == b10) {
                return i10;
            }
        }
        return -1;
    }

    public void o(int i10, byte b10) {
        if (i10 < this.f95577b) {
            byte[] bArr = this.f95576a;
            bArr[i10] = (byte) (bArr[i10] * b10);
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95577b);
    }

    public byte p() {
        return this.f95576a[this.f95577b - 1];
    }

    public byte q() {
        byte[] bArr = this.f95576a;
        int i10 = this.f95577b - 1;
        this.f95577b = i10;
        return bArr[i10];
    }

    public byte r() {
        int i10 = this.f95577b;
        if (i10 == 0) {
            return (byte) 0;
        }
        return this.f95576a[com.badlogic.gdx.math.s.z(0, i10 - 1)];
    }

    public boolean s(j jVar) {
        int i10 = this.f95577b;
        byte[] bArr = this.f95576a;
        int i11 = jVar.f95577b;
        int i12 = i10;
        for (int i13 = 0; i13 < i11; i13++) {
            byte bJ = jVar.j(i13);
            for (int i14 = 0; i14 < i12; i14++) {
                if (bJ == bArr[i14]) {
                    t(i14);
                    i12--;
                    break;
                }
            }
        }
        return i12 != i10;
    }

    public int t(int i10) {
        int i11 = this.f95577b;
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95577b);
        }
        byte[] bArr = this.f95576a;
        byte b10 = bArr[i10];
        int i12 = i11 - 1;
        this.f95577b = i12;
        if (this.f95578c) {
            System.arraycopy(bArr, i10 + 1, bArr, i10, i12 - i10);
            return b10;
        }
        bArr[i10] = bArr[i12];
        return b10;
    }

    public String toString() {
        if (this.f95577b == 0) {
            return okhttp3.v.f334777p;
        }
        byte[] bArr = this.f95576a;
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_LIST);
        f1Var.d(bArr[0]);
        for (int i10 = 1; i10 < this.f95577b; i10++) {
            f1Var.o(", ");
            f1Var.d(bArr[i10]);
        }
        f1Var.append(AbstractJsonLexerKt.END_LIST);
        return f1Var.toString();
    }

    public void u(int i10, int i11) {
        int i12 = this.f95577b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i11 + " >= " + this.f95577b);
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i10 + " > " + i11);
        }
        byte[] bArr = this.f95576a;
        int i13 = (i11 - i10) + 1;
        if (this.f95578c) {
            int i14 = i10 + i13;
            System.arraycopy(bArr, i14, bArr, i10, i12 - i14);
        } else {
            int i15 = i12 - 1;
            for (int i16 = 0; i16 < i13; i16++) {
                bArr[i10 + i16] = bArr[i15 - i16];
            }
        }
        this.f95577b -= i13;
    }

    public boolean v(byte b10) {
        byte[] bArr = this.f95576a;
        int i10 = this.f95577b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11] == b10) {
                t(i11);
                return true;
            }
        }
        return false;
    }

    protected byte[] w(int i10) {
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f95576a, 0, bArr, 0, Math.min(this.f95577b, i10));
        this.f95576a = bArr;
        return bArr;
    }

    public void x() {
        byte[] bArr = this.f95576a;
        int i10 = this.f95577b;
        int i11 = i10 - 1;
        int i12 = i10 / 2;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i11 - i13;
            byte b10 = bArr[i13];
            bArr[i13] = bArr[i14];
            bArr[i14] = b10;
        }
    }

    public void y(int i10, byte b10) {
        if (i10 < this.f95577b) {
            this.f95576a[i10] = b10;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95577b);
    }

    public byte[] z() {
        int length = this.f95576a.length;
        int i10 = this.f95577b;
        if (length != i10) {
            w(i10);
        }
        return this.f95576a;
    }

    public j(int i10) {
        this(true, i10);
    }

    public j(boolean z10, int i10) {
        this.f95578c = z10;
        this.f95576a = new byte[i10];
    }

    public j(j jVar) {
        this.f95578c = jVar.f95578c;
        int i10 = jVar.f95577b;
        this.f95577b = i10;
        byte[] bArr = new byte[i10];
        this.f95576a = bArr;
        System.arraycopy(jVar.f95576a, 0, bArr, 0, i10);
    }

    public j(byte[] bArr) {
        this(true, bArr, 0, bArr.length);
    }

    public j(boolean z10, byte[] bArr, int i10, int i11) {
        this(z10, i11);
        this.f95577b = i11;
        System.arraycopy(bArr, i10, this.f95576a, 0, i11);
    }
}
