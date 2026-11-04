package org.locationtech.jts.noding.snapround;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.o;
import org.locationtech.jts.algorithm.y;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.noding.i;
import org.locationtech.jts.noding.m;
import org.locationtech.jts.noding.n;

/* JADX INFO: loaded from: classes14.dex */
public class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f338653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f338654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f338655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Collection f338656d;

    public e(g0 g0Var) {
        this.f338653a = g0Var;
        y yVar = new y();
        this.f338654b = yVar;
        yVar.w(g0Var);
        this.f338655c = g0Var.o();
    }

    private void c(Collection collection) {
        try {
            new org.locationtech.jts.noding.o(m.g(collection)).i();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            e((m) it.next(), collection2);
        }
    }

    private void e(m mVar, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b bVar = new b((org.locationtech.jts.geom.a) it.next(), this.f338655c, this.f338654b);
            for (int i10 = 0; i10 < mVar.size() - 1; i10++) {
                bVar.a(mVar, i10);
            }
        }
    }

    private void g(m mVar, m mVar2) {
        org.locationtech.jts.geom.a[] aVarArrN = mVar.n();
        org.locationtech.jts.geom.a[] aVarArrN2 = mVar2.n();
        for (int i10 = 0; i10 < aVarArrN.length - 1; i10++) {
            b bVar = new b(aVarArrN[i10], this.f338655c, this.f338654b);
            for (int i11 = 0; i11 < aVarArrN2.length - 1; i11++) {
                if ((mVar != mVar2 || i10 != i11) && bVar.a(mVar2, i11)) {
                    mVar.b(aVarArrN[i10], i10);
                }
            }
        }
    }

    private List h(Collection collection, o oVar) {
        org.locationtech.jts.noding.e eVar = new org.locationtech.jts.noding.e(oVar);
        i iVar = new i();
        iVar.c(eVar);
        iVar.a(collection);
        return eVar.b();
    }

    private void i(Collection collection, o oVar) {
        d(collection, h(collection, oVar));
        f(collection);
    }

    @Override // org.locationtech.jts.noding.n
    public void a(Collection collection) {
        this.f338656d = collection;
        i(collection, this.f338654b);
    }

    @Override // org.locationtech.jts.noding.n
    public Collection b() {
        return m.g(this.f338656d);
    }

    public void f(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                g(mVar, (m) it2.next());
            }
        }
    }
}
