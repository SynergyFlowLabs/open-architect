package org.locationtech.jts.geomgraph;

/* JADX INFO: loaded from: classes14.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected n f338359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338360b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f338361c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338362d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f338363e = false;

    public m() {
    }

    protected abstract void a(org.locationtech.jts.geom.t tVar);

    public abstract org.locationtech.jts.geom.a b();

    public n c() {
        return this.f338359a;
    }

    public boolean d() {
        return this.f338361c;
    }

    public boolean e() {
        return this.f338362d;
    }

    public boolean f() {
        return this.f338360b;
    }

    public abstract boolean g();

    public boolean h() {
        return this.f338363e;
    }

    public void i(boolean z10) {
        this.f338361c = z10;
        this.f338362d = true;
    }

    public void j(boolean z10) {
        this.f338360b = z10;
    }

    public void k(n nVar) {
        this.f338359a = nVar;
    }

    public void l(boolean z10) {
        this.f338363e = z10;
    }

    public void m(org.locationtech.jts.geom.t tVar) {
        org.locationtech.jts.util.a.d(this.f338359a.c() >= 2, "found partial label");
        a(tVar);
    }

    public m(n nVar) {
        this.f338359a = nVar;
    }
}
