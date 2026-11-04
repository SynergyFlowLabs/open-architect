package com.planner5d.library.widget.editor.menu;

import android.view.Menu;
import android.view.MenuInflater;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.widget.editor.helper.f2;
import com.planner5d.library.widget.editor.helper.g1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nEditorMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorMenu.kt\ncom/planner5d/library/widget/editor/menu/EditorMenu\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f257083m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f257084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f257085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2 f257086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y1 f257087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f257088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f257089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.application.d f257090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final f1 f257091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f257092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.p0 f257093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final pa.b f257094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final y0 f257095l;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f257096a;

        static {
            int[] iArr = new int[com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.values().length];
            try {
                iArr[com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Spherical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.FirstPerson.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Isometric.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f257096a = iArr;
        }
    }

    @ij.a
    public j(@NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull b2 messageManager, @NotNull y1 menuManager, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull com.planner5d.library.application.d configuration, @NotNull f1 scope, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull com.planner5d.library.services.utility.p0 formatter, @NotNull pa.b exportToCadUseCase, @NotNull y0 imageManager) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(exportToCadUseCase, "exportToCadUseCase");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        this.f257084a = userAuthorization;
        this.f257085b = projectManager;
        this.f257086c = messageManager;
        this.f257087d = menuManager;
        this.f257088e = navigator;
        this.f257089f = dialogLauncher;
        this.f257090g = configuration;
        this.f257091h = scope;
        this.f257092i = featureConfigManager;
        this.f257093j = formatter;
        this.f257094k = exportToCadUseCase;
        this.f257095l = imageManager;
    }

    private final com.planner5d.library.widget.menu.l a(com.planner5d.library.widget.menu.l lVar, g1 g1Var, boolean z10) {
        com.planner5d.library.widget.menu.l lVarB = lVar.b(com.planner5d.library.f.j.C0).q((!this.f257092i.a(com.planner5d.library.model.manager.config.f.BernardEditor) || g1Var.z1() || g1Var.N1() || z10) ? false : true).b(new a0(g1Var));
        Intrinsics.checkNotNullExpressionValue(lVarB, "build(...)");
        return lVarB;
    }

    private final com.planner5d.library.widget.menu.l b(com.planner5d.library.widget.menu.l lVar, g1 g1Var, boolean z10) {
        com.planner5d.library.widget.menu.n nVarQ = lVar.b(com.planner5d.library.f.j.D0).j(com.planner5d.library.f.h.f167853w6).q((!this.f257092i.a(com.planner5d.library.model.manager.config.f.AiDesigner) || this.f257092i.a(com.planner5d.library.model.manager.config.f.BernardEditor) || g1Var.z1() || g1Var.N1() || z10) ? false : true);
        com.planner5d.library.widget.editor.facade.h hVarV1 = g1Var.v1();
        Intrinsics.checkNotNullExpressionValue(hVarV1, "getFacade(...)");
        com.planner5d.library.widget.editor.a aVarS1 = g1Var.s1();
        com.planner5d.library.widget.menu.l lVarB = nVarQ.b(new c(hVarV1, g1Var, g1Var, aVarS1 != null ? aVarS1.getSelectedItem() : null));
        Intrinsics.checkNotNullExpressionValue(lVarB, "build(...)");
        return lVarB;
    }

    private final com.planner5d.library.widget.menu.l c(com.planner5d.library.widget.menu.l lVar, g1 g1Var, boolean z10) {
        com.planner5d.library.widget.menu.l lVarB = lVar.b(com.planner5d.library.f.j.f168149j1).j(com.planner5d.library.f.h.f167590i8).q((!g1Var.N1() || z10 || l(g1Var)) ? false : true).b(new e(g1Var));
        Intrinsics.checkNotNullExpressionValue(lVarB, "build(...)");
        return lVarB;
    }

    private final com.planner5d.library.widget.menu.l d(com.planner5d.library.widget.menu.l lVar, g1 g1Var, boolean z10) {
        Project projectI1 = g1Var.I1();
        boolean z11 = false;
        com.planner5d.library.widget.menu.n nVarB = lVar.b(com.planner5d.library.f.j.f168005d1).q((z10 || l(g1Var)) ? false : true).j(com.planner5d.library.f.h.f167894y9).g(true).i(!z10).b(new com.planner5d.library.widget.menu.a0(lVar.a())).b(com.planner5d.library.f.j.M0).q((z10 || !g1Var.z1() || l(g1Var)) ? false : true).b(new f0(g1Var, this.f257085b, this.f257084a, this.f257086c, this.f257087d, this.f257088e, this.f257089f, this.f257093j)).b(com.planner5d.library.f.j.f168141ii).q(projectI1 != null && projectI1.h()).b(new l0(g1Var, this.f257084a, this.f257085b, this.f257091h, this.f257086c, this.f257095l)).b(com.planner5d.library.f.j.f168208lc).q((z10 || projectI1 == null || g1Var.N1() || !projectI1.h() || !this.f257092i.a(com.planner5d.library.model.manager.config.f.ProAndroid)) ? false : true).b(new j0(g1Var, this.f257091h, this.f257086c, this.f257094k, this.f257084a, this.f257088e)).b(com.planner5d.library.f.j.f168118hi);
        if (!g1Var.D1() && !g1Var.z1()) {
            z11 = true;
        }
        com.planner5d.library.widget.menu.l lVarB = nVarB.q(z11).b(new v(g1Var));
        Intrinsics.checkNotNullExpressionValue(lVarB, "build(...)");
        return lVarB;
    }

    private final com.planner5d.library.widget.menu.l e(com.planner5d.library.widget.menu.l lVar, g1 g1Var, boolean z10) {
        com.planner5d.library.widget.menu.l lVarB = lVar.b(com.planner5d.library.f.j.f168101h1).j(k(g1Var)).q((!g1Var.D1() || g1Var.N1() || z10) ? false : true).g(true).b(new com.planner5d.library.widget.menu.a0(lVar.a())).b(com.planner5d.library.f.j.Mk).h(j(g1Var) == com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Spherical).b(new com.planner5d.library.widget.menu.f(g1Var)).b(com.planner5d.library.f.j.Kk).h(j(g1Var) == com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.FirstPerson).b(new com.planner5d.library.widget.menu.d(g1Var)).b(com.planner5d.library.f.j.Lk).h(j(g1Var) == com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Isometric).b(new com.planner5d.library.widget.menu.e(g1Var));
        Intrinsics.checkNotNullExpressionValue(lVarB, "build(...)");
        return lVarB;
    }

    private final com.planner5d.library.widget.menu.l f(com.planner5d.library.widget.menu.l lVar, g1 g1Var, boolean z10) {
        com.planner5d.library.widget.menu.l lVarB = lVar.b(com.planner5d.library.f.j.f168293p1).j(com.planner5d.library.f.h.f167515eb).q((g1Var.z1() || l(g1Var) || z10) ? false : true).b(new d0(g1Var));
        Intrinsics.checkNotNullExpressionValue(lVarB, "build(...)");
        return lVarB;
    }

    private final com.planner5d.library.widget.menu.l g(com.planner5d.library.widget.menu.l lVar, g1 g1Var, boolean z10) {
        com.planner5d.library.widget.menu.l lVarB = lVar.b(com.planner5d.library.f.j.f168366s1).j(com.planner5d.library.f.h.O6).q((g1Var.z1() || g1Var.N1() || !g1Var.Q1() || z10) ? false : true).b(new q0(g1Var));
        Intrinsics.checkNotNullExpressionValue(lVarB, "build(...)");
        return lVarB;
    }

    private final com.planner5d.library.widget.menu.l h(com.planner5d.library.widget.menu.l lVar, g1 g1Var, boolean z10, f2 f2Var) {
        androidx.fragment.app.s activity;
        com.planner5d.library.widget.menu.n nVarB = lVar.b(com.planner5d.library.f.j.f168166ji);
        boolean z11 = false;
        if (!g1Var.N1() && !z10 && this.f257090g.s()) {
            Fragment fragmentI = g1Var.i();
            if ((fragmentI == null || (activity = fragmentI.getActivity()) == null) ? false : h3.N(activity)) {
                z11 = true;
            }
        }
        com.planner5d.library.widget.menu.l lVarB = nVarB.q(z11).b(new d(f2Var, true));
        Intrinsics.checkNotNullExpressionValue(lVarB, "build(...)");
        return lVarB;
    }

    private final com.planner5d.library.widget.menu.l i(com.planner5d.library.widget.menu.l lVar, com.planner5d.library.widget.editor.facade.f fVar, boolean z10, f2 f2Var) {
        com.planner5d.library.widget.menu.l lVarB = lVar.b(com.planner5d.library.f.j.f168438v1).j(fVar.D1() ? com.planner5d.library.f.h.f167644l6 : com.planner5d.library.f.h.f167682n6).i(!z10).q(!l(fVar)).b(new d(f2Var, false));
        Intrinsics.checkNotNullExpressionValue(lVarB, "build(...)");
        return lVarB;
    }

    private final com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a j(com.planner5d.library.widget.editor.facade.f fVar) {
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = fVar.G1();
        return bVarG1 == null ? com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Spherical : bVarG1.f258085p;
    }

    private final int k(com.planner5d.library.widget.editor.facade.f fVar) {
        com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a aVarJ = j(fVar);
        int i10 = aVarJ == null ? -1 : a.f257096a[aVarJ.ordinal()];
        if (i10 == 1) {
            return com.planner5d.library.f.h.X9;
        }
        if (i10 != 2) {
            return i10 != 3 ? com.planner5d.library.f.h.X9 : com.planner5d.library.f.h.Y9;
        }
        return com.planner5d.library.f.h.W9;
    }

    private final boolean l(com.planner5d.library.widget.editor.facade.f fVar) {
        if (!fVar.D1()) {
            return false;
        }
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = fVar.G1();
        return (bVarG1 != null ? bVarG1.f258084o : null) == com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b.preview;
    }

    @NotNull
    public final com.planner5d.library.widget.menu.l m(@NotNull Menu menu, @NotNull MenuInflater inflater, @NotNull g1 helper, boolean z10, @NotNull f2 helperEditorModeChange) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(helperEditorModeChange, "helperEditorModeChange");
        return a(c(d(f(g(h(e(b(i(new com.planner5d.library.widget.menu.l(inflater, menu, com.planner5d.library.f.n.f168919l, new com.planner5d.library.widget.menu.q()), helper, z10, helperEditorModeChange), helper, z10), helper, z10), helper, z10, helperEditorModeChange), helper, z10), helper, z10), helper, z10), helper, z10), helper, z10);
    }
}
