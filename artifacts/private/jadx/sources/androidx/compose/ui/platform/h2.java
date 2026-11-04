package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Comparator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusSorter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1#1,688:1\n1#2:689\n919#3,2:690\n13409#4,2:692\n1516#5:694\n*S KotlinDebug\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusSorter\n*L\n650#1:690,2\n652#1:692,2\n609#1:694\n*E\n"})
final class h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f40500c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h2 f40498a = new h2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.g2<Rect> f40499b = new androidx.collection.g2<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f40501d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.k2<View, Rect> f40502e = androidx.collection.b3.u();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Comparator<View> f40503f = new Comparator() { // from class: androidx.compose.ui.platform.f2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return h2.m((View) obj, (View) obj2);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Comparator<View> f40504g = new Comparator() { // from class: androidx.compose.ui.platform.g2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return h2.k((View) obj, (View) obj2);
        }
    };

    private h2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(View view, View view2) {
        if (view == view2) {
            return 0;
        }
        androidx.collection.k2<View, Rect> k2Var = f40502e;
        Rect rectP = k2Var.p(view);
        Intrinsics.checkNotNull(rectP);
        Rect rect = rectP;
        Rect rectP2 = k2Var.p(view2);
        Intrinsics.checkNotNull(rectP2);
        Rect rect2 = rectP2;
        int i10 = rect.left - rect2.left;
        return i10 == 0 ? (rect.right - rect2.right) * f40501d : i10 * f40501d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(View view, View view2) {
        if (view == view2) {
            return 0;
        }
        androidx.collection.k2<View, Rect> k2Var = f40502e;
        Rect rectP = k2Var.p(view);
        Intrinsics.checkNotNull(rectP);
        Rect rect = rectP;
        Rect rectP2 = k2Var.p(view2);
        Intrinsics.checkNotNull(rectP2);
        Rect rect2 = rectP2;
        int i10 = rect.top - rect2.top;
        return i10 == 0 ? rect.bottom - rect2.bottom : i10;
    }

    public final int c() {
        return f40500c;
    }

    @NotNull
    public final androidx.collection.k2<View, Rect> d() {
        return f40502e;
    }

    @NotNull
    public final androidx.collection.g2<Rect> e() {
        return f40499b;
    }

    public final int f() {
        return f40501d;
    }

    @NotNull
    public final Comparator<View> g() {
        return f40504g;
    }

    @NotNull
    public final Comparator<View> h() {
        return f40503f;
    }

    public final void i(int i10) {
        f40500c = i10;
    }

    public final void j(int i10) {
        f40501d = i10;
    }

    public final void l(@NotNull View[] viewArr, @NotNull ViewGroup viewGroup, boolean z10) {
        int length = viewArr.length;
        if (length < 2) {
            return;
        }
        int iC = length - f40499b.C();
        for (int i10 = 0; i10 < iC; i10++) {
            f40499b.a0(new Rect());
        }
        for (View view : viewArr) {
            androidx.collection.g2<Rect> g2Var = f40499b;
            int i11 = f40500c;
            f40500c = i11 + 1;
            Rect rectY = g2Var.y(i11);
            view.getDrawingRect(rectY);
            viewGroup.offsetDescendantRectToMyCoords(view, rectY);
            f40502e.q0(view, rectY);
        }
        ArraysKt.sortWith(viewArr, f40503f);
        Rect rectP = f40502e.p(viewArr[0]);
        Intrinsics.checkNotNull(rectP);
        int iMax = rectP.bottom;
        f40501d = z10 ? -1 : 1;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            Rect rectP2 = f40502e.p(viewArr[i13]);
            Intrinsics.checkNotNull(rectP2);
            Rect rect = rectP2;
            if (rect.top >= iMax) {
                if (i13 - i12 > 1) {
                    ArraysKt.sortWith(viewArr, f40504g, i12, i13);
                }
                iMax = rect.bottom;
                i12 = i13;
            } else {
                iMax = Math.max(iMax, rect.bottom);
            }
        }
        if (length - i12 > 1) {
            ArraysKt.sortWith(viewArr, f40504g, i12, length);
        }
        f40500c = 0;
        f40502e.K();
    }
}
