package org.locationtech.jts.util;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes14.dex */
public class n implements org.locationtech.jts.geom.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TreeSet f339159a = new TreeSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList f339160b = new ArrayList();

    public static org.locationtech.jts.geom.a[] b(org.locationtech.jts.geom.a[] aVarArr) {
        n nVar = new n();
        for (org.locationtech.jts.geom.a aVar : aVarArr) {
            nVar.a(aVar);
        }
        return nVar.c();
    }

    @Override // org.locationtech.jts.geom.c
    public void a(org.locationtech.jts.geom.a aVar) {
        if (!this.f339159a.contains(aVar)) {
            this.f339160b.add(aVar);
            this.f339159a.add(aVar);
        }
    }

    public org.locationtech.jts.geom.a[] c() {
        return (org.locationtech.jts.geom.a[]) this.f339160b.toArray(new org.locationtech.jts.geom.a[this.f339160b.size()]);
    }
}
