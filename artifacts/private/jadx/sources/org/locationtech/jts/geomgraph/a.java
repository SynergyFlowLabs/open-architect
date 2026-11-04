package org.locationtech.jts.geomgraph;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f338263b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[][] f338264a = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 3);

    public a() {
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                this.f338264a[i10][i11] = -1;
            }
        }
    }

    public static int c(int i10) {
        if (i10 == 2) {
            return 0;
        }
        return i10 == 0 ? 1 : -1;
    }

    public void a(int i10, int i11, int i12) {
        if (i12 == 0) {
            int[] iArr = this.f338264a[i10];
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public void b(n nVar) {
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = 1; i11 < 3; i11++) {
                int iE = nVar.e(i10, i11);
                if (iE == 2 || iE == 0) {
                    if (i(i10, i11)) {
                        this.f338264a[i10][i11] = c(iE);
                    } else {
                        int[] iArr = this.f338264a[i10];
                        iArr[i11] = iArr[i11] + c(iE);
                    }
                }
            }
        }
    }

    public int d(int i10) {
        int[] iArr = this.f338264a[i10];
        return iArr[2] - iArr[1];
    }

    public int e(int i10, int i11) {
        return this.f338264a[i10][i11];
    }

    public int f(int i10, int i11) {
        return this.f338264a[i10][i11] <= 0 ? 2 : 0;
    }

    public boolean g() {
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                if (this.f338264a[i10][i11] != -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean h(int i10) {
        return this.f338264a[i10][1] == -1;
    }

    public boolean i(int i10, int i11) {
        return this.f338264a[i10][i11] == -1;
    }

    public void j() {
        for (int i10 = 0; i10 < 2; i10++) {
            if (!h(i10)) {
                int[] iArr = this.f338264a[i10];
                int i11 = iArr[1];
                int i12 = iArr[2];
                if (i12 < i11) {
                    i11 = i12;
                }
                if (i11 < 0) {
                    i11 = 0;
                }
                for (int i13 = 1; i13 < 3; i13++) {
                    int[] iArr2 = this.f338264a[i10];
                    iArr2[i13] = iArr2[i13] > i11 ? 1 : 0;
                }
            }
        }
    }

    public void k(int i10, int i11, int i12) {
        this.f338264a[i10][i11] = i12;
    }

    public String toString() {
        return "A: " + this.f338264a[0][1] + "," + this.f338264a[0][2] + " B: " + this.f338264a[1][1] + "," + this.f338264a[1][2];
    }
}
