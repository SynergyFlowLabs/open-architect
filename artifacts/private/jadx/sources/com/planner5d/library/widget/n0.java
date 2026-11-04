package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.services.utility.h3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nItemDecorationSimple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemDecorationSimple.kt\ncom/planner5d/library/widget/ItemDecorationSimple\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,71:1\n27#2,3:72\n31#2,3:79\n55#3,4:75\n*S KotlinDebug\n*F\n+ 1 ItemDecorationSimple.kt\ncom/planner5d/library/widget/ItemDecorationSimple\n*L\n31#1:72,3\n31#1:79,3\n34#1:75,4\n*E\n"})
public final class n0 extends RecyclerView.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f258406g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f258407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rect f258408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Rect f258409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f258410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f258411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Paint f258412f;

    public n0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f258407a = context;
        this.f258408b = new Rect();
        this.f258409c = new Rect();
        this.f258410d = context.getResources().getDimensionPixelSize(c1.f.Jc);
        this.f258411e = context.getResources().getDimensionPixelSize(c1.f.f251328wd);
        Paint paint = new Paint(1);
        paint.setColor(androidx.core.content.d.g(context, c1.e.Af));
        this.f258412f = paint;
    }

    private final void f(Canvas canvas, RecyclerView recyclerView) {
        if (!recyclerView.getClipToPadding()) {
            Rect rect = this.f258409c;
            rect.left = 0;
            rect.right = recyclerView.getWidth();
        } else {
            this.f258409c.left = recyclerView.getPaddingLeft();
            this.f258409c.right = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(this.f258409c.left, recyclerView.getPaddingTop(), this.f258409c.right, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        }
    }

    private final void g() {
        if (h3.U(this.f258407a)) {
            this.f258409c.right -= this.f258411e;
        } else {
            this.f258409c.left += this.f258411e;
        }
    }

    private final void h(RecyclerView recyclerView, View view) {
        recyclerView.y0(view, this.f258408b);
        this.f258409c.bottom = this.f258408b.bottom + ((int) Math.rint(view.getTranslationY()));
        Rect rect = this.f258409c;
        rect.top = rect.bottom - this.f258410d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.c0 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.set(0, 0, 0, this.f258410d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.c0 state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (parent.getLayoutManager() == null) {
            return;
        }
        int iSave = canvas.save();
        try {
            f(canvas, parent);
            g();
            int childCount = parent.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                h(parent, parent.getChildAt(i10));
                canvas.drawRect(this.f258409c, this.f258412f);
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }
}
