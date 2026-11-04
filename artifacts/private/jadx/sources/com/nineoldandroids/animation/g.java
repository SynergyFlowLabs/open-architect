package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
class g extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f131201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f131202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f131203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f131204j;

    public g(j.a... aVarArr) {
        super(aVarArr);
        this.f131204j = true;
    }

    @Override // com.nineoldandroids.animation.k
    public Object b(float f10) {
        return Float.valueOf(i(f10));
    }

    @Override // com.nineoldandroids.animation.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g clone() {
        ArrayList<j> arrayList = this.f131220e;
        int size = arrayList.size();
        j.a[] aVarArr = new j.a[size];
        for (int i10 = 0; i10 < size; i10++) {
            aVarArr[i10] = (j.a) arrayList.get(i10).clone();
        }
        return new g(aVarArr);
    }

    public float i(float f10) {
        float fR;
        float f11;
        float fR2;
        float fR3;
        float f12;
        int i10 = this.f131216a;
        if (i10 != 2) {
            if (f10 <= 0.0f) {
                j.a aVar = (j.a) this.f131220e.get(0);
                j.a aVar2 = (j.a) this.f131220e.get(1);
                fR2 = aVar.r();
                fR3 = aVar2.r();
                float fB = aVar.b();
                float fB2 = aVar2.b();
                Interpolator interpolatorC = aVar2.c();
                if (interpolatorC != null) {
                    f10 = interpolatorC.getInterpolation(f10);
                }
                f12 = (f10 - fB) / (fB2 - fB);
                p pVar = this.f131221f;
                if (pVar != null) {
                    return ((Number) pVar.evaluate(f12, Float.valueOf(fR2), Float.valueOf(fR3))).floatValue();
                }
            } else if (f10 >= 1.0f) {
                j.a aVar3 = (j.a) this.f131220e.get(i10 - 2);
                j.a aVar4 = (j.a) this.f131220e.get(this.f131216a - 1);
                fR2 = aVar3.r();
                fR3 = aVar4.r();
                float fB3 = aVar3.b();
                float fB4 = aVar4.b();
                Interpolator interpolatorC2 = aVar4.c();
                if (interpolatorC2 != null) {
                    f10 = interpolatorC2.getInterpolation(f10);
                }
                f12 = (f10 - fB3) / (fB4 - fB3);
                p pVar2 = this.f131221f;
                if (pVar2 != null) {
                    return ((Number) pVar2.evaluate(f12, Float.valueOf(fR2), Float.valueOf(fR3))).floatValue();
                }
            } else {
                j.a aVar5 = (j.a) this.f131220e.get(0);
                int i11 = 1;
                while (true) {
                    int i12 = this.f131216a;
                    if (i11 >= i12) {
                        return ((Number) this.f131220e.get(i12 - 1).e()).floatValue();
                    }
                    j.a aVar6 = (j.a) this.f131220e.get(i11);
                    if (f10 < aVar6.b()) {
                        Interpolator interpolatorC3 = aVar6.c();
                        if (interpolatorC3 != null) {
                            f10 = interpolatorC3.getInterpolation(f10);
                        }
                        float fB5 = (f10 - aVar5.b()) / (aVar6.b() - aVar5.b());
                        fR = aVar5.r();
                        float fR4 = aVar6.r();
                        p pVar3 = this.f131221f;
                        if (pVar3 != null) {
                            return ((Number) pVar3.evaluate(fB5, Float.valueOf(fR), Float.valueOf(fR4))).floatValue();
                        }
                        f11 = fB5 * (fR4 - fR);
                    } else {
                        i11++;
                        aVar5 = aVar6;
                    }
                }
            }
            return fR2 + (f12 * (fR3 - fR2));
        }
        if (this.f131204j) {
            this.f131204j = false;
            this.f131201g = ((j.a) this.f131220e.get(0)).r();
            float fR5 = ((j.a) this.f131220e.get(1)).r();
            this.f131202h = fR5;
            this.f131203i = fR5 - this.f131201g;
        }
        Interpolator interpolator = this.f131219d;
        if (interpolator != null) {
            f10 = interpolator.getInterpolation(f10);
        }
        p pVar4 = this.f131221f;
        if (pVar4 != null) {
            return ((Number) pVar4.evaluate(f10, Float.valueOf(this.f131201g), Float.valueOf(this.f131202h))).floatValue();
        }
        fR = this.f131201g;
        f11 = f10 * this.f131203i;
        return fR + f11;
    }
}
