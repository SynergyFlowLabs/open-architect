package com.planner5d.library.math;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f180461a = 2 / (1 + ((float) Math.sqrt(5.0f)));

    public a() {
        int i10 = 1 | 2;
    }

    private final float a(float f10, float f11) {
        return this.f180461a * (f11 - f10);
    }

    public final float b(@NotNull Function1<? super Float, Float> unimodalFunction, float f10, float f11, float f12, int i10) {
        Intrinsics.checkNotNullParameter(unimodalFunction, "unimodalFunction");
        float fA = f11 - a(f10, f11);
        float fA2 = a(f10, f11) + f10;
        float fFloatValue = unimodalFunction.invoke(Float.valueOf(fA)).floatValue();
        float fFloatValue2 = unimodalFunction.invoke(Float.valueOf(fA2)).floatValue();
        float fFloatValue3 = unimodalFunction.invoke(Float.valueOf(f10)).floatValue();
        float fFloatValue4 = unimodalFunction.invoke(Float.valueOf(f11)).floatValue();
        int i11 = 0;
        float f13 = f10;
        float f14 = f11;
        while (true) {
            i11++;
            if (i11 >= i10 || Math.abs(f14 - f13) <= f12) {
                break;
            }
            if (fFloatValue2 > fFloatValue) {
                float fA3 = fA2 - a(f13, fA2);
                float fFloatValue5 = unimodalFunction.invoke(Float.valueOf(fA3)).floatValue();
                float f15 = fA2;
                fA2 = fA;
                fA = fA3;
                fFloatValue2 = fFloatValue;
                fFloatValue = fFloatValue5;
                f14 = f15;
            } else {
                float fA4 = a(fA, f14) + fA;
                float fFloatValue6 = unimodalFunction.invoke(Float.valueOf(fA4)).floatValue();
                f13 = fA;
                fA = fA2;
                fA2 = fA4;
                fFloatValue = fFloatValue2;
                fFloatValue2 = fFloatValue6;
            }
        }
        float f16 = (f14 + f13) * 0.5f;
        float f17 = (fFloatValue + fFloatValue2) * 0.5f;
        if (!Float.isNaN(fFloatValue2) && !Float.isNaN(fFloatValue) && i11 != i10) {
            if (fFloatValue3 < f17) {
                return f10;
            }
            if (fFloatValue4 < f17) {
                return f11;
            }
        }
        return f16;
    }
}
