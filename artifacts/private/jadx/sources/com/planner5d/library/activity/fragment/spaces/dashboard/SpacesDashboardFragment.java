package com.planner5d.library.activity.fragment.spaces.dashboard;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import androidx.compose.ui.a0;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.k4;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i2;
import androidx.navigation.c2;
import com.planner5d.library.activity.fragment.dialog.r;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.utility.l1;
import com.planner5d.library.services.utility.t3;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSpacesDashboardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesDashboardFragment.kt\ncom/planner5d/library/activity/fragment/spaces/dashboard/SpacesDashboardFragment\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n*L\n1#1,128:1\n12#2,6:129\n28#2:135\n*S KotlinDebug\n*F\n+ 1 SpacesDashboardFragment.kt\ncom/planner5d/library/activity/fragment/spaces/dashboard/SpacesDashboardFragment\n*L\n36#1:129,6\n36#1:135\n*E\n"})
public final class SpacesDashboardFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private rd.g f136111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f136112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f136113c;

    static final class a implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f136114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f136115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f136116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SpacesDashboardFragment f136117d;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.spaces.dashboard.SpacesDashboardFragment$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nSpacesDashboardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesDashboardFragment.kt\ncom/planner5d/library/activity/fragment/spaces/dashboard/SpacesDashboardFragment$composeTopPart$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,128:1\n1282#2,6:129\n1282#2,6:135\n1282#2,6:141\n85#3:147\n*S KotlinDebug\n*F\n+ 1 SpacesDashboardFragment.kt\ncom/planner5d/library/activity/fragment/spaces/dashboard/SpacesDashboardFragment$composeTopPart$1$1$1\n*L\n57#1:129,6\n61#1:135,6\n65#1:141,6\n55#1:147\n*E\n"})
        static final class C1497a implements Function2<c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f136118a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bitmap f136119b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f136120c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ SpacesDashboardFragment f136121d;

            C1497a(boolean z10, Bitmap bitmap, boolean z11, SpacesDashboardFragment spacesDashboardFragment) {
                this.f136118a = z10;
                this.f136119b = bitmap;
                this.f136120c = z11;
                this.f136121d = spacesDashboardFragment;
            }

            private static final float n(n7<Float> n7Var) {
                return n7Var.getValue().floatValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(SpacesDashboardFragment spacesDashboardFragment) {
                com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
                androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(spacesDashboardFragment);
                c2 c2VarC = i.c();
                Intrinsics.checkNotNullExpressionValue(c2VarC, "toProfile(...)");
                kVar.d(w0VarA, c2VarC, new Function2() { // from class: com.planner5d.library.activity.fragment.spaces.dashboard.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SpacesDashboardFragment.a.C1497a.v((androidx.navigation.w0) obj, (c2) obj2);
                    }
                });
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit v(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
                Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
                Intrinsics.checkNotNullParameter(it, "it");
                runIfDirectionsAvailable.m0(it);
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit x(SpacesDashboardFragment spacesDashboardFragment) {
                com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
                androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(spacesDashboardFragment);
                c2 c2VarA = i.a();
                Intrinsics.checkNotNullExpressionValue(c2VarA, "toChat(...)");
                kVar.d(w0VarA, c2VarA, new Function2() { // from class: com.planner5d.library.activity.fragment.spaces.dashboard.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SpacesDashboardFragment.a.C1497a.y((androidx.navigation.w0) obj, (c2) obj2);
                    }
                });
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit y(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
                Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
                Intrinsics.checkNotNullParameter(it, "it");
                runIfDirectionsAvailable.m0(it);
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit z(SpacesDashboardFragment spacesDashboardFragment) {
                spacesDashboardFragment.A();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                m(c0Var, num.intValue());
                return Unit.f312394a;
            }

            @o
            @t(applier = "androidx.compose.ui.UiComposable")
            public final void m(c0 c0Var, int i10) {
                if ((i10 & 3) == 2 && c0Var.d()) {
                    c0Var.u();
                    return;
                }
                if (m0.l0()) {
                    m0.A0(-1880810915, i10, -1, "com.planner5d.library.activity.fragment.spaces.dashboard.SpacesDashboardFragment.composeTopPart.<anonymous>.<anonymous>.<anonymous> (SpacesDashboardFragment.kt:54)");
                }
                com.planner5d.library.widget.preloader.f0.b(androidx.compose.ui.draw.a.a(a0.E, n(bb.c.f77749a.a(this.f136118a, null, c0Var, bb.c.f77750b << 6, 2))), null, c0Var, 0, 2);
                Bitmap bitmap = this.f136119b;
                boolean z10 = this.f136120c;
                c0Var.E(1344386177);
                boolean zK0 = c0Var.k0(this.f136121d);
                final SpacesDashboardFragment spacesDashboardFragment = this.f136121d;
                Object objI0 = c0Var.i0();
                if (zK0 || objI0 == c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: com.planner5d.library.activity.fragment.spaces.dashboard.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SpacesDashboardFragment.a.C1497a.s(spacesDashboardFragment);
                        }
                    };
                    c0Var.Y(objI0);
                }
                Function0 function0 = (Function0) objI0;
                c0Var.A();
                c0Var.E(1344390590);
                boolean zK1 = c0Var.k0(this.f136121d);
                final SpacesDashboardFragment spacesDashboardFragment2 = this.f136121d;
                Object objI1 = c0Var.i0();
                if (zK1 || objI1 == c0.f35327a.a()) {
                    objI1 = new Function0() { // from class: com.planner5d.library.activity.fragment.spaces.dashboard.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SpacesDashboardFragment.a.C1497a.x(spacesDashboardFragment2);
                        }
                    };
                    c0Var.Y(objI1);
                }
                Function0 function1 = (Function0) objI1;
                c0Var.A();
                c0Var.E(1344394814);
                boolean zK2 = c0Var.k0(this.f136121d);
                final SpacesDashboardFragment spacesDashboardFragment3 = this.f136121d;
                Object objI2 = c0Var.i0();
                if (zK2 || objI2 == c0.f35327a.a()) {
                    objI2 = new Function0() { // from class: com.planner5d.library.activity.fragment.spaces.dashboard.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SpacesDashboardFragment.a.C1497a.z(spacesDashboardFragment3);
                        }
                    };
                    c0Var.Y(objI2);
                }
                c0Var.A();
                com.planner5d.library.spaces.view.dashboard.c0.e(bitmap, z10, function0, function1, (Function0) objI2, c0Var, 0, 0);
                if (m0.l0()) {
                    m0.z0();
                }
            }
        }

        a(boolean z10, Bitmap bitmap, boolean z11, SpacesDashboardFragment spacesDashboardFragment) {
            this.f136114a = z10;
            this.f136115b = bitmap;
            this.f136116c = z11;
            this.f136117d = spacesDashboardFragment;
        }

        @o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(821136242, i10, -1, "com.planner5d.library.activity.fragment.spaces.dashboard.SpacesDashboardFragment.composeTopPart.<anonymous>.<anonymous> (SpacesDashboardFragment.kt:53)");
            }
            ab.d.b(w.e(-1880810915, true, new C1497a(this.f136114a, this.f136115b, this.f136116c, this.f136117d), c0Var, 54), c0Var, 6);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    public static final class b extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ id.a f136123i;

        b(id.a aVar) {
            this.f136123i = aVar;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void g(Throwable th2) {
            dispose();
            SpacesDashboardFragment.w(SpacesDashboardFragment.this, null, false, false, 4, null);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            SpacesDashboardFragment spacesDashboardFragment = SpacesDashboardFragment.this;
            id.a aVar = this.f136123i;
            spacesDashboardFragment.v(bitmap, false, aVar != null ? aVar.g() : false);
        }
    }

    static final class c<T> implements kotlinx.coroutines.flow.j {
        c() {
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(id.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            SpacesDashboardFragment.this.y(aVar);
            return Unit.f312394a;
        }
    }

    public SpacesDashboardFragment() {
        t3 t3Var = t3.f229751a;
        this.f136112b = new i2(j1.d(j.class), new t3.c(this), t3.d.f229756a, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        if (!x().X()) {
            z(com.planner5d.library.model.manager.config.purchaseplacement.b.a.profile);
            return;
        }
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(this);
        c2 c2VarB = i.b();
        Intrinsics.checkNotNullExpressionValue(c2VarB, "toComparePlans(...)");
        kVar.d(w0VarA, c2VarB, new Function2() { // from class: com.planner5d.library.activity.fragment.spaces.dashboard.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SpacesDashboardFragment.B((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    private final void u() {
        rd.g gVar = this.f136111a;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gVar = null;
        }
        ComposeView composeView = gVar.f366615c;
        composeView.setViewCompositionStrategy(k4.b.f40602b);
        composeView.setContent(com.planner5d.library.activity.fragment.spaces.dashboard.b.f136125a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Bitmap bitmap, boolean z10, boolean z11) {
        rd.g gVar = this.f136111a;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gVar = null;
            int i10 = 5 << 0;
        }
        ComposeView composeView = gVar.f366616d;
        composeView.setViewCompositionStrategy(k4.b.f40602b);
        composeView.setContent(w.c(821136242, true, new a(z10, bitmap, z11, this)));
    }

    static /* synthetic */ void w(SpacesDashboardFragment spacesDashboardFragment, Bitmap bitmap, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        spacesDashboardFragment.v(bitmap, z10, z11);
    }

    private final j x() {
        return (j) this.f136112b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(id.a aVar) {
        float dimension = getResources().getDimension(com.planner5d.library.f.g.Ph);
        w(this, null, true, false, 4, null);
        j jVarX = x();
        int i10 = (int) dimension;
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f136113c;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        com.planner5d.library.services.bitmaploader.target.a aVarC = hVar.c(new b(aVar));
        Intrinsics.checkNotNullExpressionValue(aVarC, "register(...)");
        jVarX.W(i10, aVarC, aVar);
    }

    private final void z(com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar) {
        ia.b bVarU = x().U();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        bVarU.c(new r(childFragmentManager), aVar, y3.c.profile, null);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f136113c = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        rd.g gVarD = rd.g.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(gVarD, "inflate(...)");
        rd.g gVar = null;
        u1.j2(gVarD.f366616d, new ef.g(0, 1, null));
        this.f136111a = gVarD;
        int i10 = 0 << 0;
        w(this, null, false, false, 4, null);
        u();
        l1.c(l1.f225303a, this, x().V(), null, new c(), 2, null);
        rd.g gVar2 = this.f136111a;
        if (gVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            gVar = gVar2;
        }
        ConstraintLayout root = gVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        y(null);
        rd.g gVar = this.f136111a;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gVar = null;
        }
        u1.j2(gVar.f366616d, new ef.g(0, 1, null));
    }
}
