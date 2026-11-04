package com.badlogic.gdx.graphics.g3d.environment;

import com.badlogic.gdx.math.d0;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f94392b = new d0();

    public boolean e(c cVar) {
        return cVar != null && (cVar == this || (this.f94391a.equals(cVar.f94391a) && this.f94392b.equals(cVar.f94392b)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return e((c) obj);
        }
        return false;
    }

    public c f(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f94391a.B(f10, f11, f12, 1.0f);
        this.f94392b.y0(f13, f14, f15).f();
        return this;
    }

    public c g(float f10, float f11, float f12, d0 d0Var) {
        this.f94391a.B(f10, f11, f12, 1.0f);
        if (d0Var != null) {
            this.f94392b.L(d0Var).f();
        }
        return this;
    }

    public c h(com.badlogic.gdx.graphics.b bVar, float f10, float f11, float f12) {
        if (bVar != null) {
            this.f94391a.D(bVar);
        }
        this.f94392b.y0(f10, f11, f12).f();
        return this;
    }

    public c i(com.badlogic.gdx.graphics.b bVar, d0 d0Var) {
        if (bVar != null) {
            this.f94391a.D(bVar);
        }
        if (d0Var != null) {
            this.f94392b.L(d0Var).f();
        }
        return this;
    }

    public c j(c cVar) {
        return i(cVar.f94391a, cVar.f94392b);
    }
}
