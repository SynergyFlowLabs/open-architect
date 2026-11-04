package com.planner5d.library.activity.fragment.spaces.documents;

import android.app.Activity;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import com.planner5d.library.activity.fragment.CheckableBottomSheetMenuFragment;
import com.planner5d.library.activity.fragment.list.MainList;
import com.planner5d.library.activity.fragment.list.d0;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.EnhancedRecyclerView;
import com.planner5d.library.widget.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDocuments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Documents.kt\ncom/planner5d/library/activity/fragment/spaces/documents/Documents\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n12#2,6:125\n28#2:131\n1557#3:132\n1628#3,3:133\n37#4,2:136\n1#5:138\n*S KotlinDebug\n*F\n+ 1 Documents.kt\ncom/planner5d/library/activity/fragment/spaces/documents/Documents\n*L\n40#1:125,6\n40#1:131\n114#1:132\n114#1:133,3\n114#1:136,2\n*E\n"})
public final class Documents extends MainList<o> implements c0 {
    public static final int $stable = 8;

    @ij.a
    public d0 actionsObserve;

    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k dialogLauncher;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final f0 f136143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final f0 f136144m;

    @ij.a
    public y1 menuManager;

    static final class a implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f136145a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f136145a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f136145a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f136145a.invoke(obj);
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

    public Documents() {
        t3 t3Var = t3.f229751a;
        this.f136143l = new i2(j1.d(o.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f136144m = g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.spaces.documents.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Documents.a1(this.f136152a);
            }
        });
        com.planner5d.library.application.b.f142455c.a().d1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o a1(Documents documents) {
        return documents.c1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b1(Documents documents, Activity activity, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "<unused var>");
        documents.c1().t0(documents.w0().X0().b(), true);
    }

    private final o c1() {
        return (o) this.f136143l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d1(Documents documents, com.planner5d.library.services.utility.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.c(com.planner5d.library.services.r.appearanceMode, documents.w0().S0().f());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e1() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f1(Documents documents, l1.k kVar) {
        s activity = documents.getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
        boolean zG = kVar.g();
        Integer numH = kVar.h();
        com.planner5d.library.activity.helper.ui.d.f(documents, new com.planner5d.library.activity.helper.ui.b(zG, numH != null ? new k3(numH.intValue(), new Object[0]) : null, false));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(Documents documents, Object obj) {
        documents.j1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h1(Documents documents, Boolean bool) {
        if (bool.booleanValue()) {
            documents.J0(false);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i1(Documents documents, Integer num) {
        EnhancedRecyclerView enhancedRecyclerView = documents.r0().f158952e;
        Intrinsics.checkNotNull(num);
        enhancedRecyclerView.setHasTopRows(num.intValue());
        return Unit.f312394a;
    }

    private final void j1() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        String string = getString(com.planner5d.library.f.s.TC);
        List<l1.j> listK = new l1.c().k();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listK, 10));
        for (l1.j jVar : listK) {
            arrayList.add(new ue.b(Integer.valueOf(jVar.p()), getString(jVar.p())));
        }
        CheckableBottomSheetMenuFragment checkableBottomSheetMenuFragment = new CheckableBottomSheetMenuFragment(childFragmentManager, string, (ue.b[]) arrayList.toArray(new ue.b[0]), w0().h1().p(), new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.documents.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Documents.k1(this.f136147a, (ue.b) obj);
            }
        });
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        com.planner5d.library.widget.menu.o.a.a(checkableBottomSheetMenuFragment, childFragmentManager2, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k1(Documents documents, ue.b selectedMenu) {
        Intrinsics.checkNotNullParameter(selectedMenu, "selectedMenu");
        l1.j.a aVar = l1.j.f134319b;
        Object first = ((Pair) selectedMenu).first;
        Intrinsics.checkNotNullExpressionValue(first, "first");
        documents.Z(aVar.a(((Number) first).intValue()));
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList
    protected void P0(boolean z10, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        super.P0(false, null, null, null, null);
    }

    @NotNull
    public final d0 getActionsObserve$P5D_Library_release() {
        d0 d0Var = this.actionsObserve;
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

    @Override // com.planner5d.library.activity.fragment.list.MainList, com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        if (super.onBackPressed()) {
            return true;
        }
        com.planner5d.library.activity.helper.event.content.a aVarF = getMenuManager$P5D_Library_release().f();
        if (aVarF == null) {
            return false;
        }
        aVarF.k(new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.documents.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Documents.d1(this.f136146a, (com.planner5d.library.services.utility.i) obj);
            }
        });
        return false;
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList, com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        getActionsObserve$P5D_Library_release().a(w0().Q0(), this);
        w0().j1().k(this, new a(new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.documents.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Documents.f1(this.f136148a, (l1.k) obj);
            }
        }));
        w0().f1().k(this, new d1() { // from class: com.planner5d.library.activity.fragment.spaces.documents.d
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                Documents.g1(this.f136149a, obj);
            }
        });
        getContentViewModel().i0().k(this, new a(new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.documents.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Documents.h1(this.f136150a, (Boolean) obj);
            }
        }));
        getContentViewModel().j0().k(this, new a(new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.documents.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Documents.i1(this.f136151a, (Integer) obj);
            }
        }));
        return super.onCreateViewExtended(inflater, viewGroup, bundle);
    }

    public final void setActionsObserve$P5D_Library_release(@NotNull d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
        this.actionsObserve = d0Var;
    }

    public final void setDialogLauncher$P5D_Library_release(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setMenuManager$P5D_Library_release(@NotNull y1 y1Var) {
        Intrinsics.checkNotNullParameter(y1Var, "<set-?>");
        this.menuManager = y1Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d1  */
    @Override // com.planner5d.library.activity.fragment.list.MainList, com.planner5d.library.activity.fragment.FragmentController
    @Nullable
    protected com.planner5d.library.widget.menu.l t(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        l1.f fVarF;
        boolean z10;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        l1.i iVarF = w0().d1().f();
        if ((iVarF != null && iVarF.e()) || ((fVarF = w0().c1().f()) != null && fVarF.f())) {
            return super.t(menu, inflater);
        }
        int i10 = 3 ^ 0;
        com.planner5d.library.widget.menu.n nVarL = new com.planner5d.library.widget.menu.l(inflater, menu, com.planner5d.library.f.n.f168910c, null, 8, null).b(com.planner5d.library.f.j.T0).l(com.planner5d.library.f.h.T7, Integer.valueOf(requireActivity().getColor(com.planner5d.library.f.C1549f.Fg)), Integer.valueOf(requireActivity().getColor(com.planner5d.library.f.C1549f.Hh)));
        l1.k kVarF = w0().j1().f();
        com.planner5d.library.widget.menu.n nVarI = nVarL.i((kVarF == null || kVarF.g()) ? false : true);
        if (w0().X0().b() != null) {
            com.planner5d.library.database.model.j jVarB = w0().X0().b();
            Intrinsics.checkNotNull(jVarB, "null cannot be cast to non-null type com.planner5d.library.database.model.spaces.documents.DocumentFolder");
            z10 = ((com.planner5d.library.database.model.spaces.documents.c) jVarB).u() ? false : true;
        }
        return nVarI.q(z10).b(new com.planner5d.library.widget.menu.p() { // from class: com.planner5d.library.activity.fragment.spaces.documents.h
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                Documents.b1(this.f136153a, activity, menuItem);
            }
        });
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList, com.planner5d.library.activity.fragment.FragmentController
    protected void v(@Nullable Bundle bundle) {
        super.v(bundle);
        if (w0().h1() == l1.j.FOLDERS_FIRST) {
            w0().E0(l1.j.BY_DATE, false, new Function0() { // from class: com.planner5d.library.activity.fragment.spaces.documents.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Documents.e1();
                }
            });
        }
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void w(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        r0().f158952e.setHasTopRows(1);
    }

    @Override // com.planner5d.library.activity.fragment.list.MainList
    @NotNull
    public o getContentViewModel() {
        return (o) this.f136144m.getValue();
    }
}
