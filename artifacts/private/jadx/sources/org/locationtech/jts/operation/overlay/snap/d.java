package org.locationtech.jts.operation.overlay.snap;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.operation.overlay.g;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n[] f338839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.precision.c f338841c;

    public d(n nVar, n nVar2) {
        this.f338839a = new n[]{nVar, nVar2};
        b();
    }

    private void a(n nVar) {
        if (nVar.A0()) {
            return;
        }
        System.out.println("Snapped geometry is invalid");
    }

    private void b() {
        n[] nVarArr = this.f338839a;
        this.f338840b = a.c(nVarArr[0], nVarArr[1]);
    }

    public static n c(n nVar, n nVar2) {
        return f(nVar, nVar2, 3);
    }

    public static n e(n nVar, n nVar2) {
        return f(nVar, nVar2, 1);
    }

    public static n f(n nVar, n nVar2, int i10) {
        return new d(nVar, nVar2).d(i10);
    }

    private n g(n nVar) {
        this.f338841c.b(nVar);
        return nVar;
    }

    private n[] h(n[] nVarArr) {
        org.locationtech.jts.precision.c cVar = new org.locationtech.jts.precision.c();
        this.f338841c = cVar;
        cVar.a(nVarArr[0]);
        this.f338841c.a(nVarArr[1]);
        return new n[]{this.f338841c.d(nVarArr[0].w()), this.f338841c.d(nVarArr[1].w())};
    }

    private n i(n nVar) {
        return new a(nVar).h(nVar, this.f338840b);
    }

    private n[] j(n[] nVarArr) {
        n[] nVarArrH = h(nVarArr);
        return a.g(nVarArrH[0], nVarArrH[1], this.f338840b);
    }

    public static n k(n nVar, n nVar2) {
        return f(nVar, nVar2, 4);
    }

    public static n l(n nVar, n nVar2) {
        return f(nVar, nVar2, 2);
    }

    public n d(int i10) {
        n[] nVarArrJ = j(this.f338839a);
        return g(g.w(nVarArrJ[0], nVarArrJ[1], i10));
    }
}
