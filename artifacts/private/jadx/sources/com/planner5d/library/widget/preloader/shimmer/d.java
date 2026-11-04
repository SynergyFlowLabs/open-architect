package com.planner5d.library.widget.preloader.shimmer;

import android.graphics.Point;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f258601e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f258602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f258603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f258604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f258605d;

    public d(@NotNull Point displaySize, @NotNull c options) {
        Intrinsics.checkNotNullParameter(displaySize, "displaySize");
        Intrinsics.checkNotNullParameter(options, "options");
        double radians = Math.toRadians(options.l());
        double dCos = Math.cos(radians);
        double dTan = Math.tan(radians);
        float f10 = (float) (((double) displaySize.y) * dTan);
        float fM = (float) (((double) options.m()) / dCos);
        this.f258602a = fM;
        this.f258603b = (float) (((double) options.m()) * dTan);
        this.f258604c = (float) (((double) displaySize.y) / dCos);
        this.f258605d = displaySize.x + f10 + fM;
    }

    public final float a() {
        return this.f258604c;
    }

    public final float b() {
        return this.f258603b;
    }

    public final float c() {
        return this.f258602a;
    }

    public final float d() {
        return this.f258605d;
    }
}
