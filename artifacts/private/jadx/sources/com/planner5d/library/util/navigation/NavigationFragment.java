package com.planner5d.library.util.navigation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.l0;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.d1;
import androidx.viewpager2.widget.ViewPager2;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.z1;
import com.planner5d.library.widget.AppBarLayout;
import com.planner5d.library.widget.ScalableTabLayout;
import com.planner5d.library.widget.Toolbar;
import com.planner5d.library.widget.c0;
import java.util.Set;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nNavigationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationFragment.kt\ncom/planner5d/library/util/navigation/NavigationFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,116:1\n257#2,2:117\n*S KotlinDebug\n*F\n+ 1 NavigationFragment.kt\ncom/planner5d/library/util/navigation/NavigationFragment\n*L\n97#1:117,2\n*E\n"})
public abstract class NavigationFragment extends FragmentController implements c0, com.planner5d.library.activity.helper.ui.a, z1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Integer f240200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private ne.a f240201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f0 f240202g = g0.c(new Function0() { // from class: com.planner5d.library.util.navigation.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NavigationFragment.B(this.f240221a);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.util.navigation.uistate.b f240203h = new com.planner5d.library.util.navigation.uistate.b(new ij.c() { // from class: com.planner5d.library.util.navigation.g
        @Override // ij.c
        public final Object get() {
            return NavigationFragment.J(this.f240222a);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final j f240204i = new j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final h f240205j = new h();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.util.navigation.uiview.b f240206k = new com.planner5d.library.util.navigation.uiview.b();

    static final class a implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f240207a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f240207a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f240207a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f240207a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c B(NavigationFragment navigationFragment) {
        return new c(navigationFragment, navigationFragment.G());
    }

    private final c D() {
        return (c) this.f240202g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(NavigationFragment navigationFragment, com.planner5d.library.util.navigation.uiview.b.a aVar) {
        navigationFragment.I(aVar.b(), aVar.a());
        return Unit.f312394a;
    }

    private final void I(k3 k3Var, com.planner5d.library.activity.helper.ui.b bVar) {
        int i10;
        ne.a aVar = this.f240201f;
        if (aVar != null) {
            Toolbar toolbar = aVar.f332784f;
            if (!bVar.a()) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                toolbar.setTitle(k3Var.i(contextRequireContext));
                toolbar.setTitleTextColor(androidx.core.content.d.g(requireContext(), l.e.Xl));
            }
            boolean zC = bVar.c();
            aVar.f332785g.setInterceptTouches(zC);
            View navigationContentBlocker = aVar.f332781c;
            Intrinsics.checkNotNullExpressionValue(navigationContentBlocker, "navigationContentBlocker");
            if (zC) {
                i10 = 0;
                int i11 = 3 >> 0;
            } else {
                i10 = 8;
            }
            navigationContentBlocker.setVisibility(i10);
            if (bVar.a()) {
                aVar.f332783e.q();
            } else {
                aVar.f332783e.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.activity.helper.ui.d.b J(NavigationFragment navigationFragment) {
        return navigationFragment.C(navigationFragment.getContext());
    }

    @NotNull
    protected com.planner5d.library.activity.helper.ui.d.b C(@Nullable Context context) {
        return D().f(new com.planner5d.library.activity.helper.ui.d.b(context, this));
    }

    @n0
    protected abstract int E();

    @Nullable
    protected Integer F() {
        return this.f240200e;
    }

    @NotNull
    protected abstract Set<Integer> G();

    public final void createTabs(@NotNull com.planner5d.library.widget.tab.f tabsData, @NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(tabsData, "tabsData");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        ne.a aVar = this.f240201f;
        if (aVar != null) {
            com.planner5d.library.widget.tab.e eVar = new com.planner5d.library.widget.tab.e(this);
            ScalableTabLayout navigationToolbarTabs = aVar.f332785g;
            Intrinsics.checkNotNullExpressionValue(navigationToolbarTabs, "navigationToolbarTabs");
            AppBarLayout navigationAppBarLayout = aVar.f332780b;
            Intrinsics.checkNotNullExpressionValue(navigationAppBarLayout, "navigationAppBarLayout");
            com.planner5d.library.widget.tab.e.k(eVar, tabsData, viewPager, navigationToolbarTabs, navigationAppBarLayout, false, 16, null);
        }
    }

    @Override // com.planner5d.library.services.utility.z1
    @NotNull
    public l0 getMenuHost() {
        return D().getMenuHost();
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d dVarX = C(context).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        return D().onBackPressed();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ne.a aVarD = ne.a.d(inflater, viewGroup, false);
        this.f240201f = aVarD;
        CoordinatorLayout coordinatorLayoutB = aVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        FragmentContainerView fragmentContainerView;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        h hVar = this.f240205j;
        ne.a aVar = this.f240201f;
        if (aVar != null && (fragmentContainerView = aVar.f332782d) != null) {
            hVar.a(fragmentContainerView, outState);
        }
    }

    public final void setInProgress(@NotNull com.planner5d.library.activity.helper.ui.b inProgress) {
        Intrinsics.checkNotNullParameter(inProgress, "inProgress");
        this.f240206k.d(inProgress);
    }

    public final void setTitle(@NotNull k3 title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f240206k.f(title);
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void w(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        ne.a aVar = this.f240201f;
        if (aVar != null) {
            c cVarD = D();
            Toolbar navigationToolbar = aVar.f332784f;
            Intrinsics.checkNotNullExpressionValue(navigationToolbar, "navigationToolbar");
            FragmentContainerView navigationHost = aVar.f332782d;
            Intrinsics.checkNotNullExpressionValue(navigationHost, "navigationHost");
            cVarD.d(navigationToolbar, navigationHost);
            com.planner5d.library.util.navigation.uistate.b bVar = this.f240203h;
            Toolbar navigationToolbar2 = aVar.f332784f;
            Intrinsics.checkNotNullExpressionValue(navigationToolbar2, "navigationToolbar");
            ScalableTabLayout navigationToolbarTabs = aVar.f332785g;
            Intrinsics.checkNotNullExpressionValue(navigationToolbarTabs, "navigationToolbarTabs");
            com.planner5d.library.util.navigation.uiview.b bVar2 = this.f240206k;
            FragmentContainerView navigationHost2 = aVar.f332782d;
            Intrinsics.checkNotNullExpressionValue(navigationHost2, "navigationHost");
            bVar.c(navigationToolbar2, navigationToolbarTabs, bVar2, navigationHost2);
            j jVar = this.f240204i;
            FragmentContainerView navigationHost3 = aVar.f332782d;
            Intrinsics.checkNotNullExpressionValue(navigationHost3, "navigationHost");
            jVar.b(navigationHost3);
            h hVar = this.f240205j;
            FragmentContainerView navigationHost4 = aVar.f332782d;
            Intrinsics.checkNotNullExpressionValue(navigationHost4, "navigationHost");
            hVar.c(navigationHost4, E(), getArguments(), bundle, F());
        }
        this.f240206k.b().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.util.navigation.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavigationFragment.H(this.f240218a, (com.planner5d.library.util.navigation.uiview.b.a) obj);
            }
        }));
    }
}
