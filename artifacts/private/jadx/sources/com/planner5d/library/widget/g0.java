package com.planner5d.library.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class g0 extends RecyclerView.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258188b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f258189a;

    public g0(@androidx.annotation.q int i10) {
        this.f258189a = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.c0 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.bottom = (int) parent.getResources().getDimension(this.f258189a);
    }
}
