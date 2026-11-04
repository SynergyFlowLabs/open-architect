package org.locationtech.jts.operation.buffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.locationtech.jts.geom.i0;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geomgraph.o;

/* JADX INFO: loaded from: classes14.dex */
class e implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f338711b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f338712c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338713d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m f338714e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f338710a = new j();

    private void b(o oVar, Stack stack) {
        oVar.l(true);
        this.f338712c.add(oVar);
        Iterator itM = ((org.locationtech.jts.geomgraph.c) oVar.p()).m();
        while (itM.hasNext()) {
            org.locationtech.jts.geomgraph.b bVar = (org.locationtech.jts.geomgraph.b) itM.next();
            this.f338711b.add(bVar);
            o oVarR = bVar.N().r();
            if (!oVarR.h()) {
                stack.push(oVarR);
            }
        }
    }

    private void c(o oVar) {
        Stack stack = new Stack();
        stack.add(oVar);
        while (!stack.empty()) {
            b((o) stack.pop(), stack);
        }
    }

    private void k() {
        Iterator it = this.f338711b.iterator();
        while (it.hasNext()) {
            ((org.locationtech.jts.geomgraph.b) it.next()).f0(false);
        }
    }

    private void n(org.locationtech.jts.geomgraph.b bVar) {
        HashSet hashSet = new HashSet();
        LinkedList linkedList = new LinkedList();
        o oVarR = bVar.r();
        linkedList.addLast(oVarR);
        hashSet.add(oVarR);
        bVar.f0(true);
        while (!linkedList.isEmpty()) {
            o oVar = (o) linkedList.removeFirst();
            hashSet.add(oVar);
            o(oVar);
            Iterator itM = ((org.locationtech.jts.geomgraph.c) oVar.p()).m();
            while (itM.hasNext()) {
                org.locationtech.jts.geomgraph.b bVarN = ((org.locationtech.jts.geomgraph.b) itM.next()).N();
                if (!bVarN.U()) {
                    o oVarR2 = bVarN.r();
                    if (!hashSet.contains(oVarR2)) {
                        linkedList.addLast(oVarR2);
                        hashSet.add(oVarR2);
                    }
                }
            }
        }
    }

    private void o(o oVar) {
        org.locationtech.jts.geomgraph.b bVar;
        Iterator itM = ((org.locationtech.jts.geomgraph.c) oVar.p()).m();
        do {
            if (!itM.hasNext()) {
                bVar = null;
                break;
            } else {
                bVar = (org.locationtech.jts.geomgraph.b) itM.next();
                if (bVar.U()) {
                    break;
                }
            }
        } while (!bVar.N().U());
        if (bVar == null) {
            throw new i0("unable to find edge to compute depths at " + oVar.b());
        }
        ((org.locationtech.jts.geomgraph.c) oVar.p()).q(bVar);
        Iterator itM2 = ((org.locationtech.jts.geomgraph.c) oVar.p()).m();
        while (itM2.hasNext()) {
            org.locationtech.jts.geomgraph.b bVar2 = (org.locationtech.jts.geomgraph.b) itM2.next();
            bVar2.f0(true);
            p(bVar2);
        }
    }

    private void p(org.locationtech.jts.geomgraph.b bVar) {
        org.locationtech.jts.geomgraph.b bVarN = bVar.N();
        bVarN.W(1, bVar.D(2));
        bVarN.W(2, bVar.D(1));
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        double d10 = this.f338713d.f338092a;
        double d11 = ((e) obj).f338713d.f338092a;
        if (d10 < d11) {
            return -1;
        }
        return d10 > d11 ? 1 : 0;
    }

    public void l(int i10) {
        k();
        org.locationtech.jts.geomgraph.b bVarF = this.f338710a.f();
        bVarF.r();
        bVarF.q();
        bVarF.X(2, i10);
        p(bVarF);
        n(bVarF);
    }

    public void q(o oVar) {
        c(oVar);
        this.f338710a.b(this.f338711b);
        this.f338713d = this.f338710a.e();
    }

    public void r() {
        for (org.locationtech.jts.geomgraph.b bVar : this.f338711b) {
            if (bVar.D(2) >= 1 && bVar.D(1) <= 0 && !bVar.S()) {
                bVar.Z(true);
            }
        }
    }

    public List s() {
        return this.f338711b;
    }

    public m t() {
        if (this.f338714e == null) {
            m mVar = new m();
            Iterator it = this.f338711b.iterator();
            while (it.hasNext()) {
                org.locationtech.jts.geom.a[] aVarArrR = ((org.locationtech.jts.geomgraph.b) it.next()).p().r();
                for (int i10 = 0; i10 < aVarArrR.length - 1; i10++) {
                    mVar.x(aVarArrR[i10]);
                }
            }
            this.f338714e = mVar;
        }
        return this.f338714e;
    }

    public List v() {
        return this.f338712c;
    }

    public org.locationtech.jts.geom.a w() {
        return this.f338713d;
    }
}
