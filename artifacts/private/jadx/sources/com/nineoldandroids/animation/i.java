package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
class i extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f131205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f131206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f131207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f131208j;

    public i(j.b... bVarArr) {
        super(bVarArr);
        this.f131208j = true;
    }

    @Override // com.nineoldandroids.animation.k
    public Object b(float f10) {
        return Integer.valueOf(i(f10));
    }

    @Override // com.nineoldandroids.animation.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public i clone() {
        ArrayList<j> arrayList = this.f131220e;
        int size = arrayList.size();
        j.b[] bVarArr = new j.b[size];
        for (int i10 = 0; i10 < size; i10++) {
            bVarArr[i10] = (j.b) arrayList.get(i10).clone();
        }
        return new i(bVarArr);
    }

    public int i(float f10) {
        int iR;
        float f11;
        int iR2;
        int iR3;
        float f12;
        int i10 = this.f131216a;
        if (i10 != 2) {
            if (f10 <= 0.0f) {
                j.b bVar = (j.b) this.f131220e.get(0);
                j.b bVar2 = (j.b) this.f131220e.get(1);
                iR2 = bVar.r();
                iR3 = bVar2.r();
                float fB = bVar.b();
                float fB2 = bVar2.b();
                Interpolator interpolatorC = bVar2.c();
                if (interpolatorC != null) {
                    f10 = interpolatorC.getInterpolation(f10);
                }
                f12 = (f10 - fB) / (fB2 - fB);
                p pVar = this.f131221f;
                if (pVar != null) {
                    return ((Number) pVar.evaluate(f12, Integer.valueOf(iR2), Integer.valueOf(iR3))).intValue();
                }
            } else if (f10 >= 1.0f) {
                j.b bVar3 = (j.b) this.f131220e.get(i10 - 2);
                j.b bVar4 = (j.b) this.f131220e.get(this.f131216a - 1);
                iR2 = bVar3.r();
                iR3 = bVar4.r();
                float fB3 = bVar3.b();
                float fB4 = bVar4.b();
                Interpolator interpolatorC2 = bVar4.c();
                if (interpolatorC2 != null) {
                    f10 = interpolatorC2.getInterpolation(f10);
                }
                f12 = (f10 - fB3) / (fB4 - fB3);
                p pVar2 = this.f131221f;
                if (pVar2 != null) {
                    return ((Number) pVar2.evaluate(f12, Integer.valueOf(iR2), Integer.valueOf(iR3))).intValue();
                }
            } else {
                j.b bVar5 = (j.b) this.f131220e.get(0);
                int i11 = 1;
                while (true) {
                    int i12 = this.f131216a;
                    if (i11 >= i12) {
                        return ((Number) this.f131220e.get(i12 - 1).e()).intValue();
                    }
                    j.b bVar6 = (j.b) this.f131220e.get(i11);
                    if (f10 < bVar6.b()) {
                        Interpolator interpolatorC3 = bVar6.c();
                        if (interpolatorC3 != null) {
                            f10 = interpolatorC3.getInterpolation(f10);
                        }
                        f10 = (f10 - bVar5.b()) / (bVar6.b() - bVar5.b());
                        iR = bVar5.r();
                        int iR4 = bVar6.r();
                        p pVar3 = this.f131221f;
                        if (pVar3 != null) {
                            return ((Number) pVar3.evaluate(f10, Integer.valueOf(iR), Integer.valueOf(iR4))).intValue();
                        }
                        f11 = iR4 - iR;
                    } else {
                        i11++;
                        bVar5 = bVar6;
                    }
                }
            }
            return iR2 + ((int) (f12 * (iR3 - iR2)));
        }
        if (this.f131208j) {
            this.f131208j = false;
            this.f131205g = ((j.b) this.f131220e.get(0)).r();
            int iR5 = ((j.b) this.f131220e.get(1)).r();
            this.f131206h = iR5;
            this.f131207i = iR5 - this.f131205g;
        }
        Interpolator interpolator = this.f131219d;
        if (interpolator != null) {
            f10 = interpolator.getInterpolation(f10);
        }
        p pVar4 = this.f131221f;
        if (pVar4 != null) {
            return ((Number) pVar4.evaluate(f10, Integer.valueOf(this.f131205g), Integer.valueOf(this.f131206h))).intValue();
        }
        iR = this.f131205g;
        f11 = this.f131207i;
        return iR + ((int) (f10 * f11));
    }
}
