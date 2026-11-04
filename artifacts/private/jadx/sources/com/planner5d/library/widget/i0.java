package com.planner5d.library.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.services.utility.h3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class i0 extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f258209a = 0;

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.c0 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.p layoutManager = parent.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        GridLayoutManager.c cVarL3 = gridLayoutManager.L3();
        if (cVarL3 != null && cVarL3.f(parent.u0(view)) == 1) {
            int width = parent.getWidth();
            int i10 = view.getLayoutParams().width;
            int iH3 = gridLayoutManager.H3();
            int iU0 = parent.u0(view);
            int i11 = width - (i10 * iH3);
            int i12 = i11 / iH3;
            int i13 = i11 / (iH3 + 1);
            outRect.top = i13;
            int i14 = i13 - ((i12 - i13) * (iU0 % iH3));
            if (h3.U(parent.getContext())) {
                outRect.right = i14;
                return;
            }
            outRect.left = i14;
        }
    }
}
