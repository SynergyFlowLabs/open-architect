package org.locationtech.jts.geom;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes14.dex */
public class t implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[][] f338209a;

    public t() {
        this.f338209a = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 3);
        t(-1);
    }

    public static boolean l(int i10) {
        return i10 >= 0 || i10 == -2;
    }

    public static boolean o(int i10, char c10) {
        if (c10 == '*') {
            return true;
        }
        if (c10 == 'T' && (i10 >= 0 || i10 == -2)) {
            return true;
        }
        if (c10 == 'F' && i10 == -1) {
            return true;
        }
        if (c10 == '0' && i10 == 0) {
            return true;
        }
        if (c10 == '1' && i10 == 1) {
            return true;
        }
        return c10 == '2' && i10 == 2;
    }

    public static boolean q(String str, String str2) {
        return new t(str).p(str2);
    }

    public void a(t tVar) {
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                u(i10, i11, tVar.b(i10, i11));
            }
        }
    }

    public int b(int i10, int i11) {
        return this.f338209a[i10][i11];
    }

    public boolean c() {
        if (l(this.f338209a[0][0])) {
            int[] iArr = this.f338209a[2];
            if (iArr[0] == -1 && iArr[1] == -1) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        if (l(this.f338209a[0][0]) || l(this.f338209a[0][1]) || l(this.f338209a[1][0]) || l(this.f338209a[1][1])) {
            int[][] iArr = this.f338209a;
            if (iArr[0][2] == -1 && iArr[1][2] == -1) {
                return true;
            }
        }
        return false;
    }

    public boolean e() {
        if (l(this.f338209a[0][0]) || l(this.f338209a[0][1]) || l(this.f338209a[1][0]) || l(this.f338209a[1][1])) {
            int[] iArr = this.f338209a[2];
            if (iArr[0] == -1 && iArr[1] == -1) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i10, int i11) {
        if ((i10 == 0 && i11 == 1) || ((i10 == 0 && i11 == 2) || (i10 == 1 && i11 == 2))) {
            return l(this.f338209a[0][0]) && l(this.f338209a[0][2]);
        }
        if ((i10 == 1 && i11 == 0) || ((i10 == 2 && i11 == 0) || (i10 == 2 && i11 == 1))) {
            return l(this.f338209a[0][0]) && l(this.f338209a[2][0]);
        }
        return i10 == 1 && i11 == 1 && this.f338209a[0][0] == 0;
    }

    public boolean g() {
        int[][] iArr = this.f338209a;
        int[] iArr2 = iArr[0];
        if (iArr2[0] == -1 && iArr2[1] == -1) {
            int[] iArr3 = iArr[1];
            if (iArr3[0] == -1 && iArr3[1] == -1) {
                return true;
            }
        }
        return false;
    }

    public boolean h(int i10, int i11) {
        if (i10 == i11 && l(this.f338209a[0][0])) {
            int[][] iArr = this.f338209a;
            if (iArr[0][2] == -1 && iArr[1][2] == -1) {
                int[] iArr2 = iArr[2];
                if (iArr2[0] == -1 && iArr2[1] == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean i() {
        return !g();
    }

    public boolean j(int i10, int i11) {
        if ((i10 == 0 && i11 == 0) || (i10 == 2 && i11 == 2)) {
            return l(this.f338209a[0][0]) && l(this.f338209a[0][2]) && l(this.f338209a[2][0]);
        }
        if (i10 == 1 && i11 == 1) {
            int[] iArr = this.f338209a[0];
            if (iArr[0] == 1 && l(iArr[2]) && l(this.f338209a[2][0])) {
                return true;
            }
        }
        return false;
    }

    public boolean k(int i10, int i11) {
        if (i10 > i11) {
            return k(i11, i10);
        }
        if ((i10 == 2 && i11 == 2) || ((i10 == 1 && i11 == 1) || ((i10 == 1 && i11 == 2) || ((i10 == 0 && i11 == 2) || (i10 == 0 && i11 == 1))))) {
            int[] iArr = this.f338209a[0];
            if (iArr[0] == -1 && (l(iArr[1]) || l(this.f338209a[1][0]) || l(this.f338209a[1][1]))) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        if (l(this.f338209a[0][0])) {
            int[][] iArr = this.f338209a;
            if (iArr[0][2] == -1 && iArr[1][2] == -1) {
                return true;
            }
        }
        return false;
    }

    public boolean p(String str) {
        if (str.length() != 9) {
            throw new IllegalArgumentException("Should be length 9: " + str);
        }
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                if (!o(this.f338209a[i10][i11], str.charAt((i10 * 3) + i11))) {
                    return false;
                }
            }
        }
        return true;
    }

    public void r(int i10, int i11, int i12) {
        this.f338209a[i10][i11] = i12;
    }

    public void s(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            this.f338209a[i10 / 3][i10 % 3] = l.b(str.charAt(i10));
        }
    }

    public void t(int i10) {
        for (int i11 = 0; i11 < 3; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                this.f338209a[i11][i12] = i10;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("123456789");
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                sb2.setCharAt((i10 * 3) + i11, l.a(this.f338209a[i10][i11]));
            }
        }
        return sb2.toString();
    }

    public void u(int i10, int i11, int i12) {
        int[] iArr = this.f338209a[i10];
        if (iArr[i11] < i12) {
            iArr[i11] = i12;
        }
    }

    public void v(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            u(i10 / 3, i10 % 3, l.b(str.charAt(i10)));
        }
    }

    public void w(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < 0) {
            return;
        }
        u(i10, i11, i12);
    }

    public t x() {
        int[][] iArr = this.f338209a;
        int[] iArr2 = iArr[1];
        int i10 = iArr2[0];
        int[] iArr3 = iArr[0];
        iArr2[0] = iArr3[1];
        iArr3[1] = i10;
        int[] iArr4 = iArr[2];
        int i11 = iArr4[0];
        iArr4[0] = iArr3[2];
        iArr3[2] = i11;
        int i12 = iArr4[1];
        iArr4[1] = iArr2[2];
        iArr2[2] = i12;
        return this;
    }

    public t(String str) {
        this();
        s(str);
    }

    public t(t tVar) {
        this();
        int[][] iArr = this.f338209a;
        int[] iArr2 = iArr[0];
        int[][] iArr3 = tVar.f338209a;
        int[] iArr4 = iArr3[0];
        iArr2[0] = iArr4[0];
        iArr2[1] = iArr4[1];
        iArr2[2] = iArr4[2];
        int[] iArr5 = iArr[1];
        int[] iArr6 = iArr3[1];
        iArr5[0] = iArr6[0];
        iArr5[1] = iArr6[1];
        iArr5[2] = iArr6[2];
        int[] iArr7 = iArr[2];
        int[] iArr8 = iArr3[2];
        iArr7[0] = iArr8[0];
        iArr7[1] = iArr8[1];
        iArr7[2] = iArr8[2];
    }
}
