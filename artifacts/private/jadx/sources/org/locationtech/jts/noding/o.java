package org.locationtech.jts.noding;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final org.locationtech.jts.geom.r f338604c = new org.locationtech.jts.geom.r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.algorithm.o f338605a = new org.locationtech.jts.algorithm.y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection f338606b;

    public o(Collection collection) {
        this.f338606b = collection;
    }

    private void a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        if (aVar.equals(aVar3)) {
            throw new RuntimeException("found non-noded collapse at " + f338604c.h(new org.locationtech.jts.geom.a[]{aVar, aVar2, aVar3}));
        }
    }

    private void b() {
        Iterator it = this.f338606b.iterator();
        while (it.hasNext()) {
            c((y) it.next());
        }
    }

    private void c(y yVar) {
        org.locationtech.jts.geom.a[] aVarArrN = yVar.n();
        int i10 = 0;
        while (i10 < aVarArrN.length - 2) {
            int i11 = i10 + 1;
            a(aVarArrN[i10], aVarArrN[i11], aVarArrN[i10 + 2]);
            i10 = i11;
        }
    }

    private void d() {
        Iterator it = this.f338606b.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geom.a[] aVarArrN = ((y) it.next()).n();
            e(aVarArrN[0], this.f338606b);
            e(aVarArrN[aVarArrN.length - 1], this.f338606b);
        }
    }

    private void e(org.locationtech.jts.geom.a aVar, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geom.a[] aVarArrN = ((y) it.next()).n();
            for (int i10 = 1; i10 < aVarArrN.length - 1; i10++) {
                if (aVarArrN[i10].equals(aVar)) {
                    throw new RuntimeException("found endpt/interior pt intersection at index " + i10 + " :pt " + aVar);
                }
            }
        }
    }

    private void f() {
        for (y yVar : this.f338606b) {
            Iterator it = this.f338606b.iterator();
            while (it.hasNext()) {
                h(yVar, (y) it.next());
            }
        }
    }

    private void g(y yVar, int i10, y yVar2, int i11) {
        if (yVar == yVar2 && i10 == i11) {
            return;
        }
        org.locationtech.jts.geom.a aVar = yVar.n()[i10];
        org.locationtech.jts.geom.a aVar2 = yVar.n()[i10 + 1];
        org.locationtech.jts.geom.a aVar3 = yVar2.n()[i11];
        org.locationtech.jts.geom.a aVar4 = yVar2.n()[i11 + 1];
        this.f338605a.f(aVar, aVar2, aVar3, aVar4);
        if (this.f338605a.n()) {
            if (this.f338605a.t() || j(this.f338605a, aVar, aVar2) || j(this.f338605a, aVar3, aVar4)) {
                throw new RuntimeException("found non-noded intersection at " + aVar + "-" + aVar2 + " and " + aVar3 + "-" + aVar4);
            }
        }
    }

    private void h(y yVar, y yVar2) {
        org.locationtech.jts.geom.a[] aVarArrN = yVar.n();
        org.locationtech.jts.geom.a[] aVarArrN2 = yVar2.n();
        for (int i10 = 0; i10 < aVarArrN.length - 1; i10++) {
            for (int i11 = 0; i11 < aVarArrN2.length - 1; i11++) {
                g(yVar, i10, yVar2, i11);
            }
        }
    }

    private boolean j(org.locationtech.jts.algorithm.o oVar, org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        for (int i10 = 0; i10 < oVar.l(); i10++) {
            org.locationtech.jts.geom.a aVarJ = oVar.j(i10);
            if (!aVarJ.equals(aVar) && !aVarJ.equals(aVar2)) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        d();
        f();
        b();
    }
}
