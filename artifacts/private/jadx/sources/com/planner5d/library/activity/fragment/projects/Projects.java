package com.planner5d.library.activity.fragment.projects;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import com.planner5d.library.activity.fragment.CheckableBottomSheetMenuFragment;
import com.planner5d.library.activity.fragment.dialog.titleedit.FolderEdit;
import com.planner5d.library.activity.fragment.list.MainList;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.t3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Projects.kt\ncom/planner5d/library/activity/fragment/projects/Projects\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 BundleParser.kt\ncom/planner5d/library/services/utility/BundleParser\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n12#2,6:164\n28#2:170\n58#3,17:171\n1557#4:188\n1628#4,3:189\n37#5,2:192\n1#6:194\n*S KotlinDebug\n*F\n+ 1 Projects.kt\ncom/planner5d/library/activity/fragment/projects/Projects\n*L\n49#1:164,6\n49#1:170\n71#1:171,17\n153#1:188\n153#1:189,3\n153#1:192,2\n*E\n"})
public final class Projects extends MainList<w0> implements com.planner5d.library.widget.c0 {
    public static final int $stable = 8;

    @ij.a
    public com.planner5d.library.activity.fragment.list.d0 actionsObserve;

    @ij.a
    public com.planner5d.library.model.manager.config.d configManager;

    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k dialogLauncher;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f134917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f134918m;

    @ij.a
    public y1 menuManager;

    static final class a implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134919a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134919a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f134919a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134919a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public Projects() {
        t3 t3Var = t3.f229751a;
        this.f134917l = new i2(j1.d(w0.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f134918m = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.projects.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Projects.b1(this.f134930a);
            }
        });
        com.planner5d.library.application.b.f142455c.a().t2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w0 b1(Projects projects) {
        return projects.e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c1(Projects projects, Activity activity, MenuItem menuItem) {
        Long id2;
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "<unused var>");
        FolderEdit.a aVar = FolderEdit.Companion;
        com.planner5d.library.activity.fragment.dialog.k dialogLauncher$P5D_Library_release = projects.getDialogLauncher$P5D_Library_release();
        int i10 = Folder.f180529b;
        Folder folder = (Folder) projects.w0().X0().b();
        aVar.a(dialogLauncher$P5D_Library_release, i10, (folder == null || (id2 = folder.getId()) == null) ? 0L : id2.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d1(Projects projects, Activity activity, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "<unused var>");
        projects.w0().J1();
    }

    private final w0 e1() {
        return (w0) this.f134917l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f1(Projects projects, com.planner5d.library.services.utility.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.c(com.planner5d.library.services.r.appearanceMode, projects.w0().S0().f());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g1(Projects projects, Integer num) {
        projects.J0(false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h1(Projects projects, Integer num) {
        projects.e1().m0(projects.w0().Q0(), (Folder) projects.w0().X0().b(), l1.N0(projects.w0(), false, 1, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i1(Projects projects, l1.k kVar) {
        androidx.fragment.app.s activity = projects.getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
        boolean zG = kVar.g();
        Integer numH = kVar.h();
        com.planner5d.library.activity.helper.ui.d.f(projects, new com.planner5d.library.activity.helper.ui.b(zG, numH != null ? new k3(numH.intValue(), new Object[0]) : null, false));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(Projects projects, Object obj) {
        projects.l1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k1(Projects projects, Boolean bool) {
        if (bool.booleanValue()) {
            projects.J0(false);
        }
        return Unit.f312394a;
    }

    private final void l1() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        String string = getString(com.planner5d.library.f.s.TC);
        List<l1.j> listK = new l1.h().k();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listK, 10));
        for (l1.j jVar : listK) {
            arrayList.add(new ue.b(Integer.valueOf(jVar.p()), getString(jVar.p())));
        }
        CheckableBottomSheetMenuFragment checkableBottomSheetMenuFragment = new CheckableBottomSheetMenuFragment(childFragmentManager, string, (ue.b[]) arrayList.toArray(new ue.b[0]), w0().h1().p(), new Function1() { // from class: com.planner5d.library.activity.fragment.projects.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Projects.m1(this.f134928a, (ue.b) obj);
            }
        });
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        com.planner5d.library.widget.menu.o.a.a(checkableBottomSheetMenuFragment, childFragmentManager2, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m1(Projects projects, ue.b selectedMenu) {
        Intrinsics.checkNotNullParameter(selectedMenu, "selectedMenu");
        l1.j.a aVar = l1.j.f134319b;
        Object first = ((Pair) selectedMenu).first;
        Intrinsics.checkNotNullExpressionValue(first, "first");
        projects.Z(aVar.a(((Number) first).intValue()));
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList
    protected void P0(boolean z10, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        super.P0(false, null, null, null, null);
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.list.d0 getActionsObserve$P5D_Library_release() {
        com.planner5d.library.activity.fragment.list.d0 d0Var = this.actionsObserve;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("actionsObserve");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.config.d getConfigManager$P5D_Library_release() {
        com.planner5d.library.model.manager.config.d dVar = this.configManager;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k getDialogLauncher$P5D_Library_release() {
        com.planner5d.library.activity.fragment.dialog.k kVar = this.dialogLauncher;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final y1 getMenuManager$P5D_Library_release() {
        y1 y1Var = this.menuManager;
        if (y1Var != null) {
            return y1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuManager");
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList, com.planner5d.library.activity.fragment.FragmentController
    protected void onActivityCreatedExtended(@Nullable Bundle bundle) {
        Parcelable parcelable;
        super.onActivityCreatedExtended(bundle);
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        boolean z10 = false;
        if (jVar.f(com.planner5d.library.services.r.createProject, false)) {
            e1().d0(w0().Q0(), jVar.d(com.planner5d.library.services.r.folder, 0L), l1.N0(w0(), false, 1, null), getArguments());
        }
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.importProjectIntent;
        try {
            parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) jVar.g().getParcelable(rVar.f224891a, Intent.class) : jVar.g().getParcelable(rVar.f224891a);
            if (parcelable == null || !(parcelable instanceof Intent)) {
                parcelable = null;
            }
        } catch (ClassCastException unused) {
        }
        if (parcelable == null) {
            parcelable = null;
        }
        w0 w0VarE1 = e1();
        androidx.fragment.app.s sVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        w0VarE1.n0(sVarRequireActivity, (Intent) parcelable, w0().Q0(), (Folder) w0().X0().b(), l1.N0(w0(), false, 1, null));
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList, com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        if (super.onBackPressed()) {
            return true;
        }
        com.planner5d.library.activity.helper.event.content.a aVarF = getMenuManager$P5D_Library_release().f();
        if (aVarF == null) {
            return false;
        }
        aVarF.k(new Function1() { // from class: com.planner5d.library.activity.fragment.projects.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Projects.f1(this.f135101a, (com.planner5d.library.services.utility.i) obj);
            }
        });
        return false;
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList, com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.planner5d.library.services.m0.f224430c.k(this, new a(new Function1() { // from class: com.planner5d.library.activity.fragment.projects.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Projects.g1(this.f135103a, (Integer) obj);
            }
        }));
        com.planner5d.library.services.m0.f224433f.k(this, new a(new Function1() { // from class: com.planner5d.library.activity.fragment.projects.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Projects.h1(this.f135105a, (Integer) obj);
            }
        }));
        getActionsObserve$P5D_Library_release().a(w0().Q0(), this);
        w0().j1().k(this, new a(new Function1() { // from class: com.planner5d.library.activity.fragment.projects.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Projects.i1(this.f135146a, (l1.k) obj);
            }
        }));
        w0().f1().k(this, new d1() { // from class: com.planner5d.library.activity.fragment.projects.y
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                Projects.j1(this.f135167a, obj);
            }
        });
        getContentViewModel().E0().k(this, new a(new Function1() { // from class: com.planner5d.library.activity.fragment.projects.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Projects.k1(this.f135172a, (Boolean) obj);
            }
        }));
        return super.onCreateViewExtended(inflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(@NotNull Menu menu) {
        l1.i iVarF;
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(com.planner5d.library.f.j.f168053f1);
        if (menuItemFindItem == null || (iVarF = w0().d1().f()) == null || !iVarF.e()) {
            return;
        }
        menuItemFindItem.setVisible(w0().X0().b() != null || getContentViewModel().l(iVarF.f()));
    }

    public final void setActionsObserve$P5D_Library_release(@NotNull com.planner5d.library.activity.fragment.list.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
        this.actionsObserve = d0Var;
    }

    public final void setConfigManager$P5D_Library_release(@NotNull com.planner5d.library.model.manager.config.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.configManager = dVar;
    }

    public final void setDialogLauncher$P5D_Library_release(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setMenuManager$P5D_Library_release(@NotNull y1 y1Var) {
        Intrinsics.checkNotNullParameter(y1Var, "<set-?>");
        this.menuManager = y1Var;
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList, com.planner5d.library.activity.fragment.FragmentController
    @Nullable
    protected com.planner5d.library.widget.menu.l t(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        l1.f fVarF;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        l1.i iVarF = w0().d1().f();
        if ((iVarF != null && iVarF.e()) || ((fVarF = w0().c1().f()) != null && fVarF.f())) {
            return super.t(menu, inflater);
        }
        com.planner5d.library.activity.helper.ui.d dVarF = com.planner5d.library.activity.helper.ui.d.f137133w.f();
        int i10 = dVarF != null ? dVarF.f137145l : -16777216;
        com.planner5d.library.widget.menu.n nVarL = new com.planner5d.library.widget.menu.l(inflater, menu, com.planner5d.library.f.n.f168913f, null, 8, null).b(com.planner5d.library.f.j.f168077g1).l(com.planner5d.library.f.h.H8, Integer.valueOf(i10), Integer.valueOf(requireActivity().getColor(com.planner5d.library.f.C1549f.Hh)));
        l1.k kVarF = w0().j1().f();
        return nVarL.i((kVarF == null || kVarF.g()) ? false : true).b(new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.projects.s
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                Projects.c1(this.f135093a, activity, menuItem);
            }
        }).b(com.planner5d.library.f.j.V0).k(com.planner5d.library.f.h.W8, Integer.valueOf(i10)).q(w0().m1()).b(new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.projects.t
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                Projects.d1(this.f135097a, activity, menuItem);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.planner5d.library.activity.fragment.list.MainList, com.planner5d.library.activity.fragment.FragmentController
    protected void v(@Nullable Bundle bundle) {
        super.v(bundle);
        if (bundle == null) {
            w0 w0VarE1 = e1();
            Bundle arguments = getArguments();
            l1.d<com.planner5d.library.database.model.j> dVarX0 = w0().X0();
            Intrinsics.checkNotNull(dVarX0, "null cannot be cast to non-null type com.planner5d.library.activity.fragment.list.MainListViewModel.Filter<com.planner5d.library.model.Folder>");
            w0VarE1.N0(arguments, dVarX0);
        }
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void w(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        r0().f158952e.setHasTopRows(1);
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList
    @NotNull
    public w0 getContentViewModel() {
        return (w0) this.f134918m.getValue();
    }
}
