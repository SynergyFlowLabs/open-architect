package org.locationtech.jts.edgegraph;

import org.locationtech.jts.algorithm.s;
import org.locationtech.jts.geomgraph.t;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f338084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f338085c;

    public c(org.locationtech.jts.geom.a aVar) {
        this.f338083a = aVar;
    }

    public static c c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        c cVar = new c(aVar);
        cVar.k(new c(aVar2));
        return cVar;
    }

    public static c j(c cVar, c cVar2) {
        if (cVar.f338084b != null || cVar2.f338084b != null || cVar.f338085c != null || cVar2.f338085c != null) {
            throw new IllegalStateException("Edges are already initialized");
        }
        cVar.k(cVar2);
        return cVar;
    }

    private void m(c cVar) {
        org.locationtech.jts.util.a.a(this.f338083a, cVar.p());
        c cVarO = o();
        this.f338084b.s(cVar);
        cVar.u().s(cVarO);
    }

    private void t(c cVar) {
        this.f338084b = cVar;
    }

    public int a(c cVar) {
        double dE = e();
        double dF = f();
        double dE2 = cVar.e();
        double dF2 = cVar.f();
        if (dE == dE2 && dF == dF2) {
            return 0;
        }
        double dE3 = t.e(dE, dF);
        double dE4 = t.e(dE2, dF2);
        if (dE3 > dE4) {
            return 1;
        }
        if (dE3 < dE4) {
            return -1;
        }
        return s.a(cVar.f338083a, cVar.g(), g());
    }

    public int b(Object obj) {
        return a((c) obj);
    }

    public int d() {
        int i10 = 0;
        c cVarO = this;
        do {
            i10++;
            cVarO = cVarO.o();
        } while (cVarO != this);
        return i10;
    }

    public double e() {
        return this.f338084b.f338083a.f338092a - this.f338083a.f338092a;
    }

    public double f() {
        return this.f338084b.f338083a.f338093b - this.f338083a.f338093b;
    }

    public org.locationtech.jts.geom.a g() {
        return this.f338084b.f338083a;
    }

    public boolean h(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (!this.f338083a.p(aVar) || !this.f338084b.f338083a.equals(aVar2)) {
            return false;
        }
        int i10 = 4 >> 1;
        return true;
    }

    public c i(org.locationtech.jts.geom.a aVar) {
        c cVarO = this;
        while (cVarO != null) {
            if (cVarO.g().p(aVar)) {
                return cVarO;
            }
            cVarO = cVarO.o();
            if (cVarO == this) {
                return null;
            }
        }
        return null;
    }

    protected void k(c cVar) {
        t(cVar);
        cVar.t(this);
        s(cVar);
        cVar.s(this);
    }

    public void l(c cVar) {
        if (o() == this) {
            m(cVar);
            return;
        }
        int iB = b(cVar);
        c cVar2 = this;
        while (true) {
            c cVarO = cVar2.o();
            if (cVarO.b(cVar) != iB || cVarO == this) {
                break;
            }
            if (cVarO == this) {
                org.locationtech.jts.util.a.e();
                return;
            }
            cVar2 = cVarO;
        }
        cVar2.m(cVar);
    }

    public c n() {
        return this.f338085c;
    }

    public c o() {
        return this.f338084b.f338085c;
    }

    public org.locationtech.jts.geom.a p() {
        return this.f338083a;
    }

    public c q() {
        return this.f338084b.n().f338084b;
    }

    public c r() {
        c cVarQ = this;
        while (cVarQ.d() == 2) {
            cVarQ = cVarQ.q();
            if (cVarQ == this) {
                return null;
            }
        }
        return cVarQ;
    }

    public void s(c cVar) {
        this.f338085c = cVar;
    }

    public String toString() {
        return "HE(" + this.f338083a.f338092a + " " + this.f338083a.f338093b + ", " + this.f338084b.f338083a.f338092a + " " + this.f338084b.f338083a.f338093b + ")";
    }

    public c u() {
        return this.f338084b;
    }
}
