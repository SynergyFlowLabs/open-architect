package com.badlogic.gdx.math.collision;

import com.badlogic.gdx.math.d0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f94919c = 2739667069736519602L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f94920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f94921b;

    public c(d0 d0Var, d0 d0Var2) {
        d0 d0Var3 = new d0();
        this.f94920a = d0Var3;
        d0 d0Var4 = new d0();
        this.f94921b = d0Var4;
        d0Var3.L(d0Var);
        d0Var4.L(d0Var2);
    }

    public float a() {
        return this.f94920a.H(this.f94921b);
    }

    public float b() {
        return this.f94920a.l(this.f94921b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            c cVar = (c) obj;
            if (this.f94920a.equals(cVar.f94920a) && this.f94921b.equals(cVar.f94921b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f94920a.hashCode() + 71) * 71) + this.f94921b.hashCode();
    }

    public c(float f10, float f11, float f12, float f13, float f14, float f15) {
        d0 d0Var = new d0();
        this.f94920a = d0Var;
        d0 d0Var2 = new d0();
        this.f94921b = d0Var2;
        d0Var.y0(f10, f11, f12);
        d0Var2.y0(f13, f14, f15);
    }
}
