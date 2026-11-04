package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,688:1\n1#2:689\n35#3,5:690\n*S KotlinDebug\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat\n*L\n309#1:690,5\n*E\n"})
public final class d2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b f40392f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f40393g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final a f40394h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Rect f40395a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rect f40396b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Rect f40397c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c f40398d = new c(new c.a() { // from class: androidx.compose.ui.platform.c2
        @Override // androidx.compose.ui.platform.d2.c.a
        public final View a(View view, View view2) {
            return d2.p(this.f40328a, view, view2);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList<View> f40399e = new ArrayList<>();

    public static final class a extends ThreadLocal<d2> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d2 initialValue() {
            return new d2();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final d2 a() {
            d2 d2Var = d2.f40394h.get();
            Intrinsics.checkNotNull(d2Var);
            return d2Var;
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,688:1\n71#2,5:689\n53#2,5:694\n53#2,5:699\n*S KotlinDebug\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator\n*L\n389#1:689,5\n391#1:694,5\n399#1:699,5\n*E\n"})
    static final class c implements Comparator<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f40400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.collection.k2<View, View> f40401b = androidx.collection.b3.u();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final androidx.collection.l2<View> f40402c = androidx.collection.d3.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final androidx.collection.k2<View, View> f40403d = androidx.collection.b3.u();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final androidx.collection.f2<View> f40404e = androidx.collection.r2.d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private View f40405f;

        public interface a {
            @Nullable
            View a(@NotNull View view, @NotNull View view2);
        }

        public c(@NotNull a aVar) {
            this.f40400a = aVar;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@Nullable View view, @Nullable View view2) {
            if (view == view2) {
                return 0;
            }
            if (view == null) {
                return -1;
            }
            if (view2 == null) {
                return 1;
            }
            View viewP = this.f40403d.p(view);
            View viewP2 = this.f40403d.p(view2);
            if (viewP == viewP2 && viewP != null) {
                if (view == viewP) {
                    return -1;
                }
                return (view2 == viewP || this.f40401b.p(view) == null) ? 1 : -1;
            }
            if (viewP != null) {
                view = viewP;
            }
            if (viewP2 != null) {
                view2 = viewP2;
            }
            if (viewP == null && viewP2 == null) {
                return 0;
            }
            return this.f40404e.n(view) < this.f40404e.n(view2) ? -1 : 1;
        }

        public final void b() {
            this.f40405f = null;
            this.f40403d.K();
            this.f40402c.L();
            this.f40404e.P();
            this.f40401b.K();
        }

        public final void c(@NotNull ArrayList<View> arrayList, @NotNull View view) {
            this.f40405f = view;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f40404e.l0(arrayList.get(i10), i10);
            }
            int size2 = arrayList.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i11 = size2 - 1;
                    View view2 = arrayList.get(size2);
                    View viewA = this.f40400a.a(view, view2);
                    if (viewA != null && this.f40404e.e(viewA)) {
                        this.f40401b.q0(view2, viewA);
                        this.f40402c.C(viewA);
                    }
                    if (i11 < 0) {
                        break;
                    } else {
                        size2 = i11;
                    }
                }
            }
            int size3 = arrayList.size() - 1;
            if (size3 < 0) {
                return;
            }
            while (true) {
                int i12 = size3 - 1;
                View view3 = arrayList.get(size3);
                if (this.f40401b.p(view3) != null && !this.f40402c.e(view3)) {
                    d(view3);
                }
                if (i12 < 0) {
                    return;
                } else {
                    size3 = i12;
                }
            }
        }

        public final void d(@NotNull View view) {
            View view2 = view;
            while (view != null) {
                View viewP = this.f40403d.p(view);
                if (viewP != null) {
                    if (viewP == view2) {
                        return;
                    }
                    view = view2;
                    view2 = viewP;
                }
                this.f40403d.q0(view, view2);
                view = this.f40401b.p(view);
            }
        }
    }

    private final View c(ViewGroup viewGroup, Rect rect, int i10) {
        ViewGroup viewGroupJ = j(viewGroup, null);
        ArrayList<View> arrayList = this.f40399e;
        try {
            arrayList.clear();
            e2.d(viewGroupJ, arrayList, i10);
            if (arrayList.isEmpty()) {
                arrayList.clear();
                return null;
            }
            View viewE = e(viewGroupJ, null, rect, i10, arrayList);
            arrayList.clear();
            return viewE;
        } catch (Throwable th2) {
            arrayList.clear();
            throw th2;
        }
    }

    private final View e(ViewGroup viewGroup, View view, Rect rect, int i10, ArrayList<View> arrayList) {
        Rect rect2 = this.f40395a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 17 || i10 == 33) {
                    n(viewGroup, rect2);
                } else if (i10 == 66 || i10 == 130) {
                    o(viewGroup, rect2);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                n(viewGroup, rect2);
            } else {
                o(viewGroup, rect2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            o(viewGroup, rect2);
        } else {
            n(viewGroup, rect2);
        }
        if (i10 == 1 || i10 == 2) {
            return h(arrayList, viewGroup, view, i10);
        }
        if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
            return g(viewGroup, view, rect2, arrayList, i10);
        }
        throw new IllegalArgumentException("Unknown direction: " + i10);
    }

    private final View g(ViewGroup viewGroup, View view, Rect rect, ArrayList<View> arrayList, int i10) {
        this.f40396b.set(rect);
        if (i10 == 17) {
            this.f40396b.offset(rect.width() + 1, 0);
        } else if (i10 == 33) {
            this.f40396b.offset(0, rect.height() + 1);
        } else if (i10 == 66) {
            this.f40396b.offset((-rect.width()) - 1, 0);
        } else if (i10 == 130) {
            this.f40396b.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = arrayList.get(i11);
            if (!Intrinsics.areEqual(view3, view) && !Intrinsics.areEqual(view3, viewGroup)) {
                view3.getFocusedRect(this.f40397c);
                viewGroup.offsetDescendantRectToMyCoords(view3, this.f40397c);
                n0.j jVarE = androidx.compose.ui.graphics.c3.e(this.f40397c);
                n0.j jVarE2 = androidx.compose.ui.graphics.c3.e(this.f40396b);
                n0.j jVarE3 = androidx.compose.ui.graphics.c3.e(rect);
                androidx.compose.ui.focus.f fVarD = androidx.compose.ui.focus.n.d(i10);
                if (androidx.compose.ui.focus.b1.m(jVarE, jVarE2, jVarE3, fVarD != null ? fVarD.o() : androidx.compose.ui.focus.f.f37408b.e())) {
                    this.f40396b.set(this.f40397c);
                    view2 = view3;
                }
            }
        }
        return view2;
    }

    @e.a({"AsCollectionCall"})
    private final View h(ArrayList<View> arrayList, ViewGroup viewGroup, View view, int i10) {
        ArrayList<View> arrayList2;
        try {
            this.f40398d.c(arrayList, viewGroup);
            Collections.sort(arrayList, this.f40398d);
            this.f40398d.b();
            int size = arrayList.size();
            View viewL = null;
            if (size < 2) {
                return null;
            }
            if (i10 == 1) {
                arrayList2 = arrayList;
                viewL = l(view, arrayList2, size);
            } else if (i10 == 2) {
                arrayList2 = arrayList;
                viewL = k(view, arrayList2, size);
            } else if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
                arrayList2 = arrayList;
                viewL = g(viewGroup, view, this.f40395a, arrayList2, i10);
            } else {
                arrayList2 = arrayList;
            }
            return viewL == null ? arrayList2.get(size - 1) : viewL;
        } catch (Throwable th2) {
            this.f40398d.b();
            throw th2;
        }
    }

    private final View i(ViewGroup viewGroup, View view, int i10) {
        View viewF = e2.f(view, viewGroup, i10);
        boolean z10 = true;
        View viewF2 = viewF;
        while (viewF != null) {
            if (viewF.isFocusable() && viewF.getVisibility() == 0 && (!viewF.isInTouchMode() || viewF.isFocusableInTouchMode())) {
                return viewF;
            }
            viewF = e2.f(viewF, viewGroup, i10);
            boolean z11 = !z10;
            if (!z10) {
                viewF2 = viewF2 != null ? e2.f(viewF2, viewGroup, i10) : null;
                if (viewF2 == viewF) {
                    break;
                }
            }
            z10 = z11;
        }
        return null;
    }

    private final ViewGroup j(ViewGroup viewGroup, View view) {
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = null;
            while (parent instanceof ViewGroup) {
                if (parent == viewGroup) {
                    if (viewGroup2 == null) {
                        break;
                    }
                    return viewGroup2;
                }
                ViewGroup viewGroup3 = (ViewGroup) parent;
                if (viewGroup3.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                    viewGroup2 = viewGroup3;
                }
                parent = viewGroup3.getParent();
            }
        }
        return viewGroup;
    }

    private final View k(View view, ArrayList<View> arrayList, int i10) {
        int iLastIndexOf;
        int i11;
        if (i10 < 2) {
            return null;
        }
        return (view == null || (iLastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i11 = iLastIndexOf + 1) >= i10) ? arrayList.get(0) : arrayList.get(i11);
    }

    private final View l(View view, ArrayList<View> arrayList, int i10) {
        int iIndexOf;
        if (i10 < 2) {
            return null;
        }
        return (view == null || (iIndexOf = arrayList.indexOf(view)) <= 0) ? arrayList.get(i10 - 1) : arrayList.get(iIndexOf - 1);
    }

    private final boolean m(int i10) {
        return (i10 == 0 || i10 == -1) ? false : true;
    }

    private final void n(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY() + viewGroup.getHeight();
        int scrollX = viewGroup.getScrollX() + viewGroup.getWidth();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    private final void o(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY();
        int scrollX = viewGroup.getScrollX();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View p(d2 d2Var, View view, View view2) {
        if (d2Var.m(view2.getNextFocusForwardId())) {
            return e2.f(view2, view, 2);
        }
        return null;
    }

    @Nullable
    public final View d(@NotNull ViewGroup viewGroup, @NotNull View view, int i10) {
        ViewGroup viewGroupJ = j(viewGroup, view);
        View viewI = i(viewGroupJ, view, i10);
        if (viewI != null) {
            return viewI;
        }
        ArrayList<View> arrayList = this.f40399e;
        try {
            arrayList.clear();
            e2.d(viewGroupJ, arrayList, i10);
            if (!arrayList.isEmpty()) {
                viewI = e(viewGroupJ, view, null, i10, arrayList);
            }
            return viewI;
        } finally {
            arrayList.clear();
        }
    }

    @Nullable
    public final View f(@NotNull ViewGroup viewGroup, @NotNull Rect rect, int i10) {
        this.f40395a.set(rect);
        return c(viewGroup, this.f40395a, i10);
    }
}
