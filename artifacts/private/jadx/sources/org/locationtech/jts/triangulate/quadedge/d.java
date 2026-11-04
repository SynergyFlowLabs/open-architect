package org.locationtech.jts.triangulate.quadedge;

import org.locationtech.jts.geom.u;
import rm.o;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f339089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f339090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f339091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f339092d = null;

    private d() {
    }

    public static void A(d dVar) {
        d dVarQ = dVar.q();
        d dVarQ2 = dVar.B().q();
        z(dVar, dVarQ);
        z(dVar.B(), dVarQ2);
        z(dVar, dVarQ.m());
        z(dVar.B(), dVarQ2.m());
        dVar.y(dVarQ.e());
        dVar.w(dVarQ2.e());
    }

    public static d a(d dVar, d dVar2) {
        d dVarO = o(dVar.e(), dVar2.r());
        z(dVarO, dVar.m());
        z(dVarO.B(), dVar2);
        return dVarO;
    }

    public static d o(m mVar, m mVar2) {
        d dVar = new d();
        d dVar2 = new d();
        d dVar3 = new d();
        d dVar4 = new d();
        dVar.f339089a = dVar2;
        dVar2.f339089a = dVar3;
        dVar3.f339089a = dVar4;
        dVar4.f339089a = dVar;
        dVar.x(dVar);
        dVar2.x(dVar4);
        dVar3.x(dVar3);
        dVar4.x(dVar2);
        dVar.y(mVar);
        dVar.w(mVar2);
        return dVar;
    }

    public static void z(d dVar, d dVar2) {
        d dVarU = dVar.p().u();
        d dVarU2 = dVar2.p().u();
        d dVarP = dVar2.p();
        d dVarP2 = dVar.p();
        d dVarP3 = dVarU2.p();
        d dVarP4 = dVarU.p();
        dVar.x(dVarP);
        dVar2.x(dVarP2);
        dVarU.x(dVarP3);
        dVarU2.x(dVarP4);
    }

    public final d B() {
        return this.f339089a.f339089a;
    }

    public u C() {
        return new u(this.f339090b.k(), e().k());
    }

    public final d b() {
        return B().p().B();
    }

    public final d c() {
        return k().p().k();
    }

    public void d() {
        this.f339089a = null;
    }

    public final m e() {
        return B().r();
    }

    public boolean f(d dVar) {
        return g(dVar) || g(dVar.B());
    }

    public boolean g(d dVar) {
        return r().k().p(dVar.r().k()) && e().k().p(dVar.e().k());
    }

    public Object h() {
        return this.f339092d;
    }

    public double i() {
        return r().k().l(e().k());
    }

    public d j() {
        return r().k().compareTo(e().k()) <= 0 ? this : B();
    }

    public final d k() {
        return this.f339089a.B();
    }

    public boolean l() {
        return this.f339089a != null;
    }

    public final d m() {
        return k().p().u();
    }

    public final d n() {
        return this.f339091c.B();
    }

    public final d p() {
        return this.f339091c;
    }

    public final d q() {
        return this.f339089a.f339091c.f339089a;
    }

    public final m r() {
        return this.f339090b;
    }

    public final d s() {
        return this.f339089a.f339091c.k();
    }

    public final d t() {
        return B().p();
    }

    public String toString() {
        return o.A(this.f339090b.k(), e().k());
    }

    public final d u() {
        return this.f339089a;
    }

    public void v(Object obj) {
        this.f339092d = obj;
    }

    void w(m mVar) {
        B().y(mVar);
    }

    public void x(d dVar) {
        this.f339091c = dVar;
    }

    void y(m mVar) {
        this.f339090b = mVar;
    }
}
