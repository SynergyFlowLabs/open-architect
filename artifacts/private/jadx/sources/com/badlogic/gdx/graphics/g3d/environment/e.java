package com.badlogic.gdx.graphics.g3d.environment;

import com.badlogic.gdx.math.d0;

/* JADX INFO: loaded from: classes3.dex */
public class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f94399b = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f94400c;

    public boolean e(e eVar) {
        if (eVar != null) {
            return eVar == this || (this.f94391a.equals(eVar.f94391a) && this.f94399b.equals(eVar.f94399b) && this.f94400c == eVar.f94400c);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return e((e) obj);
        }
        return false;
    }

    public e f(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f94391a.B(f10, f11, f12, 1.0f);
        this.f94399b.y0(f13, f14, f15);
        this.f94400c = f16;
        return this;
    }

    public e g(float f10, float f11, float f12, d0 d0Var, float f13) {
        this.f94391a.B(f10, f11, f12, 1.0f);
        if (d0Var != null) {
            this.f94399b.L(d0Var);
        }
        this.f94400c = f13;
        return this;
    }

    public e h(com.badlogic.gdx.graphics.b bVar, float f10, float f11, float f12, float f13) {
        if (bVar != null) {
            this.f94391a.D(bVar);
        }
        this.f94399b.y0(f10, f11, f12);
        this.f94400c = f13;
        return this;
    }

    public e i(com.badlogic.gdx.graphics.b bVar, d0 d0Var, float f10) {
        if (bVar != null) {
            this.f94391a.D(bVar);
        }
        if (d0Var != null) {
            this.f94399b.L(d0Var);
        }
        this.f94400c = f10;
        return this;
    }

    public e j(e eVar) {
        return i(eVar.f94391a, eVar.f94399b, eVar.f94400c);
    }
}
