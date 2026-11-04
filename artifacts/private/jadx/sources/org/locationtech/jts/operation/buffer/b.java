package org.locationtech.jts.operation.buffer;

import org.locationtech.jts.algorithm.s;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f338677e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f338678f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f338679g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f338680h = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f338683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f338684d = 1;

    public b(org.locationtech.jts.geom.a[] aVarArr) {
        this.f338681a = aVarArr;
    }

    private org.locationtech.jts.geom.a[] a() {
        org.locationtech.jts.geom.d dVar = new org.locationtech.jts.geom.d();
        int i10 = 0;
        while (true) {
            org.locationtech.jts.geom.a[] aVarArr = this.f338681a;
            if (i10 >= aVarArr.length) {
                return dVar.Uf();
            }
            if (this.f338683c[i10] != 1) {
                dVar.d(aVarArr[i10]);
            }
            i10++;
        }
    }

    private boolean b() {
        boolean z10;
        int length = this.f338681a.length;
        int iC = c(1);
        int i10 = 1;
        int iC2 = iC;
        int iC3 = c(iC);
        boolean z11 = false;
        while (iC3 < this.f338681a.length) {
            b bVar = this;
            if (bVar.e(i10, iC2, iC3, this.f338682b)) {
                bVar.f338683c[iC2] = 1;
                z10 = true;
                z11 = true;
            } else {
                z10 = false;
            }
            i10 = z10 ? iC3 : iC2;
            iC2 = bVar.c(i10);
            iC3 = bVar.c(iC2);
            this = bVar;
        }
        return z11;
    }

    private int c(int i10) {
        int i11 = i10 + 1;
        while (i11 < this.f338681a.length && this.f338683c[i11] == 1) {
            i11++;
        }
        return i11;
    }

    private boolean d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        return s.a(aVar, aVar2, aVar3) == this.f338684d;
    }

    private boolean e(int i10, int i11, int i12, double d10) {
        org.locationtech.jts.geom.a[] aVarArr = this.f338681a;
        org.locationtech.jts.geom.a aVar = aVarArr[i10];
        org.locationtech.jts.geom.a aVar2 = aVarArr[i11];
        org.locationtech.jts.geom.a aVar3 = aVarArr[i12];
        if (d(aVar, aVar2, aVar3) && f(aVar, aVar2, aVar3, d10)) {
            return h(aVar, aVar2, i10, i12, d10);
        }
        return false;
    }

    private boolean f(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, double d10) {
        return org.locationtech.jts.algorithm.i.b(aVar2, aVar, aVar3) < d10;
    }

    private boolean g(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, double d10) {
        return s.a(aVar, aVar2, aVar3) == this.f338684d && org.locationtech.jts.algorithm.i.b(aVar2, aVar, aVar3) < d10;
    }

    private boolean h(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, int i10, int i11, double d10) {
        int i12 = (i11 - i10) / 10;
        if (i12 <= 0) {
            i12 = 1;
        }
        while (i10 < i11) {
            b bVar = this;
            org.locationtech.jts.geom.a aVar3 = aVar;
            org.locationtech.jts.geom.a aVar4 = aVar2;
            double d11 = d10;
            if (!bVar.f(aVar3, aVar4, this.f338681a[i10], d11)) {
                return false;
            }
            i10 += i12;
            this = bVar;
            aVar = aVar3;
            aVar2 = aVar4;
            d10 = d11;
        }
        return true;
    }

    public static org.locationtech.jts.geom.a[] j(org.locationtech.jts.geom.a[] aVarArr, double d10) {
        return new b(aVarArr).i(d10);
    }

    public org.locationtech.jts.geom.a[] i(double d10) {
        this.f338682b = Math.abs(d10);
        if (d10 < 0.0d) {
            this.f338684d = -1;
        }
        this.f338683c = new byte[this.f338681a.length];
        while (b()) {
        }
        return a();
    }
}
