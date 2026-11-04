package com.planner5d.library.activity.fragment.snapshots;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.dialog.titleedit.FolderEdit;
import com.planner5d.library.activity.fragment.list.MainList;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.u2;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.widget.EnhancedRecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshots.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshots.kt\ncom/planner5d/library/activity/fragment/snapshots/Snapshots\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n67#2,4:182\n37#2,2:186\n55#2:188\n72#2:189\n1#3:190\n*S KotlinDebug\n*F\n+ 1 Snapshots.kt\ncom/planner5d/library/activity/fragment/snapshots/Snapshots\n*L\n145#1:182,4\n145#1:186,2\n145#1:188\n145#1:189\n*E\n"})
public final class Snapshots extends MainList<c1> implements com.planner5d.library.widget.c0 {
    public static final int $stable = 8;

    @ij.a
    public com.planner5d.library.activity.fragment.list.d0 actionsObserve;

    @ij.a
    public c1 contentViewModel;

    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k dialogLauncher;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private PopupWindow f135909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f135910m;

    @ij.a
    public y1 menuManager;

    @ij.a
    public n0 snapshotStatusViewModel;

    static final class a implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f135911a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f135911a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f135911a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f135911a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.lifecycle.d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Snapshots.kt\ncom/planner5d/library/activity/fragment/snapshots/Snapshots\n*L\n1#1,52:1\n70#2:53\n146#3,5:54\n*E\n"})
    public static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f135912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Snapshots f135913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c1.a f135914c;

        public b(int i10, Snapshots snapshots, c1.a aVar) {
            this.f135912a = i10;
            this.f135913b = snapshots;
            this.f135914c = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            if (this.f135912a != this.f135913b.f135910m) {
                return;
            }
            this.f135913b.l1(this.f135914c.a());
        }
    }

    public Snapshots() {
        com.planner5d.library.application.b.f142455c.a().N(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a1(Snapshots snapshots, Activity activity, MenuItem menuItem) {
        Long id2;
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "<unused var>");
        FolderEdit.a aVar = FolderEdit.Companion;
        com.planner5d.library.activity.fragment.dialog.k dialogLauncher$P5D_Library_release = snapshots.getDialogLauncher$P5D_Library_release();
        int i10 = Folder.f180530c;
        Folder folder = (Folder) snapshots.w0().X0().b();
        aVar.a(dialogLauncher$P5D_Library_release, i10, (folder == null || (id2 = folder.getId()) == null) ? 0L : id2.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b1(Snapshots snapshots, Activity activity, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "<unused var>");
        snapshots.w0().J1();
    }

    private final void c1() {
        PopupWindow popupWindow = this.f135909l;
        if (popupWindow != null) {
            popupWindow.setOnDismissListener(null);
            popupWindow.dismiss();
            this.f135909l = null;
        }
    }

    private final View d1(int i10) {
        View viewO;
        RecyclerView.p layoutManager = r0().f158952e.getLayoutManager();
        if (layoutManager == null || (viewO = layoutManager.O(i10)) == null) {
            return null;
        }
        return viewO.findViewById(com.planner5d.library.f.j.Rd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e1(Snapshots snapshots, com.planner5d.library.services.utility.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.c(com.planner5d.library.services.r.appearanceMode, snapshots.w0().S0().f());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f1(Snapshots snapshots, Integer num) {
        snapshots.J0(false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g1(Snapshots snapshots, l1.k kVar) {
        androidx.fragment.app.s activity = snapshots.getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h1(List list) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1.a i1(c1.a aVar, List list) {
        if (aVar == null || list == null) {
            return null;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(Snapshots snapshots, c1.a aVar) {
        if (aVar != null) {
            snapshots.k1(aVar);
        }
    }

    private final void k1(c1.a aVar) {
        c1();
        r0().f158952e.d2(new u2(aVar.a(), 0, 0, 6, null));
        if (!aVar.b()) {
            getContentViewModel().i0();
            return;
        }
        int i10 = this.f135910m + 1;
        this.f135910m = i10;
        EnhancedRecyclerView list = r0().f158952e;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        if (!list.isLaidOut() || list.isLayoutRequested()) {
            list.addOnLayoutChangeListener(new b(i10, this, aVar));
        } else {
            if (i10 != this.f135910m) {
                return;
            }
            l1(aVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l1(int i10) {
        View viewD1 = d1(i10);
        if (viewD1 != null) {
            te.l0 l0VarC = te.l0.c(getLayoutInflater());
            l0VarC.f380955b.setPointerPosition(com.planner5d.library.widget.tooltip.a.TOP);
            l0VarC.f380956c.setText(com.planner5d.library.f.s.jt);
            Intrinsics.checkNotNullExpressionValue(l0VarC, "apply(...)");
            FrameLayout root = l0VarC.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            int i11 = -((int) Math.rint(l0VarC.f380955b.getPointerHeight()));
            androidx.fragment.app.s activity = getActivity();
            int i12 = (4 >> 0) ^ 0;
            this.f135909l = y3.H(root, viewD1, 81, 0, i11, false, false, false, activity != null ? activity.getWindow() : null, new PopupWindow.OnDismissListener() { // from class: com.planner5d.library.activity.fragment.snapshots.s0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    Snapshots.m1(this.f136093a);
                }
            }, 232, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m1(Snapshots snapshots) {
        snapshots.getContentViewModel().n0();
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList
    protected void P0(boolean z10, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        super.P0(z10, Integer.valueOf(com.planner5d.library.f.h.f167901yg), Integer.valueOf(com.planner5d.library.f.h.Af), Integer.valueOf(com.planner5d.library.f.s.ns), Integer.valueOf(com.planner5d.library.f.s.LF));
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

    @NotNull
    public final n0 getSnapshotStatusViewModel$P5D_Library_release() {
        n0 n0Var = this.snapshotStatusViewModel;
        if (n0Var != null) {
            return n0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("snapshotStatusViewModel");
        return null;
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
        aVarF.k(new Function1() { // from class: com.planner5d.library.activity.fragment.snapshots.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Snapshots.e1(this.f136082a, (com.planner5d.library.services.utility.i) obj);
            }
        });
        return false;
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList, com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.planner5d.library.services.m0.f224431d.k(this, new a(new Function1() { // from class: com.planner5d.library.activity.fragment.snapshots.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Snapshots.f1(this.f136095a, (Integer) obj);
            }
        }));
        getActionsObserve$P5D_Library_release().a(w0().Q0(), this);
        w0().j1().k(this, new a(new Function1() { // from class: com.planner5d.library.activity.fragment.snapshots.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Snapshots.g1(this.f136096a, (l1.k) obj);
            }
        }));
        getSnapshotStatusViewModel$P5D_Library_release().b0().k(this, new a(new Function1() { // from class: com.planner5d.library.activity.fragment.snapshots.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Snapshots.h1((List) obj);
            }
        }));
        c1 contentViewModel = getContentViewModel();
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.targetSnapshotUid;
        contentViewModel.t0(com.planner5d.library.services.utility.j.u(jVar, rVar, null, 2, null));
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.remove(rVar.f224891a);
        }
        v1 v1Var = v1.f229769a;
        androidx.lifecycle.w0 w0VarG = v1Var.g(getContentViewModel().k0(), w0().b1(), new Function2() { // from class: com.planner5d.library.activity.fragment.snapshots.w0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Snapshots.i1((c1.a) obj, (List) obj2);
            }
        });
        androidx.lifecycle.o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        v1Var.t(w0VarG, viewLifecycleOwner, new androidx.lifecycle.d1() { // from class: com.planner5d.library.activity.fragment.snapshots.x0
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                Snapshots.j1(this.f136102a, (c1.a) obj);
            }
        });
        return super.onCreateViewExtended(inflater, viewGroup, bundle);
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        c1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(@NotNull Menu menu) {
        l1.i iVarF;
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(com.planner5d.library.f.j.f168053f1);
        if (menuItemFindItem != null && (iVarF = w0().d1().f()) != null && iVarF.e()) {
            menuItemFindItem.setVisible(w0().X0().b() != null || getContentViewModel().l(iVarF.f()));
        }
    }

    public final void setActionsObserve$P5D_Library_release(@NotNull com.planner5d.library.activity.fragment.list.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
        this.actionsObserve = d0Var;
    }

    public void setContentViewModel(@NotNull c1 c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "<set-?>");
        this.contentViewModel = c1Var;
    }

    public final void setDialogLauncher$P5D_Library_release(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setMenuManager$P5D_Library_release(@NotNull y1 y1Var) {
        Intrinsics.checkNotNullParameter(y1Var, "<set-?>");
        this.menuManager = y1Var;
    }

    public final void setSnapshotStatusViewModel$P5D_Library_release(@NotNull n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "<set-?>");
        this.snapshotStatusViewModel = n0Var;
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList, com.planner5d.library.activity.fragment.FragmentController
    @Nullable
    protected com.planner5d.library.widget.menu.l t(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        l1.f fVarF;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        l1.i iVarF = w0().d1().f();
        if ((iVarF == null || !iVarF.e()) && ((fVarF = w0().c1().f()) == null || !fVarF.f())) {
            com.planner5d.library.activity.helper.ui.d dVarF = com.planner5d.library.activity.helper.ui.d.f137133w.f();
            int i10 = dVarF != null ? dVarF.f137145l : -16777216;
            com.planner5d.library.widget.menu.n nVarL = new com.planner5d.library.widget.menu.l(inflater, menu, com.planner5d.library.f.n.f168913f, null, 8, null).b(com.planner5d.library.f.j.f168077g1).l(com.planner5d.library.f.h.H8, Integer.valueOf(i10), Integer.valueOf(requireActivity().getColor(com.planner5d.library.f.C1549f.Hh)));
            l1.k kVarF = w0().j1().f();
            return nVarL.i((kVarF == null || kVarF.g()) ? false : true).b(new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.snapshots.q0
                @Override // com.planner5d.library.widget.menu.p
                public final void a(Activity activity, MenuItem menuItem) {
                    Snapshots.a1(this.f136085a, activity, menuItem);
                }
            }).b(com.planner5d.library.f.j.V0).k(com.planner5d.library.f.h.W8, Integer.valueOf(i10)).q(w0().m1()).b(new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.snapshots.r0
                @Override // com.planner5d.library.widget.menu.p
                public final void a(Activity activity, MenuItem menuItem) {
                    Snapshots.b1(this.f136088a, activity, menuItem);
                }
            });
        }
        return super.t(menu, inflater);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.planner5d.library.activity.fragment.list.MainList, com.planner5d.library.activity.fragment.FragmentController
    protected void v(@Nullable Bundle bundle) {
        super.v(bundle);
        c1 contentViewModel = getContentViewModel();
        l1.d<com.planner5d.library.database.model.j> dVarX0 = w0().X0();
        Intrinsics.checkNotNull(dVarX0, "null cannot be cast to non-null type com.planner5d.library.activity.fragment.list.MainListViewModel.Filter<com.planner5d.library.model.Folder>");
        contentViewModel.q0(dVarX0);
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList
    @NotNull
    public c1 getContentViewModel() {
        c1 c1Var = this.contentViewModel;
        if (c1Var != null) {
            return c1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contentViewModel");
        return null;
    }
}
