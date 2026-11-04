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
public class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f338647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f338648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f338649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f338650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f338651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Collection f338652f;

    public d(g0 g0Var) {
        this.f338647a = g0Var;
        y yVar = new y();
        this.f338648b = yVar;
        yVar.w(g0Var);
        this.f338649c = g0Var.o();
    }

    private void c(Collection collection) {
        try {
            new org.locationtech.jts.noding.o(m.g(collection)).i();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f338651e.a(new b((org.locationtech.jts.geom.a) it.next(), this.f338649c, this.f338648b));
        }
    }

    private void f(m mVar) {
        org.locationtech.jts.geom.a[] aVarArrN = mVar.n();
        for (int i10 = 0; i10 < aVarArrN.length; i10++) {
            if (this.f338651e.b(new b(aVarArrN[i10], this.f338649c, this.f338648b), mVar, i10)) {
                mVar.b(aVarArrN[i10], i10);
            }
        }
    }

    private List g(Collection collection, o oVar) {
        org.locationtech.jts.noding.e eVar = new org.locationtech.jts.noding.e(oVar);
        this.f338650d.c(eVar);
        this.f338650d.a(collection);
        return eVar.b();
    }

    private void h(Collection collection, o oVar) {
        d(g(collection, oVar));
        e(collection);
    }

    @Override // org.locationtech.jts.noding.n
    public void a(Collection collection) {
        this.f338652f = collection;
        i iVar = new i();
        this.f338650d = iVar;
        this.f338651e = new c(iVar.e());
        h(collection, this.f338648b);
    }

    @Override // org.locationtech.jts.noding.n
    public Collection b() {
        return m.g(this.f338652f);
    }

    public void e(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f((m) it.next());
        }
    }
}
