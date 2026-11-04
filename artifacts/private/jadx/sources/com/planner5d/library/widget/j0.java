package com.planner5d.library.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.services.utility.h3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class j0 extends RecyclerView.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258210b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f258211a;

    public j0(int i10) {
        this.f258211a = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.c0 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.p layoutManager = parent.getLayoutManager();
        int i10 = 7 | 0;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int iH3 = gridLayoutManager.H3();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        GridLayoutManager.b bVar = (GridLayoutManager.b) layoutParams;
        int width = parent.getWidth();
        if (width <= 0 && parent.getLayoutParams().width == -1) {
            Object parent2 = parent.getParent();
            View view2 = parent2 instanceof View ? (View) parent2 : null;
            width = view2 != null ? view2.getWidth() : 0;
        }
        int i11 = width - (this.f258211a * iH3);
        int i12 = i11 / iH3;
        int i13 = i11 / (iH3 + 1);
        int iJ = i13 - ((i12 - i13) * bVar.j());
        if (h3.U(parent.getContext())) {
            outRect.right = iJ;
        } else {
            outRect.left = iJ;
        }
    }
}
