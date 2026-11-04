package w9;

import com.google.zxing.m;
import com.google.zxing.t;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f385937h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f385938i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f385939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f385940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f385941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f385942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f385943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f385944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f385945g;

    public c(com.google.zxing.common.b bVar) throws m {
        this(bVar, 10, bVar.l() / 2, bVar.h() / 2);
    }

    private t[] a(t tVar, t tVar2, t tVar3, t tVar4) {
        float fC = tVar.c();
        float fD = tVar.d();
        float fC2 = tVar2.c();
        float fD2 = tVar2.d();
        float fC3 = tVar3.c();
        float fD3 = tVar3.d();
        float fC4 = tVar4.c();
        float fD4 = tVar4.d();
        return fC < ((float) this.f385941c) / 2.0f ? new t[]{new t(fC4 - 1.0f, fD4 + 1.0f), new t(fC2 + 1.0f, fD2 + 1.0f), new t(fC3 - 1.0f, fD3 - 1.0f), new t(fC + 1.0f, fD - 1.0f)} : new t[]{new t(fC4 + 1.0f, fD4 + 1.0f), new t(fC2 + 1.0f, fD2 - 1.0f), new t(fC3 - 1.0f, fD3 + 1.0f), new t(fC - 1.0f, fD - 1.0f)};
    }

    private boolean b(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.f385939a.e(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.f385939a.e(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private t d(float f10, float f11, float f12, float f13) {
        int iC = a.c(a.a(f10, f11, f12, f13));
        float f14 = iC;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < iC; i10++) {
            float f17 = i10;
            int iC2 = a.c((f17 * f15) + f10);
            int iC3 = a.c((f17 * f16) + f11);
            if (this.f385939a.e(iC2, iC3)) {
                return new t(iC2, iC3);
            }
        }
        return null;
    }

    public t[] c() throws m {
        int i10 = this.f385942d;
        int i11 = this.f385943e;
        int i12 = this.f385945g;
        int i13 = this.f385944f;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = true;
        while (z16) {
            boolean z17 = false;
            boolean zB = true;
            while (true) {
                if ((!zB && z11) || i11 >= this.f385941c) {
                    break;
                }
                zB = b(i12, i13, i11, false);
                if (zB) {
                    i11++;
                    z11 = true;
                    z17 = true;
                } else if (!z11) {
                    i11++;
                }
            }
            if (i11 < this.f385941c) {
                boolean zB2 = true;
                while (true) {
                    if ((!zB2 && z12) || i13 >= this.f385940b) {
                        break;
                    }
                    zB2 = b(i10, i11, i13, true);
                    if (zB2) {
                        i13++;
                        z12 = true;
                        z17 = true;
                    } else if (!z12) {
                        i13++;
                    }
                }
                if (i13 < this.f385940b) {
                    boolean zB3 = true;
                    while (true) {
                        if ((!zB3 && z13) || i10 < 0) {
                            break;
                        }
                        zB3 = b(i12, i13, i10, false);
                        if (zB3) {
                            i10--;
                            z13 = true;
                            z17 = true;
                        } else if (!z13) {
                            i10--;
                        }
                    }
                    if (i10 >= 0) {
                        z16 = z17;
                        boolean zB4 = true;
                        while (true) {
                            if ((!zB4 && z15) || i12 < 0) {
                                break;
                            }
                            zB4 = b(i10, i11, i12, true);
                            if (zB4) {
                                i12--;
                                z16 = true;
                                z15 = true;
                            } else if (!z15) {
                                i12--;
                            }
                        }
                        if (i12 >= 0) {
                            if (z16) {
                                z14 = true;
                            }
                        }
                    }
                }
            }
            z10 = true;
            break;
        }
        if (z10 || !z14) {
            throw m.a();
        }
        int i14 = i11 - i10;
        t tVarD = null;
        t tVarD2 = null;
        for (int i15 = 1; tVarD2 == null && i15 < i14; i15++) {
            tVarD2 = d(i10, i13 - i15, i10 + i15, i13);
        }
        if (tVarD2 == null) {
            throw m.a();
        }
        t tVarD3 = null;
        for (int i16 = 1; tVarD3 == null && i16 < i14; i16++) {
            tVarD3 = d(i10, i12 + i16, i10 + i16, i12);
        }
        if (tVarD3 == null) {
            throw m.a();
        }
        t tVarD4 = null;
        for (int i17 = 1; tVarD4 == null && i17 < i14; i17++) {
            tVarD4 = d(i11, i12 + i17, i11 - i17, i12);
        }
        if (tVarD4 == null) {
            throw m.a();
        }
        for (int i18 = 1; tVarD == null && i18 < i14; i18++) {
            tVarD = d(i11, i13 - i18, i11 - i18, i13);
        }
        if (tVarD != null) {
            return a(tVarD, tVarD2, tVarD4, tVarD3);
        }
        throw m.a();
    }

    public c(com.google.zxing.common.b bVar, int i10, int i11, int i12) throws m {
        this.f385939a = bVar;
        int iH = bVar.h();
        this.f385940b = iH;
        int iL = bVar.l();
        this.f385941c = iL;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.f385942d = i14;
        int i15 = i11 + i13;
        this.f385943e = i15;
        int i16 = i12 - i13;
        this.f385945g = i16;
        int i17 = i12 + i13;
        this.f385944f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= iH || i15 >= iL) {
            throw m.a();
        }
    }
}
