package org.locationtech.jts.algorithm.locate;

import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.f0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.u;
import org.locationtech.jts.geom.util.l;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.index.intervalrtree.d;

/* JADX INFO: loaded from: classes14.dex */
public class a implements org.locationtech.jts.algorithm.locate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2421a f338019a;

    /* JADX INFO: renamed from: org.locationtech.jts.algorithm.locate.a$a, reason: collision with other inner class name */
    private static class C2421a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f338020a = new d();

        public C2421a(n nVar) {
            b(nVar);
        }

        private void a(org.locationtech.jts.geom.a[] aVarArr) {
            for (int i10 = 1; i10 < aVarArr.length; i10++) {
                u uVar = new u(aVarArr[i10 - 1], aVarArr[i10]);
                this.f338020a.e(Math.min(uVar.f338211a.f338093b, uVar.f338212b.f338093b), Math.max(uVar.f338211a.f338093b, uVar.f338212b.f338093b), uVar);
            }
        }

        private void b(n nVar) {
            Iterator it = l.h(nVar).iterator();
            while (it.hasNext()) {
                a(((v) it.next()).d0());
            }
        }

        public List c(double d10, double d11) {
            qm.a aVar = new qm.a();
            this.f338020a.g(d10, d11, aVar);
            return aVar.b();
        }

        public void d(double d10, double d11, qm.b bVar) {
            this.f338020a.g(d10, d11, bVar);
        }
    }

    private static class b implements qm.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private org.locationtech.jts.algorithm.v f338021a;

        public b(org.locationtech.jts.algorithm.v vVar) {
            this.f338021a = vVar;
        }

        @Override // qm.b
        public void a(Object obj) {
            u uVar = (u) obj;
            this.f338021a.a(uVar.s(0), uVar.s(1));
        }
    }

    public a(n nVar) {
        if (!(nVar instanceof f0) && !(nVar instanceof x)) {
            throw new IllegalArgumentException("Argument must be Polygonal or LinearRing");
        }
        this.f338019a = new C2421a(nVar);
    }

    @Override // org.locationtech.jts.algorithm.locate.b
    public int a(org.locationtech.jts.geom.a aVar) {
        org.locationtech.jts.algorithm.v vVar = new org.locationtech.jts.algorithm.v(aVar);
        b bVar = new b(vVar);
        C2421a c2421a = this.f338019a;
        double d10 = aVar.f338093b;
        c2421a.d(d10, d10, bVar);
        return vVar.b();
    }
}
