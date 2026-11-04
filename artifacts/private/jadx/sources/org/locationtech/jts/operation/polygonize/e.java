package org.locationtech.jts.operation.polygonize;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.q;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f338877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected d f338878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Collection f338879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected List f338880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected List f338881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected List f338882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected List f338883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected List f338884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f338885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f338886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private r f338887k;

    private static class a implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f338888a;

        a(e eVar) {
            this.f338888a = eVar;
        }

        @Override // org.locationtech.jts.geom.q
        public void a(n nVar) {
            if (nVar instanceof v) {
                this.f338888a.d((v) nVar);
            }
        }
    }

    public e() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(v vVar) {
        r rVarG0 = vVar.g0();
        this.f338887k = rVarG0;
        if (this.f338878b == null) {
            this.f338878b = new d(rVarG0);
        }
        this.f338878b.p(vVar);
    }

    private static void e(org.locationtech.jts.operation.polygonize.a aVar, List list) {
        org.locationtech.jts.operation.polygonize.a aVarH = org.locationtech.jts.operation.polygonize.a.h(aVar, list);
        if (aVarH != null) {
            aVarH.d(aVar);
        }
    }

    private static void f(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((org.locationtech.jts.operation.polygonize.a) it.next(), list2);
        }
    }

    private static List g(List list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.operation.polygonize.a aVar = (org.locationtech.jts.operation.polygonize.a) it.next();
            if (z10 || aVar.r()) {
                arrayList.add(aVar.l());
            }
        }
        return arrayList;
    }

    private static void h(List list) {
        boolean z10;
        i(list);
        do {
            Iterator it = list.iterator();
            z10 = false;
            while (it.hasNext()) {
                org.locationtech.jts.operation.polygonize.a aVar = (org.locationtech.jts.operation.polygonize.a) it.next();
                if (!aVar.s()) {
                    aVar.B();
                    if (!aVar.s()) {
                        z10 = true;
                    }
                }
            }
        } while (z10);
    }

    private static void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.operation.polygonize.a aVar = (org.locationtech.jts.operation.polygonize.a) it.next();
            org.locationtech.jts.operation.polygonize.a aVarK = aVar.k();
            if (aVarK != null && !aVarK.v()) {
                aVar.y(true);
                aVarK.z(true);
            }
        }
    }

    private void j(List list) {
        this.f338882f = new ArrayList();
        this.f338883g = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.operation.polygonize.a aVar = (org.locationtech.jts.operation.polygonize.a) it.next();
            aVar.f();
            if (aVar.p()) {
                this.f338882f.add(aVar);
            } else {
                this.f338883g.add(aVar);
            }
        }
    }

    private void k(List list, List list2, List list3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.operation.polygonize.a aVar = (org.locationtech.jts.operation.polygonize.a) it.next();
            if (aVar.w()) {
                list2.add(aVar);
            } else {
                list3.add(aVar.j());
            }
        }
    }

    private void q() {
        boolean z10;
        if (this.f338884h != null) {
            return;
        }
        this.f338884h = new ArrayList();
        d dVar = this.f338878b;
        if (dVar == null) {
            return;
        }
        this.f338879c = dVar.y();
        this.f338880d = this.f338878b.x();
        List listE = this.f338878b.E();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f338881e = arrayList2;
        if (this.f338885i) {
            k(listE, arrayList, arrayList2);
            listE = arrayList;
        }
        j(listE);
        f(this.f338882f, this.f338883g);
        Collections.sort(this.f338883g, new org.locationtech.jts.operation.polygonize.a.C2426a());
        if (this.f338886j) {
            h(this.f338883g);
            z10 = false;
        } else {
            z10 = true;
        }
        this.f338884h = g(this.f338883g, z10);
    }

    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((n) it.next());
        }
    }

    public void c(n nVar) {
        nVar.d(this.f338877a);
    }

    public Collection l() {
        q();
        return this.f338880d;
    }

    public Collection m() {
        q();
        return this.f338879c;
    }

    public n n() {
        if (this.f338887k == null) {
            this.f338887k = new r();
        }
        q();
        return this.f338886j ? this.f338887k.b(this.f338884h) : this.f338887k.e(r.I(this.f338884h));
    }

    public Collection o() {
        q();
        return this.f338881e;
    }

    public Collection p() {
        q();
        return this.f338884h;
    }

    public void r(boolean z10) {
        this.f338885i = z10;
    }

    public e(boolean z10) {
        this.f338877a = new a(this);
        this.f338879c = new ArrayList();
        this.f338880d = new ArrayList();
        this.f338881e = new ArrayList();
        this.f338882f = null;
        this.f338883g = null;
        this.f338884h = null;
        this.f338885i = true;
        this.f338887k = null;
        this.f338886j = z10;
    }
}
