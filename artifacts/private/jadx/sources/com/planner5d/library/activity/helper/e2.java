package com.planner5d.library.activity.helper;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.FragmentManager;
import com.planner5d.library.activity.Main;
import com.planner5d.library.activity.fragment.intenthandler.IntentHandlerDialog;
import com.planner5d.library.databinding.y2;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.widget.BottomNavigationView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class e2 extends a<Main> {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f136772i3 = 8;

    @ij.a
    public sd.k H1;

    @ij.a
    public t0 X;

    @ij.a
    public com.planner5d.library.activity.helper.imagechooser.j Y;

    @ij.a
    public r Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.appupdate.h f136773g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private Bundle f136774h3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @ij.a
    public f0 f136775o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.activity.fragment.x f136776p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.j2 f136777p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @ij.a
    public r3 f136778p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @ij.a
    public m1 f136779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.widget.rate.g f136780t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @ij.a
    public l0 f136781v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @ij.a
    public b0 f136782w;

    @ij.a
    public e2() {
    }

    private final void N() {
        y2 y2VarI;
        BottomNavigationView bottomNavigationView;
        Menu menu;
        Main mainN = n();
        if (mainN == null || (y2VarI = mainN.I()) == null || (bottomNavigationView = y2VarI.f159946b) == null || (menu = bottomNavigationView.getMenu()) == null) {
            return;
        }
        com.planner5d.library.model.manager.config.j jVarP = p();
        com.planner5d.library.model.manager.config.f fVar = com.planner5d.library.model.manager.config.f.Spaces;
        if (!jVarP.a(fVar)) {
            menu.removeItem(com.planner5d.library.f.j.M9);
            menu.removeItem(com.planner5d.library.f.j.Fa);
        }
        if (!p().a(com.planner5d.library.model.manager.config.f.Gallery) || p().a(fVar)) {
            menu.removeItem(com.planner5d.library.f.j.Zc);
        }
        if (!p().a(com.planner5d.library.model.manager.config.f.Contests)) {
            menu.removeItem(com.planner5d.library.f.j.f167939aa);
        }
        if (!p().a(com.planner5d.library.model.manager.config.f.FeedHome) || p().a(fVar)) {
            menu.removeItem(com.planner5d.library.f.j.f168426ud);
        }
        if (p().a(fVar)) {
            menu.removeItem(com.planner5d.library.f.j.Zl);
            MenuItem menuItemFindItem = menu.findItem(com.planner5d.library.f.j.f167939aa);
            Main mainN2 = n();
            menuItemFindItem.setTitle(mainN2 != null ? mainN2.getString(com.planner5d.library.f.s.eD) : null);
            MenuItem menuItemFindItem2 = menu.findItem(com.planner5d.library.f.j.no);
            Main mainN3 = n();
            menuItemFindItem2.setTitle(mainN3 != null ? mainN3.getString(com.planner5d.library.f.s.gD) : null);
        }
    }

    @NotNull
    public final r O() {
        r rVar = this.Z;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fileHelper");
        return null;
    }

    @NotNull
    public final sd.k P() {
        sd.k kVar = this.H1;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firebaseInAppMessagingCallbacks");
        return null;
    }

    @NotNull
    public final b0 Q() {
        b0 b0Var = this.f136782w;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperExportToFile");
        return null;
    }

    @NotNull
    public final f0 R() {
        f0 f0Var = this.f136775o;
        if (f0Var != null) {
            return f0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperFragment");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.helper.imagechooser.j S() {
        com.planner5d.library.activity.helper.imagechooser.j jVar = this.Y;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperImageChooser");
        return null;
    }

    @NotNull
    public final l0 T() {
        l0 l0Var = this.f136781v;
        if (l0Var != null) {
            return l0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperPayment");
        return null;
    }

    @NotNull
    public final t0 U() {
        t0 t0Var = this.X;
        if (t0Var != null) {
            return t0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperPermissions");
        return null;
    }

    @NotNull
    public final m1 V() {
        m1 m1Var = this.f136779s;
        if (m1Var != null) {
            return m1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperUI");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.appupdate.h W() {
        com.planner5d.library.model.manager.appupdate.h hVar = this.f136773g3;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inAppUpdateManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.x X() {
        com.planner5d.library.activity.fragment.x xVar = this.f136776p0;
        if (xVar != null) {
            return xVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.j2 Y() {
        com.planner5d.library.model.manager.j2 j2Var = this.f136777p1;
        if (j2Var != null) {
            return j2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.widget.rate.g Z() {
        com.planner5d.library.widget.rate.g gVar = this.f136780t;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rateManager");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    public void a() {
        super.a();
        W().G();
    }

    @NotNull
    public final r3 a0() {
        r3 r3Var = this.f136778p2;
        if (r3Var != null) {
            return r3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statisticsEventGeneric");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    public void b() {
        super.b();
        R().m();
        V().e();
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void i(@NotNull Main activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.i(activity, bundle);
        this.f136774h3 = bundle;
        N();
        R().l(activity, V().d(activity, bundle));
        Z().h(activity, p().a(com.planner5d.library.model.manager.config.f.RateUs));
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    public void c(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.c(intent);
        Y().f(intent);
        Main mainN = n();
        FragmentManager supportFragmentManager = mainN != null ? mainN.getSupportFragmentManager() : null;
        if (!com.planner5d.library.model.manager.i.f191511e.a(intent) || supportFragmentManager == null || supportFragmentManager.a1()) {
            return;
        }
        IntentHandlerDialog.Companion.a(supportFragmentManager, intent);
    }

    public final void c0(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.Z = rVar;
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    public void d() {
        super.d();
        T().x();
        V().q();
        R().p();
        Q().r();
        U().j();
        S().C();
        O().E();
        P().e();
    }

    public final void d0(@NotNull sd.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.H1 = kVar;
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    public void e(int i10, int i11, @Nullable Intent intent) {
        super.e(i10, i11, intent);
        Q().q(i10, i11, intent);
        S().z(i10, i11, intent);
        O().A(i10, i11, intent);
    }

    public final void e0(@NotNull b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.f136782w = b0Var;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void f(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        V().p(outState);
        R().n(outState);
    }

    public final void f0(@NotNull f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<set-?>");
        this.f136775o = f0Var;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void g() {
        V().l(R().e());
    }

    public final void g0(@NotNull com.planner5d.library.activity.helper.imagechooser.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.Y = jVar;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public boolean h(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return false;
    }

    public final void h0(@NotNull l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<set-?>");
        this.f136781v = l0Var;
    }

    public final void i0(@NotNull t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<set-?>");
        this.X = t0Var;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void j() {
    }

    public final void j0(@NotNull m1 m1Var) {
        Intrinsics.checkNotNullParameter(m1Var, "<set-?>");
        this.f136779s = m1Var;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void k() {
        V().o();
    }

    public final void k0(@NotNull com.planner5d.library.model.manager.appupdate.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.f136773g3 = hVar;
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    public void l() {
        Intent intent;
        super.l();
        V().s();
        R().s();
        T().C(n());
        Q().s(n());
        U().n(n());
        S().H(n());
        O().J(n());
        Main mainN = n();
        if (mainN != null && (intent = mainN.getIntent()) != null) {
            Y().f(intent);
        }
        P().n();
        W().F();
    }

    public final void l0(@NotNull com.planner5d.library.activity.fragment.x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.f136776p0 = xVar;
    }

    @Override // com.planner5d.library.activity.helper.a, com.planner5d.library.model.manager.initialization.a
    public void m() {
        super.m();
        R().o(this.f136774h3);
        this.f136774h3 = null;
        a0().s0();
    }

    public final void m0(@NotNull com.planner5d.library.model.manager.j2 j2Var) {
        Intrinsics.checkNotNullParameter(j2Var, "<set-?>");
        this.f136777p1 = j2Var;
    }

    public final void n0(@NotNull com.planner5d.library.widget.rate.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f136780t = gVar;
    }

    public final void o0(@NotNull r3 r3Var) {
        Intrinsics.checkNotNullParameter(r3Var, "<set-?>");
        this.f136778p2 = r3Var;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public boolean onBackPressed() {
        return (R().k() || V().m()) ? false : true;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        V().n();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void onRequestPermissionsResult(int i10, @NotNull String[] permissions, @NotNull int[] results) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(results, "results");
        U().i(i10, permissions, results);
    }
}
