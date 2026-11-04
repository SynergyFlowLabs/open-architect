package com.planner5d.library.util.navigation;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.c2;
import androidx.navigation.fragment.x;
import androidx.navigation.w0;
import androidx.navigation.y1;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.application.t5;
import com.planner5d.library.model.manager.u1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f240224a = new k();

    private k() {
    }

    @NotNull
    public final w0 a(@NotNull FragmentContainerView fragmentContainerView) throws IllegalStateException {
        w0 navController;
        Intrinsics.checkNotNullParameter(fragmentContainerView, "<this>");
        Fragment fragment = fragmentContainerView.getFragment();
        x xVar = fragment instanceof x ? (x) fragment : null;
        if (xVar != null && (navController = xVar.getNavController()) != null) {
            return navController;
        }
        throw new IllegalStateException("FragmentContainerView " + fragmentContainerView + " does not contain a NavController");
    }

    @Nullable
    public final w0 b(@NotNull FragmentController fragmentController) {
        t5 t5VarC;
        u1 u1VarD;
        Intrinsics.checkNotNullParameter(fragmentController, "<this>");
        try {
            return x.Companion.d(fragmentController);
        } catch (Exception e10) {
            Context context = fragmentController.getContext();
            Object applicationContext = context != null ? context.getApplicationContext() : null;
            t5.b bVar = applicationContext instanceof t5.b ? (t5.b) applicationContext : null;
            if (bVar != null && (t5VarC = bVar.c()) != null && (u1VarD = t5VarC.d()) != null) {
                u1VarD.b("navigation", null, e10);
            }
            return null;
        }
    }

    @Nullable
    public final NavigationFragment c(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null) {
            return parentFragment instanceof NavigationFragment ? (NavigationFragment) parentFragment : f240224a.c(parentFragment);
        }
        return null;
    }

    public final void d(@NotNull w0 w0Var, @NotNull c2 directions, @NotNull Function2<? super w0, ? super c2, Unit> run) throws IllegalStateException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(directions, "directions");
        Intrinsics.checkNotNullParameter(run, "run");
        y1 y1VarJ = w0Var.J();
        if (y1VarJ == null || y1VarJ.t(directions.e()) == null) {
            return;
        }
        run.invoke(w0Var, directions);
    }
}
