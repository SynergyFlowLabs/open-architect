package com.planner5d.library.activity.fragment.dialog.authentication.privacy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.i2;
import androidx.navigation.fragment.f;
import com.planner5d.library.databinding.d0;
import com.planner5d.library.legal.view.dialog.authentication.PrivacyAgreement;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.c0;
import kotlin.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAuthenticationPrivacyAgreement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationPrivacyAgreement.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/privacy/AuthenticationPrivacyAgreement\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n*L\n1#1,48:1\n12#2,6:49\n28#2:55\n*S KotlinDebug\n*F\n+ 1 AuthenticationPrivacyAgreement.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/privacy/AuthenticationPrivacyAgreement\n*L\n20#1:49,6\n20#1:55\n*E\n"})
public final class AuthenticationPrivacyAgreement extends Fragment implements c0, PrivacyAgreement.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f131977a;

    public AuthenticationPrivacyAgreement() {
        t3 t3Var = t3.f229751a;
        this.f131977a = new i2(j1.d(c.class), new t3.c(this), t3.d.f229756a, null, 8, null);
    }

    private final c t() {
        return (c) this.f131977a.getValue();
    }

    @Override // com.planner5d.library.legal.view.dialog.authentication.PrivacyAgreement.a
    public void onAgree(@NotNull id.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        t().Y(user);
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        int i10 = 2 >> 0;
        f.a(this).B0(com.planner5d.library.f.j.Zl, false);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        CoordinatorLayout root = d0.d(inflater, viewGroup, false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.planner5d.library.legal.view.dialog.authentication.PrivacyAgreement.a
    public void onDeleteMyData() {
        c cVarT = t();
        s sVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        cVarT.X(sVarRequireActivity);
    }

    @Override // com.planner5d.library.legal.view.dialog.authentication.PrivacyAgreement.a
    public void onOpenUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        com.planner5d.library.application.b.f142455c.a().w().a(getActivity(), url);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        PrivacyAgreement privacyAgreement = new PrivacyAgreement();
        privacyAgreement.setArguments(getArguments());
        getChildFragmentManager().w().y(com.planner5d.library.f.j.Ul, privacyAgreement).m();
    }
}
