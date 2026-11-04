package org.locationtech.jts.noding;

/* JADX INFO: loaded from: classes14.dex */
public class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.algorithm.o f338614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f338616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f338618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f338619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338621h;

    public s() {
        this(new org.locationtech.jts.algorithm.y());
    }

    @Override // org.locationtech.jts.noding.t
    public void a(y yVar, int i10, y yVar2, int i11) {
        if (yVar == yVar2 && i10 == i11) {
            return;
        }
        org.locationtech.jts.geom.a aVar = yVar.n()[i10];
        org.locationtech.jts.geom.a aVar2 = yVar.n()[i10 + 1];
        org.locationtech.jts.geom.a aVar3 = yVar2.n()[i11];
        org.locationtech.jts.geom.a aVar4 = yVar2.n()[i11 + 1];
        this.f338614a.f(aVar, aVar2, aVar3, aVar4);
        if (this.f338614a.n()) {
            this.f338617d = true;
            boolean zT = this.f338614a.t();
            if (zT) {
                this.f338618e = true;
            }
            if (!zT) {
                this.f338619f = true;
            }
            boolean z10 = !this.f338615b || zT;
            if (this.f338620g == null || z10) {
                this.f338620g = this.f338614a.j(0);
                this.f338621h = new org.locationtech.jts.geom.a[]{aVar, aVar2, aVar3, aVar4};
            }
        }
    }

    public org.locationtech.jts.geom.a b() {
        return this.f338620g;
    }

    public org.locationtech.jts.geom.a[] c() {
        return this.f338621h;
    }

    public boolean d() {
        return this.f338617d;
    }

    public boolean e() {
        return this.f338619f;
    }

    public boolean f() {
        return this.f338618e;
    }

    public void g(boolean z10) {
        this.f338616c = z10;
    }

    public void h(boolean z10) {
        this.f338615b = z10;
    }

    @Override // org.locationtech.jts.noding.t
    public boolean isDone() {
        if (this.f338616c) {
            return this.f338618e && this.f338619f;
        }
        return this.f338615b ? this.f338618e : this.f338617d;
    }

    public s(org.locationtech.jts.algorithm.o oVar) {
        this.f338615b = false;
        this.f338616c = false;
        this.f338617d = false;
        this.f338618e = false;
        this.f338619f = false;
        this.f338620g = null;
        this.f338621h = null;
        this.f338614a = oVar;
    }
}
