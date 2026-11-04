package com.planner5d.library.activity.fragment.startup;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.k2;
import androidx.fragment.app.FragmentManager;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.widget.preloader.PreloaderCoverView;
import com.planner5d.library.widget.z0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nStartupPaywall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupPaywall.kt\ncom/planner5d/library/activity/fragment/startup/StartupPaywall\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,126:1\n257#2,2:127\n*S KotlinDebug\n*F\n+ 1 StartupPaywall.kt\ncom/planner5d/library/activity/fragment/startup/StartupPaywall\n*L\n120#1:127,2\n*E\n"})
public final class StartupPaywall extends FragmentController implements com.planner5d.library.activity.helper.ui.a, z0 {
    public static final int $stable = 8;

    @ij.a
    public f1 coroutineScope;

    @ij.a
    public com.planner5d.library.activity.fragment.n defaultFragmentProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.preloader.t f136443e = new com.planner5d.library.widget.preloader.t();

    @ij.a
    public com.planner5d.library.model.manager.config.j featureConfigManager;

    @ij.a
    public y1 menuManager;

    @ij.a
    public ia.b paywallStrategy;

    @ij.a
    public com.planner5d.library.model.manager.config.p preferences;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupPaywall$onChildDialogDismiss$1", f = "StartupPaywall.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136444a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return StartupPaywall.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136444a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p preferences = StartupPaywall.this.getPreferences();
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.onboardingPaywallClosed;
                this.f136444a = 1;
                if (preferences.L(rVar, true, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            com.planner5d.library.activity.fragment.x.g(((FragmentController) StartupPaywall.this).f131538b, new com.planner5d.library.activity.helper.event.content.d(StartupPaywall.this.getFeatureConfigManager().a(com.planner5d.library.model.manager.config.f.ProjectsScreenFirstSession) ? ProjectsPagesFragment.class : StartupPaywall.this.getDefaultFragmentProvider().a(), new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.floorPlansList).a()), false, 2, null);
            StartupPaywall.this.z();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupPaywall$onViewCreatedExtended$1", f = "StartupPaywall.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160717p0}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136446a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            int i10 = 4 ^ 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return StartupPaywall.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136446a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p preferences = StartupPaywall.this.getPreferences();
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.onboardingPaywallDisplayed;
                this.f136446a = 1;
                if (preferences.L(rVar, true, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private final void A() {
        com.planner5d.library.application.b.f142455c.a().v(this);
        z();
        ia.b paywallStrategy = getPaywallStrategy();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        paywallStrategy.b(new com.planner5d.library.activity.fragment.dialog.r(childFragmentManager), com.planner5d.library.model.manager.config.purchaseplacement.b.a.onboarding, y3.c.onboarding, null, new Function1() { // from class: com.planner5d.library.activity.fragment.startup.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StartupPaywall.B(this.f136529a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(StartupPaywall startupPaywall, boolean z10) {
        startupPaywall.onChildDialogDismiss(null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        View viewFindViewById;
        androidx.fragment.app.s activity = getActivity();
        if (activity == null || (viewFindViewById = activity.findViewById(com.planner5d.library.f.j.J7)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    @NotNull
    public final f1 getCoroutineScope() {
        f1 f1Var = this.coroutineScope;
        if (f1Var != null) {
            return f1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.n getDefaultFragmentProvider() {
        com.planner5d.library.activity.fragment.n nVar = this.defaultFragmentProvider;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("defaultFragmentProvider");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.config.j getFeatureConfigManager() {
        com.planner5d.library.model.manager.config.j jVar = this.featureConfigManager;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureConfigManager");
        return null;
    }

    @NotNull
    public final y1 getMenuManager() {
        y1 y1Var = this.menuManager;
        if (y1Var != null) {
            return y1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuManager");
        return null;
    }

    @NotNull
    public final ia.b getPaywallStrategy() {
        ia.b bVar = this.paywallStrategy;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paywallStrategy");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.config.p getPreferences() {
        com.planner5d.library.model.manager.config.p pVar = this.preferences;
        if (pVar != null) {
            return pVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("preferences");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).F(false).N(false).w(false).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.widget.z0
    public void onChildDialogDismiss(@Nullable androidx.fragment.app.m mVar) {
        kotlinx.coroutines.k.f(getCoroutineScope(), com.planner5d.library.services.utility.s.f229729a.a(), null, new a(null), 2, null);
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            Window window = ((Activity) context).getWindow();
            k2.c(window, false);
            int iG = androidx.core.content.d.g(window.getContext(), com.planner5d.library.f.C1549f.Mh);
            window.setStatusBarColor(iG);
            window.setNavigationBarColor(iG);
        }
        PreloaderCoverView preloaderCoverView = new PreloaderCoverView(requireContext());
        this.f136443e.b(preloaderCoverView);
        this.f136443e.a().p(getString(com.planner5d.library.f.s.ND), true);
        preloaderCoverView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        A();
        return preloaderCoverView;
    }

    public final void setCoroutineScope(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<set-?>");
        this.coroutineScope = f1Var;
    }

    public final void setDefaultFragmentProvider(@NotNull com.planner5d.library.activity.fragment.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.defaultFragmentProvider = nVar;
    }

    public final void setFeatureConfigManager(@NotNull com.planner5d.library.model.manager.config.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.featureConfigManager = jVar;
    }

    public final void setMenuManager(@NotNull y1 y1Var) {
        Intrinsics.checkNotNullParameter(y1Var, "<set-?>");
        this.menuManager = y1Var;
    }

    public final void setPaywallStrategy(@NotNull ia.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.paywallStrategy = bVar;
    }

    public final void setPreferences(@NotNull com.planner5d.library.model.manager.config.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.preferences = pVar;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void w(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        kotlinx.coroutines.k.f(getCoroutineScope(), com.planner5d.library.services.utility.s.f229729a.a(), null, new b(null), 2, null);
    }
}
