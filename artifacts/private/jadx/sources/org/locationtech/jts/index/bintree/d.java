package org.locationtech.jts.index.bintree;

/* JADX INFO: loaded from: classes14.dex */
public class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f338387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f338388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f338389e;

    public d(b bVar, int i10) {
        this.f338387c = bVar;
        this.f338389e = i10;
        this.f338388d = (bVar.f() + bVar.e()) / 2.0d;
    }

    public static d n(d dVar, b bVar) {
        b bVar2 = new b(bVar);
        if (dVar != null) {
            bVar2.d(dVar.f338387c);
        }
        d dVarO = o(bVar2);
        if (dVar != null) {
            dVarO.u(dVar);
        }
        return dVarO;
    }

    public static d o(b bVar) {
        c cVar = new c(bVar);
        return new d(cVar.d(), cVar.e());
    }

    private d p(int i10) {
        double dF;
        double dE;
        if (i10 == 0) {
            dF = this.f338387c.f();
            dE = this.f338388d;
        } else if (i10 != 1) {
            dF = 0.0d;
            dE = 0.0d;
        } else {
            dF = this.f338388d;
            dE = this.f338387c.e();
        }
        return new d(new b(dF, dE), this.f338389e - 1);
    }

    private d t(int i10) {
        d[] dVarArr = this.f338391b;
        if (dVarArr[i10] == null) {
            dVarArr[i10] = p(i10);
        }
        return this.f338391b[i10];
    }

    @Override // org.locationtech.jts.index.bintree.e
    protected boolean j(b bVar) {
        return bVar.j(this.f338387c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.locationtech.jts.index.bintree.e] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public e q(b bVar) {
        ?? Q;
        int iF = e.f(bVar, this.f338388d);
        if (iF == -1) {
            this = this;
        } else {
            d dVar = this.f338391b[iF];
            if (dVar != null) {
                this = this;
                Q = dVar.q(bVar);
            }
        }
        this = this;
        return Q;
    }

    public b r() {
        return this.f338387c;
    }

    public d s(b bVar) {
        int iF = e.f(bVar, this.f338388d);
        if (iF != -1) {
            this = t(iF).s(bVar);
        }
        return this;
    }

    void u(d dVar) {
        b bVar = this.f338387c;
        org.locationtech.jts.util.a.c(bVar == null || bVar.c(dVar.f338387c));
        int iF = e.f(dVar.f338387c, this.f338388d);
        if (dVar.f338389e == this.f338389e - 1) {
            this.f338391b[iF] = dVar;
            return;
        }
        d dVarP = p(iF);
        dVarP.u(dVar);
        this.f338391b[iF] = dVarP;
    }
}
