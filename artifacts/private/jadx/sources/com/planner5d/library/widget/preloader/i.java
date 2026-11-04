package com.planner5d.library.widget.preloader;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nPreloaderAdapteeSimpleV2View.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloaderAdapteeSimpleV2View.kt\ncom/planner5d/library/widget/preloader/PreloaderAdapteeSimpleV2View\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,18:1\n257#2,2:19\n257#2,2:21\n*S KotlinDebug\n*F\n+ 1 PreloaderAdapteeSimpleV2View.kt\ncom/planner5d/library/widget/preloader/PreloaderAdapteeSimpleV2View\n*L\n11#1:19,2\n15#1:21,2\n*E\n"})
public final class i extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258551b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final PreloaderSimpleV2View f258552a;

    public i(@NotNull PreloaderSimpleV2View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f258552a = view;
    }

    @Override // com.planner5d.library.widget.preloader.b
    @NotNull
    public Context b() {
        Context context = this.f258552a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @Override // com.planner5d.library.widget.preloader.b
    public void d() {
        this.f258552a.setVisibility(8);
    }

    @Override // com.planner5d.library.widget.preloader.b
    public void k() {
        this.f258552a.setVisibility(0);
    }
}
