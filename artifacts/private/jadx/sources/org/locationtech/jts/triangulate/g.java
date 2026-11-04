package org.locationtech.jts.triangulate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.r;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Collection f339068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f339069b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.triangulate.quadedge.f f339070c = null;

    private void a() {
        if (this.f339070c != null) {
            return;
        }
        org.locationtech.jts.geom.m mVarB = b(this.f339068a);
        List listJ = j(this.f339068a);
        org.locationtech.jts.triangulate.quadedge.f fVar = new org.locationtech.jts.triangulate.quadedge.f(mVarB, this.f339069b);
        this.f339070c = fVar;
        new h(fVar).b(listJ);
    }

    public static org.locationtech.jts.geom.m b(Collection collection) {
        org.locationtech.jts.geom.m mVar = new org.locationtech.jts.geom.m();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mVar.x((org.locationtech.jts.geom.a) it.next());
        }
        return mVar;
    }

    public static org.locationtech.jts.geom.d c(org.locationtech.jts.geom.n nVar) {
        return nVar == null ? new org.locationtech.jts.geom.d() : k(nVar.d0());
    }

    public static List j(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new org.locationtech.jts.triangulate.quadedge.m((org.locationtech.jts.geom.a) it.next()));
        }
        return arrayList;
    }

    public static org.locationtech.jts.geom.d k(org.locationtech.jts.geom.a[] aVarArr) {
        org.locationtech.jts.geom.a[] aVarArrE = org.locationtech.jts.geom.b.e(aVarArr);
        Arrays.sort(aVarArrE);
        return new org.locationtech.jts.geom.d(aVarArrE, false);
    }

    public org.locationtech.jts.geom.n d(r rVar) {
        a();
        return this.f339070c.f(rVar);
    }

    public org.locationtech.jts.triangulate.quadedge.f e() {
        a();
        return this.f339070c;
    }

    public org.locationtech.jts.geom.n f(r rVar) {
        a();
        return this.f339070c.n(rVar);
    }

    public void g(Collection collection) {
        this.f339068a = k(org.locationtech.jts.geom.b.v(collection));
    }

    public void h(org.locationtech.jts.geom.n nVar) {
        this.f339068a = c(nVar);
    }

    public void i(double d10) {
        this.f339069b = d10;
    }
}
