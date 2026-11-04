package org.locationtech.jts.noding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class m implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f338601a = new v(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f338603c;

    public m(org.locationtech.jts.geom.a[] aVarArr, Object obj) {
        this.f338602b = aVarArr;
        this.f338603c = obj;
    }

    public static List g(Collection collection) {
        ArrayList arrayList = new ArrayList();
        h(collection, arrayList);
        return arrayList;
    }

    public static void h(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f().e(collection2);
        }
    }

    private int j(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (aVar.p(aVar2)) {
            return 0;
        }
        return p.b(aVar, aVar2);
    }

    @Override // org.locationtech.jts.noding.y
    public void a(Object obj) {
        this.f338603c = obj;
    }

    @Override // org.locationtech.jts.noding.k
    public void b(org.locationtech.jts.geom.a aVar, int i10) {
        d(aVar, i10);
    }

    public void c(org.locationtech.jts.algorithm.o oVar, int i10, int i11, int i12) {
        b(new org.locationtech.jts.geom.a(oVar.j(i12)), i10);
    }

    public u d(org.locationtech.jts.geom.a aVar, int i10) {
        int i11 = i10 + 1;
        org.locationtech.jts.geom.a[] aVarArr = this.f338602b;
        if (i11 < aVarArr.length && aVar.p(aVarArr[i11])) {
            i10 = i11;
        }
        return this.f338601a.a(aVar, i10);
    }

    public void e(org.locationtech.jts.algorithm.o oVar, int i10, int i11) {
        for (int i12 = 0; i12 < oVar.l(); i12++) {
            c(oVar, i10, i11, i12);
        }
    }

    public v f() {
        return this.f338601a;
    }

    @Override // org.locationtech.jts.noding.y
    public Object getData() {
        return this.f338603c;
    }

    public int i(int i10) {
        if (i10 == this.f338602b.length - 1) {
            return -1;
        }
        return j(w4(i10), w4(i10 + 1));
    }

    @Override // org.locationtech.jts.noding.y
    public boolean isClosed() {
        Object[] objArr = this.f338602b;
        return objArr[0].equals(objArr[objArr.length - 1]);
    }

    @Override // org.locationtech.jts.noding.y
    public org.locationtech.jts.geom.a[] n() {
        return this.f338602b;
    }

    @Override // org.locationtech.jts.noding.y
    public int size() {
        return this.f338602b.length;
    }

    public String toString() {
        return rm.o.B(new org.locationtech.jts.geom.impl.a(this.f338602b));
    }

    @Override // org.locationtech.jts.noding.y
    public org.locationtech.jts.geom.a w4(int i10) {
        return this.f338602b[i10];
    }
}
