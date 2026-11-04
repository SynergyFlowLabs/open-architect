package com.planner5d.library.widget.preloader;

import android.content.Context;
import android.view.View;
import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class g extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258541b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final PreloaderDialogView f258542a;

    public g(@NotNull PreloaderDialogView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f258542a = view;
    }

    @Override // com.planner5d.library.widget.preloader.b
    @NotNull
    public Context b() {
        Context context = this.f258542a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @Override // com.planner5d.library.widget.preloader.b
    public void d() {
        this.f258542a.b();
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void j(@Nullable Integer num) {
        this.f258542a.setScrimColor(num);
    }

    @Override // com.planner5d.library.widget.preloader.b
    public void l(@f1 int i10, @f1 int i11, @NotNull View.OnClickListener buttonOkListener, @NotNull View.OnClickListener buttonCloseListener) {
        Intrinsics.checkNotNullParameter(buttonOkListener, "buttonOkListener");
        Intrinsics.checkNotNullParameter(buttonCloseListener, "buttonCloseListener");
        m(this.f258542a.getContext().getString(i10), null, false, true);
    }

    @Override // com.planner5d.library.widget.preloader.b
    protected void m(@Nullable String str, @Nullable Integer num, boolean z10, boolean z11) {
        this.f258542a.e(str, num, num != null && z10, z11);
    }
}
