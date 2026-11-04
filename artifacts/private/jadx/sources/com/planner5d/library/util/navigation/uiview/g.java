package com.planner5d.library.util.navigation.uiview;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.viewpager2.widget.ViewPager2;
import com.planner5d.library.services.v;
import com.planner5d.library.widget.ScalableTabLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fragment f244820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v f244821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.tab.e f244822c;

    public g(@NotNull Fragment fragment, @NotNull v mainComponentsProvider) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(mainComponentsProvider, "mainComponentsProvider");
        this.f244820a = fragment;
        this.f244821b = mainComponentsProvider;
    }

    @Override // com.planner5d.library.util.navigation.uiview.c
    @NotNull
    public c a(@NotNull com.planner5d.library.widget.tab.f tabsData, @NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(tabsData, "tabsData");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        com.planner5d.library.widget.tab.e eVar = new com.planner5d.library.widget.tab.e(this.f244820a);
        this.f244822c = eVar;
        v vVar = this.f244821b;
        s sVarRequireActivity = this.f244820a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        ScalableTabLayout scalableTabLayoutC = vVar.c(sVarRequireActivity);
        v vVar2 = this.f244821b;
        s sVarRequireActivity2 = this.f244820a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity2, "requireActivity(...)");
        com.planner5d.library.widget.tab.e.k(eVar, tabsData, viewPager, scalableTabLayoutC, vVar2.b(sVarRequireActivity2), false, 16, null);
        return this;
    }

    @Override // com.planner5d.library.util.navigation.uiview.c
    @NotNull
    public c c() {
        v vVar = this.f244821b;
        s sVarRequireActivity = this.f244820a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        vVar.b(sVarRequireActivity).setVisibility(8);
        return this;
    }

    @Override // com.planner5d.library.util.navigation.uiview.c
    public void d(@NotNull com.planner5d.library.widget.tab.f tabsData) {
        Intrinsics.checkNotNullParameter(tabsData, "tabsData");
        com.planner5d.library.widget.tab.e eVar = this.f244822c;
        if (eVar != null) {
            eVar.f(tabsData);
        }
    }

    @NotNull
    protected final Fragment g() {
        return this.f244820a;
    }
}
