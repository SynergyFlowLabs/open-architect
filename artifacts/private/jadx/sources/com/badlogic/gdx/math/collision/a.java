package com.badlogic.gdx.math.collision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.d0;
import com.planner5d.library.math.m;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f94909e = -1286036817192127343L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d0 f94910f = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f94911a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f94912b = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f94913c = new d0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f94914d = new d0();

    public a() {
        a();
    }

    static final float F(float f10, float f11) {
        return f10 > f11 ? f10 : f11;
    }

    static final float G(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public m A(m mVar) {
        return mVar.A0(this.f94911a);
    }

    public float B() {
        return this.f94914d.f180482a;
    }

    public a C() {
        this.f94911a.y0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        this.f94912b.y0(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        this.f94913c.y0(0.0f, 0.0f, 0.0f);
        this.f94914d.y0(0.0f, 0.0f, 0.0f);
        return this;
    }

    public boolean D(a aVar) {
        if (E()) {
            return Math.abs(this.f94913c.f180482a - aVar.f94913c.f180482a) <= (this.f94914d.f180482a / 2.0f) + (aVar.f94914d.f180482a / 2.0f) && Math.abs(this.f94913c.f180483b - aVar.f94913c.f180483b) <= (this.f94914d.f180483b / 2.0f) + (aVar.f94914d.f180483b / 2.0f) && Math.abs(this.f94913c.f180484c - aVar.f94913c.f180484c) <= (this.f94914d.f180484c / 2.0f) + (aVar.f94914d.f180484c / 2.0f);
        }
        return false;
    }

    public boolean E() {
        d0 d0Var = this.f94911a;
        float f10 = d0Var.f180482a;
        d0 d0Var2 = this.f94912b;
        return f10 < d0Var2.f180482a && d0Var.f180483b < d0Var2.f180483b && d0Var.f180484c < d0Var2.f180484c;
    }

    public a H(Matrix4 matrix4) {
        d0 d0Var = this.f94911a;
        float f10 = d0Var.f180482a;
        float f11 = d0Var.f180483b;
        float f12 = d0Var.f180484c;
        d0 d0Var2 = this.f94912b;
        float f13 = d0Var2.f180482a;
        float f14 = d0Var2.f180483b;
        float f15 = d0Var2.f180484c;
        C();
        d0 d0Var3 = f94910f;
        e(d0Var3.y0(f10, f11, f12).j1(matrix4));
        e(d0Var3.y0(f10, f11, f15).j1(matrix4));
        e(d0Var3.y0(f10, f14, f12).j1(matrix4));
        e(d0Var3.y0(f10, f14, f15).j1(matrix4));
        e(d0Var3.y0(f13, f11, f12).j1(matrix4));
        e(d0Var3.y0(f13, f11, f15).j1(matrix4));
        e(d0Var3.y0(f13, f14, f12).j1(matrix4));
        e(d0Var3.y0(f13, f14, f15).j1(matrix4));
        return this;
    }

    public a I(d0 d0Var, d0 d0Var2) {
        d0 d0Var3 = this.f94911a;
        float f10 = d0Var.f180482a;
        float f11 = d0Var2.f180482a;
        if (f10 >= f11) {
            f10 = f11;
        }
        float f12 = d0Var.f180483b;
        float f13 = d0Var2.f180483b;
        if (f12 >= f13) {
            f12 = f13;
        }
        float f14 = d0Var.f180484c;
        float f15 = d0Var2.f180484c;
        if (f14 >= f15) {
            f14 = f15;
        }
        d0Var3.y0(f10, f12, f14);
        d0 d0Var4 = this.f94912b;
        float f16 = d0Var.f180482a;
        float f17 = d0Var2.f180482a;
        if (f16 <= f17) {
            f16 = f17;
        }
        float f18 = d0Var.f180483b;
        float f19 = d0Var2.f180483b;
        if (f18 <= f19) {
            f18 = f19;
        }
        float f20 = d0Var.f180484c;
        float f21 = d0Var2.f180484c;
        if (f20 <= f21) {
            f20 = f21;
        }
        d0Var4.y0(f16, f18, f20);
        this.f94913c.L(this.f94911a).i(this.f94912b).c(0.5f);
        this.f94914d.L(this.f94912b).K(this.f94911a);
        return this;
    }

    public a J(a aVar) {
        return I(aVar.f94911a, aVar.f94912b);
    }

    public a K(List<d0> list) {
        C();
        Iterator<d0> it = list.iterator();
        while (it.hasNext()) {
            e(it.next());
        }
        return this;
    }

    public a L(d0[] d0VarArr) {
        C();
        for (d0 d0Var : d0VarArr) {
            e(d0Var);
        }
        return this;
    }

    public a a() {
        return I(this.f94911a.y0(0.0f, 0.0f, 0.0f), this.f94912b.y0(0.0f, 0.0f, 0.0f));
    }

    public boolean b(d0 d0Var) {
        d0 d0Var2 = this.f94911a;
        float f10 = d0Var2.f180482a;
        float f11 = d0Var.f180482a;
        if (f10 > f11) {
            return false;
        }
        d0 d0Var3 = this.f94912b;
        if (d0Var3.f180482a < f11) {
            return false;
        }
        float f12 = d0Var2.f180483b;
        float f13 = d0Var.f180483b;
        if (f12 > f13 || d0Var3.f180483b < f13) {
            return false;
        }
        float f14 = d0Var2.f180484c;
        float f15 = d0Var.f180484c;
        return f14 <= f15 && d0Var3.f180484c >= f15;
    }

    public boolean c(a aVar) {
        if (E()) {
            d0 d0Var = this.f94911a;
            float f10 = d0Var.f180482a;
            d0 d0Var2 = aVar.f94911a;
            if (f10 > d0Var2.f180482a || d0Var.f180483b > d0Var2.f180483b || d0Var.f180484c > d0Var2.f180484c) {
                return false;
            }
            d0 d0Var3 = this.f94912b;
            float f11 = d0Var3.f180482a;
            d0 d0Var4 = aVar.f94912b;
            if (f11 < d0Var4.f180482a || d0Var3.f180483b < d0Var4.f180483b || d0Var3.f180484c < d0Var4.f180484c) {
                return false;
            }
        }
        return true;
    }

    public a d(float f10, float f11, float f12) {
        d0 d0Var = this.f94911a;
        d0 d0VarY0 = d0Var.y0(G(d0Var.f180482a, f10), G(this.f94911a.f180483b, f11), G(this.f94911a.f180484c, f12));
        d0 d0Var2 = this.f94912b;
        return I(d0VarY0, d0Var2.y0(F(d0Var2.f180482a, f10), F(this.f94912b.f180483b, f11), F(this.f94912b.f180484c, f12)));
    }

    public a e(d0 d0Var) {
        d0 d0Var2 = this.f94911a;
        d0 d0VarY0 = d0Var2.y0(G(d0Var2.f180482a, d0Var.f180482a), G(this.f94911a.f180483b, d0Var.f180483b), G(this.f94911a.f180484c, d0Var.f180484c));
        d0 d0Var3 = this.f94912b;
        return I(d0VarY0, d0Var3.y0(Math.max(d0Var3.f180482a, d0Var.f180482a), Math.max(this.f94912b.f180483b, d0Var.f180483b), Math.max(this.f94912b.f180484c, d0Var.f180484c)));
    }

    public a f(a aVar) {
        d0 d0Var = this.f94911a;
        d0 d0VarY0 = d0Var.y0(G(d0Var.f180482a, aVar.f94911a.f180482a), G(this.f94911a.f180483b, aVar.f94911a.f180483b), G(this.f94911a.f180484c, aVar.f94911a.f180484c));
        d0 d0Var2 = this.f94912b;
        return I(d0VarY0, d0Var2.y0(F(d0Var2.f180482a, aVar.f94912b.f180482a), F(this.f94912b.f180483b, aVar.f94912b.f180483b), F(this.f94912b.f180484c, aVar.f94912b.f180484c)));
    }

    public a g(a aVar, Matrix4 matrix4) {
        d0 d0Var = f94910f;
        d0 d0Var2 = aVar.f94911a;
        e(d0Var.y0(d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c).j1(matrix4));
        d0 d0Var3 = aVar.f94911a;
        e(d0Var.y0(d0Var3.f180482a, d0Var3.f180483b, aVar.f94912b.f180484c).j1(matrix4));
        d0 d0Var4 = aVar.f94911a;
        e(d0Var.y0(d0Var4.f180482a, aVar.f94912b.f180483b, d0Var4.f180484c).j1(matrix4));
        float f10 = aVar.f94911a.f180482a;
        d0 d0Var5 = aVar.f94912b;
        e(d0Var.y0(f10, d0Var5.f180483b, d0Var5.f180484c).j1(matrix4));
        float f11 = aVar.f94912b.f180482a;
        d0 d0Var6 = aVar.f94911a;
        e(d0Var.y0(f11, d0Var6.f180483b, d0Var6.f180484c).j1(matrix4));
        d0 d0Var7 = aVar.f94912b;
        e(d0Var.y0(d0Var7.f180482a, aVar.f94911a.f180483b, d0Var7.f180484c).j1(matrix4));
        d0 d0Var8 = aVar.f94912b;
        e(d0Var.y0(d0Var8.f180482a, d0Var8.f180483b, aVar.f94911a.f180484c).j1(matrix4));
        d0 d0Var9 = aVar.f94912b;
        e(d0Var.y0(d0Var9.f180482a, d0Var9.f180483b, d0Var9.f180484c).j1(matrix4));
        return this;
    }

    public d0 h() {
        return new d0(this.f94913c);
    }

    public d0 i(d0 d0Var) {
        return d0Var.L(this.f94913c);
    }

    public float j() {
        return this.f94913c.f180482a;
    }

    public float k() {
        return this.f94913c.f180483b;
    }

    public float l() {
        return this.f94913c.f180484c;
    }

    public d0 m(d0 d0Var) {
        d0 d0Var2 = this.f94911a;
        return d0Var.y0(d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c);
    }

    public d0 n(d0 d0Var) {
        d0 d0Var2 = this.f94911a;
        return d0Var.y0(d0Var2.f180482a, d0Var2.f180483b, this.f94912b.f180484c);
    }

    public d0 o(d0 d0Var) {
        d0 d0Var2 = this.f94911a;
        return d0Var.y0(d0Var2.f180482a, this.f94912b.f180483b, d0Var2.f180484c);
    }

    public d0 p(d0 d0Var) {
        float f10 = this.f94911a.f180482a;
        d0 d0Var2 = this.f94912b;
        return d0Var.y0(f10, d0Var2.f180483b, d0Var2.f180484c);
    }

    public d0 q(d0 d0Var) {
        float f10 = this.f94912b.f180482a;
        d0 d0Var2 = this.f94911a;
        return d0Var.y0(f10, d0Var2.f180483b, d0Var2.f180484c);
    }

    public d0 r(d0 d0Var) {
        d0 d0Var2 = this.f94912b;
        return d0Var.y0(d0Var2.f180482a, this.f94911a.f180483b, d0Var2.f180484c);
    }

    public d0 s(d0 d0Var) {
        d0 d0Var2 = this.f94912b;
        return d0Var.y0(d0Var2.f180482a, d0Var2.f180483b, this.f94911a.f180484c);
    }

    public d0 t(d0 d0Var) {
        d0 d0Var2 = this.f94912b;
        return d0Var.y0(d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c);
    }

    public String toString() {
        return "[" + this.f94911a + "|" + this.f94912b + "]";
    }

    public float u() {
        return this.f94914d.f180484c;
    }

    public d0 v(d0 d0Var) {
        return d0Var.L(this.f94914d);
    }

    public float w() {
        return this.f94914d.f180483b;
    }

    public d0 x(d0 d0Var) {
        return d0Var.L(this.f94912b);
    }

    public m y(m mVar) {
        return mVar.A0(this.f94912b);
    }

    public d0 z(d0 d0Var) {
        return d0Var.L(this.f94911a);
    }

    public a(a aVar) {
        J(aVar);
    }

    public a(d0 d0Var, d0 d0Var2) {
        I(d0Var, d0Var2);
    }
}
