package com.planner5d.library.activity.fragment.dialog.authentication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.navigation.c2;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.TextInputEditTextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAuthenticationForgotPassword.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationForgotPassword.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/AuthenticationForgotPassword\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,60:1\n12#2,6:61\n28#2:67\n257#3,2:68\n257#3,2:70\n*S KotlinDebug\n*F\n+ 1 AuthenticationForgotPassword.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/AuthenticationForgotPassword\n*L\n24#1:61,6\n24#1:67\n42#1:68,2\n47#1:70,2\n*E\n"})
public final class AuthenticationForgotPassword extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f131727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.databinding.c0 f131728b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131729a;

        static {
            int[] iArr = new int[f0.a.values().length];
            try {
                iArr[f0.a.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.a.RemindInProgress.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f0.a.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f131729a = iArr;
        }
    }

    public AuthenticationForgotPassword() {
        t3 t3Var = t3.f229751a;
        this.f131727a = new i2(kotlin.jvm.internal.j1.d(f0.class), new t3.c(this), t3.d.f229756a, null, 8, null);
    }

    private final f0 w() {
        return (f0) this.f131727a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(AuthenticationForgotPassword authenticationForgotPassword, com.planner5d.library.services.o oVar, View view) {
        authenticationForgotPassword.w().X(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(com.planner5d.library.databinding.c0 c0Var, AuthenticationForgotPassword authenticationForgotPassword, f0.a aVar) {
        int i10 = aVar == null ? -1 : a.f131729a[aVar.ordinal()];
        if (i10 == 1) {
            c0Var.f158785e.setEnabled(true);
            ProgressBar authenticationForgotPasswordSpinner = c0Var.f158787g;
            Intrinsics.checkNotNullExpressionValue(authenticationForgotPasswordSpinner, "authenticationForgotPasswordSpinner");
            authenticationForgotPasswordSpinner.setVisibility(8);
        } else if (i10 == 2) {
            c0Var.f158785e.setEnabled(false);
            ProgressBar authenticationForgotPasswordSpinner2 = c0Var.f158787g;
            Intrinsics.checkNotNullExpressionValue(authenticationForgotPasswordSpinner2, "authenticationForgotPasswordSpinner");
            authenticationForgotPasswordSpinner2.setVisibility(0);
        } else {
            if (i10 != 3) {
                throw new kotlin.k0();
            }
            com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
            androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(authenticationForgotPassword);
            c2 c2VarA = e0.a();
            Intrinsics.checkNotNullExpressionValue(c2VarA, "toRemindPasswordSuccess(...)");
            kVar.d(w0VarA, c2VarA, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AuthenticationForgotPassword.z((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final com.planner5d.library.databinding.c0 c0VarA = com.planner5d.library.databinding.c0.a(inflater.inflate(com.planner5d.library.f.m.f168771n1, viewGroup, false));
        Intrinsics.checkNotNullExpressionValue(c0VarA, "bind(...)");
        TextInputEditTextCompat textInputEditTextCompat = c0VarA.f158782b;
        textInputEditTextCompat.setImeOptions(301989888);
        Context context = textInputEditTextCompat.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textInputEditTextCompat.i(new com.planner5d.library.services.q0.f(context));
        Context context2 = textInputEditTextCompat.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textInputEditTextCompat.i(new com.planner5d.library.services.q0.a(context2));
        final com.planner5d.library.services.o oVar = new com.planner5d.library.services.o(c0VarA.f158782b);
        c0VarA.f158785e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationForgotPassword.x(this.f131744a, oVar, view);
            }
        });
        com.planner5d.library.services.utility.n1.a(this, w().W(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationForgotPassword.y(c0VarA, this, (f0.a) obj);
            }
        });
        this.f131728b = c0VarA;
        NestedScrollView root = c0VarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
