package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.a1;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f94950b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.badlogic.gdx.utils.v f94949a = new com.badlogic.gdx.utils.v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.badlogic.gdx.utils.q f94951c = new com.badlogic.gdx.utils.q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.badlogic.gdx.utils.v f94952d = new com.badlogic.gdx.utils.v();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a1 f94953e = new a1(false, 0);

    private float a(float f10, float f11) {
        com.badlogic.gdx.utils.q qVar = this.f94951c;
        int i10 = qVar.f95730b;
        float fK = qVar.k(i10 - 4);
        float fK2 = qVar.k(i10 - 3);
        return ((qVar.k(i10 - 2) - fK) * (f11 - fK2)) - ((qVar.q() - fK2) * (f10 - fK));
    }

    private int h(float[] fArr, int i10, int i11) {
        float f10;
        float f11 = fArr[i10];
        int i12 = i10 + 1;
        float f12 = fArr[i12];
        int i13 = i10;
        while (i13 < i11) {
            while (i13 < i11 && fArr[i13] <= f11) {
                i13 += 2;
            }
            while (true) {
                f10 = fArr[i11];
                if (f10 <= f11 && (f10 != f11 || fArr[i11 + 1] >= f12)) {
                    break;
                }
                i11 -= 2;
            }
            if (i13 < i11) {
                float f13 = fArr[i13];
                fArr[i13] = f10;
                fArr[i11] = f13;
                int i14 = i13 + 1;
                float f14 = fArr[i14];
                int i15 = i11 + 1;
                fArr[i14] = fArr[i15];
                fArr[i15] = f14;
            }
        }
        fArr[i10] = fArr[i11];
        fArr[i11] = f11;
        int i16 = i11 + 1;
        fArr[i12] = fArr[i16];
        fArr[i16] = f12;
        return i11;
    }

    private int i(float[] fArr, int i10, int i11, boolean z10, short[] sArr) {
        float f10 = fArr[i10];
        int i12 = i10 + 1;
        float f11 = fArr[i12];
        int i13 = i10;
        while (i13 < i11) {
            while (i13 < i11 && fArr[i13] <= f10) {
                i13 += 2;
            }
            if (!z10) {
                while (true) {
                    float f12 = fArr[i11];
                    if (f12 <= f10 && (f12 != f10 || fArr[i11 + 1] <= f11)) {
                        break;
                    }
                    i11 -= 2;
                }
            } else {
                while (true) {
                    float f13 = fArr[i11];
                    if (f13 <= f10 && (f13 != f10 || fArr[i11 + 1] >= f11)) {
                        break;
                    }
                    i11 -= 2;
                }
            }
            if (i13 < i11) {
                float f14 = fArr[i13];
                fArr[i13] = fArr[i11];
                fArr[i11] = f14;
                int i14 = i13 + 1;
                float f15 = fArr[i14];
                int i15 = i11 + 1;
                fArr[i14] = fArr[i15];
                fArr[i15] = f15;
                int i16 = i13 / 2;
                short s10 = sArr[i16];
                int i17 = i11 / 2;
                sArr[i16] = sArr[i17];
                sArr[i17] = s10;
            }
        }
        fArr[i10] = fArr[i11];
        fArr[i11] = f10;
        int i18 = i11 + 1;
        fArr[i12] = fArr[i18];
        fArr[i18] = f11;
        int i19 = i10 / 2;
        short s11 = sArr[i19];
        int i20 = i11 / 2;
        sArr[i19] = sArr[i20];
        sArr[i20] = s11;
        return i11;
    }

    private void j(float[] fArr, int i10) {
        com.badlogic.gdx.utils.v vVar = this.f94949a;
        vVar.a(0);
        vVar.a(i10 - 2);
        while (vVar.f95785b > 0) {
            int iQ = vVar.q();
            int iQ2 = vVar.q();
            if (iQ > iQ2) {
                int iH = h(fArr, iQ2, iQ);
                int i11 = iH - iQ2;
                int i12 = iQ - iH;
                if (i11 > i12) {
                    vVar.a(iQ2);
                    vVar.a(iH - 2);
                }
                vVar.a(iH + 2);
                vVar.a(iQ);
                if (i12 >= i11) {
                    vVar.a(iQ2);
                    vVar.a(iH - 2);
                }
            }
        }
    }

    private void k(float[] fArr, int i10, boolean z10) {
        int i11 = i10 / 2;
        this.f94953e.g();
        this.f94953e.i(i11);
        short[] sArr = this.f94953e.f95170a;
        for (short s10 = 0; s10 < i11; s10 = (short) (s10 + 1)) {
            sArr[s10] = s10;
        }
        com.badlogic.gdx.utils.v vVar = this.f94949a;
        vVar.a(0);
        vVar.a(i10 - 2);
        while (vVar.f95785b > 0) {
            int iQ = vVar.q();
            int iQ2 = vVar.q();
            if (iQ > iQ2) {
                g gVar = this;
                float[] fArr2 = fArr;
                boolean z11 = z10;
                int i12 = gVar.i(fArr2, iQ2, iQ, z11, sArr);
                int i13 = i12 - iQ2;
                int i14 = iQ - i12;
                if (i13 > i14) {
                    vVar.a(iQ2);
                    vVar.a(i12 - 2);
                }
                vVar.a(i12 + 2);
                vVar.a(iQ);
                if (i14 >= i13) {
                    vVar.a(iQ2);
                    vVar.a(i12 - 2);
                }
                this = gVar;
                fArr = fArr2;
                z10 = z11;
            }
        }
    }

    public com.badlogic.gdx.utils.v b(com.badlogic.gdx.utils.q qVar, boolean z10, boolean z11) {
        return c(qVar.f95729a, 0, qVar.f95730b, z10, z11);
    }

    public com.badlogic.gdx.utils.v c(float[] fArr, int i10, int i11, boolean z10, boolean z11) {
        int i12 = i10 + i11;
        if (!z10) {
            float[] fArr2 = this.f94950b;
            if (fArr2 == null || fArr2.length < i11) {
                this.f94950b = new float[i11];
            }
            System.arraycopy(fArr, i10, this.f94950b, 0, i11);
            fArr = this.f94950b;
            k(fArr, i11, z11);
            i10 = 0;
        }
        com.badlogic.gdx.utils.v vVar = this.f94952d;
        vVar.f();
        com.badlogic.gdx.utils.q qVar = this.f94951c;
        qVar.f();
        int i13 = i10 / 2;
        int i14 = i10;
        while (i14 < i12) {
            float f10 = fArr[i14];
            float f11 = fArr[i14 + 1];
            while (qVar.f95730b >= 4 && a(f10, f11) <= 0.0f) {
                qVar.f95730b -= 2;
                vVar.f95785b--;
            }
            qVar.a(f10);
            qVar.a(f11);
            vVar.a(i13);
            i14 += 2;
            i13++;
        }
        int i15 = i12 - 4;
        int i16 = i15 / 2;
        int i17 = qVar.f95730b + 2;
        while (i15 >= i10) {
            float f12 = fArr[i15];
            float f13 = fArr[i15 + 1];
            while (qVar.f95730b >= i17 && a(f12, f13) <= 0.0f) {
                qVar.f95730b -= 2;
                vVar.f95785b--;
            }
            qVar.a(f12);
            qVar.a(f13);
            vVar.a(i16);
            i15 -= 2;
            i16--;
        }
        if (!z10) {
            short[] sArr = this.f94953e.f95170a;
            int[] iArr = vVar.f95784a;
            int i18 = vVar.f95785b;
            for (int i19 = 0; i19 < i18; i19++) {
                iArr[i19] = sArr[iArr[i19]];
            }
        }
        return vVar;
    }

    public com.badlogic.gdx.utils.v d(float[] fArr, boolean z10, boolean z11) {
        return c(fArr, 0, fArr.length, z10, z11);
    }

    public com.badlogic.gdx.utils.q e(com.badlogic.gdx.utils.q qVar, boolean z10) {
        return f(qVar.f95729a, 0, qVar.f95730b, z10);
    }

    public com.badlogic.gdx.utils.q f(float[] fArr, int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        if (!z10) {
            float[] fArr2 = this.f94950b;
            if (fArr2 == null || fArr2.length < i11) {
                this.f94950b = new float[i11];
            }
            System.arraycopy(fArr, i10, this.f94950b, 0, i11);
            fArr = this.f94950b;
            j(fArr, i11);
            i10 = 0;
        }
        com.badlogic.gdx.utils.q qVar = this.f94951c;
        qVar.f();
        for (int i13 = i10; i13 < i12; i13 += 2) {
            float f10 = fArr[i13];
            float f11 = fArr[i13 + 1];
            while (qVar.f95730b >= 4 && a(f10, f11) <= 0.0f) {
                qVar.f95730b -= 2;
            }
            qVar.a(f10);
            qVar.a(f11);
        }
        int i14 = qVar.f95730b + 2;
        for (int i15 = i12 - 4; i15 >= i10; i15 -= 2) {
            float f12 = fArr[i15];
            float f13 = fArr[i15 + 1];
            while (qVar.f95730b >= i14 && a(f12, f13) <= 0.0f) {
                qVar.f95730b -= 2;
            }
            qVar.a(f12);
            qVar.a(f13);
        }
        return qVar;
    }

    public com.badlogic.gdx.utils.q g(float[] fArr, boolean z10) {
        return f(fArr, 0, fArr.length, z10);
    }
}
