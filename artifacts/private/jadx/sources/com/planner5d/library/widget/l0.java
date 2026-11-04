package com.planner5d.library.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class l0 extends RecyclerView.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f258226d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f258227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f258228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f258229c;

    public l0(@androidx.annotation.q int i10, @androidx.annotation.q int i11, @androidx.annotation.q int i12) {
        this.f258227a = i10;
        this.f258228b = i11;
        this.f258229c = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.c0 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.left = (int) parent.getResources().getDimension(this.f258227a);
        outRect.right = (int) parent.getResources().getDimension(this.f258228b);
        outRect.bottom = (int) parent.getResources().getDimension(this.f258229c);
    }
}
