package org.locationtech.jts.triangulate;

import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f339073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f339074b;

    public k(double d10, double d11, double d12, double d13, double d14, double d15) {
        this(new org.locationtech.jts.geom.a(d10, d11, d12), new org.locationtech.jts.geom.a(d13, d14, d15));
    }

    public boolean a(k kVar) {
        return this.f339073a.r(kVar.g());
    }

    public Object b() {
        return this.f339074b;
    }

    public org.locationtech.jts.geom.a c() {
        return this.f339073a.s(1);
    }

    public double d() {
        return this.f339073a.s(1).f338092a;
    }

    public double e() {
        return this.f339073a.s(1).f338093b;
    }

    public double f() {
        return this.f339073a.s(1).f338094c;
    }

    public u g() {
        return this.f339073a;
    }

    public org.locationtech.jts.geom.a h() {
        return this.f339073a.s(0);
    }

    public double i() {
        return this.f339073a.s(0).f338092a;
    }

    public double j() {
        return this.f339073a.s(0).f338093b;
    }

    public double k() {
        return this.f339073a.s(0).f338094c;
    }

    public org.locationtech.jts.geom.a l(k kVar) {
        return this.f339073a.v(kVar.g());
    }

    public void m(Object obj) {
        this.f339074b = obj;
    }

    public String toString() {
        return this.f339073a.toString();
    }

    public k(double d10, double d11, double d12, double d13, double d14, double d15, Object obj) {
        this(new org.locationtech.jts.geom.a(d10, d11, d12), new org.locationtech.jts.geom.a(d13, d14, d15), obj);
    }

    public k(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, Object obj) {
        this.f339074b = null;
        this.f339073a = new u(aVar, aVar2);
        this.f339074b = obj;
    }

    public k(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        this.f339074b = null;
        this.f339073a = new u(aVar, aVar2);
    }
}
