package com.planner5d.library.activity.fragment.dialog.authentication;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.l2;
import androidx.navigation.c2;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.TextInputEditTextCompat;
import com.planner5d.library.widget.textview.TextViewWithLine;
import java.util.List;
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
@SourceDebugExtension({"SMAP\nAuthenticationSignIn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationSignIn.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/AuthenticationSignIn\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,102:1\n12#2,6:103\n28#2:109\n17#2:110\n28#2:111\n257#3,2:112\n257#3,2:114\n257#3,2:116\n*S KotlinDebug\n*F\n+ 1 AuthenticationSignIn.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/AuthenticationSignIn\n*L\n25#1:103,6\n25#1:109\n26#1:110\n26#1:111\n66#1:112,2\n79#1:114,2\n87#1:116,2\n*E\n"})
public final class AuthenticationSignIn extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f131730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f131731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.databinding.f0 f131732c;

    public static final class a implements n1.a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
            Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
            Intrinsics.checkNotNullParameter(it, "it");
            runIfDirectionsAvailable.m0(it);
            return Unit.f312394a;
        }

        @Override // com.planner5d.library.activity.fragment.dialog.authentication.n1.a
        public void a(SocialAuthType service) {
            Intrinsics.checkNotNullParameter(service, "service");
            com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
            androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(AuthenticationSignIn.this);
            t0.b bVarB = t0.b(service, Boolean.TRUE, Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarB, "toExternalServices(...)");
            kVar.d(w0VarA, bVarB, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.s0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AuthenticationSignIn.a.c((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
            AuthenticationSignIn.this.D().Z(service);
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 AuthenticationSignIn.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/AuthenticationSignIn\n*L\n1#1,28:1\n26#2:29\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            Fragment fragmentRequireParentFragment = AuthenticationSignIn.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment.getViewModelStore();
        }
    }

    public AuthenticationSignIn() {
        t3 t3Var = t3.f229751a;
        t3.d dVar = t3.d.f229756a;
        this.f131730a = new i2(kotlin.jvm.internal.j1.d(v0.class), new t3.c(this), dVar, null, 8, null);
        this.f131731b = new i2(kotlin.jvm.internal.j1.d(e1.class), new b(), dVar, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e1 D() {
        return (e1) this.f131731b.getValue();
    }

    private final v0 E() {
        return (v0) this.f131730a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(com.planner5d.library.databinding.f0 f0Var, Boolean bool) {
        f0Var.f158937c.setEnabled(!bool.booleanValue());
        ProgressBar authenticationSignInSpinner = f0Var.f158947m;
        Intrinsics.checkNotNullExpressionValue(authenticationSignInSpinner, "authenticationSignInSpinner");
        authenticationSignInSpinner.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(AuthenticationSignIn authenticationSignIn, v0.a aVar) {
        if (!(aVar instanceof v0.a.C1452a)) {
            throw new kotlin.k0();
        }
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(authenticationSignIn);
        t0.c cVarD = t0.d(((v0.a.C1452a) aVar).a().i().toString());
        Intrinsics.checkNotNullExpressionValue(cVarD, "toPrivacyAgreement(...)");
        kVar.d(w0VarA, cVarD, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.p0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AuthenticationSignIn.H((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(AuthenticationSignIn authenticationSignIn, View view) {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(authenticationSignIn);
        c2 c2VarC = t0.c();
        Intrinsics.checkNotNullExpressionValue(c2VarC, "toForgotPassword(...)");
        kVar.d(w0VarA, c2VarC, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.r0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AuthenticationSignIn.J((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        com.planner5d.library.model.manager.statistics.events.n.f217157b.E1();
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(com.planner5d.library.databinding.f0 f0Var, AuthenticationSignIn authenticationSignIn, com.planner5d.library.services.o oVar) {
        f0Var.getRoot().requestFocus();
        authenticationSignIn.E().d0(oVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L(Function0 function0, TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(AuthenticationSignIn authenticationSignIn, View view) {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(authenticationSignIn);
        c2 c2VarE = t0.e();
        Intrinsics.checkNotNullExpressionValue(c2VarE, "toSignUp(...)");
        kVar.d(w0VarA, c2VarE, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.q0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AuthenticationSignIn.O((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i10 = 0;
        final com.planner5d.library.databinding.f0 f0VarA = com.planner5d.library.databinding.f0.a(inflater.inflate(com.planner5d.library.f.m.f168804q1, viewGroup, false));
        Intrinsics.checkNotNullExpressionValue(f0VarA, "bind(...)");
        f0VarA.f158943i.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationSignIn.I(this.f131793a, view);
            }
        });
        final com.planner5d.library.services.o oVar = new com.planner5d.library.services.o(f0VarA.f158941g, f0VarA.f158945k);
        TextInputEditTextCompat textInputEditTextCompat = f0VarA.f158941g;
        Context context = textInputEditTextCompat.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textInputEditTextCompat.i(new com.planner5d.library.services.q0.f(context));
        Context context2 = textInputEditTextCompat.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textInputEditTextCompat.i(new com.planner5d.library.services.q0.a(context2));
        final Function0 function0 = new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AuthenticationSignIn.K(f0VarA, this, oVar);
            }
        };
        TextInputEditTextCompat textInputEditTextCompat2 = f0VarA.f158945k;
        textInputEditTextCompat2.setInputType(129);
        Context context3 = textInputEditTextCompat2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textInputEditTextCompat2.i(new com.planner5d.library.services.q0.f(context3));
        textInputEditTextCompat2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.k0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                return AuthenticationSignIn.L(function0, textView, i11, keyEvent);
            }
        });
        f0VarA.f158937c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationSignIn.M(function0, view);
            }
        });
        List<SocialAuthType> listV = D().V();
        RecyclerView authenticationSignInByService = f0VarA.f158936b;
        Intrinsics.checkNotNullExpressionValue(authenticationSignInByService, "authenticationSignInByService");
        List<SocialAuthType> list = listV;
        authenticationSignInByService.setVisibility(!list.isEmpty() ? 0 : 8);
        f0VarA.f158936b.setAdapter(new n1(listV, new a()));
        f0VarA.f158936b.setNestedScrollingEnabled(false);
        TextViewWithLine authenticationSignInOrLabel = f0VarA.f158944j;
        Intrinsics.checkNotNullExpressionValue(authenticationSignInOrLabel, "authenticationSignInOrLabel");
        if (list.isEmpty()) {
            i10 = 8;
        }
        authenticationSignInOrLabel.setVisibility(i10);
        f0VarA.f158939e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationSignIn.N(this.f131819a, view);
            }
        });
        com.planner5d.library.services.utility.n1.a(this, E().Z(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationSignIn.F(f0VarA, (Boolean) obj);
            }
        });
        com.planner5d.library.services.utility.n1.a(this, E().a0(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationSignIn.G(this.f131829a, (v0.a) obj);
            }
        });
        this.f131732c = f0VarA;
        NestedScrollView root = f0VarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
