package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.a1;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f94971g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f94972h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f94973i = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short[] f94975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f94976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f94977d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a1 f94974a = new a1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.badlogic.gdx.utils.v f94978e = new com.badlogic.gdx.utils.v();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a1 f94979f = new a1();

    private static boolean a(float[] fArr, int i10, int i11) {
        if (i11 <= 2) {
            return false;
        }
        int i12 = i11 + i10;
        int i13 = i12 - 3;
        int i14 = i10;
        float f10 = 0.0f;
        while (i14 < i13) {
            int i15 = i14 + 2;
            f10 += (fArr[i14] * fArr[i14 + 3]) - (fArr[i15] * fArr[i14 + 1]);
            i14 = i15;
        }
        return (f10 + (fArr[i12 + (-2)] * fArr[i10 + 1])) - (fArr[i10] * fArr[i12 - 1]) < 0.0f;
    }

    private int b(int i10) {
        short[] sArr = this.f94975b;
        int i11 = sArr[k(i10)] * 2;
        int i12 = sArr[i10] * 2;
        int i13 = sArr[j(i10)] * 2;
        float[] fArr = this.f94976c;
        return c(fArr[i11], fArr[i11 + 1], fArr[i12], fArr[i12 + 1], fArr[i13], fArr[i13 + 1]);
    }

    private static int c(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (int) Math.signum((f10 * (f15 - f13)) + (f12 * (f11 - f15)) + (f14 * (f13 - f11)));
    }

    private void g(int i10) {
        short[] sArr = this.f94975b;
        a1 a1Var = this.f94979f;
        a1Var.b(sArr[k(i10)]);
        a1Var.b(sArr[i10]);
        a1Var.b(sArr[j(i10)]);
        this.f94974a.u(i10);
        this.f94978e.t(i10);
        this.f94977d--;
    }

    private int h() {
        int i10 = this.f94977d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i(i11)) {
                return i11;
            }
        }
        int[] iArr = this.f94978e.f95784a;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iArr[i12] != -1) {
                return i12;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean i(int i10) {
        float f10;
        float f11;
        int i11;
        float f12;
        int[] iArr = this.f94978e.f95784a;
        if (iArr[i10] == -1) {
            return false;
        }
        int iK = k(i10);
        int iJ = j(i10);
        short[] sArr = this.f94975b;
        int i12 = sArr[iK] * 2;
        int i13 = sArr[i10] * 2;
        int i14 = sArr[iJ] * 2;
        float[] fArr = this.f94976c;
        float f13 = fArr[i12];
        int i15 = 1;
        float f14 = fArr[i12 + 1];
        float f15 = fArr[i13];
        float f16 = fArr[i13 + 1];
        float f17 = fArr[i14];
        float f18 = fArr[i14 + 1];
        int iJ2 = j(iJ);
        while (iJ2 != iK) {
            if (iArr[iJ2] != i15) {
                int i16 = sArr[iJ2] * 2;
                float f19 = fArr[i16];
                float f20 = fArr[i16 + i15];
                float f21 = f13;
                i11 = i15;
                float f22 = f17;
                float f23 = f18;
                int iC = c(f22, f23, f21, f14, f19, f20);
                f17 = f22;
                f13 = f21;
                f18 = f23;
                f12 = f14;
                if (iC >= 0) {
                    float f24 = f15;
                    float f25 = f16;
                    int iC2 = c(f13, f12, f24, f25, f19, f20);
                    f10 = f24;
                    f11 = f25;
                    if (iC2 >= 0 && c(f10, f11, f17, f18, f19, f20) >= 0) {
                        return false;
                    }
                } else {
                    f10 = f15;
                    f11 = f16;
                }
            } else {
                f10 = f15;
                f11 = f16;
                i11 = i15;
                f12 = f14;
            }
            iJ2 = j(iJ2);
            f14 = f12;
            f15 = f10;
            f16 = f11;
            i15 = i11;
        }
        return i15;
    }

    private int j(int i10) {
        return (i10 + 1) % this.f94977d;
    }

    private int k(int i10) {
        if (i10 == 0) {
            i10 = this.f94977d;
        }
        return i10 - 1;
    }

    private void l() {
        int i10;
        int[] iArr = this.f94978e.f95784a;
        while (true) {
            i10 = this.f94977d;
            int i11 = 0;
            if (i10 <= 3) {
                break;
            }
            int iH = h();
            g(iH);
            int iK = k(iH);
            if (iH != this.f94977d) {
                i11 = iH;
            }
            iArr[iK] = b(iK);
            iArr[i11] = b(i11);
        }
        if (i10 == 3) {
            a1 a1Var = this.f94979f;
            short[] sArr = this.f94975b;
            a1Var.b(sArr[0]);
            a1Var.b(sArr[1]);
            a1Var.b(sArr[2]);
        }
    }

    public a1 d(com.badlogic.gdx.utils.q qVar) {
        return f(qVar.f95729a, 0, qVar.f95730b);
    }

    public a1 e(float[] fArr) {
        return f(fArr, 0, fArr.length);
    }

    public a1 f(float[] fArr, int i10, int i11) {
        this.f94976c = fArr;
        int i12 = i11 / 2;
        this.f94977d = i12;
        int i13 = i10 / 2;
        a1 a1Var = this.f94974a;
        a1Var.g();
        a1Var.i(i12);
        a1Var.f95171b = i12;
        short[] sArr = a1Var.f95170a;
        this.f94975b = sArr;
        if (a(fArr, i10, i11)) {
            for (short s10 = 0; s10 < i12; s10 = (short) (s10 + 1)) {
                sArr[s10] = (short) (i13 + s10);
            }
        } else {
            int i14 = i12 - 1;
            for (int i15 = 0; i15 < i12; i15++) {
                sArr[i15] = (short) ((i13 + i14) - i15);
            }
        }
        com.badlogic.gdx.utils.v vVar = this.f94978e;
        vVar.f();
        vVar.h(i12);
        for (int i16 = 0; i16 < i12; i16++) {
            vVar.a(b(i16));
        }
        a1 a1Var2 = this.f94979f;
        a1Var2.g();
        a1Var2.i(Math.max(0, i12 - 2) * 3);
        l();
        return a1Var2;
    }
}
