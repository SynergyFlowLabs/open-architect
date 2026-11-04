package com.planner5d.library.contest.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.planner5d.library.contest.view.archive.ContestArchiveList;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.statistics.events.r3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class MainContestPage extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f153360a = com.planner5d.library.util.navigation.uiview.f.c(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rd.l f153361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.statistics.b<l3.b> f153362c;

    @ij.a
    public l3 statisticsEventContests;

    @ij.a
    public r3 statisticsEventGeneric;

    public MainContestPage() {
        com.planner5d.library.contest.application.a.f148393b.a().m(this);
        this.f153362c = new com.planner5d.library.model.manager.statistics.b<>(l3.b.unknown);
    }

    private final com.planner5d.library.util.navigation.uiview.c v() {
        return (com.planner5d.library.util.navigation.uiview.c) this.f153360a.getValue();
    }

    private final com.planner5d.library.widget.tab.f w(final com.planner5d.library.services.utility.j jVar) {
        return new com.planner5d.library.widget.tab.f(CollectionsKt.listOf((Object[]) new com.planner5d.library.widget.tab.f.a[]{new com.planner5d.library.widget.tab.f.a(r3.d.design_battle_current, com.planner5d.library.contest.e.r.Z4, new Function0() { // from class: com.planner5d.library.contest.view.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainContestPage.x(jVar);
            }
        }, null, 8, null), new com.planner5d.library.widget.tab.f.a(r3.d.design_battle_completed, com.planner5d.library.contest.e.r.Y4, new Function0() { // from class: com.planner5d.library.contest.view.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainContestPage.y(jVar);
            }
        }, null, 8, null)}), jVar.s(com.planner5d.library.services.r.tab, null) == com.planner5d.library.services.r.completedList ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment x(com.planner5d.library.services.utility.j jVar) {
        ContestFragment contestFragment = new ContestFragment();
        contestFragment.setArguments(jVar.h(com.planner5d.library.services.r.currentList, null));
        return contestFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment y(com.planner5d.library.services.utility.j jVar) {
        ContestArchiveList contestArchiveList = new ContestArchiveList();
        contestArchiveList.setArguments(jVar.h(com.planner5d.library.services.r.completedList, null));
        return contestArchiveList;
    }

    @NotNull
    public final l3 getStatisticsEventContests$P5D_Library_Contest_release() {
        l3 l3Var = this.statisticsEventContests;
        if (l3Var != null) {
            return l3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statisticsEventContests");
        return null;
    }

    @NotNull
    public final r3 getStatisticsEventGeneric$P5D_Library_Contest_release() {
        r3 r3Var = this.statisticsEventGeneric;
        if (r3Var != null) {
            return r3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statisticsEventGeneric");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        rd.l lVarD = rd.l.d(inflater, viewGroup, false);
        this.f153361b = lVarD;
        if (lVarD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewSimplePagerBinding");
            lVarD = null;
        }
        ViewPager2 root = lVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f153362c.c(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f153362c.b(bundle, getArguments());
        getStatisticsEventContests$P5D_Library_Contest_release().g((l3.b) this.f153362c.a());
        com.planner5d.library.widget.tab.f fVarW = w(new com.planner5d.library.services.utility.j(getArguments()));
        rd.l lVar = this.f153361b;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewSimplePagerBinding");
            lVar = null;
        }
        ViewPager2 pager = lVar.f366632b;
        Intrinsics.checkNotNullExpressionValue(pager, "pager");
        v().a(fVarW, pager);
        pager.o(new com.planner5d.library.widget.tab.a(getStatisticsEventGeneric$P5D_Library_Contest_release(), fVarW.b()));
    }

    public final void setStatisticsEventContests$P5D_Library_Contest_release(@NotNull l3 l3Var) {
        Intrinsics.checkNotNullParameter(l3Var, "<set-?>");
        this.statisticsEventContests = l3Var;
    }

    public final void setStatisticsEventGeneric$P5D_Library_Contest_release(@NotNull r3 r3Var) {
        Intrinsics.checkNotNullParameter(r3Var, "<set-?>");
        this.statisticsEventGeneric = r3Var;
    }
}
