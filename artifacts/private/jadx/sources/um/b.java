package um;

import java.util.ArrayList;
import java.util.Iterator;
import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.util.l;
import rm.o;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f381289l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final double f381290m = 0.012d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f381291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f381292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f381293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f381294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f381295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f381296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f381297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f381298h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f381299i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private org.locationtech.jts.geom.a f381300j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private n f381301k = null;

    public b(n nVar, double d10, n nVar2) {
        this.f381291a = nVar;
        this.f381292b = d10;
        this.f381293c = nVar2;
    }

    private void a(n nVar, n nVar2, double d10) {
        om.a aVar = new om.a(nVar2, nVar);
        aVar.h(0.25d);
        double dG = aVar.g();
        this.f381297g = dG;
        if (dG > d10) {
            this.f381298h = false;
            org.locationtech.jts.geom.a[] aVarArrF = aVar.f();
            this.f381300j = aVarArrF[1];
            this.f381301k = nVar.g0().h(aVarArrF);
            this.f381299i = "Distance between buffer curve and input is too large (" + this.f381297g + " at " + o.A(aVarArrF[0], aVarArrF[1]) + ")";
        }
    }

    private void b(n nVar, n nVar2, double d10) {
        org.locationtech.jts.operation.distance.c cVar = new org.locationtech.jts.operation.distance.c(nVar, nVar2, d10);
        double dO = cVar.o();
        this.f381296f = dO;
        if (dO < d10) {
            this.f381298h = false;
            org.locationtech.jts.geom.a[] aVarArrS = cVar.s();
            this.f381300j = cVar.s()[1];
            this.f381301k = nVar.g0().h(aVarArrS);
            this.f381299i = "Distance between buffer curve and input is too small (" + this.f381296f + " at " + o.A(aVarArrS[0], aVarArrS[1]) + " )";
        }
    }

    private void c() {
        n nVar = this.f381291a;
        if ((nVar instanceof e0) || (nVar instanceof b0) || (nVar instanceof org.locationtech.jts.geom.o)) {
            n nVarH = h(nVar);
            b(nVarH, this.f381293c, this.f381294d);
            if (this.f381298h) {
                a(nVarH, this.f381293c, this.f381295e);
            }
        }
    }

    private void d() {
        n nVarY = this.f381293c.Y();
        b(this.f381291a, nVarY, this.f381294d);
        if (this.f381298h) {
            a(this.f381291a, nVarY, this.f381295e);
        }
    }

    private n h(n nVar) {
        ArrayList arrayList = new ArrayList();
        l lVar = new l(arrayList);
        Iterator it = org.locationtech.jts.geom.util.o.b(nVar).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).d(lVar);
        }
        return nVar.g0().b(arrayList);
    }

    public n e() {
        return this.f381301k;
    }

    public org.locationtech.jts.geom.a f() {
        return this.f381300j;
    }

    public String g() {
        return this.f381299i;
    }

    public boolean i() {
        double dAbs = Math.abs(this.f381292b);
        double d10 = f381290m * dAbs;
        this.f381294d = dAbs - d10;
        this.f381295e = dAbs + d10;
        if (this.f381291a.v0() || this.f381293c.v0()) {
            return true;
        }
        if (this.f381292b > 0.0d) {
            d();
        } else {
            c();
        }
        if (f381289l) {
            System.out.println("Min Dist= " + this.f381296f + "  err= " + (1.0d - (this.f381296f / this.f381292b)) + "  Max Dist= " + this.f381297g + "  err= " + ((this.f381297g / this.f381292b) - 1.0d));
        }
        return this.f381298h;
    }
}
