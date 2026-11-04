package com.planner5d.library.activity.helper;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.planner5d.library.activity.MainCardboard;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class b2 extends a<MainCardboard> implements androidx.lifecycle.o0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f136697w = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.widget.s1 f136698o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.j2 f136699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editor3dcardboard.p f136700t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.ui.c f136701v = new com.planner5d.library.activity.helper.ui.c(this);

    @ij.a
    public b2() {
    }

    @NotNull
    public final com.planner5d.library.model.manager.j2 N() {
        com.planner5d.library.model.manager.j2 j2Var = this.f136699s;
        if (j2Var != null) {
            return j2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.widget.s1 O() {
        com.planner5d.library.widget.s1 s1Var = this.f136698o;
        if (s1Var != null) {
            return s1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tutorialManager");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull MainCardboard activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.i(activity, bundle);
        this.f136700t = new com.planner5d.library.widget.editor.editor3dcardboard.p(activity, (ViewGroup) activity.findViewById(com.planner5d.library.f.j.H7));
        O().a(com.planner5d.library.services.r.cardboardShort.f224891a, activity);
    }

    public final void Q(@NotNull com.planner5d.library.model.manager.j2 j2Var) {
        Intrinsics.checkNotNullParameter(j2Var, "<set-?>");
        this.f136699s = j2Var;
    }

    public final void R(@NotNull com.planner5d.library.widget.s1 s1Var) {
        Intrinsics.checkNotNullParameter(s1Var, "<set-?>");
        this.f136698o = s1Var;
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    public void b() {
        super.b();
        this.f136701v.v(androidx.lifecycle.c0.b.DESTROYED);
        com.planner5d.library.widget.editor.editor3dcardboard.p pVar = this.f136700t;
        if (pVar != null) {
            pVar.p();
        }
        this.f136700t = null;
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    public void c(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.c(intent);
        N().f(intent);
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    public void d() {
        super.d();
        this.f136701v.v(androidx.lifecycle.c0.b.STARTED);
        com.planner5d.library.widget.editor.editor3dcardboard.p pVar = this.f136700t;
        if (pVar != null) {
            pVar.i();
        }
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void f(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void g() {
    }

    @Override // androidx.lifecycle.o0
    @NotNull
    public androidx.lifecycle.c0 getLifecycle() {
        return this.f136701v;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public boolean h(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return false;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void j() {
        com.planner5d.library.widget.editor.editor3dcardboard.p pVar = this.f136700t;
        if (pVar != null) {
            pVar.o();
        }
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void k() {
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    public void l() {
        super.l();
        com.planner5d.library.widget.editor.editor3dcardboard.p pVar = this.f136700t;
        if (pVar != null) {
            pVar.j();
        }
        this.f136701v.v(androidx.lifecycle.c0.b.RESUMED);
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public boolean onBackPressed() {
        return true;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        com.planner5d.library.widget.editor.editor3dcardboard.p pVar = this.f136700t;
        if (pVar != null) {
            pVar.h(newConfig);
        }
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void onRequestPermissionsResult(int i10, @NotNull String[] permissions, @NotNull int[] results) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(results, "results");
    }
}
