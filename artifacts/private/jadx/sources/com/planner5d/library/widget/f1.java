package com.planner5d.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.services.utility.u2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public class f1 extends RecyclerView {
    public static final int Y4 = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f1(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean d2(@NotNull u2 scrollPosition) {
        Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
        RecyclerView.p layoutManager = getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return false;
        }
        if (scrollPosition.c() >= 0) {
            RecyclerView.h adapter = getAdapter();
            if ((adapter != null ? adapter.getItemCount() : 0) > scrollPosition.a()) {
                linearLayoutManager.h3(scrollPosition.c(), scrollPosition.b());
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final u2 getScrollPosition() {
        int iB2;
        View viewO;
        RecyclerView.p layoutManager = getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (viewO = linearLayoutManager.O((iB2 = linearLayoutManager.B2()))) == null) {
            return null;
        }
        return new u2(iB2, viewO.getTop(), linearLayoutManager.E2());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f1(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ f1(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f1(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
