package com.google.vr.sdk.deps;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class b6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b6 f127713f = new b6(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f127714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f127715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f127716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f127717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f127718e;

    private b6() {
        this(0, new int[8], new Object[8], true);
    }

    public static b6 a() {
        return f127713f;
    }

    static b6 b(b6 b6Var, b6 b6Var2) {
        int i10 = b6Var.f127714a + b6Var2.f127714a;
        int[] iArrCopyOf = Arrays.copyOf(b6Var.f127715b, i10);
        System.arraycopy(b6Var2.f127715b, 0, iArrCopyOf, b6Var.f127714a, b6Var2.f127714a);
        Object[] objArrCopyOf = Arrays.copyOf(b6Var.f127716c, i10);
        System.arraycopy(b6Var2.f127716c, 0, objArrCopyOf, b6Var.f127714a, b6Var2.f127714a);
        return new b6(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private static void d(int i10, Object obj, q6 q6Var) throws IOException {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            q6Var.g(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            q6Var.C(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            q6Var.h(i11, (k2) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(v3.e());
            }
            q6Var.B(i11, ((Integer) obj).intValue());
        } else if (q6Var.a() == e5.f129356c) {
            q6Var.c(i11);
            ((b6) obj).h(q6Var);
            q6Var.q(i11);
        } else {
            q6Var.q(i11);
            ((b6) obj).h(q6Var);
            q6Var.c(i11);
        }
    }

    static b6 g() {
        return new b6();
    }

    final void c(int i10, Object obj) {
        if (!this.f127718e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f127714a;
        int[] iArr = this.f127715b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f127715b = Arrays.copyOf(iArr, i12);
            this.f127716c = Arrays.copyOf(this.f127716c, i12);
        }
        int[] iArr2 = this.f127715b;
        int i13 = this.f127714a;
        iArr2[i13] = i10;
        this.f127716c[i13] = obj;
        this.f127714a = i13 + 1;
    }

    final void e(q6 q6Var) throws IOException {
        if (q6Var.a() != e5.f129357d) {
            for (int i10 = 0; i10 < this.f127714a; i10++) {
                q6Var.j(this.f127715b[i10] >>> 3, this.f127716c[i10]);
            }
            return;
        }
        int i11 = this.f127714a;
        while (true) {
            i11--;
            if (i11 < 0) {
                return;
            } else {
                q6Var.j(this.f127715b[i11] >>> 3, this.f127716c[i11]);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        int i10 = this.f127714a;
        if (i10 == b6Var.f127714a) {
            int[] iArr = this.f127715b;
            int[] iArr2 = b6Var.f127715b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f127716c;
            Object[] objArr2 = b6Var.f127716c;
            int i12 = this.f127714a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    final void f(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f127714a; i11++) {
            m4.n(sb2, i10, String.valueOf(this.f127715b[i11] >>> 3), this.f127716c[i11]);
        }
    }

    public final void h(q6 q6Var) throws IOException {
        if (this.f127714a == 0) {
            return;
        }
        if (q6Var.a() == e5.f129356c) {
            for (int i10 = 0; i10 < this.f127714a; i10++) {
                d(this.f127715b[i10], this.f127716c[i10], q6Var);
            }
            return;
        }
        for (int i11 = this.f127714a - 1; i11 >= 0; i11--) {
            d(this.f127715b[i11], this.f127716c[i11], q6Var);
        }
    }

    public final int hashCode() {
        int i10 = this.f127714a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f127715b;
        int iHashCode = 17;
        int i12 = 7 >> 0;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f127716c;
        int i16 = this.f127714a;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return i15 + iHashCode;
    }

    public final void i() {
        this.f127718e = false;
    }

    public final int j() {
        int i10 = this.f127717d;
        if (i10 != -1) {
            return i10;
        }
        int iF0 = 0;
        for (int i11 = 0; i11 < this.f127714a; i11++) {
            iF0 += t2.f0(this.f127715b[i11] >>> 3, (k2) this.f127716c[i11]);
        }
        this.f127717d = iF0;
        return iF0;
    }

    public final int k() {
        int iM0;
        int i10 = this.f127717d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f127714a; i12++) {
            int i13 = this.f127715b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                iM0 = t2.m0(i14, ((Long) this.f127716c[i12]).longValue());
            } else if (i15 == 1) {
                iM0 = t2.x0(i14, ((Long) this.f127716c[i12]).longValue());
            } else if (i15 == 2) {
                iM0 = t2.U(i14, (k2) this.f127716c[i12]);
            } else if (i15 == 3) {
                iM0 = (t2.l0(i14) << 1) + ((b6) this.f127716c[i12]).k();
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(v3.e());
                }
                iM0 = t2.F0(i14, ((Integer) this.f127716c[i12]).intValue());
            }
            i11 += iM0;
        }
        this.f127717d = i11;
        return i11;
    }

    private b6(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f127717d = -1;
        this.f127714a = i10;
        this.f127715b = iArr;
        this.f127716c = objArr;
        this.f127718e = z10;
    }
}
