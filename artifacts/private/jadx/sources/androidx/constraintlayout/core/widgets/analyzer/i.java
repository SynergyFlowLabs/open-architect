package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f44580a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f44581b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f44582c = true;

    public static o a(androidx.constraintlayout.core.widgets.e eVar, int i10, ArrayList<o> arrayList, o oVar) {
        int iM2;
        int i11 = i10 == 0 ? eVar.S0 : eVar.T0;
        int i12 = 0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f())) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                o oVar2 = arrayList.get(i13);
                if (oVar2.f() == i11) {
                    if (oVar != null) {
                        oVar.m(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                    break;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof androidx.constraintlayout.core.widgets.j) && (iM2 = ((androidx.constraintlayout.core.widgets.j) eVar).m2(i10)) != -1) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    o oVar3 = arrayList.get(i14);
                    if (oVar3.f() == iM2) {
                        oVar = oVar3;
                        break;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
                androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) eVar;
                androidx.constraintlayout.core.widgets.d dVarM2 = hVar.m2();
                if (hVar.o2() == 0) {
                    i12 = 1;
                    int i15 = 1 >> 1;
                }
                dVarM2.d(i12, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.S0 = oVar.f();
                eVar.Q.d(i10, arrayList, oVar);
                eVar.S.d(i10, arrayList, oVar);
            } else {
                eVar.T0 = oVar.f();
                eVar.R.d(i10, arrayList, oVar);
                eVar.U.d(i10, arrayList, oVar);
                eVar.T.d(i10, arrayList, oVar);
            }
            eVar.X.d(i10, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = arrayList.get(i11);
            if (i10 == oVar.f()) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0359  */
    public static boolean c(androidx.constraintlayout.core.widgets.f fVar, b.InterfaceC0360b interfaceC0360b) {
        o oVar;
        boolean z10;
        o oVar2;
        ArrayList<androidx.constraintlayout.core.widgets.e> arrayListM2 = fVar.m2();
        int size = arrayListM2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.constraintlayout.core.widgets.e eVar = arrayListM2.get(i11);
            if (!d(fVar.H(), fVar.j0(), eVar.H(), eVar.j0()) || (eVar instanceof androidx.constraintlayout.core.widgets.g)) {
                return false;
            }
        }
        androidx.constraintlayout.core.f fVar2 = fVar.H1;
        if (fVar2 != null) {
            fVar2.L++;
        }
        int i12 = 0;
        ArrayList arrayList = null;
        ArrayList<androidx.constraintlayout.core.widgets.j> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<androidx.constraintlayout.core.widgets.j> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i12 < size) {
            androidx.constraintlayout.core.widgets.e eVar2 = arrayListM2.get(i12);
            if (!d(fVar.H(), fVar.j0(), eVar2.H(), eVar2.j0())) {
                androidx.constraintlayout.core.widgets.f.S2(i10, eVar2, interfaceC0360b, fVar.f44771g2, b.a.f44526k);
            }
            boolean z11 = eVar2 instanceof androidx.constraintlayout.core.widgets.h;
            if (z11) {
                androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) eVar2;
                if (hVar.o2() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(hVar);
                }
                if (hVar.o2() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(hVar);
                }
            }
            if (eVar2 instanceof androidx.constraintlayout.core.widgets.j) {
                if (eVar2 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) eVar2;
                    if (aVar.s2() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    if (aVar.s2() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(aVar);
                    }
                } else {
                    androidx.constraintlayout.core.widgets.j jVar = (androidx.constraintlayout.core.widgets.j) eVar2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(jVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(jVar);
                }
            }
            if (eVar2.Q.f44662f == null && eVar2.S.f44662f == null && !z11 && !(eVar2 instanceof androidx.constraintlayout.core.widgets.a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(eVar2);
            }
            if (eVar2.R.f44662f == null && eVar2.T.f44662f == null && eVar2.U.f44662f == null && !z11 && !(eVar2 instanceof androidx.constraintlayout.core.widgets.a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(eVar2);
            }
            i12++;
            i10 = 0;
        }
        ArrayList<o> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((androidx.constraintlayout.core.widgets.h) it.next(), 0, arrayList7, null);
            }
        }
        o oVar3 = null;
        int i13 = 0;
        if (arrayList2 != null) {
            for (androidx.constraintlayout.core.widgets.j jVar2 : arrayList2) {
                o oVarA = a(jVar2, i13, arrayList7, oVar3);
                jVar2.l2(arrayList7, i13, oVarA);
                oVarA.c(arrayList7);
                oVar3 = null;
                i13 = 0;
            }
        }
        androidx.constraintlayout.core.widgets.d dVarR = fVar.r(androidx.constraintlayout.core.widgets.d.a.LEFT);
        if (dVarR.e() != null) {
            Iterator<androidx.constraintlayout.core.widgets.d> it2 = dVarR.e().iterator();
            while (it2.hasNext()) {
                a(it2.next().f44660d, 0, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.d dVarR2 = fVar.r(androidx.constraintlayout.core.widgets.d.a.RIGHT);
        if (dVarR2.e() != null) {
            Iterator<androidx.constraintlayout.core.widgets.d> it3 = dVarR2.e().iterator();
            while (it3.hasNext()) {
                a(it3.next().f44660d, 0, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.d dVarR3 = fVar.r(androidx.constraintlayout.core.widgets.d.a.CENTER);
        if (dVarR3.e() != null) {
            Iterator<androidx.constraintlayout.core.widgets.d> it4 = dVarR3.e().iterator();
            while (it4.hasNext()) {
                a(it4.next().f44660d, 0, arrayList7, null);
            }
        }
        o oVar4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                a((androidx.constraintlayout.core.widgets.e) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                a((androidx.constraintlayout.core.widgets.h) it6.next(), 1, arrayList7, null);
            }
        }
        int i14 = 1;
        if (arrayList4 != null) {
            for (androidx.constraintlayout.core.widgets.j jVar3 : arrayList4) {
                o oVarA2 = a(jVar3, i14, arrayList7, oVar4);
                jVar3.l2(arrayList7, i14, oVarA2);
                oVarA2.c(arrayList7);
                oVar4 = null;
                i14 = 1;
            }
        }
        androidx.constraintlayout.core.widgets.d dVarR4 = fVar.r(androidx.constraintlayout.core.widgets.d.a.TOP);
        if (dVarR4.e() != null) {
            Iterator<androidx.constraintlayout.core.widgets.d> it7 = dVarR4.e().iterator();
            while (it7.hasNext()) {
                a(it7.next().f44660d, 1, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.d dVarR5 = fVar.r(androidx.constraintlayout.core.widgets.d.a.BASELINE);
        if (dVarR5.e() != null) {
            Iterator<androidx.constraintlayout.core.widgets.d> it8 = dVarR5.e().iterator();
            while (it8.hasNext()) {
                a(it8.next().f44660d, 1, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.d dVarR6 = fVar.r(androidx.constraintlayout.core.widgets.d.a.BOTTOM);
        if (dVarR6.e() != null) {
            Iterator<androidx.constraintlayout.core.widgets.d> it9 = dVarR6.e().iterator();
            while (it9.hasNext()) {
                a(it9.next().f44660d, 1, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.d dVarR7 = fVar.r(androidx.constraintlayout.core.widgets.d.a.CENTER);
        if (dVarR7.e() != null) {
            Iterator<androidx.constraintlayout.core.widgets.d> it10 = dVarR7.e().iterator();
            while (it10.hasNext()) {
                a(it10.next().f44660d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                a((androidx.constraintlayout.core.widgets.e) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i15 = 0; i15 < size; i15++) {
            androidx.constraintlayout.core.widgets.e eVar3 = arrayListM2.get(i15);
            if (eVar3.Q0()) {
                o oVarB = b(arrayList7, eVar3.S0);
                o oVarB2 = b(arrayList7, eVar3.T0);
                if (oVarB != null && oVarB2 != null) {
                    oVarB.m(0, oVarB2);
                    oVarB2.o(2);
                    arrayList7.remove(oVarB);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (fVar.H() == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) {
            oVar = null;
            int i16 = 0;
            for (o oVar5 : arrayList7) {
                if (oVar5.g() != 1) {
                    oVar5.n(false);
                    int iL = oVar5.l(fVar.J2(), 0);
                    if (iL > i16) {
                        oVar = oVar5;
                        i16 = iL;
                    }
                }
            }
            if (oVar != null) {
                fVar.E1(androidx.constraintlayout.core.widgets.e.b.FIXED);
                fVar.d2(i16);
                oVar.n(true);
            } else {
                oVar = null;
            }
        } else {
            oVar = null;
        }
        if (fVar.j0() == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) {
            o oVar6 = null;
            int i17 = 0;
            for (o oVar7 : arrayList7) {
                if (oVar7.g() != 0) {
                    oVar7.n(false);
                    int iL2 = oVar7.l(fVar.J2(), 1);
                    if (iL2 > i17) {
                        oVar6 = oVar7;
                        i17 = iL2;
                    }
                }
            }
            z10 = true;
            if (oVar6 != null) {
                fVar.Z1(androidx.constraintlayout.core.widgets.e.b.FIXED);
                fVar.z1(i17);
                oVar6.n(true);
                oVar2 = oVar6;
            }
            if (oVar == null || oVar2 != null) {
                return z10;
            }
            return false;
        }
        z10 = true;
        oVar2 = null;
        if (oVar == null) {
        }
        return z10;
    }

    public static boolean d(androidx.constraintlayout.core.widgets.e.b bVar, androidx.constraintlayout.core.widgets.e.b bVar2, androidx.constraintlayout.core.widgets.e.b bVar3, androidx.constraintlayout.core.widgets.e.b bVar4) {
        androidx.constraintlayout.core.widgets.e.b bVar5;
        androidx.constraintlayout.core.widgets.e.b bVar6;
        androidx.constraintlayout.core.widgets.e.b bVar7 = androidx.constraintlayout.core.widgets.e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) || (bVar3 == androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) || (bVar4 == androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
