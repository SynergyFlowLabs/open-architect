package org.locationtech.jts.index.strtree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f338445e = -3886435814360241337L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f338446f = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected org.locationtech.jts.index.strtree.a f338447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f338449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f338450d;

    protected interface a {
        boolean a(Object obj, Object obj2);
    }

    public b() {
        this(10);
    }

    private boolean B(Object obj, org.locationtech.jts.index.strtree.a aVar, Object obj2) {
        org.locationtech.jts.index.strtree.a aVar2;
        boolean zC = C(aVar, obj2);
        if (zC) {
            return true;
        }
        Iterator it = aVar.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            }
            c cVar = (c) it.next();
            if (o().a(cVar.getBounds(), obj) && (cVar instanceof org.locationtech.jts.index.strtree.a) && (zC = B(obj, (aVar2 = (org.locationtech.jts.index.strtree.a) cVar), obj2))) {
                break;
            }
        }
        if (aVar2 != null && aVar2.c().isEmpty()) {
            aVar.c().remove(aVar2);
        }
        return zC;
    }

    private boolean C(org.locationtech.jts.index.strtree.a aVar, Object obj) {
        c cVar = null;
        for (c cVar2 : aVar.c()) {
            if ((cVar2 instanceof h) && ((h) cVar2).a() == obj) {
                cVar = cVar2;
            }
        }
        if (cVar == null) {
            return false;
        }
        aVar.c().remove(cVar);
        return true;
    }

    private void f(int i10, org.locationtech.jts.index.strtree.a aVar, Collection collection) {
        org.locationtech.jts.util.a.c(i10 > -2);
        if (aVar.d() == i10) {
            collection.add(aVar);
            return;
        }
        for (c cVar : aVar.c()) {
            if (cVar instanceof org.locationtech.jts.index.strtree.a) {
                f(i10, (org.locationtech.jts.index.strtree.a) cVar, collection);
            } else {
                org.locationtech.jts.util.a.c(cVar instanceof h);
                if (i10 == -1) {
                    collection.add(cVar);
                }
            }
        }
    }

    protected static int h(double d10, double d11) {
        if (d10 > d11) {
            return 1;
        }
        return d10 < d11 ? -1 : 0;
    }

    private org.locationtech.jts.index.strtree.a i(List list, int i10) {
        org.locationtech.jts.util.a.c(!list.isEmpty());
        int i11 = i10 + 1;
        List listK = k(list, i11);
        return listK.size() == 1 ? (org.locationtech.jts.index.strtree.a) listK.get(0) : i(listK, i11);
    }

    private List u(org.locationtech.jts.index.strtree.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (c cVar : aVar.c()) {
            if (cVar instanceof org.locationtech.jts.index.strtree.a) {
                List listU = u((org.locationtech.jts.index.strtree.a) cVar);
                if (listU != null) {
                    arrayList.add(listU);
                }
            } else if (cVar instanceof h) {
                arrayList.add(((h) cVar).a());
            } else {
                org.locationtech.jts.util.a.e();
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        return arrayList;
    }

    private void y(Object obj, org.locationtech.jts.index.strtree.a aVar, List list) {
        List listC = aVar.c();
        for (int i10 = 0; i10 < listC.size(); i10++) {
            c cVar = (c) listC.get(i10);
            if (o().a(cVar.getBounds(), obj)) {
                if (cVar instanceof org.locationtech.jts.index.strtree.a) {
                    y(obj, (org.locationtech.jts.index.strtree.a) cVar, list);
                } else if (cVar instanceof h) {
                    list.add(((h) cVar).a());
                } else {
                    org.locationtech.jts.util.a.e();
                }
            }
        }
    }

    private void z(Object obj, org.locationtech.jts.index.strtree.a aVar, qm.b bVar) {
        List listC = aVar.c();
        for (int i10 = 0; i10 < listC.size(); i10++) {
            c cVar = (c) listC.get(i10);
            if (o().a(cVar.getBounds(), obj)) {
                if (cVar instanceof org.locationtech.jts.index.strtree.a) {
                    z(obj, (org.locationtech.jts.index.strtree.a) cVar, bVar);
                } else if (cVar instanceof h) {
                    bVar.a(((h) cVar).a());
                } else {
                    org.locationtech.jts.util.a.e();
                }
            }
        }
    }

    protected boolean A(Object obj, Object obj2) {
        g();
        if (o().a(this.f338447a.getBounds(), obj)) {
            return B(obj, this.f338447a, obj2);
        }
        return false;
    }

    protected int D() {
        if (s()) {
            return 0;
        }
        g();
        return E(this.f338447a);
    }

    protected int E(org.locationtech.jts.index.strtree.a aVar) {
        int iE = 0;
        for (c cVar : aVar.c()) {
            if (cVar instanceof org.locationtech.jts.index.strtree.a) {
                iE += E((org.locationtech.jts.index.strtree.a) cVar);
            } else if (cVar instanceof h) {
                iE++;
            }
        }
        return iE;
    }

    protected List e(int i10) {
        ArrayList arrayList = new ArrayList();
        f(i10, this.f338447a, arrayList);
        return arrayList;
    }

    public synchronized void g() {
        try {
            if (this.f338448b) {
                return;
            }
            this.f338447a = this.f338449c.isEmpty() ? j(0) : i(this.f338449c, -1);
            this.f338449c = null;
            this.f338448b = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected abstract org.locationtech.jts.index.strtree.a j(int i10);

    protected List k(List list, int i10) {
        org.locationtech.jts.util.a.c(!list.isEmpty());
        ArrayList arrayList = new ArrayList();
        arrayList.add(j(i10));
        ArrayList<c> arrayList2 = new ArrayList(list);
        Collections.sort(arrayList2, n());
        for (c cVar : arrayList2) {
            if (v(arrayList).c().size() == p()) {
                arrayList.add(j(i10));
            }
            v(arrayList).a(cVar);
        }
        return arrayList;
    }

    protected int l() {
        if (s()) {
            return 0;
        }
        g();
        return m(this.f338447a);
    }

    protected int m(org.locationtech.jts.index.strtree.a aVar) {
        int iM;
        int i10 = 0;
        for (c cVar : aVar.c()) {
            if ((cVar instanceof org.locationtech.jts.index.strtree.a) && (iM = m((org.locationtech.jts.index.strtree.a) cVar)) > i10) {
                i10 = iM;
            }
        }
        return i10 + 1;
    }

    protected abstract Comparator n();

    protected abstract a o();

    public int p() {
        return this.f338450d;
    }

    public org.locationtech.jts.index.strtree.a q() {
        g();
        return this.f338447a;
    }

    protected void r(Object obj, Object obj2) {
        org.locationtech.jts.util.a.d(!this.f338448b, "Cannot insert items into an STR packed R-tree after it has been built.");
        this.f338449c.add(new h(obj, obj2));
    }

    public boolean s() {
        return !this.f338448b ? this.f338449c.isEmpty() : this.f338447a.e();
    }

    public List t() {
        g();
        List listU = u(this.f338447a);
        return listU == null ? new ArrayList() : listU;
    }

    protected org.locationtech.jts.index.strtree.a v(List list) {
        return (org.locationtech.jts.index.strtree.a) list.get(list.size() - 1);
    }

    protected List w(Object obj) {
        g();
        ArrayList arrayList = new ArrayList();
        if (!s() && o().a(this.f338447a.getBounds(), obj)) {
            y(obj, this.f338447a, arrayList);
        }
        return arrayList;
    }

    protected void x(Object obj, qm.b bVar) {
        g();
        if (!s() && o().a(this.f338447a.getBounds(), obj)) {
            z(obj, this.f338447a, bVar);
        }
    }

    public b(int i10) {
        this.f338448b = false;
        this.f338449c = new ArrayList();
        org.locationtech.jts.util.a.d(i10 > 1, "Node capacity must be greater than 1");
        this.f338450d = i10;
    }
}
