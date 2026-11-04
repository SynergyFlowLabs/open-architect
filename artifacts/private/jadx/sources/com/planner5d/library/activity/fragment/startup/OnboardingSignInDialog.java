package com.planner5d.library.activity.fragment.startup;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.u1;
import androidx.core.view.v3;
import com.planner5d.library.widget.onboarding.OnboardingListenerView;
import com.planner5d.library.widget.z0;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nOnboardingSignInDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnboardingSignInDialog.kt\ncom/planner5d/library/activity/fragment/startup/OnboardingSignInDialog\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,96:1\n28#2:97\n*S KotlinDebug\n*F\n+ 1 OnboardingSignInDialog.kt\ncom/planner5d/library/activity/fragment/startup/OnboardingSignInDialog\n*L\n59#1:97\n*E\n"})
public final class OnboardingSignInDialog extends androidx.fragment.app.m implements ff.a {

    @NotNull
    public static final String FRAGMENT_TAG = "onboarding_sign_in_dialog";

    @ij.a
    public e oneLinkDeeplinkHandler;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private com.planner5d.library.databinding.k f136426p1;

    @NotNull
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Dialog {
        b(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.app.Dialog
        @kotlin.l(message = "Since Tiramisu", replaceWith = @b1(expression = "OnBackInvokedCallback", imports = {}))
        public void onBackPressed() {
            OnboardingSignInDialog.this.onBackPressed();
        }
    }

    private final void A() {
        Dialog dialog;
        Window window;
        if (getResources().getConfiguration().smallestScreenWidthDp >= 480 || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        int i10 = 6 | (-1);
        window.setLayout(-1, -1);
        v3 v3Var = new v3(window, window.getDecorView());
        v3Var.i(true);
        v3Var.h(true);
        window.setStatusBarColor(androidx.core.content.d.g(window.getContext(), pc.b.e.Sm));
    }

    @NotNull
    public final e getOneLinkDeeplinkHandler$P5D_Library_release() {
        e eVar = this.oneLinkDeeplinkHandler;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("oneLinkDeeplinkHandler");
        return null;
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        com.planner5d.library.databinding.k kVar = this.f136426p1;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            kVar = null;
        }
        return ((OnboardingSignInNavigationFragment) kVar.f159204c.getFragment()).onBackPressed();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, pc.b.s.V5);
        com.planner5d.library.application.b.f142455c.a().z2(this);
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        b bVar = new b(requireContext(), getTheme());
        Window window = bVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        bVar.setCanceledOnTouchOutside(false);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.planner5d.library.databinding.k kVarC = com.planner5d.library.databinding.k.c(inflater);
        this.f136426p1 = kVarC;
        u1.j2(kVarC.f159204c, new ef.g(0, 1, null));
        kVarC.f159203b.setOnboardingListener(this);
        OnboardingListenerView root = kVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        androidx.activity.result.b parentFragment = getParentFragment();
        z0 z0Var = parentFragment instanceof z0 ? (z0) parentFragment : null;
        if (z0Var != null) {
            z0Var.onChildDialogDismiss(this);
        }
    }

    @Override // ff.a
    public void onOnboardingStepComplete() {
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        A();
    }

    public final void setOneLinkDeeplinkHandler$P5D_Library_release(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.oneLinkDeeplinkHandler = eVar;
    }
}
