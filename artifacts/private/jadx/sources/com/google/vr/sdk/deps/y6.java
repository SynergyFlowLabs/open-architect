package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
public final class y6 implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final z6 f129703e = new z6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f129704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f129705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z6[] f129706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f129707d;

    y6() {
        this(10);
    }

    private final int f(int i10) {
        int i11 = i10 << 2;
        for (int i12 = 4; i12 < 32; i12++) {
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
        }
        return i11 / 4;
    }

    private final int g(int i10) {
        int i11 = this.f129707d - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f129705b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    final int a() {
        return this.f129707d;
    }

    final z6 b(int i10) {
        z6 z6Var;
        int iG = g(i10);
        if (iG >= 0 && (z6Var = this.f129706c[iG]) != f129703e) {
            return z6Var;
        }
        return null;
    }

    final void c(int i10, z6 z6Var) {
        int iG = g(i10);
        if (iG >= 0) {
            this.f129706c[iG] = z6Var;
            return;
        }
        int i11 = ~iG;
        int i12 = this.f129707d;
        if (i11 < i12) {
            z6[] z6VarArr = this.f129706c;
            if (z6VarArr[i11] == f129703e) {
                this.f129705b[i11] = i10;
                z6VarArr[i11] = z6Var;
                return;
            }
        }
        if (i12 >= this.f129705b.length) {
            int iF = f(i12 + 1);
            int[] iArr = new int[iF];
            z6[] z6VarArr2 = new z6[iF];
            int[] iArr2 = this.f129705b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            z6[] z6VarArr3 = this.f129706c;
            System.arraycopy(z6VarArr3, 0, z6VarArr2, 0, z6VarArr3.length);
            this.f129705b = iArr;
            this.f129706c = z6VarArr2;
        }
        int i13 = this.f129707d;
        if (i13 - i11 != 0) {
            int[] iArr3 = this.f129705b;
            int i14 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i14, i13 - i11);
            z6[] z6VarArr4 = this.f129706c;
            System.arraycopy(z6VarArr4, i11, z6VarArr4, i14, this.f129707d - i11);
        }
        this.f129705b[i11] = i10;
        this.f129706c[i11] = z6Var;
        this.f129707d++;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final y6 clone() {
        int i10 = this.f129707d;
        y6 y6Var = new y6(i10);
        System.arraycopy(this.f129705b, 0, y6Var.f129705b, 0, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            z6 z6Var = this.f129706c[i11];
            if (z6Var != null) {
                y6Var.f129706c[i11] = z6Var.clone();
            }
        }
        y6Var.f129707d = i10;
        return y6Var;
    }

    final z6 e(int i10) {
        return this.f129706c[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        int i10 = this.f129707d;
        if (i10 != y6Var.f129707d) {
            return false;
        }
        int[] iArr = this.f129705b;
        int[] iArr2 = y6Var.f129705b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        z6[] z6VarArr = this.f129706c;
        z6[] z6VarArr2 = y6Var.f129706c;
        int i12 = this.f129707d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (!z6VarArr[i13].equals(z6VarArr2[i13])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 17;
        for (int i10 = 0; i10 < this.f129707d; i10++) {
            iHashCode = (((iHashCode * 31) + this.f129705b[i10]) * 31) + this.f129706c[i10].hashCode();
        }
        return iHashCode;
    }

    private y6(int i10) {
        this.f129704a = false;
        int iF = f(i10);
        this.f129705b = new int[iF];
        this.f129706c = new z6[iF];
        this.f129707d = 0;
    }
}
