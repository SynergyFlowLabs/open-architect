package org.locationtech.jts.triangulate;

import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
public class j implements d {
    public static org.locationtech.jts.geom.a b(k kVar, org.locationtech.jts.geom.a aVar) {
        return kVar.g().U(aVar);
    }

    @Override // org.locationtech.jts.triangulate.d
    public org.locationtech.jts.geom.a a(k kVar, org.locationtech.jts.geom.a aVar) {
        u uVarG = kVar.g();
        double dT = uVarG.t() / 2.0d;
        l lVar = new l(uVarG);
        org.locationtech.jts.geom.a aVarB = b(kVar, aVar);
        double dL = aVarB.l(aVar) * 2.0d * 0.8d;
        if (dL <= dT) {
            dT = dL;
        }
        lVar.d(dT);
        lVar.f(aVarB);
        return lVar.b();
    }
}
