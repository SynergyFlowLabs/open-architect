package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.a1;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f94959i = 1.0E-6f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f94960j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f94961k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f94962l = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f94964b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.badlogic.gdx.utils.v f94963a = new com.badlogic.gdx.utils.v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a1 f94965c = new a1(false, 16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a1 f94966d = new a1(false, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.badlogic.gdx.utils.v f94967e = new com.badlogic.gdx.utils.v();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.badlogic.gdx.utils.i f94968f = new com.badlogic.gdx.utils.i(false, 16);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f94969g = new float[6];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f94970h = new c0();

    private int a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18;
        float f19;
        float f20;
        float fAbs = Math.abs(f13 - f15);
        float fAbs2 = Math.abs(f15 - f17);
        if (fAbs >= 1.0E-6f) {
            float f21 = (-(f14 - f12)) / (f15 - f13);
            float f22 = (f12 + f14) / 2.0f;
            float f23 = (f13 + f15) / 2.0f;
            if (fAbs2 < 1.0E-6f) {
                f18 = (f16 + f14) / 2.0f;
            } else {
                float f24 = (-(f16 - f14)) / (f17 - f15);
                f18 = ((((f21 * f22) - (((f16 + f14) / 2.0f) * f24)) + ((f17 + f15) / 2.0f)) - f23) / (f21 - f24);
            }
            f19 = (f21 * (f18 - f22)) + f23;
            f20 = f18;
        } else {
            if (fAbs2 < 1.0E-6f) {
                return 2;
            }
            f20 = (f12 + f14) / 2.0f;
            f19 = (((-(f16 - f14)) / (f17 - f15)) * (f20 - ((f16 + f14) / 2.0f))) + ((f17 + f15) / 2.0f);
        }
        float f25 = f14 - f20;
        float f26 = f15 - f19;
        float f27 = (f25 * f25) + (f26 * f26);
        float f28 = f10 - f20;
        float f29 = f28 * f28;
        float f30 = f11 - f19;
        if (((f30 * f30) + f29) - f27 <= 1.0E-6f) {
            return 0;
        }
        return (f10 <= f20 || f29 <= f27) ? 2 : 1;
    }

    private int e(float[] fArr, int i10, int i11, short[] sArr) {
        float f10;
        float f11 = fArr[i10];
        int i12 = i10 + 2;
        while (i12 < i11) {
            while (i12 < i11 && fArr[i12] <= f11) {
                i12 += 2;
            }
            while (true) {
                f10 = fArr[i11];
                if (f10 <= f11) {
                    break;
                }
                i11 -= 2;
            }
            if (i12 < i11) {
                float f12 = fArr[i12];
                fArr[i12] = f10;
                fArr[i11] = f12;
                int i13 = i12 + 1;
                float f13 = fArr[i13];
                int i14 = i11 + 1;
                fArr[i13] = fArr[i14];
                fArr[i14] = f13;
                int i15 = i12 / 2;
                short s10 = sArr[i15];
                int i16 = i11 / 2;
                sArr[i15] = sArr[i16];
                sArr[i16] = s10;
            }
        }
        fArr[i10] = fArr[i11];
        fArr[i11] = f11;
        int i17 = i10 + 1;
        float f14 = fArr[i17];
        int i18 = i11 + 1;
        fArr[i17] = fArr[i18];
        fArr[i18] = f14;
        int i19 = i10 / 2;
        short s11 = sArr[i19];
        int i20 = i11 / 2;
        sArr[i19] = sArr[i20];
        sArr[i20] = s11;
        return i11;
    }

    private void f(float[] fArr, int i10) {
        int i11 = i10 / 2;
        this.f94966d.g();
        this.f94966d.i(i11);
        short[] sArr = this.f94966d.f95170a;
        for (short s10 = 0; s10 < i11; s10 = (short) (s10 + 1)) {
            sArr[s10] = s10;
        }
        com.badlogic.gdx.utils.v vVar = this.f94963a;
        vVar.a(0);
        vVar.a(i10 - 2);
        while (vVar.f95785b > 0) {
            int iQ = vVar.q();
            int iQ2 = vVar.q();
            if (iQ > iQ2) {
                int iE = e(fArr, iQ2, iQ, sArr);
                int i12 = iE - iQ2;
                int i13 = iQ - iE;
                if (i12 > i13) {
                    vVar.a(iQ2);
                    vVar.a(iE - 2);
                }
                vVar.a(iE + 2);
                vVar.a(iQ);
                if (i13 >= i12) {
                    vVar.a(iQ2);
                    vVar.a(iE - 2);
                }
            }
        }
    }

    public a1 b(com.badlogic.gdx.utils.q qVar, boolean z10) {
        return c(qVar.f95729a, 0, qVar.f95730b, z10);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01b7  */
    public a1 c(float[] fArr, int i10, int i11, boolean z10) {
        float[] fArr2;
        int i12;
        int i13;
        float[] fArr3;
        int i14;
        float[] fArr4;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i15;
        int i16;
        com.badlogic.gdx.utils.v vVar;
        float f16;
        short[] sArr;
        boolean[] zArr;
        int i17;
        a1 a1Var = this.f94965c;
        a1Var.g();
        if (i11 >= 6) {
            a1Var.i(i11);
            int i18 = 0;
            if (z10) {
                fArr2 = fArr;
                i12 = i10;
            } else {
                float[] fArr5 = this.f94964b;
                if (fArr5 == null || fArr5.length < i11) {
                    this.f94964b = new float[i11];
                }
                System.arraycopy(fArr, i10, this.f94964b, 0, i11);
                float[] fArr6 = this.f94964b;
                f(fArr6, i11);
                fArr2 = fArr6;
                i12 = 0;
            }
            int i19 = i12 + i11;
            float f17 = fArr2[0];
            int i20 = 1;
            float f18 = fArr2[1];
            float f19 = f17;
            float f20 = f18;
            for (int i21 = i12 + 2; i21 < i19; i21 += 2) {
                float f21 = fArr2[i21];
                if (f21 < f19) {
                    f19 = f21;
                }
                if (f21 > f17) {
                    f17 = f21;
                }
                float f22 = fArr2[i21 + 1];
                if (f22 < f18) {
                    f18 = f22;
                }
                if (f22 > f20) {
                    f20 = f22;
                }
            }
            float f23 = f17 - f19;
            float f24 = f20 - f18;
            if (f23 <= f24) {
                f23 = f24;
            }
            float f25 = f23 * 20.0f;
            float f26 = (f17 + f19) / 2.0f;
            float f27 = (f20 + f18) / 2.0f;
            float[] fArr7 = this.f94969g;
            fArr7[0] = f26 - f25;
            float f28 = f27 - f25;
            fArr7[1] = f28;
            fArr7[2] = f26;
            fArr7[3] = f27 + f25;
            fArr7[4] = f26 + f25;
            fArr7[5] = f28;
            com.badlogic.gdx.utils.v vVar2 = this.f94967e;
            vVar2.h(i11 / 2);
            com.badlogic.gdx.utils.i iVar = this.f94968f;
            iVar.f();
            iVar.g(i11);
            a1Var.a(i19);
            a1Var.a(i19 + 2);
            a1Var.a(i19 + 4);
            iVar.a(false);
            int i22 = i12;
            while (i22 < i19) {
                int i23 = i22;
                float f29 = fArr2[i23];
                float f30 = fArr2[i23 + 1];
                short[] sArr2 = a1Var.f95170a;
                boolean[] zArr2 = iVar.f95545a;
                int i24 = a1Var.f95171b - i20;
                while (i24 >= 0) {
                    int i25 = i24 / 3;
                    if (zArr2[i25]) {
                        i15 = i23;
                        sArr = sArr2;
                        zArr = zArr2;
                        i17 = i24;
                        fArr3 = fArr2;
                        i14 = i12;
                        i16 = i19;
                        fArr4 = fArr7;
                        vVar = vVar2;
                        f16 = f30;
                    } else {
                        boolean z11 = i20;
                        int i26 = i24 - 2;
                        fArr3 = fArr2;
                        short s10 = sArr2[i26];
                        i14 = i12;
                        int i27 = i24 - 1;
                        fArr4 = fArr7;
                        short s11 = sArr2[i27];
                        short s12 = sArr2[i24];
                        if (s10 >= i19) {
                            int i28 = s10 - i19;
                            f10 = fArr4[i28];
                            f11 = fArr4[i28 + 1];
                        } else {
                            f10 = fArr3[s10];
                            f11 = fArr3[s10 + 1];
                        }
                        if (s11 >= i19) {
                            int i29 = s11 - i19;
                            f12 = fArr4[i29];
                            f13 = fArr4[i29 + 1];
                        } else {
                            f12 = fArr3[s11];
                            f13 = fArr3[s11 + 1];
                        }
                        if (s12 >= i19) {
                            int i30 = s12 - i19;
                            f14 = fArr4[i30];
                            f15 = fArr4[i30 + 1];
                        } else {
                            f14 = fArr3[s12];
                            f15 = fArr3[s12 + 1];
                        }
                        com.badlogic.gdx.utils.i iVar2 = iVar;
                        i15 = i23;
                        i16 = i19;
                        float f31 = f11;
                        float f32 = f10;
                        vVar = vVar2;
                        f16 = f30;
                        sArr = sArr2;
                        zArr = zArr2;
                        i17 = i24;
                        int iA = a(f29, f16, f32, f31, f12, f13, f14, f15);
                        if (iA != 0) {
                            if (iA == z11) {
                                zArr[i25] = z11;
                            }
                            iVar = iVar2;
                        } else {
                            vVar.a(s10);
                            vVar.a(s11);
                            vVar.a(s11);
                            vVar.a(s12);
                            vVar.a(s12);
                            vVar.a(s10);
                            a1Var.u(i17);
                            a1Var.u(i27);
                            a1Var.u(i26);
                            iVar = iVar2;
                            iVar.o(i25);
                        }
                    }
                    i24 = i17 - 3;
                    fArr2 = fArr3;
                    f30 = f16;
                    vVar2 = vVar;
                    i12 = i14;
                    fArr7 = fArr4;
                    sArr2 = sArr;
                    zArr2 = zArr;
                    i19 = i16;
                    i23 = i15;
                    i20 = 1;
                }
                int i31 = i23;
                float[] fArr8 = fArr2;
                int i32 = i12;
                int i33 = i19;
                float[] fArr9 = fArr7;
                com.badlogic.gdx.utils.v vVar3 = vVar2;
                int[] iArr = vVar3.f95784a;
                int i34 = vVar3.f95785b;
                int i35 = 0;
                while (i35 < i34) {
                    int i36 = iArr[i35];
                    if (i36 == -1) {
                        i13 = i31;
                    } else {
                        int i37 = i35 + 1;
                        int i38 = iArr[i37];
                        boolean z12 = false;
                        for (int i39 = i35 + 2; i39 < i34; i39 += 2) {
                            if (i36 == iArr[i39 + 1] && i38 == iArr[i39]) {
                                iArr[i39] = -1;
                                z12 = true;
                            }
                        }
                        if (z12) {
                            i13 = i31;
                        } else {
                            a1Var.a(i36);
                            a1Var.a(iArr[i37]);
                            i13 = i31;
                            a1Var.a(i13);
                            iVar.a(false);
                        }
                    }
                    i35 += 2;
                    i31 = i13;
                }
                vVar3.f();
                i22 = i31 + 2;
                fArr2 = fArr8;
                i18 = 0;
                vVar2 = vVar3;
                i12 = i32;
                fArr7 = fArr9;
                i19 = i33;
                i20 = 1;
            }
            int i40 = i18;
            int i41 = i12;
            int i42 = i19;
            short[] sArr3 = a1Var.f95170a;
            int i43 = a1Var.f95171b - 1;
            while (i43 >= 0) {
                int i44 = i42;
                if (sArr3[i43] >= i44 || sArr3[i43 - 1] >= i44 || sArr3[i43 - 2] >= i44) {
                    a1Var.u(i43);
                    a1Var.u(i43 - 1);
                    a1Var.u(i43 - 2);
                }
                i43 -= 3;
                i42 = i44;
            }
            if (!z10) {
                short[] sArr4 = this.f94966d.f95170a;
                int i45 = a1Var.f95171b;
                for (int i46 = i40; i46 < i45; i46++) {
                    sArr3[i46] = (short) (sArr4[sArr3[i46] / 2] * 2);
                }
            }
            if (i41 == 0) {
                int i47 = a1Var.f95171b;
                for (int i48 = i40; i48 < i47; i48++) {
                    sArr3[i48] = (short) (sArr3[i48] / 2);
                }
            } else {
                int i49 = a1Var.f95171b;
                for (int i50 = i40; i50 < i49; i50++) {
                    sArr3[i50] = (short) ((sArr3[i50] - i41) / 2);
                }
            }
        }
        return a1Var;
    }

    public a1 d(float[] fArr, boolean z10) {
        return c(fArr, 0, fArr.length, z10);
    }

    public void g(a1 a1Var, float[] fArr, float[] fArr2, int i10, int i11) {
        short[] sArr = a1Var.f95170a;
        for (int i12 = a1Var.f95171b - 1; i12 >= 0; i12 -= 3) {
            int i13 = i12 - 2;
            int i14 = sArr[i13] * 2;
            int i15 = i12 - 1;
            int i16 = sArr[i15] * 2;
            int i17 = sArr[i12] * 2;
            n.m(fArr[i14], fArr[i14 + 1], fArr[i16], fArr[i16 + 1], fArr[i17], fArr[i17 + 1], this.f94970h);
            c0 c0Var = this.f94970h;
            if (!r.C(fArr2, i10, i11, c0Var.f94907a, c0Var.f94908b)) {
                a1Var.u(i12);
                a1Var.u(i15);
                a1Var.u(i13);
            }
        }
    }
}
