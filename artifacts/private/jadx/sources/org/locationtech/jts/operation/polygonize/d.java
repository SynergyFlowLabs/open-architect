package org.locationtech.jts.operation.polygonize;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.planargraph.g;

/* JADX INFO: loaded from: classes14.dex */
class d extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f338876d;

    public d(r rVar) {
        this.f338876d = rVar;
    }

    private static List A(b bVar, long j10) {
        ArrayList arrayList = null;
        b bVarX = bVar;
        do {
            org.locationtech.jts.planargraph.e eVarL = bVarX.L();
            boolean z10 = true;
            if (C(eVarL, j10) > 1) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(eVarL);
            }
            bVarX = bVarX.X();
            org.locationtech.jts.util.a.d(bVarX != null, "found null DE in ring");
            if (bVarX != bVar && bVarX.Z()) {
                z10 = false;
            }
            org.locationtech.jts.util.a.d(z10, "found DE already in ring");
        } while (bVarX != bVar);
        return arrayList;
    }

    private static List B(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        long j10 = 1;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!bVar.n() && bVar.W() < 0) {
                arrayList.add(bVar);
                G(a.g(bVar), j10);
                j10++;
            }
        }
        return arrayList;
    }

    private static int C(org.locationtech.jts.planargraph.e eVar, long j10) {
        Iterator it = eVar.I().d().iterator();
        int i10 = 0;
        int i11 = 7 | 0;
        while (it.hasNext()) {
            if (((b) it.next()).W() == j10) {
                i10++;
            }
        }
        return i10;
    }

    private static int D(org.locationtech.jts.planargraph.e eVar) {
        Iterator it = eVar.I().d().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!((b) it.next()).n()) {
                i10++;
            }
        }
        return i10;
    }

    private org.locationtech.jts.planargraph.e F(org.locationtech.jts.geom.a aVar) {
        org.locationtech.jts.planargraph.e eVarH = h(aVar);
        if (eVarH != null) {
            return eVarH;
        }
        org.locationtech.jts.planargraph.e eVar = new org.locationtech.jts.planargraph.e(aVar);
        c(eVar);
        return eVar;
    }

    private static void G(Collection collection, long j10) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a0(j10);
        }
    }

    private void r(b bVar) {
    }

    private static void s(org.locationtech.jts.planargraph.e eVar, long j10) {
        List listD = eVar.I().d();
        b bVar = null;
        b bVar2 = null;
        for (int size = listD.size() - 1; size >= 0; size--) {
            b bVar3 = (b) listD.get(size);
            b bVar4 = (b) bVar3.N();
            if (bVar3.W() != j10) {
                bVar3 = null;
            }
            if (bVar4.W() != j10) {
                bVar4 = null;
            }
            if (bVar3 != null || bVar4 != null) {
                if (bVar4 != null) {
                    bVar = bVar4;
                }
                if (bVar3 != null) {
                    if (bVar != null) {
                        bVar.c0(bVar3);
                        bVar = null;
                    }
                    if (bVar2 == null) {
                        bVar2 = bVar3;
                    }
                }
            }
        }
        if (bVar != null) {
            org.locationtech.jts.util.a.c(bVar2 != null);
            bVar.c0(bVar2);
        }
    }

    private void t() {
        Iterator itL = l();
        while (itL.hasNext()) {
            u((org.locationtech.jts.planargraph.e) itL.next());
        }
    }

    private static void u(org.locationtech.jts.planargraph.e eVar) {
        b bVar = null;
        b bVar2 = null;
        for (b bVar3 : eVar.I().d()) {
            if (!bVar3.n()) {
                if (bVar2 == null) {
                    bVar2 = bVar3;
                }
                if (bVar != null) {
                    ((b) bVar.N()).c0(bVar3);
                }
                bVar = bVar3;
            }
        }
        if (bVar != null) {
            ((b) bVar.N()).c0(bVar2);
        }
    }

    private void v(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            long jW = bVar.W();
            List listA = A(bVar, jW);
            if (listA != null) {
                Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    s((org.locationtech.jts.planargraph.e) it2.next(), jW);
                }
            }
        }
    }

    public static void w(org.locationtech.jts.planargraph.e eVar) {
        for (b bVar : eVar.I().d()) {
            bVar.t(true);
            b bVar2 = (b) bVar.N();
            if (bVar2 != null) {
                bVar2.t(true);
            }
        }
    }

    private a z(b bVar) {
        a aVar = new a(this.f338876d);
        aVar.e(bVar);
        return aVar;
    }

    public List E() {
        t();
        G(this.f338962b, -1L);
        v(B(this.f338962b));
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.f338962b) {
            if (!bVar.n() && !bVar.Z()) {
                arrayList.add(z(bVar));
            }
        }
        return arrayList;
    }

    public void p(v vVar) {
        if (!vVar.v0()) {
            org.locationtech.jts.geom.a[] aVarArrS = org.locationtech.jts.geom.b.s(vVar.d0());
            if (aVarArrS.length >= 2) {
                org.locationtech.jts.geom.a aVar = aVarArrS[0];
                org.locationtech.jts.geom.a aVar2 = aVarArrS[aVarArrS.length - 1];
                org.locationtech.jts.planargraph.e eVarF = F(aVar);
                org.locationtech.jts.planargraph.e eVarF2 = F(aVar2);
                b bVar = new b(eVarF, eVarF2, aVarArrS[1], true);
                b bVar2 = new b(eVarF2, eVarF, aVarArrS[aVarArrS.length - 2], false);
                c cVar = new c(vVar);
                cVar.H(bVar, bVar2);
                b(cVar);
            }
        }
    }

    public void q() {
    }

    public List x() {
        t();
        B(this.f338962b);
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.f338962b) {
            if (!bVar.n()) {
                b bVar2 = (b) bVar.N();
                if (bVar.W() == bVar2.W()) {
                    bVar.t(true);
                    bVar2.t(true);
                    arrayList.add(((c) bVar.H()).I());
                }
            }
        }
        return arrayList;
    }

    public Collection y() {
        List listI = i(1);
        HashSet hashSet = new HashSet();
        Stack stack = new Stack();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            stack.push(it.next());
        }
        while (!stack.isEmpty()) {
            org.locationtech.jts.planargraph.e eVar = (org.locationtech.jts.planargraph.e) stack.pop();
            w(eVar);
            for (b bVar : eVar.I().d()) {
                bVar.t(true);
                b bVar2 = (b) bVar.N();
                if (bVar2 != null) {
                    bVar2.t(true);
                }
                hashSet.add(((c) bVar.H()).I());
                org.locationtech.jts.planargraph.e eVarO = bVar.O();
                if (D(eVarO) == 1) {
                    stack.push(eVarO);
                }
            }
        }
        return hashSet;
    }
}
