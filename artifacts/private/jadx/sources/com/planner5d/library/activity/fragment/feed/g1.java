package com.planner5d.library.activity.fragment.feed;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g1 f133365a = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f133366b = 0;

    private g1() {
    }

    @NotNull
    public final Bundle a(@NotNull View view) {
        RecyclerView.p layoutManager;
        RecyclerView.p layoutManager2;
        ViewParent parent;
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent2 = view.getParent();
        Parcelable parcelableY1 = null;
        RecyclerView recyclerView = parent2 instanceof RecyclerView ? (RecyclerView) parent2 : null;
        ViewParent parent3 = (recyclerView == null || (parent = recyclerView.getParent()) == null) ? null : parent.getParent();
        RecyclerView recyclerView2 = parent3 instanceof RecyclerView ? (RecyclerView) parent3 : null;
        com.planner5d.library.services.utility.i iVarI = new com.planner5d.library.services.utility.i().i(recyclerView2 == null ? com.planner5d.library.services.r.scrollPosition : com.planner5d.library.services.r.scrollPositionHorizontal, (recyclerView == null || (layoutManager2 = recyclerView.getLayoutManager()) == null) ? null : layoutManager2.y1());
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.scrollPositionVertical;
        if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null) {
            parcelableY1 = layoutManager.y1();
        }
        return iVarI.i(rVar, parcelableY1).a();
    }
}
