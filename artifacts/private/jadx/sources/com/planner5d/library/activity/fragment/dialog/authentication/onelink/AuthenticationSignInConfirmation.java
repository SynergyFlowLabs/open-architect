package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.l2;
import androidx.lifecycle.o0;
import androidx.navigation.c2;
import androidx.navigation.h0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.dialog.authentication.e1;
import com.planner5d.library.activity.fragment.dialog.authentication.n1;
import com.planner5d.library.activity.fragment.dialog.authentication.q1;
import com.planner5d.library.databinding.g0;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.services.utility.t3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAuthenticationSignInConfirmation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationSignInConfirmation.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/onelink/AuthenticationSignInConfirmation\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,95:1\n17#2:96\n28#2:97\n17#2:98\n28#2:99\n42#3,3:100\n774#4:103\n865#4,2:104\n257#5,2:106\n257#5,2:108\n257#5,2:125\n299#5,2:127\n257#5,2:129\n55#6,12:110\n84#6,3:122\n*S KotlinDebug\n*F\n+ 1 AuthenticationSignInConfirmation.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/onelink/AuthenticationSignInConfirmation\n*L\n25#1:96\n25#1:97\n26#1:98\n26#1:99\n28#1:100,3\n33#1:103\n33#1:104,2\n34#1:106,2\n35#1:108,2\n58#1:125,2\n62#1:127,2\n64#1:129,2\n84#1:110,12\n84#1:122,3\n*E\n"})
public final class AuthenticationSignInConfirmation extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f131832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f131833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g0 f131834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h0 f131835d;

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
            androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(AuthenticationSignInConfirmation.this);
            j.b bVarB = j.b(service, AuthenticationSignInConfirmation.this.z().c(), AuthenticationSignInConfirmation.this.z().d());
            Intrinsics.checkNotNullExpressionValue(bVarB, "toExternalServices(...)");
            kVar.d(w0VarA, bVarB, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AuthenticationSignInConfirmation.a.c((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
            AuthenticationSignInConfirmation.this.A().Z(service);
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 AuthenticationSignInConfirmation.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/onelink/AuthenticationSignInConfirmation\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n85#2,2:83\n59#3:85\n62#4:86\n*E\n"})
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AuthenticationSignInConfirmation authenticationSignInConfirmation = AuthenticationSignInConfirmation.this;
            authenticationSignInConfirmation.I(authenticationSignInConfirmation.B().h0(StringsKt.E5(String.valueOf(editable)).toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public static final class c implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f131838a;

        public c(Fragment fragment) {
            this.f131838a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f131838a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f131838a + " has null arguments");
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 AuthenticationSignInConfirmation.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/onelink/AuthenticationSignInConfirmation\n*L\n1#1,28:1\n25#2:29\n*E\n"})
    public static final class d implements Function0<l2> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            Fragment fragmentRequireParentFragment = AuthenticationSignInConfirmation.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment.getViewModelStore();
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 AuthenticationSignInConfirmation.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/onelink/AuthenticationSignInConfirmation\n*L\n1#1,28:1\n26#2:29\n*E\n"})
    public static final class e implements Function0<l2> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            Fragment fragmentRequireParentFragment = AuthenticationSignInConfirmation.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment.getViewModelStore();
        }
    }

    public AuthenticationSignInConfirmation() {
        t3 t3Var = t3.f229751a;
        t3.d dVar = t3.d.f229756a;
        this.f131832a = new i2(j1.d(e1.class), new d(), dVar, null, 8, null);
        this.f131833b = new i2(j1.d(l.class), new e(), dVar, null, 8, null);
        this.f131835d = new h0(j1.d(h.class), new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e1 A() {
        return (e1) this.f131832a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l B() {
        return (l) this.f131833b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(AuthenticationSignInConfirmation authenticationSignInConfirmation, l.a aVar) {
        if (aVar instanceof l.a.C1449a) {
            com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
            androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(authenticationSignInConfirmation);
            l.a.C1449a c1449a = (l.a.C1449a) aVar;
            j.a aVarA = j.a(c1449a.b(), c1449a.a(), authenticationSignInConfirmation.z().c(), authenticationSignInConfirmation.z().d());
            Intrinsics.checkNotNullExpressionValue(aVarA, "toEnterCode(...)");
            kVar.d(w0VarA, aVarA, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AuthenticationSignInConfirmation.D((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
        } else {
            if (!(aVar instanceof l.a.b)) {
                if ((aVar instanceof l.a.c) || aVar == null) {
                    return Unit.f312394a;
                }
                throw new k0();
            }
            com.planner5d.library.util.navigation.k kVar2 = com.planner5d.library.util.navigation.k.f240224a;
            androidx.navigation.w0 w0VarA2 = androidx.navigation.fragment.f.a(authenticationSignInConfirmation);
            j.c cVarC = j.c(((l.a.b) aVar).a().i().toString());
            Intrinsics.checkNotNullExpressionValue(cVarC, "toPrivacyAgreement(...)");
            kVar2.d(w0VarA2, cVarC, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AuthenticationSignInConfirmation.E((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
        }
        authenticationSignInConfirmation.B().d0();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(g0 g0Var, boolean z10) {
        g0Var.f158991c.setEnabled(!z10);
        ProgressBar authenticationSignInSpinner = g0Var.f158994f;
        Intrinsics.checkNotNullExpressionValue(authenticationSignInSpinner, "authenticationSignInSpinner");
        authenticationSignInSpinner.setVisibility(z10 ? 0 : 8);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(g0 g0Var, String str) {
        if (str == null || str.length() == 0) {
            TextView error = g0Var.f158996h;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            error.setVisibility(8);
        } else {
            TextView error2 = g0Var.f158996h;
            Intrinsics.checkNotNullExpressionValue(error2, "error");
            error2.setVisibility(0);
            g0Var.f158996h.setText(str);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(AuthenticationSignInConfirmation authenticationSignInConfirmation, g0 g0Var, View view) {
        l lVarB = authenticationSignInConfirmation.B();
        Editable text = g0Var.f158993e.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        String string = StringsKt.E5(text).toString();
        Boolean boolD = authenticationSignInConfirmation.z().d();
        Intrinsics.checkNotNullExpressionValue(boolD, "getSignup(...)");
        lVarB.g0(string, boolD.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(boolean z10) {
        g0 g0Var = this.f131834c;
        g0 g0Var2 = null;
        if (g0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g0Var = null;
        }
        g0Var.f158995g.setEnabled(z10);
        g0 g0Var3 = this.f131834c;
        if (g0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g0Var2 = g0Var3;
        }
        g0Var2.f158992d.setEnabled(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final h z() {
        return (h) this.f131835d.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final g0 g0VarD = g0.d(getLayoutInflater(), viewGroup, false);
        this.f131834c = g0VarD;
        List<SocialAuthType> listV = A().V();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listV) {
            if (((SocialAuthType) obj) != SocialAuthType.Code) {
                arrayList.add(obj);
            }
        }
        RecyclerView authenticationSignInByService = g0VarD.f158990b;
        Intrinsics.checkNotNullExpressionValue(authenticationSignInByService, "authenticationSignInByService");
        authenticationSignInByService.setVisibility(!arrayList.isEmpty() && !z().d().booleanValue() ? 0 : 8);
        TextView or = g0VarD.f158997i;
        Intrinsics.checkNotNullExpressionValue(or, "or");
        or.setVisibility(z().d().booleanValue() ? 8 : 0);
        g0VarD.f158998j.setText(getString(z().d().booleanValue() ? com.planner5d.library.f.s.Fv : com.planner5d.library.f.s.Pv));
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        com.planner5d.library.services.utility.n1.a(viewLifecycleOwner, B().b0(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AuthenticationSignInConfirmation.C(this.f131858a, (l.a) obj2);
            }
        });
        o0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        com.planner5d.library.services.utility.n1.a(viewLifecycleOwner2, B().a0(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AuthenticationSignInConfirmation.F(g0VarD, ((Boolean) obj2).booleanValue());
            }
        });
        o0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        com.planner5d.library.services.utility.n1.a(viewLifecycleOwner3, B().Z(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AuthenticationSignInConfirmation.G(g0VarD, (String) obj2);
            }
        });
        g0VarD.f158990b.setAdapter(new q1(arrayList, new a()));
        g0VarD.f158990b.setNestedScrollingEnabled(false);
        I(false);
        g0VarD.f158991c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationSignInConfirmation.H(this.f131864a, g0VarD, view);
            }
        });
        EditText authenticationSignInEmail = g0VarD.f158993e;
        Intrinsics.checkNotNullExpressionValue(authenticationSignInEmail, "authenticationSignInEmail");
        authenticationSignInEmail.addTextChangedListener(new b());
        NestedScrollView root = g0VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
