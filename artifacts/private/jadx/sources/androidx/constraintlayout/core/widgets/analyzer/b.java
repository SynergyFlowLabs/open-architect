package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f44514d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f44515e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f44516f = 30;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f44517g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f44518h = 1073741824;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f44519i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f44520j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f44521k = -2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f44522l = -3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<androidx.constraintlayout.core.widgets.e> f44523a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f44524b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.f f44525c;

    public static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f44526k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f44527l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static int f44528m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.e.b f44529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.e.b f44530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f44531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f44532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f44533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f44534f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f44535g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f44536h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f44537i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f44538j;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.b$b, reason: collision with other inner class name */
    public interface InterfaceC0360b {
        void a();

        void b(androidx.constraintlayout.core.widgets.e eVar, a aVar);
    }

    public b(androidx.constraintlayout.core.widgets.f fVar) {
        this.f44525c = fVar;
    }

    private boolean a(InterfaceC0360b interfaceC0360b, androidx.constraintlayout.core.widgets.e eVar, int i10) {
        this.f44524b.f44529a = eVar.H();
        this.f44524b.f44530b = eVar.j0();
        this.f44524b.f44531c = eVar.m0();
        this.f44524b.f44532d = eVar.D();
        a aVar = this.f44524b;
        aVar.f44537i = false;
        aVar.f44538j = i10;
        androidx.constraintlayout.core.widgets.e.b bVar = aVar.f44529a;
        androidx.constraintlayout.core.widgets.e.b bVar2 = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f44530b == bVar2;
        boolean z12 = z10 && eVar.f44713f0 > 0.0f;
        boolean z13 = z11 && eVar.f44713f0 > 0.0f;
        if (z12 && eVar.f44750y[0] == 4) {
            aVar.f44529a = androidx.constraintlayout.core.widgets.e.b.FIXED;
        }
        if (z13 && eVar.f44750y[1] == 4) {
            aVar.f44530b = androidx.constraintlayout.core.widgets.e.b.FIXED;
        }
        interfaceC0360b.b(eVar, aVar);
        eVar.d2(this.f44524b.f44533e);
        eVar.z1(this.f44524b.f44534f);
        eVar.y1(this.f44524b.f44536h);
        eVar.h1(this.f44524b.f44535g);
        a aVar2 = this.f44524b;
        aVar2.f44538j = a.f44526k;
        return aVar2.f44537i;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00af A[PHI: r10
      0x00af: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:35:0x0073, B:37:0x0079, B:39:0x007d, B:59:0x00ac, B:57:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    private void b(androidx.constraintlayout.core.widgets.f fVar) {
        boolean z10;
        l lVar;
        n nVar;
        int size = fVar.B1.size();
        boolean zT2 = fVar.T2(64);
        InterfaceC0360b interfaceC0360bH2 = fVar.H2();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.constraintlayout.core.widgets.e eVar = fVar.B1.get(i10);
            if (!(eVar instanceof androidx.constraintlayout.core.widgets.h) && !(eVar instanceof androidx.constraintlayout.core.widgets.a) && !eVar.E0() && (!zT2 || (lVar = eVar.f44710e) == null || (nVar = eVar.f44712f) == null || !lVar.f44619e.f44561j || !nVar.f44619e.f44561j)) {
                androidx.constraintlayout.core.widgets.e.b bVarZ = eVar.z(0);
                androidx.constraintlayout.core.widgets.e.b bVarZ2 = eVar.z(1);
                androidx.constraintlayout.core.widgets.e.b bVar = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
                boolean z11 = bVarZ == bVar && eVar.f44746w != 1 && bVarZ2 == bVar && eVar.f44748x != 1;
                if (!z11 && fVar.T2(1) && !(eVar instanceof androidx.constraintlayout.core.widgets.n)) {
                    if (bVarZ == bVar && eVar.f44746w == 0 && bVarZ2 != bVar && !eVar.B0()) {
                        z11 = true;
                    }
                    if (bVarZ2 == bVar && eVar.f44748x == 0 && bVarZ != bVar && !eVar.B0()) {
                        z11 = true;
                    }
                    z10 = (!(bVarZ == bVar || bVarZ2 == bVar) || eVar.f44713f0 <= 0.0f) ? z11 : true;
                }
                if (!z10) {
                    a(interfaceC0360bH2, eVar, a.f44526k);
                    androidx.constraintlayout.core.f fVar2 = fVar.H1;
                    if (fVar2 != null) {
                        fVar2.f43377c++;
                    }
                }
            }
        }
        interfaceC0360bH2.a();
    }

    private void c(androidx.constraintlayout.core.widgets.f fVar, String str, int i10, int i11, int i12) {
        long jNanoTime = fVar.H1 != null ? System.nanoTime() : 0L;
        int iQ = fVar.Q();
        int iP = fVar.P();
        fVar.Q1(0);
        fVar.P1(0);
        fVar.d2(i11);
        fVar.z1(i12);
        fVar.Q1(iQ);
        fVar.P1(iP);
        this.f44525c.Y2(i10);
        this.f44525c.o2();
        if (fVar.H1 != null) {
            long jNanoTime2 = System.nanoTime();
            androidx.constraintlayout.core.f fVar2 = fVar.H1;
            fVar2.R++;
            fVar2.f43376b += jNanoTime2 - jNanoTime;
        }
    }

    public long d(androidx.constraintlayout.core.widgets.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        long j10;
        boolean zE2;
        int i19;
        int i20;
        int i21;
        long j11;
        int i22;
        boolean z10;
        androidx.constraintlayout.core.f fVar2;
        b bVar = this;
        androidx.constraintlayout.core.widgets.f fVar3 = fVar;
        InterfaceC0360b interfaceC0360bH2 = fVar3.H2();
        int size = fVar3.B1.size();
        int iM0 = fVar3.m0();
        int iD = fVar3.D();
        boolean zB = androidx.constraintlayout.core.widgets.k.b(i10, 128);
        boolean z11 = zB || androidx.constraintlayout.core.widgets.k.b(i10, 64);
        if (z11) {
            for (int i23 = 0; i23 < size; i23++) {
                androidx.constraintlayout.core.widgets.e eVar = fVar3.B1.get(i23);
                androidx.constraintlayout.core.widgets.e.b bVarH = eVar.H();
                androidx.constraintlayout.core.widgets.e.b bVar2 = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
                boolean z12 = (bVarH == bVar2) && (eVar.j0() == bVar2) && eVar.A() > 0.0f;
                if ((eVar.B0() && z12) || ((eVar.D0() && z12) || (eVar instanceof androidx.constraintlayout.core.widgets.n) || eVar.B0() || eVar.D0())) {
                    z11 = false;
                    break;
                }
            }
        }
        if (z11 && (fVar2 = androidx.constraintlayout.core.e.C) != null) {
            fVar2.f43379e++;
        }
        boolean z13 = z11 & ((i13 == 1073741824 && i15 == 1073741824) || zB);
        int i24 = 2;
        if (z13) {
            j10 = 1;
            int iMin = Math.min(fVar3.O(), i14);
            int iMin2 = Math.min(fVar3.N(), i16);
            if (i13 == 1073741824 && fVar3.m0() != iMin) {
                fVar3.d2(iMin);
                fVar3.M2();
            }
            if (i15 == 1073741824 && fVar3.D() != iMin2) {
                fVar3.z1(iMin2);
                fVar3.M2();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zE2 = fVar3.C2(zB);
                i19 = 2;
            } else {
                boolean zD2 = fVar3.D2(zB);
                if (i13 == 1073741824) {
                    zD2 &= fVar3.E2(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zE2 = fVar3.E2(zB, 1) & zD2;
                    i19++;
                } else {
                    zE2 = zD2;
                }
            }
            if (zE2) {
                fVar3.j2(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            j10 = 1;
            zE2 = false;
            i19 = 0;
        }
        long jNanoTime = 0;
        if (!zE2 || i19 != 2) {
            int iI2 = fVar3.I2();
            if (size > 0) {
                b(fVar);
            }
            jNanoTime = fVar3.H1 != null ? System.nanoTime() : 0L;
            e(fVar);
            int size2 = bVar.f44523a.size();
            if (size > 0) {
                bVar.c(fVar3, "First pass", 0, iM0, iD);
                i20 = iM0;
                i21 = iD;
            } else {
                i20 = iM0;
                i21 = iD;
            }
            if (size2 > 0) {
                androidx.constraintlayout.core.widgets.e.b bVarH2 = fVar3.H();
                androidx.constraintlayout.core.widgets.e.b bVar3 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
                boolean z14 = bVarH2 == bVar3;
                boolean z15 = fVar3.j0() == bVar3;
                int iMax = Math.max(fVar3.m0(), bVar.f44525c.Q());
                int iMax2 = Math.max(fVar3.D(), bVar.f44525c.P());
                int i25 = 0;
                boolean zZ2 = false;
                while (i25 < size2) {
                    androidx.constraintlayout.core.widgets.e eVar2 = bVar.f44523a.get(i25);
                    boolean z16 = z13;
                    if (eVar2 instanceof androidx.constraintlayout.core.widgets.n) {
                        int iM1 = eVar2.m0();
                        int iD2 = eVar2.D();
                        boolean zA = zZ2 | bVar.a(interfaceC0360bH2, eVar2, a.f44527l);
                        androidx.constraintlayout.core.f fVar4 = fVar3.H1;
                        if (fVar4 != null) {
                            fVar4.f43378d += j10;
                        }
                        int iM2 = eVar2.m0();
                        int iD3 = eVar2.D();
                        if (iM2 != iM1) {
                            eVar2.d2(iM2);
                            if (z14 && eVar2.X() > iMax) {
                                iMax = Math.max(iMax, eVar2.X() + eVar2.r(androidx.constraintlayout.core.widgets.d.a.RIGHT).g());
                            }
                            z10 = true;
                        } else {
                            z10 = zA;
                        }
                        if (iD3 != iD2) {
                            eVar2.z1(iD3);
                            if (z15 && eVar2.v() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar2.v() + eVar2.r(androidx.constraintlayout.core.widgets.d.a.BOTTOM).g());
                            }
                            z10 = true;
                        }
                        zZ2 = z10 | ((androidx.constraintlayout.core.widgets.n) eVar2).z2();
                    }
                    i25++;
                    i20 = i20;
                    i21 = i21;
                    z13 = z16;
                    jNanoTime = jNanoTime;
                    i24 = 2;
                }
                boolean z17 = z13;
                j11 = jNanoTime;
                int i26 = i20;
                int i27 = i21;
                int i28 = i24;
                int i29 = 0;
                while (i29 < i28) {
                    int i30 = 0;
                    while (i30 < size2) {
                        androidx.constraintlayout.core.widgets.e eVar3 = bVar.f44523a.get(i30);
                        if (((eVar3 instanceof androidx.constraintlayout.core.widgets.i) && !(eVar3 instanceof androidx.constraintlayout.core.widgets.n)) || (eVar3 instanceof androidx.constraintlayout.core.widgets.h) || eVar3.l0() == 8 || ((z17 && eVar3.f44710e.f44619e.f44561j && eVar3.f44712f.f44619e.f44561j) || (eVar3 instanceof androidx.constraintlayout.core.widgets.n))) {
                            i22 = i29;
                        } else {
                            int iM3 = eVar3.m0();
                            int iD4 = eVar3.D();
                            int iT = eVar3.t();
                            int i31 = a.f44527l;
                            if (i29 == 1) {
                                i31 = a.f44528m;
                            }
                            boolean zA2 = zZ2 | bVar.a(interfaceC0360bH2, eVar3, i31);
                            androidx.constraintlayout.core.f fVar5 = fVar3.H1;
                            i22 = i29;
                            if (fVar5 != null) {
                                fVar5.f43378d += j10;
                            }
                            int iM4 = eVar3.m0();
                            int iD5 = eVar3.D();
                            if (iM4 != iM3) {
                                eVar3.d2(iM4);
                                if (z14 && eVar3.X() > iMax) {
                                    iMax = Math.max(iMax, eVar3.X() + eVar3.r(androidx.constraintlayout.core.widgets.d.a.RIGHT).g());
                                }
                                zA2 = true;
                            }
                            if (iD5 != iD4) {
                                eVar3.z1(iD5);
                                if (z15 && eVar3.v() > iMax2) {
                                    iMax2 = Math.max(iMax2, eVar3.v() + eVar3.r(androidx.constraintlayout.core.widgets.d.a.BOTTOM).g());
                                }
                                zA2 = true;
                            }
                            zZ2 = (!eVar3.q0() || iT == eVar3.t()) ? zA2 : true;
                        }
                        i30++;
                        bVar = this;
                        fVar3 = fVar;
                        i29 = i22;
                    }
                    int i32 = i29;
                    if (!zZ2) {
                        fVar3 = fVar;
                        break;
                    }
                    i29 = i32 + 1;
                    c(fVar, "intermediate pass", i29, i26, i27);
                    bVar = this;
                    fVar3 = fVar;
                    i28 = 2;
                    zZ2 = false;
                }
            } else {
                j11 = jNanoTime;
            }
            fVar3.W2(iI2);
            jNanoTime = j11;
        }
        return fVar3.H1 != null ? System.nanoTime() - jNanoTime : jNanoTime;
    }

    public void e(androidx.constraintlayout.core.widgets.f fVar) {
        this.f44523a.clear();
        int size = fVar.B1.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.constraintlayout.core.widgets.e eVar = fVar.B1.get(i10);
            androidx.constraintlayout.core.widgets.e.b bVarH = eVar.H();
            androidx.constraintlayout.core.widgets.e.b bVar = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
            if (bVarH == bVar || eVar.j0() == bVar) {
                this.f44523a.add(eVar);
            }
        }
        fVar.M2();
    }
}
