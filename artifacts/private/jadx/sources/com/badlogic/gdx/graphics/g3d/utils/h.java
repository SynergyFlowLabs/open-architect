package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.utils.t;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.badlogic.gdx.graphics.g3d.e f94671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.badlogic.gdx.graphics.g3d.model.c f94672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.badlogic.gdx.utils.b<f> f94673c = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Matrix4 f94674d = new Matrix4();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.engine.a f94675e;

    public h(com.planner5d.library.engine.a aVar) {
        this.f94675e = aVar;
    }

    private f A(com.badlogic.gdx.graphics.n nVar) {
        for (f fVar : this.f94673c) {
            if (fVar.getAttributes().equals(nVar) && fVar.j() < 16383) {
                return fVar;
            }
        }
        f fVar2 = new f();
        fVar2.A0(nVar);
        this.f94673c.c(fVar2);
        return fVar2;
    }

    public static void K(com.badlogic.gdx.graphics.g3d.e eVar) {
        eVar.f94383a.clear();
        eVar.f94386d.clear();
        eVar.f94387e.clear();
        Iterator<com.badlogic.gdx.graphics.g3d.model.c> it = eVar.f94384b.iterator();
        while (it.hasNext()) {
            L(eVar, it.next());
        }
    }

    private static void L(com.badlogic.gdx.graphics.g3d.e eVar, com.badlogic.gdx.graphics.g3d.model.c cVar) {
        for (com.badlogic.gdx.graphics.g3d.model.f fVar : cVar.f94448i) {
            if (!eVar.f94383a.m(fVar.f94458b, true)) {
                eVar.f94383a.c(fVar.f94458b);
            }
            if (!eVar.f94387e.m(fVar.f94457a, true)) {
                eVar.f94387e.c(fVar.f94457a);
                if (!eVar.f94386d.m(fVar.f94457a.f94439e, true)) {
                    eVar.f94386d.c(fVar.f94457a.f94439e);
                }
                eVar.E(fVar.f94457a.f94439e);
            }
        }
        Iterator<com.badlogic.gdx.graphics.g3d.model.c> it = cVar.n().iterator();
        while (it.hasNext()) {
            L(eVar, it.next());
        }
    }

    private void z() {
        if (this.f94672b != null) {
            this.f94672b = null;
        }
    }

    public void B(gc.e eVar) {
        com.badlogic.gdx.graphics.g3d.e eVar2 = this.f94671a;
        if (eVar2 == null) {
            throw new t("Call begin() first");
        }
        eVar2.E(eVar);
    }

    public com.badlogic.gdx.graphics.g3d.model.c C() {
        com.badlogic.gdx.graphics.g3d.model.c cVar = new com.badlogic.gdx.graphics.g3d.model.c();
        D(cVar);
        cVar.f94440a = "node" + this.f94671a.f94384b.f95174b;
        return cVar;
    }

    protected com.badlogic.gdx.graphics.g3d.model.c D(com.badlogic.gdx.graphics.g3d.model.c cVar) {
        if (this.f94671a == null) {
            throw new t("Call begin() first");
        }
        z();
        this.f94671a.f94384b.c(cVar);
        this.f94672b = cVar;
        return cVar;
    }

    public com.badlogic.gdx.graphics.g3d.model.c E(String str, com.badlogic.gdx.graphics.g3d.e eVar) {
        com.badlogic.gdx.graphics.g3d.model.c cVar = new com.badlogic.gdx.graphics.g3d.model.c();
        cVar.f94440a = str;
        cVar.b(eVar.f94384b);
        D(cVar);
        Iterator<gc.e> it = eVar.j().iterator();
        while (it.hasNext()) {
            B(it.next());
        }
        return cVar;
    }

    public com.badlogic.gdx.graphics.g3d.model.b F(String str, com.badlogic.gdx.graphics.f fVar, int i10, int i11, int i12, com.badlogic.gdx.graphics.g3d.d dVar) {
        com.badlogic.gdx.graphics.g3d.model.b bVar = new com.badlogic.gdx.graphics.g3d.model.b();
        bVar.f94435a = str;
        bVar.f94436b = i10;
        bVar.f94439e = fVar;
        bVar.f94437c = i11;
        bVar.f94438d = i12;
        J(bVar, dVar);
        return bVar;
    }

    public com.badlogic.gdx.graphics.g3d.model.b G(String str, com.badlogic.gdx.graphics.f fVar, int i10, com.badlogic.gdx.graphics.g3d.d dVar) {
        return F(str, fVar, i10, 0, fVar.v1(), dVar);
    }

    public g H(String str, int i10, long j10, com.badlogic.gdx.graphics.g3d.d dVar) {
        return I(str, i10, f.D0(j10), dVar);
    }

    public g I(String str, int i10, com.badlogic.gdx.graphics.n nVar, com.badlogic.gdx.graphics.g3d.d dVar) {
        f fVarA = A(nVar);
        J(fVarA.S0(str, i10), dVar);
        return fVarA;
    }

    public void J(com.badlogic.gdx.graphics.g3d.model.b bVar, com.badlogic.gdx.graphics.g3d.d dVar) {
        if (this.f94672b == null) {
            C();
        }
        this.f94672b.f94448i.c(new com.badlogic.gdx.graphics.g3d.model.f(bVar, dVar));
    }

    public void a() {
        if (this.f94671a != null) {
            throw new t("Call end() first");
        }
        this.f94672b = null;
        this.f94671a = new com.badlogic.gdx.graphics.g3d.e();
        this.f94673c.clear();
    }

    public com.badlogic.gdx.graphics.g3d.e b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10, int i11, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        a();
        H("arrow", i11, j10, dVar).v(f10, f11, f12, f13, f14, f15, f16, f17, i10);
        return y();
    }

    public com.badlogic.gdx.graphics.g3d.e c(d0 d0Var, d0 d0Var2, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        return b(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c, 0.1f, 0.1f, 5, 4, dVar, j10);
    }

    public com.badlogic.gdx.graphics.g3d.e d(float f10, float f11, float f12, int i10, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        a();
        H("box", i10, j10, dVar).l(f10, f11, f12);
        return y();
    }

    public com.badlogic.gdx.graphics.g3d.e e(float f10, float f11, float f12, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        return d(f10, f11, f12, 4, dVar, j10);
    }

    public com.badlogic.gdx.graphics.g3d.e f(float f10, float f11, int i10, int i11, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        a();
        H("capsule", i11, j10, dVar).h0(f10, f11, i10);
        return y();
    }

    public com.badlogic.gdx.graphics.g3d.e g(float f10, float f11, int i10, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        return f(f10, f11, i10, 4, dVar, j10);
    }

    public com.badlogic.gdx.graphics.g3d.e h(float f10, float f11, float f12, int i10, int i11, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        return i(f10, f11, f12, i10, i11, dVar, j10, 0.0f, 360.0f);
    }

    public com.badlogic.gdx.graphics.g3d.e i(float f10, float f11, float f12, int i10, int i11, com.badlogic.gdx.graphics.g3d.d dVar, long j10, float f13, float f14) {
        a();
        H("cone", i11, j10, dVar).d(f10, f11, f12, i10, f13, f14);
        return y();
    }

    public com.badlogic.gdx.graphics.g3d.e j(float f10, float f11, float f12, int i10, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        return h(f10, f11, f12, i10, 4, dVar, j10);
    }

    public com.badlogic.gdx.graphics.g3d.e k(float f10, float f11, float f12, int i10, com.badlogic.gdx.graphics.g3d.d dVar, long j10, float f13, float f14) {
        return i(f10, f11, f12, i10, 4, dVar, j10, f13, f14);
    }

    public com.badlogic.gdx.graphics.g3d.e l(float f10, float f11, float f12, int i10, int i11, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        return m(f10, f11, f12, i10, i11, dVar, j10, 0.0f, 360.0f);
    }

    public com.badlogic.gdx.graphics.g3d.e m(float f10, float f11, float f12, int i10, int i11, com.badlogic.gdx.graphics.g3d.d dVar, long j10, float f13, float f14) {
        a();
        H("cylinder", i11, j10, dVar).L(f10, f11, f12, i10, f13, f14);
        return y();
    }

    public com.badlogic.gdx.graphics.g3d.e n(float f10, float f11, float f12, int i10, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        return l(f10, f11, f12, i10, 4, dVar, j10);
    }

    public com.badlogic.gdx.graphics.g3d.e o(float f10, float f11, float f12, int i10, com.badlogic.gdx.graphics.g3d.d dVar, long j10, float f13, float f14) {
        return m(f10, f11, f12, i10, 4, dVar, j10, f13, f14);
    }

    public com.badlogic.gdx.graphics.g3d.e p(int i10, int i11, float f10, float f11, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        a();
        g gVarH = H("lines", 1, j10, dVar);
        float f12 = (i10 * f10) / 2.0f;
        float f13 = (i11 * f11) / 2.0f;
        float f14 = -f12;
        float f15 = -f13;
        float f16 = f14;
        float f17 = f16;
        for (int i12 = 0; i12 <= i10; i12++) {
            gVarH.r(f16, 0.0f, f13, f17, 0.0f, f15);
            f16 += f10;
            f17 += f10;
        }
        float f18 = f15;
        for (int i13 = 0; i13 <= i11; i13++) {
            gVarH.r(f14, 0.0f, f18, f12, 0.0f, f15);
            f18 += f11;
            f15 += f11;
        }
        return y();
    }

    public com.badlogic.gdx.graphics.g3d.e q(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, int i10, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        a();
        H("rect", i10, j10, dVar).f0(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24);
        return y();
    }

    public com.badlogic.gdx.graphics.g3d.e r(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        return q(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, 4, dVar, j10);
    }

    public com.badlogic.gdx.graphics.g3d.e s(float f10, float f11, float f12, int i10, int i11, int i12, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        return t(f10, f11, f12, i10, i11, i12, dVar, j10, 0.0f, 360.0f, 0.0f, 180.0f);
    }

    public com.badlogic.gdx.graphics.g3d.e t(float f10, float f11, float f12, int i10, int i11, int i12, com.badlogic.gdx.graphics.g3d.d dVar, long j10, float f13, float f14, float f15, float f16) {
        a();
        H("cylinder", i12, j10, dVar).F(f10, f11, f12, i10, i11, f13, f14, f15, f16);
        return y();
    }

    public com.badlogic.gdx.graphics.g3d.e u(float f10, float f11, float f12, int i10, int i11, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        return s(f10, f11, f12, i10, i11, 4, dVar, j10);
    }

    public com.badlogic.gdx.graphics.g3d.e v(float f10, float f11, float f12, int i10, int i11, com.badlogic.gdx.graphics.g3d.d dVar, long j10, float f13, float f14, float f15, float f16) {
        return t(f10, f11, f12, i10, i11, 4, dVar, j10, f13, f14, f15, f16);
    }

    public com.badlogic.gdx.graphics.g3d.e w(float f10, float f11, float f12, int i10, int i11, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        a();
        C();
        g gVarH = H("xyz", i11, j10, dVar);
        gVarH.t(com.badlogic.gdx.graphics.b.f94171h);
        gVarH.v(0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, f11, f12, i10);
        gVarH.t(com.badlogic.gdx.graphics.b.f94172i);
        gVarH.v(0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, f11, f12, i10);
        gVarH.t(com.badlogic.gdx.graphics.b.f94173j);
        gVarH.v(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, f11, f12, i10);
        return y();
    }

    public com.badlogic.gdx.graphics.g3d.e x(float f10, com.badlogic.gdx.graphics.g3d.d dVar, long j10) {
        return w(f10, 0.1f, 0.1f, 5, 4, dVar, j10);
    }

    public com.badlogic.gdx.graphics.g3d.e y() {
        com.badlogic.gdx.graphics.g3d.e eVar = this.f94671a;
        if (eVar == null) {
            throw new t("Call begin() first");
        }
        z();
        this.f94671a = null;
        Iterator<f> it = this.f94673c.iterator();
        while (it.hasNext()) {
            it.next().F0(this.f94675e);
        }
        this.f94673c.clear();
        K(eVar);
        return eVar;
    }
}
