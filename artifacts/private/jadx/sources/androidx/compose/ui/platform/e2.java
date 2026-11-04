package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat_androidKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,688:1\n255#2:689\n13409#3,2:690\n*S KotlinDebug\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat_androidKt\n*L\n576#1:689\n592#1:690,2\n*E\n"})
public final class e2 {

    static final class a extends kotlin.jvm.internal.l0 implements Function1<View, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f40431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f40432b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, View view2) {
            super(1);
            this.f40431a = view;
            this.f40432b = view2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(e2.i(this.f40431a, view, view.getNextFocusForwardId()) == this.f40432b);
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<View, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f40433a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f40433a = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(view.getId() == this.f40433a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(View view, ArrayList<View> arrayList, int i10) {
        view.addFocusables(arrayList, i10, view.isInTouchMode() ? 1 : 0);
    }

    private static final void e(View view, ArrayList<View> arrayList, boolean z10) {
        boolean z11 = true;
        boolean z12 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z10 || view.isFocusableInTouchMode());
        if (view instanceof ViewGroup) {
            int size = arrayList.size();
            ViewGroup viewGroup = (ViewGroup) view;
            boolean z13 = viewGroup.getDescendantFocusability() == 131072;
            if (z12 && z13) {
                arrayList.add(view);
            }
            if (viewGroup.getDescendantFocusability() != 393216) {
                int childCount = viewGroup.getChildCount();
                View[] viewArr = new View[childCount];
                for (int i10 = 0; i10 < childCount; i10++) {
                    viewArr[i10] = viewGroup.getChildAt(i10);
                }
                h2 h2Var = h2.f40498a;
                if (viewGroup.getLayoutDirection() != 1) {
                    z11 = false;
                }
                h2Var.l(viewArr, viewGroup, z11);
                for (int i11 = 0; i11 < childCount; i11++) {
                    e(viewArr[i11], arrayList, z10);
                }
            }
            if (z12 && !z13 && size == arrayList.size()) {
                arrayList.add(view);
            }
        } else if (z12) {
            arrayList.add(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View f(View view, View view2, int i10) {
        int nextFocusForwardId;
        if (i10 == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return g(view2, view, new a(view2, view));
        }
        if (i10 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return i(view2, view, nextFocusForwardId);
        }
        return null;
    }

    private static final View g(View view, View view2, Function1<? super View, Boolean> function1) {
        View viewH;
        View view3 = null;
        while (true) {
            viewH = h(view2, function1, view3);
            if (viewH != null || view2 == view) {
                break;
            }
            Object parent = view2.getParent();
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            View view4 = (View) parent;
            view3 = view2;
            view2 = view4;
        }
        return viewH;
    }

    private static final View h(View view, Function1<? super View, Boolean> function1, View view2) {
        View viewH;
        if (function1.invoke(view).booleanValue()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != view2 && (viewH = h(childAt, function1, view2)) != null) {
                    return viewH;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View i(View view, View view2, int i10) {
        return g(view, view2, new b(i10));
    }
}
