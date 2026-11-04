package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class g extends n {

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f44772p2 = 0;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final int f44773q2 = 1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final int f44774r2 = 2;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final int f44775s2 = 0;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final int f44776t2 = 1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final int f44777u2 = 2;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final int f44778v2 = 3;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final int f44779w2 = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f44780x2 = 1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f44781y2 = 2;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final int f44782z2 = 3;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    private e[] f44796n2;
    private int Q1 = -1;
    private int R1 = -1;
    private int S1 = -1;
    private int T1 = -1;
    private int U1 = -1;
    private int V1 = -1;
    private float W1 = 0.5f;
    private float X1 = 0.5f;
    private float Y1 = 0.5f;
    private float Z1 = 0.5f;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    private float f44783a2 = 0.5f;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private float f44784b2 = 0.5f;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private int f44785c2 = 0;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    private int f44786d2 = 0;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    private int f44787e2 = 2;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    private int f44788f2 = 2;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    private int f44789g2 = 0;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private int f44790h2 = -1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    private int f44791i2 = 0;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    private ArrayList<a> f44792j2 = new ArrayList<>();

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    private e[] f44793k2 = null;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    private e[] f44794l2 = null;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    private int[] f44795m2 = null;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    private int f44797o2 = 0;

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44798a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f44801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f44802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f44803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f44804g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f44805h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f44806i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f44807j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f44808k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f44814q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f44799b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f44800c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f44809l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f44810m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f44811n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f44812o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f44813p = 0;

        a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f44805h = 0;
            this.f44806i = 0;
            this.f44807j = 0;
            this.f44808k = 0;
            this.f44814q = 0;
            this.f44798a = i10;
            this.f44801d = dVar;
            this.f44802e = dVar2;
            this.f44803f = dVar3;
            this.f44804g = dVar4;
            this.f44805h = g.this.t2();
            this.f44806i = g.this.v2();
            this.f44807j = g.this.u2();
            this.f44808k = g.this.s2();
            this.f44814q = i11;
        }

        private void h() {
            this.f44809l = 0;
            this.f44810m = 0;
            this.f44799b = null;
            this.f44800c = 0;
            int i10 = this.f44812o;
            for (int i11 = 0; i11 < i10 && this.f44811n + i11 < g.this.f44797o2; i11++) {
                e eVar = g.this.f44796n2[this.f44811n + i11];
                if (this.f44798a == 0) {
                    int iM0 = eVar.m0();
                    int i12 = g.this.f44785c2;
                    if (eVar.l0() == 8) {
                        i12 = 0;
                    }
                    this.f44809l += iM0 + i12;
                    int iF3 = g.this.f3(eVar, this.f44814q);
                    if (this.f44799b == null || this.f44800c < iF3) {
                        this.f44799b = eVar;
                        this.f44800c = iF3;
                        this.f44810m = iF3;
                    }
                } else {
                    int iG3 = g.this.g3(eVar, this.f44814q);
                    int iF4 = g.this.f3(eVar, this.f44814q);
                    int i13 = g.this.f44786d2;
                    if (eVar.l0() == 8) {
                        i13 = 0;
                    }
                    this.f44810m += iF4 + i13;
                    if (this.f44799b == null || this.f44800c < iG3) {
                        this.f44799b = eVar;
                        this.f44800c = iG3;
                        this.f44809l = iG3;
                    }
                }
            }
        }

        public void b(e eVar) {
            int i10 = 0;
            if (this.f44798a == 0) {
                int iG3 = g.this.g3(eVar, this.f44814q);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    this.f44813p++;
                    iG3 = 0;
                }
                this.f44809l += iG3 + (eVar.l0() != 8 ? g.this.f44785c2 : 0);
                int iF3 = g.this.f3(eVar, this.f44814q);
                if (this.f44799b == null || this.f44800c < iF3) {
                    this.f44799b = eVar;
                    this.f44800c = iF3;
                    this.f44810m = iF3;
                }
            } else {
                int iG4 = g.this.g3(eVar, this.f44814q);
                int iF4 = g.this.f3(eVar, this.f44814q);
                if (eVar.j0() == e.b.MATCH_CONSTRAINT) {
                    this.f44813p++;
                    iF4 = 0;
                }
                int i11 = g.this.f44786d2;
                if (eVar.l0() != 8) {
                    i10 = i11;
                }
                this.f44810m += iF4 + i10;
                if (this.f44799b == null || this.f44800c < iG4) {
                    this.f44799b = eVar;
                    this.f44800c = iG4;
                    this.f44809l = iG4;
                }
            }
            this.f44812o++;
        }

        public void c() {
            this.f44800c = 0;
            this.f44799b = null;
            this.f44809l = 0;
            this.f44810m = 0;
            this.f44811n = 0;
            this.f44812o = 0;
            this.f44813p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            e eVar;
            int i11;
            char c10;
            float f10;
            float f11;
            int i12 = this.f44812o;
            for (int i13 = 0; i13 < i12 && this.f44811n + i13 < g.this.f44797o2; i13++) {
                e eVar2 = g.this.f44796n2[this.f44811n + i13];
                if (eVar2 != null) {
                    eVar2.U0();
                }
            }
            if (i12 == 0 || this.f44799b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = z10 ? (i12 - 1) - i16 : i16;
                if (this.f44811n + i17 >= g.this.f44797o2) {
                    break;
                }
                e eVar3 = g.this.f44796n2[this.f44811n + i17];
                if (eVar3 != null && eVar3.l0() == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            e eVar4 = null;
            if (this.f44798a != 0) {
                e eVar5 = this.f44799b;
                eVar5.C1(g.this.Q1);
                int i18 = this.f44805h;
                if (i10 > 0) {
                    i18 += g.this.f44785c2;
                }
                if (z10) {
                    eVar5.S.a(this.f44803f, i18);
                    if (z11) {
                        eVar5.Q.a(this.f44801d, this.f44807j);
                    }
                    if (i10 > 0) {
                        this.f44803f.f44660d.Q.a(eVar5.S, 0);
                    }
                } else {
                    eVar5.Q.a(this.f44801d, i18);
                    if (z11) {
                        eVar5.S.a(this.f44803f, this.f44807j);
                    }
                    if (i10 > 0) {
                        this.f44801d.f44660d.S.a(eVar5.Q, 0);
                    }
                }
                for (int i19 = 0; i19 < i12 && this.f44811n + i19 < g.this.f44797o2; i19++) {
                    e eVar6 = g.this.f44796n2[this.f44811n + i19];
                    if (eVar6 != null) {
                        if (i19 == 0) {
                            eVar6.l(eVar6.R, this.f44802e, this.f44806i);
                            int i20 = g.this.R1;
                            float f12 = g.this.X1;
                            if (this.f44811n == 0 && g.this.T1 != -1) {
                                i20 = g.this.T1;
                                f12 = g.this.Z1;
                            } else if (z11 && g.this.V1 != -1) {
                                i20 = g.this.V1;
                                f12 = g.this.f44784b2;
                            }
                            eVar6.X1(i20);
                            eVar6.W1(f12);
                        }
                        if (i19 == i12 - 1) {
                            eVar6.l(eVar6.T, this.f44804g, this.f44808k);
                        }
                        if (eVar4 != null) {
                            eVar6.R.a(eVar4.T, g.this.f44786d2);
                            if (i19 == i14) {
                                eVar6.R.B(this.f44806i);
                            }
                            eVar4.T.a(eVar6.R, 0);
                            if (i19 == i15 + 1) {
                                eVar4.T.B(this.f44808k);
                            }
                        }
                        if (eVar6 != eVar5) {
                            if (z10) {
                                int i21 = g.this.f44787e2;
                                if (i21 == 0) {
                                    eVar6.S.a(eVar5.S, 0);
                                } else if (i21 == 1) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i21 == 2) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                    eVar6.S.a(eVar5.S, 0);
                                }
                            } else {
                                int i22 = g.this.f44787e2;
                                if (i22 == 0) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i22 == 1) {
                                    eVar6.S.a(eVar5.S, 0);
                                } else if (i22 == 2) {
                                    if (z12) {
                                        eVar6.Q.a(this.f44801d, this.f44805h);
                                        eVar6.S.a(this.f44803f, this.f44807j);
                                    } else {
                                        eVar6.Q.a(eVar5.Q, 0);
                                        eVar6.S.a(eVar5.S, 0);
                                    }
                                }
                            }
                        }
                        eVar4 = eVar6;
                    }
                }
                return;
            }
            e eVar7 = this.f44799b;
            eVar7.X1(g.this.R1);
            int i23 = this.f44806i;
            if (i10 > 0) {
                i23 += g.this.f44786d2;
            }
            eVar7.R.a(this.f44802e, i23);
            if (z11) {
                eVar7.T.a(this.f44804g, this.f44808k);
            }
            if (i10 > 0) {
                this.f44802e.f44660d.T.a(eVar7.R, 0);
            }
            char c11 = 3;
            if (g.this.f44788f2 != 3 || eVar7.q0()) {
                eVar = eVar7;
                break;
            }
            int i24 = 0;
            while (true) {
                if (i24 < i12) {
                    int i25 = z10 ? (i12 - 1) - i24 : i24;
                    if (this.f44811n + i25 < g.this.f44797o2) {
                        eVar = g.this.f44796n2[this.f44811n + i25];
                        if (eVar.q0()) {
                            break;
                        } else {
                            i24++;
                        }
                    }
                }
                eVar = eVar7;
                break;
            }
            int i26 = 0;
            while (i26 < i12) {
                int i27 = z10 ? (i12 - 1) - i26 : i26;
                if (this.f44811n + i27 >= g.this.f44797o2) {
                    return;
                }
                e eVar8 = g.this.f44796n2[this.f44811n + i27];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                    c10 = c11;
                } else {
                    if (i26 == 0) {
                        i11 = 1;
                        eVar8.l(eVar8.Q, this.f44801d, this.f44805h);
                    } else {
                        i11 = 1;
                    }
                    if (i27 == 0) {
                        int i28 = g.this.Q1;
                        float f13 = g.this.W1;
                        if (z10) {
                            f13 = 1.0f - f13;
                        }
                        if (this.f44811n == 0 && g.this.S1 != -1) {
                            i28 = g.this.S1;
                            if (z10) {
                                f11 = g.this.Y1;
                                f10 = 1.0f - f11;
                            } else {
                                f10 = g.this.Y1;
                            }
                            f13 = f10;
                        } else if (z11 && g.this.U1 != -1) {
                            i28 = g.this.U1;
                            if (z10) {
                                f11 = g.this.f44783a2;
                                f10 = 1.0f - f11;
                            } else {
                                f10 = g.this.f44783a2;
                            }
                            f13 = f10;
                        }
                        eVar8.C1(i28);
                        eVar8.B1(f13);
                    }
                    if (i26 == i12 - 1) {
                        eVar8.l(eVar8.S, this.f44803f, this.f44807j);
                    }
                    if (eVar4 != null) {
                        eVar8.Q.a(eVar4.S, g.this.f44785c2);
                        if (i26 == i14) {
                            eVar8.Q.B(this.f44805h);
                        }
                        eVar4.S.a(eVar8.Q, 0);
                        if (i26 == i15 + 1) {
                            eVar4.S.B(this.f44807j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        c10 = 3;
                        if (g.this.f44788f2 == 3 && eVar.q0() && eVar8 != eVar && eVar8.q0()) {
                            eVar8.U.a(eVar.U, 0);
                        } else {
                            int i29 = g.this.f44788f2;
                            if (i29 == 0) {
                                eVar8.R.a(eVar7.R, 0);
                            } else if (i29 == i11) {
                                eVar8.T.a(eVar7.T, 0);
                            } else if (z12) {
                                eVar8.R.a(this.f44802e, this.f44806i);
                                eVar8.T.a(this.f44804g, this.f44808k);
                            } else {
                                eVar8.R.a(eVar7.R, 0);
                                eVar8.T.a(eVar7.T, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                }
                i26++;
                c11 = c10;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f44798a == 1 ? this.f44810m - g.this.f44786d2 : this.f44810m;
        }

        public int f() {
            return this.f44798a == 0 ? this.f44809l - g.this.f44785c2 : this.f44809l;
        }

        public void g(int i10) {
            int i11 = this.f44813p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f44812o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f44811n + i14 < g.this.f44797o2; i14++) {
                e eVar = g.this.f44796n2[this.f44811n + i14];
                if (this.f44798a == 0) {
                    if (eVar != null && eVar.H() == e.b.MATCH_CONSTRAINT && eVar.f44746w == 0) {
                        g.this.x2(eVar, e.b.FIXED, i13, eVar.j0(), eVar.D());
                    }
                } else if (eVar != null && eVar.j0() == e.b.MATCH_CONSTRAINT && eVar.f44748x == 0) {
                    int i15 = i13;
                    g.this.x2(eVar, eVar.H(), eVar.m0(), e.b.FIXED, i15);
                    i13 = i15;
                }
            }
            h();
        }

        public void i(int i10) {
            this.f44811n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f44798a = i10;
            this.f44801d = dVar;
            this.f44802e = dVar2;
            this.f44803f = dVar3;
            this.f44804g = dVar4;
            this.f44805h = i11;
            this.f44806i = i12;
            this.f44807j = i13;
            this.f44808k = i14;
            this.f44814q = i15;
        }
    }

    private void d3(boolean z10) {
        e eVar;
        float f10;
        int i10;
        if (this.f44795m2 == null || this.f44794l2 == null || this.f44793k2 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f44797o2; i11++) {
            this.f44796n2[i11].U0();
        }
        int[] iArr = this.f44795m2;
        int i12 = iArr[0];
        int i13 = iArr[1];
        float f11 = this.W1;
        e eVar2 = null;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.W1;
            } else {
                f10 = f11;
                i10 = i14;
            }
            e eVar3 = this.f44794l2[i10];
            if (eVar3 != null && eVar3.l0() != 8) {
                if (i14 == 0) {
                    eVar3.l(eVar3.Q, this.Q, t2());
                    eVar3.C1(this.Q1);
                    eVar3.B1(f10);
                }
                if (i14 == i12 - 1) {
                    eVar3.l(eVar3.S, this.S, u2());
                }
                if (i14 > 0 && eVar2 != null) {
                    eVar3.l(eVar3.Q, eVar2.S, this.f44785c2);
                    eVar2.l(eVar2.S, eVar3.Q, 0);
                }
                eVar2 = eVar3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            e eVar4 = this.f44793k2[i15];
            if (eVar4 != null && eVar4.l0() != 8) {
                if (i15 == 0) {
                    eVar4.l(eVar4.R, this.R, v2());
                    eVar4.X1(this.R1);
                    eVar4.W1(this.X1);
                }
                if (i15 == i13 - 1) {
                    eVar4.l(eVar4.T, this.T, s2());
                }
                if (i15 > 0 && eVar2 != null) {
                    eVar4.l(eVar4.R, eVar2.T, this.f44786d2);
                    eVar2.l(eVar2.T, eVar4.R, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.f44791i2 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                e[] eVarArr = this.f44796n2;
                if (i18 < eVarArr.length && (eVar = eVarArr[i18]) != null && eVar.l0() != 8) {
                    e eVar5 = this.f44794l2[i16];
                    e eVar6 = this.f44793k2[i17];
                    if (eVar != eVar5) {
                        eVar.l(eVar.Q, eVar5.Q, 0);
                        eVar.l(eVar.S, eVar5.S, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.l(eVar.R, eVar6.R, 0);
                        eVar.l(eVar.T, eVar6.T, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int f3(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.j0() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f44748x;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.E * i10);
                if (i12 != eVar.D()) {
                    eVar.O1(true);
                    x2(eVar, eVar.H(), eVar.m0(), e.b.FIXED, i12);
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.D();
            }
            if (i11 == 3) {
                return (int) ((eVar2.m0() * eVar2.f44713f0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g3(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.H() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f44746w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.B * i10);
                if (i12 != eVar.m0()) {
                    eVar.O1(true);
                    x2(eVar, e.b.FIXED, i12, eVar.j0(), eVar.D());
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.m0();
            }
            if (i11 == 3) {
                return (int) ((eVar2.D() * eVar2.f44713f0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.m0();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0101  */
    /* JADX WARN: Code duplicated, block: B:106:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x005d A[ADDED_TO_REGION, EDGE_INSN: B:119:0x005d->B:42:0x005d BREAK  A[LOOP:1: B:44:0x0060->B:124:0x0060], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x005d A[ADDED_TO_REGION, EDGE_INSN: B:122:0x005d->B:42:0x005d BREAK  A[LOOP:1: B:44:0x0060->B:124:0x0060], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00d8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0064  */
    /* JADX WARN: Code duplicated, block: B:47:0x006e  */
    /* JADX WARN: Code duplicated, block: B:50:0x007c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0084  */
    /* JADX WARN: Code duplicated, block: B:57:0x008c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0094  */
    /* JADX WARN: Code duplicated, block: B:64:0x009c  */
    /* JADX WARN: Code duplicated, block: B:66:0x009f  */
    /* JADX WARN: Code duplicated, block: B:68:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:99:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0112 -> B:42:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0114 -> B:42:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x011a -> B:42:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x011c -> B:42:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x0062
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void h3(androidx.constraintlayout.core.widgets.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.g.h3(androidx.constraintlayout.core.widgets.e[], int, int, int, int[]):void");
    }

    private void i3(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f44792j2.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i16);
        gVar2.f44792j2.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                e eVar = eVarArr[i18];
                int iG3 = gVar2.g3(eVar, i16);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i16 || (gVar2.f44785c2 + i17) + iG3 > i16) && aVar.f44799b != null;
                if (!z10 && i18 > 0 && (i15 = gVar2.f44790h2) > 0 && i18 % i15 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = gVar2.new a(i11, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i16);
                    aVar.i(i18);
                    gVar2.f44792j2.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += gVar2.f44785c2 + iG3;
                    }
                    aVar.b(eVar);
                    i18++;
                    i13 = i19;
                }
                i17 = iG3;
                aVar.b(eVar);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                e eVar2 = eVarArr[i21];
                int iF3 = gVar2.f3(eVar2, i16);
                if (eVar2.j0() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i16 || (gVar2.f44786d2 + i20) + iF3 > i16) && aVar.f44799b != null;
                if (!z11 && i21 > 0 && (i14 = gVar2.f44790h2) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i11, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i16);
                    gVar = gVar2;
                    aVar.i(i21);
                    gVar.f44792j2.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i21 > 0) {
                        i20 += gVar.f44786d2 + iF3;
                    }
                    aVar.b(eVar2);
                    i21++;
                    i16 = i12;
                    i13 = i22;
                    gVar2 = gVar;
                }
                i20 = iF3;
                aVar.b(eVar2);
                i21++;
                i16 = i12;
                i13 = i22;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f44792j2.size();
        d dVar2 = gVar3.Q;
        d dVar3 = gVar3.R;
        d dVar4 = gVar3.S;
        d dVar5 = gVar3.T;
        int iT2 = gVar3.t2();
        int iV2 = gVar3.v2();
        int iU2 = gVar3.u2();
        int iS2 = gVar3.s2();
        e.b bVarH = gVar3.H();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z12 = bVarH == bVar || gVar3.j0() == bVar;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = gVar3.f44792j2.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int iS3 = iS2;
        int i24 = 0;
        int iU3 = iU2;
        int i25 = iV2;
        int i26 = iT2;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            a aVar3 = gVar3.f44792j2.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    dVar7 = gVar3.f44792j2.get(i28 + 1).f44799b.R;
                    iS3 = 0;
                } else {
                    dVar7 = gVar3.T;
                    iS3 = gVar3.s2();
                }
                d dVar10 = aVar3.f44799b.T;
                int i29 = i27;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iU3, iS3, i12);
                int iMax = Math.max(i24, aVar3.f());
                int iE = aVar3.e() + i29;
                if (i28 > 0) {
                    iE += gVar3.f44786d2;
                }
                i27 = iE;
                i24 = iMax;
                dVar9 = dVar10;
                i25 = 0;
            } else {
                int i30 = i24;
                int i31 = i27;
                if (i28 < size - 1) {
                    dVar = gVar3.f44792j2.get(i28 + 1).f44799b.Q;
                    iU3 = 0;
                } else {
                    dVar = gVar3.S;
                    iU3 = gVar3.u2();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f44799b.S;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iU3, iS3, i12);
                int iF = aVar3.f() + i30;
                int iMax2 = Math.max(i31, aVar3.e());
                if (i28 > 0) {
                    iF += gVar3.f44785c2;
                }
                int i32 = iF;
                i27 = iMax2;
                i24 = i32;
                i26 = 0;
                dVar6 = dVar11;
            }
        }
        iArr[0] = i24;
        iArr[1] = i27;
    }

    private void j3(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f44792j2.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i16);
        gVar2.f44792j2.add(aVar);
        boolean z10 = true;
        if (i11 == 0) {
            int i17 = 0;
            i13 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i10) {
                i17++;
                e eVar = eVarArr[i19];
                int iG3 = gVar2.g3(eVar, i16);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i20 = i13;
                boolean z11 = (i18 == i16 || (gVar2.f44785c2 + i18) + iG3 > i16) && aVar.f44799b != null;
                if (!z11 && i19 > 0 && (i15 = gVar2.f44790h2) > 0 && i17 > i15) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i11, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i16);
                    aVar.i(i19);
                    gVar2.f44792j2.add(aVar);
                    i17 = 1;
                } else {
                    if (i19 > 0) {
                        i18 += gVar2.f44785c2 + iG3;
                    }
                    aVar.b(eVar);
                    i19++;
                    i13 = i20;
                }
                i18 = iG3;
                aVar.b(eVar);
                i19++;
                i13 = i20;
            }
        } else {
            int i21 = 0;
            i13 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i10) {
                i21++;
                e eVar2 = eVarArr[i23];
                int iF3 = gVar2.f3(eVar2, i16);
                if (eVar2.j0() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i24 = i13;
                boolean z12 = (i22 == i16 || (gVar2.f44786d2 + i22) + iF3 > i16) && aVar.f44799b != null;
                if (!z12 && i23 > 0 && (i14 = gVar2.f44790h2) > 0 && i21 > i14) {
                    z12 = true;
                }
                if (z12) {
                    aVar = gVar2.new a(i11, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i16);
                    gVar = gVar2;
                    aVar.i(i23);
                    gVar.f44792j2.add(aVar);
                    i21 = 1;
                } else {
                    gVar = gVar2;
                    if (i23 > 0) {
                        i22 += gVar.f44786d2 + iF3;
                    }
                    aVar.b(eVar2);
                    i23++;
                    i16 = i12;
                    i13 = i24;
                    gVar2 = gVar;
                }
                i22 = iF3;
                aVar.b(eVar2);
                i23++;
                i16 = i12;
                i13 = i24;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f44792j2.size();
        d dVar2 = gVar3.Q;
        d dVar3 = gVar3.R;
        d dVar4 = gVar3.S;
        d dVar5 = gVar3.T;
        int iT2 = gVar3.t2();
        int iV2 = gVar3.v2();
        int iU2 = gVar3.u2();
        int iS2 = gVar3.s2();
        e.b bVarH = gVar3.H();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z13 = bVarH == bVar || gVar3.j0() == bVar;
        if (i13 > 0 && z13) {
            for (int i25 = 0; i25 < size; i25++) {
                a aVar2 = gVar3.f44792j2.get(i25);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar3;
        int iS3 = iS2;
        int i26 = 0;
        int i27 = 0;
        int iU3 = iU2;
        int i28 = iV2;
        int i29 = iT2;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar2;
        int i30 = 0;
        while (i27 < size) {
            a aVar3 = gVar3.f44792j2.get(i27);
            if (i11 == 0) {
                if (i27 < size - 1) {
                    dVar7 = gVar3.f44792j2.get(i27 + 1).f44799b.R;
                    iS3 = 0;
                } else {
                    dVar7 = gVar3.T;
                    iS3 = gVar3.s2();
                }
                d dVar10 = aVar3.f44799b.T;
                int i31 = i26;
                aVar3.j(i11, dVar9, dVar6, dVar8, dVar7, i29, i28, iU3, iS3, i12);
                int iMax = Math.max(i30, aVar3.f());
                int iE = aVar3.e() + i31;
                if (i27 > 0) {
                    iE += gVar3.f44786d2;
                }
                i26 = iE;
                i30 = iMax;
                dVar6 = dVar10;
                i28 = 0;
            } else {
                int i32 = i26;
                int i33 = i30;
                if (i27 < size - 1) {
                    dVar = gVar3.f44792j2.get(i27 + 1).f44799b.Q;
                    iU3 = 0;
                } else {
                    dVar = gVar3.S;
                    iU3 = gVar3.u2();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f44799b.S;
                aVar3.j(i11, dVar9, dVar6, dVar8, dVar7, i29, i28, iU3, iS3, i12);
                int iF = aVar3.f() + i33;
                int iMax2 = Math.max(i32, aVar3.e());
                if (i27 > 0) {
                    iF += gVar3.f44785c2;
                }
                int i34 = iF;
                i26 = iMax2;
                i30 = i34;
                i29 = 0;
                dVar9 = dVar11;
            }
            i27++;
            z10 = z10;
        }
        iArr[0] = i30;
        iArr[z10 ? 1 : 0] = i26;
    }

    private void k3(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f44792j2.size() == 0) {
            aVar = new a(i11, this.Q, this.R, this.S, this.T, i12);
            this.f44792j2.add(aVar);
        } else {
            a aVar2 = this.f44792j2.get(0);
            aVar2.c();
            aVar2.j(i11, this.Q, this.R, this.S, this.T, t2(), v2(), u2(), s2(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(eVarArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A3(float f10) {
        this.X1 = f10;
    }

    public void B3(int i10) {
        this.f44786d2 = i10;
    }

    public void C3(int i10) {
        this.R1 = i10;
    }

    public void D3(int i10) {
        this.f44789g2 = i10;
    }

    public float e3() {
        return this.f44790h2;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void g(androidx.constraintlayout.core.e eVar, boolean z10) {
        super.g(eVar, z10);
        boolean z11 = U() != null && ((f) U()).P2();
        int i10 = this.f44789g2;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f44792j2.size();
                int i11 = 0;
                while (i11 < size) {
                    this.f44792j2.get(i11).d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                d3(z11);
            } else if (i10 == 3) {
                int size2 = this.f44792j2.size();
                int i12 = 0;
                while (i12 < size2) {
                    this.f44792j2.get(i12).d(z11, i12, i12 == size2 + (-1));
                    i12++;
                }
            }
        } else if (this.f44792j2.size() > 0) {
            this.f44792j2.get(0).d(z11, 0, true);
        }
        A2(false);
    }

    public void l3(float f10) {
        this.Y1 = f10;
    }

    public void m3(int i10) {
        this.S1 = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.j, androidx.constraintlayout.core.widgets.e
    public void n(e eVar, HashMap<e, e> map) {
        super.n(eVar, map);
        g gVar = (g) eVar;
        this.Q1 = gVar.Q1;
        this.R1 = gVar.R1;
        this.S1 = gVar.S1;
        this.T1 = gVar.T1;
        this.U1 = gVar.U1;
        this.V1 = gVar.V1;
        this.W1 = gVar.W1;
        this.X1 = gVar.X1;
        this.Y1 = gVar.Y1;
        this.Z1 = gVar.Z1;
        this.f44783a2 = gVar.f44783a2;
        this.f44784b2 = gVar.f44784b2;
        this.f44785c2 = gVar.f44785c2;
        this.f44786d2 = gVar.f44786d2;
        this.f44787e2 = gVar.f44787e2;
        this.f44788f2 = gVar.f44788f2;
        this.f44789g2 = gVar.f44789g2;
        this.f44790h2 = gVar.f44790h2;
        this.f44791i2 = gVar.f44791i2;
    }

    public void n3(float f10) {
        this.Z1 = f10;
    }

    public void o3(int i10) {
        this.T1 = i10;
    }

    public void p3(int i10) {
        this.f44787e2 = i10;
    }

    public void q3(float f10) {
        this.W1 = f10;
    }

    public void r3(int i10) {
        this.f44785c2 = i10;
    }

    public void s3(int i10) {
        this.Q1 = i10;
    }

    public void t3(float f10) {
        this.f44783a2 = f10;
    }

    public void u3(int i10) {
        this.U1 = i10;
    }

    public void v3(float f10) {
        this.f44784b2 = f10;
    }

    @Override // androidx.constraintlayout.core.widgets.n
    public void w2(int i10, int i11, int i12, int i13) {
        int i14;
        e[] eVarArr;
        if (this.C1 > 0 && !y2()) {
            B2(0, 0);
            A2(false);
            return;
        }
        int iT2 = t2();
        int iU2 = u2();
        int iV2 = v2();
        int iS2 = s2();
        int[] iArr = new int[2];
        int i15 = (i11 - iT2) - iU2;
        int i16 = this.f44791i2;
        if (i16 == 1) {
            i15 = (i13 - iV2) - iS2;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.Q1 == -1) {
                this.Q1 = 0;
            }
            if (this.R1 == -1) {
                this.R1 = 0;
            }
        } else {
            if (this.Q1 == -1) {
                this.Q1 = 0;
            }
            if (this.R1 == -1) {
                this.R1 = 0;
            }
        }
        e[] eVarArr2 = this.B1;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.C1;
            if (i18 >= i14) {
                break;
            }
            if (this.B1[i18].l0() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            e[] eVarArr3 = new e[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.C1) {
                e eVar = this.B1[i20];
                e[] eVarArr4 = eVarArr3;
                if (eVar.l0() != 8) {
                    eVarArr4[i14] = eVar;
                    i14++;
                }
                i20++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i21 = i14;
        this.f44796n2 = eVarArr;
        this.f44797o2 = i21;
        int i22 = this.f44789g2;
        if (i22 == 0) {
            k3(eVarArr, i21, this.f44791i2, i17, iArr);
        } else if (i22 == 1) {
            i3(eVarArr, i21, this.f44791i2, i17, iArr);
        } else if (i22 == 2) {
            h3(eVarArr, i21, this.f44791i2, i17, iArr);
        } else if (i22 == 3) {
            j3(eVarArr, i21, this.f44791i2, i17, iArr);
        }
        int iMin = iArr[0] + iT2 + iU2;
        int iMin2 = iArr[1] + iV2 + iS2;
        if (i10 == 1073741824) {
            iMin = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i11);
        } else if (i10 != 0) {
            iMin = 0;
        }
        if (i12 == 1073741824) {
            iMin2 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i13);
        } else if (i12 != 0) {
            iMin2 = 0;
        }
        B2(iMin, iMin2);
        d2(iMin);
        z1(iMin2);
        A2(this.C1 > 0);
    }

    public void w3(int i10) {
        this.V1 = i10;
    }

    public void x3(int i10) {
        this.f44790h2 = i10;
    }

    public void y3(int i10) {
        this.f44791i2 = i10;
    }

    public void z3(int i10) {
        this.f44788f2 = i10;
    }
}
