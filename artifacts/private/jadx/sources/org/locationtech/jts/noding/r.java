package org.locationtech.jts.noding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class r implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f338611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f338612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f338613e;

    public r(n nVar, double d10) {
        this(nVar, d10, 0.0d, 0.0d);
    }

    private void d(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            e(((y) it.next()).n());
        }
    }

    private void e(org.locationtech.jts.geom.a[] aVarArr) {
        if (aVarArr.length == 2) {
            new org.locationtech.jts.geom.a(aVarArr[0]);
            new org.locationtech.jts.geom.a(aVarArr[1]);
        }
        for (org.locationtech.jts.geom.a aVar : aVarArr) {
            double d10 = aVar.f338092a;
            double d11 = this.f338610b;
            aVar.f338092a = (d10 / d11) + this.f338611c;
            aVar.f338093b = (aVar.f338093b / d11) + this.f338612d;
        }
        if (aVarArr.length == 2 && aVarArr[0].p(aVarArr[1])) {
            System.out.println(aVarArr);
        }
    }

    private Collection f(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            arrayList.add(new m(g(yVar.n()), yVar.getData()));
        }
        return arrayList;
    }

    private org.locationtech.jts.geom.a[] g(org.locationtech.jts.geom.a[] aVarArr) {
        org.locationtech.jts.geom.a[] aVarArr2 = new org.locationtech.jts.geom.a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr2[i10] = new org.locationtech.jts.geom.a(Math.round((aVarArr[i10].f338092a - this.f338611c) * this.f338610b), Math.round((aVarArr[i10].f338093b - this.f338612d) * this.f338610b), aVarArr[i10].f338094c);
        }
        return org.locationtech.jts.geom.b.s(aVarArr2);
    }

    @Override // org.locationtech.jts.noding.n
    public void a(Collection collection) {
        if (this.f338613e) {
            collection = f(collection);
        }
        this.f338609a.a(collection);
    }

    @Override // org.locationtech.jts.noding.n
    public Collection b() {
        Collection collectionB = this.f338609a.b();
        if (this.f338613e) {
            d(collectionB);
        }
        return collectionB;
    }

    public boolean c() {
        return this.f338610b == 1.0d;
    }

    public r(n nVar, double d10, double d11, double d12) {
        this.f338613e = false;
        this.f338609a = nVar;
        this.f338610b = d10;
        this.f338613e = !c();
    }
}
