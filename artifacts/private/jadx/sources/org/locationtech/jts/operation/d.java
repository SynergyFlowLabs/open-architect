package org.locationtech.jts.operation;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.locationtech.jts.algorithm.y;
import org.locationtech.jts.geom.a0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.f0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.o;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.geom.z;
import org.locationtech.jts.geomgraph.g;
import org.locationtech.jts.geomgraph.index.e;
import org.locationtech.jts.geomgraph.l;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338760c;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        org.locationtech.jts.geom.a f338761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f338762b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f338763c = 0;

        public a(org.locationtech.jts.geom.a aVar) {
            this.f338761a = aVar;
        }

        public void a(boolean z10) {
            this.f338763c++;
            this.f338762b = z10 | this.f338762b;
        }

        public org.locationtech.jts.geom.a b() {
            return this.f338761a;
        }
    }

    public d() {
        this.f338759b = true;
        this.f338760c = null;
    }

    private void a(Map map, org.locationtech.jts.geom.a aVar, boolean z10) {
        a aVar2 = (a) map.get(aVar);
        if (aVar2 == null) {
            aVar2 = new a(aVar);
            map.put(aVar, aVar2);
        }
        aVar2.a(z10);
    }

    private boolean b(n nVar) {
        this.f338760c = null;
        if (nVar.v0()) {
            return true;
        }
        if (!(nVar instanceof v) && !(nVar instanceof z)) {
            if (nVar instanceof a0) {
                return l((a0) nVar);
            }
            if (nVar instanceof f0) {
                return m(nVar);
            }
            if (nVar instanceof o) {
                return j(nVar);
            }
            return true;
        }
        return k(nVar);
    }

    private boolean d(l lVar) {
        TreeMap treeMap = new TreeMap();
        Iterator itL = lVar.l();
        while (itL.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) itL.next();
            dVar.w();
            boolean z10 = dVar.z();
            a(treeMap, dVar.q(0), z10);
            a(treeMap, dVar.q(dVar.y() - 1), z10);
        }
        for (a aVar : treeMap.values()) {
            if (aVar.f338762b && aVar.f338763c != 2) {
                this.f338760c = aVar.b();
                return true;
            }
        }
        return false;
    }

    private boolean e(l lVar) {
        Iterator itL = lVar.l();
        while (itL.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) itL.next();
            int iW = dVar.w();
            Iterator itF = dVar.u().f();
            while (itF.hasNext()) {
                g gVar = (g) itF.next();
                if (!gVar.o(iW)) {
                    this.f338760c = gVar.k();
                    return true;
                }
            }
        }
        return false;
    }

    private boolean j(n nVar) {
        for (int i10 = 0; i10 < nVar.l0(); i10++) {
            if (!b(nVar.h0(i10))) {
                return false;
            }
        }
        return true;
    }

    private boolean k(n nVar) {
        if (nVar.v0()) {
            return true;
        }
        l lVar = new l(0, nVar);
        e eVarG = lVar.G(new y(), true);
        if (!eVarG.c()) {
            return true;
        }
        if (eVarG.e()) {
            this.f338760c = eVarG.b();
            return false;
        }
        if (e(lVar)) {
            return false;
        }
        return (this.f338759b && d(lVar)) ? false : true;
    }

    private boolean l(a0 a0Var) {
        if (a0Var.v0()) {
            return true;
        }
        TreeSet treeSet = new TreeSet();
        for (int i10 = 0; i10 < a0Var.l0(); i10++) {
            org.locationtech.jts.geom.a aVarC0 = ((d0) a0Var.h0(i10)).c0();
            if (treeSet.contains(aVarC0)) {
                this.f338760c = aVarC0;
                return false;
            }
            treeSet.add(aVarC0);
        }
        return true;
    }

    private boolean m(n nVar) {
        Iterator it = org.locationtech.jts.geom.util.l.h(nVar).iterator();
        while (it.hasNext()) {
            if (!k((x) it.next())) {
                int i10 = 6 >> 0;
                return false;
            }
        }
        return true;
    }

    public org.locationtech.jts.geom.a c() {
        return this.f338760c;
    }

    public boolean f() {
        this.f338760c = null;
        return b(this.f338758a);
    }

    public boolean g(v vVar) {
        return k(vVar);
    }

    public boolean h(z zVar) {
        return k(zVar);
    }

    public boolean i(a0 a0Var) {
        return l(a0Var);
    }

    public d(n nVar) {
        this.f338759b = true;
        this.f338760c = null;
        this.f338758a = nVar;
    }

    public d(n nVar, org.locationtech.jts.algorithm.c cVar) {
        this.f338759b = true;
        this.f338760c = null;
        this.f338758a = nVar;
        this.f338759b = !cVar.a(2);
    }
}
