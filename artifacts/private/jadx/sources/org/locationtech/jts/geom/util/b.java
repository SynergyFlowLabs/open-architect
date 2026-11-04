package org.locationtech.jts.geom.util;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f338225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f338226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f338227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f338228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double f338229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f338230l;

    public b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4, org.locationtech.jts.geom.a aVar5, org.locationtech.jts.geom.a aVar6) {
        this.f338219a = aVar;
        this.f338220b = aVar2;
        this.f338221c = aVar3;
        this.f338222d = aVar4;
        this.f338223e = aVar5;
        this.f338224f = aVar6;
    }

    private boolean a() {
        double[] dArrC = c(new double[]{this.f338222d.f338092a, this.f338223e.f338092a, this.f338224f.f338092a});
        if (dArrC == null) {
            return false;
        }
        this.f338225g = dArrC[0];
        this.f338226h = dArrC[1];
        this.f338227i = dArrC[2];
        double[] dArrC2 = c(new double[]{this.f338222d.f338093b, this.f338223e.f338093b, this.f338224f.f338093b});
        if (dArrC2 == null) {
            return false;
        }
        this.f338228j = dArrC2[0];
        this.f338229k = dArrC2[1];
        this.f338230l = dArrC2[2];
        return true;
    }

    private double[] c(double[] dArr) {
        org.locationtech.jts.geom.a aVar = this.f338219a;
        double[] dArr2 = {aVar.f338092a, aVar.f338093b, 1.0d};
        org.locationtech.jts.geom.a aVar2 = this.f338220b;
        double[] dArr3 = {aVar2.f338092a, aVar2.f338093b, 1.0d};
        org.locationtech.jts.geom.a aVar3 = this.f338221c;
        return tm.c.a(new double[][]{dArr2, dArr3, new double[]{aVar3.f338092a, aVar3.f338093b, 1.0d}}, dArr);
    }

    public a b() {
        if (a()) {
            return new a(this.f338225g, this.f338226h, this.f338227i, this.f338228j, this.f338229k, this.f338230l);
        }
        return null;
    }
}
