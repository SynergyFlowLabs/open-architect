package org.locationtech.jts.noding;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class d implements t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.algorithm.o f338560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338561d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f338558a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338559b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338562e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f338563f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f338564g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f338565h = true;

    public d(org.locationtech.jts.algorithm.o oVar) {
        this.f338561d = null;
        this.f338560c = oVar;
        this.f338561d = null;
    }

    public static d c(org.locationtech.jts.algorithm.o oVar) {
        d dVar = new d(oVar);
        dVar.l(true);
        return dVar;
    }

    public static d d(org.locationtech.jts.algorithm.o oVar) {
        return new d(oVar);
    }

    public static d e(org.locationtech.jts.algorithm.o oVar) {
        d dVar = new d(oVar);
        dVar.l(true);
        dVar.m(false);
        return dVar;
    }

    private boolean j(y yVar, int i10) {
        return i10 == 0 || i10 >= yVar.size() + (-2);
    }

    @Override // org.locationtech.jts.noding.t
    public void a(y yVar, int i10, y yVar2, int i11) {
        if (this.f338558a || !i()) {
            if (yVar == yVar2 && i10 == i11) {
                return;
            }
            if (this.f338559b && !j(yVar, i10) && !j(yVar2, i11)) {
                return;
            }
            org.locationtech.jts.geom.a aVar = yVar.n()[i10];
            org.locationtech.jts.geom.a aVar2 = yVar.n()[i10 + 1];
            org.locationtech.jts.geom.a aVar3 = yVar2.n()[i11];
            org.locationtech.jts.geom.a aVar4 = yVar2.n()[i11 + 1];
            this.f338560c.f(aVar, aVar2, aVar3, aVar4);
            if (this.f338560c.n() && this.f338560c.q()) {
                this.f338562e = new org.locationtech.jts.geom.a[]{aVar, aVar2, aVar3, aVar4};
                org.locationtech.jts.geom.a aVarJ = this.f338560c.j(0);
                this.f338561d = aVarJ;
                if (this.f338565h) {
                    this.f338563f.add(aVarJ);
                }
                this.f338564g++;
            }
        }
    }

    public int b() {
        return this.f338564g;
    }

    public org.locationtech.jts.geom.a f() {
        return this.f338561d;
    }

    public org.locationtech.jts.geom.a[] g() {
        return this.f338562e;
    }

    public List h() {
        return this.f338563f;
    }

    public boolean i() {
        return this.f338561d != null;
    }

    @Override // org.locationtech.jts.noding.t
    public boolean isDone() {
        return (this.f338558a || this.f338561d == null) ? false : true;
    }

    public void k(boolean z10) {
        this.f338559b = z10;
    }

    public void l(boolean z10) {
        this.f338558a = z10;
    }

    public void m(boolean z10) {
        this.f338565h = z10;
    }
}
