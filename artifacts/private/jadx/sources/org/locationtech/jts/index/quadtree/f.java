package org.locationtech.jts.index.quadtree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public class f implements qm.c, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f338437c = -7461163625812743604L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338439b = 1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f338438a = new g();

    private void e(m mVar) {
        double dN = mVar.N();
        if (dN < this.f338439b && dN > 0.0d) {
            this.f338439b = dN;
        }
        double dE = mVar.E();
        if (dE >= this.f338439b || dE <= 0.0d) {
            return;
        }
        this.f338439b = dE;
    }

    public static m g(m mVar, double d10) {
        double dL = mVar.L();
        double dH = mVar.H();
        double dM = mVar.M();
        double dI = mVar.I();
        if (dL != dH && dM != dI) {
            return mVar;
        }
        if (dL == dH) {
            double d11 = d10 / 2.0d;
            dL -= d11;
            dH = d11 + dL;
        }
        double d12 = dL;
        double d13 = dH;
        if (dM == dI) {
            double d14 = d10 / 2.0d;
            dM -= d14;
            dI = dM + d14;
        }
        return new m(d12, d13, dM, dI);
    }

    @Override // qm.c
    public void a(m mVar, Object obj) {
        e(mVar);
        this.f338438a.p(g(mVar, this.f338439b), obj);
    }

    @Override // qm.c
    public List b(m mVar) {
        qm.a aVar = new qm.a();
        c(mVar, aVar);
        return aVar.b();
    }

    @Override // qm.c
    public void c(m mVar, qm.b bVar) {
        this.f338438a.n(mVar, bVar);
    }

    @Override // qm.c
    public boolean d(m mVar, Object obj) {
        return this.f338438a.l(g(mVar, this.f338439b), obj);
    }

    public int f() {
        g gVar = this.f338438a;
        if (gVar != null) {
            return gVar.d();
        }
        return 0;
    }

    public boolean h() {
        g gVar = this.f338438a;
        if (gVar == null) {
            return true;
        }
        return gVar.i();
    }

    public List i() {
        ArrayList arrayList = new ArrayList();
        this.f338438a.b(arrayList);
        return arrayList;
    }

    public int j() {
        g gVar = this.f338438a;
        if (gVar != null) {
            return gVar.m();
        }
        return 0;
    }
}
