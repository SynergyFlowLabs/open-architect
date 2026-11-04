package com.planner5d.library.widget;

import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@kotlin.l(message = "A very dirty hack to force GridLayoutManager to update items and decorations after layout change")
@SourceDebugExtension({"SMAP\nGridLayoutManagerItemDecorationInvalidation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridLayoutManagerItemDecorationInvalidation.kt\ncom/planner5d/library/widget/GridLayoutManagerItemDecorationInvalidation\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,43:1\n1317#2,2:44\n*S KotlinDebug\n*F\n+ 1 GridLayoutManagerItemDecorationInvalidation.kt\ncom/planner5d/library/widget/GridLayoutManagerItemDecorationInvalidation\n*L\n36#1:44,2\n*E\n"})
public final class GridLayoutManagerItemDecorationInvalidation extends GridLayoutManager {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f249462c0 = 8;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    private final RecyclerView f249463a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f249464b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridLayoutManagerItemDecorationInvalidation(@NotNull RecyclerView recyclerView, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(recyclerView.getContext(), attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f249463a0 = recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(GridLayoutManagerItemDecorationInvalidation gridLayoutManagerItemDecorationInvalidation) {
        gridLayoutManagerItemDecorationInvalidation.f249463a0.invalidateOutline();
        gridLayoutManagerItemDecorationInvalidation.f249463a0.O0();
        Iterator<View> it = androidx.core.view.a2.e(gridLayoutManagerItemDecorationInvalidation.f249463a0).iterator();
        while (it.hasNext()) {
            it.next().requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void t1(@Nullable RecyclerView.c0 c0Var) {
        super.t1(c0Var);
        if (D0() != this.f249464b0) {
            this.f249464b0 = D0();
            this.f249463a0.post(new Runnable() { // from class: com.planner5d.library.widget.a0
                @Override // java.lang.Runnable
                public final void run() {
                    GridLayoutManagerItemDecorationInvalidation.V3(this.f249574a);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridLayoutManagerItemDecorationInvalidation(@NotNull RecyclerView recyclerView, int i10) {
        super(recyclerView.getContext(), i10);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f249463a0 = recyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridLayoutManagerItemDecorationInvalidation(@NotNull RecyclerView recyclerView, int i10, int i11, boolean z10) {
        super(recyclerView.getContext(), i10, i11, z10);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f249463a0 = recyclerView;
    }
}
