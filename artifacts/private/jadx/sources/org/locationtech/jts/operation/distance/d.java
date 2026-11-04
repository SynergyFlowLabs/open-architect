package org.locationtech.jts.operation.distance;

import org.locationtech.jts.algorithm.i;
import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.e f338771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338774d = new org.locationtech.jts.geom.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338775e = new org.locationtech.jts.geom.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338776f = new org.locationtech.jts.geom.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338777g = new org.locationtech.jts.geom.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338778h = new org.locationtech.jts.geom.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338779i = new org.locationtech.jts.geom.a();

    public d(org.locationtech.jts.geom.e eVar, int i10, int i11) {
        this.f338771a = eVar;
        this.f338772b = i10;
        this.f338773c = i11;
    }

    private double a(d dVar) {
        double d10 = Double.MAX_VALUE;
        for (int i10 = this.f338772b; i10 < this.f338773c - 1; i10++) {
            int i11 = dVar.f338772b;
            while (i11 < dVar.f338773c - 1) {
                this.f338771a.Ob(i10, this.f338776f);
                this.f338771a.Ob(i10 + 1, this.f338777g);
                dVar.f338771a.Ob(i11, this.f338778h);
                i11++;
                dVar.f338771a.Ob(i11, this.f338779i);
                double d11 = i.d(this.f338776f, this.f338777g, this.f338778h, this.f338779i);
                if (d11 == 0.0d) {
                    return 0.0d;
                }
                if (d11 < d10) {
                    d10 = d11;
                }
            }
        }
        return d10;
    }

    private double b(org.locationtech.jts.geom.a aVar, d dVar) {
        int i10 = dVar.f338772b;
        double d10 = Double.MAX_VALUE;
        while (i10 < dVar.f338773c - 1) {
            dVar.f338771a.Ob(i10, this.f338778h);
            i10++;
            dVar.f338771a.Ob(i10, this.f338779i);
            double dB = i.b(aVar, this.f338778h, this.f338779i);
            if (dB == 0.0d) {
                return 0.0d;
            }
            if (dB < d10) {
                d10 = dB;
            }
        }
        return d10;
    }

    public double c(d dVar) {
        boolean zF = f();
        boolean zF2 = dVar.f();
        if (zF && zF2) {
            this.f338771a.Ob(this.f338772b, this.f338774d);
            dVar.f338771a.Ob(dVar.f338772b, this.f338775e);
            return this.f338774d.l(this.f338775e);
        }
        if (zF) {
            this.f338771a.Ob(this.f338772b, this.f338774d);
            return b(this.f338774d, dVar);
        }
        if (!zF2) {
            return a(dVar);
        }
        dVar.f338771a.Ob(dVar.f338772b, this.f338775e);
        return b(this.f338775e, this);
    }

    public org.locationtech.jts.geom.a d(int i10) {
        return this.f338771a.w4(this.f338772b + i10);
    }

    public m e() {
        m mVar = new m();
        for (int i10 = this.f338772b; i10 < this.f338773c; i10++) {
            mVar.w(this.f338771a.N5(i10), this.f338771a.I3(i10));
        }
        return mVar;
    }

    public boolean f() {
        return this.f338773c - this.f338772b == 1;
    }

    public int g() {
        return this.f338773c - this.f338772b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("LINESTRING ( ");
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a();
        for (int i10 = this.f338772b; i10 < this.f338773c; i10++) {
            if (i10 > this.f338772b) {
                stringBuffer.append(", ");
            }
            this.f338771a.Ob(i10, aVar);
            stringBuffer.append(aVar.f338092a + " " + aVar.f338093b);
        }
        stringBuffer.append(" )");
        return stringBuffer.toString();
    }

    public d(org.locationtech.jts.geom.e eVar, int i10) {
        this.f338771a = eVar;
        this.f338772b = i10;
        this.f338773c = i10 + 1;
    }
}
