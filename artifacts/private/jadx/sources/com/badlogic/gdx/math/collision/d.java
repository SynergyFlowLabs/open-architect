package com.badlogic.gdx.math.collision;

import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.utils.h0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class d implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f94922c = -6487336868908521596L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f94923d = 4.1887903f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f94924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f94925b;

    public d(d0 d0Var, float f10) {
        this.f94925b = new d0(d0Var);
        this.f94924a = f10;
    }

    public boolean a(d dVar) {
        float fL = this.f94925b.l(dVar.f94925b);
        float f10 = this.f94924a;
        float f11 = dVar.f94924a;
        return fL < (f10 + f11) * (f10 + f11);
    }

    public float b() {
        float f10 = this.f94924a;
        return 12.566371f * f10 * f10;
    }

    public float c() {
        float f10 = this.f94924a;
        return f94923d * f10 * f10 * f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            d dVar = (d) obj;
            if (this.f94924a == dVar.f94924a && this.f94925b.equals(dVar.f94925b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f94925b.hashCode() + 71) * 71) + h0.d(this.f94924a);
    }
}
