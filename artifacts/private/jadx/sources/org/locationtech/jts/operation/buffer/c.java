package org.locationtech.jts.operation.buffer;

import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.i0;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.noding.r;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f338685f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f338686g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f338687h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f338688i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f338689j = 12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f338692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n f338693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RuntimeException f338694e;

    public c(n nVar) {
        this.f338692c = new d();
        this.f338693d = null;
        this.f338690a = nVar;
    }

    private void a(g0 g0Var) {
        r rVar = new r(new org.locationtech.jts.noding.snapround.d(new g0(1.0d)), g0Var.o());
        a aVar = new a(this.f338692c);
        aVar.k(g0Var);
        aVar.j(rVar);
        this.f338693d = aVar.a(this.f338690a, this.f338691b);
    }

    public static n b(n nVar, double d10) {
        return new c(nVar).j(d10);
    }

    public static n c(n nVar, double d10, int i10) {
        c cVar = new c(nVar);
        cVar.m(i10);
        return cVar.j(d10);
    }

    public static n d(n nVar, double d10, int i10, int i11) {
        c cVar = new c(nVar);
        cVar.m(i10);
        cVar.l(i11);
        return cVar.j(d10);
    }

    public static n e(n nVar, double d10, d dVar) {
        return new c(nVar, dVar).j(d10);
    }

    private void f() {
        try {
            this.f338693d = new a(this.f338692c).a(this.f338690a, this.f338691b);
        } catch (RuntimeException e10) {
            this.f338694e = e10;
        }
    }

    private void g() {
        for (int i10 = f338689j; i10 >= 0; i10--) {
            try {
                h(i10);
            } catch (i0 e10) {
                this.f338694e = e10;
            }
            if (this.f338693d != null) {
                return;
            }
        }
        throw this.f338694e;
    }

    private void h(int i10) {
        a(new g0(k(this.f338690a, this.f338691b, i10)));
    }

    private void i() {
        f();
        if (this.f338693d != null) {
            return;
        }
        g0 g0VarF = this.f338690a.g0().F();
        if (g0VarF.p() == g0.f338117d) {
            a(g0VarF);
        } else {
            g();
        }
    }

    private static double k(n nVar, double d10, int i10) {
        m mVarF0 = nVar.f0();
        double dF = tm.b.f(Math.abs(mVarF0.H()), Math.abs(mVarF0.I()), Math.abs(mVarF0.L()), Math.abs(mVarF0.M()));
        if (d10 <= 0.0d) {
            d10 = 0.0d;
        }
        return Math.pow(10.0d, i10 - ((int) ((Math.log(dF + (d10 * 2.0d)) / Math.log(10.0d)) + 1.0d)));
    }

    public n j(double d10) {
        this.f338691b = d10;
        i();
        return this.f338693d;
    }

    public void l(int i10) {
        this.f338692c.h(i10);
    }

    public void m(int i10) {
        this.f338692c.k(i10);
    }

    public c(n nVar, d dVar) {
        new d();
        this.f338693d = null;
        this.f338690a = nVar;
        this.f338692c = dVar;
    }
}
