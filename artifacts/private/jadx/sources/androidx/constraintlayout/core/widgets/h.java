package androidx.constraintlayout.core.widgets;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class h extends e {
    public static final int J1 = 0;
    public static final int K1 = 1;
    public static final int L1 = 0;
    public static final int M1 = 1;
    public static final int N1 = 2;
    public static final int O1 = -1;
    protected float B1 = -1.0f;
    protected int C1 = -1;
    protected int D1 = -1;
    protected boolean E1 = true;
    private d F1 = this.R;
    private int G1 = 0;
    private int H1 = 0;
    private boolean I1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44816a;

        static {
            int[] iArr = new int[d.a.values().length];
            f44816a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44816a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44816a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44816a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44816a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int i10 = 6 ^ 6;
                f44816a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44816a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44816a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44816a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.Z.clear();
        this.Z.add(this.F1);
        int length = this.Y.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.Y[i10] = this.F1;
        }
    }

    public void A2(float f10) {
        if (f10 > -1.0f) {
            this.B1 = f10;
            this.C1 = -1;
            this.D1 = -1;
        }
    }

    public void B2(int i10) {
        A2(i10 / 100.0f);
    }

    public void C2(int i10) {
        this.H1 = i10;
    }

    public void D2(int i10) {
        if (this.G1 != i10) {
            this.G1 = i10;
            this.Z.clear();
            if (this.G1 == 1) {
                this.F1 = this.Q;
            } else {
                this.F1 = this.R;
            }
            this.Z.add(this.F1);
            int length = this.Y.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.Y[i11] = this.F1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean G0() {
        return this.I1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean H0() {
        return this.I1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public String f0() {
        return "Guideline";
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void g(androidx.constraintlayout.core.e eVar, boolean z10) {
        f fVar = (f) U();
        if (fVar != null) {
            d dVarR = fVar.r(d.a.LEFT);
            d dVarR2 = fVar.r(d.a.RIGHT);
            e eVar2 = this.f44707c0;
            boolean z11 = true;
            boolean z12 = eVar2 != null && eVar2.f44705b0[0] == e.b.WRAP_CONTENT;
            if (this.G1 == 0) {
                dVarR = fVar.r(d.a.TOP);
                dVarR2 = fVar.r(d.a.BOTTOM);
                e eVar3 = this.f44707c0;
                if (eVar3 == null || eVar3.f44705b0[1] != e.b.WRAP_CONTENT) {
                    z11 = false;
                }
                z12 = z11;
            }
            if (this.I1 && this.F1.o()) {
                androidx.constraintlayout.core.i iVarS = eVar.s(this.F1);
                eVar.f(iVarS, this.F1.f());
                if (this.C1 != -1) {
                    if (z12) {
                        eVar.h(eVar.s(dVarR2), iVarS, 0, 5);
                    }
                } else if (this.D1 != -1 && z12) {
                    androidx.constraintlayout.core.i iVarS2 = eVar.s(dVarR2);
                    eVar.h(iVarS, eVar.s(dVarR), 0, 5);
                    eVar.h(iVarS2, iVarS, 0, 5);
                }
                this.I1 = false;
                return;
            }
            if (this.C1 != -1) {
                androidx.constraintlayout.core.i iVarS3 = eVar.s(this.F1);
                eVar.e(iVarS3, eVar.s(dVarR), this.C1, 8);
                if (z12) {
                    eVar.h(eVar.s(dVarR2), iVarS3, 0, 5);
                }
            } else if (this.D1 != -1) {
                androidx.constraintlayout.core.i iVarS4 = eVar.s(this.F1);
                androidx.constraintlayout.core.i iVarS5 = eVar.s(dVarR2);
                eVar.e(iVarS4, iVarS5, -this.D1, 8);
                if (z12) {
                    eVar.h(iVarS4, eVar.s(dVarR), 0, 5);
                    eVar.h(iVarS5, iVarS4, 0, 5);
                }
            } else if (this.B1 != -1.0f) {
                eVar.d(androidx.constraintlayout.core.e.u(eVar, eVar.s(this.F1), eVar.s(dVarR2), this.B1));
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void k2(androidx.constraintlayout.core.e eVar, boolean z10) {
        if (U() == null) {
            return;
        }
        int iM = eVar.M(this.F1);
        if (this.G1 == 1) {
            g2(iM);
            h2(0);
            z1(U().D());
            d2(0);
            return;
        }
        g2(0);
        h2(iM);
        d2(U().m0());
        z1(0);
    }

    public void l2() {
        if (this.C1 != -1) {
            v2();
        } else if (this.B1 != -1.0f) {
            u2();
        } else if (this.D1 != -1) {
            t2();
        }
    }

    public d m2() {
        return this.F1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void n(e eVar, HashMap<e, e> map) {
        super.n(eVar, map);
        h hVar = (h) eVar;
        this.B1 = hVar.B1;
        this.C1 = hVar.C1;
        this.D1 = hVar.D1;
        this.E1 = hVar.E1;
        D2(hVar.G1);
    }

    public int n2() {
        return this.H1;
    }

    public int o2() {
        return this.G1;
    }

    public int p2() {
        return this.C1;
    }

    public int q2() {
        if (this.B1 != -1.0f) {
            return 0;
        }
        if (this.C1 != -1) {
            return 1;
        }
        return this.D1 != -1 ? 2 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public d r(d.a aVar) {
        int i10 = a.f44816a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.G1 == 1) {
                return this.F1;
            }
        } else if ((i10 == 3 || i10 == 4) && this.G1 == 0) {
            return this.F1;
        }
        return null;
    }

    public int r2() {
        return this.D1;
    }

    public float s2() {
        return this.B1;
    }

    void t2() {
        int iO0 = o0();
        if (this.G1 == 0) {
            iO0 = p0();
        }
        y2(iO0);
    }

    void u2() {
        int iM0 = U().m0() - o0();
        if (this.G1 == 0) {
            iM0 = U().D() - p0();
        }
        z2(iM0);
    }

    void v2() {
        float fO0 = o0() / U().m0();
        if (this.G1 == 0) {
            fO0 = p0() / U().D();
        }
        A2(fO0);
    }

    public boolean w2() {
        return this.B1 != -1.0f && this.C1 == -1 && this.D1 == -1;
    }

    public void x2(int i10) {
        this.F1.A(i10);
        this.I1 = true;
    }

    public void y2(int i10) {
        if (i10 > -1) {
            this.B1 = -1.0f;
            this.C1 = i10;
            this.D1 = -1;
        }
    }

    public void z2(int i10) {
        if (i10 > -1) {
            this.B1 = -1.0f;
            this.C1 = -1;
            this.D1 = i10;
        }
    }
}
