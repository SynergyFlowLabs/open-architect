package androidx.compose.animation.core;

/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f13316a = true;

    public static final float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f11 * f11;
        float f17 = 2;
        return (f10 * ((f14 - ((f17 * f11) * ((f17 * f14) + f15))) + ((3 * (f14 + f15)) * f16))) - ((6 * (f11 - f16)) * (f12 - f13));
    }

    public static final float b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f11 * f11;
        float f17 = f16 * f11;
        float f18 = 2;
        return ((((f14 * f10) * ((f11 - (f18 * f16)) + f17)) + ((f10 * f15) * (f17 - f16))) + f12) - (((3 * f16) - (f18 * f17)) * (f12 - f13));
    }
}
