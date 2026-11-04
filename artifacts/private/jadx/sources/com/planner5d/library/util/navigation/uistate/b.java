package com.planner5d.library.util.navigation.uistate;

import android.os.Bundle;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.w0;
import androidx.navigation.y1;
import com.planner5d.library.activity.helper.ui.d;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.util.navigation.k;
import com.planner5d.library.widget.ScalableTabLayout;
import com.planner5d.library.widget.Toolbar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nUiStateApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiStateApplier.kt\ncom/planner5d/library/util/navigation/uistate/UiStateApplier\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,51:1\n257#2,2:52\n257#2,2:54\n*S KotlinDebug\n*F\n+ 1 UiStateApplier.kt\ncom/planner5d/library/util/navigation/uistate/UiStateApplier\n*L\n39#1:52,2\n40#1:54,2\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ij.c<d.b> f244799a;

    public b(@NotNull ij.c<d.b> baseUiStateProvider) {
        Intrinsics.checkNotNullParameter(baseUiStateProvider, "baseUiStateProvider");
        this.f244799a = baseUiStateProvider;
    }

    private final k3 b(c.a aVar) {
        CharSequence charSequenceJ = aVar.J();
        return charSequenceJ != null ? new k3(charSequenceJ.toString()) : new k3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(b bVar, com.planner5d.library.util.navigation.uiview.b bVar2, Toolbar toolbar, ScalableTabLayout scalableTabLayout, w0 w0Var, y1 destination, Bundle bundle) {
        Intrinsics.checkNotNullParameter(w0Var, "<unused var>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof c.a) {
            c.a aVar = (c.a) destination;
            d.e(bVar.f244799a.get().w(aVar.A0()).H(aVar.G0()).F(!aVar.D0()).x());
            k3 k3VarE0 = aVar.E0(bundle);
            if (k3VarE0 == null || bVar2.d(new com.planner5d.library.activity.helper.ui.b(false, k3VarE0, false, 4, null)) == null) {
                bVar2.g(bVar.b(aVar));
            }
            toolbar.setVisibility(aVar.L0() ? 0 : 8);
            scalableTabLayout.setVisibility(aVar.K0() ? 0 : 8);
        }
    }

    public final void c(@NotNull final Toolbar toolbar, @NotNull final ScalableTabLayout toolbarTabs, @NotNull final com.planner5d.library.util.navigation.uiview.b appUiStateHolder, @NotNull FragmentContainerView navigationHost) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbarTabs, "toolbarTabs");
        Intrinsics.checkNotNullParameter(appUiStateHolder, "appUiStateHolder");
        Intrinsics.checkNotNullParameter(navigationHost, "navigationHost");
        k.f240224a.a(navigationHost).j(new w0.c() { // from class: com.planner5d.library.util.navigation.uistate.a
            @Override // androidx.navigation.w0.c
            public final void a(w0 w0Var, y1 y1Var, Bundle bundle) {
                b.d(this.f244795a, appUiStateHolder, toolbar, toolbarTabs, w0Var, y1Var, bundle);
            }
        });
    }
}
