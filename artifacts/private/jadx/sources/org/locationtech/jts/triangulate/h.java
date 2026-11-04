package org.locationtech.jts.triangulate;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.triangulate.quadedge.f f339071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f339072b;

    public h(org.locationtech.jts.triangulate.quadedge.f fVar) {
        this.f339072b = false;
        this.f339071a = fVar;
        this.f339072b = fVar.i() > 0.0d;
    }

    public org.locationtech.jts.triangulate.quadedge.d a(org.locationtech.jts.triangulate.quadedge.m mVar) {
        org.locationtech.jts.triangulate.quadedge.d dVarN;
        org.locationtech.jts.triangulate.quadedge.d dVarC = this.f339071a.C(mVar);
        if (this.f339071a.z(dVarC, mVar)) {
            return dVarC;
        }
        if (this.f339071a.y(dVarC, mVar.k())) {
            dVarC = dVarC.q();
            this.f339071a.c(dVarC.p());
        }
        org.locationtech.jts.triangulate.quadedge.d dVarE = this.f339071a.E(dVarC.r(), mVar);
        org.locationtech.jts.triangulate.quadedge.d.z(dVarE, dVarC);
        org.locationtech.jts.triangulate.quadedge.d dVarA = dVarE;
        do {
            dVarA = this.f339071a.a(dVarC, dVarA.B());
            dVarC = dVarA.q();
        } while (dVarC.m() != dVarE);
        while (true) {
            org.locationtech.jts.triangulate.quadedge.d dVarQ = dVarC.q();
            if (dVarQ.e().w(dVarC) && mVar.s(dVarC.r(), dVarQ.e(), dVarC.e())) {
                org.locationtech.jts.triangulate.quadedge.d.A(dVarC);
                dVarN = dVarC.q();
            } else {
                if (dVarC.p() == dVarE) {
                    return dVarA;
                }
                dVarN = dVarC.p().n();
            }
            dVarC = dVarN;
        }
    }

    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a((org.locationtech.jts.triangulate.quadedge.m) it.next());
        }
    }
}
