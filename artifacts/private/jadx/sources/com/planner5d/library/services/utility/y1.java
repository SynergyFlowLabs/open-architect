package com.planner5d.library.services.utility;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y1 f229856a = new y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final org.locationtech.jts.geom.r f229857b = new org.locationtech.jts.geom.r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final com.planner5d.library.math.m f229858c = new com.planner5d.library.math.m(1.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final com.planner5d.library.math.m f229859d = new com.planner5d.library.math.m(0.0f, 1.0f, 0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final com.planner5d.library.math.m f229860e = new com.planner5d.library.math.m(0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f229861f = 8;

    private y1() {
    }

    @oj.n
    @NotNull
    public static final BigDecimal b(@NotNull BigDecimal value, @NotNull BigDecimal min, @NotNull BigDecimal max) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        if (value.compareTo(min) < 0) {
            return min;
        }
        return value.compareTo(max) > 0 ? max : value;
    }

    @oj.n
    public static final float c(float f10, float f11, float f12, float f13) {
        double d10 = 2;
        return (float) Math.sqrt(((float) Math.pow(f12 - f10, d10)) + ((float) Math.pow(f13 - f11, d10)));
    }

    @oj.n
    @NotNull
    public static final BigDecimal d(float f10) {
        BigDecimal scale = new BigDecimal(String.valueOf(f10 * 100.0f)).setScale(2, 4);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }

    @oj.n
    @NotNull
    public static final org.locationtech.jts.geom.a g(@NotNull com.planner5d.library.math.k point) {
        Intrinsics.checkNotNullParameter(point, "point");
        return new org.locationtech.jts.geom.a(point.f180480a, point.f180481b);
    }

    public final float a(@NotNull com.planner5d.library.math.m a10, @NotNull com.planner5d.library.math.m b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return (float) Math.toDegrees(Math.acos(a10.X(b10) / (a10.t() * b10.t())));
    }

    @NotNull
    public final org.locationtech.jts.geom.r e() {
        return f229857b;
    }

    public final int f(int i10) {
        return Math.max(((int) Math.ceil(Math.random() * ((double) (i10 + 1)))) - 1, 0);
    }
}
