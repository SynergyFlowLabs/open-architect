package org.locationtech.jts.operation.overlay;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.algorithm.u;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geomgraph.o;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f338826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f338827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f338828c = new ArrayList();

    public h(g gVar, r rVar, u uVar) {
        this.f338826a = gVar;
        this.f338827b = rVar;
    }

    private void b(int i10) {
        for (o oVar : this.f338826a.k().n()) {
            if (!oVar.f() && !oVar.q() && (oVar.p().f() == 0 || i10 == 1)) {
                if (g.s(oVar.c(), i10)) {
                    c(oVar);
                }
            }
        }
    }

    private void c(o oVar) {
        org.locationtech.jts.geom.a aVarB = oVar.b();
        if (this.f338826a.q(aVarB)) {
            return;
        }
        this.f338828c.add(this.f338827b.v(aVarB));
    }

    public List a(int i10) {
        b(i10);
        return this.f338828c;
    }
}
