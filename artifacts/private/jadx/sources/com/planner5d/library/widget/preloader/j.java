package com.planner5d.library.widget.preloader;

import android.content.Context;
import android.view.View;
import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nPreloaderAdapteeSimpleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloaderAdapteeSimpleView.kt\ncom/planner5d/library/widget/preloader/PreloaderAdapteeSimpleView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,23:1\n257#2,2:24\n257#2,2:26\n*S KotlinDebug\n*F\n+ 1 PreloaderAdapteeSimpleView.kt\ncom/planner5d/library/widget/preloader/PreloaderAdapteeSimpleView\n*L\n13#1:24,2\n20#1:26,2\n*E\n"})
public final class j extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258553b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g0 f258554a;

    public j(@NotNull g0 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f258554a = view;
    }

    @Override // com.planner5d.library.widget.preloader.b
    @NotNull
    public Context b() {
        Context context = this.f258554a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @Override // com.planner5d.library.widget.preloader.b
    public void d() {
        this.f258554a.setVisibility(8);
    }

    @Override // com.planner5d.library.widget.preloader.b
    public void l(@f1 int i10, @f1 int i11, @NotNull View.OnClickListener buttonOkListener, @NotNull View.OnClickListener buttonCloseListener) {
        Intrinsics.checkNotNullParameter(buttonOkListener, "buttonOkListener");
        Intrinsics.checkNotNullParameter(buttonCloseListener, "buttonCloseListener");
        this.f258554a.setVisibility(0);
    }
}
