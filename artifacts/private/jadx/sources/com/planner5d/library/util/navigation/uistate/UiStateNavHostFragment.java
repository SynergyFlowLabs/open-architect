package com.planner5d.library.util.navigation.uistate;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.x;
import androidx.navigation.r2;
import androidx.navigation.r3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nUiStateNavHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiStateNavHostFragment.kt\ncom/planner5d/library/util/navigation/uistate/UiStateNavHostFragment\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProviderKt\n*L\n1#1,15:1\n114#2,2:16\n*S KotlinDebug\n*F\n+ 1 UiStateNavHostFragment.kt\ncom/planner5d/library/util/navigation/uistate/UiStateNavHostFragment\n*L\n11#1:16,2\n*E\n"})
public final class UiStateNavHostFragment extends x {
    @Override // androidx.navigation.fragment.x
    protected void C(@NotNull r2 navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        super.C(navHostController);
        r3 r3VarP = navHostController.P();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        r3VarP.b(new c(contextRequireContext, childFragmentManager, getId()));
    }
}
