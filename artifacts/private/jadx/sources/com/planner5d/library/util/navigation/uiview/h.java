package com.planner5d.library.util.navigation.uiview;

import androidx.fragment.app.Fragment;
import androidx.navigation.n0;
import androidx.navigation.y1;
import androidx.viewpager2.widget.ViewPager2;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.v;
import com.planner5d.library.util.navigation.NavigationFragment;
import com.planner5d.library.util.navigation.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final k3 f244823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Fragment fragment, @NotNull v mainComponentsProvider) {
        k3 k3Var;
        y1 y1VarF;
        CharSequence charSequenceJ;
        String string;
        String string2;
        super(fragment, mainComponentsProvider);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(mainComponentsProvider, "mainComponentsProvider");
        try {
            n0 n0VarH = androidx.navigation.fragment.f.a(fragment).H();
            y1 y1VarF2 = n0VarH != null ? n0VarH.f() : null;
            if (!(y1VarF2 instanceof com.planner5d.library.util.navigation.uistate.c.a)) {
                throw new IllegalStateException("destination is not UiStateFragmentNavigator.Destination");
            }
            k3Var = ((com.planner5d.library.util.navigation.uistate.c.a) y1VarF2).E0(n0VarH.b());
            if (k3Var == null) {
                CharSequence charSequenceJ2 = ((com.planner5d.library.util.navigation.uistate.c.a) y1VarF2).J();
                k3Var = new k3((charSequenceJ2 == null || (string2 = charSequenceJ2.toString()) == null) ? com.planner5d.library.model.payments.a.f222474i : string2);
            }
            this.f244823d = k3Var;
        } catch (IllegalStateException e10) {
            timber.log.b.f381052a.e(e10);
            n0 n0VarH2 = androidx.navigation.fragment.f.a(fragment).H();
            k3Var = new k3((n0VarH2 == null || (y1VarF = n0VarH2.f()) == null || (charSequenceJ = y1VarF.J()) == null || (string = charSequenceJ.toString()) == null) ? "??" : string);
        }
    }

    private final NavigationFragment h() {
        return k.f240224a.c(g());
    }

    @Override // com.planner5d.library.util.navigation.uiview.g, com.planner5d.library.util.navigation.uiview.c
    @NotNull
    public c a(@NotNull com.planner5d.library.widget.tab.f tabsData, @NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(tabsData, "tabsData");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        NavigationFragment navigationFragmentH = h();
        if (navigationFragmentH != null) {
            navigationFragmentH.createTabs(tabsData, viewPager);
        }
        return this;
    }

    @Override // com.planner5d.library.util.navigation.uiview.c
    @NotNull
    public c b(boolean z10, @Nullable k3 k3Var, boolean z11) {
        NavigationFragment navigationFragmentH = h();
        if (navigationFragmentH != null) {
            navigationFragmentH.setInProgress(new com.planner5d.library.activity.helper.ui.b(z10, k3Var, z11));
        }
        return this;
    }

    @Override // com.planner5d.library.util.navigation.uiview.c
    @NotNull
    public c e(@NotNull k3 title) {
        Intrinsics.checkNotNullParameter(title, "title");
        NavigationFragment navigationFragmentH = h();
        if (navigationFragmentH != null) {
            navigationFragmentH.setTitle(title);
        }
        return this;
    }

    @Override // com.planner5d.library.util.navigation.uiview.c
    @NotNull
    public c f() {
        e(this.f244823d);
        return this;
    }
}
