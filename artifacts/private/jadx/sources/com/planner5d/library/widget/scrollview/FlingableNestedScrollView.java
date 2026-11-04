package com.planner5d.library.widget.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.ScrollingView;
import androidx.core.view.a1;
import androidx.core.view.v0;
import androidx.core.view.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class FlingableNestedScrollView extends ScrollView implements v0, z0, ScrollingView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f258711d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private a1 f258712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.core.view.w0 f258713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private a f258714c;

    public interface a {
        void a(@NotNull FlingableNestedScrollView flingableNestedScrollView, int i10, int i11, int i12, int i13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public FlingableNestedScrollView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.widget.ScrollView, android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return (int) Math.max(0.0d, super.computeVerticalScrollOffset());
    }

    @Override // android.widget.ScrollView, android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        return super.computeVerticalScrollRange();
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f258713b.a(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f258713b.b(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedPreScroll(int i10, int i11, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return this.f258713b.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @Nullable int[] iArr) {
        return this.f258713b.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, androidx.core.view.z0
    public int getNestedScrollAxes() {
        return this.f258712a.a();
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean hasNestedScrollingParent() {
        return this.f258713b.k();
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean isNestedScrollingEnabled() {
        return this.f258713b.m();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    protected void measureChild(@NotNull View child, int i10, int i11) {
        Intrinsics.checkNotNullParameter(child, "child");
        child.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), child.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    protected void measureChildWithMargins(@NotNull View child, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        child.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedPreFling(@NotNull View target, float f10, float f11) {
        Intrinsics.checkNotNullParameter(target, "target");
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedPreScroll(@NotNull View target, int i10, int i11, @NotNull int[] consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        dispatchNestedPreScroll(i10, i11, consumed, null);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedScrollAccepted(@NotNull View child, @NotNull View target, int i10) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f258712a.b(child, target, i10);
        startNestedScroll(2);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        a aVar = this.f258714c;
        if (aVar != null) {
            aVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onStartNestedScroll(@NotNull View child, @NotNull View target, int i10) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        return (i10 & 2) != 0;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onStopNestedScroll(@NotNull View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f258712a.d(target);
        stopNestedScroll();
    }

    @Override // android.view.View, androidx.core.view.v0
    public void setNestedScrollingEnabled(boolean z10) {
        this.f258713b.p(z10);
    }

    public final void setOnScrollChangeListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f258714c = listener;
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean startNestedScroll(int i10) {
        return this.f258713b.r(i10);
    }

    @Override // android.view.View, androidx.core.view.v0
    public void stopNestedScroll() {
        this.f258713b.t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public FlingableNestedScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlingableNestedScrollView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public FlingableNestedScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f258712a = new a1(this);
        this.f258713b = new androidx.core.view.w0(this);
        setNestedScrollingEnabled(true);
    }
}
