package org.locationtech.jts.precision;

import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f338972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f338973b;

    public b() {
        this(true);
    }

    private n b(n nVar) {
        if (this.f338972a) {
            this.f338973b.b(nVar);
        }
        return nVar;
    }

    private n e(n nVar) {
        c cVar = new c();
        this.f338973b = cVar;
        cVar.a(nVar);
        return this.f338973b.d(nVar.w());
    }

    private n[] f(n nVar, n nVar2) {
        c cVar = new c();
        this.f338973b = cVar;
        cVar.a(nVar);
        this.f338973b.a(nVar2);
        return new n[]{this.f338973b.d(nVar.w()), this.f338973b.d(nVar2.w())};
    }

    public n a(n nVar, double d10) {
        return b(e(nVar).f(d10));
    }

    public n c(n nVar, n nVar2) {
        n[] nVarArrF = f(nVar, nVar2);
        return b(nVarArrF[0].H(nVarArrF[1]));
    }

    public n d(n nVar, n nVar2) {
        n[] nVarArrF = f(nVar, nVar2);
        return b(nVarArrF[0].t0(nVarArrF[1]));
    }

    public n g(n nVar, n nVar2) {
        n[] nVarArrF = f(nVar, nVar2);
        return b(nVarArrF[0].K0(nVarArrF[1]));
    }

    public n h(n nVar, n nVar2) {
        n[] nVarArrF = f(nVar, nVar2);
        return b(nVarArrF[0].O0(nVarArrF[1]));
    }

    public b(boolean z10) {
        this.f338972a = z10;
    }
}
