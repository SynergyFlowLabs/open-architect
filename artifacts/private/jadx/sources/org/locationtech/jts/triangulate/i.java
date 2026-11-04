package org.locationtech.jts.triangulate;

/* JADX INFO: loaded from: classes14.dex */
public class i implements d {
    @Override // org.locationtech.jts.triangulate.d
    public org.locationtech.jts.geom.a a(k kVar, org.locationtech.jts.geom.a aVar) {
        org.locationtech.jts.geom.a aVarH = kVar.h();
        org.locationtech.jts.geom.a aVarC = kVar.c();
        return new org.locationtech.jts.geom.a((aVarH.f338092a + aVarC.f338092a) / 2.0d, (aVarH.f338093b + aVarC.f338093b) / 2.0d);
    }
}
