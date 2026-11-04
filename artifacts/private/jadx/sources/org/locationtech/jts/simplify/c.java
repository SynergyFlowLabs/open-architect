package org.locationtech.jts.simplify;

import java.util.List;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.index.quadtree.f f339010a = new org.locationtech.jts.index.quadtree.f();

    public void a(u uVar) {
        this.f339010a.a(new m(uVar.f338211a, uVar.f338212b), uVar);
    }

    public void b(f fVar) {
        int i10 = 5 & 0;
        for (e eVar : fVar.k()) {
            a(eVar);
        }
    }

    public List c(u uVar) {
        m mVar = new m(uVar.f338211a, uVar.f338212b);
        d dVar = new d(uVar);
        this.f339010a.c(mVar, dVar);
        return dVar.b();
    }

    public void d(u uVar) {
        this.f339010a.d(new m(uVar.f338211a, uVar.f338212b), uVar);
    }
}
