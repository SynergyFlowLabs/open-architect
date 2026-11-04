package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.g0;

/* JADX INFO: loaded from: classes4.dex */
public final class MathUtils {
    private MathUtils() {
    }

    public static void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, @NonNull @d1(min = 4) float[] fArr) {
        nPackTangentFrame(f10, f11, f12, f13, f14, f15, f16, f17, f18, fArr, 0);
    }

    public static void b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, @NonNull @d1(min = 4) float[] fArr, @g0(from = 0) int i10) {
        nPackTangentFrame(f10, f11, f12, f13, f14, f15, f16, f17, f18, fArr, i10);
    }

    private static native void nPackTangentFrame(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, @NonNull @d1(min = 4) float[] fArr, @g0(from = 0) int i10);
}
