package com.planner5d.library.engine.util.math;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f165524a = new n();

    private n() {
    }

    @oj.n
    @NotNull
    public static final com.planner5d.library.math.m a(@NotNull com.planner5d.library.math.m mVar, @NotNull Matrix4 matrix) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] fArr = matrix.f165412a;
        float f10 = mVar.f180482a;
        float f11 = fArr[0] * f10;
        float f12 = mVar.f180483b;
        float f13 = f11 + (fArr[4] * f12);
        float f14 = mVar.f180484c;
        return mVar.y0(f13 + (fArr[8] * f14) + fArr[12], (fArr[1] * f10) + (fArr[5] * f12) + (fArr[9] * f14) + fArr[13], (f10 * fArr[2]) + (f12 * fArr[6]) + (f14 * fArr[10]) + fArr[14]);
    }

    @oj.n
    @NotNull
    public static final com.planner5d.library.math.m b(@NotNull com.planner5d.library.math.m mVar, @NotNull i quaternion) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(quaternion, "quaternion");
        com.planner5d.library.math.m mVarH0 = quaternion.h0(mVar);
        Intrinsics.checkNotNullExpressionValue(mVarH0, "transform(...)");
        return mVarH0;
    }

    @oj.n
    @NotNull
    public static final com.planner5d.library.math.m c(@NotNull com.planner5d.library.math.m mVar, @NotNull Matrix4 matrix) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] val = matrix.f165412a;
        Intrinsics.checkNotNullExpressionValue(val, "val");
        float f10 = mVar.f180482a;
        float f11 = val[3] * f10;
        float f12 = mVar.f180483b;
        float f13 = f11 + (val[7] * f12);
        float f14 = mVar.f180484c;
        float f15 = 1 / ((f13 + (val[11] * f14)) + val[15]);
        return mVar.y0(((val[0] * f10) + (val[4] * f12) + (val[8] * f14) + val[12]) * f15, ((val[1] * f10) + (val[5] * f12) + (val[9] * f14) + val[13]) * f15, ((f10 * val[2]) + (f12 * val[6]) + (f14 * val[10]) + val[14]) * f15);
    }

    @oj.n
    @NotNull
    public static final com.planner5d.library.math.m d(@NotNull com.planner5d.library.math.m mVar, @NotNull Matrix4 matrix) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] val = matrix.f165412a;
        Intrinsics.checkNotNullExpressionValue(val, "val");
        float f10 = mVar.f180482a;
        float f11 = val[0] * f10;
        float f12 = mVar.f180483b;
        float f13 = f11 + (val[4] * f12);
        float f14 = mVar.f180484c;
        return mVar.y0(f13 + (val[8] * f14), (val[1] * f10) + (val[5] * f12) + (val[9] * f14), (f10 * val[2]) + (f12 * val[6]) + (f14 * val[10]));
    }

    @oj.n
    @NotNull
    public static final com.planner5d.library.math.m e(@NotNull com.planner5d.library.math.m mVar, float f10, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Matrix4 matrix4C0 = new Matrix4().c0(f11, f12, f13, f10);
        Intrinsics.checkNotNull(matrix4C0);
        return a(mVar, matrix4C0);
    }

    @oj.n
    @NotNull
    public static final com.planner5d.library.math.m f(@NotNull com.planner5d.library.math.m mVar, @NotNull com.planner5d.library.math.m axis, float f10) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(axis, "axis");
        Matrix4 matrix4E0 = new Matrix4().e0(axis, f10);
        Intrinsics.checkNotNull(matrix4E0);
        return a(mVar, matrix4E0);
    }
}
