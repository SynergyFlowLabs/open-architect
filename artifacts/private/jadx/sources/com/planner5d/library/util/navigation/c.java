package com.planner5d.library.util.navigation;

import android.content.Context;
import android.view.View;
import androidx.core.view.l0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.ui.u;
import com.planner5d.library.services.utility.z1;
import com.planner5d.library.widget.Toolbar;
import com.planner5d.library.widget.c0;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAppBarNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarNavigation.kt\ncom/planner5d/library/util/navigation/AppBarNavigation\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,78:1\n296#2,10:79\n*S KotlinDebug\n*F\n+ 1 AppBarNavigation.kt\ncom/planner5d/library/util/navigation/AppBarNavigation\n*L\n30#1:79,10\n*E\n"})
public final class c implements c0, z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fragment f240210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f240211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Toolbar f240212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FragmentContainerView f240213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.navigation.ui.d f240214e;

    public c(@NotNull Fragment hostFragment, @NotNull Set<Integer> topLevelDestinationIds) {
        Intrinsics.checkNotNullParameter(hostFragment, "hostFragment");
        Intrinsics.checkNotNullParameter(topLevelDestinationIds, "topLevelDestinationIds");
        this.f240210a = hostFragment;
        this.f240214e = new androidx.navigation.ui.d.a(topLevelDestinationIds).d(null).c(new androidx.navigation.ui.e.C0632e(new Function0() { // from class: com.planner5d.library.util.navigation.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(c.c(this.f240209a));
            }
        })).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(c cVar) {
        if (cVar.f240211b) {
            return false;
        }
        cVar.f240210a.requireActivity().onBackPressed();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(FragmentContainerView fragmentContainerView, View view) {
        fragmentContainerView.getFragment().requireActivity().onBackPressed();
    }

    public final void d(@NotNull Toolbar toolbar, @NotNull final FragmentContainerView navigationHost) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navigationHost, "navigationHost");
        Context context = toolbar.getContext();
        toolbar.w(context.getColor(l.e.Xl), context.getColor(l.e.Ul));
        u.b(toolbar, k.f240224a.a(navigationHost), this.f240214e);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.util.navigation.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.e(navigationHost, view);
            }
        });
        this.f240212c = toolbar;
        this.f240213d = navigationHost;
    }

    @NotNull
    public final com.planner5d.library.activity.helper.ui.d.b f(@NotNull com.planner5d.library.activity.helper.ui.d.b builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        com.planner5d.library.activity.helper.ui.d.b bVarN = builder.N(false);
        Intrinsics.checkNotNullExpressionValue(bVarN, "toolbarVisible(...)");
        return bVarN;
    }

    @Override // com.planner5d.library.services.utility.z1
    @NotNull
    public l0 getMenuHost() {
        Toolbar toolbar = this.f240212c;
        if (toolbar != null) {
            return toolbar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toolbar");
        return null;
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        FragmentContainerView fragmentContainerView = this.f240213d;
        FragmentContainerView fragmentContainerView2 = null;
        if (fragmentContainerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHost");
            fragmentContainerView = null;
        }
        List<Fragment> listN0 = fragmentContainerView.getFragment().getChildFragmentManager().N0();
        Intrinsics.checkNotNullExpressionValue(listN0, "getFragments(...)");
        androidx.activity.result.b bVar = (Fragment) CollectionsKt.firstOrNull((List) listN0);
        if ((bVar instanceof c0) && ((c0) bVar).onBackPressed()) {
            return true;
        }
        this.f240211b = true;
        k kVar = k.f240224a;
        FragmentContainerView fragmentContainerView3 = this.f240213d;
        if (fragmentContainerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHost");
        } else {
            fragmentContainerView2 = fragmentContainerView3;
        }
        boolean zB = androidx.navigation.ui.j.b(kVar.a(fragmentContainerView2), this.f240214e);
        this.f240211b = false;
        return zB;
    }
}
