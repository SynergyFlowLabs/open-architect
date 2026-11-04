package com.planner5d.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDashedSlidesIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DashedSlidesIndicator.kt\ncom/planner5d/library/widget/DashedSlidesIndicator\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,63:1\n58#2,2:64\n*S KotlinDebug\n*F\n+ 1 DashedSlidesIndicator.kt\ncom/planner5d/library/widget/DashedSlidesIndicator\n*L\n22#1:64,2\n*E\n"})
public final class r extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f258637c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f258638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f258639b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public r(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View a(boolean z10) {
        View view = new View(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getResources().getDimension(c1.f.Xc));
        gradientDrawable.setColor(z10 ? this.f258639b : this.f258638a);
        view.setBackground(gradientDrawable);
        return view;
    }

    private final LinearLayout.LayoutParams b(boolean z10, boolean z11) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(c1.f.Kd);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(c1.f.Kc));
        layoutParams.leftMargin = z10 ? 0 : dimensionPixelSize;
        if (z11) {
            dimensionPixelSize = 0;
        }
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.weight = 1.0f;
        return layoutParams;
    }

    public final void c(int i10, int i11) {
        removeAllViews();
        setWeightSum(i11);
        int i12 = 0;
        while (i12 < i11) {
            boolean z10 = true;
            View viewA = a(i12 <= i10);
            boolean z11 = i12 == 0;
            if (i12 != i11 - 1) {
                z10 = false;
            }
            addView(viewA, b(z11, z10));
            i12++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public r(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ r(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public r(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        int[] DashedSlidesIndicator = c1.s.f253815lg;
        Intrinsics.checkNotNullExpressionValue(DashedSlidesIndicator, "DashedSlidesIndicator");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DashedSlidesIndicator, i10, 0);
        this.f258638a = typedArrayObtainStyledAttributes.getColor(c1.s.f253863ng, androidx.core.content.d.g(context, c1.e.f250413dm));
        this.f258639b = typedArrayObtainStyledAttributes.getColor(c1.s.f253839mg, androidx.core.content.d.g(context, c1.e.f250389cm));
        typedArrayObtainStyledAttributes.recycle();
    }
}
