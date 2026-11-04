package androidx.compose.animation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f13665a = 0.35f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f13666b = 0.5f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f13667c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f13668d = 0.175f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f13669e = 0.35000002f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(float[] fArr, float[] fArr2, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19 = 0.0f;
        int i11 = 0;
        float f20 = 0.0f;
        while (true) {
            float f21 = 1.0f;
            if (i11 >= i10) {
                fArr2[i10] = 1.0f;
                fArr[i10] = 1.0f;
                return;
            }
            float f22 = i11 / i10;
            float f23 = 1.0f;
            while (true) {
                f10 = ((f23 - f19) / 2.0f) + f19;
                f11 = f21 - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f24 = (((f11 * f13668d) + (f10 * f13669e)) * f12) + f13;
                f14 = f21;
                if (Math.abs(f24 - f22) < 1.0E-5d) {
                    break;
                }
                if (f24 > f22) {
                    f23 = f10;
                } else {
                    f19 = f10;
                }
                f21 = f14;
            }
            float f25 = 0.5f;
            fArr[i11] = (f12 * ((f11 * 0.5f) + f10)) + f13;
            float f26 = f14;
            while (true) {
                f15 = ((f26 - f20) / 2.0f) + f20;
                f16 = f14 - f15;
                f17 = f15 * 3.0f * f16;
                f18 = f15 * f15 * f15;
                float f27 = (((f16 * f25) + f15) * f17) + f18;
                float f28 = f22;
                if (Math.abs(f27 - f22) >= 1.0E-5d) {
                    if (f27 > f28) {
                        f26 = f15;
                    } else {
                        f20 = f15;
                    }
                    f22 = f28;
                    f25 = 0.5f;
                }
            }
            fArr2[i11] = (f17 * ((f16 * f13668d) + (f15 * f13669e))) + f18;
            i11++;
        }
    }

    @NotNull
    public static final <T> androidx.compose.animation.core.g0<T> c(@NotNull androidx.compose.ui.unit.d dVar) {
        return androidx.compose.animation.core.i0.e(new m1(dVar));
    }
}
