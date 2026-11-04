package org.locationtech.jts.index.bintree;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f338384a = 0.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338385b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f338386c;

    public c(b bVar) {
        b(bVar);
    }

    private void a(int i10, b bVar) {
        double dH = org.locationtech.jts.index.quadtree.a.h(i10);
        double dFloor = Math.floor(bVar.f() / dH) * dH;
        this.f338384a = dFloor;
        this.f338386c.h(dFloor, dH + dFloor);
    }

    public static int c(b bVar) {
        return org.locationtech.jts.index.quadtree.a.b(bVar.g()) + 1;
    }

    public void b(b bVar) {
        this.f338385b = c(bVar);
        this.f338386c = new b();
        a(this.f338385b, bVar);
        while (!this.f338386c.c(bVar)) {
            int i10 = this.f338385b + 1;
            this.f338385b = i10;
            a(i10, bVar);
        }
    }

    public b d() {
        return this.f338386c;
    }

    public int e() {
        return this.f338385b;
    }

    public double f() {
        return this.f338384a;
    }
}
