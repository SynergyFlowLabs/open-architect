package com.planner5d.library.widget.previewtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import androidx.core.content.d;
import com.planner5d.library.widget.c1;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPreviewToolbarItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewToolbarItem.kt\ncom/planner5d/library/widget/previewtoolbar/PreviewToolbarItem\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n51#2,9:76\n1#3:85\n*S KotlinDebug\n*F\n+ 1 PreviewToolbarItem.kt\ncom/planner5d/library/widget/previewtoolbar/PreviewToolbarItem\n*L\n27#1:76,9\n*E\n"})
public final class PreviewToolbarItem extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258628b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ImageView f258629a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public PreviewToolbarItem(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ColorStateList a() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(d.g(getContext(), c1.e.f250778tf));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        return colorStateListValueOf;
    }

    private final int b(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(c1.f.f251362yd);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            return mode != 0 ? i10 : View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), dimensionPixelSize), 1073741824);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(c1.f.Ed);
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null && viewGroup.indexOfChild(this) == 0) {
                marginLayoutParams.setMarginStart(dimensionPixelSize);
            }
            marginLayoutParams.setMarginEnd(dimensionPixelSize);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(b(i10), b(i11));
    }

    public final void setDefaultTint(boolean z10) {
        this.f258629a.setImageTintList(z10 ? a() : null);
    }

    public final void setImageDrawable(@Nullable Drawable drawable) {
        this.f258629a.setImageDrawable(drawable);
    }

    public final void setImageResource(@v int i10) {
        this.f258629a.setImageResource(i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public PreviewToolbarItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PreviewToolbarItem(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public PreviewToolbarItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundResource(c1.g.f251740yc);
        int dimensionPixelSize = getResources().getDimensionPixelSize(c1.f.Ad);
        ImageView imageView = new ImageView(context);
        int[] PreviewToolbarItem = c1.s.Ov;
        Intrinsics.checkNotNullExpressionValue(PreviewToolbarItem, "PreviewToolbarItem");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PreviewToolbarItem, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c1.s.Pv, 0);
        if (resourceId != 0) {
            imageView.setImageResource(resourceId);
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView.setImageTintList(a());
        this.f258629a = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        Unit unit = Unit.f312394a;
        addView(imageView, layoutParams);
    }
}
