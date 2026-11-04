package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.l2;
import androidx.navigation.c2;
import androidx.navigation.h0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.dialog.authentication.e1;
import com.planner5d.library.activity.fragment.dialog.authentication.n1;
import com.planner5d.library.activity.fragment.dialog.authentication.q1;
import com.planner5d.library.databinding.i0;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.t3;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAuthenticationSignInWithLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationSignInWithLink.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/onelink/AuthenticationSignInWithLink\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,88:1\n17#2:89\n28#2:90\n42#3,3:91\n257#4,2:94\n*S KotlinDebug\n*F\n+ 1 AuthenticationSignInWithLink.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/onelink/AuthenticationSignInWithLink\n*L\n29#1:89\n29#1:90\n31#1:91,3\n38#1:94,2\n*E\n"})
public final class AuthenticationSignInWithLink extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f131851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i0 f131852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h0 f131853c;

    public static final class a implements n1.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f131855b;

        a(boolean z10) {
            this.f131855b = z10;
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
            c2 c2VarA;
            Intrinsics.checkNotNullParameter(service, "service");
            com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
            androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(AuthenticationSignInWithLink.this);
            if (service == SocialAuthType.Code) {
                c2VarA = e0.b(Boolean.TRUE, com.planner5d.library.f.s.OB, Boolean.valueOf(this.f131855b));
                Intrinsics.checkNotNull(c2VarA);
            } else {
                c2VarA = e0.a(service, Boolean.valueOf(this.f131855b), Boolean.TRUE);
                Intrinsics.checkNotNull(c2VarA);
            }
            kVar.d(w0VarA, c2VarA, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AuthenticationSignInWithLink.a.c((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
            AuthenticationSignInWithLink.this.x().Z(service);
        }
    }

    public static final class b implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f131856a;

        public b(Fragment fragment) {
            this.f131856a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f131856a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f131856a + " has null arguments");
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 AuthenticationSignInWithLink.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/onelink/AuthenticationSignInWithLink\n*L\n1#1,28:1\n29#2:29\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            Fragment fragmentRequireParentFragment = AuthenticationSignInWithLink.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment.getViewModelStore();
        }
    }

    public AuthenticationSignInWithLink() {
        t3 t3Var = t3.f229751a;
        this.f131851a = new i2(j1.d(e1.class), new c(), t3.d.f229756a, null, 8, null);
        this.f131853c = new h0(j1.d(c0.class), new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(Context context, String str) {
        com.planner5d.library.legal.application.e.f180321b.a().j().a(h3.e(context), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final c0 w() {
        return (c0) this.f131853c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e1 x() {
        return (e1) this.f131851a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(AuthenticationSignInWithLink authenticationSignInWithLink, boolean z10, View view) {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(authenticationSignInWithLink);
        e0.b bVarB = e0.b(Boolean.FALSE, com.planner5d.library.f.s.LB, Boolean.valueOf(z10));
        Intrinsics.checkNotNullExpressionValue(bVarB, "toSignInWithLinkConfirmation(...)");
        kVar.d(w0VarA, bVarB, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AuthenticationSignInWithLink.z((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
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
        i0 i0VarD = i0.d(getLayoutInflater(), viewGroup, false);
        this.f131852b = i0VarD;
        List<SocialAuthType> listV = x().V();
        final boolean zAreEqual = Intrinsics.areEqual(w().c(), Boolean.TRUE);
        RecyclerView authenticationSignInByService = i0VarD.f159102d;
        Intrinsics.checkNotNullExpressionValue(authenticationSignInByService, "authenticationSignInByService");
        authenticationSignInByService.setVisibility(!listV.isEmpty() ? 0 : 8);
        i0VarD.f159102d.setAdapter(new q1(listV, new a(zAreEqual)));
        i0VarD.f159102d.setNestedScrollingEnabled(false);
        i0VarD.f159101c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationSignInWithLink.y(this.f131973a, zAreEqual, view);
            }
        });
        final Context context = getContext();
        if (context != null) {
            String string = context.getString(com.planner5d.library.f.s.Du);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(com.planner5d.library.f.s.Eu);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            i0 i0Var = this.f131852b;
            if (i0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i0Var = null;
            }
            TextView textView = i0Var.f159100b;
            String string3 = context.getString(com.planner5d.library.f.s.as);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String str = String.format(string3, Arrays.copyOf(new Object[]{"<a href=\"" + com.planner5d.library.api.f.a().f142276n + "\">" + string + "</a>", "<a href=\"" + com.planner5d.library.api.f.a().f142277o + "\">" + string2 + "</a>"}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            com.planner5d.library.services.textspan.b.n(textView, com.planner5d.library.services.textspan.b.i(StringsKt.k2(str, "\n", "<br/>", false, 4, null), new UrlSpanWithListener.a() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.a0
                @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
                public final void a(String str2) {
                    AuthenticationSignInWithLink.A(context, str2);
                }
            }, Integer.valueOf(androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.f166705th)), false, false, false));
        }
        ScrollView root = i0VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        com.planner5d.library.model.manager.statistics.events.n.f217157b.C1(k3.a.authenticate, Intrinsics.areEqual(w().c(), Boolean.TRUE) ? k3.e.change_user : k3.e.onboarding);
    }
}
