package androidx.constraintlayout.core.widgets;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class a extends j {
    public static final int H1 = 0;
    public static final int I1 = 1;
    public static final int J1 = 2;
    public static final int K1 = 3;
    private static final boolean L1 = true;
    private static final boolean M1 = false;
    private int D1 = 0;
    private boolean E1 = true;
    private int F1 = 0;
    boolean G1 = false;

    public a() {
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean G0() {
        return this.G1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean H0() {
        return this.G1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void g(androidx.constraintlayout.core.e eVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.Y;
        dVarArr2[0] = this.Q;
        dVarArr2[2] = this.R;
        dVarArr2[1] = this.S;
        dVarArr2[3] = this.T;
        int i13 = 0;
        while (true) {
            dVarArr = this.Y;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar = dVarArr[i13];
            dVar.f44665i = eVar.s(dVar);
            i13++;
        }
        int i14 = this.D1;
        if (i14 >= 0 && i14 < 4) {
            d dVar2 = dVarArr[i14];
            if (!this.G1) {
                n2();
            }
            if (this.G1) {
                this.G1 = false;
                int i15 = this.D1;
                if (i15 == 0 || i15 == 1) {
                    eVar.f(this.Q.f44665i, this.f44717h0);
                    eVar.f(this.S.f44665i, this.f44717h0);
                } else if (i15 == 2 || i15 == 3) {
                    eVar.f(this.R.f44665i, this.f44719i0);
                    eVar.f(this.T.f44665i, this.f44719i0);
                }
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 >= this.C1) {
                        z11 = false;
                        break;
                    }
                    e eVar2 = this.B1[i16];
                    if ((this.E1 || eVar2.h()) && ((((i11 = this.D1) == 0 || i11 == 1) && eVar2.H() == e.b.MATCH_CONSTRAINT && eVar2.Q.f44662f != null && eVar2.S.f44662f != null) || (((i12 = this.D1) == 2 || i12 == 3) && eVar2.j0() == e.b.MATCH_CONSTRAINT && eVar2.R.f44662f != null && eVar2.T.f44662f != null))) {
                        z11 = true;
                        break;
                    }
                    i16++;
                }
                boolean z12 = this.Q.m() || this.S.m();
                boolean z13 = this.R.m() || this.T.m();
                int i17 = !(!z11 && (((i10 = this.D1) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
                for (int i18 = 0; i18 < this.C1; i18++) {
                    e eVar3 = this.B1[i18];
                    if (this.E1 || eVar3.h()) {
                        androidx.constraintlayout.core.i iVarS = eVar.s(eVar3.Y[this.D1]);
                        d[] dVarArr3 = eVar3.Y;
                        int i19 = this.D1;
                        d dVar3 = dVarArr3[i19];
                        dVar3.f44665i = iVarS;
                        d dVar4 = dVar3.f44662f;
                        int i20 = (dVar4 == null || dVar4.f44660d != this) ? 0 : dVar3.f44663g;
                        if (i19 == 0 || i19 == 2) {
                            eVar.i(dVar2.f44665i, iVarS, this.F1 - i20, z11);
                        } else {
                            eVar.g(dVar2.f44665i, iVarS, this.F1 + i20, z11);
                        }
                        eVar.e(dVar2.f44665i, iVarS, this.F1 + i20, i17);
                    }
                }
                int i21 = this.D1;
                if (i21 == 0) {
                    eVar.e(this.S.f44665i, this.Q.f44665i, 0, 8);
                    eVar.e(this.Q.f44665i, this.f44707c0.S.f44665i, 0, 4);
                    eVar.e(this.Q.f44665i, this.f44707c0.Q.f44665i, 0, 0);
                } else if (i21 == 1) {
                    eVar.e(this.Q.f44665i, this.S.f44665i, 0, 8);
                    eVar.e(this.Q.f44665i, this.f44707c0.Q.f44665i, 0, 4);
                    eVar.e(this.Q.f44665i, this.f44707c0.S.f44665i, 0, 0);
                } else if (i21 == 2) {
                    eVar.e(this.T.f44665i, this.R.f44665i, 0, 8);
                    eVar.e(this.R.f44665i, this.f44707c0.T.f44665i, 0, 4);
                    eVar.e(this.R.f44665i, this.f44707c0.R.f44665i, 0, 0);
                } else if (i21 == 3) {
                    eVar.e(this.R.f44665i, this.T.f44665i, 0, 8);
                    eVar.e(this.R.f44665i, this.f44707c0.R.f44665i, 0, 4);
                    eVar.e(this.R.f44665i, this.f44707c0.T.f44665i, 0, 0);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.j, androidx.constraintlayout.core.widgets.e
    public void n(e eVar, HashMap<e, e> map) {
        super.n(eVar, map);
        a aVar = (a) eVar;
        this.D1 = aVar.D1;
        this.E1 = aVar.E1;
        this.F1 = aVar.F1;
    }

    public boolean n2() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.C1;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.B1[i13];
            if ((this.E1 || eVar.h()) && ((((i11 = this.D1) == 0 || i11 == 1) && !eVar.G0()) || (((i12 = this.D1) == 2 || i12 == 3) && !eVar.H0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.C1; i14++) {
            e eVar2 = this.B1[i14];
            if (this.E1 || eVar2.h()) {
                if (!z11) {
                    int i15 = this.D1;
                    if (i15 == 0) {
                        iMax = eVar2.r(d.a.LEFT).f();
                    } else if (i15 == 1) {
                        iMax = eVar2.r(d.a.RIGHT).f();
                    } else if (i15 == 2) {
                        iMax = eVar2.r(d.a.TOP).f();
                    } else if (i15 == 3) {
                        iMax = eVar2.r(d.a.BOTTOM).f();
                    }
                    z11 = true;
                }
                int i16 = this.D1;
                if (i16 == 0) {
                    iMax = Math.min(iMax, eVar2.r(d.a.LEFT).f());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, eVar2.r(d.a.RIGHT).f());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, eVar2.r(d.a.TOP).f());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, eVar2.r(d.a.BOTTOM).f());
                }
            }
        }
        int i17 = iMax + this.F1;
        int i18 = this.D1;
        if (i18 == 0 || i18 == 1) {
            r1(i17, i17);
        } else {
            u1(i17, i17);
        }
        this.G1 = true;
        return true;
    }

    @Deprecated
    public boolean o2() {
        return this.E1;
    }

    public boolean p2() {
        return this.E1;
    }

    public int q2() {
        return this.D1;
    }

    public int r2() {
        return this.F1;
    }

    public int s2() {
        int i10 = this.D1;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    protected void t2() {
        for (int i10 = 0; i10 < this.C1; i10++) {
            e eVar = this.B1[i10];
            if (this.E1 || eVar.h()) {
                int i11 = this.D1;
                if (i11 == 0 || i11 == 1) {
                    eVar.H1(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.H1(1, true);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public String toString() {
        String str = "[Barrier] " + y() + " {";
        for (int i10 = 0; i10 < this.C1; i10++) {
            e eVar = this.B1[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.y();
        }
        return str + "}";
    }

    public void u2(boolean z10) {
        this.E1 = z10;
    }

    public void v2(int i10) {
        this.D1 = i10;
    }

    public void w2(int i10) {
        this.F1 = i10;
    }

    public a(String str) {
        k1(str);
    }
}
