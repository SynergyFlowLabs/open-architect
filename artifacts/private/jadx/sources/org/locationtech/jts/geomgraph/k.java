package org.locationtech.jts.geomgraph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.i0;
import org.locationtech.jts.geom.x;

/* JADX INFO: loaded from: classes14.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f338339a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x f338344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f338345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f338346h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected org.locationtech.jts.geom.r f338348j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338340b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f338341c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f338342d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n f338343e = new n(-1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f338347i = new ArrayList();

    public k(b bVar, org.locationtech.jts.geom.r rVar) {
        this.f338348j = rVar;
        d(bVar);
        e();
    }

    private void c() {
        this.f338340b = 0;
        b bVarL = this.f338339a;
        do {
            int iU = ((c) bVarL.r().p()).u(this);
            if (iU > this.f338340b) {
                this.f338340b = iU;
            }
            bVarL = l(bVarL);
        } while (bVarL != this.f338339a);
        this.f338340b *= 2;
    }

    public void a(k kVar) {
        this.f338347i.add(kVar);
    }

    protected void b(d dVar, boolean z10, boolean z11) {
        org.locationtech.jts.geom.a[] aVarArrR = dVar.r();
        if (z10) {
            for (int i10 = !z11 ? 1 : 0; i10 < aVarArrR.length; i10++) {
                this.f338342d.add(aVarArrR[i10]);
            }
            return;
        }
        int length = aVarArrR.length - 2;
        if (z11) {
            length = aVarArrR.length - 1;
        }
        while (length >= 0) {
            this.f338342d.add(aVarArrR[length]);
            length--;
        }
    }

    protected void d(b bVar) {
        this.f338339a = bVar;
        boolean z10 = true;
        while (bVar != null) {
            if (bVar.H() == this) {
                throw new i0("Directed Edge visited twice during ring-building at " + bVar.k());
            }
            this.f338341c.add(bVar);
            n nVarQ = bVar.q();
            org.locationtech.jts.util.a.c(nVarQ.g());
            q(nVarQ);
            b(bVar.p(), bVar.O(), z10);
            s(bVar, this);
            bVar = l(bVar);
            if (bVar == this.f338339a) {
                return;
            } else {
                z10 = false;
            }
        }
        throw new i0("Found null DirectedEdge");
    }

    public void e() {
        if (this.f338344f != null) {
            return;
        }
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[this.f338342d.size()];
        for (int i10 = 0; i10 < this.f338342d.size(); i10++) {
            aVarArr[i10] = (org.locationtech.jts.geom.a) this.f338342d.get(i10);
        }
        x xVarK = this.f338348j.k(aVarArr);
        this.f338344f = xVarK;
        this.f338345g = org.locationtech.jts.algorithm.s.b(xVarK.d0());
    }

    public boolean f(org.locationtech.jts.geom.a aVar) {
        x xVarJ = j();
        if (xVarJ.f0().n(aVar) && org.locationtech.jts.algorithm.t.a(aVar, xVarJ.d0())) {
            Iterator it = this.f338347i.iterator();
            while (it.hasNext()) {
                if (((k) it.next()).f(aVar)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public org.locationtech.jts.geom.a g(int i10) {
        return (org.locationtech.jts.geom.a) this.f338342d.get(i10);
    }

    public List h() {
        return this.f338341c;
    }

    public n i() {
        return this.f338343e;
    }

    public x j() {
        return this.f338344f;
    }

    public int k() {
        if (this.f338340b < 0) {
            c();
        }
        return this.f338340b;
    }

    public abstract b l(b bVar);

    public k m() {
        return this.f338346h;
    }

    public boolean n() {
        return this.f338345g;
    }

    public boolean o() {
        return this.f338343e.c() == 1;
    }

    public boolean p() {
        return this.f338346h == null;
    }

    protected void q(n nVar) {
        r(nVar, 0);
        int i10 = 1 >> 1;
        r(nVar, 1);
    }

    protected void r(n nVar, int i10) {
        int iE = nVar.e(i10, 2);
        if (iE != -1 && this.f338343e.d(i10) == -1) {
            this.f338343e.p(i10, iE);
        }
    }

    public abstract void s(b bVar, k kVar);

    public void t() {
        b bVarL = this.f338339a;
        do {
            bVarL.p().j(true);
            bVarL = bVarL.L();
        } while (bVarL != this.f338339a);
    }

    public void u(k kVar) {
        this.f338346h = kVar;
        if (kVar != null) {
            kVar.a(this);
        }
    }

    public e0 v(org.locationtech.jts.geom.r rVar) {
        x[] xVarArr = new x[this.f338347i.size()];
        for (int i10 = 0; i10 < this.f338347i.size(); i10++) {
            xVarArr[i10] = ((k) this.f338347i.get(i10)).j();
        }
        return rVar.B(j(), xVarArr);
    }
}
