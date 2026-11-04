package com.planner5d.library.activity.fragment.startup;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.p0;
import com.planner5d.library.model.manager.m2;
import com.planner5d.library.services.o0;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.widget.preloader.PreloaderCoverView;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.z0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nStartupFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupFragment.kt\ncom/planner5d/library/activity/fragment/startup/StartupFragment\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n*L\n1#1,188:1\n12#2,6:189\n28#2:195\n*S KotlinDebug\n*F\n+ 1 StartupFragment.kt\ncom/planner5d/library/activity/fragment/startup/StartupFragment\n*L\n55#1:189,6\n55#1:195\n*E\n"})
public final class StartupFragment extends Fragment implements z0, ff.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.preloader.t f136431a = new com.planner5d.library.widget.preloader.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f136432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f136433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f136434d;

    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k dialogLauncher;

    @ij.a
    public com.planner5d.library.services.p helpDialogFactory;

    @ij.a
    public com.planner5d.library.services.t legalDialogFactory;

    @ij.a
    public m2 notificationPermissionManager;

    @ij.a
    public e oneLinkDeeplinkHandler;

    @ij.a
    public com.planner5d.library.widget.rate.g rateUsManager;

    @ij.a
    public o0 spacesDialogFactory;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f136435a;

        static {
            int[] iArr = new int[m2.a.values().length];
            try {
                iArr[m2.a.REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m2.a.PROCESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m2.a.NOT_REQUESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f136435a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupFragment$onNewIntent$1", f = "StartupFragment.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136436a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f136438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Dialog f136439d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Intent intent, Dialog dialog, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f136438c = intent;
            this.f136439d = dialog;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return StartupFragment.this.new b(this.f136438c, this.f136439d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136436a;
            if (i10 == 0) {
                ResultKt.m(obj);
                e oneLinkDeeplinkHandler = StartupFragment.this.getOneLinkDeeplinkHandler();
                Intent intent = this.f136438c;
                this.f136436a = 1;
                obj = oneLinkDeeplinkHandler.g(intent, true, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                StartupFragment.this.C().m0();
            } else {
                Dialog dialog = this.f136439d;
                if (dialog != null) {
                    dialog.show();
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupFragment$onViewCreated$1$8$1", f = "StartupFragment.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136440a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return StartupFragment.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136440a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.widget.rate.g rateUsManager = StartupFragment.this.getRateUsManager();
                androidx.fragment.app.s sVarRequireActivity = StartupFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
                this.f136440a = 1;
                if (rateUsManager.i(sVarRequireActivity, this) == objL) {
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
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class d implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f136442a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f136442a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f136442a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f136442a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public StartupFragment() {
        t3 t3Var = t3.f229751a;
        this.f136432b = new i2(j1.d(x.class), new t3.c(this), t3.d.f229756a, null, 8, null);
    }

    private final OnboardingSignInDialog B() {
        Fragment fragmentW0 = getChildFragmentManager().w0(OnboardingSignInDialog.FRAGMENT_TAG);
        if (fragmentW0 instanceof OnboardingSignInDialog) {
            return (OnboardingSignInDialog) fragmentW0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x C() {
        return (x) this.f136432b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(StartupFragment startupFragment, x.b bVar) {
        h0 h0VarA = startupFragment.f136431a.a();
        if (bVar instanceof x.b.a) {
            h0VarA.b();
        } else {
            if (!(bVar instanceof x.b.C1500b)) {
                throw new k0();
            }
            x.b.C1500b c1500b = (x.b.C1500b) bVar;
            h0VarA.p(c1500b.b(), c1500b.a());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(StartupFragment startupFragment, com.planner5d.library.services.utility.o oVar) {
        startupFragment.getNotificationPermissionManager().f();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(StartupFragment startupFragment, m2.a aVar) {
        int i10 = aVar == null ? -1 : a.f136435a[aVar.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                startupFragment.M();
            } else if (i10 == 2) {
                startupFragment.L();
                startupFragment.C().o0();
            } else if (i10 != 3) {
                throw new k0();
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(StartupFragment startupFragment, Boolean bool) {
        com.planner5d.library.services.t legalDialogFactory = startupFragment.getLegalDialogFactory();
        FragmentManager childFragmentManager = startupFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        legalDialogFactory.a(childFragmentManager);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(StartupFragment startupFragment, Boolean bool) {
        startupFragment.M();
        new OnboardingSignInDialog().show(startupFragment.getChildFragmentManager(), OnboardingSignInDialog.FRAGMENT_TAG);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(StartupFragment startupFragment, Boolean bool) {
        startupFragment.M();
        o0 spacesDialogFactory = startupFragment.getSpacesDialogFactory();
        FragmentManager childFragmentManager = startupFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        spacesDialogFactory.a(childFragmentManager);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(StartupFragment startupFragment, Boolean bool) {
        startupFragment.M();
        com.planner5d.library.services.p helpDialogFactory = startupFragment.getHelpDialogFactory();
        FragmentManager childFragmentManager = startupFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        helpDialogFactory.b(childFragmentManager);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(StartupFragment startupFragment, Boolean bool) {
        kotlinx.coroutines.k.f(p0.a(startupFragment), null, null, startupFragment.new c(null), 3, null);
        return Unit.f312394a;
    }

    private final void L() {
        Window window;
        h0 h0VarA = this.f136431a.a();
        h0VarA.h(null);
        h0VarA.g(Integer.valueOf(this.f136434d));
        androidx.fragment.app.s activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setStatusBarColor(this.f136434d);
            window.setNavigationBarColor(this.f136434d);
        }
    }

    private final void M() {
        Window window;
        h0 h0VarA = this.f136431a.a();
        h0VarA.h(Integer.valueOf(androidx.core.content.res.i.e(getResources(), com.planner5d.library.f.C1549f.qn, null)));
        h0VarA.g(Integer.valueOf(this.f136433c));
        androidx.fragment.app.s activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(this.f136433c);
        window.setNavigationBarColor(this.f136433c);
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k getDialogLauncher() {
        com.planner5d.library.activity.fragment.dialog.k kVar = this.dialogLauncher;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final com.planner5d.library.services.p getHelpDialogFactory() {
        com.planner5d.library.services.p pVar = this.helpDialogFactory;
        if (pVar != null) {
            return pVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helpDialogFactory");
        return null;
    }

    @NotNull
    public final com.planner5d.library.services.t getLegalDialogFactory() {
        com.planner5d.library.services.t tVar = this.legalDialogFactory;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("legalDialogFactory");
        return null;
    }

    @NotNull
    public final m2 getNotificationPermissionManager() {
        m2 m2Var = this.notificationPermissionManager;
        if (m2Var != null) {
            return m2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationPermissionManager");
        return null;
    }

    @NotNull
    public final e getOneLinkDeeplinkHandler() {
        e eVar = this.oneLinkDeeplinkHandler;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("oneLinkDeeplinkHandler");
        return null;
    }

    @NotNull
    public final com.planner5d.library.widget.rate.g getRateUsManager() {
        com.planner5d.library.widget.rate.g gVar = this.rateUsManager;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rateUsManager");
        return null;
    }

    @NotNull
    public final o0 getSpacesDialogFactory() {
        o0 o0Var = this.spacesDialogFactory;
        if (o0Var != null) {
            return o0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("spacesDialogFactory");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        com.planner5d.library.application.b.f142455c.a().X1(this);
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        OnboardingSignInDialog onboardingSignInDialogB = B();
        if (onboardingSignInDialogB != null) {
            return onboardingSignInDialogB.onBackPressed();
        }
        return false;
    }

    @Override // com.planner5d.library.widget.z0
    public void onChildDialogDismiss(@Nullable androidx.fragment.app.m mVar) {
        if (getLegalDialogFactory().b(mVar)) {
            C().l0();
            return;
        }
        if (mVar instanceof OnboardingSignInDialog) {
            C().m0();
            return;
        }
        if (getSpacesDialogFactory().b(mVar)) {
            C().k0();
        } else if (getHelpDialogFactory().a(mVar)) {
            C().j0();
            L();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        m2 notificationPermissionManager = getNotificationPermissionManager();
        androidx.fragment.app.s sVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        notificationPermissionManager.d(sVarRequireActivity);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        PreloaderCoverView preloaderCoverView = new PreloaderCoverView(requireContext());
        this.f136431a.b(preloaderCoverView);
        this.f136433c = androidx.core.content.res.i.e(preloaderCoverView.getResources(), com.planner5d.library.f.C1549f.Xn, null);
        this.f136434d = androidx.core.content.res.i.e(preloaderCoverView.getResources(), com.planner5d.library.f.C1549f.Mh, null);
        preloaderCoverView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return preloaderCoverView;
    }

    public final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        OnboardingSignInDialog onboardingSignInDialogB = B();
        Dialog dialog = onboardingSignInDialogB != null ? onboardingSignInDialogB.getDialog() : null;
        if (dialog != null) {
            dialog.hide();
        }
        kotlinx.coroutines.k.f(p0.a(this), null, null, new b(intent, dialog, null), 3, null);
    }

    @Override // ff.a
    public void onOnboardingStepComplete() {
        C().j0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C().a0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        x xVarC = C();
        xVarC.i0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.startup.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StartupFragment.D(this.f136496a, (x.b) obj);
            }
        }));
        xVarC.b0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.startup.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StartupFragment.E(this.f136497a, (com.planner5d.library.services.utility.o) obj);
            }
        }));
        androidx.lifecycle.w.g(getNotificationPermissionManager().b(), null, 0L, 3, null).k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.startup.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StartupFragment.F(this.f136498a, (m2.a) obj);
            }
        }));
        v1.a<Boolean> aVarD0 = xVarC.d0();
        androidx.lifecycle.o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        aVarD0.k(viewLifecycleOwner, new d(new Function1() { // from class: com.planner5d.library.activity.fragment.startup.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StartupFragment.G(this.f136499a, (Boolean) obj);
            }
        }));
        v1.a<Boolean> aVarG0 = xVarC.g0();
        androidx.lifecycle.o0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        aVarG0.k(viewLifecycleOwner2, new d(new Function1() { // from class: com.planner5d.library.activity.fragment.startup.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StartupFragment.H(this.f136500a, (Boolean) obj);
            }
        }));
        v1.a<Boolean> aVarH0 = xVarC.h0();
        androidx.lifecycle.o0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        aVarH0.k(viewLifecycleOwner3, new d(new Function1() { // from class: com.planner5d.library.activity.fragment.startup.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StartupFragment.I(this.f136501a, (Boolean) obj);
            }
        }));
        v1.a<Boolean> aVarC0 = xVarC.c0();
        androidx.lifecycle.o0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        aVarC0.k(viewLifecycleOwner4, new d(new Function1() { // from class: com.planner5d.library.activity.fragment.startup.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StartupFragment.J(this.f136502a, (Boolean) obj);
            }
        }));
        v1.a<Boolean> aVarF0 = xVarC.f0();
        androidx.lifecycle.o0 viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        aVarF0.k(viewLifecycleOwner5, new d(new Function1() { // from class: com.planner5d.library.activity.fragment.startup.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StartupFragment.K(this.f136503a, (Boolean) obj);
            }
        }));
    }

    public final void setDialogLauncher(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setHelpDialogFactory(@NotNull com.planner5d.library.services.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.helpDialogFactory = pVar;
    }

    public final void setLegalDialogFactory(@NotNull com.planner5d.library.services.t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.legalDialogFactory = tVar;
    }

    public final void setNotificationPermissionManager(@NotNull m2 m2Var) {
        Intrinsics.checkNotNullParameter(m2Var, "<set-?>");
        this.notificationPermissionManager = m2Var;
    }

    public final void setOneLinkDeeplinkHandler(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.oneLinkDeeplinkHandler = eVar;
    }

    public final void setRateUsManager(@NotNull com.planner5d.library.widget.rate.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.rateUsManager = gVar;
    }

    public final void setSpacesDialogFactory(@NotNull o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<set-?>");
        this.spacesDialogFactory = o0Var;
    }
}
