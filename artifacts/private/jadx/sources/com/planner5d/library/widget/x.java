package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nEnhancedRecyclerViewUtilities.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnhancedRecyclerViewUtilities.kt\ncom/planner5d/library/widget/EnhancedRecyclerViewUtilities\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1557#2:142\n1628#2,3:143\n1863#2,2:146\n*S KotlinDebug\n*F\n+ 1 EnhancedRecyclerViewUtilities.kt\ncom/planner5d/library/widget/EnhancedRecyclerViewUtilities\n*L\n76#1:142\n76#1:143,3\n76#1:146,2\n*E\n"})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x f258869a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final PointF f258870b = new PointF(144.0f, 112.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f258871c = 8;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a extends RecyclerView.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f258872d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f258873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f258874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f258875c;

        public a(@androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @androidx.annotation.t0 int i12) {
            this.f258873a = i10;
            this.f258874b = i11;
            this.f258875c = i12;
        }

        private final boolean f(int i10, int i11) {
            return i10 <= i11;
        }

        private final boolean g(int i10, int i11, int i12, int i13) {
            return i13 - i10 <= i12 - i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.c0 state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int iS0 = parent.s0(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
            int iJ = bVar != null ? bVar.j() : 0;
            RecyclerView.p layoutManager = parent.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            int iH3 = gridLayoutManager != null ? gridLayoutManager.H3() : 1;
            int i10 = this.f258873a;
            outRect.left = i10;
            outRect.right = i10;
            outRect.top = f(iS0, iJ) ? this.f258874b : this.f258873a;
            outRect.bottom = g(iS0, iJ, iH3, state.d()) ? this.f258875c : this.f258873a;
        }
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function0 function0) {
        function0.invoke();
    }

    private final int d(int i10, Integer num) {
        float f10 = i10;
        PointF pointF = f258870b;
        float fMin = (f10 * pointF.y) / pointF.x;
        if (num != null) {
            fMin = Math.min(num.intValue(), fMin);
        }
        return (int) fMin;
    }

    private final Integer e(int i10) {
        if (View.MeasureSpec.getMode(i10) == 0) {
            return null;
        }
        return Integer.valueOf(View.MeasureSpec.getSize(i10));
    }

    @oj.n
    public static final void g(@NotNull RecyclerView list, int i10, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(list, "list");
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, list.getItemDecorationCount());
        ArrayList<RecyclerView.o> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            arrayList.add(list.D0(((IntIterator) it).nextInt()));
        }
        for (RecyclerView.o oVar : arrayList) {
            if (oVar instanceof a) {
                list.y1(oVar);
            }
        }
        int i15 = i10 / 2;
        list.n(new a(i15, i12, i14));
        list.setPadding(Math.max(i11 - i15, 0), 0, Math.max(i13 - i15, 0), 0);
    }

    @oj.n
    public static final void h(@NotNull RecyclerView list, @NotNull Context context, @androidx.annotation.q int i10) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(context, "context");
        i(list, context, Integer.valueOf(i10), Integer.valueOf(i10), Integer.valueOf(i10));
    }

    @oj.n
    public static final void i(@NotNull RecyclerView list, @NotNull Context context, @androidx.annotation.q @Nullable Integer num, @androidx.annotation.q @Nullable Integer num2, @androidx.annotation.q @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = num2 != null ? context.getResources().getDimensionPixelSize(num2.intValue()) : 0;
        int dimensionPixelSize2 = num3 != null ? context.getResources().getDimensionPixelSize(num3.intValue()) : 0;
        g(list, num != null ? context.getResources().getDimensionPixelSize(num.intValue()) : 0, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }

    public final void b(@NotNull EnhancedRecyclerView enhancedRecyclerView, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(enhancedRecyclerView, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        enhancedRecyclerView.f249452e5.add(new Runnable() { // from class: com.planner5d.library.widget.w
            @Override // java.lang.Runnable
            public final void run() {
                x.c(action);
            }
        });
    }

    public final void f(int i10, int i11, @NotNull Function2<? super Integer, ? super Integer, Unit> setterMeasureSpec) {
        Intrinsics.checkNotNullParameter(setterMeasureSpec, "setterMeasureSpec");
        setterMeasureSpec.invoke(Integer.valueOf(i10), Integer.valueOf(View.MeasureSpec.makeMeasureSpec(d(View.MeasureSpec.getSize(i10), e(i11)), 1073741824)));
    }
}
