package com.planner5d.library.widget.slider;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class SlowLinearLayoutManager extends LinearLayoutManager {

    @NotNull
    public static final a O = new a(null);
    public static final int P = 0;
    private static final float Q = 50.0f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends s {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.s
        protected float w(DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
            return 50.0f / displayMetrics.densityDpi;
        }
    }

    public SlowLinearLayoutManager(@Nullable Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void j2(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.c0 state, int i10) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(state, "state");
        b bVar = new b(recyclerView.getContext());
        bVar.q(i10);
        k2(bVar);
    }

    public SlowLinearLayoutManager(@Nullable Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    public SlowLinearLayoutManager(@Nullable Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
