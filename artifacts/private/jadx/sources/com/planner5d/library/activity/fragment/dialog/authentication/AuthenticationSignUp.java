package com.planner5d.library.activity.fragment.dialog.authentication;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.TextInputEditTextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAuthenticationSignUp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationSignUp.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/AuthenticationSignUp\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,64:1\n12#2,6:65\n28#2:71\n257#3,2:72\n*S KotlinDebug\n*F\n+ 1 AuthenticationSignUp.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/AuthenticationSignUp\n*L\n21#1:65,6\n21#1:71\n59#1:72,2\n*E\n"})
public final class AuthenticationSignUp extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f131735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.databinding.j0 f131736b;

    public AuthenticationSignUp() {
        t3 t3Var = t3.f229751a;
        this.f131735a = new i2(kotlin.jvm.internal.j1.d(c1.class), new t3.c(this), t3.d.f229756a, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(AuthenticationSignUp authenticationSignUp, CompoundButton compoundButton, boolean z10) {
        authenticationSignUp.x().c0(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(com.planner5d.library.databinding.j0 j0Var, Boolean bool) {
        j0Var.f159159c.setEnabled(!bool.booleanValue());
        ProgressBar authenticationSignUpSpinner = j0Var.f159165i;
        Intrinsics.checkNotNullExpressionValue(authenticationSignUpSpinner, "authenticationSignUpSpinner");
        authenticationSignUpSpinner.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.f312394a;
    }

    private final c1 x() {
        return (c1) this.f131735a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(AuthenticationSignUp authenticationSignUp, com.planner5d.library.services.o oVar, TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        authenticationSignUp.x().f0(oVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(AuthenticationSignUp authenticationSignUp, com.planner5d.library.services.o oVar, View view) {
        authenticationSignUp.x().f0(oVar);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final com.planner5d.library.databinding.j0 j0VarA = com.planner5d.library.databinding.j0.a(inflater.inflate(com.planner5d.library.f.m.f168848u1, viewGroup, false));
        Intrinsics.checkNotNullExpressionValue(j0VarA, "bind(...)");
        final com.planner5d.library.services.o oVar = new com.planner5d.library.services.o(j0VarA.f159161e, j0VarA.f159163g);
        TextInputEditTextCompat textInputEditTextCompat = j0VarA.f159161e;
        Context context = textInputEditTextCompat.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textInputEditTextCompat.i(new com.planner5d.library.services.q0.f(context));
        Context context2 = textInputEditTextCompat.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textInputEditTextCompat.i(new com.planner5d.library.services.q0.a(context2));
        TextInputEditTextCompat textInputEditTextCompat2 = j0VarA.f159163g;
        textInputEditTextCompat2.setInputType(129);
        Context context3 = textInputEditTextCompat2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textInputEditTextCompat2.i(new com.planner5d.library.services.q0.f(context3));
        Context context4 = textInputEditTextCompat2.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        textInputEditTextCompat2.i(new com.planner5d.library.services.q0.e(context4, 6));
        textInputEditTextCompat2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.x0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return AuthenticationSignUp.y(this.f132020a, oVar, textView, i10, keyEvent);
            }
        });
        TextInputLayout textInputLayout = j0VarA.f159164h;
        k3 k3Var = new k3(com.planner5d.library.f.s.S9, 6);
        Context context5 = j0VarA.f159164h.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        textInputLayout.setHelperText(k3Var.i(context5));
        j0VarA.f159159c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationSignUp.z(this.f132037a, oVar, view);
            }
        });
        j0VarA.f159158b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.z0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                AuthenticationSignUp.A(this.f132040a, compoundButton, z10);
            }
        });
        com.planner5d.library.services.utility.n1.a(this, x().b0(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationSignUp.B(j0VarA, (Boolean) obj);
            }
        });
        this.f131736b = j0VarA;
        NestedScrollView root = j0VarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
