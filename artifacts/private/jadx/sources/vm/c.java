package vm;

import org.locationtech.jts.geom.e;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.v;
import tm.d;
import tm.f;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f385779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f385780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f385781c;

    public c(e0 e0Var) {
        this.f385781c = -1;
        this.f385780b = e0Var;
        d dVarC = c(e0Var);
        this.f385779a = dVarC;
        this.f385781c = dVarC.a();
    }

    private f a(e eVar) {
        int size = eVar.size();
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a(0.0d, 0.0d, 0.0d);
        org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a(0.0d, 0.0d, 0.0d);
        org.locationtech.jts.geom.a aVar3 = new org.locationtech.jts.geom.a(0.0d, 0.0d, 0.0d);
        int i10 = 0;
        while (i10 < size - 1) {
            eVar.Ob(i10, aVar2);
            i10++;
            eVar.Ob(i10, aVar3);
            double d10 = aVar.f338092a;
            double d11 = aVar2.f338093b - aVar3.f338093b;
            double d12 = aVar2.f338094c;
            double d13 = aVar3.f338094c;
            aVar.f338092a = d10 + (d11 * (d12 + d13));
            double d14 = aVar.f338093b;
            double d15 = d12 - d13;
            double d16 = aVar2.f338092a;
            double d17 = aVar3.f338092a;
            aVar.f338093b = d14 + (d15 * (d16 + d17));
            aVar.f338094c += (d16 - d17) * (aVar2.f338093b + aVar3.f338093b);
        }
        double d18 = size;
        aVar.f338092a /= d18;
        aVar.f338093b /= d18;
        aVar.f338094c /= d18;
        return f.b(aVar).m();
    }

    private org.locationtech.jts.geom.a b(e eVar) {
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a(0.0d, 0.0d, 0.0d);
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            aVar.f338092a += eVar.ij(i10, 0);
            aVar.f338093b += eVar.ij(i10, 1);
            aVar.f338094c += eVar.ij(i10, 2);
        }
        double d10 = size;
        aVar.f338092a /= d10;
        aVar.f338093b /= d10;
        aVar.f338094c /= d10;
        return aVar;
    }

    private d c(e0 e0Var) {
        e eVarS0 = e0Var.R0().S0();
        return new d(a(eVarS0), b(eVarS0));
    }

    private int h(org.locationtech.jts.geom.a aVar, v vVar) {
        return org.locationtech.jts.algorithm.v.e(i(aVar, this.f385781c), j(vVar.S0(), this.f385781c));
    }

    private static org.locationtech.jts.geom.a i(org.locationtech.jts.geom.a aVar, int i10) {
        if (i10 != 1) {
            return i10 != 3 ? new org.locationtech.jts.geom.a(aVar.f338093b, aVar.f338094c) : new org.locationtech.jts.geom.a(aVar.f338092a, aVar.f338094c);
        }
        return new org.locationtech.jts.geom.a(aVar.f338092a, aVar.f338093b);
    }

    private static e j(e eVar, int i10) {
        if (i10 != 1) {
            return i10 != 3 ? a.e(eVar) : a.d(eVar);
        }
        return a.c(eVar);
    }

    public d d() {
        return this.f385779a;
    }

    public e0 e() {
        return this.f385780b;
    }

    public boolean f(org.locationtech.jts.geom.a aVar) {
        int i10 = 6 << 2;
        if (2 == h(aVar, this.f385780b.R0())) {
            return false;
        }
        for (int i11 = 0; i11 < this.f385780b.T0(); i11++) {
            if (h(aVar, this.f385780b.S0(i11)) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean g(org.locationtech.jts.geom.a aVar, v vVar) {
        return 2 != org.locationtech.jts.algorithm.v.e(i(aVar, this.f385781c), j(vVar.S0(), this.f385781c));
    }
}
