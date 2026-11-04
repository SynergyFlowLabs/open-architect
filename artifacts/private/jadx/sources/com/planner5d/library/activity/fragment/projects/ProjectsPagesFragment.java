package com.planner5d.library.activity.fragment.projects;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.viewpager2.widget.ViewPager2;
import com.devtodev.core.data.consts.RequestParams;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.list.MainList;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.t3;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProjectsPagesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectsPagesFragment.kt\ncom/planner5d/library/activity/fragment/projects/ProjectsPagesFragment\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n12#2,6:111\n28#2:117\n295#3,2:118\n*S KotlinDebug\n*F\n+ 1 ProjectsPagesFragment.kt\ncom/planner5d/library/activity/fragment/projects/ProjectsPagesFragment\n*L\n61#1:111,6\n61#1:117\n73#1:118,2\n*E\n"})
public final class ProjectsPagesFragment extends FragmentController implements com.planner5d.library.activity.helper.ui.a, com.planner5d.library.widget.c0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private rd.l f134921f;

    @ij.a
    public sd.e firebaseInAppMessageTrigger;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f134922g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f134924i;

    @ij.a
    public b2 messageManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f134920e = com.planner5d.library.util.navigation.uiview.f.c(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f134923h = com.planner5d.library.services.network.f.f224463a.f(this);

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f134925a = 0;

        @NotNull
        public final com.planner5d.library.activity.helper.event.content.c a(@Nullable gd.b bVar) {
            com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.tab;
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.snapshotsList;
            return new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, iVar.t(rVar, rVar2).h(rVar2, new com.planner5d.library.services.utility.i().j(com.planner5d.library.services.r.targetSnapshotUid, bVar != null ? bVar.a() : null).a()).a());
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134926a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134926a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f134926a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134926a.invoke(obj);
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

    public ProjectsPagesFragment() {
        t3 t3Var = t3.f229751a;
        int i10 = 4 ^ 0;
        this.f134924i = new i2(j1.d(n0.class), new t3.c(this), t3.d.f229756a, null, 8, null);
    }

    private final com.planner5d.library.util.navigation.uiview.c A() {
        return (com.planner5d.library.util.navigation.uiview.c) this.f134920e.getValue();
    }

    private final com.planner5d.library.services.network.b B() {
        return (com.planner5d.library.services.network.b) this.f134923h.getValue();
    }

    private final n0 C() {
        return (n0) this.f134924i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(ProjectsPagesFragment projectsPagesFragment, com.planner5d.library.widget.tab.f fVar) {
        if (!projectsPagesFragment.f134922g) {
            com.planner5d.library.util.navigation.uiview.c cVarA = projectsPagesFragment.A();
            Intrinsics.checkNotNull(fVar);
            cVarA.d(fVar);
            projectsPagesFragment.f134922g = !fVar.b().isEmpty();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(ProjectsPagesFragment projectsPagesFragment) {
        projectsPagesFragment.getMessageManager().f();
        return Unit.f312394a;
    }

    @NotNull
    public final sd.e getFirebaseInAppMessageTrigger() {
        sd.e eVar = this.firebaseInAppMessageTrigger;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firebaseInAppMessageTrigger");
        return null;
    }

    @NotNull
    public final b2 getMessageManager() {
        b2 b2Var = this.messageManager;
        if (b2Var != null) {
            return b2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageManager");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).w(true).L(true).K(new k3(com.planner5d.library.f.s.Kr, new Object[0])).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        rd.l lVar = this.f134921f;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewSimplePagerBinding");
            lVar = null;
        }
        Fragment fragmentW0 = childFragmentManager.w0(RequestParams.F + lVar.f366632b.getCurrentItem());
        if (fragmentW0 == null || !(fragmentW0 instanceof MainList)) {
            return false;
        }
        return ((MainList) fragmentW0).onBackPressed();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object next;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.planner5d.library.application.b.f142455c.a().f2(this);
        this.f134921f = rd.l.d(inflater, viewGroup, false);
        C().p0(new com.planner5d.library.services.utility.j(getArguments()));
        com.planner5d.library.widget.tab.f fVarK0 = C().k0(new com.planner5d.library.services.utility.j(getArguments()));
        rd.l lVar = this.f134921f;
        rd.l lVar2 = null;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewSimplePagerBinding");
            lVar = null;
        }
        ViewPager2 pager = lVar.f366632b;
        Intrinsics.checkNotNullExpressionValue(pager, "pager");
        A().a(fVarK0, pager);
        pager.o(new com.planner5d.library.widget.tab.b(fVarK0.b()));
        Iterator<T> it = fVarK0.b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((com.planner5d.library.widget.tab.f.a) next).c() != r3.d.my_documents);
        if (next != null) {
            this.f134922g = true;
        }
        rd.l lVar3 = this.f134921f;
        if (lVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewSimplePagerBinding");
        } else {
            lVar2 = lVar3;
        }
        ViewPager2 root = lVar2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void setFirebaseInAppMessageTrigger(@NotNull sd.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.firebaseInAppMessageTrigger = eVar;
    }

    public final void setMessageManager(@NotNull b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "<set-?>");
        this.messageManager = b2Var;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void w(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        C().h0().k(this, new b(new Function1() { // from class: com.planner5d.library.activity.fragment.projects.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProjectsPagesFragment.D(this.f135002a, (com.planner5d.library.widget.tab.f) obj);
            }
        }));
        B().f(new Function0() { // from class: com.planner5d.library.activity.fragment.projects.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProjectsPagesFragment.E(this.f135019a);
            }
        });
    }
}
