package org.locationtech.jts.noding.snapround;

import org.locationtech.jts.algorithm.o;
import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final double f338625n = 0.75d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f338626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f338632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f338633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f338634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f338635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double f338636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338637l = new org.locationtech.jts.geom.a[4];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private m f338638m = null;

    public b(org.locationtech.jts.geom.a aVar, double d10, o oVar) {
        this.f338628c = aVar;
        this.f338627b = aVar;
        this.f338632g = d10;
        this.f338626a = oVar;
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("Scale factor must be non-zero");
        }
        if (d10 != 1.0d) {
            this.f338627b = new org.locationtech.jts.geom.a(j(aVar.f338092a), j(aVar.f338093b));
            this.f338630e = new org.locationtech.jts.geom.a();
            this.f338631f = new org.locationtech.jts.geom.a();
        }
        e(this.f338627b);
    }

    private void b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        aVar2.f338092a = j(aVar.f338092a);
        aVar2.f338093b = j(aVar.f338093b);
    }

    private void e(org.locationtech.jts.geom.a aVar) {
        double d10 = aVar.f338092a;
        this.f338633h = d10 - 0.5d;
        double d11 = d10 + 0.5d;
        this.f338634i = d11;
        double d12 = aVar.f338093b;
        this.f338635j = d12 - 0.5d;
        double d13 = d12 + 0.5d;
        this.f338636k = d13;
        int i10 = 6 ^ 0;
        this.f338637l[0] = new org.locationtech.jts.geom.a(d11, d13);
        this.f338637l[1] = new org.locationtech.jts.geom.a(this.f338633h, this.f338636k);
        this.f338637l[2] = new org.locationtech.jts.geom.a(this.f338633h, this.f338635j);
        this.f338637l[3] = new org.locationtech.jts.geom.a(this.f338634i, this.f338635j);
    }

    private boolean g(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        o oVar = this.f338626a;
        org.locationtech.jts.geom.a[] aVarArr = this.f338637l;
        oVar.f(aVar, aVar2, aVarArr[0], aVarArr[1]);
        if (this.f338626a.n()) {
            return true;
        }
        o oVar2 = this.f338626a;
        org.locationtech.jts.geom.a[] aVarArr2 = this.f338637l;
        oVar2.f(aVar, aVar2, aVarArr2[1], aVarArr2[2]);
        if (this.f338626a.n()) {
            return true;
        }
        o oVar3 = this.f338626a;
        org.locationtech.jts.geom.a[] aVarArr3 = this.f338637l;
        oVar3.f(aVar, aVar2, aVarArr3[2], aVarArr3[3]);
        if (this.f338626a.n()) {
            return true;
        }
        o oVar4 = this.f338626a;
        org.locationtech.jts.geom.a[] aVarArr4 = this.f338637l;
        oVar4.f(aVar, aVar2, aVarArr4[3], aVarArr4[0]);
        return this.f338626a.n();
    }

    private boolean h(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        boolean z10 = true;
        boolean z11 = this.f338634i < Math.min(aVar.f338092a, aVar2.f338092a) || this.f338633h > Math.max(aVar.f338092a, aVar2.f338092a) || this.f338636k < Math.min(aVar.f338093b, aVar2.f338093b) || this.f338635j > Math.max(aVar.f338093b, aVar2.f338093b);
        if (z11) {
            return false;
        }
        boolean zI = i(aVar, aVar2);
        if (z11 && zI) {
            z10 = false;
        }
        org.locationtech.jts.util.a.d(z10, "Found bad envelope test");
        return zI;
    }

    private boolean i(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        o oVar = this.f338626a;
        org.locationtech.jts.geom.a[] aVarArr = this.f338637l;
        oVar.f(aVar, aVar2, aVarArr[0], aVarArr[1]);
        if (this.f338626a.t()) {
            return true;
        }
        o oVar2 = this.f338626a;
        org.locationtech.jts.geom.a[] aVarArr2 = this.f338637l;
        oVar2.f(aVar, aVar2, aVarArr2[1], aVarArr2[2]);
        if (this.f338626a.t()) {
            return true;
        }
        boolean zN = this.f338626a.n();
        o oVar3 = this.f338626a;
        org.locationtech.jts.geom.a[] aVarArr3 = this.f338637l;
        oVar3.f(aVar, aVar2, aVarArr3[2], aVarArr3[3]);
        if (this.f338626a.t()) {
            return true;
        }
        boolean zN2 = this.f338626a.n();
        o oVar4 = this.f338626a;
        org.locationtech.jts.geom.a[] aVarArr4 = this.f338637l;
        oVar4.f(aVar, aVar2, aVarArr4[3], aVarArr4[0]);
        if (this.f338626a.t()) {
            return true;
        }
        return (zN && zN2) || aVar.equals(this.f338627b) || aVar2.equals(this.f338627b);
    }

    private double j(double d10) {
        return Math.round(d10 * this.f338632g);
    }

    public boolean a(org.locationtech.jts.noding.m mVar, int i10) {
        if (!f(mVar.w4(i10), mVar.w4(i10 + 1))) {
            return false;
        }
        mVar.b(c(), i10);
        return true;
    }

    public org.locationtech.jts.geom.a c() {
        return this.f338628c;
    }

    public m d() {
        if (this.f338638m == null) {
            double d10 = f338625n / this.f338632g;
            org.locationtech.jts.geom.a aVar = this.f338628c;
            double d11 = aVar.f338092a;
            double d12 = aVar.f338093b;
            this.f338638m = new m(d11 - d10, d11 + d10, d12 - d10, d12 + d10);
        }
        return this.f338638m;
    }

    public boolean f(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (this.f338632g == 1.0d) {
            return h(aVar, aVar2);
        }
        b(aVar, this.f338630e);
        b(aVar2, this.f338631f);
        return h(this.f338630e, this.f338631f);
    }
}
