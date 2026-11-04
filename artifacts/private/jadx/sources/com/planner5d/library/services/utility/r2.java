package com.planner5d.library.services.utility;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r2 f229727a = new r2();

    private r2() {
    }

    public final float a(@NotNull Context context, float f10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return b(resources, f10);
    }

    public final float b(@NotNull Resources resources, float f10) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return TypedValue.applyDimension(1, f10, resources.getDisplayMetrics());
    }

    public final float c(@NotNull Resources resources, int i10) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return b(resources, i10);
    }
}
