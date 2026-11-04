package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.c0;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.utils.o0;

/* JADX INFO: loaded from: classes3.dex */
public interface g {

    public static class a implements o0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f94664b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f94666d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f94668f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f94670h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f94663a = new d0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d0 f94665c = new d0(0.0f, 1.0f, 0.0f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.badlogic.gdx.graphics.b f94667e = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c0 f94669g = new c0();

        public a a(a aVar, float f10) {
            if (this.f94664b && aVar.f94664b) {
                this.f94663a.E(aVar.f94663a, f10);
            }
            if (this.f94666d && aVar.f94666d) {
                this.f94665c.E(aVar.f94665c, f10);
            }
            if (this.f94668f && aVar.f94668f) {
                this.f94667e.j(aVar.f94667e, f10);
            }
            if (this.f94670h && aVar.f94670h) {
                this.f94669g.E(aVar.f94669g, f10);
            }
            return this;
        }

        public a b(a aVar) {
            if (aVar == null) {
                return c(null, null, null, null);
            }
            this.f94664b = aVar.f94664b;
            this.f94663a.L(aVar.f94663a);
            this.f94666d = aVar.f94666d;
            this.f94665c.L(aVar.f94665c);
            this.f94668f = aVar.f94668f;
            this.f94667e.D(aVar.f94667e);
            this.f94670h = aVar.f94670h;
            this.f94669g.L(aVar.f94669g);
            return this;
        }

        public a c(d0 d0Var, d0 d0Var2, com.badlogic.gdx.graphics.b bVar, c0 c0Var) {
            reset();
            boolean z10 = d0Var != null;
            this.f94664b = z10;
            if (z10) {
                this.f94663a.L(d0Var);
            }
            boolean z11 = d0Var2 != null;
            this.f94666d = z11;
            if (z11) {
                this.f94665c.L(d0Var2);
            }
            boolean z12 = bVar != null;
            this.f94668f = z12;
            if (z12) {
                this.f94667e.D(bVar);
            }
            boolean z13 = c0Var != null;
            this.f94670h = z13;
            if (z13) {
                this.f94669g.L(c0Var);
            }
            return this;
        }

        public a d(float f10, float f11, float f12, float f13) {
            this.f94667e.B(f10, f11, f12, f13);
            this.f94668f = true;
            return this;
        }

        public a e(com.badlogic.gdx.graphics.b bVar) {
            boolean z10 = bVar != null;
            this.f94668f = z10;
            if (z10) {
                this.f94667e.D(bVar);
            }
            return this;
        }

        public a f(float f10, float f11, float f12) {
            this.f94665c.y0(f10, f11, f12);
            this.f94666d = true;
            return this;
        }

        public a g(d0 d0Var) {
            boolean z10 = d0Var != null;
            this.f94666d = z10;
            if (z10) {
                this.f94665c.L(d0Var);
            }
            return this;
        }

        public a h(float f10, float f11, float f12) {
            this.f94663a.y0(f10, f11, f12);
            this.f94664b = true;
            return this;
        }

        public a i(d0 d0Var) {
            boolean z10 = d0Var != null;
            this.f94664b = z10;
            if (z10) {
                this.f94663a.L(d0Var);
            }
            return this;
        }

        public a j(float f10, float f11) {
            this.f94669g.K0(f10, f11);
            this.f94670h = true;
            return this;
        }

        public a k(c0 c0Var) {
            boolean z10 = c0Var != null;
            this.f94670h = z10;
            if (z10) {
                this.f94669g.L(c0Var);
            }
            return this;
        }

        @Override // com.badlogic.gdx.utils.o0.a
        public void reset() {
            this.f94663a.y0(0.0f, 0.0f, 0.0f);
            this.f94665c.y0(0.0f, 1.0f, 0.0f);
            this.f94667e.B(1.0f, 1.0f, 1.0f, 1.0f);
            this.f94669g.K0(0.0f, 0.0f);
        }
    }

    void A(float f10, float f11, int i10, d0 d0Var, d0 d0Var2, float f12, float f13);

    void B(short s10, short s11, short s12, short s13);

    void C(short s10, short s11, short s12, short s13, short s14, short s15, short s16, short s17);

    void D(a aVar, a aVar2, a aVar3, a aVar4, int i10, int i11);

    void E(float f10, float f11, float f12, float f13, int i10, d0 d0Var, d0 d0Var2);

    void F(float f10, float f11, float f12, int i10, int i11, float f13, float f14, float f15, float f16);

    void G(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, d0 d0Var6, d0 d0Var7, d0 d0Var8);

    void H(float f10, int i10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24);

    void I(float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19);

    void J(float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17);

    boolean K();

    void L(float f10, float f11, float f12, int i10, float f13, float f14);

    void M(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5);

    void N(com.badlogic.gdx.graphics.f fVar, int i10, int i11);

    void O(float f10, float f11, int i10, d0 d0Var, d0 d0Var2);

    void P(float f10, int i10, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, float f11, float f12);

    void Q(short s10, short s11, short s12);

    void R(float f10, int i10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22);

    void S(Matrix4 matrix4);

    short T(a aVar);

    void U(d0 d0Var, com.badlogic.gdx.graphics.b bVar, d0 d0Var2, com.badlogic.gdx.graphics.b bVar2, d0 d0Var3, com.badlogic.gdx.graphics.b bVar3);

    void V(float f10, float f11, int i10, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4);

    void W(float f10, float f11, float f12, float f13, int i10, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27);

    void X(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, int i10, int i11);

    void Y(float f10, int i10, d0 d0Var, d0 d0Var2);

    void Z(float f10, float f11, float f12, int i10, int i11);

    void a(float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25);

    com.badlogic.gdx.graphics.g3d.model.b a0();

    short b(float... fArr);

    void b0(short s10, short s11, short s12);

    void c(float f10, float f11, float f12, float f13, int i10, float f14, float f15, float f16, float f17, float f18, float f19);

    Matrix4 c0(Matrix4 matrix4);

    void d(float f10, float f11, float f12, int i10, float f13, float f14);

    void d0(d0 d0Var, d0 d0Var2);

    short e(d0 d0Var, d0 d0Var2, com.badlogic.gdx.graphics.b bVar, c0 c0Var);

    void e0(a aVar, a aVar2, a aVar3);

    void f(float f10, float f11, float f12, float f13);

    void f0(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24);

    void g(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, int i10, int i11);

    void g0(float f10, int i10, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4);

    com.badlogic.gdx.graphics.n getAttributes();

    void h(short s10, short s11);

    void h0(float f10, float f11, int i10);

    void i(a aVar, a aVar2);

    void i0(float f10, float f11, int i10, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, float f12, float f13);

    short j();

    void j0(com.badlogic.gdx.graphics.g3d.model.b bVar);

    void k(short s10, short s11, short s12, short s13, short s14, short s15);

    void k0(float f10, float f11, float f12, int i10, float f13, float f14, boolean z10);

    void l(float f10, float f11, float f12);

    void l0(float f10, float f11, float f12, float f13, float f14, float f15);

    void m(short s10, short s11, short s12, short s13);

    void m0(a aVar, a aVar2, a aVar3, a aVar4);

    void n(Matrix4 matrix4, float f10, float f11, float f12, int i10, int i11, float f13, float f14, float f15, float f16);

    void n0(short s10, short s11);

    void o(float f10, int i10, float f11, float f12, float f13, float f14, float f15, float f16);

    void o0(com.badlogic.gdx.graphics.f fVar);

    void p(float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23);

    void p0(float f10, float f11, float f12, float f13, int i10, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21);

    void q(float f10, float f11, float f12, int i10);

    void q0(float f10, float f11, float f12, int i10);

    void r(float f10, float f11, float f12, float f13, float f14, float f15);

    void r0(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8);

    void s(short s10);

    void s0(Matrix4 matrix4, float f10, float f11, float f12, int i10, int i11);

    void t(com.badlogic.gdx.graphics.b bVar);

    void t0(float f10, int i10, d0 d0Var, d0 d0Var2, float f11, float f12);

    void u(boolean z10);

    void u0(Matrix4 matrix4);

    void v(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10);

    void v0(d0 d0Var, d0 d0Var2, d0 d0Var3);

    void w(float f10, float f11, float f12, float f13);

    void x(float f10, int i10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18);

    void y(com.badlogic.gdx.graphics.g2d.e eVar);

    void z(d0 d0Var, com.badlogic.gdx.graphics.b bVar, d0 d0Var2, com.badlogic.gdx.graphics.b bVar2);
}
