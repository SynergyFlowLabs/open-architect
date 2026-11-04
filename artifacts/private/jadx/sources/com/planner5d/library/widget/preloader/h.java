package com.planner5d.library.widget.preloader;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258544b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final PreloaderShimmerV2View f258545a;

    public h(@NotNull PreloaderShimmerV2View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f258545a = view;
    }

    @Override // com.planner5d.library.widget.preloader.b
    @NotNull
    protected Context b() {
        Context context = this.f258545a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void d() {
        this.f258545a.w();
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void l(int i10, int i11, @Nullable View.OnClickListener onClickListener, @Nullable View.OnClickListener onClickListener2) {
        this.f258545a.x();
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void m(@Nullable String str, @Nullable Integer num, boolean z10, boolean z11) {
        this.f258545a.x();
    }
}
