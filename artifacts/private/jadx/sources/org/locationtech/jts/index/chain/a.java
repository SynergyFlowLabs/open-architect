package org.locationtech.jts.index.chain;

import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f338396d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f338397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f338398f;

    public a(org.locationtech.jts.geom.a[] aVarArr, int i10, int i11, Object obj) {
        this.f338393a = aVarArr;
        this.f338394b = i10;
        this.f338395c = i11;
        this.f338397e = obj;
    }

    private void a(int i10, int i11, a aVar, int i12, int i13, c cVar) {
        int i14;
        int i15;
        int i16;
        if (i11 - i10 == 1 && i13 - i12 == 1) {
            cVar.b(this, i10, aVar, i12);
            return;
        }
        if (k(i10, i11, aVar, i12, i13)) {
            int i17 = (i10 + i11) / 2;
            int i18 = (i12 + i13) / 2;
            if (i10 < i17) {
                if (i12 < i18) {
                    a(i10, i17, aVar, i12, i18, cVar);
                }
                i14 = i12;
                i15 = i18;
                if (i15 < i13) {
                    a(i10, i17, aVar, i15, i13, cVar);
                }
            } else {
                i14 = i12;
                i15 = i18;
            }
            if (i17 < i11) {
                if (i14 < i15) {
                    int i19 = i15;
                    a(i17, i16, aVar, i14, i19, cVar);
                    i15 = i19;
                }
                if (i15 >= i13) {
                    i16 = i11;
                    i16 = i11;
                    return;
                } else {
                    i16 = i11;
                    i16 = i11;
                    a(i17, i16, aVar, i15, i13, cVar);
                }
            }
        }
    }

    private void c(m mVar, int i10, int i11, d dVar) {
        org.locationtech.jts.geom.a[] aVarArr = this.f338393a;
        org.locationtech.jts.geom.a aVar = aVarArr[i10];
        org.locationtech.jts.geom.a aVar2 = aVarArr[i11];
        if (i11 - i10 == 1) {
            dVar.b(this, i10);
            return;
        }
        if (mVar.Y(aVar, aVar2)) {
            int i12 = (i10 + i11) / 2;
            if (i10 < i12) {
                c(mVar, i10, i12, dVar);
            }
            if (i12 < i11) {
                c(mVar, i12, i11, dVar);
            }
        }
    }

    private boolean k(int i10, int i11, a aVar, int i12, int i13) {
        org.locationtech.jts.geom.a[] aVarArr = this.f338393a;
        org.locationtech.jts.geom.a aVar2 = aVarArr[i10];
        org.locationtech.jts.geom.a aVar3 = aVarArr[i11];
        org.locationtech.jts.geom.a[] aVarArr2 = aVar.f338393a;
        return m.a0(aVar2, aVar3, aVarArr2[i12], aVarArr2[i13]);
    }

    public void b(a aVar, c cVar) {
        a(this.f338394b, this.f338395c, aVar, aVar.f338394b, aVar.f338395c, cVar);
    }

    public Object d() {
        return this.f338397e;
    }

    public org.locationtech.jts.geom.a[] e() {
        int i10 = this.f338395c;
        int i11 = this.f338394b;
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[(i10 - i11) + 1];
        int i12 = 0;
        while (i11 <= this.f338395c) {
            aVarArr[i12] = this.f338393a[i11];
            i11++;
            i12++;
        }
        return aVarArr;
    }

    public int f() {
        return this.f338395c;
    }

    public m g() {
        if (this.f338396d == null) {
            org.locationtech.jts.geom.a[] aVarArr = this.f338393a;
            this.f338396d = new m(aVarArr[this.f338394b], aVarArr[this.f338395c]);
        }
        return this.f338396d;
    }

    public int h() {
        return this.f338398f;
    }

    public void i(int i10, u uVar) {
        org.locationtech.jts.geom.a[] aVarArr = this.f338393a;
        uVar.f338211a = aVarArr[i10];
        uVar.f338212b = aVarArr[i10 + 1];
    }

    public int j() {
        return this.f338394b;
    }

    public void l(m mVar, d dVar) {
        c(mVar, this.f338394b, this.f338395c, dVar);
    }

    public void m(int i10) {
        this.f338398f = i10;
    }
}
