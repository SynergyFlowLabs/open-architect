package androidx.compose.animation.core;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMonoSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,303:1\n65#2,10:304\n65#2,10:314\n*S KotlinDebug\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n*L\n176#1:304,10\n244#1:314,10\n*E\n"})
public final class t1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13291e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final float[] f13292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final float[][] f13293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final float[][] f13294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final float[] f13295d;

    public t1(@NotNull float[] fArr, @NotNull float[][] fArr2, float f10) {
        int i10;
        int length = fArr.length;
        int i11 = 0;
        int length2 = fArr2[0].length;
        this.f13295d = new float[length2];
        int i12 = length - 1;
        float[][] fArrH = h(i12, length2);
        float[][] fArrH2 = h(length, length2);
        for (int i13 = 0; i13 < length2; i13++) {
            int i14 = 0;
            while (i14 < i12) {
                int i15 = i14 + 1;
                float f11 = fArr[i15] - fArr[i14];
                float[] fArr3 = fArrH[i14];
                float f12 = (fArr2[i15][i13] - fArr2[i14][i13]) / f11;
                fArr3[i13] = f12;
                if (i14 == 0) {
                    fArrH2[i14][i13] = f12;
                } else {
                    fArrH2[i14][i13] = (fArrH[i14 - 1][i13] + f12) * 0.5f;
                }
                i14 = i15;
            }
            fArrH2[i12][i13] = fArrH[length - 2][i13];
        }
        if (!Float.isNaN(f10)) {
            for (int i16 = 0; i16 < length2; i16++) {
                float[] fArr4 = fArrH[length - 2];
                float f13 = fArr4[i16] * (1 - f10);
                float[] fArr5 = fArrH[0];
                float f14 = f13 + (fArr5[i16] * f10);
                fArr5[i16] = f14;
                fArr4[i16] = f14;
                fArrH2[i12][i16] = f14;
                fArrH2[0][i16] = f14;
            }
        }
        int i17 = 0;
        while (i17 < i12) {
            int i18 = i11;
            while (i18 < length2) {
                float f15 = fArrH[i17][i18];
                if (f15 == 0.0f) {
                    fArrH2[i17][i18] = 0.0f;
                    fArrH2[i17 + 1][i18] = 0.0f;
                    i10 = length2;
                } else {
                    float f16 = fArrH2[i17][i18] / f15;
                    int i19 = i17 + 1;
                    float f17 = fArrH2[i19][i18] / f15;
                    i10 = length2;
                    float fHypot = (float) Math.hypot(f16, f17);
                    if (fHypot > 9.0d) {
                        float f18 = 3.0f / fHypot;
                        float[] fArr6 = fArrH2[i17];
                        float[] fArr7 = fArrH[i17];
                        fArr6[i18] = f16 * f18 * fArr7[i18];
                        fArrH2[i19][i18] = f18 * f17 * fArr7[i18];
                    }
                }
                i18++;
                length2 = i10;
            }
            i17++;
            i11 = 0;
        }
        this.f13292a = fArr;
        this.f13293b = fArr2;
        this.f13294c = fArrH2;
    }

    public static /* synthetic */ void c(t1 t1Var, float f10, w wVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        t1Var.b(f10, wVar, i10);
    }

    private final float d(float f10, int i10) {
        float[] fArr = this.f13292a;
        float[][] fArr2 = this.f13293b;
        float[][] fArr3 = this.f13294c;
        int length = fArr.length;
        int i11 = 0;
        float f11 = fArr[0];
        int i12 = length - 1;
        float f12 = fArr[i12];
        if (f10 < f11) {
            f10 = f11;
        }
        if (f10 <= f12) {
            f12 = f10;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            float f13 = fArr[i13];
            if (f12 <= f13) {
                float f14 = fArr2[i11][i10];
                float f15 = fArr2[i13][i10];
                float f16 = fArr3[i11][i10];
                float f17 = fArr3[i13][i10];
                float f18 = fArr[i11];
                float f19 = f13 - f18;
                return u1.a(f19, (f12 - f18) / f19, f14, f15, f16, f17) / f19;
            }
            i11 = i13;
        }
        return 0.0f;
    }

    private final void f(float f10, float[] fArr) {
        int length = this.f13293b[0].length;
        float[] fArr2 = this.f13292a;
        int length2 = fArr2.length;
        float f11 = fArr2[0];
        int i10 = length2 - 1;
        float f12 = fArr2[i10];
        if (f10 < f11) {
            f10 = f11;
        }
        if (f10 <= f12) {
            f12 = f10;
        }
        if (fArr.length < length) {
            return;
        }
        int i11 = 0;
        while (i11 < i10) {
            float[] fArr3 = this.f13292a;
            int i12 = i11 + 1;
            float f13 = fArr3[i12];
            if (f12 <= f13) {
                float f14 = fArr3[i11];
                float f15 = f13 - f14;
                float f16 = (f12 - f14) / f15;
                for (int i13 = 0; i13 < length; i13++) {
                    float[][] fArr4 = this.f13293b;
                    float f17 = fArr4[i11][i13];
                    float f18 = fArr4[i12][i13];
                    float[][] fArr5 = this.f13294c;
                    fArr[i13] = u1.a(f15, f16, f17, f18, fArr5[i11][i13], fArr5[i12][i13]) / f15;
                }
                return;
            }
            i11 = i12;
        }
    }

    public static /* synthetic */ void g(t1 t1Var, float f10, w wVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        t1Var.e(f10, wVar, i10);
    }

    private final float[][] h(int i10, int i11) {
        float[][] fArr = new float[i10][];
        for (int i12 = 0; i12 < i10; i12++) {
            fArr[i12] = new float[i11];
        }
        return fArr;
    }

    public final float a(float f10, int i10) {
        int i11;
        float[][] fArr = this.f13293b;
        float[][] fArr2 = this.f13294c;
        float[] fArr3 = this.f13292a;
        int length = fArr3.length;
        int i12 = 0;
        if (f10 <= fArr3[0]) {
            i11 = 0;
        } else {
            i11 = length - 1;
            if (f10 < fArr3[i11]) {
                i11 = -1;
            }
        }
        if (i11 != -1) {
            float f11 = fArr[i11][i10];
            float f12 = fArr3[i11];
            return f11 + ((f10 - f12) * d(f12, i10));
        }
        int i13 = length - 1;
        while (i12 < i13) {
            float[] fArr4 = this.f13292a;
            float f13 = fArr4[i12];
            if (f10 == f13) {
                return fArr[i12][i10];
            }
            int i14 = i12 + 1;
            float f14 = fArr4[i14];
            if (f10 < f14) {
                float f15 = f14 - f13;
                return u1.b(f15, (f10 - f13) / f15, fArr[i12][i10], fArr[i14][i10], fArr2[i12][i10], fArr2[i14][i10]);
            }
            i12 = i14;
        }
        return 0.0f;
    }

    public final void b(float f10, @NotNull w wVar, int i10) {
        int i11;
        float[] fArr = this.f13292a;
        int length = fArr.length;
        int i12 = 0;
        int length2 = this.f13293b[0].length;
        if (f10 <= fArr[0]) {
            i11 = 0;
        } else {
            i11 = length - 1;
            if (f10 < fArr[i11]) {
                i11 = -1;
            }
        }
        if (i11 != -1) {
            f(fArr[i11], this.f13295d);
            while (i12 < length2) {
                wVar.e(i12, this.f13293b[i11][i12] + ((f10 - this.f13292a[i11]) * this.f13295d[i12]));
                i12++;
            }
            return;
        }
        int i13 = length - 1;
        int i14 = i10;
        while (i14 < i13) {
            float[] fArr2 = this.f13292a;
            float f11 = fArr2[i14];
            if (f10 == f11) {
                while (i12 < length2) {
                    wVar.e(i12, this.f13293b[i14][i12]);
                    i12++;
                }
                return;
            }
            int i15 = i14 + 1;
            float f12 = fArr2[i15];
            if (f10 < f12) {
                float f13 = f12 - f11;
                float f14 = (f10 - f11) / f13;
                while (i12 < length2) {
                    float[][] fArr3 = this.f13293b;
                    float f15 = fArr3[i14][i12];
                    float f16 = fArr3[i15][i12];
                    float[][] fArr4 = this.f13294c;
                    wVar.e(i12, u1.b(f13, f14, f15, f16, fArr4[i14][i12], fArr4[i15][i12]));
                    i12++;
                }
                return;
            }
            i14 = i15;
        }
    }

    public final void e(float f10, @NotNull w wVar, int i10) {
        int i11;
        float[] fArr = this.f13292a;
        float[][] fArr2 = this.f13293b;
        float[][] fArr3 = this.f13294c;
        int length = fArr.length;
        int i12 = 0;
        int length2 = fArr2[0].length;
        if (f10 <= fArr[0]) {
            i11 = 0;
        } else {
            i11 = length - 1;
            if (f10 < fArr[i11]) {
                i11 = -1;
            }
        }
        if (i11 != -1) {
            float[] fArr4 = fArr3[i11];
            if (fArr4.length < length2) {
                return;
            }
            while (i12 < length2) {
                wVar.e(i12, fArr4[i12]);
                i12++;
            }
            return;
        }
        int i13 = length - 1;
        int i14 = i10;
        while (i14 < i13) {
            int i15 = i14 + 1;
            float f11 = fArr[i15];
            if (f10 <= f11) {
                float f12 = fArr[i14];
                float f13 = f11 - f12;
                float f14 = (f10 - f12) / f13;
                while (i12 < length2) {
                    wVar.e(i12, u1.a(f13, f14, fArr2[i14][i12], fArr2[i15][i12], fArr3[i14][i12], fArr3[i15][i12]) / f13);
                    i12++;
                }
                return;
            }
            i14 = i15;
        }
    }
}
