package com.badlogic.gdx.math;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final d0[] f94993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final float[] f94994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d0 f94995f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v[] f94996a = new v[6];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0[] f94997b = {new d0(), new d0(), new d0(), new d0(), new d0(), new d0(), new d0(), new d0()};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final float[] f94998c = new float[24];

    static {
        d0[] d0VarArr = {new d0(-1.0f, -1.0f, -1.0f), new d0(1.0f, -1.0f, -1.0f), new d0(1.0f, 1.0f, -1.0f), new d0(-1.0f, 1.0f, -1.0f), new d0(-1.0f, -1.0f, 1.0f), new d0(1.0f, -1.0f, 1.0f), new d0(1.0f, 1.0f, 1.0f), new d0(-1.0f, 1.0f, 1.0f)};
        f94993d = d0VarArr;
        f94994e = new float[24];
        int i10 = 0;
        for (d0 d0Var : d0VarArr) {
            float[] fArr = f94994e;
            fArr[i10] = d0Var.f180482a;
            int i11 = i10 + 2;
            fArr[i10 + 1] = d0Var.f180483b;
            i10 += 3;
            fArr[i11] = d0Var.f180484c;
        }
        f94995f = new d0();
    }

    public m() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.f94996a[i10] = new v(new d0(), 0.0f);
        }
    }

    public boolean a(float f10, float f11, float f12, float f13, float f14, float f15) {
        int length = this.f94996a.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f16 = f10 + f13;
            float f17 = f11 + f14;
            float f18 = f12 + f15;
            v.a aVarJ = this.f94996a[i10].j(f16, f17, f18);
            v.a aVar = v.a.Back;
            if (aVarJ == aVar) {
                float f19 = f12 - f15;
                if (this.f94996a[i10].j(f16, f17, f19) != aVar) {
                    continue;
                } else {
                    float f20 = f11 - f14;
                    if (this.f94996a[i10].j(f16, f20, f18) == aVar && this.f94996a[i10].j(f16, f20, f19) == aVar) {
                        float f21 = f10 - f13;
                        if (this.f94996a[i10].j(f21, f17, f18) == aVar && this.f94996a[i10].j(f21, f17, f19) == aVar && this.f94996a[i10].j(f21, f20, f18) == aVar && this.f94996a[i10].j(f21, f20, f19) == aVar) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean b(d0 d0Var, d0 d0Var2) {
        return a(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, d0Var2.f180482a / 2.0f, d0Var2.f180483b / 2.0f, d0Var2.f180484c / 2.0f);
    }

    public boolean c(com.planner5d.library.engine.util.math.b bVar) {
        int length = this.f94996a.length;
        for (int i10 = 0; i10 < length; i10++) {
            v vVar = this.f94996a[i10];
            d0 d0Var = f94995f;
            v.a aVarJ = vVar.j(bVar.m(d0Var).f180482a, d0Var.f180483b, d0Var.f180484c);
            v.a aVar = v.a.Back;
            if (aVarJ == aVar && this.f94996a[i10].j(bVar.n(d0Var).f180482a, d0Var.f180483b, d0Var.f180484c) == aVar && this.f94996a[i10].j(bVar.o(d0Var).f180482a, d0Var.f180483b, d0Var.f180484c) == aVar && this.f94996a[i10].j(bVar.p(d0Var).f180482a, d0Var.f180483b, d0Var.f180484c) == aVar && this.f94996a[i10].j(bVar.q(d0Var).f180482a, d0Var.f180483b, d0Var.f180484c) == aVar && this.f94996a[i10].j(bVar.r(d0Var).f180482a, d0Var.f180483b, d0Var.f180484c) == aVar && this.f94996a[i10].j(bVar.s(d0Var).f180482a, d0Var.f180483b, d0Var.f180484c) == aVar && this.f94996a[i10].j(bVar.t(d0Var).f180482a, d0Var.f180483b, d0Var.f180484c) == aVar) {
                return false;
            }
        }
        return true;
    }

    public boolean d(float f10, float f11, float f12) {
        int i10 = 0;
        while (true) {
            v[] vVarArr = this.f94996a;
            if (i10 >= vVarArr.length) {
                return true;
            }
            if (vVarArr[i10].j(f10, f11, f12) == v.a.Back) {
                return false;
            }
            i10++;
        }
    }

    public boolean e(d0 d0Var) {
        int i10 = 0;
        while (true) {
            v[] vVarArr = this.f94996a;
            if (i10 >= vVarArr.length) {
                return true;
            }
            if (vVarArr[i10].k(d0Var) == v.a.Back) {
                return false;
            }
            i10++;
        }
    }

    public boolean f(float f10, float f11, float f12, float f13) {
        for (int i10 = 0; i10 < 6; i10++) {
            v vVar = this.f94996a[i10];
            d0 d0Var = vVar.f95099a;
            if ((d0Var.f180482a * f10) + (d0Var.f180483b * f11) + (d0Var.f180484c * f12) < (-f13) - vVar.f95100b) {
                return false;
            }
        }
        return true;
    }

    public boolean g(d0 d0Var, float f10) {
        for (int i10 = 0; i10 < 6; i10++) {
            v vVar = this.f94996a[i10];
            d0 d0Var2 = vVar.f95099a;
            if ((d0Var2.f180482a * d0Var.f180482a) + (d0Var2.f180483b * d0Var.f180483b) + (d0Var2.f180484c * d0Var.f180484c) < (-f10) - vVar.f95100b) {
                return false;
            }
        }
        return true;
    }

    public boolean h(float f10, float f11, float f12, float f13) {
        for (int i10 = 2; i10 < 6; i10++) {
            v vVar = this.f94996a[i10];
            d0 d0Var = vVar.f95099a;
            if ((d0Var.f180482a * f10) + (d0Var.f180483b * f11) + (d0Var.f180484c * f12) < (-f13) - vVar.f95100b) {
                return false;
            }
        }
        return true;
    }

    public boolean i(d0 d0Var, float f10) {
        for (int i10 = 2; i10 < 6; i10++) {
            v vVar = this.f94996a[i10];
            d0 d0Var2 = vVar.f95099a;
            if ((d0Var2.f180482a * d0Var.f180482a) + (d0Var2.f180483b * d0Var.f180483b) + (d0Var2.f180484c * d0Var.f180484c) < (-f10) - vVar.f95100b) {
                return false;
            }
        }
        return true;
    }

    public void j(Matrix4 matrix4) {
        float[] fArr = f94994e;
        System.arraycopy(fArr, 0, this.f94998c, 0, fArr.length);
        Matrix4.prj(matrix4.f94875a, this.f94998c, 0, 8, 3);
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            d0 d0Var = this.f94997b[i11];
            float[] fArr2 = this.f94998c;
            d0Var.f180482a = fArr2[i10];
            int i12 = i10 + 2;
            d0Var.f180483b = fArr2[i10 + 1];
            i10 += 3;
            d0Var.f180484c = fArr2[i12];
        }
        v vVar = this.f94996a[0];
        d0[] d0VarArr = this.f94997b;
        vVar.i(d0VarArr[1], d0VarArr[0], d0VarArr[2]);
        v vVar2 = this.f94996a[1];
        d0[] d0VarArr2 = this.f94997b;
        int i13 = 0 ^ 7;
        vVar2.i(d0VarArr2[4], d0VarArr2[5], d0VarArr2[7]);
        v vVar3 = this.f94996a[2];
        d0[] d0VarArr3 = this.f94997b;
        vVar3.i(d0VarArr3[0], d0VarArr3[4], d0VarArr3[3]);
        v vVar4 = this.f94996a[3];
        d0[] d0VarArr4 = this.f94997b;
        vVar4.i(d0VarArr4[5], d0VarArr4[1], d0VarArr4[6]);
        v vVar5 = this.f94996a[4];
        d0[] d0VarArr5 = this.f94997b;
        vVar5.i(d0VarArr5[2], d0VarArr5[3], d0VarArr5[6]);
        v vVar6 = this.f94996a[5];
        d0[] d0VarArr6 = this.f94997b;
        vVar6.i(d0VarArr6[4], d0VarArr6[0], d0VarArr6[1]);
    }
}
