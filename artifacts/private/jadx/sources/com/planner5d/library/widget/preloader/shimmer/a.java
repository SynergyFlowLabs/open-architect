package com.planner5d.library.widget.preloader.shimmer;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPreloaderAdapteeShimmerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloaderAdapteeShimmerView.kt\ncom/planner5d/library/widget/preloader/shimmer/PreloaderAdapteeShimmerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,26:1\n257#2,2:27\n257#2,2:29\n257#2,2:31\n*S KotlinDebug\n*F\n+ 1 PreloaderAdapteeShimmerView.kt\ncom/planner5d/library/widget/preloader/shimmer/PreloaderAdapteeShimmerView\n*L\n11#1:27,2\n17#1:29,2\n23#1:31,2\n*E\n"})
public final class a extends com.planner5d.library.widget.preloader.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258587b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ShimmerView f258588a;

    public a(@NotNull ShimmerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f258588a = view;
    }

    @Override // com.planner5d.library.widget.preloader.b
    @NotNull
    protected Context b() {
        Context context = this.f258588a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void d() {
        this.f258588a.setVisibility(8);
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void l(int i10, int i11, @Nullable View.OnClickListener onClickListener, @Nullable View.OnClickListener onClickListener2) {
        this.f258588a.setVisibility(0);
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void m(@Nullable String str, @Nullable Integer num, boolean z10, boolean z11) {
        this.f258588a.setVisibility(0);
    }
}
