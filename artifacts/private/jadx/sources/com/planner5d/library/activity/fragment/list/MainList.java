package com.planner5d.library.activity.fragment.list;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i2;
import androidx.navigation.y1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.list.g0;
import com.planner5d.library.activity.fragment.snapshots.Snapshots;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.databinding.s2;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.utility.j2;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.services.utility.u2;
import com.planner5d.library.widget.EnhancedRecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainList.kt\ncom/planner5d/library/activity/fragment/list/MainList\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 BundleParser.kt\ncom/planner5d/library/services/utility/BundleParser\n*L\n1#1,330:1\n12#2,6:331\n28#2:337\n1#3:338\n67#4,4:339\n37#4,2:343\n55#4:345\n72#4:346\n257#4,2:365\n278#4,2:367\n278#4,2:369\n278#4,2:371\n278#4,2:373\n257#4,2:375\n57#5,18:347\n*S KotlinDebug\n*F\n+ 1 MainList.kt\ncom/planner5d/library/activity/fragment/list/MainList\n*L\n63#1:331,6\n63#1:337\n195#1:339,4\n195#1:343,2\n195#1:345\n195#1:346\n224#1:365,2\n228#1:367,2\n230#1:369,2\n232#1:371,2\n234#1:373,2\n129#1:375,2\n198#1:347,18\n*E\n"})
public abstract class MainList<T extends g0> extends FragmentController implements com.planner5d.library.activity.helper.ui.a, com.planner5d.library.widget.c0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f133968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f133969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f133970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f133971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.activity.helper.ui.d f133972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final b2 f133973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected com.planner5d.library.databinding.f1 f133974k;

    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 MainList.kt\ncom/planner5d/library/activity/fragment/list/MainList\n*L\n1#1,52:1\n70#2:53\n195#3:54\n*E\n"})
    public static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView f133975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Parcelable f133976b;

        public a(RecyclerView recyclerView, Parcelable parcelable) {
            this.f133975a = recyclerView;
            this.f133976b = parcelable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            RecyclerView.p layoutManager = this.f133975a.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.x1(this.f133976b);
            }
        }
    }

    static final class b implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f133977a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f133977a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f133977a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f133977a.invoke(obj);
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

    public MainList() {
        t3 t3Var = t3.f229751a;
        this.f133968e = new i2(kotlin.jvm.internal.j1.d(l1.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f133969f = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.list.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainList.q0();
            }
        });
        this.f133973j = com.planner5d.library.application.b.f142455c.a().F1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A0(f0 f0Var, List list) {
        f0Var.k(list);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(MainList mainList, l1.k kVar) {
        Intrinsics.checkNotNull(kVar);
        mainList.Q0(kVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C0(MainList mainList, l1.i iVar) {
        com.planner5d.library.activity.helper.ui.d dVar = mainList.f133972i;
        Intrinsics.checkNotNull(iVar);
        com.planner5d.library.activity.helper.ui.d.e(mainList.p0(dVar, iVar));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D0(com.planner5d.library.databinding.f1 f1Var, MainList mainList, l1.f fVar) {
        LinearLayout carryOverButtonsContainer = f1Var.f158949b;
        Intrinsics.checkNotNullExpressionValue(carryOverButtonsContainer, "carryOverButtonsContainer");
        carryOverButtonsContainer.setVisibility(fVar.f() ? 0 : 8);
        f1Var.f158951d.setEnabled(!Intrinsics.areEqual(fVar.e().a(), mainList.w0().X0().b()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(MainList mainList, t0 t0Var, View anchorView, Object obj) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Context contextRequireContext = mainList.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        com.planner5d.library.widget.menu.o oVarD0 = mainList.d0(contextRequireContext, anchorView, obj, t0Var);
        if (oVarD0 != null) {
            FragmentManager childFragmentManager = mainList.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            oVarD0.showMenu(childFragmentManager, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(MainList mainList) {
        mainList.J0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(MainList mainList, View view) {
        int i10 = 3 >> 0;
        com.planner5d.library.activity.fragment.x.g(mainList.f131538b, u0.f134434a.c(mainList instanceof Snapshots), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(final MainList mainList, View view) {
        mainList.getContentViewModel().F(mainList.getArguments(), mainList.w0().X0().b(), mainList.w0().a1(), new Function0() { // from class: com.planner5d.library.activity.fragment.list.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainList.I0(this.f133978a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I0(MainList mainList) {
        com.planner5d.library.activity.fragment.x.g(mainList.f131538b, u0.f134434a.c(mainList instanceof Snapshots), false, 2, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K0(MainList mainList) {
        mainList.r0().f158952e.O0();
        return Unit.f312394a;
    }

    private final void L0(RecyclerView recyclerView, Parcelable parcelable) {
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new a(recyclerView, parcelable));
            return;
        }
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.x1(parcelable);
        }
    }

    private final void M0(final EnhancedRecyclerView enhancedRecyclerView, final u2 u2Var) {
        com.planner5d.library.widget.x.f258869a.b(enhancedRecyclerView, new Function0() { // from class: com.planner5d.library.activity.fragment.list.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainList.N0(enhancedRecyclerView, u2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N0(EnhancedRecyclerView enhancedRecyclerView, u2 u2Var) {
        enhancedRecyclerView.d2(u2Var);
        return Unit.f312394a;
    }

    private final void Q0(l1.k kVar) {
        boolean zContains = ArraysKt.contains(kVar.e(), b0.a.Selecting);
        r0().f158953f.setEnabled((kVar.g() || zContains) ? false : true);
        r0().f158953f.setRefreshing(kVar.g() && !zContains);
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this;
        }
        com.planner5d.library.activity.helper.ui.d.f(parentFragment, o0(kVar, zContains));
        if (kVar.f() != null) {
            w0().X1();
            this.f133973j.n(kVar.f());
        }
        showPlaceholder$default(this, (w0().l1() || kVar.g() || w0().X0().b() != null) ? false : true, null, null, null, null, 30, null);
        w0().U1(kVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(MainList mainList) {
        mainList.r0().f158952e.O0();
        mainList.r0().f158952e.M1(0);
        return Unit.f312394a;
    }

    private final f0 b0(final Context context, final FragmentManager fragmentManager, com.planner5d.library.services.bitmaploader.target.h hVar, final t0 t0Var) {
        com.planner5d.library.activity.fragment.list.holders.u uVarS0 = s0();
        androidx.lifecycle.f0 f0VarA = androidx.lifecycle.p0.a(this);
        androidx.lifecycle.o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return new f0(uVarS0, f0VarA, viewLifecycleOwner, hVar, w0(), new n1() { // from class: com.planner5d.library.activity.fragment.list.e
            @Override // com.planner5d.library.activity.fragment.list.n1
            public final void a(View view, Object obj) {
                MainList.c0(this.f134038a, context, t0Var, fragmentManager, view, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(MainList mainList, Context context, t0 t0Var, FragmentManager fragmentManager, View anchorView, Object obj) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        com.planner5d.library.widget.menu.o oVarD0 = mainList.d0(context, anchorView, obj, t0Var);
        if (oVarD0 != null) {
            oVarD0.showMenu(fragmentManager, null);
        }
    }

    private final com.planner5d.library.widget.menu.o d0(Context context, View view, Object obj, t0 t0Var) {
        if (obj instanceof Project) {
            return t0Var.w(view, (Project) obj, w0().V0(), w0().H0(), new Function2() { // from class: com.planner5d.library.activity.fragment.list.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MainList.e0(this.f134449a, (Project) obj2, (MenuItem) obj3);
                }
            });
        }
        if (obj instanceof com.planner5d.library.model.g) {
            com.planner5d.library.model.g gVar = (com.planner5d.library.model.g) obj;
            if (gVar.f() instanceof com.planner5d.library.database.model.spaces.documents.c) {
                return t0Var.q(view, gVar.f(), new Function2() { // from class: com.planner5d.library.activity.fragment.list.y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return MainList.f0(this.f134450a, (com.planner5d.library.database.model.j) obj2, (MenuItem) obj3);
                    }
                });
            }
            com.planner5d.library.database.model.j jVarF = gVar.f();
            Intrinsics.checkNotNull(jVarF, "null cannot be cast to non-null type com.planner5d.library.model.Folder");
            return t0Var.t(view, (Folder) jVarF, new Function2() { // from class: com.planner5d.library.activity.fragment.list.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MainList.g0(this.f134452a, (com.planner5d.library.database.model.j) obj2, (MenuItem) obj3);
                }
            });
        }
        if (obj instanceof gd.b) {
            gd.b bVar = (gd.b) obj;
            return t0Var.z(view, bVar, w0().V0(), w0().H0(), u0(context, bVar), new Function2() { // from class: com.planner5d.library.activity.fragment.list.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MainList.h0(this.f133979a, (gd.b) obj2, (MenuItem) obj3);
                }
            });
        }
        if (obj instanceof com.planner5d.library.database.model.spaces.documents.a) {
            com.planner5d.library.database.model.spaces.documents.a aVar = (com.planner5d.library.database.model.spaces.documents.a) obj;
            g0 contentViewModel = getContentViewModel();
            com.planner5d.library.activity.fragment.spaces.documents.o oVar = contentViewModel instanceof com.planner5d.library.activity.fragment.spaces.documents.o ? (com.planner5d.library.activity.fragment.spaces.documents.o) contentViewModel : null;
            return t0Var.n(view, aVar, oVar != null ? oVar.f0(aVar) : null, new Function2() { // from class: com.planner5d.library.activity.fragment.list.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MainList.i0(this.f133981a, (com.planner5d.library.database.model.spaces.documents.a) obj2, (MenuItem) obj3);
                }
            });
        }
        if (obj == null && (getContentViewModel() instanceof com.planner5d.library.activity.fragment.spaces.documents.o)) {
            return t0Var.l(view, w0().X0().b() == null, new Function1() { // from class: com.planner5d.library.activity.fragment.list.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MainList.j0(this.f134028a, (MenuItem) obj2);
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(MainList mainList, Project project, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        mainList.w0().B1(project, menuItem);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(MainList mainList, com.planner5d.library.database.model.j folder, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        mainList.w0().v1(folder, menuItem);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(MainList mainList, com.planner5d.library.database.model.j folder, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        mainList.w0().v1(folder, menuItem);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(MainList mainList, gd.b snapshot, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        mainList.w0().B1(snapshot, menuItem);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(MainList mainList, com.planner5d.library.database.model.spaces.documents.a document, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        mainList.w0().B1(document, menuItem);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(MainList mainList, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        g0 contentViewModel = mainList.getContentViewModel();
        Intrinsics.checkNotNull(contentViewModel, "null cannot be cast to non-null type com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel");
        ((com.planner5d.library.activity.fragment.spaces.documents.o) contentViewModel).r0(menuItem, mainList.w0().X0().b());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(final MainList mainList, Activity activity, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "<unused var>");
        mainList.w0().E1(new Function0() { // from class: com.planner5d.library.activity.fragment.list.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainList.l0(this.f134433a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(final MainList mainList) {
        g0 contentViewModel = mainList.getContentViewModel();
        androidx.fragment.app.s sVarRequireActivity = mainList.requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        l1.i iVarF = mainList.w0().d1().f();
        contentViewModel.p(sVarRequireActivity, iVarF != null ? iVarF.f() : null, new Function0() { // from class: com.planner5d.library.activity.fragment.list.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainList.m0(this.f134436a);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(MainList mainList) {
        mainList.w0().P0();
        mainList.J0(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(MainList mainList, Activity activity, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "<unused var>");
        g0 contentViewModel = mainList.getContentViewModel();
        Bundle bundleM0 = mainList.w0().M0(true);
        l1.i iVarF = mainList.w0().d1().f();
        contentViewModel.T(bundleM0, iVarF != null ? iVarF.f() : null);
    }

    private final com.planner5d.library.activity.helper.ui.b o0(l1.k kVar, boolean z10) {
        boolean z11 = kVar.g() && !z10;
        Integer numH = kVar.h();
        return new com.planner5d.library.activity.helper.ui.b(z11, numH != null ? new k3(numH.intValue(), new Object[0]) : null, false);
    }

    private final com.planner5d.library.activity.helper.ui.d p0(com.planner5d.library.activity.helper.ui.d dVar, l1.i iVar) {
        com.planner5d.library.activity.helper.ui.d.b bVar = dVar == null ? new com.planner5d.library.activity.helper.ui.d.b(getContext(), this) : new com.planner5d.library.activity.helper.ui.d.b(dVar, getContext(), this);
        if (iVar.e()) {
            bVar.K(new j2(com.planner5d.library.f.q.f168945l, iVar.f().size()));
            bVar.u(com.planner5d.library.activity.helper.ui.d.a.f137158e);
            bVar.v(true);
            bVar.M(true);
        }
        bVar.I(true);
        com.planner5d.library.activity.helper.ui.d dVarX = bVar.x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.activity.fragment.list.holders.u q0() {
        return com.planner5d.library.application.b.f142455c.a().r();
    }

    public static /* synthetic */ void showPlaceholder$default(MainList mainList, boolean z10, Integer num, Integer num2, Integer num3, Integer num4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPlaceholder");
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            num3 = null;
        }
        if ((i10 & 16) != 0) {
            num4 = null;
        }
        mainList.P0(z10, num, num2, num3, num4);
    }

    private final String t0() {
        y1 y1VarJ = androidx.navigation.fragment.f.a(this).J();
        return String.valueOf(y1VarJ != null ? y1VarJ.J() : null);
    }

    private final String u0(Context context, gd.b bVar) {
        if (bVar.t() == 3) {
            String string = context.getString(com.planner5d.library.f.s.f169312o1);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String title = bVar.getTitle();
        if (title != null) {
            return title;
        }
        String string2 = context.getString(com.planner5d.library.f.s.JC);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final Parcelable v0(Bundle bundle) {
        Parcelable parcelable;
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.scrollPositionVertical;
        int i10 = 1 << 0;
        try {
            parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) jVar.g().getParcelable(rVar.f224891a, Parcelable.class) : jVar.g().getParcelable(rVar.f224891a);
            if (parcelable == null) {
                parcelable = null;
            }
        } catch (ClassCastException unused) {
        }
        if (parcelable == null) {
            return null;
        }
        return parcelable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(MainList mainList, Integer num) {
        mainList.J0(false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle y0(com.planner5d.library.databinding.f1 f1Var) {
        Bundle contentBundleWithScrollPosition = f1Var.f158952e.getContentBundleWithScrollPosition();
        if (contentBundleWithScrollPosition != null) {
            return contentBundleWithScrollPosition;
        }
        Bundle EMPTY = Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(com.planner5d.library.databinding.f1 f1Var, EnhancedRecyclerView.e eVar) {
        f1Var.f158952e.setAppearanceMode(eVar);
        boolean z10 = eVar == EnhancedRecyclerView.e.GRID;
        EnhancedRecyclerView list = f1Var.f158952e;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        Context context = f1Var.f158952e.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        com.planner5d.library.widget.x.i(list, context, z10 ? Integer.valueOf(com.planner5d.library.f.g.Lh) : null, z10 ? Integer.valueOf(com.planner5d.library.f.g.f167420zh) : null, Integer.valueOf(com.planner5d.library.f.g.f167420zh));
        return Unit.f312394a;
    }

    protected final void J0(boolean z10) {
        w0().L1(z10, new Function0() { // from class: com.planner5d.library.activity.fragment.list.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainList.K0(this.f134032a);
            }
        });
    }

    protected final void O0(@NotNull com.planner5d.library.databinding.f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<set-?>");
        this.f133974k = f1Var;
    }

    protected void P0(boolean z10, @androidx.annotation.v @Nullable Integer num, @androidx.annotation.v @Nullable Integer num2, @androidx.annotation.f1 @Nullable Integer num3, @androidx.annotation.f1 @Nullable Integer num4) {
        s2 s2VarA = s2.a(r0().getRoot());
        ConstraintLayout placeholderForEmptyList = s2VarA.f159632c;
        Intrinsics.checkNotNullExpressionValue(placeholderForEmptyList, "placeholderForEmptyList");
        placeholderForEmptyList.setVisibility(z10 ? 0 : 8);
        if (z10) {
            ImageView placeholderImage = s2VarA.f159633d;
            Intrinsics.checkNotNullExpressionValue(placeholderImage, "placeholderImage");
            boolean z11 = true;
            placeholderImage.setVisibility(num == null ? 4 : 0);
            if (num != null) {
                s2VarA.f159633d.setImageResource(num.intValue());
            }
            ImageView placeholderNavHint = s2VarA.f159634e;
            Intrinsics.checkNotNullExpressionValue(placeholderNavHint, "placeholderNavHint");
            placeholderNavHint.setVisibility(num2 == null ? 4 : 0);
            if (num2 != null) {
                s2VarA.f159634e.setImageResource(num2.intValue());
            }
            TextView placeholderTitle = s2VarA.f159635f;
            Intrinsics.checkNotNullExpressionValue(placeholderTitle, "placeholderTitle");
            placeholderTitle.setVisibility(num3 == null ? 4 : 0);
            if (num3 != null) {
                s2VarA.f159635f.setText(num3.intValue());
            }
            TextView placeholderDescription = s2VarA.f159631b;
            Intrinsics.checkNotNullExpressionValue(placeholderDescription, "placeholderDescription");
            if (num4 != null) {
                z11 = false;
            }
            placeholderDescription.setVisibility(z11 ? 4 : 0);
            if (num4 != null) {
                s2VarA.f159631b.setText(num4.intValue());
            }
        }
    }

    protected final void Z(@NotNull l1.j sortOrder) {
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        l1.G0(w0(), sortOrder, false, new Function0() { // from class: com.planner5d.library.activity.fragment.list.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainList.a0(this.f134429a);
            }
        }, 2, null);
    }

    @NotNull
    public abstract T getContentViewModel();

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).E(true).w(false).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void onActivityCreatedExtended(@Nullable Bundle bundle) {
        J0(false);
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        l1.i iVarF = w0().d1().f();
        boolean z10 = false;
        if (iVarF != null && iVarF.e()) {
            z10 = true;
        }
        if (z10) {
            w0().P0();
        }
        return z10;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f133971h = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        O0(com.planner5d.library.databinding.f1.a(inflater.inflate(com.planner5d.library.f.m.W1, viewGroup, false)));
        final com.planner5d.library.databinding.f1 f1VarR0 = r0();
        com.planner5d.library.services.m0.f224429b.k(this, new b(new Function1() { // from class: com.planner5d.library.activity.fragment.list.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainList.x0(this.f134057a, (Integer) obj);
            }
        }));
        setHasOptionsMenu(true);
        this.f133972i = com.planner5d.library.activity.helper.ui.d.f137133w.f();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        final t0 t0Var = new t0(contextRequireContext, childFragmentManager);
        com.planner5d.library.activity.fragment.list.holders.u uVarS0 = s0();
        androidx.lifecycle.f0 f0VarA = androidx.lifecycle.p0.a(this);
        androidx.lifecycle.o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f133971h;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        final f0 f0Var = new f0(uVarS0, f0VarA, viewLifecycleOwner, hVar, w0(), new n1() { // from class: com.planner5d.library.activity.fragment.list.j
            @Override // com.planner5d.library.activity.fragment.list.n1
            public final void a(View view, Object obj) {
                MainList.E0(this.f134242a, t0Var, view, obj);
            }
        });
        f1VarR0.f158952e.setAdapter(f0Var);
        f1VarR0.f158952e.setClipChildren(false);
        f1VarR0.f158953f.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: com.planner5d.library.activity.fragment.list.k
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                MainList.F0(this.f134246a);
            }
        });
        f1VarR0.f158950c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainList.G0(this.f134392a, view);
            }
        });
        f1VarR0.f158951d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainList.H0(this.f134411a, view);
            }
        });
        w0().T1(getArguments());
        l1.b bVar = l1.f134252q3;
        l1.j jVarE = bVar.e(getArguments());
        if (jVarE != null) {
            Z(jVarE);
        }
        EnhancedRecyclerView.e eVarA = bVar.a(getArguments());
        if (eVarA != null) {
            w0().S1(eVarA);
        }
        u2 u2VarD = bVar.d(getArguments());
        if (u2VarD != null) {
            EnhancedRecyclerView list = f1VarR0.f158952e;
            Intrinsics.checkNotNullExpressionValue(list, "list");
            M0(list, u2VarD);
        }
        Parcelable parcelableV0 = v0(getArguments());
        if (parcelableV0 != null) {
            EnhancedRecyclerView list2 = f1VarR0.f158952e;
            Intrinsics.checkNotNullExpressionValue(list2, "list");
            L0(list2, parcelableV0);
        }
        w0().Y1(new Function0() { // from class: com.planner5d.library.activity.fragment.list.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainList.y0(f1VarR0);
            }
        });
        w0().S0().k(this, new b(new Function1() { // from class: com.planner5d.library.activity.fragment.list.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainList.z0(f1VarR0, (EnhancedRecyclerView.e) obj);
            }
        }));
        w0().b1().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.list.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainList.A0(f0Var, (List) obj);
            }
        }));
        w0().j1().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.list.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainList.B0(this.f134423a, (l1.k) obj);
            }
        }));
        w0().d1().k(this, new b(new Function1() { // from class: com.planner5d.library.activity.fragment.list.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainList.C0(this.f134426a, (l1.i) obj);
            }
        }));
        w0().c1().k(this, new b(new Function1() { // from class: com.planner5d.library.activity.fragment.list.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainList.D0(f1VarR0, this, (l1.f) obj);
            }
        }));
        FrameLayout root = r0().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        w0().R1(null);
        this.f133970g = false;
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f133970g = true;
        w0().R1(requireActivity());
    }

    @NotNull
    protected final com.planner5d.library.databinding.f1 r0() {
        com.planner5d.library.databinding.f1 f1Var = this.f133974k;
        if (f1Var != null) {
            return f1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @NotNull
    protected com.planner5d.library.activity.fragment.list.holders.u s0() {
        return (com.planner5d.library.activity.fragment.list.holders.u) this.f133969f.getValue();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @Nullable
    protected com.planner5d.library.widget.menu.l t(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        l1.i iVarF = w0().d1().f();
        if (iVarF == null || !iVarF.e()) {
            return super.t(menu, inflater);
        }
        boolean z10 = false & false;
        com.planner5d.library.widget.menu.l lVarB = new com.planner5d.library.widget.menu.l(inflater, menu, com.planner5d.library.f.n.f168914g, null, 8, null).b(com.planner5d.library.f.j.f168173k1).k(com.planner5d.library.f.h.f167877xb, Integer.valueOf(requireActivity().getColor(com.planner5d.library.f.C1549f.f166561nh))).b(new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.list.f
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                MainList.k0(this.f134045a, activity, menuItem);
            }
        });
        if (getContentViewModel() instanceof com.planner5d.library.activity.fragment.spaces.documents.o) {
            lVarB.b(com.planner5d.library.f.j.f168053f1).i(false).q(false);
            return lVarB;
        }
        lVarB.b(com.planner5d.library.f.j.f168053f1).k(com.planner5d.library.f.h.f167913z9, Integer.valueOf(requireActivity().getColor(com.planner5d.library.f.C1549f.f166561nh))).b(new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.list.g
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                MainList.n0(this.f134054a, activity, menuItem);
            }
        });
        return lVarB;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void v(@Nullable Bundle bundle) {
        w0().V1(getContentViewModel());
    }

    @NotNull
    protected final l1 w0() {
        return (l1) this.f133968e.getValue();
    }
}
