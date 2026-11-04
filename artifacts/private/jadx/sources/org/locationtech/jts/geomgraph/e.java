package org.locationtech.jts.geomgraph;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes14.dex */
public class e implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected d f338286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected n f338287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o f338288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f338291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f338292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f338293h;

    protected e(d dVar) {
        this.f338286a = dVar;
    }

    public int b(e eVar) {
        if (this.f338291f == eVar.f338291f && this.f338292g == eVar.f338292g) {
            int i10 = 5 << 0;
            return 0;
        }
        int i11 = this.f338293h;
        int i12 = eVar.f338293h;
        if (i11 > i12) {
            int i13 = 7 >> 1;
            return 1;
        }
        if (i11 < i12) {
            return -1;
        }
        return org.locationtech.jts.algorithm.s.a(eVar.f338289d, eVar.f338290e, this.f338290e);
    }

    public void c(org.locationtech.jts.algorithm.c cVar) {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return b((e) obj);
    }

    public org.locationtech.jts.geom.a k() {
        return this.f338289d;
    }

    public org.locationtech.jts.geom.a l() {
        return this.f338290e;
    }

    public double n() {
        return this.f338291f;
    }

    public double o() {
        return this.f338292g;
    }

    public d p() {
        return this.f338286a;
    }

    public n q() {
        return this.f338287b;
    }

    public o r() {
        return this.f338288c;
    }

    public int s() {
        return this.f338293h;
    }

    protected void t(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        this.f338289d = aVar;
        this.f338290e = aVar2;
        double d10 = aVar2.f338092a - aVar.f338092a;
        this.f338291f = d10;
        double d11 = aVar2.f338093b - aVar.f338093b;
        this.f338292g = d11;
        this.f338293h = t.e(d10, d11);
        org.locationtech.jts.util.a.d((this.f338291f == 0.0d && this.f338292g == 0.0d) ? false : true, "EdgeEnd with identical endpoints found");
    }

    public String toString() {
        double dAtan2 = Math.atan2(this.f338292g, this.f338291f);
        String name = getClass().getName();
        return "  " + name.substring(name.lastIndexOf(46) + 1) + ": " + this.f338289d + " - " + this.f338290e + " " + this.f338293h + ":" + dAtan2 + "   " + this.f338287b;
    }

    public void v(PrintStream printStream) {
        double dAtan2 = Math.atan2(this.f338292g, this.f338291f);
        String name = getClass().getName();
        printStream.print("  " + name.substring(name.lastIndexOf(46) + 1) + ": " + this.f338289d + " - " + this.f338290e + " " + this.f338293h + ":" + dAtan2 + "   " + this.f338287b);
    }

    public void w(o oVar) {
        this.f338288c = oVar;
    }

    public e(d dVar, org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        this(dVar, aVar, aVar2, null);
    }

    public e(d dVar, org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, n nVar) {
        this(dVar);
        t(aVar, aVar2);
        this.f338287b = nVar;
    }
}
