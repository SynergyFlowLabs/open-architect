package com.planner5d.library.activity.fragment.dialog.authentication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.l2;
import androidx.navigation.c2;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.textview.TextViewWithLine;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAuthentication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Authentication.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/Authentication\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,71:1\n17#2:72\n28#2:73\n257#3,2:74\n257#3,2:76\n257#3,2:78\n257#3,2:80\n257#3,2:82\n*S KotlinDebug\n*F\n+ 1 Authentication.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/Authentication\n*L\n21#1:72\n21#1:73\n58#1:74,2\n59#1:76,2\n62#1:78,2\n63#1:80,2\n66#1:82,2\n*E\n"})
public final class Authentication extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f131719a;

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 Authentication.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/Authentication\n*L\n1#1,28:1\n21#2:29\n*E\n"})
    public static final class a implements Function0<l2> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return Authentication.this.getViewModelStore();
        }
    }

    public Authentication() {
        t3 t3Var = t3.f229751a;
        this.f131719a = new i2(kotlin.jvm.internal.j1.d(e1.class), new a(), t3.d.f229756a, null, 8, null);
    }

    private final e1 B() {
        return (e1) this.f131719a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(final Authentication authentication, View view) {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(authentication);
        c2 c2VarC = i.c();
        Intrinsics.checkNotNullExpressionValue(c2VarC, "signUpOptionsToSignUp(...)");
        kVar.d(w0VarA, c2VarC, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Authentication.D(this.f131743a, (androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Authentication authentication, androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        authentication.B().Y();
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(Authentication authentication, View view) {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(authentication);
        SocialAuthType socialAuthType = SocialAuthType.Google;
        Boolean bool = Boolean.TRUE;
        i.a aVarA = i.a(socialAuthType, bool, bool);
        Intrinsics.checkNotNullExpressionValue(aVarA, "signUpOptionsToExternalServices(...)");
        kVar.d(w0VarA, aVarA, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Authentication.F((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Authentication authentication, View view) {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(authentication);
        SocialAuthType socialAuthType = SocialAuthType.Facebook;
        Boolean bool = Boolean.TRUE;
        i.a aVarA = i.a(socialAuthType, bool, bool);
        Intrinsics.checkNotNullExpressionValue(aVarA, "signUpOptionsToExternalServices(...)");
        kVar.d(w0VarA, aVarA, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Authentication.H((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Authentication authentication, View view) {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(authentication);
        c2 c2VarB = i.b();
        Intrinsics.checkNotNullExpressionValue(c2VarB, "signUpOptionsToSignIn(...)");
        kVar.d(w0VarA, c2VarB, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Authentication.J((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(com.planner5d.library.f.m.f168738k1, viewGroup, false);
        com.planner5d.library.databinding.z zVarA = com.planner5d.library.databinding.z.a(viewInflate);
        zVarA.f159995c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Authentication.C(this.f131765a, view);
            }
        });
        zVarA.f159998f.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Authentication.E(this.f131770a, view);
            }
        });
        zVarA.f159996d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Authentication.G(this.f131785a, view);
            }
        });
        zVarA.f160005m.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Authentication.I(this.f131789a, view);
            }
        });
        com.planner5d.library.services.textspan.b.l(requireActivity(), zVarA.f159994b, com.planner5d.library.f.s.QB, false, false, com.planner5d.library.application.b.f142455c.a().C1(), com.planner5d.library.api.f.a().f142276n, com.planner5d.library.api.f.a().f142277o);
        B().U();
        if (!B().W()) {
            TextView authenticationFacebook = zVarA.f159996d;
            Intrinsics.checkNotNullExpressionValue(authenticationFacebook, "authenticationFacebook");
            authenticationFacebook.setVisibility(8);
            ImageView authenticationFacebookIcon = zVarA.f159997e;
            Intrinsics.checkNotNullExpressionValue(authenticationFacebookIcon, "authenticationFacebookIcon");
            authenticationFacebookIcon.setVisibility(8);
        }
        if (!B().X()) {
            TextView authenticationGoogle = zVarA.f159998f;
            Intrinsics.checkNotNullExpressionValue(authenticationGoogle, "authenticationGoogle");
            authenticationGoogle.setVisibility(8);
            ImageView authenticationGoogleIcon = zVarA.f159999g;
            Intrinsics.checkNotNullExpressionValue(authenticationGoogleIcon, "authenticationGoogleIcon");
            authenticationGoogleIcon.setVisibility(8);
        }
        if (B().V().isEmpty()) {
            TextViewWithLine authenticationOrLabel = zVarA.f160000h;
            Intrinsics.checkNotNullExpressionValue(authenticationOrLabel, "authenticationOrLabel");
            authenticationOrLabel.setVisibility(8);
        }
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
