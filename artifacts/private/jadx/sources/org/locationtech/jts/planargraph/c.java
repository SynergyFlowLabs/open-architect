package org.locationtech.jts.planargraph;

/* JADX INFO: loaded from: classes14.dex */
public class c extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected a[] f338954d;

    public c() {
    }

    public e D(e eVar) {
        if (this.f338954d[0].L() == eVar) {
            return this.f338954d[0].O();
        }
        if (this.f338954d[1].L() == eVar) {
            return this.f338954d[1].O();
        }
        return null;
    }

    void E() {
        this.f338954d = null;
    }

    public void H(a aVar, a aVar2) {
        this.f338954d = new a[]{aVar, aVar2};
        aVar.T(this);
        aVar2.T(this);
        aVar.U(aVar2);
        aVar2.U(aVar);
        aVar.L().x(aVar);
        aVar2.L().x(aVar2);
    }

    @Override // org.locationtech.jts.planargraph.d
    public boolean o() {
        return this.f338954d == null;
    }

    public a x(int i10) {
        return this.f338954d[i10];
    }

    public a z(e eVar) {
        if (this.f338954d[0].L() == eVar) {
            return this.f338954d[0];
        }
        if (this.f338954d[1].L() == eVar) {
            return this.f338954d[1];
        }
        return null;
    }

    public c(a aVar, a aVar2) {
        H(aVar, aVar2);
    }
}
