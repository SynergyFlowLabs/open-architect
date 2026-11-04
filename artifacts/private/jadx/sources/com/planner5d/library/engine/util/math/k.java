package com.planner5d.library.engine.util.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class k implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f165513c = -620692054835390878L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static com.planner5d.library.math.m f165514d = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.planner5d.library.math.m f165515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.planner5d.library.math.m f165516b;

    public k(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        com.planner5d.library.math.m mVar3 = new com.planner5d.library.math.m();
        this.f165515a = mVar3;
        com.planner5d.library.math.m mVar4 = new com.planner5d.library.math.m();
        this.f165516b = mVar4;
        mVar3.A0(mVar);
        mVar4.A0(mVar2).u0();
    }

    public k a() {
        return new k(this.f165515a, this.f165516b);
    }

    public com.planner5d.library.math.m b(com.planner5d.library.math.m mVar, float f10) {
        return mVar.A0(this.f165516b).v0(f10).R(this.f165515a);
    }

    public k c(Matrix4 matrix4) {
        f165514d.A0(this.f165515a).R(this.f165516b);
        n.a(f165514d, matrix4);
        n.a(this.f165515a, matrix4);
        this.f165516b.A0(f165514d.H0(this.f165515a));
        return this;
    }

    public k d(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f165515a.y0(f10, f11, f12);
        this.f165516b.y0(f13, f14, f15);
        return this;
    }

    public k e(k kVar) {
        this.f165515a.A0(kVar.f165515a);
        this.f165516b.A0(kVar.f165516b);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            k kVar = (k) obj;
            if (this.f165516b.equals(kVar.f165516b) && this.f165515a.equals(kVar.f165515a)) {
                return true;
            }
        }
        return false;
    }

    public k f(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        this.f165515a.A0(mVar);
        this.f165516b.A0(mVar2);
        return this;
    }

    public int hashCode() {
        return ((this.f165516b.hashCode() + 73) * 73) + this.f165515a.hashCode();
    }

    public String toString() {
        return "ray [" + this.f165515a + ":" + this.f165516b + "]";
    }
}
