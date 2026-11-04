package com.planner5d.library.spaces.view.onboarding;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.k2;
import androidx.fragment.app.m;
import com.planner5d.library.spaces.view.SpacesSearchNavigationFragment;
import com.planner5d.library.widget.onboarding.OnboardingListenerView;
import com.planner5d.library.widget.z0;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class OnboardingSearchAddressDialog extends m implements ff.a {

    @NotNull
    public static final String FRAGMENT_TAG = "onboarding_address_search_dialog";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private ee.a f230434p1;

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
        @l(message = "Since Tiramisu", replaceWith = @b1(expression = "OnBackInvokedCallback", imports = {}))
        public void onBackPressed() {
            OnboardingSearchAddressDialog.this.onBackPressed();
        }
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        ee.a aVar = this.f230434p1;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        return ((SpacesSearchNavigationFragment) aVar.f274774c.getFragment()).onBackPressed();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, de.b.s.D5);
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        b bVar = new b(requireContext(), getTheme());
        Window window = bVar.getWindow();
        if (window != null) {
            k2.c(window, false);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
        }
        bVar.setCanceledOnTouchOutside(false);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ee.a aVarC = ee.a.c(inflater);
        this.f230434p1 = aVarC;
        aVarC.f274773b.setOnboardingListener(this);
        OnboardingListenerView onboardingListenerViewB = aVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(onboardingListenerViewB, "getRoot(...)");
        return onboardingListenerViewB;
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
}
