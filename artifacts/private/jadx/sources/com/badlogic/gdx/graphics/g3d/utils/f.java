package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.c0;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.math.s;
import com.badlogic.gdx.math.t;
import com.badlogic.gdx.utils.a1;
import com.badlogic.gdx.utils.h0;
import com.badlogic.gdx.utils.o0;
import com.badlogic.gdx.utils.q;
import com.badlogic.gdx.utils.x;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class f implements g {
    private static final a1 V = new a1();
    private static final q W = new q();
    private static final o0<d0> X = new a();
    private static final com.badlogic.gdx.utils.b<d0> Y = new com.badlogic.gdx.utils.b<>();
    private static final o0<Matrix4> Z = new b();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final com.badlogic.gdx.utils.b<Matrix4> f94634a0 = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final d0 f94635b0 = new d0();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static x f94636c0 = null;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private com.badlogic.gdx.graphics.g3d.model.b F;
    private int J;
    private float[] P;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.badlogic.gdx.graphics.n f94655s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f94658v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private short f94659w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f94660x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f94661y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f94662z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f94637a = new g.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g.a f94638b = new g.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.a f94639c = new g.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g.a f94640d = new g.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g.a f94641e = new g.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g.a f94642f = new g.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g.a f94643g = new g.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g.a f94644h = new g.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Matrix4 f94645i = new Matrix4();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d0 f94646j = new d0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d0 f94647k = new d0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d0 f94648l = new d0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d0 f94649m = new d0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d0 f94650n = new d0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d0 f94651o = new d0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d0 f94652p = new d0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d0 f94653q = new d0();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.badlogic.gdx.graphics.b f94654r = new com.badlogic.gdx.graphics.b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private q f94656t = new q();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a1 f94657u = new a1();
    private com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.b> G = new com.badlogic.gdx.utils.b<>();
    private final com.badlogic.gdx.graphics.b H = new com.badlogic.gdx.graphics.b(com.badlogic.gdx.graphics.b.f94169f);
    private boolean I = false;
    private float K = 0.0f;
    private float L = 1.0f;
    private float M = 0.0f;
    private float N = 1.0f;
    private boolean O = false;
    private boolean Q = false;
    private final Matrix4 R = new Matrix4();
    private final t S = new t();
    private short T = -1;
    private final d0 U = new d0();

    class a extends o0<d0> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.badlogic.gdx.utils.o0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public d0 e() {
            return new d0();
        }
    }

    class b extends o0<Matrix4> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.badlogic.gdx.utils.o0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Matrix4 e() {
            return new Matrix4();
        }
    }

    private void C0() {
        o0<d0> o0Var = X;
        com.badlogic.gdx.utils.b<d0> bVar = Y;
        o0Var.c(bVar);
        bVar.clear();
        o0<Matrix4> o0Var2 = Z;
        com.badlogic.gdx.utils.b<Matrix4> bVar2 = f94634a0;
        o0Var2.c(bVar2);
        bVar2.clear();
    }

    public static com.badlogic.gdx.graphics.n D0(long j10) {
        com.badlogic.gdx.utils.b bVar = new com.badlogic.gdx.utils.b();
        if ((j10 & 1) == 1) {
            bVar.c(new com.badlogic.gdx.graphics.m(1, 3, com.badlogic.gdx.graphics.glutils.j.f94733p0));
        }
        if ((j10 & 2) == 2) {
            bVar.c(new com.badlogic.gdx.graphics.m(2, 4, com.badlogic.gdx.graphics.glutils.j.H1));
        }
        if ((j10 & 4) == 4) {
            bVar.c(new com.badlogic.gdx.graphics.m(4, 4, com.badlogic.gdx.graphics.glutils.j.H1));
        }
        if ((j10 & 8) == 8) {
            bVar.c(new com.badlogic.gdx.graphics.m(8, 3, com.badlogic.gdx.graphics.glutils.j.f94734p1));
        }
        if ((j10 & 16) == 16) {
            bVar.c(new com.badlogic.gdx.graphics.m(16, 2, "a_texCoord0"));
        }
        int i10 = bVar.f95174b;
        com.badlogic.gdx.graphics.m[] mVarArr = new com.badlogic.gdx.graphics.m[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            mVarArr[i11] = (com.badlogic.gdx.graphics.m) bVar.get(i11);
        }
        return new com.badlogic.gdx.graphics.n(mVarArr);
    }

    private void G0() {
        com.badlogic.gdx.graphics.g3d.model.b bVar = this.F;
        if (bVar != null) {
            int i10 = this.f94660x;
            bVar.f94437c = i10;
            int i11 = this.f94657u.f95171b;
            bVar.f94438d = i11 - i10;
            this.f94660x = i11;
            int i12 = 6 | 0;
            this.F = null;
        }
    }

    private Matrix4 U0() {
        Matrix4 matrix4T = Z.f().t();
        f94634a0.c(matrix4T);
        return matrix4T;
    }

    private Matrix4 V0(Matrix4 matrix4) {
        return U0().N(matrix4);
    }

    private d0 W0(float f10, float f11, float f12) {
        d0 d0VarY0 = X.f().y0(f10, f11, f12);
        Y.c(d0VarY0);
        return d0VarY0;
    }

    private d0 X0(d0 d0Var) {
        return W0(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c);
    }

    private static final void Y0(float[] fArr, int i10, int i11, t tVar) {
        if (i11 > 2) {
            d0 d0Var = f94635b0;
            int i12 = i10 + 1;
            int i13 = i10 + 2;
            d0Var.y0(fArr[i10], fArr[i12], fArr[i13]).i1(tVar).f();
            fArr[i10] = d0Var.f180482a;
            fArr[i12] = d0Var.f180483b;
            fArr[i13] = d0Var.f180484c;
            return;
        }
        if (i11 <= 1) {
            fArr[i10] = f94635b0.y0(fArr[i10], 0.0f, 0.0f).i1(tVar).f().f180482a;
            return;
        }
        d0 d0Var2 = f94635b0;
        int i14 = i10 + 1;
        d0Var2.y0(fArr[i10], fArr[i14], 0.0f).i1(tVar).f();
        fArr[i10] = d0Var2.f180482a;
        fArr[i14] = d0Var2.f180483b;
    }

    private static final void Z0(float[] fArr, int i10, int i11, Matrix4 matrix4) {
        if (i11 > 2) {
            d0 d0Var = f94635b0;
            int i12 = i10 + 1;
            int i13 = i10 + 2;
            d0Var.y0(fArr[i10], fArr[i12], fArr[i13]).j1(matrix4);
            fArr[i10] = d0Var.f180482a;
            fArr[i12] = d0Var.f180483b;
            fArr[i13] = d0Var.f180484c;
            return;
        }
        if (i11 <= 1) {
            fArr[i10] = f94635b0.y0(fArr[i10], 0.0f, 0.0f).j1(matrix4).f180482a;
            return;
        }
        d0 d0Var2 = f94635b0;
        int i14 = i10 + 1;
        d0Var2.y0(fArr[i10], fArr[i14], 0.0f).j1(matrix4);
        fArr[i10] = d0Var2.f180482a;
        fArr[i14] = d0Var2.f180483b;
    }

    private void w0(float[] fArr, short[] sArr, int i10, int i11) {
        x xVar = f94636c0;
        if (xVar == null) {
            f94636c0 = new x(i11);
        } else {
            xVar.clear();
            f94636c0.l(i11);
        }
        I0(i11);
        P0(fArr.length < i11 ? fArr.length : i11);
        for (int i12 = 0; i12 < i11; i12++) {
            short s10 = sArr[i12];
            int iP = f94636c0.p(s10, -1);
            if (iP < 0) {
                x0(fArr, this.f94658v * s10);
                x xVar2 = f94636c0;
                short s11 = this.T;
                xVar2.B(s10, s11);
                iP = s11;
            }
            s((short) iP);
        }
    }

    private final void x0(float[] fArr, int i10) {
        int i11;
        q qVar = this.f94656t;
        int i12 = qVar.f95730b;
        qVar.e(fArr, i10, this.f94658v);
        short s10 = this.f94659w;
        this.f94659w = (short) (s10 + 1);
        this.T = s10;
        if (this.Q) {
            Z0(this.f94656t.f95729a, this.f94661y + i12, this.f94662z, this.R);
            int i13 = this.A;
            if (i13 >= 0) {
                Y0(this.f94656t.f95729a, i13 + i12, 3, this.S);
            }
        }
        if (this.I) {
            int i14 = this.B;
            if (i14 >= 0) {
                float[] fArr2 = this.f94656t.f95729a;
                int i15 = i12 + i14;
                float f10 = fArr2[i15];
                com.badlogic.gdx.graphics.b bVar = this.H;
                fArr2[i15] = f10 * bVar.f94187a;
                int i16 = i12 + i14 + 1;
                fArr2[i16] = fArr2[i16] * bVar.f94188b;
                int i17 = i12 + i14 + 2;
                fArr2[i17] = fArr2[i17] * bVar.f94189c;
                if (this.C > 3) {
                    int i18 = i14 + i12 + 3;
                    fArr2[i18] = fArr2[i18] * bVar.f94190d;
                }
            } else {
                int i19 = this.D;
                if (i19 >= 0) {
                    float[] fArr3 = this.f94656t.f95729a;
                    fArr3[i12 + i19] = this.f94654r.C(h0.c(fArr3[i19 + i12])).n(this.H).G();
                }
            }
        }
        if (!this.O || (i11 = this.E) < 0) {
            return;
        }
        float[] fArr4 = this.f94656t.f95729a;
        fArr4[i12 + i11] = this.K + (this.L * fArr4[i12 + i11]);
        fArr4[i12 + i11 + 1] = this.M + (this.N * fArr4[i12 + i11 + 1]);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void A(float f10, float f11, int i10, d0 d0Var, d0 d0Var2, float f12, float f13) {
        p0(f10, f11, 0.0f, 0.0f, i10, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c, f12, f13);
    }

    public void A0(com.badlogic.gdx.graphics.n nVar) {
        B0(nVar, -1);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void B(short s10, short s11, short s12, short s13) {
        I0(4);
        this.f94657u.b(s10);
        this.f94657u.b(s11);
        this.f94657u.b(s12);
        this.f94657u.b(s13);
    }

    public void B0(com.badlogic.gdx.graphics.n nVar, int i10) {
        if (this.f94655s != null) {
            throw new RuntimeException("Call end() first");
        }
        this.f94655s = nVar;
        this.f94656t.f();
        this.f94657u.g();
        this.G.clear();
        int i11 = 0;
        this.f94659w = (short) 0;
        this.f94660x = 0;
        this.F = null;
        int i12 = nVar.f94833b / 4;
        this.f94658v = i12;
        float[] fArr = this.P;
        if (fArr == null || fArr.length < i12) {
            this.P = new float[i12];
        }
        com.badlogic.gdx.graphics.m mVarN = nVar.n(1);
        if (mVarN == null) {
            throw new com.badlogic.gdx.utils.t("Cannot build mesh without position attribute");
        }
        this.f94661y = mVarN.f94828e / 4;
        this.f94662z = mVarN.f94825b;
        com.badlogic.gdx.graphics.m mVarN2 = nVar.n(8);
        int i13 = -1;
        this.A = mVarN2 == null ? -1 : mVarN2.f94828e / 4;
        com.badlogic.gdx.graphics.m mVarN3 = nVar.n(2);
        this.B = mVarN3 == null ? -1 : mVarN3.f94828e / 4;
        if (mVarN3 != null) {
            i11 = mVarN3.f94825b;
        }
        this.C = i11;
        com.badlogic.gdx.graphics.m mVarN4 = nVar.n(4);
        this.D = mVarN4 == null ? -1 : mVarN4.f94828e / 4;
        com.badlogic.gdx.graphics.m mVarN5 = nVar.n(16);
        if (mVarN5 != null) {
            i13 = mVarN5.f94828e / 4;
        }
        this.E = i13;
        t(null);
        u0(null);
        y(null);
        this.J = i10;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void C(short s10, short s11, short s12, short s13, short s14, short s15, short s16, short s17) {
        I0(8);
        this.f94657u.b(s10);
        this.f94657u.b(s11);
        this.f94657u.b(s12);
        this.f94657u.b(s13);
        this.f94657u.b(s14);
        this.f94657u.b(s15);
        this.f94657u.b(s16);
        this.f94657u.b(s17);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void D(g.a aVar, g.a aVar2, g.a aVar3, g.a aVar4, int i10, int i11) {
        if (i10 < 1 || i11 < 1) {
            throw new com.badlogic.gdx.utils.t("divisionsU and divisionV must be > 0, u,v: " + i10 + ", " + i11);
        }
        L0((i11 + 1) * (i10 + 1), i11 * i10);
        for (int i12 = 0; i12 <= i10; i12++) {
            float f10 = i12 / i10;
            this.f94641e.b(aVar).a(aVar2, f10);
            this.f94642f.b(aVar4).a(aVar3, f10);
            for (int i13 = 0; i13 <= i11; i13++) {
                short sT = T(this.f94643g.b(this.f94641e).a(this.f94642f, i13 / i11));
                if (i12 > 0 && i13 > 0) {
                    int i14 = sT - i11;
                    m((short) (i14 - 2), (short) (sT - 1), sT, (short) (i14 - 1));
                }
            }
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void E(float f10, float f11, float f12, float f13, int i10, d0 d0Var, d0 d0Var2) {
        p0(f10, f11, f12, f13, i10, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c, 0.0f, 360.0f);
    }

    public com.badlogic.gdx.graphics.f E0(com.badlogic.gdx.graphics.f fVar) {
        G0();
        com.badlogic.gdx.graphics.n nVar = this.f94655s;
        if (nVar == null) {
            throw new com.badlogic.gdx.utils.t("Call begin() first");
        }
        if (!nVar.equals(fVar.x())) {
            throw new com.badlogic.gdx.utils.t("Mesh attributes don't match");
        }
        if (fVar.q() * this.f94658v < this.f94656t.f95730b) {
            throw new com.badlogic.gdx.utils.t("Mesh can't hold enough vertices: " + fVar.q() + " * " + this.f94658v + " < " + this.f94656t.f95730b);
        }
        if (fVar.o() < this.f94657u.f95171b) {
            throw new com.badlogic.gdx.utils.t("Mesh can't hold enough indices: " + fVar.o() + " < " + this.f94657u.f95171b);
        }
        q qVar = this.f94656t;
        fVar.I(qVar.f95729a, 0, qVar.f95730b);
        a1 a1Var = this.f94657u;
        fVar.H(a1Var.f95170a, 0, a1Var.f95171b);
        Iterator<com.badlogic.gdx.graphics.g3d.model.b> it = this.G.iterator();
        while (it.hasNext()) {
            it.next().f94439e = fVar;
        }
        this.G.clear();
        this.f94655s = null;
        this.f94656t.f();
        this.f94657u.g();
        return fVar;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void F(float f10, float f11, float f12, int i10, int i11, float f13, float f14, float f15, float f16) {
        n(this.f94645i.t(), f10, f11, f12, i10, i11, f13, f14, f15, f16);
    }

    public com.badlogic.gdx.graphics.f F0(com.planner5d.library.engine.a aVar) {
        return E0(new com.badlogic.gdx.graphics.f(aVar, this.f94656t.f95730b / this.f94658v, this.f94657u.f95171b, this.f94655s));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void G(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, d0 d0Var6, d0 d0Var7, d0 d0Var8) {
        if (this.A < 0 && this.E < 0) {
            r0(this.f94637a.c(d0Var, null, null, null), this.f94638b.c(d0Var2, null, null, null), this.f94639c.c(d0Var3, null, null, null), this.f94640d.c(d0Var4, null, null, null), this.f94641e.c(d0Var5, null, null, null), this.f94642f.c(d0Var6, null, null, null), this.f94643g.c(d0Var7, null, null, null), this.f94644h.c(d0Var8, null, null, null));
            return;
        }
        K0(6);
        d0 d0VarF = this.f94646j.L(d0Var).E(d0Var4, 0.5f).K(this.f94647k.L(d0Var5).E(d0Var8, 0.5f)).f();
        M(d0Var, d0Var2, d0Var4, d0Var3, d0VarF);
        M(d0Var6, d0Var5, d0Var7, d0Var8, d0VarF.c(-1.0f));
        d0 d0VarF2 = this.f94646j.L(d0Var).E(d0Var7, 0.5f).K(this.f94647k.L(d0Var2).E(d0Var8, 0.5f)).f();
        M(d0Var5, d0Var, d0Var3, d0Var7, d0VarF2);
        M(d0Var2, d0Var6, d0Var8, d0Var4, d0VarF2.c(-1.0f));
        d0 d0VarF3 = this.f94646j.L(d0Var).E(d0Var6, 0.5f).K(this.f94647k.L(d0Var3).E(d0Var8, 0.5f)).f();
        M(d0Var5, d0Var6, d0Var2, d0Var, d0VarF3);
        M(d0Var3, d0Var4, d0Var8, d0Var7, d0VarF3.c(-1.0f));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void H(float f10, int i10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24) {
        float f25 = f10 * 2.0f;
        W(f25, f25, 0.0f, 0.0f, i10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24);
    }

    public void H0(int i10, int i11) {
        P0(i10);
        I0(i11);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void I(float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        p0(f10, f11, 0.0f, 0.0f, i10, f12, f13, f14, f15, f16, f17, f18, f19);
    }

    public void I0(int i10) {
        this.f94657u.i(i10);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void J(float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17) {
        I(f10, f11, i10, f12, f13, f14, f15, f16, f17, 0.0f, 360.0f);
    }

    public void J0(int i10) {
        int i11 = this.J;
        if (i11 == 0) {
            I0(i10 * 4);
        } else if (i11 == 1) {
            I0(i10 * 8);
        } else {
            I0(i10 * 6);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public boolean K() {
        return this.Q;
    }

    public void K0(int i10) {
        L0(i10 * 4, i10);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void L(float f10, float f11, float f12, int i10, float f13, float f14) {
        k0(f10, f11, f12, i10, f13, f14, true);
    }

    public void L0(int i10, int i11) {
        P0(i10);
        J0(i11);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void M(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5) {
        m0(this.f94637a.c(d0Var, d0Var5, null, null).j(0.0f, 1.0f), this.f94638b.c(d0Var2, d0Var5, null, null).j(1.0f, 1.0f), this.f94639c.c(d0Var3, d0Var5, null, null).j(1.0f, 0.0f), this.f94640d.c(d0Var4, d0Var5, null, null).j(0.0f, 0.0f));
    }

    public void M0(int i10) {
        int i11 = this.J;
        if (i11 == 1) {
            I0(i10 * 6);
            return;
        }
        if (i11 != 4 && i11 != 0) {
            throw new com.badlogic.gdx.utils.t("Incorrect primtive type");
        }
        I0(i10 * 3);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void N(com.badlogic.gdx.graphics.f fVar, int i10, int i11) {
        if (!this.f94655s.equals(fVar.x())) {
            throw new com.badlogic.gdx.utils.t("Vertex attributes do not match");
        }
        if (i11 <= 0) {
            return;
        }
        int iA0 = fVar.A0() * this.f94658v;
        q qVar = W;
        qVar.f();
        qVar.h(iA0);
        qVar.f95730b = iA0;
        fVar.B(qVar.f95729a);
        a1 a1Var = V;
        a1Var.g();
        a1Var.i(i11);
        a1Var.f95171b = i11;
        fVar.g(i10, i11, a1Var.f95170a, 0);
        w0(qVar.f95729a, a1Var.f95170a, 0, i11);
    }

    public void N0(int i10) {
        O0(i10 * 3, i10);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void O(float f10, float f11, int i10, d0 d0Var, d0 d0Var2) {
        J(f10, f11, i10, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c);
    }

    public void O0(int i10, int i11) {
        P0(i10);
        M0(i11);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void P(float f10, int i10, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, float f11, float f12) {
        H(f10, i10, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c, d0Var3.f180482a, d0Var3.f180483b, d0Var3.f180484c, d0Var4.f180482a, d0Var4.f180483b, d0Var4.f180484c, f11, f12);
    }

    public void P0(int i10) {
        this.f94656t.h(this.f94658v * i10);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void Q(short s10, short s11, short s12) {
        int i10 = this.J;
        if (i10 == 4 || i10 == 0) {
            b0(s10, s11, s12);
        } else {
            if (i10 != 1) {
                throw new com.badlogic.gdx.utils.t("Incorrect primitive type");
            }
            k(s10, s11, s11, s12, s12, s10);
        }
    }

    public int Q0() {
        return this.f94657u.f95171b;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void R(float f10, int i10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22) {
        H(f10, i10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, 0.0f, 360.0f);
    }

    public int R0() {
        return this.f94656t.f95730b / this.f94658v;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void S(Matrix4 matrix4) {
        G(W0(-0.5f, -0.5f, -0.5f).j1(matrix4), W0(-0.5f, 0.5f, -0.5f).j1(matrix4), W0(0.5f, -0.5f, -0.5f).j1(matrix4), W0(0.5f, 0.5f, -0.5f).j1(matrix4), W0(-0.5f, -0.5f, 0.5f).j1(matrix4), W0(-0.5f, 0.5f, 0.5f).j1(matrix4), W0(0.5f, -0.5f, 0.5f).j1(matrix4), W0(0.5f, 0.5f, 0.5f).j1(matrix4));
        C0();
    }

    public com.badlogic.gdx.graphics.g3d.model.b S0(String str, int i10) {
        return T0(str, i10, new com.badlogic.gdx.graphics.g3d.model.b());
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public short T(g.a aVar) {
        return e(aVar.f94664b ? aVar.f94663a : null, aVar.f94666d ? aVar.f94665c : null, aVar.f94668f ? aVar.f94667e : null, aVar.f94670h ? aVar.f94669g : null);
    }

    public com.badlogic.gdx.graphics.g3d.model.b T0(String str, int i10, com.badlogic.gdx.graphics.g3d.model.b bVar) {
        if (this.f94655s == null) {
            throw new RuntimeException("Call begin() first");
        }
        G0();
        this.F = bVar;
        bVar.f94435a = str;
        bVar.f94436b = i10;
        this.J = i10;
        this.G.c(bVar);
        t(null);
        u0(null);
        y(null);
        return this.F;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void U(d0 d0Var, com.badlogic.gdx.graphics.b bVar, d0 d0Var2, com.badlogic.gdx.graphics.b bVar2, d0 d0Var3, com.badlogic.gdx.graphics.b bVar3) {
        e0(this.f94637a.c(d0Var, null, bVar, null), this.f94638b.c(d0Var2, null, bVar2, null), this.f94639c.c(d0Var3, null, bVar3, null));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void V(float f10, float f11, int i10, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4) {
        p(f10, f11, i10, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c, d0Var3.f180482a, d0Var3.f180483b, d0Var3.f180484c, d0Var4.f180482a, d0Var4.f180483b, d0Var4.f180484c);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void W(float f10, float f11, float f12, float f13, int i10, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27) {
        short s10;
        short s11;
        int i11 = i10;
        float f28 = f14;
        if (f12 <= 0.0f || f13 <= 0.0f) {
            O0(i11 + 2, i11);
        } else if (f12 == f10 && f13 == f11) {
            int i12 = i11 + 1;
            P0(i12);
            I0(i12);
            if (this.J != 1) {
                throw new com.badlogic.gdx.utils.t("Incorrect primitive type : expect GL_LINES because innerWidth == width && innerHeight == height");
            }
        } else {
            int i13 = i11 + 1;
            L0(i13 * 2, i13);
        }
        float f29 = f26 * 0.017453292f;
        float f30 = ((f27 - f26) * 0.017453292f) / i11;
        d0 d0VarC = this.f94646j.y0(f20, f21, f22).c(f10 * 0.5f);
        d0 d0VarC2 = this.f94647k.y0(f23, f24, f25).c(f11 * 0.5f);
        d0 d0VarC3 = this.f94648l.y0(f20, f21, f22).c(f12 * 0.5f);
        d0 d0VarC4 = this.f94649m.y0(f23, f24, f25).c(f13 * 0.5f);
        g.a aVarC = this.f94639c.c(null, null, null, null);
        aVarC.f94666d = true;
        aVarC.f94664b = true;
        aVarC.f94670h = true;
        aVarC.f94669g.K0(0.5f, 0.5f);
        aVarC.f94663a.y0(f28, f15, f16);
        aVarC.f94665c.y0(f17, f18, f19);
        g.a aVarC2 = this.f94640d.c(null, null, null, null);
        aVarC2.f94666d = true;
        aVarC2.f94664b = true;
        aVarC2.f94670h = true;
        aVarC2.f94669g.K0(0.5f, 0.5f);
        aVarC2.f94663a.y0(f28, f15, f16);
        aVarC2.f94665c.y0(f17, f18, f19);
        short sT = T(aVarC2);
        float f31 = (f12 / f10) * 0.5f;
        float f32 = (f13 / f11) * 0.5f;
        int i14 = 0;
        short s12 = 0;
        short s13 = 0;
        short s14 = 0;
        while (i14 <= i11) {
            float f33 = f29 + (i14 * f30);
            float fI = s.i(f33);
            float fL = s.L(f33);
            float f34 = f32;
            int i15 = i14;
            d0 d0Var = d0VarC;
            short s15 = sT;
            short s16 = s12;
            aVarC2.f94663a.y0(f28, f15, f16).Q((d0Var.f180482a * fI) + (d0VarC2.f180482a * fL), (d0Var.f180483b * fI) + (d0VarC2.f180483b * fL), (d0Var.f180484c * fI) + (d0VarC2.f180484c * fL));
            aVarC2.f94669g.K0((fI * 0.5f) + 0.5f, (fL * 0.5f) + 0.5f);
            short sT2 = T(aVarC2);
            if (f12 <= 0.0f || f13 <= 0.0f) {
                s10 = s16;
                s11 = s15;
                if (i15 != 0) {
                    Q(sT2, s13, s11);
                }
            } else {
                if (f12 == f10 && f13 == f11) {
                    if (i15 != 0) {
                        h(sT2, s13);
                    }
                    s11 = s15;
                    s10 = s16;
                } else {
                    aVarC.f94663a.y0(f28, f15, f16).Q((d0VarC3.f180482a * fI) + (d0VarC4.f180482a * fL), (d0VarC3.f180483b * fI) + (d0VarC4.f180483b * fL), (d0VarC3.f180484c * fI) + (d0VarC4.f180484c * fL));
                    aVarC.f94669g.K0((f31 * fI) + 0.5f, (f34 * fL) + 0.5f);
                    short sT3 = T(aVarC);
                    if (i15 != 0) {
                        m(sT3, sT2, s16, s14);
                    }
                    s14 = sT3;
                    s12 = sT2;
                    s11 = s15;
                }
                sT = s11;
                d0VarC = d0Var;
                s13 = sT2;
                i11 = i10;
                f32 = f34;
                i14 = i15 + 1;
                f28 = f14;
            }
            s12 = s10;
            sT = s11;
            d0VarC = d0Var;
            s13 = sT2;
            i11 = i10;
            f32 = f34;
            i14 = i15 + 1;
            f28 = f14;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void X(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, int i10, int i11) {
        D(this.f94637a.c(d0Var, d0Var5, null, null).j(0.0f, 1.0f), this.f94638b.c(d0Var2, d0Var5, null, null).j(1.0f, 1.0f), this.f94639c.c(d0Var3, d0Var5, null, null).j(1.0f, 0.0f), this.f94640d.c(d0Var4, d0Var5, null, null).j(0.0f, 0.0f), i10, i11);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void Y(float f10, int i10, d0 d0Var, d0 d0Var2) {
        o(f10, i10, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void Z(float f10, float f11, float f12, int i10, int i11) {
        F(f10, f11, f12, i10, i11, 0.0f, 360.0f, 0.0f, 180.0f);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void a(float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        W(f10, f11, 0.0f, 0.0f, i10, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public com.badlogic.gdx.graphics.g3d.model.b a0() {
        return this.F;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public short b(float... fArr) {
        int length = fArr.length - this.f94658v;
        int i10 = 0;
        while (i10 <= length) {
            x0(fArr, i10);
            i10 += this.f94658v;
        }
        return this.T;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void b0(short s10, short s11, short s12) {
        I0(3);
        this.f94657u.b(s10);
        this.f94657u.b(s11);
        this.f94657u.b(s12);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void c(float f10, float f11, float f12, float f13, int i10, float f14, float f15, float f16, float f17, float f18, float f19) {
        p0(f10, f11, f12, f13, i10, f14, f15, f16, f17, f18, f19, 0.0f, 360.0f);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public Matrix4 c0(Matrix4 matrix4) {
        return matrix4.N(this.R);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void d(float f10, float f11, float f12, int i10, float f13, float f14) {
        O0(i10 + 2, i10);
        float f15 = f10 * 0.5f;
        float f16 = f11 * 0.5f;
        float f17 = f12 * 0.5f;
        float f18 = f13 * 0.017453292f;
        float f19 = i10;
        float f20 = ((f14 - f13) * 0.017453292f) / f19;
        float f21 = 1.0f;
        float f22 = 1.0f / f19;
        g.a aVarC = this.f94639c.c(null, null, null, null);
        aVarC.f94666d = true;
        aVarC.f94664b = true;
        aVarC.f94670h = true;
        short sT = T(this.f94640d.c(null, null, null, null).h(0.0f, f16, 0.0f).f(0.0f, 1.0f, 0.0f).j(0.5f, 0.0f));
        int i11 = 0;
        short s10 = 0;
        while (i11 <= i10) {
            float f23 = i11;
            float f24 = (f20 * f23) + f18;
            float f25 = f15;
            aVarC.f94663a.y0(s.i(f24) * f15, 0.0f, s.L(f24) * f17);
            aVarC.f94665c.L(aVarC.f94663a).f();
            aVarC.f94663a.f180483b = -f16;
            aVarC.f94669g.K0(f21 - (f23 * f22), 1.0f);
            short sT2 = T(aVarC);
            if (i11 != 0) {
                Q(sT, sT2, s10);
            }
            i11++;
            s10 = sT2;
            f21 = 1.0f;
            f15 = f25;
        }
        W(f10, f12, 0.0f, 0.0f, i10, 0.0f, -f16, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 180.0f - f14, 180.0f - f13);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void d0(d0 d0Var, d0 d0Var2) {
        i(this.f94637a.c(d0Var, null, null, null), this.f94638b.c(d0Var2, null, null, null));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public short e(d0 d0Var, d0 d0Var2, com.badlogic.gdx.graphics.b bVar, c0 c0Var) {
        int i10;
        if (this.f94659w >= Short.MAX_VALUE) {
            throw new com.badlogic.gdx.utils.t("Too many vertices used");
        }
        float[] fArr = this.P;
        int i11 = this.f94661y;
        fArr[i11] = d0Var.f180482a;
        int i12 = this.f94662z;
        if (i12 > 1) {
            fArr[i11 + 1] = d0Var.f180483b;
        }
        if (i12 > 2) {
            fArr[i11 + 2] = d0Var.f180484c;
        }
        if (this.A >= 0) {
            if (d0Var2 == null) {
                d0Var2 = this.U.L(d0Var).f();
            }
            float[] fArr2 = this.P;
            int i13 = this.A;
            fArr2[i13] = d0Var2.f180482a;
            fArr2[i13 + 1] = d0Var2.f180483b;
            fArr2[i13 + 2] = d0Var2.f180484c;
        }
        int i14 = this.B;
        if (i14 >= 0) {
            if (bVar == null) {
                bVar = com.badlogic.gdx.graphics.b.f94169f;
            }
            float[] fArr3 = this.P;
            fArr3[i14] = bVar.f94187a;
            fArr3[i14 + 1] = bVar.f94188b;
            fArr3[i14 + 2] = bVar.f94189c;
            if (this.C > 3) {
                fArr3[i14 + 3] = bVar.f94190d;
            }
        } else {
            int i15 = this.D;
            if (i15 > 0) {
                if (bVar == null) {
                    bVar = com.badlogic.gdx.graphics.b.f94169f;
                }
                this.P[i15] = bVar.G();
            }
        }
        if (c0Var != null && (i10 = this.E) >= 0) {
            float[] fArr4 = this.P;
            fArr4[i10] = c0Var.f94907a;
            fArr4[i10 + 1] = c0Var.f94908b;
        }
        x0(this.P, 0);
        return this.T;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void e0(g.a aVar, g.a aVar2, g.a aVar3) {
        P0(3);
        Q(T(aVar), T(aVar2), T(aVar3));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void f(float f10, float f11, float f12, float f13) {
        this.K = f10;
        this.M = f11;
        this.L = f12 - f10;
        this.N = f13 - f11;
        this.O = (s.p(f10) && s.p(f11) && s.m(f12, 1.0f) && s.m(f13, 1.0f)) ? false : true;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void f0(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24) {
        m0(this.f94637a.c(null, null, null, null).h(f10, f11, f12).f(f22, f23, f24).j(0.0f, 1.0f), this.f94638b.c(null, null, null, null).h(f13, f14, f15).f(f22, f23, f24).j(1.0f, 1.0f), this.f94639c.c(null, null, null, null).h(f16, f17, f18).f(f22, f23, f24).j(1.0f, 0.0f), this.f94640d.c(null, null, null, null).h(f19, f20, f21).f(f22, f23, f24).j(0.0f, 0.0f));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void g(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, int i10, int i11) {
        D(this.f94637a.b(null).h(f10, f11, f12).f(f22, f23, f24).j(0.0f, 1.0f), this.f94638b.b(null).h(f13, f14, f15).f(f22, f23, f24).j(1.0f, 1.0f), this.f94639c.b(null).h(f16, f17, f18).f(f22, f23, f24).j(1.0f, 0.0f), this.f94640d.b(null).h(f19, f20, f21).f(f22, f23, f24).j(0.0f, 0.0f), i10, i11);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void g0(float f10, int i10, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4) {
        R(f10, i10, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c, d0Var3.f180482a, d0Var3.f180483b, d0Var3.f180484c, d0Var4.f180482a, d0Var4.f180483b, d0Var4.f180484c);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public com.badlogic.gdx.graphics.n getAttributes() {
        return this.f94655s;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void h(short s10, short s11) {
        if (this.J != 1) {
            throw new com.badlogic.gdx.utils.t("Incorrect primitive type");
        }
        n0(s10, s11);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void h0(float f10, float f11, int i10) {
        float f12 = f10 * 2.0f;
        if (f11 < f12) {
            throw new com.badlogic.gdx.utils.t("Height must be at least twice the radius");
        }
        float f13 = f11 - f12;
        k0(f12, f13, f12, i10, 0.0f, 360.0f, false);
        n(this.f94645i.l0(0.0f, 0.5f * f13, 0.0f), f12, f12, f12, i10, i10, 0.0f, 360.0f, 0.0f, 90.0f);
        n(this.f94645i.l0(0.0f, f13 * (-0.5f), 0.0f), f12, f12, f12, i10, i10, 0.0f, 360.0f, 90.0f, 180.0f);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void i(g.a aVar, g.a aVar2) {
        P0(2);
        h(T(aVar), T(aVar2));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void i0(float f10, float f11, int i10, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, float f12, float f13) {
        W(f10, f11, 0.0f, 0.0f, i10, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c, d0Var3.f180482a, d0Var3.f180483b, d0Var3.f180484c, d0Var4.f180482a, d0Var4.f180483b, d0Var4.f180484c, f12, f13);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public short j() {
        return this.T;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void j0(com.badlogic.gdx.graphics.g3d.model.b bVar) {
        if (bVar.f94436b != this.J) {
            throw new com.badlogic.gdx.utils.t("Primitive type doesn't match");
        }
        N(bVar.f94439e, bVar.f94437c, bVar.f94438d);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void k(short s10, short s11, short s12, short s13, short s14, short s15) {
        I0(6);
        this.f94657u.b(s10);
        this.f94657u.b(s11);
        this.f94657u.b(s12);
        this.f94657u.b(s13);
        this.f94657u.b(s14);
        this.f94657u.b(s15);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void k0(float f10, float f11, float f12, int i10, float f13, float f14, boolean z10) {
        float f15 = f10 * 0.5f;
        float f16 = f11 * 0.5f;
        float f17 = 0.5f * f12;
        float f18 = f13 * 0.017453292f;
        float f19 = i10;
        float f20 = ((f14 - f13) * 0.017453292f) / f19;
        float f21 = 1.0f;
        float f22 = 1.0f / f19;
        g.a aVarC = this.f94639c.c(null, null, null, null);
        aVarC.f94666d = true;
        aVarC.f94664b = true;
        aVarC.f94670h = true;
        g.a aVarC2 = this.f94640d.c(null, null, null, null);
        aVarC2.f94666d = true;
        aVarC2.f94664b = true;
        aVarC2.f94670h = true;
        L0((i10 + 1) * 2, i10);
        int i11 = 0;
        short s10 = 0;
        short s11 = 0;
        while (i11 <= i10) {
            float f23 = i11;
            float f24 = (f20 * f23) + f18;
            float f25 = f21 - (f23 * f22);
            float f26 = f17;
            float f27 = f15;
            aVarC.f94663a.y0(s.i(f24) * f15, 0.0f, s.L(f24) * f26);
            aVarC.f94665c.L(aVarC.f94663a).f();
            aVarC.f94663a.f180483b = -f16;
            f21 = 1.0f;
            aVarC.f94669g.K0(f25, 1.0f);
            aVarC2.f94663a.L(aVarC.f94663a);
            aVarC2.f94665c.L(aVarC.f94665c);
            aVarC2.f94663a.f180483b = f16;
            aVarC2.f94669g.K0(f25, 0.0f);
            short sT = T(aVarC);
            short sT2 = T(aVarC2);
            if (i11 != 0) {
                m(s10, sT2, sT, s11);
            }
            i11++;
            s11 = sT;
            s10 = sT2;
            f15 = f27;
            f17 = f26;
        }
        if (z10) {
            W(f10, f12, 0.0f, 0.0f, i10, 0.0f, f16, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, f13, f14);
            W(f10, f12, 0.0f, 0.0f, i10, 0.0f, -f16, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 180.0f - f14, 180.0f - f13);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void l(float f10, float f11, float f12) {
        S(this.f94645i.j0(f10, f11, f12));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void l0(float f10, float f11, float f12, float f13, float f14, float f15) {
        S(this.f94645i.j0(f13, f14, f15).w0(f10, f11, f12));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void m(short s10, short s11, short s12, short s13) {
        int i10 = this.J;
        if (i10 == 4) {
            k(s10, s11, s12, s12, s13, s10);
        } else if (i10 == 1) {
            C(s10, s11, s11, s12, s12, s13, s13, s10);
        } else {
            if (i10 != 0) {
                throw new com.badlogic.gdx.utils.t("Incorrect primitive type");
            }
            B(s10, s11, s12, s13);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void m0(g.a aVar, g.a aVar2, g.a aVar3, g.a aVar4) {
        P0(4);
        m(T(aVar), T(aVar2), T(aVar3), T(aVar4));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void n(Matrix4 matrix4, float f10, float f11, float f12, int i10, int i11, float f13, float f14, float f15, float f16) {
        int i12 = i10;
        int i13 = i11;
        float f17 = f10 * 0.5f;
        float f18 = f11 * 0.5f;
        float f19 = 0.5f * f12;
        float f20 = f13 * 0.017453292f;
        float f21 = i12;
        float f22 = ((f14 - f13) * 0.017453292f) / f21;
        float f23 = f15 * 0.017453292f;
        float f24 = i13;
        float f25 = ((f16 - f15) * 0.017453292f) / f24;
        float f26 = 1.0f / f21;
        float f27 = 1.0f / f24;
        g.a aVarC = this.f94639c.c(null, null, null, null);
        aVarC.f94666d = true;
        aVarC.f94664b = true;
        aVarC.f94670h = true;
        int i14 = i12 + 3;
        a1 a1Var = V;
        a1Var.g();
        a1Var.i(i12 * 2);
        a1Var.f95171b = i14;
        int i15 = i12 + 1;
        L0((i13 + 1) * i15, i13 * i12);
        int i16 = 0;
        int i17 = 0;
        while (i16 <= i13) {
            float f28 = i16;
            float f29 = f23 + (f25 * f28);
            float f30 = f28 * f27;
            float fL = s.L(f29);
            float fI = s.i(f29) * f18;
            float f31 = f17;
            int i18 = i17;
            float f32 = f18;
            int i19 = 0;
            while (i19 <= i12) {
                float f33 = i19;
                float f34 = f20 + (f22 * f33);
                int i20 = i19;
                float f35 = f27;
                float f36 = f20;
                aVarC.f94663a.y0(s.i(f34) * f31 * fL, fI, s.L(f34) * f19 * fL).j1(matrix4);
                aVarC.f94665c.L(aVarC.f94663a).f();
                aVarC.f94669g.K0(1.0f - (f33 * f26), f30);
                a1 a1Var2 = V;
                a1Var2.z(i18, T(aVarC));
                int i21 = i18 + i14;
                if (i16 > 0 && i20 > 0) {
                    m(a1Var2.k(i18), a1Var2.k((i21 - 1) % i14), a1Var2.k((i21 - (i10 + 2)) % i14), a1Var2.k((i21 - i15) % i14));
                }
                i18 = (i18 + 1) % a1Var2.f95171b;
                i19 = i20 + 1;
                i12 = i10;
                f27 = f35;
                fI = fI;
                f30 = f30;
                f20 = f36;
            }
            i16++;
            i12 = i10;
            i13 = i11;
            f27 = f27;
            f18 = f32;
            i17 = i18;
            f17 = f31;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void n0(short s10, short s11) {
        I0(2);
        this.f94657u.b(s10);
        this.f94657u.b(s11);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void o(float f10, int i10, float f11, float f12, float f13, float f14, float f15, float f16) {
        x(f10, i10, f11, f12, f13, f14, f15, f16, 0.0f, 360.0f);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void o0(com.badlogic.gdx.graphics.f fVar) {
        N(fVar, 0, fVar.v1());
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void p(float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23) {
        a(f10, f11, i10, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, 0.0f, 360.0f);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void p0(float f10, float f11, float f12, float f13, int i10, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21) {
        this.f94646j.y0(f17, f18, f19).U(0.0f, 0.0f, 1.0f);
        this.f94647k.y0(f17, f18, f19).U(0.0f, 1.0f, 0.0f);
        if (this.f94647k.w() > this.f94646j.w()) {
            this.f94646j.L(this.f94647k);
        }
        this.f94647k.L(this.f94646j.f()).U(f17, f18, f19).f();
        d0 d0Var = this.f94646j;
        float f22 = d0Var.f180482a;
        float f23 = d0Var.f180483b;
        float f24 = d0Var.f180484c;
        d0 d0Var2 = this.f94647k;
        W(f10, f11, f12, f13, i10, f14, f15, f16, f17, f18, f19, f22, f23, f24, d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c, f20, f21);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void q(float f10, float f11, float f12, int i10) {
        d(f10, f11, f12, i10, 0.0f, 360.0f);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void q0(float f10, float f11, float f12, int i10) {
        L(f10, f11, f12, i10, 0.0f, 360.0f);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void r(float f10, float f11, float f12, float f13, float f14, float f15) {
        i(this.f94637a.c(null, null, null, null).h(f10, f11, f12), this.f94638b.c(null, null, null, null).h(f13, f14, f15));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void r0(g.a aVar, g.a aVar2, g.a aVar3, g.a aVar4, g.a aVar5, g.a aVar6, g.a aVar7, g.a aVar8) {
        P0(8);
        short sT = T(aVar);
        short sT2 = T(aVar3);
        short sT3 = T(aVar4);
        short sT4 = T(aVar2);
        short sT5 = T(aVar5);
        short sT6 = T(aVar7);
        short sT7 = T(aVar8);
        short sT8 = T(aVar6);
        int i10 = this.J;
        if (i10 == 1) {
            I0(24);
            m(sT, sT2, sT3, sT4);
            m(sT6, sT5, sT8, sT7);
            C(sT, sT5, sT4, sT8, sT3, sT7, sT2, sT6);
            return;
        }
        if (i10 == 0) {
            J0(2);
            m(sT, sT2, sT3, sT4);
            m(sT6, sT5, sT8, sT7);
            return;
        }
        J0(6);
        m(sT, sT2, sT3, sT4);
        m(sT6, sT5, sT8, sT7);
        m(sT, sT4, sT8, sT5);
        m(sT6, sT7, sT3, sT2);
        m(sT6, sT2, sT, sT5);
        m(sT3, sT7, sT8, sT4);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void s(short s10) {
        this.f94657u.b(s10);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void s0(Matrix4 matrix4, float f10, float f11, float f12, int i10, int i11) {
        n(matrix4, f10, f11, f12, i10, i11, 0.0f, 360.0f, 0.0f, 180.0f);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void t(com.badlogic.gdx.graphics.b bVar) {
        com.badlogic.gdx.graphics.b bVar2 = this.H;
        boolean z10 = bVar != null;
        this.I = z10;
        if (!z10) {
            bVar = com.badlogic.gdx.graphics.b.f94169f;
        }
        bVar2.D(bVar);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void t0(float f10, int i10, d0 d0Var, d0 d0Var2, float f11, float f12) {
        x(f10, i10, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c, f11, f12);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void u(boolean z10) {
        this.Q = z10;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void u0(Matrix4 matrix4) {
        boolean z10 = matrix4 != null;
        this.Q = z10;
        if (z10) {
            this.R.N(matrix4);
            this.S.u(matrix4).h().G();
        } else {
            this.R.t();
            this.S.g();
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void v(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10) {
        d0 d0VarW0 = W0(f10, f11, f12);
        d0 d0VarW1 = W0(f13, f14, f15);
        float fH = d0VarW0.H(d0VarW1);
        float f18 = fH * f16;
        float fSqrt = ((float) (((double) f18) * Math.sqrt(0.3333333432674408d))) * 2.0f;
        float f19 = fH - f18;
        float f20 = fSqrt * f17;
        d0 d0VarF = X0(d0VarW1).K(d0VarW0).f();
        d0 d0VarO0 = X0(d0VarF).O0(d0.f94932g);
        if (d0VarO0.isZero()) {
            d0VarO0.L(d0.f94930e);
        }
        d0VarO0.O0(d0VarF).f();
        d0 d0VarF2 = X0(d0VarF).O0(d0VarO0).f();
        d0 d0VarF3 = X0(d0VarW1).K(d0VarW0).f();
        Matrix4 matrix4C0 = c0(U0());
        Matrix4 matrix4U0 = U0();
        float[] fArr = matrix4U0.f94875a;
        fArr[0] = d0VarF2.f180482a;
        fArr[4] = d0VarF.f180482a;
        fArr[8] = d0VarO0.f180482a;
        fArr[1] = d0VarF2.f180483b;
        fArr[5] = d0VarF.f180483b;
        fArr[9] = d0VarO0.f180483b;
        fArr[2] = d0VarF2.f180484c;
        fArr[6] = d0VarF.f180484c;
        fArr[10] = d0VarO0.f180484c;
        Matrix4 matrix4U1 = U0();
        matrix4U0.r0(X0(d0VarF3).c(f19 / 2.0f).Q(f10, f11, f12));
        u0(matrix4U1.N(matrix4U0).w(matrix4C0));
        q0(f20, f19, f20, i10);
        matrix4U0.r0(X0(d0VarF3).c(f19).Q(f10, f11, f12));
        u0(matrix4U1.N(matrix4U0).w(matrix4C0));
        q(fSqrt, f18, fSqrt, i10);
        u0(matrix4C0);
        C0();
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void v0(d0 d0Var, d0 d0Var2, d0 d0Var3) {
        e0(this.f94637a.c(d0Var, null, null, null), this.f94638b.c(d0Var2, null, null, null), this.f94639c.c(d0Var3, null, null, null));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void w(float f10, float f11, float f12, float f13) {
        this.H.B(f10, f11, f12, f13);
        this.I = !this.H.equals(com.badlogic.gdx.graphics.b.f94169f);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void x(float f10, int i10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        float f19 = f10 * 2.0f;
        I(f19, f19, i10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void y(com.badlogic.gdx.graphics.g2d.e eVar) {
        boolean z10 = eVar != null;
        this.O = z10;
        if (z10) {
            f(eVar.g(), eVar.i(), eVar.h(), eVar.j());
            return;
        }
        this.M = 0.0f;
        this.K = 0.0f;
        this.N = 1.0f;
        this.L = 1.0f;
    }

    public void y0(long j10) {
        B0(D0(j10), -1);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.g
    public void z(d0 d0Var, com.badlogic.gdx.graphics.b bVar, d0 d0Var2, com.badlogic.gdx.graphics.b bVar2) {
        i(this.f94637a.c(d0Var, null, bVar, null), this.f94638b.c(d0Var2, null, bVar2, null));
    }

    public void z0(long j10, int i10) {
        B0(D0(j10), i10);
    }
}
