package org.locationtech.jts.util;

/* JADX INFO: loaded from: classes14.dex */
public class d implements org.locationtech.jts.geom.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    org.locationtech.jts.geom.a[] f339119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f339120b = 0;

    public d(int i10) {
        this.f339119a = null;
        this.f339119a = new org.locationtech.jts.geom.a[i10];
    }

    @Override // org.locationtech.jts.geom.c
    public void a(org.locationtech.jts.geom.a aVar) {
        org.locationtech.jts.geom.a[] aVarArr = this.f339119a;
        int i10 = this.f339120b;
        this.f339120b = i10 + 1;
        aVarArr[i10] = aVar;
    }

    public org.locationtech.jts.geom.a[] b() {
        return this.f339119a;
    }
}
