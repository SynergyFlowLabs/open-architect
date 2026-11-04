package com.planner5d.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nScalableTabLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScalableTabLayout.kt\ncom/planner5d/library/widget/ScalableTabLayout\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,39:1\n55#2,4:40\n*S KotlinDebug\n*F\n+ 1 ScalableTabLayout.kt\ncom/planner5d/library/widget/ScalableTabLayout\n*L\n28#1:40,4\n*E\n"})
public final class ScalableTabLayout extends TabLayout {

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final int f249515i4 = 8;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private boolean f249516h4;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ScalableTabLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @androidx.annotation.l1
    public static /* synthetic */ void getInterceptTouches$annotations() {
    }

    public final boolean getInterceptTouches() {
        return this.f249516h4;
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f249516h4;
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        View childAt = getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) childAt;
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int size = View.MeasureSpec.getSize(i10);
            int i12 = size / childCount;
            int i13 = size % childCount;
            int childCount2 = viewGroup.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = viewGroup.getChildAt(i14);
                if (i13 > 0) {
                    childAt2.setMinimumWidth(i12 + 1);
                    i13--;
                } else {
                    childAt2.setMinimumWidth(i12);
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    public final void setInterceptTouches(boolean z10) {
        this.f249516h4 = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ScalableTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScalableTabLayout(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ScalableTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
