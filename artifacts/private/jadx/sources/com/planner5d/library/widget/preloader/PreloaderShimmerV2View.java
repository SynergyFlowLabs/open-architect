package com.planner5d.library.widget.preloader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPreloaderShimmerV2View.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloaderShimmerV2View.kt\ncom/planner5d/library/widget/preloader/PreloaderShimmerV2View\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,48:1\n257#2,2:49\n257#2,2:51\n*S KotlinDebug\n*F\n+ 1 PreloaderShimmerV2View.kt\ncom/planner5d/library/widget/preloader/PreloaderShimmerV2View\n*L\n37#1:49,2\n46#1:51,2\n*E\n"})
public final class PreloaderShimmerV2View extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258513b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final te.b0 f258514a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PreloaderShimmerV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void w() {
        te.b0 b0Var = this.f258514a;
        Drawable drawable = b0Var.f380870b.getDrawable();
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable");
        ((ShimmerDrawable) drawable).stop();
        Drawable drawable2 = b0Var.f380871c.getDrawable();
        Intrinsics.checkNotNull(drawable2, "null cannot be cast to non-null type com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable");
        ((ShimmerDrawable) drawable2).stop();
        Drawable drawable3 = b0Var.f380872d.getDrawable();
        Intrinsics.checkNotNull(drawable3, "null cannot be cast to non-null type com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable");
        ((ShimmerDrawable) drawable3).stop();
        setVisibility(8);
    }

    public final void x() {
        te.b0 b0Var = this.f258514a;
        Drawable drawable = b0Var.f380870b.getDrawable();
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable");
        ((ShimmerDrawable) drawable).start();
        Drawable drawable2 = b0Var.f380871c.getDrawable();
        Intrinsics.checkNotNull(drawable2, "null cannot be cast to non-null type com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable");
        ((ShimmerDrawable) drawable2).start();
        Drawable drawable3 = b0Var.f380872d.getDrawable();
        Intrinsics.checkNotNull(drawable3, "null cannot be cast to non-null type com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable");
        ((ShimmerDrawable) drawable3).start();
        setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PreloaderShimmerV2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PreloaderShimmerV2View(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PreloaderShimmerV2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        te.b0 b0VarB = te.b0.b(LayoutInflater.from(context), this);
        this.f258514a = b0VarB;
        setBackgroundColor(androidx.core.content.d.g(context, c1.e.f250389cm));
        b0VarB.f380870b.setClipToOutline(true);
        b0VarB.f380871c.setClipToOutline(true);
        b0VarB.f380872d.setClipToOutline(true);
        setClickable(true);
        setFocusable(true);
    }
}
