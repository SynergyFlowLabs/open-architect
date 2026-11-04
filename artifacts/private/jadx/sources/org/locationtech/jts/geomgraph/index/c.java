package org.locationtech.jts.geomgraph.index;

import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    org.locationtech.jts.geomgraph.d f338306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    org.locationtech.jts.geom.a[] f338307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f338308c;

    public c(org.locationtech.jts.geomgraph.d dVar) {
        this.f338306a = dVar;
        this.f338307b = dVar.r();
        this.f338308c = new d().b(this.f338307b);
    }

    private void b(int i10, int i11, c cVar, int i12, int i13, e eVar) {
        int i14;
        int i15;
        int i16;
        if (i11 - i10 == 1 && i13 - i12 == 1) {
            eVar.a(this.f338306a, i10, cVar.f338306a, i12);
            return;
        }
        if (h(i10, i11, cVar, i12, i13)) {
            int i17 = (i10 + i11) / 2;
            int i18 = (i12 + i13) / 2;
            if (i10 < i17) {
                if (i12 < i18) {
                    b(i10, i17, cVar, i12, i18, eVar);
                }
                i14 = i12;
                i15 = i18;
                if (i15 < i13) {
                    b(i10, i17, cVar, i15, i13, eVar);
                }
            } else {
                i14 = i12;
                i15 = i18;
            }
            if (i17 < i11) {
                if (i14 < i15) {
                    int i19 = i15;
                    i16 = i11;
                    b(i17, i16, cVar, i14, i19, eVar);
                    i15 = i19;
                } else {
                    i16 = i11;
                }
                if (i15 < i13) {
                    b(i17, i16, cVar, i15, i13, eVar);
                }
            }
        }
    }

    private boolean h(int i10, int i11, c cVar, int i12, int i13) {
        org.locationtech.jts.geom.a[] aVarArr = this.f338307b;
        org.locationtech.jts.geom.a aVar = aVarArr[i10];
        org.locationtech.jts.geom.a aVar2 = aVarArr[i11];
        org.locationtech.jts.geom.a[] aVarArr2 = cVar.f338307b;
        return m.a0(aVar, aVar2, aVarArr2[i12], aVarArr2[i13]);
    }

    public void a(c cVar, e eVar) {
        for (int i10 = 0; i10 < this.f338308c.length - 1; i10++) {
            for (int i11 = 0; i11 < cVar.f338308c.length - 1; i11++) {
                c(i10, cVar, i11, eVar);
            }
        }
    }

    public void c(int i10, c cVar, int i11, e eVar) {
        int[] iArr = this.f338308c;
        int i12 = iArr[i10];
        int i13 = iArr[i10 + 1];
        int[] iArr2 = cVar.f338308c;
        b(i12, i13, cVar, iArr2[i11], iArr2[i11 + 1], eVar);
    }

    public org.locationtech.jts.geom.a[] d() {
        return this.f338307b;
    }

    public double e(int i10) {
        org.locationtech.jts.geom.a[] aVarArr = this.f338307b;
        int[] iArr = this.f338308c;
        double d10 = aVarArr[iArr[i10]].f338092a;
        double d11 = aVarArr[iArr[i10 + 1]].f338092a;
        return d10 > d11 ? d10 : d11;
    }

    public double f(int i10) {
        org.locationtech.jts.geom.a[] aVarArr = this.f338307b;
        int[] iArr = this.f338308c;
        double d10 = aVarArr[iArr[i10]].f338092a;
        double d11 = aVarArr[iArr[i10 + 1]].f338092a;
        return d10 < d11 ? d10 : d11;
    }

    public int[] g() {
        return this.f338308c;
    }
}
