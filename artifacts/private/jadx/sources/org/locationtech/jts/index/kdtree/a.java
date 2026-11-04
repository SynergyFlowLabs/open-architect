package org.locationtech.jts.index.kdtree;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f338411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f338412c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f338413d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f338414e = 1;

    public a(double d10, double d11, Object obj) {
        this.f338410a = null;
        this.f338410a = new org.locationtech.jts.geom.a(d10, d11);
        this.f338411b = obj;
    }

    public org.locationtech.jts.geom.a a() {
        return this.f338410a;
    }

    public int b() {
        return this.f338414e;
    }

    public Object c() {
        return this.f338411b;
    }

    public a d() {
        return this.f338412c;
    }

    public a e() {
        return this.f338413d;
    }

    public double f() {
        return this.f338410a.f338092a;
    }

    public double g() {
        return this.f338410a.f338093b;
    }

    void h() {
        this.f338414e++;
    }

    public boolean i() {
        return this.f338414e > 1;
    }

    void j(a aVar) {
        this.f338412c = aVar;
    }

    void k(a aVar) {
        this.f338413d = aVar;
    }

    public a(org.locationtech.jts.geom.a aVar, Object obj) {
        this.f338410a = null;
        this.f338410a = new org.locationtech.jts.geom.a(aVar);
        this.f338411b = obj;
    }
}
