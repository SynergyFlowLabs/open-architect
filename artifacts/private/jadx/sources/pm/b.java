package pm;

import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f350214a = 0.25d;

    public static double b(m mVar) {
        if (mVar.d0()) {
            return 0.0d;
        }
        double dN = mVar.N();
        double dE = mVar.E();
        return Math.sqrt((dN * dN) + (dE * dE));
    }

    @Override // pm.c
    public double a(n nVar, n nVar2) {
        double dE = om.a.e(nVar, nVar2, 0.25d);
        m mVar = new m(nVar.f0());
        mVar.z(nVar2.f0());
        return 1.0d - (dE / b(mVar));
    }
}
