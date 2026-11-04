package com.planner5d.library.activity.fragment.dialog.authentication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.l2;
import androidx.navigation.c2;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.services.utility.r3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.services.utility.y3;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAuthenticationExternalService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationExternalService.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/AuthenticationExternalService\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 4 ViewUtils.kt\ncom/planner5d/library/services/utility/ViewUtils\n*L\n1#1,87:1\n42#2,3:88\n17#3:91\n28#3:92\n190#4,12:93\n*S KotlinDebug\n*F\n+ 1 AuthenticationExternalService.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/AuthenticationExternalService\n*L\n33#1:88,3\n34#1:91\n34#1:92\n81#1:93,12\n*E\n"})
public final class AuthenticationExternalService extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.navigation.h0 f131723a = new androidx.navigation.h0(kotlin.jvm.internal.j1.d(u.class), new a(this));

    @ij.a
    public com.planner5d.library.modules.user.user.b actionAfterLogInStandard;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f131724b;

    @ij.a
    public com.planner5d.library.modules.user.auth.r socialServiceAuthorization;

    public static final class a implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f131725a;

        public a(Fragment fragment) {
            this.f131725a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f131725a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f131725a + " has null arguments");
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 AuthenticationExternalService.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/AuthenticationExternalService\n*L\n1#1,28:1\n34#2:29\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return AuthenticationExternalService.this.getViewModelStore();
        }
    }

    public AuthenticationExternalService() {
        t3 t3Var = t3.f229751a;
        this.f131724b = new i2(kotlin.jvm.internal.j1.d(y.class), new b(), t3.d.f229756a, null, 8, null);
        com.planner5d.library.application.b.f142455c.a().V0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(AuthenticationExternalService authenticationExternalService, boolean z10, y.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof y.a.c) {
            com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
            androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(authenticationExternalService);
            w.a aVarA = w.a(((y.a.c) state).a().i().toString());
            Intrinsics.checkNotNullExpressionValue(aVarA, "externalServicesToAgreements(...)");
            kVar.d(w0VarA, aVarA, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AuthenticationExternalService.B((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
        } else if (state instanceof y.a.C1453a) {
            com.planner5d.library.util.navigation.k kVar2 = com.planner5d.library.util.navigation.k.f240224a;
            androidx.navigation.w0 w0VarA2 = androidx.navigation.fragment.f.a(authenticationExternalService);
            w.b bVarB = w.b(((y.a.C1453a) state).a(), Boolean.valueOf(z10));
            Intrinsics.checkNotNullExpressionValue(bVarB, "externalServicesToError(...)");
            kVar2.d(w0VarA2, bVarB, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AuthenticationExternalService.C((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
        } else {
            if (!(state instanceof y.a.b)) {
                throw new kotlin.k0();
            }
            if (z10) {
                authenticationExternalService.getActionAfterLogInStandard().a();
            } else {
                y3 y3Var = y3.f229862a;
                View view = authenticationExternalService.getView();
                ViewParent viewParent = null;
                ViewParent parent = view != null ? view.getParent() : null;
                while (true) {
                    if (parent instanceof ff.a) {
                        viewParent = parent;
                        break;
                    }
                    parent = parent != null ? parent.getParent() : null;
                    if (parent == null) {
                        timber.log.b.f381052a.e(new RuntimeException("Expected parent not found"));
                        break;
                    }
                }
                ff.a aVar = (ff.a) viewParent;
                if (aVar != null) {
                    aVar.onOnboardingStepComplete();
                }
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final u x() {
        return (u) this.f131723a.getValue();
    }

    private final y y() {
        return (y) this.f131724b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(AuthenticationExternalService authenticationExternalService, com.planner5d.library.services.utility.o it) {
        Pair<? extends SocialAuthType, Result<com.planner5d.library.modules.user.auth.k>> pair;
        Intrinsics.checkNotNullParameter(it, "it");
        r3 r3VarA = it.a();
        if (r3VarA != null && (pair = (Pair) r3VarA.a()) != null) {
            authenticationExternalService.y().W(pair);
        }
        return Unit.f312394a;
    }

    @NotNull
    public final com.planner5d.library.modules.user.user.b getActionAfterLogInStandard() {
        com.planner5d.library.modules.user.user.b bVar = this.actionAfterLogInStandard;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("actionAfterLogInStandard");
        return null;
    }

    @NotNull
    public final com.planner5d.library.modules.user.auth.r getSocialServiceAuthorization() {
        com.planner5d.library.modules.user.auth.r rVar = this.socialServiceAuthorization;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("socialServiceAuthorization");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(com.planner5d.library.f.m.f168760m1, viewGroup, false);
        new com.planner5d.library.widget.preloader.t(viewInflate).a().h(Integer.valueOf(androidx.core.content.d.g(viewInflate.getContext(), com.planner5d.library.f.C1549f.Rn))).g(Integer.valueOf(androidx.core.content.d.g(viewInflate.getContext(), com.planner5d.library.f.C1549f.Pn))).a(com.planner5d.library.f.s.ZD, true);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Boolean boolC = x().c();
        Intrinsics.checkNotNullExpressionValue(boolC, "getFromProfile(...)");
        final boolean zBooleanValue = boolC.booleanValue();
        com.planner5d.library.modules.user.auth.r socialServiceAuthorization = getSocialServiceAuthorization();
        androidx.fragment.app.s sVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        SocialAuthType socialAuthTypeE = x().e();
        Intrinsics.checkNotNullExpressionValue(socialAuthTypeE, "getType(...)");
        socialServiceAuthorization.j(sVarRequireActivity, socialAuthTypeE, x().d().booleanValue() ? k3.a.sign_up : k3.a.sign_in);
        com.planner5d.library.services.utility.n1.a(this, getSocialServiceAuthorization().h(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationExternalService.z(this.f131995a, (com.planner5d.library.services.utility.o) obj);
            }
        });
        com.planner5d.library.services.utility.n1.a(this, y().X(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationExternalService.A(this.f131996a, zBooleanValue, (y.a) obj);
            }
        });
    }

    public final void setActionAfterLogInStandard(@NotNull com.planner5d.library.modules.user.user.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.actionAfterLogInStandard = bVar;
    }

    public final void setSocialServiceAuthorization(@NotNull com.planner5d.library.modules.user.auth.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.socialServiceAuthorization = rVar;
    }
}
