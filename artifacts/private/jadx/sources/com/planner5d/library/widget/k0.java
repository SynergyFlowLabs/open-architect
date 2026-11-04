package com.planner5d.library.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class k0 extends RecyclerView.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258220b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f258221a;

    public k0(int i10) {
        this.f258221a = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.c0 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.p layoutManager = parent.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int iH3 = ((GridLayoutManager) layoutManager).H3();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        GridLayoutManager.b bVar = (GridLayoutManager.b) layoutParams;
        int iJ = bVar.j();
        int iK = bVar.k();
        outRect.left = iJ == 0 ? this.f258221a : this.f258221a / 2;
        outRect.right = iJ + iK == iH3 ? this.f258221a : this.f258221a / 2;
    }
}
