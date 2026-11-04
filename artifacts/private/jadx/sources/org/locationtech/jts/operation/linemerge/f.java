package org.locationtech.jts.operation.linemerge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.q;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.z;
import org.locationtech.jts.planargraph.h;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f338797a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f338798b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338799c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338800d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n f338801e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f338802f = false;

    class a implements q {
        a() {
        }

        @Override // org.locationtech.jts.geom.q
        public void a(n nVar) {
            if (nVar instanceof v) {
                f.this.d((v) nVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(v vVar) {
        if (this.f338798b == null) {
            this.f338798b = vVar.g0();
        }
        this.f338797a.p(vVar);
        this.f338799c++;
    }

    private void e(org.locationtech.jts.planargraph.a aVar, ListIterator listIterator, boolean z10) {
        org.locationtech.jts.planargraph.e eVarL;
        org.locationtech.jts.planargraph.e eVarO = aVar.O();
        while (true) {
            listIterator.add(aVar.N());
            aVar.H().w(true);
            eVarL = aVar.L();
            org.locationtech.jts.planargraph.a aVarK = k(eVarL);
            if (aVarK == null) {
                break;
            } else {
                aVar = aVarK.N();
            }
        }
        if (z10) {
            org.locationtech.jts.util.a.d(eVarL == eVarO, "path not contiguous");
        }
    }

    private n f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (org.locationtech.jts.planargraph.a aVar : (List) it.next()) {
                v vVarI = ((c) aVar.H()).I();
                if (!aVar.I() && !vVarI.X0()) {
                    vVarI = r(vVarI);
                }
                arrayList.add(vVarI);
            }
        }
        return arrayList.size() == 0 ? this.f338798b.m(new v[0]) : this.f338798b.b(arrayList);
    }

    private void g() {
        if (!this.f338800d) {
            boolean z10 = true;
            this.f338800d = true;
            List listJ = j();
            if (listJ != null) {
                n nVarF = f(listJ);
                this.f338801e = nVarF;
                this.f338802f = true;
                org.locationtech.jts.util.a.d(this.f338799c == nVarF.l0(), "Lines were missing from result");
                n nVar = this.f338801e;
                if (!(nVar instanceof v) && !(nVar instanceof z)) {
                    z10 = false;
                }
                org.locationtech.jts.util.a.d(z10, "Result is not lineal");
            }
        }
    }

    private static org.locationtech.jts.planargraph.e h(h hVar) {
        Iterator itF = hVar.f();
        int iD = Integer.MAX_VALUE;
        org.locationtech.jts.planargraph.e eVar = null;
        while (itF.hasNext()) {
            org.locationtech.jts.planargraph.e eVar2 = (org.locationtech.jts.planargraph.e) itF.next();
            if (eVar == null || eVar2.D() < iD) {
                iD = eVar2.D();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    private List i(h hVar) {
        org.locationtech.jts.planargraph.d.v(hVar.d(), false);
        org.locationtech.jts.planargraph.a aVarN = ((org.locationtech.jts.planargraph.a) h(hVar).I().j().next()).N();
        LinkedList linkedList = new LinkedList();
        ListIterator listIterator = linkedList.listIterator();
        e(aVarN, listIterator, false);
        while (listIterator.hasPrevious()) {
            org.locationtech.jts.planargraph.a aVarK = k(((org.locationtech.jts.planargraph.a) listIterator.previous()).L());
            if (aVarK != null) {
                e(aVarK.N(), listIterator, true);
            }
        }
        return p(linkedList);
    }

    private List j() {
        ArrayList arrayList = new ArrayList();
        for (h hVar : new xm.a(this.f338797a).d()) {
            if (!m(hVar)) {
                return null;
            }
            arrayList.add(i(hVar));
        }
        return arrayList;
    }

    private static org.locationtech.jts.planargraph.a k(org.locationtech.jts.planargraph.e eVar) {
        org.locationtech.jts.planargraph.a aVar;
        org.locationtech.jts.planargraph.a aVar2;
        Iterator itJ = eVar.I().j();
        org.locationtech.jts.planargraph.a aVar3 = null;
        loop0: while (true) {
            aVar = aVar3;
            while (true) {
                if (!itJ.hasNext()) {
                    break loop0;
                }
                aVar2 = (org.locationtech.jts.planargraph.a) itJ.next();
                if (!aVar2.H().p()) {
                    if (aVar2.I()) {
                        break;
                    }
                    aVar = aVar2;
                }
            }
            aVar3 = aVar2;
        }
        return aVar3 != null ? aVar3 : aVar;
    }

    private boolean m(h hVar) {
        Iterator itF = hVar.f();
        int i10 = 0;
        while (itF.hasNext()) {
            if (((org.locationtech.jts.planargraph.e) itF.next()).D() % 2 == 1) {
                i10++;
            }
        }
        return i10 <= 2;
    }

    public static boolean o(n nVar) {
        if (!(nVar instanceof z)) {
            return true;
        }
        z zVar = (z) nVar;
        TreeSet treeSet = new TreeSet();
        ArrayList arrayList = new ArrayList();
        org.locationtech.jts.geom.a aVar = null;
        int i10 = 0;
        while (i10 < zVar.l0()) {
            v vVar = (v) zVar.h0(i10);
            org.locationtech.jts.geom.a aVarR0 = vVar.R0(0);
            org.locationtech.jts.geom.a aVarR1 = vVar.R0(vVar.m0() - 1);
            if (!treeSet.contains(aVarR0) && !treeSet.contains(aVarR1)) {
                if (aVar != null && !aVarR0.equals(aVar)) {
                    treeSet.addAll(arrayList);
                    arrayList.clear();
                }
                arrayList.add(aVarR0);
                arrayList.add(aVarR1);
                i10++;
                aVar = aVarR1;
            }
            return false;
        }
        return true;
    }

    private List p(List list) {
        boolean z10 = false;
        org.locationtech.jts.planargraph.a aVar = (org.locationtech.jts.planargraph.a) list.get(0);
        org.locationtech.jts.planargraph.a aVar2 = (org.locationtech.jts.planargraph.a) list.get(list.size() - 1);
        org.locationtech.jts.planargraph.e eVarL = aVar.L();
        org.locationtech.jts.planargraph.e eVarO = aVar2.O();
        if (eVarL.D() == 1 || eVarO.D() == 1) {
            boolean z11 = aVar2.O().D() == 1 && !aVar2.I();
            boolean z12 = z11;
            if (aVar.L().D() == 1 && aVar.I()) {
                z11 = true;
            } else {
                z10 = z12;
            }
            if (!z11 && aVar.L().D() == 1) {
                z10 = true;
            }
        }
        return z10 ? q(list) : list;
    }

    private List q(List list) {
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.addFirst(((org.locationtech.jts.planargraph.a) it.next()).N());
        }
        return linkedList;
    }

    private static v r(v vVar) {
        org.locationtech.jts.geom.a[] aVarArrD0 = vVar.d0();
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[aVarArrD0.length];
        int length = aVarArrD0.length;
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[(length - 1) - i10] = new org.locationtech.jts.geom.a(aVarArrD0[i10]);
        }
        return vVar.g0().h(aVarArr);
    }

    public static n s(n nVar) {
        f fVar = new f();
        fVar.c(nVar);
        return fVar.l();
    }

    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((n) it.next());
        }
    }

    public void c(n nVar) {
        nVar.d(new a());
    }

    public n l() {
        g();
        return this.f338801e;
    }

    public boolean n() {
        g();
        return this.f338802f;
    }
}
