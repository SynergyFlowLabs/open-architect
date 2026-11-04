package com.planner5d.library.widget.preloader;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPreloaderAdapteeAnimationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloaderAdapteeAnimationView.kt\ncom/planner5d/library/widget/preloader/PreloaderAdapteeAnimationView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,22:1\n257#2,2:23\n257#2,2:25\n257#2,2:27\n*S KotlinDebug\n*F\n+ 1 PreloaderAdapteeAnimationView.kt\ncom/planner5d/library/widget/preloader/PreloaderAdapteeAnimationView\n*L\n11#1:23,2\n15#1:25,2\n19#1:27,2\n*E\n"})
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258522b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final PreloaderAnimationView f258523a;

    public c(@NotNull PreloaderAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f258523a = view;
    }

    @Override // com.planner5d.library.widget.preloader.b
    @NotNull
    protected Context b() {
        Context context = this.f258523a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void d() {
        this.f258523a.setVisibility(8);
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void k() {
        this.f258523a.setVisibility(0);
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void m(@Nullable String str, @Nullable Integer num, boolean z10, boolean z11) {
        this.f258523a.setVisibility(0);
    }
}
