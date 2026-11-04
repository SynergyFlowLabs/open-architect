package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.core.motion.utils.s;
import androidx.constraintlayout.motion.widget.r;

/* JADX INFO: loaded from: classes2.dex */
public class b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f44954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f44955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.r f44956c;

    public b() {
        s sVar = new s();
        this.f44954a = sVar;
        this.f44956c = sVar;
    }

    @Override // androidx.constraintlayout.motion.widget.r
    public float a() {
        return this.f44956c.a();
    }

    public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        s sVar = this.f44954a;
        this.f44956c = sVar;
        sVar.f(f10, f11, f12, f13, f14, f15);
    }

    public String c(String str, float f10) {
        return this.f44956c.c(str, f10);
    }

    public float d(float f10) {
        return this.f44956c.b(f10);
    }

    public boolean e() {
        return this.f44956c.d();
    }

    public void f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        if (this.f44955b == null) {
            this.f44955b = new p();
        }
        p pVar = this.f44955b;
        this.f44956c = pVar;
        pVar.h(f10, f11, f12, f13, f14, f15, f16, i10);
    }

    @Override // androidx.constraintlayout.motion.widget.r, android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return this.f44956c.getInterpolation(f10);
    }
}
