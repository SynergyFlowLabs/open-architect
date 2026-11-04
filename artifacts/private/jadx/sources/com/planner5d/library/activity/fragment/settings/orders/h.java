package com.planner5d.library.activity.fragment.settings.orders;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.preloader.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@l(message = "Use OrdersHistoryFragment")
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nOrdersView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersView.kt\ncom/planner5d/library/activity/fragment/settings/orders/OrdersView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
public class h extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f135319c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final RecyclerView f135320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h0 f135321b;

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nOrdersView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersView.kt\ncom/planner5d/library/activity/fragment/settings/orders/OrdersView$Divider\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,96:1\n27#2,7:97\n*S KotlinDebug\n*F\n+ 1 OrdersView.kt\ncom/planner5d/library/activity/fragment/settings/orders/OrdersView$Divider\n*L\n72#1:97,7\n*E\n"})
    public static final class a extends androidx.recyclerview.widget.l {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f135322i = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final Rect f135323h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Context context) {
            super(context, 1);
            Intrinsics.checkNotNullParameter(context, "context");
            this.f135323h = new Rect();
        }

        @Override // androidx.recyclerview.widget.l, androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.c0 state) {
            int width;
            int paddingLeft;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            Drawable drawableH = h();
            if (drawableH == null) {
                return;
            }
            RecyclerView.h adapter = parent.getAdapter();
            if (adapter != null && (adapter instanceof com.planner5d.library.activity.fragment.settings.orders.a) && ((com.planner5d.library.activity.fragment.settings.orders.a) adapter).h()) {
                return;
            }
            int iSave = canvas.save();
            try {
                if (parent.getClipToPadding()) {
                    paddingLeft = parent.getPaddingLeft();
                    width = parent.getWidth() - parent.getPaddingRight();
                    canvas.clipRect(paddingLeft, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
                } else {
                    width = parent.getWidth();
                    paddingLeft = 0;
                }
                int childCount = parent.getChildCount();
                for (int i10 = 1; i10 < childCount; i10++) {
                    View childAt = parent.getChildAt(i10);
                    parent.y0(childAt, this.f135323h);
                    int iL0 = this.f135323h.bottom + kotlin.math.b.L0(childAt.getTranslationY());
                    drawableH.setBounds(paddingLeft, iL0 - drawableH.getIntrinsicHeight(), width, iL0);
                    drawableH.draw(canvas);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setAdapter(@NotNull RecyclerView.h<RecyclerView.g0> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f135320a.setAdapter(adapter);
    }

    public final void setLoaded(@Nullable Throwable th2) {
        if (th2 != null) {
            this.f135321b.q(ErrorMessageException.getError(getContext(), th2));
        } else {
            this.f135321b.b();
        }
    }

    public final void w() {
        this.f135321b.a(com.planner5d.library.f.s.pn, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, com.planner5d.library.f.m.f168647b9, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(com.planner5d.library.f.j.f168332qg);
        this.f135320a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        Drawable drawableL = androidx.core.content.d.l(context, com.planner5d.library.f.h.f167605j5);
        if (drawableL != null) {
            a aVar = new a(context);
            aVar.i(drawableL);
            recyclerView.n(aVar);
        }
        h0 h0VarA = new t(findViewById(com.planner5d.library.f.j.f168144il)).a();
        this.f135321b = h0VarA;
        com.planner5d.library.activity.helper.ui.d dVarF = com.planner5d.library.activity.helper.ui.d.f137133w.f();
        if (dVarF != null) {
            h0VarA.g(Integer.valueOf(dVarF.f137146m)).h(Integer.valueOf(dVarF.f137144k));
        }
        w();
    }
}
