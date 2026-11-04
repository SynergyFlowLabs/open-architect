package com.badlogic.gdx.math.collision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.d0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f94915c = -620692054835390878L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static d0 f94916d = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f94917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f94918b;

    public b(d0 d0Var, d0 d0Var2) {
        d0 d0Var3 = new d0();
        this.f94917a = d0Var3;
        d0 d0Var4 = new d0();
        this.f94918b = d0Var4;
        d0Var3.L(d0Var);
        d0Var4.L(d0Var2).f();
    }

    public b a() {
        return new b(this.f94917a, this.f94918b);
    }

    public d0 b(d0 d0Var, float f10) {
        return d0Var.L(this.f94918b).c(f10).i(this.f94917a);
    }

    public b c(Matrix4 matrix4) {
        f94916d.L(this.f94917a).i(this.f94918b);
        f94916d.j1(matrix4);
        this.f94917a.j1(matrix4);
        this.f94918b.L(f94916d.K(this.f94917a));
        return this;
    }

    public b d(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f94917a.y0(f10, f11, f12);
        this.f94918b.y0(f13, f14, f15);
        return this;
    }

    public b e(d0 d0Var, d0 d0Var2) {
        this.f94917a.L(d0Var);
        this.f94918b.L(d0Var2);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            b bVar = (b) obj;
            if (this.f94918b.equals(bVar.f94918b) && this.f94917a.equals(bVar.f94917a)) {
                return true;
            }
        }
        return false;
    }

    public b f(b bVar) {
        this.f94917a.L(bVar.f94917a);
        this.f94918b.L(bVar.f94918b);
        return this;
    }

    public int hashCode() {
        return ((this.f94918b.hashCode() + 73) * 73) + this.f94917a.hashCode();
    }

    public String toString() {
        return "ray [" + this.f94917a + ":" + this.f94918b + "]";
    }
}
