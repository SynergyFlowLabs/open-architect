package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f44574a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f44575b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f44577d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b.a f44576c = new b.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f44578e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f44579f = 0;

    private static boolean a(int i10, androidx.constraintlayout.core.widgets.e eVar) {
        androidx.constraintlayout.core.widgets.e.b bVar;
        androidx.constraintlayout.core.widgets.e.b bVar2;
        androidx.constraintlayout.core.widgets.e.b bVarH = eVar.H();
        androidx.constraintlayout.core.widgets.e.b bVarJ0 = eVar.j0();
        androidx.constraintlayout.core.widgets.f fVar = eVar.U() != null ? (androidx.constraintlayout.core.widgets.f) eVar.U() : null;
        if (fVar != null) {
            fVar.H();
            androidx.constraintlayout.core.widgets.e.b bVar3 = androidx.constraintlayout.core.widgets.e.b.FIXED;
        }
        if (fVar != null) {
            fVar.j0();
            androidx.constraintlayout.core.widgets.e.b bVar4 = androidx.constraintlayout.core.widgets.e.b.FIXED;
        }
        androidx.constraintlayout.core.widgets.e.b bVar5 = androidx.constraintlayout.core.widgets.e.b.FIXED;
        boolean z10 = bVarH == bVar5 || eVar.G0() || bVarH == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT || (bVarH == (bVar2 = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) && eVar.f44746w == 0 && eVar.f44713f0 == 0.0f && eVar.r0(0)) || (bVarH == bVar2 && eVar.f44746w == 1 && eVar.u0(0, eVar.m0()));
        boolean z11 = bVarJ0 == bVar5 || eVar.H0() || bVarJ0 == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT || (bVarJ0 == (bVar = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) && eVar.f44748x == 0 && eVar.f44713f0 == 0.0f && eVar.r0(1)) || (bVarJ0 == bVar && eVar.f44748x == 1 && eVar.u0(1, eVar.D()));
        if (eVar.f44713f0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    private static void b(int i10, androidx.constraintlayout.core.widgets.e eVar, b.InterfaceC0360b interfaceC0360b, boolean z10) {
        androidx.constraintlayout.core.widgets.d dVar;
        androidx.constraintlayout.core.widgets.d dVar2;
        androidx.constraintlayout.core.widgets.d dVar3;
        androidx.constraintlayout.core.widgets.d dVar4;
        if (eVar.z0()) {
            return;
        }
        boolean z11 = true;
        f44578e++;
        if (!(eVar instanceof androidx.constraintlayout.core.widgets.f) && eVar.F0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                androidx.constraintlayout.core.widgets.f.S2(i11, eVar, interfaceC0360b, new b.a(), b.a.f44526k);
            }
        }
        androidx.constraintlayout.core.widgets.d dVarR = eVar.r(androidx.constraintlayout.core.widgets.d.a.LEFT);
        androidx.constraintlayout.core.widgets.d dVarR2 = eVar.r(androidx.constraintlayout.core.widgets.d.a.RIGHT);
        int iF = dVarR.f();
        int iF2 = dVarR2.f();
        if (dVarR.e() != null && dVarR.o()) {
            Iterator<androidx.constraintlayout.core.widgets.d> it = dVarR.e().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.d next = it.next();
                androidx.constraintlayout.core.widgets.e eVar2 = next.f44660d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.F0() && zA) {
                    androidx.constraintlayout.core.widgets.f.S2(i12, eVar2, interfaceC0360b, new b.a(), b.a.f44526k);
                }
                boolean z12 = ((next == eVar2.Q && (dVar4 = eVar2.S.f44662f) != null && dVar4.o()) || (next == eVar2.S && (dVar3 = eVar2.Q.f44662f) != null && dVar3.o())) ? z11 : false;
                androidx.constraintlayout.core.widgets.e.b bVarH = eVar2.H();
                androidx.constraintlayout.core.widgets.e.b bVar = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
                if (bVarH != bVar || zA) {
                    if (!eVar2.F0()) {
                        androidx.constraintlayout.core.widgets.d dVar5 = eVar2.Q;
                        if (next == dVar5 && eVar2.S.f44662f == null) {
                            int iG = dVar5.g() + iF;
                            eVar2.r1(iG, eVar2.m0() + iG);
                            b(i12, eVar2, interfaceC0360b, z10);
                        } else {
                            androidx.constraintlayout.core.widgets.d dVar6 = eVar2.S;
                            if (next == dVar6 && dVar5.f44662f == null) {
                                int iG2 = iF - dVar6.g();
                                eVar2.r1(iG2 - eVar2.m0(), iG2);
                                b(i12, eVar2, interfaceC0360b, z10);
                            } else if (z12 && !eVar2.B0()) {
                                f(i12, interfaceC0360b, eVar2, z10);
                            }
                        }
                    }
                } else if (eVar2.H() == bVar && eVar2.A >= 0 && eVar2.f44752z >= 0 && ((eVar2.l0() == 8 || (eVar2.f44746w == 0 && eVar2.A() == 0.0f)) && !eVar2.B0() && !eVar2.E0() && z12 && !eVar2.B0())) {
                    g(i12, eVar, interfaceC0360b, eVar2, z10);
                }
                z11 = z11;
            }
        }
        boolean z13 = z11;
        if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
            return;
        }
        if (dVarR2.e() != null && dVarR2.o()) {
            Iterator<androidx.constraintlayout.core.widgets.d> it2 = dVarR2.e().iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.d next2 = it2.next();
                androidx.constraintlayout.core.widgets.e eVar3 = next2.f44660d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.F0() && zA2) {
                    androidx.constraintlayout.core.widgets.f.S2(i13, eVar3, interfaceC0360b, new b.a(), b.a.f44526k);
                }
                boolean z14 = ((next2 == eVar3.Q && (dVar2 = eVar3.S.f44662f) != null && dVar2.o()) || (next2 == eVar3.S && (dVar = eVar3.Q.f44662f) != null && dVar.o())) ? z13 : false;
                androidx.constraintlayout.core.widgets.e.b bVarH2 = eVar3.H();
                androidx.constraintlayout.core.widgets.e.b bVar2 = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
                if (bVarH2 != bVar2 || zA2) {
                    if (!eVar3.F0()) {
                        androidx.constraintlayout.core.widgets.d dVar7 = eVar3.Q;
                        if (next2 == dVar7 && eVar3.S.f44662f == null) {
                            int iG3 = dVar7.g() + iF2;
                            eVar3.r1(iG3, eVar3.m0() + iG3);
                            b(i13, eVar3, interfaceC0360b, z10);
                        } else {
                            androidx.constraintlayout.core.widgets.d dVar8 = eVar3.S;
                            if (next2 == dVar8 && dVar7.f44662f == null) {
                                int iG4 = iF2 - dVar8.g();
                                eVar3.r1(iG4 - eVar3.m0(), iG4);
                                b(i13, eVar3, interfaceC0360b, z10);
                            } else if (z14 && !eVar3.B0()) {
                                f(i13, interfaceC0360b, eVar3, z10);
                            }
                        }
                    }
                } else if (eVar3.H() == bVar2 && eVar3.A >= 0 && eVar3.f44752z >= 0 && (eVar3.l0() == 8 || (eVar3.f44746w == 0 && eVar3.A() == 0.0f))) {
                    if (!eVar3.B0() && !eVar3.E0() && z14 && !eVar3.B0()) {
                        g(i13, eVar, interfaceC0360b, eVar3, z10);
                    }
                }
            }
        }
        eVar.N0();
    }

    public static String c(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("+-(" + i10 + ") ");
        return sb2.toString();
    }

    private static void d(int i10, androidx.constraintlayout.core.widgets.a aVar, b.InterfaceC0360b interfaceC0360b, int i11, boolean z10) {
        if (aVar.n2()) {
            if (i11 == 0) {
                b(i10 + 1, aVar, interfaceC0360b, z10);
                return;
            }
            k(i10 + 1, aVar, interfaceC0360b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x01f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:115:0x0217  */
    /* JADX WARN: Code duplicated, block: B:117:0x0238 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x023b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x012e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:81:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:85:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0166  */
    /* JADX WARN: Code duplicated, block: B:90:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0170  */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    /* JADX WARN: Code duplicated, block: B:94:0x018a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0195  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ab  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    public static boolean e(androidx.constraintlayout.core.widgets.f fVar, androidx.constraintlayout.core.e eVar, int i10, int i11, androidx.constraintlayout.core.widgets.c cVar, boolean z10, boolean z11, boolean z12) {
        int i12;
        int iG;
        boolean z13;
        androidx.constraintlayout.core.widgets.e eVar2;
        ?? r10;
        int iG2;
        int iD;
        androidx.constraintlayout.core.widgets.d dVar;
        androidx.constraintlayout.core.widgets.e eVar3;
        androidx.constraintlayout.core.widgets.d dVar2;
        float fG0;
        int i13;
        if (z12) {
            return false;
        }
        if (i10 == 0) {
            if (!fVar.G0()) {
                return false;
            }
        } else if (!fVar.H0()) {
            return false;
        }
        boolean zP2 = fVar.P2();
        androidx.constraintlayout.core.widgets.e eVarC = cVar.c();
        androidx.constraintlayout.core.widgets.e eVarG = cVar.g();
        androidx.constraintlayout.core.widgets.e eVarE = cVar.e();
        androidx.constraintlayout.core.widgets.e eVarI = cVar.i();
        androidx.constraintlayout.core.widgets.e eVarF = cVar.f();
        androidx.constraintlayout.core.widgets.d dVar3 = eVarC.Y[i11];
        int i14 = i11 + 1;
        androidx.constraintlayout.core.widgets.d dVar4 = eVarG.Y[i14];
        androidx.constraintlayout.core.widgets.d dVar5 = dVar3.f44662f;
        if (dVar5 == null || dVar4.f44662f == null) {
            return false;
        }
        if (!dVar5.o() || !dVar4.f44662f.o()) {
            return false;
        }
        if (eVarE == null || eVarI == null) {
            return false;
        }
        int iF = dVar3.f44662f.f() + eVarE.Y[i11].g();
        int iF2 = dVar4.f44662f.f() - eVarI.Y[i14].g();
        int i15 = iF2 - iF;
        if (i15 <= 0) {
            return false;
        }
        b.a aVar = new b.a();
        boolean z14 = false;
        int i16 = 0;
        int i17 = 0;
        int iG3 = 0;
        boolean z15 = false;
        androidx.constraintlayout.core.widgets.e eVar4 = eVarC;
        while (true) {
            androidx.constraintlayout.core.widgets.e eVar5 = null;
            if (z14) {
                androidx.constraintlayout.core.widgets.e eVar6 = eVarC;
                androidx.constraintlayout.core.widgets.e eVar7 = eVarF;
                if (i16 == 0 || i16 != i17 || i15 < iG3) {
                    return false;
                }
                int i18 = i15 - iG3;
                if (!z10) {
                    if (z11 && i16 > 2) {
                        i12 = 1;
                        i18 = (i18 / i16) - 1;
                    }
                    if (i16 == i12) {
                        if (i10 == 0) {
                            fG0 = eVar7.E();
                        } else {
                            fG0 = eVar7.g0();
                        }
                        i13 = (int) (iF + 0.5f + (i18 * fG0));
                        if (i10 == 0) {
                            eVarE.r1(i13, eVarE.m0() + i13);
                        } else {
                            eVarE.u1(i13, eVarE.D() + i13);
                        }
                        b(1, eVarE, fVar.H2(), zP2);
                        return true;
                    }
                    if (z10) {
                        if (z11) {
                            return true;
                        }
                        if (i16 == 2) {
                            return false;
                        }
                        if (i10 == 0) {
                            eVarE.r1(iF, eVarE.m0() + iF);
                            eVarI.r1(iF2 - eVarI.m0(), iF2);
                            b(1, eVarE, fVar.H2(), zP2);
                            b(1, eVarI, fVar.H2(), zP2);
                            return true;
                        }
                        eVarE.u1(iF, eVarE.D() + iF);
                        eVarI.u1(iF2 - eVarI.D(), iF2);
                        k(1, eVarE, fVar.H2());
                        k(1, eVarI, fVar.H2());
                        return true;
                    }
                    iG = iF + i18;
                    z13 = false;
                    eVar2 = eVar6;
                    while (!z13) {
                        if (eVar2.l0() == 8) {
                            iG2 = iG + eVar2.Y[i11].g();
                            if (i10 == 0) {
                                r10 = i12;
                                eVar2.r1(iG2, eVar2.m0() + iG2);
                                b(1, eVar2, fVar.H2(), zP2);
                                iD = eVar2.m0();
                            } else {
                                r10 = i12;
                                eVar2.u1(iG2, eVar2.D() + iG2);
                                k(1, eVar2, fVar.H2());
                                iD = eVar2.D();
                            }
                            iG = iG2 + iD + eVar2.Y[i14].g() + i18;
                        } else if (i10 == 0) {
                            eVar2.r1(iG, iG);
                            b(r10, eVar2, fVar.H2(), zP2);
                        } else {
                            eVar2.u1(iG, iG);
                            k(r10, eVar2, fVar.H2());
                        }
                        eVar2.g(eVar, z15);
                        dVar = eVar2.Y[i14].f44662f;
                        if (dVar != null) {
                            eVar3 = dVar.f44660d;
                            dVar2 = eVar3.Y[i11].f44662f;
                            if (dVar2 != null || dVar2.f44660d != eVar2) {
                                eVar3 = null;
                            }
                        } else {
                            eVar3 = null;
                        }
                        if (eVar3 != null) {
                            eVar2 = eVar3;
                        } else {
                            z13 = true;
                        }
                        r10 = 1;
                        z15 = false;
                    }
                    r10 = i12;
                    return r10;
                }
                i18 /= i16 + 1;
                i12 = 1;
                if (i16 == i12) {
                    if (i10 == 0) {
                        fG0 = eVar7.E();
                    } else {
                        fG0 = eVar7.g0();
                    }
                    i13 = (int) (iF + 0.5f + (i18 * fG0));
                    if (i10 == 0) {
                        eVarE.r1(i13, eVarE.m0() + i13);
                    } else {
                        eVarE.u1(i13, eVarE.D() + i13);
                    }
                    b(1, eVarE, fVar.H2(), zP2);
                    return true;
                }
                if (z10) {
                    if (z11) {
                        return true;
                    }
                    if (i16 == 2) {
                        return false;
                    }
                    if (i10 == 0) {
                        eVarE.r1(iF, eVarE.m0() + iF);
                        eVarI.r1(iF2 - eVarI.m0(), iF2);
                        b(1, eVarE, fVar.H2(), zP2);
                        b(1, eVarI, fVar.H2(), zP2);
                        return true;
                    }
                    eVarE.u1(iF, eVarE.D() + iF);
                    eVarI.u1(iF2 - eVarI.D(), iF2);
                    k(1, eVarE, fVar.H2());
                    k(1, eVarI, fVar.H2());
                    return true;
                }
                iG = iF + i18;
                z13 = false;
                eVar2 = eVar6;
                while (!z13) {
                    if (eVar2.l0() == 8) {
                        iG2 = iG + eVar2.Y[i11].g();
                        if (i10 == 0) {
                            r10 = i12;
                            eVar2.r1(iG2, eVar2.m0() + iG2);
                            b(1, eVar2, fVar.H2(), zP2);
                            iD = eVar2.m0();
                        } else {
                            r10 = i12;
                            eVar2.u1(iG2, eVar2.D() + iG2);
                            k(1, eVar2, fVar.H2());
                            iD = eVar2.D();
                        }
                        iG = iG2 + iD + eVar2.Y[i14].g() + i18;
                    } else if (i10 == 0) {
                        eVar2.r1(iG, iG);
                        b(r10, eVar2, fVar.H2(), zP2);
                    } else {
                        eVar2.u1(iG, iG);
                        k(r10, eVar2, fVar.H2());
                    }
                    eVar2.g(eVar, z15);
                    dVar = eVar2.Y[i14].f44662f;
                    if (dVar != null) {
                        eVar3 = dVar.f44660d;
                        dVar2 = eVar3.Y[i11].f44662f;
                        if (dVar2 != null) {
                            eVar3 = null;
                        } else {
                            eVar3 = null;
                        }
                    } else {
                        eVar3 = null;
                    }
                    if (eVar3 != null) {
                        eVar2 = eVar3;
                    } else {
                        z13 = true;
                    }
                    r10 = 1;
                    z15 = false;
                }
                r10 = i12;
                return r10;
            }
            if (!a(1, eVar4)) {
                return false;
            }
            androidx.constraintlayout.core.widgets.e eVar8 = eVarC;
            if (eVar4.f44705b0[i10] == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
                return false;
            }
            if (eVar4.F0()) {
                androidx.constraintlayout.core.widgets.f.S2(1, eVar4, fVar.H2(), aVar, b.a.f44526k);
            }
            iG3 = iG3 + eVar4.Y[i11].g() + (i10 == 0 ? eVar4.m0() : eVar4.D()) + eVar4.Y[i14].g();
            i17++;
            if (eVar4.l0() != 8) {
                i16++;
            }
            androidx.constraintlayout.core.widgets.d dVar6 = eVar4.Y[i14].f44662f;
            if (dVar6 != null) {
                androidx.constraintlayout.core.widgets.e eVar9 = dVar6.f44660d;
                androidx.constraintlayout.core.widgets.d dVar7 = eVar9.Y[i11].f44662f;
                if (dVar7 != null && dVar7.f44660d == eVar4) {
                    eVar5 = eVar9;
                }
            }
            if (eVar5 != null) {
                eVar4 = eVar5;
            } else {
                z14 = true;
            }
            eVarC = eVar8;
            eVarF = eVarF;
        }
    }

    private static void f(int i10, b.InterfaceC0360b interfaceC0360b, androidx.constraintlayout.core.widgets.e eVar, boolean z10) {
        float fE = eVar.E();
        int iF = eVar.Q.f44662f.f();
        int iF2 = eVar.S.f44662f.f();
        int iG = eVar.Q.g() + iF;
        int iG2 = iF2 - eVar.S.g();
        if (iF == iF2) {
            fE = 0.5f;
        } else {
            iF = iG;
            iF2 = iG2;
        }
        int iM0 = eVar.m0();
        int i11 = (iF2 - iF) - iM0;
        if (iF > iF2) {
            i11 = (iF - iF2) - iM0;
        }
        int i12 = ((int) (i11 > 0 ? (fE * i11) + 0.5f : fE * i11)) + iF;
        int i13 = i12 + iM0;
        if (iF > iF2) {
            i13 = i12 - iM0;
        }
        eVar.r1(i12, i13);
        b(i10 + 1, eVar, interfaceC0360b, z10);
    }

    private static void g(int i10, androidx.constraintlayout.core.widgets.e eVar, b.InterfaceC0360b interfaceC0360b, androidx.constraintlayout.core.widgets.e eVar2, boolean z10) {
        float fE = eVar2.E();
        int iF = eVar2.Q.f44662f.f() + eVar2.Q.g();
        int iF2 = eVar2.S.f44662f.f() - eVar2.S.g();
        if (iF2 >= iF) {
            int iM0 = eVar2.m0();
            if (eVar2.l0() != 8) {
                int i11 = eVar2.f44746w;
                if (i11 == 2) {
                    iM0 = (int) (eVar2.E() * 0.5f * (eVar instanceof androidx.constraintlayout.core.widgets.f ? eVar.m0() : eVar.U().m0()));
                } else if (i11 == 0) {
                    iM0 = iF2 - iF;
                }
                iM0 = Math.max(eVar2.f44752z, iM0);
                int i12 = eVar2.A;
                if (i12 > 0) {
                    iM0 = Math.min(i12, iM0);
                }
            }
            int i13 = iF + ((int) ((fE * ((iF2 - iF) - iM0)) + 0.5f));
            eVar2.r1(i13, iM0 + i13);
            b(i10 + 1, eVar2, interfaceC0360b, z10);
        }
    }

    private static void h(int i10, b.InterfaceC0360b interfaceC0360b, androidx.constraintlayout.core.widgets.e eVar) {
        float fG0 = eVar.g0();
        int iF = eVar.R.f44662f.f();
        int iF2 = eVar.T.f44662f.f();
        int iG = eVar.R.g() + iF;
        int iG2 = iF2 - eVar.T.g();
        if (iF == iF2) {
            fG0 = 0.5f;
        } else {
            iF = iG;
            iF2 = iG2;
        }
        int iD = eVar.D();
        int i11 = (iF2 - iF) - iD;
        if (iF > iF2) {
            i11 = (iF - iF2) - iD;
        }
        int i12 = (int) (i11 > 0 ? (fG0 * i11) + 0.5f : fG0 * i11);
        int i13 = iF + i12;
        int i14 = i13 + iD;
        if (iF > iF2) {
            i13 = iF - i12;
            i14 = i13 - iD;
        }
        eVar.u1(i13, i14);
        k(i10 + 1, eVar, interfaceC0360b);
    }

    private static void i(int i10, androidx.constraintlayout.core.widgets.e eVar, b.InterfaceC0360b interfaceC0360b, androidx.constraintlayout.core.widgets.e eVar2) {
        float fG0 = eVar2.g0();
        int iF = eVar2.R.f44662f.f() + eVar2.R.g();
        int iF2 = eVar2.T.f44662f.f() - eVar2.T.g();
        if (iF2 >= iF) {
            int iD = eVar2.D();
            if (eVar2.l0() != 8) {
                int i11 = eVar2.f44748x;
                if (i11 == 2) {
                    iD = (int) (fG0 * 0.5f * (eVar instanceof androidx.constraintlayout.core.widgets.f ? eVar.D() : eVar.U().D()));
                } else if (i11 == 0) {
                    iD = iF2 - iF;
                }
                iD = Math.max(eVar2.C, iD);
                int i12 = eVar2.D;
                if (i12 > 0) {
                    iD = Math.min(i12, iD);
                }
            }
            int i13 = iF + ((int) ((fG0 * ((iF2 - iF) - iD)) + 0.5f));
            eVar2.u1(i13, iD + i13);
            k(i10 + 1, eVar2, interfaceC0360b);
        }
    }

    public static void j(androidx.constraintlayout.core.widgets.f fVar, b.InterfaceC0360b interfaceC0360b) {
        androidx.constraintlayout.core.widgets.e.b bVarH = fVar.H();
        androidx.constraintlayout.core.widgets.e.b bVarJ0 = fVar.j0();
        f44578e = 0;
        f44579f = 0;
        fVar.V0();
        ArrayList<androidx.constraintlayout.core.widgets.e> arrayListM2 = fVar.m2();
        int size = arrayListM2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayListM2.get(i10).V0();
        }
        boolean zP2 = fVar.P2();
        if (bVarH == androidx.constraintlayout.core.widgets.e.b.FIXED) {
            fVar.r1(0, fVar.m0());
        } else {
            fVar.s1(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.constraintlayout.core.widgets.e eVar = arrayListM2.get(i11);
            if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
                androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) eVar;
                if (hVar.o2() == 1) {
                    if (hVar.p2() != -1) {
                        hVar.x2(hVar.p2());
                    } else if (hVar.r2() != -1 && fVar.G0()) {
                        hVar.x2(fVar.m0() - hVar.r2());
                    } else if (fVar.G0()) {
                        hVar.x2((int) ((hVar.s2() * fVar.m0()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) eVar).s2() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                androidx.constraintlayout.core.widgets.e eVar2 = arrayListM2.get(i12);
                if (eVar2 instanceof androidx.constraintlayout.core.widgets.h) {
                    androidx.constraintlayout.core.widgets.h hVar2 = (androidx.constraintlayout.core.widgets.h) eVar2;
                    if (hVar2.o2() == 1) {
                        b(0, hVar2, interfaceC0360b, zP2);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0360b, zP2);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                androidx.constraintlayout.core.widgets.e eVar3 = arrayListM2.get(i13);
                if (eVar3 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) eVar3;
                    if (aVar.s2() == 0) {
                        d(0, aVar, interfaceC0360b, 0, zP2);
                    }
                }
            }
        }
        if (bVarJ0 == androidx.constraintlayout.core.widgets.e.b.FIXED) {
            fVar.u1(0, fVar.D());
        } else {
            fVar.t1(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            androidx.constraintlayout.core.widgets.e eVar4 = arrayListM2.get(i14);
            if (eVar4 instanceof androidx.constraintlayout.core.widgets.h) {
                androidx.constraintlayout.core.widgets.h hVar3 = (androidx.constraintlayout.core.widgets.h) eVar4;
                if (hVar3.o2() == 0) {
                    if (hVar3.p2() != -1) {
                        hVar3.x2(hVar3.p2());
                    } else if (hVar3.r2() != -1 && fVar.H0()) {
                        hVar3.x2(fVar.D() - hVar3.r2());
                    } else if (fVar.H0()) {
                        hVar3.x2((int) ((hVar3.s2() * fVar.D()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) eVar4).s2() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                androidx.constraintlayout.core.widgets.e eVar5 = arrayListM2.get(i15);
                if (eVar5 instanceof androidx.constraintlayout.core.widgets.h) {
                    androidx.constraintlayout.core.widgets.h hVar4 = (androidx.constraintlayout.core.widgets.h) eVar5;
                    if (hVar4.o2() == 0) {
                        k(1, hVar4, interfaceC0360b);
                    }
                }
            }
        }
        k(0, fVar, interfaceC0360b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                androidx.constraintlayout.core.widgets.e eVar6 = arrayListM2.get(i16);
                if (eVar6 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) eVar6;
                    if (aVar2.s2() == 1) {
                        d(0, aVar2, interfaceC0360b, 1, zP2);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            androidx.constraintlayout.core.widgets.e eVar7 = arrayListM2.get(i17);
            if (eVar7.F0() && a(0, eVar7)) {
                androidx.constraintlayout.core.widgets.f.S2(0, eVar7, interfaceC0360b, f44576c, b.a.f44526k);
                if (!(eVar7 instanceof androidx.constraintlayout.core.widgets.h)) {
                    b(0, eVar7, interfaceC0360b, zP2);
                    k(0, eVar7, interfaceC0360b);
                } else if (((androidx.constraintlayout.core.widgets.h) eVar7).o2() == 0) {
                    k(0, eVar7, interfaceC0360b);
                } else {
                    b(0, eVar7, interfaceC0360b, zP2);
                }
            }
        }
    }

    private static void k(int i10, androidx.constraintlayout.core.widgets.e eVar, b.InterfaceC0360b interfaceC0360b) {
        androidx.constraintlayout.core.widgets.d dVar;
        androidx.constraintlayout.core.widgets.d dVar2;
        androidx.constraintlayout.core.widgets.d dVar3;
        androidx.constraintlayout.core.widgets.d dVar4;
        if (eVar.L0()) {
            return;
        }
        boolean z10 = true;
        f44579f++;
        if (!(eVar instanceof androidx.constraintlayout.core.widgets.f) && eVar.F0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                androidx.constraintlayout.core.widgets.f.S2(i11, eVar, interfaceC0360b, new b.a(), b.a.f44526k);
            }
        }
        androidx.constraintlayout.core.widgets.d dVarR = eVar.r(androidx.constraintlayout.core.widgets.d.a.TOP);
        androidx.constraintlayout.core.widgets.d dVarR2 = eVar.r(androidx.constraintlayout.core.widgets.d.a.BOTTOM);
        int iF = dVarR.f();
        int iF2 = dVarR2.f();
        if (dVarR.e() != null && dVarR.o()) {
            Iterator<androidx.constraintlayout.core.widgets.d> it = dVarR.e().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.d next = it.next();
                androidx.constraintlayout.core.widgets.e eVar2 = next.f44660d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.F0() && zA) {
                    androidx.constraintlayout.core.widgets.f.S2(i12, eVar2, interfaceC0360b, new b.a(), b.a.f44526k);
                }
                boolean z11 = ((next == eVar2.R && (dVar4 = eVar2.T.f44662f) != null && dVar4.o()) || (next == eVar2.T && (dVar3 = eVar2.R.f44662f) != null && dVar3.o())) ? z10 : false;
                androidx.constraintlayout.core.widgets.e.b bVarJ0 = eVar2.j0();
                boolean z12 = z10;
                androidx.constraintlayout.core.widgets.e.b bVar = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
                if (bVarJ0 != bVar || zA) {
                    if (!eVar2.F0()) {
                        androidx.constraintlayout.core.widgets.d dVar5 = eVar2.R;
                        if (next == dVar5 && eVar2.T.f44662f == null) {
                            int iG = dVar5.g() + iF;
                            eVar2.u1(iG, eVar2.D() + iG);
                            k(i12, eVar2, interfaceC0360b);
                        } else {
                            androidx.constraintlayout.core.widgets.d dVar6 = eVar2.T;
                            if (next == dVar6 && dVar5.f44662f == null) {
                                int iG2 = iF - dVar6.g();
                                eVar2.u1(iG2 - eVar2.D(), iG2);
                                k(i12, eVar2, interfaceC0360b);
                            } else if (z11 && !eVar2.D0()) {
                                h(i12, interfaceC0360b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.j0() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && ((eVar2.l0() == 8 || (eVar2.f44748x == 0 && eVar2.A() == 0.0f)) && !eVar2.D0() && !eVar2.E0() && z11 && !eVar2.D0())) {
                    i(i12, eVar, interfaceC0360b, eVar2);
                }
                z10 = z12;
            }
        }
        boolean z13 = z10;
        if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
            return;
        }
        if (dVarR2.e() != null && dVarR2.o()) {
            Iterator<androidx.constraintlayout.core.widgets.d> it2 = dVarR2.e().iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.d next2 = it2.next();
                androidx.constraintlayout.core.widgets.e eVar3 = next2.f44660d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.F0() && zA2) {
                    androidx.constraintlayout.core.widgets.f.S2(i13, eVar3, interfaceC0360b, new b.a(), b.a.f44526k);
                }
                boolean z14 = ((next2 == eVar3.R && (dVar2 = eVar3.T.f44662f) != null && dVar2.o()) || (next2 == eVar3.T && (dVar = eVar3.R.f44662f) != null && dVar.o())) ? z13 : false;
                androidx.constraintlayout.core.widgets.e.b bVarJ1 = eVar3.j0();
                androidx.constraintlayout.core.widgets.e.b bVar2 = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
                if (bVarJ1 != bVar2 || zA2) {
                    if (!eVar3.F0()) {
                        androidx.constraintlayout.core.widgets.d dVar7 = eVar3.R;
                        if (next2 == dVar7 && eVar3.T.f44662f == null) {
                            int iG3 = dVar7.g() + iF2;
                            eVar3.u1(iG3, eVar3.D() + iG3);
                            k(i13, eVar3, interfaceC0360b);
                        } else {
                            androidx.constraintlayout.core.widgets.d dVar8 = eVar3.T;
                            if (next2 == dVar8 && dVar7.f44662f == null) {
                                int iG4 = iF2 - dVar8.g();
                                eVar3.u1(iG4 - eVar3.D(), iG4);
                                k(i13, eVar3, interfaceC0360b);
                            } else if (z14 && !eVar3.D0()) {
                                h(i13, interfaceC0360b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.j0() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.l0() == 8 || (eVar3.f44748x == 0 && eVar3.A() == 0.0f))) {
                    if (!eVar3.D0() && !eVar3.E0() && z14 && !eVar3.D0()) {
                        i(i13, eVar, interfaceC0360b, eVar3);
                    }
                }
            }
        }
        androidx.constraintlayout.core.widgets.d dVarR3 = eVar.r(androidx.constraintlayout.core.widgets.d.a.BASELINE);
        if (dVarR3.e() != null && dVarR3.o()) {
            int iF3 = dVarR3.f();
            for (androidx.constraintlayout.core.widgets.d dVar9 : dVarR3.e()) {
                androidx.constraintlayout.core.widgets.e eVar4 = dVar9.f44660d;
                int i14 = i10 + 1;
                boolean zA3 = a(i14, eVar4);
                if (eVar4.F0() && zA3) {
                    androidx.constraintlayout.core.widgets.f.S2(i14, eVar4, interfaceC0360b, new b.a(), b.a.f44526k);
                }
                if (eVar4.j0() != androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT || zA3) {
                    if (!eVar4.F0() && dVar9 == eVar4.U) {
                        eVar4.p1(dVar9.g() + iF3);
                        k(i14, eVar4, interfaceC0360b);
                    }
                }
            }
        }
        eVar.O0();
    }
}
