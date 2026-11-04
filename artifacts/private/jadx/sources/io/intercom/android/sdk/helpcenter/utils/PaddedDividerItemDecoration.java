package io.intercom.android.sdk.helpcenter.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.core.content.d;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class PaddedDividerItemDecoration extends RecyclerView.o {
    public static final int $stable = 8;

    @NotNull
    private final Context context;

    @Nullable
    private Drawable dividerDrawable;
    private final int padding;

    public PaddedDividerItemDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.padding = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
        this.dividerDrawable = d.l(context, R.drawable.intercom_list_divider);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.c0 state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int paddingLeft = parent.getPaddingLeft() + this.padding;
        int width = (parent.getWidth() - parent.getPaddingRight()) - this.padding;
        if (parent.getAdapter() != null) {
            int childCount = parent.getChildCount() - 1;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = parent.getChildAt(i10);
                if (parent.s0(childAt) == -1) {
                    return;
                }
                int bottom = childAt.getBottom();
                Drawable drawable = this.dividerDrawable;
                int intrinsicHeight = (drawable != null ? drawable.getIntrinsicHeight() : 0) + bottom;
                Drawable drawable2 = this.dividerDrawable;
                if (drawable2 != null) {
                    drawable2.setBounds(paddingLeft, bottom, width, intrinsicHeight);
                }
                Drawable drawable3 = this.dividerDrawable;
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                }
            }
        }
    }
}
