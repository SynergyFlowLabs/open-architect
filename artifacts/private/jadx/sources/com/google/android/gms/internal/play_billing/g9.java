package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class g9 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g9 f109135f = new g9(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f109136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f109137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f109138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f109139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f109140e;

    private g9(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f109139d = -1;
        this.f109136a = i10;
        this.f109137b = iArr;
        this.f109138c = objArr;
        this.f109140e = z10;
    }

    public static g9 c() {
        return f109135f;
    }

    static g9 e(g9 g9Var, g9 g9Var2) {
        int i10 = g9Var.f109136a + g9Var2.f109136a;
        int[] iArrCopyOf = Arrays.copyOf(g9Var.f109137b, i10);
        System.arraycopy(g9Var2.f109137b, 0, iArrCopyOf, g9Var.f109136a, g9Var2.f109136a);
        Object[] objArrCopyOf = Arrays.copyOf(g9Var.f109138c, i10);
        System.arraycopy(g9Var2.f109138c, 0, objArrCopyOf, g9Var.f109136a, g9Var2.f109136a);
        return new g9(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static g9 f() {
        return new g9(0, new int[8], new Object[8], true);
    }

    private final void m(int i10) {
        int[] iArr = this.f109137b;
        if (i10 > iArr.length) {
            int i11 = this.f109136a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f109137b = Arrays.copyOf(iArr, i10);
            this.f109138c = Arrays.copyOf(this.f109138c, i10);
        }
    }

    public final int a() {
        int iB;
        int iA;
        int iB2;
        int i10 = this.f109139d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f109136a; i12++) {
            int i13 = this.f109137b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f109138c[i12]).getClass();
                    iB2 = k6.B(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    d6 d6Var = (d6) this.f109138c[i12];
                    int iB3 = k6.B(i16);
                    int i17 = d6Var.i();
                    iB2 = iB3 + k6.B(i17) + i17;
                } else if (i15 == 3) {
                    int iB4 = k6.B(i14 << 3);
                    iB = iB4 + iB4;
                    iA = ((g9) this.f109138c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new k7("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f109138c[i12]).getClass();
                    iB2 = k6.B(i14 << 3) + 4;
                }
                i11 += iB2;
            } else {
                int i18 = i14 << 3;
                long jLongValue = ((Long) this.f109138c[i12]).longValue();
                iB = k6.B(i18);
                iA = k6.a(jLongValue);
            }
            iB2 = iB + iA;
            i11 += iB2;
        }
        this.f109139d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f109139d;
        if (i10 != -1) {
            return i10;
        }
        int iB = 0;
        for (int i11 = 0; i11 < this.f109136a; i11++) {
            int i12 = this.f109137b[i11] >>> 3;
            d6 d6Var = (d6) this.f109138c[i11];
            int iB2 = k6.B(8);
            int iB3 = k6.B(16) + k6.B(i12);
            int iB4 = k6.B(24);
            int i13 = d6Var.i();
            iB += iB2 + iB2 + iB3 + iB4 + k6.B(i13) + i13;
        }
        this.f109139d = iB;
        return iB;
    }

    final g9 d(g9 g9Var) {
        if (g9Var.equals(f109135f)) {
            return this;
        }
        g();
        int i10 = this.f109136a + g9Var.f109136a;
        m(i10);
        System.arraycopy(g9Var.f109137b, 0, this.f109137b, this.f109136a, g9Var.f109136a);
        System.arraycopy(g9Var.f109138c, 0, this.f109138c, this.f109136a, g9Var.f109136a);
        this.f109136a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g9)) {
            return false;
        }
        g9 g9Var = (g9) obj;
        int i10 = this.f109136a;
        if (i10 == g9Var.f109136a) {
            int[] iArr = this.f109137b;
            int[] iArr2 = g9Var.f109137b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f109138c;
            Object[] objArr2 = g9Var.f109138c;
            int i12 = this.f109136a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    final void g() {
        if (!this.f109140e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f109140e) {
            this.f109140e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f109136a;
        int i11 = i10 + 527;
        int[] iArr = this.f109137b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f109138c;
        int i15 = this.f109136a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f109136a; i11++) {
            j8.b(sb2, i10, String.valueOf(this.f109137b[i11] >>> 3), this.f109138c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        g();
        m(this.f109136a + 1);
        int[] iArr = this.f109137b;
        int i11 = this.f109136a;
        iArr[i11] = i10;
        this.f109138c[i11] = obj;
        this.f109136a = i11 + 1;
    }

    final void k(s9 s9Var) throws IOException {
        for (int i10 = 0; i10 < this.f109136a; i10++) {
            s9Var.w(this.f109137b[i10] >>> 3, this.f109138c[i10]);
        }
    }

    public final void l(s9 s9Var) throws IOException {
        if (this.f109136a != 0) {
            for (int i10 = 0; i10 < this.f109136a; i10++) {
                int i11 = this.f109137b[i10];
                Object obj = this.f109138c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    s9Var.D(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    s9Var.z(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    s9Var.x(i13, (d6) obj);
                } else if (i12 != 3) {
                    int i14 = 7 & 5;
                    if (i12 != 5) {
                        throw new RuntimeException(new k7("Protocol message tag had invalid wire type."));
                    }
                    s9Var.c(i13, ((Integer) obj).intValue());
                } else {
                    s9Var.r(i13);
                    ((g9) obj).l(s9Var);
                    s9Var.q(i13);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private g9() {
        this(0, new int[8], new Object[8], true);
        int i10 = 2 << 0;
    }
}
