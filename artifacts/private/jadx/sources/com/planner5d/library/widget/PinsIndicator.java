package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class PinsIndicator extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f249490a = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PinsIndicator(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View a(boolean z10) {
        View view = new View(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(androidx.core.content.d.g(getContext(), z10 ? c1.e.Rf : c1.e.Af));
        view.setBackground(gradientDrawable);
        return view;
    }

    private final ViewGroup.MarginLayoutParams b() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(c1.f.f251311vd);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c1.f.Kd);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(dimensionPixelSize, dimensionPixelSize);
        marginLayoutParams.setMarginStart(dimensionPixelSize2);
        marginLayoutParams.setMarginEnd(dimensionPixelSize2);
        return marginLayoutParams;
    }

    public final void c(int i10, int i11) {
        removeAllViews();
        int i12 = 0;
        while (i12 < i11) {
            addView(a(i12 == i10), b());
            i12++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PinsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PinsIndicator(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PinsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
    }
}
