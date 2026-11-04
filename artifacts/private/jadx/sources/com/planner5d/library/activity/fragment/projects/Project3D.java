package com.planner5d.library.activity.fragment.projects;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.databinding.r1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class Project3D extends FragmentController implements com.planner5d.library.activity.helper.ui.a, com.planner5d.library.widget.c0 {
    public static final int $stable = 8;

    @ij.a
    public com.planner5d.library.widget.editor.editor3d.t controller;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r1 f134916e;

    public Project3D() {
        com.planner5d.library.application.b.f142455c.a().d0(this);
        this.f131538b.k(new ij.c() { // from class: com.planner5d.library.activity.fragment.projects.p
            @Override // ij.c
            public final Object get() {
                return Project3D.z(this.f135081a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable z(Project3D project3D) {
        return project3D.getController$P5D_Library_release().q();
    }

    @NotNull
    public final com.planner5d.library.widget.editor.editor3d.t getController$P5D_Library_release() {
        com.planner5d.library.widget.editor.editor3d.t tVar = this.controller;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.activity.helper.ui.d.b bVar = new com.planner5d.library.activity.helper.ui.d.b(context, this);
        bVar.J(2).N(false).H(true).F(false).A(R.color.transparent);
        com.planner5d.library.activity.helper.ui.d dVarX = bVar.x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    public void onActivityCreatedExtended(@Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        getController$P5D_Library_release().s(bundle);
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        return getController$P5D_Library_release().o();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        getController$P5D_Library_release().h(newConfig);
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    public View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f134916e = r1.d(inflater, viewGroup, false);
        getController$P5D_Library_release().r(this, bundle);
        r1 r1Var = this.f134916e;
        if (r1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r1Var = null;
        }
        ConstraintLayout root = r1Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        getController$P5D_Library_release().i();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        getController$P5D_Library_release().j();
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        getController$P5D_Library_release().p(outState);
    }

    public final void setController$P5D_Library_release(@NotNull com.planner5d.library.widget.editor.editor3d.t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.controller = tVar;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @Nullable
    protected com.planner5d.library.widget.menu.l t(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (getController$P5D_Library_release().n()) {
            return null;
        }
        return getController$P5D_Library_release().m(menu, inflater);
    }
}
