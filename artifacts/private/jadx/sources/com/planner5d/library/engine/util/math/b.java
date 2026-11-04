package com.planner5d.library.engine.util.math;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f165420e = -1286036817192127343L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.planner5d.library.math.m f165421f = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.planner5d.library.math.m f165422a = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.planner5d.library.math.m f165423b = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.math.m f165424c = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.math.m f165425d = new com.planner5d.library.math.m();

    public b() {
        a();
    }

    static final float D(float f10, float f11) {
        return f10 > f11 ? f10 : f11;
    }

    static final float E(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public b A() {
        this.f165422a.y0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        this.f165423b.y0(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        this.f165424c.y0(0.0f, 0.0f, 0.0f);
        this.f165425d.y0(0.0f, 0.0f, 0.0f);
        return this;
    }

    public boolean B(b bVar) {
        if (C()) {
            return Math.abs(this.f165424c.f180482a - bVar.f165424c.f180482a) <= (this.f165425d.f180482a / 2.0f) + (bVar.f165425d.f180482a / 2.0f) && Math.abs(this.f165424c.f180483b - bVar.f165424c.f180483b) <= (this.f165425d.f180483b / 2.0f) + (bVar.f165425d.f180483b / 2.0f) && Math.abs(this.f165424c.f180484c - bVar.f165424c.f180484c) <= (this.f165425d.f180484c / 2.0f) + (bVar.f165425d.f180484c / 2.0f);
        }
        return false;
    }

    public boolean C() {
        com.planner5d.library.math.m mVar = this.f165422a;
        float f10 = mVar.f180482a;
        com.planner5d.library.math.m mVar2 = this.f165423b;
        return f10 < mVar2.f180482a && mVar.f180483b < mVar2.f180483b && mVar.f180484c < mVar2.f180484c;
    }

    public b F(Matrix4 matrix4) {
        com.planner5d.library.math.m mVar = this.f165422a;
        float f10 = mVar.f180482a;
        float f11 = mVar.f180483b;
        float f12 = mVar.f180484c;
        com.planner5d.library.math.m mVar2 = this.f165423b;
        float f13 = mVar2.f180482a;
        float f14 = mVar2.f180483b;
        float f15 = mVar2.f180484c;
        A();
        com.planner5d.library.math.m mVar3 = f165421f;
        g(n.a(mVar3.y0(f10, f11, f12), matrix4));
        g(n.a(mVar3.y0(f10, f11, f15), matrix4));
        g(n.a(mVar3.y0(f10, f14, f12), matrix4));
        g(n.a(mVar3.y0(f10, f14, f15), matrix4));
        g(n.a(mVar3.y0(f13, f11, f12), matrix4));
        g(n.a(mVar3.y0(f13, f11, f15), matrix4));
        g(n.a(mVar3.y0(f13, f14, f12), matrix4));
        g(n.a(mVar3.y0(f13, f14, f15), matrix4));
        return this;
    }

    public b G(b bVar) {
        return H(bVar.f165422a, bVar.f165423b);
    }

    public b H(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        com.planner5d.library.math.m mVar3 = this.f165422a;
        float f10 = mVar.f180482a;
        float f11 = mVar2.f180482a;
        if (f10 >= f11) {
            f10 = f11;
        }
        float f12 = mVar.f180483b;
        float f13 = mVar2.f180483b;
        if (f12 >= f13) {
            f12 = f13;
        }
        float f14 = mVar.f180484c;
        float f15 = mVar2.f180484c;
        if (f14 >= f15) {
            f14 = f15;
        }
        mVar3.y0(f10, f12, f14);
        com.planner5d.library.math.m mVar4 = this.f165423b;
        float f16 = mVar.f180482a;
        float f17 = mVar2.f180482a;
        if (f16 <= f17) {
            f16 = f17;
        }
        float f18 = mVar.f180483b;
        float f19 = mVar2.f180483b;
        if (f18 <= f19) {
            f18 = f19;
        }
        float f20 = mVar.f180484c;
        float f21 = mVar2.f180484c;
        if (f20 <= f21) {
            f20 = f21;
        }
        mVar4.y0(f16, f18, f20);
        this.f165424c.A0(this.f165422a).R(this.f165423b).v0(0.5f);
        this.f165425d.A0(this.f165423b).H0(this.f165422a);
        return this;
    }

    public b I(List<com.planner5d.library.math.m> list) {
        A();
        Iterator<com.planner5d.library.math.m> it = list.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
        return this;
    }

    public b J(com.planner5d.library.math.m[] mVarArr) {
        A();
        for (com.planner5d.library.math.m mVar : mVarArr) {
            g(mVar);
        }
        return this;
    }

    public b a() {
        return H(this.f165422a.y0(0.0f, 0.0f, 0.0f), this.f165423b.y0(0.0f, 0.0f, 0.0f));
    }

    public boolean b(b bVar) {
        if (!C()) {
            return true;
        }
        com.planner5d.library.math.m mVar = this.f165422a;
        float f10 = mVar.f180482a;
        com.planner5d.library.math.m mVar2 = bVar.f165422a;
        if (f10 <= mVar2.f180482a && mVar.f180483b <= mVar2.f180483b && mVar.f180484c <= mVar2.f180484c) {
            com.planner5d.library.math.m mVar3 = this.f165423b;
            float f11 = mVar3.f180482a;
            com.planner5d.library.math.m mVar4 = bVar.f165423b;
            if (f11 >= mVar4.f180482a && mVar3.f180483b >= mVar4.f180483b && mVar3.f180484c >= mVar4.f180484c) {
                return true;
            }
        }
        return false;
    }

    public boolean c(com.planner5d.library.math.m mVar) {
        com.planner5d.library.math.m mVar2 = this.f165422a;
        float f10 = mVar2.f180482a;
        float f11 = mVar.f180482a;
        if (f10 <= f11) {
            com.planner5d.library.math.m mVar3 = this.f165423b;
            if (mVar3.f180482a >= f11) {
                float f12 = mVar2.f180483b;
                float f13 = mVar.f180483b;
                if (f12 <= f13 && mVar3.f180483b >= f13) {
                    float f14 = mVar2.f180484c;
                    float f15 = mVar.f180484c;
                    if (f14 <= f15 && mVar3.f180484c >= f15) {
                        int i10 = 5 ^ 1;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public b d(float f10, float f11, float f12) {
        com.planner5d.library.math.m mVar = this.f165422a;
        com.planner5d.library.math.m mVarY0 = mVar.y0(E(mVar.f180482a, f10), E(this.f165422a.f180483b, f11), E(this.f165422a.f180484c, f12));
        com.planner5d.library.math.m mVar2 = this.f165423b;
        return H(mVarY0, mVar2.y0(D(mVar2.f180482a, f10), D(this.f165423b.f180483b, f11), D(this.f165423b.f180484c, f12)));
    }

    public b e(b bVar) {
        com.planner5d.library.math.m mVar = this.f165422a;
        com.planner5d.library.math.m mVarY0 = mVar.y0(E(mVar.f180482a, bVar.f165422a.f180482a), E(this.f165422a.f180483b, bVar.f165422a.f180483b), E(this.f165422a.f180484c, bVar.f165422a.f180484c));
        com.planner5d.library.math.m mVar2 = this.f165423b;
        return H(mVarY0, mVar2.y0(D(mVar2.f180482a, bVar.f165423b.f180482a), D(this.f165423b.f180483b, bVar.f165423b.f180483b), D(this.f165423b.f180484c, bVar.f165423b.f180484c)));
    }

    public b f(b bVar, Matrix4 matrix4) {
        com.planner5d.library.math.m mVar = f165421f;
        com.planner5d.library.math.m mVar2 = bVar.f165422a;
        g(n.a(mVar.y0(mVar2.f180482a, mVar2.f180483b, mVar2.f180484c), matrix4));
        com.planner5d.library.math.m mVar3 = bVar.f165422a;
        g(n.a(mVar.y0(mVar3.f180482a, mVar3.f180483b, bVar.f165423b.f180484c), matrix4));
        com.planner5d.library.math.m mVar4 = bVar.f165422a;
        g(n.a(mVar.y0(mVar4.f180482a, bVar.f165423b.f180483b, mVar4.f180484c), matrix4));
        float f10 = bVar.f165422a.f180482a;
        com.planner5d.library.math.m mVar5 = bVar.f165423b;
        g(n.a(mVar.y0(f10, mVar5.f180483b, mVar5.f180484c), matrix4));
        float f11 = bVar.f165423b.f180482a;
        com.planner5d.library.math.m mVar6 = bVar.f165422a;
        g(n.a(mVar.y0(f11, mVar6.f180483b, mVar6.f180484c), matrix4));
        com.planner5d.library.math.m mVar7 = bVar.f165423b;
        g(n.a(mVar.y0(mVar7.f180482a, bVar.f165422a.f180483b, mVar7.f180484c), matrix4));
        com.planner5d.library.math.m mVar8 = bVar.f165423b;
        g(n.a(mVar.y0(mVar8.f180482a, mVar8.f180483b, bVar.f165422a.f180484c), matrix4));
        com.planner5d.library.math.m mVar9 = bVar.f165423b;
        g(n.a(mVar.y0(mVar9.f180482a, mVar9.f180483b, mVar9.f180484c), matrix4));
        return this;
    }

    public b g(com.planner5d.library.math.m mVar) {
        com.planner5d.library.math.m mVar2 = this.f165422a;
        com.planner5d.library.math.m mVarY0 = mVar2.y0(E(mVar2.f180482a, mVar.f180482a), E(this.f165422a.f180483b, mVar.f180483b), E(this.f165422a.f180484c, mVar.f180484c));
        com.planner5d.library.math.m mVar3 = this.f165423b;
        return H(mVarY0, mVar3.y0(Math.max(mVar3.f180482a, mVar.f180482a), Math.max(this.f165423b.f180483b, mVar.f180483b), Math.max(this.f165423b.f180484c, mVar.f180484c)));
    }

    public com.planner5d.library.math.m h() {
        return new com.planner5d.library.math.m(this.f165424c);
    }

    public com.planner5d.library.math.m i(com.planner5d.library.math.m mVar) {
        return mVar.A0(this.f165424c);
    }

    public float j() {
        return this.f165424c.f180482a;
    }

    public float k() {
        return this.f165424c.f180483b;
    }

    public float l() {
        return this.f165424c.f180484c;
    }

    public com.planner5d.library.math.m m(com.planner5d.library.math.m mVar) {
        com.planner5d.library.math.m mVar2 = this.f165422a;
        return mVar.y0(mVar2.f180482a, mVar2.f180483b, mVar2.f180484c);
    }

    public com.planner5d.library.math.m n(com.planner5d.library.math.m mVar) {
        com.planner5d.library.math.m mVar2 = this.f165422a;
        return mVar.y0(mVar2.f180482a, mVar2.f180483b, this.f165423b.f180484c);
    }

    public com.planner5d.library.math.m o(com.planner5d.library.math.m mVar) {
        com.planner5d.library.math.m mVar2 = this.f165422a;
        return mVar.y0(mVar2.f180482a, this.f165423b.f180483b, mVar2.f180484c);
    }

    public com.planner5d.library.math.m p(com.planner5d.library.math.m mVar) {
        float f10 = this.f165422a.f180482a;
        com.planner5d.library.math.m mVar2 = this.f165423b;
        return mVar.y0(f10, mVar2.f180483b, mVar2.f180484c);
    }

    public com.planner5d.library.math.m q(com.planner5d.library.math.m mVar) {
        float f10 = this.f165423b.f180482a;
        com.planner5d.library.math.m mVar2 = this.f165422a;
        return mVar.y0(f10, mVar2.f180483b, mVar2.f180484c);
    }

    public com.planner5d.library.math.m r(com.planner5d.library.math.m mVar) {
        com.planner5d.library.math.m mVar2 = this.f165423b;
        return mVar.y0(mVar2.f180482a, this.f165422a.f180483b, mVar2.f180484c);
    }

    public com.planner5d.library.math.m s(com.planner5d.library.math.m mVar) {
        com.planner5d.library.math.m mVar2 = this.f165423b;
        return mVar.y0(mVar2.f180482a, mVar2.f180483b, this.f165422a.f180484c);
    }

    public com.planner5d.library.math.m t(com.planner5d.library.math.m mVar) {
        com.planner5d.library.math.m mVar2 = this.f165423b;
        return mVar.y0(mVar2.f180482a, mVar2.f180483b, mVar2.f180484c);
    }

    public String toString() {
        return "[" + this.f165422a + "|" + this.f165423b + "]";
    }

    public float u() {
        return this.f165425d.f180484c;
    }

    public com.planner5d.library.math.m v(com.planner5d.library.math.m mVar) {
        return mVar.A0(this.f165425d);
    }

    public float w() {
        return this.f165425d.f180483b;
    }

    public com.planner5d.library.math.m x(com.planner5d.library.math.m mVar) {
        return mVar.A0(this.f165423b);
    }

    public com.planner5d.library.math.m y(com.planner5d.library.math.m mVar) {
        return mVar.A0(this.f165422a);
    }

    public float z() {
        return this.f165425d.f180482a;
    }

    public b(b bVar) {
        G(bVar);
    }

    public b(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        H(mVar, mVar2);
    }
}
