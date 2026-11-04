package com.planner5d.library.widget.toolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ScrollingView;
import com.google.android.material.appbar.AppBarLayout;
import com.planner5d.library.widget.c1;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nToolbarShadowOnScrollBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolbarShadowOnScrollBehavior.kt\ncom/planner5d/library/widget/toolbar/ToolbarShadowOnScrollBehavior\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n228#2:104\n1#3:105\n1#3:106\n*S KotlinDebug\n*F\n+ 1 ToolbarShadowOnScrollBehavior.kt\ncom/planner5d/library/widget/toolbar/ToolbarShadowOnScrollBehavior\n*L\n25#1:104\n25#1:106\n*E\n"})
public final class ToolbarShadowOnScrollBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f258824s = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f258825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f258826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final Integer f258827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.AppBarLayout f258828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private View f258829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final a f258830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final c f258831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.a f258832o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarShadowOnScrollBehavior(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f258825h = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, c1.s.pE);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(c1.s.sE, 0));
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            throw new IllegalArgumentException("No behavior_appBarLayoutId attribute was configured");
        }
        Integer numValueOf2 = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(c1.s.tE, 0));
        Pair pair = new Pair(numValueOf, numValueOf2.intValue() != 0 ? numValueOf2 : null);
        typedArrayObtainStyledAttributes.recycle();
        this.f258826i = ((Number) pair.getFirst()).intValue();
        this.f258827j = (Integer) pair.getSecond();
        a aVar = new a();
        this.f258830m = aVar;
        this.f258831n = new c(aVar);
        this.f258832o = new com.planner5d.library.widget.a();
    }

    private final com.planner5d.library.widget.AppBarLayout j0(ViewGroup viewGroup) {
        com.planner5d.library.widget.AppBarLayout appBarLayout = this.f258828k;
        if (appBarLayout != null) {
            return appBarLayout;
        }
        View viewFindViewById = viewGroup.findViewById(this.f258826i);
        if (viewFindViewById instanceof com.planner5d.library.widget.AppBarLayout) {
            com.planner5d.library.widget.AppBarLayout appBarLayout2 = (com.planner5d.library.widget.AppBarLayout) viewFindViewById;
            this.f258828k = appBarLayout2;
            return appBarLayout2;
        }
        throw new IllegalArgumentException("The provided identifier doesn't target an instance of " + j1.d(com.planner5d.library.widget.AppBarLayout.class).m());
    }

    private final View k0(ViewGroup viewGroup) {
        Integer num = this.f258827j;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        View view = this.f258829l;
        if (view != null) {
            return view;
        }
        View viewFindViewById = viewGroup.findViewById(iIntValue);
        if (viewFindViewById == null) {
            return null;
        }
        this.f258829l = viewFindViewById;
        return viewFindViewById;
    }

    private final void m0(ViewGroup viewGroup, View view) {
        n0(viewGroup, this.f258830m.a(view));
    }

    private final void n0(ViewGroup viewGroup, ScrollingView scrollingView) {
        this.f258831n.b(scrollingView, j0(viewGroup));
        View viewK0 = k0(viewGroup);
        if (viewK0 == null) {
            return;
        }
        boolean z10 = false;
        boolean z11 = scrollingView != null && viewGroup.getHeight() - j0(viewGroup).getHeight() < scrollingView.computeVerticalScrollRange();
        com.planner5d.library.widget.a aVar = this.f258832o;
        if (this.f258825h && z11) {
            z10 = true;
        }
        aVar.a(viewK0, z10);
    }

    private final void o0(ViewGroup viewGroup) {
        n0(viewGroup, this.f258830m.c(viewGroup));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View child, @NotNull View target, int i10, int i11, int i12, int i13, int i14, @NotNull int[] consumed) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        super.B(coordinatorLayout, child, target, i10, i11, i12, i13, i14, consumed);
        m0(coordinatorLayout, target);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean I(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View child, @NotNull View directTargetChild, @NotNull View target, int i10, int i11) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        super.I(coordinatorLayout, child, directTargetChild, target, i10, i11);
        m0(coordinatorLayout, target);
        return true;
    }

    @Override // com.google.android.material.appbar.e, com.google.android.material.appbar.f
    protected void R(@NotNull CoordinatorLayout parent, @NotNull View child, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        super.R(parent, child, i10);
        o0(parent);
    }

    public final boolean l0() {
        return this.f258825h;
    }

    public final void p0(boolean z10) {
        this.f258825h = z10;
    }
}
