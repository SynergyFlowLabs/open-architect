package com.planner5d.library.engine.util.math;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final com.planner5d.library.math.m[] f165426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final float[] f165427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.planner5d.library.math.m f165428f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g[] f165429a = new g[6];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.planner5d.library.math.m[] f165430b = {new com.planner5d.library.math.m(), new com.planner5d.library.math.m(), new com.planner5d.library.math.m(), new com.planner5d.library.math.m(), new com.planner5d.library.math.m(), new com.planner5d.library.math.m(), new com.planner5d.library.math.m(), new com.planner5d.library.math.m()};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final float[] f165431c = new float[24];

    static {
        com.planner5d.library.math.m[] mVarArr = {new com.planner5d.library.math.m(-1.0f, -1.0f, -1.0f), new com.planner5d.library.math.m(1.0f, -1.0f, -1.0f), new com.planner5d.library.math.m(1.0f, 1.0f, -1.0f), new com.planner5d.library.math.m(-1.0f, 1.0f, -1.0f), new com.planner5d.library.math.m(-1.0f, -1.0f, 1.0f), new com.planner5d.library.math.m(1.0f, -1.0f, 1.0f), new com.planner5d.library.math.m(1.0f, 1.0f, 1.0f), new com.planner5d.library.math.m(-1.0f, 1.0f, 1.0f)};
        f165426d = mVarArr;
        f165427e = new float[24];
        int i10 = 0;
        for (com.planner5d.library.math.m mVar : mVarArr) {
            float[] fArr = f165427e;
            fArr[i10] = mVar.f180482a;
            int i11 = i10 + 2;
            fArr[i10 + 1] = mVar.f180483b;
            i10 += 3;
            fArr[i11] = mVar.f180484c;
        }
        f165428f = new com.planner5d.library.math.m();
    }

    public c() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.f165429a[i10] = new g(new com.planner5d.library.math.m(), 0.0f);
        }
    }

    public boolean a(float f10, float f11, float f12, float f13, float f14, float f15) {
        int length = this.f165429a.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f16 = f10 + f13;
            float f17 = f11 + f14;
            float f18 = f12 + f15;
            g.a aVarJ = this.f165429a[i10].j(f16, f17, f18);
            g.a aVar = g.a.Back;
            if (aVarJ == aVar) {
                float f19 = f12 - f15;
                if (this.f165429a[i10].j(f16, f17, f19) != aVar) {
                    continue;
                } else {
                    float f20 = f11 - f14;
                    if (this.f165429a[i10].j(f16, f20, f18) == aVar && this.f165429a[i10].j(f16, f20, f19) == aVar) {
                        float f21 = f10 - f13;
                        if (this.f165429a[i10].j(f21, f17, f18) == aVar && this.f165429a[i10].j(f21, f17, f19) == aVar && this.f165429a[i10].j(f21, f20, f18) == aVar && this.f165429a[i10].j(f21, f20, f19) == aVar) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean b(b bVar) {
        int length = this.f165429a.length;
        for (int i10 = 0; i10 < length; i10++) {
            g gVar = this.f165429a[i10];
            com.planner5d.library.math.m mVar = f165428f;
            g.a aVarK = gVar.k(bVar.m(mVar));
            g.a aVar = g.a.Back;
            if (aVarK == aVar && this.f165429a[i10].k(bVar.n(mVar)) == aVar && this.f165429a[i10].k(bVar.o(mVar)) == aVar && this.f165429a[i10].k(bVar.p(mVar)) == aVar && this.f165429a[i10].k(bVar.q(mVar)) == aVar && this.f165429a[i10].k(bVar.r(mVar)) == aVar && this.f165429a[i10].k(bVar.s(mVar)) == aVar && this.f165429a[i10].k(bVar.t(mVar)) == aVar) {
                return false;
            }
        }
        return true;
    }

    public boolean c(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        return a(mVar.f180482a, mVar.f180483b, mVar.f180484c, mVar2.f180482a / 2.0f, mVar2.f180483b / 2.0f, mVar2.f180484c / 2.0f);
    }

    public boolean d(float f10, float f11, float f12) {
        int i10 = 0;
        while (true) {
            g[] gVarArr = this.f165429a;
            if (i10 >= gVarArr.length) {
                return true;
            }
            if (gVarArr[i10].j(f10, f11, f12) == g.a.Back) {
                return false;
            }
            i10++;
        }
    }

    public boolean e(com.planner5d.library.math.m mVar) {
        int i10 = 0;
        while (true) {
            g[] gVarArr = this.f165429a;
            if (i10 >= gVarArr.length) {
                return true;
            }
            if (gVarArr[i10].k(mVar) == g.a.Back) {
                return false;
            }
            i10++;
        }
    }

    public boolean f(float f10, float f11, float f12, float f13) {
        for (int i10 = 0; i10 < 6; i10++) {
            g gVar = this.f165429a[i10];
            com.planner5d.library.math.m mVar = gVar.f165485a;
            if ((mVar.f180482a * f10) + (mVar.f180483b * f11) + (mVar.f180484c * f12) < (-f13) - gVar.f165486b) {
                return false;
            }
        }
        return true;
    }

    public boolean g(com.planner5d.library.math.m mVar, float f10) {
        for (int i10 = 0; i10 < 6; i10++) {
            g gVar = this.f165429a[i10];
            com.planner5d.library.math.m mVar2 = gVar.f165485a;
            if ((mVar2.f180482a * mVar.f180482a) + (mVar2.f180483b * mVar.f180483b) + (mVar2.f180484c * mVar.f180484c) < (-f10) - gVar.f165486b) {
                return false;
            }
        }
        return true;
    }

    public boolean h(float f10, float f11, float f12, float f13) {
        for (int i10 = 2; i10 < 6; i10++) {
            g gVar = this.f165429a[i10];
            com.planner5d.library.math.m mVar = gVar.f165485a;
            if ((mVar.f180482a * f10) + (mVar.f180483b * f11) + (mVar.f180484c * f12) < (-f13) - gVar.f165486b) {
                return false;
            }
        }
        return true;
    }

    public boolean i(com.planner5d.library.math.m mVar, float f10) {
        for (int i10 = 2; i10 < 6; i10++) {
            g gVar = this.f165429a[i10];
            com.planner5d.library.math.m mVar2 = gVar.f165485a;
            if ((mVar2.f180482a * mVar.f180482a) + (mVar2.f180483b * mVar.f180483b) + (mVar2.f180484c * mVar.f180484c) < (-f10) - gVar.f165486b) {
                int i11 = 4 << 0;
                return false;
            }
        }
        return true;
    }

    public void j(Matrix4 matrix4) {
        float[] fArr = f165427e;
        System.arraycopy(fArr, 0, this.f165431c, 0, fArr.length);
        Matrix4.prj(matrix4.f165412a, this.f165431c, 0, 8, 3);
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            com.planner5d.library.math.m mVar = this.f165430b[i11];
            float[] fArr2 = this.f165431c;
            mVar.f180482a = fArr2[i10];
            int i12 = i10 + 2;
            mVar.f180483b = fArr2[i10 + 1];
            i10 += 3;
            mVar.f180484c = fArr2[i12];
        }
        g gVar = this.f165429a[0];
        com.planner5d.library.math.m[] mVarArr = this.f165430b;
        gVar.i(mVarArr[1], mVarArr[0], mVarArr[2]);
        g gVar2 = this.f165429a[1];
        com.planner5d.library.math.m[] mVarArr2 = this.f165430b;
        int i13 = 0 << 7;
        gVar2.i(mVarArr2[4], mVarArr2[5], mVarArr2[7]);
        g gVar3 = this.f165429a[2];
        com.planner5d.library.math.m[] mVarArr3 = this.f165430b;
        gVar3.i(mVarArr3[0], mVarArr3[4], mVarArr3[3]);
        g gVar4 = this.f165429a[3];
        com.planner5d.library.math.m[] mVarArr4 = this.f165430b;
        gVar4.i(mVarArr4[5], mVarArr4[1], mVarArr4[6]);
        g gVar5 = this.f165429a[4];
        com.planner5d.library.math.m[] mVarArr5 = this.f165430b;
        gVar5.i(mVarArr5[2], mVarArr5[3], mVarArr5[6]);
        g gVar6 = this.f165429a[5];
        com.planner5d.library.math.m[] mVarArr6 = this.f165430b;
        gVar6.i(mVarArr6[4], mVarArr6[0], mVarArr6[1]);
    }
}
