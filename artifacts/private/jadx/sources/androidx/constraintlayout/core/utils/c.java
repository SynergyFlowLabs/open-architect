package androidx.constraintlayout.core.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f44498l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f44499m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f44500n = 50;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f44501o = 50;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f44502p = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f44508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f44509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f44510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f44511i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean[][] f44512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[][] f44513k;

    public c() {
    }

    private void a() {
        c cVar;
        int i10 = 0;
        while (i10 < this.f44505c) {
            if (this.m(i10) != -1) {
                cVar = this;
            } else {
                int iF = this.f();
                int iG = this.g(iF);
                int iE = this.e(iF);
                if (iF == -1) {
                    return;
                }
                cVar = this;
                cVar.b(i10, iG, iE, 1, 1);
            }
            i10++;
            this = cVar;
        }
    }

    private void b(int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.f44513k[i10];
        iArr[0] = i12;
        iArr[1] = i11;
        iArr[2] = (i12 + i14) - 1;
        iArr[3] = (i11 + i13) - 1;
    }

    private void d(boolean z10) {
        int[][] iArrN;
        int[][] iArrN2;
        if (z10) {
            for (int i10 = 0; i10 < this.f44512j.length; i10++) {
                int i11 = 0;
                while (true) {
                    boolean[][] zArr = this.f44512j;
                    if (i11 < zArr[0].length) {
                        zArr[i10][i11] = true;
                        i11++;
                    }
                }
            }
            for (int i12 = 0; i12 < this.f44513k.length; i12++) {
                int i13 = 0;
                while (true) {
                    int[][] iArr = this.f44513k;
                    if (i13 < iArr[0].length) {
                        iArr[i12][i13] = -1;
                        i13++;
                    }
                }
            }
        }
        this.f44511i = 0;
        String str = this.f44509g;
        if (str != null && !str.trim().isEmpty() && (iArrN2 = n(this.f44509g)) != null) {
            h(iArrN2);
        }
        String str2 = this.f44508f;
        if (str2 != null && !str2.trim().isEmpty() && (iArrN = n(this.f44508f)) != null) {
            i(iArrN);
        }
        a();
    }

    private int e(int i10) {
        return this.f44510h == 1 ? i10 / this.f44503a : i10 % this.f44506d;
    }

    private int f() {
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10 = this.f44511i;
            if (i10 >= this.f44503a * this.f44506d) {
                return -1;
            }
            int iG = g(i10);
            int iE = e(this.f44511i);
            boolean[] zArr = this.f44512j[iG];
            if (zArr[iE]) {
                zArr[iE] = false;
                z10 = true;
            }
            this.f44511i++;
        }
        return i10;
    }

    private int g(int i10) {
        return this.f44510h == 1 ? i10 % this.f44503a : i10 / this.f44506d;
    }

    private void h(int[][] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iG = g(iArr[i10][0]);
            int iE = e(iArr[i10][0]);
            int[] iArr2 = iArr[i10];
            if (!k(iG, iE, iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void i(int[][] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iG = g(iArr[i10][0]);
            int iE = e(iArr[i10][0]);
            int[] iArr2 = iArr[i10];
            if (!k(iG, iE, iArr2[1], iArr2[2])) {
                break;
            }
            int[] iArr3 = iArr[i10];
            b(i10, iG, iE, iArr3[1], iArr3[2]);
        }
    }

    private void j() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f44503a, this.f44506d);
        this.f44512j = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i10 = this.f44505c;
        if (i10 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 4);
            this.f44513k = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private boolean k(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.f44512j;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean l(CharSequence charSequence) {
        return charSequence != null;
    }

    private int[][] n(String str) {
        if (!l(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i10][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i10][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i10][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    private void x() {
        int i10;
        int i11 = this.f44504b;
        if (i11 != 0 && (i10 = this.f44507e) != 0) {
            this.f44503a = i11;
            this.f44506d = i10;
            return;
        }
        int i12 = this.f44507e;
        if (i12 > 0) {
            this.f44506d = i12;
            this.f44503a = ((this.f44505c + i12) - 1) / i12;
        } else if (i11 > 0) {
            this.f44503a = i11;
            this.f44506d = ((this.f44505c + i11) - 1) / i11;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f44505c) + 1.5d);
            this.f44503a = iSqrt;
            this.f44506d = ((this.f44505c + iSqrt) - 1) / iSqrt;
        }
    }

    public int c(int i10) {
        int[][] iArr = this.f44513k;
        if (iArr == null || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10][3];
    }

    public int m(int i10) {
        int[][] iArr = this.f44513k;
        if (iArr != null && i10 < iArr.length) {
            return iArr[i10][0];
        }
        return 0;
    }

    public int o(int i10) {
        int[][] iArr = this.f44513k;
        if (iArr == null || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10][2];
    }

    public void p(int i10) {
        if (i10 <= 50 && this.f44507e != i10) {
            this.f44507e = i10;
            x();
        }
    }

    public void q(int i10) {
        if (i10 > this.f44503a * this.f44506d) {
            return;
        }
        this.f44505c = i10;
    }

    public void r(int i10) {
        if ((i10 == 0 || i10 == 1) && this.f44510h != i10) {
            this.f44510h = i10;
        }
    }

    public void s(int i10) {
        if (i10 <= 50 && this.f44504b != i10) {
            this.f44504b = i10;
            x();
        }
    }

    public void t(String str) {
        String str2 = this.f44509g;
        if (str2 == null || !str2.equals(str)) {
            this.f44509g = str;
        }
    }

    public void u(CharSequence charSequence) {
        String str = this.f44508f;
        if (str == null || !str.equals(charSequence.toString())) {
            this.f44508f = charSequence.toString();
        }
    }

    public void v() {
        boolean[][] zArr;
        int[][] iArr = this.f44513k;
        boolean z10 = false;
        if (iArr != null && iArr.length == this.f44505c && (zArr = this.f44512j) != null && zArr.length == this.f44503a && zArr[0].length == this.f44506d) {
            z10 = true;
        }
        if (!z10) {
            j();
        }
        d(z10);
    }

    public int w(int i10) {
        int[][] iArr = this.f44513k;
        if (iArr != null && i10 < iArr.length) {
            return iArr[i10][1];
        }
        return 0;
    }

    public c(int i10, int i11) {
        this.f44504b = i10;
        this.f44507e = i11;
        int i12 = 3 ^ 3;
        if (i10 > 50) {
            this.f44504b = 3;
        }
        if (i11 > 50) {
            this.f44507e = 3;
        }
        x();
        j();
    }

    public c(int i10, int i11, int i12) {
        this.f44504b = i10;
        this.f44507e = i11;
        this.f44505c = i12;
        if (i10 > 50) {
            this.f44504b = 3;
        }
        if (i11 > 50) {
            this.f44507e = 3;
        }
        x();
        int i13 = this.f44503a;
        int i14 = this.f44506d;
        if (i12 > i13 * i14 || i12 < 1) {
            this.f44505c = i13 * i14;
        }
        j();
        d(false);
    }
}
