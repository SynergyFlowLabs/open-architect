package com.badlogic.gdx.graphics.g3d.environment;

import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.math.s;

/* JADX INFO: loaded from: classes3.dex */
public class g extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f94401b = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f94402c = new d0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f94403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f94404e;

    public boolean e(g gVar) {
        if (gVar == null) {
            return false;
        }
        if (gVar != this) {
            return this.f94391a.equals(gVar.f94391a) && this.f94401b.equals(gVar.f94401b) && this.f94402c.equals(gVar.f94402c) && s.m(this.f94403d, gVar.f94403d) && s.m(this.f94404e, gVar.f94404e);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return e((g) obj);
        }
        return false;
    }

    public g f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20) {
        this.f94391a.B(f10, f11, f12, 1.0f);
        this.f94401b.y0(f13, f14, f15);
        this.f94402c.y0(f16, f17, f18).f();
        this.f94403d = f19;
        this.f94404e = f20;
        return this;
    }

    public g g(float f10, float f11, float f12, d0 d0Var, d0 d0Var2, float f13, float f14) {
        this.f94391a.B(f10, f11, f12, 1.0f);
        if (d0Var != null) {
            this.f94401b.L(d0Var);
        }
        if (d0Var2 != null) {
            this.f94402c.L(d0Var2).f();
        }
        this.f94403d = f13;
        this.f94404e = f14;
        return this;
    }

    public g h(com.badlogic.gdx.graphics.b bVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (bVar != null) {
            this.f94391a.D(bVar);
        }
        this.f94401b.y0(f10, f11, f12);
        this.f94402c.y0(f13, f14, f15).f();
        this.f94403d = f16;
        this.f94404e = f17;
        return this;
    }

    public g i(com.badlogic.gdx.graphics.b bVar, d0 d0Var, d0 d0Var2, float f10, float f11) {
        if (bVar != null) {
            this.f94391a.D(bVar);
        }
        if (d0Var != null) {
            this.f94401b.L(d0Var);
        }
        if (d0Var2 != null) {
            this.f94402c.L(d0Var2).f();
        }
        this.f94403d = f10;
        this.f94404e = f11;
        return this;
    }

    public g j(g gVar) {
        return i(gVar.f94391a, gVar.f94401b, gVar.f94402c, gVar.f94403d, gVar.f94404e);
    }

    public g m(d0 d0Var) {
        this.f94402c.L(d0Var).K(this.f94401b).f();
        return this;
    }
}
