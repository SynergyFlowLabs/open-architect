package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class wd {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final wd f108948f = new wd(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f108949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f108950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f108951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f108952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f108953e;

    private wd(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f108952d = -1;
        this.f108949a = i10;
        this.f108950b = iArr;
        this.f108951c = objArr;
        this.f108953e = z10;
    }

    public static wd a() {
        return f108948f;
    }

    static wd b() {
        return new wd(0, new int[8], new Object[8], true);
    }

    static wd c(wd wdVar, wd wdVar2) {
        int i10 = wdVar.f108949a + wdVar2.f108949a;
        int[] iArrCopyOf = Arrays.copyOf(wdVar.f108950b, i10);
        System.arraycopy(wdVar2.f108950b, 0, iArrCopyOf, wdVar.f108949a, wdVar2.f108949a);
        Object[] objArrCopyOf = Arrays.copyOf(wdVar.f108951c, i10);
        System.arraycopy(wdVar2.f108951c, 0, objArrCopyOf, wdVar.f108949a, wdVar2.f108949a);
        return new wd(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void m(int i10) {
        int[] iArr = this.f108950b;
        if (i10 > iArr.length) {
            int i11 = this.f108949a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f108950b = Arrays.copyOf(iArr, i10);
            this.f108951c = Arrays.copyOf(this.f108951c, i10);
        }
    }

    public final void d() {
        if (this.f108953e) {
            this.f108953e = false;
        }
    }

    final void e() {
        if (!this.f108953e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wd)) {
            return false;
        }
        wd wdVar = (wd) obj;
        int i10 = this.f108949a;
        if (i10 == wdVar.f108949a) {
            int[] iArr = this.f108950b;
            int[] iArr2 = wdVar.f108950b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f108951c;
            Object[] objArr2 = wdVar.f108951c;
            int i12 = this.f108949a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    final void f(ie ieVar) throws IOException {
        for (int i10 = 0; i10 < this.f108949a; i10++) {
            ieVar.A(this.f108950b[i10] >>> 3, this.f108951c[i10]);
        }
    }

    public final void g(ie ieVar) throws IOException {
        if (this.f108949a != 0) {
            for (int i10 = 0; i10 < this.f108949a; i10++) {
                int i11 = this.f108950b[i10];
                Object obj = this.f108951c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    ieVar.l(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    ieVar.r(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    ieVar.q(i13, (ra) obj);
                } else if (i12 == 3) {
                    ieVar.F(i13);
                    ((wd) obj).g(ieVar);
                    ieVar.G(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new bc("Protocol message tag had invalid wire type."));
                    }
                    ieVar.c(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int h() {
        int i10 = this.f108952d;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.f108949a; i11++) {
            int i12 = this.f108950b[i11] >>> 3;
            ra raVar = (ra) this.f108951c[i11];
            int iG2 = wa.G(8);
            int iG3 = wa.G(16) + wa.G(i12);
            int iG4 = wa.G(24);
            int i13 = raVar.i();
            iG += iG2 + iG2 + iG3 + iG4 + wa.G(i13) + i13;
        }
        this.f108952d = iG;
        return iG;
    }

    public final int hashCode() {
        int i10 = this.f108949a;
        int i11 = i10 + 527;
        int[] iArr = this.f108950b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f108951c;
        int i15 = this.f108949a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int i() {
        int iG;
        int iA;
        int iG2;
        int i10 = this.f108952d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f108949a; i12++) {
            int i13 = this.f108950b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f108951c[i12]).getClass();
                    iG2 = wa.G(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    ra raVar = (ra) this.f108951c[i12];
                    int iG3 = wa.G(i16);
                    int i17 = raVar.i();
                    iG2 = iG3 + wa.G(i17) + i17;
                } else if (i15 == 3) {
                    int iG4 = wa.G(i14 << 3);
                    iG = iG4 + iG4;
                    iA = ((wd) this.f108951c[i12]).i();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new bc("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f108951c[i12]).getClass();
                    iG2 = wa.G(i14 << 3) + 4;
                }
                i11 += iG2;
            } else {
                int i18 = i14 << 3;
                long jLongValue = ((Long) this.f108951c[i12]).longValue();
                iG = wa.G(i18);
                iA = wa.a(jLongValue);
            }
            iG2 = iG + iA;
            i11 += iG2;
        }
        this.f108952d = i11;
        return i11;
    }

    final void j(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f108949a; i11++) {
            ad.b(sb2, i10, String.valueOf(this.f108950b[i11] >>> 3), this.f108951c[i11]);
        }
    }

    final void k(int i10, Object obj) {
        e();
        m(this.f108949a + 1);
        int[] iArr = this.f108950b;
        int i11 = this.f108949a;
        iArr[i11] = i10;
        this.f108951c[i11] = obj;
        this.f108949a = i11 + 1;
    }

    final wd l(wd wdVar) {
        if (wdVar.equals(f108948f)) {
            return this;
        }
        e();
        int i10 = this.f108949a + wdVar.f108949a;
        m(i10);
        System.arraycopy(wdVar.f108950b, 0, this.f108950b, this.f108949a, wdVar.f108949a);
        System.arraycopy(wdVar.f108951c, 0, this.f108951c, this.f108949a, wdVar.f108949a);
        this.f108949a = i10;
        return this;
    }

    private wd() {
        this(0, new int[8], new Object[8], true);
    }
}
