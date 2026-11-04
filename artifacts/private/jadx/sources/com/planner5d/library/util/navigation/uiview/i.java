package com.planner5d.library.util.navigation.uiview;

import androidx.fragment.app.Fragment;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@l(message = "Use FragmentAppUiView")
public final class i extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final k3 f244824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Fragment fragment, @NotNull v mainComponentsProvider) {
        super(fragment, mainComponentsProvider);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(mainComponentsProvider, "mainComponentsProvider");
        com.planner5d.library.activity.helper.ui.d dVarF = com.planner5d.library.activity.helper.ui.d.f137133w.f();
        this.f244824d = dVarF != null ? dVarF.f137148o : null;
    }

    @Override // com.planner5d.library.util.navigation.uiview.c
    @NotNull
    public c b(boolean z10, @Nullable k3 k3Var, boolean z11) {
        com.planner5d.library.activity.helper.ui.d.f(g(), new com.planner5d.library.activity.helper.ui.b(z10, k3Var, z11));
        return this;
    }

    @Override // com.planner5d.library.util.navigation.uiview.c
    @NotNull
    public c e(@NotNull k3 title) {
        Intrinsics.checkNotNullParameter(title, "title");
        com.planner5d.library.activity.helper.ui.d.i(title);
        return this;
    }

    @Override // com.planner5d.library.util.navigation.uiview.c
    @NotNull
    public c f() {
        com.planner5d.library.activity.helper.ui.d.i(this.f244824d);
        return this;
    }
}
