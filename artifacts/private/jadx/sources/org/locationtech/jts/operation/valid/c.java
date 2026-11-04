package org.locationtech.jts.operation.valid;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.algorithm.t;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.geomgraph.l;
import org.locationtech.jts.index.strtree.k;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f338919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f338920b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f338921c = new m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private qm.c f338922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338923e;

    public c(l lVar) {
        this.f338919a = lVar;
    }

    private void b() {
        this.f338922d = new k();
        for (int i10 = 0; i10 < this.f338920b.size(); i10++) {
            x xVar = (x) this.f338920b.get(i10);
            this.f338922d.a(xVar.f0(), xVar);
        }
    }

    public void a(x xVar) {
        this.f338920b.add(xVar);
        this.f338921c.z(xVar.f0());
    }

    public org.locationtech.jts.geom.a c() {
        return this.f338923e;
    }

    public boolean d() {
        org.locationtech.jts.geom.a aVarW;
        b();
        for (int i10 = 0; i10 < this.f338920b.size(); i10++) {
            x xVar = (x) this.f338920b.get(i10);
            org.locationtech.jts.geom.a[] aVarArrD0 = xVar.d0();
            List listB = this.f338922d.b(xVar.f0());
            for (int i11 = 0; i11 < listB.size(); i11++) {
                x xVar2 = (x) listB.get(i11);
                org.locationtech.jts.geom.a[] aVarArrD1 = xVar2.d0();
                if (xVar != xVar2 && xVar.f0().c0(xVar2.f0()) && (aVarW = d.w(aVarArrD0, xVar2, this.f338919a)) != null && t.a(aVarW, aVarArrD1)) {
                    this.f338923e = aVarW;
                    return false;
                }
            }
        }
        return true;
    }
}
