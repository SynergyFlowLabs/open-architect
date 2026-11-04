package org.locationtech.jts.geomgraph;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List f338369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected q f338370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List f338371c;

    public r(p pVar) {
        this.f338369a = new ArrayList();
        this.f338371c = new ArrayList();
        this.f338370b = new q(pVar);
    }

    public static void s(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((c) ((o) it.next()).p()).z();
        }
    }

    private boolean t(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        return aVar.equals(aVar3) && org.locationtech.jts.algorithm.s.a(aVar, aVar2, aVar4) == 0 && t.f(aVar, aVar2) == t.f(aVar3, aVar4);
    }

    public void a(e eVar) {
        this.f338370b.a(eVar);
        this.f338371c.add(eVar);
    }

    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            this.f338369a.add(dVar);
            b bVar = new b(dVar, true);
            b bVar2 = new b(dVar, false);
            bVar.e0(bVar2);
            bVar2.e0(bVar);
            a(bVar);
            a(bVar2);
        }
    }

    public o c(org.locationtech.jts.geom.a aVar) {
        return this.f338370b.b(aVar);
    }

    public o d(o oVar) {
        return this.f338370b.c(oVar);
    }

    void e(Object obj) {
        System.out.print(obj);
    }

    void f(Object obj) {
        System.out.println(obj);
    }

    public o g(org.locationtech.jts.geom.a aVar) {
        return this.f338370b.d(aVar);
    }

    public d h(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        for (int i10 = 0; i10 < this.f338369a.size(); i10++) {
            d dVar = (d) this.f338369a.get(i10);
            org.locationtech.jts.geom.a[] aVarArrR = dVar.r();
            if (aVar.equals(aVarArrR[0]) && aVar2.equals(aVarArrR[1])) {
                return dVar;
            }
        }
        return null;
    }

    public e i(d dVar) {
        for (e eVar : k()) {
            if (eVar.p() == dVar) {
                return eVar;
            }
        }
        return null;
    }

    public d j(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        for (int i10 = 0; i10 < this.f338369a.size(); i10++) {
            d dVar = (d) this.f338369a.get(i10);
            org.locationtech.jts.geom.a[] aVarArrR = dVar.r();
            if (t(aVar, aVar2, aVarArrR[0], aVarArrR[1]) || t(aVar, aVar2, aVarArrR[aVarArrR.length - 1], aVarArrR[aVarArrR.length - 2])) {
                return dVar;
            }
        }
        return null;
    }

    public Collection k() {
        return this.f338371c;
    }

    public Iterator l() {
        return this.f338369a.iterator();
    }

    public Iterator m() {
        return this.f338370b.f();
    }

    public Collection n() {
        return this.f338370b.h();
    }

    protected void o(d dVar) {
        this.f338369a.add(dVar);
    }

    public boolean p(int i10, org.locationtech.jts.geom.a aVar) {
        o oVarD = this.f338370b.d(aVar);
        if (oVarD == null) {
            return false;
        }
        n nVarC = oVarD.c();
        return nVarC != null && nVarC.d(i10) == 1;
    }

    public void q() {
        Iterator itF = this.f338370b.f();
        while (itF.hasNext()) {
            ((c) ((o) itF.next()).p()).x();
        }
    }

    public void r() {
        Iterator itF = this.f338370b.f();
        while (itF.hasNext()) {
            ((c) ((o) itF.next()).p()).z();
        }
    }

    public void u(PrintStream printStream) {
        printStream.println("Edges:");
        for (int i10 = 0; i10 < this.f338369a.size(); i10++) {
            printStream.println("edge " + i10 + ":");
            d dVar = (d) this.f338369a.get(i10);
            dVar.C(printStream);
            dVar.f338280h.g(printStream);
        }
    }

    public r() {
        this.f338369a = new ArrayList();
        this.f338371c = new ArrayList();
        this.f338370b = new q(new p());
    }
}
