package com.planner5d.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class AppBarLayout extends com.google.android.material.appbar.AppBarLayout {

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final int f249420p3 = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public AppBarLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final float getDecoupledElevation() {
        return super.getElevation();
    }

    public final void setDecoupledElevation(float f10) {
        super.setElevation(f10);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.View
    public void setElevation(float f10) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public AppBarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 7 << 4;
    }

    public /* synthetic */ AppBarLayout(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public AppBarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
