package com.planner5d.library.activity.fragment.list;

import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.planner5d.library.activity.fragment.ActionsBottomSheetMenuFragment;
import com.planner5d.library.activity.fragment.ActionsBottomSheetMenuRedesignFragment;
import com.planner5d.library.activity.fragment.spaces.view.DocumentOptionsBottomSheet;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.services.utility.c3;
import com.planner5d.library.services.utility.h3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f134430c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f134431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final FragmentManager f134432b;

    public t0(@NotNull Context context, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f134431a = context;
        this.f134432b = fragmentManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(Function2 function2, gd.b bVar, Activity activity, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        function2.invoke(bVar, menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Function2 function2, gd.b bVar, MenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(bVar, it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(Function1 function1, Activity activity, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        function1.invoke(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function2 function2, com.planner5d.library.database.model.spaces.documents.a aVar, MenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(aVar, it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Function2 function2, com.planner5d.library.database.model.spaces.documents.a aVar, Activity activity, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        function2.invoke(aVar, menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Function2 function2, com.planner5d.library.database.model.j jVar, Activity activity, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        function2.invoke(jVar, menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function2 function2, com.planner5d.library.database.model.j jVar, MenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(jVar, it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Function2 function2, com.planner5d.library.database.model.j jVar, Activity activity, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        function2.invoke(jVar, menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function2 function2, com.planner5d.library.database.model.j jVar, MenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(jVar, it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Function2 function2, Project project, Activity activity, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        function2.invoke(project, menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Function2 function2, Project project, MenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(project, it);
        return Unit.f312394a;
    }

    @NotNull
    public final com.planner5d.library.widget.menu.o l(@NotNull View anchorView, boolean z10, @NotNull final Function1<? super MenuItem, Unit> onMenuItemClickListener) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(onMenuItemClickListener, "onMenuItemClickListener");
        com.planner5d.library.widget.menu.s sVar = new com.planner5d.library.widget.menu.s(this.f134431a, anchorView, com.planner5d.library.f.n.f168915h, com.planner5d.library.f.C1549f.f166826yi, new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.list.j0
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                t0.m(onMenuItemClickListener, activity, menuItem);
            }
        });
        if (!z10) {
            sVar.getMenu().removeItem(com.planner5d.library.f.j.P0);
        }
        FragmentManager fragmentManager = this.f134432b;
        c3 c3Var = c3.f225174a;
        String string = anchorView.getResources().getString(com.planner5d.library.f.s.Y);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strC = c3Var.c(string);
        String string2 = anchorView.getResources().getString(com.planner5d.library.f.s.f169589zd);
        Menu menu = sVar.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        return new ActionsBottomSheetMenuRedesignFragment(fragmentManager, strC, string2, menu, true, onMenuItemClickListener);
    }

    @NotNull
    public final com.planner5d.library.widget.menu.o n(@NotNull View anchorView, @NotNull final com.planner5d.library.database.model.spaces.documents.a document, @Nullable androidx.lifecycle.w0<com.planner5d.library.activity.fragment.spaces.view.d> w0Var, @NotNull final Function2<? super com.planner5d.library.database.model.spaces.documents.a, ? super MenuItem, Unit> onMenuItemClickListener) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(onMenuItemClickListener, "onMenuItemClickListener");
        com.planner5d.library.widget.menu.s sVar = new com.planner5d.library.widget.menu.s(this.f134431a, anchorView, com.planner5d.library.f.n.f168917j, com.planner5d.library.f.C1549f.f166836z4, new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.list.p0
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                t0.p(onMenuItemClickListener, document, activity, menuItem);
            }
        });
        sVar.b(this.f134431a, com.planner5d.library.f.j.S0, com.planner5d.library.f.h.f167430a6);
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168173k1, com.planner5d.library.f.h.Z5);
        if (h3.a0(this.f134431a)) {
            return sVar;
        }
        FragmentManager fragmentManager = this.f134432b;
        Menu menu = sVar.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        return new DocumentOptionsBottomSheet(fragmentManager, menu, document, w0Var, new Function1() { // from class: com.planner5d.library.activity.fragment.list.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.o(onMenuItemClickListener, document, (MenuItem) obj);
            }
        });
    }

    @NotNull
    public final com.planner5d.library.widget.menu.o q(@NotNull View anchorView, @NotNull final com.planner5d.library.database.model.j folder, @NotNull final Function2<? super com.planner5d.library.database.model.j, ? super MenuItem, Unit> onMenuItemClickListener) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(onMenuItemClickListener, "onMenuItemClickListener");
        com.planner5d.library.widget.menu.s sVar = new com.planner5d.library.widget.menu.s(this.f134431a, anchorView, com.planner5d.library.f.n.f168918k, com.planner5d.library.f.C1549f.f166836z4, new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.list.n0
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                t0.r(onMenuItemClickListener, folder, activity, menuItem);
            }
        });
        sVar.b(this.f134431a, com.planner5d.library.f.j.S0, com.planner5d.library.f.h.f167430a6);
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168173k1, com.planner5d.library.f.h.Z5);
        if (h3.a0(this.f134431a)) {
            return sVar;
        }
        FragmentManager fragmentManager = this.f134432b;
        String title = folder.getTitle();
        Menu menu = sVar.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        return new ActionsBottomSheetMenuRedesignFragment(fragmentManager, title, null, menu, false, new Function1() { // from class: com.planner5d.library.activity.fragment.list.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.s(onMenuItemClickListener, folder, (MenuItem) obj);
            }
        });
    }

    @NotNull
    public final com.planner5d.library.widget.menu.o t(@NotNull View anchorView, @NotNull final com.planner5d.library.database.model.j folder, @NotNull final Function2<? super com.planner5d.library.database.model.j, ? super MenuItem, Unit> onMenuItemClickListener) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(onMenuItemClickListener, "onMenuItemClickListener");
        com.planner5d.library.widget.menu.s sVar = new com.planner5d.library.widget.menu.s(this.f134431a, anchorView, com.planner5d.library.f.n.f168921n, com.planner5d.library.f.C1549f.f166490ki, new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.list.i0
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                t0.u(onMenuItemClickListener, folder, activity, menuItem);
            }
        });
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168221m1, com.planner5d.library.f.h.Ka);
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168173k1, com.planner5d.library.f.h.f167877xb);
        if (h3.a0(this.f134431a)) {
            return sVar;
        }
        FragmentManager fragmentManager = this.f134432b;
        String title = folder.getTitle();
        Integer numValueOf = Integer.valueOf(com.planner5d.library.f.h.J8);
        Menu menu = sVar.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        return new ActionsBottomSheetMenuFragment(fragmentManager, title, numValueOf, menu, new Function1() { // from class: com.planner5d.library.activity.fragment.list.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.v(onMenuItemClickListener, folder, (MenuItem) obj);
            }
        });
    }

    @NotNull
    public final com.planner5d.library.widget.menu.o w(@NotNull View anchorView, @Nullable final Project project, boolean z10, boolean z11, @NotNull final Function2<? super Project, ? super MenuItem, Unit> onMenuItemClickListener) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(onMenuItemClickListener, "onMenuItemClickListener");
        com.planner5d.library.widget.menu.s sVar = new com.planner5d.library.widget.menu.s(this.f134431a, anchorView, com.planner5d.library.f.n.f168922o, com.planner5d.library.f.C1549f.f166490ki, new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.list.l0
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                t0.x(onMenuItemClickListener, project, activity, menuItem);
            }
        });
        boolean z12 = false;
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168269o1, com.planner5d.library.f.h.R8).setVisible(project != null && project.h());
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168317q1, com.planner5d.library.f.h.f167535fb).setVisible(project != null && project.h());
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168221m1, com.planner5d.library.f.h.Ka).setVisible(project != null && project.A());
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168173k1, com.planner5d.library.f.h.f167877xb).setVisible(project != null && project.z());
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168029e1, com.planner5d.library.f.h.A9).setVisible(project != null && project.y() && z10);
        sVar.b(this.f134431a, com.planner5d.library.f.j.R0, com.planner5d.library.f.h.f167607j7).setVisible(project != null && project.x());
        MenuItem menuItemB = sVar.b(this.f134431a, com.planner5d.library.f.j.f168197l1, com.planner5d.library.f.h.f167877xb);
        if (project != null && project.y() && z11) {
            z12 = true;
        }
        menuItemB.setVisible(z12);
        if (h3.a0(this.f134431a)) {
            return sVar;
        }
        FragmentManager fragmentManager = this.f134432b;
        String str = project != null ? project.title : null;
        Menu menu = sVar.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        return new ActionsBottomSheetMenuFragment(fragmentManager, str, null, menu, new Function1() { // from class: com.planner5d.library.activity.fragment.list.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.y(onMenuItemClickListener, project, (MenuItem) obj);
            }
        });
    }

    @NotNull
    public final com.planner5d.library.widget.menu.o z(@NotNull View anchorView, @NotNull final gd.b snapshot, boolean z10, boolean z11, @Nullable String str, @NotNull final Function2<? super gd.b, ? super MenuItem, Unit> onMenuItemClickListener) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(onMenuItemClickListener, "onMenuItemClickListener");
        com.planner5d.library.widget.menu.s sVar = new com.planner5d.library.widget.menu.s(this.f134431a, anchorView, com.planner5d.library.f.n.f168923p, com.planner5d.library.f.C1549f.f166490ki, new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.list.r0
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                t0.A(onMenuItemClickListener, snapshot, activity, menuItem);
            }
        });
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168317q1, com.planner5d.library.f.h.f167535fb).setVisible(snapshot.h());
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168269o1, com.planner5d.library.f.h.R8).setVisible(snapshot.e());
        boolean z12 = false;
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168029e1, com.planner5d.library.f.h.A9).setVisible(z10 && snapshot.o());
        sVar.b(this.f134431a, com.planner5d.library.f.j.f168173k1, com.planner5d.library.f.h.f167877xb);
        MenuItem menuItemB = sVar.b(this.f134431a, com.planner5d.library.f.j.f168197l1, com.planner5d.library.f.h.f167877xb);
        if (z11 && snapshot.g()) {
            z12 = true;
        }
        menuItemB.setVisible(z12);
        if (h3.a0(this.f134431a)) {
            return sVar;
        }
        FragmentManager fragmentManager = this.f134432b;
        Menu menu = sVar.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        return new ActionsBottomSheetMenuFragment(fragmentManager, str, null, menu, new Function1() { // from class: com.planner5d.library.activity.fragment.list.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.B(onMenuItemClickListener, snapshot, (MenuItem) obj);
            }
        });
    }
}
