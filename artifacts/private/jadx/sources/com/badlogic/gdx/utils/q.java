package com.badlogic.gdx.utils;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f95729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f95731c;

    public q() {
        this(true, 16);
    }

    public static q H(float... fArr) {
        return new q(fArr);
    }

    public float[] A() {
        int length = this.f95729a.length;
        int i10 = this.f95730b;
        if (length != i10) {
            x(i10);
        }
        return this.f95729a;
    }

    public void B() {
        float[] fArr = this.f95729a;
        int i10 = this.f95730b;
        while (true) {
            i10--;
            if (i10 < 0) {
                return;
            }
            int iY = com.badlogic.gdx.math.s.y(i10);
            float f10 = fArr[i10];
            fArr[i10] = fArr[iY];
            fArr[iY] = f10;
        }
    }

    public void C() {
        Arrays.sort(this.f95729a, 0, this.f95730b);
    }

    public void D(int i10, int i11) {
        int i12 = this.f95730b;
        if (i10 >= i12) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i10 + " >= " + this.f95730b);
        }
        if (i11 < i12) {
            float[] fArr = this.f95729a;
            float f10 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = f10;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i11 + " >= " + this.f95730b);
    }

    public float[] E() {
        int i10 = this.f95730b;
        float[] fArr = new float[i10];
        System.arraycopy(this.f95729a, 0, fArr, 0, i10);
        return fArr;
    }

    public String F(String str) {
        if (this.f95730b == 0) {
            return "";
        }
        float[] fArr = this.f95729a;
        f1 f1Var = new f1(32);
        f1Var.c(fArr[0]);
        for (int i10 = 1; i10 < this.f95730b; i10++) {
            f1Var.o(str);
            f1Var.c(fArr[i10]);
        }
        return f1Var.toString();
    }

    public void G(int i10) {
        if (this.f95730b > i10) {
            this.f95730b = i10;
        }
    }

    public void a(float f10) {
        float[] fArrX = this.f95729a;
        int i10 = this.f95730b;
        if (i10 == fArrX.length) {
            fArrX = x(Math.max(8, (int) (i10 * 1.75f)));
        }
        int i11 = this.f95730b;
        this.f95730b = i11 + 1;
        fArrX[i11] = f10;
    }

    public void b(q qVar) {
        c(qVar, 0, qVar.f95730b);
    }

    public void c(q qVar, int i10, int i11) {
        if (i10 + i11 <= qVar.f95730b) {
            e(qVar.f95729a, i10, i11);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i10 + " + " + i11 + " <= " + qVar.f95730b);
    }

    public void d(float... fArr) {
        e(fArr, 0, fArr.length);
    }

    public void e(float[] fArr, int i10, int i11) {
        float[] fArrX = this.f95729a;
        int i12 = this.f95730b + i11;
        if (i12 > fArrX.length) {
            fArrX = x(Math.max(8, (int) (i12 * 1.75f)));
        }
        System.arraycopy(fArr, i10, fArrX, this.f95730b, i11);
        this.f95730b += i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        int i10 = this.f95730b;
        if (i10 != qVar.f95730b) {
            return false;
        }
        float[] fArr = this.f95729a;
        float[] fArr2 = qVar.f95729a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (fArr[i11] != fArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public void f() {
        this.f95730b = 0;
    }

    public boolean g(float f10) {
        int i10 = this.f95730b - 1;
        float[] fArr = this.f95729a;
        while (i10 >= 0) {
            int i11 = i10 - 1;
            if (fArr[i10] == f10) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    public float[] h(int i10) {
        int i11 = this.f95730b + i10;
        if (i11 > this.f95729a.length) {
            x(Math.max(8, i11));
        }
        return this.f95729a;
    }

    public boolean i(Object obj, float f10) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        int i10 = this.f95730b;
        if (i10 != qVar.f95730b) {
            return false;
        }
        float[] fArr = this.f95729a;
        float[] fArr2 = qVar.f95729a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (Math.abs(fArr[i11] - fArr2[i11]) > f10) {
                return false;
            }
        }
        return true;
    }

    public float j() {
        if (this.f95730b != 0) {
            return this.f95729a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public float k(int i10) {
        if (i10 < this.f95730b) {
            return this.f95729a[i10];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95730b);
    }

    public void l(int i10, float f10) {
        if (i10 < this.f95730b) {
            float[] fArr = this.f95729a;
            fArr[i10] = fArr[i10] + f10;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95730b);
    }

    public int m(float f10) {
        float[] fArr = this.f95729a;
        int i10 = this.f95730b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (fArr[i11] == f10) {
                return i11;
            }
        }
        return -1;
    }

    public void n(int i10, float f10) {
        int i11 = this.f95730b;
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i10 + " > " + this.f95730b);
        }
        float[] fArrX = this.f95729a;
        if (i11 == fArrX.length) {
            fArrX = x(Math.max(8, (int) (i11 * 1.75f)));
        }
        if (this.f95731c) {
            System.arraycopy(fArrX, i10, fArrX, i10 + 1, this.f95730b - i10);
        } else {
            fArrX[this.f95730b] = fArrX[i10];
        }
        this.f95730b++;
        fArrX[i10] = f10;
    }

    public int o(char c10) {
        float[] fArr = this.f95729a;
        for (int i10 = this.f95730b - 1; i10 >= 0; i10--) {
            if (fArr[i10] == c10) {
                return i10;
            }
        }
        return -1;
    }

    public void p(int i10, float f10) {
        if (i10 < this.f95730b) {
            float[] fArr = this.f95729a;
            fArr[i10] = fArr[i10] * f10;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95730b);
    }

    public float q() {
        return this.f95729a[this.f95730b - 1];
    }

    public float r() {
        float[] fArr = this.f95729a;
        int i10 = this.f95730b - 1;
        this.f95730b = i10;
        return fArr[i10];
    }

    public float s() {
        int i10 = this.f95730b;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f95729a[com.badlogic.gdx.math.s.z(0, i10 - 1)];
    }

    public boolean t(q qVar) {
        int i10 = this.f95730b;
        float[] fArr = this.f95729a;
        int i11 = qVar.f95730b;
        int i12 = i10;
        for (int i13 = 0; i13 < i11; i13++) {
            float fK = qVar.k(i13);
            for (int i14 = 0; i14 < i12; i14++) {
                if (fK == fArr[i14]) {
                    u(i14);
                    i12--;
                    break;
                }
            }
        }
        return i12 != i10;
    }

    public String toString() {
        if (this.f95730b == 0) {
            return okhttp3.v.f334777p;
        }
        float[] fArr = this.f95729a;
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_LIST);
        f1Var.c(fArr[0]);
        for (int i10 = 1; i10 < this.f95730b; i10++) {
            f1Var.o(", ");
            f1Var.c(fArr[i10]);
        }
        f1Var.append(AbstractJsonLexerKt.END_LIST);
        return f1Var.toString();
    }

    public float u(int i10) {
        int i11 = this.f95730b;
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95730b);
        }
        float[] fArr = this.f95729a;
        float f10 = fArr[i10];
        int i12 = i11 - 1;
        this.f95730b = i12;
        if (this.f95731c) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, i12 - i10);
            return f10;
        }
        fArr[i10] = fArr[i12];
        return f10;
    }

    public void v(int i10, int i11) {
        int i12 = this.f95730b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i11 + " >= " + this.f95730b);
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i10 + " > " + i11);
        }
        float[] fArr = this.f95729a;
        int i13 = (i11 - i10) + 1;
        if (this.f95731c) {
            int i14 = i10 + i13;
            System.arraycopy(fArr, i14, fArr, i10, i12 - i14);
        } else {
            int i15 = i12 - 1;
            for (int i16 = 0; i16 < i13; i16++) {
                fArr[i10 + i16] = fArr[i15 - i16];
            }
        }
        this.f95730b -= i13;
    }

    public boolean w(float f10) {
        float[] fArr = this.f95729a;
        int i10 = this.f95730b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (fArr[i11] == f10) {
                u(i11);
                return true;
            }
        }
        return false;
    }

    protected float[] x(int i10) {
        float[] fArr = new float[i10];
        System.arraycopy(this.f95729a, 0, fArr, 0, Math.min(this.f95730b, i10));
        this.f95729a = fArr;
        return fArr;
    }

    public void y() {
        float[] fArr = this.f95729a;
        int i10 = this.f95730b;
        int i11 = i10 - 1;
        int i12 = i10 / 2;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i11 - i13;
            float f10 = fArr[i13];
            fArr[i13] = fArr[i14];
            fArr[i14] = f10;
        }
    }

    public void z(int i10, float f10) {
        if (i10 < this.f95730b) {
            this.f95729a[i10] = f10;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i10 + " >= " + this.f95730b);
    }

    public q(int i10) {
        this(true, i10);
    }

    public q(boolean z10, int i10) {
        this.f95731c = z10;
        this.f95729a = new float[i10];
    }

    public q(q qVar) {
        this.f95731c = qVar.f95731c;
        int i10 = qVar.f95730b;
        this.f95730b = i10;
        float[] fArr = new float[i10];
        this.f95729a = fArr;
        System.arraycopy(qVar.f95729a, 0, fArr, 0, i10);
    }

    public q(float[] fArr) {
        this(true, fArr, 0, fArr.length);
    }

    public q(boolean z10, float[] fArr, int i10, int i11) {
        this(z10, i11);
        this.f95730b = i11;
        System.arraycopy(fArr, i10, this.f95729a, 0, i11);
    }
}
