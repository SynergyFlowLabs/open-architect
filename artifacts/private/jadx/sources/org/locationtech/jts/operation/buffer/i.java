package org.locationtech.jts.operation.buffer;

import java.util.ArrayList;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.r;

/* JADX INFO: loaded from: classes14.dex */
class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final org.locationtech.jts.geom.a[] f338743d = new org.locationtech.jts.geom.a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g0 f338745b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f338746c = 0.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f338744a = new ArrayList();

    private boolean e(org.locationtech.jts.geom.a aVar) {
        int i10 = 4 << 1;
        if (this.f338744a.size() < 1) {
            return false;
        }
        ArrayList arrayList = this.f338744a;
        return aVar.l((org.locationtech.jts.geom.a) arrayList.get(arrayList.size() - 1)) < this.f338746c;
    }

    public void a(org.locationtech.jts.geom.a aVar) {
        org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a(aVar);
        this.f338745b.s(aVar2);
        if (e(aVar2)) {
            return;
        }
        this.f338744a.add(aVar2);
    }

    public void b(org.locationtech.jts.geom.a[] aVarArr, boolean z10) {
        if (z10) {
            for (org.locationtech.jts.geom.a aVar : aVarArr) {
                a(aVar);
            }
        } else {
            for (int length = aVarArr.length - 1; length >= 0; length--) {
                a(aVarArr[length]);
            }
        }
    }

    public void c() {
        if (this.f338744a.size() < 1) {
            return;
        }
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a((org.locationtech.jts.geom.a) this.f338744a.get(0));
        ArrayList arrayList = this.f338744a;
        org.locationtech.jts.geom.a aVar2 = (org.locationtech.jts.geom.a) arrayList.get(arrayList.size() - 1);
        if (this.f338744a.size() >= 2) {
            ArrayList arrayList2 = this.f338744a;
        }
        if (aVar.equals(aVar2)) {
            return;
        }
        this.f338744a.add(aVar);
    }

    public org.locationtech.jts.geom.a[] d() {
        return (org.locationtech.jts.geom.a[]) this.f338744a.toArray(f338743d);
    }

    public void f() {
    }

    public void g(double d10) {
        this.f338746c = d10;
    }

    public void h(g0 g0Var) {
        this.f338745b = g0Var;
    }

    public String toString() {
        return new r().h(d()).toString();
    }
}
